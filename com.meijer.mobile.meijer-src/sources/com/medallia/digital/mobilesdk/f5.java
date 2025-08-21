package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import java.util.ArrayList;

/* loaded from: classes8.dex */
final class f5 {

    /* renamed from: b, reason: collision with root package name */
    private static f5 f92874b;

    /* renamed from: a, reason: collision with root package name */
    protected ArrayList<e5> f92875a = new ArrayList<>();

    f5() {
    }

    protected static f5 a() {
        if (f92874b == null) {
            f92874b = new f5();
        }
        return f92874b;
    }

    protected ArrayList<e5> b() {
        ArrayList arrayListC = f1.a().c(b0.a.MediaFeedback, new Object[0]);
        this.f92875a = arrayListC;
        if (arrayListC != null) {
            return arrayListC;
        }
        return null;
    }
}
