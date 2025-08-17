package Mn;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes9.dex */
public abstract class R1 extends androidx.databinding.p {

    /* renamed from: z, reason: collision with root package name */
    public final ComposeView f20299z;

    @Deprecated
    public static R1 M0(View view, Object obj) {
        return (R1) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f99433x0);
    }

    protected R1(Object obj, View view, int i10, ComposeView composeView) {
        super(obj, view, i10);
        this.f20299z = composeView;
    }

    public static R1 K0(View view) {
        return M0(view, androidx.databinding.g.d());
    }
}
