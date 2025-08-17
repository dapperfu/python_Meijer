package d7;

import android.content.Context;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class k<T> implements V6.k<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final V6.k<?> f127292b = new k();

    @Override // V6.k
    public X6.c<T> transform(Context context, X6.c<T> cVar, int i10, int i11) {
        return cVar;
    }

    @Override // V6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
    }

    public static <T> k<T> a() {
        return (k) f127292b;
    }

    private k() {
    }
}
