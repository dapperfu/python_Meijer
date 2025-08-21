package Nn;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;

/* renamed from: Nn.n0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4268n0 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f22137A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f22138B;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialCardView f22139z;

    @Deprecated
    public static AbstractC4268n0 N0(View view, Object obj) {
        return (AbstractC4268n0) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f100179G);
    }

    protected AbstractC4268n0(Object obj, View view, int i10, MaterialCardView materialCardView, ImageView imageView, TextView textView) {
        super(obj, view, i10);
        this.f22139z = materialCardView;
        this.f22137A = imageView;
        this.f22138B = textView;
    }

    public static AbstractC4268n0 M0(View view) {
        return N0(view, androidx.databinding.g.d());
    }
}
