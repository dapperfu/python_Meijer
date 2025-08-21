package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes10.dex */
public abstract class L2 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f21518A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f21519B;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f21520z;

    @Deprecated
    public static L2 N0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (L2) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100218Z0, viewGroup, z10, obj);
    }

    protected L2(Object obj, View view, int i10, TextView textView, ImageView imageView, TextView textView2) {
        super(obj, view, i10);
        this.f21520z = textView;
        this.f21518A = imageView;
        this.f21519B = textView2;
    }

    public static L2 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return N0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
