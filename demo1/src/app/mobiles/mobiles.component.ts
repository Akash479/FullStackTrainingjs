import { Component, Input, OnChanges, OnInit, SimpleChanges } from '@angular/core';
import { DataShare } from '../dataShare';
import { SharedService } from '../SharedService';

@Component({
  selector: 'app-mobiles',
  templateUrl: './mobiles.component.html',
  styleUrls: ['./mobiles.component.css']
})
export class MobilesComponent implements OnInit {

  basicPrice=150; 

  constructor( private dataShare:DataShare,private share:SharedService) { }
 

  ngOnInit(): void {
    console.log(this.dataShare.getEmail());
    this.share.EmailValue.subscribe(value=>{
      console.log(value);
    })
  }
  parentClick(data:any){{
    console.log(data)
  }}

}
