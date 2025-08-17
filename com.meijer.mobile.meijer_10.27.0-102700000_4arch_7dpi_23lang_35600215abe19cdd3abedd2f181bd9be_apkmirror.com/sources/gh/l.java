package gh;

import android.graphics.Rect;
import com.fullstory.FS;

/* loaded from: classes7.dex */
public class l extends q {

    /* renamed from: b, reason: collision with root package name */
    private static final String f133454b = "l";

    @Override // gh.q
    protected float c(fh.q qVar, fh.q qVar2) {
        if (qVar.f131133a <= 0 || qVar.f131134b <= 0) {
            return 0.0f;
        }
        fh.q qVarE = qVar.e(qVar2);
        float fPow = (qVarE.f131133a * 1.0f) / qVar.f131133a;
        if (fPow > 1.0f) {
            fPow = (float) Math.pow(1.0f / fPow, 1.1d);
        }
        float f10 = ((qVarE.f131133a * 1.0f) / qVar2.f131133a) + ((qVarE.f131134b * 1.0f) / qVar2.f131134b);
        return fPow * ((1.0f / f10) / f10);
    }

    @Override // gh.q
    public Rect d(fh.q qVar, fh.q qVar2) {
        fh.q qVarE = qVar.e(qVar2);
        FS.log_i(f133454b, "Preview: " + qVar + "; Scaled: " + qVarE + "; Want: " + qVar2);
        int i10 = (qVarE.f131133a - qVar2.f131133a) / 2;
        int i11 = (qVarE.f131134b - qVar2.f131134b) / 2;
        return new Rect(-i10, -i11, qVarE.f131133a - i10, qVarE.f131134b - i11);
    }
}
