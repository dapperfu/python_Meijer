package Ta;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class q extends l {

    /* renamed from: k, reason: collision with root package name */
    private String f36073k;

    /* renamed from: l, reason: collision with root package name */
    private String f36074l;

    /* renamed from: m, reason: collision with root package name */
    private String f36075m;

    /* renamed from: n, reason: collision with root package name */
    private String f36076n;

    /* renamed from: o, reason: collision with root package name */
    private String f36077o;

    /* renamed from: p, reason: collision with root package name */
    private String f36078p;

    /* renamed from: q, reason: collision with root package name */
    private List<v> f36079q;

    /* renamed from: r, reason: collision with root package name */
    private b f36080r;

    public q(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser, "item-atom");
    }

    public List<v> A() {
        return this.f36079q;
    }

    public b u() {
        return this.f36080r;
    }

    public String v() {
        return this.f36073k;
    }

    public String w() {
        return this.f36077o;
    }

    public String x() {
        return this.f36076n;
    }

    public String y() {
        return this.f36075m;
    }

    public String z() {
        return this.f36074l;
    }

    @Override // Ta.l, com.flipp.sfml.SFTag
    protected void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, NumberFormatException {
        super.b(xmlPullParser);
        this.f36080r = new b(xmlPullParser);
        this.f36073k = a(xmlPullParser, "name");
        this.f36074l = a(xmlPullParser, "sales-story");
        this.f36075m = a(xmlPullParser, "price");
        this.f36076n = a(xmlPullParser, "pre-price");
        this.f36077o = a(xmlPullParser, "post-price");
        this.f36078p = a(xmlPullParser, "original-price");
    }

    @Override // com.flipp.sfml.SFTag
    protected void c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super.c(xmlPullParser);
        this.f36079q = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                if (!name.equals("url-source")) {
                    if (!name.equals("flyer-source")) {
                        f(xmlPullParser);
                    } else {
                        this.f36079q.add(new n(xmlPullParser));
                    }
                } else {
                    this.f36079q.add(new y(xmlPullParser, u()));
                }
            }
        }
    }
}
