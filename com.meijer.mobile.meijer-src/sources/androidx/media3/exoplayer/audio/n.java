package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import d3.P;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class n extends androidx.media3.common.audio.b {

    /* renamed from: i, reason: collision with root package name */
    private static final int f56224i = Float.floatToIntBits(Float.NaN);

    @Override // androidx.media3.common.audio.b
    public AudioProcessor.a h(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i10 = aVar.f55570c;
        if (P.B0(i10)) {
            return i10 != 4 ? new AudioProcessor.a(aVar.f55568a, aVar.f55569b, 4) : AudioProcessor.a.f55567e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    n() {
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void e(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferL;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f55578b.f55570c;
        if (i11 != 21) {
            if (i11 != 22) {
                if (i11 != 1342177280) {
                    if (i11 == 1610612736) {
                        byteBufferL = l(i10);
                        while (iPosition < iLimit) {
                            m((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferL);
                            iPosition += 4;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    byteBufferL = l((i10 / 3) * 4);
                    while (iPosition < iLimit) {
                        m(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferL);
                        iPosition += 3;
                    }
                }
            } else {
                byteBufferL = l(i10);
                while (iPosition < iLimit) {
                    m((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferL);
                    iPosition += 4;
                }
            }
        } else {
            byteBufferL = l((i10 / 3) * 4);
            while (iPosition < iLimit) {
                m(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferL);
                iPosition += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferL.flip();
    }

    private static void m(int i10, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (iFloatToIntBits == f56224i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }
}
