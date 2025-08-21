package pt;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kt.C15422h;
import lb.i;

/* renamed from: pt.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C16541a extends i<C15422h> {
    private synchronized void d(C15422h c15422h) {
        this.f149575a.c(a(c15422h.getId()), c15422h);
    }

    public final synchronized List<C15422h> b() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.f149575a.b());
        return arrayList;
    }

    public final synchronized void c(List<C15422h> list) {
        this.f149575a.f149562b = false;
        Iterator<C15422h> it = list.iterator();
        while (it.hasNext()) {
            d(it.next());
        }
    }

    public C16541a(Context context) {
        super(context, "com.qsl.faar.cache.OrganizationPlace", C15422h.class);
    }
}
