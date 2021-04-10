import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { MobilesComponent } from './mobiles/mobiles.component';
import { RegisterComponent } from './register/register.component';
import { SamsunngComponent } from './samsunng/samsunng.component';
import { NokiaComponent } from './nokia/nokia.component';
import { AuthServiceService } from './auth-service.service';
import { FormDiscardService } from './form-discard.service';

const routes: Routes = [
  //   {path:'mobiles',component:MobilesComponent,canActivate:[AuthServiceService],
  // children:[{
  //   path:'nokiapath',outlet:'nokioutlet',component:NokiaComponent},
  //   {path:'sampath',component:SamsunngComponent}
  // ]},
  //   {path:'login',component:LoginComponent},
  //   {path:'register',component:RegisterComponent,canDeactivate:[FormDiscardService]}

  // ];
  // {path:'mobiles',component:MobilesComponent,
  // children:[{
  //   path:'nokiapath',outlet:'nokioutlet',component:NokiaComponent},
  //   {path:'sampath',component:SamsunngComponent}
  // ]},
  //   {path:'login',component:LoginComponent},
  //   {path:'register',component:RegisterComponent}

  { path: '', redirectTo: '/login', pathMatch: 'full' },

  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent }



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
