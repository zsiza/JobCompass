import { Component, OnInit } from '@angular/core';
import { User } from './user';
import { UserService } from './user.service';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'JobCompass';
  public users: User[] = [];

  constructor(private userService: UserService) {}

  ngOnInit() {
    this.getUsers();
    console.log(this)
  }

  public getUsers():void{
    this.userService.getUsers().subscribe(
      (response: User[]) => {
        this.users = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }
}
