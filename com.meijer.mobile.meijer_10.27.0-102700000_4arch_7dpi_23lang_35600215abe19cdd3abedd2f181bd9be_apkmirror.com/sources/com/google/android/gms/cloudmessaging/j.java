package com.google.android.gms.cloudmessaging;

import Td.C5233k;
import android.os.Bundle;
import android.util.Log;
import com.fullstory.FS;

/* loaded from: classes4.dex */
abstract class j {

    /* renamed from: a, reason: collision with root package name */
    final int f64712a;

    /* renamed from: b, reason: collision with root package name */
    final C5233k f64713b = new C5233k();

    /* renamed from: c, reason: collision with root package name */
    final int f64714c;

    /* renamed from: d, reason: collision with root package name */
    final Bundle f64715d;

    abstract void a(Bundle bundle);

    abstract boolean b();

    final void c(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            FS.log_d("MessengerIpcClient", "Failing " + toString() + " with " + zztVar.toString());
        }
        this.f64713b.b(zztVar);
    }

    final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            FS.log_d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.f64713b.c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f64714c + " id=" + this.f64712a + " oneWay=" + b() + "}";
    }

    j(int i10, int i11, Bundle bundle) {
        this.f64712a = i10;
        this.f64714c = i11;
        this.f64715d = bundle;
    }
}
