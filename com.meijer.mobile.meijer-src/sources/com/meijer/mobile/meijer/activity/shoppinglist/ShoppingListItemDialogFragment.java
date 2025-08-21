package com.meijer.mobile.meijer.activity.shoppinglist;

import Ds.p;
import Fq.FavoriteListItem;
import Fq.ShoppingListItem;
import Nn.AbstractC4253j1;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import bk.AbstractC6392a;
import com.meijer.mobile.core.design.widget.checkableimagebutton.CheckableImageButton;
import com.meijer.mobile.meijer.S;
import com.meijer.mobile.meijer.Y;
import com.scandit.datacapture.core.internal.sdk.extensions.CollectionsExtensionsKt;
import hi.InterfaceC14523a;
import ii.C14756c;
import j2.C14923c;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import rr.C16937b;
import ys.C18372b;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 V2\u00020\u00012\u00020\u0002:\u0003WXYB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u001f\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\tJ\u000f\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u0004J\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J+\u0010+\u001a\u00020\u00112\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0007H\u0016¢\u0006\u0004\b-\u0010\u0004J\u000f\u0010.\u001a\u00020\u0007H\u0016¢\u0006\u0004\b.\u0010\u0004J\u0017\u00101\u001a\u00020\u00072\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00072\u0006\u00103\u001a\u00020/H\u0016¢\u0006\u0004\b4\u00102R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00020\r0D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010N\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010U\u001a\u0002058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006Z"}, d2 = {"Lcom/meijer/mobile/meijer/activity/shoppinglist/ShoppingListItemDialogFragment;", "Lcom/meijer/mobile/core/base/ui/dialogfragment/MeijerDialogFragment;", "Landroid/content/DialogInterface$OnShowListener;", "<init>", "()V", "", "isItemInActiveList", "", "p1", "(Z)V", "r1", "", "itemDescription", "LFq/a;", "U0", "(Ljava/lang/String;)LFq/a;", "q1", "Landroid/view/View;", "view", "Landroid/view/MotionEvent;", "event", "o1", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "focused", "n1", "m1", "k1", "l1", "LFq/c;", "Y0", "()LFq/c;", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "dismiss", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "dialogInterface", "onShow", "LNn/j1;", "f", "LNn/j1;", "_binding", "Lhi/a;", "g", "Lhi/a;", "getAnalyticsEngine", "()Lhi/a;", "setAnalyticsEngine", "(Lhi/a;)V", "analyticsEngine", "h", "LFq/c;", "item", "", "i", "Ljava/util/List;", "favorites", "Lcom/meijer/mobile/meijer/activity/shoppinglist/ShoppingListItemDialogFragment$b;", "j", "Lcom/meijer/mobile/meijer/activity/shoppinglist/ShoppingListItemDialogFragment$b;", "listener", "k", "Z", "originalFavorite", "Lrr/b;", "l", "Lrr/b;", "titleTextWatcher", "V0", "()LNn/j1;", "binding", "m", "c", "b", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class ShoppingListItemDialogFragment extends Hilt_ShoppingListItemDialogFragment implements DialogInterface.OnShowListener {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: n, reason: collision with root package name */
    public static final int f113299n = 8;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private AbstractC4253j1 _binding;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14523a analyticsEngine;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private ShoppingListItem item;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private List<FavoriteListItem> favorites;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private b listener;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean originalFavorite;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final C16937b titleTextWatcher = new d();

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/meijer/activity/shoppinglist/ShoppingListItemDialogFragment$a;", "", "<init>", "()V", "LFq/c;", "shoppingListItem", "", "LFq/a;", "favorites", "Lcom/meijer/mobile/meijer/activity/shoppinglist/ShoppingListItemDialogFragment;", "a", "(LFq/c;Ljava/util/List;)Lcom/meijer/mobile/meijer/activity/shoppinglist/ShoppingListItemDialogFragment;", "", "ARGUMENT_SHOPPING_LIST_ITEM", "Ljava/lang/String;", "ARGUMENT_FAVORITES_LIST", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListItemDialogFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ShoppingListItemDialogFragment a(ShoppingListItem shoppingListItem, List<FavoriteListItem> favorites) {
            Intrinsics.j(shoppingListItem, "shoppingListItem");
            Intrinsics.j(favorites, "favorites");
            ShoppingListItemDialogFragment shoppingListItemDialogFragment = new ShoppingListItemDialogFragment();
            shoppingListItemDialogFragment.setArguments(C14923c.b(TuplesKt.a("shoppingListItem", shoppingListItem), TuplesKt.a("favoritesList", CollectionsExtensionsKt.toArrayList(favorites))));
            return shoppingListItemDialogFragment;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0013\u0010\nJ\u000f\u0010\u0014\u001a\u00020\u0004H&¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/shoppinglist/ShoppingListItemDialogFragment$b;", "", "", "couponId", "", "n", "(J)V", "LFq/c;", "item", "L", "(LFq/c;)V", "t", "x", "J", "LFq/a;", "favoriteItem", "k", "(LFq/a;)V", "o", "j", "v", "()V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        void J(ShoppingListItem item);

        void L(ShoppingListItem item);

        void j(ShoppingListItem item);

        void k(FavoriteListItem favoriteItem);

        void n(long couponId);

        void o(FavoriteListItem favoriteItem);

        void t(ShoppingListItem item);

        void v();

        void x(ShoppingListItem item);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/shoppinglist/ShoppingListItemDialogFragment$c;", "", "Lcom/meijer/mobile/meijer/activity/shoppinglist/ShoppingListItemDialogFragment$b;", "l", "()Lcom/meijer/mobile/meijer/activity/shoppinglist/ShoppingListItemDialogFragment$b;", "shoppingListItemListener", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c {
        b l();
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/meijer/mobile/meijer/activity/shoppinglist/ShoppingListItemDialogFragment$d", "Lrr/b;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "(Landroid/text/Editable;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends C16937b {
        d() {
        }

        @Override // rr.C16937b, android.text.TextWatcher
        public void afterTextChanged(Editable s10) {
            Intrinsics.j(s10, "s");
            ShoppingListItemDialogFragment shoppingListItemDialogFragment = ShoppingListItemDialogFragment.this;
            shoppingListItemDialogFragment.originalFavorite = shoppingListItemDialogFragment.U0(s10.toString()) != null;
            ShoppingListItemDialogFragment.this.V0().f22051E.setChecked(ShoppingListItemDialogFragment.this.originalFavorite);
        }
    }

    private final void k1() {
        p1(false);
        b bVar = this.listener;
        if (bVar != null) {
            ShoppingListItem shoppingListItem = this.item;
            if (shoppingListItem == null) {
                Intrinsics.x("item");
                shoppingListItem = null;
            }
            bVar.J(shoppingListItem);
        }
        getAnalyticsEngine().h(C14756c.a("event: delete item"), C14756c.c("shopping list: my list: item level"), C14756c.g("shopping list"));
        dismiss();
    }

    private final void l1() throws NumberFormatException {
        p1(true);
        r1();
        dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this._binding = null;
        super.onDestroyView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FavoriteListItem U0(String itemDescription) {
        List<FavoriteListItem> list = this.favorites;
        if (list == null) {
            Intrinsics.x("favorites");
            list = null;
        }
        for (FavoriteListItem favoriteListItem : list) {
            if (StringsKt.H(favoriteListItem.b(), itemDescription, true)) {
                return favoriteListItem;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC4253j1 V0() {
        AbstractC4253j1 abstractC4253j1 = this._binding;
        Intrinsics.g(abstractC4253j1);
        return abstractC4253j1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j1(ShoppingListItemDialogFragment shoppingListItemDialogFragment, View view, MotionEvent motionEvent) {
        Intrinsics.j(view, "view");
        Intrinsics.j(motionEvent, "motionEvent");
        return shoppingListItemDialogFragment.o1(view, motionEvent);
    }

    private final void m1() {
        ShoppingListItem shoppingListItem = this.item;
        ShoppingListItem shoppingListItem2 = null;
        if (shoppingListItem == null) {
            Intrinsics.x("item");
            shoppingListItem = null;
        }
        if (shoppingListItem.s()) {
            b bVar = this.listener;
            if (bVar != null) {
                ShoppingListItem shoppingListItem3 = this.item;
                if (shoppingListItem3 == null) {
                    Intrinsics.x("item");
                } else {
                    shoppingListItem2 = shoppingListItem3;
                }
                bVar.n(shoppingListItem2.getCouponId());
                return;
            }
            return;
        }
        ShoppingListItem shoppingListItem4 = this.item;
        if (shoppingListItem4 == null) {
            Intrinsics.x("item");
            shoppingListItem4 = null;
        }
        if (shoppingListItem4.x()) {
            b bVar2 = this.listener;
            if (bVar2 != null) {
                ShoppingListItem shoppingListItem5 = this.item;
                if (shoppingListItem5 == null) {
                    Intrinsics.x("item");
                } else {
                    shoppingListItem2 = shoppingListItem5;
                }
                bVar2.L(shoppingListItem2);
                return;
            }
            return;
        }
        ShoppingListItem shoppingListItem6 = this.item;
        if (shoppingListItem6 == null) {
            Intrinsics.x("item");
            shoppingListItem6 = null;
        }
        if (shoppingListItem6.v()) {
            b bVar3 = this.listener;
            if (bVar3 != null) {
                ShoppingListItem shoppingListItem7 = this.item;
                if (shoppingListItem7 == null) {
                    Intrinsics.x("item");
                } else {
                    shoppingListItem2 = shoppingListItem7;
                }
                bVar3.t(shoppingListItem2);
                return;
            }
            return;
        }
        b bVar4 = this.listener;
        if (bVar4 != null) {
            ShoppingListItem shoppingListItem8 = this.item;
            if (shoppingListItem8 == null) {
                Intrinsics.x("item");
            } else {
                shoppingListItem2 = shoppingListItem8;
            }
            bVar4.x(shoppingListItem2);
        }
    }

    private final void n1(boolean focused) {
        if (focused) {
            return;
        }
        Editable text = V0().f22055I.getText();
        Intrinsics.i(text, "getText(...)");
        if (text.length() == 0) {
            EditText quantity = V0().f22055I;
            Intrinsics.i(quantity, "quantity");
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            int i10 = Y.f100740W5;
            ShoppingListItem shoppingListItem = this.item;
            if (shoppingListItem == null) {
                Intrinsics.x("item");
                shoppingListItem = null;
            }
            ck.d.g(quantity, companion.d(i10, Integer.valueOf(shoppingListItem.getQuantity())));
        }
    }

    public final ShoppingListItem Y0() {
        ShoppingListItem shoppingListItem = this.item;
        if (shoppingListItem != null) {
            return shoppingListItem;
        }
        Intrinsics.x("item");
        return null;
    }

    public final InterfaceC14523a getAnalyticsEngine() {
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        if (interfaceC14523a != null) {
            return interfaceC14523a;
        }
        Intrinsics.x("analyticsEngine");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.Hilt_ShoppingListItemDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        b bVarL;
        Intrinsics.j(context, "context");
        super.onAttach(context);
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof b) {
            bVarL = (b) getTargetFragment();
        } else {
            String str = null;
            if (!(targetFragment instanceof c)) {
                Fragment targetFragment2 = getTargetFragment();
                if (targetFragment2 != null) {
                    str = targetFragment2 + " must implement ShoppingListItemListener.";
                }
                throw new ClassCastException(str);
            }
            c cVar = (c) getTargetFragment();
            bVarL = cVar != null ? cVar.l() : null;
        }
        this.listener = bVarL;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) throws NumberFormatException {
        Intrinsics.j(dialog, "dialog");
        p1(true);
        r1();
        b bVar = this.listener;
        if (bVar != null) {
            bVar.v();
        }
        super.onCancel(dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.j(inflater, "inflater");
        this._binding = AbstractC4253j1.M0(inflater, container, false);
        float fMeasureText = V0().f22055I.getPaint().measureText("999");
        ViewGroup.LayoutParams layoutParams = V0().f22055I.getLayoutParams();
        layoutParams.width = MathKt.d(fMeasureText) + V0().f22055I.getPaddingLeft() + V0().f22055I.getPaddingRight();
        V0().f22055I.setLayoutParams(layoutParams);
        V0().f22057K.addTextChangedListener(this.titleTextWatcher);
        q1();
        Dialog dialog = getDialog();
        Intrinsics.g(dialog);
        dialog.setOnShowListener(this);
        V0().f22053G.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.shoppinglist.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShoppingListItemDialogFragment.g1(this.f113355a, view);
            }
        });
        V0().f22049C.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.shoppinglist.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShoppingListItemDialogFragment.h1(this.f113356a, view);
            }
        });
        V0().f22050D.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.shoppinglist.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws NumberFormatException {
                ShoppingListItemDialogFragment.i1(this.f113357a, view);
            }
        });
        V0().f22047A.setOnTouchListener(new View.OnTouchListener() { // from class: com.meijer.mobile.meijer.activity.shoppinglist.l
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ShoppingListItemDialogFragment.j1(this.f113358a, view, motionEvent);
            }
        });
        V0().f22055I.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.meijer.mobile.meijer.activity.shoppinglist.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                ShoppingListItemDialogFragment.a1(this.f113359a, view, z10);
            }
        });
        View root = V0().getRoot();
        Intrinsics.i(root, "getRoot(...)");
        return root;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Intrinsics.j(dialogInterface, "dialogInterface");
        V0().f22057K.requestFocus();
        V0().f22057K.setSelection(V0().f22057K.getText().length());
        p.e(V0().f22057K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a1(ShoppingListItemDialogFragment shoppingListItemDialogFragment, View view, boolean z10) {
        shoppingListItemDialogFragment.n1(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g1(ShoppingListItemDialogFragment shoppingListItemDialogFragment, View view) {
        shoppingListItemDialogFragment.m1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h1(ShoppingListItemDialogFragment shoppingListItemDialogFragment, View view) {
        shoppingListItemDialogFragment.k1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i1(ShoppingListItemDialogFragment shoppingListItemDialogFragment, View view) throws NumberFormatException {
        shoppingListItemDialogFragment.l1();
    }

    private final boolean o1(View view, MotionEvent event) {
        float rawX = event.getRawX();
        float rawY = event.getRawY();
        int[] iArr = new int[2];
        V0().f22048B.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int width = V0().f22048B.getWidth() + i10;
        int i11 = iArr[1];
        int height = V0().f22048B.getHeight() + i11;
        if (rawX >= i10 && rawX <= width && rawY >= i11 && rawY <= height) {
            return false;
        }
        p.c(V0().f22057K);
        Dialog dialog = getDialog();
        Intrinsics.g(dialog);
        dialog.cancel();
        return true;
    }

    private final void p1(boolean isItemInActiveList) {
        boolean zIsChecked = V0().f22051E.get_isChecked();
        String string = V0().f22057K.getText().toString();
        if (this.originalFavorite != zIsChecked) {
            if (zIsChecked) {
                FavoriteListItem favoriteListItem = new FavoriteListItem(0L, 0, 0, null, null, false, 63, null);
                favoriteListItem.i(string);
                ShoppingListItem shoppingListItem = this.item;
                if (shoppingListItem == null) {
                    Intrinsics.x("item");
                    shoppingListItem = null;
                }
                favoriteListItem.k(shoppingListItem.getItemPartNumber());
                favoriteListItem.j(isItemInActiveList);
                b bVar = this.listener;
                if (bVar != null) {
                    bVar.k(favoriteListItem);
                    return;
                }
                return;
            }
            FavoriteListItem favoriteListItemU0 = U0(string);
            if (favoriteListItemU0 != null) {
                favoriteListItemU0.j(isItemInActiveList);
                b bVar2 = this.listener;
                if (bVar2 != null) {
                    bVar2.o(favoriteListItemU0);
                }
            }
        }
    }

    private final void q1() {
        Spanned spannedA;
        EditText editText = V0().f22057K;
        ShoppingListItem shoppingListItem = this.item;
        if (shoppingListItem == null) {
            Intrinsics.x("item");
            shoppingListItem = null;
        }
        String itemDescription = shoppingListItem.getItemDescription();
        if (itemDescription != null) {
            spannedA = m2.b.a(itemDescription, 0, null, null);
        } else {
            spannedA = null;
        }
        editText.setText(spannedA);
        EditText editText2 = V0().f22054H;
        ShoppingListItem shoppingListItem2 = this.item;
        if (shoppingListItem2 == null) {
            Intrinsics.x("item");
            shoppingListItem2 = null;
        }
        editText2.setText(shoppingListItem2.getNotes());
        EditText quantity = V0().f22055I;
        Intrinsics.i(quantity, "quantity");
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        int i10 = Y.f100740W5;
        ShoppingListItem shoppingListItem3 = this.item;
        if (shoppingListItem3 == null) {
            Intrinsics.x("item");
            shoppingListItem3 = null;
        }
        ck.d.g(quantity, companion.d(i10, Integer.valueOf(shoppingListItem3.getQuantity())));
        CheckableImageButton checkableImageButton = V0().f22051E;
        ShoppingListItem shoppingListItem4 = this.item;
        if (shoppingListItem4 == null) {
            Intrinsics.x("item");
            shoppingListItem4 = null;
        }
        checkableImageButton.setChecked(shoppingListItem4.getIsFavorite());
        ShoppingListItem shoppingListItem5 = this.item;
        if (shoppingListItem5 == null) {
            Intrinsics.x("item");
            shoppingListItem5 = null;
        }
        this.originalFavorite = shoppingListItem5.getIsFavorite();
        ShoppingListItem shoppingListItem6 = this.item;
        if (shoppingListItem6 == null) {
            Intrinsics.x("item");
            shoppingListItem6 = null;
        }
        if (shoppingListItem6.s()) {
            androidx.vectordrawable.graphics.drawable.f fVarB = androidx.vectordrawable.graphics.drawable.f.b(getResources(), S.f99612w, null);
            if (fVarB != null) {
                V0().f22053G.setImageDrawable(fVarB);
            }
            V0().f22053G.setContentDescription(getText(Y.f100660S1));
            return;
        }
        ShoppingListItem shoppingListItem7 = this.item;
        if (shoppingListItem7 == null) {
            Intrinsics.x("item");
            shoppingListItem7 = null;
        }
        if (shoppingListItem7.x()) {
            androidx.vectordrawable.graphics.drawable.f fVarB2 = androidx.vectordrawable.graphics.drawable.f.b(requireContext().getResources(), S.f99564W, null);
            if (fVarB2 != null) {
                V0().f22053G.setImageDrawable(fVarB2);
            }
            V0().f22053G.setContentDescription(getText(Bs.a.f3665g));
            return;
        }
        ShoppingListItem shoppingListItem8 = this.item;
        if (shoppingListItem8 == null) {
            Intrinsics.x("item");
            shoppingListItem8 = null;
        }
        if (shoppingListItem8.v()) {
            androidx.vectordrawable.graphics.drawable.f fVarB3 = androidx.vectordrawable.graphics.drawable.f.b(requireContext().getResources(), Cj.i.f4827t, null);
            if (fVarB3 != null) {
                V0().f22053G.setImageDrawable(fVarB3);
            }
            V0().f22053G.setContentDescription(getText(Y.f100519Kc));
            return;
        }
        androidx.vectordrawable.graphics.drawable.f fVarB4 = androidx.vectordrawable.graphics.drawable.f.b(requireContext().getResources(), Cj.i.f4798j1, null);
        if (fVarB4 != null) {
            V0().f22053G.setImageDrawable(fVarB4);
        }
        V0().f22053G.setContentDescription(getText(C18372b.f172063n));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void r1() throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListItemDialogFragment.r1():void");
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        p.c(V0().f22057K);
        b bVar = this.listener;
        if (bVar != null) {
            bVar.v();
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Object obj;
        List<FavoriteListItem> parcelableArrayList;
        super.onCreate(savedInstanceState);
        setStyle(1, Cj.p.f5110i);
        Bundle bundleRequireArguments = requireArguments();
        Intrinsics.i(bundleRequireArguments, "requireArguments(...)");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            obj = (Parcelable) bundleRequireArguments.getParcelable("shoppingListItem", ShoppingListItem.class);
        } else {
            Parcelable parcelable = bundleRequireArguments.getParcelable("shoppingListItem");
            if (!(parcelable instanceof ShoppingListItem)) {
                parcelable = null;
            }
            obj = (ShoppingListItem) parcelable;
        }
        Intrinsics.g(obj);
        this.item = (ShoppingListItem) obj;
        Bundle bundleRequireArguments2 = requireArguments();
        Intrinsics.i(bundleRequireArguments2, "requireArguments(...)");
        if (i10 >= 33) {
            parcelableArrayList = bundleRequireArguments2.getParcelableArrayList("favoritesList", FavoriteListItem.class);
        } else {
            parcelableArrayList = bundleRequireArguments2.getParcelableArrayList("favoritesList");
        }
        if (parcelableArrayList == null) {
            parcelableArrayList = CollectionsKt.m();
        }
        this.favorites = parcelableArrayList;
    }
}
