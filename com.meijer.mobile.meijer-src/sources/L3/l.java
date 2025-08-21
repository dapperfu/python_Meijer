package L3;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class l extends i {

    /* renamed from: b, reason: collision with root package name */
    public final int f18006b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18007c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18008d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f18009e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f18010f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f18006b == lVar.f18006b && this.f18007c == lVar.f18007c && this.f18008d == lVar.f18008d && Arrays.equals(this.f18009e, lVar.f18009e) && Arrays.equals(this.f18010f, lVar.f18010f)) {
                return true;
            }
        }
        return false;
    }

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f18006b = i10;
        this.f18007c = i11;
        this.f18008d = i12;
        this.f18009e = iArr;
        this.f18010f = iArr2;
    }

    public int hashCode() {
        return ((((((((527 + this.f18006b) * 31) + this.f18007c) * 31) + this.f18008d) * 31) + Arrays.hashCode(this.f18009e)) * 31) + Arrays.hashCode(this.f18010f);
    }
}
