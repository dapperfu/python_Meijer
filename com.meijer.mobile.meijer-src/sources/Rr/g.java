package Rr;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.p;

/* loaded from: classes12.dex */
public abstract class g extends p {

    /* renamed from: z, reason: collision with root package name */
    public final AppCompatImageView f34018z;

    @Deprecated
    public static g N0(View view, Object obj) {
        return (g) p.U(obj, view, Nr.e.f22635d);
    }

    protected g(Object obj, View view, int i10, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.f34018z = appCompatImageView;
    }

    public static g M0(View view) {
        return N0(view, androidx.databinding.g.d());
    }
}
