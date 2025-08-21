package hh;

import android.graphics.Rect;

/* loaded from: classes8.dex */
public class o extends q {
    private static float e(float f10) {
        return f10 < 1.0f ? 1.0f / f10 : f10;
    }

    @Override // hh.q
    protected float c(gh.q qVar, gh.q qVar2) {
        int i10 = qVar.f134232a;
        if (i10 <= 0 || qVar.f134233b <= 0) {
            return 0.0f;
        }
        float fE = (1.0f / e((i10 * 1.0f) / qVar2.f134232a)) / e((qVar.f134233b * 1.0f) / qVar2.f134233b);
        float fE2 = e(((qVar.f134232a * 1.0f) / qVar.f134233b) / ((qVar2.f134232a * 1.0f) / qVar2.f134233b));
        return fE * (((1.0f / fE2) / fE2) / fE2);
    }

    @Override // hh.q
    public Rect d(gh.q qVar, gh.q qVar2) {
        return new Rect(0, 0, qVar2.f134232a, qVar2.f134233b);
    }
}
