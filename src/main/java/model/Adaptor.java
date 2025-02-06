package model;

public class Adaptor {

    Queue queue;

    public Adaptor(int size){
        queue = new Queue(size);
    }

    public String Display(){
        return queue.display();
    }

    public void Add(long item){
        queue.insert(item);
    }

    public void Delete(){
        queue.remove();
    }

    public long PeekFront(){
        return queue.peekFront();
    }

    public String Check(){
        if(queue.isEmpty()){
            return "Очередь пустая!";
        }
        else if (queue.isFull()){
            return "Очередь заполнена";
        }
        else return "Очередь заполнена не до конца";
        //есть ли нужный эл в очерелди
    }
    public String Find(String item) {
        String elements = Display();
        String[] arrayOfStrings = elements.split(" ");

        // Проходим по каждому элементу массива
        for (int i = 0; i < arrayOfStrings.length; i++) {
            // Сравниваем строки корректным способом
            if (item.equals(arrayOfStrings[i])) {
                return arrayOfStrings[i]; // Возвращаем найденный элемент
            }
        }

        return "нет элемента"; // Если элемент не найден, возвращаем "no"
    }

}
