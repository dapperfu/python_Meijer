package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10372c {

    /* renamed from: a, reason: collision with root package name */
    private C10363b f82138a;

    /* renamed from: b, reason: collision with root package name */
    private C10363b f82139b;

    /* renamed from: c, reason: collision with root package name */
    private final List f82140c;

    public C10372c() {
        this.f82138a = new C10363b("", 0L, null);
        this.f82139b = new C10363b("", 0L, null);
        this.f82140c = new ArrayList();
    }

    public final C10363b a() {
        return this.f82138a;
    }

    public final C10363b c() {
        return this.f82139b;
    }

    public final void d(C10363b c10363b) {
        this.f82139b = c10363b;
    }

    public final List f() {
        return this.f82140c;
    }

    public final void b(C10363b c10363b) {
        this.f82138a = c10363b;
        this.f82139b = c10363b.clone();
        this.f82140c.clear();
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C10372c c10372c = new C10372c(this.f82138a.clone());
        Iterator it = this.f82140c.iterator();
        while (it.hasNext()) {
            c10372c.f82140c.add(((C10363b) it.next()).clone());
        }
        return c10372c;
    }

    public final void e(String str, long j10, Map map) {
        HashMap map2 = new HashMap();
        for (String str2 : map.keySet()) {
            map2.put(str2, C10363b.h(str2, this.f82138a.e(str2), map.get(str2)));
        }
        this.f82140c.add(new C10363b(str, j10, map2));
    }

    public C10372c(C10363b c10363b) {
        this.f82138a = c10363b;
        this.f82139b = c10363b.clone();
        this.f82140c = new ArrayList();
    }
}
