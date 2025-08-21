package Ds;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

/* loaded from: classes12.dex */
public class m {
    public static void a(Context context, String str, Object... objArr) {
        b(context, 0, str, objArr);
    }

    public static void c(Context context, String str, Object... objArr) {
        b(context, 1, str, objArr);
    }

    private static Context d(Context context) {
        return context instanceof Activity ? ((Activity) context).getBaseContext() : context;
    }

    private static void b(Context context, int i10, String str, Object... objArr) {
        Toast.makeText(d(context), String.format(str, objArr), i10).show();
    }
}
