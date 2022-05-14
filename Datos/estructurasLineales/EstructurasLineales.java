package estructurasLineales;

import java.time.LocalDate;

import estructurasLineales.EstructurasLineales.LinkedList;

public class EstructurasLineales {

	public static class Node<T>{
		Node<T> siguiente;
		public T dato;    ////cambié el dato, head y tail a public para accesibilidad desde otro paquete
		public Node(T dato){		////me da pereza hacer metodos de get y set xd
			this.dato=dato;
		}
		public Node() {
			// TODO Auto-generated constructor stub
		}
		public void printNode(T a) {		
			System.out.print(this.dato);
			
		}	
		
	}
	
	public static class LinkedList<T> extends Node{
		public Node<T> head;
		public Node<T> tail;
		
		private int tamano=0;
		public boolean empty=true;
		public LinkedList() {
			 
		};
				
		public void pushFront(T datoAingresar) {
			Node provisional= new Node(datoAingresar);
			if(head==null) {
				head=provisional;
				tail=head;
				tamano+=1;
			}
	
			else {
				provisional.siguiente=head;
				head=provisional;
				tamano+=1;
			}
			Node provisionalTail=head;
			while(provisionalTail.siguiente!=null) {
				provisionalTail=provisionalTail.siguiente;
			}
		}
		public void pushBack(T datoAingresar) {
			Node provisional= new Node(datoAingresar);
			if(head==null) {
				head=provisional;
				tail=provisional;
				tamano+=1;
			}
			else {
				tail.siguiente=provisional;
				tail=provisional;
				tamano+=1;
			}
		}
		public int getTamano() {
			return this.tamano;
		}
		public T popFront() {
			Node UltimoEliminado= head;
			if(head==null) {
				
			}
			else if(head==tail) {
				head=null;
				tail=null;
			}
			else {
				head=head.siguiente;
			}
			tamano-=1;
			return (T) UltimoEliminado.dato ;
			
		}
		public T popBack() {
		Node recorredor= head;
			while(recorredor.siguiente!=tail) {
				recorredor=recorredor.siguiente;
				if(recorredor==null) {
					head=null;
					tail=null;
					break;
				}
			}
			Node UltimoEliminado=tail;	
			tail=recorredor;
			tamano-=1;
			return (T) UltimoEliminado.dato;
		}
		public void printList(){
			Node impresor=head;
			while(impresor!=tail.siguiente) {
				System.out.print(impresor.dato+" ");
				impresor=impresor.siguiente;
			}
		}
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		public void printDatosAlmacenados(LinkedList doble) {  //imprime todos los datos de la lista
			String listaFinal= new String();
			Node cabeza= doble.head;////*****tuve que añadir pq el metodo me dejaba la cabeza en null
			while(doble.head!=null) {
				String[] provisional= (String[]) doble.head.dato;	
				for(int i=0;i<provisional.length;i++)
		        {
		            if(i==0) {
		            	listaFinal+= provisional[i]+" ";
		            }
		            else {
		            	listaFinal+=provisional[i]+" /";
		            }
		        }
				doble.head=doble.head.siguiente;
			}
			doble.head=cabeza;///////******lo mismo de los asteriscos de arriba
			System.out.println("Los datos almacenados son: "+listaFinal);
			
		}
		////////////////////////////////////////////////////////////////////////////////////////////////
		
		public void printDatosSegunFecha(LinkedList doble,String fecha) { //la fecha se debe insertar "año-mes-dia", y los meses de 1 digito se escriben: 01,02,03...
			
			Node recorredor = doble.head;
			String listaFinal2= new String();
			//int contadorciclo=0;
			while(recorredor!=null) {
				String[] provisional2= (String[]) recorredor.dato;
				if(provisional2[1].equals(fecha)&&recorredor!=null) { //IMPORTANTISIMO el uso de .equals, que no es lo mismo que el operador ==
					listaFinal2+=provisional2[0]+", ";
					recorredor=recorredor.siguiente;
					
				}
				else if(provisional2[1]!=fecha&&recorredor!=null) {
					recorredor=recorredor.siguiente;
					System.out.println("ENGORROSO PERO NECESARIO: "+provisional2[1]);
				}
				
			}
			System.out.println("los eventos: "+listaFinal2+"estan programados para: "+fecha);
			
			
		}
		
		
			
		////////////////////////////////////////////////////////////////////////////////////////////////
		
		public boolean mayorNodos(Node<Integer>a, Node<Integer>b) {
			boolean x=false;
			if(a.dato>b.dato) {
				x=true;
			}
			return	x;		
		}
	}
	public static class Stack<T> extends LinkedList<T>{
		public Stack() {
			super();
		}
		public void push(T dato) {
			pushFront(dato);
		}
		public T pop() {
			return popFront();
		}
		public void printStack() {
			printList();
		}
		
	}
	public static class Queue<T> extends LinkedList<T>{
		public Queue() {
			super();
		}
		public void enqueue(T dato) {
			pushFront(dato);
		}
		public T dequeue() {
			return popBack();
		}
		public void printQueue() {
			printList();
		}
	}
	
	
	public static void main(String[] args) {
		
		
	}
	
}