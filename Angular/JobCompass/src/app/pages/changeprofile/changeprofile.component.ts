/* changeprofile.component.ts*/
import { Component } from '@angular/core';

@Component({
  selector: 'app-changeprofile',
  templateUrl: './changeprofile.component.html',
  styleUrls: ['./changeprofile.component.css']
})
export class ChangeprofileComponent {
  selectedImage = 'assets/Group 1.png'; // default image

  updateImage(gender: string) {
    if (gender === 'male') {
      this.selectedImage = 'assets/male.png'; // update to male image
    } else if (gender === 'female') {
      this.selectedImage = 'assets/female.png'; // update to female image
    }
     else if (gender === 'default') {
    this.selectedImage = 'assets/Group 1.png'; // update to default image
    }
  }
}
