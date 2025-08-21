package Fd;

/* loaded from: classes6.dex */
final class L0 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f9311a;

    /* renamed from: b, reason: collision with root package name */
    private final P0 f9312b;

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q0)) {
            return false;
        }
        Q0 q02 = (Q0) obj;
        return this.f9311a == q02.zza() && this.f9312b.equals(q02.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return Q0.class;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f9311a ^ 14552422) + (this.f9312b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f9311a + "intEncoding=" + this.f9312b + ')';
    }

    @Override // Fd.Q0
    public final int zza() {
        return this.f9311a;
    }

    @Override // Fd.Q0
    public final P0 zzb() {
        return this.f9312b;
    }

    L0(int i10, P0 p02) {
        this.f9311a = i10;
        this.f9312b = p02;
    }
}
