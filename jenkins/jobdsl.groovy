import javaposse.jobdsl.dsl.DslFactory


DslFactory factory = this

List<String> repos=["a","b","c","d"]


repos.forEach{
	factory.job("${it}-job") {
		steps {
			shell("echo 'hello'")
		}
	}	
}
