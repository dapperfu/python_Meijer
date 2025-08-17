package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.meijer.mobile.core.design.widget.checkoutprogressstepperview.ProgressIndicatorView;

/* loaded from: classes9.dex */
public abstract class v3 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final View f21047A;

    /* renamed from: B, reason: collision with root package name */
    public final ConstraintLayout f21048B;

    /* renamed from: z, reason: collision with root package name */
    public final ProgressIndicatorView f21049z;

    @Deprecated
    public static v3 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (v3) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99416r1, viewGroup, z10, obj);
    }

    protected v3(Object obj, View view, int i10, ProgressIndicatorView progressIndicatorView, View view2, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.f21049z = progressIndicatorView;
        this.f21047A = view2;
        this.f21048B = constraintLayout;
    }

    public static v3 K0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return M0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
