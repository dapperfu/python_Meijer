package Rr;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.p;

/* loaded from: classes12.dex */
public abstract class c extends p {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f34005A;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f34006z;

    @Deprecated
    public static c N0(View view, Object obj) {
        return (c) p.U(obj, view, Nr.e.f22633b);
    }

    protected c(Object obj, View view, int i10, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f34006z = textView;
        this.f34005A = textView2;
    }

    public static c M0(View view) {
        return N0(view, androidx.databinding.g.d());
    }
}
