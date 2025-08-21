package f7;

import android.content.Context;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class k<T> implements X6.k<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final X6.k<?> f131621b = new k();

    @Override // X6.k
    public Z6.c<T> transform(Context context, Z6.c<T> cVar, int i10, int i11) {
        return cVar;
    }

    @Override // X6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
    }

    public static <T> k<T> a() {
        return (k) f131621b;
    }

    private k() {
    }
}
