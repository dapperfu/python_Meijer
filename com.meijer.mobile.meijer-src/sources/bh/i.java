package bh;

import com.google.zxing.o;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f60412a;

    public void a(o[] oVarArr) {
        if (!this.f60412a || oVarArr == null || oVarArr.length < 3) {
            return;
        }
        o oVar = oVarArr[0];
        oVarArr[0] = oVarArr[2];
        oVarArr[2] = oVar;
    }

    i(boolean z10) {
        this.f60412a = z10;
    }
}
