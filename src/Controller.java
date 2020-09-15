// DIP
// Было

public class Controller {
    public void LetWillModelWork() {

    }
}

class Model extends Controller {
    Controller controller = new Controller();

    @Override
    public void LetWillModelWork() {
        controller.LetWillModelWork();
    }

    public void LetWillViewShow() {

    }
}

class View extends Model {

    Model model = new Model();

    public void IWillShow() {
        model.LetWillViewShow();
    }
}

// Слишком много зависимостей
// Убираем зависимости через абстракции(то есть через interface)

// Стало

class Controller1 implements CM {
    public void IWillConnectControllerAndModel() {

    }
}

interface CM {
    void IWillConnectControllerAndModel();
}

class Model1 extends Controller implements MV, CM {
    CM controller = new Controller1();

    @Override
    public void IWillConnectControllerAndModel() {
        controller.IWillConnectControllerAndModel();
    }

    public void IWillConnectModelAndView() {

    }
}

interface MV {
    void IWillConnectModelAndView();
}

class View1 extends Model implements MV {

    MV model = new Model1();
    
    @Override
    public void IWillConnectModelAndView() {
        model.IWillConnectModelAndView();
    }
}

// Да можно сказать что структура стала сложнее,но мы избавились от зависимостей
// которые позже могут привести к ошибкам в нашей программе если мы решим изменить какой-нибудь класс