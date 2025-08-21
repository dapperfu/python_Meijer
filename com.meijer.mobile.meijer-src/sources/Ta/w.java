package Ta;

import android.graphics.RectF;
import android.text.TextUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class w extends t {

    /* renamed from: c, reason: collision with root package name */
    private String f36085c;

    /* renamed from: d, reason: collision with root package name */
    private String f36086d;

    /* renamed from: e, reason: collision with root package name */
    private RectF f36087e;

    /* renamed from: f, reason: collision with root package name */
    private b f36088f;

    public w(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser, "area");
    }

    private void g(XmlPullParser xmlPullParser) {
        String strA = a(xmlPullParser, "href");
        if (!TextUtils.isEmpty(strA)) {
            this.f36085c = strA;
            return;
        }
        throw new IllegalArgumentException("Image source area has no click url [" + strA + "]");
    }

    private void h(XmlPullParser xmlPullParser) {
        this.f36086d = a(xmlPullParser, "label");
    }

    public b i() {
        return this.f36088f;
    }

    public String j() {
        return this.f36086d;
    }

    public RectF k() {
        return this.f36087e;
    }

    @Override // com.flipp.sfml.SFTag
    protected void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super.b(xmlPullParser);
        g(xmlPullParser);
        h(xmlPullParser);
        this.f36087e = ((Ua.e) Sa.c.c(Ua.e.class)).g(d(xmlPullParser, "rect", true));
        this.f36088f = new b(xmlPullParser);
    }

    @Override // com.flipp.sfml.SFTag
    protected void c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super.c(xmlPullParser);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                f(xmlPullParser);
            }
        }
    }
}
