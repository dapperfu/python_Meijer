package Ra;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class p extends l {

    /* renamed from: k, reason: collision with root package name */
    private List<v> f32072k;

    public p(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser, "image");
    }

    public List<v> u() {
        return this.f32072k;
    }

    @Override // com.flipp.sfml.SFTag
    protected void c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super.c(xmlPullParser);
        this.f32072k = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                if (!name.equals("url-source")) {
                    if (!name.equals("flyer-source")) {
                        f(xmlPullParser);
                    } else {
                        this.f32072k.add(new n(xmlPullParser));
                    }
                } else {
                    this.f32072k.add(new y(xmlPullParser, new b(-1L, c.FLYER, -1L, null)));
                }
            }
        }
    }
}
