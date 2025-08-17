package com.google.android.gms.internal.ads;

import Td.AbstractC5232j;
import android.content.Context;
import bd.C6222a;
import bd.InterfaceC6223b;

/* loaded from: classes6.dex */
public final class Y60 {

    /* renamed from: a, reason: collision with root package name */
    static AbstractC5232j f71493a;

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC6223b f71494b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f71495c = new Object();

    public static AbstractC5232j a(Context context) {
        AbstractC5232j abstractC5232j;
        b(context, false);
        synchronized (f71495c) {
            abstractC5232j = f71493a;
        }
        return abstractC5232j;
    }

    public static void b(Context context, boolean z10) {
        synchronized (f71495c) {
            try {
                if (f71494b == null) {
                    f71494b = C6222a.a(context);
                }
                AbstractC5232j abstractC5232j = f71493a;
                if (abstractC5232j == null || ((abstractC5232j.q() && !f71493a.r()) || (z10 && f71493a.q()))) {
                    f71493a = ((InterfaceC6223b) com.google.android.gms.common.internal.r.m(f71494b, "the appSetIdClient shouldn't be null")).g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
