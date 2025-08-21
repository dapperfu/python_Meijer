package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.l6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10900l6 extends AbstractC10995r6 {

    /* renamed from: a, reason: collision with root package name */
    static final C10900l6 f84065a = new C10900l6();

    private C10900l6() {
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10995r6
    public final Object c(Object obj) {
        return obj;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10995r6
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

    @Override // com.google.android.gms.internal.pal.AbstractC10995r6
    public final Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10995r6
    public final AbstractC10995r6 a(InterfaceC10948o6 interfaceC10948o6) {
        interfaceC10948o6.getClass();
        return f84065a;
    }
}
