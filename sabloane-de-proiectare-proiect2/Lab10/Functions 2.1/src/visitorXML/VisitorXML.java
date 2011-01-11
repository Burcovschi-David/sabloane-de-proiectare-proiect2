package visitorXML;

import xml.*;

public abstract class VisitorXML {
	
	public abstract void visit(TagXML tagXML);
	public abstract void visit(PlusTagXML tagXML);
	public abstract void visit(ConstantaTagXML tagXML);
	public abstract void visit(NecunoscutaTagXML tagXML);
	public abstract void visit(MinusTagXML tagXML);
	public abstract void visit(CatTagXML tagXML);
	public abstract void visit(ProdusTagXML tagXML);
	public abstract void visit(SinTagXML tagXML);
	public abstract void visit(CosTagXML tagXML);

}
