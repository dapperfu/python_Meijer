package Ta;

import android.graphics.RectF;
import android.text.TextUtils;
import com.flipp.sfml.SFTag;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class l extends SFTag {

    /* renamed from: c, reason: collision with root package name */
    private int f36057c;

    /* renamed from: d, reason: collision with root package name */
    private int f36058d;

    /* renamed from: e, reason: collision with root package name */
    private double f36059e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f36060f;

    /* renamed from: g, reason: collision with root package name */
    private int f36061g;

    /* renamed from: h, reason: collision with root package name */
    private RectF f36062h;

    /* renamed from: i, reason: collision with root package name */
    private RectF f36063i;

    /* renamed from: j, reason: collision with root package name */
    private Long f36064j;

    protected void r(XmlPullParser xmlPullParser) {
        this.f36064j = null;
        String strA = a(xmlPullParser, "anchor-id");
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        this.f36064j = Long.valueOf(Long.parseLong(strA));
    }

    void h(int i10) {
        this.f36057c = i10;
    }

    void i(int i10) {
        this.f36058d = i10;
    }

    public Long j() {
        return this.f36064j;
    }

    public double k() {
        return this.f36059e;
    }

    public int l() {
        return this.f36061g;
    }

    public int m() {
        return this.f36058d;
    }

    public RectF n() {
        return this.f36063i;
    }

    public RectF o() {
        return this.f36062h;
    }

    public int p() {
        return this.f36057c;
    }

    public boolean q() {
        return this.f36060f;
    }

    protected void s(XmlPullParser xmlPullParser) {
        this.f36057c = g(a(xmlPullParser, "width"));
        int iG = g(a(xmlPullParser, "height"));
        this.f36058d = iG;
        if (iG == -3 && this.f36057c == -3) {
            this.f36057c = -2;
        }
        this.f36059e = 1.0d;
        if (iG == -3 || this.f36057c == -3) {
            this.f36059e = Double.parseDouble(a(xmlPullParser, "aspect-ratio"));
        }
        this.f36060f = false;
        String strA = a(xmlPullParser, "flex-grow");
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        this.f36060f = true;
        this.f36061g = Integer.parseInt(strA);
    }

    protected void t(XmlPullParser xmlPullParser) throws NumberFormatException {
        Sa.e eVar = (Sa.e) Sa.c.c(Sa.e.class);
        RectF rectFD = d(xmlPullParser, "padding", false);
        this.f36062h = rectFD;
        if (rectFD != null) {
            rectFD.set(eVar.a(rectFD.left), eVar.a(this.f36062h.top), eVar.a(this.f36062h.right), eVar.a(this.f36062h.bottom));
        }
        RectF rectFD2 = d(xmlPullParser, "margin", false);
        this.f36063i = rectFD2;
        if (rectFD2 != null) {
            rectFD2.set(eVar.a(rectFD2.left), eVar.a(this.f36063i.top), eVar.a(this.f36063i.right), eVar.a(this.f36063i.bottom));
        }
    }

    public l(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        super(xmlPullParser, str);
    }

    private int g(String str) {
        if (TextUtils.isEmpty(str) || "match-parent".equalsIgnoreCase(str)) {
            return -1;
        }
        if ("wrap-content".equalsIgnoreCase(str)) {
            return -2;
        }
        if ("preserve-aspect".equalsIgnoreCase(str)) {
            return -3;
        }
        return ((Sa.e) Sa.c.c(Sa.e.class)).a(Float.parseFloat(str));
    }

    @Override // com.flipp.sfml.SFTag
    protected void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, NumberFormatException {
        super.b(xmlPullParser);
        s(xmlPullParser);
        t(xmlPullParser);
        r(xmlPullParser);
    }
}
