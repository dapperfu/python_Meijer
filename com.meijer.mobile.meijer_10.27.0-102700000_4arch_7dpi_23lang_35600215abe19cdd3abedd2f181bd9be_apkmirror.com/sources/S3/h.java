package S3;

import Ce.L;
import S3.i;
import a3.t;
import a3.y;
import androidx.media3.common.ParserException;
import d3.C13466a;
import d3.D;
import java.util.Arrays;
import java.util.List;
import x3.H;
import x3.S;

/* loaded from: classes4.dex */
final class h extends i {

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f33191o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    private static final byte[] f33192p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    private boolean f33193n;

    public static boolean o(D d10) {
        return n(d10, f33191o);
    }

    @Override // S3.i
    protected boolean h(D d10, long j10, i.b bVar) throws ParserException {
        if (n(d10, f33191o)) {
            byte[] bArrCopyOf = Arrays.copyOf(d10.e(), d10.g());
            int iC = H.c(bArrCopyOf);
            List<byte[]> listA = H.a(bArrCopyOf);
            if (bVar.f33207a != null) {
                return true;
            }
            bVar.f33207a = new t.b().U("audio/ogg").u0("audio/opus").R(iC).v0(48000).g0(listA).N();
            return true;
        }
        byte[] bArr = f33192p;
        if (!n(d10, bArr)) {
            C13466a.i(bVar.f33207a);
            return false;
        }
        C13466a.i(bVar.f33207a);
        if (this.f33193n) {
            return true;
        }
        this.f33193n = true;
        d10.X(bArr.length);
        y yVarD = S.d(L.t(S.k(d10, false, false).f169110b));
        if (yVarD == null) {
            return true;
        }
        bVar.f33207a = bVar.f33207a.b().n0(yVarD.b(bVar.f33207a.f43946l)).N();
        return true;
    }

    h() {
    }

    private static boolean n(D d10, byte[] bArr) {
        if (d10.a() < bArr.length) {
            return false;
        }
        int iF = d10.f();
        byte[] bArr2 = new byte[bArr.length];
        d10.l(bArr2, 0, bArr.length);
        d10.W(iF);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // S3.i
    protected long f(D d10) {
        return c(H.e(d10.e()));
    }

    @Override // S3.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f33193n = false;
        }
    }
}
