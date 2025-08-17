package K3;

import a3.x;
import a3.y;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class c implements y.a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f16294a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16295b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16296c;

    @Override // a3.y.a
    public void b(x.b bVar) {
        String str = this.f16295b;
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
        return Arrays.equals(this.f16294a, ((c) obj).f16294a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f16294a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f16295b, this.f16296c, Integer.valueOf(this.f16294a.length));
    }

    public c(byte[] bArr, String str, String str2) {
        this.f16294a = bArr;
        this.f16295b = str;
        this.f16296c = str2;
    }
}
