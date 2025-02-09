//Maximum Product Subarray - Amazon, D-E-Shaw, Microsoft, Morgan Stanley, OYO Rooms, Google
//Leetcode - 152
//Kadane's Algorithm or Prefix and Suffix Product - Space : O(1) and Time : O(n)


public class Arrays_Medium7 {
    public static void main(String[] args) {
        int nums[] = {2,3,-2,4} ;
        int n = nums.length;
        int l=1,r=1;
        int ans=nums[0];

        for(int i=0;i<n;i++){

            //if any of l or r become 0 then update it to 1
            l = l==0 ? 1 : l;
            r = r==0 ? 1 : r;

            l *= nums[i];   //prefix product
            r *= nums[n-1-i];    //suffix product

            ans = Math.max(ans,Math.max(l,r));

        }

        System.out.println(ans);

    }
}
