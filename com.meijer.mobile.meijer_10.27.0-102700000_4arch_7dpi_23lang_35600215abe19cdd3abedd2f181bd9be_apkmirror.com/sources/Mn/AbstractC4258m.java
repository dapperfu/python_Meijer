package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.appbar.MaterialToolbar;

/* renamed from: Mn.m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4258m extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final FrameLayout f20786A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageView f20787B;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialToolbar f20788z;

    @Deprecated
    public static AbstractC4258m M0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4258m) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99381g, null, false, obj);
    }

    protected AbstractC4258m(Object obj, View view, int i10, MaterialToolbar materialToolbar, FrameLayout frameLayout, ImageView imageView) {
        super(obj, view, i10);
        this.f20788z = materialToolbar;
        this.f20786A = frameLayout;
        this.f20787B = imageView;
    }

    public static AbstractC4258m K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
