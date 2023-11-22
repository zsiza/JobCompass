import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { User } from 'src/app/user';
import { UserService } from 'src/app/user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {
  id = 1;
  profileId = this.id;
  admin =  false;
  sellerId = this.id;
  balance = 0;
  online = false;
  firstName = "";
  lastName = "";
  username = "";
  email = "";
  password = "";

  constructor(private userService: UserService) {}

  onAddUser(addForm: NgForm): void {
    const formValues = addForm.value;

    const newUser: User = {
      id: this.id,
      profileId: this.profileId,
      sellerId: this.sellerId,
      balance: 0,
      online: false,
      admin: false,
      firstName: formValues.firstname,
      lastName: formValues.lastname,
      username: formValues.username,
      email: formValues.email,
      password: formValues.password
    };

    this.id = this.id + 1;
    this.profileId = this.id;
    this.sellerId = this.id;

    console.log('New User:', newUser);
    this.userService.addUser(newUser);
  }
}
