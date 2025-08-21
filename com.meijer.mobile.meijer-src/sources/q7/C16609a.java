package q7;

import X6.e;
import android.content.Context;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import r7.l;

/* renamed from: q7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16609a implements e {

    /* renamed from: b, reason: collision with root package name */
    private final int f158047b;

    /* renamed from: c, reason: collision with root package name */
    private final e f158048c;

    @Override // X6.e
    public boolean equals(Object obj) {
        if (obj instanceof C16609a) {
            C16609a c16609a = (C16609a) obj;
            if (this.f158047b == c16609a.f158047b && this.f158048c.equals(c16609a.f158048c)) {
                return true;
            }
        }
        return false;
    }

    @Override // X6.e
    public int hashCode() {
        return l.o(this.f158048c, this.f158047b);
    }

    @Override // X6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f158048c.updateDiskCacheKey(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f158047b).array());
    }

    private C16609a(int i10, e eVar) {
        this.f158047b = i10;
        this.f158048c = eVar;
    }

    public static e a(Context context) {
        return new C16609a(context.getResources().getConfiguration().uiMode & 48, b.c(context));
    }
}
