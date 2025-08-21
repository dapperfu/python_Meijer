package Gd;

/* renamed from: Gd.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3644e implements InterfaceC3679j {

    /* renamed from: a, reason: collision with root package name */
    private final int f11993a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC3672i f11994b;

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC3679j)) {
            return false;
        }
        InterfaceC3679j interfaceC3679j = (InterfaceC3679j) obj;
        return this.f11993a == interfaceC3679j.zza() && this.f11994b.equals(interfaceC3679j.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC3679j.class;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f11993a ^ 14552422) + (this.f11994b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f11993a + "intEncoding=" + this.f11994b + ')';
    }

    @Override // Gd.InterfaceC3679j
    public final int zza() {
        return this.f11993a;
    }

    @Override // Gd.InterfaceC3679j
    public final EnumC3672i zzb() {
        return this.f11994b;
    }

    C3644e(int i10, EnumC3672i enumC3672i) {
        this.f11993a = i10;
        this.f11994b = enumC3672i;
    }
}
