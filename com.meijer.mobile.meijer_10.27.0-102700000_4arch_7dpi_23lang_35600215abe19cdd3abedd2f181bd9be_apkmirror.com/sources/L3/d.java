package L3;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class d extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f17837b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17838c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17839d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f17840e;

    /* renamed from: f, reason: collision with root package name */
    private final i[] f17841f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f17838c == dVar.f17838c && this.f17839d == dVar.f17839d && Objects.equals(this.f17837b, dVar.f17837b) && Arrays.equals(this.f17840e, dVar.f17840e) && Arrays.equals(this.f17841f, dVar.f17841f)) {
                return true;
            }
        }
        return false;
    }

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f17837b = str;
        this.f17838c = z10;
        this.f17839d = z11;
        this.f17840e = strArr;
        this.f17841f = iVarArr;
    }

    public int hashCode() {
        int i10 = (((527 + (this.f17838c ? 1 : 0)) * 31) + (this.f17839d ? 1 : 0)) * 31;
        String str = this.f17837b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
