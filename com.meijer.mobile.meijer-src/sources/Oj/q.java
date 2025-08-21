package Oj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes8.dex */
public abstract class q extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f24404A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageView f24405B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f24406C;

    /* renamed from: D, reason: collision with root package name */
    public final TextView f24407D;

    /* renamed from: z, reason: collision with root package name */
    public final ConstraintLayout f24408z;

    @Deprecated
    public static q N0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (q) androidx.databinding.p.i0(layoutInflater, Cj.m.f4993r, viewGroup, z10, obj);
    }

    protected q(Object obj, View view, int i10, ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.f24408z = constraintLayout;
        this.f24404A = textView;
        this.f24405B = imageView;
        this.f24406C = textView2;
        this.f24407D = textView3;
    }

    public static q M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return N0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
