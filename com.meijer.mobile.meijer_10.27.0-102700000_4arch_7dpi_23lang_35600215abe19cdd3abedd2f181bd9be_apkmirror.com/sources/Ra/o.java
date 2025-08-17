package Ra;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class o extends t {

    /* renamed from: c, reason: collision with root package name */
    private A f32071c;

    public o(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser, "head");
    }

    @Override // com.flipp.sfml.SFTag
    protected void c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super.c(xmlPullParser);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                if (!name.equals("wayfinder")) {
                    f(xmlPullParser);
                } else {
                    this.f32071c = new A(xmlPullParser);
                }
            }
        }
    }
}
