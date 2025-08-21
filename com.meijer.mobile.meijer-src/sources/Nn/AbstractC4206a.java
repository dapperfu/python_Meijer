package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* renamed from: Nn.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4206a extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final LinearLayout f21788A;

    /* renamed from: B, reason: collision with root package name */
    public final AbstractC4260l0 f21789B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f21790C;

    /* renamed from: D, reason: collision with root package name */
    public final RecyclerView f21791D;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialButton f21792z;

    @Deprecated
    public static AbstractC4206a N0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4206a) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100219a, null, false, obj);
    }

    protected AbstractC4206a(Object obj, View view, int i10, MaterialButton materialButton, LinearLayout linearLayout, AbstractC4260l0 abstractC4260l0, TextView textView, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.f21792z = materialButton;
        this.f21788A = linearLayout;
        this.f21789B = abstractC4260l0;
        this.f21790C = textView;
        this.f21791D = recyclerView;
    }

    public static AbstractC4206a M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
