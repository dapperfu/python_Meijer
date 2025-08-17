package androidx.camera.core.impl;

import C.C2979w;
import F.v0;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.E;
import java.util.List;

/* renamed from: androidx.camera.core.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5651b extends AbstractC5650a {

    /* renamed from: a, reason: collision with root package name */
    private final v0 f47353a;

    /* renamed from: b, reason: collision with root package name */
    private final int f47354b;

    /* renamed from: c, reason: collision with root package name */
    private final Size f47355c;

    /* renamed from: d, reason: collision with root package name */
    private final C2979w f47356d;

    /* renamed from: e, reason: collision with root package name */
    private final List<E.b> f47357e;

    /* renamed from: f, reason: collision with root package name */
    private final k f47358f;

    /* renamed from: g, reason: collision with root package name */
    private final Range<Integer> f47359g;

    public boolean equals(Object obj) {
        k kVar;
        Range<Integer> range;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5650a) {
            AbstractC5650a abstractC5650a = (AbstractC5650a) obj;
            if (this.f47353a.equals(abstractC5650a.g()) && this.f47354b == abstractC5650a.d() && this.f47355c.equals(abstractC5650a.f()) && this.f47356d.equals(abstractC5650a.c()) && this.f47357e.equals(abstractC5650a.b()) && ((kVar = this.f47358f) != null ? kVar.equals(abstractC5650a.e()) : abstractC5650a.e() == null) && ((range = this.f47359g) != null ? range.equals(abstractC5650a.h()) : abstractC5650a.h() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.AbstractC5650a
    public List<E.b> b() {
        return this.f47357e;
    }

    @Override // androidx.camera.core.impl.AbstractC5650a
    public C2979w c() {
        return this.f47356d;
    }

    @Override // androidx.camera.core.impl.AbstractC5650a
    public int d() {
        return this.f47354b;
    }

    @Override // androidx.camera.core.impl.AbstractC5650a
    public k e() {
        return this.f47358f;
    }

    @Override // androidx.camera.core.impl.AbstractC5650a
    public Size f() {
        return this.f47355c;
    }

    @Override // androidx.camera.core.impl.AbstractC5650a
    public v0 g() {
        return this.f47353a;
    }

    @Override // androidx.camera.core.impl.AbstractC5650a
    public Range<Integer> h() {
        return this.f47359g;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.f47353a.hashCode() ^ 1000003) * 1000003) ^ this.f47354b) * 1000003) ^ this.f47355c.hashCode()) * 1000003) ^ this.f47356d.hashCode()) * 1000003) ^ this.f47357e.hashCode()) * 1000003;
        k kVar = this.f47358f;
        int iHashCode2 = (iHashCode ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Range<Integer> range = this.f47359g;
        return iHashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f47353a + ", imageFormat=" + this.f47354b + ", size=" + this.f47355c + ", dynamicRange=" + this.f47356d + ", captureTypes=" + this.f47357e + ", implementationOptions=" + this.f47358f + ", targetFrameRate=" + this.f47359g + "}";
    }

    C5651b(v0 v0Var, int i10, Size size, C2979w c2979w, List<E.b> list, k kVar, Range<Integer> range) {
        if (v0Var != null) {
            this.f47353a = v0Var;
            this.f47354b = i10;
            if (size != null) {
                this.f47355c = size;
                if (c2979w != null) {
                    this.f47356d = c2979w;
                    if (list != null) {
                        this.f47357e = list;
                        this.f47358f = kVar;
                        this.f47359g = range;
                        return;
                    }
                    throw new NullPointerException("Null captureTypes");
                }
                throw new NullPointerException("Null dynamicRange");
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surfaceConfig");
    }
}
