/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;
public class Problem {
    private	int n,k;
	private int pos[][];
	private	int q[];
	private	int cap[];
	private	int f[];
	private double dist[][];

	public 
	void setn(int x){n=x;}
	int getn(){return n;}
	void setk(int y){k=y;}
	int getk(){return k;}
	void setpos(int z[][]){
		for(int i=0;i<22;i++){
			for(int j=0;j<2;j++){
				pos[i][j]=z[i][j];
			}	
		}
	}
	int getpos(int a, int b){return pos[a][b];}
	void setq(int w[]){for(int i=0; i<22;i++){q[i]=w[i];}}
	int getq(int a){return q[a];}
	void setcap(int v[]){for(int i=0; i<5;i++){cap[i]=v[i];}}
	int getcap(int a){return cap[a];}
	void setf(int u[]){for(int i=0; i<5;i++){f[i]=u[i];}}
	int getf(int a){return f[a];}
	void compdist(){
		dist=new double[n+1][n+1];
		for(int i=0; i<22; i++){
			for(int j=0; j<22;j++){
				dist[i][j]=((pos[j][0]-pos[i][0])*(pos[j][0]-pos[i][0])+(pos[j][1]-pos[i][1])*(pos[j][1]-pos[i][1]))^(1/2);
			}
		}
	}
	double getdist(int a, int b){ return dist[a][b];}
    
    public static void main(String[] args) {
        int n,k;
        int pos2[][],q2[], cap2[],f2[];
        double dist2[][];
	pos2=new int [21][1];
	q2= new int[21];
	cap2=new int[4];
	f2= new int[4];
	dist2=new double[21][1];
        Problem A = null;
	n=20;
	k=5;
	
pos2[0][0]=30;
pos2[1][0]=37;
pos2[2][0]=49;
pos2[3][0]=52;
pos2[4][0]=20;
pos2[5][0]=40;
pos2[6][0]=21;
pos2[7][0]=17;
pos2[8][0]=31;
pos2[9][0]=52;
pos2[10][0]=51;
pos2[11][0]=42;
pos2[12][0]=31;
pos2[13][0]=5;
pos2[14][0]=12;
pos2[15][0]=36;
pos2[16][0]=52;
pos2[17][0]=27;
pos2[18][0]=17;
pos2[19][0]=13;
pos2[20][0]=57;
pos2[21][0]=30;

pos2[0][1]=40;
pos2[1][1]=52;
pos2[2][1]=49;
pos2[3][1]=64;
pos2[4][1]=26;
pos2[5][1]=30;
pos2[6][1]=47;
pos2[7][1]=63;
pos2[8][1]=62;
pos2[9][1]=33;
pos2[10][1]=21;
pos2[11][1]=41;
pos2[12][1]=32;
pos2[13][1]=25;
pos2[14][1]=42;
pos2[15][1]=16;
pos2[16][1]=41;
pos2[17][1]=23;
pos2[18][1]=33;
pos2[19][1]=13;
pos2[20][1]=58;
pos2[21][1]=40;

q2[0]=0;
q2[1]=7;
q2[2]=30;
q2[3]=16;
q2[4]=9;
q2[5]=21;
q2[6]=15;
q2[7]=19;
q2[8]=23;
q2[9]=11;
q2[10]=5;
q2[11]=19;
q2[12]=29;
q2[13]=23;
q2[14]=21;
q2[15]=10;
q2[16]=15;
q2[17]=3;
q2[18]=41;
q2[19]=9;
q2[20]=28;
q2[21]=0;

cap2[0]=20;
cap2[1]=30;
cap2[2]=40;
cap2[3]=70;
cap2[4]=120;

f2[0]=20;
f2[1]=35;
f2[2]=50;
f2[3]=120;
f2[4]=225;

	A.setn(n);
	A.setk(k);
        
	A.setpos(pos2);
	A.setq(q2);
	A.setcap(cap2);
	A.setf(f2);
        
        ArrayList<Route> routes=new ArrayList<>();
        for (int i=0; i<A.getn();i++){
            Route ri=new Route((i+1), A.getf(0));
            ri.addNode(0,(i+1));
            ri.setcost(2*A.getdist(0,(i+1)));
            routes.add(ri);
        }
        
    }
    

    private boolean DecimalFormat(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
