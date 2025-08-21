package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: Nn.f2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4234f2 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f21941A;

    /* renamed from: B, reason: collision with root package name */
    public final ConstraintLayout f21942B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f21943C;

    /* renamed from: D, reason: collision with root package name */
    public final TextView f21944D;

    /* renamed from: E, reason: collision with root package name */
    public final TextView f21945E;

    /* renamed from: F, reason: collision with root package name */
    public final TextView f21946F;

    /* renamed from: G, reason: collision with root package name */
    public final TextView f21947G;

    /* renamed from: z, reason: collision with root package name */
    public final CardView f21948z;

    @Deprecated
    public static AbstractC4234f2 N0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (AbstractC4234f2) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100182H0, viewGroup, z10, obj);
    }

    protected AbstractC4234f2(Object obj, View view, int i10, CardView cardView, TextView textView, ConstraintLayout constraintLayout, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i10);
        this.f21948z = cardView;
        this.f21941A = textView;
        this.f21942B = constraintLayout;
        this.f21943C = textView2;
        this.f21944D = textView3;
        this.f21945E = textView4;
        this.f21946F = textView5;
        this.f21947G = textView6;
    }

    public static AbstractC4234f2 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return N0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
