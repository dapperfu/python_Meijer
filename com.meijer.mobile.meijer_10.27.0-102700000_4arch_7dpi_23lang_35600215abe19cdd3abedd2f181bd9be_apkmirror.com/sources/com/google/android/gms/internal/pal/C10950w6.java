package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.w6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10950w6 extends AbstractC10870r6 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f84186a;

    C10950w6(Object obj) {
        this.f84186a = obj;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10870r6
    public final Object b() {
        return this.f84186a;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10870r6
    public final Object c(Object obj) {
        return this.f84186a;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10870r6
    public final boolean d() {
        return true;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10870r6
    public final AbstractC10870r6 a(InterfaceC10823o6 interfaceC10823o6) {
        return new C10950w6(interfaceC10823o6.zza(this.f84186a));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10950w6) {
            return this.f84186a.equals(((C10950w6) obj).f84186a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f84186a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f84186a + ")";
    }
}
