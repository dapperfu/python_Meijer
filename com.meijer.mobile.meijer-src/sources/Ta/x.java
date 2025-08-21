package Ta;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class x extends l {

    /* renamed from: k, reason: collision with root package name */
    private String f36089k;

    public x(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser, "text");
    }

    public String u() {
        return this.f36089k;
    }

    @Override // com.flipp.sfml.SFTag
    protected void c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super.c(xmlPullParser);
        this.f36089k = e(xmlPullParser);
    }
}
