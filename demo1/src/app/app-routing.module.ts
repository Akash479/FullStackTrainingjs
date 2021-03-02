import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {LoginComponent} from './login/login.component';
import { MobilesComponent } from './mobiles/mobiles.component';
import { RegisterComponent } from './register/register.component';
import { SamsunngComponent } from './samsunng/samsunng.component';
import { NokiaComponent } from './nokia/nokia.component';

const routes: Routes = [
  {path:'mobiles',component:MobilesComponent,children:[
  {path:'samsunng',component:SamsunngComponent},
  {path:'nokia',component:NokiaComponent
},
]
},
  {path:'login',component:LoginComponent},
  {path:'register',component:RegisterComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
