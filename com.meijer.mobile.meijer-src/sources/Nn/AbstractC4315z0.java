package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

/* renamed from: Nn.z0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4315z0 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f22481A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageView f22482B;

    /* renamed from: C, reason: collision with root package name */
    public final MaterialButton f22483C;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f22484z;

    @Deprecated
    public static AbstractC4315z0 N0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (AbstractC4315z0) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100193N, viewGroup, z10, obj);
    }

    protected AbstractC4315z0(Object obj, View view, int i10, TextView textView, ImageView imageView, ImageView imageView2, MaterialButton materialButton) {
        super(obj, view, i10);
        this.f22484z = textView;
        this.f22481A = imageView;
        this.f22482B = imageView2;
        this.f22483C = materialButton;
    }

    public static AbstractC4315z0 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return N0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
