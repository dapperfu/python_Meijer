package K3;

import a3.x;
import a3.y;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class c implements y.a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f16277a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16278b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16279c;

    @Override // a3.y.a
    public void b(x.b bVar) {
        String str = this.f16278b;
        if (str != null) {
            bVar.p0(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f16277a, ((c) obj).f16277a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f16277a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f16278b, this.f16279c, Integer.valueOf(this.f16277a.length));
    }

    public c(byte[] bArr, String str, String str2) {
        this.f16277a = bArr;
        this.f16278b = str;
        this.f16279c = str2;
    }
}
