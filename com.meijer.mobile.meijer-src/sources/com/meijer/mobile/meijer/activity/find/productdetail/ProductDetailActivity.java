package com.meijer.mobile.meijer.activity.find.productdetail;

import Co.ProductFullDetails;
import Ds.a;
import Gp.ProductInfoForReviewSubmit;
import Gp.ProductInformation;
import Gp.ProductReviewSummary;
import Gp.ReviewItem;
import Ki.LocalThemeScope;
import Kp.ProductReviewDetails;
import Kp.ProductReviewFullDetails;
import Kp.ProductReviewOptionsDetails;
import Kp.RatingsDistribution;
import P0.e;
import Sk.CouponOptions;
import Sn.a;
import Tm.b;
import V2.CreationExtras;
import Xj.ValueState;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.view.AbstractC6165l;
import androidx.view.C6136J;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import androidx.viewpager.widget.ViewPager;
import bk.AbstractC6392a;
import com.fullstory.FS;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;
import com.meijer.mobile.core.design.widget.checkableimagebutton.CheckableImageButton;
import com.meijer.mobile.core.design.widget.stepperview.StepperView;
import com.meijer.mobile.coupon.model.search.CouponsSortType;
import com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment;
import com.meijer.mobile.meijer.activity.find.ImageDetailActivity;
import com.meijer.mobile.meijer.activity.find.fragment.ItemLocationInfoBottomDialogFragment;
import com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity;
import com.meijer.mobile.meijer.activity.find.productdetail.a2;
import com.meijer.mobile.meijer.activity.find.productdetail.m2;
import com.meijer.mobile.meijer.activity.find.viewmodel.AbstractC12325a;
import com.meijer.mobile.meijer.activity.find.viewmodel.AbstractC12425x;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1;
import com.meijer.mobile.meijer.activity.find.viewmodel.G0;
import com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailsState;
import com.meijer.mobile.meijer.activity.find.viewmodel.ProductImageViewModel;
import com.meijer.mobile.reviews.ux.productreview.C12880x0;
import com.meijer.mobile.reviews.ux.productreview.ProductReviewDecorator;
import dk.C13698b;
import e.C13737e;
import ee.C13790a;
import fj.Entry;
import g.AbstractC14276c;
import g.C14274a;
import g.InterfaceC14275b;
import gi.GoogleAdAnalytics;
import gi.GoogleAdData;
import ii.C14756c;
import ii.TrackingData;
import j$.time.ZoneId;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.C15132A;
import ki.InterfaceC15154X;
import ki.Q0;
import ki.q1;
import kotlin.C17983Z;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import le.C15485b;
import lk.AbstractC15516a;
import lk.AbstractC15517b;
import mv.C15809k;
import mv.InterfaceC15783O;
import nk.l;
import p1.C16338g;
import pv.InterfaceC16553F;
import pv.InterfaceC16562g;
import r1.C16819m;
import tr.C17283a;
import tr.C17284b;
import us.C17457C;
import us.C17463f;
import vs.CartProductListDecorator;
import vs.ProductLocationDecorator;
import vs.ProductNutritionLabelDecorator;
import wk.C17898a;
import wl.ProductEligibility;
import xk.C18188a;
import zl.AbstractC18503f;
import zs.C18546a;

