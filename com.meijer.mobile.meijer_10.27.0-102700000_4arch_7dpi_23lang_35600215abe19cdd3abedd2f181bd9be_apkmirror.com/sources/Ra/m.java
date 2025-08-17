package Ra;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class m extends s {
    public m(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this(xmlPullParser, "flexbox");
    }

    public m(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        super(xmlPullParser, str);
    }

    @Override // Ra.s, Ra.l, com.flipp.sfml.SFTag
    protected void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, NumberFormatException {
        super.b(xmlPullParser);
        u(xmlPullParser);
        if (x() == 0 && p() == -2) {
            throw new IllegalArgumentException("Horizontal flex views cant be wrap-content");
        }
        if (x() == 1 && m() == -2) {
            throw new IllegalArgumentException("Vertical flex views cant be wrap-content");
        }
    }

    @Override // Ra.r, com.flipp.sfml.SFTag
    protected void c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super.c(xmlPullParser);
        for (l lVar : v()) {
            if (lVar.q()) {
                y(lVar);
            }
        }
    }

    protected void y(l lVar) {
        if (x() == 0) {
            lVar.h(0);
        } else {
            lVar.i(0);
        }
    }
}
