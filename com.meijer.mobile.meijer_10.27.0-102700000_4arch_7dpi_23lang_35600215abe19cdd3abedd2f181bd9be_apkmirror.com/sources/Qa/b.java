package Qa;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class b extends d {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f29917a;

    public Context a() {
        WeakReference<Context> weakReference = this.f29917a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
