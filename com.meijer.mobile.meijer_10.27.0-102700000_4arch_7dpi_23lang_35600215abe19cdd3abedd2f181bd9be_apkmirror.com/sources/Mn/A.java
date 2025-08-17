package Mn;

import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes9.dex */
public abstract class A extends androidx.databinding.p {

    /* renamed from: z, reason: collision with root package name */
    public final ComposeView f19878z;

    @Deprecated
    public static A M0(LayoutInflater layoutInflater, Object obj) {
        return (A) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99402n, null, false, obj);
    }

    protected A(Object obj, View view, int i10, ComposeView composeView) {
        super(obj, view, i10);
        this.f19878z = composeView;
    }

    public static A K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
