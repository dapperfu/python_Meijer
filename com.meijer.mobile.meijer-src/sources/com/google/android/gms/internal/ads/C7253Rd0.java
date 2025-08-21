package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.maps.android.BuildConfig;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.Rd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C7253Rd0 {

    /* renamed from: h, reason: collision with root package name */
    static final String f70743h = new UUID(0, 0).toString();

    /* renamed from: a, reason: collision with root package name */
    private final String f70744a;

    /* renamed from: b, reason: collision with root package name */
    private final String f70745b;

    /* renamed from: c, reason: collision with root package name */
    private final String f70746c;

    /* renamed from: d, reason: collision with root package name */
    private final String f70747d;

    /* renamed from: e, reason: collision with root package name */
    private final String f70748e;

    /* renamed from: f, reason: collision with root package name */
    final C7219Qd0 f70749f;

    /* renamed from: g, reason: collision with root package name */
    final C7185Pd0 f70750g;

    final C7151Od0 b(String str, String str2, long j10, boolean z10) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(f70743h)) {
                    String strE = e(true);
                    String strC = this.f70749f.c("paid_3p_hash_key", null);
                    if (strE != null && strC != null && !strE.equals(h(str, str2, strC))) {
                        return c(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new C7151Od0();
        }
        boolean z11 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.f70748e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long jA = a(z11);
        if (jA != -1) {
            if (jCurrentTimeMillis < jA) {
                this.f70749f.d(z11 ? this.f70747d : this.f70746c, Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= jA + j10) {
                return c(str, str2);
            }
        }
        String strE2 = e(z11);
        return (strE2 != null || z10) ? new C7151Od0(strE2, a(z11)) : c(str, str2);
    }

    private final String h(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes((str + str2 + str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.f70748e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str4);
        sb2.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb2.append(str2 == null ? BuildConfig.TRAVIS : "not null");
        sb2.append(", hashKey is ");
        sb2.append(str3 == null ? BuildConfig.TRAVIS : "not null");
        throw new IllegalArgumentException(sb2.toString());
    }

    final long a(boolean z10) {
        return this.f70749f.a(z10 ? this.f70747d : this.f70746c, -1L);
    }

    final C7151Od0 c(String str, String str2) throws IOException {
        if (str == null) {
            return d(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.f70749f.d("paid_3p_hash_key", string);
        return d(h(str, str2, string), true);
    }

    final String e(boolean z10) {
        return this.f70749f.c(z10 ? this.f70745b : this.f70744a, null);
    }

    final void f(boolean z10) throws IOException {
        this.f70749f.e(z10 ? this.f70747d : this.f70746c);
        this.f70749f.e(z10 ? this.f70745b : this.f70744a);
    }

    final boolean g(boolean z10) {
        return this.f70749f.g(this.f70744a);
    }

    C7253Rd0(Context context, String str, String str2, String str3) {
        this.f70749f = C7219Qd0.b(context);
        this.f70750g = C7185Pd0.a(context);
        this.f70744a = str;
        this.f70745b = str.concat("_3p");
        this.f70746c = str2;
        this.f70747d = str2.concat("_3p");
        this.f70748e = str3;
    }

    final C7151Od0 d(String str, boolean z10) throws IOException {
        String str2;
        String str3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis >= 0) {
            C7219Qd0 c7219Qd0 = this.f70749f;
            if (z10) {
                str2 = this.f70747d;
            } else {
                str2 = this.f70746c;
            }
            c7219Qd0.d(str2, Long.valueOf(jCurrentTimeMillis));
            C7219Qd0 c7219Qd02 = this.f70749f;
            if (z10) {
                str3 = this.f70745b;
            } else {
                str3 = this.f70744a;
            }
            c7219Qd02.d(str3, str);
            return new C7151Od0(str, jCurrentTimeMillis);
        }
        throw new IllegalStateException(this.f70748e.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }
}
