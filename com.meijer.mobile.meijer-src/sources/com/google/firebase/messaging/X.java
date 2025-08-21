package com.google.firebase.messaging;

import Vd.AbstractC5516j;
import Vd.InterfaceC5509c;
import Z.C5603a;
import android.util.Log;
import com.fullstory.FS;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
class X {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f89692a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, AbstractC5516j<String>> f89693b = new C5603a();

    interface a {
        AbstractC5516j<String> start();
    }

    public static /* synthetic */ AbstractC5516j a(X x10, String str, AbstractC5516j abstractC5516j) {
        synchronized (x10) {
            x10.f89693b.remove(str);
        }
        return abstractC5516j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    synchronized AbstractC5516j<String> b(final String str, a aVar) {
        AbstractC5516j<String> abstractC5516j = this.f89693b.get(str);
        if (abstractC5516j != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                FS.log_d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return abstractC5516j;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            FS.log_d("FirebaseMessaging", "Making new request for: " + str);
        }
        AbstractC5516j abstractC5516jL = aVar.start().l(this.f89692a, new InterfaceC5509c() { // from class: com.google.firebase.messaging.W
            @Override // Vd.InterfaceC5509c
            public final Object then(AbstractC5516j abstractC5516j2) {
                return X.a(this.f89690a, str, abstractC5516j2);
            }
        });
        this.f89693b.put(str, abstractC5516jL);
        return abstractC5516jL;
    }

    X(Executor executor) {
        this.f89692a = executor;
    }
}
