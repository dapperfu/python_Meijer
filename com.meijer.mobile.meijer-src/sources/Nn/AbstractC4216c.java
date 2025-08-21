package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.meijer.mobile.widget.MPerksBarcodeView;

/* renamed from: Nn.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4216c extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f21820A;

    /* renamed from: B, reason: collision with root package name */
    public final MPerksBarcodeView f21821B;

    /* renamed from: C, reason: collision with root package name */
    public final View f21822C;

    /* renamed from: D, reason: collision with root package name */
    public final ConstraintLayout f21823D;

    /* renamed from: E, reason: collision with root package name */
    public final FrameLayout f21824E;

    /* renamed from: F, reason: collision with root package name */
    public final ImageView f21825F;

    /* renamed from: z, reason: collision with root package name */
    public final Button f21826z;

    @Deprecated
    public static AbstractC4216c N0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4216c) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100222b, null, false, obj);
    }

    protected AbstractC4216c(Object obj, View view, int i10, Button button, ImageView imageView, MPerksBarcodeView mPerksBarcodeView, View view2, ConstraintLayout constraintLayout, FrameLayout frameLayout, ImageView imageView2) {
        super(obj, view, i10);
        this.f21826z = button;
        this.f21820A = imageView;
        this.f21821B = mPerksBarcodeView;
        this.f21822C = view2;
        this.f21823D = constraintLayout;
        this.f21824E = frameLayout;
        this.f21825F = imageView2;
    }

    public static AbstractC4216c M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
