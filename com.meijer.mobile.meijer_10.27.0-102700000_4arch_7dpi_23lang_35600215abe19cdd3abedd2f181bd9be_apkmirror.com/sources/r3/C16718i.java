package r3;

import Ce.L;
import U3.k;
import U3.l;
import U3.o;
import U3.p;
import a3.t;
import a3.z;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.AbstractC6052h;
import androidx.media3.exoplayer.I0;
import androidx.media3.exoplayer.source.r;
import androidx.media3.extractor.text.SubtitleDecoderException;
import c3.C6350a;
import c3.C6351b;
import d3.C13466a;
import d3.P;
import h3.G;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: r3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16718i extends AbstractC6052h implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    private p f157811A;

    /* renamed from: B, reason: collision with root package name */
    private int f157812B;

    /* renamed from: C, reason: collision with root package name */
    private final Handler f157813C;

    /* renamed from: D, reason: collision with root package name */
    private final InterfaceC16717h f157814D;

    /* renamed from: E, reason: collision with root package name */
    private final G f157815E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f157816F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f157817G;

    /* renamed from: H, reason: collision with root package name */
    private t f157818H;

    /* renamed from: I, reason: collision with root package name */
    private long f157819I;

    /* renamed from: J, reason: collision with root package name */
    private long f157820J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f157821K;

    /* renamed from: L, reason: collision with root package name */
    private IOException f157822L;

    /* renamed from: r, reason: collision with root package name */
    private final U3.b f157823r;

    /* renamed from: s, reason: collision with root package name */
    private final DecoderInputBuffer f157824s;

    /* renamed from: t, reason: collision with root package name */
    private InterfaceC16710a f157825t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC16716g f157826u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f157827v;

    /* renamed from: w, reason: collision with root package name */
    private int f157828w;

    /* renamed from: x, reason: collision with root package name */
    private l f157829x;

    /* renamed from: y, reason: collision with root package name */
    private o f157830y;

    /* renamed from: z, reason: collision with root package name */
    private p f157831z;

    public C16718i(InterfaceC16717h interfaceC16717h, Looper looper) {
        this(interfaceC16717h, looper, InterfaceC16716g.f157809a);
    }

    private void C0() {
        this.f157830y = null;
        this.f157812B = -1;
        p pVar = this.f157831z;
        if (pVar != null) {
            pVar.E();
            this.f157831z = null;
        }
        p pVar2 = this.f157811A;
        if (pVar2 != null) {
            pVar2.E();
            this.f157811A = null;
        }
    }

    private static boolean x0(k kVar, long j10) {
        return kVar == null || kVar.e(kVar.l() - 1) <= j10;
    }

    private void y0() {
        this.f157827v = true;
        l lVarB = this.f157826u.b((t) C13466a.e(this.f157818H));
        this.f157829x = lVarB;
        lVarB.d(X());
    }

    @Override // androidx.media3.exoplayer.AbstractC6052h
    protected void d0() {
        this.f157818H = null;
        this.f157820J = -9223372036854775807L;
        s0();
        this.f157819I = -9223372036854775807L;
        if (this.f157829x != null) {
            D0();
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC6052h
    protected void m0(t[] tVarArr, long j10, long j11, r.b bVar) {
        t tVar = tVarArr[0];
        this.f157818H = tVar;
        if (A0(tVar)) {
            this.f157825t = this.f157818H.f43930K == 1 ? new C16714e() : new C16715f();
            return;
        }
        r0();
        if (this.f157829x != null) {
            this.f157828w = 1;
        } else {
            y0();
        }
    }

    public C16718i(InterfaceC16717h interfaceC16717h, Looper looper, InterfaceC16716g interfaceC16716g) {
        super(3);
        this.f157814D = (InterfaceC16717h) C13466a.e(interfaceC16717h);
        this.f157813C = looper == null ? null : P.y(looper, this);
        this.f157826u = interfaceC16716g;
        this.f157823r = new U3.b();
        this.f157824s = new DecoderInputBuffer(1);
        this.f157815E = new G();
        this.f157820J = -9223372036854775807L;
        this.f157819I = -9223372036854775807L;
        this.f157821K = false;
    }

    private static boolean A0(t tVar) {
        return Objects.equals(tVar.f43949o, "application/x-media3-cues");
    }

    private boolean B0(long j10) {
        if (this.f157816F || o0(this.f157815E, this.f157824s, 0) != -4) {
            return false;
        }
        if (this.f157824s.u()) {
            this.f157816F = true;
            return false;
        }
        this.f157824s.G();
        ByteBuffer byteBuffer = (ByteBuffer) C13466a.e(this.f157824s.f55465d);
        U3.e eVarA = this.f157823r.a(this.f157824s.f55467f, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.f157824s.o();
        return this.f157825t.d(eVarA, j10);
    }

    private void F0(long j10) throws DecoderException {
        boolean z10;
        this.f157819I = j10;
        if (this.f157811A == null) {
            ((l) C13466a.e(this.f157829x)).b(j10);
            try {
                this.f157811A = ((l) C13466a.e(this.f157829x)).a();
            } catch (SubtitleDecoderException e10) {
                w0(e10);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f157831z != null) {
            long jU0 = u0();
            z10 = false;
            while (jU0 <= j10) {
                this.f157812B++;
                jU0 = u0();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        p pVar = this.f157811A;
        if (pVar != null) {
            if (pVar.u()) {
                if (!z10 && u0() == Long.MAX_VALUE) {
                    if (this.f157828w == 2) {
                        G0();
                    } else {
                        C0();
                        this.f157817G = true;
                    }
                }
            } else if (pVar.f132716b <= j10) {
                p pVar2 = this.f157831z;
                if (pVar2 != null) {
                    pVar2.E();
                }
                this.f157812B = pVar.a(j10);
                this.f157831z = pVar;
                this.f157811A = null;
                z10 = true;
            }
        }
        if (z10) {
            C13466a.e(this.f157831z);
            I0(new C6351b(this.f157831z.b(j10), v0(t0(j10))));
        }
        if (this.f157828w == 2) {
            return;
        }
        while (!this.f157816F) {
            try {
                o oVarE = this.f157830y;
                if (oVarE == null) {
                    oVarE = ((l) C13466a.e(this.f157829x)).e();
                    if (oVarE == null) {
                        return;
                    } else {
                        this.f157830y = oVarE;
                    }
                }
                if (this.f157828w == 1) {
                    oVarE.D(4);
                    ((l) C13466a.e(this.f157829x)).c(oVarE);
                    this.f157830y = null;
                    this.f157828w = 2;
                    return;
                }
                int iO0 = o0(this.f157815E, oVarE, 0);
                if (iO0 == -4) {
                    if (oVarE.u()) {
                        this.f157816F = true;
                        this.f157827v = false;
                    } else {
                        t tVar = this.f157815E.f134191b;
                        if (tVar == null) {
                            return;
                        }
                        oVarE.f35724j = tVar.f43954t;
                        oVarE.G();
                        this.f157827v &= !oVarE.z();
                    }
                    if (!this.f157827v) {
                        ((l) C13466a.e(this.f157829x)).c(oVarE);
                        this.f157830y = null;
                    }
                } else if (iO0 == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e11) {
                w0(e11);
                return;
            }
        }
    }

    private void I0(C6351b c6351b) {
        Handler handler = this.f157813C;
        if (handler != null) {
            handler.obtainMessage(1, c6351b).sendToTarget();
        } else {
            z0(c6351b);
        }
    }

    private void r0() {
        C13466a.h(this.f157821K || Objects.equals(this.f157818H.f43949o, "application/cea-608") || Objects.equals(this.f157818H.f43949o, "application/x-mp4-cea-608") || Objects.equals(this.f157818H.f43949o, "application/cea-708"), "Legacy decoding is disabled, can't handle " + this.f157818H.f43949o + " samples (expected application/x-media3-cues).");
    }

    private void s0() {
        I0(new C6351b(L.x(), v0(this.f157819I)));
    }

    private long t0(long j10) {
        int iA = this.f157831z.a(j10);
        if (iA == 0 || this.f157831z.l() == 0) {
            return this.f157831z.f132716b;
        }
        if (iA != -1) {
            return this.f157831z.e(iA - 1);
        }
        return this.f157831z.e(r2.l() - 1);
    }

    private long u0() {
        if (this.f157812B == -1) {
            return Long.MAX_VALUE;
        }
        C13466a.e(this.f157831z);
        if (this.f157812B >= this.f157831z.l()) {
            return Long.MAX_VALUE;
        }
        return this.f157831z.e(this.f157812B);
    }

    private void w0(SubtitleDecoderException subtitleDecoderException) {
        d3.r.e("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f157818H, subtitleDecoderException);
        s0();
        G0();
    }

    private void z0(C6351b c6351b) {
        this.f157814D.n(c6351b.f61428a);
        this.f157814D.i(c6351b);
    }

    @Override // androidx.media3.exoplayer.H0
    public boolean b() {
        if (this.f157818H == null) {
            return true;
        }
        if (this.f157822L == null) {
            try {
                y();
            } catch (IOException e10) {
                this.f157822L = e10;
            }
        }
        if (this.f157822L != null) {
            if (A0((t) C13466a.e(this.f157818H))) {
                return ((InterfaceC16710a) C13466a.e(this.f157825t)).c(this.f157819I) != Long.MIN_VALUE;
            }
            if (this.f157817G || (this.f157816F && x0(this.f157831z, this.f157819I) && x0(this.f157811A, this.f157819I) && this.f157830y != null)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.H0
    public boolean c() {
        return this.f157817G;
    }

    @Override // androidx.media3.exoplayer.AbstractC6052h
    protected void g0(long j10, boolean z10) {
        this.f157819I = j10;
        InterfaceC16710a interfaceC16710a = this.f157825t;
        if (interfaceC16710a != null) {
            interfaceC16710a.clear();
        }
        s0();
        this.f157816F = false;
        this.f157817G = false;
        this.f157820J = -9223372036854775807L;
        t tVar = this.f157818H;
        if (tVar == null || A0(tVar)) {
            return;
        }
        if (this.f157828w != 0) {
            G0();
            return;
        }
        C0();
        l lVar = (l) C13466a.e(this.f157829x);
        lVar.flush();
        lVar.d(X());
    }

    @Override // androidx.media3.exoplayer.H0, androidx.media3.exoplayer.I0
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        z0((C6351b) message.obj);
        return true;
    }

    private void D0() {
        C0();
        ((l) C13466a.e(this.f157829x)).release();
        this.f157829x = null;
        this.f157828w = 0;
    }

    private void E0(long j10) {
        boolean zB0 = B0(j10);
        long jC = this.f157825t.c(this.f157819I);
        if (jC == Long.MIN_VALUE && this.f157816F && !zB0) {
            this.f157817G = true;
        }
        if (jC != Long.MIN_VALUE && jC <= j10) {
            zB0 = true;
        }
        if (zB0) {
            L<C6350a> lA = this.f157825t.a(j10);
            long jB = this.f157825t.b(j10);
            I0(new C6351b(lA, v0(jB)));
            this.f157825t.e(jB);
        }
        this.f157819I = j10;
    }

    private void G0() {
        D0();
        y0();
    }

    public void H0(long j10) {
        C13466a.g(B());
        this.f157820J = j10;
    }

    @Override // androidx.media3.exoplayer.I0
    public int a(t tVar) {
        int i10;
        if (!A0(tVar) && !this.f157826u.a(tVar)) {
            if (z.p(tVar.f43949o)) {
                return I0.v(1);
            }
            return I0.v(0);
        }
        if (tVar.f43933N == 0) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        return I0.v(i10);
    }

    @Override // androidx.media3.exoplayer.H0
    public void h(long j10, long j11) throws DecoderException {
        if (B()) {
            long j12 = this.f157820J;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                C0();
                this.f157817G = true;
            }
        }
        if (this.f157817G) {
            return;
        }
        if (A0((t) C13466a.e(this.f157818H))) {
            C13466a.e(this.f157825t);
            E0(j10);
        } else {
            r0();
            F0(j10);
        }
    }

    private long v0(long j10) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.g(z10);
        return j10 - a0();
    }
}
