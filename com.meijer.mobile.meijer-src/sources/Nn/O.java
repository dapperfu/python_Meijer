package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;

/* loaded from: classes10.dex */
public abstract class O extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final View f21570A;

    /* renamed from: B, reason: collision with root package name */
    public final RelativeLayout f21571B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f21572C;

    /* renamed from: D, reason: collision with root package name */
    public final LinearLayout f21573D;

    /* renamed from: E, reason: collision with root package name */
    public final Button f21574E;

    /* renamed from: F, reason: collision with root package name */
    public final TextView f21575F;

    /* renamed from: G, reason: collision with root package name */
    public final Button f21576G;

    /* renamed from: H, reason: collision with root package name */
    public final TextView f21577H;

    /* renamed from: I, reason: collision with root package name */
    public final Button f21578I;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialToolbar f21579z;

    @Deprecated
    public static O N0(LayoutInflater layoutInflater, Object obj) {
        return (O) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100279u, null, false, obj);
    }

    protected O(Object obj, View view, int i10, MaterialToolbar materialToolbar, View view2, RelativeLayout relativeLayout, TextView textView, LinearLayout linearLayout, Button button, TextView textView2, Button button2, TextView textView3, Button button3) {
        super(obj, view, i10);
        this.f21579z = materialToolbar;
        this.f21570A = view2;
        this.f21571B = relativeLayout;
        this.f21572C = textView;
        this.f21573D = linearLayout;
        this.f21574E = button;
        this.f21575F = textView2;
        this.f21576G = button2;
        this.f21577H = textView3;
        this.f21578I = button3;
    }

    public static O M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
