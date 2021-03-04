import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppleComponent } from './apple/apple.component';
import { FashionComponent } from './fashion/fashion.component';
import { LoginComponent } from './login/login.component';
import { MobilesComponent } from './mobiles/mobiles.component';
import { NokiaComponent } from './nokia/nokia.component';
import { RegisterComponent } from './register/register.component';
import { SamsungComponent } from './samsung/samsung.component';
import {WordComponent} from './word/word.component'

const routes: Routes = [
  // {path:'word', component: WordComponent},
  // {path:'', redirectTo:'word',pathMatch:'full'}
  {path:'register', component:RegisterComponent},
  {path:'login', component:LoginComponent},
  {path:'word', component:WordComponent},
  {path:'mobiles', component:MobilesComponent, children:[
    {path:'nokia', component:NokiaComponent,},
    {path:'samsung', component:SamsungComponent},
    {path:'apple', component:AppleComponent,}
  ]},
  {path:'fashion', component:FashionComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
