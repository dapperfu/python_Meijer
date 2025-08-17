package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.Ga0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC6749Ga0 {
    public abstract void b(View view, EnumC6986Na0 enumC6986Na0, String str);

    public abstract void c();

    public abstract void d(View view);

    public abstract void e();

    public static AbstractC6749Ga0 a(C6783Ha0 c6783Ha0, C6817Ia0 c6817Ia0) {
        C6649Db0.a();
        return new C6885Ka0(c6783Ha0, c6817Ia0, UUID.randomUUID().toString());
    }
}
