// alert.component.ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-alert',
  templateUrl: './alert.component.html',
  styleUrls: ['./alert.component.css'],
})
export class AlertComponent {
  showAlert: boolean = true;
  hideAlert: boolean = false;

  closeAlert() {
    this.hideAlert = true;
    setTimeout(() => this.showAlert = false, 400);
  }
}