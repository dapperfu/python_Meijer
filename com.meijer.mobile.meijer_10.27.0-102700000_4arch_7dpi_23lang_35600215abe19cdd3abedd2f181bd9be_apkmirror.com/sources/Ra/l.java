package Ra;

import android.graphics.RectF;
import android.text.TextUtils;
import com.flipp.sfml.SFTag;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class l extends SFTag {

    /* renamed from: c, reason: collision with root package name */
    private int f32057c;

    /* renamed from: d, reason: collision with root package name */
    private int f32058d;

    /* renamed from: e, reason: collision with root package name */
    private double f32059e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f32060f;

    /* renamed from: g, reason: collision with root package name */
    private int f32061g;

    /* renamed from: h, reason: collision with root package name */
    private RectF f32062h;

    /* renamed from: i, reason: collision with root package name */
    private RectF f32063i;

    /* renamed from: j, reason: collision with root package name */
    private Long f32064j;

    protected void r(XmlPullParser xmlPullParser) {
        this.f32064j = null;
        String strA = a(xmlPullParser, "anchor-id");
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        this.f32064j = Long.valueOf(Long.parseLong(strA));
    }

    void h(int i10) {
        this.f32057c = i10;
    }

    void i(int i10) {
        this.f32058d = i10;
    }

    public Long j() {
        return this.f32064j;
    }

    public double k() {
        return this.f32059e;
    }

    public int l() {
        return this.f32061g;
    }

    public int m() {
        return this.f32058d;
    }

    public RectF n() {
        return this.f32063i;
    }

    public RectF o() {
        return this.f32062h;
    }

    public int p() {
        return this.f32057c;
    }

    public boolean q() {
        return this.f32060f;
    }

    protected void s(XmlPullParser xmlPullParser) {
        this.f32057c = g(a(xmlPullParser, "width"));
        int iG = g(a(xmlPullParser, "height"));
        this.f32058d = iG;
        if (iG == -3 && this.f32057c == -3) {
            this.f32057c = -2;
        }
        this.f32059e = 1.0d;
        if (iG == -3 || this.f32057c == -3) {
            this.f32059e = Double.parseDouble(a(xmlPullParser, "aspect-ratio"));
        }
        this.f32060f = false;
        String strA = a(xmlPullParser, "flex-grow");
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        this.f32060f = true;
        this.f32061g = Integer.parseInt(strA);
    }

    protected void t(XmlPullParser xmlPullParser) throws NumberFormatException {
        Qa.e eVar = (Qa.e) Qa.c.c(Qa.e.class);
        RectF rectFD = d(xmlPullParser, "padding", false);
        this.f32062h = rectFD;
        if (rectFD != null) {
            rectFD.set(eVar.a(rectFD.left), eVar.a(this.f32062h.top), eVar.a(this.f32062h.right), eVar.a(this.f32062h.bottom));
        }
        RectF rectFD2 = d(xmlPullParser, "margin", false);
        this.f32063i = rectFD2;
        if (rectFD2 != null) {
            rectFD2.set(eVar.a(rectFD2.left), eVar.a(this.f32063i.top), eVar.a(this.f32063i.right), eVar.a(this.f32063i.bottom));
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
        return ((Qa.e) Qa.c.c(Qa.e.class)).a(Float.parseFloat(str));
    }

    @Override // com.flipp.sfml.SFTag
    protected void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, NumberFormatException {
        super.b(xmlPullParser);
        s(xmlPullParser);
        t(xmlPullParser);
        r(xmlPullParser);
    }
}
