package zt;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kt.C15319h;
import ut.InterfaceC17323i;

/* loaded from: classes12.dex */
public final class l implements InterfaceC17323i {

    /* renamed from: a, reason: collision with root package name */
    private final jb.b<kt.o> f173294a;

    /* renamed from: b, reason: collision with root package name */
    private final jb.b<C15319h> f173295b;

    @Override // ut.InterfaceC17323i
    public final void a(kt.k kVar) {
        if (kVar instanceof kt.o) {
            this.f173294a.c(c(kVar), (kt.o) kVar);
        } else if (kVar instanceof C15319h) {
            this.f173295b.c(c(kVar), (C15319h) kVar);
        }
    }

    private static String c(kt.k kVar) {
        if (kVar == null || kVar.getId() == null) {
            throw new IllegalArgumentException("Invalid Cache Entry, entry must not be null and id must not be null");
        }
        return kVar.getId().toString();
    }

    @Override // ut.InterfaceC17323i
    public final boolean b(kt.k kVar) {
        return this.f173294a.b().contains(kVar) || this.f173295b.b().contains(kVar);
    }

    public l(Context context) {
        this.f173294a = new jb.b<>(context, "PRIVATE_PLACE_CACHE", kt.o.class);
        this.f173295b = new jb.b<>(context, "ORGANIZATION_PLACE_CACHE", C15319h.class);
    }

    @Override // ut.InterfaceC17323i
    public final List<kt.k> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f173294a.b());
        arrayList.addAll(this.f173295b.b());
        return arrayList;
    }

    @Override // ut.InterfaceC17323i
    public final void a(List<kt.k> list) {
        for (kt.k kVar : list) {
            this.f173294a.f(c(kVar));
            this.f173295b.f(c(kVar));
        }
    }
}
