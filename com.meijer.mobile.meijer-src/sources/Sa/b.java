package Sa;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class b extends d {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f34467a;

    public Context a() {
        WeakReference<Context> weakReference = this.f34467a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
