package p3;

import Ce.L;
import Ce.U;
import a3.InterfaceC5571k;
import android.net.Uri;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import d3.C13466a;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import x3.C18004i;
import x3.I;
import x3.InterfaceC18011p;
import x3.InterfaceC18012q;

/* renamed from: p3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16249b implements androidx.media3.exoplayer.source.w {

    /* renamed from: a, reason: collision with root package name */
    private final x3.u f155408a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC18011p f155409b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC18012q f155410c;

    @Override // androidx.media3.exoplayer.source.w
    public void a(long j10, long j11) {
        ((InterfaceC18011p) C13466a.e(this.f155409b)).a(j10, j11);
    }

    @Override // androidx.media3.exoplayer.source.w
    public void b() {
        InterfaceC18011p interfaceC18011p = this.f155409b;
        if (interfaceC18011p == null) {
            return;
        }
        InterfaceC18011p interfaceC18011pE = interfaceC18011p.e();
        if (interfaceC18011pE instanceof Q3.f) {
            ((Q3.f) interfaceC18011pE).l();
        }
    }

    @Override // androidx.media3.exoplayer.source.w
    public void c(InterfaceC5571k interfaceC5571k, Uri uri, Map<String, List<String>> map, long j10, long j11, x3.r rVar) throws IOException {
        C18004i c18004i = new C18004i(interfaceC5571k, j10, j11);
        this.f155410c = c18004i;
        if (this.f155409b != null) {
            return;
        }
        InterfaceC18011p[] interfaceC18011pArrD = this.f155408a.d(uri, map);
        L.a aVarQ = L.q(interfaceC18011pArrD.length);
        if (interfaceC18011pArrD.length == 1) {
            this.f155409b = interfaceC18011pArrD[0];
        } else {
            int length = interfaceC18011pArrD.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                InterfaceC18011p interfaceC18011p = interfaceC18011pArrD[i10];
                try {
                } catch (EOFException unused) {
                    if (this.f155409b != null || c18004i.getPosition() == j10) {
                    }
                } catch (Throwable th2) {
                    C13466a.g(this.f155409b != null || c18004i.getPosition() == j10);
                    c18004i.d();
                    throw th2;
                }
                if (interfaceC18011p.j(c18004i)) {
                    this.f155409b = interfaceC18011p;
                    C13466a.g(true);
                    c18004i.d();
                    break;
                } else {
                    aVarQ.j(interfaceC18011p.i());
                    boolean z10 = this.f155409b != null || c18004i.getPosition() == j10;
                    C13466a.g(z10);
                    c18004i.d();
                    i10++;
                }
            }
            if (this.f155409b == null) {
                throw new UnrecognizedInputFormatException("None of the available extractors (" + Be.i.h(", ").e(U.l(L.t(interfaceC18011pArrD), new Be.g() { // from class: p3.a
                    @Override // Be.g
                    public final Object apply(Object obj) {
                        return ((InterfaceC18011p) obj).e().getClass().getSimpleName();
                    }
                })) + ") could read the stream.", (Uri) C13466a.e(uri), aVarQ.k());
            }
        }
        this.f155409b.c(rVar);
    }

    @Override // androidx.media3.exoplayer.source.w
    public int d(I i10) throws IOException {
        return ((InterfaceC18011p) C13466a.e(this.f155409b)).b((InterfaceC18012q) C13466a.e(this.f155410c), i10);
    }

    @Override // androidx.media3.exoplayer.source.w
    public long e() {
        InterfaceC18012q interfaceC18012q = this.f155410c;
        if (interfaceC18012q != null) {
            return interfaceC18012q.getPosition();
        }
        return -1L;
    }

    @Override // androidx.media3.exoplayer.source.w
    public void release() {
        InterfaceC18011p interfaceC18011p = this.f155409b;
        if (interfaceC18011p != null) {
            interfaceC18011p.release();
            this.f155409b = null;
        }
        this.f155410c = null;
    }

    public C16249b(x3.u uVar) {
        this.f155408a = uVar;
    }
}
