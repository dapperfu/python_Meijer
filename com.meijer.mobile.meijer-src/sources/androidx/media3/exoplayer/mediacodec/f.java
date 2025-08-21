package androidx.media3.exoplayer.mediacodec;

import androidx.media3.decoder.DecoderInputBuffer;
import d3.C13599a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class f extends DecoderInputBuffer {

    /* renamed from: j, reason: collision with root package name */
    private long f56701j;

    /* renamed from: k, reason: collision with root package name */
    private int f56702k;

    /* renamed from: l, reason: collision with root package name */
    private int f56703l;

    public f() {
        super(2);
        this.f56703l = 32;
    }

    public long M() {
        return this.f55691f;
    }

    public long N() {
        return this.f56701j;
    }

    public int O() {
        return this.f56702k;
    }

    public boolean P() {
        return this.f56702k > 0;
    }

    public void Q(int i10) {
        C13599a.a(i10 > 0);
        this.f56703l = i10;
    }

    private boolean L(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (!P()) {
            return true;
        }
        if (this.f56702k >= this.f56703l) {
            return false;
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.f55689d;
        if (byteBuffer2 == null || (byteBuffer = this.f55689d) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000) {
            return true;
        }
        return false;
    }

    public boolean K(DecoderInputBuffer decoderInputBuffer) {
        C13599a.a(!decoderInputBuffer.H());
        C13599a.a(!decoderInputBuffer.t());
        C13599a.a(!decoderInputBuffer.u());
        if (!L(decoderInputBuffer)) {
            return false;
        }
        int i10 = this.f56702k;
        this.f56702k = i10 + 1;
        if (i10 == 0) {
            this.f55691f = decoderInputBuffer.f55691f;
            if (decoderInputBuffer.z()) {
                D(1);
            }
        }
        ByteBuffer byteBuffer = decoderInputBuffer.f55689d;
        if (byteBuffer != null) {
            F(byteBuffer.remaining());
            this.f55689d.put(byteBuffer);
        }
        this.f56701j = decoderInputBuffer.f55691f;
        return true;
    }

    @Override // androidx.media3.decoder.DecoderInputBuffer, g3.AbstractC14323a
    public void o() {
        super.o();
        this.f56702k = 0;
    }
}
