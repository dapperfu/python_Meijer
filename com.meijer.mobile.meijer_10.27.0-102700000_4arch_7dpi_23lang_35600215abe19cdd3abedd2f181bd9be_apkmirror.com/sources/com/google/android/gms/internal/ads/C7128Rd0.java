package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.maps.android.BuildConfig;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.Rd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C7128Rd0 {

    /* renamed from: h, reason: collision with root package name */
    static final String f69903h = new UUID(0, 0).toString();

    /* renamed from: a, reason: collision with root package name */
    private final String f69904a;

    /* renamed from: b, reason: collision with root package name */
    private final String f69905b;

    /* renamed from: c, reason: collision with root package name */
    private final String f69906c;

    /* renamed from: d, reason: collision with root package name */
    private final String f69907d;

    /* renamed from: e, reason: collision with root package name */
    private final String f69908e;

    /* renamed from: f, reason: collision with root package name */
    final C7094Qd0 f69909f;

    /* renamed from: g, reason: collision with root package name */
    final C7060Pd0 f69910g;

    final C7026Od0 b(String str, String str2, long j10, boolean z10) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(f69903h)) {
                    String strE = e(true);
                    String strC = this.f69909f.c("paid_3p_hash_key", null);
                    if (strE != null && strC != null && !strE.equals(h(str, str2, strC))) {
                        return c(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new C7026Od0();
        }
        boolean z11 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.f69908e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long jA = a(z11);
        if (jA != -1) {
            if (jCurrentTimeMillis < jA) {
                this.f69909f.d(z11 ? this.f69907d : this.f69906c, Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= jA + j10) {
                return c(str, str2);
            }
        }
        String strE2 = e(z11);
        return (strE2 != null || z10) ? new C7026Od0(strE2, a(z11)) : c(str, str2);
    }

    private final String h(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes((str + str2 + str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.f69908e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str4);
        sb2.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb2.append(str2 == null ? BuildConfig.TRAVIS : "not null");
        sb2.append(", hashKey is ");
        sb2.append(str3 == null ? BuildConfig.TRAVIS : "not null");
        throw new IllegalArgumentException(sb2.toString());
    }

    final long a(boolean z10) {
        return this.f69909f.a(z10 ? this.f69907d : this.f69906c, -1L);
    }

    final C7026Od0 c(String str, String str2) throws IOException {
        if (str == null) {
            return d(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.f69909f.d("paid_3p_hash_key", string);
        return d(h(str, str2, string), true);
    }

    final String e(boolean z10) {
        return this.f69909f.c(z10 ? this.f69905b : this.f69904a, null);
    }

    final void f(boolean z10) throws IOException {
        this.f69909f.e(z10 ? this.f69907d : this.f69906c);
        this.f69909f.e(z10 ? this.f69905b : this.f69904a);
    }

    final boolean g(boolean z10) {
        return this.f69909f.g(this.f69904a);
    }

    C7128Rd0(Context context, String str, String str2, String str3) {
        this.f69909f = C7094Qd0.b(context);
        this.f69910g = C7060Pd0.a(context);
        this.f69904a = str;
        this.f69905b = str.concat("_3p");
        this.f69906c = str2;
        this.f69907d = str2.concat("_3p");
        this.f69908e = str3;
    }

    final C7026Od0 d(String str, boolean z10) throws IOException {
        String str2;
        String str3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis >= 0) {
            C7094Qd0 c7094Qd0 = this.f69909f;
            if (z10) {
                str2 = this.f69907d;
            } else {
                str2 = this.f69906c;
            }
            c7094Qd0.d(str2, Long.valueOf(jCurrentTimeMillis));
            C7094Qd0 c7094Qd02 = this.f69909f;
            if (z10) {
                str3 = this.f69905b;
            } else {
                str3 = this.f69904a;
            }
            c7094Qd02.d(str3, str);
            return new C7026Od0(str, jCurrentTimeMillis);
        }
        throw new IllegalStateException(this.f69908e.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }
}
