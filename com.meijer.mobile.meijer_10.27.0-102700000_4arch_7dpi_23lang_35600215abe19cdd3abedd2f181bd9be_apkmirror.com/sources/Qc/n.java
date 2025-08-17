package Qc;

/* loaded from: classes4.dex */
final class n extends w {

    /* renamed from: a, reason: collision with root package name */
    private final int f29963a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29964b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f29965c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f29963a == wVar.b() && this.f29964b == wVar.a() && this.f29965c == wVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f29965c ? 1237 : 1231) ^ ((((this.f29963a ^ 1000003) * 1000003) ^ this.f29964b) * 1000003);
    }

    @Override // Qc.w
    public final int a() {
        return this.f29964b;
    }

    @Override // Qc.w
    public final int b() {
        return this.f29963a;
    }

    @Override // Qc.w
    public final boolean c() {
        return this.f29965c;
    }

    public final String toString() {
        return "OfflineAdConfig{impressionPrerequisite=" + this.f29963a + ", clickPrerequisite=" + this.f29964b + ", notificationFlowEnabled=" + this.f29965c + "}";
    }

    n(int i10, int i11, boolean z10) {
        this.f29963a = i10;
        this.f29964b = i11;
        this.f29965c = z10;
    }
}
