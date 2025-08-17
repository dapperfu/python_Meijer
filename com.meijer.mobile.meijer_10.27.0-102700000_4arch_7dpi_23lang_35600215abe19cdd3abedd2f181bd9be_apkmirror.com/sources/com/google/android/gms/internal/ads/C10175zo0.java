package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.zo0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10175zo0 {

    /* renamed from: a, reason: collision with root package name */
    private HashMap f80503a = new HashMap();

    public final Bo0 a() {
        if (this.f80503a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Bo0 bo0 = new Bo0(Collections.unmodifiableMap(this.f80503a), null);
        this.f80503a = null;
        return bo0;
    }
}
