package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class b implements AudioProcessor {

    /* renamed from: b, reason: collision with root package name */
    protected AudioProcessor.a f55578b;

    /* renamed from: c, reason: collision with root package name */
    protected AudioProcessor.a f55579c;

    /* renamed from: d, reason: collision with root package name */
    private AudioProcessor.a f55580d;

    /* renamed from: e, reason: collision with root package name */
    private AudioProcessor.a f55581e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f55582f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f55583g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f55584h;

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void f() {
        this.f55584h = true;
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
        return this.f55581e != AudioProcessor.a.f55567e;
    }

    protected final boolean b() {
        return this.f55583g.hasRemaining();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean c() {
        return this.f55584h && this.f55583g == AudioProcessor.f55565a;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.f55583g;
        this.f55583g = AudioProcessor.f55565a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        this.f55583g = AudioProcessor.f55565a;
        this.f55584h = false;
        this.f55578b = this.f55580d;
        this.f55579c = this.f55581e;
        i();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        this.f55580d = aVar;
        this.f55581e = h(aVar);
        return a() ? this.f55581e : AudioProcessor.a.f55567e;
    }

    protected final ByteBuffer l(int i10) {
        if (this.f55582f.capacity() < i10) {
            this.f55582f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f55582f.clear();
        }
        ByteBuffer byteBuffer = this.f55582f;
        this.f55583g = byteBuffer;
        return byteBuffer;
    }

    public b() {
        ByteBuffer byteBuffer = AudioProcessor.f55565a;
        this.f55582f = byteBuffer;
        this.f55583g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f55567e;
        this.f55580d = aVar;
        this.f55581e = aVar;
        this.f55578b = aVar;
        this.f55579c = aVar;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f55582f = AudioProcessor.f55565a;
        AudioProcessor.a aVar = AudioProcessor.a.f55567e;
        this.f55580d = aVar;
        this.f55581e = aVar;
        this.f55578b = aVar;
        this.f55579c = aVar;
        k();
    }
}
