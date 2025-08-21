package com.meijer.mobile.meijer.activity.shoppinglist.view;

import Ds.p;
import Fn.f;
import Fq.FavoriteListItem;
import Hn.ShoppingListTypeAheadResultItem;
import Nn.B3;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.recyclerview.widget.i;
import com.meijer.mobile.meijer.S;
import com.meijer.mobile.meijer.activity.shoppinglist.view.BaseShoppingListView;
import com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListAddItemView;
import hi.InterfaceC14523a;
import is.C14848b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import zs.C18546a;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001;B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\n2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0013¢\u0006\u0004\b\u001a\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\n2\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013¢\u0006\u0004\b\u001c\u0010\u0017J\u0017\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%H\u0014¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\n2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0016¢\u0006\u0004\b*\u0010\u0017R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00105\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00104R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u00106R\u0014\u0010:\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006<"}, d2 = {"Lcom/meijer/mobile/meijer/activity/shoppinglist/view/ShoppingListFavoritesView;", "Lcom/meijer/mobile/meijer/activity/shoppinglist/view/BaseShoppingListView;", "Lcom/meijer/mobile/meijer/activity/shoppinglist/view/ShoppingListAddItemView$a;", "LFn/f$d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "g", "()V", "Landroid/app/Activity;", "activity", "Lhi/a;", "analyticsEngine", "d", "(Landroid/app/Activity;Lhi/a;)V", "", "LFq/a;", "favorites", "setFavorites", "(Ljava/util/List;)V", "LHn/v0;", "typeAheadResults", "setTypeAheadResults", "selection", "setSelectedFavorites", "Lcom/meijer/mobile/meijer/activity/shoppinglist/view/ShoppingListFavoritesView$a;", "listener", "setListener", "(Lcom/meijer/mobile/meijer/activity/shoppinglist/view/ShoppingListFavoritesView$a;)V", "", "selected", "i", "(Z)V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "e", "LNn/B3;", "b", "LNn/B3;", "binding", "Lis/b;", "c", "Lis/b;", "topPaddingItemDecoration", "LFn/f;", "LFn/f;", "adapter", "Lcom/meijer/mobile/meijer/activity/shoppinglist/view/ShoppingListFavoritesView$a;", "Lcom/meijer/mobile/meijer/activity/shoppinglist/view/ShoppingListAddItemView;", "getAddItemView", "()Lcom/meijer/mobile/meijer/activity/shoppinglist/view/ShoppingListAddItemView;", "addItemView", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ShoppingListFavoritesView extends BaseShoppingListView implements ShoppingListAddItemView.a, f.d {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private B3 binding;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C14848b topPaddingItemDecoration;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Fn.f adapter;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private a listener;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/shoppinglist/view/ShoppingListFavoritesView$a;", "Lcom/meijer/mobile/meijer/activity/shoppinglist/view/BaseShoppingListView$a;", "", "LFq/a;", "selection", "", "e", "(Ljava/util/List;)V", "C0", "()V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a extends BaseShoppingListView.a {
        void C0();

        void e(List<FavoriteListItem> selection);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListFavoritesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.j(context, "context");
        B3 b3M0 = B3.M0(ej.c.b(this), this, true);
        Intrinsics.i(b3M0, "inflate(...)");
        this.binding = b3M0;
        setDescendantFocusability(131072);
        setFocusableInTouchMode(true);
    }

    private final void g() {
        a aVar = this.listener;
        if (aVar != null) {
            aVar.C0();
        }
    }

    public final void d(Activity activity, InterfaceC14523a analyticsEngine) {
        Intrinsics.j(activity, "activity");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        ShoppingListAddItemView shoppingListAddItemView = this.binding.f21250C;
        shoppingListAddItemView.f(activity, true, analyticsEngine);
        EditText addItemEditText = shoppingListAddItemView.getAddItemEditText();
        Intrinsics.g(addItemEditText);
        addItemEditText.setHint(Aq.b.f1978b);
        shoppingListAddItemView.setListener(this);
        this.binding.f21253F.addItemDecoration(new i(getContext(), 1));
        C14848b c14848b = new C14848b(0, 0, 0);
        this.topPaddingItemDecoration = c14848b;
        this.binding.f21253F.addItemDecoration(c14848b);
        Button button = this.binding.f21251D.f21863z;
        button.setText(C18546a.f173195b);
        button.setEnabled(false);
        button.setBackgroundResource(S.f99582h);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.shoppinglist.view.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShoppingListFavoritesView.f(this.f113386a, view);
            }
        });
    }

    @Override // Fn.f.d
    public void e(List<FavoriteListItem> selection) {
        a aVar = this.listener;
        if (aVar != null) {
            aVar.e(selection);
        }
        List<FavoriteListItem> list = selection;
        this.binding.f21251D.f21863z.setEnabled(!(list == null || list.isEmpty()));
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.view.BaseShoppingListView
    public ShoppingListAddItemView getAddItemView() {
        ShoppingListAddItemView addItemView = this.binding.f21250C;
        Intrinsics.i(addItemView, "addItemView");
        return addItemView;
    }

    public final void i(boolean selected) {
        Fn.f fVar = this.adapter;
        if (fVar != null) {
            fVar.J(selected);
            fVar.notifyDataSetChanged();
            e(fVar.F());
        }
    }

    public final void setFavorites(List<FavoriteListItem> favorites) {
        Intrinsics.j(favorites, "favorites");
        Fn.f fVar = this.adapter;
        if (fVar != null) {
            fVar.H(null);
        }
        Fn.f fVar2 = this.adapter;
        List<FavoriteListItem> listF = fVar2 != null ? fVar2.F() : null;
        if (listF == null) {
            listF = CollectionsKt.m();
        }
        Fn.f fVar3 = new Fn.f(getContext(), favorites);
        fVar3.I(listF);
        fVar3.H(this);
        this.adapter = fVar3;
        this.binding.f21253F.setAdapter(fVar3);
        if (favorites.isEmpty()) {
            this.binding.f21250C.o();
            EditText addItemEditText = this.binding.f21250C.getAddItemEditText();
            if (addItemEditText != null) {
                p.e(addItemEditText);
            }
        }
    }

    public final void setSelectedFavorites(List<FavoriteListItem> selection) {
        Intrinsics.j(selection, "selection");
        Fn.f fVar = this.adapter;
        Intrinsics.g(fVar);
        fVar.I(selection);
        Fn.f fVar2 = this.adapter;
        Intrinsics.g(fVar2);
        e(fVar2.F());
    }

    public final void setTypeAheadResults(List<ShoppingListTypeAheadResultItem> typeAheadResults) {
        Intrinsics.j(typeAheadResults, "typeAheadResults");
        this.binding.f21250C.setTypeAheadResults(typeAheadResults);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ShoppingListFavoritesView shoppingListFavoritesView, View view) {
        shoppingListFavoritesView.g();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        C14848b c14848b = this.topPaddingItemDecoration;
        if (c14848b == null) {
            Intrinsics.x("topPaddingItemDecoration");
            c14848b = null;
        }
        c14848b.g(this.binding.f21250C.getAddItemFieldHeight());
        this.binding.f21253F.invalidateItemDecorations();
    }

    public final void setListener(a listener) {
        super.setListener((BaseShoppingListView.a) listener);
        this.listener = listener;
    }
}
