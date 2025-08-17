package Ra;

import android.text.TextUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class y extends v {

    /* renamed from: e, reason: collision with root package name */
    private String f32090e;

    /* renamed from: f, reason: collision with root package name */
    private b f32091f;

    public y(XmlPullParser xmlPullParser, b bVar) throws XmlPullParserException, IOException {
        super(xmlPullParser, "url-source");
        this.f32091f = bVar == null ? new b(-1L, c.FLYER, -1L, null) : bVar;
    }

    private void g(XmlPullParser xmlPullParser) {
        String strA = a(xmlPullParser, "url");
        this.f32090e = strA;
        if (TextUtils.isEmpty(strA)) {
            throw new IllegalArgumentException("url-source must have a url");
        }
    }

    public b j() {
        return this.f32091f;
    }

    public String k() {
        return this.f32090e;
    }

    @Override // Ra.v, com.flipp.sfml.SFTag
    protected void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super.b(xmlPullParser);
        g(xmlPullParser);
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
