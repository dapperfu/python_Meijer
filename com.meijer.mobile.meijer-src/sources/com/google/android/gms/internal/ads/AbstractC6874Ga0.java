package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.Ga0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC6874Ga0 {
    public abstract void b(View view, EnumC7111Na0 enumC7111Na0, String str);

    public abstract void c();

    public abstract void d(View view);

    public abstract void e();

    public static AbstractC6874Ga0 a(C6908Ha0 c6908Ha0, C6942Ia0 c6942Ia0) {
        C6774Db0.a();
        return new C7010Ka0(c6908Ha0, c6942Ia0, UUID.randomUUID().toString());
    }
}
