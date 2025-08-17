package Rr;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.p;

/* loaded from: classes11.dex */
public abstract class c extends p {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f32968A;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f32969z;

    @Deprecated
    public static c M0(View view, Object obj) {
        return (c) p.U(obj, view, Nr.e.f22677b);
    }

    protected c(Object obj, View view, int i10, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f32969z = textView;
        this.f32968A = textView2;
    }

    public static c K0(View view) {
        return M0(view, androidx.databinding.g.d());
    }
}
