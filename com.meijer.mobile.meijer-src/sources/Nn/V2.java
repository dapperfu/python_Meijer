package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

/* loaded from: classes10.dex */
public abstract class V2 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ImageButton f21708A;

    /* renamed from: z, reason: collision with root package name */
    public final RelativeLayout f21709z;

    @Deprecated
    public static V2 N0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (V2) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100233e1, viewGroup, z10, obj);
    }

    protected V2(Object obj, View view, int i10, RelativeLayout relativeLayout, ImageButton imageButton) {
        super(obj, view, i10);
        this.f21709z = relativeLayout;
        this.f21708A = imageButton;
    }

    public static V2 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return N0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
