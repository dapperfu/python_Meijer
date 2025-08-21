package h6;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    private final int f135160a;

    /* renamed from: b, reason: collision with root package name */
    private final int f135161b;

    /* renamed from: c, reason: collision with root package name */
    private final String f135162c;

    /* renamed from: d, reason: collision with root package name */
    private final String f135163d;

    /* renamed from: e, reason: collision with root package name */
    private final String f135164e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f135165f;

    public z a(float f10) {
        z zVar = new z((int) (this.f135160a * f10), (int) (this.f135161b * f10), this.f135162c, this.f135163d, this.f135164e);
        Bitmap bitmap = this.f135165f;
        if (bitmap != null) {
            zVar.g(Bitmap.createScaledBitmap(bitmap, zVar.f135160a, zVar.f135161b, true));
        }
        return zVar;
    }

    public Bitmap b() {
        return this.f135165f;
    }

    public String c() {
        return this.f135163d;
    }

    public int d() {
        return this.f135161b;
    }

    public String e() {
        return this.f135162c;
    }

    public int f() {
        return this.f135160a;
    }

    public void g(Bitmap bitmap) {
        this.f135165f = bitmap;
    }

    public z(int i10, int i11, String str, String str2, String str3) {
        this.f135160a = i10;
        this.f135161b = i11;
        this.f135162c = str;
        this.f135163d = str2;
        this.f135164e = str3;
    }
}
