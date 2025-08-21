package r3;

import Ee.L;
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
import androidx.media3.exoplayer.AbstractC6194h;
import androidx.media3.exoplayer.I0;
import androidx.media3.exoplayer.source.r;
import androidx.media3.extractor.text.SubtitleDecoderException;
import c3.C6476a;
import c3.C6477b;
import d3.C13599a;
import d3.P;
import h3.G;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: r3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16832i extends AbstractC6194h implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    private p f159197A;

    /* renamed from: B, reason: collision with root package name */
    private int f159198B;

    /* renamed from: C, reason: collision with root package name */
    private final Handler f159199C;

    /* renamed from: D, reason: collision with root package name */
    private final InterfaceC16831h f159200D;

    /* renamed from: E, reason: collision with root package name */
    private final G f159201E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f159202F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f159203G;

    /* renamed from: H, reason: collision with root package name */
    private t f159204H;

    /* renamed from: I, reason: collision with root package name */
    private long f159205I;

    /* renamed from: J, reason: collision with root package name */
    private long f159206J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f159207K;

    /* renamed from: L, reason: collision with root package name */
    private IOException f159208L;

    /* renamed from: r, reason: collision with root package name */
    private final U3.b f159209r;

    /* renamed from: s, reason: collision with root package name */
    private final DecoderInputBuffer f159210s;

    /* renamed from: t, reason: collision with root package name */
    private InterfaceC16824a f159211t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC16830g f159212u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f159213v;

    /* renamed from: w, reason: collision with root package name */
    private int f159214w;

    /* renamed from: x, reason: collision with root package name */
    private l f159215x;

    /* renamed from: y, reason: collision with root package name */
    private o f159216y;

    /* renamed from: z, reason: collision with root package name */
    private p f159217z;

    public C16832i(InterfaceC16831h interfaceC16831h, Looper looper) {
        this(interfaceC16831h, looper, InterfaceC16830g.f159195a);
    }

    private void C0() {
        this.f159216y = null;
        this.f159198B = -1;
        p pVar = this.f159217z;
        if (pVar != null) {
            pVar.E();
            this.f159217z = null;
        }
        p pVar2 = this.f159197A;
        if (pVar2 != null) {
            pVar2.E();
            this.f159197A = null;
        }
    }

    private static boolean x0(k kVar, long j10) {
        return kVar == null || kVar.e(kVar.l() - 1) <= j10;
    }

    private void y0() {
        this.f159213v = true;
        l lVarB = this.f159212u.b((t) C13599a.e(this.f159204H));
        this.f159215x = lVarB;
        lVarB.d(X());
    }

    @Override // androidx.media3.exoplayer.AbstractC6194h
    protected void d0() {
        this.f159204H = null;
        this.f159206J = -9223372036854775807L;
        s0();
        this.f159205I = -9223372036854775807L;
        if (this.f159215x != null) {
            D0();
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC6194h
    protected void m0(t[] tVarArr, long j10, long j11, r.b bVar) {
        t tVar = tVarArr[0];
        this.f159204H = tVar;
        if (A0(tVar)) {
            this.f159211t = this.f159204H.f44748K == 1 ? new C16828e() : new C16829f();
            return;
        }
        r0();
        if (this.f159215x != null) {
            this.f159214w = 1;
        } else {
            y0();
        }
    }

    public C16832i(InterfaceC16831h interfaceC16831h, Looper looper, InterfaceC16830g interfaceC16830g) {
        super(3);
        this.f159200D = (InterfaceC16831h) C13599a.e(interfaceC16831h);
        this.f159199C = looper == null ? null : P.y(looper, this);
        this.f159212u = interfaceC16830g;
        this.f159209r = new U3.b();
        this.f159210s = new DecoderInputBuffer(1);
        this.f159201E = new G();
        this.f159206J = -9223372036854775807L;
        this.f159205I = -9223372036854775807L;
        this.f159207K = false;
    }

    private static boolean A0(t tVar) {
        return Objects.equals(tVar.f44767o, "application/x-media3-cues");
    }

    private boolean B0(long j10) {
        if (this.f159202F || o0(this.f159201E, this.f159210s, 0) != -4) {
            return false;
        }
        if (this.f159210s.u()) {
            this.f159202F = true;
            return false;
        }
        this.f159210s.G();
        ByteBuffer byteBuffer = (ByteBuffer) C13599a.e(this.f159210s.f55689d);
        U3.e eVarA = this.f159209r.a(this.f159210s.f55691f, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.f159210s.o();
        return this.f159211t.d(eVarA, j10);
    }

    private void F0(long j10) throws DecoderException {
        boolean z10;
        this.f159205I = j10;
        if (this.f159197A == null) {
            ((l) C13599a.e(this.f159215x)).b(j10);
            try {
                this.f159197A = ((l) C13599a.e(this.f159215x)).a();
            } catch (SubtitleDecoderException e10) {
                w0(e10);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f159217z != null) {
            long jU0 = u0();
            z10 = false;
            while (jU0 <= j10) {
                this.f159198B++;
                jU0 = u0();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        p pVar = this.f159197A;
        if (pVar != null) {
            if (pVar.u()) {
                if (!z10 && u0() == Long.MAX_VALUE) {
                    if (this.f159214w == 2) {
                        G0();
                    } else {
                        C0();
                        this.f159203G = true;
                    }
                }
            } else if (pVar.f134006b <= j10) {
                p pVar2 = this.f159217z;
                if (pVar2 != null) {
                    pVar2.E();
                }
                this.f159198B = pVar.a(j10);
                this.f159217z = pVar;
                this.f159197A = null;
                z10 = true;
            }
        }
        if (z10) {
            C13599a.e(this.f159217z);
            I0(new C6477b(this.f159217z.b(j10), v0(t0(j10))));
        }
        if (this.f159214w == 2) {
            return;
        }
        while (!this.f159202F) {
            try {
                o oVarE = this.f159216y;
                if (oVarE == null) {
                    oVarE = ((l) C13599a.e(this.f159215x)).e();
                    if (oVarE == null) {
                        return;
                    } else {
                        this.f159216y = oVarE;
                    }
                }
                if (this.f159214w == 1) {
                    oVarE.D(4);
                    ((l) C13599a.e(this.f159215x)).c(oVarE);
                    this.f159216y = null;
                    this.f159214w = 2;
                    return;
                }
                int iO0 = o0(this.f159201E, oVarE, 0);
                if (iO0 == -4) {
                    if (oVarE.u()) {
                        this.f159202F = true;
                        this.f159213v = false;
                    } else {
                        t tVar = this.f159201E.f134662b;
                        if (tVar == null) {
                            return;
                        }
                        oVarE.f37060j = tVar.f44772t;
                        oVarE.G();
                        this.f159213v &= !oVarE.z();
                    }
                    if (!this.f159213v) {
                        ((l) C13599a.e(this.f159215x)).c(oVarE);
                        this.f159216y = null;
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

    private void I0(C6477b c6477b) {
        Handler handler = this.f159199C;
        if (handler != null) {
            handler.obtainMessage(1, c6477b).sendToTarget();
        } else {
            z0(c6477b);
        }
    }

    private void r0() {
        C13599a.h(this.f159207K || Objects.equals(this.f159204H.f44767o, "application/cea-608") || Objects.equals(this.f159204H.f44767o, "application/x-mp4-cea-608") || Objects.equals(this.f159204H.f44767o, "application/cea-708"), "Legacy decoding is disabled, can't handle " + this.f159204H.f44767o + " samples (expected application/x-media3-cues).");
    }

    private void s0() {
        I0(new C6477b(L.x(), v0(this.f159205I)));
    }

    private long t0(long j10) {
        int iA = this.f159217z.a(j10);
        if (iA == 0 || this.f159217z.l() == 0) {
            return this.f159217z.f134006b;
        }
        if (iA != -1) {
            return this.f159217z.e(iA - 1);
        }
        return this.f159217z.e(r2.l() - 1);
    }

    private long u0() {
        if (this.f159198B == -1) {
            return Long.MAX_VALUE;
        }
        C13599a.e(this.f159217z);
        if (this.f159198B >= this.f159217z.l()) {
            return Long.MAX_VALUE;
        }
        return this.f159217z.e(this.f159198B);
    }

    private void w0(SubtitleDecoderException subtitleDecoderException) {
        d3.r.e("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f159204H, subtitleDecoderException);
        s0();
        G0();
    }

    private void z0(C6477b c6477b) {
        this.f159200D.n(c6477b.f61227a);
        this.f159200D.i(c6477b);
    }

    @Override // androidx.media3.exoplayer.H0
    public boolean b() {
        if (this.f159204H == null) {
            return true;
        }
        if (this.f159208L == null) {
            try {
                y();
            } catch (IOException e10) {
                this.f159208L = e10;
            }
        }
        if (this.f159208L != null) {
            if (A0((t) C13599a.e(this.f159204H))) {
                return ((InterfaceC16824a) C13599a.e(this.f159211t)).c(this.f159205I) != Long.MIN_VALUE;
            }
            if (this.f159203G || (this.f159202F && x0(this.f159217z, this.f159205I) && x0(this.f159197A, this.f159205I) && this.f159216y != null)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.H0
    public boolean c() {
        return this.f159203G;
    }

    @Override // androidx.media3.exoplayer.AbstractC6194h
    protected void g0(long j10, boolean z10) {
        this.f159205I = j10;
        InterfaceC16824a interfaceC16824a = this.f159211t;
        if (interfaceC16824a != null) {
            interfaceC16824a.clear();
        }
        s0();
        this.f159202F = false;
        this.f159203G = false;
        this.f159206J = -9223372036854775807L;
        t tVar = this.f159204H;
        if (tVar == null || A0(tVar)) {
            return;
        }
        if (this.f159214w != 0) {
            G0();
            return;
        }
        C0();
        l lVar = (l) C13599a.e(this.f159215x);
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
        z0((C6477b) message.obj);
        return true;
    }

    private void D0() {
        C0();
        ((l) C13599a.e(this.f159215x)).release();
        this.f159215x = null;
        this.f159214w = 0;
    }

    private void E0(long j10) {
        boolean zB0 = B0(j10);
        long jC = this.f159211t.c(this.f159205I);
        if (jC == Long.MIN_VALUE && this.f159202F && !zB0) {
            this.f159203G = true;
        }
        if (jC != Long.MIN_VALUE && jC <= j10) {
            zB0 = true;
        }
        if (zB0) {
            L<C6476a> lA = this.f159211t.a(j10);
            long jB = this.f159211t.b(j10);
            I0(new C6477b(lA, v0(jB)));
            this.f159211t.e(jB);
        }
        this.f159205I = j10;
    }

    private void G0() {
        D0();
        y0();
    }

    public void H0(long j10) {
        C13599a.g(B());
        this.f159206J = j10;
    }

    @Override // androidx.media3.exoplayer.I0
    public int a(t tVar) {
        int i10;
        if (!A0(tVar) && !this.f159212u.a(tVar)) {
            if (z.p(tVar.f44767o)) {
                return I0.v(1);
            }
            return I0.v(0);
        }
        if (tVar.f44751N == 0) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        return I0.v(i10);
    }

    @Override // androidx.media3.exoplayer.H0
    public void h(long j10, long j11) throws DecoderException {
        if (B()) {
            long j12 = this.f159206J;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                C0();
                this.f159203G = true;
            }
        }
        if (this.f159203G) {
            return;
        }
        if (A0((t) C13599a.e(this.f159204H))) {
            C13599a.e(this.f159211t);
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
        C13599a.g(z10);
        return j10 - a0();
    }
}
