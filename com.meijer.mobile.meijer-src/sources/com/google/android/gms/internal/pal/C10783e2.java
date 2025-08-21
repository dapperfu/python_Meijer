package com.google.android.gms.internal.pal;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.pal.e2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10783e2 extends C10832h2 implements Serializable, InterfaceC10800f2 {

    /* renamed from: b, reason: collision with root package name */
    public static final C10783e2 f83937b = new C10783e2(0);

    public static C10783e2 a(long j10) {
        return j10 == 0 ? f83937b : new C10783e2(j10);
    }

    public static C10783e2 b(long j10) {
        return new C10783e2(C10848i2.a(j10, 3600000));
    }

    public static C10783e2 e(long j10) {
        return new C10783e2(C10848i2.a(j10, 1000));
    }

    public C10783e2(long j10) {
        super(j10);
    }
}
