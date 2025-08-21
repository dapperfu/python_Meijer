package androidx.media3.extractor.flv;

import a3.t;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.flv.TagPayloadReader;
import d3.D;
import java.util.Collections;
import x3.C18062a;
import x3.O;

/* loaded from: classes.dex */
final class a extends TagPayloadReader {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f57512e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    private boolean f57513b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f57514c;

    /* renamed from: d, reason: collision with root package name */
    private int f57515d;

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean b(D d10) throws TagPayloadReader.UnsupportedFormatException {
        if (this.f57513b) {
            d10.X(1);
        } else {
            int iH = d10.H();
            int i10 = (iH >> 4) & 15;
            this.f57515d = i10;
            if (i10 == 2) {
                this.f57511a.b(new t.b().U("video/x-flv").u0("audio/mpeg").R(1).v0(f57512e[(iH >> 2) & 3]).N());
                this.f57514c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f57511a.b(new t.b().U("video/x-flv").u0(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").R(1).v0(8000).N());
                this.f57514c = true;
            } else if (i10 != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.f57515d);
            }
            this.f57513b = true;
        }
        return true;
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean c(D d10, long j10) throws ParserException {
        if (this.f57515d == 2) {
            int iA = d10.a();
            this.f57511a.d(d10, iA);
            this.f57511a.c(j10, 1, iA, 0, null);
            return true;
        }
        int iH = d10.H();
        if (iH != 0 || this.f57514c) {
            if (this.f57515d == 10 && iH != 1) {
                return false;
            }
            int iA2 = d10.a();
            this.f57511a.d(d10, iA2);
            this.f57511a.c(j10, 1, iA2, 0, null);
            return true;
        }
        int iA3 = d10.a();
        byte[] bArr = new byte[iA3];
        d10.l(bArr, 0, iA3);
        C18062a.b bVarE = C18062a.e(bArr);
        this.f57511a.b(new t.b().U("video/x-flv").u0("audio/mp4a-latm").S(bVarE.f170218c).R(bVarE.f170217b).v0(bVarE.f170216a).g0(Collections.singletonList(bArr)).N());
        this.f57514c = true;
        return false;
    }

    public a(O o10) {
        super(o10);
    }
}
