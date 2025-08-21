package com.meijer.mobile.meijer.activity.cart.dialog;

import Am.CartProductSavingsDecorator;
import Am.a;
import Nn.AbstractC4233f1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import bk.AbstractC6392a;
import ck.d;
import com.google.android.material.textview.MaterialTextView;
import com.meijer.mobile.core.base.ui.dialogfragment.MeijerDialogFragment;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.cart.dialog.CartProductSavingsDialogFragment;
import ek.C13806b;
import fj.PromoDiscount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.C15069d;
import ju.g;
import ju.l;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 '2\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/dialog/CartProductSavingsDialogFragment;", "Lcom/meijer/mobile/core/base/ui/dialogfragment/MeijerDialogFragment;", "<init>", "()V", "LAm/b;", "decorator", "", "E0", "(LAm/b;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "a", "LAm/b;", "productSavingsDecorator", "LNn/f1;", "b", "LNn/f1;", "binding", "Lju/l;", "c", "Lju/l;", "savingsSection", "Lju/d;", "Lju/g;", "d", "Lju/d;", "savingsAdapter", "e", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class CartProductSavingsDialogFragment extends MeijerDialogFragment {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f102612f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private CartProductSavingsDecorator productSavingsDecorator;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private AbstractC4233f1 binding;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l savingsSection;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C15069d<g> savingsAdapter;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/dialog/CartProductSavingsDialogFragment$a;", "", "<init>", "()V", "LAm/b;", "decorator", "Lcom/meijer/mobile/meijer/activity/cart/dialog/CartProductSavingsDialogFragment;", "a", "(LAm/b;)Lcom/meijer/mobile/meijer/activity/cart/dialog/CartProductSavingsDialogFragment;", "", "CART_PRODUCT_SAVINGS_DIALOG_FRAGMENT_TAG", "Ljava/lang/String;", "PRODUCT_SAVINGS_DECORATOR", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.cart.dialog.CartProductSavingsDialogFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CartProductSavingsDialogFragment a(CartProductSavingsDecorator decorator) {
            Intrinsics.j(decorator, "decorator");
            CartProductSavingsDialogFragment cartProductSavingsDialogFragment = new CartProductSavingsDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("product_savings_decorator", decorator);
            cartProductSavingsDialogFragment.setArguments(bundle);
            return cartProductSavingsDialogFragment;
        }
    }

    private final void E0(CartProductSavingsDecorator decorator) {
        AbstractC4233f1 abstractC4233f1 = this.binding;
        AbstractC4233f1 abstractC4233f12 = null;
        if (abstractC4233f1 == null) {
            Intrinsics.x("binding");
            abstractC4233f1 = null;
        }
        MaterialTextView productSaleBadge = abstractC4233f1.f21934I;
        Intrinsics.i(productSaleBadge, "productSaleBadge");
        productSaleBadge.setVisibility(decorator.getIsOnSale() ? 0 : 8);
        AbstractC4233f1 abstractC4233f13 = this.binding;
        if (abstractC4233f13 == null) {
            Intrinsics.x("binding");
            abstractC4233f13 = null;
        }
        MaterialTextView productMperksBadge = abstractC4233f13.f21932G;
        Intrinsics.i(productMperksBadge, "productMperksBadge");
        productMperksBadge.setVisibility(decorator.getHasMperksOffers() ? 0 : 8);
        AbstractC4233f1 abstractC4233f14 = this.binding;
        if (abstractC4233f14 == null) {
            Intrinsics.x("binding");
            abstractC4233f14 = null;
        }
        abstractC4233f14.f21933H.setText(decorator.getTitle());
        AbstractC4233f1 abstractC4233f15 = this.binding;
        if (abstractC4233f15 == null) {
            Intrinsics.x("binding");
            abstractC4233f15 = null;
        }
        ImageView productImage = abstractC4233f15.f21931F;
        Intrinsics.i(productImage, "productImage");
        C13806b.f(productImage, decorator.f(), null, null, 6, null);
        AbstractC4233f1 abstractC4233f16 = this.binding;
        if (abstractC4233f16 == null) {
            Intrinsics.x("binding");
            abstractC4233f16 = null;
        }
        MaterialTextView productUnitPrice = abstractC4233f16.f21939N;
        Intrinsics.i(productUnitPrice, "productUnitPrice");
        d.g(productUnitPrice, decorator.b());
        AbstractC4233f1 abstractC4233f17 = this.binding;
        if (abstractC4233f17 == null) {
            Intrinsics.x("binding");
            abstractC4233f17 = null;
        }
        MaterialTextView offersApplied = abstractC4233f17.f21930E;
        Intrinsics.i(offersApplied, "offersApplied");
        d.g(offersApplied, decorator.g());
        AbstractC4233f1 abstractC4233f18 = this.binding;
        if (abstractC4233f18 == null) {
            Intrinsics.x("binding");
        } else {
            abstractC4233f12 = abstractC4233f18;
        }
        MaterialTextView productSavingsTotal = abstractC4233f12.f21938M;
        Intrinsics.i(productSavingsTotal, "productSavingsTotal");
        d.g(productSavingsTotal, decorator.h());
        List<PromoDiscount> listA = decorator.getProductSavings().a();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(decorator.a(), AbstractC6392a.INSTANCE.d(Y.f100364Cc, Double.valueOf(((PromoDiscount) it.next()).getRewardAmount()))));
        }
        this.savingsSection.R(arrayList);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.j(inflater, "inflater");
        AbstractC4233f1 abstractC4233f1M0 = AbstractC4233f1.M0(inflater, container, false);
        this.binding = abstractC4233f1M0;
        if (abstractC4233f1M0 == null) {
            Intrinsics.x("binding");
            abstractC4233f1M0 = null;
        }
        View root = abstractC4233f1M0.getRoot();
        Intrinsics.i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AbstractC4233f1 abstractC4233f1 = this.binding;
        AbstractC4233f1 abstractC4233f12 = null;
        if (abstractC4233f1 == null) {
            Intrinsics.x("binding");
            abstractC4233f1 = null;
        }
        abstractC4233f1.f21927B.setOnClickListener(new View.OnClickListener() { // from class: Am.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CartProductSavingsDialogFragment.F0(this.f1365a, view2);
            }
        });
        AbstractC4233f1 abstractC4233f13 = this.binding;
        if (abstractC4233f13 == null) {
            Intrinsics.x("binding");
        } else {
            abstractC4233f12 = abstractC4233f13;
        }
        abstractC4233f12.f21937L.setAdapter(this.savingsAdapter);
        CartProductSavingsDecorator cartProductSavingsDecorator = this.productSavingsDecorator;
        if (cartProductSavingsDecorator != null) {
            E0(cartProductSavingsDecorator);
        }
    }

    public CartProductSavingsDialogFragment() {
        l lVar = new l();
        this.savingsSection = lVar;
        C15069d<g> c15069d = new C15069d<>();
        c15069d.c(lVar);
        this.savingsAdapter = c15069d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F0(CartProductSavingsDialogFragment cartProductSavingsDialogFragment, View view) {
        cartProductSavingsDialogFragment.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            super.onCreate(r15)
            r15 = 0
            r14.setCancelable(r15)
            int r0 = Cj.p.f5103b
            r14.setStyle(r15, r0)
            android.os.Bundle r15 = r14.getArguments()
            if (r15 == 0) goto L32
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            java.lang.String r2 = "product_savings_decorator"
            if (r0 < r1) goto L23
            java.lang.Class<Am.b> r0 = Am.CartProductSavingsDecorator.class
            java.lang.Object r15 = com.google.android.libraries.places.internal.a.a(r15, r2, r0)
            android.os.Parcelable r15 = (android.os.Parcelable) r15
            goto L2e
        L23:
            android.os.Parcelable r15 = r15.getParcelable(r2)
            boolean r0 = r15 instanceof Am.CartProductSavingsDecorator
            if (r0 != 0) goto L2c
            r15 = 0
        L2c:
            Am.b r15 = (Am.CartProductSavingsDecorator) r15
        L2e:
            Am.b r15 = (Am.CartProductSavingsDecorator) r15
            if (r15 != 0) goto L46
        L32:
            Am.b r0 = new Am.b
            r12 = 511(0x1ff, float:7.16E-43)
            r13 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12, r13)
            r15 = r0
        L46:
            r14.productSavingsDecorator = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.cart.dialog.CartProductSavingsDialogFragment.onCreate(android.os.Bundle):void");
    }
}
