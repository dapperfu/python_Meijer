package com.google.firebase.messaging;

import Td.AbstractC5232j;
import Td.InterfaceC5227e;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.fullstory.FS;
import com.google.firebase.messaging.m0;

/* loaded from: classes7.dex */
class j0 extends Binder {

    /* renamed from: a, reason: collision with root package name */
    private final a f88948a;

    interface a {
        AbstractC5232j<Void> a(Intent intent);
    }

    j0(a aVar) {
        this.f88948a = aVar;
    }

    void b(final m0.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                FS.log_d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f88948a.a(aVar.f88960a).d(new androidx.privacysandbox.ads.adservices.measurement.k(), new InterfaceC5227e() { // from class: com.google.firebase.messaging.i0
                @Override // Td.InterfaceC5227e
                public final void onComplete(AbstractC5232j abstractC5232j) {
                    aVar.d();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
