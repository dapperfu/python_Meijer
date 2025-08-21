package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

@Deprecated
/* renamed from: com.google.android.gms.internal.ads.yf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10174yf {

    /* renamed from: a, reason: collision with root package name */
    private final Map f81101a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final C6679Af f81102b;

    public final C6679Af a() {
        return this.f81102b;
    }

    public final void b(String str, C10067xf c10067xf) {
        this.f81101a.put(str, c10067xf);
    }

    public final void c(String str, String str2, long j10) {
        C10067xf c10067xf = (C10067xf) this.f81101a.get(str2);
        String[] strArr = {str};
        if (c10067xf != null) {
            this.f81102b.e(c10067xf, j10, strArr);
        }
        this.f81101a.put(str, new C10067xf(j10, null, null));
    }

    public C10174yf(C6679Af c6679Af) {
        this.f81102b = c6679Af;
    }
}
