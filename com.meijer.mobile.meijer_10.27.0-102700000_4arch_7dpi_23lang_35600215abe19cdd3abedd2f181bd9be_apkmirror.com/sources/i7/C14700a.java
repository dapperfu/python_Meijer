package i7;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* renamed from: i7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14700a implements InterfaceC14704e<Bitmap, byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap.CompressFormat f137600a;

    /* renamed from: b, reason: collision with root package name */
    private final int f137601b;

    public C14700a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public C14700a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f137600a = compressFormat;
        this.f137601b = i10;
    }

    @Override // i7.InterfaceC14704e
    public X6.c<byte[]> a(X6.c<Bitmap> cVar, V6.g gVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        cVar.get().compress(this.f137600a, this.f137601b, byteArrayOutputStream);
        cVar.a();
        return new e7.b(byteArrayOutputStream.toByteArray());
    }
}
