package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
final class HQ implements InterfaceC10243zD {

    /* renamed from: a, reason: collision with root package name */
    private final Context f68271a;

    /* renamed from: b, reason: collision with root package name */
    private final C7436Wp f68272b;

    HQ(Context context, C7436Wp c7436Wp) {
        this.f68271a = context;
        this.f68272b = c7436Wp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10243zD
    public final void d0(C9978wo c9978wo) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10243zD
    public final void z0(C8733l60 c8733l60) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (TextUtils.isEmpty(c8733l60.f76589b.f76177b.f73946e)) {
            return;
        }
        this.f68272b.m(this.f68271a, c8733l60.f76588a.f75445a.f79578d);
        this.f68272b.i(this.f68271a, c8733l60.f76589b.f76177b.f73946e);
    }
}
