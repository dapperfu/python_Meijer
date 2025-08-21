package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.w70, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9911w70 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f80272a = new HashMap();

    public final C9804v70 a(EnumC8842m70 enumC8842m70, Context context, C7882d70 c7882d70, C70 c70) {
        C9804v70 c9804v70 = (C9804v70) this.f80272a.get(enumC8842m70);
        if (c9804v70 != null) {
            return c9804v70;
        }
        C8416i70 c8416i70 = new C8416i70(C9163p70.B(enumC8842m70, context));
        C9804v70 c9804v702 = new C9804v70(c8416i70, new E70(c8416i70, c7882d70, c70));
        this.f80272a.put(enumC8842m70, c9804v702);
        return c9804v702;
    }
}
