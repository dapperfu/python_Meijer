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
import ps.InterfaceC16387Q;
import ps.h0;

/* renamed from: qs.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC16603c extends p {

    /* renamed from: A, reason: collision with root package name */
    public final Button f157529A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageView f157530B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f157531C;

    /* renamed from: D, reason: collision with root package name */
    public final View f157532D;

    /* renamed from: E, reason: collision with root package name */
    public final Button f157533E;

    /* renamed from: F, reason: collision with root package name */
    public final FullWordEllipsisTextView f157534F;

    /* renamed from: G, reason: collision with root package name */
    public final ConstraintLayout f157535G;

    /* renamed from: H, reason: collision with root package name */
    public final Group f157536H;

    /* renamed from: I, reason: collision with root package name */
    public final ImageView f157537I;

    /* renamed from: J, reason: collision with root package name */
    protected com.meijer.mobile.ui.navigation.a f157538J;

    /* renamed from: K, reason: collision with root package name */
    protected InterfaceC16387Q f157539K;

    /* renamed from: z, reason: collision with root package name */
    public final ImageButton f157540z;

    public abstract void O0(com.meijer.mobile.ui.navigation.a aVar);

    public abstract void P0(InterfaceC16387Q interfaceC16387Q);

    @Deprecated
    public static AbstractC16603c M0(View view, Object obj) {
        return (AbstractC16603c) p.U(obj, view, h0.f156545b);
    }

    protected AbstractC16603c(Object obj, View view, int i10, ImageButton imageButton, Button button, ImageView imageView, TextView textView, View view2, Button button2, FullWordEllipsisTextView fullWordEllipsisTextView, ConstraintLayout constraintLayout, Group group, ImageView imageView2) {
        super(obj, view, i10);
        this.f157540z = imageButton;
        this.f157529A = button;
        this.f157530B = imageView;
        this.f157531C = textView;
        this.f157532D = view2;
        this.f157533E = button2;
        this.f157534F = fullWordEllipsisTextView;
        this.f157535G = constraintLayout;
        this.f157536H = group;
        this.f157537I = imageView2;
    }

    public static AbstractC16603c K0(View view) {
        return M0(view, g.d());
    }
}
