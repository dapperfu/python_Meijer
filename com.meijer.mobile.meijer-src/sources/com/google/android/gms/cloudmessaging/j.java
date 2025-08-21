package com.google.android.gms.cloudmessaging;

import Vd.C5517k;
import android.os.Bundle;
import android.util.Log;
import com.fullstory.FS;

/* loaded from: classes4.dex */
abstract class j {

    /* renamed from: a, reason: collision with root package name */
    final int f65552a;

    /* renamed from: b, reason: collision with root package name */
    final C5517k f65553b = new C5517k();

    /* renamed from: c, reason: collision with root package name */
    final int f65554c;

    /* renamed from: d, reason: collision with root package name */
    final Bundle f65555d;

    abstract void a(Bundle bundle);

    abstract boolean b();

    final void c(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            FS.log_d("MessengerIpcClient", "Failing " + toString() + " with " + zztVar.toString());
        }
        this.f65553b.b(zztVar);
    }

    final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            FS.log_d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.f65553b.c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f65554c + " id=" + this.f65552a + " oneWay=" + b() + "}";
    }

    j(int i10, int i11, Bundle bundle) {
        this.f65552a = i10;
        this.f65554c = i11;
        this.f65555d = bundle;
    }
}
