package Gc;

import Oc.C4447y;
import Oc.d2;
import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final int f11329a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11330b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11331c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f11332d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f11333e;

    /* renamed from: f, reason: collision with root package name */
    private int f11334f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f11335g;

    /* renamed from: h, reason: collision with root package name */
    private int f11336h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f11318i = new e(320, 50, "320x50_mb");

    /* renamed from: j, reason: collision with root package name */
    public static final e f11319j = new e(468, 60, "468x60_as");

    /* renamed from: k, reason: collision with root package name */
    public static final e f11320k = new e(320, 100, "320x100_as");

    /* renamed from: l, reason: collision with root package name */
    public static final e f11321l = new e(728, 90, "728x90_as");

    /* renamed from: m, reason: collision with root package name */
    public static final e f11322m = new e(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, 250, "300x250_as");

    /* renamed from: n, reason: collision with root package name */
    public static final e f11323n = new e(160, 600, "160x600_as");

    /* renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final e f11324o = new e(-1, -2, "smart_banner");

    /* renamed from: p, reason: collision with root package name */
    public static final e f11325p = new e(-3, -4, "fluid");

    /* renamed from: q, reason: collision with root package name */
    public static final e f11326q = new e(0, 0, "invalid");

    /* renamed from: s, reason: collision with root package name */
    public static final e f11328s = new e(50, 50, "50x50_mb");

    /* renamed from: r, reason: collision with root package name */
    public static final e f11327r = new e(-3, 0, "search_v2");

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
        return this.f11329a == eVar.f11329a && this.f11330b == eVar.f11330b && this.f11331c.equals(eVar.f11331c);
    }

    final void j(boolean z10) {
        this.f11333e = true;
    }

    final void k(boolean z10) {
        this.f11335g = true;
    }

    public int a() {
        return this.f11330b;
    }

    public int b(Context context) {
        int i10 = this.f11330b;
        if (i10 == -4 || i10 == -3) {
            return -1;
        }
        if (i10 == -2) {
            return d2.B(context.getResources().getDisplayMetrics());
        }
        C4447y.b();
        return Sc.g.z(context, i10);
    }

    public int c() {
        return this.f11329a;
    }

    public int d(Context context) {
        int i10 = this.f11329a;
        if (i10 == -3) {
            return -1;
        }
        if (i10 != -1) {
            C4447y.b();
            return Sc.g.z(context, i10);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<d2> creator = d2.CREATOR;
        return displayMetrics.widthPixels;
    }

    public boolean e() {
        return this.f11329a == -3 && this.f11330b == -4;
    }

    final int f() {
        return this.f11336h;
    }

    final int g() {
        return this.f11334f;
    }

    final void h(int i10) {
        this.f11334f = i10;
    }

    public int hashCode() {
        return this.f11331c.hashCode();
    }

    final void i(int i10) {
        this.f11336h = i10;
    }

    final boolean l() {
        return this.f11332d;
    }

    final boolean m() {
        return this.f11333e;
    }

    final boolean n() {
        return this.f11335g;
    }

    public String toString() {
        return this.f11331c;
    }

    e(int i10, int i11, String str) {
        if (i10 < 0 && i10 != -1 && i10 != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i10);
        }
        if (i11 < 0 && i11 != -2 && i11 != -4) {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i11);
        }
        this.f11329a = i10;
        this.f11330b = i11;
        this.f11331c = str;
    }
}
