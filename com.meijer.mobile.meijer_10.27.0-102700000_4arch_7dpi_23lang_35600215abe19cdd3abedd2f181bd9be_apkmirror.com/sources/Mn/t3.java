package Mn;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes9.dex */
public abstract class t3 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ComposeView f20990A;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialCardView f20991z;

    @Deprecated
    public static t3 M0(View view, Object obj) {
        return (t3) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f99413q1);
    }

    protected t3(Object obj, View view, int i10, MaterialCardView materialCardView, ComposeView composeView) {
        super(obj, view, i10);
        this.f20991z = materialCardView;
        this.f20990A = composeView;
    }

    public static t3 K0(View view) {
        return M0(view, androidx.databinding.g.d());
    }
}
