package ${package};

import org.elasticsearch.plugins.Plugin;


public class ${pluginname}Plugin extends Plugin {

	@Override
	public String name() {
		return "${artifactId}";
	}

	@Override
	public String description() {
		return "Elasticsearch ${artifactId} plugin";
	}

}

