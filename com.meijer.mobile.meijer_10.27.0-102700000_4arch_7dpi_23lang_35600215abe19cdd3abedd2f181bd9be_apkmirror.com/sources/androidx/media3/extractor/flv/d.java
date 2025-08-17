package androidx.media3.extractor.flv;

import a3.t;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.flv.TagPayloadReader;
import d3.D;
import e3.f;
import x3.C17999d;
import x3.O;

/* loaded from: classes.dex */
final class d extends TagPayloadReader {

    /* renamed from: b, reason: collision with root package name */
    private final D f57312b;

    /* renamed from: c, reason: collision with root package name */
    private final D f57313c;

    /* renamed from: d, reason: collision with root package name */
    private int f57314d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f57315e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f57316f;

    /* renamed from: g, reason: collision with root package name */
    private int f57317g;

    public d(O o10) {
        super(o10);
        this.f57312b = new D(f.f128084a);
        this.f57313c = new D(4);
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean b(D d10) throws TagPayloadReader.UnsupportedFormatException {
        int iH = d10.H();
        int i10 = (iH >> 4) & 15;
        int i11 = iH & 15;
        if (i11 == 7) {
            this.f57317g = i10;
            if (i10 != 5) {
                return true;
            }
            return false;
        }
        throw new TagPayloadReader.UnsupportedFormatException("Video format not supported: " + i11);
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean c(D d10, long j10) throws ParserException {
        int i10;
        int iH = d10.H();
        long jR = j10 + (d10.r() * 1000);
        if (iH == 0 && !this.f57315e) {
            D d11 = new D(new byte[d10.a()]);
            d10.l(d11.e(), 0, d10.a());
            C17999d c17999dB = C17999d.b(d11);
            this.f57314d = c17999dB.f169157b;
            this.f57287a.b(new t.b().U("video/x-flv").u0("video/avc").S(c17999dB.f169167l).z0(c17999dB.f169158c).d0(c17999dB.f169159d).q0(c17999dB.f169166k).g0(c17999dB.f169156a).N());
            this.f57315e = true;
            return false;
        }
        if (iH != 1 || !this.f57315e) {
            return false;
        }
        if (this.f57317g == 1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (!this.f57316f && i10 == 0) {
            return false;
        }
        byte[] bArrE = this.f57313c.e();
        bArrE[0] = 0;
        bArrE[1] = 0;
        bArrE[2] = 0;
        int i11 = 4 - this.f57314d;
        int i12 = 0;
        while (d10.a() > 0) {
            d10.l(this.f57313c.e(), i11, this.f57314d);
            this.f57313c.W(0);
            int iL = this.f57313c.L();
            this.f57312b.W(0);
            this.f57287a.d(this.f57312b, 4);
            this.f57287a.d(d10, iL);
            i12 = i12 + 4 + iL;
        }
        this.f57287a.c(jR, i10, i12, 0, null);
        this.f57316f = true;
        return true;
    }
}
