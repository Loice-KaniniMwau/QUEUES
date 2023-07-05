fun main() {
var q=Queue(6)
    q.dequeue()
    q.enqueue(3)
    q.enqueue(4)
    q.enqueue(7)
    q.enqueue(6)
    q.display()
    q.dequeue()
    println("................")
    q.display()
    q.dequeue()
    q.dequeue()
    q.enqueue(3)
    q.enqueue(5)
    q.dequeue()
    q.enqueue(7)
    q.enqueue(8)
    q.enqueue(1)
    q.enqueue(3)
    q.enqueue(5)
    println(q.peek())
    println("..................")
    println(q.display())

//    println(q.peek())
}
class Queue(var capacity:Int){
    var datastore=IntArray(capacity)
    var front=0
    var rear=0
    fun enqueue(value:Int){
        if(isFull()){
            println("queue is full ")
            return
        }
       datastore[rear]=value
        rear++

    }
    fun dequeue():Int?{
        if(isEmpty()){
            println("Queue is empty")
            return null

        }
        var removed=datastore[front]
        for(i in front until rear-1){
            datastore[i]=datastore[i+1]
        }
        rear--
        return removed

    }
    fun isFull():Boolean{
        return rear==capacity

    }
    fun isEmpty():Boolean{
        return rear==front
    }
    fun peek():Int?{
        if(isEmpty()){
            println("Queue is empty")
            return null
        }
        return datastore[front]
    }
    fun display(){
        if(isEmpty()){
            println("Queue is empty")
            return
        }
        for(i in front until rear){
            println(datastore[i])
        }

    }
}