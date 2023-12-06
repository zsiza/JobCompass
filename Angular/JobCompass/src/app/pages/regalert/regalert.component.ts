// alert.component.ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-regalert',
  templateUrl: './regalert.component.html',
  styleUrls: ['./regalert.component.css'],
})
export class RegalertComponent {
  showAlert: boolean = true;
  hideAlert: boolean = false;

  closeAlert() {
    this.hideAlert = true;
    setTimeout(() => this.showAlert = false, 400);
  }
}