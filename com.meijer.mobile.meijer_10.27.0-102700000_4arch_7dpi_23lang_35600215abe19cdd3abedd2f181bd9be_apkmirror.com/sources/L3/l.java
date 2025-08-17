package L3;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class l extends i {

    /* renamed from: b, reason: collision with root package name */
    public final int f17859b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17860c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17861d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f17862e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f17863f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f17859b == lVar.f17859b && this.f17860c == lVar.f17860c && this.f17861d == lVar.f17861d && Arrays.equals(this.f17862e, lVar.f17862e) && Arrays.equals(this.f17863f, lVar.f17863f)) {
                return true;
            }
        }
        return false;
    }

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f17859b = i10;
        this.f17860c = i11;
        this.f17861d = i12;
        this.f17862e = iArr;
        this.f17863f = iArr2;
    }

    public int hashCode() {
        return ((((((((527 + this.f17859b) * 31) + this.f17860c) * 31) + this.f17861d) * 31) + Arrays.hashCode(this.f17862e)) * 31) + Arrays.hashCode(this.f17863f);
    }
}
