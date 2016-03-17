source('powerOfOnePerThree.R')
source('plotCubeRoot.R')

# read data files if necessary
limits <- read.csv("mockExam.csv");
lower <- limits$limit[limits$name == "xlower"];
upper <- limits$limit[limits$name == "xupper"];
step <- limits$limit[limits$name == "step"];
c1 <- limits$limit[limits$name == "c1"];
epsilon <- limits$limit[limits$name == "epsilon"];

x <- seq(from = lower, to = upper, by = step);
y <- vector();

for (n in 1:length(x)){
  y[n] <- powerOfOnePerThree(x[n], c1, epsilon)
  print(y[n])
}

plotCubeRoot(x,y, t="l", m= "cube roots")
#plot(x,y, type="l", main= "cube roots")