package Dd;

/* loaded from: classes6.dex */
final class L0 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f5278a;

    /* renamed from: b, reason: collision with root package name */
    private final P0 f5279b;

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q0)) {
            return false;
        }
        Q0 q02 = (Q0) obj;
        return this.f5278a == q02.zza() && this.f5279b.equals(q02.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return Q0.class;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f5278a ^ 14552422) + (this.f5279b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f5278a + "intEncoding=" + this.f5279b + ')';
    }

    @Override // Dd.Q0
    public final int zza() {
        return this.f5278a;
    }

    @Override // Dd.Q0
    public final P0 zzb() {
        return this.f5279b;
    }

    L0(int i10, P0 p02) {
        this.f5278a = i10;
        this.f5279b = p02;
    }
}
