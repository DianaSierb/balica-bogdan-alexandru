public class Factory{
	interface Xyz {
		Xyz cloan();
	}
	static class Tom implements Xyz {
		public Xyz cloan() {
			return new Tom();
			}
		public String toString() {
			return "ttt";
			}
		}
	static class Dick implements Xyz {
		public Xyz cloan() {
			return new Dick();
		    }
		public String toString() {
			return "ddd";
		    }
		}
	static class Harry implements Xyz{
		public Xyz cloan() {
			return new Harry();
			}
		public String toString() {
			return "hhh";
		    }
		}
	
	 static class Factory2 {
		private static java.util.Map<String, Xyz> prototypes=new java.util.HashMap<String, Xyz>();
		static {
			prototypes.put("tom", new Tom());
			prototypes.put("dick", new Dick());
			prototypes.put("harry", new Harry());
			}
		public static Xyz makeObject(String s) {
			return prototypes.get(s).cloan();
		}
		public static void main(String args[]) {
			for(int i=0;i<args.length;i++) {
				System.out.println(Factory2.makeObject(args[i])+" ");
				}
			}
		}
	 }