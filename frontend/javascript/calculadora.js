let valornumero;
let campo = document.getElementById("campo");
let valor;
let num1="";
let num2 ="";
let op="";

let opsumar = document.getElementById("sumar")
let oprestar = document.getElementById("restar")
let opdivivir = document.getElementById("mutiplicar")
let opmultiplicar = document.getElementById("dividir")


// bandera para cambiar de operando 1 a operado 2
let flag = false;
// bandera para cuando se ha echo el primer calculo
let primeraop = true;
document.getElementById("button1").addEventListener("click", btn1);
document.getElementById("button2").addEventListener("click", btn2);
document.getElementById("button3").addEventListener("click", btn3);
opsumar.addEventListener("click", operando);
oprestar.addEventListener("click", operando);
opdividir.addEventListener("click", operando);
opmultiplicar.addEventListener("click", operando);


function btn1() {
    if(!flag ){
      
            num1 += document.getElementById("button1").value
            campo.value = num1
            
    }
    else{
        num2 =  document.getElementById("button1").value
        valor += num1 + op + document.getElementById("button1").value
        calcular();
       
    }
}

function btn2() {
    if(!flag){
        num1 += document.getElementById("button2").value
        campo.value = num1 
    }
    else{
        num2 =  document.getElementById("button2").value
        valor += num1 + op + document.getElementById("button2").value
        calcular();
    }
}

function btn3() {
    if(!flag){
        num1 += document.getElementById("button3").value
        campo.value = num1 
    }
    else{
        num2 =  document.getElementById("button3").value
        valor += num1 + op + document.getElementById("button3").value
        calcular();
    }
}

function calcular(){
    alert("entrada a calcular el operando es "+op)
  
        habilitar();
   
    if(op=="+"){
       num1 = Number(num1)
       num2 = Number(num2) 
       campo.value = num1 + num2 
       flag=false;
       
       if(campo.value!=""){
       desabilitar();
       primeraop = false;
       }
       else{
         habilitar();  
       } 
       }

    }
    if(op=="-"){
        num1 = Number(num1)
        num2 = Number(num2) 
        campo.value = num1 - num2 
        flag=false;
        if(campo.value!=""){
            desabilitar();
            }
    }

     if(op=="*"){
        num1 = Number(num1)
        num2 = Number(num2) 
        campo.value = num1 * num2 
        flag=false;
        if(campo.value!=""){
            desabilitar();
            }
    }

     if(op=="/"){
         if(num1!="0" && num2!="0"){
             num1 = Number(num1)
             num2 = Number(num2) 
             campo.value = num1 / num2 
             flag=false;
             if(campo.value!=""){
                desabilitar();
                }
            }
         else{
            alert("no se puede dividir entre 0")
            campo.value="";
         }
            
     } 


function operando() {

    op = opsumar.value
    campo.value +=op 
    flag = true;
}

function desabilitar(){
    document.getElementById("button1").disabled=true;
    document.getElementById("button2").disabled=true;
    document.getElementById("button3").disabled=true;
}

function habilitar(){
    alert("habiliantado los botones");
    document.getElementById("button1").disabled=false;
    document.getElementById("button2").disabled=false;
    document.getElementById("button3").disabled=false;
}













