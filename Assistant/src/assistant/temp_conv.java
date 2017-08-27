package assistant;

public class temp_conv {

double toCelsius (double value, double input){
    if (input == 'K'){
        return value-273.15;
    }
    else if (input == 'F'){
        return (value-32)*5/9;
    }
    else return 0;
}
double toKelvin (double value, double input){
    if (input == 'C'){
    return value+273.15;   
    }
    else if (input == 'F'){
    return ((value - 32)/1.8) + 273.15;    
    }
    else return 0.00;
}
double toFahrenheit (double value, double input){
    if(input == 'C'){
    return (value - 32)/1.8;
    }
    else if (input == 'K'){
    return ((value - 32)/1.8) + 273.15;
    }
    else return 0.00;
}
}