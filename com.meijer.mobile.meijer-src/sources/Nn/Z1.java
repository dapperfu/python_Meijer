package Nn;

import android.view.View;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* loaded from: classes10.dex */
public abstract class Z1 extends androidx.databinding.p {

    /* renamed from: z, reason: collision with root package name */
    public final ProgressView f21767z;

    @Deprecated
    public static Z1 N0(View view, Object obj) {
        return (Z1) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f100172C0);
    }

    protected Z1(Object obj, View view, int i10, ProgressView progressView) {
        super(obj, view, i10);
        this.f21767z = progressView;
    }

    public static Z1 M0(View view) {
        return N0(view, androidx.databinding.g.d());
    }
}
