package hh;

import android.graphics.Rect;
import com.fullstory.FS;

/* loaded from: classes8.dex */
public class n extends q {

    /* renamed from: b, reason: collision with root package name */
    private static final String f135525b = "n";

    @Override // hh.q
    protected float c(gh.q qVar, gh.q qVar2) {
        if (qVar.f134232a <= 0 || qVar.f134233b <= 0) {
            return 0.0f;
        }
        gh.q qVarL = qVar.l(qVar2);
        float fPow = (qVarL.f134232a * 1.0f) / qVar.f134232a;
        if (fPow > 1.0f) {
            fPow = (float) Math.pow(1.0f / fPow, 1.1d);
        }
        float f10 = ((qVar2.f134232a * 1.0f) / qVarL.f134232a) * ((qVar2.f134233b * 1.0f) / qVarL.f134233b);
        return fPow * (((1.0f / f10) / f10) / f10);
    }

    @Override // hh.q
    public Rect d(gh.q qVar, gh.q qVar2) {
        gh.q qVarL = qVar.l(qVar2);
        FS.log_i(f135525b, "Preview: " + qVar + "; Scaled: " + qVarL + "; Want: " + qVar2);
        int i10 = (qVarL.f134232a - qVar2.f134232a) / 2;
        int i11 = (qVarL.f134233b - qVar2.f134233b) / 2;
        return new Rect(-i10, -i11, qVarL.f134232a - i10, qVarL.f134233b - i11);
    }
}
