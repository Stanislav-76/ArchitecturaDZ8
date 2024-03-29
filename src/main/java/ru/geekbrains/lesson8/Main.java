package ru.geekbrains.lesson8;

import ru.geekbrains.lesson8.models.TableModel;
import ru.geekbrains.lesson8.presenters.BookingPresenter;
import ru.geekbrains.lesson8.presenters.Model;
import ru.geekbrains.lesson8.presenters.View;
import ru.geekbrains.lesson8.views.BookingView;

import java.util.Date;

public class Main {

    /**
     * TODO: ДОМАШНЕЕ ЗАДАНИЕ: Метод changeReservationTable ДОЛЖЕН ЗАРАБОТАТЬ!
     * @param args
     */
    public static void main(String[] args) {

        View view = new BookingView();
        Model model = new TableModel();
        BookingPresenter presenter = new BookingPresenter(model, view);

        presenter.updateUIShowTables();

        view.reservationTable(new Date(), 2, "Станислав");
        view.reservationTable(new Date(), 1, "Станислав");
        view.reservationTable(new Date(), 6, "Станислав");

        view.changeReservationTable(1001, new Date(), 3, "Станислав");
        view.changeReservationTable(1003, new Date(), 7, "Станислав");
        view.changeReservationTable(1003, new Date(), 5, "Станислав");

        // Реализовал путем удаления старой брони и оформления новой

    }

}
