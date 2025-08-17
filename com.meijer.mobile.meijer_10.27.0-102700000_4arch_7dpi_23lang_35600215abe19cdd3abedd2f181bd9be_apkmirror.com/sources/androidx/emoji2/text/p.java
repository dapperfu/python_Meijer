package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public class p {

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<I2.a> f54659d = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    private final int f54660a;

    /* renamed from: b, reason: collision with root package name */
    private final n f54661b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f54662c = 0;

    private I2.a g() {
        ThreadLocal<I2.a> threadLocal = f54659d;
        I2.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new I2.a();
            threadLocal.set(aVar);
        }
        this.f54661b.d().j(aVar, this.f54660a);
        return aVar;
    }

    public void a(Canvas canvas, float f10, float f11, Paint paint) {
        Typeface typefaceG = this.f54661b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceG);
        canvas.drawText(this.f54661b.c(), this.f54660a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int d() {
        return this.f54662c & 3;
    }

    public boolean k() {
        return (this.f54662c & 4) > 0;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void m(boolean z10) {
        int i10 = this.f54662c & 4;
        this.f54662c = z10 ? i10 | 2 : i10 | 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(f()));
        sb2.append(", codepoints:");
        int iC = c();
        for (int i10 = 0; i10 < iC; i10++) {
            sb2.append(Integer.toHexString(b(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }

    p(n nVar, int i10) {
        this.f54661b = nVar;
        this.f54660a = i10;
    }

    public int b(int i10) {
        return g().h(i10);
    }

    public int c() {
        return g().i();
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public void l(boolean z10) {
        int iD = d();
        if (z10) {
            this.f54662c = iD | 4;
        } else {
            this.f54662c = iD;
        }
    }
}
