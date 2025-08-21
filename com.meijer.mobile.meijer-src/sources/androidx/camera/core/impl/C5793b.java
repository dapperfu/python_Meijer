package androidx.camera.core.impl;

import C.C3037w;
import F.v0;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.E;
import java.util.List;

/* renamed from: androidx.camera.core.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5793b extends AbstractC5792a {

    /* renamed from: a, reason: collision with root package name */
    private final v0 f47577a;

    /* renamed from: b, reason: collision with root package name */
    private final int f47578b;

    /* renamed from: c, reason: collision with root package name */
    private final Size f47579c;

    /* renamed from: d, reason: collision with root package name */
    private final C3037w f47580d;

    /* renamed from: e, reason: collision with root package name */
    private final List<E.b> f47581e;

    /* renamed from: f, reason: collision with root package name */
    private final k f47582f;

    /* renamed from: g, reason: collision with root package name */
    private final Range<Integer> f47583g;

    public boolean equals(Object obj) {
        k kVar;
        Range<Integer> range;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5792a) {
            AbstractC5792a abstractC5792a = (AbstractC5792a) obj;
            if (this.f47577a.equals(abstractC5792a.g()) && this.f47578b == abstractC5792a.d() && this.f47579c.equals(abstractC5792a.f()) && this.f47580d.equals(abstractC5792a.c()) && this.f47581e.equals(abstractC5792a.b()) && ((kVar = this.f47582f) != null ? kVar.equals(abstractC5792a.e()) : abstractC5792a.e() == null) && ((range = this.f47583g) != null ? range.equals(abstractC5792a.h()) : abstractC5792a.h() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.AbstractC5792a
    public List<E.b> b() {
        return this.f47581e;
    }

    @Override // androidx.camera.core.impl.AbstractC5792a
    public C3037w c() {
        return this.f47580d;
    }

    @Override // androidx.camera.core.impl.AbstractC5792a
    public int d() {
        return this.f47578b;
    }

    @Override // androidx.camera.core.impl.AbstractC5792a
    public k e() {
        return this.f47582f;
    }

    @Override // androidx.camera.core.impl.AbstractC5792a
    public Size f() {
        return this.f47579c;
    }

    @Override // androidx.camera.core.impl.AbstractC5792a
    public v0 g() {
        return this.f47577a;
    }

    @Override // androidx.camera.core.impl.AbstractC5792a
    public Range<Integer> h() {
        return this.f47583g;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.f47577a.hashCode() ^ 1000003) * 1000003) ^ this.f47578b) * 1000003) ^ this.f47579c.hashCode()) * 1000003) ^ this.f47580d.hashCode()) * 1000003) ^ this.f47581e.hashCode()) * 1000003;
        k kVar = this.f47582f;
        int iHashCode2 = (iHashCode ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Range<Integer> range = this.f47583g;
        return iHashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f47577a + ", imageFormat=" + this.f47578b + ", size=" + this.f47579c + ", dynamicRange=" + this.f47580d + ", captureTypes=" + this.f47581e + ", implementationOptions=" + this.f47582f + ", targetFrameRate=" + this.f47583g + "}";
    }

    C5793b(v0 v0Var, int i10, Size size, C3037w c3037w, List<E.b> list, k kVar, Range<Integer> range) {
        if (v0Var != null) {
            this.f47577a = v0Var;
            this.f47578b = i10;
            if (size != null) {
                this.f47579c = size;
                if (c3037w != null) {
                    this.f47580d = c3037w;
                    if (list != null) {
                        this.f47581e = list;
                        this.f47582f = kVar;
                        this.f47583g = range;
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
