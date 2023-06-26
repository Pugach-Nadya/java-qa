package ru.yandex.DZ2;

//В этом ДЗ вам необходимо спроектировать классы:
//* SerialInventory: serialKey(long), sku(Sku), lot(Lot), loc(Loc), quantity(long)
//* Lot: serialKey(long), sku(Sku), quantity(long)
//* Loc: serialKey(long), name(String), length(double), width(double), height(double),
// x(int), y(int), z(int), zone(String)
//* Sku: serialKey(long), storerKey(long), description(String)

//очень смущает что мы везде целиком в SerialInventory прокидываем объекты - у нас serialKey повторяется

public class MainDZ2 {
  //так и не поняла почему ему так не нравиться создание нового обьекта, баз нью тоже ругается(
  SKU zSku = new SKU().withSerialKey(1234).withStorerKey(1234).withDescription("Test").bulder();
  //при чем судя ао всему ошибка на всех класах
  Loc zLoc = new Loc().withSerialKey(zSku).withName("1234")
          .withLength(10).withHeight(20).withHeight(18)
          .withX(11).withY(11).withZ(0).withZone("SORT").bulder();
  Lot zLot = new Lot().withSerialKey(zSku).withSku(zSku).getQuantityLot(3);
  SerialInventory zSI = new SerialInventory().withSerialKey(zSku)
          .withLot(zLot).withLoc(zLoc).withQuantitySI(3).builder(); //что с объектом дальше делаем?
}
