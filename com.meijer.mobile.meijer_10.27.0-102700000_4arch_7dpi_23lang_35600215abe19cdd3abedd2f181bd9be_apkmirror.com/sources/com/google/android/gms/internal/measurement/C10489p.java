package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10489p extends AbstractC10444k implements InterfaceC10462m {

    /* renamed from: c, reason: collision with root package name */
    protected final List f82323c;

    /* renamed from: d, reason: collision with root package name */
    protected final List f82324d;

    /* renamed from: e, reason: collision with root package name */
    protected U1 f82325e;

    private C10489p(C10489p c10489p) {
        super(c10489p.f82227a);
        ArrayList arrayList = new ArrayList(c10489p.f82323c.size());
        this.f82323c = arrayList;
        arrayList.addAll(c10489p.f82323c);
        ArrayList arrayList2 = new ArrayList(c10489p.f82324d.size());
        this.f82324d = arrayList2;
        arrayList2.addAll(c10489p.f82324d);
        this.f82325e = c10489p.f82325e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10444k
    public final InterfaceC10498q b(U1 u12, List list) {
        U1 u1C = this.f82325e.c();
        int i10 = 0;
        while (true) {
            List list2 = this.f82323c;
            if (i10 >= list2.size()) {
                break;
            }
            if (i10 < list.size()) {
                u1C.f((String) list2.get(i10), u12.a((InterfaceC10498q) list.get(i10)));
            } else {
                u1C.f((String) list2.get(i10), InterfaceC10498q.f82342i3);
            }
            i10++;
        }
        for (InterfaceC10498q interfaceC10498q : this.f82324d) {
            InterfaceC10498q interfaceC10498qA = u1C.a(interfaceC10498q);
            if (interfaceC10498qA instanceof r) {
                interfaceC10498qA = u1C.a(interfaceC10498q);
            }
            if (interfaceC10498qA instanceof C10417h) {
                return ((C10417h) interfaceC10498qA).a();
            }
        }
        return InterfaceC10498q.f82342i3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10444k, com.google.android.gms.internal.measurement.InterfaceC10498q
    public final InterfaceC10498q zzt() {
        return new C10489p(this);
    }

    public C10489p(String str, List list, List list2, U1 u12) {
        super(str);
        this.f82323c = new ArrayList();
        this.f82325e = u12;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f82323c.add(((InterfaceC10498q) it.next()).zzc());
            }
        }
        this.f82324d = new ArrayList(list2);
    }
}
