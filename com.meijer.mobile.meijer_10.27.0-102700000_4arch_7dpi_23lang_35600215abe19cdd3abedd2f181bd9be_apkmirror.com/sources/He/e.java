package He;

import Be.p;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class e implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    private static final e f12396d = new e(new int[0]);

    /* renamed from: a, reason: collision with root package name */
    private final int[] f12397a;

    /* renamed from: b, reason: collision with root package name */
    private final transient int f12398b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12399c;

    private e(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static e a(int[] iArr) {
        return iArr.length == 0 ? f12396d : new e(Arrays.copyOf(iArr, iArr.length));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (d() != eVar.d()) {
            return false;
        }
        for (int i10 = 0; i10 < d(); i10++) {
            if (b(i10) != eVar.b(i10)) {
                return false;
            }
        }
        return true;
    }

    private e(int[] iArr, int i10, int i11) {
        this.f12397a = iArr;
        this.f12398b = i10;
        this.f12399c = i11;
    }

    public static e e() {
        return f12396d;
    }

    public boolean c() {
        return this.f12399c == this.f12398b;
    }

    public int d() {
        return this.f12399c - this.f12398b;
    }

    public int hashCode() {
        int iH = 1;
        for (int i10 = this.f12398b; i10 < this.f12399c; i10++) {
            iH = (iH * 31) + f.h(this.f12397a[i10]);
        }
        return iH;
    }

    public int b(int i10) {
        p.o(i10, d());
        return this.f12397a[this.f12398b + i10];
    }

    public String toString() {
        if (c()) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(d() * 5);
        sb2.append('[');
        sb2.append(this.f12397a[this.f12398b]);
        int i10 = this.f12398b;
        while (true) {
            i10++;
            if (i10 < this.f12399c) {
                sb2.append(", ");
                sb2.append(this.f12397a[i10]);
            } else {
                sb2.append(']');
                return sb2.toString();
            }
        }
    }
}
