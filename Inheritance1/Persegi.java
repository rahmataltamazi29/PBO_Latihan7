public class Persegi extends Bentuk {
	protected int p;
	protected int l;
	
	public void setsuperP(int p){
		super.p=p;
	}
	public void setsuperL(int l){
		super.l = l;
	}
	public void setP(int p){
		this.p = p;
	}
	public void setL(int l){
		this.l = l;
	}
	
	public void getLuas(){
		System.out.println("luas super:"+(super.l*super.p));
		System.out.println("luas:"+ (this.l*this.p));
	}
}