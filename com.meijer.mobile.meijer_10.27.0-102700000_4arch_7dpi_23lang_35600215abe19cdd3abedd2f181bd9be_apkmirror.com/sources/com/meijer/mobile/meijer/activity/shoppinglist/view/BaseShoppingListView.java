package com.meijer.mobile.meijer.activity.shoppinglist.view;

import Fq.ShoppingListItem;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListAddItemView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b!\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/meijer/mobile/meijer/activity/shoppinglist/view/BaseShoppingListView;", "Landroid/widget/FrameLayout;", "Lcom/meijer/mobile/meijer/activity/shoppinglist/view/ShoppingListAddItemView$a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/meijer/mobile/meijer/activity/shoppinglist/view/BaseShoppingListView$a;", "listener", "", "setListener", "(Lcom/meijer/mobile/meijer/activity/shoppinglist/view/BaseShoppingListView$a;)V", "a", "()V", "onScan", "LFq/c;", "shoppingListItem", "h", "(LFq/c;)V", "e0", "K", "Lcom/meijer/mobile/meijer/activity/shoppinglist/view/BaseShoppingListView$a;", "Lcom/meijer/mobile/meijer/activity/shoppinglist/view/ShoppingListAddItemView;", "getAddItemView", "()Lcom/meijer/mobile/meijer/activity/shoppinglist/view/ShoppingListAddItemView;", "addItemView", "", "b", "()Z", "isAddItemOverlayVisible", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class BaseShoppingListView extends FrameLayout implements ShoppingListAddItemView.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private a listener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/shoppinglist/view/BaseShoppingListView$a;", "", "", "onScan", "()V", "LFq/c;", "item", "h", "(LFq/c;)V", "B0", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        void B0();

        void h(ShoppingListItem item);

        void onScan();
    }

    public abstract ShoppingListAddItemView getAddItemView();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseShoppingListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.j(context, "context");
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListAddItemView.a
    public void K() {
        a aVar = this.listener;
        if (aVar != null) {
            aVar.B0();
        }
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListAddItemView.a
    public void e0() {
        a aVar = this.listener;
        if (aVar != null) {
            aVar.B0();
        }
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListAddItemView.a
    public void h(ShoppingListItem shoppingListItem) {
        Intrinsics.j(shoppingListItem, "shoppingListItem");
        a aVar = this.listener;
        if (aVar != null) {
            aVar.h(shoppingListItem);
        }
        getAddItemView().h();
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListAddItemView.a
    public void onScan() {
        a aVar = this.listener;
        if (aVar != null) {
            aVar.onScan();
        }
    }

    protected final void setListener(a listener) {
        this.listener = listener;
    }

    public final void a() {
        getAddItemView().i();
    }

    public final boolean b() {
        return getAddItemView().n();
    }
}
