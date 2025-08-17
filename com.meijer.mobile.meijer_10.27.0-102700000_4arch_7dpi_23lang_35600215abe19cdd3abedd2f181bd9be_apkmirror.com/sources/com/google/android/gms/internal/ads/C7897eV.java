package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.eV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7897eV {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f73876a;

    /* renamed from: b, reason: collision with root package name */
    private final C8111gV f73877b;

    /* renamed from: c, reason: collision with root package name */
    private final R90 f73878c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedHashMap f73879d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    private final boolean f73880e = ((Boolean) Mc.A.c().a(C8659lf.f75977G6)).booleanValue();

    /* renamed from: f, reason: collision with root package name */
    private final C8856nT f73881f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f73882g;

    /* renamed from: h, reason: collision with root package name */
    private long f73883h;

    /* renamed from: i, reason: collision with root package name */
    private long f73884i;

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean q(Z50 z50) {
        C7791dV c7791dV = (C7791dV) this.f73879d.get(z50);
        if (c7791dV == null) {
            return false;
        }
        return c7791dV.f73418c == 8;
    }

    public final synchronized long a() {
        return this.f73883h;
    }

    public final synchronized String g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f73879d.entrySet().iterator();
            while (it.hasNext()) {
                C7791dV c7791dV = (C7791dV) ((Map.Entry) it.next()).getValue();
                if (c7791dV.f73418c != Integer.MAX_VALUE) {
                    arrayList.add(c7791dV.toString());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void i(Z50 z50) {
        try {
            this.f73883h = this.f73876a.c() - this.f73884i;
            if (z50 != null) {
                this.f73881f.e(z50);
            }
            this.f73882g = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void j() {
        this.f73883h = this.f73876a.c() - this.f73884i;
    }

    public final synchronized void k(List list) {
        this.f73884i = this.f73876a.c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Z50 z50 = (Z50) it.next();
            if (!TextUtils.isEmpty(z50.f72065w)) {
                this.f73879d.put(z50, new C7791dV(z50.f72065w, z50.f72032f0, a.e.API_PRIORITY_OTHER, 0L, null));
            }
        }
    }

    public final synchronized void l() {
        this.f73884i = this.f73876a.c();
    }

    public final synchronized void m(Z50 z50) {
        C7791dV c7791dV = (C7791dV) this.f73879d.get(z50);
        if (c7791dV == null || this.f73882g) {
            return;
        }
        c7791dV.f73418c = 8;
    }

    final synchronized com.google.common.util.concurrent.q f(C8608l60 c8608l60, Z50 z50, com.google.common.util.concurrent.q qVar, L90 l90) {
        C7648c60 c7648c60 = c8608l60.f75749b.f75337b;
        long jC = this.f73876a.c();
        String str = z50.f72065w;
        if (str != null) {
            this.f73879d.put(z50, new C7791dV(str, z50.f72032f0, 9, 0L, null));
            Mj0.r(qVar, new C7684cV(this, jC, c7648c60, z50, str, l90, c8608l60), C6908Kq.f68180g);
        }
        return qVar;
    }

    public C7897eV(com.google.android.gms.common.util.f fVar, C8111gV c8111gV, C8856nT c8856nT, R90 r90) {
        this.f73876a = fVar;
        this.f73877b = c8111gV;
        this.f73881f = c8856nT;
        this.f73878c = r90;
    }
}
