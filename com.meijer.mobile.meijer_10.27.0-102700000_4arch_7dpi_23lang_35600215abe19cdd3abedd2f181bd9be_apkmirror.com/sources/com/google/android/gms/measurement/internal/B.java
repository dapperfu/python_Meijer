package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    final String f84882a;

    /* renamed from: b, reason: collision with root package name */
    final String f84883b;

    /* renamed from: c, reason: collision with root package name */
    final String f84884c;

    /* renamed from: d, reason: collision with root package name */
    final long f84885d;

    /* renamed from: e, reason: collision with root package name */
    final long f84886e;

    /* renamed from: f, reason: collision with root package name */
    final E f84887f;

    B(X2 x22, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        E e10;
        com.google.android.gms.common.internal.r.f(str2);
        com.google.android.gms.common.internal.r.f(str3);
        this.f84882a = str2;
        this.f84883b = str3;
        this.f84884c = true == TextUtils.isEmpty(str) ? null : str;
        this.f84885d = j10;
        this.f84886e = j11;
        if (j11 != 0 && j11 > j10) {
            x22.a().p().b("Event created with reverse previous/current timestamps. appId", C11218q2.v(str2));
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
        this.f84887f = e10;
    }

    final B a(X2 x22, long j10) {
        return new B(x22, this.f84884c, this.f84882a, this.f84883b, this.f84885d, j10, this.f84887f);
    }

    public final String toString() {
        String string = this.f84887f.toString();
        String str = this.f84882a;
        int length = String.valueOf(str).length();
        String str2 = this.f84883b;
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
        this.f84882a = str2;
        this.f84883b = str3;
        this.f84884c = true == TextUtils.isEmpty(str) ? null : str;
        this.f84885d = j10;
        this.f84886e = j11;
        if (j11 != 0 && j11 > j10) {
            x22.a().p().c("Event created with reverse previous/current timestamps. appId, name", C11218q2.v(str2), C11218q2.v(str3));
        }
        this.f84887f = e10;
    }
}
