package oe;

import ae.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import b2.C6187h;
import com.fullstory.FS;

/* renamed from: oe.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16027d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f153392a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f153393b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f153394c;

    /* renamed from: d, reason: collision with root package name */
    public final String f153395d;

    /* renamed from: e, reason: collision with root package name */
    public final int f153396e;

    /* renamed from: f, reason: collision with root package name */
    public final int f153397f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f153398g;

    /* renamed from: h, reason: collision with root package name */
    public final float f153399h;

    /* renamed from: i, reason: collision with root package name */
    public final float f153400i;

    /* renamed from: j, reason: collision with root package name */
    public final float f153401j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f153402k;

    /* renamed from: l, reason: collision with root package name */
    public final float f153403l;

    /* renamed from: m, reason: collision with root package name */
    private ColorStateList f153404m;

    /* renamed from: n, reason: collision with root package name */
    private float f153405n;

    /* renamed from: o, reason: collision with root package name */
    private final int f153406o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f153407p = false;

    /* renamed from: q, reason: collision with root package name */
    private Typeface f153408q;

    /* renamed from: oe.d$a */
    class a extends C6187h.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC16029f f153409a;

        a(AbstractC16029f abstractC16029f) {
            this.f153409a = abstractC16029f;
        }

        @Override // b2.C6187h.e
        public void f(int i10) {
            C16027d.this.f153407p = true;
            this.f153409a.a(i10);
        }

        @Override // b2.C6187h.e
        public void g(Typeface typeface) {
            C16027d c16027d = C16027d.this;
            c16027d.f153408q = FS.typefaceCreateDerived(typeface, c16027d.f153396e);
            C16027d.this.f153407p = true;
            this.f153409a.b(C16027d.this.f153408q, false);
        }
    }

    /* renamed from: oe.d$b */
    class b extends AbstractC16029f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f153411a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextPaint f153412b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC16029f f153413c;

        b(Context context, TextPaint textPaint, AbstractC16029f abstractC16029f) {
            this.f153411a = context;
            this.f153412b = textPaint;
            this.f153413c = abstractC16029f;
        }

        @Override // oe.AbstractC16029f
        public void a(int i10) {
            this.f153413c.a(i10);
        }

        @Override // oe.AbstractC16029f
        public void b(Typeface typeface, boolean z10) {
            C16027d.this.p(this.f153411a, this.f153412b, typeface);
            this.f153413c.b(typeface, z10);
        }
    }

    private void d() {
        String str;
        if (this.f153408q == null && (str = this.f153395d) != null) {
            this.f153408q = Typeface.create(str, this.f153396e);
        }
        if (this.f153408q == null) {
            int i10 = this.f153397f;
            if (i10 == 1) {
                this.f153408q = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f153408q = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f153408q = Typeface.DEFAULT;
            } else {
                this.f153408q = Typeface.MONOSPACE;
            }
            this.f153408q = FS.typefaceCreateDerived(this.f153408q, this.f153396e);
        }
    }

    public Typeface f(Context context) {
        if (this.f153407p) {
            return this.f153408q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceH = C6187h.h(context, this.f153406o);
                this.f153408q = typefaceH;
                if (typefaceH != null) {
                    this.f153408q = FS.typefaceCreateDerived(typefaceH, this.f153396e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                FS.log_d("TextAppearance", "Error loading font " + this.f153395d, e10);
            }
        }
        d();
        this.f153407p = true;
        return this.f153408q;
    }

    public ColorStateList i() {
        return this.f153404m;
    }

    public float j() {
        return this.f153405n;
    }

    public void k(ColorStateList colorStateList) {
        this.f153404m = colorStateList;
    }

    public void l(float f10) {
        this.f153405n = f10;
    }

    public C16027d(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, l.f44904H8);
        l(typedArrayObtainStyledAttributes.getDimension(l.f44916I8, 0.0f));
        k(C16026c.a(context, typedArrayObtainStyledAttributes, l.f44952L8));
        this.f153392a = C16026c.a(context, typedArrayObtainStyledAttributes, l.f44964M8);
        this.f153393b = C16026c.a(context, typedArrayObtainStyledAttributes, l.f44976N8);
        this.f153396e = typedArrayObtainStyledAttributes.getInt(l.f44940K8, 0);
        this.f153397f = typedArrayObtainStyledAttributes.getInt(l.f44928J8, 1);
        int iF = C16026c.f(typedArrayObtainStyledAttributes, l.f45043T8, l.f45032S8);
        this.f153406o = typedArrayObtainStyledAttributes.getResourceId(iF, 0);
        this.f153395d = typedArrayObtainStyledAttributes.getString(iF);
        this.f153398g = typedArrayObtainStyledAttributes.getBoolean(l.f45054U8, false);
        this.f153394c = C16026c.a(context, typedArrayObtainStyledAttributes, l.f44988O8);
        this.f153399h = typedArrayObtainStyledAttributes.getFloat(l.f44999P8, 0.0f);
        this.f153400i = typedArrayObtainStyledAttributes.getFloat(l.f45010Q8, 0.0f);
        this.f153401j = typedArrayObtainStyledAttributes.getFloat(l.f45021R8, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, l.f45141c5);
        this.f153402k = typedArrayObtainStyledAttributes2.hasValue(l.f45153d5);
        this.f153403l = typedArrayObtainStyledAttributes2.getFloat(l.f45153d5, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private boolean m(Context context) throws Resources.NotFoundException {
        Typeface typefaceC;
        if (C16028e.a()) {
            return true;
        }
        int i10 = this.f153406o;
        if (i10 != 0) {
            typefaceC = C6187h.c(context, i10);
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
        return this.f153408q;
    }

    public void g(Context context, TextPaint textPaint, AbstractC16029f abstractC16029f) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, abstractC16029f));
    }

    public void h(Context context, AbstractC16029f abstractC16029f) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i10 = this.f153406o;
        if (i10 == 0) {
            this.f153407p = true;
        }
        if (this.f153407p) {
            abstractC16029f.b(this.f153408q, true);
            return;
        }
        try {
            C6187h.j(context, i10, new a(abstractC16029f), null);
        } catch (Resources.NotFoundException unused) {
            this.f153407p = true;
            abstractC16029f.a(1);
        } catch (Exception e10) {
            FS.log_d("TextAppearance", "Error loading font " + this.f153395d, e10);
            this.f153407p = true;
            abstractC16029f.a(-3);
        }
    }

    public void n(Context context, TextPaint textPaint, AbstractC16029f abstractC16029f) {
        int colorForState;
        int colorForState2;
        o(context, textPaint, abstractC16029f);
        ColorStateList colorStateList = this.f153404m;
        if (colorStateList != null) {
            colorForState = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            colorForState = -16777216;
        }
        textPaint.setColor(colorForState);
        float f10 = this.f153401j;
        float f11 = this.f153399h;
        float f12 = this.f153400i;
        ColorStateList colorStateList2 = this.f153394c;
        if (colorStateList2 != null) {
            colorForState2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            colorForState2 = 0;
        }
        textPaint.setShadowLayer(f10, f11, f12, colorForState2);
    }

    public void o(Context context, TextPaint textPaint, AbstractC16029f abstractC16029f) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, abstractC16029f);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z10;
        float f10;
        Typeface typefaceA = C16031h.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f153396e & (~typeface.getStyle());
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
        textPaint.setTextSize(this.f153405n);
        if (this.f153402k) {
            textPaint.setLetterSpacing(this.f153403l);
        }
    }
}
