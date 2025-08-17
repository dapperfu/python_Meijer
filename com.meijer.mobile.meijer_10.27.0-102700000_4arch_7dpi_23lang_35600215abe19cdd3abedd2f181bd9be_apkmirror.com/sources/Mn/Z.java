package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* loaded from: classes9.dex */
public abstract class Z extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ConstraintLayout f20418A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f20419B;

    /* renamed from: C, reason: collision with root package name */
    public final MaterialToolbar f20420C;

    /* renamed from: D, reason: collision with root package name */
    public final AppBarLayout f20421D;

    /* renamed from: E, reason: collision with root package name */
    public final DrawerLayout f20422E;

    /* renamed from: F, reason: collision with root package name */
    public final ProgressView f20423F;

    /* renamed from: G, reason: collision with root package name */
    public final Group f20424G;

    /* renamed from: H, reason: collision with root package name */
    public final View f20425H;

    /* renamed from: I, reason: collision with root package name */
    public final Button f20426I;

    /* renamed from: J, reason: collision with root package name */
    public final ConstraintLayout f20427J;

    /* renamed from: K, reason: collision with root package name */
    public final ImageView f20428K;

    /* renamed from: L, reason: collision with root package name */
    public final LinearLayout f20429L;

    /* renamed from: M, reason: collision with root package name */
    public final FrameLayout f20430M;

    /* renamed from: z, reason: collision with root package name */
    public final EditText f20431z;

    @Deprecated
    public static Z M0(LayoutInflater layoutInflater, Object obj) {
        return (Z) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99437z, null, false, obj);
    }

    protected Z(Object obj, View view, int i10, EditText editText, ConstraintLayout constraintLayout, TextView textView, MaterialToolbar materialToolbar, AppBarLayout appBarLayout, DrawerLayout drawerLayout, ProgressView progressView, Group group, View view2, Button button, ConstraintLayout constraintLayout2, ImageView imageView, LinearLayout linearLayout, FrameLayout frameLayout) {
        super(obj, view, i10);
        this.f20431z = editText;
        this.f20418A = constraintLayout;
        this.f20419B = textView;
        this.f20420C = materialToolbar;
        this.f20421D = appBarLayout;
        this.f20422E = drawerLayout;
        this.f20423F = progressView;
        this.f20424G = group;
        this.f20425H = view2;
        this.f20426I = button;
        this.f20427J = constraintLayout2;
        this.f20428K = imageView;
        this.f20429L = linearLayout;
        this.f20430M = frameLayout;
    }

    public static Z K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
