# kotlinCacheIssue
Sample Project illustrating kotlin cache issue

To repro issue checkout out the master branch and run
```
./gradlew :app:assembleDebug
```
Then checkout movedInjection branch and run
```
./gradlew :app:assembleDebug
```
The build will fail.

