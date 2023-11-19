package jobcompass.repo;

import jobcompass.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepo extends JpaRepository<Category, Long> {

    Optional<Category> findCategoryByCategoryId(Long categoryId);

    void deleteCategoryByCategoryId(Long categoryId);
}
