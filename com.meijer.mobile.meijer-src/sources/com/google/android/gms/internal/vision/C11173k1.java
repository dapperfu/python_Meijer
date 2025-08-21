package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.k1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11173k1 extends AbstractC11154f1 {
    private C11173k1() {
        super();
    }

    private static <E> X0<E> e(Object obj, long j10) {
        return (X0) l2.F(obj, j10);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11154f1
    final <E> void b(Object obj, Object obj2, long j10) {
        X0 x0E = e(obj, j10);
        X0 x0E2 = e(obj2, j10);
        int size = x0E.size();
        int size2 = x0E2.size();
        if (size > 0 && size2 > 0) {
            if (!x0E.zza()) {
                x0E = x0E.zza(size2 + size);
            }
            x0E.addAll(x0E2);
        }
        if (size > 0) {
            x0E2 = x0E;
        }
        l2.j(obj, j10, x0E2);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11154f1
    final void d(Object obj, long j10) {
        e(obj, j10).zzb();
    }
}
