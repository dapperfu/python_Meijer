package Oc;

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
    public static final c2 f23399a = new c2();

    public final Y1 a(Context context, C4393f1 c4393f1) {
        String strS;
        String strI = c4393f1.i();
        Set setN = c4393f1.n();
        List listUnmodifiableList = !setN.isEmpty() ? Collections.unmodifiableList(new ArrayList(setN)) : null;
        boolean zQ = c4393f1.q(context);
        Bundle bundleE = c4393f1.e(AdMobAdapter.class);
        String strJ = c4393f1.j();
        c4393f1.g();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            C4447y.b();
            strS = Sc.g.s(Thread.currentThread().getStackTrace(), packageName);
        } else {
            strS = null;
        }
        boolean zP = c4393f1.p();
        Gc.o oVarE = C4420o1.h().e();
        return new Y1(8, -1L, bundleE, -1, listUnmodifiableList, zQ, Math.max(c4393f1.b(), oVarE.c()), false, strJ, null, null, strI, c4393f1.f(), c4393f1.d(), Collections.unmodifiableList(new ArrayList(c4393f1.m())), c4393f1.k(), strS, zP, null, oVarE.d(), (String) Collections.max(Arrays.asList(null, oVarE.a()), new Comparator() { // from class: Oc.b2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = Gc.o.f11346f;
                return list.indexOf((String) obj) - list.indexOf((String) obj2);
            }
        }), c4393f1.l(), c4393f1.a(), c4393f1.h(), oVarE.b().a(), c4393f1.c());
    }

    protected c2() {
    }
}
