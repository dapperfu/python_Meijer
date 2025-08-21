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
public final class C8022eV {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f74716a;

    /* renamed from: b, reason: collision with root package name */
    private final C8236gV f74717b;

    /* renamed from: c, reason: collision with root package name */
    private final R90 f74718c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedHashMap f74719d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    private final boolean f74720e = ((Boolean) Oc.A.c().a(C8784lf.f76817G6)).booleanValue();

    /* renamed from: f, reason: collision with root package name */
    private final C8981nT f74721f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f74722g;

    /* renamed from: h, reason: collision with root package name */
    private long f74723h;

    /* renamed from: i, reason: collision with root package name */
    private long f74724i;

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean q(Z50 z50) {
        C7916dV c7916dV = (C7916dV) this.f74719d.get(z50);
        if (c7916dV == null) {
            return false;
        }
        return c7916dV.f74258c == 8;
    }

    public final synchronized long a() {
        return this.f74723h;
    }

    public final synchronized String g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f74719d.entrySet().iterator();
            while (it.hasNext()) {
                C7916dV c7916dV = (C7916dV) ((Map.Entry) it.next()).getValue();
                if (c7916dV.f74258c != Integer.MAX_VALUE) {
                    arrayList.add(c7916dV.toString());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void i(Z50 z50) {
        try {
            this.f74723h = this.f74716a.c() - this.f74724i;
            if (z50 != null) {
                this.f74721f.e(z50);
            }
            this.f74722g = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void j() {
        this.f74723h = this.f74716a.c() - this.f74724i;
    }

    public final synchronized void k(List list) {
        this.f74724i = this.f74716a.c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Z50 z50 = (Z50) it.next();
            if (!TextUtils.isEmpty(z50.f72905w)) {
                this.f74719d.put(z50, new C7916dV(z50.f72905w, z50.f72872f0, a.e.API_PRIORITY_OTHER, 0L, null));
            }
        }
    }

    public final synchronized void l() {
        this.f74724i = this.f74716a.c();
    }

    public final synchronized void m(Z50 z50) {
        C7916dV c7916dV = (C7916dV) this.f74719d.get(z50);
        if (c7916dV == null || this.f74722g) {
            return;
        }
        c7916dV.f74258c = 8;
    }

    final synchronized com.google.common.util.concurrent.q f(C8733l60 c8733l60, Z50 z50, com.google.common.util.concurrent.q qVar, L90 l90) {
        C7773c60 c7773c60 = c8733l60.f76589b.f76177b;
        long jC = this.f74716a.c();
        String str = z50.f72905w;
        if (str != null) {
            this.f74719d.put(z50, new C7916dV(str, z50.f72872f0, 9, 0L, null));
            Mj0.r(qVar, new C7809cV(this, jC, c7773c60, z50, str, l90, c8733l60), C7033Kq.f69020g);
        }
        return qVar;
    }

    public C8022eV(com.google.android.gms.common.util.f fVar, C8236gV c8236gV, C8981nT c8981nT, R90 r90) {
        this.f74716a = fVar;
        this.f74717b = c8236gV;
        this.f74721f = c8981nT;
        this.f74718c = r90;
    }
}
