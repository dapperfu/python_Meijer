package hd;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;

/* renamed from: hd.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14406g {

    /* renamed from: a, reason: collision with root package name */
    private final Object f134640a;

    public final Activity a() {
        return (Activity) this.f134640a;
    }

    public final FragmentActivity b() {
        return (FragmentActivity) this.f134640a;
    }

    public final boolean c() {
        return this.f134640a instanceof Activity;
    }

    public final boolean d() {
        return this.f134640a instanceof FragmentActivity;
    }

    public C14406g(Activity activity) {
        com.google.android.gms.common.internal.r.m(activity, "Activity must not be null");
        this.f134640a = activity;
    }
}
