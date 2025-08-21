package Fu;

import java.util.List;

/* loaded from: classes8.dex */
final class d extends i {

    /* renamed from: b, reason: collision with root package name */
    private final List<Double> f10937b;

    @Override // Fu.i
    public List<Double> c() {
        return this.f10937b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f10937b.equals(((i) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f10937b.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BucketBoundaries{boundaries=" + this.f10937b + "}";
    }

    d(List<Double> list) {
        if (list != null) {
            this.f10937b = list;
            return;
        }
        throw new NullPointerException("Null boundaries");
    }
}
