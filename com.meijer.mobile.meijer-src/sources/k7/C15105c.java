package k7;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.bitmap.C6639g;
import j7.C14961c;

/* renamed from: k7.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15105c implements InterfaceC15107e<Drawable, byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final a7.d f141692a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15107e<Bitmap, byte[]> f141693b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC15107e<C14961c, byte[]> f141694c;

    /* JADX WARN: Multi-variable type inference failed */
    private static Z6.c<C14961c> b(Z6.c<Drawable> cVar) {
        return cVar;
    }

    public C15105c(a7.d dVar, InterfaceC15107e<Bitmap, byte[]> interfaceC15107e, InterfaceC15107e<C14961c, byte[]> interfaceC15107e2) {
        this.f141692a = dVar;
        this.f141693b = interfaceC15107e;
        this.f141694c = interfaceC15107e2;
    }

    @Override // k7.InterfaceC15107e
    public Z6.c<byte[]> a(Z6.c<Drawable> cVar, X6.g gVar) {
        Drawable drawable = cVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f141693b.a(C6639g.e(((BitmapDrawable) drawable).getBitmap(), this.f141692a), gVar);
        }
        if (drawable instanceof C14961c) {
            return this.f141694c.a(b(cVar), gVar);
        }
        return null;
    }
}
