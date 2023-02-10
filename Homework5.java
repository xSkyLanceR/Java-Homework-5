//1. Создать словарь HashMap. Обобщение <Integer, String>.
// 2. Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключь, если не было!)
// 3. Изменить значения сделав пол большой буквой.
// 4. Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."
// 5. *Сортировать значения по возрасту и вывести отсортированную коллекция как в четвёртом пункте.

import java.util.HashMap;
import java.util.Map;


public class Homework5 {
    public static void main(String args[]){
    HashMap<Integer,String> hashMap=new HashMap<>();
    hashMap.put(01,"Иванов Иван Иванович 28 м");
    hashMap.put(02,"Кузнецов Николай Анатольевич 35 м");
    hashMap.put(03,"Малышева Ольга Евгеньевна 24 ж");
    hashMap.put(04,"Соколов Алексей Николаевич 64 м");
    hashMap.put(05,"Мягкова Елена Сергеевна 44 ж");

      hashMap.replaceAll('м','М');

         // System.out.println("HashMap elements: ");
    for(Map.Entry mEntry : hashMap.entrySet()){
      //System.out.print("key: "+ mEntry.getKey() + " & Value: ");
      System.out.println(mEntry.getValue());
    }
  }
}