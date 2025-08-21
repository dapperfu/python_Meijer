package Ta;

import android.text.TextUtils;
import com.flipp.sfml.SFTag;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class z extends SFTag {

    /* renamed from: c, reason: collision with root package name */
    private String f36092c;

    /* renamed from: d, reason: collision with root package name */
    private String f36093d;

    /* renamed from: e, reason: collision with root package name */
    private String f36094e;

    /* renamed from: f, reason: collision with root package name */
    private o f36095f;

    /* renamed from: g, reason: collision with root package name */
    private k f36096g;

    public z(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser, "storefront");
    }

    public k g() {
        return this.f36096g;
    }

    @Override // com.flipp.sfml.SFTag
    protected void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super.b(xmlPullParser);
        String strA = a(xmlPullParser, "title");
        this.f36092c = strA;
        if (!TextUtils.isEmpty(strA)) {
            this.f36093d = a(xmlPullParser, "subtitle");
            String strA2 = a(xmlPullParser, "uuid");
            this.f36094e = strA2;
            if (!TextUtils.isEmpty(strA2)) {
                return;
            } else {
                throw new IllegalArgumentException("SFML must have a UUID");
            }
        }
        throw new IllegalArgumentException("SFML must have a title");
    }

    @Override // com.flipp.sfml.SFTag
    protected void c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super.c(xmlPullParser);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                if (!name.equals("body")) {
                    if (!name.equals("head")) {
                        f(xmlPullParser);
                    } else {
                        this.f36095f = new o(xmlPullParser);
                    }
                } else {
                    this.f36096g = new k(xmlPullParser);
                }
            }
        }
    }
}
