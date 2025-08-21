package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class A60 {
    public static Oc.d2 a(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7560a60 c7560a60 = (C7560a60) it.next();
            if (c7560a60.f73202c) {
                arrayList.add(Gc.e.f11325p);
            } else {
                arrayList.add(new Gc.e(c7560a60.f73200a, c7560a60.f73201b));
            }
        }
        return new Oc.d2(context, (Gc.e[]) arrayList.toArray(new Gc.e[arrayList.size()]));
    }

    public static C7560a60 b(Oc.d2 d2Var) {
        return d2Var.f23408i ? new C7560a60(-3, 0, true) : new C7560a60(d2Var.f23404e, d2Var.f23401b, false);
    }
}
