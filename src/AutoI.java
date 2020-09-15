// ISP
// Было

public interface AutoI {

    public void AllBmwCars();

    public void AllKiaCars();

    public void AllLadaCars();

    public void AllMersedesCars();

}

// У нас есть интерфейс который выдаёт нам все машины соответствующей марки
// Но нашим клиентом является BMW и логично что им не нужна функция
// нахождения всех авто "отечественного автопрома" да и корейцы их не интересуют как и главный конкурент

// Поэтому мы делим наш интерфейс на 4 отдельных,чтобы не грузить клиента ненужной инфомацией
// И предоставляем ему только interface BMW.

// Стало

 interface BMW {

    public void AllBmwCars();

}

 interface Kia {

    public void AllKiaCars();

}

 interface Lada {

    public void AllLadaCars();

}

 interface Mersedes {

    public void AllMersedesCars();

}
