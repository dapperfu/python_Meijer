package Nn;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes10.dex */
public abstract class t3 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ComposeView f22322A;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialCardView f22323z;

    @Deprecated
    public static t3 N0(View view, Object obj) {
        return (t3) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f100269q1);
    }

    protected t3(Object obj, View view, int i10, MaterialCardView materialCardView, ComposeView composeView) {
        super(obj, view, i10);
        this.f22323z = materialCardView;
        this.f22322A = composeView;
    }

    public static t3 M0(View view) {
        return N0(view, androidx.databinding.g.d());
    }
}
