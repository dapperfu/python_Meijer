package com.google.android.gms.measurement.internal;

import Ic.a;
import android.content.pm.PackageManager;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.y5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11276y5 extends AbstractC11108b6 {

    /* renamed from: d, reason: collision with root package name */
    private final Map f86048d;

    /* renamed from: e, reason: collision with root package name */
    public final B2 f86049e;

    /* renamed from: f, reason: collision with root package name */
    public final B2 f86050f;

    /* renamed from: g, reason: collision with root package name */
    public final B2 f86051g;

    /* renamed from: h, reason: collision with root package name */
    public final B2 f86052h;

    /* renamed from: i, reason: collision with root package name */
    public final B2 f86053i;

    /* renamed from: j, reason: collision with root package name */
    public final B2 f86054j;

    @Override // com.google.android.gms.measurement.internal.AbstractC11108b6
    protected final boolean j() {
        return false;
    }

    final Pair k(String str, E3 e32) {
        return e32.o(Od.v.AD_STORAGE) ? l(str) : new Pair("", Boolean.FALSE);
    }

    @Deprecated
    final Pair l(String str) {
        C11269x5 c11269x5;
        a.C0217a c0217aA;
        f();
        X2 x22 = this.f84868a;
        long jC = x22.zzaZ().c();
        C11269x5 c11269x52 = (C11269x5) this.f86048d.get(str);
        if (c11269x52 != null && jC < c11269x52.f86029c) {
            return new Pair(c11269x52.f86027a, Boolean.valueOf(c11269x52.f86028b));
        }
        Ic.a.d(true);
        long jB = x22.u().B(str, C11120d2.f85453b) + jC;
        try {
            try {
                c0217aA = Ic.a.a(x22.zzaY());
            } catch (PackageManager.NameNotFoundException unused) {
                c0217aA = null;
                if (c11269x52 != null && jC < c11269x52.f86029c + this.f84868a.u().B(str, C11120d2.f85456c)) {
                    return new Pair(c11269x52.f86027a, Boolean.valueOf(c11269x52.f86028b));
                }
            }
        } catch (Exception e10) {
            this.f84868a.a().t().b("Unable to get advertising id", e10);
            c11269x5 = new C11269x5("", false, jB);
        }
        if (c0217aA == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String strA = c0217aA.a();
        c11269x5 = strA != null ? new C11269x5(strA, c0217aA.b(), jB) : new C11269x5("", c0217aA.b(), jB);
        this.f86048d.put(str, c11269x5);
        Ic.a.d(false);
        return new Pair(c11269x5.f86027a, Boolean.valueOf(c11269x5.f86028b));
    }

    C11276y5(q6 q6Var) {
        super(q6Var);
        this.f86048d = new HashMap();
        E2 e2V = this.f84868a.v();
        Objects.requireNonNull(e2V);
        this.f86049e = new B2(e2V, "last_delete_stale", 0L);
        E2 e2V2 = this.f84868a.v();
        Objects.requireNonNull(e2V2);
        this.f86050f = new B2(e2V2, "last_delete_stale_batch", 0L);
        E2 e2V3 = this.f84868a.v();
        Objects.requireNonNull(e2V3);
        this.f86051g = new B2(e2V3, "backoff", 0L);
        E2 e2V4 = this.f84868a.v();
        Objects.requireNonNull(e2V4);
        this.f86052h = new B2(e2V4, "last_upload", 0L);
        E2 e2V5 = this.f84868a.v();
        Objects.requireNonNull(e2V5);
        this.f86053i = new B2(e2V5, "last_upload_attempt", 0L);
        E2 e2V6 = this.f84868a.v();
        Objects.requireNonNull(e2V6);
        this.f86054j = new B2(e2V6, "midnight_offset", 0L);
    }

    @Deprecated
    final String m(String str, boolean z10) {
        String str2;
        f();
        if (z10) {
            str2 = (String) l(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest messageDigestA = z6.A();
        if (messageDigestA == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestA.digest(str2.getBytes())));
    }
}
