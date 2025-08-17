package Rr;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.p;

/* loaded from: classes11.dex */
public abstract class g extends p {

    /* renamed from: z, reason: collision with root package name */
    public final AppCompatImageView f32981z;

    @Deprecated
    public static g M0(View view, Object obj) {
        return (g) p.U(obj, view, Nr.e.f22679d);
    }

    protected g(Object obj, View view, int i10, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.f32981z = appCompatImageView;
    }

    public static g K0(View view) {
        return M0(view, androidx.databinding.g.d());
    }
}
