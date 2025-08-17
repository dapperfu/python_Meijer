package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.If0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6827If0 extends AbstractC6589Bf0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f67659a;

    C6827If0(Object obj) {
        this.f67659a = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6589Bf0
    public final Object b(Object obj) {
        return this.f67659a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6589Bf0
    public final AbstractC6589Bf0 a(InterfaceC9408sf0 interfaceC9408sf0) {
        Object objApply = interfaceC9408sf0.apply(this.f67659a);
        C6657Df0.c(objApply, "the Function passed to Optional.transform() must not return null.");
        return new C6827If0(objApply);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6827If0) {
            return this.f67659a.equals(((C6827If0) obj).f67659a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f67659a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f67659a.toString() + ")";
    }
}
