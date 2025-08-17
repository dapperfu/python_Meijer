package androidx.media3.exoplayer.source;

import a3.t;
import android.net.Uri;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.C6061l0;
import androidx.media3.exoplayer.source.InterfaceC6084j;
import androidx.media3.exoplayer.source.q;
import h3.M;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.media3.exoplayer.source.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6085k implements q {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f56890a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6084j f56891b;

    /* renamed from: c, reason: collision with root package name */
    private final p3.w f56892c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f56893d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f56894e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference<Throwable> f56895f;

    /* renamed from: g, reason: collision with root package name */
    private com.google.common.util.concurrent.q<?> f56896g;

    /* renamed from: androidx.media3.exoplayer.source.k$a */
    class a implements com.google.common.util.concurrent.j<Object> {
        a() {
        }

        @Override // com.google.common.util.concurrent.j
        public void onFailure(Throwable th2) {
            C6085k.this.f56895f.set(th2);
        }

        @Override // com.google.common.util.concurrent.j
        public void onSuccess(Object obj) {
            C6085k.this.f56894e.set(true);
        }
    }

    /* renamed from: androidx.media3.exoplayer.source.k$b */
    private final class b implements p3.r {

        /* renamed from: a, reason: collision with root package name */
        private int f56898a = 0;

        @Override // p3.r
        public int c(long j10) {
            return 0;
        }

        public b() {
        }

        @Override // p3.r
        public void a() throws IOException {
            Throwable th2 = (Throwable) C6085k.this.f56895f.get();
            if (th2 != null) {
                throw new IOException(th2);
            }
        }

        @Override // p3.r
        public boolean b() {
            return C6085k.this.f56894e.get();
        }

        @Override // p3.r
        public int d(h3.G g10, DecoderInputBuffer decoderInputBuffer, int i10) {
            int i11 = this.f56898a;
            if (i11 == 2) {
                decoderInputBuffer.m(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                g10.f134191b = C6085k.this.f56892c.b(0).a(0);
                this.f56898a = 1;
                return -5;
            }
            if (!C6085k.this.f56894e.get()) {
                return -3;
            }
            int length = C6085k.this.f56893d.length;
            decoderInputBuffer.m(1);
            decoderInputBuffer.f55467f = 0L;
            if ((i10 & 4) == 0) {
                decoderInputBuffer.F(length);
                decoderInputBuffer.f55465d.put(C6085k.this.f56893d, 0, length);
            }
            if ((i10 & 1) == 0) {
                this.f56898a = 2;
            }
            return -4;
        }
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public void e(long j10) {
    }

    @Override // androidx.media3.exoplayer.source.q
    public long h(long j10) {
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long i(s3.y[] yVarArr, boolean[] zArr, p3.r[] rVarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < yVarArr.length; i10++) {
            if (rVarArr[i10] != null && (yVarArr[i10] == null || !zArr[i10])) {
                rVarArr[i10] = null;
            }
            if (rVarArr[i10] == null && yVarArr[i10] != null) {
                rVarArr[i10] = new b();
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long j() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long k(long j10, M m10) {
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void n() {
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean a() {
        return !this.f56894e.get();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean b(C6061l0 c6061l0) {
        return !this.f56894e.get();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long c() {
        return this.f56894e.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long d() {
        return this.f56894e.get() ? Long.MIN_VALUE : 0L;
    }

    public void o() {
        com.google.common.util.concurrent.q<?> qVar = this.f56896g;
        if (qVar != null) {
            qVar.cancel(false);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public p3.w r() {
        return this.f56892c;
    }

    public C6085k(Uri uri, String str, InterfaceC6084j interfaceC6084j) {
        this.f56890a = uri;
        a3.t tVarN = new t.b().u0(str).N();
        this.f56891b = interfaceC6084j;
        this.f56892c = new p3.w(new a3.G(tVarN));
        this.f56893d = uri.toString().getBytes(StandardCharsets.UTF_8);
        this.f56894e = new AtomicBoolean();
        this.f56895f = new AtomicReference<>();
    }

    @Override // androidx.media3.exoplayer.source.q
    public void q(q.a aVar, long j10) {
        aVar.f(this);
        com.google.common.util.concurrent.q<?> qVarA = this.f56891b.a(new InterfaceC6084j.a(this.f56890a));
        this.f56896g = qVarA;
        com.google.common.util.concurrent.k.a(qVarA, new a(), com.google.common.util.concurrent.u.a());
    }
}
