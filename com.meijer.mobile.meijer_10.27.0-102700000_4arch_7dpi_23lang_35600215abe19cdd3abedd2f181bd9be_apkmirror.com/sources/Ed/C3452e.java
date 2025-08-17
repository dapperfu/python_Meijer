package Ed;

/* renamed from: Ed.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3452e implements InterfaceC3487j {

    /* renamed from: a, reason: collision with root package name */
    private final int f8441a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC3480i f8442b;

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC3487j)) {
            return false;
        }
        InterfaceC3487j interfaceC3487j = (InterfaceC3487j) obj;
        return this.f8441a == interfaceC3487j.zza() && this.f8442b.equals(interfaceC3487j.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC3487j.class;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f8441a ^ 14552422) + (this.f8442b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f8441a + "intEncoding=" + this.f8442b + ')';
    }

    @Override // Ed.InterfaceC3487j
    public final int zza() {
        return this.f8441a;
    }

    @Override // Ed.InterfaceC3487j
    public final EnumC3480i zzb() {
        return this.f8442b;
    }

    C3452e(int i10, EnumC3480i enumC3480i) {
        this.f8441a = i10;
        this.f8442b = enumC3480i;
    }
}
