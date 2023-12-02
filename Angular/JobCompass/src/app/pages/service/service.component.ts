import { Component, OnInit } from '@angular/core';
import { Service } from 'src/service';
import { ServiceService } from 'src/service.service';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-service',
  templateUrl: './service.component.html',
  styleUrls: ['./service.component.css'],
})
export class ServiceComponent implements OnInit {
  public services: Service[] = [];
  public selectedCategories: number[] = [1,2,3,4,5,6,7,8,9,10,11,12];
  constructor(private serviceService: ServiceService) {}

  ngOnInit() {
    this.getServices();
  }

  public createContainer() {
    const serviceBox = document.querySelector('.service-box');
    for (let index = 0; index < this.services.length; index++) {
      const newService = document.createElement('div');
      newService.classList.add('service');
      newService.classList.add(`id${this.services[index].categoryId}`);
      newService.style.width = '300px';
      newService.style.background =
        'linear-gradient(150deg, rgba(128, 128, 215, 0.27) -9.45%, rgba(146, 206, 207, 0.27) 111.55%)';
      newService.style.boxShadow = '10px 10px 12px 4px rgba(0, 0, 0, 0.25)';
      newService.style.padding = '2%';
      newService.style.color = 'white';

      const serviceTitle = document.createElement('div');
      serviceTitle.innerText = this.services[index].title;
      serviceTitle.style.fontWeight = 'bold';

      const serviceDescription = document.createElement('div');
      serviceDescription.innerText = this.services[index].description;
      serviceDescription.style.margin = '14px 0';

      const servicePrice = document.createElement('div');
      servicePrice.innerText =
        'Ár: ' + this.services[index].price.toString() + ' ft';

      const serviceDatebox = document.createElement('div');
      const serviceDateHeader = document.createElement('div');
      serviceDateHeader.innerText = 'Várható elkészülés';
      const serviceDate = document.createElement('div');
      serviceDate.innerText = this.services[index].deliveryTime.toString();
      serviceDatebox.style.margin = '14px 0';

      serviceDatebox.appendChild(serviceDateHeader);
      serviceDatebox.appendChild(serviceDate);

      serviceBox?.appendChild(newService);
      newService.appendChild(serviceTitle);
      newService.appendChild(serviceDescription);
      newService.appendChild(servicePrice);
      newService.appendChild(serviceDatebox);
    }
  }

  public getServices(): void {
    this.serviceService.getServices().subscribe(
      (response: Service[]) => {
        this.services = response;
        this.createContainer();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  public onCheckboxChange(categoryId: number): void {
    if (this.selectedCategories.includes(categoryId)) {
      this.selectedCategories = this.selectedCategories.filter(
        (id) => id !== categoryId
      );

      const hideThis = document.querySelectorAll(
        `.id${categoryId}`
      ) as NodeListOf<HTMLElement>;

      for (let index = 0; index < hideThis.length; index++) {
        hideThis[index].style.display = 'none';
      }
    } else {
      this.selectedCategories.push(categoryId);

      const hideThis = document.querySelectorAll(
        `.id${categoryId}`
      ) as NodeListOf<HTMLElement>;

      for (let index = 0; index < hideThis.length; index++) {
        hideThis[index].style.display = 'block';
      }
    }
    console.log(this.selectedCategories);
    this.updateContainer();
  }

  public updateContainer() {
    for (let index = 0; index < this.services.length; index++) {
      const hideThis = document.querySelector(
        `.idd${this.services[index].categoryId}`
      );
      console.log(this.services[index].categoryId);
      if (this.selectedCategories.includes(this.services[index].categoryId)) {
      } else {
        hideThis?.classList.add('hidden');
      }
    }
  }
}
