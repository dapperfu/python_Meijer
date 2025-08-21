package a3;

import android.view.Surface;
import d3.C13599a;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final Surface f44396a;

    /* renamed from: b, reason: collision with root package name */
    public final int f44397b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44398c;

    /* renamed from: d, reason: collision with root package name */
    public final int f44399d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f44400e;

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
        return this.f44397b == e10.f44397b && this.f44398c == e10.f44398c && this.f44399d == e10.f44399d && this.f44400e == e10.f44400e && this.f44396a.equals(e10.f44396a);
    }

    public E(Surface surface, int i10, int i11, int i12) {
        this(surface, i10, i11, i12, false);
    }

    public int hashCode() {
        return (((((((this.f44396a.hashCode() * 31) + this.f44397b) * 31) + this.f44398c) * 31) + this.f44399d) * 31) + (this.f44400e ? 1 : 0);
    }

    public E(Surface surface, int i10, int i11, int i12, boolean z10) {
        C13599a.b(i12 == 0 || i12 == 90 || i12 == 180 || i12 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.f44396a = surface;
        this.f44397b = i10;
        this.f44398c = i11;
        this.f44399d = i12;
        this.f44400e = z10;
    }
}
