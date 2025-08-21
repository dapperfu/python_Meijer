package K3;

import a3.x;
import a3.y;
import d3.C13599a;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class b implements y.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f16271a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16272b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16273c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16274d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16275e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16276f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f16271a == bVar.f16271a && Objects.equals(this.f16272b, bVar.f16272b) && Objects.equals(this.f16273c, bVar.f16273c) && Objects.equals(this.f16274d, bVar.f16274d) && this.f16275e == bVar.f16275e && this.f16276f == bVar.f16276f) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static K3.b d(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K3.b.d(java.util.Map):K3.b");
    }

    @Override // a3.y.a
    public void b(x.b bVar) {
        String str = this.f16273c;
        if (str != null) {
            bVar.m0(str);
        }
        String str2 = this.f16272b;
        if (str2 != null) {
            bVar.c0(str2);
        }
    }

    public int hashCode() {
        int i10 = (527 + this.f16271a) * 31;
        String str = this.f16272b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f16273c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f16274d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f16275e ? 1 : 0)) * 31) + this.f16276f;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f16273c + "\", genre=\"" + this.f16272b + "\", bitrate=" + this.f16271a + ", metadataInterval=" + this.f16276f;
    }

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        boolean z11;
        if (i11 != -1 && i11 <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        C13599a.a(z11);
        this.f16271a = i10;
        this.f16272b = str;
        this.f16273c = str2;
        this.f16274d = str3;
        this.f16275e = z10;
        this.f16276f = i11;
    }
}
