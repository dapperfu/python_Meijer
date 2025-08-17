package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;

/* loaded from: classes9.dex */
public abstract class O extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final View f20238A;

    /* renamed from: B, reason: collision with root package name */
    public final RelativeLayout f20239B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f20240C;

    /* renamed from: D, reason: collision with root package name */
    public final LinearLayout f20241D;

    /* renamed from: E, reason: collision with root package name */
    public final Button f20242E;

    /* renamed from: F, reason: collision with root package name */
    public final TextView f20243F;

    /* renamed from: G, reason: collision with root package name */
    public final Button f20244G;

    /* renamed from: H, reason: collision with root package name */
    public final TextView f20245H;

    /* renamed from: I, reason: collision with root package name */
    public final Button f20246I;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialToolbar f20247z;

    @Deprecated
    public static O M0(LayoutInflater layoutInflater, Object obj) {
        return (O) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99423u, null, false, obj);
    }

    protected O(Object obj, View view, int i10, MaterialToolbar materialToolbar, View view2, RelativeLayout relativeLayout, TextView textView, LinearLayout linearLayout, Button button, TextView textView2, Button button2, TextView textView3, Button button3) {
        super(obj, view, i10);
        this.f20247z = materialToolbar;
        this.f20238A = view2;
        this.f20239B = relativeLayout;
        this.f20240C = textView;
        this.f20241D = linearLayout;
        this.f20242E = button;
        this.f20243F = textView2;
        this.f20244G = button2;
        this.f20245H = textView3;
        this.f20246I = button3;
    }

    public static O K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
