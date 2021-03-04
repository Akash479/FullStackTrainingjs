import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';


@Component({
  selector: 'app-nokia',
  templateUrl: './nokia.component.html',
  styleUrls: ['./nokia.component.css']
})
export class NokiaComponent implements OnInit {

  @Input() cBasicprice:any;
  @Output() myOutput:EventEmitter<any>=new EventEmitter();
  constructor() { }

  ngOnInit(): void {
    console.log(this.cBasicprice);
  }
  clickMe(){
this.myOutput.emit('I am From Child ');
  }
}
