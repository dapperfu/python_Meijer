package androidx.media3.extractor.flv;

import a3.t;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.flv.TagPayloadReader;
import d3.D;
import e3.f;
import x3.C18065d;
import x3.O;

/* loaded from: classes.dex */
final class d extends TagPayloadReader {

    /* renamed from: b, reason: collision with root package name */
    private final D f57536b;

    /* renamed from: c, reason: collision with root package name */
    private final D f57537c;

    /* renamed from: d, reason: collision with root package name */
    private int f57538d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f57539e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f57540f;

    /* renamed from: g, reason: collision with root package name */
    private int f57541g;

    public d(O o10) {
        super(o10);
        this.f57536b = new D(f.f129420a);
        this.f57537c = new D(4);
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean b(D d10) throws TagPayloadReader.UnsupportedFormatException {
        int iH = d10.H();
        int i10 = (iH >> 4) & 15;
        int i11 = iH & 15;
        if (i11 == 7) {
            this.f57541g = i10;
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
        if (iH == 0 && !this.f57539e) {
            D d11 = new D(new byte[d10.a()]);
            d10.l(d11.e(), 0, d10.a());
            C18065d c18065dB = C18065d.b(d11);
            this.f57538d = c18065dB.f170245b;
            this.f57511a.b(new t.b().U("video/x-flv").u0("video/avc").S(c18065dB.f170255l).z0(c18065dB.f170246c).d0(c18065dB.f170247d).q0(c18065dB.f170254k).g0(c18065dB.f170244a).N());
            this.f57539e = true;
            return false;
        }
        if (iH != 1 || !this.f57539e) {
            return false;
        }
        if (this.f57541g == 1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (!this.f57540f && i10 == 0) {
            return false;
        }
        byte[] bArrE = this.f57537c.e();
        bArrE[0] = 0;
        bArrE[1] = 0;
        bArrE[2] = 0;
        int i11 = 4 - this.f57538d;
        int i12 = 0;
        while (d10.a() > 0) {
            d10.l(this.f57537c.e(), i11, this.f57538d);
            this.f57537c.W(0);
            int iL = this.f57537c.L();
            this.f57536b.W(0);
            this.f57511a.d(this.f57536b, 4);
            this.f57511a.d(d10, iL);
            i12 = i12 + 4 + iL;
        }
        this.f57511a.c(jR, i10, i12, 0, null);
        this.f57540f = true;
        return true;
    }
}
