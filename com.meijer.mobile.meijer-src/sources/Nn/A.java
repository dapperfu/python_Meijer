package Nn;

import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes10.dex */
public abstract class A extends androidx.databinding.p {

    /* renamed from: z, reason: collision with root package name */
    public final ComposeView f21210z;

    @Deprecated
    public static A N0(LayoutInflater layoutInflater, Object obj) {
        return (A) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100258n, null, false, obj);
    }

    protected A(Object obj, View view, int i10, ComposeView composeView) {
        super(obj, view, i10);
        this.f21210z = composeView;
    }

    public static A M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
