Rest.li project generator
=========================

Installation
------------

Download restli.tar.gz and unzip it to a 

```
tar -zxf restli.tar.gz -C /usr/local

OR, if you want to keep in within your home directory:

mkdir -p ~/bin; tar -zxf restli.tar.gz -C ~/bin/restli
```

In your shell profile (e.g. ~/.bash_profile), set a RESTLI_HOME environment variable to the location.

```
export RESTLI_HOME=$HOME/usr/local/restli
export PATH=$RESTLI_HOME/bin:$PATH
```

TODO
----
[ ] package g8 into a distributable 'restli' command line application
[ ] publish into homebrew, apt-get and yum (windows?)
[ ] Put online and adjust tutorials and such to make use of it
[ ] update webpage with detail on 'getting started' page
[ ] create a command line player based demo
[ ] extend generator to allow dependency injection to be used (pick guice or spring)
[ ] extend generator to produce an empty skeleton with no sample code
[ ] add a example generated test

Development
===========

To test changes to a skeleton locally, provide the location of the checked out restli-skeleton project to g8 as the first argument, e.g.:

g8 file:///Users/jbetz/projects/restli-skeleton