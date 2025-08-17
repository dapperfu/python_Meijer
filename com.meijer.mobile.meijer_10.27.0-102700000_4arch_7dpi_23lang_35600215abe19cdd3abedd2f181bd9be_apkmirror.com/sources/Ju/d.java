package Ju;

import java.util.List;

/* loaded from: classes7.dex */
final class d extends i {

    /* renamed from: b, reason: collision with root package name */
    private final List<Double> f16138b;

    @Override // Ju.i
    public List<Double> c() {
        return this.f16138b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f16138b.equals(((i) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f16138b.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BucketBoundaries{boundaries=" + this.f16138b + "}";
    }

    d(List<Double> list) {
        if (list != null) {
            this.f16138b = list;
            return;
        }
        throw new NullPointerException("Null boundaries");
    }
}
