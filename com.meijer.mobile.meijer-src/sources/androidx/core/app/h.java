package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;

@Deprecated
/* loaded from: classes.dex */
public final class h {
    @Deprecated
    public static IBinder a(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }
}
