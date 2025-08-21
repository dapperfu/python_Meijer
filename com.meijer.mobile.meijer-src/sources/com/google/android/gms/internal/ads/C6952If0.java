package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.If0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6952If0 extends AbstractC6714Bf0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f68499a;

    C6952If0(Object obj) {
        this.f68499a = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6714Bf0
    public final Object b(Object obj) {
        return this.f68499a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6714Bf0
    public final AbstractC6714Bf0 a(InterfaceC9533sf0 interfaceC9533sf0) {
        Object objApply = interfaceC9533sf0.apply(this.f68499a);
        C6782Df0.c(objApply, "the Function passed to Optional.transform() must not return null.");
        return new C6952If0(objApply);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6952If0) {
            return this.f68499a.equals(((C6952If0) obj).f68499a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f68499a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f68499a.toString() + ")";
    }
}
