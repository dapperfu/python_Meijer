package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

/* renamed from: Mn.z0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4310z0 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f21149A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageView f21150B;

    /* renamed from: C, reason: collision with root package name */
    public final MaterialButton f21151C;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f21152z;

    @Deprecated
    public static AbstractC4310z0 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (AbstractC4310z0) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99337N, viewGroup, z10, obj);
    }

    protected AbstractC4310z0(Object obj, View view, int i10, TextView textView, ImageView imageView, ImageView imageView2, MaterialButton materialButton) {
        super(obj, view, i10);
        this.f21152z = textView;
        this.f21149A = imageView;
        this.f21150B = imageView2;
        this.f21151C = materialButton;
    }

    public static AbstractC4310z0 K0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return M0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
