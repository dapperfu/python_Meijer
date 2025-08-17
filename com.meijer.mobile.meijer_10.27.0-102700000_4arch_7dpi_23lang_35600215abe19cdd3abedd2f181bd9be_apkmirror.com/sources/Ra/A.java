package Ra;

import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class A extends t {

    /* renamed from: c, reason: collision with root package name */
    private List<a> f31965c;

    public static class a extends t {

        /* renamed from: c, reason: collision with root package name */
        private String f31966c;

        /* renamed from: d, reason: collision with root package name */
        private Long f31967d;

        public a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            super(xmlPullParser, "category");
        }

        private void g(XmlPullParser xmlPullParser) {
            String strA = a(xmlPullParser, "anchor-id");
            if (TextUtils.isEmpty(strA)) {
                this.f31967d = null;
            } else {
                this.f31967d = Long.valueOf(Long.parseLong(strA));
            }
        }

        private void h(XmlPullParser xmlPullParser) {
            this.f31966c = a(xmlPullParser, "name");
        }

        public Long i() {
            return this.f31967d;
        }

        public String j() {
            return this.f31966c;
        }

        @Override // com.flipp.sfml.SFTag
        protected void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            super.b(xmlPullParser);
            h(xmlPullParser);
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

    public A(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser, "wayfinder");
    }

    @Override // com.flipp.sfml.SFTag
    protected void c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super.c(xmlPullParser);
        this.f31965c = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                if (!name.equals("category")) {
                    f(xmlPullParser);
                } else {
                    this.f31965c.add(new a(xmlPullParser));
                }
            }
        }
    }
}
