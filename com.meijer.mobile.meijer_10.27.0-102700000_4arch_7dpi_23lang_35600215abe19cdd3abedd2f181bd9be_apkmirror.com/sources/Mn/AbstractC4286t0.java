package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.meijer.activity.home.legacy.viewmodel.NavBarItem;

/* renamed from: Mn.t0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4286t0 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ImageButton f20963A;

    /* renamed from: B, reason: collision with root package name */
    public final ComposeView f20964B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f20965C;

    /* renamed from: D, reason: collision with root package name */
    public final ConstraintLayout f20966D;

    /* renamed from: E, reason: collision with root package name */
    public final ImageView f20967E;

    /* renamed from: F, reason: collision with root package name */
    public final ImageView f20968F;

    /* renamed from: G, reason: collision with root package name */
    public final TextView f20969G;

    /* renamed from: H, reason: collision with root package name */
    public final ConstraintLayout f20970H;

    /* renamed from: I, reason: collision with root package name */
    public final ImageView f20971I;

    /* renamed from: J, reason: collision with root package name */
    public final ImageButton f20972J;

    /* renamed from: K, reason: collision with root package name */
    protected NavBarItem f20973K;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialToolbar f20974z;

    public abstract void O0(NavBarItem navBarItem);

    @Deprecated
    public static AbstractC4286t0 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (AbstractC4286t0) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99331K, viewGroup, z10, obj);
    }

    protected AbstractC4286t0(Object obj, View view, int i10, MaterialToolbar materialToolbar, ImageButton imageButton, ComposeView composeView, TextView textView, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView2, ConstraintLayout constraintLayout2, ImageView imageView3, ImageButton imageButton2) {
        super(obj, view, i10);
        this.f20974z = materialToolbar;
        this.f20963A = imageButton;
        this.f20964B = composeView;
        this.f20965C = textView;
        this.f20966D = constraintLayout;
        this.f20967E = imageView;
        this.f20968F = imageView2;
        this.f20969G = textView2;
        this.f20970H = constraintLayout2;
        this.f20971I = imageView3;
        this.f20972J = imageButton2;
    }

    public static AbstractC4286t0 K0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return M0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
