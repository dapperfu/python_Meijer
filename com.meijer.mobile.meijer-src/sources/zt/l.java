package zt;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kt.C15422h;
import ut.InterfaceC17475i;

/* loaded from: classes13.dex */
public final class l implements InterfaceC17475i {

    /* renamed from: a, reason: collision with root package name */
    private final lb.b<kt.o> f173255a;

    /* renamed from: b, reason: collision with root package name */
    private final lb.b<C15422h> f173256b;

    @Override // ut.InterfaceC17475i
    public final void a(kt.k kVar) {
        if (kVar instanceof kt.o) {
            this.f173255a.c(c(kVar), (kt.o) kVar);
        } else if (kVar instanceof C15422h) {
            this.f173256b.c(c(kVar), (C15422h) kVar);
        }
    }

    private static String c(kt.k kVar) {
        if (kVar == null || kVar.getId() == null) {
            throw new IllegalArgumentException("Invalid Cache Entry, entry must not be null and id must not be null");
        }
        return kVar.getId().toString();
    }

    @Override // ut.InterfaceC17475i
    public final boolean b(kt.k kVar) {
        return this.f173255a.b().contains(kVar) || this.f173256b.b().contains(kVar);
    }

    public l(Context context) {
        this.f173255a = new lb.b<>(context, "PRIVATE_PLACE_CACHE", kt.o.class);
        this.f173256b = new lb.b<>(context, "ORGANIZATION_PLACE_CACHE", C15422h.class);
    }

    @Override // ut.InterfaceC17475i
    public final List<kt.k> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f173255a.b());
        arrayList.addAll(this.f173256b.b());
        return arrayList;
    }

    @Override // ut.InterfaceC17475i
    public final void a(List<kt.k> list) {
        for (kt.k kVar : list) {
            this.f173255a.f(c(kVar));
            this.f173256b.f(c(kVar));
        }
    }
}
