package Mn;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.textview.MaterialTextView;
import com.meijer.mobile.core.design.widget.calloutview.ListCardView;

/* loaded from: classes9.dex */
public abstract class F0 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final MaterialTextView f20001A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageView f20002B;

    /* renamed from: C, reason: collision with root package name */
    public final ImageView f20003C;

    /* renamed from: D, reason: collision with root package name */
    public final ImageView f20004D;

    /* renamed from: E, reason: collision with root package name */
    public final ListCardView f20005E;

    /* renamed from: F, reason: collision with root package name */
    public final TextView f20006F;

    /* renamed from: G, reason: collision with root package name */
    public final Guideline f20007G;

    /* renamed from: H, reason: collision with root package name */
    public final Guideline f20008H;

    /* renamed from: z, reason: collision with root package name */
    public final Barrier f20009z;

    protected F0(Object obj, View view, int i10, Barrier barrier, MaterialTextView materialTextView, ImageView imageView, ImageView imageView2, ImageView imageView3, ListCardView listCardView, TextView textView, Guideline guideline, Guideline guideline2) {
        super(obj, view, i10);
        this.f20009z = barrier;
        this.f20001A = materialTextView;
        this.f20002B = imageView;
        this.f20003C = imageView2;
        this.f20004D = imageView3;
        this.f20005E = listCardView;
        this.f20006F = textView;
        this.f20007G = guideline;
        this.f20008H = guideline2;
    }
}
