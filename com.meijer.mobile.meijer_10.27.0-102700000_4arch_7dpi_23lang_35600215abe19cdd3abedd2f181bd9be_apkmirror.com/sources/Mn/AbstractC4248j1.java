package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.meijer.mobile.core.design.widget.checkableimagebutton.CheckableImageButton;

/* renamed from: Mn.j1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4248j1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final View f20715A;

    /* renamed from: B, reason: collision with root package name */
    public final ConstraintLayout f20716B;

    /* renamed from: C, reason: collision with root package name */
    public final ImageButton f20717C;

    /* renamed from: D, reason: collision with root package name */
    public final Button f20718D;

    /* renamed from: E, reason: collision with root package name */
    public final CheckableImageButton f20719E;

    /* renamed from: F, reason: collision with root package name */
    public final View f20720F;

    /* renamed from: G, reason: collision with root package name */
    public final ImageButton f20721G;

    /* renamed from: H, reason: collision with root package name */
    public final EditText f20722H;

    /* renamed from: I, reason: collision with root package name */
    public final EditText f20723I;

    /* renamed from: J, reason: collision with root package name */
    public final TextView f20724J;

    /* renamed from: K, reason: collision with root package name */
    public final EditText f20725K;

    /* renamed from: L, reason: collision with root package name */
    public final TextView f20726L;

    /* renamed from: z, reason: collision with root package name */
    public final Barrier f20727z;

    @Deprecated
    public static AbstractC4248j1 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (AbstractC4248j1) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99379f0, viewGroup, z10, obj);
    }

    protected AbstractC4248j1(Object obj, View view, int i10, Barrier barrier, View view2, ConstraintLayout constraintLayout, ImageButton imageButton, Button button, CheckableImageButton checkableImageButton, View view3, ImageButton imageButton2, EditText editText, EditText editText2, TextView textView, EditText editText3, TextView textView2) {
        super(obj, view, i10);
        this.f20727z = barrier;
        this.f20715A = view2;
        this.f20716B = constraintLayout;
        this.f20717C = imageButton;
        this.f20718D = button;
        this.f20719E = checkableImageButton;
        this.f20720F = view3;
        this.f20721G = imageButton2;
        this.f20722H = editText;
        this.f20723I = editText2;
        this.f20724J = textView;
        this.f20725K = editText3;
        this.f20726L = textView2;
    }

    public static AbstractC4248j1 K0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return M0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
