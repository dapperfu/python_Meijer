package i7;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.resource.bitmap.A;
import p7.k;

/* renamed from: i7.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14701b implements InterfaceC14704e<Bitmap, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f137602a;

    @Override // i7.InterfaceC14704e
    public X6.c<BitmapDrawable> a(X6.c<Bitmap> cVar, V6.g gVar) {
        return A.e(this.f137602a, cVar);
    }

    public C14701b(Resources resources) {
        this.f137602a = (Resources) k.d(resources);
    }
}
