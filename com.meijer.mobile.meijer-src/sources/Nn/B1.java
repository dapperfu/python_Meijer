package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListAddItemView;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* loaded from: classes10.dex */
public abstract class B1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ShoppingListAddItemView f21236A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageButton f21237B;

    /* renamed from: C, reason: collision with root package name */
    public final RelativeLayout f21238C;

    /* renamed from: D, reason: collision with root package name */
    public final ProgressView f21239D;

    /* renamed from: E, reason: collision with root package name */
    public final ConstraintLayout f21240E;

    /* renamed from: F, reason: collision with root package name */
    public final RecyclerView f21241F;

    /* renamed from: G, reason: collision with root package name */
    public final RecyclerView f21242G;

    /* renamed from: z, reason: collision with root package name */
    public final LinearLayout f21243z;

    @Deprecated
    public static B1 N0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (B1) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100265p0, viewGroup, z10, obj);
    }

    protected B1(Object obj, View view, int i10, LinearLayout linearLayout, ShoppingListAddItemView shoppingListAddItemView, ImageButton imageButton, RelativeLayout relativeLayout, ProgressView progressView, ConstraintLayout constraintLayout, RecyclerView recyclerView, RecyclerView recyclerView2) {
        super(obj, view, i10);
        this.f21243z = linearLayout;
        this.f21236A = shoppingListAddItemView;
        this.f21237B = imageButton;
        this.f21238C = relativeLayout;
        this.f21239D = progressView;
        this.f21240E = constraintLayout;
        this.f21241F = recyclerView;
        this.f21242G = recyclerView2;
    }

    public static B1 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return N0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
