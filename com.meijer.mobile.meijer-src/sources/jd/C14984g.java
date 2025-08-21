package jd;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;

/* renamed from: jd.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14984g {

    /* renamed from: a, reason: collision with root package name */
    private final Object f140329a;

    public final Activity a() {
        return (Activity) this.f140329a;
    }

    public final FragmentActivity b() {
        return (FragmentActivity) this.f140329a;
    }

    public final boolean c() {
        return this.f140329a instanceof Activity;
    }

    public final boolean d() {
        return this.f140329a instanceof FragmentActivity;
    }

    public C14984g(Activity activity) {
        com.google.android.gms.common.internal.r.m(activity, "Activity must not be null");
        this.f140329a = activity;
    }
}
