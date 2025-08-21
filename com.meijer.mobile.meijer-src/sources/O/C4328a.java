package O;

import O.C4346t;
import androidx.concurrent.futures.c;

/* renamed from: O.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4328a extends C4346t.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f22857a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22858b;

    /* renamed from: c, reason: collision with root package name */
    private final c.a<Void> f22859c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4346t.b) {
            C4346t.b bVar = (C4346t.b) obj;
            if (this.f22857a == bVar.b() && this.f22858b == bVar.c() && this.f22859c.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // O.C4346t.b
    c.a<Void> a() {
        return this.f22859c;
    }

    @Override // O.C4346t.b
    int b() {
        return this.f22857a;
    }

    @Override // O.C4346t.b
    int c() {
        return this.f22858b;
    }

    public int hashCode() {
        return ((((this.f22857a ^ 1000003) * 1000003) ^ this.f22858b) * 1000003) ^ this.f22859c.hashCode();
    }

    public String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f22857a + ", rotationDegrees=" + this.f22858b + ", completer=" + this.f22859c + "}";
    }

    C4328a(int i10, int i11, c.a<Void> aVar) {
        this.f22857a = i10;
        this.f22858b = i11;
        if (aVar != null) {
            this.f22859c = aVar;
            return;
        }
        throw new NullPointerException("Null completer");
    }
}
