package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.w6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11075w6 extends AbstractC10995r6 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f85026a;

    C11075w6(Object obj) {
        this.f85026a = obj;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10995r6
    public final Object b() {
        return this.f85026a;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10995r6
    public final Object c(Object obj) {
        return this.f85026a;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10995r6
    public final boolean d() {
        return true;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10995r6
    public final AbstractC10995r6 a(InterfaceC10948o6 interfaceC10948o6) {
        return new C11075w6(interfaceC10948o6.zza(this.f85026a));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11075w6) {
            return this.f85026a.equals(((C11075w6) obj).f85026a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f85026a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f85026a + ")";
    }
}
