package Nn;

import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes10.dex */
public abstract class T1 extends androidx.databinding.p {

    /* renamed from: z, reason: collision with root package name */
    public final ComposeView f21669z;

    @Deprecated
    public static T1 N0(LayoutInflater layoutInflater, Object obj) {
        return (T1) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100292y0, null, false, obj);
    }

    protected T1(Object obj, View view, int i10, ComposeView composeView) {
        super(obj, view, i10);
        this.f21669z = composeView;
    }

    public static T1 M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
