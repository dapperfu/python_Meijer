package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes4.dex */
public class d {
    public static Animator a(Context context, int i10) throws Resources.NotFoundException {
        return AnimatorInflater.loadAnimator(context, i10);
    }
}
