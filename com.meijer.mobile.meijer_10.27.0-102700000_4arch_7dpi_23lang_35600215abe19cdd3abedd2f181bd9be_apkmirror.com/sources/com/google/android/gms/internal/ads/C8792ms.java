package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ms, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8792ms implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final List f76913a = new ArrayList();

    public final void e(C8685ls c8685ls) {
        this.f76913a.add(c8685ls);
    }

    public final void f(C8685ls c8685ls) {
        this.f76913a.remove(c8685ls);
    }

    public final boolean h(InterfaceC6807Hr interfaceC6807Hr) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            C8685ls c8685ls = (C8685ls) it.next();
            if (c8685ls.f76666c == interfaceC6807Hr) {
                arrayList.add(c8685ls);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C8685ls) it2.next()).f76667d.b();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f76913a.iterator();
    }

    final C8685ls a(InterfaceC6807Hr interfaceC6807Hr) {
        Iterator it = iterator();
        while (it.hasNext()) {
            C8685ls c8685ls = (C8685ls) it.next();
            if (c8685ls.f76666c == interfaceC6807Hr) {
                return c8685ls;
            }
        }
        return null;
    }
}
