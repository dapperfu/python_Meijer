package Ku;

import Ku.i;

/* loaded from: classes7.dex */
final class b extends i {

    /* renamed from: a, reason: collision with root package name */
    private final i.a f17563a;

    @Override // Ku.i
    public i.a b() {
        return this.f17563a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f17563a.equals(((i) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f17563a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "TagMetadata{tagTtl=" + this.f17563a + "}";
    }

    b(i.a aVar) {
        if (aVar != null) {
            this.f17563a = aVar;
            return;
        }
        throw new NullPointerException("Null tagTtl");
    }
}
