import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ApiService } from './api.service';

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
  country:any;
  data:any;
  tableData:any;


  regsform:any;
  email:any;
  username:any;
  password:any;
  phonenumber:any;
  reacform:FormGroup

  
  title = 'demo';
  isCollapsed: any;
  Length:any;
  constructor(private api:ApiService, private formBuilder:FormBuilder){
    this.Length=500;
    this.isCollapsed = false ;

    this.reacform= this.formBuilder.group({
      email:[''],
      username:[''],
      password:[''],
      phonenumber:[''],
      state:[''],

    })

    this.jsonCountries=[
      {country:'India',state:"AP"},
      {country:'India',state:"BR"},
      {country:'India',state:"GOA"},
      {country:'United states',state:"NY"},
      {country:'United States',state:"LA"},
      {country:'United States',state:"TX"},
    ];
  }
  optionsChange(value:any){
    this.statesDropdown=this.jsonCountries.filter((item:any)=>item.country ===value);
  }
  ClickMe(){
    this.api.getData().subscribe(res=>this.tableData=res);
  }
}
