package Mn;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListItemCheckBox;

/* loaded from: classes9.dex */
public abstract class D3 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f19971A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageButton f19972B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f19973C;

    /* renamed from: z, reason: collision with root package name */
    public final ShoppingListItemCheckBox f19974z;

    @Deprecated
    public static D3 M0(View view, Object obj) {
        return (D3) androidx.databinding.p.U(obj, view, com.meijer.mobile.meijer.V.f99428v1);
    }

    protected D3(Object obj, View view, int i10, ShoppingListItemCheckBox shoppingListItemCheckBox, TextView textView, ImageButton imageButton, TextView textView2) {
        super(obj, view, i10);
        this.f19974z = shoppingListItemCheckBox;
        this.f19971A = textView;
        this.f19972B = imageButton;
        this.f19973C = textView2;
    }

    public static D3 K0(View view) {
        return M0(view, androidx.databinding.g.d());
    }
}
