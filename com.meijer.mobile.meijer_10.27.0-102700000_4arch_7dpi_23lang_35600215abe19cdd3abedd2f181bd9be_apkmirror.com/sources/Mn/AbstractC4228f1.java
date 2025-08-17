package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textview.MaterialTextView;

/* renamed from: Mn.f1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4228f1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final Barrier f20594A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageButton f20595B;

    /* renamed from: C, reason: collision with root package name */
    public final View f20596C;

    /* renamed from: D, reason: collision with root package name */
    public final View f20597D;

    /* renamed from: E, reason: collision with root package name */
    public final MaterialTextView f20598E;

    /* renamed from: F, reason: collision with root package name */
    public final ImageView f20599F;

    /* renamed from: G, reason: collision with root package name */
    public final MaterialTextView f20600G;

    /* renamed from: H, reason: collision with root package name */
    public final MaterialTextView f20601H;

    /* renamed from: I, reason: collision with root package name */
    public final MaterialTextView f20602I;

    /* renamed from: J, reason: collision with root package name */
    public final MaterialTextView f20603J;

    /* renamed from: K, reason: collision with root package name */
    public final ConstraintLayout f20604K;

    /* renamed from: L, reason: collision with root package name */
    public final RecyclerView f20605L;

    /* renamed from: M, reason: collision with root package name */
    public final MaterialTextView f20606M;

    /* renamed from: N, reason: collision with root package name */
    public final MaterialTextView f20607N;

    /* renamed from: z, reason: collision with root package name */
    public final Barrier f20608z;

    @Deprecated
    public static AbstractC4228f1 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (AbstractC4228f1) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99373d0, viewGroup, z10, obj);
    }

    protected AbstractC4228f1(Object obj, View view, int i10, Barrier barrier, Barrier barrier2, ImageButton imageButton, View view2, View view3, MaterialTextView materialTextView, ImageView imageView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5, ConstraintLayout constraintLayout, RecyclerView recyclerView, MaterialTextView materialTextView6, MaterialTextView materialTextView7) {
        super(obj, view, i10);
        this.f20608z = barrier;
        this.f20594A = barrier2;
        this.f20595B = imageButton;
        this.f20596C = view2;
        this.f20597D = view3;
        this.f20598E = materialTextView;
        this.f20599F = imageView;
        this.f20600G = materialTextView2;
        this.f20601H = materialTextView3;
        this.f20602I = materialTextView4;
        this.f20603J = materialTextView5;
        this.f20604K = constraintLayout;
        this.f20605L = recyclerView;
        this.f20606M = materialTextView6;
        this.f20607N = materialTextView7;
    }

    public static AbstractC4228f1 K0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return M0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
