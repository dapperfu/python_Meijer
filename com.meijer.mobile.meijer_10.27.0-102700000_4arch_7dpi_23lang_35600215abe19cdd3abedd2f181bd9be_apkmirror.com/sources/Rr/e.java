package Rr;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* loaded from: classes11.dex */
public abstract class e extends p {

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f32974A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f32975B;

    /* renamed from: C, reason: collision with root package name */
    protected Vr.e f32976C;

    /* renamed from: z, reason: collision with root package name */
    public final ConstraintLayout f32977z;

    public abstract void O0(Vr.e eVar);

    @Deprecated
    public static e M0(View view, Object obj) {
        return (e) p.U(obj, view, Nr.e.f22678c);
    }

    protected e(Object obj, View view, int i10, ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        super(obj, view, i10);
        this.f32977z = constraintLayout;
        this.f32974A = imageView;
        this.f32975B = textView;
    }

    public static e K0(View view) {
        return M0(view, androidx.databinding.g.d());
    }
}
