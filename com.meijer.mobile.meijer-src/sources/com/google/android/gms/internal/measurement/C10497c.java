package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10497c {

    /* renamed from: a, reason: collision with root package name */
    private C10488b f82978a;

    /* renamed from: b, reason: collision with root package name */
    private C10488b f82979b;

    /* renamed from: c, reason: collision with root package name */
    private final List f82980c;

    public C10497c() {
        this.f82978a = new C10488b("", 0L, null);
        this.f82979b = new C10488b("", 0L, null);
        this.f82980c = new ArrayList();
    }

    public final C10488b a() {
        return this.f82978a;
    }

    public final C10488b c() {
        return this.f82979b;
    }

    public final void d(C10488b c10488b) {
        this.f82979b = c10488b;
    }

    public final List f() {
        return this.f82980c;
    }

    public final void b(C10488b c10488b) {
        this.f82978a = c10488b;
        this.f82979b = c10488b.clone();
        this.f82980c.clear();
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C10497c c10497c = new C10497c(this.f82978a.clone());
        Iterator it = this.f82980c.iterator();
        while (it.hasNext()) {
            c10497c.f82980c.add(((C10488b) it.next()).clone());
        }
        return c10497c;
    }

    public final void e(String str, long j10, Map map) {
        HashMap map2 = new HashMap();
        for (String str2 : map.keySet()) {
            map2.put(str2, C10488b.h(str2, this.f82978a.e(str2), map.get(str2)));
        }
        this.f82980c.add(new C10488b(str, j10, map2));
    }

    public C10497c(C10488b c10488b) {
        this.f82978a = c10488b;
        this.f82979b = c10488b.clone();
        this.f82980c = new ArrayList();
    }
}
