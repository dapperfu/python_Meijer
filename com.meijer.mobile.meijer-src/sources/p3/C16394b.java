package p3;

import Ee.L;
import Ee.U;
import a3.InterfaceC5654k;
import android.net.Uri;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import d3.C13599a;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import x3.C18070i;
import x3.I;
import x3.InterfaceC18077p;
import x3.InterfaceC18078q;

/* renamed from: p3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16394b implements androidx.media3.exoplayer.source.w {

    /* renamed from: a, reason: collision with root package name */
    private final x3.u f156082a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC18077p f156083b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC18078q f156084c;

    @Override // androidx.media3.exoplayer.source.w
    public void a(long j10, long j11) {
        ((InterfaceC18077p) C13599a.e(this.f156083b)).a(j10, j11);
    }

    @Override // androidx.media3.exoplayer.source.w
    public void b() {
        InterfaceC18077p interfaceC18077p = this.f156083b;
        if (interfaceC18077p == null) {
            return;
        }
        InterfaceC18077p interfaceC18077pE = interfaceC18077p.e();
        if (interfaceC18077pE instanceof Q3.f) {
            ((Q3.f) interfaceC18077pE).l();
        }
    }

    @Override // androidx.media3.exoplayer.source.w
    public void c(InterfaceC5654k interfaceC5654k, Uri uri, Map<String, List<String>> map, long j10, long j11, x3.r rVar) throws IOException {
        C18070i c18070i = new C18070i(interfaceC5654k, j10, j11);
        this.f156084c = c18070i;
        if (this.f156083b != null) {
            return;
        }
        InterfaceC18077p[] interfaceC18077pArrD = this.f156082a.d(uri, map);
        L.a aVarQ = L.q(interfaceC18077pArrD.length);
        if (interfaceC18077pArrD.length == 1) {
            this.f156083b = interfaceC18077pArrD[0];
        } else {
            int length = interfaceC18077pArrD.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                InterfaceC18077p interfaceC18077p = interfaceC18077pArrD[i10];
                try {
                } catch (EOFException unused) {
                    if (this.f156083b != null || c18070i.getPosition() == j10) {
                    }
                } catch (Throwable th2) {
                    C13599a.g(this.f156083b != null || c18070i.getPosition() == j10);
                    c18070i.d();
                    throw th2;
                }
                if (interfaceC18077p.j(c18070i)) {
                    this.f156083b = interfaceC18077p;
                    C13599a.g(true);
                    c18070i.d();
                    break;
                } else {
                    aVarQ.j(interfaceC18077p.i());
                    boolean z10 = this.f156083b != null || c18070i.getPosition() == j10;
                    C13599a.g(z10);
                    c18070i.d();
                    i10++;
                }
            }
            if (this.f156083b == null) {
                throw new UnrecognizedInputFormatException("None of the available extractors (" + De.i.h(", ").e(U.l(L.t(interfaceC18077pArrD), new De.g() { // from class: p3.a
                    @Override // De.g
                    public final Object apply(Object obj) {
                        return ((InterfaceC18077p) obj).e().getClass().getSimpleName();
                    }
                })) + ") could read the stream.", (Uri) C13599a.e(uri), aVarQ.k());
            }
        }
        this.f156083b.c(rVar);
    }

    @Override // androidx.media3.exoplayer.source.w
    public int d(I i10) throws IOException {
        return ((InterfaceC18077p) C13599a.e(this.f156083b)).b((InterfaceC18078q) C13599a.e(this.f156084c), i10);
    }

    @Override // androidx.media3.exoplayer.source.w
    public long e() {
        InterfaceC18078q interfaceC18078q = this.f156084c;
        if (interfaceC18078q != null) {
            return interfaceC18078q.getPosition();
        }
        return -1L;
    }

    @Override // androidx.media3.exoplayer.source.w
    public void release() {
        InterfaceC18077p interfaceC18077p = this.f156083b;
        if (interfaceC18077p != null) {
            interfaceC18077p.release();
            this.f156083b = null;
        }
        this.f156084c = null;
    }

    public C16394b(x3.u uVar) {
        this.f156082a = uVar;
    }
}
