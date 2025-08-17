package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class b implements AudioProcessor {

    /* renamed from: b, reason: collision with root package name */
    protected AudioProcessor.a f55354b;

    /* renamed from: c, reason: collision with root package name */
    protected AudioProcessor.a f55355c;

    /* renamed from: d, reason: collision with root package name */
    private AudioProcessor.a f55356d;

    /* renamed from: e, reason: collision with root package name */
    private AudioProcessor.a f55357e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f55358f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f55359g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f55360h;

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void f() {
        this.f55360h = true;
        j();
    }

    protected abstract AudioProcessor.a h(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException;

    protected void i() {
    }

    protected void j() {
    }

    protected void k() {
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean a() {
        return this.f55357e != AudioProcessor.a.f55343e;
    }

    protected final boolean b() {
        return this.f55359g.hasRemaining();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean c() {
        return this.f55360h && this.f55359g == AudioProcessor.f55341a;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.f55359g;
        this.f55359g = AudioProcessor.f55341a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        this.f55359g = AudioProcessor.f55341a;
        this.f55360h = false;
        this.f55354b = this.f55356d;
        this.f55355c = this.f55357e;
        i();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        this.f55356d = aVar;
        this.f55357e = h(aVar);
        return a() ? this.f55357e : AudioProcessor.a.f55343e;
    }

    protected final ByteBuffer l(int i10) {
        if (this.f55358f.capacity() < i10) {
            this.f55358f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f55358f.clear();
        }
        ByteBuffer byteBuffer = this.f55358f;
        this.f55359g = byteBuffer;
        return byteBuffer;
    }

    public b() {
        ByteBuffer byteBuffer = AudioProcessor.f55341a;
        this.f55358f = byteBuffer;
        this.f55359g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f55343e;
        this.f55356d = aVar;
        this.f55357e = aVar;
        this.f55354b = aVar;
        this.f55355c = aVar;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f55358f = AudioProcessor.f55341a;
        AudioProcessor.a aVar = AudioProcessor.a.f55343e;
        this.f55356d = aVar;
        this.f55357e = aVar;
        this.f55354b = aVar;
        this.f55355c = aVar;
        k();
    }
}
