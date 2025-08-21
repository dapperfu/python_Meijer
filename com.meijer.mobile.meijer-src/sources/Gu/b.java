package Gu;

import Gu.i;

/* loaded from: classes8.dex */
final class b extends i {

    /* renamed from: a, reason: collision with root package name */
    private final i.a f13246a;

    @Override // Gu.i
    public i.a b() {
        return this.f13246a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f13246a.equals(((i) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f13246a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "TagMetadata{tagTtl=" + this.f13246a + "}";
    }

    b(i.a aVar) {
        if (aVar != null) {
            this.f13246a = aVar;
            return;
        }
        throw new NullPointerException("Null tagTtl");
    }
}
