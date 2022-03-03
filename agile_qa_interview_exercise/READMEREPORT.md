**Question To Ask **

Can the strings contains combination of numbers and symbols
What should happen when adding more than 4 strings at once
What should we expect when a strings contains symbol is there a way that should be handle
Code Review

The getVowelListWithCount methods IF statement, shouldn’t have the equal sign >=4 since the feature mentioned should allow upto 4 input strings expected should be as below If(args.length() >=5){ System.out.println("Extra arguments passed."); return null; }
The setter and getert methods in CountResult Class are redundant never used
How TO Run The Test

Go to directory test/java/Runner/Run
Right on the Run class and select Run from the options displayed
