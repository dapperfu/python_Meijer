package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
final class MD0 implements InterfaceC7576aE0 {

    /* renamed from: g, reason: collision with root package name */
    private static final ArrayDeque f69442g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    private static final Object f69443h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f69444a;

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f69445b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f69446c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f69447d;

    /* renamed from: e, reason: collision with root package name */
    private final C8748lE f69448e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f69449f;

    public MD0(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C8748lE c8748lE = new C8748lE(HC.f68248a);
        this.f69444a = mediaCodec;
        this.f69445b = handlerThread;
        this.f69448e = c8748lE;
        this.f69447d = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* bridge */ /* synthetic */ void d(com.google.android.gms.internal.ads.MD0 r10, android.os.Message r11) throws android.media.MediaCodec.CryptoException {
        /*
            int r0 = r11.what
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 2
            if (r0 == r1) goto L38
            r1 = 3
            if (r0 == r1) goto L32
            r1 = 4
            if (r0 == r1) goto L20
            java.util.concurrent.atomic.AtomicReference r10 = r10.f69447d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r11 = r11.what
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r0.<init>(r11)
            com.google.android.gms.internal.ads.JD0.a(r10, r2, r0)
            goto L74
        L20:
            java.lang.Object r11 = r11.obj
            android.os.Bundle r11 = (android.os.Bundle) r11
            android.media.MediaCodec r0 = r10.f69444a     // Catch: java.lang.RuntimeException -> L2a
            r0.setParameters(r11)     // Catch: java.lang.RuntimeException -> L2a
            goto L74
        L2a:
            r0 = move-exception
            r11 = r0
            java.util.concurrent.atomic.AtomicReference r10 = r10.f69447d
            com.google.android.gms.internal.ads.JD0.a(r10, r2, r11)
            goto L74
        L32:
            com.google.android.gms.internal.ads.lE r10 = r10.f69448e
            r10.e()
            goto L74
        L38:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.internal.ads.LD0 r11 = (com.google.android.gms.internal.ads.LD0) r11
            int r4 = r11.f69148a
            android.media.MediaCodec$CryptoInfo r6 = r11.f69151d
            long r7 = r11.f69152e
            int r9 = r11.f69153f
            java.lang.Object r1 = com.google.android.gms.internal.ads.MD0.f69443h     // Catch: java.lang.RuntimeException -> L52
            monitor-enter(r1)     // Catch: java.lang.RuntimeException -> L52
            android.media.MediaCodec r3 = r10.f69444a     // Catch: java.lang.Throwable -> L4f
            r5 = 0
            r3.queueSecureInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            goto L58
        L4f:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            throw r0     // Catch: java.lang.RuntimeException -> L52
        L52:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r10 = r10.f69447d
            com.google.android.gms.internal.ads.JD0.a(r10, r2, r0)
        L58:
            r2 = r11
            goto L74
        L5a:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.internal.ads.LD0 r11 = (com.google.android.gms.internal.ads.LD0) r11
            int r4 = r11.f69148a
            int r6 = r11.f69150c
            long r7 = r11.f69152e
            int r9 = r11.f69153f
            android.media.MediaCodec r3 = r10.f69444a     // Catch: java.lang.RuntimeException -> L6d
            r5 = 0
            r3.queueInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.RuntimeException -> L6d
            goto L58
        L6d:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r10 = r10.f69447d
            com.google.android.gms.internal.ads.JD0.a(r10, r2, r0)
            goto L58
        L74:
            if (r2 == 0) goto L82
            java.util.ArrayDeque r10 = com.google.android.gms.internal.ads.MD0.f69442g
            monitor-enter(r10)
            r10.add(r2)     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L7e
            goto L82
        L7e:
            r0 = move-exception
            r11 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L7e
            throw r11
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.MD0.d(com.google.android.gms.internal.ads.MD0, android.os.Message):void");
    }

    private static LD0 e() {
        ArrayDeque arrayDeque = f69442g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new LD0();
                }
                return (LD0) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static byte[] f(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static int[] g(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7576aE0
    public final void zzb() {
        if (this.f69449f) {
            try {
                Handler handler = this.f69446c;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                this.f69448e.c();
                Handler handler2 = this.f69446c;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(3).sendToTarget();
                this.f69448e.a();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7576aE0
    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.f69447d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7576aE0
    public final void zzg() {
        if (this.f69449f) {
            zzb();
            this.f69445b.quit();
        }
        this.f69449f = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7576aE0
    public final void zzh() {
        if (this.f69449f) {
            return;
        }
        this.f69445b.start();
        this.f69446c = new KD0(this, this.f69445b.getLooper());
        this.f69449f = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7576aE0
    public final void a(int i10, int i11, Qx0 qx0, long j10, int i12) {
        zzc();
        LD0 ld0E = e();
        ld0E.a(i10, 0, 0, j10, 0);
        MediaCodec.CryptoInfo cryptoInfo = ld0E.f69151d;
        cryptoInfo.numSubSamples = qx0.f70534f;
        cryptoInfo.numBytesOfClearData = g(qx0.f70532d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = g(qx0.f70533e, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrF = f(qx0.f70530b, cryptoInfo.key);
        bArrF.getClass();
        cryptoInfo.key = bArrF;
        byte[] bArrF2 = f(qx0.f70529a, cryptoInfo.iv);
        bArrF2.getClass();
        cryptoInfo.iv = bArrF2;
        cryptoInfo.mode = qx0.f70531c;
        if (OV.f69931a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(qx0.f70535g, qx0.f70536h));
        }
        this.f69446c.obtainMessage(2, ld0E).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7576aE0
    public final void b(Bundle bundle) {
        zzc();
        Handler handler = this.f69446c;
        int i10 = OV.f69931a;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7576aE0
    public final void c(int i10, int i11, int i12, long j10, int i13) {
        zzc();
        LD0 ld0E = e();
        ld0E.a(i10, 0, i12, j10, i13);
        Handler handler = this.f69446c;
        int i14 = OV.f69931a;
        handler.obtainMessage(1, ld0E).sendToTarget();
    }
}
