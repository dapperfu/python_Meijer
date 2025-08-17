package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;

/* renamed from: Mn.l1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4256l1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final Button f20778A;

    /* renamed from: B, reason: collision with root package name */
    public final Group f20779B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f20780C;

    /* renamed from: D, reason: collision with root package name */
    public final ImageView f20781D;

    /* renamed from: z, reason: collision with root package name */
    public final Button f20782z;

    @Deprecated
    public static AbstractC4256l1 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (AbstractC4256l1) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99385h0, viewGroup, z10, obj);
    }

    protected AbstractC4256l1(Object obj, View view, int i10, Button button, Button button2, Group group, TextView textView, ImageView imageView) {
        super(obj, view, i10);
        this.f20782z = button;
        this.f20778A = button2;
        this.f20779B = group;
        this.f20780C = textView;
        this.f20781D = imageView;
    }

    public static AbstractC4256l1 K0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return M0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
