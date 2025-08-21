package q7;

import X6.e;
import java.security.MessageDigest;
import r7.k;

/* loaded from: classes4.dex */
public final class d implements e {

    /* renamed from: b, reason: collision with root package name */
    private final Object f158051b;

    @Override // X6.e
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f158051b.equals(((d) obj).f158051b);
        }
        return false;
    }

    @Override // X6.e
    public int hashCode() {
        return this.f158051b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f158051b + '}';
    }

    @Override // X6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(this.f158051b.toString().getBytes(e.f41646a));
    }

    public d(Object obj) {
        this.f158051b = k.d(obj);
    }
}
