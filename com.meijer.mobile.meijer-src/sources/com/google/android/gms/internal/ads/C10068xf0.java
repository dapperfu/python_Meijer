package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.xf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10068xf0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f80667a;

    /* renamed from: b, reason: collision with root package name */
    private final C9961wf0 f80668b;

    /* renamed from: c, reason: collision with root package name */
    private C9961wf0 f80669c;

    public final C10068xf0 a(Object obj) {
        C9961wf0 c9961wf0 = new C9961wf0();
        this.f80669c.f80355b = c9961wf0;
        this.f80669c = c9961wf0;
        c9961wf0.f80354a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f80667a);
        sb2.append('{');
        C9961wf0 c9961wf0 = this.f80668b.f80355b;
        String str = "";
        while (c9961wf0 != null) {
            Object obj = c9961wf0.f80354a;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            c9961wf0 = c9961wf0.f80355b;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    /* synthetic */ C10068xf0(String str, C10175yf0 c10175yf0) {
        C9961wf0 c9961wf0 = new C9961wf0();
        this.f80668b = c9961wf0;
        this.f80669c = c9961wf0;
        str.getClass();
        this.f80667a = str;
    }
}
