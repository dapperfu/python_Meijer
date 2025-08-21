package Rr;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* loaded from: classes12.dex */
public abstract class e extends p {

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f34011A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f34012B;

    /* renamed from: C, reason: collision with root package name */
    protected Vr.e f34013C;

    /* renamed from: z, reason: collision with root package name */
    public final ConstraintLayout f34014z;

    public abstract void O0(Vr.e eVar);

    @Deprecated
    public static e N0(View view, Object obj) {
        return (e) p.U(obj, view, Nr.e.f22634c);
    }

    protected e(Object obj, View view, int i10, ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        super(obj, view, i10);
        this.f34014z = constraintLayout;
        this.f34011A = imageView;
        this.f34012B = textView;
    }

    public static e M0(View view) {
        return N0(view, androidx.databinding.g.d());
    }
}
