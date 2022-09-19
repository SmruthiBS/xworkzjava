class SportsRunner{
public static void main(String[]play){
System.out.println("main start");
String[] names={"virat Kohli","Rohit Sharma","KL Rahul","Suryakumar Yadav","Deepak Hooda","Rishabh Pant","Dinesh Karthik","Hardik Pandya","R Ashwin","Yuzvendra Chahal"};
Sports.cricketTeamMembers(names);
int[] numbers={1,2,3,4,5,6,7,8,9,10};
Sports.kabbadiTeamMembersJerseyNos(numbers);
double[] salaries={100000,2000000,3000000,400000,5000000,6000000,700000,800000,900000,100000};
Sports.FootBallTeamMembersSalary(salaries);
long[] nos={9449498848l,92424747488l,9482618680l,94494955251l,9449498847l,9449498840l,9242474755l,9242474766l,9449498842l,9449498875l};
Sports.ludoTeamMobileNumber(nos);
int[] matches={2,4,6,8,9,7,5,3,1,10};
Sports.hockeyTeamMembersNoOfMatches(matches);
long[] codes={93,355,213,376,244,672,54,374,297,61};
Sports.kokoTeamMembersCountryCode(codes);
boolean[] alive={true,true,true,true,true,true,true,true,true,true};
Sports.lagoriTeamMembersAlive(alive);


}
}

