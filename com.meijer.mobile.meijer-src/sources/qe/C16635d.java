package qe;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import b2.C6327h;
import ce.l;
import com.fullstory.FS;

/* renamed from: qe.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16635d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f158244a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f158245b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f158246c;

    /* renamed from: d, reason: collision with root package name */
    public final String f158247d;

    /* renamed from: e, reason: collision with root package name */
    public final int f158248e;

    /* renamed from: f, reason: collision with root package name */
    public final int f158249f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f158250g;

    /* renamed from: h, reason: collision with root package name */
    public final float f158251h;

    /* renamed from: i, reason: collision with root package name */
    public final float f158252i;

    /* renamed from: j, reason: collision with root package name */
    public final float f158253j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f158254k;

    /* renamed from: l, reason: collision with root package name */
    public final float f158255l;

    /* renamed from: m, reason: collision with root package name */
    private ColorStateList f158256m;

    /* renamed from: n, reason: collision with root package name */
    private float f158257n;

    /* renamed from: o, reason: collision with root package name */
    private final int f158258o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f158259p = false;

    /* renamed from: q, reason: collision with root package name */
    private Typeface f158260q;

    /* renamed from: qe.d$a */
    class a extends C6327h.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC16637f f158261a;

        a(AbstractC16637f abstractC16637f) {
            this.f158261a = abstractC16637f;
        }

        @Override // b2.C6327h.e
        public void f(int i10) {
            C16635d.this.f158259p = true;
            this.f158261a.a(i10);
        }

        @Override // b2.C6327h.e
        public void g(Typeface typeface) {
            C16635d c16635d = C16635d.this;
            c16635d.f158260q = FS.typefaceCreateDerived(typeface, c16635d.f158248e);
            C16635d.this.f158259p = true;
            this.f158261a.b(C16635d.this.f158260q, false);
        }
    }

    /* renamed from: qe.d$b */
    class b extends AbstractC16637f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f158263a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextPaint f158264b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC16637f f158265c;

        b(Context context, TextPaint textPaint, AbstractC16637f abstractC16637f) {
            this.f158263a = context;
            this.f158264b = textPaint;
            this.f158265c = abstractC16637f;
        }

        @Override // qe.AbstractC16637f
        public void a(int i10) {
            this.f158265c.a(i10);
        }

        @Override // qe.AbstractC16637f
        public void b(Typeface typeface, boolean z10) {
            C16635d.this.p(this.f158263a, this.f158264b, typeface);
            this.f158265c.b(typeface, z10);
        }
    }

    private void d() {
        String str;
        if (this.f158260q == null && (str = this.f158247d) != null) {
            this.f158260q = Typeface.create(str, this.f158248e);
        }
        if (this.f158260q == null) {
            int i10 = this.f158249f;
            if (i10 == 1) {
                this.f158260q = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f158260q = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f158260q = Typeface.DEFAULT;
            } else {
                this.f158260q = Typeface.MONOSPACE;
            }
            this.f158260q = FS.typefaceCreateDerived(this.f158260q, this.f158248e);
        }
    }

    public Typeface f(Context context) {
        if (this.f158259p) {
            return this.f158260q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceH = C6327h.h(context, this.f158258o);
                this.f158260q = typefaceH;
                if (typefaceH != null) {
                    this.f158260q = FS.typefaceCreateDerived(typefaceH, this.f158248e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                FS.log_d("TextAppearance", "Error loading font " + this.f158247d, e10);
            }
        }
        d();
        this.f158259p = true;
        return this.f158260q;
    }

    public ColorStateList i() {
        return this.f158256m;
    }

    public float j() {
        return this.f158257n;
    }

    public void k(ColorStateList colorStateList) {
        this.f158256m = colorStateList;
    }

    public void l(float f10) {
        this.f158257n = f10;
    }

    public C16635d(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, l.f61919H8);
        l(typedArrayObtainStyledAttributes.getDimension(l.f61931I8, 0.0f));
        k(C16634c.a(context, typedArrayObtainStyledAttributes, l.f61967L8));
        this.f158244a = C16634c.a(context, typedArrayObtainStyledAttributes, l.f61979M8);
        this.f158245b = C16634c.a(context, typedArrayObtainStyledAttributes, l.f61991N8);
        this.f158248e = typedArrayObtainStyledAttributes.getInt(l.f61955K8, 0);
        this.f158249f = typedArrayObtainStyledAttributes.getInt(l.f61943J8, 1);
        int iF = C16634c.f(typedArrayObtainStyledAttributes, l.f62058T8, l.f62047S8);
        this.f158258o = typedArrayObtainStyledAttributes.getResourceId(iF, 0);
        this.f158247d = typedArrayObtainStyledAttributes.getString(iF);
        this.f158250g = typedArrayObtainStyledAttributes.getBoolean(l.f62069U8, false);
        this.f158246c = C16634c.a(context, typedArrayObtainStyledAttributes, l.f62003O8);
        this.f158251h = typedArrayObtainStyledAttributes.getFloat(l.f62014P8, 0.0f);
        this.f158252i = typedArrayObtainStyledAttributes.getFloat(l.f62025Q8, 0.0f);
        this.f158253j = typedArrayObtainStyledAttributes.getFloat(l.f62036R8, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, l.f62156c5);
        this.f158254k = typedArrayObtainStyledAttributes2.hasValue(l.f62168d5);
        this.f158255l = typedArrayObtainStyledAttributes2.getFloat(l.f62168d5, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private boolean m(Context context) throws Resources.NotFoundException {
        Typeface typefaceC;
        if (C16636e.a()) {
            return true;
        }
        int i10 = this.f158258o;
        if (i10 != 0) {
            typefaceC = C6327h.c(context, i10);
        } else {
            typefaceC = null;
        }
        if (typefaceC != null) {
            return true;
        }
        return false;
    }

    public Typeface e() {
        d();
        return this.f158260q;
    }

    public void g(Context context, TextPaint textPaint, AbstractC16637f abstractC16637f) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, abstractC16637f));
    }

    public void h(Context context, AbstractC16637f abstractC16637f) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i10 = this.f158258o;
        if (i10 == 0) {
            this.f158259p = true;
        }
        if (this.f158259p) {
            abstractC16637f.b(this.f158260q, true);
            return;
        }
        try {
            C6327h.j(context, i10, new a(abstractC16637f), null);
        } catch (Resources.NotFoundException unused) {
            this.f158259p = true;
            abstractC16637f.a(1);
        } catch (Exception e10) {
            FS.log_d("TextAppearance", "Error loading font " + this.f158247d, e10);
            this.f158259p = true;
            abstractC16637f.a(-3);
        }
    }

    public void n(Context context, TextPaint textPaint, AbstractC16637f abstractC16637f) {
        int colorForState;
        int colorForState2;
        o(context, textPaint, abstractC16637f);
        ColorStateList colorStateList = this.f158256m;
        if (colorStateList != null) {
            colorForState = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            colorForState = -16777216;
        }
        textPaint.setColor(colorForState);
        float f10 = this.f158253j;
        float f11 = this.f158251h;
        float f12 = this.f158252i;
        ColorStateList colorStateList2 = this.f158246c;
        if (colorStateList2 != null) {
            colorForState2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            colorForState2 = 0;
        }
        textPaint.setShadowLayer(f10, f11, f12, colorForState2);
    }

    public void o(Context context, TextPaint textPaint, AbstractC16637f abstractC16637f) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, abstractC16637f);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z10;
        float f10;
        Typeface typefaceA = C16639h.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f158248e & (~typeface.getStyle());
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setFakeBoldText(z10);
        if ((i10 & 2) != 0) {
            f10 = -0.25f;
        } else {
            f10 = 0.0f;
        }
        textPaint.setTextSkewX(f10);
        textPaint.setTextSize(this.f158257n);
        if (this.f158254k) {
            textPaint.setLetterSpacing(this.f158255l);
        }
    }
}
