public class Punto3 {
public static void main(String[] args) {
String mes = "febrero";
switch (mes.toLowerCase()) {
case "abril":
case "junio":
case "septiembre":
case "noviembre":
System.out.println(mes + " tiene 30 días.");
break;
case "febrero":
System.out.println(mes + " tiene 28 días.");
break;
default:
System.out.println(mes + " tiene 31 días.");
}
}
}
