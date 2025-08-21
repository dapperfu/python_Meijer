package Be;

import Be.e;
import java.util.List;

/* loaded from: classes4.dex */
final class l extends e.a {

    /* renamed from: a, reason: collision with root package name */
    private List f2737a;

    @Override // Be.e.a
    public final e a() {
        List list = this.f2737a;
        if (list != null) {
            return new p(list);
        }
        throw new IllegalStateException("Missing required properties: iconClickFallbackImageList");
    }

    public final e.a b(List list) {
        if (list == null) {
            throw new NullPointerException("Null iconClickFallbackImageList");
        }
        this.f2737a = list;
        return this;
    }

    l() {
    }
}
