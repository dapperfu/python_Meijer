package com.google.android.gms.measurement.internal;

import Z.C5503a;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class C0 extends E1 {

    /* renamed from: b, reason: collision with root package name */
    private final Map f84940b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f84941c;

    /* renamed from: d, reason: collision with root package name */
    private long f84942d;

    private final void m(long j10, E4 e42) {
        if (e42 == null) {
            this.f84868a.a().u().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.f84868a.a().u().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j10);
        z6.i0(e42, bundle, true);
        this.f84868a.z().r("am", "_xa", bundle);
    }

    private final void n(String str, long j10, E4 e42) {
        if (e42 == null) {
            this.f84868a.a().u().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.f84868a.a().u().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j10);
        z6.i0(e42, bundle, true);
        this.f84868a.z().r("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void l(long j10) {
        Map map = this.f84940b;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), Long.valueOf(j10));
        }
        if (map.isEmpty()) {
            return;
        }
        this.f84942d = j10;
    }

    public final void g(String str, long j10) throws IllegalStateException {
        if (str == null || str.length() == 0) {
            this.f84868a.a().m().a("Ad unit id must be a non-empty string");
        } else {
            this.f84868a.b().r(new RunnableC11093a(this, str, j10));
        }
    }

    public final void h(String str, long j10) throws IllegalStateException {
        if (str == null || str.length() == 0) {
            this.f84868a.a().m().a("Ad unit id must be a non-empty string");
        } else {
            this.f84868a.b().r(new RunnableC11277z(this, str, j10));
        }
    }

    public final void i(long j10) {
        E4 e4O = this.f84868a.G().o(false);
        Map map = this.f84940b;
        for (String str : map.keySet()) {
            n(str, j10 - ((Long) map.get(str)).longValue(), e4O);
        }
        if (!map.isEmpty()) {
            m(j10 - this.f84942d, e4O);
        }
        l(j10);
    }

    public C0(X2 x22) {
        super(x22);
        this.f84941c = new C5503a();
        this.f84940b = new C5503a();
    }

    final /* synthetic */ void j(String str, long j10) {
        f();
        com.google.android.gms.common.internal.r.f(str);
        Map map = this.f84941c;
        if (map.isEmpty()) {
            this.f84942d = j10;
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            map.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (map.size() >= 100) {
            this.f84868a.a().p().a("Too many ads visible");
        } else {
            map.put(str, 1);
            this.f84940b.put(str, Long.valueOf(j10));
        }
    }

    final /* synthetic */ void k(String str, long j10) {
        f();
        com.google.android.gms.common.internal.r.f(str);
        Map map = this.f84941c;
        Integer num = (Integer) map.get(str);
        if (num != null) {
            E4 e4O = this.f84868a.G().o(false);
            int iIntValue = num.intValue() - 1;
            if (iIntValue == 0) {
                map.remove(str);
                Map map2 = this.f84940b;
                Long l10 = (Long) map2.get(str);
                if (l10 == null) {
                    this.f84868a.a().m().a("First ad unit exposure time was never set");
                } else {
                    long jLongValue = j10 - l10.longValue();
                    map2.remove(str);
                    n(str, jLongValue, e4O);
                }
                if (map.isEmpty()) {
                    long j11 = this.f84942d;
                    if (j11 == 0) {
                        this.f84868a.a().m().a("First ad exposure time was never set");
                        return;
                    } else {
                        m(j10 - j11, e4O);
                        this.f84942d = 0L;
                        return;
                    }
                }
                return;
            }
            map.put(str, Integer.valueOf(iIntValue));
            return;
        }
        this.f84868a.a().m().b("Call to endAdUnitExposure for unknown ad unit id", str);
    }
}
