package Ra;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class s extends r {

    /* renamed from: l, reason: collision with root package name */
    private int f32082l;

    public s(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this(xmlPullParser, "linear-layout");
    }

    public s(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        super(xmlPullParser, str);
    }

    void u(XmlPullParser xmlPullParser) {
        if ("horizontal".equalsIgnoreCase(a(xmlPullParser, "orientation"))) {
            this.f32082l = 0;
        } else {
            this.f32082l = 1;
        }
    }

    public int x() {
        return this.f32082l;
    }

    @Override // Ra.l, com.flipp.sfml.SFTag
    protected void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, NumberFormatException {
        super.b(xmlPullParser);
        u(xmlPullParser);
    }
}
