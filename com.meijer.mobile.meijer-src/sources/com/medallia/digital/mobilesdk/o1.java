package com.medallia.digital.mobilesdk;

import android.graphics.Point;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes8.dex */
class o1 extends y5<String> {
    protected o1(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private String s() {
        Point pointE = this.f94464g.e();
        if (pointE == null) {
            pointE = new Point();
        }
        return String.format(Locale.US, "%d*%d", Integer.valueOf(pointE.x), Integer.valueOf(pointE.y));
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f93771c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String j() {
        String strS = s();
        a4.b(String.format("Collectors > Resolution: %s", strS));
        return strS;
    }
}
