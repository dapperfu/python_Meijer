package O;

import O.C4433t;
import androidx.concurrent.futures.c;

/* renamed from: O.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4415a extends C4433t.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f22864a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22865b;

    /* renamed from: c, reason: collision with root package name */
    private final c.a<Void> f22866c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4433t.b) {
            C4433t.b bVar = (C4433t.b) obj;
            if (this.f22864a == bVar.b() && this.f22865b == bVar.c() && this.f22866c.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // O.C4433t.b
    c.a<Void> a() {
        return this.f22866c;
    }

    @Override // O.C4433t.b
    int b() {
        return this.f22864a;
    }

    @Override // O.C4433t.b
    int c() {
        return this.f22865b;
    }

    public int hashCode() {
        return ((((this.f22864a ^ 1000003) * 1000003) ^ this.f22865b) * 1000003) ^ this.f22866c.hashCode();
    }

    public String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f22864a + ", rotationDegrees=" + this.f22865b + ", completer=" + this.f22866c + "}";
    }

    C4415a(int i10, int i11, c.a<Void> aVar) {
        this.f22864a = i10;
        this.f22865b = i11;
        if (aVar != null) {
            this.f22866c = aVar;
            return;
        }
        throw new NullPointerException("Null completer");
    }
}
