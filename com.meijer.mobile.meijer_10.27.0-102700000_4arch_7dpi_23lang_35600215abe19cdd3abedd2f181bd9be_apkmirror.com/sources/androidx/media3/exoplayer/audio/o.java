package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import d3.P;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class o extends androidx.media3.common.audio.b {

    /* renamed from: i, reason: collision with root package name */
    private int f56001i;

    /* renamed from: j, reason: collision with root package name */
    private int f56002j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f56003k;

    /* renamed from: l, reason: collision with root package name */
    private int f56004l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f56005m = P.f127091f;

    /* renamed from: n, reason: collision with root package name */
    private int f56006n;

    /* renamed from: o, reason: collision with root package name */
    private long f56007o;

    @Override // androidx.media3.common.audio.b
    public AudioProcessor.a h(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i10 = aVar.f55346c;
        if (i10 != 2 && i10 != 4) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        this.f56003k = true;
        return (this.f56001i == 0 && this.f56002j == 0) ? AudioProcessor.a.f55343e : aVar;
    }

    @Override // androidx.media3.common.audio.b
    protected void i() {
        if (this.f56003k) {
            this.f56003k = false;
            int i10 = this.f56002j;
            int i11 = this.f55354b.f55347d;
            this.f56005m = new byte[i10 * i11];
            this.f56004l = this.f56001i * i11;
        }
        this.f56006n = 0;
    }

    @Override // androidx.media3.common.audio.b
    protected void j() {
        if (this.f56003k) {
            if (this.f56006n > 0) {
                this.f56007o += r0 / this.f55354b.f55347d;
            }
            this.f56006n = 0;
        }
    }

    @Override // androidx.media3.common.audio.b
    protected void k() {
        this.f56005m = P.f127091f;
    }

    public long m() {
        return this.f56007o;
    }

    public void n() {
        this.f56007o = 0L;
    }

    public void o(int i10, int i11) {
        this.f56001i = i10;
        this.f56002j = i11;
    }

    @Override // androidx.media3.common.audio.b, androidx.media3.common.audio.AudioProcessor
    public boolean c() {
        if (super.c() && this.f56006n == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.b, androidx.media3.common.audio.AudioProcessor
    public ByteBuffer d() {
        int i10;
        if (super.c() && (i10 = this.f56006n) > 0) {
            l(i10).put(this.f56005m, 0, this.f56006n).flip();
            this.f56006n = 0;
        }
        return super.d();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void e(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 != 0) {
            int iMin = Math.min(i10, this.f56004l);
            this.f56007o += iMin / this.f55354b.f55347d;
            this.f56004l -= iMin;
            byteBuffer.position(iPosition + iMin);
            if (this.f56004l > 0) {
                return;
            }
            int i11 = i10 - iMin;
            int length = (this.f56006n + i11) - this.f56005m.length;
            ByteBuffer byteBufferL = l(length);
            int iO = P.o(length, 0, this.f56006n);
            byteBufferL.put(this.f56005m, 0, iO);
            int iO2 = P.o(length - iO, 0, i11);
            byteBuffer.limit(byteBuffer.position() + iO2);
            byteBufferL.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i12 = i11 - iO2;
            int i13 = this.f56006n - iO;
            this.f56006n = i13;
            byte[] bArr = this.f56005m;
            System.arraycopy(bArr, iO, bArr, 0, i13);
            byteBuffer.get(this.f56005m, this.f56006n, i12);
            this.f56006n += i12;
            byteBufferL.flip();
        }
    }
}
