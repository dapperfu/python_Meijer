package ch;

import com.google.zxing.o;

/* renamed from: ch.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6508a extends o {

    /* renamed from: c, reason: collision with root package name */
    private final float f62484c;

    C6508a(float f10, float f11, float f12) {
        super(f10, f11);
        this.f62484c = f12;
    }

    boolean f(float f10, float f11, float f12) {
        if (Math.abs(f11 - d()) > f10 || Math.abs(f12 - c()) > f10) {
            return false;
        }
        float fAbs = Math.abs(f10 - this.f62484c);
        if (fAbs > 1.0f && fAbs > this.f62484c) {
            return false;
        }
        return true;
    }

    C6508a g(float f10, float f11, float f12) {
        return new C6508a((c() + f11) / 2.0f, (d() + f10) / 2.0f, (this.f62484c + f12) / 2.0f);
    }
}
