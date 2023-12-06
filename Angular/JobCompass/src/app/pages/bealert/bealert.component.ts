// alert.component.ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-bealert',
  templateUrl: './bealert.component.html',
  styleUrls: ['./bealert.component.css'],
})
export class BealertComponent {
  showAlert: boolean = true;
  hideAlert: boolean = false;

  closeAlert() {
    this.hideAlert = true;
    setTimeout(() => this.showAlert = false, 400);
  }
}