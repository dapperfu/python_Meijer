package Nn;

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

/* loaded from: classes10.dex */
public abstract class Z extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ConstraintLayout f21750A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f21751B;

    /* renamed from: C, reason: collision with root package name */
    public final MaterialToolbar f21752C;

    /* renamed from: D, reason: collision with root package name */
    public final AppBarLayout f21753D;

    /* renamed from: E, reason: collision with root package name */
    public final DrawerLayout f21754E;

    /* renamed from: F, reason: collision with root package name */
    public final ProgressView f21755F;

    /* renamed from: G, reason: collision with root package name */
    public final Group f21756G;

    /* renamed from: H, reason: collision with root package name */
    public final View f21757H;

    /* renamed from: I, reason: collision with root package name */
    public final Button f21758I;

    /* renamed from: J, reason: collision with root package name */
    public final ConstraintLayout f21759J;

    /* renamed from: K, reason: collision with root package name */
    public final ImageView f21760K;

    /* renamed from: L, reason: collision with root package name */
    public final LinearLayout f21761L;

    /* renamed from: M, reason: collision with root package name */
    public final FrameLayout f21762M;

    /* renamed from: z, reason: collision with root package name */
    public final EditText f21763z;

    @Deprecated
    public static Z N0(LayoutInflater layoutInflater, Object obj) {
        return (Z) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100293z, null, false, obj);
    }

    protected Z(Object obj, View view, int i10, EditText editText, ConstraintLayout constraintLayout, TextView textView, MaterialToolbar materialToolbar, AppBarLayout appBarLayout, DrawerLayout drawerLayout, ProgressView progressView, Group group, View view2, Button button, ConstraintLayout constraintLayout2, ImageView imageView, LinearLayout linearLayout, FrameLayout frameLayout) {
        super(obj, view, i10);
        this.f21763z = editText;
        this.f21750A = constraintLayout;
        this.f21751B = textView;
        this.f21752C = materialToolbar;
        this.f21753D = appBarLayout;
        this.f21754E = drawerLayout;
        this.f21755F = progressView;
        this.f21756G = group;
        this.f21757H = view2;
        this.f21758I = button;
        this.f21759J = constraintLayout2;
        this.f21760K = imageView;
        this.f21761L = linearLayout;
        this.f21762M = frameLayout;
    }

    public static Z M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
