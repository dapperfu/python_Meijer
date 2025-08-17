package Mc;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public static final c2 f19212a = new c2();

    public final Y1 a(Context context, C4115f1 c4115f1) {
        String strS;
        String strI = c4115f1.i();
        Set setN = c4115f1.n();
        List listUnmodifiableList = !setN.isEmpty() ? Collections.unmodifiableList(new ArrayList(setN)) : null;
        boolean zQ = c4115f1.q(context);
        Bundle bundleE = c4115f1.e(AdMobAdapter.class);
        String strJ = c4115f1.j();
        c4115f1.g();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            C4169y.b();
            strS = Qc.g.s(Thread.currentThread().getStackTrace(), packageName);
        } else {
            strS = null;
        }
        boolean zP = c4115f1.p();
        Ec.o oVarE = C4142o1.h().e();
        return new Y1(8, -1L, bundleE, -1, listUnmodifiableList, zQ, Math.max(c4115f1.b(), oVarE.c()), false, strJ, null, null, strI, c4115f1.f(), c4115f1.d(), Collections.unmodifiableList(new ArrayList(c4115f1.m())), c4115f1.k(), strS, zP, null, oVarE.d(), (String) Collections.max(Arrays.asList(null, oVarE.a()), new Comparator() { // from class: Mc.b2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = Ec.o.f7794f;
                return list.indexOf((String) obj) - list.indexOf((String) obj2);
            }
        }), c4115f1.l(), c4115f1.a(), c4115f1.h(), oVarE.b().a(), c4115f1.c());
    }

    protected c2() {
    }
}
