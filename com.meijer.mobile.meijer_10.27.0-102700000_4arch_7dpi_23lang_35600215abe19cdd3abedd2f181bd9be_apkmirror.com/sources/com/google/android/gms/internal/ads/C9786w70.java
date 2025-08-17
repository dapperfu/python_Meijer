package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.w70, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9786w70 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f79432a = new HashMap();

    public final C9679v70 a(EnumC8717m70 enumC8717m70, Context context, C7757d70 c7757d70, C70 c70) {
        C9679v70 c9679v70 = (C9679v70) this.f79432a.get(enumC8717m70);
        if (c9679v70 != null) {
            return c9679v70;
        }
        C8291i70 c8291i70 = new C8291i70(C9038p70.B(enumC8717m70, context));
        C9679v70 c9679v702 = new C9679v70(c8291i70, new E70(c8291i70, c7757d70, c70));
        this.f79432a.put(enumC8717m70, c9679v702);
        return c9679v702;
    }
}
