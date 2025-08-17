package o7;

import V6.e;
import java.security.MessageDigest;
import p7.k;

/* loaded from: classes4.dex */
public final class d implements e {

    /* renamed from: b, reason: collision with root package name */
    private final Object f153199b;

    @Override // V6.e
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f153199b.equals(((d) obj).f153199b);
        }
        return false;
    }

    @Override // V6.e
    public int hashCode() {
        return this.f153199b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f153199b + '}';
    }

    @Override // V6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(this.f153199b.toString().getBytes(e.f36934a));
    }

    public d(Object obj) {
        this.f153199b = k.d(obj);
    }
}
