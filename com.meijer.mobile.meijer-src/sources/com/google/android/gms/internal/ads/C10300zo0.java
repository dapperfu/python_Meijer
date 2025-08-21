package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.zo0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10300zo0 {

    /* renamed from: a, reason: collision with root package name */
    private HashMap f81343a = new HashMap();

    public final Bo0 a() {
        if (this.f81343a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Bo0 bo0 = new Bo0(Collections.unmodifiableMap(this.f81343a), null);
        this.f81343a = null;
        return bo0;
    }
}
