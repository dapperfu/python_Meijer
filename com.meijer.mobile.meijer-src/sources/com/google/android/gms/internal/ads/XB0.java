package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class XB0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f72110a;

    /* renamed from: b, reason: collision with root package name */
    private int f72111b;

    /* renamed from: c, reason: collision with root package name */
    private long f72112c;

    /* renamed from: d, reason: collision with root package name */
    private C7578aF0 f72113d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f72114e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f72115f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ZB0 f72116g;

    public XB0(ZB0 zb0, String str, int i10, C7578aF0 c7578aF0) {
        this.f72116g = zb0;
        this.f72110a = str;
        this.f72111b = i10;
        this.f72112c = c7578aF0 == null ? -1L : c7578aF0.f73225d;
        if (c7578aF0 == null || !c7578aF0.b()) {
            return;
        }
        this.f72113d = c7578aF0;
    }

    public final boolean j(int i10, C7578aF0 c7578aF0) {
        if (c7578aF0 == null) {
            return i10 == this.f72111b;
        }
        C7578aF0 c7578aF02 = this.f72113d;
        return c7578aF02 == null ? !c7578aF0.b() && c7578aF0.f73225d == this.f72112c : c7578aF0.f73225d == c7578aF02.f73225d && c7578aF0.f73223b == c7578aF02.f73223b && c7578aF0.f73224c == c7578aF02.f73224c;
    }

    public final void g(int i10, C7578aF0 c7578aF0) {
        if (this.f72112c == -1 && i10 == this.f72111b && c7578aF0 != null) {
            ZB0 zb0 = this.f72116g;
            long j10 = c7578aF0.f73225d;
            if (j10 >= zb0.k()) {
                this.f72112c = j10;
            }
        }
    }

    public final boolean k(QA0 qa0) {
        C7578aF0 c7578aF0 = qa0.f70375d;
        if (c7578aF0 == null) {
            return this.f72111b != qa0.f70374c;
        }
        long j10 = this.f72112c;
        if (j10 == -1) {
            return false;
        }
        if (c7578aF0.f73225d > j10) {
            return true;
        }
        if (this.f72113d == null) {
            return false;
        }
        AbstractC7432Wl abstractC7432Wl = qa0.f70373b;
        int iA = abstractC7432Wl.a(c7578aF0.f73222a);
        int iA2 = abstractC7432Wl.a(this.f72113d.f73222a);
        C7578aF0 c7578aF02 = qa0.f70375d;
        if (c7578aF02.f73225d < this.f72113d.f73225d || iA < iA2) {
            return false;
        }
        if (iA > iA2) {
            return true;
        }
        if (!c7578aF02.b()) {
            int i10 = qa0.f70375d.f73226e;
            return i10 == -1 || i10 > this.f72113d.f73223b;
        }
        C7578aF0 c7578aF03 = qa0.f70375d;
        int i11 = c7578aF03.f73223b;
        int i12 = c7578aF03.f73224c;
        C7578aF0 c7578aF04 = this.f72113d;
        int i13 = c7578aF04.f73223b;
        if (i11 <= i13) {
            return i11 == i13 && i12 > c7578aF04.f73224c;
        }
        return true;
    }

    public final boolean l(AbstractC7432Wl abstractC7432Wl, AbstractC7432Wl abstractC7432Wl2) {
        int i10 = this.f72111b;
        if (i10 < abstractC7432Wl.c()) {
            abstractC7432Wl.e(i10, this.f72116g.f72935a, 0L);
            for (int i11 = this.f72116g.f72935a.f80698m; i11 <= this.f72116g.f72935a.f80699n; i11++) {
                int iA = abstractC7432Wl2.a(abstractC7432Wl.f(i11));
                if (iA != -1) {
                    i10 = abstractC7432Wl2.d(iA, this.f72116g.f72936b, false).f71990c;
                    break;
                }
            }
            i10 = -1;
        } else if (i10 >= abstractC7432Wl2.c()) {
            i10 = -1;
        }
        this.f72111b = i10;
        if (i10 == -1) {
            return false;
        }
        C7578aF0 c7578aF0 = this.f72113d;
        return c7578aF0 == null || abstractC7432Wl2.a(c7578aF0.f73222a) != -1;
    }
}
