package Sa;

import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;

/* loaded from: classes4.dex */
public class e extends d {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f34470a = new Rect();

    public int a(float f10) {
        Context contextA = ((b) c.c(b.class)).a();
        if (contextA == null) {
            return -1;
        }
        return (int) TypedValue.applyDimension(1, f10, contextA.getResources().getDisplayMetrics());
    }
}
