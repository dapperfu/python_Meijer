package h3;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: c, reason: collision with root package name */
    public static final K f134667c = new K(0, false);

    /* renamed from: a, reason: collision with root package name */
    public final int f134668a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f134669b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && K.class == obj.getClass()) {
            K k10 = (K) obj;
            if (this.f134668a == k10.f134668a && this.f134669b == k10.f134669b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f134668a << 1) + (this.f134669b ? 1 : 0);
    }

    public K(int i10, boolean z10) {
        this.f134668a = i10;
        this.f134669b = z10;
    }
}
