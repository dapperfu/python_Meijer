package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import java.util.ArrayList;

/* loaded from: classes7.dex */
final class f5 {

    /* renamed from: b, reason: collision with root package name */
    private static f5 f92035b;

    /* renamed from: a, reason: collision with root package name */
    protected ArrayList<e5> f92036a = new ArrayList<>();

    f5() {
    }

    protected static f5 a() {
        if (f92035b == null) {
            f92035b = new f5();
        }
        return f92035b;
    }

    protected ArrayList<e5> b() {
        ArrayList arrayListC = f1.a().c(b0.a.MediaFeedback, new Object[0]);
        this.f92036a = arrayListC;
        if (arrayListC != null) {
            return arrayListC;
        }
        return null;
    }
}
