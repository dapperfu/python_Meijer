package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import d3.C13599a;
import d3.P;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class d implements AudioProcessor {

    /* renamed from: b, reason: collision with root package name */
    private final boolean f55608b;

    /* renamed from: c, reason: collision with root package name */
    private int f55609c;

    /* renamed from: d, reason: collision with root package name */
    private float f55610d;

    /* renamed from: e, reason: collision with root package name */
    private float f55611e;

    /* renamed from: f, reason: collision with root package name */
    private AudioProcessor.a f55612f;

    /* renamed from: g, reason: collision with root package name */
    private AudioProcessor.a f55613g;

    /* renamed from: h, reason: collision with root package name */
    private AudioProcessor.a f55614h;

    /* renamed from: i, reason: collision with root package name */
    private AudioProcessor.a f55615i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f55616j;

    /* renamed from: k, reason: collision with root package name */
    private c f55617k;

    /* renamed from: l, reason: collision with root package name */
    private ByteBuffer f55618l;

    /* renamed from: m, reason: collision with root package name */
    private ShortBuffer f55619m;

    /* renamed from: n, reason: collision with root package name */
    private ByteBuffer f55620n;

    /* renamed from: o, reason: collision with root package name */
    private long f55621o;

    /* renamed from: p, reason: collision with root package name */
    private long f55622p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f55623q;

    public d() {
        this(false);
    }

    public void i(float f10) {
        C13599a.a(f10 > 0.0f);
        if (this.f55611e != f10) {
            this.f55611e = f10;
            this.f55616j = true;
        }
    }

    public void j(float f10) {
        C13599a.a(f10 > 0.0f);
        if (this.f55610d != f10) {
            this.f55610d = f10;
            this.f55616j = true;
        }
    }

    d(boolean z10) {
        this.f55610d = 1.0f;
        this.f55611e = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f55567e;
        this.f55612f = aVar;
        this.f55613g = aVar;
        this.f55614h = aVar;
        this.f55615i = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f55565a;
        this.f55618l = byteBuffer;
        this.f55619m = byteBuffer.asShortBuffer();
        this.f55620n = byteBuffer;
        this.f55609c = -1;
        this.f55608b = z10;
    }

    private boolean b() {
        return Math.abs(this.f55610d - 1.0f) < 1.0E-4f && Math.abs(this.f55611e - 1.0f) < 1.0E-4f && this.f55613g.f55568a == this.f55612f.f55568a;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean a() {
        if (this.f55613g.f55568a != -1) {
            return this.f55608b || !b();
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean c() {
        if (!this.f55623q) {
            return false;
        }
        c cVar = this.f55617k;
        return cVar == null || cVar.k() == 0;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer d() {
        int iK;
        c cVar = this.f55617k;
        if (cVar != null && (iK = cVar.k()) > 0) {
            if (this.f55618l.capacity() < iK) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iK).order(ByteOrder.nativeOrder());
                this.f55618l = byteBufferOrder;
                this.f55619m = byteBufferOrder.asShortBuffer();
            } else {
                this.f55618l.clear();
                this.f55619m.clear();
            }
            cVar.j(this.f55619m);
            this.f55622p += iK;
            this.f55618l.limit(iK);
            this.f55620n = this.f55618l;
        }
        ByteBuffer byteBuffer = this.f55620n;
        this.f55620n = AudioProcessor.f55565a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void f() {
        c cVar = this.f55617k;
        if (cVar != null) {
            cVar.s();
        }
        this.f55623q = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f55570c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int i10 = this.f55609c;
        if (i10 == -1) {
            i10 = aVar.f55568a;
        }
        this.f55612f = aVar;
        AudioProcessor.a aVar2 = new AudioProcessor.a(i10, aVar.f55569b, 2);
        this.f55613g = aVar2;
        this.f55616j = true;
        return aVar2;
    }

    public long h(long j10) {
        if (this.f55622p < 1024) {
            return (long) (this.f55610d * j10);
        }
        long jL = this.f55621o - ((c) C13599a.e(this.f55617k)).l();
        int i10 = this.f55615i.f55568a;
        int i11 = this.f55614h.f55568a;
        return i10 == i11 ? P.V0(j10, jL, this.f55622p) : P.V0(j10, jL * i10, this.f55622p * i11);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void reset() {
        this.f55610d = 1.0f;
        this.f55611e = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f55567e;
        this.f55612f = aVar;
        this.f55613g = aVar;
        this.f55614h = aVar;
        this.f55615i = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f55565a;
        this.f55618l = byteBuffer;
        this.f55619m = byteBuffer.asShortBuffer();
        this.f55620n = byteBuffer;
        this.f55609c = -1;
        this.f55616j = false;
        this.f55617k = null;
        this.f55621o = 0L;
        this.f55622p = 0L;
        this.f55623q = false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void e(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        c cVar = (c) C13599a.e(this.f55617k);
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        int iRemaining = byteBuffer.remaining();
        this.f55621o += iRemaining;
        cVar.t(shortBufferAsShortBuffer);
        byteBuffer.position(byteBuffer.position() + iRemaining);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void flush() {
        if (a()) {
            AudioProcessor.a aVar = this.f55612f;
            this.f55614h = aVar;
            AudioProcessor.a aVar2 = this.f55613g;
            this.f55615i = aVar2;
            if (this.f55616j) {
                this.f55617k = new c(aVar.f55568a, aVar.f55569b, this.f55610d, this.f55611e, aVar2.f55568a);
            } else {
                c cVar = this.f55617k;
                if (cVar != null) {
                    cVar.i();
                }
            }
        }
        this.f55620n = AudioProcessor.f55565a;
        this.f55621o = 0L;
        this.f55622p = 0L;
        this.f55623q = false;
    }
}
