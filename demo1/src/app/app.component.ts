import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  Date:any;
  flag:any;
  inputValue:any;
  firstName:any;
  upperFirst:any;
  currency:any;
  number1:any;
  jvalue:any;
  fullLength:any;
  constructor(){
    this.Date= new Date();
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
}
