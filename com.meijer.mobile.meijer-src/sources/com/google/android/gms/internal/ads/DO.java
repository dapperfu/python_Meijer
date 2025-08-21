package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;

/* loaded from: classes6.dex */
final class DO extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ EP f67076a;

    /* synthetic */ DO(EP ep2, C8016eP c8016eP) {
        this.f67076a = ep2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r9, android.content.Intent r10) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r10 = "connectivity"
            java.lang.Object r10 = r9.getSystemService(r10)
            android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10
            r0 = 0
            r1 = 5
            if (r10 != 0) goto Ld
            goto L4e
        Ld:
            android.net.NetworkInfo r10 = r10.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L4e
            r2 = 1
            if (r10 == 0) goto L1a
            boolean r3 = r10.isConnected()
            if (r3 != 0) goto L1c
        L1a:
            r0 = r2
            goto L4e
        L1c:
            int r3 = r10.getType()
            r4 = 2
            r5 = 9
            r6 = 6
            r7 = 4
            if (r3 == 0) goto L3a
            if (r3 == r2) goto L38
            if (r3 == r7) goto L3a
            if (r3 == r1) goto L3a
            if (r3 == r6) goto L36
            if (r3 == r5) goto L34
            r0 = 8
            goto L4e
        L34:
            r0 = 7
            goto L4e
        L36:
            r0 = r1
            goto L4e
        L38:
            r0 = r4
            goto L4e
        L3a:
            int r10 = r10.getSubtype()
            switch(r10) {
                case 1: goto L4d;
                case 2: goto L4d;
                case 3: goto L4b;
                case 4: goto L4b;
                case 5: goto L4b;
                case 6: goto L4b;
                case 7: goto L4b;
                case 8: goto L4b;
                case 9: goto L4b;
                case 10: goto L4b;
                case 11: goto L4b;
                case 12: goto L4b;
                case 13: goto L36;
                case 14: goto L4b;
                case 15: goto L4b;
                case 16: goto L41;
                case 17: goto L4b;
                case 18: goto L38;
                case 19: goto L41;
                case 20: goto L43;
                default: goto L41;
            }
        L41:
            r0 = r6
            goto L4e
        L43:
            int r10 = com.google.android.gms.internal.ads.OV.f69931a
            r2 = 29
            if (r10 < r2) goto L4e
            r0 = r5
            goto L4e
        L4b:
            r0 = r7
            goto L4e
        L4d:
            r0 = 3
        L4e:
            int r10 = com.google.android.gms.internal.ads.OV.f69931a
            r2 = 31
            if (r10 < r2) goto L78
            if (r0 != r1) goto L78
            com.google.android.gms.internal.ads.EP r10 = r8.f67076a
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r9.getSystemService(r0)     // Catch: java.lang.RuntimeException -> L74
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.RuntimeException -> L74
            if (r0 == 0) goto L72
            com.google.android.gms.internal.ads.bO r2 = new com.google.android.gms.internal.ads.bO     // Catch: java.lang.RuntimeException -> L74
            r2.<init>(r10)     // Catch: java.lang.RuntimeException -> L74
            java.util.concurrent.Executor r9 = com.google.android.gms.internal.ads.CO.a(r9)     // Catch: java.lang.RuntimeException -> L74
            d3.x.a(r0, r9, r2)     // Catch: java.lang.RuntimeException -> L74
            d3.y.a(r0, r2)     // Catch: java.lang.RuntimeException -> L74
            return
        L72:
            r9 = 0
            throw r9     // Catch: java.lang.RuntimeException -> L74
        L74:
            com.google.android.gms.internal.ads.EP.c(r10, r1)
            return
        L78:
            com.google.android.gms.internal.ads.EP r9 = r8.f67076a
            com.google.android.gms.internal.ads.EP.c(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.DO.onReceive(android.content.Context, android.content.Intent):void");
    }
}
