package Ra;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class q extends l {

    /* renamed from: k, reason: collision with root package name */
    private String f32073k;

    /* renamed from: l, reason: collision with root package name */
    private String f32074l;

    /* renamed from: m, reason: collision with root package name */
    private String f32075m;

    /* renamed from: n, reason: collision with root package name */
    private String f32076n;

    /* renamed from: o, reason: collision with root package name */
    private String f32077o;

    /* renamed from: p, reason: collision with root package name */
    private String f32078p;

    /* renamed from: q, reason: collision with root package name */
    private List<v> f32079q;

    /* renamed from: r, reason: collision with root package name */
    private b f32080r;

    public q(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser, "item-atom");
    }

    public List<v> A() {
        return this.f32079q;
    }

    public b u() {
        return this.f32080r;
    }

    public String v() {
        return this.f32073k;
    }

    public String w() {
        return this.f32077o;
    }

    public String x() {
        return this.f32076n;
    }

    public String y() {
        return this.f32075m;
    }

    public String z() {
        return this.f32074l;
    }

    @Override // Ra.l, com.flipp.sfml.SFTag
    protected void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, NumberFormatException {
        super.b(xmlPullParser);
        this.f32080r = new b(xmlPullParser);
        this.f32073k = a(xmlPullParser, "name");
        this.f32074l = a(xmlPullParser, "sales-story");
        this.f32075m = a(xmlPullParser, "price");
        this.f32076n = a(xmlPullParser, "pre-price");
        this.f32077o = a(xmlPullParser, "post-price");
        this.f32078p = a(xmlPullParser, "original-price");
    }

    @Override // com.flipp.sfml.SFTag
    protected void c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super.c(xmlPullParser);
        this.f32079q = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                if (!name.equals("url-source")) {
                    if (!name.equals("flyer-source")) {
                        f(xmlPullParser);
                    } else {
                        this.f32079q.add(new n(xmlPullParser));
                    }
                } else {
                    this.f32079q.add(new y(xmlPullParser, u()));
                }
            }
        }
    }
}
