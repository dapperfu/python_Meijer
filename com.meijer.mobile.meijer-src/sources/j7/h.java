package j7;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C6639g;

/* loaded from: classes4.dex */
public final class h implements X6.i<W6.a, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final a7.d f140181a;

    @Override // X6.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(W6.a aVar, X6.g gVar) {
        return true;
    }

    public h(a7.d dVar) {
        this.f140181a = dVar;
    }

    @Override // X6.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Z6.c<Bitmap> b(W6.a aVar, int i10, int i11, X6.g gVar) {
        return C6639g.e(aVar.a(), this.f140181a);
    }
}
