package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

/* loaded from: classes.dex */
public class d {

    private static class a extends d {

        /* renamed from: a, reason: collision with root package name */
        private final ActivityOptions f53890a;

        @Override // androidx.core.app.d
        public Bundle e() {
            return this.f53890a.toBundle();
        }

        a(ActivityOptions activityOptions) {
            this.f53890a = activityOptions;
        }
    }

    public Bundle e() {
        throw null;
    }

    public static d a() {
        return new a(ActivityOptions.makeBasic());
    }

    public static d b(Context context, int i10, int i11) {
        return new a(ActivityOptions.makeCustomAnimation(context, i10, i11));
    }

    public static d c(Activity activity, View view, String str) {
        return new a(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
    }

    public static d d(Activity activity, o2.d<View, String>... dVarArr) {
        Pair[] pairArr;
        if (dVarArr != null) {
            pairArr = new Pair[dVarArr.length];
            for (int i10 = 0; i10 < dVarArr.length; i10++) {
                o2.d<View, String> dVar = dVarArr[i10];
                pairArr[i10] = Pair.create(dVar.f153583a, dVar.f153584b);
            }
        } else {
            pairArr = null;
        }
        return new a(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    protected d() {
    }
}
