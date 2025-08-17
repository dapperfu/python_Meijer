package ah;

import com.google.zxing.o;

/* loaded from: classes7.dex */
public final class d extends o {

    /* renamed from: c, reason: collision with root package name */
    private final float f45481c;

    /* renamed from: d, reason: collision with root package name */
    private final int f45482d;

    d(float f10, float f11, float f12) {
        this(f10, f11, f12, 1);
    }

    private d(float f10, float f11, float f12, int i10) {
        super(f10, f11);
        this.f45481c = f12;
        this.f45482d = i10;
    }

    d g(float f10, float f11, float f12) {
        int i10 = this.f45482d;
        int i11 = i10 + 1;
        float fC = (i10 * c()) + f11;
        float f13 = i11;
        return new d(fC / f13, ((this.f45482d * d()) + f10) / f13, ((this.f45482d * this.f45481c) + f12) / f13, i11);
    }

    public int h() {
        return this.f45482d;
    }

    public float i() {
        return this.f45481c;
    }

    boolean f(float f10, float f11, float f12) {
        if (Math.abs(f11 - d()) > f10 || Math.abs(f12 - c()) > f10) {
            return false;
        }
        float fAbs = Math.abs(f10 - this.f45481c);
        if (fAbs > 1.0f && fAbs > this.f45481c) {
            return false;
        }
        return true;
    }
}
