class Activityselection{
    public static void printMaxActivities(int s[],int f[],int n)
    {
        int i,j;
        System.out.println("Following activities are selected");
        i=0;
        System.out.print(i+" ");
        for(j=1;j<n;j++){
            if(s[j]>=f[i]){
                System.out.print(j+" ");
                i=j;
            }
        }

    }

    public static void main(String args[])
    {
        int s[]={1,3,0,5,8,5};
        int f[]={2,9,8,3,7,3};
        int n= s.length;
        printMaxActivities(s, f, n);
    }
}
