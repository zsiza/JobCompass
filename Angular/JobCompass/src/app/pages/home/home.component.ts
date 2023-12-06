import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  constructor(private router: Router) {}

  onSelectOption(value: string) {
    this.router.navigate(['/service'], { queryParams: { option: value } });
    console.log(value);
  }
}
