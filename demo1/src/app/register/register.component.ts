import { Component, OnInit, ViewChild } from '@angular/core';
import { FormGroup, NgForm } from '@angular/forms';
import { DataShare } from '../dataShare';

@Component({
  selector: 'app-register',
  template: `
   <form (ngSubmit)="formSubmit(eventForm)" #eventForm="ngForm">
   Email:<input type="text" name="test" [(ngModel)]="email" />
   PassWord:<input type="text" name="password" [(ngModel)]="password" />
   <button (click)="formSubmit(eventForm)"> Submit</button>
   
   </form>
  `,
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
 

  @ViewChild('eventForm')
  public registerForm!: NgForm;
  email:any;
  password:any;
  constructor(private DataShare:DataShare) {
  
   }

  ngOnInit(): void {
  }
  formSubmit(value:any):any{
    if(!this.email && !this.password){
      alert('Please Enter Email or Password');
    }
    else{
      this.DataShare.setAuthFlag(true);
     alert('Login Success');
    }
  }
}