@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0015¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\bJ\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\bJ%\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010 J\u001f\u0010&\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J'\u0010,\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020$2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J!\u0010/\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010\"2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b/\u0010'J\u001f\u00100\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b0\u0010'J#\u00105\u001a\u00020\u000b2\u0006\u00102\u001a\u0002012\n\b\u0002\u00104\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0004\b5\u00106J\u001f\u0010:\u001a\u00020\u000b2\u0006\u00102\u001a\u0002072\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b<\u0010'J\u0017\u0010=\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b?\u0010'J\u001f\u0010@\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b@\u0010'J\u001f\u0010A\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\bA\u0010'J\u0017\u0010D\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u000b2\u0006\u00102\u001a\u00020FH\u0003¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u000b2\u0006\u00102\u001a\u00020FH\u0003¢\u0006\u0004\bI\u0010HJ\u0017\u0010J\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u000bH\u0002¢\u0006\u0004\bL\u0010\bJ\u0017\u0010M\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\bM\u0010KR\u001b\u0010S\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0016\u0010W\u001a\u00020T8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010]\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010`\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u001b\u0010e\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010P\u001a\u0004\bc\u0010dR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020g0f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020g0f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010iR\u0014\u0010o\u001a\u00020m8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010nR\u0014\u00102\u001a\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010t\u001a\u00020Z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\br\u0010s¨\u0006u"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/ProductDetailActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LBj/b;", "Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment$b;", "Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment$c;", "LQj/g;", "LTm/b$a;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onDestroy", "", "count", "L0", "(I)V", "Y", "onCreateAccount", "onSignIn", "position", "", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/l1;", "imagesList", "H0", "(ILjava/util/List;)V", "Lg/a;", "result", "C2", "(Lg/a;)V", "B2", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/j1;", "details", "LKi/M;", "localThemeScope", "S2", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/j1;LKi/M;)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0;", "event", "Landroid/content/Context;", "context", "M2", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0;LKi/M;Landroid/content/Context;)V", "detailsState", "l2", "v2", "Lnk/f;", "product", "", "previousTrackAction", "A2", "(Lnk/f;Ljava/lang/String;)V", "LCo/h;", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "state", "L2", "(LCo/h;Lcom/meijer/mobile/core/design/widget/stepperview/a;)V", "j2", "i2", "(LKi/M;)V", "g2", "k2", "h2", "LTm/b;", "imagePagerAdapter", "D2", "(LTm/b;)V", "Lnk/c;", "H2", "(Lnk/c;)V", "F2", "W2", "(Lnk/f;)V", "T2", "U2", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/c1;", "s", "Lkotlin/Lazy;", "z2", "()Lcom/meijer/mobile/meijer/activity/find/viewmodel/c1;", "vm", "LNn/I;", "t", "LNn/I;", "binding", "u", "LTm/b;", "", "v", "Z", "loadGrayScaleImage", "w", "Ljava/lang/String;", "campaignIdValue", "Lee/a;", "x", "x2", "()Lee/a;", "cartBadge", "Lg/c;", "Landroid/content/Intent;", "y", "Lg/c;", "substitutionResultLauncher", "z", "productRateAndReviewLauncher", "Landroidx/appcompat/widget/Toolbar;", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "y2", "()Lnk/f;", "E2", "()Z", "isFromCLP", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class ProductDetailActivity extends Hilt_ProductDetailActivity implements Bj.b, CouponsFragment.b, CouponsFragment.c, Qj.g, b.a {

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Nn.I binding;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private Tm.b imagePagerAdapter;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean loadGrayScaleImage;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private String campaignIdValue;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy vm = new androidx.view.e0(Reflection.b(C12333c1.class), new t(this), new s(this), new u(null, this));

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Lazy cartBadge = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.s
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ProductDetailActivity.w2(this.f108585a);
        }
    });

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> substitutionResultLauncher = registerForActivityResult(new h.i(), new v());

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> productRateAndReviewLauncher = registerForActivityResult(new h.i(), new r());

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.meijer.mobile.meijer.activity.find.viewmodel.r.values().length];
            try {
                iArr[com.meijer.mobile.meijer.activity.find.viewmodel.r.f109823c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.meijer.mobile.meijer.activity.find.viewmodel.r.f109822b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.meijer.mobile.meijer.activity.find.viewmodel.r.f109821a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.meijer.mobile.meijer.activity.find.viewmodel.r.f109824d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f108059a;

        b(LocalThemeScope localThemeScope) {
            this.f108059a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1384729108, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity.bazaarVoiceEmptyReviews.<anonymous> (ProductDetailActivity.kt:913)");
            }
            LocalThemeScope localThemeScope = this.f108059a;
            e.c cVarI = P0.e.INSTANCE.i();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), cVarI, composer, 48);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            float fP = H1.h.p(22);
            int i11 = LocalThemeScope.f17314g;
            yr.h0.c(localThemeScope, null, 0.0d, fP, null, null, null, null, 0, composer, i11 | 3456, 249);
            C14890K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(8)), composer, 6);
            si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne(), null, 383, null), C16338g.c(Lp.c.f19324B0, composer, 0), null, composer, i11 | (q1.Label.f142335j << 3), 4);
            composer.v();
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f108060a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProductDetailActivity f108061b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProductDetailsState f108062c;

        c(LocalThemeScope localThemeScope, ProductDetailActivity productDetailActivity, ProductDetailsState c12388j1) {
            this.f108060a = localThemeScope;
            this.f108061b = productDetailActivity;
            this.f108062c = c12388j1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.w(semantics);
            return Unit.f143329a;
        }

        public final void c(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1209520011, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity.bazaarVoiceEmptyReviews.<anonymous> (ProductDetailActivity.kt:928)");
            }
            LocalThemeScope localThemeScope = this.f108060a;
            final ProductDetailActivity productDetailActivity = this.f108061b;
            final ProductDetailsState c12388j1 = this.f108062c;
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 16;
            Modifier modifierD = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null), 0.0f, 1, null), null, false, 3, null), localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.A
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ProductDetailActivity.c.d((r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierC = C16819m.c(modifierD, false, (Function1) objB);
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierC);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            C17983Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), H1.h.p(24), H1.h.p(f10), 0.0f, 8, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 382, null);
            String strC = C16338g.c(Lp.c.f19330E0, composer, 0);
            int i11 = LocalThemeScope.f17314g;
            si.j.h(localThemeScope, label, strC, null, composer, i11 | (q1.Label.f142335j << 3), 4);
            Modifier modifierK = androidx.compose.foundation.layout.D.k(companion, H1.h.p(f10), 0.0f, 2, null);
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(productDetailActivity) | composer.D(c12388j1);
            Object objB2 = composer.B();
            if (zD || objB2 == companion2.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.B
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductDetailActivity.c.e(productDetailActivity, c12388j1);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            com.meijer.mobile.reviews.ux.productreview.M0.E(localThemeScope, modifierK, (Function0) objB2, composer, i11 | 48, 0);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(ProductDetailActivity productDetailActivity, ProductDetailsState c12388j1) {
            if (productDetailActivity.getUserManager().b()) {
                productDetailActivity.productRateAndReviewLauncher.a(Bl.o.f3147a.e(productDetailActivity, new ProductInfoForReviewSubmit(productDetailActivity.y2().getCode(), ((ProductImageViewModel) CollectionsKt.s0(c12388j1.q())).c(), c12388j1.M())));
            } else {
                productDetailActivity.onSignIn();
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f108063a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ double f108064b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f108065c;

        d(LocalThemeScope localThemeScope, double d10, int i10) {
            this.f108063a = localThemeScope;
            this.f108064b = d10;
            this.f108065c = i10;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1183391630, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity.bazaarVoiceFullReviewsList.<anonymous> (ProductDetailActivity.kt:1014)");
            }
            LocalThemeScope localThemeScope = this.f108063a;
            double d10 = this.f108064b;
            int i11 = this.f108065c;
            e.c cVarI = P0.e.INSTANCE.i();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), cVarI, composer, 48);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            float fP = H1.h.p(22);
            int i12 = LocalThemeScope.f17314g;
            yr.h0.c(localThemeScope, null, d10, fP, null, null, null, null, 0, composer, i12 | 3072, 249);
            q1.Label label = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null);
            AbstractC6392a.Companion companion3 = AbstractC6392a.INSTANCE;
            AbstractC6392a abstractC6392aD = companion3.d(Lp.c.f19334G0, com.meijer.mobile.reviews.ux.productreview.V0.b(d10));
            int i13 = AbstractC6392a.f60445b;
            String strA = C13698b.a(abstractC6392aD, composer, i13);
            int i14 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strA, null, composer, i12 | (i14 << 3), 4);
            C14890K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(8)), composer, 6);
            si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne(), null, 381, null), C13698b.a(companion3.b(Lp.b.f19319b, i11, new Object[0]), composer, i13), null, composer, i12 | (i14 << 3), 4);
            composer.v();
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f108066a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ double f108067b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f108068c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f108069d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ RatingsDistribution f108070e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ProductDetailActivity f108071f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProductDetailsState f108072g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<ProductReviewDetails> f108073h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<ki.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f108074a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ProductDetailActivity f108075b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ProductDetailsState f108076c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity$e$a$a, reason: collision with other inner class name */
            static final class C1627a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f108077a;

                C1627a(LocalThemeScope localThemeScope) {
                    this.f108077a = localThemeScope;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1495043765, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity.bazaarVoiceFullReviewsList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductDetailActivity.kt:1207)");
                    }
                    LocalThemeScope localThemeScope = this.f108077a;
                    si.j.h(localThemeScope, new q1.Label(null, this.f108077a.getAdsColors().getAdsColorLink(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight(), null, 381, null), C16338g.c(Lp.c.f19392k0, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(LocalThemeScope localThemeScope, ProductDetailActivity productDetailActivity, ProductDetailsState c12388j1) {
                this.f108074a = localThemeScope;
                this.f108075b = productDetailActivity;
                this.f108076c = c12388j1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(ProductDetailActivity productDetailActivity, ProductDetailsState c12388j1) {
                productDetailActivity.startActivity(Bl.o.f3147a.c(productDetailActivity, new ProductInformation(productDetailActivity.y2().getCode(), c12388j1.M(), ((ProductImageViewModel) CollectionsKt.s0(c12388j1.q())).c())));
                return Unit.f143329a;
            }

            public final void b(ki.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(1465582722, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity.bazaarVoiceFullReviewsList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductDetailActivity.kt:1192)");
                }
                LocalThemeScope localThemeScope = this.f108074a;
                q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, Modifier.INSTANCE, false, null, 895, null);
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f108075b) | composer.D(this.f108076c);
                final ProductDetailActivity productDetailActivity = this.f108075b;
                final ProductDetailsState c12388j1 = this.f108076c;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.L
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProductDetailActivity.e.a.c(productDetailActivity, c12388j1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                oi.E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(1495043765, true, new C1627a(this.f108074a), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        e(LocalThemeScope localThemeScope, double d10, int i10, int i11, RatingsDistribution ratingsDistribution, ProductDetailActivity productDetailActivity, ProductDetailsState c12388j1, List<ProductReviewDetails> list) {
            this.f108066a = localThemeScope;
            this.f108067b = d10;
            this.f108068c = i10;
            this.f108069d = i11;
            this.f108070e = ratingsDistribution;
            this.f108071f = productDetailActivity;
            this.f108072g = c12388j1;
            this.f108073h = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.w(semantics);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(ProductDetailActivity productDetailActivity, ReviewItem reviewItem, int i10) {
            Bl.o oVar = Bl.o.f3147a;
            productDetailActivity.startActivity(Bl.o.b(productDetailActivity, i10, reviewItem.c()));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit w(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit x(ProductDetailActivity productDetailActivity, ProductDetailsState c12388j1, int i10) {
            productDetailActivity.startActivity(Bl.o.f3147a.d(productDetailActivity, new ProductInformation(productDetailActivity.y2().getCode(), c12388j1.M(), ((ProductImageViewModel) CollectionsKt.s0(c12388j1.q())).c()), i10));
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            o(composer, num.intValue());
            return Unit.f143329a;
        }

        public final void o(Composer composer, int i10) {
            LocalThemeScope localThemeScope;
            List<ProductReviewDetails> list;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-85552457, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity.bazaarVoiceFullReviewsList.<anonymous> (ProductDetailActivity.kt:1050)");
            }
            LocalThemeScope localThemeScope2 = this.f108066a;
            double d10 = this.f108067b;
            int i11 = this.f108068c;
            int i12 = this.f108069d;
            RatingsDistribution ratingsDistribution = this.f108070e;
            final ProductDetailActivity productDetailActivity = this.f108071f;
            final ProductDetailsState c12388j1 = this.f108072g;
            List<ProductReviewDetails> list2 = this.f108073h;
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 16;
            Modifier modifierD = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null), 0.0f, 1, null), null, false, 3, null), localThemeScope2.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.C
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ProductDetailActivity.e.p((r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierC = C16819m.c(modifierD, false, (Function1) objB);
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierC);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            String strC = C16338g.c(Lp.c.f19330E0, composer, 0);
            Ki.I four = localThemeScope2.getAdsTypography().getHeadings().getFour();
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), H1.h.p(24), H1.h.p(f10), 0.0f, 8, null);
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion2.a()) {
                objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.D
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ProductDetailActivity.e.w((r1.u) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            q1.Label label = new q1.Label(C16819m.c(modifierM, true, (Function1) objB2), null, null, null, 0, false, 0, four, null, 382, null);
            int i13 = LocalThemeScope.f17314g;
            si.j.h(localThemeScope2, label, strC, null, composer, i13 | (q1.Label.f142335j << 3), 4);
            List<ProductReviewDetails> list3 = list2;
            C12880x0.l(localThemeScope2, androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), d10, i11, i12, i11, composer, i13 | 48, 0);
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            ProductReviewSummary productReviewSummary = new ProductReviewSummary(i11, CollectionsKt.p(Integer.valueOf(ratingsDistribution.getOneStarCount()), Integer.valueOf(ratingsDistribution.getTwoStarCount()), Integer.valueOf(ratingsDistribution.getThreeStarCount()), Integer.valueOf(ratingsDistribution.getFourStarCount()), Integer.valueOf(ratingsDistribution.getFiveStarCount())), i12, Double.parseDouble(com.meijer.mobile.reviews.ux.productreview.V0.b(d10)));
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(productDetailActivity) | composer.D(c12388j1);
            Object objB3 = composer.B();
            if (zD || objB3 == companion2.a()) {
                objB3 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.E
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ProductDetailActivity.e.x(productDetailActivity, c12388j1, ((Integer) obj).intValue());
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            Composer composer2 = composer;
            C12880x0.s(localThemeScope2, modifierH, productReviewSummary, (Function1) objB3, composer2, i13 | 48, 0);
            composer2.startReplaceGroup(-2010192584);
            for (final ProductReviewDetails productReviewDetails : list3) {
                String reviewId = productReviewDetails.getReviewId();
                String title = productReviewDetails.getTitle();
                String description = productReviewDetails.getDescription();
                Boolean isRecommended = productReviewDetails.getIsRecommended();
                String str = productReviewDetails.getSubmissionDate().atZone(ZoneId.systemDefault()).format(C17898a.NUMERIC_MONTH_DAY);
                final ReviewItem reviewItem = new ReviewItem(reviewId, title, description, 4, isRecommended, C13698b.a(str != null ? AbstractC6392a.INSTANCE.d(Lp.c.f19359T, str, productReviewDetails.getUserName()) : null, composer2, AbstractC6392a.f60445b), productReviewDetails.getRating(), productReviewDetails.getUpVoteCount(), productReviewDetails.getDownVoteCount(), productReviewDetails.e());
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion4, H1.h.p(f10), H1.h.p(f10), 0.0f, H1.h.p(f10), 4, null);
                String title2 = reviewItem.getTitle();
                String reviewText = reviewItem.getReviewText();
                int maxLines = reviewItem.getMaxLines();
                Boolean isRecommended2 = reviewItem.getIsRecommended();
                String date = reviewItem.getDate();
                double starsRating = reviewItem.getStarsRating();
                int thumbsUpCount = reviewItem.getThumbsUpCount();
                int thumbsDownCount = reviewItem.getThumbsDownCount();
                List<String> listC = reviewItem.c();
                composer2.startReplaceGroup(-1633490746);
                boolean zD2 = composer2.D(productDetailActivity) | composer2.D(productReviewDetails);
                Object objB4 = composer2.B();
                if (zD2 || objB4 == Composer.INSTANCE.a()) {
                    objB4 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.F
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProductDetailActivity.e.u(productDetailActivity, productReviewDetails);
                        }
                    };
                    composer2.t(objB4);
                }
                Function0 function0 = (Function0) objB4;
                composer2.P();
                composer2.startReplaceGroup(-1633490746);
                boolean zD3 = composer2.D(productDetailActivity) | composer2.D(reviewItem);
                Object objB5 = composer2.B();
                if (zD3 || objB5 == Composer.INSTANCE.a()) {
                    objB5 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.G
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProductDetailActivity.e.q(productDetailActivity, reviewItem);
                        }
                    };
                    composer2.t(objB5);
                }
                Function0 function02 = (Function0) objB5;
                composer2.P();
                composer2.startReplaceGroup(-1633490746);
                boolean zD4 = composer2.D(productDetailActivity) | composer2.D(productReviewDetails);
                Object objB6 = composer2.B();
                if (zD4 || objB6 == Composer.INSTANCE.a()) {
                    objB6 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.H
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProductDetailActivity.e.r(productDetailActivity, productReviewDetails);
                        }
                    };
                    composer2.t(objB6);
                }
                Function0 function03 = (Function0) objB6;
                composer2.P();
                composer2.startReplaceGroup(-1633490746);
                boolean zD5 = composer2.D(productDetailActivity) | composer2.D(productReviewDetails);
                Object objB7 = composer2.B();
                if (zD5 || objB7 == Composer.INSTANCE.a()) {
                    objB7 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.I
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProductDetailActivity.e.s(productDetailActivity, productReviewDetails);
                        }
                    };
                    composer2.t(objB7);
                }
                Function0 function04 = (Function0) objB7;
                composer2.P();
                composer2.startReplaceGroup(-1633490746);
                boolean zD6 = composer2.D(productDetailActivity) | composer2.D(reviewItem);
                Object objB8 = composer2.B();
                if (zD6 || objB8 == Composer.INSTANCE.a()) {
                    objB8 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.J
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ProductDetailActivity.e.t(productDetailActivity, reviewItem, ((Integer) obj).intValue());
                        }
                    };
                    composer2.t(objB8);
                }
                composer2.P();
                com.meijer.mobile.reviews.ux.productreview.M0.q(localThemeScope2, modifierM2, new ProductReviewDecorator(title2, reviewText, maxLines, isRecommended2, date, starsRating, thumbsUpCount, thumbsDownCount, listC, function0, function02, function03, function04, (Function1) objB8, false, 16384, null), productDetailActivity.getFeatureManager().e(AbstractC18503f.C2788f.f172876h), composer2, LocalThemeScope.f17314g | 48 | (ProductReviewDecorator.f116578p << 6), 0);
                composer2.startReplaceGroup(-2010076139);
                List<ProductReviewDetails> list4 = list3;
                if (list4.indexOf(productReviewDetails) != list4.size() - 1) {
                    list = list4;
                    localThemeScope = localThemeScope2;
                    C17983Z.a(androidx.compose.foundation.layout.D.k(companion4, H1.h.p(f10), 0.0f, 2, null), localThemeScope2.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 6, 12);
                    composer2 = composer;
                } else {
                    localThemeScope = localThemeScope2;
                    list = list4;
                }
                composer2.P();
                localThemeScope2 = localThemeScope;
                list3 = list;
            }
            LocalThemeScope localThemeScope3 = localThemeScope2;
            composer2.P();
            composer2.startReplaceGroup(-2010063384);
            if (i11 > 5) {
                Modifier modifierH2 = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null), 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.b(), P0.e.INSTANCE.l(), composer2, 6);
                int iA2 = C5859f.a(composer2, 0);
                InterfaceC5884s interfaceC5884sR2 = composer2.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierH2);
                InterfaceC5953g.Companion companion5 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A2 = companion5.a();
                if (composer2.k() == null) {
                    C5859f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A2);
                } else {
                    composer2.s();
                }
                Composer composerA2 = androidx.compose.runtime.D1.a(composer2);
                androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion5.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion5.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion5.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion5.f());
                C14889J c14889j = C14889J.f139620a;
                Ki.Q.e(localThemeScope3, C15132A.f141851a, ComposableLambdaKt.c(1465582722, true, new a(localThemeScope3, productDetailActivity, c12388j1), composer2, 54), composer2, LocalThemeScope.f17314g | 384 | (C15132A.f141852b << 3));
                composer2.v();
            }
            composer2.P();
            Modifier modifierK = androidx.compose.foundation.layout.D.k(Modifier.INSTANCE, H1.h.p(f10), 0.0f, 2, null);
            composer2.startReplaceGroup(-1633490746);
            boolean zD7 = composer2.D(productDetailActivity) | composer2.D(c12388j1);
            Object objB9 = composer2.B();
            if (zD7 || objB9 == Composer.INSTANCE.a()) {
                objB9 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.K
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductDetailActivity.e.v(productDetailActivity, c12388j1);
                    }
                };
                composer2.t(objB9);
            }
            composer2.P();
            com.meijer.mobile.reviews.ux.productreview.M0.E(localThemeScope3, modifierK, (Function0) objB9, composer2, LocalThemeScope.f17314g | 48, 0);
            composer.v();
            Unit unit = Unit.f143329a;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(ProductDetailActivity productDetailActivity, ReviewItem reviewItem) {
            productDetailActivity.startActivity(Bl.o.a(productDetailActivity, reviewItem));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(ProductDetailActivity productDetailActivity, ProductReviewDetails productReviewDetails) {
            productDetailActivity.z2().Q0(new a2.VotePositive(productDetailActivity.y2(), productReviewDetails));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(ProductDetailActivity productDetailActivity, ProductReviewDetails productReviewDetails) {
            productDetailActivity.z2().Q0(new a2.VoteNegative(productDetailActivity.y2(), productReviewDetails));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit u(ProductDetailActivity productDetailActivity, ProductReviewDetails productReviewDetails) {
            productDetailActivity.z2().Q0(new a2.Report(productDetailActivity.y2(), productReviewDetails));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit v(ProductDetailActivity productDetailActivity, ProductDetailsState c12388j1) {
            if (productDetailActivity.getUserManager().b()) {
                productDetailActivity.productRateAndReviewLauncher.a(Bl.o.f3147a.e(productDetailActivity, new ProductInfoForReviewSubmit(productDetailActivity.y2().getCode(), ((ProductImageViewModel) CollectionsKt.s0(c12388j1.q())).c(), c12388j1.M())));
            } else {
                productDetailActivity.onSignIn();
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f108078a;

        f(LocalThemeScope localThemeScope) {
            this.f108078a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(903386451, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity.bazaarVoiceLoadingReviews.<anonymous> (ProductDetailActivity.kt:862)");
            }
            LocalThemeScope localThemeScope = this.f108078a;
            e.c cVarI = P0.e.INSTANCE.i();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), cVarI, composer, 48);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            float fP = H1.h.p(22);
            int i11 = LocalThemeScope.f17314g;
            yr.h0.c(localThemeScope, null, 0.0d, fP, null, null, null, null, 0, composer, i11 | 3456, 249);
            C14890K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(8)), composer, 6);
            si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne(), null, 383, null), C16338g.c(Lp.c.f19324B0, composer, 0), null, composer, i11 | (q1.Label.f142335j << 3), 4);
            composer.v();
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class g implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f108079a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f108080a;

            a(LocalThemeScope localThemeScope) {
                this.f108080a = localThemeScope;
            }

            public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(588731377, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity.bazaarVoiceLoadingReviews.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductDetailActivity.kt:895)");
                }
                q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                Ci.o oVar = Ci.o.f4629a;
                Ci.m.d(this.f108080a, androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f17314g | 3120 | (q1.k.Large.f142345f << 6), 56);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
                a(interfaceC15154X, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        g(LocalThemeScope localThemeScope) {
            this.f108079a = localThemeScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.w(semantics);
            return Unit.f143329a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2031311498, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity.bazaarVoiceLoadingReviews.<anonymous> (ProductDetailActivity.kt:877)");
            }
            LocalThemeScope localThemeScope = this.f108079a;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierD = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(16), 0.0f, 0.0f, 13, null), 0.0f, 1, null), null, false, 3, null), localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.M
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ProductDetailActivity.g.c((r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierC = C16819m.c(modifierD, false, (Function1) objB);
            C5800d.m mVarH = C5800d.f48779a.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierC);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(32), 0.0f, H1.h.p(56), 5, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyG = C5804h.g(companion2.e(), false);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyG, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
            C5806j c5806j = C5806j.f48836a;
            Ki.Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(588731377, true, new a(localThemeScope), composer, 54), composer, LocalThemeScope.f17314g | 384 | (Q0.b.f141967b << 3));
            composer.v();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class h implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f108081a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProductDetailsState f108082b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProductDetailActivity f108083c;

        h(LocalThemeScope localThemeScope, ProductDetailsState c12388j1, ProductDetailActivity productDetailActivity) {
            this.f108081a = localThemeScope;
            this.f108082b = c12388j1;
            this.f108083c = productDetailActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(ProductDetailActivity productDetailActivity, GoogleAdAnalytics googleAdAnalytics) {
            Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
            productDetailActivity.z2().S0(new AbstractC12425x.GoogleAdClicked(googleAdAnalytics));
            return Unit.f143329a;
        }

        public final void b(Composer composer, int i10) {
            Composer composer2;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1009024725, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity.bindGoogleAdsBottom.<anonymous> (ProductDetailActivity.kt:986)");
            }
            LocalThemeScope localThemeScope = this.f108081a;
            ProductDetailsState c12388j1 = this.f108082b;
            final ProductDetailActivity productDetailActivity = this.f108083c;
            GoogleAdData googleAdDataU = c12388j1.getGoogleAdData();
            composer.startReplaceGroup(989851205);
            if (googleAdDataU == null) {
                composer2 = composer;
            } else {
                float f10 = 8;
                Modifier modifierM = androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, H1.h.p(f10), 0.0f, H1.h.p(f10), 5, null);
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(productDetailActivity);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.N
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ProductDetailActivity.h.c(productDetailActivity, (GoogleAdAnalytics) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                composer2 = composer;
                sr.p.C(localThemeScope, modifierM, googleAdDataU, (Function1) objB, composer2, LocalThemeScope.f17314g | 48 | (GoogleAdData.f134248f << 6), 0);
            }
            composer2.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f108084a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProductDetailsState f108085b;

        i(LocalThemeScope localThemeScope, ProductDetailsState c12388j1) {
            this.f108084a = localThemeScope;
            this.f108085b = c12388j1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(681233955, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity.bindProductDetails.<anonymous>.<anonymous> (ProductDetailActivity.kt:675)");
            }
            LocalThemeScope localThemeScope = this.f108084a;
            ProductDetailsState c12388j1 = this.f108085b;
            Mj.g.l(localThemeScope, null, Intrinsics.e(c12388j1.getCartEligibility(), ProductEligibility.a.l.f167280a), Intrinsics.e(c12388j1.getCartEligibility(), ProductEligibility.a.c.f167271a), c12388j1.getIsBuyAgain(), false, c12388j1.y(), false, false, false, false, null, null, null, null, null, null, null, null, null, composer, LocalThemeScope.f17314g, 0, 524241);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class j implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f108086a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProductDetailsState f108087b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProductDetailActivity f108088c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends FunctionReferenceImpl implements Function2<nk.f, String, Unit> {
            a(Object obj) {
                super(2, obj, ProductDetailActivity.class, "goToPDP", "goToPDP(Lcom/meijer/mobile/core/models/products/ProductIdentity;Ljava/lang/String;)V", 0);
            }

            public final void a(nk.f p02, String str) {
                Intrinsics.j(p02, "p0");
                ((ProductDetailActivity) this.receiver).A2(p02, str);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(nk.f fVar, String str) {
                a(fVar, str);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class b extends FunctionReferenceImpl implements Function2<ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> {
            b(Object obj) {
                super(2, obj, ProductDetailActivity.class, "onEntryUpdate", "onEntryUpdate(Lcom/meijer/mobile/product/model/fulldetails/ProductFullDetails;Lcom/meijer/mobile/core/design/widget/stepperview/ControlState;)V", 0);
            }

            public final void a(ProductFullDetails p02, com.meijer.mobile.core.design.widget.stepperview.a p12) {
                Intrinsics.j(p02, "p0");
                Intrinsics.j(p12, "p1");
                ((ProductDetailActivity) this.receiver).L2(p02, p12);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ProductFullDetails productFullDetails, com.meijer.mobile.core.design.widget.stepperview.a aVar) {
                a(productFullDetails, aVar);
                return Unit.f143329a;
            }
        }

        j(LocalThemeScope localThemeScope, ProductDetailsState c12388j1, ProductDetailActivity productDetailActivity) {
            this.f108086a = localThemeScope;
            this.f108087b = c12388j1;
            this.f108088c = productDetailActivity;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-157142809, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity.bindProductRecommendations.<anonymous> (ProductDetailActivity.kt:786)");
            }
            LocalThemeScope localThemeScope = this.f108086a;
            ProductDetailsState c12388j1 = this.f108087b;
            final ProductDetailActivity productDetailActivity = this.f108088c;
            int i11 = com.meijer.mobile.meijer.Y.f100937g6;
            com.meijer.mobile.meijer.activity.find.viewmodel.r rVarT = c12388j1.getFrequentlyBoughtTogetherProductsLoadingStatus();
            List<SuggestedProductCarouselDecorator> listS = c12388j1.s();
            if (listS == null) {
                listS = CollectionsKt.m();
            }
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(productDetailActivity);
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new a(productDetailActivity);
                composer.t(objB);
            }
            composer.P();
            Function2 function2 = (Function2) ((KFunction) objB);
            composer.startReplaceGroup(5004770);
            boolean zD2 = composer.D(productDetailActivity);
            Object objB2 = composer.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.O
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductDetailActivity.j.c(productDetailActivity);
                    }
                };
                composer.t(objB2);
            }
            Function0 function0 = (Function0) objB2;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zD3 = composer.D(productDetailActivity);
            Object objB3 = composer.B();
            if (zD3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new b(productDetailActivity);
                composer.t(objB3);
            }
            composer.P();
            u2.b(localThemeScope, null, i11, rVarT, listS, function2, function0, (Function2) ((KFunction) objB3), composer, LocalThemeScope.f17314g, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(ProductDetailActivity productDetailActivity) {
            productDetailActivity.z2().S0(new AbstractC12425x.GetFrequentlyBoughtTogetherProducts(productDetailActivity.y2()));
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/meijer/mobile/meijer/activity/find/productdetail/ProductDetailActivity$k", "LDs/a$a;", "Landroid/transition/Transition;", "transition", "", "onTransitionEnd", "(Landroid/transition/Transition;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class k extends a.C0135a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Tm.b f108089a;

        k(Tm.b bVar) {
            this.f108089a = bVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            Intrinsics.j(transition, "transition");
            this.f108089a.v();
            transition.removeListener(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class l implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ProductDetailActivity f108091a;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity$onCreate$1$1$1$1$1", f = "ProductDetailActivity.kt", l = {257}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity$l$a$a, reason: collision with other inner class name */
            static final class C1628a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f108092a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ProductDetailActivity f108093b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f108094c;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity$onCreate$1$1$1$1$1$1", f = "ProductDetailActivity.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity$l$a$a$a, reason: collision with other inner class name */
                static final class C1629a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f108095a;

                    /* renamed from: b, reason: collision with root package name */
                    private /* synthetic */ Object f108096b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ ProductDetailActivity f108097c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f108098d;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity$onCreate$1$1$1$1$1$1$1", f = "ProductDetailActivity.kt", l = {259}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity$l$a$a$a$a, reason: collision with other inner class name */
                    static final class C1630a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f108099a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ ProductDetailActivity f108100b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f108101c;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity$l$a$a$a$a$a, reason: collision with other inner class name */
                        static final class C1631a<T> implements InterfaceC16562g {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ ProductDetailActivity f108102a;

                            /* renamed from: b, reason: collision with root package name */
                            final /* synthetic */ LocalThemeScope f108103b;

                            C1631a(ProductDetailActivity productDetailActivity, LocalThemeScope localThemeScope) {
                                this.f108102a = productDetailActivity;
                                this.f108103b = localThemeScope;
                            }

                            @Override // pv.InterfaceC16562g
                            /* renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Object emit(ProductDetailsState c12388j1, Continuation<? super Unit> continuation) {
                                this.f108102a.S2(c12388j1, this.f108103b);
                                return Unit.f143329a;
                            }
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C1630a(this.f108100b, this.f108101c, continuation);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1630a(ProductDetailActivity productDetailActivity, LocalThemeScope localThemeScope, Continuation<? super C1630a> continuation) {
                            super(2, continuation);
                            this.f108100b = productDetailActivity;
                            this.f108101c = localThemeScope;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                            return ((C1630a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object objF = IntrinsicsKt.f();
                            int i10 = this.f108099a;
                            if (i10 != 0) {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.b(obj);
                            } else {
                                ResultKt.b(obj);
                                pv.P<ProductDetailsState> pB0 = this.f108100b.z2().B0();
                                C1631a c1631a = new C1631a(this.f108100b, this.f108101c);
                                this.f108099a = 1;
                                if (pB0.collect(c1631a, this) == objF) {
                                    return objF;
                                }
                            }
                            throw new KotlinNothingValueException();
                        }
                    }

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity$onCreate$1$1$1$1$1$1$2", f = "ProductDetailActivity.kt", l = {264}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity$l$a$a$a$b */
                    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f108104a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ ProductDetailActivity f108105b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f108106c;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity$l$a$a$a$b$a, reason: collision with other inner class name */
                        static final class C1632a<T> implements InterfaceC16562g {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ ProductDetailActivity f108107a;

                            /* renamed from: b, reason: collision with root package name */
                            final /* synthetic */ LocalThemeScope f108108b;

                            C1632a(ProductDetailActivity productDetailActivity, LocalThemeScope localThemeScope) {
                                this.f108107a = productDetailActivity;
                                this.f108108b = localThemeScope;
                            }

                            @Override // pv.InterfaceC16562g
                            /* renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Object emit(com.meijer.mobile.meijer.activity.find.viewmodel.G0 g02, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                                ProductDetailActivity productDetailActivity = this.f108107a;
                                productDetailActivity.M2(g02, this.f108108b, productDetailActivity);
                                return Unit.f143329a;
                            }
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new b(this.f108105b, this.f108106c, continuation);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        b(ProductDetailActivity productDetailActivity, LocalThemeScope localThemeScope, Continuation<? super b> continuation) {
                            super(2, continuation);
                            this.f108105b = productDetailActivity;
                            this.f108106c = localThemeScope;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object objF = IntrinsicsKt.f();
                            int i10 = this.f108104a;
                            if (i10 != 0) {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.b(obj);
                            } else {
                                ResultKt.b(obj);
                                InterfaceC16553F<com.meijer.mobile.meijer.activity.find.viewmodel.G0> interfaceC16553FZ0 = this.f108105b.z2().z0();
                                C1632a c1632a = new C1632a(this.f108105b, this.f108106c);
                                this.f108104a = 1;
                                if (interfaceC16553FZ0.collect(c1632a, this) == objF) {
                                    return objF;
                                }
                            }
                            throw new KotlinNothingValueException();
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C1629a c1629a = new C1629a(this.f108097c, this.f108098d, continuation);
                        c1629a.f108096b = obj;
                        return c1629a;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1629a(ProductDetailActivity productDetailActivity, LocalThemeScope localThemeScope, Continuation<? super C1629a> continuation) {
                        super(2, continuation);
                        this.f108097c = productDetailActivity;
                        this.f108098d = localThemeScope;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                        return ((C1629a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.f();
                        if (this.f108095a == 0) {
                            ResultKt.b(obj);
                            InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f108096b;
                            C15809k.d(interfaceC15783O, null, null, new C1630a(this.f108097c, this.f108098d, null), 3, null);
                            C15809k.d(interfaceC15783O, null, null, new b(this.f108097c, this.f108098d, null), 3, null);
                            return Unit.f143329a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1628a(this.f108093b, this.f108094c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1628a(ProductDetailActivity productDetailActivity, LocalThemeScope localThemeScope, Continuation<? super C1628a> continuation) {
                    super(2, continuation);
                    this.f108093b = productDetailActivity;
                    this.f108094c = localThemeScope;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C1628a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f108092a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        ProductDetailActivity productDetailActivity = this.f108093b;
                        AbstractC6165l.b bVar = AbstractC6165l.b.f55502d;
                        C1629a c1629a = new C1629a(productDetailActivity, this.f108094c, null);
                        this.f108092a = 1;
                        if (C6136J.b(productDetailActivity, bVar, c1629a, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            a(ProductDetailActivity productDetailActivity) {
                this.f108091a = productDetailActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Nn.I c(ProductDetailActivity productDetailActivity, LocalThemeScope localThemeScope, LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
                Intrinsics.j(layoutInflater, "<unused var>");
                Intrinsics.j(viewGroup, "<unused var>");
                C15809k.d(C6173t.a(productDetailActivity), null, null, new C1628a(productDetailActivity, localThemeScope, null), 3, null);
                Nn.I i10 = productDetailActivity.binding;
                if (i10 == null) {
                    Intrinsics.x("binding");
                    i10 = null;
                }
                FS.unmask(i10.getRoot());
                Long lX = StringsKt.x(productDetailActivity.y2().getCode());
                if (lX != null) {
                    CouponOptions couponOptions = new CouponOptions(null, null, CouponsSortType.EXPIRING, false, false, 0L, null, null, false, null, CollectionsKt.s(Long.valueOf(lX.longValue())), false, false, 7163, null);
                    androidx.fragment.app.S sBeginTransaction = productDetailActivity.getSupportFragmentManager().beginTransaction();
                    sBeginTransaction.r(com.meijer.mobile.meijer.T.f100128w5, CouponsFragment.Companion.b(CouponsFragment.INSTANCE, Qk.c.f31044h, couponOptions, null, 4, null));
                    sBeginTransaction.h();
                    Nn.I i11 = productDetailActivity.binding;
                    if (i11 == null) {
                        Intrinsics.x("binding");
                        i11 = null;
                    }
                    FrameLayout productDetailCouponsContainer = i11.f21434U;
                    Intrinsics.i(productDetailCouponsContainer, "productDetailCouponsContainer");
                    productDetailCouponsContainer.setVisibility(0);
                }
                Nn.I i12 = productDetailActivity.binding;
                if (i12 != null) {
                    return i12;
                }
                Intrinsics.x("binding");
                return null;
            }

            public final void b(final LocalThemeScope AdsTheme, Composer composer, int i10) {
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(648153802, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity.onCreate.<anonymous>.<anonymous> (ProductDetailActivity.kt:254)");
                }
                composer.startReplaceGroup(-1633490746);
                boolean zD = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(AdsTheme))) | composer.D(this.f108091a);
                final ProductDetailActivity productDetailActivity = this.f108091a;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function3() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.P
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return ProductDetailActivity.l.a.c(productDetailActivity, AdsTheme, (LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                androidx.compose.ui.viewinterop.a.a((Function3) objB, androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), null, composer, 48, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                b(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        l() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-597552325, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity.onCreate.<anonymous> (ProductDetailActivity.kt:253)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(648153802, true, new a(ProductDetailActivity.this), composer, 54), composer, 48, 1);
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

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"com/meijer/mobile/meijer/activity/find/productdetail/ProductDetailActivity$m", "LXj/a;", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "controlState", "Landroid/graphics/Rect;", "hitRect", "", "b", "(Lcom/meijer/mobile/core/design/widget/stepperview/a;Landroid/graphics/Rect;)V", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class m implements Xj.a {
        @Override // Xj.a
        public void b(com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect hitRect) {
            Intrinsics.j(controlState, "controlState");
            Intrinsics.j(hitRect, "hitRect");
        }

        m() {
        }

        @Override // Xj.a
        public void a(com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect hitRect) {
            Intrinsics.j(controlState, "controlState");
            Intrinsics.j(hitRect, "hitRect");
            ProductDetailActivity.this.z2().S0(new AbstractC12425x.UpdateEntry(controlState.getValueState().getQuantity()));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity$onEvent$5", f = "ProductDetailActivity.kt", l = {553, 553}, m = "invokeSuspend")
    static final class n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f108110a;

        /* renamed from: b, reason: collision with root package name */
        Object f108111b;

        /* renamed from: c, reason: collision with root package name */
        Object f108112c;

        /* renamed from: d, reason: collision with root package name */
        int f108113d;

        /* renamed from: e, reason: collision with root package name */
        int f108114e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f108115f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.meijer.mobile.meijer.activity.find.viewmodel.G0 f108116g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Context f108117h;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new n(this.f108115f, this.f108116g, this.f108117h, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(LocalThemeScope localThemeScope, com.meijer.mobile.meijer.activity.find.viewmodel.G0 g02, Context context, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f108115f = localThemeScope;
            this.f108116g = g02;
            this.f108117h = context;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
        
            if (Hi.i.i(r4, r1, null, null, false, r6, null, null, null, r13, 238, null) == r12) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r13.f108114e
                r1 = 0
                r2 = 2
                r3 = 0
                r4 = 1
                if (r0 == 0) goto L37
                if (r0 == r4) goto L21
                if (r0 != r2) goto L19
                java.lang.Object r0 = r13.f108110a
                Ki.M r0 = (Ki.LocalThemeScope) r0
                kotlin.ResultKt.b(r14)
                goto L92
            L19:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L21:
                int r0 = r13.f108113d
                java.lang.Object r4 = r13.f108112c
                Ki.M r4 = (Ki.LocalThemeScope) r4
                java.lang.Object r5 = r13.f108111b
                android.content.Context r5 = (android.content.Context) r5
                java.lang.Object r6 = r13.f108110a
                com.meijer.mobile.meijer.activity.find.viewmodel.G0 r6 = (com.meijer.mobile.meijer.activity.find.viewmodel.G0) r6
                kotlin.ResultKt.b(r14)
                r7 = r6
                r6 = r5
                r5 = r4
                r4 = r14
                goto L56
            L37:
                kotlin.ResultKt.b(r14)
                Ki.M r0 = r13.f108115f
                com.meijer.mobile.meijer.activity.find.viewmodel.G0 r6 = r13.f108116g
                android.content.Context r5 = r13.f108117h
                r13.f108110a = r6
                r13.f108111b = r5
                r13.f108112c = r0
                r13.f108113d = r1
                r13.f108114e = r4
                r7 = 0
                java.lang.Object r4 = Ki.LocalThemeScope.g(r0, r7, r13, r4, r3)
                if (r4 != r12) goto L52
                goto L91
            L52:
                r7 = r6
                r6 = r5
                r5 = r0
                r0 = r1
            L56:
                Hi.i r4 = (Hi.i) r4
                bk.a$a r8 = bk.AbstractC6392a.INSTANCE
                com.meijer.mobile.meijer.activity.find.viewmodel.G0$c r7 = (com.meijer.mobile.meijer.activity.find.viewmodel.G0.FeedbackSubmissionEvent) r7
                Kp.a r7 = r7.getFeedbackVote()
                Kp.a r10 = Kp.a.f17595a
                if (r7 != r10) goto L67
                int r7 = Lp.c.f19390j0
                goto L69
            L67:
                int r7 = Lp.c.f19420y0
            L69:
                java.lang.Object[] r1 = new java.lang.Object[r1]
                bk.a r1 = r8.d(r7, r1)
                java.lang.String r1 = r1.b(r6)
                ki.q1$m$a$d r6 = ki.q1.m.a.d.f142372a
                r13.f108110a = r5
                r13.f108111b = r3
                r13.f108112c = r3
                r13.f108113d = r0
                r13.f108114e = r2
                r2 = 0
                r3 = 0
                r0 = r4
                r4 = 0
                r5 = r6
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = 238(0xee, float:3.34E-43)
                r11 = 0
                r9 = r13
                java.lang.Object r0 = Hi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L92
            L91:
                return r12
            L92:
                kotlin.Unit r0 = kotlin.Unit.f143329a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity$onEvent$6", f = "ProductDetailActivity.kt", l = {570, 570}, m = "invokeSuspend")
    static final class o extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f108118a;

        /* renamed from: b, reason: collision with root package name */
        Object f108119b;

        /* renamed from: c, reason: collision with root package name */
        int f108120c;

        /* renamed from: d, reason: collision with root package name */
        int f108121d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f108122e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f108123f;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new o(this.f108122e, this.f108123f, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(LocalThemeScope localThemeScope, Context context, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f108122e = localThemeScope;
            this.f108123f = context;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((o) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
        
            if (Hi.i.i((Hi.i) r4, r2, null, null, false, r6, null, null, null, r13, 238, null) == r12) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r13.f108121d
                r1 = 0
                r2 = 0
                r3 = 2
                r4 = 1
                if (r0 == 0) goto L31
                if (r0 == r4) goto L20
                if (r0 != r3) goto L18
                java.lang.Object r0 = r13.f108118a
                Ki.M r0 = (Ki.LocalThemeScope) r0
                kotlin.ResultKt.b(r14)
                goto L79
            L18:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L20:
                int r0 = r13.f108120c
                java.lang.Object r4 = r13.f108119b
                Ki.M r4 = (Ki.LocalThemeScope) r4
                java.lang.Object r5 = r13.f108118a
                android.content.Context r5 = (android.content.Context) r5
                kotlin.ResultKt.b(r14)
                r6 = r5
                r5 = r4
                r4 = r14
                goto L4b
            L31:
                kotlin.ResultKt.b(r14)
                Ki.M r0 = r13.f108122e
                android.content.Context r5 = r13.f108123f
                r13.f108118a = r5
                r13.f108119b = r0
                r13.f108120c = r2
                r13.f108121d = r4
                r6 = 0
                java.lang.Object r4 = Ki.LocalThemeScope.g(r0, r6, r13, r4, r1)
                if (r4 != r12) goto L48
                goto L78
            L48:
                r6 = r5
                r5 = r0
                r0 = r2
            L4b:
                Hi.i r4 = (Hi.i) r4
                bk.a$a r7 = bk.AbstractC6392a.INSTANCE
                int r8 = Lp.c.f19344L0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                bk.a r2 = r7.d(r8, r2)
                java.lang.String r2 = r2.b(r6)
                ki.q1$m$a$d r6 = ki.q1.m.a.d.f142372a
                r13.f108118a = r5
                r13.f108119b = r1
                r13.f108120c = r0
                r13.f108121d = r3
                r1 = r2
                r2 = 0
                r3 = 0
                r0 = r4
                r4 = 0
                r5 = r6
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = 238(0xee, float:3.34E-43)
                r11 = 0
                r9 = r13
                java.lang.Object r0 = Hi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L79
            L78:
                return r12
            L79:
                kotlin.Unit r0 = kotlin.Unit.f143329a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class p implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProductLocationDecorator f108124a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProductDetailActivity f108125b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProductDetailsState f108126c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ProductLocationDecorator f108127a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ProductDetailActivity f108128b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ProductDetailsState f108129c;

            a(ProductLocationDecorator productLocationDecorator, ProductDetailActivity productDetailActivity, ProductDetailsState c12388j1) {
                this.f108127a = productLocationDecorator;
                this.f108128b = productDetailActivity;
                this.f108129c = c12388j1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(ProductDetailActivity productDetailActivity) {
                C18188a.f170828a.a(new ItemLocationInfoBottomDialogFragment(), productDetailActivity, "item_location_info");
                return Unit.f143329a;
            }

            public final void b(LocalThemeScope AdsTheme, Composer composer, int i10) {
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-63765219, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity.onProductDetail.<anonymous>.<anonymous>.<anonymous> (ProductDetailActivity.kt:365)");
                }
                ProductLocationDecorator productLocationDecorator = this.f108127a;
                boolean zE = this.f108128b.getFeatureManager().e(AbstractC18503f.V.f172861h);
                boolean zO = this.f108129c.O();
                Modifier modifierI = androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(16));
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f108128b);
                final ProductDetailActivity productDetailActivity = this.f108128b;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.Q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProductDetailActivity.p.a.c(productDetailActivity);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                K1.C0(AdsTheme, productLocationDecorator, zE, zO, modifierI, (Function0) objB, composer, (i10 & 14) | LocalThemeScope.f17314g | 24576 | (ProductLocationDecorator.f166280l << 3), 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                b(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        p(ProductLocationDecorator productLocationDecorator, ProductDetailActivity productDetailActivity, ProductDetailsState c12388j1) {
            this.f108124a = productLocationDecorator;
            this.f108125b = productDetailActivity;
            this.f108126c = c12388j1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-922122228, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity.onProductDetail.<anonymous>.<anonymous> (ProductDetailActivity.kt:364)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(-63765219, true, new a(this.f108124a, this.f108125b, this.f108126c), composer, 54), composer, 48, 1);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class q implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProductDetailsState f108130a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f108131b;

        q(ProductDetailsState c12388j1, LocalThemeScope localThemeScope) {
            this.f108130a = c12388j1;
            this.f108131b = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2107395020, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity.onProductDetail.<anonymous> (ProductDetailActivity.kt:401)");
            }
            ProductNutritionLabelDecorator productNutritionLabelDecoratorG = this.f108130a.getNutritionLabel();
            if (productNutritionLabelDecoratorG != null) {
                LocalThemeScope localThemeScope = this.f108131b;
                composer.startReplaceGroup(-2017947046);
                C17463f.j(localThemeScope, productNutritionLabelDecoratorG, androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(16)), composer, LocalThemeScope.f17314g | 384 | (ProductNutritionLabelDecorator.f166297b << 3), 0);
                composer.P();
            }
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class r implements InterfaceC14275b, FunctionAdapter {
        r() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ProductDetailActivity.this, ProductDetailActivity.class, "handleRateAndReviewResult", "handleRateAndReviewResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            ProductDetailActivity.this.B2(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class s extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f108133f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ComponentActivity componentActivity) {
            super(0);
            this.f108133f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f108133f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class t extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f108134f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ComponentActivity componentActivity) {
            super(0);
            this.f108134f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f108134f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class u extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f108135f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f108136g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f108135f = function0;
            this.f108136g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f108135f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f108136g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class v implements InterfaceC14275b, FunctionAdapter {
        v() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ProductDetailActivity.this, ProductDetailActivity.class, "handleSubstitutionResult", "handleSubstitutionResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            ProductDetailActivity.this.C2(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A2(nk.f product, String previousTrackAction) {
        ProductFullDetails productFullDetails = product instanceof ProductFullDetails ? (ProductFullDetails) product : null;
        if (productFullDetails != null && productFullDetails.F()) {
            z2().R0(new AbstractC12325a.OnClickCriteoBeacon(productFullDetails));
        }
        startActivity(Bl.g.t(getFeatureEntryPoint(), product, false, false, previousTrackAction, 4, null));
    }

    @SuppressLint({"ShowToast"})
    private final void F2(final nk.c product) {
        Nn.I i10 = this.binding;
        Nn.I i11 = null;
        if (i10 == null) {
            Intrinsics.x("binding");
            i10 = null;
        }
        Snackbar snackbarT0 = Snackbar.q0(i10.getRoot(), C18546a.f173199f, 0).t0(C18546a.f173204k, new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductDetailActivity.G2(this.f108564a, product, view);
            }
        });
        Nn.I i12 = this.binding;
        if (i12 == null) {
            Intrinsics.x("binding");
        } else {
            i11 = i12;
        }
        snackbarT0.X(i11.f21450z).c0();
    }

    @SuppressLint({"ShowToast"})
    private final void H2(final nk.c product) {
        Nn.I i10 = this.binding;
        Nn.I i11 = null;
        if (i10 == null) {
            Intrinsics.x("binding");
            i10 = null;
        }
        Snackbar snackbarT0 = Snackbar.q0(i10.getRoot(), C18546a.f173200g, 0).t0(C18546a.f173205l, new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductDetailActivity.I2(this.f108575a, product, view);
            }
        });
        Nn.I i12 = this.binding;
        if (i12 == null) {
            Intrinsics.x("binding");
        } else {
            i11 = i12;
        }
        snackbarT0.X(i11.f21450z).c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K2(ProductDetailActivity productDetailActivity, a.AbstractC0780a menuAction) {
        ProductDetailActivity productDetailActivity2;
        Intent intentD;
        Intrinsics.j(menuAction, "menuAction");
        if (!Intrinsics.e(menuAction, a.AbstractC0780a.C0781a.f34922a)) {
            productDetailActivity2 = productDetailActivity;
            if (!Intrinsics.e(menuAction, a.AbstractC0780a.b.f34923a)) {
                throw new NoWhenBranchMatchedException();
            }
            intentD = productDetailActivity2.getFeatureEntryPoint().d();
        } else if (productDetailActivity.getFeatureManager().e(AbstractC18503f.t0.f172905h)) {
            productDetailActivity2 = productDetailActivity;
            intentD = Bl.h.c(productDetailActivity2, null, null, null, false, null, 62, null);
        } else {
            productDetailActivity2 = productDetailActivity;
            intentD = Bl.h.g(productDetailActivity2, null, null, null, false, null, 62, null);
        }
        productDetailActivity2.startActivity(intentD);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M2(final com.meijer.mobile.meijer.activity.find.viewmodel.G0 event, LocalThemeScope localThemeScope, Context context) throws Resources.NotFoundException {
        if (event instanceof G0.UpdateShoppingOrFavoriteListFailed) {
            G0.UpdateShoppingOrFavoriteListFailed updateShoppingOrFavoriteListFailed = (G0.UpdateShoppingOrFavoriteListFailed) event;
            new Qj.j(this, updateShoppingOrFavoriteListFailed.getMessageResId(), new Object[0]).r(updateShoppingOrFavoriteListFailed.getTitleResId(), new Object[0]).g();
            return;
        }
        if (event instanceof G0.RequireLogin) {
            new Qj.f(this, ((G0.RequireLogin) event).getMessageResId(), this).g();
            return;
        }
        Nn.I i10 = null;
        if (event instanceof G0.ProductLoadError) {
            Nn.I i11 = this.binding;
            if (i11 == null) {
                Intrinsics.x("binding");
                i11 = null;
            }
            Snackbar snackbarT0 = Snackbar.q0(i11.getRoot(), ((G0.ProductLoadError) event).getMessageResId(), -2).t0(com.meijer.mobile.meijer.Y.f100557Mc, new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProductDetailActivity.N2(this.f108467a, event, view);
                }
            });
            Nn.I i12 = this.binding;
            if (i12 == null) {
                Intrinsics.x("binding");
            } else {
                i10 = i12;
            }
            snackbarT0.X(i10.f21450z).c0();
            return;
        }
        if (event instanceof G0.ViewOnShoppingList) {
            W2(((G0.ViewOnShoppingList) event).getProduct());
            return;
        }
        if (event instanceof G0.ViewOnFavoriteList) {
            U2(((G0.ViewOnFavoriteList) event).getProduct());
            return;
        }
        if (event instanceof G0.d) {
            T2();
            return;
        }
        if (event instanceof G0.ShoppingListItemAdded) {
            H2(((G0.ShoppingListItemAdded) event).getProduct());
            return;
        }
        if (event instanceof G0.FavoriteListItemAdded) {
            F2(((G0.FavoriteListItemAdded) event).getProduct());
            return;
        }
        if (event instanceof G0.AddToCartSuccessEvent) {
            Nn.I i13 = this.binding;
            if (i13 == null) {
                Intrinsics.x("binding");
                i13 = null;
            }
            G0.AddToCartSuccessEvent addToCartSuccessEvent = (G0.AddToCartSuccessEvent) event;
            Snackbar snackbarT02 = Snackbar.q0(i13.getRoot(), addToCartSuccessEvent.getMessageResId(), 0).t0(addToCartSuccessEvent.getActionResId(), new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProductDetailActivity.O2(this.f108480a, view);
                }
            });
            Nn.I i14 = this.binding;
            if (i14 == null) {
                Intrinsics.x("binding");
                i14 = null;
            }
            snackbarT02.X(i14.f21447h0).c0();
            Entry entry = addToCartSuccessEvent.getEntry();
            if (entry != null) {
                CartProductListDecorator cartProductListDecoratorB = CartProductListDecorator.Companion.b(CartProductListDecorator.INSTANCE, entry, false, 2, null);
                if (cartProductListDecoratorB.getStockInfo().c()) {
                    this.substitutionResultLauncher.a(Bl.t.e(Bl.t.f3152a, this, cartProductListDecoratorB, Pp.c.f26248d, null, "product detail page", 8, null));
                    return;
                }
                return;
            }
            return;
        }
        if (event instanceof G0.UpdateToCartFailedEvent) {
            Nn.I i15 = this.binding;
            if (i15 == null) {
                Intrinsics.x("binding");
                i15 = null;
            }
            View root = i15.getRoot();
            String string = getResources().getString(((G0.UpdateToCartFailedEvent) event).getMessageResId());
            Intrinsics.i(string, "getString(...)");
            Snackbar snackbarR0 = Snackbar.r0(root, m2.b.a(string, 0, null, null), 0);
            Intrinsics.i(snackbarR0, "make(...)");
            Snackbar snackbarB = Wj.b.b(snackbarR0);
            Nn.I i16 = this.binding;
            if (i16 == null) {
                Intrinsics.x("binding");
            } else {
                i10 = i16;
            }
            snackbarB.X(i10.f21447h0).c0();
            return;
        }
        if (event instanceof G0.RefreshCartOnListPageEvent) {
            qw.a.INSTANCE.a("Refresh cart event received", new Object[0]);
            if (((G0.RefreshCartOnListPageEvent) event).getShouldRefresh()) {
                setResult(48996);
                return;
            } else {
                setResult(0);
                return;
            }
        }
        if (event instanceof G0.ShowError) {
            Nn.I i17 = this.binding;
            if (i17 == null) {
                Intrinsics.x("binding");
            } else {
                i10 = i17;
            }
            i10.f21447h0.setValueState(new ValueState(0.0d, 0.0d, false, "Each", false, 2.147483647E9d));
            G0.ShowError showError = (G0.ShowError) event;
            new C15485b(this, Cj.p.f5102a).setCancelable(false).setTitle(showError.getTitle()).setMessage(showError.getMessage()).setPositiveButton(showError.getPositiveButtonText(), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.l
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i18) {
                    ProductDetailActivity.P2(dialogInterface, i18);
                }
            }).show();
            return;
        }
        if (event instanceof G0.FeedbackSubmissionEvent) {
            C15809k.d(C6173t.a(this), null, null, new n(localThemeScope, event, context, null), 3, null);
            return;
        }
        if (event instanceof G0.j) {
            C15809k.d(C6173t.a(this), null, null, new o(localThemeScope, context, null), 3, null);
            return;
        }
        if (event instanceof G0.e) {
            Nn.I i18 = this.binding;
            if (i18 == null) {
                Intrinsics.x("binding");
                i18 = null;
            }
            Snackbar snackbarT03 = Snackbar.q0(i18.getRoot(), C17284b.f163321g, 0).t0(C17284b.f163301T0, new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProductDetailActivity.Q2(this.f108500a, view);
                }
            });
            Nn.I i19 = this.binding;
            if (i19 == null) {
                Intrinsics.x("binding");
            } else {
                i10 = i19;
            }
            snackbarT03.X(i10.f21450z).c0();
            return;
        }
        if (event instanceof G0.f) {
            Nn.I i20 = this.binding;
            if (i20 == null) {
                Intrinsics.x("binding");
                i20 = null;
            }
            Snackbar snackbarT04 = Snackbar.q0(i20.getRoot(), C17284b.f163319f, 0).t0(C17284b.f163301T0, new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProductDetailActivity.R2(this.f108511a, view);
                }
            });
            Nn.I i21 = this.binding;
            if (i21 == null) {
                Intrinsics.x("binding");
            } else {
                i10 = i21;
            }
            snackbarT04.X(i10.f21450z).c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V2(nk.f fVar, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("product detail page");
        track.c(Ao.W.f1694a.h(fVar));
        return Unit.f143329a;
    }

    private final void g2(ProductDetailsState details, LocalThemeScope localThemeScope) {
        Nn.I i10 = this.binding;
        Nn.I i11 = null;
        if (i10 == null) {
            Intrinsics.x("binding");
            i10 = null;
        }
        i10.f21416C.setContent(ComposableLambdaKt.composableLambdaInstance(1384729108, true, new b(localThemeScope)));
        Nn.I i12 = this.binding;
        if (i12 == null) {
            Intrinsics.x("binding");
        } else {
            i11 = i12;
        }
        i11.f21417D.setContent(ComposableLambdaKt.composableLambdaInstance(1209520011, true, new c(localThemeScope, this, details)));
    }

    private final void i2(LocalThemeScope localThemeScope) {
        Nn.I i10 = this.binding;
        Nn.I i11 = null;
        if (i10 == null) {
            Intrinsics.x("binding");
            i10 = null;
        }
        i10.f21416C.setContent(ComposableLambdaKt.composableLambdaInstance(903386451, true, new f(localThemeScope)));
        Nn.I i12 = this.binding;
        if (i12 == null) {
            Intrinsics.x("binding");
        } else {
            i11 = i12;
        }
        i11.f21417D.setContent(ComposableLambdaKt.composableLambdaInstance(2031311498, true, new g(localThemeScope)));
    }

    private final void l2(final ProductDetailsState detailsState, LocalThemeScope localThemeScope) {
        boolean zV;
        String strB;
        if (detailsState == null) {
            return;
        }
        Nn.I i10 = this.binding;
        Nn.I i11 = null;
        if (i10 == null) {
            Intrinsics.x("binding");
            i10 = null;
        }
        TextView textView = i10.f21431R;
        Intrinsics.g(textView);
        textView.setVisibility(detailsState.z() ? 0 : 8);
        if (detailsState.U()) {
            Context context = textView.getContext();
            Intrinsics.i(context, "getContext(...)");
            textView.setTextColor(Cj.r.b(context, Cj.f.f4650d, null, false, 6, null));
        }
        Nn.I i12 = this.binding;
        if (i12 == null) {
            Intrinsics.x("binding");
            i12 = null;
        }
        CheckableImageButton checkableImageButton = i12.f21432S;
        checkableImageButton.setOnCheckedChangeListener(new Function2() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.t
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ProductDetailActivity.m2((CheckableImageButton) obj, ((Boolean) obj2).booleanValue());
            }
        });
        checkableImageButton.setChecked(detailsState.V());
        checkableImageButton.setOnCheckedChangeListener(new Function2() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.u
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ProductDetailActivity.n2(detailsState, this, (CheckableImageButton) obj, ((Boolean) obj2).booleanValue());
            }
        });
        Nn.I i13 = this.binding;
        if (i13 == null) {
            Intrinsics.x("binding");
            i13 = null;
        }
        CheckableImageButton checkableImageButton2 = i13.f21439Z;
        Intrinsics.g(checkableImageButton2);
        checkableImageButton2.setVisibility(getFeatureManager().e(AbstractC18503f.A.f172842h) || !getFeatureManager().e(AbstractC18503f.O.f172854h) ? 0 : 8);
        checkableImageButton2.setOnCheckedChangeListener(new Function2() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.v
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ProductDetailActivity.o2((CheckableImageButton) obj, ((Boolean) obj2).booleanValue());
            }
        });
        checkableImageButton2.setChecked(detailsState.T());
        checkableImageButton2.setOnCheckedChangeListener(new Function2() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.w
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ProductDetailActivity.p2(detailsState, this, (CheckableImageButton) obj, ((Boolean) obj2).booleanValue());
            }
        });
        Nn.I i14 = this.binding;
        if (i14 == null) {
            Intrinsics.x("binding");
            i14 = null;
        }
        i14.f21444e0.setText(detailsState.M());
        Nn.I i15 = this.binding;
        if (i15 == null) {
            Intrinsics.x("binding");
            i15 = null;
        }
        TextView textView2 = i15.f21443d0;
        if (detailsState.U()) {
            Context context2 = textView2.getContext();
            Intrinsics.i(context2, "getContext(...)");
            textView2.setTextColor(Cj.r.b(context2, Cj.f.f4650d, null, false, 6, null));
            Nn.I i16 = this.binding;
            if (i16 == null) {
                Intrinsics.x("binding");
                i16 = null;
            }
            TextView textView3 = i16.f21445f0;
            textView3.setPaintFlags(textView3.getPaintFlags() | 16);
        } else if (Intrinsics.e(ck.d.a(this, detailsState.o()), getString(C17457C.f164399R))) {
            Context context3 = textView2.getContext();
            Intrinsics.i(context3, "getContext(...)");
            textView2.setTextColor(Cj.r.b(context3, Cj.f.f4650d, null, false, 6, null));
        }
        Intrinsics.g(textView2);
        ck.d.g(textView2, detailsState.o());
        Nn.I i17 = this.binding;
        if (i17 == null) {
            Intrinsics.x("binding");
            i17 = null;
        }
        TextView complexPromoTag = i17.f21419F;
        Intrinsics.i(complexPromoTag, "complexPromoTag");
        ck.d.g(complexPromoTag, detailsState.k());
        AbstractC6392a abstractC6392aK = detailsState.k();
        if (abstractC6392aK != null && (strB = abstractC6392aK.b(this)) != null && StringsKt.d0(strB, "/$", false, 2, null)) {
            Nn.I i18 = this.binding;
            if (i18 == null) {
                Intrinsics.x("binding");
                i18 = null;
            }
            TextView textView4 = i18.f21419F;
            String string = getString(com.meijer.mobile.meijer.Y.f101091o1);
            Intrinsics.i(string, "getString(...)");
            textView4.setContentDescription(StringsKt.O(strB, com.medallia.digital.mobilesdk.q2.f93563c, string, true));
        }
        Nn.I i19 = this.binding;
        if (i19 == null) {
            Intrinsics.x("binding");
            i19 = null;
        }
        TextView complexPromoTag2 = i19.f21419F;
        Intrinsics.i(complexPromoTag2, "complexPromoTag");
        complexPromoTag2.setVisibility(detailsState.k() != null ? 0 : 8);
        Nn.I i20 = this.binding;
        if (i20 == null) {
            Intrinsics.x("binding");
            i20 = null;
        }
        i20.f21421H.setContent(ComposableLambdaKt.composableLambdaInstance(681233955, true, new i(localThemeScope, detailsState)));
        Nn.I i21 = this.binding;
        if (i21 == null) {
            Intrinsics.x("binding");
            i21 = null;
        }
        TextView textView5 = i21.f21415B;
        Intrinsics.g(textView5);
        ck.d.g(textView5, detailsState.e());
        textView5.setVisibility(detailsState.U() ? 0 : 8);
        Nn.I i22 = this.binding;
        if (i22 == null) {
            Intrinsics.x("binding");
            i22 = null;
        }
        TextView textView6 = i22.f21445f0;
        Intrinsics.g(textView6);
        ck.d.g(textView6, detailsState.J());
        textView6.setVisibility(detailsState.U() ? 0 : 8);
        Nn.I i23 = this.binding;
        if (i23 == null) {
            Intrinsics.x("binding");
            i23 = null;
        }
        TextView textView7 = i23.f21449j0;
        Intrinsics.g(textView7);
        ck.d.g(textView7, detailsState.N());
        textView7.setVisibility(detailsState.getShowWeightInfo() ? 0 : 8);
        Nn.I i24 = this.binding;
        if (i24 == null) {
            Intrinsics.x("binding");
            i24 = null;
        }
        TextView textView8 = i24.f21446g0;
        Intrinsics.g(textView8);
        ck.d.g(textView8, detailsState.H());
        textView8.setVisibility(detailsState.U() ? 0 : 8);
        Nn.I i25 = this.binding;
        if (i25 == null) {
            Intrinsics.x("binding");
            i25 = null;
        }
        View chokingWarningSection = i25.f21418E;
        Intrinsics.i(chokingWarningSection, "chokingWarningSection");
        chokingWarningSection.setVisibility(detailsState.x() ? 0 : 8);
        Nn.I i26 = this.binding;
        if (i26 == null) {
            Intrinsics.x("binding");
            i26 = null;
        }
        ConstraintLayout ageRestrictedWarningLayout = i26.f21414A.f22183z;
        Intrinsics.i(ageRestrictedWarningLayout, "ageRestrictedWarningLayout");
        if (detailsState.w()) {
            Nn.I i27 = this.binding;
            if (i27 == null) {
                Intrinsics.x("binding");
                i27 = null;
            }
            i27.f21414A.f22180A.setText(getApplicationContext().getString(C17457C.f164407d));
            zV = true;
        } else {
            Nn.I i28 = this.binding;
            if (i28 == null) {
                Intrinsics.x("binding");
                i28 = null;
            }
            i28.f21414A.f22180A.setText(getApplicationContext().getString(C17457C.f164406c));
            zV = detailsState.v();
        }
        ageRestrictedWarningLayout.setVisibility(zV ? 0 : 8);
        Nn.I i29 = this.binding;
        if (i29 == null) {
            Intrinsics.x("binding");
            i29 = null;
        }
        TextView finalCostByWeight = i29.f21422I;
        Intrinsics.i(finalCostByWeight, "finalCostByWeight");
        finalCostByWeight.setVisibility(detailsState.getShowWeightInfo() ? 0 : 8);
        Nn.I i30 = this.binding;
        if (i30 == null) {
            Intrinsics.x("binding");
            i30 = null;
        }
        FrameLayout productDetailCouponsContainer = i30.f21434U;
        Intrinsics.i(productDetailCouponsContainer, "productDetailCouponsContainer");
        productDetailCouponsContainer.setVisibility(detailsState.y() ? 0 : 8);
        Nn.I i31 = this.binding;
        if (i31 == null) {
            Intrinsics.x("binding");
            i31 = null;
        }
        final ExpandableCardView expandableCardView = i31.f21436W;
        Intrinsics.g(expandableCardView);
        expandableCardView.setVisibility(detailsState.A() ? 0 : 8);
        expandableCardView.o(new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProductDetailActivity.q2(this.f108688a, expandableCardView);
            }
        });
        Nn.I i32 = this.binding;
        if (i32 == null) {
            Intrinsics.x("binding");
            i32 = null;
        }
        i32.f21433T.setText(detailsState.p());
        Nn.I i33 = this.binding;
        if (i33 == null) {
            Intrinsics.x("binding");
            i33 = null;
        }
        final ExpandableCardView expandableCardView2 = i33.f21441b0;
        Intrinsics.g(expandableCardView2);
        expandableCardView2.setVisibility(detailsState.C() ? 0 : 8);
        expandableCardView2.o(new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProductDetailActivity.r2(this.f108699a, expandableCardView2);
            }
        });
        Nn.I i34 = this.binding;
        if (i34 == null) {
            Intrinsics.x("binding");
            i34 = null;
        }
        i34.f21440a0.setText(detailsState.D());
        Nn.I i35 = this.binding;
        if (i35 == null) {
            Intrinsics.x("binding");
            i35 = null;
        }
        final ExpandableCardView expandableCardView3 = i35.f21442c0;
        Intrinsics.g(expandableCardView3);
        expandableCardView3.setVisibility(detailsState.getNutritionLabel() != null ? 0 : 8);
        expandableCardView3.o(new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProductDetailActivity.s2(this.f108709a, expandableCardView3);
            }
        });
        Nn.I i36 = this.binding;
        if (i36 == null) {
            Intrinsics.x("binding");
            i36 = null;
        }
        final ExpandableCardView expandableCardView4 = i36.f21438Y;
        Intrinsics.g(expandableCardView4);
        expandableCardView4.setVisibility(detailsState.B() ? 0 : 8);
        expandableCardView4.o(new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProductDetailActivity.t2(this.f108451a, expandableCardView4);
            }
        });
        Nn.I i37 = this.binding;
        if (i37 == null) {
            Intrinsics.x("binding");
            i37 = null;
        }
        i37.f21437X.setText(detailsState.r());
        Nn.I i38 = this.binding;
        if (i38 == null) {
            Intrinsics.x("binding");
        } else {
            i11 = i38;
        }
        i11.f21416C.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductDetailActivity.u2(this.f108460a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m2(CheckableImageButton checkableImageButton, boolean z10) {
        Intrinsics.j(checkableImageButton, "<unused var>");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n2(ProductDetailsState c12388j1, ProductDetailActivity productDetailActivity, CheckableImageButton checkableImageButton, boolean z10) {
        Intrinsics.j(checkableImageButton, "<unused var>");
        if (z10) {
            productDetailActivity.z2().U0(new AbstractC15517b.Add(c12388j1.getProduct()));
        } else {
            productDetailActivity.z2().U0(new AbstractC15517b.Remove(c12388j1.getProduct()));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o2(CheckableImageButton checkableImageButton, boolean z10) {
        Intrinsics.j(checkableImageButton, "<unused var>");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p2(ProductDetailsState c12388j1, ProductDetailActivity productDetailActivity, CheckableImageButton checkableImageButton, boolean z10) {
        Intrinsics.j(checkableImageButton, "<unused var>");
        if (z10) {
            productDetailActivity.z2().T0(new AbstractC15516a.Add(c12388j1.getProduct()));
        } else {
            productDetailActivity.z2().T0(new AbstractC15516a.Remove(c12388j1.getProduct()));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q2(ProductDetailActivity productDetailActivity, ExpandableCardView expandableCardView) {
        Nn.I i10 = productDetailActivity.binding;
        if (i10 == null) {
            Intrinsics.x("binding");
            i10 = null;
        }
        i10.f21429P.requestChildFocus(expandableCardView, expandableCardView);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r2(ProductDetailActivity productDetailActivity, ExpandableCardView expandableCardView) {
        Nn.I i10 = productDetailActivity.binding;
        if (i10 == null) {
            Intrinsics.x("binding");
            i10 = null;
        }
        i10.f21429P.requestChildFocus(expandableCardView, expandableCardView);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s2(ProductDetailActivity productDetailActivity, ExpandableCardView expandableCardView) {
        Nn.I i10 = productDetailActivity.binding;
        if (i10 == null) {
            Intrinsics.x("binding");
            i10 = null;
        }
        i10.f21429P.requestChildFocus(expandableCardView, expandableCardView);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t2(ProductDetailActivity productDetailActivity, ExpandableCardView expandableCardView) {
        Rect rect = new Rect();
        Nn.I i10 = productDetailActivity.binding;
        Nn.I i11 = null;
        if (i10 == null) {
            Intrinsics.x("binding");
            i10 = null;
        }
        i10.f21429P.getHitRect(rect);
        if (expandableCardView.c() && (!expandableCardView.getLocalVisibleRect(rect) || rect.height() < expandableCardView.getHeight())) {
            Nn.I i12 = productDetailActivity.binding;
            if (i12 == null) {
                Intrinsics.x("binding");
            } else {
                i11 = i12;
            }
            i11.f21429P.scrollTo(0, expandableCardView.getTop());
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u2(ProductDetailActivity productDetailActivity, View view) {
        Nn.I i10 = productDetailActivity.binding;
        Nn.I i11 = null;
        if (i10 == null) {
            Intrinsics.x("binding");
            i10 = null;
        }
        NestedScrollView nestedScrollView = i10.f21429P;
        Nn.I i12 = productDetailActivity.binding;
        if (i12 == null) {
            Intrinsics.x("binding");
        } else {
            i11 = i12;
        }
        nestedScrollView.scrollTo(0, i11.f21417D.getTop());
    }

    private final C13790a x2() {
        return (C13790a) this.cartBadge.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C12333c1 z2() {
        return (C12333c1) this.vm.getValue();
    }

    @Override // Tm.b.a
    public void H0(int position, List<ProductImageViewModel> imagesList) {
        Intrinsics.j(imagesList, "imagesList");
        Intent intentA = ImageDetailActivity.INSTANCE.a(this, imagesList, position, this.loadGrayScaleImage);
        Nn.I i10 = this.binding;
        if (i10 == null) {
            Intrinsics.x("binding");
            i10 = null;
        }
        ViewPager imagesViewPager = i10.f21426M;
        Intrinsics.i(imagesViewPager, "imagesViewPager");
        Ds.a.b(this, intentA, imagesViewPager);
    }

    @Override // Qj.g
    public void onCreateAccount() {
        startActivity(Bl.f.f3124a.a(this, getFeatureManager().e(AbstractC18503f.h0.f172881h)));
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        Tm.b bVar = this.imagePagerAdapter;
        if (bVar == null) {
            Intrinsics.x("imagePagerAdapter");
            bVar = null;
        }
        bVar.y(null);
        super.onDestroy();
    }

    @Override // Qj.g
    public void onSignIn() {
        startActivity(Bl.k.b(this, false, null, null, null, null, null, 126, null));
    }

    @Override // Bj.b
    public Toolbar y() {
        Nn.I i10 = this.binding;
        if (i10 == null) {
            Intrinsics.x("binding");
            i10 = null;
        }
        MaterialToolbar toolbar = i10.f21448i0;
        Intrinsics.i(toolbar, "toolbar");
        return toolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B2(C14274a result) {
        if (result.getResultCode() == -1) {
            z2().S0(AbstractC12425x.e.f109909a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C2(C14274a result) {
        switch (result.getResultCode()) {
            case 867530912:
                z2().Y0(m2.a.f108509a);
                break;
            case 867530913:
                z2().Y0(m2.b.f108510a);
                break;
        }
    }

    private final void D2(Tm.b imagePagerAdapter) {
        getWindow().getSharedElementEnterTransition().addListener(new k(imagePagerAdapter));
    }

    private final boolean E2() {
        return getIntent().getBooleanExtra("com.meijer.intent.extra.IS_FROM_CLP", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G2(ProductDetailActivity productDetailActivity, nk.c cVar, View view) {
        productDetailActivity.z2().T0(new AbstractC15516a.View(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I2(ProductDetailActivity productDetailActivity, nk.c cVar, View view) {
        productDetailActivity.z2().U0(new AbstractC15517b.View(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(ProductDetailActivity productDetailActivity) {
        if (!productDetailActivity.onNavigateUp()) {
            productDetailActivity.finish();
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L2(ProductFullDetails product, com.meijer.mobile.core.design.widget.stepperview.a state) {
        z2().S0(new AbstractC12425x.UpdateCarouselProductEntry(product, state.getValueState().getQuantity()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N2(ProductDetailActivity productDetailActivity, com.meijer.mobile.meijer.activity.find.viewmodel.G0 g02, View view) {
        productDetailActivity.z2().h1(((G0.ProductLoadError) g02).getProduct());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O2(ProductDetailActivity productDetailActivity, View view) {
        productDetailActivity.startActivity(productDetailActivity.getFeatureEntryPoint().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P2(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q2(ProductDetailActivity productDetailActivity, View view) {
        productDetailActivity.startActivity(productDetailActivity.getFeatureEntryPoint().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R2(ProductDetailActivity productDetailActivity, View view) {
        productDetailActivity.startActivity(productDetailActivity.getFeatureEntryPoint().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S2(ProductDetailsState details, LocalThemeScope localThemeScope) {
        boolean z10;
        int i10;
        boolean z11;
        l2(details, localThemeScope);
        v2(details, localThemeScope);
        k2(details, localThemeScope);
        j2(details, localThemeScope);
        ProductLocationDecorator productLocationDecoratorE = details.getLocation();
        boolean z12 = true;
        Nn.I i11 = null;
        if (productLocationDecoratorE != null) {
            Nn.I i12 = this.binding;
            if (i12 == null) {
                Intrinsics.x("binding");
                i12 = null;
            }
            i12.f21428O.setContent(ComposableLambdaKt.composableLambdaInstance(-922122228, true, new p(productLocationDecoratorE, this, details)));
        }
        Nn.I i13 = this.binding;
        if (i13 == null) {
            Intrinsics.x("binding");
            i13 = null;
        }
        TextView textView = i13.f21419F;
        Intrinsics.g(textView);
        ck.d.g(textView, details.k());
        AbstractC6392a abstractC6392aK = details.k();
        if (abstractC6392aK != null) {
            Context context = textView.getContext();
            Intrinsics.i(context, "getContext(...)");
            String strB = abstractC6392aK.b(context);
            if (strB != null && StringsKt.d0(strB, "/$", false, 2, null)) {
                String string = getString(com.meijer.mobile.meijer.Y.f101091o1);
                Intrinsics.i(string, "getString(...)");
                textView.setContentDescription(StringsKt.O(strB, com.medallia.digital.mobilesdk.q2.f93563c, string, true));
            }
        }
        if (details.k() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i14 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        textView.setVisibility(i10);
        Nn.I i15 = this.binding;
        if (i15 == null) {
            Intrinsics.x("binding");
            i15 = null;
        }
        i15.f21430Q.setContent(ComposableLambdaKt.composableLambdaInstance(2107395020, true, new q(details, localThemeScope)));
        Tm.b bVar = this.imagePagerAdapter;
        if (bVar != null) {
            if (bVar == null) {
                Intrinsics.x("imagePagerAdapter");
                bVar = null;
            }
            bVar.x(details.q());
            Tm.b bVar2 = this.imagePagerAdapter;
            if (bVar2 == null) {
                Intrinsics.x("imagePagerAdapter");
                bVar2 = null;
            }
            bVar2.v();
            boolean zE = Intrinsics.e(details.getStoreAvailability(), ProductEligibility.a.l.f167280a);
            this.loadGrayScaleImage = zE;
            Tm.b bVar3 = this.imagePagerAdapter;
            if (bVar3 == null) {
                Intrinsics.x("imagePagerAdapter");
                bVar3 = null;
            }
            bVar3.w(zE);
            Nn.I i16 = this.binding;
            if (i16 == null) {
                Intrinsics.x("binding");
                i16 = null;
            }
            IntRange intRangeX = RangesKt.x(0, i16.f21425L.getTabCount());
            ArrayList arrayList = new ArrayList(CollectionsKt.x(intRangeX, 10));
            Iterator<Integer> it = intRangeX.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                Integer numValueOf = Integer.valueOf(iNextInt);
                Nn.I i17 = this.binding;
                if (i17 == null) {
                    Intrinsics.x("binding");
                    i17 = null;
                }
                arrayList.add(TuplesKt.a(numValueOf, i17.f21425L.B(iNextInt)));
            }
            ArrayList<Pair> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((Pair) obj).d() != null) {
                    arrayList2.add(obj);
                }
            }
            for (Pair pair : arrayList2) {
                int iIntValue = ((Number) pair.a()).intValue();
                TabLayout.f fVar = (TabLayout.f) pair.b();
                Intrinsics.g(fVar);
                AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
                int i18 = com.meijer.mobile.meijer.Y.f100752Wh;
                Integer numValueOf2 = Integer.valueOf(iIntValue + 1);
                Nn.I i19 = this.binding;
                if (i19 == null) {
                    Intrinsics.x("binding");
                    i19 = null;
                }
                ck.d.d(fVar, companion.d(i18, numValueOf2, Integer.valueOf(i19.f21425L.getTabCount())));
            }
        }
        C13790a c13790aX2 = x2();
        c13790aX2.R(details.getCartItemCount());
        if (c13790aX2.z() && c13790aX2.o() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        c13790aX2.setVisible(z11, true);
        Rj.a.a(y(), com.meijer.mobile.meijer.T.f99907c4, c13790aX2);
        Nn.I i20 = this.binding;
        if (i20 == null) {
            Intrinsics.x("binding");
            i20 = null;
        }
        StepperView stepperView = i20.f21447h0;
        Intrinsics.g(stepperView);
        if (!details.Q() && !details.S()) {
            z12 = false;
        }
        if (z12) {
            i14 = 0;
        }
        stepperView.setVisibility(i14);
        if (details.S()) {
            stepperView.setAddButtonText(getString(com.meijer.mobile.meijer.Y.f100538Lc));
            stepperView.setAddButtonEnabled(false);
        }
        Nn.I i21 = this.binding;
        if (i21 == null) {
            Intrinsics.x("binding");
            i21 = null;
        }
        if (!i21.f21447h0.getDebouncing()) {
            Nn.I i22 = this.binding;
            if (i22 == null) {
                Intrinsics.x("binding");
            } else {
                i11 = i22;
            }
            StepperView stepperView2 = i11.f21447h0;
            double qtyIncrement = details.getProduct().getQtyIncrement();
            double quantity = details.getCartEntry().getQuantity();
            String unit = details.getProduct().getUnit();
            if (unit == null) {
                unit = "Each";
            }
            stepperView2.setValueState(new ValueState(qtyIncrement, quantity, false, unit, false, details.F()));
        }
    }

    private final void T2() {
        startActivity(getFeatureEntryPoint().d());
    }

    private final void U2(final nk.f product) {
        if (getFeatureManager().e(AbstractC18503f.A.f172842h)) {
            getAnalyticsEngine().b(C14756c.a("viewFavoritesMenu"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProductDetailActivity.V2(product, (TrackingData) obj);
                }
            });
            startActivity(getFeatureEntryPoint().K(l.d.f152504a));
        } else {
            startActivity(Bl.q.f3149a.a(this));
        }
    }

    private final void W2(nk.f product) {
        startActivity(getMeijerIntent().G(this, product, getFeatureManager().e(AbstractC18503f.O.f172854h)));
    }

    private final void h2(ProductDetailsState details, LocalThemeScope localThemeScope) {
        RatingsDistribution ratingsDistribution;
        ProductReviewOptionsDetails productReviewOptionsDetails;
        List<ProductReviewDetails> listM;
        int totalReviewCount;
        double dA;
        ProductReviewOptionsDetails productReviewOptionsDetails2;
        RatingsDistribution ratingsDistribution2;
        ProductReviewFullDetails productReviewFullDetailsF = details.getBazaarVoiceProductDisplay();
        if (productReviewFullDetailsF != null && (productReviewOptionsDetails2 = productReviewFullDetailsF.getProductReviewOptionsDetails()) != null && (ratingsDistribution2 = productReviewOptionsDetails2.getRatingsDistribution()) != null) {
            ratingsDistribution = ratingsDistribution2;
        } else {
            ratingsDistribution = new RatingsDistribution(0, 0, 0, 0, 0, 31, null);
        }
        ProductReviewFullDetails productReviewFullDetailsF2 = details.getBazaarVoiceProductDisplay();
        Nn.I i10 = null;
        if (productReviewFullDetailsF2 != null) {
            productReviewOptionsDetails = productReviewFullDetailsF2.getProductReviewOptionsDetails();
        } else {
            productReviewOptionsDetails = null;
        }
        ProductReviewFullDetails productReviewFullDetailsF3 = details.getBazaarVoiceProductDisplay();
        if (productReviewFullDetailsF3 == null || (listM = productReviewFullDetailsF3.a()) == null) {
            listM = CollectionsKt.m();
        }
        List<ProductReviewDetails> list = listM;
        int totalRecommendedCount = 0;
        if (productReviewOptionsDetails != null) {
            totalReviewCount = productReviewOptionsDetails.getTotalReviewCount();
        } else {
            totalReviewCount = 0;
        }
        if (productReviewOptionsDetails != null) {
            dA = com.meijer.mobile.reviews.ux.productreview.V0.a(productReviewOptionsDetails.getAverageRating());
        } else {
            dA = 0.0d;
        }
        double d10 = dA;
        if (productReviewOptionsDetails != null) {
            totalRecommendedCount = productReviewOptionsDetails.getTotalRecommendedCount();
        }
        int i11 = totalRecommendedCount;
        Nn.I i12 = this.binding;
        if (i12 == null) {
            Intrinsics.x("binding");
            i12 = null;
        }
        i12.f21416C.setContent(ComposableLambdaKt.composableLambdaInstance(1183391630, true, new d(localThemeScope, d10, totalReviewCount)));
        Nn.I i13 = this.binding;
        if (i13 == null) {
            Intrinsics.x("binding");
        } else {
            i10 = i13;
        }
        i10.f21417D.setContent(ComposableLambdaKt.composableLambdaInstance(-85552457, true, new e(localThemeScope, d10, totalReviewCount, i11, ratingsDistribution, this, details, list)));
    }

    private final void j2(ProductDetailsState details, LocalThemeScope localThemeScope) {
        List<ProductReviewDetails> listA;
        int i10 = a.$EnumSwitchMapping$0[details.getBazaarVoiceProductDisplayStatus().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                ProductReviewFullDetails productReviewFullDetailsF = details.getBazaarVoiceProductDisplay();
                if (productReviewFullDetailsF != null && (listA = productReviewFullDetailsF.a()) != null && listA.size() == 0) {
                    g2(details, localThemeScope);
                    return;
                } else {
                    h2(details, localThemeScope);
                    return;
                }
            }
            g2(details, localThemeScope);
            return;
        }
        i2(localThemeScope);
    }

    private final void k2(ProductDetailsState details, LocalThemeScope localThemeScope) {
        if (getFeatureManager().e(AbstractC18503f.C.f172844h)) {
            Nn.I i10 = this.binding;
            if (i10 == null) {
                Intrinsics.x("binding");
                i10 = null;
            }
            i10.f21424K.setContent(ComposableLambdaKt.composableLambdaInstance(-1009024725, true, new h(localThemeScope, details, this)));
        }
    }

    private final void v2(ProductDetailsState details, LocalThemeScope localThemeScope) {
        List<SuggestedProductCarouselDecorator> listS = details.s();
        Nn.I i10 = null;
        if (listS != null && !listS.isEmpty()) {
            Nn.I i11 = this.binding;
            if (i11 == null) {
                Intrinsics.x("binding");
                i11 = null;
            }
            ComposeView frequentlyBoughtTogetherProductCarousel = i11.f21423J;
            Intrinsics.i(frequentlyBoughtTogetherProductCarousel, "frequentlyBoughtTogetherProductCarousel");
            frequentlyBoughtTogetherProductCarousel.setVisibility(0);
            Nn.I i12 = this.binding;
            if (i12 == null) {
                Intrinsics.x("binding");
            } else {
                i10 = i12;
            }
            i10.f21423J.setContent(ComposableLambdaKt.composableLambdaInstance(-157142809, true, new j(localThemeScope, details, this)));
            return;
        }
        Nn.I i13 = this.binding;
        if (i13 == null) {
            Intrinsics.x("binding");
        } else {
            i10 = i13;
        }
        ComposeView frequentlyBoughtTogetherProductCarousel2 = i10.f21423J;
        Intrinsics.i(frequentlyBoughtTogetherProductCarousel2, "frequentlyBoughtTogetherProductCarousel");
        frequentlyBoughtTogetherProductCarousel2.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C13790a w2(ProductDetailActivity productDetailActivity) {
        C13790a c13790aE = C13790a.e(productDetailActivity);
        c13790aE.V(false);
        c13790aE.N(C17283a.f163260c);
        Intrinsics.i(c13790aE, "apply(...)");
        return c13790aE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nk.f y2() {
        Object obj;
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            obj = (Parcelable) intent.getParcelableExtra("com.meijer.intent.extra.PRODUCT", nk.f.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.intent.extra.PRODUCT");
            if (!(parcelableExtra instanceof nk.f)) {
                parcelableExtra = null;
            }
            obj = (nk.f) parcelableExtra;
        }
        Intrinsics.g(obj);
        return (nk.f) obj;
    }

    @Override // com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment.b
    public void L0(int count) {
        z2().V0(count);
    }

    @Override // com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment.c
    public void Y() {
        setResult(48997);
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"ShowToast"})
    protected void onCreate(Bundle savedInstanceState) throws Resources.NotFoundException {
        super.onCreate(savedInstanceState);
        getLifecycle().a(z2());
        this.binding = Nn.I.M0(getLayoutInflater());
        Tm.b bVar = null;
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-597552325, true, new l()), 1, null);
        z2().g1(getIntent().getStringExtra("com.meijer.intent.extra.PREVIOUS_TRACK_ACTION"));
        this.campaignIdValue = getIntent().getStringExtra("campaignIdValue");
        z2().f1(this.campaignIdValue);
        z2().h1(y2());
        z2().S0(new AbstractC12425x.IsFromCLP(E2()));
        z2().S0(new AbstractC12425x.GetFrequentlyBoughtTogetherProducts(y2()));
        z2().S0(new AbstractC12425x.GetBazaarVoiceReviews(y2()));
        Bj.b.o(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProductDetailActivity.J2(this.f108444a);
            }
        }, 3, null);
        Rj.a.a(y(), com.meijer.mobile.meijer.T.f99907c4, x2());
        y().setOnMenuItemClickListener(new Sn.a(new Function1() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProductDetailActivity.K2(this.f108582a, (a.AbstractC0780a) obj);
            }
        }));
        Nn.I i10 = this.binding;
        if (i10 == null) {
            Intrinsics.x("binding");
            i10 = null;
        }
        i10.f21447h0.setOnActionListener(new m());
        boolean booleanExtra = getIntent().getBooleanExtra("com.meijer.intent.extra.HAS_TRANSITION", false);
        this.imagePagerAdapter = new Tm.b(CollectionsKt.m(), 0, !booleanExtra, false, 2, null);
        Nn.I i11 = this.binding;
        if (i11 == null) {
            Intrinsics.x("binding");
            i11 = null;
        }
        ViewPager viewPager = i11.f21426M;
        Tm.b bVar2 = this.imagePagerAdapter;
        if (bVar2 == null) {
            Intrinsics.x("imagePagerAdapter");
            bVar2 = null;
        }
        viewPager.setAdapter(bVar2);
        Nn.I i12 = this.binding;
        if (i12 == null) {
            Intrinsics.x("binding");
            i12 = null;
        }
        TabLayout tabLayout = i12.f21425L;
        Nn.I i13 = this.binding;
        if (i13 == null) {
            Intrinsics.x("binding");
            i13 = null;
        }
        tabLayout.setupWithViewPager(i13.f21426M);
        Tm.b bVar3 = this.imagePagerAdapter;
        if (bVar3 == null) {
            Intrinsics.x("imagePagerAdapter");
            bVar3 = null;
        }
        bVar3.y(this);
        if (booleanExtra) {
            Tm.b bVar4 = this.imagePagerAdapter;
            if (bVar4 == null) {
                Intrinsics.x("imagePagerAdapter");
            } else {
                bVar = bVar4;
            }
            D2(bVar);
        }
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        FS.page("Product Details Page", MapsKt.o(TuplesKt.a("upc", y2().getCode()), TuplesKt.a("storeId", Integer.valueOf(Co.l.a(y2()).getStoreId())))).start();
    }
}
