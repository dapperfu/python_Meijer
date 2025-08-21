package k7;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.resource.bitmap.A;
import r7.k;

/* renamed from: k7.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15104b implements InterfaceC15107e<Bitmap, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f141691a;

    @Override // k7.InterfaceC15107e
    public Z6.c<BitmapDrawable> a(Z6.c<Bitmap> cVar, X6.g gVar) {
        return A.e(this.f141691a, cVar);
    }

    public C15104b(Resources resources) {
        this.f141691a = (Resources) k.d(resources);
    }
}
