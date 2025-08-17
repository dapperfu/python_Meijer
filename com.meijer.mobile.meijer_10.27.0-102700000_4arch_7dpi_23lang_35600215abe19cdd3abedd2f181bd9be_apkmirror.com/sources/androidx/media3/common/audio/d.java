package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import d3.C13466a;
import d3.P;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class d implements AudioProcessor {

    /* renamed from: b, reason: collision with root package name */
    private final boolean f55384b;

    /* renamed from: c, reason: collision with root package name */
    private int f55385c;

    /* renamed from: d, reason: collision with root package name */
    private float f55386d;

    /* renamed from: e, reason: collision with root package name */
    private float f55387e;

    /* renamed from: f, reason: collision with root package name */
    private AudioProcessor.a f55388f;

    /* renamed from: g, reason: collision with root package name */
    private AudioProcessor.a f55389g;

    /* renamed from: h, reason: collision with root package name */
    private AudioProcessor.a f55390h;

    /* renamed from: i, reason: collision with root package name */
    private AudioProcessor.a f55391i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f55392j;

    /* renamed from: k, reason: collision with root package name */
    private c f55393k;

    /* renamed from: l, reason: collision with root package name */
    private ByteBuffer f55394l;

    /* renamed from: m, reason: collision with root package name */
    private ShortBuffer f55395m;

    /* renamed from: n, reason: collision with root package name */
    private ByteBuffer f55396n;

    /* renamed from: o, reason: collision with root package name */
    private long f55397o;

    /* renamed from: p, reason: collision with root package name */
    private long f55398p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f55399q;

    public d() {
        this(false);
    }

    public void i(float f10) {
        C13466a.a(f10 > 0.0f);
        if (this.f55387e != f10) {
            this.f55387e = f10;
            this.f55392j = true;
        }
    }

    public void j(float f10) {
        C13466a.a(f10 > 0.0f);
        if (this.f55386d != f10) {
            this.f55386d = f10;
            this.f55392j = true;
        }
    }

    d(boolean z10) {
        this.f55386d = 1.0f;
        this.f55387e = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f55343e;
        this.f55388f = aVar;
        this.f55389g = aVar;
        this.f55390h = aVar;
        this.f55391i = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f55341a;
        this.f55394l = byteBuffer;
        this.f55395m = byteBuffer.asShortBuffer();
        this.f55396n = byteBuffer;
        this.f55385c = -1;
        this.f55384b = z10;
    }

    private boolean b() {
        return Math.abs(this.f55386d - 1.0f) < 1.0E-4f && Math.abs(this.f55387e - 1.0f) < 1.0E-4f && this.f55389g.f55344a == this.f55388f.f55344a;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean a() {
        if (this.f55389g.f55344a != -1) {
            return this.f55384b || !b();
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean c() {
        if (!this.f55399q) {
            return false;
        }
        c cVar = this.f55393k;
        return cVar == null || cVar.k() == 0;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer d() {
        int iK;
        c cVar = this.f55393k;
        if (cVar != null && (iK = cVar.k()) > 0) {
            if (this.f55394l.capacity() < iK) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iK).order(ByteOrder.nativeOrder());
                this.f55394l = byteBufferOrder;
                this.f55395m = byteBufferOrder.asShortBuffer();
            } else {
                this.f55394l.clear();
                this.f55395m.clear();
            }
            cVar.j(this.f55395m);
            this.f55398p += iK;
            this.f55394l.limit(iK);
            this.f55396n = this.f55394l;
        }
        ByteBuffer byteBuffer = this.f55396n;
        this.f55396n = AudioProcessor.f55341a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void f() {
        c cVar = this.f55393k;
        if (cVar != null) {
            cVar.s();
        }
        this.f55399q = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f55346c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int i10 = this.f55385c;
        if (i10 == -1) {
            i10 = aVar.f55344a;
        }
        this.f55388f = aVar;
        AudioProcessor.a aVar2 = new AudioProcessor.a(i10, aVar.f55345b, 2);
        this.f55389g = aVar2;
        this.f55392j = true;
        return aVar2;
    }

    public long h(long j10) {
        if (this.f55398p < 1024) {
            return (long) (this.f55386d * j10);
        }
        long jL = this.f55397o - ((c) C13466a.e(this.f55393k)).l();
        int i10 = this.f55391i.f55344a;
        int i11 = this.f55390h.f55344a;
        return i10 == i11 ? P.V0(j10, jL, this.f55398p) : P.V0(j10, jL * i10, this.f55398p * i11);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void reset() {
        this.f55386d = 1.0f;
        this.f55387e = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f55343e;
        this.f55388f = aVar;
        this.f55389g = aVar;
        this.f55390h = aVar;
        this.f55391i = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f55341a;
        this.f55394l = byteBuffer;
        this.f55395m = byteBuffer.asShortBuffer();
        this.f55396n = byteBuffer;
        this.f55385c = -1;
        this.f55392j = false;
        this.f55393k = null;
        this.f55397o = 0L;
        this.f55398p = 0L;
        this.f55399q = false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void e(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        c cVar = (c) C13466a.e(this.f55393k);
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        int iRemaining = byteBuffer.remaining();
        this.f55397o += iRemaining;
        cVar.t(shortBufferAsShortBuffer);
        byteBuffer.position(byteBuffer.position() + iRemaining);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void flush() {
        if (a()) {
            AudioProcessor.a aVar = this.f55388f;
            this.f55390h = aVar;
            AudioProcessor.a aVar2 = this.f55389g;
            this.f55391i = aVar2;
            if (this.f55392j) {
                this.f55393k = new c(aVar.f55344a, aVar.f55345b, this.f55386d, this.f55387e, aVar2.f55344a);
            } else {
                c cVar = this.f55393k;
                if (cVar != null) {
                    cVar.i();
                }
            }
        }
        this.f55396n = AudioProcessor.f55341a;
        this.f55397o = 0L;
        this.f55398p = 0L;
        this.f55399q = false;
    }
}
