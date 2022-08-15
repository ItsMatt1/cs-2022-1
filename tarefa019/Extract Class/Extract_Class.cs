// Antes
class Shape {
    public void Func() {
        try { /*Funcionalidade*/ } catch (Exception e) {
            LogError(e);
        }
    }

    public static void LogError(Exception e) {
        File.WriteAllText("c:\\Errors\\Exception.txt", e.ToString());
    }
}

// Depois 
class Shape {
    public void Func() {
        try { /*Funcionalidade*/ } catch (Exception e) {
            Logger.LogError(e);
        }
    }
}

class Logger {
    public static void LogError(Exception e) {
        File.WriteAllText("c:\\Errors\\Exception.txt", e.ToString());
    }
}