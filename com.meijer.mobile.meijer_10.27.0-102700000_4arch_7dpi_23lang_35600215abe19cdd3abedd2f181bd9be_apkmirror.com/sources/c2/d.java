package c2;

import android.graphics.Insets;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f61361e = new d(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f61362a;

    /* renamed from: b, reason: collision with root package name */
    public final int f61363b;

    /* renamed from: c, reason: collision with root package name */
    public final int f61364c;

    /* renamed from: d, reason: collision with root package name */
    public final int f61365d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f61365d == dVar.f61365d && this.f61362a == dVar.f61362a && this.f61364c == dVar.f61364c && this.f61363b == dVar.f61363b;
    }

    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    public static d a(d dVar, d dVar2) {
        return b(Math.max(dVar.f61362a, dVar2.f61362a), Math.max(dVar.f61363b, dVar2.f61363b), Math.max(dVar.f61364c, dVar2.f61364c), Math.max(dVar.f61365d, dVar2.f61365d));
    }

    public static d b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f61361e : new d(i10, i11, i12, i13);
    }

    public static d c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public Insets e() {
        return a.a(this.f61362a, this.f61363b, this.f61364c, this.f61365d);
    }

    public int hashCode() {
        return (((((this.f61362a * 31) + this.f61363b) * 31) + this.f61364c) * 31) + this.f61365d;
    }

    public String toString() {
        return "Insets{left=" + this.f61362a + ", top=" + this.f61363b + ", right=" + this.f61364c + ", bottom=" + this.f61365d + '}';
    }

    private d(int i10, int i11, int i12, int i13) {
        this.f61362a = i10;
        this.f61363b = i11;
        this.f61364c = i12;
        this.f61365d = i13;
    }

    public static d d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }
}
