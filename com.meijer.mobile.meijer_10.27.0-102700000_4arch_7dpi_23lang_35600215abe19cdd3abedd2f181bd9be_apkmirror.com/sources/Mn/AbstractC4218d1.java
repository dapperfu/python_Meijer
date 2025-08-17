package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/* renamed from: Mn.d1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4218d1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f20515A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f20516B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f20517C;

    /* renamed from: D, reason: collision with root package name */
    public final Button f20518D;

    /* renamed from: E, reason: collision with root package name */
    public final Button f20519E;

    /* renamed from: F, reason: collision with root package name */
    public final TextView f20520F;

    /* renamed from: G, reason: collision with root package name */
    protected Dn.r f20521G;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f20522z;

    public abstract void O0(Dn.r rVar);

    @Deprecated
    public static AbstractC4218d1 M0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4218d1) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99370c0, null, false, obj);
    }

    protected AbstractC4218d1(Object obj, View view, int i10, TextView textView, TextView textView2, TextView textView3, TextView textView4, Button button, Button button2, TextView textView5) {
        super(obj, view, i10);
        this.f20522z = textView;
        this.f20515A = textView2;
        this.f20516B = textView3;
        this.f20517C = textView4;
        this.f20518D = button;
        this.f20519E = button2;
        this.f20520F = textView5;
    }

    public static AbstractC4218d1 K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
