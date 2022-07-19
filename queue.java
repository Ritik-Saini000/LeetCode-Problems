
public class queue {

	int arr[]=new int[100];
	int lim=0;
	int front,rear;
	
	queue(){
		front=-1;
		rear=-1;
		lim=10;
	}
	queue(int x){
		front=-1;
		rear=-1;
		lim=x;
	}
	
	void enqueue(int x) {
		if(front==-1) {
			front=0;
			rear=0;
			arr[rear]=x;
		}
		else if(rear-front==lim-1)
			System.out.println("queue overflow");
		else {
			rear++;
			arr[rear]=x;
		}
	}
	
	void dequeue() {
		if(front==rear) {
			System.out.println("queue is empty");
			rear=-1;
			front=-1;
		}
		else
			front++;
	}
	
	void view_queue(char view_type) {
		if(view_type=='h')
		{
			System.out.println("Queue in horizontal");
			for(int i=front;i<=rear;i++)
				System.out.print(arr[i]+" ");
		}
		if(view_type=='v')
		{
			System.out.println("\nQueue in vertical");
			for(int i=front;i<=rear;i++)
				System.out.println(arr[i]);
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		queue obj=new queue();
		
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(4);
		obj.enqueue(5);
		obj.enqueue(6);
		obj.enqueue(7);
		obj.enqueue(8);
		obj.view_queue('h');
		obj.dequeue();
		obj.dequeue();
		
		obj.view_queue('v');
		
		
	}

}
