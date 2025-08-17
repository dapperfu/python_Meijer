package Nj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes7.dex */
public abstract class q extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f22159A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageView f22160B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f22161C;

    /* renamed from: D, reason: collision with root package name */
    public final TextView f22162D;

    /* renamed from: z, reason: collision with root package name */
    public final ConstraintLayout f22163z;

    @Deprecated
    public static q M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (q) androidx.databinding.p.k0(layoutInflater, Bj.m.f2948r, viewGroup, z10, obj);
    }

    protected q(Object obj, View view, int i10, ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.f22163z = constraintLayout;
        this.f22159A = textView;
        this.f22160B = imageView;
        this.f22161C = textView2;
        this.f22162D = textView3;
    }

    public static q K0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return M0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
