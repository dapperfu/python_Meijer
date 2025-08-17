package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class A60 {
    public static Mc.d2 a(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7435a60 c7435a60 = (C7435a60) it.next();
            if (c7435a60.f72362c) {
                arrayList.add(Ec.e.f7773p);
            } else {
                arrayList.add(new Ec.e(c7435a60.f72360a, c7435a60.f72361b));
            }
        }
        return new Mc.d2(context, (Ec.e[]) arrayList.toArray(new Ec.e[arrayList.size()]));
    }

    public static C7435a60 b(Mc.d2 d2Var) {
        return d2Var.f19221i ? new C7435a60(-3, 0, true) : new C7435a60(d2Var.f19217e, d2Var.f19214b, false);
    }
}
