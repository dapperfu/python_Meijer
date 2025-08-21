package Nn;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListItemCheckBox;

/* loaded from: classes10.dex */
public abstract class D3 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f21303A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageButton f21304B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f21305C;

    /* renamed from: z, reason: collision with root package name */
    public final ShoppingListItemCheckBox f21306z;

    @Deprecated
    public static D3 N0(View view, Object obj) {
        return (D3) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f100284v1);
    }

    protected D3(Object obj, View view, int i10, ShoppingListItemCheckBox shoppingListItemCheckBox, TextView textView, ImageButton imageButton, TextView textView2) {
        super(obj, view, i10);
        this.f21306z = shoppingListItemCheckBox;
        this.f21303A = textView;
        this.f21304B = imageButton;
        this.f21305C = textView2;
    }

    public static D3 M0(View view) {
        return N0(view, androidx.databinding.g.d());
    }
}
