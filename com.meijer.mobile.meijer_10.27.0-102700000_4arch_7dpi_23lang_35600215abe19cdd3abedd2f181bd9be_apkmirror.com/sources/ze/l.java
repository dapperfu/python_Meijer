package ze;

import java.util.List;
import ze.e;

/* loaded from: classes5.dex */
final class l extends e.a {

    /* renamed from: a, reason: collision with root package name */
    private List f171823a;

    @Override // ze.e.a
    public final e a() {
        List list = this.f171823a;
        if (list != null) {
            return new p(list);
        }
        throw new IllegalStateException("Missing required properties: iconClickFallbackImageList");
    }

    public final e.a b(List list) {
        if (list == null) {
            throw new NullPointerException("Null iconClickFallbackImageList");
        }
        this.f171823a = list;
        return this;
    }

    l() {
    }
}
