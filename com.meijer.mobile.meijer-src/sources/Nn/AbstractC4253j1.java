package Nn;

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

/* renamed from: Nn.j1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4253j1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final View f22047A;

    /* renamed from: B, reason: collision with root package name */
    public final ConstraintLayout f22048B;

    /* renamed from: C, reason: collision with root package name */
    public final ImageButton f22049C;

    /* renamed from: D, reason: collision with root package name */
    public final Button f22050D;

    /* renamed from: E, reason: collision with root package name */
    public final CheckableImageButton f22051E;

    /* renamed from: F, reason: collision with root package name */
    public final View f22052F;

    /* renamed from: G, reason: collision with root package name */
    public final ImageButton f22053G;

    /* renamed from: H, reason: collision with root package name */
    public final EditText f22054H;

    /* renamed from: I, reason: collision with root package name */
    public final EditText f22055I;

    /* renamed from: J, reason: collision with root package name */
    public final TextView f22056J;

    /* renamed from: K, reason: collision with root package name */
    public final EditText f22057K;

    /* renamed from: L, reason: collision with root package name */
    public final TextView f22058L;

    /* renamed from: z, reason: collision with root package name */
    public final Barrier f22059z;

    @Deprecated
    public static AbstractC4253j1 N0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (AbstractC4253j1) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100235f0, viewGroup, z10, obj);
    }

    protected AbstractC4253j1(Object obj, View view, int i10, Barrier barrier, View view2, ConstraintLayout constraintLayout, ImageButton imageButton, Button button, CheckableImageButton checkableImageButton, View view3, ImageButton imageButton2, EditText editText, EditText editText2, TextView textView, EditText editText3, TextView textView2) {
        super(obj, view, i10);
        this.f22059z = barrier;
        this.f22047A = view2;
        this.f22048B = constraintLayout;
        this.f22049C = imageButton;
        this.f22050D = button;
        this.f22051E = checkableImageButton;
        this.f22052F = view3;
        this.f22053G = imageButton2;
        this.f22054H = editText;
        this.f22055I = editText2;
        this.f22056J = textView;
        this.f22057K = editText3;
        this.f22058L = textView2;
    }

    public static AbstractC4253j1 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return N0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
