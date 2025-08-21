package Rr;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.p;

/* loaded from: classes12.dex */
public abstract class a extends p {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f33999A;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f34000z;

    @Deprecated
    public static a N0(View view, Object obj) {
        return (a) p.U(obj, view, Nr.e.f22632a);
    }

    protected a(Object obj, View view, int i10, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f34000z = textView;
        this.f33999A = textView2;
    }

    public static a M0(View view) {
        return N0(view, androidx.databinding.g.d());
    }
}
