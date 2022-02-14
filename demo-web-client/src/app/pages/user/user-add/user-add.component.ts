import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from "@angular/forms";
import { UserService} from "../../../services/user.service";
import { ActivatedRoute, Router } from "@angular/router";

@Component({
  selector: 'app-user-add',
  templateUrl: './user-add.component.html',
  styleUrls: ['./user-add.component.scss']
})
export class UserAddComponent implements OnInit {

  userForm = new FormGroup({
    firstName: new FormControl(''),
    lastName: new FormControl(''),
  });

  constructor(private _userService: UserService, private _router: Router, private _route: ActivatedRoute) { }

  ngOnInit(): void {
  }

  create() {
    this._userService.create(this.userForm.value).subscribe(() => {
        this._router.navigate([''], { relativeTo: this._route });
      }
    );
  }
}
