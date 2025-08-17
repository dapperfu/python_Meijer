package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

/* loaded from: classes9.dex */
public abstract class V2 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ImageButton f20376A;

    /* renamed from: z, reason: collision with root package name */
    public final RelativeLayout f20377z;

    @Deprecated
    public static V2 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (V2) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99377e1, viewGroup, z10, obj);
    }

    protected V2(Object obj, View view, int i10, RelativeLayout relativeLayout, ImageButton imageButton) {
        super(obj, view, i10);
        this.f20377z = relativeLayout;
        this.f20376A = imageButton;
    }

    public static V2 K0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return M0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
