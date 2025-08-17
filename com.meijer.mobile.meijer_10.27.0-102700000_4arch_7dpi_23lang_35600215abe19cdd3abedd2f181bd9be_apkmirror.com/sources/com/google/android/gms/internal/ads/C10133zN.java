package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.zN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10133zN implements C80 {

    /* renamed from: b, reason: collision with root package name */
    private final C9171qN f80413b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f80414c;

    /* renamed from: a, reason: collision with root package name */
    private final Map f80412a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f80415d = new HashMap();

    @Override // com.google.android.gms.internal.ads.C80
    public final void C(EnumC9681v80 enumC9681v80, String str) {
    }

    private final void b(EnumC9681v80 enumC9681v80, boolean z10) {
        C10026yN c10026yN = (C10026yN) this.f80415d.get(enumC9681v80);
        if (c10026yN == null) {
            return;
        }
        String str = true != z10 ? "f." : "s.";
        Map map = this.f80412a;
        EnumC9681v80 enumC9681v802 = c10026yN.f80214b;
        if (map.containsKey(enumC9681v802)) {
            long jC = this.f80414c.c() - ((Long) this.f80412a.get(enumC9681v802)).longValue();
            this.f80413b.b().put("label.".concat(c10026yN.f80213a), str + jC);
        }
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void L(EnumC9681v80 enumC9681v80, String str) {
        this.f80412a.put(enumC9681v80, Long.valueOf(this.f80414c.c()));
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void a(EnumC9681v80 enumC9681v80, String str, Throwable th2) {
        if (this.f80412a.containsKey(enumC9681v80)) {
            long jC = this.f80414c.c() - ((Long) this.f80412a.get(enumC9681v80)).longValue();
            C9171qN c9171qN = this.f80413b;
            String strValueOf = String.valueOf(str);
            c9171qN.b().put("task.".concat(strValueOf), "f.".concat(String.valueOf(Long.toString(jC))));
        }
        if (this.f80415d.containsKey(enumC9681v80)) {
            b(enumC9681v80, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void i(EnumC9681v80 enumC9681v80, String str) {
        if (this.f80412a.containsKey(enumC9681v80)) {
            long jC = this.f80414c.c() - ((Long) this.f80412a.get(enumC9681v80)).longValue();
            C9171qN c9171qN = this.f80413b;
            String strValueOf = String.valueOf(str);
            c9171qN.b().put("task.".concat(strValueOf), "s.".concat(String.valueOf(Long.toString(jC))));
        }
        if (this.f80415d.containsKey(enumC9681v80)) {
            b(enumC9681v80, true);
        }
    }

    public C10133zN(C9171qN c9171qN, Set set, com.google.android.gms.common.util.f fVar) {
        this.f80413b = c9171qN;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C10026yN c10026yN = (C10026yN) it.next();
            this.f80415d.put(c10026yN.f80215c, c10026yN);
        }
        this.f80414c = fVar;
    }
}
