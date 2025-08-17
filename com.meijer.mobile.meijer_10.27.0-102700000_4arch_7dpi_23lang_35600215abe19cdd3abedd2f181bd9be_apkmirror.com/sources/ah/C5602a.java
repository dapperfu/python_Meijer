package ah;

import com.google.zxing.o;

/* renamed from: ah.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5602a extends o {

    /* renamed from: c, reason: collision with root package name */
    private final float f45469c;

    C5602a(float f10, float f11, float f12) {
        super(f10, f11);
        this.f45469c = f12;
    }

    boolean f(float f10, float f11, float f12) {
        if (Math.abs(f11 - d()) > f10 || Math.abs(f12 - c()) > f10) {
            return false;
        }
        float fAbs = Math.abs(f10 - this.f45469c);
        if (fAbs > 1.0f && fAbs > this.f45469c) {
            return false;
        }
        return true;
    }

    C5602a g(float f10, float f11, float f12) {
        return new C5602a((c() + f11) / 2.0f, (d() + f10) / 2.0f, (this.f45469c + f12) / 2.0f);
    }
}
