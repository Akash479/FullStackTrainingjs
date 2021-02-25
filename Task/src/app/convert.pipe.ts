import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'convert'
})
export class ConvertPipe implements PipeTransform {

  transform(value: any, ...args: unknown[]): unknown {
    if(args[0] === 'meter'){
      return "The value is "+value + " in meters."
    }else{args[0] === 'kilometer'
    let m =value/1000;
    const x = "The value " + value + " meters is " + m + " in kilometers.";
    return x;
    }
  }

}
