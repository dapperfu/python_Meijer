package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/* renamed from: Nn.d1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4223d1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f21847A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f21848B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f21849C;

    /* renamed from: D, reason: collision with root package name */
    public final Button f21850D;

    /* renamed from: E, reason: collision with root package name */
    public final Button f21851E;

    /* renamed from: F, reason: collision with root package name */
    public final TextView f21852F;

    /* renamed from: G, reason: collision with root package name */
    protected En.r f21853G;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f21854z;

    public abstract void O0(En.r rVar);

    @Deprecated
    public static AbstractC4223d1 N0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4223d1) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100226c0, null, false, obj);
    }

    protected AbstractC4223d1(Object obj, View view, int i10, TextView textView, TextView textView2, TextView textView3, TextView textView4, Button button, Button button2, TextView textView5) {
        super(obj, view, i10);
        this.f21854z = textView;
        this.f21847A = textView2;
        this.f21848B = textView3;
        this.f21849C = textView4;
        this.f21850D = button;
        this.f21851E = button2;
        this.f21852F = textView5;
    }

    public static AbstractC4223d1 M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
