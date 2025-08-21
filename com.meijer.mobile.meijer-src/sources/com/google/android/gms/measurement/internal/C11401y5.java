package com.google.android.gms.measurement.internal;

import Kc.a;
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
public final class C11401y5 extends AbstractC11233b6 {

    /* renamed from: d, reason: collision with root package name */
    private final Map f86888d;

    /* renamed from: e, reason: collision with root package name */
    public final B2 f86889e;

    /* renamed from: f, reason: collision with root package name */
    public final B2 f86890f;

    /* renamed from: g, reason: collision with root package name */
    public final B2 f86891g;

    /* renamed from: h, reason: collision with root package name */
    public final B2 f86892h;

    /* renamed from: i, reason: collision with root package name */
    public final B2 f86893i;

    /* renamed from: j, reason: collision with root package name */
    public final B2 f86894j;

    @Override // com.google.android.gms.measurement.internal.AbstractC11233b6
    protected final boolean j() {
        return false;
    }

    final Pair k(String str, E3 e32) {
        return e32.o(Qd.v.AD_STORAGE) ? l(str) : new Pair("", Boolean.FALSE);
    }

    @Deprecated
    final Pair l(String str) {
        C11394x5 c11394x5;
        a.C0277a c0277aA;
        f();
        X2 x22 = this.f85708a;
        long jC = x22.zzaZ().c();
        C11394x5 c11394x52 = (C11394x5) this.f86888d.get(str);
        if (c11394x52 != null && jC < c11394x52.f86869c) {
            return new Pair(c11394x52.f86867a, Boolean.valueOf(c11394x52.f86868b));
        }
        Kc.a.d(true);
        long jB = x22.u().B(str, C11245d2.f86293b) + jC;
        try {
            try {
                c0277aA = Kc.a.a(x22.zzaY());
            } catch (PackageManager.NameNotFoundException unused) {
                c0277aA = null;
                if (c11394x52 != null && jC < c11394x52.f86869c + this.f85708a.u().B(str, C11245d2.f86296c)) {
                    return new Pair(c11394x52.f86867a, Boolean.valueOf(c11394x52.f86868b));
                }
            }
        } catch (Exception e10) {
            this.f85708a.a().t().b("Unable to get advertising id", e10);
            c11394x5 = new C11394x5("", false, jB);
        }
        if (c0277aA == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String strA = c0277aA.a();
        c11394x5 = strA != null ? new C11394x5(strA, c0277aA.b(), jB) : new C11394x5("", c0277aA.b(), jB);
        this.f86888d.put(str, c11394x5);
        Kc.a.d(false);
        return new Pair(c11394x5.f86867a, Boolean.valueOf(c11394x5.f86868b));
    }

    C11401y5(q6 q6Var) {
        super(q6Var);
        this.f86888d = new HashMap();
        E2 e2V = this.f85708a.v();
        Objects.requireNonNull(e2V);
        this.f86889e = new B2(e2V, "last_delete_stale", 0L);
        E2 e2V2 = this.f85708a.v();
        Objects.requireNonNull(e2V2);
        this.f86890f = new B2(e2V2, "last_delete_stale_batch", 0L);
        E2 e2V3 = this.f85708a.v();
        Objects.requireNonNull(e2V3);
        this.f86891g = new B2(e2V3, "backoff", 0L);
        E2 e2V4 = this.f85708a.v();
        Objects.requireNonNull(e2V4);
        this.f86892h = new B2(e2V4, "last_upload", 0L);
        E2 e2V5 = this.f85708a.v();
        Objects.requireNonNull(e2V5);
        this.f86893i = new B2(e2V5, "last_upload_attempt", 0L);
        E2 e2V6 = this.f85708a.v();
        Objects.requireNonNull(e2V6);
        this.f86894j = new B2(e2V6, "midnight_offset", 0L);
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
