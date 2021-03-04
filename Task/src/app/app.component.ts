import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  jsonCountries:any;
  countryDropdown:any
  statesDropdown:any;
  state:any;
  Countrya:any;
  data:any;


  regsform:any;
  email:any;
  username:any;
  password:any;
  phonenumber:any;
  reacform:FormGroup

  
  title = 'demo';
  isCollapsed: any;
  Length:any;
  constructor(private formBuilder:FormBuilder){
    this.Length=500;
    this.isCollapsed = false;

    this.reacform= this.formBuilder.group({
      email:[''],
      username:[''],
      password:[''],
      phonenumber:[''],
    })

    this.jsonCountries=[
      {Country:'India',State:"AP"},
      {Country:'India',State:"BR"},
      {Country:'India',State:"GOA"},
      {Country:'United States',State:"NY"},
      {Country:'United States',State:"LA"},
      {Country:'United States',State:"TX"},
    ];
  }
  optionsChange(value:any){
    this.statesDropdown=this.jsonCountries.filter((item:any)=>item.Country ===value);
  }
}
