package Mn;

import android.view.View;
import com.google.android.material.textview.MaterialTextView;

/* renamed from: Mn.b3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4210b3 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final MaterialTextView f20486A;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialTextView f20487z;

    @Deprecated
    public static AbstractC4210b3 M0(View view, Object obj) {
        return (AbstractC4210b3) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f99386h1);
    }

    protected AbstractC4210b3(Object obj, View view, int i10, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        super(obj, view, i10);
        this.f20487z = materialTextView;
        this.f20486A = materialTextView2;
    }

    public static AbstractC4210b3 K0(View view) {
        return M0(view, androidx.databinding.g.d());
    }
}
