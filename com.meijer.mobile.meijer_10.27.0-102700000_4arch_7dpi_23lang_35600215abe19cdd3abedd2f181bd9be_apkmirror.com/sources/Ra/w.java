package Ra;

import android.graphics.RectF;
import android.text.TextUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class w extends t {

    /* renamed from: c, reason: collision with root package name */
    private String f32085c;

    /* renamed from: d, reason: collision with root package name */
    private String f32086d;

    /* renamed from: e, reason: collision with root package name */
    private RectF f32087e;

    /* renamed from: f, reason: collision with root package name */
    private b f32088f;

    public w(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser, "area");
    }

    private void g(XmlPullParser xmlPullParser) {
        String strA = a(xmlPullParser, "href");
        if (!TextUtils.isEmpty(strA)) {
            this.f32085c = strA;
            return;
        }
        throw new IllegalArgumentException("Image source area has no click url [" + strA + "]");
    }

    private void h(XmlPullParser xmlPullParser) {
        this.f32086d = a(xmlPullParser, "label");
    }

    public b i() {
        return this.f32088f;
    }

    public String j() {
        return this.f32086d;
    }

    public RectF k() {
        return this.f32087e;
    }

    @Override // com.flipp.sfml.SFTag
    protected void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super.b(xmlPullParser);
        g(xmlPullParser);
        h(xmlPullParser);
        this.f32087e = ((Sa.e) Qa.c.c(Sa.e.class)).g(d(xmlPullParser, "rect", true));
        this.f32088f = new b(xmlPullParser);
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
