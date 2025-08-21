package Ta;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class s extends r {

    /* renamed from: l, reason: collision with root package name */
    private int f36082l;

    public s(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this(xmlPullParser, "linear-layout");
    }

    public s(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        super(xmlPullParser, str);
    }

    void u(XmlPullParser xmlPullParser) {
        if ("horizontal".equalsIgnoreCase(a(xmlPullParser, "orientation"))) {
            this.f36082l = 0;
        } else {
            this.f36082l = 1;
        }
    }

    public int x() {
        return this.f36082l;
    }

    @Override // Ta.l, com.flipp.sfml.SFTag
    protected void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, NumberFormatException {
        super.b(xmlPullParser);
        u(xmlPullParser);
    }
}
