
numero1= window.prompt("meter numero");
alert("funciona antes de random");
let final = Math.random()*100*numero1;
alert("funciona despues de random"+ "el numero random es "+ final);

for(var i=10; i>0; i--){

    alert("te quedan "+i+" intentos");
    numero1= window.prompt("meter numero");

if(numero1>final){
    alert("El numero 1 es mayor");
    i++;
}
 if (numero1==final){
    alert("Has acertado");
    break;
}
 if(numero1>final){
    alert("El numero 1 es mayor");
    i++;
}
}