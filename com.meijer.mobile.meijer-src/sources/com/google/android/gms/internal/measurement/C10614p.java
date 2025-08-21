package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10614p extends AbstractC10569k implements InterfaceC10587m {

    /* renamed from: c, reason: collision with root package name */
    protected final List f83163c;

    /* renamed from: d, reason: collision with root package name */
    protected final List f83164d;

    /* renamed from: e, reason: collision with root package name */
    protected U1 f83165e;

    private C10614p(C10614p c10614p) {
        super(c10614p.f83067a);
        ArrayList arrayList = new ArrayList(c10614p.f83163c.size());
        this.f83163c = arrayList;
        arrayList.addAll(c10614p.f83163c);
        ArrayList arrayList2 = new ArrayList(c10614p.f83164d.size());
        this.f83164d = arrayList2;
        arrayList2.addAll(c10614p.f83164d);
        this.f83165e = c10614p.f83165e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10569k
    public final InterfaceC10623q b(U1 u12, List list) {
        U1 u1C = this.f83165e.c();
        int i10 = 0;
        while (true) {
            List list2 = this.f83163c;
            if (i10 >= list2.size()) {
                break;
            }
            if (i10 < list.size()) {
                u1C.f((String) list2.get(i10), u12.a((InterfaceC10623q) list.get(i10)));
            } else {
                u1C.f((String) list2.get(i10), InterfaceC10623q.f83182i3);
            }
            i10++;
        }
        for (InterfaceC10623q interfaceC10623q : this.f83164d) {
            InterfaceC10623q interfaceC10623qA = u1C.a(interfaceC10623q);
            if (interfaceC10623qA instanceof r) {
                interfaceC10623qA = u1C.a(interfaceC10623q);
            }
            if (interfaceC10623qA instanceof C10542h) {
                return ((C10542h) interfaceC10623qA).a();
            }
        }
        return InterfaceC10623q.f83182i3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10569k, com.google.android.gms.internal.measurement.InterfaceC10623q
    public final InterfaceC10623q zzt() {
        return new C10614p(this);
    }

    public C10614p(String str, List list, List list2, U1 u12) {
        super(str);
        this.f83163c = new ArrayList();
        this.f83165e = u12;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f83163c.add(((InterfaceC10623q) it.next()).zzc());
            }
        }
        this.f83164d = new ArrayList(list2);
    }
}
