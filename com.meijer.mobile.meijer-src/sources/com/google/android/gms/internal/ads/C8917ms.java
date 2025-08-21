package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ms, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8917ms implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final List f77753a = new ArrayList();

    public final void e(C8810ls c8810ls) {
        this.f77753a.add(c8810ls);
    }

    public final void f(C8810ls c8810ls) {
        this.f77753a.remove(c8810ls);
    }

    public final boolean h(InterfaceC6932Hr interfaceC6932Hr) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            C8810ls c8810ls = (C8810ls) it.next();
            if (c8810ls.f77506c == interfaceC6932Hr) {
                arrayList.add(c8810ls);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C8810ls) it2.next()).f77507d.b();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f77753a.iterator();
    }

    final C8810ls a(InterfaceC6932Hr interfaceC6932Hr) {
        Iterator it = iterator();
        while (it.hasNext()) {
            C8810ls c8810ls = (C8810ls) it.next();
            if (c8810ls.f77506c == interfaceC6932Hr) {
                return c8810ls;
            }
        }
        return null;
    }
}
