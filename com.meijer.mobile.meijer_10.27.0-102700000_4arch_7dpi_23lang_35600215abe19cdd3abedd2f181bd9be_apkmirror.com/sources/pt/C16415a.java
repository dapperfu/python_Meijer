package pt;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb.i;
import kt.C15319h;

/* renamed from: pt.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C16415a extends i<C15319h> {
    private synchronized void d(C15319h c15319h) {
        this.f139561a.c(a(c15319h.getId()), c15319h);
    }

    public final synchronized List<C15319h> b() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.f139561a.b());
        return arrayList;
    }

    public final synchronized void c(List<C15319h> list) {
        this.f139561a.f139548b = false;
        Iterator<C15319h> it = list.iterator();
        while (it.hasNext()) {
            d(it.next());
        }
    }

    public C16415a(Context context) {
        super(context, "com.qsl.faar.cache.OrganizationPlace", C15319h.class);
    }
}
