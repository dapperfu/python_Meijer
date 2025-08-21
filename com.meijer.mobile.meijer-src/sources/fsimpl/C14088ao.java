package fsimpl;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.fullstory.rust.RustInterface;
import java.nio.ByteBuffer;

/* renamed from: fsimpl.ao, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C14088ao implements InterfaceC14101ba {

    /* renamed from: a, reason: collision with root package name */
    private final RustInterface f132911a;

    /* renamed from: b, reason: collision with root package name */
    private final aW f132912b;

    /* renamed from: c, reason: collision with root package name */
    private final aW f132913c;

    /* renamed from: d, reason: collision with root package name */
    private final aX f132914d;

    /* renamed from: e, reason: collision with root package name */
    private final aW f132915e;

    /* renamed from: f, reason: collision with root package name */
    private final C14105be f132916f;

    /* renamed from: g, reason: collision with root package name */
    private final C14111bk f132917g;

    /* renamed from: h, reason: collision with root package name */
    private final C14111bk f132918h;

    /* renamed from: i, reason: collision with root package name */
    private final C14108bh f132919i;

    /* renamed from: j, reason: collision with root package name */
    private final C14108bh f132920j;

    C14088ao(RustInterface rustInterface) {
        this.f132911a = rustInterface;
        aU aUVar = new aU();
        this.f132912b = new aW(aUVar);
        this.f132913c = new aW(aUVar);
        this.f132914d = new aX();
        this.f132915e = new aW();
        this.f132916f = new C14105be();
        this.f132917g = new C14111bk(aUVar);
        this.f132918h = new C14111bk(aUVar);
        this.f132919i = new C14108bh(aUVar);
        this.f132920j = new C14108bh(aUVar);
    }

    @Override // fsimpl.InterfaceC14101ba
    public int a(long j10, ByteBuffer byteBuffer) {
        if (byteBuffer == null || byteBuffer.limit() == 0) {
            return 0;
        }
        return this.f132911a.a(j10, byteBuffer);
    }

    @Override // fsimpl.InterfaceC14101ba
    public int a(Bitmap bitmap) {
        return this.f132912b.a(bitmap);
    }

    @Override // fsimpl.InterfaceC14101ba
    public int a(Path path) {
        return this.f132914d.a(path);
    }

    @Override // fsimpl.InterfaceC14101ba
    public int a(Shader shader) {
        return this.f132915e.a(shader);
    }

    @Override // fsimpl.InterfaceC14101ba
    public int a(Drawable drawable) {
        return this.f132919i.a(drawable);
    }

    @Override // fsimpl.InterfaceC14101ba
    public int a(String str) {
        if (str == null) {
            return 0;
        }
        return this.f132916f.a(str);
    }

    @Override // fsimpl.InterfaceC14101ba
    public int b(Bitmap bitmap) {
        return this.f132913c.a(bitmap);
    }

    @Override // fsimpl.InterfaceC14101ba
    public int b(Drawable drawable) {
        return this.f132920j.a(drawable);
    }

    @Override // fsimpl.InterfaceC14101ba
    public int c(Bitmap bitmap) {
        return this.f132917g.a(bitmap);
    }

    @Override // fsimpl.InterfaceC14101ba
    public int d(Bitmap bitmap) {
        return this.f132918h.a(bitmap);
    }
}
