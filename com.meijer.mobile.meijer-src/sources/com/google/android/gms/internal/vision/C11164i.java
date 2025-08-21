package com.google.android.gms.internal.vision;

import java.util.List;

/* renamed from: com.google.android.gms.internal.vision.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11164i extends AbstractC11148e {

    /* renamed from: b, reason: collision with root package name */
    private final C11160h f85396b = new C11160h();

    C11164i() {
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11148e
    public final void a(Throwable th2) {
        th2.printStackTrace();
        List<Throwable> listA = this.f85396b.a(th2, false);
        if (listA == null) {
            return;
        }
        synchronized (listA) {
            try {
                for (Throwable th3 : listA) {
                    System.err.print("Suppressed: ");
                    th3.printStackTrace();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
