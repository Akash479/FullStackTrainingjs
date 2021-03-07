import { TestBed } from '@angular/core/testing';

import { FormDiscardService } from './form-discard.service';

describe('FormDiscardService', () => {
  let service: FormDiscardService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FormDiscardService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
