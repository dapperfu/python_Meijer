package com.google.android.gms.measurement.internal;

import android.util.Log;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.n2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11197n2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f85712a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f85713b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f85714c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f85715d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f85716e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C11218q2 f85717f;

    RunnableC11197n2(C11218q2 c11218q2, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f85712a = i10;
        this.f85713b = str;
        this.f85714c = obj;
        this.f85715d = obj2;
        this.f85716e = obj3;
        Objects.requireNonNull(c11218q2);
        this.f85717f = c11218q2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11218q2 c11218q2 = this.f85717f;
        E2 e2V = c11218q2.f84868a.v();
        if (!e2V.i()) {
            Log.println(6, c11218q2.x(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (c11218q2.B() == 0) {
            X2 x22 = c11218q2.f84868a;
            if (x22.u().z()) {
                x22.c();
                c11218q2.C('C');
            } else {
                x22.c();
                c11218q2.C('c');
            }
        }
        if (c11218q2.D() < 0) {
            c11218q2.f84868a.u().y();
            c11218q2.E(133005L);
        }
        int i10 = this.f85712a;
        char cB = c11218q2.B();
        long jD = c11218q2.D();
        String str = this.f85713b;
        Object obj = this.f85714c;
        Object obj2 = this.f85715d;
        Object obj3 = this.f85716e;
        char cCharAt = "01VDIWEA?".charAt(i10);
        String strY = C11218q2.y(true, str, obj, obj2, obj3);
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
        C2 c22 = e2V.f84973e;
        if (c22 != null) {
            c22.a(string, 1L);
        }
    }
}
