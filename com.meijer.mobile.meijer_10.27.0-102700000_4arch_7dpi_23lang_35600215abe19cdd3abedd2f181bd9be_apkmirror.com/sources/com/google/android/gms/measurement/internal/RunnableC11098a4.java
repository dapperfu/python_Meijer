package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC10570y0;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.a4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11098a4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC10570y0 f85350a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11268x4 f85351b;

    RunnableC11098a4(C11268x4 c11268x4, InterfaceC10570y0 interfaceC10570y0) {
        this.f85350a = interfaceC10570y0;
        Objects.requireNonNull(c11268x4);
        this.f85351b = c11268x4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.x4 r0 = r8.f85351b
            com.google.android.gms.measurement.internal.X2 r1 = r0.f84868a
            com.google.android.gms.measurement.internal.N5 r1 = r1.x()
            com.google.android.gms.measurement.internal.X2 r1 = r1.f84868a
            com.google.android.gms.measurement.internal.E2 r2 = r1.v()
            com.google.android.gms.measurement.internal.E3 r2 = r2.u()
            Od.v r3 = Od.v.ANALYTICS_STORAGE
            boolean r2 = r2.o(r3)
            r3 = 0
            if (r2 != 0) goto L2a
            com.google.android.gms.measurement.internal.q2 r1 = r1.a()
            com.google.android.gms.measurement.internal.o2 r1 = r1.r()
            java.lang.String r2 = "Analytics storage consent denied; will not get session id"
            r1.a(r2)
        L28:
            r1 = r3
            goto L5b
        L2a:
            com.google.android.gms.measurement.internal.E2 r2 = r1.v()
            com.google.android.gms.common.util.f r4 = r1.zzaZ()
            long r4 = r4.a()
            boolean r2 = r2.y(r4)
            if (r2 != 0) goto L28
            com.google.android.gms.measurement.internal.E2 r2 = r1.v()
            com.google.android.gms.measurement.internal.B2 r2 = r2.f84986r
            long r4 = r2.a()
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L4d
            goto L28
        L4d:
            com.google.android.gms.measurement.internal.E2 r1 = r1.v()
            com.google.android.gms.measurement.internal.B2 r1 = r1.f84986r
            long r1 = r1.a()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L5b:
            if (r1 == 0) goto L6d
            com.google.android.gms.measurement.internal.X2 r0 = r0.f84868a
            com.google.android.gms.internal.measurement.y0 r2 = r8.f85350a
            com.google.android.gms.measurement.internal.z6 r0 = r0.A()
            long r3 = r1.longValue()
            r0.Z(r2, r3)
            return
        L6d:
            com.google.android.gms.internal.measurement.y0 r0 = r8.f85350a     // Catch: android.os.RemoteException -> L73
            r0.P(r3)     // Catch: android.os.RemoteException -> L73
            return
        L73:
            r0 = move-exception
            com.google.android.gms.measurement.internal.x4 r1 = r8.f85351b
            com.google.android.gms.measurement.internal.X2 r1 = r1.f84868a
            com.google.android.gms.measurement.internal.q2 r1 = r1.a()
            com.google.android.gms.measurement.internal.o2 r1 = r1.m()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.RunnableC11098a4.run():void");
    }
}
