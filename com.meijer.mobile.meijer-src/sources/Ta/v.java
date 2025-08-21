package Ta;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public abstract class v extends t {

    /* renamed from: c, reason: collision with root package name */
    private float f36083c;

    /* renamed from: d, reason: collision with root package name */
    private float f36084d;

    private void g(XmlPullParser xmlPullParser) {
        String strA = a(xmlPullParser, "width");
        String strA2 = a(xmlPullParser, "height");
        this.f36083c = Float.parseFloat(strA);
        this.f36084d = Float.parseFloat(strA2);
    }

    public float h() {
        return this.f36084d;
    }

    public float i() {
        return this.f36083c;
    }

    public v(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        super(xmlPullParser, str);
    }

    @Override // com.flipp.sfml.SFTag
    protected void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super.b(xmlPullParser);
        g(xmlPullParser);
    }
}
