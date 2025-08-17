package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
final class PU {

    /* renamed from: c, reason: collision with root package name */
    private final C8244hk0 f69332c;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC8004fV f69335f;

    /* renamed from: h, reason: collision with root package name */
    private final String f69337h;

    /* renamed from: i, reason: collision with root package name */
    private final int f69338i;

    /* renamed from: j, reason: collision with root package name */
    private final C7897eV f69339j;

    /* renamed from: k, reason: collision with root package name */
    private Z50 f69340k;

    /* renamed from: a, reason: collision with root package name */
    private final Map f69330a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List f69331b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List f69333d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final Set f69334e = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private int f69336g = a.e.API_PRIORITY_OTHER;

    /* renamed from: l, reason: collision with root package name */
    private boolean f69341l = false;

    private final synchronized void e() {
        this.f69339j.i(this.f69340k);
        InterfaceC8004fV interfaceC8004fV = this.f69335f;
        if (interfaceC8004fV != null) {
            this.f69332c.g(interfaceC8004fV);
        } else {
            this.f69332c.h(new zzegu(3, this.f69337h));
        }
    }

    private final synchronized boolean f(boolean z10) {
        try {
            for (Z50 z50 : this.f69331b) {
                Integer num = (Integer) this.f69330a.get(z50);
                int iIntValue = num != null ? num.intValue() : a.e.API_PRIORITY_OTHER;
                if (z10 || !this.f69334e.contains(z50.f72060t0)) {
                    int i10 = this.f69336g;
                    if (iIntValue < i10) {
                        return true;
                    }
                    if (iIntValue > i10) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized boolean g() {
        try {
            Iterator it = this.f69333d.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.f69330a.get((Z50) it.next());
                if ((num != null ? num.intValue() : a.e.API_PRIORITY_OTHER) < this.f69336g) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized boolean h() {
        if (!f(true)) {
            if (!g()) {
                return false;
            }
        }
        return true;
    }

    private final synchronized boolean i() {
        if (this.f69341l) {
            return false;
        }
        if (!this.f69331b.isEmpty() && ((Z50) this.f69331b.get(0)).f72064v0 && !this.f69333d.isEmpty()) {
            return false;
        }
        if (!d()) {
            List list = this.f69333d;
            if (list.size() < this.f69338i) {
                if (f(false)) {
                    return true;
                }
            }
        }
        return false;
    }

    final synchronized Z50 a() {
        try {
            if (i()) {
                for (int i10 = 0; i10 < this.f69331b.size(); i10++) {
                    Z50 z50 = (Z50) this.f69331b.get(i10);
                    String str = z50.f72060t0;
                    if (!this.f69334e.contains(str)) {
                        if (z50.f72064v0) {
                            this.f69341l = true;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            this.f69334e.add(str);
                        }
                        this.f69333d.add(z50);
                        return (Z50) this.f69331b.remove(i10);
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final synchronized void b(Throwable th2, Z50 z50) {
        this.f69341l = false;
        this.f69333d.remove(z50);
        this.f69334e.remove(z50.f72060t0);
        if (d() || h()) {
            return;
        }
        e();
    }

    final synchronized void c(InterfaceC8004fV interfaceC8004fV, Z50 z50) {
        this.f69341l = false;
        this.f69333d.remove(z50);
        if (d()) {
            interfaceC8004fV.zzr();
            return;
        }
        Integer num = (Integer) this.f69330a.get(z50);
        int iIntValue = num != null ? num.intValue() : a.e.API_PRIORITY_OTHER;
        if (iIntValue > this.f69336g) {
            this.f69339j.m(z50);
            return;
        }
        if (this.f69335f != null) {
            this.f69339j.m(this.f69340k);
        }
        this.f69336g = iIntValue;
        this.f69335f = interfaceC8004fV;
        this.f69340k = z50;
        if (h()) {
            return;
        }
        e();
    }

    final synchronized boolean d() {
        return this.f69332c.isDone();
    }

    PU(C8608l60 c8608l60, C7897eV c7897eV, C8244hk0 c8244hk0) {
        this.f69338i = c8608l60.f75749b.f75337b.f73119r;
        this.f69339j = c7897eV;
        this.f69332c = c8244hk0;
        this.f69337h = C8537kV.b(c8608l60);
        List list = c8608l60.f75749b.f75336a;
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f69330a.put((Z50) list.get(i10), Integer.valueOf(i10));
        }
        this.f69331b.addAll(list);
    }
}
