import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'converion'
})
export class ConverionPipe implements PipeTransform {

  transform(value: any, ...args: unknown[]): unknown {
    if(args[0] ==='min'){
      return value+' Min';
    }else{
      let hourvalues =value/60;
      const reValue=hourvalues +'hours';
    return reValue;
    }
     
  }

}
