package com.meijer.mobile.meijer.activity.cart;

import Ki.LocalThemeScope;
import Nn.X2;
import Nn.Z2;
import Xj.ValueState;
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
import ek.C13806b;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ku.AbstractC15424a;
import vs.CartProductListDecorator;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0012\b\u0001\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000245B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u00182\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u0004\u0018\u00010 2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0016¢\u0006\u0004\b!\u0010\"J-\u0010&\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020 0$H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010)R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/z0;", "Lku/a;", "LNn/Z2;", "Lvs/b;", "item", "Lcom/meijer/mobile/meijer/activity/cart/z0$a;", "listener", "", "activeScreen", "<init>", "(Lvs/b;Lcom/meijer/mobile/meijer/activity/cart/z0$a;Ljava/lang/String;)V", "viewBinding", "", "K", "(LNn/Z2;)V", "Q", "", "j", "()I", "", "i", "()J", "Lju/h;", "other", "", "m", "(Lju/h;)Z", "Landroid/view/View;", "view", "S", "(Landroid/view/View;)LNn/Z2;", "newItem", "", "h", "(Lju/h;)Ljava/lang/Object;", "position", "", "payloads", "I", "(LNn/Z2;ILjava/util/List;)V", "H", "(LNn/Z2;I)V", "e", "Lvs/b;", "R", "()Lvs/b;", "setItem", "(Lvs/b;)V", "f", "Lcom/meijer/mobile/meijer/activity/cart/z0$a;", "g", "Ljava/lang/String;", "b", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.cart.z0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C11904z0 extends AbstractC15424a<Z2> {

    /* renamed from: i, reason: collision with root package name */
    public static final int f102836i = 8;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private CartProductListDecorator item;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a listener;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String activeScreen;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J'\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u001c2\n\u0010\u001b\u001a\u00060\u0016j\u0002`\u001aH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001f\u0010\u0006J\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b \u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/z0$a;", "", "Lvs/b;", "item", "", "R", "(Lvs/b;)V", "i", "entryToUpdate", "LXj/t;", "valueState", "Landroid/graphics/Rect;", "stepperHitRect", "a1", "(Lvs/b;LXj/t;Landroid/graphics/Rect;)V", "n", "Lcom/meijer/mobile/meijer/activity/cart/k0;", "cartEntryActionDecorator", "Y0", "(Lcom/meijer/mobile/meijer/activity/cart/k0;)V", "", "entryNumber", "", "note", "b", "(ILjava/lang/String;)V", "Lcom/meijer/mobile/core/models/products/ProductCode;", "forProduct", "", "a", "(Ljava/lang/String;)Z", "K", "w0", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.cart.z0$a */
    public interface a {
        void K(CartProductListDecorator item);

        void R(CartProductListDecorator item);

        void Y0(CartEntryActionDecorator cartEntryActionDecorator);

        boolean a(String forProduct);

        void a1(CartProductListDecorator entryToUpdate, ValueState valueState, Rect stepperHitRect);

        void b(int entryNumber, String note);

        void i(CartProductListDecorator item);

        void n(CartProductListDecorator entryToUpdate, ValueState valueState, Rect stepperHitRect);

        void w0(CartProductListDecorator item);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.cart.z0$c */
    static final class c implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.cart.z0$c$a */
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C11904z0 f102841a;

            a(C11904z0 c11904z0) {
                this.f102841a = c11904z0;
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
                Mj.g.l(AdsTheme, null, false, this.f102841a.getItem().getStockInfo().c(), false, false, this.f102841a.getItem().getHasMperksOffers(), false, false, false, false, null, null, null, null, null, null, null, null, null, composer, LocalThemeScope.f17314g | (i11 & 14), 0, 524251);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
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
            Ki.K.b(null, ComposableLambdaKt.c(604040534, true, new a(C11904z0.this), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"com/meijer/mobile/meijer/activity/cart/z0$d", "LXj/a;", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "controlState", "Landroid/graphics/Rect;", "hitRect", "", "b", "(Lcom/meijer/mobile/core/design/widget/stepperview/a;Landroid/graphics/Rect;)V", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.cart.z0$d */
    public static final class d implements Xj.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Z2 f102842a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C11904z0 f102843b;

        d(Z2 z22, C11904z0 c11904z0) {
            this.f102842a = z22;
            this.f102843b = c11904z0;
        }

        @Override // Xj.a
        public void a(com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect hitRect) {
            Intrinsics.j(controlState, "controlState");
            Intrinsics.j(hitRect, "hitRect");
            if (controlState instanceof a.Loading) {
                return;
            }
            if (controlState instanceof a.NotAdded) {
                this.f102842a.f21778K.setLabelFor(Cj.k.f4907b);
                FrameLayout cellMask = this.f102842a.f21770C;
                Intrinsics.i(cellMask, "cellMask");
                cellMask.setVisibility(8);
                this.f102843b.listener.a1(this.f102843b.getItem(), ((a.NotAdded) controlState).getValueState(), hitRect);
                return;
            }
            if ((controlState instanceof a.SingleQuantity) || (controlState instanceof a.MultipleQuantity)) {
                FrameLayout cellMask2 = this.f102842a.f21770C;
                Intrinsics.i(cellMask2, "cellMask");
                cellMask2.setVisibility(0);
                this.f102843b.listener.a1(this.f102843b.getItem(), controlState.getValueState(), hitRect);
                return;
            }
            if (!(controlState instanceof a.ShowQuantity)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f102842a.f21778K.setLabelFor(Cj.k.f4870J);
            FrameLayout cellMask3 = this.f102842a.f21770C;
            Intrinsics.i(cellMask3, "cellMask");
            cellMask3.setVisibility(8);
            this.f102843b.listener.a1(this.f102843b.getItem(), ((a.ShowQuantity) controlState).getValueState(), hitRect);
        }

        @Override // Xj.a
        public void b(com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect hitRect) {
            Intrinsics.j(controlState, "controlState");
            Intrinsics.j(hitRect, "hitRect");
            if (controlState instanceof a.Loading) {
                return;
            }
            if (controlState instanceof a.NotAdded) {
                this.f102842a.f21778K.setLabelFor(Cj.k.f4907b);
                FrameLayout cellMask = this.f102842a.f21770C;
                Intrinsics.i(cellMask, "cellMask");
                cellMask.setVisibility(8);
                this.f102843b.listener.n(this.f102843b.getItem(), ((a.NotAdded) controlState).getValueState(), hitRect);
                return;
            }
            if ((controlState instanceof a.SingleQuantity) || (controlState instanceof a.MultipleQuantity)) {
                FrameLayout cellMask2 = this.f102842a.f21770C;
                Intrinsics.i(cellMask2, "cellMask");
                cellMask2.setVisibility(0);
                this.f102843b.listener.n(this.f102843b.getItem(), controlState.getValueState(), hitRect);
                return;
            }
            if (!(controlState instanceof a.ShowQuantity)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f102842a.f21778K.setLabelFor(Cj.k.f4870J);
            FrameLayout cellMask3 = this.f102842a.f21770C;
            Intrinsics.i(cellMask3, "cellMask");
            cellMask3.setVisibility(8);
            this.f102843b.listener.n(this.f102843b.getItem(), ((a.ShowQuantity) controlState).getValueState(), hitRect);
        }
    }

    public C11904z0(CartProductListDecorator item, a listener, String activeScreen) {
        Intrinsics.j(item, "item");
        Intrinsics.j(listener, "listener");
        Intrinsics.j(activeScreen, "activeScreen");
        this.item = item;
        this.listener = listener;
        this.activeScreen = activeScreen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(C11904z0 c11904z0, View view) {
        c11904z0.listener.i(c11904z0.item);
    }

    private final void K(Z2 viewBinding) {
        MaterialTextView productTotalPrice = viewBinding.f21782O;
        Intrinsics.i(productTotalPrice, "productTotalPrice");
        ck.d.g(productTotalPrice, this.item.x());
        if (this.item.r() != null) {
            MaterialTextView productSeeSavings = viewBinding.f21781N;
            Intrinsics.i(productSeeSavings, "productSeeSavings");
            ck.d.g(productSeeSavings, this.item.r());
            MaterialTextView productSeeSavings2 = viewBinding.f21781N;
            Intrinsics.i(productSeeSavings2, "productSeeSavings");
            productSeeSavings2.setVisibility(0);
            viewBinding.f21781N.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.u0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C11904z0.O(this.f102822a, view);
                }
            });
        } else {
            MaterialTextView productSeeSavings3 = viewBinding.f21781N;
            Intrinsics.i(productSeeSavings3, "productSeeSavings");
            productSeeSavings3.setVisibility(8);
        }
        MaterialButton materialButton = viewBinding.f21776I;
        materialButton.setVisibility(this.item.c() ? 4 : 0);
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11904z0.P(this.f102826a, view);
            }
        });
        X2 x22 = viewBinding.f21774G;
        View root = x22.getRoot();
        Intrinsics.i(root, "getRoot(...)");
        root.setVisibility(this.item.B() ? 0 : 8);
        MaterialTextView noteText = x22.f21734A;
        Intrinsics.i(noteText, "noteText");
        ck.d.f(noteText, this.item.d());
        x22.f21735z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11904z0.L(this.f102829a, view);
            }
        });
        X2 x23 = viewBinding.f21785R;
        View root2 = x23.getRoot();
        Intrinsics.i(root2, "getRoot(...)");
        root2.setVisibility(this.item.c() ? 0 : 8);
        MaterialTextView noteText2 = x23.f21734A;
        Intrinsics.i(noteText2, "noteText");
        ck.d.f(noteText2, this.item.t());
        MaterialButton materialButton2 = x23.f21735z;
        String str = this.activeScreen;
        materialButton2.setText(Intrinsics.e(str, "EDIT_CART_SCREEN") ? com.meijer.mobile.meijer.Y.f101183sd : Intrinsics.e(str, "CART_SCREEN") ? com.meijer.mobile.meijer.Y.f100416F4 : com.meijer.mobile.meijer.Y.f100416F4);
        x23.f21735z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11904z0.M(this.f102831a, view);
            }
        });
        viewBinding.f21771D.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11904z0.N(this.f102833a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(C11904z0 c11904z0, View view) {
        c11904z0.listener.b(c11904z0.item.getEntryNumber(), c11904z0.item.getNotes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(C11904z0 c11904z0, View view) {
        c11904z0.listener.R(c11904z0.item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(C11904z0 c11904z0, View view) {
        c11904z0.listener.Y0(new CartEntryActionDecorator(c11904z0.item.getEntryNumber(), c11904z0.item.B(), c11904z0.item.getNotes(), c11904z0.item.getProduct()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(C11904z0 c11904z0, View view) {
        c11904z0.listener.K(c11904z0.item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(C11904z0 c11904z0, View view) {
        c11904z0.listener.w0(c11904z0.item);
    }

    private final void Q(Z2 viewBinding) {
        CollapsibleStepperView collapsibleStepperView = viewBinding.f21784Q;
        double qtyIncrement = this.item.getProduct().getQtyIncrement();
        double quantity = this.item.getQuantity();
        String unit = this.item.getProduct().getUnit();
        if (unit == null || StringsKt.s0(unit)) {
            unit = null;
        }
        if (unit == null) {
            unit = "Each";
        }
        collapsibleStepperView.setValueState(new ValueState(qtyIncrement, quantity, false, unit, this.item.getInQtyStepperTransition(), this.item.getMaxQuantityAllowed(), 4, null));
        FrameLayout frameLayout = viewBinding.f21770C;
        Intrinsics.g(frameLayout);
        frameLayout.setVisibility(this.item.getInQtyStepperTransition() ? 0 : 8);
        CollapsibleStepperView collapsibleStepperView2 = viewBinding.f21784Q;
        if (collapsibleStepperView2.getControlState() instanceof a.NotAdded) {
            viewBinding.f21778K.setLabelFor(Cj.k.f4907b);
        } else if (collapsibleStepperView2.getControlState() instanceof a.ShowQuantity) {
            viewBinding.f21778K.setLabelFor(Cj.k.f4870J);
        }
        collapsibleStepperView2.setOnActionListener(new d(viewBinding, this));
    }

    @Override // ku.AbstractC15424a
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void u(Z2 viewBinding, int position) {
        Intrinsics.j(viewBinding, "viewBinding");
        ComposeView composeView = viewBinding.f21769B;
        Intrinsics.g(composeView);
        composeView.setVisibility(this.item.getStockInfo().c() || this.item.getHasMperksOffers() ? 0 : 8);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(320280455, true, new c()));
        ImageView productImage = viewBinding.f21777J;
        Intrinsics.i(productImage, "productImage");
        C13806b.f(productImage, this.item.w(), null, null, 6, null);
        viewBinding.f21778K.setText(this.item.getTitle());
        MaterialTextView productPrice = viewBinding.f21779L;
        Intrinsics.i(productPrice, "productPrice");
        ck.d.g(productPrice, this.item.b());
        MaterialTextView finalCostByWeight = viewBinding.f21773F;
        Intrinsics.i(finalCostByWeight, "finalCostByWeight");
        finalCostByWeight.setVisibility(this.item.A() ? 0 : 8);
        MaterialTextView productSavedPrice = viewBinding.f21780M;
        Intrinsics.i(productSavedPrice, "productSavedPrice");
        productSavedPrice.setVisibility(this.item.getIsOnSale() ? 0 : 8);
        MaterialTextView productSavedPrice2 = viewBinding.f21780M;
        Intrinsics.i(productSavedPrice2, "productSavedPrice");
        ck.d.g(productSavedPrice2, this.item.a());
        viewBinding.f21768A.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11904z0.J(this.f102817a, view);
            }
        });
        K(viewBinding);
        Q(viewBinding);
    }

    @Override // ku.AbstractC15424a
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
                    if (!this.item.getInQtyStepperTransition() && !viewBinding.f21784Q.getDebouncing() && this.listener.a(this.item.getProduct().getCode())) {
                        Q(viewBinding);
                    }
                } else if (bundle.containsKey("QUANTITY_STEPPER_UPDATE")) {
                    CollapsibleStepperView collapsibleStepperView = viewBinding.f21784Q;
                    collapsibleStepperView.setValueState(ValueState.b(collapsibleStepperView.getValueState(), 0.0d, 0.0d, false, null, bundle.getBoolean("QUANTITY_STEPPER_UPDATE"), 0.0d, 47, null));
                    FrameLayout cellMask = viewBinding.f21770C;
                    Intrinsics.i(cellMask, "cellMask");
                    cellMask.setVisibility(this.item.getInQtyStepperTransition() ? 0 : 8);
                }
                obj = Unit.f143329a;
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
    @Override // ku.AbstractC15424a
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public Z2 z(View view) {
        Intrinsics.j(view, "view");
        Z2 z2M0 = Z2.M0(view);
        Intrinsics.i(z2M0, "bind(...)");
        return z2M0;
    }

    @Override // ju.h
    public Object h(ju.h<?> newItem) {
        Intrinsics.j(newItem, "newItem");
        CartProductListDecorator cartProductListDecorator = ((C11904z0) newItem).item;
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

    @Override // ju.h
    public long i() {
        return (this.item.getProduct().getCode() + "::" + this.item.getEntryNumber()).hashCode();
    }

    @Override // ju.h
    /* renamed from: j */
    public int getLayoutId() {
        return com.meijer.mobile.meijer.V.f100239g1;
    }

    @Override // ju.h
    public boolean m(ju.h<?> other) {
        Intrinsics.j(other, "other");
        C11904z0 c11904z0 = other instanceof C11904z0 ? (C11904z0) other : null;
        return Intrinsics.e(c11904z0 != null ? c11904z0.item : null, this.item);
    }
}
