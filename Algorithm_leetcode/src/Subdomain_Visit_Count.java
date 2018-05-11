import java.util.*;


public class Subdomain_Visit_Count {
	public static void main(String[] args){
		Subdomain_Visit_Count subdomain_Visit_Count = new Subdomain_Visit_Count();
		
		String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
		
		subdomain_Visit_Count.subdomainVisits(cpdomains);
	}
	
	public List<String> subdomainVisits(String[] cpdomains) {
		List<String> result = new ArrayList<String>();
		String[] currentCpdomainArr = new String[2];
		
		for(String domain : cpdomains){
			String[] splitCount = domain.split(" ");
			String[] splitDomain = splitCount[1].split("\\.");
			
			for(int i = splitDomain.length - 1; i >= 0; i--){
				currentCpdomainArr[0] = splitCount[0];
				if(currentCpdomainArr[1] == null){
					currentCpdomainArr[1] = splitDomain[i];
				}else{
					currentCpdomainArr[1] = splitDomain[i] + "." + currentCpdomainArr[1];
				}
				
				Boolean isSame = false;
				for(int j = 0; j < result.size(); j++){
					String[] cpdomainArr = result.get(j).split(" ");
					if(cpdomainArr[1].equals(currentCpdomainArr[1])){
						isSame = true;
						cpdomainArr[0] = String.valueOf(Integer.parseInt(cpdomainArr[0]) + Integer.parseInt(currentCpdomainArr[0]));
						result.set(j, cpdomainArr[0] + " " + cpdomainArr[1]);
					}
				}
				
				if(!isSame){
					result.add(currentCpdomainArr[0] + " " + currentCpdomainArr[1]);
				}
				
				System.out.println(result);
			}
			
			currentCpdomainArr = new String[2];
		}
		
		//System.out.println(result);
		
		return result;
	}
}
