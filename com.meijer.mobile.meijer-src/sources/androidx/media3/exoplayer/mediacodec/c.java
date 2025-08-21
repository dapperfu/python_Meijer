package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import d3.C13599a;
import d3.C13609k;
import d3.P;
import g3.C14325c;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
class c implements i {

    /* renamed from: g, reason: collision with root package name */
    private static final ArrayDeque<b> f56670g = new ArrayDeque<>();

    /* renamed from: h, reason: collision with root package name */
    private static final Object f56671h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f56672a;

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f56673b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f56674c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference<RuntimeException> f56675d;

    /* renamed from: e, reason: collision with root package name */
    private final C13609k f56676e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f56677f;

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws MediaCodec.CryptoException {
            c.this.j(message);
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f56679a;

        /* renamed from: b, reason: collision with root package name */
        public int f56680b;

        /* renamed from: c, reason: collision with root package name */
        public int f56681c;

        /* renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f56682d = new MediaCodec.CryptoInfo();

        /* renamed from: e, reason: collision with root package name */
        public long f56683e;

        /* renamed from: f, reason: collision with root package name */
        public int f56684f;

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f56679a = i10;
            this.f56680b = i11;
            this.f56681c = i12;
            this.f56683e = j10;
            this.f56684f = i13;
        }

        b() {
        }
    }

    public c(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new C13609k());
    }

    c(MediaCodec mediaCodec, HandlerThread handlerThread, C13609k c13609k) {
        this.f56672a = mediaCodec;
        this.f56673b = handlerThread;
        this.f56676e = c13609k;
        this.f56675d = new AtomicReference<>();
    }

    private void f() throws InterruptedException {
        this.f56676e.c();
        ((Handler) C13599a.e(this.f56674c)).obtainMessage(3).sendToTarget();
        this.f56676e.a();
    }

    private static void g(C14325c c14325c, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = c14325c.f133999f;
        cryptoInfo.numBytesOfClearData = i(c14325c.f133997d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = i(c14325c.f133998e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) C13599a.e(h(c14325c.f133995b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) C13599a.e(h(c14325c.f133994a, cryptoInfo.iv));
        cryptoInfo.mode = c14325c.f133996c;
        if (P.f127888a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c14325c.f134000g, c14325c.f134001h));
        }
    }

    private static byte[] h(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] i(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(android.os.Message r9) throws android.media.MediaCodec.CryptoException {
        /*
            r8 = this;
            int r2 = r9.what
            r3 = 1
            if (r2 == r3) goto L43
            r3 = 2
            if (r2 == r3) goto L2e
            r3 = 3
            r4 = 0
            if (r2 == r3) goto L28
            r3 = 4
            if (r2 == r3) goto L20
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r2 = r8.f56675d
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            int r1 = r9.what
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.<init>(r1)
            U.d.a(r2, r4, r3)
            goto L57
        L20:
            java.lang.Object r1 = r9.obj
            android.os.Bundle r1 = (android.os.Bundle) r1
            r8.m(r1)
            goto L57
        L28:
            d3.k r1 = r8.f56676e
            r1.e()
            goto L57
        L2e:
            java.lang.Object r1 = r9.obj
            r7 = r1
            androidx.media3.exoplayer.mediacodec.c$b r7 = (androidx.media3.exoplayer.mediacodec.c.b) r7
            int r1 = r7.f56679a
            int r2 = r7.f56680b
            android.media.MediaCodec$CryptoInfo r3 = r7.f56682d
            long r4 = r7.f56683e
            int r6 = r7.f56684f
            r0 = r8
            r0.l(r1, r2, r3, r4, r6)
        L41:
            r4 = r7
            goto L57
        L43:
            java.lang.Object r0 = r9.obj
            r7 = r0
            androidx.media3.exoplayer.mediacodec.c$b r7 = (androidx.media3.exoplayer.mediacodec.c.b) r7
            int r1 = r7.f56679a
            int r2 = r7.f56680b
            int r3 = r7.f56681c
            long r4 = r7.f56683e
            int r6 = r7.f56684f
            r0 = r8
            r0.k(r1, r2, r3, r4, r6)
            goto L41
        L57:
            if (r4 == 0) goto L5c
            p(r4)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.c.j(android.os.Message):void");
    }

    private void k(int i10, int i11, int i12, long j10, int i13) throws MediaCodec.CryptoException {
        try {
            this.f56672a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            U.d.a(this.f56675d, null, e10);
        }
    }

    private void l(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f56671h) {
                this.f56672a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            U.d.a(this.f56675d, null, e10);
        }
    }

    private void m(Bundle bundle) {
        try {
            this.f56672a.setParameters(bundle);
        } catch (RuntimeException e10) {
            U.d.a(this.f56675d, null, e10);
        }
    }

    private void n() throws InterruptedException {
        ((Handler) C13599a.e(this.f56674c)).removeCallbacksAndMessages(null);
        f();
    }

    private static b o() {
        ArrayDeque<b> arrayDeque = f56670g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void p(b bVar) {
        ArrayDeque<b> arrayDeque = f56670g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void d() {
        RuntimeException andSet = this.f56675d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void flush() {
        if (this.f56677f) {
            try {
                n();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void shutdown() {
        if (this.f56677f) {
            flush();
            this.f56673b.quit();
        }
        this.f56677f = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void start() {
        if (this.f56677f) {
            return;
        }
        this.f56673b.start();
        this.f56674c = new a(this.f56673b.getLooper());
        this.f56677f = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void a(int i10, int i11, int i12, long j10, int i13) {
        d();
        b bVarO = o();
        bVarO.a(i10, i11, i12, j10, i13);
        ((Handler) P.h(this.f56674c)).obtainMessage(1, bVarO).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void b(Bundle bundle) {
        d();
        ((Handler) P.h(this.f56674c)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void c(int i10, int i11, C14325c c14325c, long j10, int i12) {
        d();
        b bVarO = o();
        bVarO.a(i10, i11, 0, j10, i12);
        g(c14325c, bVarO.f56682d);
        ((Handler) P.h(this.f56674c)).obtainMessage(2, bVarO).sendToTarget();
    }
}
