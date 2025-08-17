package G;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e {

    private static class a {
        static Context a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        static String b(Context context) {
            return context.getAttributionTag();
        }
    }

    private static class b {
        static Context a(Context context, int i10) {
            return context.createDeviceContext(i10);
        }

        static int b(Context context) {
            return context.getDeviceId();
        }
    }

    public static Context a(Context context) {
        int iB;
        Context applicationContext = context.getApplicationContext();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34 && (iB = b.b(context)) != b.b(applicationContext)) {
            applicationContext = b.a(applicationContext, iB);
        }
        if (i10 >= 30) {
            String strB = a.b(context);
            if (!Objects.equals(strB, a.b(applicationContext))) {
                return a.a(applicationContext, strB);
            }
        }
        return applicationContext;
    }

    public static Application b(Context context) {
        for (Context contextA = a(context); contextA instanceof ContextWrapper; contextA = ((ContextWrapper) contextA).getBaseContext()) {
            if (contextA instanceof Application) {
                return (Application) contextA;
            }
        }
        return null;
    }
}
