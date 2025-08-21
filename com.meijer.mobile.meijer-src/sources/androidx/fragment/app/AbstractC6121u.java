package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: androidx.fragment.app.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6121u {
    public abstract View c(int i10);

    public abstract boolean d();

    @Deprecated
    public Fragment b(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }
}
