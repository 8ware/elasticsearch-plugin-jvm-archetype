
Elasticsearch JVM Plugin Archetype
==================================

Maven archetype for creating Elasticsearch JVM plugins.

The goal is to provide an archetype with a good trade off between simplicity
and development simplification/assistance.


Usage
-----

1.	Install archetype with `mvn install`
2.	Create Elasticsearch plugin with

	```
	mvn archetype:generate --batch-mode                           \
	    -DarchetypeGroupId=com.github.eightward                   \
		 -DarchetypeArtifactId=elasticsearch-plugin-jvm-archetype  \
		 -DarchetypeVersion=1.0.0                                  \
		 -DgroupId=org.example                                     \
		 -DartifactId=test-plugin                                  \
		 -Dversion=1.0.0                                           \
		 -Dpluginname=Test
	```

Optionally, the Elasticsearch version can be specified with
`-Delasticsearchversion=2.1.1` (consider the archetype's compatibility
beginning with `2.1.1`).

*Note, that the `pluginname` should not end with `Plugin` since this is
appended automatically.*

When generating the plugin skeleton the `groupId` denotes the package and
consequently, the generated plugin stub will be in that namespace. When the
package or name of the plugin's main class changes the `pom.xml`, i.e. the
`elasticsearch.plugin.classname` property *must* be adjusted as well.


Elasticsearch Compatibility
---------------------------

| Archetype | Elasticsearch |
|:---------:|:-------------:|
| 1.0.0     | 2.1.1         |
| 1.1.0     | 2.2.0         |

*Earlier 2.x versions of Elasticsearch might also work with version 1.0.0
which however was not tested, yet.*


Acknowledgements
----------------

Mainly inspired by codelibs' [elasticsearch-plugin-archetype](https://github.com/codelibs/elasticsearch-plugin-archetype).

