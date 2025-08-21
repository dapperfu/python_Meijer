package x3;

import androidx.media3.common.ParserException;
import d3.C13607i;
import e3.f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: x3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18065d {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f170244a;

    /* renamed from: b, reason: collision with root package name */
    public final int f170245b;

    /* renamed from: c, reason: collision with root package name */
    public final int f170246c;

    /* renamed from: d, reason: collision with root package name */
    public final int f170247d;

    /* renamed from: e, reason: collision with root package name */
    public final int f170248e;

    /* renamed from: f, reason: collision with root package name */
    public final int f170249f;

    /* renamed from: g, reason: collision with root package name */
    public final int f170250g;

    /* renamed from: h, reason: collision with root package name */
    public final int f170251h;

    /* renamed from: i, reason: collision with root package name */
    public final int f170252i;

    /* renamed from: j, reason: collision with root package name */
    public final int f170253j;

    /* renamed from: k, reason: collision with root package name */
    public final float f170254k;

    /* renamed from: l, reason: collision with root package name */
    public final String f170255l;

    public static C18065d b(d3.D d10) throws ParserException {
        String strD;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        try {
            d10.X(4);
            int iH = (d10.H() & 3) + 1;
            if (iH == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iH2 = d10.H() & 31;
            for (int i18 = 0; i18 < iH2; i18++) {
                arrayList.add(a(d10));
            }
            int iH3 = d10.H();
            for (int i19 = 0; i19 < iH3; i19++) {
                arrayList.add(a(d10));
            }
            if (iH2 > 0) {
                f.m mVarC = e3.f.C((byte[]) arrayList.get(0), e3.f.f129420a.length, ((byte[]) arrayList.get(0)).length);
                int i20 = mVarC.f129485f;
                int i21 = mVarC.f129486g;
                int i22 = mVarC.f129488i + 8;
                int i23 = mVarC.f129489j + 8;
                int i24 = mVarC.f129496q;
                int i25 = mVarC.f129497r;
                int i26 = mVarC.f129498s;
                int i27 = mVarC.f129499t;
                float f11 = mVarC.f129487h;
                strD = C13607i.d(mVarC.f129480a, mVarC.f129481b, mVarC.f129482c);
                i14 = i26;
                i15 = i27;
                f10 = f11;
                i13 = i23;
                i16 = i24;
                i17 = i25;
                i10 = i20;
                i11 = i21;
                i12 = i22;
            } else {
                strD = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = 16;
                f10 = 1.0f;
                i16 = -1;
                i17 = -1;
            }
            return new C18065d(arrayList, iH, i10, i11, i12, i13, i16, i17, i14, i15, f10, strD);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.a("Error parsing AVC config", e10);
        }
    }

    private C18065d(List<byte[]> list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, String str) {
        this.f170244a = list;
        this.f170245b = i10;
        this.f170246c = i11;
        this.f170247d = i12;
        this.f170248e = i13;
        this.f170249f = i14;
        this.f170250g = i15;
        this.f170251h = i16;
        this.f170252i = i17;
        this.f170253j = i18;
        this.f170254k = f10;
        this.f170255l = str;
    }

    private static byte[] a(d3.D d10) {
        int iP = d10.P();
        int iF = d10.f();
        d10.X(iP);
        return C13607i.g(d10.e(), iF, iP);
    }
}
