package br.uol.ps.example.checkBirthDate.presenter

import br.uol.ps.example.checkBirthDate.contracts.CheckBirthDateContract

class CheckBirthDatePresenter(
    var view: CheckBirthDateContract.View?
    ): CheckBirthDateContract.Presenter {
    override fun verifyBirthDate(date: String) {
        view?.showResultBirthDate("Qual foi a data digitada?" + date)
    }
}