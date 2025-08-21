package L3;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class d extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f17984b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17985c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17986d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f17987e;

    /* renamed from: f, reason: collision with root package name */
    private final i[] f17988f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f17985c == dVar.f17985c && this.f17986d == dVar.f17986d && Objects.equals(this.f17984b, dVar.f17984b) && Arrays.equals(this.f17987e, dVar.f17987e) && Arrays.equals(this.f17988f, dVar.f17988f)) {
                return true;
            }
        }
        return false;
    }

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f17984b = str;
        this.f17985c = z10;
        this.f17986d = z11;
        this.f17987e = strArr;
        this.f17988f = iVarArr;
    }

    public int hashCode() {
        int i10 = (((527 + (this.f17985c ? 1 : 0)) * 31) + (this.f17986d ? 1 : 0)) * 31;
        String str = this.f17984b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
