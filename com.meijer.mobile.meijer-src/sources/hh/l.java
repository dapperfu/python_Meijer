package hh;

import android.graphics.Rect;
import com.fullstory.FS;

/* loaded from: classes8.dex */
public class l extends q {

    /* renamed from: b, reason: collision with root package name */
    private static final String f135520b = "l";

    @Override // hh.q
    protected float c(gh.q qVar, gh.q qVar2) {
        if (qVar.f134232a <= 0 || qVar.f134233b <= 0) {
            return 0.0f;
        }
        gh.q qVarE = qVar.e(qVar2);
        float fPow = (qVarE.f134232a * 1.0f) / qVar.f134232a;
        if (fPow > 1.0f) {
            fPow = (float) Math.pow(1.0f / fPow, 1.1d);
        }
        float f10 = ((qVarE.f134232a * 1.0f) / qVar2.f134232a) + ((qVarE.f134233b * 1.0f) / qVar2.f134233b);
        return fPow * ((1.0f / f10) / f10);
    }

    @Override // hh.q
    public Rect d(gh.q qVar, gh.q qVar2) {
        gh.q qVarE = qVar.e(qVar2);
        FS.log_i(f135520b, "Preview: " + qVar + "; Scaled: " + qVarE + "; Want: " + qVar2);
        int i10 = (qVarE.f134232a - qVar2.f134232a) / 2;
        int i11 = (qVarE.f134233b - qVar2.f134233b) / 2;
        return new Rect(-i10, -i11, qVarE.f134232a - i10, qVarE.f134233b - i11);
    }
}
