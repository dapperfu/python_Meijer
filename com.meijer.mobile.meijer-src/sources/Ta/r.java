package Ta;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class r extends l {

    /* renamed from: k, reason: collision with root package name */
    private List<l> f36081k;

    public boolean w(String str) {
        return true;
    }

    public List<l> v() {
        return this.f36081k;
    }

    public r(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        super(xmlPullParser, str);
    }

    private void u(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (!w(name)) {
            f(xmlPullParser);
        }
        name.getClass();
        switch (name) {
            case "collapsible-layout":
                this.f36081k.add(new C5327a(xmlPullParser));
                break;
            case "linear-layout":
                this.f36081k.add(new s(xmlPullParser));
                break;
            case "flexbox":
                this.f36081k.add(new m(xmlPullParser));
                break;
            case "text":
                this.f36081k.add(new x(xmlPullParser));
                break;
            case "scrollview":
                this.f36081k.add(new u(xmlPullParser));
                break;
            case "image":
                this.f36081k.add(new p(xmlPullParser));
                break;
            case "item-atom":
                this.f36081k.add(new q(xmlPullParser));
                break;
            default:
                f(xmlPullParser);
                break;
        }
    }

    @Override // com.flipp.sfml.SFTag
    protected void c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super.c(xmlPullParser);
        this.f36081k = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                u(xmlPullParser);
            }
        }
    }
}
