// Antes
static void PrintReversed(string input)
{
    var chars = input.ToCharArray();
    Array.Reverse(chars);
    var reversed =  new string(chars);
    Console.WriteLine(reversed);
}

// Depois
static void PrintReversed(string input)
{
    var reversed = ReverseStr(input);
    Console.WriteLine(reversed);
}
private static string ReverseStr(string input)
{
    var chars = input.ToCharArray();
    Array.Reverse(chars);
    var reversed = new string(chars);
    return reversed;
}