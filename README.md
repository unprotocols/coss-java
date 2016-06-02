# COSS for Java

Minimalistic library for annotating Java code with [COSS](http://rfc.unprotocols.org/spec:2/COSS) lifecycle attributes, so
that the level of API and behaviour maturity can be easily identified. It also helps figuring out if a particular implementation
has fallen behind on following the progress of specification development.

## Usage

COSS annotation targets are not restricted. The simplest way to annotate code is to use one of the following annotations:
`Raw`, `Draft`, `Stable` (optional), `Deprecated`, `Retired`:

```java
@Draft
public class Serializer { /* ... */ }
```

However, it's even more useful to point to a specification the code is implementing:

```java
@Draft @RFC(url = "http://rfc.eventsourcing.com/spec:2/BES")
public class Serializer { /* ... */ }
```

Stages before `Stable`, though, can use a revision clarification as they are
naturally expected to change. For that, a free-form revision identifier can be specified. Could be a date, a git commit, human-readable version, etc., as long
as it is helpful:

```java
@Draft @RFC(url = "http://rfc.eventsourcing.com/spec:2/BES",
          revision = "Jul 1, 2016")
public class Serializer { /* ... */ }
```
