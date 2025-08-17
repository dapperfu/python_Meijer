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

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private Excluder f89429a = Excluder.f89477g;

    /* renamed from: b, reason: collision with root package name */
    private q f89430b = q.f89697a;

    /* renamed from: c, reason: collision with root package name */
    private d f89431c = c.f89416a;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Type, g<?>> f89432d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final List<v> f89433e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final List<v> f89434f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private boolean f89435g = false;

    /* renamed from: h, reason: collision with root package name */
    private String f89436h = Gson.f89379B;

    /* renamed from: i, reason: collision with root package name */
    private int f89437i = 2;

    /* renamed from: j, reason: collision with root package name */
    private int f89438j = 2;

    /* renamed from: k, reason: collision with root package name */
    private boolean f89439k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f89440l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f89441m = true;

    /* renamed from: n, reason: collision with root package name */
    private e f89442n = Gson.f89378A;

    /* renamed from: o, reason: collision with root package name */
    private boolean f89443o = false;

    /* renamed from: p, reason: collision with root package name */
    private s f89444p = Gson.f89383z;

    /* renamed from: q, reason: collision with root package name */
    private boolean f89445q = true;

    /* renamed from: r, reason: collision with root package name */
    private u f89446r = Gson.f89381D;

    /* renamed from: s, reason: collision with root package name */
    private u f89447s = Gson.f89382E;

    /* renamed from: t, reason: collision with root package name */
    private final ArrayDeque<r> f89448t = new ArrayDeque<>();

    public f e() {
        this.f89435g = true;
        return this;
    }

    private static void a(String str, int i10, int i11, List<v> list) {
        v vVarB;
        v vVarB2;
        boolean z10 = com.google.gson.internal.sql.a.f89676a;
        v vVarA = null;
        if (str != null && !str.trim().isEmpty()) {
            vVarB = DefaultDateTypeAdapter.a.f89514b.b(str);
            if (z10) {
                vVarA = com.google.gson.internal.sql.a.f89678c.b(str);
                vVarB2 = com.google.gson.internal.sql.a.f89677b.b(str);
            } else {
                vVarB2 = null;
            }
        } else {
            if (i10 == 2 && i11 == 2) {
                return;
            }
            v vVarA2 = DefaultDateTypeAdapter.a.f89514b.a(i10, i11);
            if (z10) {
                vVarA = com.google.gson.internal.sql.a.f89678c.a(i10, i11);
                v vVarA3 = com.google.gson.internal.sql.a.f89677b.a(i10, i11);
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
        ArrayList arrayList = new ArrayList(this.f89433e.size() + this.f89434f.size() + 3);
        arrayList.addAll(this.f89433e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f89434f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f89436h, this.f89437i, this.f89438j, arrayList);
        return new Gson(this.f89429a, this.f89431c, new HashMap(this.f89432d), this.f89435g, this.f89439k, this.f89443o, this.f89441m, this.f89442n, this.f89444p, this.f89440l, this.f89445q, this.f89430b, this.f89436h, this.f89437i, this.f89438j, new ArrayList(this.f89433e), new ArrayList(this.f89434f), arrayList, this.f89446r, this.f89447s, new ArrayList(this.f89448t));
    }

    public f i() {
        return h(e.f89425e);
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
                this.f89432d.put(type, (g) obj);
            }
            if (z11 || (obj instanceof j)) {
                this.f89433e.add(TreeTypeAdapter.c(com.google.gson.reflect.a.b(type), obj));
            }
            if (obj instanceof TypeAdapter) {
                this.f89433e.add(TypeAdapters.a(com.google.gson.reflect.a.b(type), (TypeAdapter) obj));
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
        this.f89431c = dVar;
        return this;
    }

    public f h(e eVar) {
        Objects.requireNonNull(eVar);
        this.f89442n = eVar;
        return this;
    }
}
