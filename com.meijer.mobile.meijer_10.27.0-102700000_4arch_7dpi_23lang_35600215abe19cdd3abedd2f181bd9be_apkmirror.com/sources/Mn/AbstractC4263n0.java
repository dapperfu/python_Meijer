package Mn;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;

/* renamed from: Mn.n0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4263n0 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f20805A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f20806B;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialCardView f20807z;

    @Deprecated
    public static AbstractC4263n0 M0(View view, Object obj) {
        return (AbstractC4263n0) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f99323G);
    }

    protected AbstractC4263n0(Object obj, View view, int i10, MaterialCardView materialCardView, ImageView imageView, TextView textView) {
        super(obj, view, i10);
        this.f20807z = materialCardView;
        this.f20805A = imageView;
        this.f20806B = textView;
    }

    public static AbstractC4263n0 K0(View view) {
        return M0(view, androidx.databinding.g.d());
    }
}
