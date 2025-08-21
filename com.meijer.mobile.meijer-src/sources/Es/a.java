package Es;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static int f8447a;

    public static int a(Context context) {
        if (f8447a == 0) {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f8447a = point.y;
        }
        return f8447a;
    }
}
