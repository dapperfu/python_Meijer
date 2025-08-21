package Nn;

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

/* renamed from: Nn.t0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4291t0 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ImageButton f22295A;

    /* renamed from: B, reason: collision with root package name */
    public final ComposeView f22296B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f22297C;

    /* renamed from: D, reason: collision with root package name */
    public final ConstraintLayout f22298D;

    /* renamed from: E, reason: collision with root package name */
    public final ImageView f22299E;

    /* renamed from: F, reason: collision with root package name */
    public final ImageView f22300F;

    /* renamed from: G, reason: collision with root package name */
    public final TextView f22301G;

    /* renamed from: H, reason: collision with root package name */
    public final ConstraintLayout f22302H;

    /* renamed from: I, reason: collision with root package name */
    public final ImageView f22303I;

    /* renamed from: J, reason: collision with root package name */
    public final ImageButton f22304J;

    /* renamed from: K, reason: collision with root package name */
    protected NavBarItem f22305K;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialToolbar f22306z;

    public abstract void O0(NavBarItem navBarItem);

    @Deprecated
    public static AbstractC4291t0 N0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (AbstractC4291t0) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100187K, viewGroup, z10, obj);
    }

    protected AbstractC4291t0(Object obj, View view, int i10, MaterialToolbar materialToolbar, ImageButton imageButton, ComposeView composeView, TextView textView, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView2, ConstraintLayout constraintLayout2, ImageView imageView3, ImageButton imageButton2) {
        super(obj, view, i10);
        this.f22306z = materialToolbar;
        this.f22295A = imageButton;
        this.f22296B = composeView;
        this.f22297C = textView;
        this.f22298D = constraintLayout;
        this.f22299E = imageView;
        this.f22300F = imageView2;
        this.f22301G = textView2;
        this.f22302H = constraintLayout2;
        this.f22303I = imageView3;
        this.f22304J = imageButton2;
    }

    public static AbstractC4291t0 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return N0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
