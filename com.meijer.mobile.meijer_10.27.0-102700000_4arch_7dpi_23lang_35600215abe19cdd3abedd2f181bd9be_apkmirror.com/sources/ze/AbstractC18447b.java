package ze;

import java.util.List;

/* renamed from: ze.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC18447b extends e {

    /* renamed from: a, reason: collision with root package name */
    private final List f171804a;

    @Override // ze.e
    public List<AbstractC18449d> b() {
        return this.f171804a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.f171804a.equals(((e) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f171804a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "IconClickFallbackImages{iconClickFallbackImageList=" + this.f171804a.toString() + "}";
    }

    AbstractC18447b(List list) {
        if (list != null) {
            this.f171804a = list;
            return;
        }
        throw new NullPointerException("Null iconClickFallbackImageList");
    }
}
