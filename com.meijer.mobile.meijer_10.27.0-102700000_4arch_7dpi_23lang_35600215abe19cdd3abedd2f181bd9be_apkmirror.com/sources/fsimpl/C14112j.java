package fsimpl;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: fsimpl.j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14112j extends Animation {

    /* renamed from: a, reason: collision with root package name */
    static Transformation f132353a = new Transformation();

    public static float a(Animation animation) {
        animation.applyTransformation(1.0f, f132353a);
        return f132353a.getAlpha();
    }
}
