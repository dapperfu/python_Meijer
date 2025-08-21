package fsimpl;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: fsimpl.j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14237j extends Animation {

    /* renamed from: a, reason: collision with root package name */
    static Transformation f133603a = new Transformation();

    public static float a(Animation animation) {
        animation.applyTransformation(1.0f, f133603a);
        return f133603a.getAlpha();
    }
}
