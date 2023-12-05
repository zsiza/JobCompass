import { Component, OnInit, importProvidersFrom } from '@angular/core';
import { User } from './user';
import { UserService } from './user.service';
import { Service } from 'src/service';
import { ServiceService } from 'src/service.service';
import { HttpErrorResponse } from '@angular/common/http';
import { RouterOutlet } from '@angular/router';
import { AlertComponent } from './pages/alert/alert.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent implements OnInit {
  title = 'JobCompass';
  public users: User[] = [];
  public services: Service[] = [];

  constructor(private userService: UserService,private serviceService: ServiceService) {}

  ngOnInit() {
    this.getUsers();
    this.getServices();
  }

  public getUsers(): void {
    this.userService.getUsers().subscribe(
      (response: User[]) => {
        this.users = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  public getServices(): void {
    this.serviceService.getServices().subscribe(
      (response: Service[]) => {
        this.services = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }
}
