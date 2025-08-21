package Nn;

import android.view.View;
import com.google.android.material.textview.MaterialTextView;

/* renamed from: Nn.b3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4215b3 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final MaterialTextView f21818A;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialTextView f21819z;

    @Deprecated
    public static AbstractC4215b3 N0(View view, Object obj) {
        return (AbstractC4215b3) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f100242h1);
    }

    protected AbstractC4215b3(Object obj, View view, int i10, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        super(obj, view, i10);
        this.f21819z = materialTextView;
        this.f21818A = materialTextView2;
    }

    public static AbstractC4215b3 M0(View view) {
        return N0(view, androidx.databinding.g.d());
    }
}
