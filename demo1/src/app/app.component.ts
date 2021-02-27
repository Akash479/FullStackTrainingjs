import { Component } from '@angular/core';
import { ApiService } from './api.service';

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
  constructor(private api:ApiService){
    this.colorFlag= true;
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
  m1(){
    alert("Hii")
  }
  optionsChnage(value:any){
    this.statesDropdown=this.jsonCountries.filter((item:any)=>item.Country ===value);
    }

    ColorChnage(){
      this.switchData="bc"
      this.colorFlag=!this.colorFlag;
      this.api.getData().subscribe(res=>this.tableData=res);
    }
}
