package fsimpl;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.fullstory.rust.RustInterface;
import java.nio.ByteBuffer;

/* renamed from: fsimpl.ao, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C13963ao implements InterfaceC13976ba {

    /* renamed from: a, reason: collision with root package name */
    private final RustInterface f131661a;

    /* renamed from: b, reason: collision with root package name */
    private final aW f131662b;

    /* renamed from: c, reason: collision with root package name */
    private final aW f131663c;

    /* renamed from: d, reason: collision with root package name */
    private final aX f131664d;

    /* renamed from: e, reason: collision with root package name */
    private final aW f131665e;

    /* renamed from: f, reason: collision with root package name */
    private final C13980be f131666f;

    /* renamed from: g, reason: collision with root package name */
    private final C13986bk f131667g;

    /* renamed from: h, reason: collision with root package name */
    private final C13986bk f131668h;

    /* renamed from: i, reason: collision with root package name */
    private final C13983bh f131669i;

    /* renamed from: j, reason: collision with root package name */
    private final C13983bh f131670j;

    C13963ao(RustInterface rustInterface) {
        this.f131661a = rustInterface;
        aU aUVar = new aU();
        this.f131662b = new aW(aUVar);
        this.f131663c = new aW(aUVar);
        this.f131664d = new aX();
        this.f131665e = new aW();
        this.f131666f = new C13980be();
        this.f131667g = new C13986bk(aUVar);
        this.f131668h = new C13986bk(aUVar);
        this.f131669i = new C13983bh(aUVar);
        this.f131670j = new C13983bh(aUVar);
    }

    @Override // fsimpl.InterfaceC13976ba
    public int a(long j10, ByteBuffer byteBuffer) {
        if (byteBuffer == null || byteBuffer.limit() == 0) {
            return 0;
        }
        return this.f131661a.a(j10, byteBuffer);
    }

    @Override // fsimpl.InterfaceC13976ba
    public int a(Bitmap bitmap) {
        return this.f131662b.a(bitmap);
    }

    @Override // fsimpl.InterfaceC13976ba
    public int a(Path path) {
        return this.f131664d.a(path);
    }

    @Override // fsimpl.InterfaceC13976ba
    public int a(Shader shader) {
        return this.f131665e.a(shader);
    }

    @Override // fsimpl.InterfaceC13976ba
    public int a(Drawable drawable) {
        return this.f131669i.a(drawable);
    }

    @Override // fsimpl.InterfaceC13976ba
    public int a(String str) {
        if (str == null) {
            return 0;
        }
        return this.f131666f.a(str);
    }

    @Override // fsimpl.InterfaceC13976ba
    public int b(Bitmap bitmap) {
        return this.f131663c.a(bitmap);
    }

    @Override // fsimpl.InterfaceC13976ba
    public int b(Drawable drawable) {
        return this.f131670j.a(drawable);
    }

    @Override // fsimpl.InterfaceC13976ba
    public int c(Bitmap bitmap) {
        return this.f131667g.a(bitmap);
    }

    @Override // fsimpl.InterfaceC13976ba
    public int d(Bitmap bitmap) {
        return this.f131668h.a(bitmap);
    }
}
