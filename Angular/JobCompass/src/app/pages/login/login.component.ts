import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/user.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
    constructor(private userService: UserService, private router: Router) {}

    ngOnInit(): void {
        
    }

  onLogin(addForm: NgForm): void {
    const formValues = addForm.value;
    const username = formValues.username;
    const password = formValues.password;
    this.userService.login(username, password);
    this.router.navigate(['']);
  }
}
