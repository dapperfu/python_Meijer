package g6;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    private final int f132984a;

    /* renamed from: b, reason: collision with root package name */
    private final int f132985b;

    /* renamed from: c, reason: collision with root package name */
    private final String f132986c;

    /* renamed from: d, reason: collision with root package name */
    private final String f132987d;

    /* renamed from: e, reason: collision with root package name */
    private final String f132988e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f132989f;

    public z a(float f10) {
        z zVar = new z((int) (this.f132984a * f10), (int) (this.f132985b * f10), this.f132986c, this.f132987d, this.f132988e);
        Bitmap bitmap = this.f132989f;
        if (bitmap != null) {
            zVar.g(Bitmap.createScaledBitmap(bitmap, zVar.f132984a, zVar.f132985b, true));
        }
        return zVar;
    }

    public Bitmap b() {
        return this.f132989f;
    }

    public String c() {
        return this.f132987d;
    }

    public int d() {
        return this.f132985b;
    }

    public String e() {
        return this.f132986c;
    }

    public int f() {
        return this.f132984a;
    }

    public void g(Bitmap bitmap) {
        this.f132989f = bitmap;
    }

    public z(int i10, int i11, String str, String str2, String str3) {
        this.f132984a = i10;
        this.f132985b = i11;
        this.f132986c = str;
        this.f132987d = str2;
        this.f132988e = str3;
    }
}
