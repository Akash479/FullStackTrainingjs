import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {WordComponent} from './word/word.component'

const routes: Routes = [
  {path:'word', component: WordComponent},
  {path:'', redirectTo:'word',pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
