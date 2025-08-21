package Be;

import java.util.List;

/* loaded from: classes4.dex */
abstract class b extends e {

    /* renamed from: a, reason: collision with root package name */
    private final List f2718a;

    @Override // Be.e
    public List<d> b() {
        return this.f2718a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.f2718a.equals(((e) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f2718a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "IconClickFallbackImages{iconClickFallbackImageList=" + this.f2718a.toString() + "}";
    }

    b(List list) {
        if (list != null) {
            this.f2718a = list;
            return;
        }
        throw new NullPointerException("Null iconClickFallbackImageList");
    }
}
