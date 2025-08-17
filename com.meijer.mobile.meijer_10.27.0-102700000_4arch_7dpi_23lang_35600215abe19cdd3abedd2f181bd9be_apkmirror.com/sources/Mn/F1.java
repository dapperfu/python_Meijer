package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public abstract class F1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final FrameLayout f20010A;

    /* renamed from: B, reason: collision with root package name */
    public final RecyclerView f20011B;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f20012z;

    @Deprecated
    public static F1 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (F1) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99415r0, viewGroup, z10, obj);
    }

    protected F1(Object obj, View view, int i10, TextView textView, FrameLayout frameLayout, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.f20012z = textView;
        this.f20010A = frameLayout;
        this.f20011B = recyclerView;
    }

    public static F1 K0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return M0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
