import { Component} from "@angular/core";
import { FormControl, FormGroup, Validators } from "@angular/forms";
import { ApiService } from "../servicios/api.service";


@Component({
  selector: "app-login",
  templateUrl: "./login.component.html",
  styleUrls: ["./login.component.css"]
})

export class LoginComponent {

  public form !: FormGroup;


  constructor(private apiService:ApiService) {
    this.initForm();
  }

  private initForm(): void{
    this.form = new FormGroup ({
      userName: new FormControl('',Validators.required),
      password: new FormControl('',Validators.required)
    })
  }


  login() {
    console.log('El formulario es: ',this.form.valid);
    if(this.form.value)
    {
      console.log('Esto tiene el formulario: ',this.form.value)
      this.apiService.getLogin(this.form.value).subscribe(user=>{
        console.log('Esto tiene user: ',user);
      })
    }
    
  }
}
