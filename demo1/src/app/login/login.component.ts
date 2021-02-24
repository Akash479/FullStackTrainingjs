import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  validateForm:any;
  constructor(
    private formBuilder:FormBuilder) { 
      this.validateForm=this.formBuilder.group({
        userName:['ashok'],
        password:['1234'],
        remember:['']
      })
    }

  ngOnInit(): void {
    console.log('sasags')
  }
  loginMethod(){
    let uName= this.validateForm.controls['userName'].value;
    let password= this.validateForm.controls['password'].value;

    alert(' UserName is: '+uName+' '+'Password is: '+password);
  }
}
