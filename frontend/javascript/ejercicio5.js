function validar(nif) {
let expresion = new RegExp('/^[0-9]{8}[A-Z]$/i');
expresion.prototype.test(nif);

}