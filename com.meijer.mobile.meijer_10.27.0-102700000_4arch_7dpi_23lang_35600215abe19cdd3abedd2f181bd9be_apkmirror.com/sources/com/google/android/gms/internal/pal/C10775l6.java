package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.l6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10775l6 extends AbstractC10870r6 {

    /* renamed from: a, reason: collision with root package name */
    static final C10775l6 f83225a = new C10775l6();

    private C10775l6() {
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10870r6
    public final Object c(Object obj) {
        return obj;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10870r6
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10870r6
    public final Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10870r6
    public final AbstractC10870r6 a(InterfaceC10823o6 interfaceC10823o6) {
        interfaceC10823o6.getClass();
        return f83225a;
    }
}
