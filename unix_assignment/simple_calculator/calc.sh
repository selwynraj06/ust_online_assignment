echo "Enter the number1: "
read number1
echo "Enter the number2: "
read number2
echo "Enter a operator like + - * / :"
read oprator
if [ "$oprator" = "+" ]
then
    echo "The sum of two number is: $((number1 + number2))"
elif [ "$oprator" = "-" ]
then
    echo "The subraction of two number is: $((number1 - number2))"
elif [ "$oprator" = "*" ]
then
    echo "The multiplication of two number is: $((number1 * number2))"
elif [ "$oprator" = "/" ]
then
    echo "The division of two number is: $((number1/number2))"
else
    echo "Invalid input"
fi
