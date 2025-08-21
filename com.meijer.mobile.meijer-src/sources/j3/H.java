package j3;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.decoder.DecoderInputBuffer;
import com.medallia.digital.mobilesdk.l3;
import d3.C13599a;
import d3.P;
import fsimpl.C14170dq;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f139779d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f139780e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, C14170dq.DST_ATOP, -103, 87, 83, 1, C14170dq.SCREEN, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    private ByteBuffer f139781a = AudioProcessor.f55565a;

    /* renamed from: c, reason: collision with root package name */
    private int f139783c = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f139782b = 2;

    private void e(ByteBuffer byteBuffer, byte[] bArr) {
        f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(Je.i.a(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, P.w(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    private ByteBuffer b(ByteBuffer byteBuffer, byte[] bArr) {
        int i10;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit - iPosition;
        int i12 = (i11 + l3.f93323c) / l3.f93323c;
        int length = i12 + 27 + i11;
        if (this.f139782b == 2) {
            int length2 = bArr != null ? bArr.length + 28 : f139779d.length;
            length += f139780e.length + length2;
            i10 = length2;
        } else {
            i10 = 0;
        }
        ByteBuffer byteBufferC = c(length);
        if (this.f139782b == 2) {
            if (bArr != null) {
                e(byteBufferC, bArr);
            } else {
                byteBufferC.put(f139779d);
            }
            byteBufferC.put(f139780e);
        }
        int iJ = this.f139783c + x3.H.j(byteBuffer);
        this.f139783c = iJ;
        f(byteBufferC, iJ, this.f139782b, i12, false);
        for (int i13 = 0; i13 < i12; i13++) {
            if (i11 >= 255) {
                byteBufferC.put((byte) -1);
                i11 -= 255;
            } else {
                byteBufferC.put((byte) i11);
                i11 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBufferC.put(byteBuffer.get(iPosition));
            iPosition++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferC.flip();
        if (this.f139782b == 2) {
            byte[] bArrArray = byteBufferC.array();
            int iArrayOffset = byteBufferC.arrayOffset() + i10;
            byte[] bArr2 = f139780e;
            byteBufferC.putInt(i10 + bArr2.length + 22, P.w(bArrArray, iArrayOffset + bArr2.length, byteBufferC.limit() - byteBufferC.position(), 0));
        } else {
            byteBufferC.putInt(22, P.w(byteBufferC.array(), byteBufferC.arrayOffset(), byteBufferC.limit() - byteBufferC.position(), 0));
        }
        this.f139782b++;
        return byteBufferC;
    }

    private ByteBuffer c(int i10) {
        if (this.f139781a.capacity() < i10) {
            this.f139781a = ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f139781a.clear();
        }
        return this.f139781a;
    }

    private void f(ByteBuffer byteBuffer, long j10, int i10, int i11, boolean z10) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z10 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j10);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i10);
        byteBuffer.putInt(0);
        byteBuffer.put(Je.i.a(i11));
    }

    public void a(DecoderInputBuffer decoderInputBuffer, List<byte[]> list) {
        C13599a.e(decoderInputBuffer.f55689d);
        if (decoderInputBuffer.f55689d.limit() - decoderInputBuffer.f55689d.position() == 0) {
            return;
        }
        this.f139781a = b(decoderInputBuffer.f55689d, (this.f139782b == 2 && (list.size() == 1 || list.size() == 3)) ? list.get(0) : null);
        decoderInputBuffer.o();
        decoderInputBuffer.F(this.f139781a.remaining());
        decoderInputBuffer.f55689d.put(this.f139781a);
        decoderInputBuffer.G();
    }

    public void d() {
        this.f139781a = AudioProcessor.f55565a;
        this.f139783c = 0;
        this.f139782b = 2;
    }
}
