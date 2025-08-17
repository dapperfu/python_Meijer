package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8209hM {

    /* renamed from: a, reason: collision with root package name */
    private final Map f74713a = new HashMap();

    public final synchronized C8102gM a(String str) {
        return (C8102gM) this.f74713a.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final synchronized void c(java.lang.String r6, com.google.android.gms.internal.ads.S60 r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.Map r0 = r5.f74713a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto Lb
            monitor-exit(r5)
            return
        Lb:
            com.google.android.gms.internal.ads.gM r0 = new com.google.android.gms.internal.ads.gM     // Catch: java.lang.Throwable -> L17
            r1 = 0
            if (r7 != 0) goto L12
        L10:
            r2 = r1
            goto L19
        L12:
            com.google.android.gms.internal.ads.Nm r2 = r7.j()     // Catch: com.google.android.gms.internal.ads.zzfcq -> L10 java.lang.Throwable -> L17
            goto L19
        L17:
            r6 = move-exception
            goto L46
        L19:
            if (r7 != 0) goto L1c
            goto L20
        L1c:
            com.google.android.gms.internal.ads.Nm r1 = r7.k()     // Catch: java.lang.Throwable -> L17 com.google.android.gms.internal.ads.zzfcq -> L20
        L20:
            com.google.android.gms.internal.ads.bf r3 = com.google.android.gms.internal.ads.C8659lf.f76413l9     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.internal.ads.jf r4 = Mc.A.c()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L17
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L17
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 != 0) goto L34
            goto L3c
        L34:
            r3 = 0
            if (r7 != 0) goto L39
        L37:
            r4 = r3
            goto L3c
        L39:
            r7.c()     // Catch: java.lang.Throwable -> L17 com.google.android.gms.internal.ads.zzfcq -> L37
        L3c:
            r0.<init>(r6, r2, r1, r4)     // Catch: java.lang.Throwable -> L17
            java.util.Map r7 = r5.f74713a     // Catch: java.lang.Throwable -> L17
            r7.put(r6, r0)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r5)
            return
        L46:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L17
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8209hM.c(java.lang.String, com.google.android.gms.internal.ads.S60):void");
    }

    final synchronized void d(String str, InterfaceC10170zm interfaceC10170zm) {
        if (this.f74713a.containsKey(str)) {
            return;
        }
        try {
            this.f74713a.put(str, new C8102gM(str, interfaceC10170zm.zzf(), interfaceC10170zm.zzg(), true));
        } catch (Throwable unused) {
        }
    }

    C8209hM() {
    }

    public final String b(String str) {
        C7005Nm c7005Nm;
        C8102gM c8102gMA = a(str);
        if (c8102gMA != null && (c7005Nm = c8102gMA.f74302b) != null) {
            return c7005Nm.toString();
        }
        return "";
    }
}
