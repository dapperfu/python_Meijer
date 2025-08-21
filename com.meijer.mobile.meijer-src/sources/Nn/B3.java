package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListAddItemView;

/* loaded from: classes10.dex */
public abstract class B3 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ConstraintLayout f21248A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f21249B;

    /* renamed from: C, reason: collision with root package name */
    public final ShoppingListAddItemView f21250C;

    /* renamed from: D, reason: collision with root package name */
    public final AbstractC4225d3 f21251D;

    /* renamed from: E, reason: collision with root package name */
    public final View f21252E;

    /* renamed from: F, reason: collision with root package name */
    public final RecyclerView f21253F;

    /* renamed from: G, reason: collision with root package name */
    public final ImageView f21254G;

    /* renamed from: H, reason: collision with root package name */
    public final RecyclerView f21255H;

    /* renamed from: z, reason: collision with root package name */
    public final EditText f21256z;

    @Deprecated
    public static B3 N0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (B3) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100281u1, viewGroup, z10, obj);
    }

    protected B3(Object obj, View view, int i10, EditText editText, ConstraintLayout constraintLayout, TextView textView, ShoppingListAddItemView shoppingListAddItemView, AbstractC4225d3 abstractC4225d3, View view2, RecyclerView recyclerView, ImageView imageView, RecyclerView recyclerView2) {
        super(obj, view, i10);
        this.f21256z = editText;
        this.f21248A = constraintLayout;
        this.f21249B = textView;
        this.f21250C = shoppingListAddItemView;
        this.f21251D = abstractC4225d3;
        this.f21252E = view2;
        this.f21253F = recyclerView;
        this.f21254G = imageView;
        this.f21255H = recyclerView2;
    }

    public static B3 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return N0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
