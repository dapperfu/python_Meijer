package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;

/* renamed from: Nn.l1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4261l1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final Button f22110A;

    /* renamed from: B, reason: collision with root package name */
    public final Group f22111B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f22112C;

    /* renamed from: D, reason: collision with root package name */
    public final ImageView f22113D;

    /* renamed from: z, reason: collision with root package name */
    public final Button f22114z;

    @Deprecated
    public static AbstractC4261l1 N0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (AbstractC4261l1) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100241h0, viewGroup, z10, obj);
    }

    protected AbstractC4261l1(Object obj, View view, int i10, Button button, Button button2, Group group, TextView textView, ImageView imageView) {
        super(obj, view, i10);
        this.f22114z = button;
        this.f22110A = button2;
        this.f22111B = group;
        this.f22112C = textView;
        this.f22113D = imageView;
    }

    public static AbstractC4261l1 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return N0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
