package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class XB0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f71270a;

    /* renamed from: b, reason: collision with root package name */
    private int f71271b;

    /* renamed from: c, reason: collision with root package name */
    private long f71272c;

    /* renamed from: d, reason: collision with root package name */
    private C7453aF0 f71273d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f71274e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f71275f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ZB0 f71276g;

    public XB0(ZB0 zb0, String str, int i10, C7453aF0 c7453aF0) {
        this.f71276g = zb0;
        this.f71270a = str;
        this.f71271b = i10;
        this.f71272c = c7453aF0 == null ? -1L : c7453aF0.f72385d;
        if (c7453aF0 == null || !c7453aF0.b()) {
            return;
        }
        this.f71273d = c7453aF0;
    }

    public final boolean j(int i10, C7453aF0 c7453aF0) {
        if (c7453aF0 == null) {
            return i10 == this.f71271b;
        }
        C7453aF0 c7453aF02 = this.f71273d;
        return c7453aF02 == null ? !c7453aF0.b() && c7453aF0.f72385d == this.f71272c : c7453aF0.f72385d == c7453aF02.f72385d && c7453aF0.f72383b == c7453aF02.f72383b && c7453aF0.f72384c == c7453aF02.f72384c;
    }

    public final void g(int i10, C7453aF0 c7453aF0) {
        if (this.f71272c == -1 && i10 == this.f71271b && c7453aF0 != null) {
            ZB0 zb0 = this.f71276g;
            long j10 = c7453aF0.f72385d;
            if (j10 >= zb0.k()) {
                this.f71272c = j10;
            }
        }
    }

    public final boolean k(QA0 qa0) {
        C7453aF0 c7453aF0 = qa0.f69535d;
        if (c7453aF0 == null) {
            return this.f71271b != qa0.f69534c;
        }
        long j10 = this.f71272c;
        if (j10 == -1) {
            return false;
        }
        if (c7453aF0.f72385d > j10) {
            return true;
        }
        if (this.f71273d == null) {
            return false;
        }
        AbstractC7307Wl abstractC7307Wl = qa0.f69533b;
        int iA = abstractC7307Wl.a(c7453aF0.f72382a);
        int iA2 = abstractC7307Wl.a(this.f71273d.f72382a);
        C7453aF0 c7453aF02 = qa0.f69535d;
        if (c7453aF02.f72385d < this.f71273d.f72385d || iA < iA2) {
            return false;
        }
        if (iA > iA2) {
            return true;
        }
        if (!c7453aF02.b()) {
            int i10 = qa0.f69535d.f72386e;
            return i10 == -1 || i10 > this.f71273d.f72383b;
        }
        C7453aF0 c7453aF03 = qa0.f69535d;
        int i11 = c7453aF03.f72383b;
        int i12 = c7453aF03.f72384c;
        C7453aF0 c7453aF04 = this.f71273d;
        int i13 = c7453aF04.f72383b;
        if (i11 <= i13) {
            return i11 == i13 && i12 > c7453aF04.f72384c;
        }
        return true;
    }

    public final boolean l(AbstractC7307Wl abstractC7307Wl, AbstractC7307Wl abstractC7307Wl2) {
        int i10 = this.f71271b;
        if (i10 < abstractC7307Wl.c()) {
            abstractC7307Wl.e(i10, this.f71276g.f72095a, 0L);
            for (int i11 = this.f71276g.f72095a.f79858m; i11 <= this.f71276g.f72095a.f79859n; i11++) {
                int iA = abstractC7307Wl2.a(abstractC7307Wl.f(i11));
                if (iA != -1) {
                    i10 = abstractC7307Wl2.d(iA, this.f71276g.f72096b, false).f71150c;
                    break;
                }
            }
            i10 = -1;
        } else if (i10 >= abstractC7307Wl2.c()) {
            i10 = -1;
        }
        this.f71271b = i10;
        if (i10 == -1) {
            return false;
        }
        C7453aF0 c7453aF0 = this.f71273d;
        return c7453aF0 == null || abstractC7307Wl2.a(c7453aF0.f72382a) != -1;
    }
}
