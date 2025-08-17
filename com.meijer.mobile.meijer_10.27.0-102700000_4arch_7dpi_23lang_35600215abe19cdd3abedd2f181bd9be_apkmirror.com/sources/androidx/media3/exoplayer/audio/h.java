package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import d3.C13466a;
import d3.P;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class h extends androidx.media3.common.audio.b {

    /* renamed from: i, reason: collision with root package name */
    private int[] f55964i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f55965j;

    @Override // androidx.media3.common.audio.b
    protected void k() {
        this.f55965j = null;
        this.f55964i = null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void e(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) C13466a.e(this.f55965j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferL = l(((iLimit - iPosition) / this.f55354b.f55347d) * this.f55355c.f55347d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                int iP = (P.P(this.f55354b.f55346c) * i10) + iPosition;
                int i11 = this.f55354b.f55346c;
                if (i11 == 2) {
                    byteBufferL.putShort(byteBuffer.getShort(iP));
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException("Unexpected encoding: " + this.f55354b.f55346c);
                    }
                    byteBufferL.putFloat(byteBuffer.getFloat(iP));
                }
            }
            iPosition += this.f55354b.f55347d;
        }
        byteBuffer.position(iLimit);
        byteBufferL.flip();
    }

    @Override // androidx.media3.common.audio.b
    public AudioProcessor.a h(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f55964i;
        if (iArr == null) {
            return AudioProcessor.a.f55343e;
        }
        int i10 = aVar.f55346c;
        if (i10 != 2 && i10 != 4) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        boolean z10 = aVar.f55345b != iArr.length;
        int i11 = 0;
        while (i11 < iArr.length) {
            int i12 = iArr[i11];
            if (i12 >= aVar.f55345b) {
                throw new AudioProcessor.UnhandledAudioFormatException("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", aVar);
            }
            z10 |= i12 != i11;
            i11++;
        }
        return z10 ? new AudioProcessor.a(aVar.f55344a, iArr.length, aVar.f55346c) : AudioProcessor.a.f55343e;
    }

    @Override // androidx.media3.common.audio.b
    protected void i() {
        this.f55965j = this.f55964i;
    }

    public void m(int[] iArr) {
        this.f55964i = iArr;
    }

    h() {
    }
}
