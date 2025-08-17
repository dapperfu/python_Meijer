package Mn;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListAddItemView;

/* loaded from: classes9.dex */
public abstract class z3 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ShoppingListAddItemView f21172A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageButton f21173B;

    /* renamed from: C, reason: collision with root package name */
    public final RelativeLayout f21174C;

    /* renamed from: D, reason: collision with root package name */
    public final RecyclerView f21175D;

    /* renamed from: E, reason: collision with root package name */
    public final RecyclerView f21176E;

    /* renamed from: z, reason: collision with root package name */
    public final LinearLayout f21177z;

    protected z3(Object obj, View view, int i10, LinearLayout linearLayout, ShoppingListAddItemView shoppingListAddItemView, ImageButton imageButton, RelativeLayout relativeLayout, RecyclerView recyclerView, RecyclerView recyclerView2) {
        super(obj, view, i10);
        this.f21177z = linearLayout;
        this.f21172A = shoppingListAddItemView;
        this.f21173B = imageButton;
        this.f21174C = relativeLayout;
        this.f21175D = recyclerView;
        this.f21176E = recyclerView2;
    }
}
