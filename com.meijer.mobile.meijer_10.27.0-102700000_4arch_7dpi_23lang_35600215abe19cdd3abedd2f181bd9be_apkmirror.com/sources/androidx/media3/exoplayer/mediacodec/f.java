package androidx.media3.exoplayer.mediacodec;

import androidx.media3.decoder.DecoderInputBuffer;
import d3.C13466a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class f extends DecoderInputBuffer {

    /* renamed from: j, reason: collision with root package name */
    private long f56477j;

    /* renamed from: k, reason: collision with root package name */
    private int f56478k;

    /* renamed from: l, reason: collision with root package name */
    private int f56479l;

    public f() {
        super(2);
        this.f56479l = 32;
    }

    public long M() {
        return this.f55467f;
    }

    public long N() {
        return this.f56477j;
    }

    public int O() {
        return this.f56478k;
    }

    public boolean P() {
        return this.f56478k > 0;
    }

    public void Q(int i10) {
        C13466a.a(i10 > 0);
        this.f56479l = i10;
    }

    private boolean L(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (!P()) {
            return true;
        }
        if (this.f56478k >= this.f56479l) {
            return false;
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.f55465d;
        if (byteBuffer2 == null || (byteBuffer = this.f55465d) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000) {
            return true;
        }
        return false;
    }

    public boolean K(DecoderInputBuffer decoderInputBuffer) {
        C13466a.a(!decoderInputBuffer.H());
        C13466a.a(!decoderInputBuffer.t());
        C13466a.a(!decoderInputBuffer.u());
        if (!L(decoderInputBuffer)) {
            return false;
        }
        int i10 = this.f56478k;
        this.f56478k = i10 + 1;
        if (i10 == 0) {
            this.f55467f = decoderInputBuffer.f55467f;
            if (decoderInputBuffer.z()) {
                D(1);
            }
        }
        ByteBuffer byteBuffer = decoderInputBuffer.f55465d;
        if (byteBuffer != null) {
            F(byteBuffer.remaining());
            this.f55465d.put(byteBuffer);
        }
        this.f56477j = decoderInputBuffer.f55467f;
        return true;
    }

    @Override // androidx.media3.decoder.DecoderInputBuffer, g3.AbstractC14194a
    public void o() {
        super.o();
        this.f56478k = 0;
    }
}
