function identity<T>(value: T): T {
    return value;
}

console.log(identity<Number>(1)) // 1