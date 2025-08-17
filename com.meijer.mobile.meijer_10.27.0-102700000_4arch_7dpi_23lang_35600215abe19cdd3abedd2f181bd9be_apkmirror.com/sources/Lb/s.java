package Lb;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public int f17968a;

    /* renamed from: b, reason: collision with root package name */
    private String f17969b;

    public final boolean a() {
        return this.f17968a >= 11;
    }

    public final boolean b(boolean z10) {
        int i10 = this.f17968a;
        if (i10 >= 21) {
            return true;
        }
        if (i10 >= 19 && z10) {
            return d();
        }
        return false;
    }

    public final boolean c() {
        return this.f17968a >= 14;
    }

    public final boolean d() {
        return n.a(this.f17969b, "4.4.3").intValue() >= 0;
    }

    public final boolean e() {
        return this.f17968a >= 23;
    }

    public s(int i10, String str) {
        this.f17968a = i10;
        this.f17969b = str;
    }
}
