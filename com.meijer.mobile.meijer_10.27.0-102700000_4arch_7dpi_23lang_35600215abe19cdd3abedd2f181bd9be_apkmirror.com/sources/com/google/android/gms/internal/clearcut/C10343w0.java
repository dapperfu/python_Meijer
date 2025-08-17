package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.w0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10343w0 extends AbstractC10334t0 {
    private C10343w0() {
        super();
    }

    private static <E> InterfaceC10308k0<E> e(Object obj, long j10) {
        return (InterfaceC10308k0) C10350y1.M(obj, j10);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10334t0
    final void a(Object obj, long j10) {
        e(obj, j10).zzv();
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10334t0
    final <E> void b(Object obj, Object obj2, long j10) {
        InterfaceC10308k0 interfaceC10308k0E = e(obj, j10);
        InterfaceC10308k0 interfaceC10308k0E2 = e(obj2, j10);
        int size = interfaceC10308k0E.size();
        int size2 = interfaceC10308k0E2.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC10308k0E.zzu()) {
                interfaceC10308k0E = interfaceC10308k0E.zzi(size2 + size);
            }
            interfaceC10308k0E.addAll(interfaceC10308k0E2);
        }
        if (size > 0) {
            interfaceC10308k0E2 = interfaceC10308k0E;
        }
        C10350y1.i(obj, j10, interfaceC10308k0E2);
    }
}
