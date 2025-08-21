package com.meijer.mobile.meijer.activity.substitution;

import Co.ProductFullDetails;
import Ki.LocalThemeScope;
import Nn.H3;
import Xj.ValueState;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;
import com.meijer.mobile.core.design.widget.checkableimagebutton.CheckableImageButton;
import com.meijer.mobile.core.design.widget.stepperview.CollapsibleStepperView;
import com.meijer.mobile.core.design.widget.stepperview.a;
import com.meijer.mobile.meijer.V;
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
import vs.ProductListDecorator;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010 \u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b&\u0010'R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/P;", "Lku/a;", "LNn/H3;", "Lcom/meijer/mobile/meijer/activity/substitution/H;", "item", "Lzl/k;", "featureManager", "Lcom/meijer/mobile/meijer/activity/substitution/P$a;", "listener", "<init>", "(Lcom/meijer/mobile/meijer/activity/substitution/H;Lzl/k;Lcom/meijer/mobile/meijer/activity/substitution/P$a;)V", "viewBinding", "", "position", "", "H", "(LNn/H3;I)V", "", "i", "()J", "Lju/h;", "other", "", "m", "(Lju/h;)Z", "D", "newItem", "", "h", "(Lju/h;)Ljava/lang/Object;", "", "payloads", "E", "(LNn/H3;ILjava/util/List;)V", "j", "()I", "Landroid/view/View;", "view", "J", "(Landroid/view/View;)LNn/H3;", "e", "Lcom/meijer/mobile/meijer/activity/substitution/H;", "I", "()Lcom/meijer/mobile/meijer/activity/substitution/H;", "setItem", "(Lcom/meijer/mobile/meijer/activity/substitution/H;)V", "f", "Lzl/k;", "g", "Lcom/meijer/mobile/meijer/activity/substitution/P$a;", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class P extends AbstractC15424a<H3> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private SuggestedItemDecorator item;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a listener;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0011\u0010\u0010J\u001b\u0010\u0016\u001a\u00020\u00152\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/P$a;", "", "Lcom/meijer/mobile/meijer/activity/substitution/H;", "item", "", "Z", "(Lcom/meijer/mobile/meijer/activity/substitution/H;)V", "LCo/h;", "productToAdd", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "controlState", "Landroid/graphics/Rect;", "stepperHitRect", "", "position", "Q0", "(LCo/h;Lcom/meijer/mobile/core/design/widget/stepperview/a;Landroid/graphics/Rect;I)V", "n0", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "forProduct", "", "a", "(Ljava/lang/String;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        void Q0(ProductFullDetails productToAdd, com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect stepperHitRect, int position);

        void Z(SuggestedItemDecorator item);

        default boolean a(String forProduct) {
            Intrinsics.j(forProduct, "forProduct");
            return false;
        }

        void n0(ProductFullDetails productToAdd, com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect stepperHitRect, int position);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P f113664a;

            a(P p10) {
                this.f113664a = p10;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1113537076, i10, -1, "com.meijer.mobile.meijer.activity.substitution.SuggestedProductListItem.bindStepperView.<anonymous>.<anonymous>.<anonymous> (SuggestedProductListItem.kt:184)");
                }
                ss.v.U(AdsTheme, null, this.f113664a.getItem().getProductRatings(), composer, LocalThemeScope.f17314g | (i10 & 14), 1);
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

        b() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2035162341, i10, -1, "com.meijer.mobile.meijer.activity.substitution.SuggestedProductListItem.bindStepperView.<anonymous>.<anonymous> (SuggestedProductListItem.kt:183)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(1113537076, true, new a(P.this), composer, 54), composer, 48, 1);
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

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"com/meijer/mobile/meijer/activity/substitution/P$c", "LXj/a;", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "controlState", "Landroid/graphics/Rect;", "hitRect", "", "b", "(Lcom/meijer/mobile/core/design/widget/stepperview/a;Landroid/graphics/Rect;)V", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class c implements Xj.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ H3 f113665a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ P f113666b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f113667c;

        c(H3 h32, P p10, int i10) {
            this.f113665a = h32;
            this.f113666b = p10;
            this.f113667c = i10;
        }

        @Override // Xj.a
        public void a(com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect hitRect) {
            Intrinsics.j(controlState, "controlState");
            Intrinsics.j(hitRect, "hitRect");
            if (controlState instanceof a.Loading) {
                return;
            }
            if (controlState instanceof a.NotAdded) {
                this.f113665a.f21411J.setLabelFor(Cj.k.f4907b);
                FrameLayout cellMask = this.f113665a.f21402A;
                Intrinsics.i(cellMask, "cellMask");
                cellMask.setVisibility(8);
                this.f113666b.listener.Q0(this.f113666b.getItem().getProduct(), controlState, hitRect, this.f113667c);
                return;
            }
            if ((controlState instanceof a.SingleQuantity) || (controlState instanceof a.MultipleQuantity)) {
                FrameLayout cellMask2 = this.f113665a.f21402A;
                Intrinsics.i(cellMask2, "cellMask");
                cellMask2.setVisibility(0);
                this.f113666b.listener.Q0(this.f113666b.getItem().getProduct(), controlState, hitRect, this.f113667c);
                return;
            }
            if (!(controlState instanceof a.ShowQuantity)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f113665a.f21411J.setLabelFor(Cj.k.f4870J);
            FrameLayout cellMask3 = this.f113665a.f21402A;
            Intrinsics.i(cellMask3, "cellMask");
            cellMask3.setVisibility(8);
            this.f113666b.listener.Q0(this.f113666b.getItem().getProduct(), controlState, hitRect, this.f113667c);
        }

        @Override // Xj.a
        public void b(com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect hitRect) {
            Intrinsics.j(controlState, "controlState");
            Intrinsics.j(hitRect, "hitRect");
            if (controlState instanceof a.Loading) {
                return;
            }
            if (controlState instanceof a.NotAdded) {
                this.f113665a.f21411J.setLabelFor(Cj.k.f4907b);
                FrameLayout cellMask = this.f113665a.f21402A;
                Intrinsics.i(cellMask, "cellMask");
                cellMask.setVisibility(8);
                this.f113666b.listener.n0(this.f113666b.getItem().getProduct(), controlState, hitRect, this.f113667c);
                return;
            }
            if ((controlState instanceof a.SingleQuantity) || (controlState instanceof a.MultipleQuantity)) {
                FrameLayout cellMask2 = this.f113665a.f21402A;
                Intrinsics.i(cellMask2, "cellMask");
                cellMask2.setVisibility(0);
                this.f113666b.listener.n0(this.f113666b.getItem().getProduct(), controlState, hitRect, this.f113667c);
                return;
            }
            if (!(controlState instanceof a.ShowQuantity)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f113665a.f21411J.setLabelFor(Cj.k.f4870J);
            FrameLayout cellMask3 = this.f113665a.f21402A;
            Intrinsics.i(cellMask3, "cellMask");
            cellMask3.setVisibility(8);
            this.f113666b.listener.n0(this.f113666b.getItem().getProduct(), controlState, hitRect, this.f113667c);
        }
    }

    public P(SuggestedItemDecorator item, zl.k featureManager, a listener) {
        Intrinsics.j(item, "item");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(listener, "listener");
        this.item = item;
        this.featureManager = featureManager;
        this.listener = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(P p10, View view) {
        p10.listener.Z(p10.item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(P p10, H3 h32, View view) {
        p10.listener.Z(p10.item);
        h32.f21404C.setChecked(p10.item.getIsSelected());
    }

    private final void H(H3 viewBinding, int position) {
        CollapsibleStepperView collapsibleStepperView = viewBinding.f21407F;
        double qtyIncrement = this.item.getCartEntry().getQtyIncrement();
        double actualQuantity = this.item.getCartEntry().getActualQuantity();
        String unit = this.item.getProduct().getUnit();
        if (unit == null || StringsKt.s0(unit)) {
            unit = null;
        }
        if (unit == null) {
            unit = "Each";
        }
        collapsibleStepperView.setValueState(new ValueState(qtyIncrement, actualQuantity, false, unit, this.item.getInQtyStepperInteraction(), this.item.getMaxQuantityAllowed(), 4, null));
        Intrinsics.g(collapsibleStepperView);
        collapsibleStepperView.setVisibility(this.item.getSubstitutionMode() == Pp.c.f26247c ? 0 : 8);
        FrameLayout cellMask = viewBinding.f21402A;
        Intrinsics.i(cellMask, "cellMask");
        cellMask.setVisibility(this.item.getInQtyStepperInteraction() ? 0 : 8);
        boolean zE = this.featureManager.e(AbstractC18503f.C18509g.f172878h);
        ComposeView productRatings = viewBinding.f21405D;
        Intrinsics.i(productRatings, "productRatings");
        productRatings.setVisibility(zE ? 0 : 8);
        if (zE) {
            viewBinding.f21405D.setContent(ComposableLambdaKt.composableLambdaInstance(2035162341, true, new b()));
        }
        collapsibleStepperView.setOnActionListener(new c(viewBinding, this, position));
    }

    @Override // ku.AbstractC15424a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void u(final H3 viewBinding, int position) {
        Intrinsics.j(viewBinding, "viewBinding");
        TextView suggestedPrice = viewBinding.f21409H;
        Intrinsics.i(suggestedPrice, "suggestedPrice");
        ck.d.g(suggestedPrice, this.item.getFormattedPrice());
        FullWordEllipsisTextView fullWordEllipsisTextView = viewBinding.f21411J;
        String summary = this.item.getSummary();
        if (summary == null) {
            summary = "";
        }
        fullWordEllipsisTextView.setText(summary);
        viewBinding.f21408G.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.substitution.N
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                P.F(this.f113657a, view);
            }
        });
        CheckableImageButton checkableImageButton = viewBinding.f21404C;
        checkableImageButton.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.substitution.O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                P.G(this.f113658a, viewBinding, view);
            }
        });
        Intrinsics.g(checkableImageButton);
        checkableImageButton.setVisibility(this.item.getSubstitutionMode() != Pp.c.f26247c ? 0 : 8);
        checkableImageButton.setChecked(this.item.getIsSelected());
        ImageView suggestedProductImage = viewBinding.f21410I;
        Intrinsics.i(suggestedProductImage, "suggestedProductImage");
        C13806b.f(suggestedProductImage, this.item.getImageUrl(), null, null, 6, null);
        H(viewBinding, position);
    }

    @Override // ku.AbstractC15424a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void v(H3 viewBinding, int position, List<Object> payloads) {
        Parcelable parcelable;
        Intrinsics.j(viewBinding, "viewBinding");
        Intrinsics.j(payloads, "payloads");
        List<Object> list = !payloads.isEmpty() ? payloads : null;
        if (list != null) {
            Object obj = list.get(0);
            Bundle bundle = obj instanceof Bundle ? (Bundle) obj : null;
            if (bundle != null) {
                if (bundle.containsKey("CART_ENTRY_UPDATE")) {
                    SuggestedItemDecorator suggestedItemDecorator = this.item;
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = (Parcelable) bundle.getParcelable("CART_ENTRY_UPDATE", ProductListDecorator.CartEntryDecorator.class);
                    } else {
                        Object parcelable2 = bundle.getParcelable("CART_ENTRY_UPDATE");
                        parcelable = (ProductListDecorator.CartEntryDecorator) (parcelable2 instanceof ProductListDecorator.CartEntryDecorator ? parcelable2 : null);
                    }
                    ProductListDecorator.CartEntryDecorator cartEntryDecorator = (ProductListDecorator.CartEntryDecorator) parcelable;
                    SuggestedItemDecorator suggestedItemDecoratorA = suggestedItemDecorator.a((27135 & 1) != 0 ? suggestedItemDecorator.id : null, (27135 & 2) != 0 ? suggestedItemDecorator.formattedPrice : null, (27135 & 4) != 0 ? suggestedItemDecorator.price : 0.0d, (27135 & 8) != 0 ? suggestedItemDecorator.description : null, (27135 & 16) != 0 ? suggestedItemDecorator.summary : null, (27135 & 32) != 0 ? suggestedItemDecorator.imageUrl : null, (27135 & 64) != 0 ? suggestedItemDecorator.isSelected : false, (27135 & 128) != 0 ? suggestedItemDecorator.unit : null, (27135 & 256) != 0 ? suggestedItemDecorator.substitutionMode : null, (27135 & 512) != 0 ? suggestedItemDecorator.inQtyStepperInteraction : false, (27135 & 1024) != 0 ? suggestedItemDecorator.resetStepperState : false, (27135 & RecyclerView.m.FLAG_MOVED) != 0 ? suggestedItemDecorator.product : null, (27135 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? suggestedItemDecorator.cartEntry : cartEntryDecorator == null ? new ProductListDecorator.CartEntryDecorator(0, 0.0d, 0.0d, 7, null) : cartEntryDecorator, (27135 & 8192) != 0 ? suggestedItemDecorator.maxQuantityAllowed : 0.0d, (27135 & 16384) != 0 ? suggestedItemDecorator.productRatings : null);
                    this.item = suggestedItemDecoratorA;
                    if (!suggestedItemDecoratorA.getInQtyStepperInteraction() && !viewBinding.f21407F.getDebouncing() && this.listener.a(this.item.getProduct().getCode())) {
                        H(viewBinding, position);
                    }
                } else if (bundle.containsKey("QUANTITY_STEPPER_UPDATE")) {
                    CollapsibleStepperView collapsibleStepperView = viewBinding.f21407F;
                    collapsibleStepperView.setValueState(ValueState.b(collapsibleStepperView.getValueState(), 0.0d, 0.0d, false, null, bundle.getBoolean("QUANTITY_STEPPER_UPDATE"), 0.0d, 47, null));
                    FrameLayout cellMask = viewBinding.f21402A;
                    Intrinsics.i(cellMask, "cellMask");
                    cellMask.setVisibility(this.item.getInQtyStepperInteraction() ? 0 : 8);
                } else if (bundle.getBoolean("QUANTITY_STEPPER_RESET")) {
                    CollapsibleStepperView collapsibleStepperView2 = viewBinding.f21407F;
                    collapsibleStepperView2.setValueState(ValueState.b(collapsibleStepperView2.getValueState(), 0.0d, this.item.getCartEntry().getActualQuantity(), false, null, false, 0.0d, 45, null));
                    FrameLayout cellMask2 = viewBinding.f21402A;
                    Intrinsics.i(cellMask2, "cellMask");
                    cellMask2.setVisibility(8);
                }
                obj = Unit.f143329a;
            }
            if (obj != null) {
                return;
            }
        }
        super.v(viewBinding, position, payloads);
    }

    /* renamed from: I, reason: from getter */
    public final SuggestedItemDecorator getItem() {
        return this.item;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ku.AbstractC15424a
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public H3 z(View view) {
        Intrinsics.j(view, "view");
        H3 h3M0 = H3.M0(view);
        Intrinsics.i(h3M0, "bind(...)");
        return h3M0;
    }

    @Override // ju.h
    public Object h(ju.h<?> newItem) {
        Intrinsics.j(newItem, "newItem");
        SuggestedItemDecorator suggestedItemDecorator = ((P) newItem).item;
        Bundle bundle = new Bundle();
        if (!Intrinsics.e(this.item.getCartEntry(), suggestedItemDecorator.getCartEntry())) {
            bundle.putParcelable("CART_ENTRY_UPDATE", suggestedItemDecorator.getCartEntry());
        } else if (this.item.getInQtyStepperInteraction() != suggestedItemDecorator.getInQtyStepperInteraction()) {
            bundle.putBoolean("QUANTITY_STEPPER_UPDATE", suggestedItemDecorator.getInQtyStepperInteraction());
        } else if (this.item.getResetStepperState() != suggestedItemDecorator.getResetStepperState()) {
            bundle.putBoolean("QUANTITY_STEPPER_RESET", suggestedItemDecorator.getResetStepperState());
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    @Override // ju.h
    public long i() {
        return this.item.getId().hashCode();
    }

    @Override // ju.h
    /* renamed from: j */
    public int getLayoutId() {
        return V.f100290x1;
    }

    @Override // ju.h
    public boolean m(ju.h<?> other) {
        Intrinsics.j(other, "other");
        return (other instanceof P) && Intrinsics.e(((P) other).item, this.item);
    }
}
