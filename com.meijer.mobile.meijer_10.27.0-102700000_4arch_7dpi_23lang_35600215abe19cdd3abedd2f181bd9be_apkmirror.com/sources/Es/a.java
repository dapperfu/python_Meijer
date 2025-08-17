package Es;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static int f9735a;

    public static int a(Context context) {
        if (f9735a == 0) {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f9735a = point.y;
        }
        return f9735a;
    }
}
