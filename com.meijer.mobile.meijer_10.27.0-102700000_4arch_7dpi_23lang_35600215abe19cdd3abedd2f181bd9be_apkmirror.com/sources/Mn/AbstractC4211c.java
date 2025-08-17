package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.meijer.mobile.widget.MPerksBarcodeView;

/* renamed from: Mn.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4211c extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f20488A;

    /* renamed from: B, reason: collision with root package name */
    public final MPerksBarcodeView f20489B;

    /* renamed from: C, reason: collision with root package name */
    public final View f20490C;

    /* renamed from: D, reason: collision with root package name */
    public final ConstraintLayout f20491D;

    /* renamed from: E, reason: collision with root package name */
    public final FrameLayout f20492E;

    /* renamed from: F, reason: collision with root package name */
    public final ImageView f20493F;

    /* renamed from: z, reason: collision with root package name */
    public final Button f20494z;

    @Deprecated
    public static AbstractC4211c M0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4211c) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99366b, null, false, obj);
    }

    protected AbstractC4211c(Object obj, View view, int i10, Button button, ImageView imageView, MPerksBarcodeView mPerksBarcodeView, View view2, ConstraintLayout constraintLayout, FrameLayout frameLayout, ImageView imageView2) {
        super(obj, view, i10);
        this.f20494z = button;
        this.f20488A = imageView;
        this.f20489B = mPerksBarcodeView;
        this.f20490C = view2;
        this.f20491D = constraintLayout;
        this.f20492E = frameLayout;
        this.f20493F = imageView2;
    }

    public static AbstractC4211c K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
