package gh;

import android.graphics.Rect;

/* loaded from: classes7.dex */
public class o extends q {
    private static float e(float f10) {
        return f10 < 1.0f ? 1.0f / f10 : f10;
    }

    @Override // gh.q
    protected float c(fh.q qVar, fh.q qVar2) {
        int i10 = qVar.f131133a;
        if (i10 <= 0 || qVar.f131134b <= 0) {
            return 0.0f;
        }
        float fE = (1.0f / e((i10 * 1.0f) / qVar2.f131133a)) / e((qVar.f131134b * 1.0f) / qVar2.f131134b);
        float fE2 = e(((qVar.f131133a * 1.0f) / qVar.f131134b) / ((qVar2.f131133a * 1.0f) / qVar2.f131134b));
        return fE * (((1.0f / fE2) / fE2) / fE2);
    }

    @Override // gh.q
    public Rect d(fh.q qVar, fh.q qVar2) {
        return new Rect(0, 0, qVar2.f131133a, qVar2.f131134b);
    }
}
