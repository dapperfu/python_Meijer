package com.meijer.mobile.meijer.activity.cart;

import Nn.p3;
import android.view.View;
import android.widget.ImageView;
import ek.C13806b;
import gl.C14386a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.AbstractC15424a;
import tr.C17284b;
import vs.CartProductListDecorator;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/s0;", "Lku/a;", "LNn/p3;", "Lvs/b;", "item", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/cart/s0$a;", "", "onAction", "<init>", "(Lvs/b;Lkotlin/jvm/functions/Function1;)V", "", "i", "()J", "viewBinding", "", "position", "D", "(LNn/p3;I)V", "j", "()I", "Landroid/view/View;", "view", "H", "(Landroid/view/View;)LNn/p3;", "e", "Lvs/b;", "getItem", "()Lvs/b;", "setItem", "(Lvs/b;)V", "f", "Lkotlin/jvm/functions/Function1;", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.cart.s0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C11890s0 extends AbstractC15424a<p3> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private CartProductListDecorator item;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Function1<a, Unit> onAction;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\n\u0006\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/s0$a;", "", "Lvs/b;", "item", "<init>", "(Lvs/b;)V", "a", "Lvs/b;", "getItem", "()Lvs/b;", "c", "b", "Lcom/meijer/mobile/meijer/activity/cart/s0$a$a;", "Lcom/meijer/mobile/meijer/activity/cart/s0$a$b;", "Lcom/meijer/mobile/meijer/activity/cart/s0$a$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.cart.s0$a */
    public static abstract class a {

        /* renamed from: b, reason: collision with root package name */
        public static final int f102806b = CartProductListDecorator.f166190s;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final CartProductListDecorator item;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/s0$a$a;", "Lcom/meijer/mobile/meijer/activity/cart/s0$a;", "Lvs/b;", "item", "<init>", "(Lvs/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lvs/b;", "a", "()Lvs/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.cart.s0$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class Remove extends a {

            /* renamed from: d, reason: collision with root package name */
            public static final int f102808d = CartProductListDecorator.f166190s;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final CartProductListDecorator item;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Remove) && Intrinsics.e(this.item, ((Remove) other).item);
            }

            public int hashCode() {
                return this.item.hashCode();
            }

            public String toString() {
                return "Remove(item=" + this.item + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Remove(CartProductListDecorator item) {
                super(item, null);
                Intrinsics.j(item, "item");
                this.item = item;
            }

            /* renamed from: a, reason: from getter */
            public CartProductListDecorator getItem() {
                return this.item;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/s0$a$b;", "Lcom/meijer/mobile/meijer/activity/cart/s0$a;", "Lvs/b;", "item", "<init>", "(Lvs/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lvs/b;", "a", "()Lvs/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.cart.s0$a$b, reason: from toString */
        public static final /* data */ class Substitute extends a {

            /* renamed from: d, reason: collision with root package name */
            public static final int f102810d = CartProductListDecorator.f166190s;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final CartProductListDecorator item;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Substitute) && Intrinsics.e(this.item, ((Substitute) other).item);
            }

            public int hashCode() {
                return this.item.hashCode();
            }

            public String toString() {
                return "Substitute(item=" + this.item + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Substitute(CartProductListDecorator item) {
                super(item, null);
                Intrinsics.j(item, "item");
                this.item = item;
            }

            /* renamed from: a, reason: from getter */
            public CartProductListDecorator getItem() {
                return this.item;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/s0$a$c;", "Lcom/meijer/mobile/meijer/activity/cart/s0$a;", "Lvs/b;", "item", "<init>", "(Lvs/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lvs/b;", "a", "()Lvs/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.cart.s0$a$c, reason: from toString */
        public static final /* data */ class View extends a {

            /* renamed from: d, reason: collision with root package name */
            public static final int f102812d = CartProductListDecorator.f166190s;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final CartProductListDecorator item;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof View) && Intrinsics.e(this.item, ((View) other).item);
            }

            public int hashCode() {
                return this.item.hashCode();
            }

            public String toString() {
                return "View(item=" + this.item + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public View(CartProductListDecorator item) {
                super(item, null);
                Intrinsics.j(item, "item");
                this.item = item;
            }

            /* renamed from: a, reason: from getter */
            public CartProductListDecorator getItem() {
                return this.item;
            }
        }

        public /* synthetic */ a(CartProductListDecorator cartProductListDecorator, DefaultConstructorMarker defaultConstructorMarker) {
            this(cartProductListDecorator);
        }

        private a(CartProductListDecorator cartProductListDecorator) {
            this.item = cartProductListDecorator;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11890s0(CartProductListDecorator item, Function1<? super a, Unit> onAction) {
        Intrinsics.j(item, "item");
        Intrinsics.j(onAction, "onAction");
        this.item = item;
        this.onAction = onAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(C11890s0 c11890s0, View view) {
        c11890s0.onAction.invoke(new a.Remove(c11890s0.item));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(C11890s0 c11890s0, View view) {
        c11890s0.onAction.invoke(new a.Substitute(c11890s0.item));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(C11890s0 c11890s0, View view) {
        c11890s0.onAction.invoke(new a.View(c11890s0.item));
    }

    @Override // ku.AbstractC15424a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void u(p3 viewBinding, int position) {
        Intrinsics.j(viewBinding, "viewBinding");
        viewBinding.f22192E.setText(viewBinding.getRoot().getResources().getString(C17284b.f163332l0, this.item.getFormattedQuantity()));
        viewBinding.f22195H.setText(this.item.getProduct().getName());
        viewBinding.f22193F.setText(C14386a.f134297d);
        ImageView productImage = viewBinding.f22194G;
        Intrinsics.i(productImage, "productImage");
        C13806b.f(productImage, this.item.w(), null, null, 6, null);
        viewBinding.f22190C.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11890s0.E(this.f102795a, view);
            }
        });
        viewBinding.f22188A.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11890s0.F(this.f102797a, view);
            }
        });
        viewBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11890s0.G(this.f102800a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ku.AbstractC15424a
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public p3 z(View view) {
        Intrinsics.j(view, "view");
        p3 p3VarM0 = p3.M0(view);
        Intrinsics.i(p3VarM0, "bind(...)");
        return p3VarM0;
    }

    @Override // ju.h
    public long i() {
        return (this.item.getProduct().getCode() + "::" + this.item.getEntryNumber()).hashCode();
    }

    @Override // ju.h
    /* renamed from: j */
    public int getLayoutId() {
        return com.meijer.mobile.meijer.V.f100263o1;
    }
}
