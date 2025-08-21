package com.google.firebase.messaging;

import Vd.AbstractC5516j;
import Vd.InterfaceC5511e;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.fullstory.FS;
import com.google.firebase.messaging.o0;

/* loaded from: classes8.dex */
class l0 extends Binder {

    /* renamed from: a, reason: collision with root package name */
    private final a f89796a;

    interface a {
        AbstractC5516j<Void> a(Intent intent);
    }

    l0(a aVar) {
        this.f89796a = aVar;
    }

    void b(final o0.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                FS.log_d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f89796a.a(aVar.f89809a).d(new androidx.privacysandbox.ads.adservices.measurement.k(), new InterfaceC5511e() { // from class: com.google.firebase.messaging.k0
                @Override // Vd.InterfaceC5511e
                public final void onComplete(AbstractC5516j abstractC5516j) {
                    aVar.d();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
