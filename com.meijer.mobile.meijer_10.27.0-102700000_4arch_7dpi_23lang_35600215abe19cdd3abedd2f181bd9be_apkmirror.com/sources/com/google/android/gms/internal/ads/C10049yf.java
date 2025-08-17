package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

@Deprecated
/* renamed from: com.google.android.gms.internal.ads.yf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10049yf {

    /* renamed from: a, reason: collision with root package name */
    private final Map f80261a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final C6554Af f80262b;

    public final C6554Af a() {
        return this.f80262b;
    }

    public final void b(String str, C9942xf c9942xf) {
        this.f80261a.put(str, c9942xf);
    }

    public final void c(String str, String str2, long j10) {
        C9942xf c9942xf = (C9942xf) this.f80261a.get(str2);
        String[] strArr = {str};
        if (c9942xf != null) {
            this.f80262b.e(c9942xf, j10, strArr);
        }
        this.f80261a.put(str, new C9942xf(j10, null, null));
    }

    public C10049yf(C6554Af c6554Af) {
        this.f80262b = c6554Af;
    }
}
