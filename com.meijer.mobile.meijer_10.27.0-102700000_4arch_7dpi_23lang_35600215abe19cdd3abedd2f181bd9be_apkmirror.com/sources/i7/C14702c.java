package i7;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.bitmap.C6514g;
import h7.C14383c;

/* renamed from: i7.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14702c implements InterfaceC14704e<Drawable, byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final Y6.d f137603a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14704e<Bitmap, byte[]> f137604b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC14704e<C14383c, byte[]> f137605c;

    /* JADX WARN: Multi-variable type inference failed */
    private static X6.c<C14383c> b(X6.c<Drawable> cVar) {
        return cVar;
    }

    public C14702c(Y6.d dVar, InterfaceC14704e<Bitmap, byte[]> interfaceC14704e, InterfaceC14704e<C14383c, byte[]> interfaceC14704e2) {
        this.f137603a = dVar;
        this.f137604b = interfaceC14704e;
        this.f137605c = interfaceC14704e2;
    }

    @Override // i7.InterfaceC14704e
    public X6.c<byte[]> a(X6.c<Drawable> cVar, V6.g gVar) {
        Drawable drawable = cVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f137604b.a(C6514g.e(((BitmapDrawable) drawable).getBitmap(), this.f137603a), gVar);
        }
        if (drawable instanceof C14383c) {
            return this.f137605c.a(b(cVar), gVar);
        }
        return null;
    }
}
