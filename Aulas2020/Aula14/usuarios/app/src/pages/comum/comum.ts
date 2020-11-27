import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { Pessoa } from '../../models/pessoa.dto';
import { PessoaService } from '../../services/pessoa.service';

/**
 * Generated class for the ComumPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-comum',
  templateUrl: 'comum.html',
})
export class ComumPage {

  pessoas: Pessoa[];

  constructor(public navCtrl: NavController, public navParams: NavParams, public pessoaService: PessoaService) {
  }

  ionViewDidLoad() {
    let id = "1";
    this.pessoaService.get(id).subscribe(
      (response:Pessoa[])=>{
        this.pessoas = response;
      },
      error => {
        console.log(error);
      }
    );
  }

}
