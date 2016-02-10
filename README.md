
Elasticsearch JVM Plugin Archetype
==================================

Maven archetype for creating Elasticsearch JVM plugins.


Usage
-----

1.	Install archetype with `mvn install`
2.	Create Elasticsearch plugin with

	```
	mvn archetype:generate  -DarchetypeGroupId=com.github.eightward -DarchetypeArtifactId=elasticsearch-plugin-jvm-archetype -DarchetypeVersion=1.0.0  -DgroupId=org.example -DartifactId=test-plugin -Dversion=1.0.0 -Dpluginname=Test
	```

Optionally, the Elasticsearch version can be specified with
`-Delasticsearchversion=2.1.1` (consider the archetype's compatibility
beginning with `2.1.1`).

*Note, that the `pluginname` should not end with `Plugin` since this is
appended automatically.*


Elasticsearch Compatibility
---------------------------

| Archetype | Elasticsearch |
|:---------:|:-------------:|
| 1.0.0     | 2.1.1         |

*Earlier 2.x versions of Elasticsearch might also work with version 1.0.0
which however was not tested, yet.*


Acknowledgements
----------------

Mainly inspired by codelibs' [elasticsearch-plugin-archetype](https://github.com/codelibs/elasticsearch-plugin-archetype).

