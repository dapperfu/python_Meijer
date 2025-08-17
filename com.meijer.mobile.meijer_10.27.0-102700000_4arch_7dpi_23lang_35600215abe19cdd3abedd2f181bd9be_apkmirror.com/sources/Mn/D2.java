package Mn;

import En.l;
import Gn.ShoppingListTypeAheadResultItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;

/* loaded from: classes9.dex */
public abstract class D2 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ImageButton f19966A;

    /* renamed from: B, reason: collision with root package name */
    public final FullWordEllipsisTextView f19967B;

    /* renamed from: C, reason: collision with root package name */
    protected ShoppingListTypeAheadResultItem f19968C;

    /* renamed from: D, reason: collision with root package name */
    protected l.a f19969D;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f19970z;

    public abstract void K0(ShoppingListTypeAheadResultItem shoppingListTypeAheadResultItem);

    public abstract void M0(l.a aVar);

    protected D2(Object obj, View view, int i10, ImageView imageView, ImageButton imageButton, FullWordEllipsisTextView fullWordEllipsisTextView) {
        super(obj, view, i10);
        this.f19970z = imageView;
        this.f19966A = imageButton;
        this.f19967B = fullWordEllipsisTextView;
    }
}
