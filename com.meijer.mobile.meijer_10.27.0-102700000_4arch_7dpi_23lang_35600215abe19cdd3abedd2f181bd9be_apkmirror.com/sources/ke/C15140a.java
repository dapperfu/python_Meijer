package ke;

import ae.C5597b;
import android.content.Context;
import android.graphics.Color;
import c2.c;
import com.medallia.digital.mobilesdk.l3;
import ie.C14718a;
import oe.C16025b;

/* renamed from: ke.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15140a {

    /* renamed from: f, reason: collision with root package name */
    private static final int f141844f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f141845a;

    /* renamed from: b, reason: collision with root package name */
    private final int f141846b;

    /* renamed from: c, reason: collision with root package name */
    private final int f141847c;

    /* renamed from: d, reason: collision with root package name */
    private final int f141848d;

    /* renamed from: e, reason: collision with root package name */
    private final float f141849e;

    public C15140a(Context context) {
        this(C16025b.b(context, C5597b.f44547x, false), C14718a.b(context, C5597b.f44546w, 0), C14718a.b(context, C5597b.f44545v, 0), C14718a.b(context, C5597b.f44541s, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean f(int i10) {
        return c.k(i10, l3.f92484c) == this.f141848d;
    }

    public float a(float f10) {
        if (this.f141849e <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int c(int i10, float f10) {
        return (this.f141845a && f(i10)) ? b(i10, f10) : i10;
    }

    public int d(float f10) {
        return c(this.f141848d, f10);
    }

    public boolean e() {
        return this.f141845a;
    }

    public int b(int i10, float f10) {
        int i11;
        float fA = a(f10);
        int iAlpha = Color.alpha(i10);
        int iJ = C14718a.j(c.k(i10, l3.f92484c), this.f141846b, fA);
        if (fA > 0.0f && (i11 = this.f141847c) != 0) {
            iJ = C14718a.i(iJ, c.k(i11, f141844f));
        }
        return c.k(iJ, iAlpha);
    }

    public C15140a(boolean z10, int i10, int i11, int i12, float f10) {
        this.f141845a = z10;
        this.f141846b = i10;
        this.f141847c = i11;
        this.f141848d = i12;
        this.f141849e = f10;
    }
}
