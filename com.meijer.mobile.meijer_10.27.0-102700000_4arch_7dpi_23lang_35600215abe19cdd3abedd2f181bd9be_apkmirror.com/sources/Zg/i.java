package Zg;

import com.google.zxing.o;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f42745a;

    public void a(o[] oVarArr) {
        if (!this.f42745a || oVarArr == null || oVarArr.length < 3) {
            return;
        }
        o oVar = oVarArr[0];
        oVarArr[0] = oVarArr[2];
        oVarArr[2] = oVar;
    }

    i(boolean z10) {
        this.f42745a = z10;
    }
}
