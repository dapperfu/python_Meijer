package Gd;

/* renamed from: Gd.o5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3720o5 extends AbstractC3747s5 {

    /* renamed from: a, reason: collision with root package name */
    private final String f12189a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12190b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12191c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3747s5) {
            AbstractC3747s5 abstractC3747s5 = (AbstractC3747s5) obj;
            if (this.f12189a.equals(abstractC3747s5.b()) && this.f12190b == abstractC3747s5.c() && this.f12191c == abstractC3747s5.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // Gd.AbstractC3747s5
    public final int a() {
        return this.f12191c;
    }

    @Override // Gd.AbstractC3747s5
    public final String b() {
        return this.f12189a;
    }

    @Override // Gd.AbstractC3747s5
    public final boolean c() {
        return this.f12190b;
    }

    public final int hashCode() {
        return ((((this.f12189a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f12190b ? 1237 : 1231)) * 1000003) ^ this.f12191c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f12189a + ", enableFirelog=" + this.f12190b + ", firelogEventType=" + this.f12191c + "}";
    }

    /* synthetic */ C3720o5(String str, boolean z10, int i10, C3706m5 c3706m5) {
        this.f12189a = str;
        this.f12190b = z10;
        this.f12191c = i10;
    }
}
