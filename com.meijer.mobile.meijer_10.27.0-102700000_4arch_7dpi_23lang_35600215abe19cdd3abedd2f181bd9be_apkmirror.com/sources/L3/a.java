package L3;

import a3.x;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class a extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f17826b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17827c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17828d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f17829e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f17828d == aVar.f17828d && Objects.equals(this.f17826b, aVar.f17826b) && Objects.equals(this.f17827c, aVar.f17827c) && Arrays.equals(this.f17829e, aVar.f17829e)) {
                return true;
            }
        }
        return false;
    }

    public a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f17826b = str;
        this.f17827c = str2;
        this.f17828d = i10;
        this.f17829e = bArr;
    }

    @Override // a3.y.a
    public void b(x.b bVar) {
        bVar.K(this.f17829e, this.f17828d);
    }

    public int hashCode() {
        int i10 = (527 + this.f17828d) * 31;
        String str = this.f17826b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17827c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f17829e);
    }

    @Override // L3.i
    public String toString() {
        return this.f17854a + ": mimeType=" + this.f17826b + ", description=" + this.f17827c;
    }
}
