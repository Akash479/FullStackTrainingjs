import { Component, EventEmitter, Input, OnChanges, OnInit, Output, SimpleChanges } from '@angular/core';


@Component({
  selector: 'app-nokia',
  templateUrl: './nokia.component.html',
  styleUrls: ['./nokia.component.css']
})
export class NokiaComponent implements OnInit,OnChanges {

  @Input() cBasicprice:any;
  @Output() myOutput:EventEmitter<any>=new EventEmitter();
  constructor() { }
  ngOnChanges(changes: SimpleChanges): void {
   console.log(changes)
  }

  ngOnInit(): void {
    console.log(this.cBasicprice);
  }
  clickMe(){
this.myOutput.emit('I am From Child ');
  }
}
