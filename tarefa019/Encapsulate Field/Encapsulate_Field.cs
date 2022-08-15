// Antes

private string myString;

public void DoSomething(string input) {
    myString = input;
}

// Depois

public String MyString {
    get;
    private set;
}

public void DoSomething(string input) {
    MyString = input;
}
