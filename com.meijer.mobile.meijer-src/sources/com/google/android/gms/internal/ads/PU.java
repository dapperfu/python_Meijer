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
    private final C8369hk0 f70172c;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC8129fV f70175f;

    /* renamed from: h, reason: collision with root package name */
    private final String f70177h;

    /* renamed from: i, reason: collision with root package name */
    private final int f70178i;

    /* renamed from: j, reason: collision with root package name */
    private final C8022eV f70179j;

    /* renamed from: k, reason: collision with root package name */
    private Z50 f70180k;

    /* renamed from: a, reason: collision with root package name */
    private final Map f70170a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List f70171b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List f70173d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final Set f70174e = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private int f70176g = a.e.API_PRIORITY_OTHER;

    /* renamed from: l, reason: collision with root package name */
    private boolean f70181l = false;

    private final synchronized void e() {
        this.f70179j.i(this.f70180k);
        InterfaceC8129fV interfaceC8129fV = this.f70175f;
        if (interfaceC8129fV != null) {
            this.f70172c.g(interfaceC8129fV);
        } else {
            this.f70172c.h(new zzegu(3, this.f70177h));
        }
    }

    private final synchronized boolean f(boolean z10) {
        try {
            for (Z50 z50 : this.f70171b) {
                Integer num = (Integer) this.f70170a.get(z50);
                int iIntValue = num != null ? num.intValue() : a.e.API_PRIORITY_OTHER;
                if (z10 || !this.f70174e.contains(z50.f72900t0)) {
                    int i10 = this.f70176g;
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
            Iterator it = this.f70173d.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.f70170a.get((Z50) it.next());
                if ((num != null ? num.intValue() : a.e.API_PRIORITY_OTHER) < this.f70176g) {
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
        if (this.f70181l) {
            return false;
        }
        if (!this.f70171b.isEmpty() && ((Z50) this.f70171b.get(0)).f72904v0 && !this.f70173d.isEmpty()) {
            return false;
        }
        if (!d()) {
            List list = this.f70173d;
            if (list.size() < this.f70178i) {
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
                for (int i10 = 0; i10 < this.f70171b.size(); i10++) {
                    Z50 z50 = (Z50) this.f70171b.get(i10);
                    String str = z50.f72900t0;
                    if (!this.f70174e.contains(str)) {
                        if (z50.f72904v0) {
                            this.f70181l = true;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            this.f70174e.add(str);
                        }
                        this.f70173d.add(z50);
                        return (Z50) this.f70171b.remove(i10);
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final synchronized void b(Throwable th2, Z50 z50) {
        this.f70181l = false;
        this.f70173d.remove(z50);
        this.f70174e.remove(z50.f72900t0);
        if (d() || h()) {
            return;
        }
        e();
    }

    final synchronized void c(InterfaceC8129fV interfaceC8129fV, Z50 z50) {
        this.f70181l = false;
        this.f70173d.remove(z50);
        if (d()) {
            interfaceC8129fV.zzr();
            return;
        }
        Integer num = (Integer) this.f70170a.get(z50);
        int iIntValue = num != null ? num.intValue() : a.e.API_PRIORITY_OTHER;
        if (iIntValue > this.f70176g) {
            this.f70179j.m(z50);
            return;
        }
        if (this.f70175f != null) {
            this.f70179j.m(this.f70180k);
        }
        this.f70176g = iIntValue;
        this.f70175f = interfaceC8129fV;
        this.f70180k = z50;
        if (h()) {
            return;
        }
        e();
    }

    final synchronized boolean d() {
        return this.f70172c.isDone();
    }

    PU(C8733l60 c8733l60, C8022eV c8022eV, C8369hk0 c8369hk0) {
        this.f70178i = c8733l60.f76589b.f76177b.f73959r;
        this.f70179j = c8022eV;
        this.f70172c = c8369hk0;
        this.f70177h = C8662kV.b(c8733l60);
        List list = c8733l60.f76589b.f76176a;
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f70170a.put((Z50) list.get(i10), Integer.valueOf(i10));
        }
        this.f70171b.addAll(list);
    }
}
