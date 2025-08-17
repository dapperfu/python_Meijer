package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;

/* loaded from: classes6.dex */
public final class G6 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final X2 f85042a;

    final /* synthetic */ void a() {
        this.f85042a.L().m(((Long) C11120d2.f85404D.b(null)).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r3, android.content.Intent r4) throws java.lang.IllegalStateException {
        /*
            r2 = this;
            if (r4 != 0) goto L12
            com.google.android.gms.measurement.internal.X2 r3 = r2.f85042a
            com.google.android.gms.measurement.internal.q2 r3 = r3.a()
            com.google.android.gms.measurement.internal.o2 r3 = r3.p()
            java.lang.String r4 = "App receiver called with null intent"
            r3.a(r4)
            return
        L12:
            java.lang.String r3 = r4.getAction()
            if (r3 != 0) goto L28
            com.google.android.gms.measurement.internal.X2 r3 = r2.f85042a
            com.google.android.gms.measurement.internal.q2 r3 = r3.a()
            com.google.android.gms.measurement.internal.o2 r3 = r3.p()
            java.lang.String r4 = "App receiver called with null action"
            r3.a(r4)
            return
        L28:
            int r4 = r3.hashCode()
            r0 = -1928239649(0xffffffff8d1165df, float:-4.4804198E-31)
            r1 = 1
            if (r4 == r0) goto L42
            r0 = 1279883384(0x4c497878, float:5.2814304E7)
            if (r4 == r0) goto L38
            goto L4c
        L38:
            java.lang.String r4 = "com.google.android.gms.measurement.BATCHES_AVAILABLE"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L4c
            r3 = r1
            goto L4d
        L42:
            java.lang.String r4 = "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L4c
            r3 = 0
            goto L4d
        L4c:
            r3 = -1
        L4d:
            if (r3 == 0) goto L7d
            if (r3 == r1) goto L61
            com.google.android.gms.measurement.internal.X2 r3 = r2.f85042a
            com.google.android.gms.measurement.internal.q2 r3 = r3.a()
            com.google.android.gms.measurement.internal.o2 r3 = r3.p()
            java.lang.String r4 = "App receiver called with unknown action"
            r3.a(r4)
            return
        L61:
            com.google.android.gms.measurement.internal.X2 r3 = r2.f85042a
            com.google.android.gms.measurement.internal.q2 r4 = r3.a()
            com.google.android.gms.measurement.internal.o2 r4 = r4.u()
            java.lang.String r0 = "[sgtm] App Receiver notified batches are available"
            r4.a(r0)
            com.google.android.gms.measurement.internal.T2 r3 = r3.b()
            com.google.android.gms.measurement.internal.D6 r4 = new com.google.android.gms.measurement.internal.D6
            r4.<init>()
            r3.r(r4)
            return
        L7d:
            com.google.android.gms.measurement.internal.X2 r3 = r2.f85042a
            com.google.android.gms.internal.measurement.C10497p7.a()
            com.google.android.gms.measurement.internal.m r4 = r3.u()
            r0 = 0
            com.google.android.gms.measurement.internal.c2 r1 = com.google.android.gms.measurement.internal.C11120d2.f85433R0
            boolean r4 = r4.F(r0, r1)
            if (r4 != 0) goto L90
            return
        L90:
            com.google.android.gms.measurement.internal.q2 r4 = r3.a()
            com.google.android.gms.measurement.internal.o2 r4 = r4.u()
            java.lang.String r0 = "App receiver notified triggers are available"
            r4.a(r0)
            com.google.android.gms.measurement.internal.T2 r4 = r3.b()
            com.google.android.gms.measurement.internal.E6 r0 = new com.google.android.gms.measurement.internal.E6
            r0.<init>()
            r4.r(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.G6.onReceive(android.content.Context, android.content.Intent):void");
    }

    public G6(X2 x22) {
        this.f85042a = x22;
    }
}
