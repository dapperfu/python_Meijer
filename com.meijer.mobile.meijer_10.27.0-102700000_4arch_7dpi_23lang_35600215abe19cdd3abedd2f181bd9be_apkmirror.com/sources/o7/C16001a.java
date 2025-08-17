package o7;

import V6.e;
import android.content.Context;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p7.l;

/* renamed from: o7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16001a implements e {

    /* renamed from: b, reason: collision with root package name */
    private final int f153195b;

    /* renamed from: c, reason: collision with root package name */
    private final e f153196c;

    @Override // V6.e
    public boolean equals(Object obj) {
        if (obj instanceof C16001a) {
            C16001a c16001a = (C16001a) obj;
            if (this.f153195b == c16001a.f153195b && this.f153196c.equals(c16001a.f153196c)) {
                return true;
            }
        }
        return false;
    }

    @Override // V6.e
    public int hashCode() {
        return l.o(this.f153196c, this.f153195b);
    }

    @Override // V6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f153196c.updateDiskCacheKey(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f153195b).array());
    }

    private C16001a(int i10, e eVar) {
        this.f153195b = i10;
        this.f153196c = eVar;
    }

    public static e a(Context context) {
        return new C16001a(context.getResources().getConfiguration().uiMode & 48, b.c(context));
    }
}
