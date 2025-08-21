package Nn;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListAddItemView;

/* loaded from: classes10.dex */
public abstract class z3 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ShoppingListAddItemView f22504A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageButton f22505B;

    /* renamed from: C, reason: collision with root package name */
    public final RelativeLayout f22506C;

    /* renamed from: D, reason: collision with root package name */
    public final RecyclerView f22507D;

    /* renamed from: E, reason: collision with root package name */
    public final RecyclerView f22508E;

    /* renamed from: z, reason: collision with root package name */
    public final LinearLayout f22509z;

    protected z3(Object obj, View view, int i10, LinearLayout linearLayout, ShoppingListAddItemView shoppingListAddItemView, ImageButton imageButton, RelativeLayout relativeLayout, RecyclerView recyclerView, RecyclerView recyclerView2) {
        super(obj, view, i10);
        this.f22509z = linearLayout;
        this.f22504A = shoppingListAddItemView;
        this.f22505B = imageButton;
        this.f22506C = relativeLayout;
        this.f22507D = recyclerView;
        this.f22508E = recyclerView2;
    }
}
