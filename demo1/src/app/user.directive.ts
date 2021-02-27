import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appUser]'
})
export class UserDirective {

  constructor(private eleRef:ElementRef) { 
    console.log(eleRef.nativeElement.innerText)
    
  }

}
