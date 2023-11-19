package jobcompass.service;

import jakarta.persistence.Table;
import jobcompass.exception.CategoryNotFoundException;
import jobcompass.model.Category;
import jobcompass.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Table(name="category", schema = "public")
public class CategoryService {
    private final CategoryRepo categoryRepo;

    @Autowired
    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    public Category addCategory(Category category) {
        return categoryRepo.save(category);
    }

    public List<Category> findAllCategories() {
        return categoryRepo.findAll();
    }

    public Category updateCategory(Category category) {
        return categoryRepo.save(category);
    }

    public Category findCategoryByCategoryId(Long categoryId) throws CategoryNotFoundException {
        return categoryRepo.findCategoryByCategoryId(categoryId)
                .orElseThrow(() -> new CategoryNotFoundException("Nincs " + categoryId + " azonosíójú kategória!"));
    }

    public void deleteCategory(Long categoryId) {
        categoryRepo.deleteCategoryByCategoryId(categoryId);
    }
}
