package h7;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C6514g;

/* loaded from: classes4.dex */
public final class h implements V6.i<U6.a, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final Y6.d f134494a;

    @Override // V6.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(U6.a aVar, V6.g gVar) {
        return true;
    }

    public h(Y6.d dVar) {
        this.f134494a = dVar;
    }

    @Override // V6.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public X6.c<Bitmap> b(U6.a aVar, int i10, int i11, V6.g gVar) {
        return C6514g.e(aVar.a(), this.f134494a);
    }
}
