package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import d3.C13599a;
import d3.P;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class h extends androidx.media3.common.audio.b {

    /* renamed from: i, reason: collision with root package name */
    private int[] f56188i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f56189j;

    @Override // androidx.media3.common.audio.b
    protected void k() {
        this.f56189j = null;
        this.f56188i = null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void e(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) C13599a.e(this.f56189j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferL = l(((iLimit - iPosition) / this.f55578b.f55571d) * this.f55579c.f55571d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                int iP = (P.P(this.f55578b.f55570c) * i10) + iPosition;
                int i11 = this.f55578b.f55570c;
                if (i11 == 2) {
                    byteBufferL.putShort(byteBuffer.getShort(iP));
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException("Unexpected encoding: " + this.f55578b.f55570c);
                    }
                    byteBufferL.putFloat(byteBuffer.getFloat(iP));
                }
            }
            iPosition += this.f55578b.f55571d;
        }
        byteBuffer.position(iLimit);
        byteBufferL.flip();
    }

    @Override // androidx.media3.common.audio.b
    public AudioProcessor.a h(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f56188i;
        if (iArr == null) {
            return AudioProcessor.a.f55567e;
        }
        int i10 = aVar.f55570c;
        if (i10 != 2 && i10 != 4) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        boolean z10 = aVar.f55569b != iArr.length;
        int i11 = 0;
        while (i11 < iArr.length) {
            int i12 = iArr[i11];
            if (i12 >= aVar.f55569b) {
                throw new AudioProcessor.UnhandledAudioFormatException("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", aVar);
            }
            z10 |= i12 != i11;
            i11++;
        }
        return z10 ? new AudioProcessor.a(aVar.f55568a, iArr.length, aVar.f55570c) : AudioProcessor.a.f55567e;
    }

    @Override // androidx.media3.common.audio.b
    protected void i() {
        this.f56189j = this.f56188i;
    }

    public void m(int[] iArr) {
        this.f56188i = iArr;
    }

    h() {
    }
}
