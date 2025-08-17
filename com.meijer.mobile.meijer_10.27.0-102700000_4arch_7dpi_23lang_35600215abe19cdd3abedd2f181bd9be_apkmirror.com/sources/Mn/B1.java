package Mn;

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

/* loaded from: classes9.dex */
public abstract class B1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ShoppingListAddItemView f19904A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageButton f19905B;

    /* renamed from: C, reason: collision with root package name */
    public final RelativeLayout f19906C;

    /* renamed from: D, reason: collision with root package name */
    public final ProgressView f19907D;

    /* renamed from: E, reason: collision with root package name */
    public final ConstraintLayout f19908E;

    /* renamed from: F, reason: collision with root package name */
    public final RecyclerView f19909F;

    /* renamed from: G, reason: collision with root package name */
    public final RecyclerView f19910G;

    /* renamed from: z, reason: collision with root package name */
    public final LinearLayout f19911z;

    @Deprecated
    public static B1 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (B1) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99409p0, viewGroup, z10, obj);
    }

    protected B1(Object obj, View view, int i10, LinearLayout linearLayout, ShoppingListAddItemView shoppingListAddItemView, ImageButton imageButton, RelativeLayout relativeLayout, ProgressView progressView, ConstraintLayout constraintLayout, RecyclerView recyclerView, RecyclerView recyclerView2) {
        super(obj, view, i10);
        this.f19911z = linearLayout;
        this.f19904A = shoppingListAddItemView;
        this.f19905B = imageButton;
        this.f19906C = relativeLayout;
        this.f19907D = progressView;
        this.f19908E = constraintLayout;
        this.f19909F = recyclerView;
        this.f19910G = recyclerView2;
    }

    public static B1 K0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return M0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
