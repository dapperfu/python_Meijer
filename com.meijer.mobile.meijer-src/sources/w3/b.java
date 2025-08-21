package w3;

import a3.t;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.AbstractC6194h;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.I0;
import d3.D;
import d3.P;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends AbstractC6194h {

    /* renamed from: r, reason: collision with root package name */
    private final DecoderInputBuffer f166864r;

    /* renamed from: s, reason: collision with root package name */
    private final D f166865s;

    /* renamed from: t, reason: collision with root package name */
    private InterfaceC17822a f166866t;

    /* renamed from: u, reason: collision with root package name */
    private long f166867u;

    public b() {
        super(6);
        this.f166864r = new DecoderInputBuffer(1);
        this.f166865s = new D();
    }

    @Override // androidx.media3.exoplayer.H0
    public boolean b() {
        return true;
    }

    private void s0() {
        InterfaceC17822a interfaceC17822a = this.f166866t;
        if (interfaceC17822a != null) {
            interfaceC17822a.f();
        }
    }

    @Override // androidx.media3.exoplayer.I0
    public int a(t tVar) {
        return "application/x-camera-motion".equals(tVar.f44767o) ? I0.v(4) : I0.v(0);
    }

    @Override // androidx.media3.exoplayer.AbstractC6194h
    protected void g0(long j10, boolean z10) {
        this.f166867u = Long.MIN_VALUE;
        s0();
    }

    @Override // androidx.media3.exoplayer.H0, androidx.media3.exoplayer.I0
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.AbstractC6194h, androidx.media3.exoplayer.F0.b
    public void x(int i10, Object obj) throws ExoPlaybackException {
        if (i10 == 8) {
            this.f166866t = (InterfaceC17822a) obj;
        } else {
            super.x(i10, obj);
        }
    }

    private float[] r0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f166865s.U(byteBuffer.array(), byteBuffer.limit());
        this.f166865s.W(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f166865s.u());
        }
        return fArr;
    }

    @Override // androidx.media3.exoplayer.H0
    public boolean c() {
        return m();
    }

    @Override // androidx.media3.exoplayer.AbstractC6194h
    protected void d0() {
        s0();
    }

    @Override // androidx.media3.exoplayer.H0
    public void h(long j10, long j11) {
        while (!m() && this.f166867u < 100000 + j10) {
            this.f166864r.o();
            boolean z10 = false;
            if (o0(V(), this.f166864r, 0) == -4 && !this.f166864r.u()) {
                long j12 = this.f166864r.f55691f;
                this.f166867u = j12;
                if (j12 < X()) {
                    z10 = true;
                }
                if (this.f166866t != null && !z10) {
                    this.f166864r.G();
                    float[] fArrR0 = r0((ByteBuffer) P.h(this.f166864r.f55689d));
                    if (fArrR0 != null) {
                        ((InterfaceC17822a) P.h(this.f166866t)).d(this.f166867u - a0(), fArrR0);
                    }
                }
            } else {
                return;
            }
        }
    }
}
