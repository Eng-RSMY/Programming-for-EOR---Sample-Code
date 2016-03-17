powerOfOnePerThree <- function(x, c1, epsilon){
  cprev <- c1 + 2 * epsilon
  while ( abs(c1-cprev) > epsilon ){
    cprev <- c1
    c1 <- c1 * ( (c1^3+2*x) / (2*c1^3 + x) )
    #print(c1)
  }
  return(c1)
}