package a3;

import android.view.Surface;
import d3.C13466a;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final Surface f43578a;

    /* renamed from: b, reason: collision with root package name */
    public final int f43579b;

    /* renamed from: c, reason: collision with root package name */
    public final int f43580c;

    /* renamed from: d, reason: collision with root package name */
    public final int f43581d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f43582e;

    public E(Surface surface, int i10, int i11) {
        this(surface, i10, i11, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        return this.f43579b == e10.f43579b && this.f43580c == e10.f43580c && this.f43581d == e10.f43581d && this.f43582e == e10.f43582e && this.f43578a.equals(e10.f43578a);
    }

    public E(Surface surface, int i10, int i11, int i12) {
        this(surface, i10, i11, i12, false);
    }

    public int hashCode() {
        return (((((((this.f43578a.hashCode() * 31) + this.f43579b) * 31) + this.f43580c) * 31) + this.f43581d) * 31) + (this.f43582e ? 1 : 0);
    }

    public E(Surface surface, int i10, int i11, int i12, boolean z10) {
        C13466a.b(i12 == 0 || i12 == 90 || i12 == 180 || i12 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.f43578a = surface;
        this.f43579b = i10;
        this.f43580c = i11;
        this.f43581d = i12;
        this.f43582e = z10;
    }
}
