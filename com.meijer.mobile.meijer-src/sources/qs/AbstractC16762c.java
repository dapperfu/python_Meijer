package qs;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.g;
import androidx.databinding.p;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;
import ps.InterfaceC16513Q;
import ps.h0;

/* renamed from: qs.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC16762c extends p {

    /* renamed from: A, reason: collision with root package name */
    public final Button f158966A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageView f158967B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f158968C;

    /* renamed from: D, reason: collision with root package name */
    public final View f158969D;

    /* renamed from: E, reason: collision with root package name */
    public final Button f158970E;

    /* renamed from: F, reason: collision with root package name */
    public final FullWordEllipsisTextView f158971F;

    /* renamed from: G, reason: collision with root package name */
    public final ConstraintLayout f158972G;

    /* renamed from: H, reason: collision with root package name */
    public final Group f158973H;

    /* renamed from: I, reason: collision with root package name */
    public final ImageView f158974I;

    /* renamed from: J, reason: collision with root package name */
    protected com.meijer.mobile.ui.navigation.a f158975J;

    /* renamed from: K, reason: collision with root package name */
    protected InterfaceC16513Q f158976K;

    /* renamed from: z, reason: collision with root package name */
    public final ImageButton f158977z;

    public abstract void O0(com.meijer.mobile.ui.navigation.a aVar);

    public abstract void R0(InterfaceC16513Q interfaceC16513Q);

    @Deprecated
    public static AbstractC16762c N0(View view, Object obj) {
        return (AbstractC16762c) p.U(obj, view, h0.f157318b);
    }

    protected AbstractC16762c(Object obj, View view, int i10, ImageButton imageButton, Button button, ImageView imageView, TextView textView, View view2, Button button2, FullWordEllipsisTextView fullWordEllipsisTextView, ConstraintLayout constraintLayout, Group group, ImageView imageView2) {
        super(obj, view, i10);
        this.f158977z = imageButton;
        this.f158966A = button;
        this.f158967B = imageView;
        this.f158968C = textView;
        this.f158969D = view2;
        this.f158970E = button2;
        this.f158971F = fullWordEllipsisTextView;
        this.f158972G = constraintLayout;
        this.f158973H = group;
        this.f158974I = imageView2;
    }

    public static AbstractC16762c M0(View view) {
        return N0(view, g.d());
    }
}
