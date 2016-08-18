package com.shanemulcair.advent;

import java.util.ArrayList;
import java.util.List;

import com.shanemulcair.utilities.FileAccess;

public class Day9Part1 {
	public static void main(String[] args){
		System.out.println(getShortestPath("C:\\tools\\workspace\\Day9Sample.txt"));
	}
	static List<String[]> PairsAndDistances=null;
	static List<String> cityList=null;
	static List<String[]> allRoutes=new ArrayList<String[]>();
	static int maxNumberOfRoutes=0;
	
	public static int getShortestPath(String input){
		FileAccess fa=new FileAccess();
		List<String> inputs=fa.readFromFile(input);
		List<String[]> distances=new ArrayList<String[]>();
		distances=getPairsAndDistances(inputs);
		PairsAndDistances=distances;
		List<String> cities=getUniqueCities(distances);
		cityList=cities;
		getRoutes(cities);
		System.out.println("Number of Routes: "+maxNumberOfRoutes);
		System.out.println();
//		for(String[] s:allRoutes){
//			for(String x:s){
//				System.out.println(x);
//			}
//		}
		for(String s:cityList){
			System.out.println(s);
		}
		return getShortestRoute(allRoutes);
	}
	
	private static int getShortestRoute(List<String[]> routes){
		int smallestDistance=Integer.MAX_VALUE;
		for(String[] s:routes){
			int distance=0;
			for(int i=0;i<s.length;i++){
				String c1=s[i];
				String c2=s[i+1];
				int newPart=0;
				for(String[] pairs:PairsAndDistances){
//					System.out.println("c1: "+c1);
//					System.out.println("c2: "+c2);
					if(pairs[0].equals(c1)&&pairs[1].equals(c2)){
						newPart+=Integer.parseInt(pairs[2]);
						System.out.println("NewPart: "+newPart);
					}
					else if(pairs[1].equals(c1)&&pairs[2].equals(c2)){
						newPart+=Integer.parseInt(pairs[2]);
						System.out.println("NewPart: "+newPart);
					}
				}
				if(newPart>0){
					distance+=newPart;
				}
				else{
					break;
				}
			}
			if(distance<smallestDistance&&distance!=0){
				smallestDistance=distance;
			}
		}
		return smallestDistance;
		
	}
	
	private static void getMaxRouteNum(int length){
		int i=length;
		maxNumberOfRoutes=1;
		while(i>1){
			maxNumberOfRoutes*=i--;
		}
	}
	
	private static void getRoutes(List<String> cities){
		List<String[]> routes=new ArrayList<String[]>();
		int length=cityList.size();
		getMaxRouteNum(length);
		String[] route=new String[length];
		for(int i=0;i<length;i++){
			route[0]=cityList.get(i);
			
			if(length==1){
				allRoutes.add(route);
				
			}
			for(int j=0;j<length;j++){
				route[1]=cityList.get(j);
				
				if(length==2){
					allRoutes.add(route);
				}
				for(int k=0;k<length;k++){
					route[2]=cityList.get(k);
					
					if(length==3){
						System.out.println("Adding1: "+cityList.get(i));
						System.out.println("Adding2: "+cityList.get(j));
						System.out.println("Adding3: "+cityList.get(k));
						allRoutes.add(route);
					}
					for(int l=3;l<length;l++){
						route[3]=cityList.get(l);
						if(length==4){
							allRoutes.add(route);
						}
						for(int m=4;m<length;m++){
							route[4]=cityList.get(m);
							if(length==5){
								allRoutes.add(route);
							}
							for(int n=5;n<length;n++){
								route[5]=cityList.get(n);
								if(length==6){
									allRoutes.add(route);
								}
								for(int o=6;o<length;o++){
									route[6]=cityList.get(o);
									if(length==7){
										allRoutes.add(route);
									}
									for(int p=7;p<length;p++){
										route[7]=cityList.get(p);
										if(length==8){
											allRoutes.add(route);
										}
										for(int q=8;q<length;q++){
											route[8]=cityList.get(q);
											if(length==9){
												allRoutes.add(route);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
			
	}
	
	private static List<String> getUniqueCities(List<String[]> inputs){
		List<String> cities=new ArrayList<String>();
		for(String[] s:inputs){
			if(!cities.contains(s[0])){
				cities.add(s[0]);
			}
			if(!cities.contains(s[1])){
				cities.add(s[1]);
			}
		}
		return cities;
		
	}
	private static List<String[]> getPairsAndDistances(List<String> input){
		List<String[]> output=new ArrayList<String[]>();
		for(String s:input){
			String[] route=new String[3];
				route[0]=(s.split(" ")[0]);
				route[1]=(s.split(" ")[2]);
				route[2]=(s.split(" ")[4]);
			output.add(route);
		}
		return output;
	}
}
