package Ra;

import android.text.TextUtils;
import com.flipp.sfml.SFTag;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class z extends SFTag {

    /* renamed from: c, reason: collision with root package name */
    private String f32092c;

    /* renamed from: d, reason: collision with root package name */
    private String f32093d;

    /* renamed from: e, reason: collision with root package name */
    private String f32094e;

    /* renamed from: f, reason: collision with root package name */
    private o f32095f;

    /* renamed from: g, reason: collision with root package name */
    private k f32096g;

    public z(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser, "storefront");
    }

    public k g() {
        return this.f32096g;
    }

    @Override // com.flipp.sfml.SFTag
    protected void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super.b(xmlPullParser);
        String strA = a(xmlPullParser, "title");
        this.f32092c = strA;
        if (!TextUtils.isEmpty(strA)) {
            this.f32093d = a(xmlPullParser, "subtitle");
            String strA2 = a(xmlPullParser, "uuid");
            this.f32094e = strA2;
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
                        this.f32095f = new o(xmlPullParser);
                    }
                } else {
                    this.f32096g = new k(xmlPullParser);
                }
            }
        }
    }
}
