package w3;

import a3.t;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.AbstractC6052h;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.I0;
import d3.D;
import d3.P;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends AbstractC6052h {

    /* renamed from: r, reason: collision with root package name */
    private final DecoderInputBuffer f165653r;

    /* renamed from: s, reason: collision with root package name */
    private final D f165654s;

    /* renamed from: t, reason: collision with root package name */
    private InterfaceC17752a f165655t;

    /* renamed from: u, reason: collision with root package name */
    private long f165656u;

    public b() {
        super(6);
        this.f165653r = new DecoderInputBuffer(1);
        this.f165654s = new D();
    }

    @Override // androidx.media3.exoplayer.H0
    public boolean b() {
        return true;
    }

    private void s0() {
        InterfaceC17752a interfaceC17752a = this.f165655t;
        if (interfaceC17752a != null) {
            interfaceC17752a.f();
        }
    }

    @Override // androidx.media3.exoplayer.I0
    public int a(t tVar) {
        return "application/x-camera-motion".equals(tVar.f43949o) ? I0.v(4) : I0.v(0);
    }

    @Override // androidx.media3.exoplayer.AbstractC6052h
    protected void g0(long j10, boolean z10) {
        this.f165656u = Long.MIN_VALUE;
        s0();
    }

    @Override // androidx.media3.exoplayer.H0, androidx.media3.exoplayer.I0
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.AbstractC6052h, androidx.media3.exoplayer.F0.b
    public void x(int i10, Object obj) throws ExoPlaybackException {
        if (i10 == 8) {
            this.f165655t = (InterfaceC17752a) obj;
        } else {
            super.x(i10, obj);
        }
    }

    private float[] r0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f165654s.U(byteBuffer.array(), byteBuffer.limit());
        this.f165654s.W(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f165654s.u());
        }
        return fArr;
    }

    @Override // androidx.media3.exoplayer.H0
    public boolean c() {
        return m();
    }

    @Override // androidx.media3.exoplayer.AbstractC6052h
    protected void d0() {
        s0();
    }

    @Override // androidx.media3.exoplayer.H0
    public void h(long j10, long j11) {
        while (!m() && this.f165656u < 100000 + j10) {
            this.f165653r.o();
            boolean z10 = false;
            if (o0(V(), this.f165653r, 0) == -4 && !this.f165653r.u()) {
                long j12 = this.f165653r.f55467f;
                this.f165656u = j12;
                if (j12 < X()) {
                    z10 = true;
                }
                if (this.f165655t != null && !z10) {
                    this.f165653r.G();
                    float[] fArrR0 = r0((ByteBuffer) P.h(this.f165653r.f55465d));
                    if (fArrR0 != null) {
                        ((InterfaceC17752a) P.h(this.f165655t)).d(this.f165656u - a0(), fArrR0);
                    }
                }
            } else {
                return;
            }
        }
    }
}
