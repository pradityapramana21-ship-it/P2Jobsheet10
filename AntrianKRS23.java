class AntrianKRS23 {
    Mahasiswa23[] data = new Mahasiswa23[10];
    int front = -1;
    int rear = -1;
    int size = 0;
    int sudahProses = 0;
    boolean isEmpty() {
        return size == 0;
    }
    boolean isFull() {
        return size == data.length;
    }
    void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }
    void enqueue(Mahasiswa23 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }
        data[rear] = mhs;
        size++;
        System.out.println("Antrian berhasil ditambah");
    }
    void dequeue() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2");
            return;
        }
        System.out.println("Mahasiswa dipanggil:");
        for (int i = 0; i < 2; i++) {
            data[front].tampilData();
            front++;
            size--;
            sudahProses++; } }
    void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        for (int i = front; i <= rear; i++) {
            data[i].tampilData(); } }
    void tampilDepan() {
        if (!isEmpty()) {
            data[front].tampilData();
            if (size > 1) {
                data[front + 1].tampilData(); } } }
    void tampilBelakang() {
        if (!isEmpty()) {
            data[rear].tampilData();} }
    void jumlahAntrian() {
        System.out.println("Jumlah antrian : " + size); }
    void jumlahSudahProses() {
        System.out.println("Sudah proses : " + sudahProses); }
    void belumProses() {
        System.out.println("Belum proses : " + (30 - sudahProses));
    }
}