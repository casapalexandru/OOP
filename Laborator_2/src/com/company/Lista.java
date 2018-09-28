package com.company;
class Lista{
    int front, rear, size;
    int capacity;
    int array[];

    public Lista(int capacity){
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    boolean isFull(Lista queue){
        return (queue.size == queue.capacity);
    }
    boolean isEmpty(Lista queue){
        return (queue.size == 0);
    }

    void addVar(int item){
        if (isFull(this))
            return;
        this.rear = (this.rear + 1)%this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
        System.out.println(item+" Add to queue");
    }

    int removeVar(){
        if (isEmpty(this))
            return Integer.MIN_VALUE;
        int item = this.array[this.front];
        this.front = (this.front + 1)%this.capacity;
        this.size = this.size - 1;
        return item;
    }

    int front()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.array[this.front];
    }

    int rear()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.array[this.rear];
    }
    void printArray(){
            System.out.println("Array list :");
        for(int i = front -1; i < front+size-1; i++){
            System.out.println(array[i+1]+",");
        }
    }

}

