import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Service } from 'src/service';
import { ServiceService } from 'src/service.service';

@Component({
  selector: 'app-makeservice',
  templateUrl: './makeservice.component.html',
  styleUrls: ['./makeservice.component.css']
})
export class MakeserviceComponent {
  categories: any[] = [
    { id: 1, name: 'Grafika & Design' },
    { id: 2, name: 'Digitális Marketing' },
    { id: 3, name: 'Írás & Fordítás' },
    { id: 4, name: 'Videó & Animáció' },
    { id: 5, name: 'Logó Készítés' },
    { id: 6, name: 'Programozás & Tech' },
    { id: 7, name: 'Adatkezelés' },
    { id: 8, name: 'Business' },
    { id: 9, name: 'Életstílus' },
    { id: 10, name: 'Zene & Audió' },
    { id: 11, name: 'Fényképezés' },
    { id: 12, name: 'End-To-End Projektek' },
    
  ];

  newService: Service = {
    id: 0,
    title: '',
    description: '',
    price: 0,
    deliveryTime: 1,
    categoryId: 0,
    sellerId: 1
  };

  constructor(private serviceService: ServiceService) {}

  onAddService(addForm: NgForm): void {

    this.newService.categoryId = addForm.value.selectedCategoryInt;

    this.serviceService.addService(this.newService).subscribe(
      () => {
        console.log('Service added successfully! YIP');
      },
      (error) => {
        console.error('Error adding service', error);
      }
    );
  }
}
