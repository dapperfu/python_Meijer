package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.xf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9943xf0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f79827a;

    /* renamed from: b, reason: collision with root package name */
    private final C9836wf0 f79828b;

    /* renamed from: c, reason: collision with root package name */
    private C9836wf0 f79829c;

    public final C9943xf0 a(Object obj) {
        C9836wf0 c9836wf0 = new C9836wf0();
        this.f79829c.f79515b = c9836wf0;
        this.f79829c = c9836wf0;
        c9836wf0.f79514a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f79827a);
        sb2.append('{');
        C9836wf0 c9836wf0 = this.f79828b.f79515b;
        String str = "";
        while (c9836wf0 != null) {
            Object obj = c9836wf0.f79514a;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            c9836wf0 = c9836wf0.f79515b;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    /* synthetic */ C9943xf0(String str, C10050yf0 c10050yf0) {
        C9836wf0 c9836wf0 = new C9836wf0();
        this.f79828b = c9836wf0;
        this.f79829c = c9836wf0;
        str.getClass();
        this.f79827a = str;
    }
}
