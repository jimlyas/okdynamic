## Issue

The **only** time you want to dynamically change Back-End's environment is when you are in
^^development phase^^.

You don't want your end-user to be able to do that in released product. But how do we do that using
this library?

## Solution

This library have two build types, and it separates the code by **DEBUG** and **RELEASE**.

If you're using **DEBUG** build type, this library will be included with all the features.

If you're using **RELEASE** build type, this library will do nothing and there's no code to trace
back.