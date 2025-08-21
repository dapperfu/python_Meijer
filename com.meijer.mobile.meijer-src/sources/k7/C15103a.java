package k7;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* renamed from: k7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15103a implements InterfaceC15107e<Bitmap, byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap.CompressFormat f141689a;

    /* renamed from: b, reason: collision with root package name */
    private final int f141690b;

    public C15103a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public C15103a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f141689a = compressFormat;
        this.f141690b = i10;
    }

    @Override // k7.InterfaceC15107e
    public Z6.c<byte[]> a(Z6.c<Bitmap> cVar, X6.g gVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        cVar.get().compress(this.f141689a, this.f141690b, byteArrayOutputStream);
        cVar.a();
        return new g7.b(byteArrayOutputStream.toByteArray());
    }
}
