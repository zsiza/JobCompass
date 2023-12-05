import { Component } from '@angular/core';
import { OptionSelectionService } from '../../../option-selection.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  constructor(private optionSelectionService: OptionSelectionService) {}

  onSelectOption(value: string) {
    this.optionSelectionService.selectOption(value);
  }
}
