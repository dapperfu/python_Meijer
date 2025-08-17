package gh;

import android.graphics.Rect;
import com.fullstory.FS;

/* loaded from: classes7.dex */
public class n extends q {

    /* renamed from: b, reason: collision with root package name */
    private static final String f133459b = "n";

    @Override // gh.q
    protected float c(fh.q qVar, fh.q qVar2) {
        if (qVar.f131133a <= 0 || qVar.f131134b <= 0) {
            return 0.0f;
        }
        fh.q qVarL = qVar.l(qVar2);
        float fPow = (qVarL.f131133a * 1.0f) / qVar.f131133a;
        if (fPow > 1.0f) {
            fPow = (float) Math.pow(1.0f / fPow, 1.1d);
        }
        float f10 = ((qVar2.f131133a * 1.0f) / qVarL.f131133a) * ((qVar2.f131134b * 1.0f) / qVarL.f131134b);
        return fPow * (((1.0f / f10) / f10) / f10);
    }

    @Override // gh.q
    public Rect d(fh.q qVar, fh.q qVar2) {
        fh.q qVarL = qVar.l(qVar2);
        FS.log_i(f133459b, "Preview: " + qVar + "; Scaled: " + qVarL + "; Want: " + qVar2);
        int i10 = (qVarL.f131133a - qVar2.f131133a) / 2;
        int i11 = (qVarL.f131134b - qVar2.f131134b) / 2;
        return new Rect(-i10, -i11, qVarL.f131133a - i10, qVarL.f131134b - i11);
    }
}
