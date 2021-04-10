import { Directive, ElementRef, Input } from '@angular/core';

@Directive({
  selector: '#appUserColor'
})
export class UserColorDirective {
  
  constructor( private eleRef:ElementRef) { 
    this.eleRef.nativeElement.style.background="green";
  }

}
