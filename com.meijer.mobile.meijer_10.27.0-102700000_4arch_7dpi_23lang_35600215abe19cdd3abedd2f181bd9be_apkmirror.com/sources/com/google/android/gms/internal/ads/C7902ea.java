package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ea, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7902ea {

    /* renamed from: a, reason: collision with root package name */
    private List f73904a = Collections.EMPTY_LIST;

    public final List a() {
        List list = this.f73904a;
        this.f73904a = Collections.EMPTY_LIST;
        return list;
    }

    public final void b(List list) {
        this.f73904a = new ArrayList(list);
    }
}
