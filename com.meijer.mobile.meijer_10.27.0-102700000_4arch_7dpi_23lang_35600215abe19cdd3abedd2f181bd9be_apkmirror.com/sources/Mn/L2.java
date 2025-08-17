package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes9.dex */
public abstract class L2 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f20186A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f20187B;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f20188z;

    @Deprecated
    public static L2 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (L2) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99362Z0, viewGroup, z10, obj);
    }

    protected L2(Object obj, View view, int i10, TextView textView, ImageView imageView, TextView textView2) {
        super(obj, view, i10);
        this.f20188z = textView;
        this.f20186A = imageView;
        this.f20187B = textView2;
    }

    public static L2 K0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return M0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
