package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* renamed from: Mn.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4201a extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final LinearLayout f20456A;

    /* renamed from: B, reason: collision with root package name */
    public final AbstractC4255l0 f20457B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f20458C;

    /* renamed from: D, reason: collision with root package name */
    public final RecyclerView f20459D;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialButton f20460z;

    @Deprecated
    public static AbstractC4201a M0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4201a) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99363a, null, false, obj);
    }

    protected AbstractC4201a(Object obj, View view, int i10, MaterialButton materialButton, LinearLayout linearLayout, AbstractC4255l0 abstractC4255l0, TextView textView, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.f20460z = materialButton;
        this.f20456A = linearLayout;
        this.f20457B = abstractC4255l0;
        this.f20458C = textView;
        this.f20459D = recyclerView;
    }

    public static AbstractC4201a K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
