package J3;

import a3.x;
import a3.y;
import a3.z;
import d3.D;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class a implements y.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f14560a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14561b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14562c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14563d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14564e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14565f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14566g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f14567h;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f14560a == aVar.f14560a && this.f14561b.equals(aVar.f14561b) && this.f14562c.equals(aVar.f14562c) && this.f14563d == aVar.f14563d && this.f14564e == aVar.f14564e && this.f14565f == aVar.f14565f && this.f14566g == aVar.f14566g && Arrays.equals(this.f14567h, aVar.f14567h)) {
                return true;
            }
        }
        return false;
    }

    @Override // a3.y.a
    public void b(x.b bVar) {
        bVar.K(this.f14567h, this.f14560a);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f14560a) * 31) + this.f14561b.hashCode()) * 31) + this.f14562c.hashCode()) * 31) + this.f14563d) * 31) + this.f14564e) * 31) + this.f14565f) * 31) + this.f14566g) * 31) + Arrays.hashCode(this.f14567h);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f14561b + ", description=" + this.f14562c;
    }

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f14560a = i10;
        this.f14561b = str;
        this.f14562c = str2;
        this.f14563d = i11;
        this.f14564e = i12;
        this.f14565f = i13;
        this.f14566g = i14;
        this.f14567h = bArr;
    }

    public static a d(D d10) {
        int iQ = d10.q();
        String strR = z.r(d10.F(d10.q(), StandardCharsets.US_ASCII));
        String strE = d10.E(d10.q());
        int iQ2 = d10.q();
        int iQ3 = d10.q();
        int iQ4 = d10.q();
        int iQ5 = d10.q();
        int iQ6 = d10.q();
        byte[] bArr = new byte[iQ6];
        d10.l(bArr, 0, iQ6);
        return new a(iQ, strR, strE, iQ2, iQ3, iQ4, iQ5, bArr);
    }
}
