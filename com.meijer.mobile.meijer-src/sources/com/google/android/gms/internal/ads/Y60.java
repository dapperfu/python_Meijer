package com.google.android.gms.internal.ads;

import Vd.AbstractC5516j;
import android.content.Context;
import dd.C13653a;
import dd.InterfaceC13654b;

/* loaded from: classes6.dex */
public final class Y60 {

    /* renamed from: a, reason: collision with root package name */
    static AbstractC5516j f72333a;

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC13654b f72334b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f72335c = new Object();

    public static AbstractC5516j a(Context context) {
        AbstractC5516j abstractC5516j;
        b(context, false);
        synchronized (f72335c) {
            abstractC5516j = f72333a;
        }
        return abstractC5516j;
    }

    public static void b(Context context, boolean z10) {
        synchronized (f72335c) {
            try {
                if (f72334b == null) {
                    f72334b = C13653a.a(context);
                }
                AbstractC5516j abstractC5516j = f72333a;
                if (abstractC5516j == null || ((abstractC5516j.q() && !f72333a.r()) || (z10 && f72333a.q()))) {
                    f72333a = ((InterfaceC13654b) com.google.android.gms.common.internal.r.m(f72334b, "the appSetIdClient shouldn't be null")).h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
