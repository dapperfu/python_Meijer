package ch;

import com.google.zxing.o;

/* renamed from: ch.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6511d extends o {

    /* renamed from: c, reason: collision with root package name */
    private final float f62496c;

    /* renamed from: d, reason: collision with root package name */
    private final int f62497d;

    C6511d(float f10, float f11, float f12) {
        this(f10, f11, f12, 1);
    }

    private C6511d(float f10, float f11, float f12, int i10) {
        super(f10, f11);
        this.f62496c = f12;
        this.f62497d = i10;
    }

    C6511d g(float f10, float f11, float f12) {
        int i10 = this.f62497d;
        int i11 = i10 + 1;
        float fC = (i10 * c()) + f11;
        float f13 = i11;
        return new C6511d(fC / f13, ((this.f62497d * d()) + f10) / f13, ((this.f62497d * this.f62496c) + f12) / f13, i11);
    }

    public int h() {
        return this.f62497d;
    }

    public float i() {
        return this.f62496c;
    }

    boolean f(float f10, float f11, float f12) {
        if (Math.abs(f11 - d()) > f10 || Math.abs(f12 - c()) > f10) {
            return false;
        }
        float fAbs = Math.abs(f10 - this.f62496c);
        if (fAbs > 1.0f && fAbs > this.f62496c) {
            return false;
        }
        return true;
    }
}
