package Ed;

/* renamed from: Ed.o5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3528o5 extends AbstractC3555s5 {

    /* renamed from: a, reason: collision with root package name */
    private final String f8637a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8638b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8639c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3555s5) {
            AbstractC3555s5 abstractC3555s5 = (AbstractC3555s5) obj;
            if (this.f8637a.equals(abstractC3555s5.b()) && this.f8638b == abstractC3555s5.c() && this.f8639c == abstractC3555s5.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // Ed.AbstractC3555s5
    public final int a() {
        return this.f8639c;
    }

    @Override // Ed.AbstractC3555s5
    public final String b() {
        return this.f8637a;
    }

    @Override // Ed.AbstractC3555s5
    public final boolean c() {
        return this.f8638b;
    }

    public final int hashCode() {
        return ((((this.f8637a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f8638b ? 1237 : 1231)) * 1000003) ^ this.f8639c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f8637a + ", enableFirelog=" + this.f8638b + ", firelogEventType=" + this.f8639c + "}";
    }

    /* synthetic */ C3528o5(String str, boolean z10, int i10, C3514m5 c3514m5) {
        this.f8637a = str;
        this.f8638b = z10;
        this.f8639c = i10;
    }
}
