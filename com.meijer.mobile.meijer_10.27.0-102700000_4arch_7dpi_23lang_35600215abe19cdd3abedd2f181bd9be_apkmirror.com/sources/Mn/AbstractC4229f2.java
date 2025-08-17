package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: Mn.f2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4229f2 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f20609A;

    /* renamed from: B, reason: collision with root package name */
    public final ConstraintLayout f20610B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f20611C;

    /* renamed from: D, reason: collision with root package name */
    public final TextView f20612D;

    /* renamed from: E, reason: collision with root package name */
    public final TextView f20613E;

    /* renamed from: F, reason: collision with root package name */
    public final TextView f20614F;

    /* renamed from: G, reason: collision with root package name */
    public final TextView f20615G;

    /* renamed from: z, reason: collision with root package name */
    public final CardView f20616z;

    @Deprecated
    public static AbstractC4229f2 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (AbstractC4229f2) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99326H0, viewGroup, z10, obj);
    }

    protected AbstractC4229f2(Object obj, View view, int i10, CardView cardView, TextView textView, ConstraintLayout constraintLayout, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i10);
        this.f20616z = cardView;
        this.f20609A = textView;
        this.f20610B = constraintLayout;
        this.f20611C = textView2;
        this.f20612D = textView3;
        this.f20613E = textView4;
        this.f20614F = textView5;
        this.f20615G = textView6;
    }

    public static AbstractC4229f2 K0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return M0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
