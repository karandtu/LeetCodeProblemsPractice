package com.personal.codeprep;

public class MergeSortAlgorithmPseudoCode {

	
	/** merge(L, R, A)
	
	nL <------ length(left)
	nR <------- length(right)
	
	i<---j<----k<---0
	
	while(i < nL && j < nR ){
	if( L[i] <= R[j] {
	  A[K] <----L[i];
	  i<---- i+1;
	  }
	  else {
	  A[k]<---R[j];
	  j<---j+1;
	  }
	  k<---k+1;
	  }
	  
	  by chance if either of L[i] or R[j] gets exhausted meaning
	  if all of the elements of either of the list gets filled up, then
	  get out of the loop mentioned above. Instead , we will need to check the
	  left-over remaining elements of the list where elements are remaining.
	  
	  while(i < nL) { 
	  A[k]<----L[i];
	  i<---i+1;
	  k<--k+1;
	  }
	  
	  while(j < nR) { 
	  A[k]<----R[j];
	  j<---j+1;
	  k<--k+1;
	  }
	  
	  
	  
	 

	*/
}
