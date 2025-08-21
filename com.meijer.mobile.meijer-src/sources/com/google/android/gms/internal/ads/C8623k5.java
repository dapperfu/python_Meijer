package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.k5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8623k5 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f76414a;

    /* renamed from: b, reason: collision with root package name */
    public final String f76415b;

    /* renamed from: c, reason: collision with root package name */
    public final List f76416c;

    /* renamed from: d, reason: collision with root package name */
    public final String f76417d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC8042eh0 f76418e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f76419f;

    /* renamed from: g, reason: collision with root package name */
    public final long f76420g;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8623k5)) {
            return false;
        }
        C8623k5 c8623k5 = (C8623k5) obj;
        if (this.f76414a.equals(c8623k5.f76414a) && this.f76416c.equals(c8623k5.f76416c) && this.f76418e.equals(c8623k5.f76418e)) {
            Object obj2 = -9223372036854775807L;
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) (((((((this.f76414a.hashCode() * 923521) + this.f76416c.hashCode()) * 961) + this.f76418e.hashCode()) * 31) * 31) - Long.MAX_VALUE);
    }

    /* synthetic */ C8623k5(Uri uri, String str, I3 i32, C7975e1 c7975e1, List list, String str2, AbstractC8042eh0 abstractC8042eh0, Object obj, long j10, C8201g7 c8201g7) {
        this.f76414a = uri;
        int i10 = C7182Pc.f70220c;
        this.f76415b = null;
        this.f76416c = list;
        this.f76417d = null;
        this.f76418e = abstractC8042eh0;
        C7723bh0 c7723bh0 = new C7723bh0();
        if (abstractC8042eh0.size() <= 0) {
            c7723bh0.j();
            this.f76419f = null;
            this.f76420g = -9223372036854775807L;
            return;
        }
        throw null;
    }
}
