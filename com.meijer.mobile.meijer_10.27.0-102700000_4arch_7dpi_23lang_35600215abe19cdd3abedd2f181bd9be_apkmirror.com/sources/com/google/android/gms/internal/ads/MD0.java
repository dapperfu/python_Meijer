package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
final class MD0 implements InterfaceC7451aE0 {

    /* renamed from: g, reason: collision with root package name */
    private static final ArrayDeque f68602g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    private static final Object f68603h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f68604a;

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f68605b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f68606c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f68607d;

    /* renamed from: e, reason: collision with root package name */
    private final C8623lE f68608e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f68609f;

    public MD0(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C8623lE c8623lE = new C8623lE(HC.f67408a);
        this.f68604a = mediaCodec;
        this.f68605b = handlerThread;
        this.f68608e = c8623lE;
        this.f68607d = new AtomicReference();
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
            java.util.concurrent.atomic.AtomicReference r10 = r10.f68607d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r11 = r11.what
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r0.<init>(r11)
            com.google.android.gms.internal.ads.JD0.a(r10, r2, r0)
            goto L74
        L20:
            java.lang.Object r11 = r11.obj
            android.os.Bundle r11 = (android.os.Bundle) r11
            android.media.MediaCodec r0 = r10.f68604a     // Catch: java.lang.RuntimeException -> L2a
            r0.setParameters(r11)     // Catch: java.lang.RuntimeException -> L2a
            goto L74
        L2a:
            r0 = move-exception
            r11 = r0
            java.util.concurrent.atomic.AtomicReference r10 = r10.f68607d
            com.google.android.gms.internal.ads.JD0.a(r10, r2, r11)
            goto L74
        L32:
            com.google.android.gms.internal.ads.lE r10 = r10.f68608e
            r10.e()
            goto L74
        L38:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.internal.ads.LD0 r11 = (com.google.android.gms.internal.ads.LD0) r11
            int r4 = r11.f68308a
            android.media.MediaCodec$CryptoInfo r6 = r11.f68311d
            long r7 = r11.f68312e
            int r9 = r11.f68313f
            java.lang.Object r1 = com.google.android.gms.internal.ads.MD0.f68603h     // Catch: java.lang.RuntimeException -> L52
            monitor-enter(r1)     // Catch: java.lang.RuntimeException -> L52
            android.media.MediaCodec r3 = r10.f68604a     // Catch: java.lang.Throwable -> L4f
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
            java.util.concurrent.atomic.AtomicReference r10 = r10.f68607d
            com.google.android.gms.internal.ads.JD0.a(r10, r2, r0)
        L58:
            r2 = r11
            goto L74
        L5a:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.internal.ads.LD0 r11 = (com.google.android.gms.internal.ads.LD0) r11
            int r4 = r11.f68308a
            int r6 = r11.f68310c
            long r7 = r11.f68312e
            int r9 = r11.f68313f
            android.media.MediaCodec r3 = r10.f68604a     // Catch: java.lang.RuntimeException -> L6d
            r5 = 0
            r3.queueInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.RuntimeException -> L6d
            goto L58
        L6d:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r10 = r10.f68607d
            com.google.android.gms.internal.ads.JD0.a(r10, r2, r0)
            goto L58
        L74:
            if (r2 == 0) goto L82
            java.util.ArrayDeque r10 = com.google.android.gms.internal.ads.MD0.f68602g
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
        ArrayDeque arrayDeque = f68602g;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC7451aE0
    public final void zzb() {
        if (this.f68609f) {
            try {
                Handler handler = this.f68606c;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                this.f68608e.c();
                Handler handler2 = this.f68606c;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(3).sendToTarget();
                this.f68608e.a();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7451aE0
    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.f68607d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7451aE0
    public final void zzg() {
        if (this.f68609f) {
            zzb();
            this.f68605b.quit();
        }
        this.f68609f = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7451aE0
    public final void zzh() {
        if (this.f68609f) {
            return;
        }
        this.f68605b.start();
        this.f68606c = new KD0(this, this.f68605b.getLooper());
        this.f68609f = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7451aE0
    public final void a(int i10, int i11, Qx0 qx0, long j10, int i12) {
        zzc();
        LD0 ld0E = e();
        ld0E.a(i10, 0, 0, j10, 0);
        MediaCodec.CryptoInfo cryptoInfo = ld0E.f68311d;
        cryptoInfo.numSubSamples = qx0.f69694f;
        cryptoInfo.numBytesOfClearData = g(qx0.f69692d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = g(qx0.f69693e, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrF = f(qx0.f69690b, cryptoInfo.key);
        bArrF.getClass();
        cryptoInfo.key = bArrF;
        byte[] bArrF2 = f(qx0.f69689a, cryptoInfo.iv);
        bArrF2.getClass();
        cryptoInfo.iv = bArrF2;
        cryptoInfo.mode = qx0.f69691c;
        if (OV.f69091a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(qx0.f69695g, qx0.f69696h));
        }
        this.f68606c.obtainMessage(2, ld0E).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7451aE0
    public final void b(Bundle bundle) {
        zzc();
        Handler handler = this.f68606c;
        int i10 = OV.f69091a;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7451aE0
    public final void c(int i10, int i11, int i12, long j10, int i13) {
        zzc();
        LD0 ld0E = e();
        ld0E.a(i10, 0, i12, j10, i13);
        Handler handler = this.f68606c;
        int i14 = OV.f69091a;
        handler.obtainMessage(1, ld0E).sendToTarget();
    }
}
