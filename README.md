# Individual-Threads-and-the-Singleton

# How to use
- methods run() and main(String[] args) can be found in SingletonThread.java within the src directory.
- run(): Accesses LazyInitializedSingleton, then prints out the hash code of the thread instance.
- main(String[] args): Using a for loop, create 3 new threads.

# Observations
- Usually I'll get the same hashcode for all 3 threads like this:
- 183630551
- 183630551
- 183630551
- Other times, however, I get mismatched hashcodes. Something like this:
- 157988581
- 646501243
- 905797271
- OR like this:
- 646501243 
- 157988581
- 646501243
