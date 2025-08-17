package Ec;

import Mc.C4169y;
import Mc.d2;
import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final int f7777a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7778b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7779c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7780d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7781e;

    /* renamed from: f, reason: collision with root package name */
    private int f7782f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7783g;

    /* renamed from: h, reason: collision with root package name */
    private int f7784h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f7766i = new e(320, 50, "320x50_mb");

    /* renamed from: j, reason: collision with root package name */
    public static final e f7767j = new e(468, 60, "468x60_as");

    /* renamed from: k, reason: collision with root package name */
    public static final e f7768k = new e(320, 100, "320x100_as");

    /* renamed from: l, reason: collision with root package name */
    public static final e f7769l = new e(728, 90, "728x90_as");

    /* renamed from: m, reason: collision with root package name */
    public static final e f7770m = new e(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, 250, "300x250_as");

    /* renamed from: n, reason: collision with root package name */
    public static final e f7771n = new e(160, 600, "160x600_as");

    /* renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final e f7772o = new e(-1, -2, "smart_banner");

    /* renamed from: p, reason: collision with root package name */
    public static final e f7773p = new e(-3, -4, "fluid");

    /* renamed from: q, reason: collision with root package name */
    public static final e f7774q = new e(0, 0, "invalid");

    /* renamed from: s, reason: collision with root package name */
    public static final e f7776s = new e(50, 50, "50x50_mb");

    /* renamed from: r, reason: collision with root package name */
    public static final e f7775r = new e(-3, 0, "search_v2");

    public e(int i10, int i11) {
        this(i10, i11, (i10 == -1 ? "FULL" : String.valueOf(i10)) + "x" + (i11 == -2 ? "AUTO" : String.valueOf(i11)) + "_as");
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f7777a == eVar.f7777a && this.f7778b == eVar.f7778b && this.f7779c.equals(eVar.f7779c);
    }

    final void j(boolean z10) {
        this.f7781e = true;
    }

    final void k(boolean z10) {
        this.f7783g = true;
    }

    public int a() {
        return this.f7778b;
    }

    public int b(Context context) {
        int i10 = this.f7778b;
        if (i10 == -4 || i10 == -3) {
            return -1;
        }
        if (i10 == -2) {
            return d2.B(context.getResources().getDisplayMetrics());
        }
        C4169y.b();
        return Qc.g.z(context, i10);
    }

    public int c() {
        return this.f7777a;
    }

    public int d(Context context) {
        int i10 = this.f7777a;
        if (i10 == -3) {
            return -1;
        }
        if (i10 != -1) {
            C4169y.b();
            return Qc.g.z(context, i10);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<d2> creator = d2.CREATOR;
        return displayMetrics.widthPixels;
    }

    public boolean e() {
        return this.f7777a == -3 && this.f7778b == -4;
    }

    final int f() {
        return this.f7784h;
    }

    final int g() {
        return this.f7782f;
    }

    final void h(int i10) {
        this.f7782f = i10;
    }

    public int hashCode() {
        return this.f7779c.hashCode();
    }

    final void i(int i10) {
        this.f7784h = i10;
    }

    final boolean l() {
        return this.f7780d;
    }

    final boolean m() {
        return this.f7781e;
    }

    final boolean n() {
        return this.f7783g;
    }

    public String toString() {
        return this.f7779c;
    }

    e(int i10, int i11, String str) {
        if (i10 < 0 && i10 != -1 && i10 != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i10);
        }
        if (i11 < 0 && i11 != -2 && i11 != -4) {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i11);
        }
        this.f7777a = i10;
        this.f7778b = i11;
        this.f7779c = str;
    }
}
