package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class GD0 implements XD0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7425Wf0 f67980a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7425Wf0 f67981b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f67982c;

    public GD0(int i10) {
        ED0 ed0 = new ED0(i10);
        FD0 fd0 = new FD0(i10);
        this.f67980a = ed0;
        this.f67981b = fd0;
        this.f67982c = true;
    }

    @Override // com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ ZD0 a(WD0 wd0) throws IOException {
        throw null;
    }

    public final void e(boolean z10) {
        this.f67982c = true;
    }

    static /* synthetic */ HandlerThread b(int i10) {
        return new HandlerThread(ID0.k(i10, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    static /* synthetic */ HandlerThread c(int i10) {
        return new HandlerThread(ID0.k(i10, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[Catch: Exception -> 0x0037, TryCatch #1 {Exception -> 0x0037, blocks: (B:4:0x001d, B:6:0x0023, B:10:0x002e, B:15:0x003a, B:18:0x0054, B:17:0x0043), top: B:40:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.ID0 d(com.google.android.gms.internal.ads.WD0 r10) throws java.lang.Exception {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.bE0 r0 = r10.f71873a
            java.lang.String r0 = r0.f73607a
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L85
            r2.<init>()     // Catch: java.lang.Exception -> L85
            java.lang.String r3 = "createCodec:"
            r2.append(r3)     // Catch: java.lang.Exception -> L85
            r2.append(r0)     // Catch: java.lang.Exception -> L85
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L85
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Exception -> L85
            android.media.MediaCodec r4 = android.media.MediaCodec.createByCodecName(r0)     // Catch: java.lang.Exception -> L85
            boolean r0 = r9.f67982c     // Catch: java.lang.Exception -> L37
            r2 = 35
            if (r0 == 0) goto L43
            com.google.android.gms.internal.ads.C r0 = r10.f71875c     // Catch: java.lang.Exception -> L37
            int r3 = com.google.android.gms.internal.ads.OV.f69931a     // Catch: java.lang.Exception -> L37
            r5 = 34
            if (r3 >= r5) goto L2c
            goto L43
        L2c:
            if (r3 >= r2) goto L3a
            java.lang.String r0 = r0.f66504o     // Catch: java.lang.Exception -> L37
            boolean r0 = com.google.android.gms.internal.ads.C7182Pc.i(r0)     // Catch: java.lang.Exception -> L37
            if (r0 == 0) goto L43
            goto L3a
        L37:
            r0 = move-exception
            r10 = r0
            goto L88
        L3a:
            com.google.android.gms.internal.ads.xE0 r0 = new com.google.android.gms.internal.ads.xE0     // Catch: java.lang.Exception -> L37
            r0.<init>(r4)     // Catch: java.lang.Exception -> L37
            r3 = 4
        L40:
            r6 = r0
            r0 = r3
            goto L54
        L43:
            com.google.android.gms.internal.ads.MD0 r0 = new com.google.android.gms.internal.ads.MD0     // Catch: java.lang.Exception -> L37
            com.google.android.gms.internal.ads.Wf0 r3 = r9.f67981b     // Catch: java.lang.Exception -> L37
            com.google.android.gms.internal.ads.FD0 r3 = (com.google.android.gms.internal.ads.FD0) r3     // Catch: java.lang.Exception -> L37
            int r3 = r3.f67604a     // Catch: java.lang.Exception -> L37
            android.os.HandlerThread r3 = c(r3)     // Catch: java.lang.Exception -> L37
            r0.<init>(r4, r3)     // Catch: java.lang.Exception -> L37
            r3 = 0
            goto L40
        L54:
            com.google.android.gms.internal.ads.ID0 r3 = new com.google.android.gms.internal.ads.ID0     // Catch: java.lang.Exception -> L37
            com.google.android.gms.internal.ads.Wf0 r5 = r9.f67980a     // Catch: java.lang.Exception -> L37
            com.google.android.gms.internal.ads.ED0 r5 = (com.google.android.gms.internal.ads.ED0) r5     // Catch: java.lang.Exception -> L37
            int r5 = r5.f67210a     // Catch: java.lang.Exception -> L37
            android.os.HandlerThread r5 = b(r5)     // Catch: java.lang.Exception -> L37
            com.google.android.gms.internal.ads.UD0 r7 = r10.f71878f     // Catch: java.lang.Exception -> L37
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L37
            android.os.Trace.endSection()     // Catch: java.lang.Exception -> L7a
            android.view.Surface r5 = r10.f71876d     // Catch: java.lang.Exception -> L7a
            if (r5 != 0) goto L7d
            com.google.android.gms.internal.ads.bE0 r6 = r10.f71873a     // Catch: java.lang.Exception -> L7a
            boolean r6 = r6.f73614h     // Catch: java.lang.Exception -> L7a
            if (r6 == 0) goto L7d
            int r6 = com.google.android.gms.internal.ads.OV.f69931a     // Catch: java.lang.Exception -> L7a
            if (r6 < r2) goto L7d
            r0 = r0 | 8
            goto L7d
        L7a:
            r0 = move-exception
            r10 = r0
            goto L83
        L7d:
            android.media.MediaFormat r10 = r10.f71874b     // Catch: java.lang.Exception -> L7a
            com.google.android.gms.internal.ads.ID0.j(r3, r10, r5, r1, r0)     // Catch: java.lang.Exception -> L7a
            return r3
        L83:
            r1 = r3
            goto L88
        L85:
            r0 = move-exception
            r10 = r0
            r4 = r1
        L88:
            if (r1 != 0) goto L90
            if (r4 == 0) goto L93
            r4.release()
            goto L93
        L90:
            r1.zzm()
        L93:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.GD0.d(com.google.android.gms.internal.ads.WD0):com.google.android.gms.internal.ads.ID0");
    }
}
