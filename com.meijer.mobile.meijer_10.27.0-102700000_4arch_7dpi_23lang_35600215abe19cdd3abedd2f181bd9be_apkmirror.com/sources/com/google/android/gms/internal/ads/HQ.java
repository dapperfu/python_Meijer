package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
final class HQ implements InterfaceC10118zD {

    /* renamed from: a, reason: collision with root package name */
    private final Context f67431a;

    /* renamed from: b, reason: collision with root package name */
    private final C7311Wp f67432b;

    HQ(Context context, C7311Wp c7311Wp) {
        this.f67431a = context;
        this.f67432b = c7311Wp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10118zD
    public final void N(C9853wo c9853wo) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10118zD
    public final void A0(C8608l60 c8608l60) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (TextUtils.isEmpty(c8608l60.f75749b.f75337b.f73106e)) {
            return;
        }
        this.f67432b.m(this.f67431a, c8608l60.f75748a.f74605a.f78738d);
        this.f67432b.i(this.f67431a, c8608l60.f75749b.f75337b.f73106e);
    }
}
