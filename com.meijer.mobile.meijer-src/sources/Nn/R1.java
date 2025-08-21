package Nn;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes10.dex */
public abstract class R1 extends androidx.databinding.p {

    /* renamed from: z, reason: collision with root package name */
    public final ComposeView f21631z;

    @Deprecated
    public static R1 N0(View view, Object obj) {
        return (R1) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f100289x0);
    }

    protected R1(Object obj, View view, int i10, ComposeView composeView) {
        super(obj, view, i10);
        this.f21631z = composeView;
    }

    public static R1 M0(View view) {
        return N0(view, androidx.databinding.g.d());
    }
}
