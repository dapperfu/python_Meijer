package U6;

import U6.i;
import U6.j;
import com.bugsnag.android.repackaged.dslplatform.json.ConfigurationException;
import com.bugsnag.android.repackaged.dslplatform.json.ParsingException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSException;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* loaded from: classes4.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    static final i.f<Element> f37342a = new a();

    /* renamed from: b, reason: collision with root package name */
    static final j.a<Element> f37343b = new b();

    /* renamed from: c, reason: collision with root package name */
    private static final DocumentBuilder f37344c;

    class a implements i.f<Element> {
        a() {
        }

        @Override // U6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Element a(i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            return s.g(iVar);
        }
    }

    class b implements j.a<Element> {
        b() {
        }

        @Override // U6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, Element element) throws LSException, IOException {
            s.j(element, jVar);
        }
    }

    static {
        try {
            f37344c = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (ParserConfigurationException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void c(Document document, Node node, List<String> list) throws DOMException {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
        }
        node.appendChild(document.createTextNode(sb2.toString()));
    }

    private static void d(Document document, Element element, Object obj) throws DOMException {
        if (!(obj instanceof HashMap)) {
            if (obj instanceof List) {
                e(document, element, (List) obj);
                return;
            } else {
                if (obj != null) {
                    element.setTextContent(obj.toString());
                    return;
                }
                return;
            }
        }
        for (Map.Entry entry : ((HashMap) obj).entrySet()) {
            String str = (String) entry.getKey();
            if (str.startsWith("@")) {
                element.setAttribute(str.substring(1), entry.getValue().toString());
            } else if (!str.startsWith("#")) {
                Element elementCreateElement = document.createElement(str);
                element.appendChild(elementCreateElement);
                d(document, elementCreateElement, entry.getValue());
            } else if (str.equals("#text")) {
                if (entry.getValue() instanceof List) {
                    c(document, element, (List) entry.getValue());
                } else {
                    element.appendChild(document.createTextNode(entry.getValue().toString()));
                }
            } else if (str.equals("#cdata-section")) {
                if (entry.getValue() instanceof List) {
                    a(document, element, (List) entry.getValue());
                } else {
                    element.appendChild(document.createCDATASection(entry.getValue().toString()));
                }
            } else if (str.equals("#comment")) {
                if (entry.getValue() instanceof List) {
                    b(document, element, (List) entry.getValue());
                } else {
                    element.appendChild(document.createComment(entry.getValue().toString()));
                }
            }
        }
    }

    private static synchronized Document f() {
        try {
        } catch (ParserConfigurationException e10) {
            throw new ConfigurationException(e10);
        }
        return DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
    }

    public static void j(Element element, j jVar) throws LSException, IOException {
        if (element == null) {
            jVar.n();
        } else {
            i(element, jVar);
        }
    }

    private static void a(Document document, Node node, List<String> list) throws DOMException {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            node.appendChild(document.createCDATASection(it.next()));
        }
    }

    private static void b(Document document, Node node, List<String> list) throws DOMException {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            node.appendChild(document.createComment(it.next()));
        }
    }

    private static void e(Document document, Node node, List<Object> list) throws DOMException {
        Node parentNode = node.getParentNode();
        d(document, (Element) node, list.get(0));
        for (Object obj : list.subList(1, list.size())) {
            Element elementCreateElement = document.createElement(node.getNodeName());
            parentNode.appendChild(elementCreateElement);
            d(document, elementCreateElement, obj);
        }
    }

    public static Element g(i iVar) throws IOException {
        if (iVar.n() == 34) {
            try {
                return f37344c.parse(new InputSource(new StringReader(iVar.I()))).getDocumentElement();
            } catch (SAXException e10) {
                throw iVar.s("Invalid XML value", 0, e10);
            }
        }
        return h(m.b(iVar));
    }

    public static Element h(Map<String, Object> map) throws DOMException, IOException {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.size() <= 1) {
            String next = setKeySet.iterator().next();
            Document documentF = f();
            Element elementCreateElement = documentF.createElement(next);
            documentF.appendChild(elementCreateElement);
            d(documentF, elementCreateElement, map.get(next));
            return elementCreateElement;
        }
        throw ParsingException.b("Invalid XML. Expecting root element", true);
    }

    public static void i(Element element, j jVar) throws LSException, IOException {
        Document ownerDocument = element.getOwnerDocument();
        DOMImplementationLS dOMImplementationLS = (DOMImplementationLS) ownerDocument.getImplementation();
        LSSerializer lSSerializerCreateLSSerializer = dOMImplementationLS.createLSSerializer();
        LSOutput lSOutputCreateLSOutput = dOMImplementationLS.createLSOutput();
        lSOutputCreateLSOutput.setEncoding("UTF-8");
        StringWriter stringWriter = new StringWriter();
        lSOutputCreateLSOutput.setCharacterStream(stringWriter);
        lSSerializerCreateLSSerializer.write(ownerDocument, lSOutputCreateLSOutput);
        o.a(stringWriter.toString(), jVar);
    }
}
