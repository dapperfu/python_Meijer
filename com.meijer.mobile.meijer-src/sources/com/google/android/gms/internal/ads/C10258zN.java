package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.zN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10258zN implements C80 {

    /* renamed from: b, reason: collision with root package name */
    private final C9296qN f81253b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f81254c;

    /* renamed from: a, reason: collision with root package name */
    private final Map f81252a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f81255d = new HashMap();

    @Override // com.google.android.gms.internal.ads.C80
    public final void J(EnumC9806v80 enumC9806v80, String str) {
    }

    private final void b(EnumC9806v80 enumC9806v80, boolean z10) {
        C10151yN c10151yN = (C10151yN) this.f81255d.get(enumC9806v80);
        if (c10151yN == null) {
            return;
        }
        String str = true != z10 ? "f." : "s.";
        Map map = this.f81252a;
        EnumC9806v80 enumC9806v802 = c10151yN.f81054b;
        if (map.containsKey(enumC9806v802)) {
            long jC = this.f81254c.c() - ((Long) this.f81252a.get(enumC9806v802)).longValue();
            this.f81253b.b().put("label.".concat(c10151yN.f81053a), str + jC);
        }
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void N(EnumC9806v80 enumC9806v80, String str) {
        this.f81252a.put(enumC9806v80, Long.valueOf(this.f81254c.c()));
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void a(EnumC9806v80 enumC9806v80, String str, Throwable th2) {
        if (this.f81252a.containsKey(enumC9806v80)) {
            long jC = this.f81254c.c() - ((Long) this.f81252a.get(enumC9806v80)).longValue();
            C9296qN c9296qN = this.f81253b;
            String strValueOf = String.valueOf(str);
            c9296qN.b().put("task.".concat(strValueOf), "f.".concat(String.valueOf(Long.toString(jC))));
        }
        if (this.f81255d.containsKey(enumC9806v80)) {
            b(enumC9806v80, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void i(EnumC9806v80 enumC9806v80, String str) {
        if (this.f81252a.containsKey(enumC9806v80)) {
            long jC = this.f81254c.c() - ((Long) this.f81252a.get(enumC9806v80)).longValue();
            C9296qN c9296qN = this.f81253b;
            String strValueOf = String.valueOf(str);
            c9296qN.b().put("task.".concat(strValueOf), "s.".concat(String.valueOf(Long.toString(jC))));
        }
        if (this.f81255d.containsKey(enumC9806v80)) {
            b(enumC9806v80, true);
        }
    }

    public C10258zN(C9296qN c9296qN, Set set, com.google.android.gms.common.util.f fVar) {
        this.f81253b = c9296qN;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C10151yN c10151yN = (C10151yN) it.next();
            this.f81255d.put(c10151yN.f81055c, c10151yN);
        }
        this.f81254c = fVar;
    }
}
