package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* renamed from: Nn.f0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4232f0 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final FrameLayout f21920A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageView f21921B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f21922C;

    /* renamed from: D, reason: collision with root package name */
    public final MaterialToolbar f21923D;

    /* renamed from: E, reason: collision with root package name */
    protected Vr.e f21924E;

    /* renamed from: z, reason: collision with root package name */
    public final AppBarLayout f21925z;

    public abstract void O0(Vr.e eVar);

    @Deprecated
    public static AbstractC4232f0 N0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4232f0) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100171C, null, false, obj);
    }

    protected AbstractC4232f0(Object obj, View view, int i10, AppBarLayout appBarLayout, FrameLayout frameLayout, ImageView imageView, TextView textView, MaterialToolbar materialToolbar) {
        super(obj, view, i10);
        this.f21925z = appBarLayout;
        this.f21920A = frameLayout;
        this.f21921B = imageView;
        this.f21922C = textView;
        this.f21923D = materialToolbar;
    }

    public static AbstractC4232f0 M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
