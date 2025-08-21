package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes10.dex */
public abstract class F1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final FrameLayout f21342A;

    /* renamed from: B, reason: collision with root package name */
    public final RecyclerView f21343B;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f21344z;

    @Deprecated
    public static F1 N0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (F1) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100271r0, viewGroup, z10, obj);
    }

    protected F1(Object obj, View view, int i10, TextView textView, FrameLayout frameLayout, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.f21344z = textView;
        this.f21342A = frameLayout;
        this.f21343B = recyclerView;
    }

    public static F1 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return N0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
