package Ra;

import android.graphics.RectF;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class n extends v {

    /* renamed from: j, reason: collision with root package name */
    private static final Comparator<? super w> f32065j = new a();

    /* renamed from: e, reason: collision with root package name */
    private String f32066e;

    /* renamed from: f, reason: collision with root package name */
    private double[] f32067f;

    /* renamed from: g, reason: collision with root package name */
    private List<w> f32068g;

    /* renamed from: h, reason: collision with root package name */
    private List<w> f32069h;

    /* renamed from: i, reason: collision with root package name */
    private RectF f32070i;

    static class a implements Comparator<w> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(w wVar, w wVar2) {
            RectF rectFK = wVar.k();
            RectF rectFK2 = wVar2.k();
            float f10 = rectFK.top;
            float f11 = rectFK2.top;
            if (f10 != f11) {
                return Float.compare(f10, f11);
            }
            return Float.compare(rectFK.left, rectFK2.left);
        }
    }

    public n(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser, "flyer-source");
    }

    private void g(XmlPullParser xmlPullParser) {
        String strA = a(xmlPullParser, "path");
        if (!TextUtils.isEmpty(strA)) {
            strA = "https://f.wishabi.net/" + strA;
        }
        this.f32066e = strA;
    }

    private void j(XmlPullParser xmlPullParser) {
        String strA = a(xmlPullParser, "resolutions");
        if (TextUtils.isEmpty(strA)) {
            this.f32067f = new double[0];
            return;
        }
        String[] strArrSplit = strA.split(" ");
        this.f32067f = new double[strArrSplit.length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            this.f32067f[i10] = Double.parseDouble(strArrSplit[i10]);
        }
    }

    public List<w> k() {
        return this.f32068g;
    }

    public float l() {
        return this.f32070i.height();
    }

    public String m() {
        return this.f32066e;
    }

    public RectF n() {
        return this.f32070i;
    }

    public double[] o() {
        return this.f32067f;
    }

    public List<w> p() {
        return this.f32069h;
    }

    public float q() {
        return this.f32070i.width();
    }

    @Override // Ra.v, com.flipp.sfml.SFTag
    protected void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super.b(xmlPullParser);
        j(xmlPullParser);
        g(xmlPullParser);
        this.f32070i = ((Sa.e) Qa.c.c(Sa.e.class)).g(d(xmlPullParser, "rect", true));
    }

    @Override // com.flipp.sfml.SFTag
    protected void c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super.c(xmlPullParser);
        this.f32068g = new ArrayList();
        this.f32069h = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                if (!name.equals("area")) {
                    f(xmlPullParser);
                } else {
                    w wVar = new w(xmlPullParser);
                    this.f32068g.add(wVar);
                    this.f32069h.add(wVar);
                }
            }
        }
    }
}
