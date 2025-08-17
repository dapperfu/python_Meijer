package z3;

import d3.D;

/* loaded from: classes2.dex */
final class c implements InterfaceC18378a {

    /* renamed from: a, reason: collision with root package name */
    public final int f171517a;

    /* renamed from: b, reason: collision with root package name */
    public final int f171518b;

    /* renamed from: c, reason: collision with root package name */
    public final int f171519c;

    /* renamed from: d, reason: collision with root package name */
    public final int f171520d;

    public boolean a() {
        return (this.f171518b & 16) == 16;
    }

    private c(int i10, int i11, int i12, int i13) {
        this.f171517a = i10;
        this.f171518b = i11;
        this.f171519c = i12;
        this.f171520d = i13;
    }

    public static c b(D d10) {
        int iU = d10.u();
        d10.X(8);
        int iU2 = d10.u();
        int iU3 = d10.u();
        d10.X(4);
        int iU4 = d10.u();
        d10.X(12);
        return new c(iU, iU2, iU3, iU4);
    }

    @Override // z3.InterfaceC18378a
    public int getType() {
        return 1751742049;
    }
}
