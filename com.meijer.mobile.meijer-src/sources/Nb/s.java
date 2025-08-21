package Nb;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public int f20788a;

    /* renamed from: b, reason: collision with root package name */
    private String f20789b;

    public final boolean a() {
        return this.f20788a >= 11;
    }

    public final boolean b(boolean z10) {
        int i10 = this.f20788a;
        if (i10 >= 21) {
            return true;
        }
        if (i10 >= 19 && z10) {
            return d();
        }
        return false;
    }

    public final boolean c() {
        return this.f20788a >= 14;
    }

    public final boolean d() {
        return n.a(this.f20789b, "4.4.3").intValue() >= 0;
    }

    public final boolean e() {
        return this.f20788a >= 23;
    }

    public s(int i10, String str) {
        this.f20788a = i10;
        this.f20789b = str;
    }
}
