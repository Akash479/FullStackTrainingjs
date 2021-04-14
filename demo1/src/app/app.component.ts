import { Component } from '@angular/core';
import { FormBuilder, FormGroup,Validators } from '@angular/forms';
import { ApiService } from './api.service';
import { employee} from './dataObect';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  jsonCountries:any;
  countryDrupdown:any
  statesDropdown:any;
  state:any;
  Date:any;
  flag:any;
  inputValue:any;
  firstName:any;
  upperFirst:any;
  currency:any;
  number1:any;
  jvalue:any;
  fullLength:any;
  colorFlag:any;
  tableData:any;
  switchData:any;
  registerForm:any;
  email: any;
  username:any;
  Password:any;
  reactForm:FormGroup;
  color:any
  submitted:any;
  // emp:any;
  constructor(private api:ApiService,
    private formBuilder:FormBuilder,
    private emp:employee // loosely Coupled
    ){
    //  this.emp= new employee(); // tigthly Coupled
     this.emp.add();
     this.emp.substract();
     this.emp.multiply();

    this.reactForm= this.formBuilder.group({
      email:['',[Validators.required,Validators.minLength(5)]],
      Password:[''],
      UserName:['']
    })
    this.colorFlag= true;this.color='red';
    this.Date= new Date();
    this.switchData="";
    this.jsonCountries=[
      {Country:'India',State:"Ap"},
      {Country:'India',State:"Telangana"},
      {Country:'India',State:"Delhi"},
      {Country:'Nepal',State:"KTM"},
      {Country:'Nepal',State:"ALtie"},
      {Country:'Nepal',State:"VKR"},
      
      ];
this.flag=true;
this.inputValue="asdsafsaklknsd";
this.firstName="ashok";
this.upperFirst="Samrat";
this.currency=2500;
this.number1=25689.8955;
this.fullLength=120;
this.jvalue={'name':"angular",ver:11};
  }
  get f() { return this.reactForm.controls; }
  m1(){
    alert("Hii")
  }
  optionsChnage(value:any){
    this.statesDropdown=this.jsonCountries.filter((item:any)=>item.Country ===value);
    }

    ColorChnage(){
      this.switchData="bc"
      this.colorFlag=!this.colorFlag;
     // this.api.getData().subscribe(res=>this.tableData=res);
    }
    submit(){
this.submitted=true;
    }
}
