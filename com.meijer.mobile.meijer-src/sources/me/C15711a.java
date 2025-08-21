package me;

import android.content.Context;
import android.graphics.Color;
import c2.c;
import ce.C6503b;
import com.medallia.digital.mobilesdk.l3;
import ke.C15121a;
import qe.C16633b;

/* renamed from: me.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15711a {

    /* renamed from: f, reason: collision with root package name */
    private static final int f150990f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f150991a;

    /* renamed from: b, reason: collision with root package name */
    private final int f150992b;

    /* renamed from: c, reason: collision with root package name */
    private final int f150993c;

    /* renamed from: d, reason: collision with root package name */
    private final int f150994d;

    /* renamed from: e, reason: collision with root package name */
    private final float f150995e;

    public C15711a(Context context) {
        this(C16633b.b(context, C6503b.f61562x, false), C15121a.b(context, C6503b.f61561w, 0), C15121a.b(context, C6503b.f61560v, 0), C15121a.b(context, C6503b.f61556s, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean f(int i10) {
        return c.k(i10, l3.f93323c) == this.f150994d;
    }

    public float a(float f10) {
        if (this.f150995e <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int c(int i10, float f10) {
        return (this.f150991a && f(i10)) ? b(i10, f10) : i10;
    }

    public int d(float f10) {
        return c(this.f150994d, f10);
    }

    public boolean e() {
        return this.f150991a;
    }

    public int b(int i10, float f10) {
        int i11;
        float fA = a(f10);
        int iAlpha = Color.alpha(i10);
        int iJ = C15121a.j(c.k(i10, l3.f93323c), this.f150992b, fA);
        if (fA > 0.0f && (i11 = this.f150993c) != 0) {
            iJ = C15121a.i(iJ, c.k(i11, f150990f));
        }
        return c.k(iJ, iAlpha);
    }

    public C15711a(boolean z10, int i10, int i11, int i12, float f10) {
        this.f150991a = z10;
        this.f150992b = i10;
        this.f150993c = i11;
        this.f150994d = i12;
        this.f150995e = f10;
    }
}
