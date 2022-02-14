import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { environment } from "../../environments/environment";
import { map, Observable } from "rxjs";
import { UserModel } from "../models/user.model";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private _url = environment.baseUrl + '/users';

  constructor(private _http: HttpClient) { }

  loadAll(): Observable<UserModel[]> {
    return this._http.get(this._url, this._getOptions()).
    pipe(map((res: any) => {
        return res
      })
    )
  }

  create(user: UserModel) {
    return this._http.post(this._url, user, this._getOptions()).
    pipe(map((res: any) => {
        return res
      })
    )
  }

  private _getOptions(): any {
    return {
      headers: new HttpHeaders({})
    };
  }
}
