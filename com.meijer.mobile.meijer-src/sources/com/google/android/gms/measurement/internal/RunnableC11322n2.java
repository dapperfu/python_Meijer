package com.google.android.gms.measurement.internal;

import android.util.Log;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.n2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11322n2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f86552a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f86553b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f86554c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f86555d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f86556e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C11343q2 f86557f;

    RunnableC11322n2(C11343q2 c11343q2, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f86552a = i10;
        this.f86553b = str;
        this.f86554c = obj;
        this.f86555d = obj2;
        this.f86556e = obj3;
        Objects.requireNonNull(c11343q2);
        this.f86557f = c11343q2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11343q2 c11343q2 = this.f86557f;
        E2 e2V = c11343q2.f85708a.v();
        if (!e2V.i()) {
            Log.println(6, c11343q2.x(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (c11343q2.B() == 0) {
            X2 x22 = c11343q2.f85708a;
            if (x22.u().z()) {
                x22.c();
                c11343q2.C('C');
            } else {
                x22.c();
                c11343q2.C('c');
            }
        }
        if (c11343q2.D() < 0) {
            c11343q2.f85708a.u().y();
            c11343q2.E(133005L);
        }
        int i10 = this.f86552a;
        char cB = c11343q2.B();
        long jD = c11343q2.D();
        String str = this.f86553b;
        Object obj = this.f86554c;
        Object obj2 = this.f86555d;
        Object obj3 = this.f86556e;
        char cCharAt = "01VDIWEA?".charAt(i10);
        String strY = C11343q2.y(true, str, obj, obj2, obj3);
        int length = String.valueOf(cCharAt).length();
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(cB).length() + String.valueOf(jD).length() + 1 + strY.length());
        sb2.append("2");
        sb2.append(cCharAt);
        sb2.append(cB);
        sb2.append(jD);
        sb2.append(":");
        sb2.append(strY);
        String string = sb2.toString();
        if (string.length() > 1024) {
            string = str.substring(0, 1024);
        }
        C2 c22 = e2V.f85813e;
        if (c22 != null) {
            c22.a(string, 1L);
        }
    }
}
