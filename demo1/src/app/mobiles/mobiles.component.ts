import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobiles',
  templateUrl: './mobiles.component.html',
  styleUrls: ['./mobiles.component.css']
})
export class MobilesComponent implements OnInit {

  basicPrice=150; 

  constructor() { }

  ngOnInit(): void {
  }
  parentClick(data:any){{
    console.log(data)
  }}

}
