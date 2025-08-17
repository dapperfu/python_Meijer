package h7;

import V6.k;
import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C6514g;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public class f implements k<C14383c> {

    /* renamed from: b, reason: collision with root package name */
    private final k<Bitmap> f134470b;

    @Override // V6.e
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f134470b.equals(((f) obj).f134470b);
        }
        return false;
    }

    @Override // V6.e
    public int hashCode() {
        return this.f134470b.hashCode();
    }

    @Override // V6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f134470b.updateDiskCacheKey(messageDigest);
    }

    public f(k<Bitmap> kVar) {
        this.f134470b = (k) p7.k.d(kVar);
    }

    @Override // V6.k
    public X6.c<C14383c> transform(Context context, X6.c<C14383c> cVar, int i10, int i11) {
        C14383c c14383c = cVar.get();
        X6.c<Bitmap> c6514g = new C6514g(c14383c.e(), com.bumptech.glide.b.c(context).f());
        X6.c<Bitmap> cVarTransform = this.f134470b.transform(context, c6514g, i10, i11);
        if (!c6514g.equals(cVarTransform)) {
            c6514g.a();
        }
        c14383c.m(this.f134470b, cVarTransform.get());
        return cVar;
    }
}
