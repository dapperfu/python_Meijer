package com.meijer.mobile.meijer.activity.cart;

import Ji.LocalThemeScope;
import Mn.X2;
import Mn.Z2;
import Wj.ValueState;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.meijer.mobile.core.design.widget.stepperview.CollapsibleStepperView;
import com.meijer.mobile.core.design.widget.stepperview.a;
import dk.C13530b;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ou.AbstractC16177a;
import vs.CartProductListDecorator;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0012\b\u0001\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000245B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u00182\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u0004\u0018\u00010 2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0016¢\u0006\u0004\b!\u0010\"J-\u0010&\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020 0$H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010)R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/z0;", "Lou/a;", "LMn/Z2;", "Lvs/b;", "item", "Lcom/meijer/mobile/meijer/activity/cart/z0$a;", "listener", "", "activeScreen", "<init>", "(Lvs/b;Lcom/meijer/mobile/meijer/activity/cart/z0$a;Ljava/lang/String;)V", "viewBinding", "", "K", "(LMn/Z2;)V", "Q", "", "j", "()I", "", "i", "()J", "Lnu/h;", "other", "", "m", "(Lnu/h;)Z", "Landroid/view/View;", "view", "S", "(Landroid/view/View;)LMn/Z2;", "newItem", "", "h", "(Lnu/h;)Ljava/lang/Object;", "position", "", "payloads", "I", "(LMn/Z2;ILjava/util/List;)V", "H", "(LMn/Z2;I)V", "e", "Lvs/b;", "R", "()Lvs/b;", "setItem", "(Lvs/b;)V", "f", "Lcom/meijer/mobile/meijer/activity/cart/z0$a;", "g", "Ljava/lang/String;", "b", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.cart.z0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11779z0 extends AbstractC16177a<Z2> {

    /* renamed from: i, reason: collision with root package name */
    public static final int f101981i = 8;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private CartProductListDecorator item;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a listener;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String activeScreen;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J'\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u001c2\n\u0010\u001b\u001a\u00060\u0016j\u0002`\u001aH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001f\u0010\u0006J\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b \u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/z0$a;", "", "Lvs/b;", "item", "", "Q", "(Lvs/b;)V", "i", "entryToUpdate", "LWj/t;", "valueState", "Landroid/graphics/Rect;", "stepperHitRect", "Z0", "(Lvs/b;LWj/t;Landroid/graphics/Rect;)V", "y", "Lcom/meijer/mobile/meijer/activity/cart/k0;", "cartEntryActionDecorator", "X0", "(Lcom/meijer/mobile/meijer/activity/cart/k0;)V", "", "entryNumber", "", "note", "b", "(ILjava/lang/String;)V", "Lcom/meijer/mobile/core/models/products/ProductCode;", "forProduct", "", "a", "(Ljava/lang/String;)Z", "I", "s0", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.cart.z0$a */
    public interface a {
        void I(CartProductListDecorator item);

        void Q(CartProductListDecorator item);

        void X0(CartEntryActionDecorator cartEntryActionDecorator);

        void Z0(CartProductListDecorator entryToUpdate, ValueState valueState, Rect stepperHitRect);

        boolean a(String forProduct);

        void b(int entryNumber, String note);

        void i(CartProductListDecorator item);

        void s0(CartProductListDecorator item);

        void y(CartProductListDecorator entryToUpdate, ValueState valueState, Rect stepperHitRect);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.cart.z0$c */
    static final class c implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.cart.z0$c$a */
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C11779z0 f101986a;

            a(C11779z0 c11779z0) {
                this.f101986a = c11779z0;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(604040534, i11, -1, "com.meijer.mobile.meijer.activity.cart.CartProductListItem.bind.<anonymous>.<anonymous>.<anonymous> (CartProductListItem.kt:138)");
                }
                Lj.g.l(AdsTheme, null, false, this.f101986a.getItem().getStockInfo().c(), false, false, this.f101986a.getItem().getHasMperksOffers(), false, false, false, false, null, null, null, null, null, null, null, null, null, composer, LocalThemeScope.f15770g | (i11 & 14), 0, 524251);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        c() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(320280455, i10, -1, "com.meijer.mobile.meijer.activity.cart.CartProductListItem.bind.<anonymous>.<anonymous> (CartProductListItem.kt:137)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(604040534, true, new a(C11779z0.this), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"com/meijer/mobile/meijer/activity/cart/z0$d", "LWj/a;", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "controlState", "Landroid/graphics/Rect;", "hitRect", "", "b", "(Lcom/meijer/mobile/core/design/widget/stepperview/a;Landroid/graphics/Rect;)V", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.cart.z0$d */
    public static final class d implements Wj.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Z2 f101987a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C11779z0 f101988b;

        d(Z2 z22, C11779z0 c11779z0) {
            this.f101987a = z22;
            this.f101988b = c11779z0;
        }

        @Override // Wj.a
        public void a(com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect hitRect) {
            Intrinsics.j(controlState, "controlState");
            Intrinsics.j(hitRect, "hitRect");
            if (controlState instanceof a.Loading) {
                return;
            }
            if (controlState instanceof a.NotAdded) {
                this.f101987a.f20446K.setLabelFor(Bj.k.f2862b);
                FrameLayout cellMask = this.f101987a.f20438C;
                Intrinsics.i(cellMask, "cellMask");
                cellMask.setVisibility(8);
                this.f101988b.listener.Z0(this.f101988b.getItem(), ((a.NotAdded) controlState).getValueState(), hitRect);
                return;
            }
            if ((controlState instanceof a.SingleQuantity) || (controlState instanceof a.MultipleQuantity)) {
                FrameLayout cellMask2 = this.f101987a.f20438C;
                Intrinsics.i(cellMask2, "cellMask");
                cellMask2.setVisibility(0);
                this.f101988b.listener.Z0(this.f101988b.getItem(), controlState.getValueState(), hitRect);
                return;
            }
            if (!(controlState instanceof a.ShowQuantity)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f101987a.f20446K.setLabelFor(Bj.k.f2825J);
            FrameLayout cellMask3 = this.f101987a.f20438C;
            Intrinsics.i(cellMask3, "cellMask");
            cellMask3.setVisibility(8);
            this.f101988b.listener.Z0(this.f101988b.getItem(), ((a.ShowQuantity) controlState).getValueState(), hitRect);
        }

        @Override // Wj.a
        public void b(com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect hitRect) {
            Intrinsics.j(controlState, "controlState");
            Intrinsics.j(hitRect, "hitRect");
            if (controlState instanceof a.Loading) {
                return;
            }
            if (controlState instanceof a.NotAdded) {
                this.f101987a.f20446K.setLabelFor(Bj.k.f2862b);
                FrameLayout cellMask = this.f101987a.f20438C;
                Intrinsics.i(cellMask, "cellMask");
                cellMask.setVisibility(8);
                this.f101988b.listener.y(this.f101988b.getItem(), ((a.NotAdded) controlState).getValueState(), hitRect);
                return;
            }
            if ((controlState instanceof a.SingleQuantity) || (controlState instanceof a.MultipleQuantity)) {
                FrameLayout cellMask2 = this.f101987a.f20438C;
                Intrinsics.i(cellMask2, "cellMask");
                cellMask2.setVisibility(0);
                this.f101988b.listener.y(this.f101988b.getItem(), controlState.getValueState(), hitRect);
                return;
            }
            if (!(controlState instanceof a.ShowQuantity)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f101987a.f20446K.setLabelFor(Bj.k.f2825J);
            FrameLayout cellMask3 = this.f101987a.f20438C;
            Intrinsics.i(cellMask3, "cellMask");
            cellMask3.setVisibility(8);
            this.f101988b.listener.y(this.f101988b.getItem(), ((a.ShowQuantity) controlState).getValueState(), hitRect);
        }
    }

    public C11779z0(CartProductListDecorator item, a listener, String activeScreen) {
        Intrinsics.j(item, "item");
        Intrinsics.j(listener, "listener");
        Intrinsics.j(activeScreen, "activeScreen");
        this.item = item;
        this.listener = listener;
        this.activeScreen = activeScreen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(C11779z0 c11779z0, View view) {
        c11779z0.listener.i(c11779z0.item);
    }

    private final void K(Z2 viewBinding) {
        MaterialTextView productTotalPrice = viewBinding.f20450O;
        Intrinsics.i(productTotalPrice, "productTotalPrice");
        bk.d.g(productTotalPrice, this.item.x());
        if (this.item.r() != null) {
            MaterialTextView productSeeSavings = viewBinding.f20449N;
            Intrinsics.i(productSeeSavings, "productSeeSavings");
            bk.d.g(productSeeSavings, this.item.r());
            MaterialTextView productSeeSavings2 = viewBinding.f20449N;
            Intrinsics.i(productSeeSavings2, "productSeeSavings");
            productSeeSavings2.setVisibility(0);
            viewBinding.f20449N.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.u0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C11779z0.O(this.f101967a, view);
                }
            });
        } else {
            MaterialTextView productSeeSavings3 = viewBinding.f20449N;
            Intrinsics.i(productSeeSavings3, "productSeeSavings");
            productSeeSavings3.setVisibility(8);
        }
        MaterialButton materialButton = viewBinding.f20444I;
        materialButton.setVisibility(this.item.c() ? 4 : 0);
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11779z0.P(this.f101971a, view);
            }
        });
        X2 x22 = viewBinding.f20442G;
        View root = x22.getRoot();
        Intrinsics.i(root, "getRoot(...)");
        root.setVisibility(this.item.B() ? 0 : 8);
        MaterialTextView noteText = x22.f20402A;
        Intrinsics.i(noteText, "noteText");
        bk.d.f(noteText, this.item.d());
        x22.f20403z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11779z0.L(this.f101974a, view);
            }
        });
        X2 x23 = viewBinding.f20453R;
        View root2 = x23.getRoot();
        Intrinsics.i(root2, "getRoot(...)");
        root2.setVisibility(this.item.c() ? 0 : 8);
        MaterialTextView noteText2 = x23.f20402A;
        Intrinsics.i(noteText2, "noteText");
        bk.d.f(noteText2, this.item.t());
        MaterialButton materialButton2 = x23.f20403z;
        String str = this.activeScreen;
        materialButton2.setText(Intrinsics.e(str, "EDIT_CART_SCREEN") ? com.meijer.mobile.meijer.Y.f100261pd : Intrinsics.e(str, "CART_SCREEN") ? com.meijer.mobile.meijer.Y.f99554F4 : com.meijer.mobile.meijer.Y.f99554F4);
        x23.f20403z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11779z0.M(this.f101976a, view);
            }
        });
        viewBinding.f20439D.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11779z0.N(this.f101978a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(C11779z0 c11779z0, View view) {
        c11779z0.listener.b(c11779z0.item.getEntryNumber(), c11779z0.item.getNotes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(C11779z0 c11779z0, View view) {
        c11779z0.listener.Q(c11779z0.item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(C11779z0 c11779z0, View view) {
        c11779z0.listener.X0(new CartEntryActionDecorator(c11779z0.item.getEntryNumber(), c11779z0.item.B(), c11779z0.item.getNotes(), c11779z0.item.getProduct()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(C11779z0 c11779z0, View view) {
        c11779z0.listener.I(c11779z0.item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(C11779z0 c11779z0, View view) {
        c11779z0.listener.s0(c11779z0.item);
    }

    private final void Q(Z2 viewBinding) {
        CollapsibleStepperView collapsibleStepperView = viewBinding.f20452Q;
        double qtyIncrement = this.item.getProduct().getQtyIncrement();
        double quantity = this.item.getQuantity();
        String unit = this.item.getProduct().getUnit();
        if (unit == null || StringsKt.r0(unit)) {
            unit = null;
        }
        if (unit == null) {
            unit = "Each";
        }
        collapsibleStepperView.setValueState(new ValueState(qtyIncrement, quantity, false, unit, this.item.getInQtyStepperTransition(), this.item.getMaxQuantityAllowed(), 4, null));
        FrameLayout frameLayout = viewBinding.f20438C;
        Intrinsics.g(frameLayout);
        frameLayout.setVisibility(this.item.getInQtyStepperTransition() ? 0 : 8);
        CollapsibleStepperView collapsibleStepperView2 = viewBinding.f20452Q;
        if (collapsibleStepperView2.getControlState() instanceof a.NotAdded) {
            viewBinding.f20446K.setLabelFor(Bj.k.f2862b);
        } else if (collapsibleStepperView2.getControlState() instanceof a.ShowQuantity) {
            viewBinding.f20446K.setLabelFor(Bj.k.f2825J);
        }
        collapsibleStepperView2.setOnActionListener(new d(viewBinding, this));
    }

    @Override // ou.AbstractC16177a
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void u(Z2 viewBinding, int position) {
        Intrinsics.j(viewBinding, "viewBinding");
        ComposeView composeView = viewBinding.f20437B;
        Intrinsics.g(composeView);
        composeView.setVisibility(this.item.getStockInfo().c() || this.item.getHasMperksOffers() ? 0 : 8);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(320280455, true, new c()));
        ImageView productImage = viewBinding.f20445J;
        Intrinsics.i(productImage, "productImage");
        C13530b.f(productImage, this.item.w(), null, null, 6, null);
        viewBinding.f20446K.setText(this.item.getTitle());
        MaterialTextView productPrice = viewBinding.f20447L;
        Intrinsics.i(productPrice, "productPrice");
        bk.d.g(productPrice, this.item.b());
        MaterialTextView finalCostByWeight = viewBinding.f20441F;
        Intrinsics.i(finalCostByWeight, "finalCostByWeight");
        finalCostByWeight.setVisibility(this.item.A() ? 0 : 8);
        MaterialTextView productSavedPrice = viewBinding.f20448M;
        Intrinsics.i(productSavedPrice, "productSavedPrice");
        productSavedPrice.setVisibility(this.item.getIsOnSale() ? 0 : 8);
        MaterialTextView productSavedPrice2 = viewBinding.f20448M;
        Intrinsics.i(productSavedPrice2, "productSavedPrice");
        bk.d.g(productSavedPrice2, this.item.a());
        viewBinding.f20436A.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11779z0.J(this.f101962a, view);
            }
        });
        K(viewBinding);
        Q(viewBinding);
    }

    @Override // ou.AbstractC16177a
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void v(Z2 viewBinding, int position, List<Object> payloads) {
        Parcelable parcelable;
        Intrinsics.j(viewBinding, "viewBinding");
        Intrinsics.j(payloads, "payloads");
        List<Object> list = !payloads.isEmpty() ? payloads : null;
        if (list != null) {
            Object obj = list.get(0);
            Bundle bundle = obj instanceof Bundle ? (Bundle) obj : null;
            if (bundle != null) {
                if (bundle.containsKey("ENTRY_PRICE_UPDATE")) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = (Parcelable) bundle.getParcelable("ENTRY_PRICE_UPDATE", CartProductListDecorator.class);
                    } else {
                        Object parcelable2 = bundle.getParcelable("ENTRY_PRICE_UPDATE");
                        parcelable = (CartProductListDecorator) (parcelable2 instanceof CartProductListDecorator ? parcelable2 : null);
                    }
                    CartProductListDecorator cartProductListDecorator = (CartProductListDecorator) parcelable;
                    if (cartProductListDecorator == null) {
                        cartProductListDecorator = new CartProductListDecorator(0, null, null, null, null, false, false, 0.0d, false, null, null, null, null, 0.0d, null, null, false, 131071, null);
                    }
                    this.item = cartProductListDecorator;
                    K(viewBinding);
                    if (!this.item.getInQtyStepperTransition() && !viewBinding.f20452Q.getDebouncing() && this.listener.a(this.item.getProduct().getCode())) {
                        Q(viewBinding);
                    }
                } else if (bundle.containsKey("QUANTITY_STEPPER_UPDATE")) {
                    CollapsibleStepperView collapsibleStepperView = viewBinding.f20452Q;
                    collapsibleStepperView.setValueState(ValueState.b(collapsibleStepperView.getValueState(), 0.0d, 0.0d, false, null, bundle.getBoolean("QUANTITY_STEPPER_UPDATE"), 0.0d, 47, null));
                    FrameLayout cellMask = viewBinding.f20438C;
                    Intrinsics.i(cellMask, "cellMask");
                    cellMask.setVisibility(this.item.getInQtyStepperTransition() ? 0 : 8);
                }
                obj = Unit.f142422a;
            }
            if (obj != null) {
                return;
            }
        }
        super.v(viewBinding, position, payloads);
    }

    /* renamed from: R, reason: from getter */
    public final CartProductListDecorator getItem() {
        return this.item;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ou.AbstractC16177a
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public Z2 z(View view) {
        Intrinsics.j(view, "view");
        Z2 z2K0 = Z2.K0(view);
        Intrinsics.i(z2K0, "bind(...)");
        return z2K0;
    }

    @Override // nu.h
    public Object h(nu.h<?> newItem) {
        Intrinsics.j(newItem, "newItem");
        CartProductListDecorator cartProductListDecorator = ((C11779z0) newItem).item;
        Bundle bundle = new Bundle();
        if (this.item.getInQtyStepperTransition() != cartProductListDecorator.getInQtyStepperTransition()) {
            bundle.putBoolean("QUANTITY_STEPPER_UPDATE", cartProductListDecorator.getInQtyStepperTransition());
        } else if (!Intrinsics.e(this.item, cartProductListDecorator)) {
            bundle.putParcelable("ENTRY_PRICE_UPDATE", cartProductListDecorator);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    @Override // nu.h
    public long i() {
        return (this.item.getProduct().getCode() + "::" + this.item.getEntryNumber()).hashCode();
    }

    @Override // nu.h
    /* renamed from: j */
    public int getLayoutId() {
        return com.meijer.mobile.meijer.V.f99383g1;
    }

    @Override // nu.h
    public boolean m(nu.h<?> other) {
        Intrinsics.j(other, "other");
        C11779z0 c11779z0 = other instanceof C11779z0 ? (C11779z0) other : null;
        return Intrinsics.e(c11779z0 != null ? c11779z0.item : null, this.item);
    }
}
