class Solution {
public:
    void sortColors(vector<int>& nums) {
        int s=0,m=0;
        int h=nums.size()-1;
        while(m <= h)
        {
            switch(nums[m])
            {  
            case 0:swap(nums[m++],nums[s++]);
                    break;
                   
            
            case 1 :   m++; break;
            
             case 2:
               swap(nums[m],nums[h--]);break;
            }
        }
    
        
    }
};