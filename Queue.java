class Queue
{
int q[];
int size,front,rear;
Queue()
{
q=null;
size=0;
front=rear=-1;
}
Queue(int s)
{
size=s;
q=new int[size];
front=rear=-1;
}
void insert(int data)
{
if(rear==size-1)
System.out.println("Queue is overflow");
else if(front==-1)
{
front=rear=0;
q[rear]=data;
}
else
q[++rear]=data;
}
void delete()
{
if(front==-1||rear==-1)
System.out.println("Queue is underflow");
else if(front==rear)
front=rear=-1;
else
{
System.out.println("Item deleted "+q[front]);
q[front--]='\0';
}
}
void display()
{
if(front!=1)
{
for(int i=front;i<=rear;i++)
System.out.print(q[i]);
}
else
System.out.println("Queue is empty");
System.out.println();
}
}