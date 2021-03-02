import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SamsunngComponent } from './samsunng.component';

describe('SamsunngComponent', () => {
  let component: SamsunngComponent;
  let fixture: ComponentFixture<SamsunngComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SamsunngComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SamsunngComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
