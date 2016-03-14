
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
	    -DarchetypeVersion=1.1.2                                  \
	    -DgroupId=org.example                                     \
	    -DartifactId=test-plugin                                  \
	    -Dversion=1.0.0                                           \
	    -Dpluginname=Test                                         \
	    -Dpackage=org.example.plugin.test                         \
	    -Delasticsearchbin=/path/to/elasticsearch/bin/elasticsearch
	```

Optionally, the Elasticsearch version can be specified with
`-Delasticsearchversion=<version>` (consider the archetype's compatibility
beginning with `2.1.1`).

*Note, that the `pluginname` should not end with `Plugin` since this is
appended automatically.*

When generating the plugin skeleton the `groupId` denotes the package and
consequently, the generated plugin stub will be in that namespace. When the
package or name of the plugin's main class changes the `pom.xml`, i.e. the
`elasticsearch.plugin.classname` property *must* be adjusted as well.


Features
--------

*	Run plugin with Elasticsearch by building the project with `mvn package -P develop`
	and starting Elasticsearch afterwards with `mvn exec:exec -P develop`
*	Run Elasticsearch in debug mode (i.e. with remote debugging enabled) using
	the `debug` profile: `mvn exec:exec -P debug,develop`. *Note, that specifying
	only the `debug` profile will lead to an error.*


Properties
----------

| Property             | Description                                                |
|----------------------|------------------------------------------------------------|
| pluginname           | The name of the plugin *w/o* `Plugin` appended             |
| package              | An alternative package name, defaults to `groupId`         |
| elasticsearchbin     | The path to the Elasticsearch binary/script                |
| elasticsearchversion | The Elasticsearch version the plugin should be created for |


Elasticsearch Compatibility
---------------------------

| Archetype | Elasticsearch |
|:---------:|:-------------:|
| 1.0.0     | 2.1.1         |
| 1.1.x     | 2.2.0         |

*Earlier 2.x versions of Elasticsearch might also work with version 1.0.0
which however was not tested, yet.*


Acknowledgements
----------------

Mainly inspired by codelibs' [elasticsearch-plugin-archetype](https://github.com/codelibs/elasticsearch-plugin-archetype).

