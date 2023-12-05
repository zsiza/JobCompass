import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { AboutComponent } from './pages/about/about.component';
import { BalanceComponent } from './pages/balance/balance.component';
import { LoginComponent } from './pages/login/login.component';
import { RegisterComponent } from './pages/register/register.component';
import { ServiceComponent } from './pages/service/service.component';
import { ProfileComponent } from './pages/profile/profile.component';
import { ChangeprofileComponent } from './pages/changeprofile/changeprofile.component';
import { AlertComponent } from './pages/alert/alert.component';

const routes: Routes = [
  {path:'', component:HomeComponent},
  {path:'about', component:AboutComponent},
  {path:'balance', component:BalanceComponent},
  {path:'login', component:LoginComponent},
  {path:'register', component:RegisterComponent},
  {path:'service', component:ServiceComponent},
  {path:'profile', component:ProfileComponent},
  {path:'changeprofile', component:ChangeprofileComponent},
  {path:'alert', component:AlertComponent}

  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
