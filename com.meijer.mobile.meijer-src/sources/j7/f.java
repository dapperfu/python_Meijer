package j7;

import X6.k;
import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C6639g;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public class f implements k<C14961c> {

    /* renamed from: b, reason: collision with root package name */
    private final k<Bitmap> f140157b;

    @Override // X6.e
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f140157b.equals(((f) obj).f140157b);
        }
        return false;
    }

    @Override // X6.e
    public int hashCode() {
        return this.f140157b.hashCode();
    }

    @Override // X6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f140157b.updateDiskCacheKey(messageDigest);
    }

    public f(k<Bitmap> kVar) {
        this.f140157b = (k) r7.k.d(kVar);
    }

    @Override // X6.k
    public Z6.c<C14961c> transform(Context context, Z6.c<C14961c> cVar, int i10, int i11) {
        C14961c c14961c = cVar.get();
        Z6.c<Bitmap> c6639g = new C6639g(c14961c.e(), com.bumptech.glide.b.c(context).f());
        Z6.c<Bitmap> cVarTransform = this.f140157b.transform(context, c6639g, i10, i11);
        if (!c6639g.equals(cVarTransform)) {
            c6639g.a();
        }
        c14961c.m(this.f140157b, cVarTransform.get());
        return cVar;
    }
}
