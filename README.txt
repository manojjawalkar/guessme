# add the alias command
alias graph='git log --all --decorate --oneline --graph'

# I use push like 
git push -u origin master

# FIXING A BUG
# When you start to work on a bug fix, create a new branch, make changes, test it, and then merge into local master
# here are git command you will need -
0. git checkout -b <BRANCH_NAME>
1. git status 
2. git add <FILENAME>
3. git commit -m "YOUR FIX COMMENT"
4. git checkout master
5. git merge <BRANCH_NAME>
6. git push origin

# to push your branch on your repo -
1. git push origin <BRANCH_NAME>

