package L3;

import a3.x;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class a extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f17973b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17974c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17975d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f17976e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f17975d == aVar.f17975d && Objects.equals(this.f17973b, aVar.f17973b) && Objects.equals(this.f17974c, aVar.f17974c) && Arrays.equals(this.f17976e, aVar.f17976e)) {
                return true;
            }
        }
        return false;
    }

    public a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f17973b = str;
        this.f17974c = str2;
        this.f17975d = i10;
        this.f17976e = bArr;
    }

    @Override // a3.y.a
    public void b(x.b bVar) {
        bVar.K(this.f17976e, this.f17975d);
    }

    public int hashCode() {
        int i10 = (527 + this.f17975d) * 31;
        String str = this.f17973b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17974c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f17976e);
    }

    @Override // L3.i
    public String toString() {
        return this.f18001a + ": mimeType=" + this.f17973b + ", description=" + this.f17974c;
    }
}
