    package arraylist.bt.arraylist;

    import java.util.Arrays;

    public class MyList<E> {
        private int size = 0;
        private static final int DEFAULT_CAPACITY = 10;
        private E data[];
        //Khoi tao constructor khong co tham so
        public MyList() {
            data = (E[]) new Object[DEFAULT_CAPACITY];
        }
        //Khoi tao constructor co tham so la size
        public MyList(int size) {
            data = (E[]) new Object[size];
        }
        //method nhan doi arrayList
        private void ensureCapa() {
            if(size>data.length){
                int newSize= data.length*2;
                data= Arrays.copyOf(data,newSize);
            }
        }
        //Them phan tu vao sau
        public void add(E e) {
                size+=1;
               ensureCapa();
              data[size-1]=e;
        }
        //them phan tu khi biet index
        public void add(E e, int index) {
            if (index >= 0 && index <= size) {
                size += 1;
                ensureCapa();
                for (int i = size - 1; i >= index; i--) {
                    data[i + 1] = data[i];
                }
                data[index] = e;
            }
        }
        // lay phan tu trong arrayList bang index
        public E get(int index) {
            if (index >= 0 && index < size) {
                return data[index];
            }
            return null;
        }

        @Override
        public MyList clone() {
            MyList<E> clone = new MyList<>(data.length);
            for (E x : data) {
                clone.add(x);
            }
            return clone;
        }

        public E[] getData() {
            return this.data;
        }

        public int size() {
            return size;
        }

        public void remove(int index) {
            if (index >= 0 && index < size) {
                for (int i = index; i < size; i++) {
                    data[i] = data[i + 1];
                }
                size -= 1;
            }
        }
        //Xoa  tat ca phan tu trong arrayList
        public void clear() {
            data = (E[]) new Object[DEFAULT_CAPACITY];
            size = 0;
        }
        // Nhan ve index
        public int indexOf(E e) {
            for (int i = 0; i < size; i++) {
                if (data[i].equals(e)) {
                    return i;
                }
            }
            return -1;
        }
        // co chua trong arrayList hay ko
        public boolean contains(E e) {
            for (E x : data) {
                if (e.equals(x)) {
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args) {

            MyList<Integer> myList= new MyList<>();

            System.out.println("List: ");

          myList.add(1,0);
          myList.add(2,0);

            for(int i=0; i<myList.size;i++){
                System.out.println(myList.get(i));
            }
    //      myList.add("tham",2);
    //        myList.add("tham",2);
    //        System.out.println("List: ");
    //        for(int i=0; i<myList.size;i++){
    //         System.out.println(myList.get(i));
    //        }
    ////        myList.clear();
    ////        System.out.println("List: ");
    ////        for(int i=0; i<myList.size;i++){
    ////            System.out.println(myList.get(i));
    ////        }

        }
    }