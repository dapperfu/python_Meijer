package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.w;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private Excluder f90271a = Excluder.f90319g;

    /* renamed from: b, reason: collision with root package name */
    private q f90272b = q.f90539a;

    /* renamed from: c, reason: collision with root package name */
    private d f90273c = c.f90258a;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Type, g<?>> f90274d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final List<v> f90275e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final List<v> f90276f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private boolean f90277g = false;

    /* renamed from: h, reason: collision with root package name */
    private String f90278h = Gson.f90221B;

    /* renamed from: i, reason: collision with root package name */
    private int f90279i = 2;

    /* renamed from: j, reason: collision with root package name */
    private int f90280j = 2;

    /* renamed from: k, reason: collision with root package name */
    private boolean f90281k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f90282l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f90283m = true;

    /* renamed from: n, reason: collision with root package name */
    private e f90284n = Gson.f90220A;

    /* renamed from: o, reason: collision with root package name */
    private boolean f90285o = false;

    /* renamed from: p, reason: collision with root package name */
    private s f90286p = Gson.f90225z;

    /* renamed from: q, reason: collision with root package name */
    private boolean f90287q = true;

    /* renamed from: r, reason: collision with root package name */
    private u f90288r = Gson.f90223D;

    /* renamed from: s, reason: collision with root package name */
    private u f90289s = Gson.f90224E;

    /* renamed from: t, reason: collision with root package name */
    private final ArrayDeque<r> f90290t = new ArrayDeque<>();

    public f e() {
        this.f90277g = true;
        return this;
    }

    private static void a(String str, int i10, int i11, List<v> list) {
        v vVarB;
        v vVarB2;
        boolean z10 = com.google.gson.internal.sql.a.f90518a;
        v vVarA = null;
        if (str != null && !str.trim().isEmpty()) {
            vVarB = DefaultDateTypeAdapter.a.f90356b.b(str);
            if (z10) {
                vVarA = com.google.gson.internal.sql.a.f90520c.b(str);
                vVarB2 = com.google.gson.internal.sql.a.f90519b.b(str);
            } else {
                vVarB2 = null;
            }
        } else {
            if (i10 == 2 && i11 == 2) {
                return;
            }
            v vVarA2 = DefaultDateTypeAdapter.a.f90356b.a(i10, i11);
            if (z10) {
                vVarA = com.google.gson.internal.sql.a.f90520c.a(i10, i11);
                v vVarA3 = com.google.gson.internal.sql.a.f90519b.a(i10, i11);
                vVarB = vVarA2;
                vVarB2 = vVarA3;
            } else {
                vVarB = vVarA2;
                vVarB2 = null;
            }
        }
        list.add(vVarB);
        if (z10) {
            list.add(vVarA);
            list.add(vVarB2);
        }
    }

    private static boolean c(Type type) {
        return type == Object.class;
    }

    public Gson b() {
        ArrayList arrayList = new ArrayList(this.f90275e.size() + this.f90276f.size() + 3);
        arrayList.addAll(this.f90275e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f90276f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f90278h, this.f90279i, this.f90280j, arrayList);
        return new Gson(this.f90271a, this.f90273c, new HashMap(this.f90274d), this.f90277g, this.f90281k, this.f90285o, this.f90283m, this.f90284n, this.f90286p, this.f90282l, this.f90287q, this.f90272b, this.f90278h, this.f90279i, this.f90280j, new ArrayList(this.f90275e), new ArrayList(this.f90276f), arrayList, this.f90288r, this.f90289s, new ArrayList(this.f90290t));
    }

    public f i() {
        return h(e.f90267e);
    }

    public f d(Type type, Object obj) {
        boolean z10;
        Objects.requireNonNull(type);
        boolean z11 = obj instanceof p;
        if (!z11 && !(obj instanceof j) && !(obj instanceof g) && !(obj instanceof TypeAdapter)) {
            z10 = false;
        } else {
            z10 = true;
        }
        w.a(z10);
        if (!c(type)) {
            if (obj instanceof g) {
                this.f90274d.put(type, (g) obj);
            }
            if (z11 || (obj instanceof j)) {
                this.f90275e.add(TreeTypeAdapter.c(com.google.gson.reflect.a.get(type), obj));
            }
            if (obj instanceof TypeAdapter) {
                this.f90275e.add(TypeAdapters.a(com.google.gson.reflect.a.get(type), (TypeAdapter) obj));
            }
            return this;
        }
        throw new IllegalArgumentException("Cannot override built-in adapter for " + type);
    }

    public f f(c cVar) {
        return g(cVar);
    }

    public f g(d dVar) {
        Objects.requireNonNull(dVar);
        this.f90273c = dVar;
        return this;
    }

    public f h(e eVar) {
        Objects.requireNonNull(eVar);
        this.f90284n = eVar;
        return this;
    }
}
