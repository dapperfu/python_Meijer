package uu;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: uu.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C17330a {
    public static Application a(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
            if (baseContext instanceof Application) {
                return (Application) baseContext;
            }
        }
        throw new IllegalStateException("Could not find an Application in the given context: " + context);
    }
}
