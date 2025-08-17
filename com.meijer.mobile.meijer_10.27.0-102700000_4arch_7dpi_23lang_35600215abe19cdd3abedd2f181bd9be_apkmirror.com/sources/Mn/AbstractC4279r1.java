package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableRow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;

/* renamed from: Mn.r1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4279r1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final TableRow f20909A;

    /* renamed from: B, reason: collision with root package name */
    public final MaterialTextView f20910B;

    /* renamed from: C, reason: collision with root package name */
    public final ImageView f20911C;

    /* renamed from: D, reason: collision with root package name */
    public final TableRow f20912D;

    /* renamed from: E, reason: collision with root package name */
    public final MaterialTextView f20913E;

    /* renamed from: F, reason: collision with root package name */
    public final ConstraintLayout f20914F;

    /* renamed from: G, reason: collision with root package name */
    public final ImageView f20915G;

    /* renamed from: H, reason: collision with root package name */
    public final TableRow f20916H;

    /* renamed from: I, reason: collision with root package name */
    public final MaterialTextView f20917I;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f20918z;

    @Deprecated
    public static AbstractC4279r1 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (AbstractC4279r1) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99394k0, viewGroup, z10, obj);
    }

    protected AbstractC4279r1(Object obj, View view, int i10, ImageView imageView, TableRow tableRow, MaterialTextView materialTextView, ImageView imageView2, TableRow tableRow2, MaterialTextView materialTextView2, ConstraintLayout constraintLayout, ImageView imageView3, TableRow tableRow3, MaterialTextView materialTextView3) {
        super(obj, view, i10);
        this.f20918z = imageView;
        this.f20909A = tableRow;
        this.f20910B = materialTextView;
        this.f20911C = imageView2;
        this.f20912D = tableRow2;
        this.f20913E = materialTextView2;
        this.f20914F = constraintLayout;
        this.f20915G = imageView3;
        this.f20916H = tableRow3;
        this.f20917I = materialTextView3;
    }

    public static AbstractC4279r1 K0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return M0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
