package com.meijer.mobile.meijer.activity.personalized.modals;

import Co.ProductFullDetails;
import Ho.ProductSponsorship;
import Hr.ClippableCouponDecorator;
import Hr.CouponCountDownStateDecorator;
import Ji.LocalThemeScope;
import Mn.r3;
import Wj.ValueState;
import ak.AbstractC5607a;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.medallia.digital.mobilesdk.q2;
import com.meijer.mobile.core.design.widget.checkableimagebutton.CheckableImageButton;
import com.meijer.mobile.core.design.widget.stepperview.CollapsibleStepperView;
import com.meijer.mobile.core.design.widget.stepperview.a;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12266k1;
import dk.C13530b;
import j0.C14815g;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ou.AbstractC16177a;
import p1.C16193g;
import ss.C17037o;
import ts.ProductCardDecorator;
import vl.ProductEligibility;
import vs.CartProductListDecorator;
import vs.ProductListDecorator;
import yi.EnumC18214a;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001[Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0018\u0010\u0017\u001a\u0014\u0012\b\u0012\u00060\u0014j\u0002`\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010!J\u001f\u0010$\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b$\u0010\u001eJ\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001bH\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b,\u0010-J\u001b\u00100\u001a\u00020\r2\n\u0010/\u001a\u0006\u0012\u0002\b\u00030.H\u0016¢\u0006\u0004\b0\u00101J\u001d\u00104\u001a\u0004\u0018\u0001032\n\u00102\u001a\u0006\u0012\u0002\b\u00030.H\u0016¢\u0006\u0004\b4\u00105J-\u00108\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\f\u00107\u001a\b\u0012\u0004\u0012\u00020306H\u0016¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b:\u0010\u001eJ\u001d\u0010=\u001a\u00020\b2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00020;H\u0016¢\u0006\u0004\b=\u0010>R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010HR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010IR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001fR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR&\u0010\u0017\u001a\u0014\u0012\b\u0012\u00060\u0014j\u0002`\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010NR\u0016\u0010P\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010\u001fR\u0016\u0010R\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010\u001fR\u0016\u0010T\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010\u001fR\u0014\u0010V\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010\u001fR\u0014\u0010Z\u001a\u00020W8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006\\"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/t0;", "Lou/a;", "LMn/r3;", "Lvs/f;", "item", "Lcom/meijer/mobile/meijer/activity/personalized/modals/t0$a;", "listener", "Lkotlin/Function0;", "", "clipCouponAction", "viewCouponDetail", "Lyl/k;", "featureManager", "", "isUserLoggedIn", "LPp/b;", "searchType", "Lvs/b;", "itemToSubstitute", "Lkotlin/Function1;", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "LHo/a;", "getSponsorship", "<init>", "(Lvs/f;Lcom/meijer/mobile/meijer/activity/personalized/modals/t0$a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lyl/k;ZLPp/b;Lvs/b;Lkotlin/jvm/functions/Function1;)V", "viewBinding", "", "position", "X", "(LMn/r3;I)V", "Z", "T", "(LMn/r3;)V", "S", "U", "Q", "", "i", "()J", "j", "()I", "Landroid/view/View;", "view", "Y", "(Landroid/view/View;)LMn/r3;", "Lnu/h;", "other", "m", "(Lnu/h;)Z", "newItem", "", "h", "(Lnu/h;)Ljava/lang/Object;", "", "payloads", "M", "(LMn/r3;ILjava/util/List;)V", "L", "Lou/b;", "viewHolder", "a0", "(Lou/b;)V", "e", "Lvs/f;", "V", "()Lvs/f;", "setItem", "(Lvs/f;)V", "f", "Lcom/meijer/mobile/meijer/activity/personalized/modals/t0$a;", "g", "Lkotlin/jvm/functions/Function0;", "Lyl/k;", "k", "LPp/b;", "l", "Lvs/b;", "Lkotlin/jvm/functions/Function1;", "n", "viewBeaconSent", "o", "pdpClickBeaconSent", "p", "qtyStepperClickBeaconSent", "q", "isInSelectionMode", "", "W", "()D", "validMaxAllowedQuantity", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.t0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C12490t0 extends AbstractC16177a<r3> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ProductListDecorator item;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a listener;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> clipCouponAction;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> viewCouponDetail;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final yl.k featureManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean isUserLoggedIn;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Pp.b searchType;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final CartProductListDecorator itemToSubstitute;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Function1<String, ProductSponsorship> getSponsorship;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean viewBeaconSent;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean pdpClickBeaconSent;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean qtyStepperClickBeaconSent;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final boolean isInSelectionMode;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0013\u0010\u0012J\u001b\u0010\u0018\u001a\u00020\u00172\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H&¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001d\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u001a2\u0006\u0010\u001c\u001a\u00020\u0014H&¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\u001f\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u001a2\u0006\u0010\u001c\u001a\u00020\u0014H&¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u000bH&¢\u0006\u0004\b!\u0010\"ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006#À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/t0$a;", "", "Lts/a;", "itemClicked", "Landroidx/databinding/p;", "binding", "", "position", "", "a0", "(Lts/a;Landroidx/databinding/p;I)V", "LCo/h;", "productToAdd", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "controlState", "Landroid/graphics/Rect;", "stepperHitRect", "l0", "(LCo/h;Lcom/meijer/mobile/core/design/widget/stepperview/a;Landroid/graphics/Rect;)V", "R", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "forProduct", "", "a", "(Ljava/lang/String;)Z", "", "beacon", "formatLevelBeacon", "d1", "(Ljava/util/List;Ljava/lang/String;)V", "U0", "product", "m0", "(LCo/h;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.t0$a */
    public interface a {
        void R(ProductFullDetails productToAdd, com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect stepperHitRect);

        void U0(List<String> beacon, String formatLevelBeacon);

        boolean a(String forProduct);

        void a0(ProductCardDecorator itemClicked, androidx.databinding.p binding, int position);

        void d1(List<String> beacon, String formatLevelBeacon);

        void l0(ProductFullDetails productToAdd, com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect stepperHitRect);

        void m0(ProductFullDetails product);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.t0$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.t0$b$a */
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C12490t0 f111523a;

            a(C12490t0 c12490t0) {
                this.f111523a = c12490t0;
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
                    ComposerKt.U(-2116980729, i11, -1, "com.meijer.mobile.meijer.activity.personalized.modals.ProductListItem.bindCartData.<anonymous>.<anonymous>.<anonymous> (ProductListItem.kt:355)");
                }
                boolean zE = Intrinsics.e(this.f111523a.getItem().getCartEligibility(), ProductEligibility.a.l.f164858a);
                boolean zE2 = Intrinsics.e(this.f111523a.getItem().getCartEligibility(), ProductEligibility.a.c.f164849a);
                boolean isAgeRestricted = this.f111523a.getItem().getProduct().getIsAgeRestricted();
                boolean hasMPerksOffers = this.f111523a.getItem().getHasMPerksOffers();
                boolean isOnSale = this.f111523a.getItem().getIsOnSale();
                yl.k kVar = this.f111523a.featureManager;
                AbstractC18227f.k0 k0Var = AbstractC18227f.k0.f170587h;
                boolean z10 = false;
                if (kVar.e(k0Var) || this.f111523a.featureManager.e(AbstractC18227f.l0.f170589h) ? !((!this.f111523a.getItem().getIsBuyAgain() || !this.f111523a.getItem().getProduct().getIsSponsoredCriteo() || !this.f111523a.featureManager.e(k0Var)) && (!this.f111523a.featureManager.e(AbstractC18227f.l0.f170589h) || !this.f111523a.getItem().getIsOnSale() || !this.f111523a.getItem().getProduct().getIsSponsoredCriteo())) : this.f111523a.getSponsorship.invoke(this.f111523a.getItem().getProduct().getCode()) != null) {
                    z10 = true;
                }
                Lj.g.l(AdsTheme, null, zE, zE2, this.f111523a.getItem().getIsBuyAgain(), isAgeRestricted, hasMPerksOffers, false, false, isOnSale, z10, null, null, null, null, null, null, null, null, null, composer, LocalThemeScope.f15770g | (i11 & 14), 0, 523457);
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

        b() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1762512888, i10, -1, "com.meijer.mobile.meijer.activity.personalized.modals.ProductListItem.bindCartData.<anonymous>.<anonymous> (ProductListItem.kt:354)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(-2116980729, true, new a(C12490t0.this), composer, 54), composer, 48, 1);
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

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"com/meijer/mobile/meijer/activity/personalized/modals/t0$c", "LWj/a;", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "controlState", "Landroid/graphics/Rect;", "hitRect", "", "b", "(Lcom/meijer/mobile/core/design/widget/stepperview/a;Landroid/graphics/Rect;)V", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.t0$c */
    public static final class c implements Wj.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r3 f111524a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C12490t0 f111525b;

        c(r3 r3Var, C12490t0 c12490t0) {
            this.f111524a = r3Var;
            this.f111525b = c12490t0;
        }

        @Override // Wj.a
        public void a(com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect hitRect) {
            Intrinsics.j(controlState, "controlState");
            Intrinsics.j(hitRect, "hitRect");
            if (controlState instanceof a.Loading) {
                return;
            }
            if (controlState instanceof a.NotAdded) {
                this.f111524a.f20929J.setLabelFor(Bj.k.f2862b);
                FrameLayout cellMask = this.f111524a.f20937z;
                Intrinsics.i(cellMask, "cellMask");
                cellMask.setVisibility(8);
                this.f111525b.listener.l0(this.f111525b.getItem().getProduct(), controlState, hitRect);
                return;
            }
            if ((controlState instanceof a.SingleQuantity) || (controlState instanceof a.MultipleQuantity)) {
                FrameLayout cellMask2 = this.f111524a.f20937z;
                Intrinsics.i(cellMask2, "cellMask");
                cellMask2.setVisibility(0);
                this.f111525b.listener.l0(this.f111525b.getItem().getProduct(), controlState, hitRect);
                return;
            }
            if (!(controlState instanceof a.ShowQuantity)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f111524a.f20929J.setLabelFor(Bj.k.f2825J);
            FrameLayout cellMask3 = this.f111524a.f20937z;
            Intrinsics.i(cellMask3, "cellMask");
            cellMask3.setVisibility(8);
            this.f111525b.listener.l0(this.f111525b.getItem().getProduct(), controlState, hitRect);
        }

        @Override // Wj.a
        public void b(com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect hitRect) {
            Intrinsics.j(controlState, "controlState");
            Intrinsics.j(hitRect, "hitRect");
            if (controlState instanceof a.Loading) {
                return;
            }
            if (controlState instanceof a.NotAdded) {
                this.f111524a.f20929J.setLabelFor(Bj.k.f2862b);
                FrameLayout cellMask = this.f111524a.f20937z;
                Intrinsics.i(cellMask, "cellMask");
                cellMask.setVisibility(8);
                this.f111525b.listener.R(this.f111525b.getItem().getProduct(), controlState, hitRect);
                return;
            }
            if (!(controlState instanceof a.SingleQuantity) && !(controlState instanceof a.MultipleQuantity)) {
                if (!(controlState instanceof a.ShowQuantity)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f111524a.f20929J.setLabelFor(Bj.k.f2825J);
                FrameLayout cellMask2 = this.f111524a.f20937z;
                Intrinsics.i(cellMask2, "cellMask");
                cellMask2.setVisibility(8);
                this.f111525b.listener.R(this.f111525b.getItem().getProduct(), controlState, hitRect);
                return;
            }
            FrameLayout cellMask3 = this.f111524a.f20937z;
            Intrinsics.i(cellMask3, "cellMask");
            cellMask3.setVisibility(0);
            this.f111525b.listener.R(this.f111525b.getItem().getProduct(), controlState, hitRect);
            ProductSponsorship productSponsorship = (ProductSponsorship) this.f111525b.getSponsorship.invoke(this.f111525b.getItem().getProduct().getCode());
            if (productSponsorship != null) {
                C12490t0 c12490t0 = this.f111525b;
                if (c12490t0.qtyStepperClickBeaconSent || productSponsorship.getSponsorSource() != Ho.b.f13065c) {
                    return;
                }
                c12490t0.listener.d1(c12490t0.getItem().getProduct().getBeaconInfo().e(), c12490t0.getItem().getProduct().getBeaconInfo().getFormatLevelOnClickBeacon());
                c12490t0.qtyStepperClickBeaconSent = true;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.t0$d */
    static final class d implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.t0$d$a */
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C12490t0 f111527a;

            a(C12490t0 c12490t0) {
                this.f111527a = c12490t0;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
                InterfaceC5730l0<EnumC18214a> interfaceC5730l0A;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-778055388, i10, -1, "com.meijer.mobile.meijer.activity.personalized.modals.ProductListItem.bindClippableCoupon.<anonymous>.<anonymous> (ProductListItem.kt:294)");
                }
                EnumC18214a value = null;
                Modifier modifierD = androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
                C12490t0 c12490t0 = this.f111527a;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
                InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion.e());
                D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                C14815g c14815g = C14815g.f139108a;
                composer.startReplaceGroup(1455302972);
                if (c12490t0.getItem().getCoupon() != null) {
                    CouponCountDownStateDecorator couponCountDownStateDecorator = c12490t0.getItem().getCouponCountDownStateDecorator();
                    ClippableCouponDecorator clippableCouponDecoratorB = couponCountDownStateDecorator != null ? couponCountDownStateDecorator.b() : null;
                    Function0 function0 = c12490t0.clipCouponAction;
                    int i11 = LocalThemeScope.f15770g;
                    int i12 = i10 & 14;
                    Hr.d.c(AdsTheme, clippableCouponDecoratorB, function0, composer, (ClippableCouponDecorator.f13160c << 3) | i11 | i12);
                    EnumC18214a[] enumC18214aArr = {EnumC18214a.f170499c, EnumC18214a.f170498b, EnumC18214a.f170501e};
                    CouponCountDownStateDecorator couponCountDownStateDecorator2 = c12490t0.getItem().getCouponCountDownStateDecorator();
                    if (couponCountDownStateDecorator2 != null && (interfaceC5730l0A = couponCountDownStateDecorator2.a()) != null) {
                        value = interfaceC5730l0A.getValue();
                    }
                    if (ArraysKt.Y(enumC18214aArr, value)) {
                        yr.e0.b(AdsTheme, C16193g.c(Nr.g.f22694C0, composer, 0), c12490t0.viewCouponDetail, composer, i12 | i11);
                    }
                }
                composer.P();
                composer.v();
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

        d() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2123380501, i10, -1, "com.meijer.mobile.meijer.activity.personalized.modals.ProductListItem.bindClippableCoupon.<anonymous> (ProductListItem.kt:293)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(-778055388, true, new a(C12490t0.this), composer, 54), composer, 48, 1);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.t0$e */
    static final class e implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.t0$e$a */
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C12490t0 f111529a;

            a(C12490t0 c12490t0) {
                this.f111529a = c12490t0;
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
                    ComposerKt.U(1055746144, i10, -1, "com.meijer.mobile.meijer.activity.personalized.modals.ProductListItem.bindProductRatings.<anonymous>.<anonymous> (ProductListItem.kt:282)");
                }
                C17037o.E(AdsTheme, null, this.f111529a.getItem().getProductRatings(), composer, LocalThemeScope.f15770g | (i10 & 14), 1);
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

        e() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(314712463, i10, -1, "com.meijer.mobile.meijer.activity.personalized.modals.ProductListItem.bindProductRatings.<anonymous> (ProductListItem.kt:281)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(1055746144, true, new a(C12490t0.this), composer, 54), composer, 48, 1);
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

    public /* synthetic */ C12490t0(ProductListDecorator productListDecorator, a aVar, Function0 function0, Function0 function02, yl.k kVar, boolean z10, Pp.b bVar, CartProductListDecorator cartProductListDecorator, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(productListDecorator, aVar, function0, function02, kVar, (i10 & 32) != 0 ? true : z10, (i10 & 64) != 0 ? Pp.b.f28356a : bVar, (i10 & 128) != 0 ? null : cartProductListDecorator, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(C12490t0 c12490t0, r3 r3Var, int i10, View view) {
        c12490t0.listener.a0(c12490t0.item.V(), r3Var, i10);
        r3Var.f20925F.setChecked(c12490t0.item.getIsSelected());
    }

    private final void Q(r3 viewBinding, int position) {
        Pp.b bVar;
        viewBinding.f20934O.setContent(ComposableLambdaKt.composableLambdaInstance(1762512888, true, new b()));
        FrameLayout cellMask = viewBinding.f20937z;
        Intrinsics.i(cellMask, "cellMask");
        cellMask.setVisibility(this.item.getInQtyStepperInteraction() ? 0 : 8);
        CollapsibleStepperView collapsibleStepperView = viewBinding.f20933N;
        double qtyIncrement = this.item.getCartEntry().getQtyIncrement();
        double actualQuantity = this.item.getCartEntry().getActualQuantity();
        String unit = this.item.getProduct().getUnit();
        if (unit == null || StringsKt.r0(unit)) {
            unit = null;
        }
        if (unit == null) {
            unit = "Each";
        }
        collapsibleStepperView.setValueState(new ValueState(qtyIncrement, actualQuantity, false, unit, this.item.getInQtyStepperInteraction(), W(), 4, null));
        Pp.b bVar2 = this.searchType;
        Pp.b bVar3 = Pp.b.f28359d;
        if (bVar2 == bVar3 || bVar2 == Pp.b.f28358c) {
            FrameLayout imageCellMask = viewBinding.f20924E;
            Intrinsics.i(imageCellMask, "imageCellMask");
            imageCellMask.setVisibility(!this.item.R(this.itemToSubstitute) ? 0 : 8);
        } else {
            FrameLayout imageCellMask2 = viewBinding.f20924E;
            Intrinsics.i(imageCellMask2, "imageCellMask");
            imageCellMask2.setVisibility(this.item.getIsOutOfStock() ? 0 : 8);
        }
        Pp.b bVar4 = this.searchType;
        Pp.b bVar5 = Pp.b.f28358c;
        if (bVar4 == bVar5 || bVar4 == bVar3) {
            CheckableImageButton checkableImageButton = viewBinding.f20925F;
            checkableImageButton.setEnabled(this.item.R(this.itemToSubstitute));
            Intrinsics.g(checkableImageButton);
            checkableImageButton.setVisibility(0);
        }
        viewBinding.f20923D.setVisibility(8);
        if (Intrinsics.e(this.item.getAvailabilityStatus(), C12266k1.a(ProductEligibility.a.l.f164858a))) {
            MaterialButton findSimilarItemButton = viewBinding.f20923D;
            Intrinsics.i(findSimilarItemButton, "findSimilarItemButton");
            findSimilarItemButton.setVisibility(!this.isInSelectionMode ? 0 : 8);
            viewBinding.f20923D.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.s0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C12490t0.R(this.f111505a, view);
                }
            });
        }
        CollapsibleStepperView collapsibleStepperView2 = viewBinding.f20933N;
        CollapsibleStepperView.V(collapsibleStepperView2, 0, 0, 3, null);
        CollapsibleStepperView.W(collapsibleStepperView2, false, 1, null);
        Intrinsics.g(collapsibleStepperView2);
        collapsibleStepperView2.setVisibility(this.isUserLoggedIn && this.item.o() && (bVar = this.searchType) != bVar5 && bVar != bVar3 ? 0 : 8);
        if (collapsibleStepperView2.getControlState() instanceof a.NotAdded) {
            viewBinding.f20929J.setLabelFor(Bj.k.f2862b);
        } else if (collapsibleStepperView2.getControlState() instanceof a.ShowQuantity) {
            viewBinding.f20929J.setLabelFor(Bj.k.f2825J);
        }
        collapsibleStepperView2.setOnActionListener(new c(viewBinding, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(C12490t0 c12490t0, View view) {
        c12490t0.listener.m0(c12490t0.item.getProduct());
    }

    private final void S(r3 viewBinding) {
        viewBinding.f20920A.setContent(ComposableLambdaKt.composableLambdaInstance(2123380501, true, new d()));
    }

    private final void T(r3 viewBinding) {
        boolean zE = this.featureManager.e(AbstractC18227f.C18233g.f170578h);
        ComposeView productRatings = viewBinding.f20931L;
        Intrinsics.i(productRatings, "productRatings");
        productRatings.setVisibility(zE ? 0 : 8);
        if (zE) {
            viewBinding.f20931L.setContent(ComposableLambdaKt.composableLambdaInstance(314712463, true, new e()));
        }
    }

    private final double W() {
        Double dValueOf = this.item.getProduct().getMaxOrderQuantity() != null ? Double.valueOf(r0.intValue()) : null;
        if (dValueOf == null || Intrinsics.b(dValueOf, 0.0d)) {
            return 2.147483647E9d;
        }
        Double dValueOf2 = this.item.getProduct().getMaxOrderQuantity() != null ? Double.valueOf(r0.intValue()) : null;
        Intrinsics.g(dValueOf2);
        return dValueOf2.doubleValue();
    }

    private final void X(r3 viewBinding, int position) {
        Pp.b bVar = this.searchType;
        if (bVar != Pp.b.f28359d && bVar != Pp.b.f28358c) {
            Z(viewBinding, position);
        } else if (this.item.R(this.itemToSubstitute)) {
            Z(viewBinding, position);
        }
    }

    private final void Z(r3 viewBinding, int position) {
        this.listener.a0(this.item.V(), viewBinding, position);
        ProductSponsorship productSponsorshipInvoke = this.getSponsorship.invoke(this.item.getProduct().getCode());
        if (productSponsorshipInvoke == null || this.pdpClickBeaconSent || productSponsorshipInvoke.getSponsorSource() != Ho.b.f13065c) {
            return;
        }
        this.listener.U0(this.item.getProduct().getBeaconInfo().e(), this.item.getProduct().getBeaconInfo().getFormatLevelOnClickBeacon());
        this.pdpClickBeaconSent = true;
    }

    @Override // ou.AbstractC16177a
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void u(final r3 viewBinding, final int position) {
        Intrinsics.j(viewBinding, "viewBinding");
        viewBinding.P0(this.item);
        T(viewBinding);
        TextView savePriceLabel = viewBinding.f20932M;
        Intrinsics.i(savePriceLabel, "savePriceLabel");
        savePriceLabel.setVisibility(this.item.getIsOnSale() ? 0 : 8);
        TextView weightLabel = viewBinding.f20935P;
        Intrinsics.i(weightLabel, "weightLabel");
        weightLabel.setVisibility(this.item.getShowWeightInfo() ? 0 : 8);
        ImageView complexPromoIcon = viewBinding.f20921B;
        Intrinsics.i(complexPromoIcon, "complexPromoIcon");
        complexPromoIcon.setVisibility(this.item.getComplexPromo() != null ? 0 : 8);
        TextView complexPromoText = viewBinding.f20922C;
        Intrinsics.i(complexPromoText, "complexPromoText");
        complexPromoText.setVisibility(this.item.getComplexPromo() != null ? 0 : 8);
        TextView complexPromoText2 = viewBinding.f20922C;
        Intrinsics.i(complexPromoText2, "complexPromoText");
        bk.d.g(complexPromoText2, this.item.getComplexPromo());
        AbstractC5607a complexPromo = this.item.getComplexPromo();
        if (complexPromo != null) {
            Context context = viewBinding.getRoot().getContext();
            Intrinsics.i(context, "getContext(...)");
            String strB = complexPromo.b(context);
            if (strB != null && StringsKt.c0(strB, "/$", false, 2, null)) {
                TextView textView = viewBinding.f20922C;
                String string = viewBinding.getRoot().getContext().getString(com.meijer.mobile.meijer.Y.f100229o1);
                Intrinsics.i(string, "getString(...)");
                textView.setContentDescription(StringsKt.O(strB, q2.f92724c, string, true));
            }
        }
        viewBinding.f20926G.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12490t0.N(this.f111494a, viewBinding, position, view);
            }
        });
        viewBinding.f20924E.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12490t0.O(this.f111498a, viewBinding, position, view);
            }
        });
        U(viewBinding);
        Q(viewBinding, position);
        S(viewBinding);
        CheckableImageButton checkableImageButton = viewBinding.f20925F;
        checkableImageButton.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12490t0.P(this.f111501a, viewBinding, position, view);
            }
        });
        checkableImageButton.setChecked(this.item.getIsSelected());
    }

    @Override // ou.AbstractC16177a
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void v(r3 viewBinding, int position, List<Object> payloads) {
        Parcelable parcelable;
        Intrinsics.j(viewBinding, "viewBinding");
        Intrinsics.j(payloads, "payloads");
        List<Object> list = !payloads.isEmpty() ? payloads : null;
        if (list != null) {
            Object obj = list.get(0);
            Bundle bundle = obj instanceof Bundle ? (Bundle) obj : null;
            if (bundle != null) {
                if (bundle.containsKey("CART_ENTRY_UPDATE")) {
                    ProductListDecorator productListDecorator = this.item;
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = (Parcelable) bundle.getParcelable("CART_ENTRY_UPDATE", ProductListDecorator.CartEntryDecorator.class);
                    } else {
                        Object parcelable2 = bundle.getParcelable("CART_ENTRY_UPDATE");
                        parcelable = (ProductListDecorator.CartEntryDecorator) (parcelable2 instanceof ProductListDecorator.CartEntryDecorator ? parcelable2 : null);
                    }
                    ProductListDecorator.CartEntryDecorator cartEntryDecorator = (ProductListDecorator.CartEntryDecorator) parcelable;
                    ProductListDecorator productListDecoratorU = productListDecorator.u(((-201326593) & 1) != 0 ? productListDecorator.id : null, ((-201326593) & 2) != 0 ? productListDecorator.isSelected : false, ((-201326593) & 4) != 0 ? productListDecorator.upc : null, ((-201326593) & 8) != 0 ? productListDecorator.title : null, ((-201326593) & 16) != 0 ? productListDecorator.hasUnsavedShoppingListItem : false, ((-201326593) & 32) != 0 ? productListDecorator.listItemId : null, ((-201326593) & 64) != 0 ? productListDecorator.thumbnail : null, ((-201326593) & 128) != 0 ? productListDecorator.thumbnailUrl : null, ((-201326593) & 256) != 0 ? productListDecorator.thumbnailDescription : null, ((-201326593) & 512) != 0 ? productListDecorator.department : null, ((-201326593) & 1024) != 0 ? productListDecorator.isOnSale : false, ((-201326593) & RecyclerView.m.FLAG_MOVED) != 0 ? productListDecorator.showWeightInfo : false, ((-201326593) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? productListDecorator.hasMPerksOffers : false, ((-201326593) & 8192) != 0 ? productListDecorator.currentPrice : null, ((-201326593) & 16384) != 0 ? productListDecorator.regularPrice : null, ((-201326593) & 32768) != 0 ? productListDecorator.weightUnitSizeAndPrice : null, ((-201326593) & 65536) != 0 ? productListDecorator.amountSaved : null, ((-201326593) & 131072) != 0 ? productListDecorator.quantityText : null, ((-201326593) & 262144) != 0 ? productListDecorator.priceGoodThroughDate : null, ((-201326593) & 524288) != 0 ? productListDecorator.isAddedToShoppingList : false, ((-201326593) & 1048576) != 0 ? productListDecorator.errorImageResource : 0, ((-201326593) & 2097152) != 0 ? productListDecorator.shoppingListItem : null, ((-201326593) & 4194304) != 0 ? productListDecorator.product : null, ((-201326593) & 8388608) != 0 ? productListDecorator.cartEntry : cartEntryDecorator == null ? new ProductListDecorator.CartEntryDecorator(0, 0.0d, 0.0d, 7, null) : cartEntryDecorator, ((-201326593) & 16777216) != 0 ? productListDecorator.storeAvailability : null, ((-201326593) & 33554432) != 0 ? productListDecorator.cartEligibility : null, ((-201326593) & 67108864) != 0 ? productListDecorator.inQtyStepperInteraction : false, ((-201326593) & 134217728) != 0 ? productListDecorator.resetStepperState : false, ((-201326593) & 268435456) != 0 ? productListDecorator.productQuery : null, ((-201326593) & 536870912) != 0 ? productListDecorator.couponCountDownStateDecorator : null, ((-201326593) & 1073741824) != 0 ? productListDecorator.coupon : null, ((-201326593) & Integer.MIN_VALUE) != 0 ? productListDecorator.complexPromo : null, (511 & 1) != 0 ? productListDecorator.isBuyAgain : false, (511 & 2) != 0 ? productListDecorator.isBopas : false, (511 & 4) != 0 ? productListDecorator.sponsorship : null, (511 & 8) != 0 ? productListDecorator.productRatings : null, (511 & 16) != 0 ? productListDecorator.showQuantityRequested : false, (511 & 32) != 0 ? productListDecorator.quantityRequested : 0, (511 & 64) != 0 ? productListDecorator.currentPriceDescription : null, (511 & 128) != 0 ? productListDecorator.productContainsTag : false, (511 & 256) != 0 ? productListDecorator.regularPriceDescription : null);
                    this.item = productListDecoratorU;
                    if (!productListDecoratorU.getInQtyStepperInteraction() && !viewBinding.f20933N.getDebouncing() && this.listener.a(this.item.getProduct().getCode())) {
                        Q(viewBinding, position);
                    }
                    S(viewBinding);
                    T(viewBinding);
                } else if (bundle.containsKey("QUANTITY_STEPPER_UPDATE")) {
                    CollapsibleStepperView collapsibleStepperView = viewBinding.f20933N;
                    collapsibleStepperView.setValueState(ValueState.b(collapsibleStepperView.getValueState(), 0.0d, 0.0d, false, null, bundle.getBoolean("QUANTITY_STEPPER_UPDATE"), 0.0d, 47, null));
                    FrameLayout cellMask = viewBinding.f20937z;
                    Intrinsics.i(cellMask, "cellMask");
                    cellMask.setVisibility(this.item.getInQtyStepperInteraction() ? 0 : 8);
                } else if (bundle.getBoolean("QUANTITY_STEPPER_RESET")) {
                    CollapsibleStepperView collapsibleStepperView2 = viewBinding.f20933N;
                    collapsibleStepperView2.setValueState(ValueState.b(collapsibleStepperView2.getValueState(), 0.0d, this.item.getCartEntry().getActualQuantity(), false, null, false, 0.0d, 45, null));
                    FrameLayout cellMask2 = viewBinding.f20937z;
                    Intrinsics.i(cellMask2, "cellMask");
                    cellMask2.setVisibility(8);
                }
                obj = Unit.f142422a;
            }
            if (obj != null) {
                return;
            }
        }
        super.v(viewBinding, position, payloads);
    }

    /* renamed from: V, reason: from getter */
    public final ProductListDecorator getItem() {
        return this.item;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ou.AbstractC16177a
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public r3 z(View view) {
        Intrinsics.j(view, "view");
        r3 r3VarK0 = r3.K0(view);
        Intrinsics.i(r3VarK0, "bind(...)");
        return r3VarK0;
    }

    @Override // nu.h
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void r(ou.b<r3> viewHolder) {
        Intrinsics.j(viewHolder, "viewHolder");
        super.r(viewHolder);
        ProductSponsorship productSponsorshipInvoke = this.getSponsorship.invoke(this.item.getProduct().getCode());
        if (productSponsorshipInvoke == null || this.viewBeaconSent || productSponsorshipInvoke.getSponsorSource() != Ho.b.f13065c) {
            return;
        }
        this.listener.d1(this.item.getProduct().getBeaconInfo().g(), this.item.getProduct().getBeaconInfo().getFormatLevelOnViewBeacon());
        this.viewBeaconSent = true;
    }

    @Override // nu.h
    public Object h(nu.h<?> newItem) {
        Intrinsics.j(newItem, "newItem");
        ProductListDecorator productListDecorator = ((C12490t0) newItem).item;
        Bundle bundle = new Bundle();
        if (!Intrinsics.e(this.item.getShoppingListItem(), productListDecorator.getShoppingListItem())) {
            bundle.putParcelable("SHOPPING_LIST_UPDATE", productListDecorator.getShoppingListItem());
        } else if (!Intrinsics.e(this.item.getCartEntry(), productListDecorator.getCartEntry()) || !Intrinsics.e(this.item.getCouponCountDownStateDecorator(), productListDecorator.getCouponCountDownStateDecorator())) {
            bundle.putParcelable("CART_ENTRY_UPDATE", productListDecorator.getCartEntry());
        } else if (this.item.getInQtyStepperInteraction() != productListDecorator.getInQtyStepperInteraction()) {
            bundle.putBoolean("QUANTITY_STEPPER_UPDATE", productListDecorator.getInQtyStepperInteraction());
        } else if (this.item.getResetStepperState() != productListDecorator.getResetStepperState()) {
            bundle.putBoolean("QUANTITY_STEPPER_RESET", productListDecorator.getResetStepperState());
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    @Override // nu.h
    public long i() {
        return this.item.getUpc().hashCode();
    }

    @Override // nu.h
    /* renamed from: j */
    public int getLayoutId() {
        return com.meijer.mobile.meijer.V.f99410p1;
    }

    @Override // nu.h
    public boolean m(nu.h<?> other) {
        Intrinsics.j(other, "other");
        if (other instanceof C12490t0) {
            return Intrinsics.e(((C12490t0) other).item, this.item);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12490t0(ProductListDecorator item, a listener, Function0<Unit> clipCouponAction, Function0<Unit> viewCouponDetail, yl.k featureManager, boolean z10, Pp.b searchType, CartProductListDecorator cartProductListDecorator, Function1<? super String, ProductSponsorship> getSponsorship) {
        Intrinsics.j(item, "item");
        Intrinsics.j(listener, "listener");
        Intrinsics.j(clipCouponAction, "clipCouponAction");
        Intrinsics.j(viewCouponDetail, "viewCouponDetail");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(searchType, "searchType");
        Intrinsics.j(getSponsorship, "getSponsorship");
        this.item = item;
        this.listener = listener;
        this.clipCouponAction = clipCouponAction;
        this.viewCouponDetail = viewCouponDetail;
        this.featureManager = featureManager;
        this.isUserLoggedIn = z10;
        this.searchType = searchType;
        this.itemToSubstitute = cartProductListDecorator;
        this.getSponsorship = getSponsorship;
        this.isInSelectionMode = CollectionsKt.p(Pp.b.f28358c, Pp.b.f28359d).contains(searchType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(C12490t0 c12490t0, r3 r3Var, int i10, View view) {
        c12490t0.X(r3Var, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(C12490t0 c12490t0, r3 r3Var, int i10, View view) {
        c12490t0.X(r3Var, i10);
    }

    private final void U(r3 viewBinding) {
        ProductSponsorship productSponsorshipInvoke;
        AbstractC5607a amountSaved;
        int i10;
        String thumbnailUrl;
        ProductListDecorator productListDecoratorO0 = viewBinding.O0();
        if (productListDecoratorO0 != null && (productSponsorshipInvoke = this.getSponsorship.invoke(productListDecoratorO0.getProduct().getCode())) != null && productSponsorshipInvoke.getSponsorSource() == Ho.b.f13065c) {
            ProductListDecorator productListDecoratorO02 = viewBinding.O0();
            if (productListDecoratorO02 != null && (thumbnailUrl = productListDecoratorO02.getThumbnailUrl()) != null) {
                if (thumbnailUrl.length() == 0) {
                    return;
                }
                ImageView productImage = viewBinding.f20927H;
                Intrinsics.i(productImage, "productImage");
                C13530b.f(productImage, thumbnailUrl, null, null, 6, null);
            }
            ProductListDecorator productListDecoratorO03 = viewBinding.O0();
            int i11 = 8;
            if (productListDecoratorO03 != null) {
                TextView savePriceLabel = viewBinding.f20932M;
                Intrinsics.i(savePriceLabel, "savePriceLabel");
                if (productListDecoratorO03.getIsOnSale()) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                savePriceLabel.setVisibility(i10);
            }
            TextView savePriceLabel2 = viewBinding.f20932M;
            Intrinsics.i(savePriceLabel2, "savePriceLabel");
            ProductListDecorator productListDecoratorO04 = viewBinding.O0();
            if (productListDecoratorO04 != null) {
                amountSaved = productListDecoratorO04.getAmountSaved();
            } else {
                amountSaved = null;
            }
            bk.d.g(savePriceLabel2, amountSaved);
            ProductListDecorator productListDecoratorO05 = viewBinding.O0();
            if (productListDecoratorO05 != null) {
                TextView weightLabel = viewBinding.f20935P;
                Intrinsics.i(weightLabel, "weightLabel");
                if (productListDecoratorO05.getShowWeightInfo()) {
                    i11 = 0;
                }
                weightLabel.setVisibility(i11);
            }
        }
    }
}
