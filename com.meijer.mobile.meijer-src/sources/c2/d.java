package c2;

import android.graphics.Insets;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f61160e = new d(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f61161a;

    /* renamed from: b, reason: collision with root package name */
    public final int f61162b;

    /* renamed from: c, reason: collision with root package name */
    public final int f61163c;

    /* renamed from: d, reason: collision with root package name */
    public final int f61164d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f61164d == dVar.f61164d && this.f61161a == dVar.f61161a && this.f61163c == dVar.f61163c && this.f61162b == dVar.f61162b;
    }

    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    public static d a(d dVar, d dVar2) {
        return b(Math.max(dVar.f61161a, dVar2.f61161a), Math.max(dVar.f61162b, dVar2.f61162b), Math.max(dVar.f61163c, dVar2.f61163c), Math.max(dVar.f61164d, dVar2.f61164d));
    }

    public static d b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f61160e : new d(i10, i11, i12, i13);
    }

    public static d c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public Insets e() {
        return a.a(this.f61161a, this.f61162b, this.f61163c, this.f61164d);
    }

    public int hashCode() {
        return (((((this.f61161a * 31) + this.f61162b) * 31) + this.f61163c) * 31) + this.f61164d;
    }

    public String toString() {
        return "Insets{left=" + this.f61161a + ", top=" + this.f61162b + ", right=" + this.f61163c + ", bottom=" + this.f61164d + '}';
    }

    private d(int i10, int i11, int i12, int i13) {
        this.f61161a = i10;
        this.f61162b = i11;
        this.f61163c = i12;
        this.f61164d = i13;
    }

    public static d d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }
}
