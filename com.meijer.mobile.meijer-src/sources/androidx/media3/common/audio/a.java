package androidx.media3.common.audio;

import Ee.L;
import androidx.media3.common.audio.AudioProcessor;
import d3.C13599a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final L<AudioProcessor> f55572a;

    /* renamed from: b, reason: collision with root package name */
    private final List<AudioProcessor> f55573b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f55574c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    private AudioProcessor.a f55575d;

    /* renamed from: e, reason: collision with root package name */
    private AudioProcessor.a f55576e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f55577f;

    private void g(ByteBuffer byteBuffer) {
        boolean z10;
        for (boolean z11 = true; z11; z11 = z10) {
            z10 = false;
            int i10 = 0;
            while (i10 <= c()) {
                if (!this.f55574c[i10].hasRemaining()) {
                    AudioProcessor audioProcessor = this.f55573b.get(i10);
                    if (!audioProcessor.c()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f55574c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.f55565a;
                        long jRemaining = byteBuffer2.remaining();
                        audioProcessor.e(byteBuffer2);
                        this.f55574c[i10] = audioProcessor.d();
                        z10 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f55574c[i10].hasRemaining();
                    } else if (!this.f55574c[i10].hasRemaining() && i10 < c()) {
                        this.f55573b.get(i10 + 1).f();
                    }
                }
                i10++;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f55572a.size() != aVar.f55572a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f55572a.size(); i10++) {
            if (this.f55572a.get(i10) != aVar.f55572a.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public void j() {
        for (int i10 = 0; i10 < this.f55572a.size(); i10++) {
            AudioProcessor audioProcessor = this.f55572a.get(i10);
            audioProcessor.flush();
            audioProcessor.reset();
        }
        this.f55574c = new ByteBuffer[0];
        AudioProcessor.a aVar = AudioProcessor.a.f55567e;
        this.f55575d = aVar;
        this.f55576e = aVar;
        this.f55577f = false;
    }

    private int c() {
        return this.f55574c.length - 1;
    }

    public AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.equals(AudioProcessor.a.f55567e)) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        for (int i10 = 0; i10 < this.f55572a.size(); i10++) {
            AudioProcessor audioProcessor = this.f55572a.get(i10);
            AudioProcessor.a aVarG = audioProcessor.g(aVar);
            if (audioProcessor.a()) {
                C13599a.g(!aVarG.equals(AudioProcessor.a.f55567e));
                aVar = aVarG;
            }
        }
        this.f55576e = aVar;
        return aVar;
    }

    public void b() {
        this.f55573b.clear();
        this.f55575d = this.f55576e;
        this.f55577f = false;
        for (int i10 = 0; i10 < this.f55572a.size(); i10++) {
            AudioProcessor audioProcessor = this.f55572a.get(i10);
            audioProcessor.flush();
            if (audioProcessor.a()) {
                this.f55573b.add(audioProcessor);
            }
        }
        this.f55574c = new ByteBuffer[this.f55573b.size()];
        for (int i11 = 0; i11 <= c(); i11++) {
            this.f55574c[i11] = this.f55573b.get(i11).d();
        }
    }

    public boolean e() {
        return this.f55577f && this.f55573b.get(c()).c() && !this.f55574c[c()].hasRemaining();
    }

    public boolean f() {
        return !this.f55573b.isEmpty();
    }

    public int hashCode() {
        return this.f55572a.hashCode();
    }

    public a(L<AudioProcessor> l10) {
        this.f55572a = l10;
        AudioProcessor.a aVar = AudioProcessor.a.f55567e;
        this.f55575d = aVar;
        this.f55576e = aVar;
        this.f55577f = false;
    }

    public ByteBuffer d() {
        if (!f()) {
            return AudioProcessor.f55565a;
        }
        ByteBuffer byteBuffer = this.f55574c[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        g(AudioProcessor.f55565a);
        return this.f55574c[c()];
    }

    public void h() {
        if (f() && !this.f55577f) {
            this.f55577f = true;
            this.f55573b.get(0).f();
        }
    }

    public void i(ByteBuffer byteBuffer) {
        if (f() && !this.f55577f) {
            g(byteBuffer);
        }
    }
}
