package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* renamed from: Mn.f0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4227f0 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final FrameLayout f20588A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageView f20589B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f20590C;

    /* renamed from: D, reason: collision with root package name */
    public final MaterialToolbar f20591D;

    /* renamed from: E, reason: collision with root package name */
    protected Vr.e f20592E;

    /* renamed from: z, reason: collision with root package name */
    public final AppBarLayout f20593z;

    public abstract void O0(Vr.e eVar);

    @Deprecated
    public static AbstractC4227f0 M0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4227f0) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99315C, null, false, obj);
    }

    protected AbstractC4227f0(Object obj, View view, int i10, AppBarLayout appBarLayout, FrameLayout frameLayout, ImageView imageView, TextView textView, MaterialToolbar materialToolbar) {
        super(obj, view, i10);
        this.f20593z = appBarLayout;
        this.f20588A = frameLayout;
        this.f20589B = imageView;
        this.f20590C = textView;
        this.f20591D = materialToolbar;
    }

    public static AbstractC4227f0 K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
