package Rr;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.p;

/* loaded from: classes11.dex */
public abstract class a extends p {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f32962A;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f32963z;

    @Deprecated
    public static a M0(View view, Object obj) {
        return (a) p.U(obj, view, Nr.e.f22676a);
    }

    protected a(Object obj, View view, int i10, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f32963z = textView;
        this.f32962A = textView2;
    }

    public static a K0(View view) {
        return M0(view, androidx.databinding.g.d());
    }
}
