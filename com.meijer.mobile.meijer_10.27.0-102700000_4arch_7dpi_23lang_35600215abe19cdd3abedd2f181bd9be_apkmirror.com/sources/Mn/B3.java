package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListAddItemView;

/* loaded from: classes9.dex */
public abstract class B3 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ConstraintLayout f19916A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f19917B;

    /* renamed from: C, reason: collision with root package name */
    public final ShoppingListAddItemView f19918C;

    /* renamed from: D, reason: collision with root package name */
    public final AbstractC4220d3 f19919D;

    /* renamed from: E, reason: collision with root package name */
    public final View f19920E;

    /* renamed from: F, reason: collision with root package name */
    public final RecyclerView f19921F;

    /* renamed from: G, reason: collision with root package name */
    public final ImageView f19922G;

    /* renamed from: H, reason: collision with root package name */
    public final RecyclerView f19923H;

    /* renamed from: z, reason: collision with root package name */
    public final EditText f19924z;

    @Deprecated
    public static B3 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (B3) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99425u1, viewGroup, z10, obj);
    }

    protected B3(Object obj, View view, int i10, EditText editText, ConstraintLayout constraintLayout, TextView textView, ShoppingListAddItemView shoppingListAddItemView, AbstractC4220d3 abstractC4220d3, View view2, RecyclerView recyclerView, ImageView imageView, RecyclerView recyclerView2) {
        super(obj, view, i10);
        this.f19924z = editText;
        this.f19916A = constraintLayout;
        this.f19917B = textView;
        this.f19918C = shoppingListAddItemView;
        this.f19919D = abstractC4220d3;
        this.f19920E = view2;
        this.f19921F = recyclerView;
        this.f19922G = imageView;
        this.f19923H = recyclerView2;
    }

    public static B3 K0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return M0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
