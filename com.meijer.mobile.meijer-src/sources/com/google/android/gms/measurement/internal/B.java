package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    final String f85722a;

    /* renamed from: b, reason: collision with root package name */
    final String f85723b;

    /* renamed from: c, reason: collision with root package name */
    final String f85724c;

    /* renamed from: d, reason: collision with root package name */
    final long f85725d;

    /* renamed from: e, reason: collision with root package name */
    final long f85726e;

    /* renamed from: f, reason: collision with root package name */
    final E f85727f;

    B(X2 x22, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        E e10;
        com.google.android.gms.common.internal.r.f(str2);
        com.google.android.gms.common.internal.r.f(str3);
        this.f85722a = str2;
        this.f85723b = str3;
        this.f85724c = true == TextUtils.isEmpty(str) ? null : str;
        this.f85725d = j10;
        this.f85726e = j11;
        if (j11 != 0 && j11 > j10) {
            x22.a().p().b("Event created with reverse previous/current timestamps. appId", C11343q2.v(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            e10 = new E(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    x22.a().m().a("Param name can't be null");
                    it.remove();
                } else {
                    Object objQ = x22.A().q(next, bundle2.get(next));
                    if (objQ == null) {
                        x22.a().p().b("Param value can't be null", x22.B().b(next));
                        it.remove();
                    } else {
                        x22.A().y(bundle2, next, objQ);
                    }
                }
            }
            e10 = new E(bundle2);
        }
        this.f85727f = e10;
    }

    final B a(X2 x22, long j10) {
        return new B(x22, this.f85724c, this.f85722a, this.f85723b, this.f85725d, j10, this.f85727f);
    }

    public final String toString() {
        String string = this.f85727f.toString();
        String str = this.f85722a;
        int length = String.valueOf(str).length();
        String str2 = this.f85723b;
        StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        sb2.append("Event{appId='");
        sb2.append(str);
        sb2.append("', name='");
        sb2.append(str2);
        sb2.append("', params=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }

    private B(X2 x22, String str, String str2, String str3, long j10, long j11, E e10) {
        com.google.android.gms.common.internal.r.f(str2);
        com.google.android.gms.common.internal.r.f(str3);
        com.google.android.gms.common.internal.r.l(e10);
        this.f85722a = str2;
        this.f85723b = str3;
        this.f85724c = true == TextUtils.isEmpty(str) ? null : str;
        this.f85725d = j10;
        this.f85726e = j11;
        if (j11 != 0 && j11 > j10) {
            x22.a().p().c("Event created with reverse previous/current timestamps. appId, name", C11343q2.v(str2), C11343q2.v(str3));
        }
        this.f85727f = e10;
    }
}
