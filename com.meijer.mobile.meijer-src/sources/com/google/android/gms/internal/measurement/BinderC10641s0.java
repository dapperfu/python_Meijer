package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.s0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC10641s0 extends AbstractBinderC10686x0 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f83234a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private boolean f83235b;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r2 = r2.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z3(android.os.Bundle r2, java.lang.Class r3) {
        /*
            r0 = 0
            if (r2 == 0) goto L2d
            java.lang.String r1 = "r"
            java.lang.Object r2 = r2.get(r1)
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r3.cast(r2)     // Catch: java.lang.ClassCastException -> L10
            return r2
        L10:
            r0 = move-exception
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            java.lang.String r3 = "Unexpected object type. Expected, Received: %s, %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.String r3 = "AM"
            com.fullstory.FS.log_w(r3, r2, r0)
            throw r0
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.BinderC10641s0.Z3(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final Bundle I2(long j10) {
        Bundle bundle;
        AtomicReference atomicReference = this.f83234a;
        synchronized (atomicReference) {
            if (!this.f83235b) {
                try {
                    atomicReference.wait(j10);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f83234a.get();
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10695y0
    public final void P(Bundle bundle) {
        AtomicReference atomicReference = this.f83234a;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f83235b = true;
                } finally {
                    this.f83234a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String a2(long j10) {
        return (String) Z3(I2(j10), String.class);
    }

    public final Long c2(long j10) {
        return (Long) Z3(I2(j10), Long.class);
    }
}
