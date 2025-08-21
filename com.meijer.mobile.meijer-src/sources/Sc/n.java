package Sc;

/* loaded from: classes4.dex */
final class n extends w {

    /* renamed from: a, reason: collision with root package name */
    private final int f34513a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34514b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34515c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f34513a == wVar.b() && this.f34514b == wVar.a() && this.f34515c == wVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f34515c ? 1237 : 1231) ^ ((((this.f34513a ^ 1000003) * 1000003) ^ this.f34514b) * 1000003);
    }

    @Override // Sc.w
    public final int a() {
        return this.f34514b;
    }

    @Override // Sc.w
    public final int b() {
        return this.f34513a;
    }

    @Override // Sc.w
    public final boolean c() {
        return this.f34515c;
    }

    public final String toString() {
        return "OfflineAdConfig{impressionPrerequisite=" + this.f34513a + ", clickPrerequisite=" + this.f34514b + ", notificationFlowEnabled=" + this.f34515c + "}";
    }

    n(int i10, int i11, boolean z10) {
        this.f34513a = i10;
        this.f34514b = i11;
        this.f34515c = z10;
    }
}
