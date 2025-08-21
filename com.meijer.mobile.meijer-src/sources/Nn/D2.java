package Nn;

import Fn.l;
import Hn.ShoppingListTypeAheadResultItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;

/* loaded from: classes10.dex */
public abstract class D2 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ImageButton f21298A;

    /* renamed from: B, reason: collision with root package name */
    public final FullWordEllipsisTextView f21299B;

    /* renamed from: C, reason: collision with root package name */
    protected ShoppingListTypeAheadResultItem f21300C;

    /* renamed from: D, reason: collision with root package name */
    protected l.a f21301D;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f21302z;

    public abstract void M0(ShoppingListTypeAheadResultItem shoppingListTypeAheadResultItem);

    public abstract void N0(l.a aVar);

    protected D2(Object obj, View view, int i10, ImageView imageView, ImageButton imageButton, FullWordEllipsisTextView fullWordEllipsisTextView) {
        super(obj, view, i10);
        this.f21302z = imageView;
        this.f21298A = imageButton;
        this.f21299B = fullWordEllipsisTextView;
    }
}
