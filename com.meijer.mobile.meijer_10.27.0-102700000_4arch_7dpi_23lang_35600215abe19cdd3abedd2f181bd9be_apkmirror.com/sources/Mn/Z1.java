package Mn;

import android.view.View;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* loaded from: classes9.dex */
public abstract class Z1 extends androidx.databinding.p {

    /* renamed from: z, reason: collision with root package name */
    public final ProgressView f20435z;

    @Deprecated
    public static Z1 M0(View view, Object obj) {
        return (Z1) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f99316C0);
    }

    protected Z1(Object obj, View view, int i10, ProgressView progressView) {
        super(obj, view, i10);
        this.f20435z = progressView;
    }

    public static Z1 K0(View view) {
        return M0(view, androidx.databinding.g.d());
    }
}
