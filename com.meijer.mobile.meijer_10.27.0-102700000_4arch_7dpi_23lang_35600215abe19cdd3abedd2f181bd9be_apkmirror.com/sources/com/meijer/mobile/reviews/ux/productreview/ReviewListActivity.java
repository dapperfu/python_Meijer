package com.meijer.mobile.reviews.ux.productreview;

import Gp.ProductInfoForReviewSubmit;
import Gp.ProductInformation;
import Gp.ReviewItem;
import Ji.C;
import Ji.LocalThemeScope;
import Jp.Filter;
import Kp.ProductReviewDetails;
import Kp.ProductReviewFullDetails;
import Kp.ProductReviewOptionsDetails;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import ck.C6408b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.reviews.ux.productreview.C12713c0;
import com.meijer.mobile.reviews.ux.productreview.ReviewListActivity;
import e.C13589e;
import g.AbstractC14147c;
import g.C14145a;
import g.InterfaceC14146b;
import j$.time.ZoneId;
import j0.C14815g;
import j0.InterfaceC14794C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ji.InterfaceC14920X;
import ji.q1;
import kotlin.C17917Z;
import kotlin.C17921a1;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import p1.C16193g;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17152f;
import vk.C17590a;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\r\u001a\u00020\u0006*\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u00103\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/ReviewListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lg/a;", "result", "", "D1", "(Lg/a;)V", "C1", "LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "r1", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lyo/k;", "v", "Lyo/k;", "getUserManager", "()Lyo/k;", "setUserManager", "(Lyo/k;)V", "userManager", "Lyl/k;", "w", "Lyl/k;", "getFeatureManager", "()Lyl/k;", "setFeatureManager", "(Lyl/k;)V", "featureManager", "Lcom/meijer/mobile/reviews/ux/productreview/c0;", "x", "Lkotlin/Lazy;", "B1", "()Lcom/meijer/mobile/reviews/ux/productreview/c0;", "vm", "Lg/c;", "Landroid/content/Intent;", "y", "Lg/c;", "filterAndSortLauncher", "z", "productRateAndReviewLauncher", "LGp/b;", "A1", "()LGp/b;", "productInfo", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ReviewListActivity extends Hilt_ReviewListActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public yo.k userManager;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public yl.k featureManager;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Lazy vm = new androidx.view.e0(Reflection.b(C12713c0.class), new g(this), new f(this), new h(null, this));

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> filterAndSortLauncher = registerForActivityResult(new h.i(), new c());

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> productRateAndReviewLauncher = registerForActivityResult(new h.i(), new e());

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C12713c0.ViewState f115568a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReviewListActivity f115569b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115570c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f115571d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.reviews.ux.productreview.ReviewListActivity$a$a, reason: collision with other inner class name */
        static final class C1850a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C12713c0.ViewState f115572a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f115573b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f115574c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ReviewListActivity f115575d;

            C1850a(C12713c0.ViewState viewState, Modifier modifier, LocalThemeScope localThemeScope, ReviewListActivity reviewListActivity) {
                this.f115572a = viewState;
                this.f115573b = modifier;
                this.f115574c = localThemeScope;
                this.f115575d = reviewListActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit q(ReviewListActivity reviewListActivity, ReviewItem reviewItem, int i10) {
                Al.o oVar = Al.o.f689a;
                reviewListActivity.startActivity(Al.o.b(reviewListActivity, i10, reviewItem.c()));
                return Unit.f142422a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                k(composer, num.intValue());
                return Unit.f142422a;
            }

            public final void k(Composer composer, int i10) {
                List<ProductReviewDetails> list;
                final ReviewListActivity reviewListActivity;
                float f10;
                final C12713c0.ViewState viewState;
                Composer composer2 = composer;
                if ((i10 & 3) == 2 && composer2.j()) {
                    composer2.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(456212720, i10, -1, "com.meijer.mobile.reviews.ux.productreview.ReviewListActivity.MainContent.<anonymous>.<anonymous> (ReviewListActivity.kt:189)");
                }
                ProductReviewFullDetails firstProductReviews = this.f115572a.getFirstProductReviews();
                ProductReviewOptionsDetails productReviewOptionsDetails = firstProductReviews != null ? firstProductReviews.getProductReviewOptionsDetails() : null;
                ProductReviewFullDetails firstProductReviews2 = this.f115572a.getFirstProductReviews();
                List<ProductReviewDetails> listA = firstProductReviews2 != null ? firstProductReviews2.a() : null;
                Integer numValueOf = productReviewOptionsDetails != null ? Integer.valueOf(productReviewOptionsDetails.getTotalReviewCount()) : null;
                Double dValueOf = productReviewOptionsDetails != null ? Double.valueOf(V0.a(productReviewOptionsDetails.getAverageRating())) : null;
                d0.V vC = d0.T.c(0, composer2, 0, 1);
                if (!this.f115572a.j().isEmpty()) {
                    listA = this.f115572a.j();
                }
                Modifier modifierG = d0.T.g(androidx.compose.foundation.layout.J.f(this.f115573b, 0.0f, 1, null), vC, false, null, false, 14, null);
                ProductReviewOptionsDetails productReviewOptionsDetails2 = productReviewOptionsDetails;
                LocalThemeScope localThemeScope = this.f115574c;
                C12713c0.ViewState viewState2 = this.f115572a;
                final ReviewListActivity reviewListActivity2 = this.f115575d;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer2, 0);
                int iA = C5717f.a(composer2, 0);
                InterfaceC5742s interfaceC5742sR = composer2.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierG);
                InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion.a();
                if (composer2.k() == null) {
                    C5717f.c();
                }
                composer2.F();
                if (composer2.h()) {
                    composer2.I(function0A);
                } else {
                    composer2.s();
                }
                Composer composerA = D1.a(composer2);
                D1.c(composerA, measurePolicyA, companion.e());
                D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                C14815g c14815g = C14815g.f139108a;
                composer2.startReplaceGroup(-112185177);
                if (dValueOf == null) {
                    list = listA;
                    viewState = viewState2;
                    reviewListActivity = reviewListActivity2;
                    f10 = 0.0f;
                } else {
                    double dDoubleValue = dValueOf.doubleValue();
                    Modifier modifierJ = androidx.compose.foundation.layout.D.j(Modifier.INSTANCE, H1.h.p(16), H1.h.p(8));
                    int totalReviewCount = productReviewOptionsDetails2.getTotalReviewCount();
                    List<ProductReviewDetails> list2 = listA;
                    String productName = viewState2.getProductName();
                    String productImage = viewState2.getProductImage();
                    composer2.startReplaceGroup(5004770);
                    boolean zD = composer2.D(reviewListActivity2);
                    Object objB = composer2.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.reviews.ux.productreview.j1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ReviewListActivity.a.C1850a.s(reviewListActivity2);
                            }
                        };
                        composer2.t(objB);
                    }
                    composer2.P();
                    list = list2;
                    reviewListActivity = reviewListActivity2;
                    f10 = 0.0f;
                    viewState = viewState2;
                    C12754x0.q(localThemeScope, modifierJ, dDoubleValue, totalReviewCount, productName, productImage, (Function0) objB, composer, LocalThemeScope.f15770g | 48, 0);
                    composer2 = composer;
                    Unit unit = Unit.f142422a;
                }
                composer2.P();
                composer2.startReplaceGroup(-112134649);
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zD2 = composer2.D(reviewListActivity) | composer2.D(viewState);
                    Object objB2 = composer2.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function0() { // from class: com.meijer.mobile.reviews.ux.productreview.k1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ReviewListActivity.a.C1850a.t(reviewListActivity, viewState);
                            }
                        };
                        composer2.t(objB2);
                    }
                    composer2.P();
                    C12754x0.o(localThemeScope, null, iIntValue, (Function0) objB2, composer2, LocalThemeScope.f15770g, 1);
                    Unit unit2 = Unit.f142422a;
                }
                composer2.P();
                composer2.startReplaceGroup(-112110583);
                if (list != null) {
                    for (final ProductReviewDetails productReviewDetails : list) {
                        String reviewId = productReviewDetails.getReviewId();
                        String title = productReviewDetails.getTitle();
                        String description = productReviewDetails.getDescription();
                        Boolean isRecommended = productReviewDetails.getIsRecommended();
                        String str = productReviewDetails.getSubmissionDate().atZone(ZoneId.systemDefault()).format(C17590a.NUMERIC_MONTH_DAY);
                        final ReviewItem reviewItem = new ReviewItem(reviewId, title, description, 4, isRecommended, C6408b.a(str != null ? AbstractC5607a.INSTANCE.d(Lp.c.f18615T, str, productReviewDetails.getUserName()) : null, composer2, AbstractC5607a.f45514b), productReviewDetails.getRating(), productReviewDetails.getUpVoteCount(), productReviewDetails.getDownVoteCount(), productReviewDetails.e());
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        float f11 = 16;
                        Modifier modifierM = androidx.compose.foundation.layout.D.m(companion2, H1.h.p(f11), H1.h.p(f11), 0.0f, H1.h.p(f11), 4, null);
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
                        boolean zD3 = composer2.D(reviewListActivity) | composer2.D(productReviewDetails);
                        Object objB3 = composer2.B();
                        if (zD3 || objB3 == Composer.INSTANCE.a()) {
                            objB3 = new Function0() { // from class: com.meijer.mobile.reviews.ux.productreview.l1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ReviewListActivity.a.C1850a.r(reviewListActivity, productReviewDetails);
                                }
                            };
                            composer2.t(objB3);
                        }
                        Function0 function0 = (Function0) objB3;
                        composer2.P();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zD4 = composer2.D(reviewListActivity) | composer2.D(reviewItem);
                        Object objB4 = composer2.B();
                        if (zD4 || objB4 == Composer.INSTANCE.a()) {
                            objB4 = new Function0() { // from class: com.meijer.mobile.reviews.ux.productreview.m1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ReviewListActivity.a.C1850a.l(reviewListActivity, reviewItem);
                                }
                            };
                            composer2.t(objB4);
                        }
                        Function0 function02 = (Function0) objB4;
                        composer2.P();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zD5 = composer2.D(reviewListActivity) | composer2.D(productReviewDetails);
                        Object objB5 = composer2.B();
                        if (zD5 || objB5 == Composer.INSTANCE.a()) {
                            objB5 = new Function0() { // from class: com.meijer.mobile.reviews.ux.productreview.n1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ReviewListActivity.a.C1850a.o(reviewListActivity, productReviewDetails);
                                }
                            };
                            composer2.t(objB5);
                        }
                        Function0 function03 = (Function0) objB5;
                        composer2.P();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zD6 = composer2.D(reviewListActivity) | composer2.D(productReviewDetails);
                        Object objB6 = composer2.B();
                        if (zD6 || objB6 == Composer.INSTANCE.a()) {
                            objB6 = new Function0() { // from class: com.meijer.mobile.reviews.ux.productreview.o1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ReviewListActivity.a.C1850a.p(reviewListActivity, productReviewDetails);
                                }
                            };
                            composer2.t(objB6);
                        }
                        Function0 function04 = (Function0) objB6;
                        composer2.P();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zD7 = composer2.D(reviewListActivity) | composer2.D(reviewItem);
                        Object objB7 = composer2.B();
                        if (zD7 || objB7 == Composer.INSTANCE.a()) {
                            objB7 = new Function1() { // from class: com.meijer.mobile.reviews.ux.productreview.p1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ReviewListActivity.a.C1850a.q(reviewListActivity, reviewItem, ((Integer) obj).intValue());
                                }
                            };
                            composer2.t(objB7);
                        }
                        composer2.P();
                        M0.q(localThemeScope, modifierM, new ProductReviewDecorator(title2, reviewText, maxLines, isRecommended2, date, starsRating, thumbsUpCount, thumbsDownCount, listC, function0, function02, function03, function04, (Function1) objB7, false, 16384, null), reviewListActivity.getFeatureManager().e(AbstractC18227f.C2748f.f170576h), composer2, LocalThemeScope.f15770g | 48, 0);
                        LocalThemeScope localThemeScope2 = localThemeScope;
                        composer2.startReplaceGroup(-111993642);
                        if (list.indexOf(productReviewDetails) != list.size() - 1) {
                            C17917Z.a(androidx.compose.foundation.layout.D.k(companion2, H1.h.p(f11), f10, 2, null), localThemeScope2.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 6, 12);
                        }
                        composer.P();
                        composer2 = composer;
                        localThemeScope = localThemeScope2;
                    }
                    Unit unit3 = Unit.f142422a;
                }
                composer.P();
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(ReviewListActivity reviewListActivity, ReviewItem reviewItem) {
                reviewListActivity.startActivity(Al.o.a(reviewListActivity, reviewItem));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(ReviewListActivity reviewListActivity, ProductReviewDetails productReviewDetails) {
                reviewListActivity.B1().w(new C12713c0.a.VotePositive(productReviewDetails.getReviewId()));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(ReviewListActivity reviewListActivity, ProductReviewDetails productReviewDetails) {
                reviewListActivity.B1().w(new C12713c0.a.VoteNegative(productReviewDetails.getReviewId()));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(ReviewListActivity reviewListActivity, ProductReviewDetails productReviewDetails) {
                reviewListActivity.B1().w(new C12713c0.a.ReportReview(productReviewDetails.getReviewId()));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit s(ReviewListActivity reviewListActivity) {
                if (reviewListActivity.getUserManager().b()) {
                    reviewListActivity.productRateAndReviewLauncher.a(Al.o.f689a.e(reviewListActivity, new ProductInfoForReviewSubmit(reviewListActivity.A1().getProductId(), reviewListActivity.A1().getProductImage(), reviewListActivity.A1().getProductName())));
                } else {
                    reviewListActivity.startActivity(Al.k.b(reviewListActivity, false, null, null, null, null, null, 126, null));
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit t(ReviewListActivity reviewListActivity, C12713c0.ViewState viewState) {
                reviewListActivity.filterAndSortLauncher.a(FilterAndSortActivity.INSTANCE.a(reviewListActivity, viewState.c(), viewState.getSortBy()));
                return Unit.f142422a;
            }
        }

        a(C12713c0.ViewState viewState, ReviewListActivity reviewListActivity, LocalThemeScope localThemeScope, Modifier modifier) {
            this.f115568a = viewState;
            this.f115569b = reviewListActivity;
            this.f115570c = localThemeScope;
            this.f115571d = modifier;
        }

        public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1504698226, i10, -1, "com.meijer.mobile.reviews.ux.productreview.ReviewListActivity.MainContent.<anonymous> (ReviewListActivity.kt:183)");
            }
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Bi.o loadingStatus = this.f115568a.getLoadingStatus();
            Modifier modifierF = androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null);
            String string = this.f115569b.getString(Lp.c.f18630b0);
            Intrinsics.i(string, "getString(...)");
            LocalThemeScope localThemeScope = this.f115570c;
            Bi.m.d(localThemeScope, modifierF, largeLoading, loadingStatus, null, string, ComposableLambdaKt.c(456212720, true, new C1850a(this.f115568a, this.f115571d, localThemeScope, this.f115569b), composer, 54), composer, 1572912 | LocalThemeScope.f15770g | (q1.k.Large.f140090f << 6), 8);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
            a(interfaceC14920X, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.reviews.ux.productreview.ReviewListActivity$MainContent$2$1", f = "ReviewListActivity.kt", l = {357}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f115576a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f115578c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115579d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f115580e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f115581f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f115582g;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/c0$b;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/reviews/ux/productreview/c0$b;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.reviews.ux.productreview.ReviewListActivity$MainContent$2$1$1", f = "ReviewListActivity.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<C12713c0.b, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f115583a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f115584b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f115585c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f115586d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f115587e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f115588f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f115589g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.reviews.ux.productreview.ReviewListActivity$MainContent$2$1$1$1", f = "ReviewListActivity.kt", l = {336, 336}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.reviews.ux.productreview.ReviewListActivity$b$a$a, reason: collision with other inner class name */
            static final class C1851a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f115590a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f115591b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C12713c0.b f115592c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f115593d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ String f115594e;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1851a(this.f115591b, this.f115592c, this.f115593d, this.f115594e, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1851a(LocalThemeScope localThemeScope, C12713c0.b bVar, String str, String str2, Continuation<? super C1851a> continuation) {
                    super(2, continuation);
                    this.f115591b = localThemeScope;
                    this.f115592c = bVar;
                    this.f115593d = str;
                    this.f115594e = str2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C1851a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
                
                    if (Gi.i.i(r0, r2, null, null, false, r5, null, null, null, r13, 238, null) == r12) goto L19;
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
                        int r0 = r13.f115590a
                        r1 = 2
                        r2 = 1
                        if (r0 == 0) goto L1f
                        if (r0 == r2) goto L1a
                        if (r0 != r1) goto L12
                        kotlin.ResultKt.b(r14)
                        goto L58
                    L12:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                        r0.<init>(r1)
                        throw r0
                    L1a:
                        kotlin.ResultKt.b(r14)
                        r0 = r14
                        goto L2f
                    L1f:
                        kotlin.ResultKt.b(r14)
                        Ji.M r0 = r13.f115591b
                        r13.f115590a = r2
                        r3 = 0
                        r4 = 0
                        java.lang.Object r0 = Ji.LocalThemeScope.g(r0, r3, r13, r2, r4)
                        if (r0 != r12) goto L2f
                        goto L57
                    L2f:
                        Gi.i r0 = (Gi.i) r0
                        com.meijer.mobile.reviews.ux.productreview.c0$b r2 = r13.f115592c
                        com.meijer.mobile.reviews.ux.productreview.c0$b$a r2 = (com.meijer.mobile.reviews.ux.productreview.C12713c0.b.FeedbackSubmissionEvent) r2
                        Kp.a r2 = r2.getFeedbackVote()
                        Kp.a r3 = Kp.a.f17434a
                        if (r2 != r3) goto L40
                        java.lang.String r2 = r13.f115593d
                        goto L42
                    L40:
                        java.lang.String r2 = r13.f115594e
                    L42:
                        ji.q1$m$a$d r5 = ji.q1.m.a.d.f140117a
                        r13.f115590a = r1
                        r1 = r2
                        r2 = 0
                        r3 = 0
                        r4 = 0
                        r6 = 0
                        r7 = 0
                        r8 = 0
                        r10 = 238(0xee, float:3.34E-43)
                        r11 = 0
                        r9 = r13
                        java.lang.Object r0 = Gi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                        if (r0 != r12) goto L58
                    L57:
                        return r12
                    L58:
                        kotlin.Unit r0 = kotlin.Unit.f142422a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.productreview.ReviewListActivity.b.a.C1851a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.reviews.ux.productreview.ReviewListActivity$MainContent$2$1$1$2", f = "ReviewListActivity.kt", l = {350, 350}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.reviews.ux.productreview.ReviewListActivity$b$a$b, reason: collision with other inner class name */
            static final class C1852b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f115595a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f115596b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f115597c;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1852b(this.f115596b, this.f115597c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1852b(LocalThemeScope localThemeScope, String str, Continuation<? super C1852b> continuation) {
                    super(2, continuation);
                    this.f115596b = localThemeScope;
                    this.f115597c = str;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C1852b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
                
                    if (Gi.i.i((Gi.i) r0, r2, null, null, false, r5, null, null, null, r13, 238, null) == r12) goto L15;
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
                        int r0 = r13.f115595a
                        r1 = 2
                        r2 = 1
                        if (r0 == 0) goto L1f
                        if (r0 == r2) goto L1a
                        if (r0 != r1) goto L12
                        kotlin.ResultKt.b(r14)
                        goto L49
                    L12:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                        r0.<init>(r1)
                        throw r0
                    L1a:
                        kotlin.ResultKt.b(r14)
                        r0 = r14
                        goto L2f
                    L1f:
                        kotlin.ResultKt.b(r14)
                        Ji.M r0 = r13.f115596b
                        r13.f115595a = r2
                        r3 = 0
                        r4 = 0
                        java.lang.Object r0 = Ji.LocalThemeScope.g(r0, r3, r13, r2, r4)
                        if (r0 != r12) goto L2f
                        goto L48
                    L2f:
                        Gi.i r0 = (Gi.i) r0
                        java.lang.String r2 = r13.f115597c
                        ji.q1$m$a$d r5 = ji.q1.m.a.d.f140117a
                        r13.f115595a = r1
                        r1 = r2
                        r2 = 0
                        r3 = 0
                        r4 = 0
                        r6 = 0
                        r7 = 0
                        r8 = 0
                        r10 = 238(0xee, float:3.34E-43)
                        r11 = 0
                        r9 = r13
                        java.lang.Object r0 = Gi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                        if (r0 != r12) goto L49
                    L48:
                        return r12
                    L49:
                        kotlin.Unit r0 = kotlin.Unit.f142422a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.productreview.ReviewListActivity.b.a.C1852b.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f115585c, this.f115586d, this.f115587e, this.f115588f, this.f115589g, continuation);
                aVar.f115584b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C12713c0.b bVar, Continuation<? super Unit> continuation) {
                return ((a) create(bVar, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC16622O interfaceC16622O, LocalThemeScope localThemeScope, String str, String str2, String str3, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f115585c = interfaceC16622O;
                this.f115586d = localThemeScope;
                this.f115587e = str;
                this.f115588f = str2;
                this.f115589g = str3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f115583a == 0) {
                    ResultKt.b(obj);
                    C12713c0.b bVar = (C12713c0.b) this.f115584b;
                    if (bVar instanceof C12713c0.b.FeedbackSubmissionEvent) {
                        if (((C12713c0.b.FeedbackSubmissionEvent) bVar).getIsSuccess()) {
                            C16648k.d(this.f115585c, null, null, new C1851a(this.f115586d, bVar, this.f115587e, this.f115588f, null), 3, null);
                        }
                    } else if (bVar instanceof C12713c0.b.C1858b) {
                        C16648k.d(this.f115585c, null, null, new C1852b(this.f115586d, this.f115589g, null), 3, null);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReviewListActivity.this.new b(this.f115578c, this.f115579d, this.f115580e, this.f115581f, this.f115582g, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC16622O interfaceC16622O, LocalThemeScope localThemeScope, String str, String str2, String str3, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f115578c = interfaceC16622O;
            this.f115579d = localThemeScope;
            this.f115580e = str;
            this.f115581f = str2;
            this.f115582g = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f115576a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f interfaceC17152fO = C17154h.O(ReviewListActivity.this.B1().u(), new a(this.f115578c, this.f115579d, this.f115580e, this.f115581f, this.f115582g, null));
                this.f115576a = 1;
                if (C17154h.j(interfaceC17152fO, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c implements InterfaceC14146b, FunctionAdapter {
        c() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ReviewListActivity.this, ReviewListActivity.class, "handleReceiptResult", "handleReceiptResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            ReviewListActivity.this.D1(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ReviewListActivity f115600a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.reviews.ux.productreview.ReviewListActivity$d$a$a, reason: collision with other inner class name */
            static final class C1853a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f115601a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ReviewListActivity f115602b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.reviews.ux.productreview.ReviewListActivity$d$a$a$a, reason: collision with other inner class name */
                static final class C1854a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f115603a;

                    C1854a(LocalThemeScope localThemeScope) {
                        this.f115603a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1144281642, i10, -1, "com.meijer.mobile.reviews.ux.productreview.ReviewListActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReviewListActivity.kt:138)");
                        }
                        Dr.g.g(this.f115603a, C16193g.c(Lp.c.f18581C, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-2102750954, i10, -1, "com.meijer.mobile.reviews.ux.productreview.ReviewListActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ReviewListActivity.kt:137)");
                    }
                    C.f.d dVar = C.f.d.f15507e;
                    AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(Bj.o.f3035p, new Object[0]);
                    Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                    LocalThemeScope localThemeScope = this.f115601a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1144281642, true, new C1854a(localThemeScope), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f115602b);
                    final ReviewListActivity reviewListActivity = this.f115602b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.reviews.ux.productreview.q1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ReviewListActivity.d.a.C1853a.c(reviewListActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, modifierH, null, null, composableLambdaC, (Function0) objB, dVar, 0.0f, false, abstractC5607aD, composer, LocalThemeScope.f15770g | 24624 | (C.f.d.f15508f << 18) | (AbstractC5607a.f45514b << 27), 198);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1853a(LocalThemeScope localThemeScope, ReviewListActivity reviewListActivity) {
                    this.f115601a = localThemeScope;
                    this.f115602b = reviewListActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(ReviewListActivity reviewListActivity) {
                    reviewListActivity.finish();
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class b implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ReviewListActivity f115604a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f115605b;

                b(ReviewListActivity reviewListActivity, LocalThemeScope localThemeScope) {
                    this.f115604a = reviewListActivity;
                    this.f115605b = localThemeScope;
                }

                public final void a(InterfaceC14794C paddingValues, Composer composer, int i10) {
                    Intrinsics.j(paddingValues, "paddingValues");
                    if ((i10 & 6) == 0) {
                        i10 |= composer.V(paddingValues) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(191665935, i10, -1, "com.meijer.mobile.reviews.ux.productreview.ReviewListActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ReviewListActivity.kt:146)");
                    }
                    Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues);
                    ReviewListActivity reviewListActivity = this.f115604a;
                    LocalThemeScope localThemeScope = this.f115605b;
                    MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
                    int iA = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
                    InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
                    Function0<InterfaceC5811g> function0A = companion.a();
                    if (composer.k() == null) {
                        C5717f.c();
                    }
                    composer.F();
                    if (composer.h()) {
                        composer.I(function0A);
                    } else {
                        composer.s();
                    }
                    Composer composerA = D1.a(composer);
                    D1.c(composerA, measurePolicyG, companion.e());
                    D1.c(composerA, interfaceC5742sR, companion.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                    if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion.f());
                    C5664j c5664j = C5664j.f48612a;
                    reviewListActivity.r1(localThemeScope, null, composer, LocalThemeScope.f15770g, 1);
                    composer.v();
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
                    a(interfaceC14794C, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(ReviewListActivity reviewListActivity) {
                this.f115600a = reviewListActivity;
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
                    ComposerKt.U(-501978543, i11, -1, "com.meijer.mobile.reviews.ux.productreview.ReviewListActivity.onCreate.<anonymous>.<anonymous> (ReviewListActivity.kt:134)");
                }
                C17921a1.a(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), null, ComposableLambdaKt.c(-2102750954, true, new C1853a(AdsTheme, this.f115600a), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(191665935, true, new b(this.f115600a, AdsTheme), composer, 54), composer, 384, 12582912, 131066);
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
                ComposerKt.U(-1406307134, i10, -1, "com.meijer.mobile.reviews.ux.productreview.ReviewListActivity.onCreate.<anonymous> (ReviewListActivity.kt:133)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(-501978543, true, new a(ReviewListActivity.this), composer, 54), composer, 48, 1);
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
    /* synthetic */ class e implements InterfaceC14146b, FunctionAdapter {
        e() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ReviewListActivity.this, ReviewListActivity.class, "handleRateAndReviewResult", "handleRateAndReviewResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            ReviewListActivity.this.C1(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f115607f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f115607f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f115607f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f115608f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f115608f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f115608f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f115609f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f115610g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f115609f = function0;
            this.f115610g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f115609f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f115610g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C12713c0 B1() {
        return (C12713c0) this.vm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r1(final Ji.LocalThemeScope r18, androidx.compose.ui.Modifier r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.productreview.ReviewListActivity.r1(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s1(ReviewListActivity reviewListActivity, LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        reviewListActivity.r1(localThemeScope, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public final yl.k getFeatureManager() {
        yl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("featureManager");
        return null;
    }

    public final yo.k getUserManager() {
        yo.k kVar = this.userManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("userManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductInformation A1() {
        Object obj;
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            obj = (Parcelable) intent.getParcelableExtra("com.meijer.intent.extra.PRODUCT_INFORMATION", ProductInformation.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.intent.extra.PRODUCT_INFORMATION");
            if (!(parcelableExtra instanceof ProductInformation)) {
                parcelableExtra = null;
            }
            obj = (ProductInformation) parcelableExtra;
        }
        Intrinsics.g(obj);
        return (ProductInformation) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C1(C14145a result) {
        if (result.getResultCode() == -1) {
            B1().w(C12713c0.a.d.f115691a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D1(C14145a result) {
        Intent data;
        Object serializableExtra;
        ArrayList parcelableArrayListExtra;
        if (result.getResultCode() == -1 && (data = result.getData()) != null) {
            C12713c0 c12713c0B1 = B1();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                serializableExtra = data.getSerializableExtra("com.meijer.intent.extra.EXTRA_SORT_RESULT", Jp.b.class);
            } else {
                Object serializableExtra2 = data.getSerializableExtra("com.meijer.intent.extra.EXTRA_SORT_RESULT");
                if (!(serializableExtra2 instanceof Jp.b)) {
                    serializableExtra2 = null;
                }
                serializableExtra = (Jp.b) serializableExtra2;
            }
            Jp.b bVar = (Jp.b) serializableExtra;
            if (i10 >= 33) {
                parcelableArrayListExtra = data.getParcelableArrayListExtra("com.meijer.intent.extra.EXTRA_FILTER_RESULT", Filter.class);
            } else {
                parcelableArrayListExtra = data.getParcelableArrayListExtra("com.meijer.intent.extra.EXTRA_FILTER_RESULT");
            }
            c12713c0B1.w(new C12713c0.a.UpdateFilters(parcelableArrayListExtra, bVar));
        }
        B1().w(C12713c0.a.b.f115689a);
    }

    @Override // com.meijer.mobile.reviews.ux.productreview.Hilt_ReviewListActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object next;
        super.onCreate(savedInstanceState);
        getLifecycle().a(B1());
        B1().w(new C12713c0.a.SetProductInfo(A1()));
        B1().w(C12713c0.a.C1857a.f115688a);
        int intExtra = getIntent().getIntExtra("com.meijer.mobile.reviews.ux.productreview.filter_and_sort.FILTER_BY_RATING", -1);
        Iterator<T> it = T.INSTANCE.b().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (Intrinsics.e(String.valueOf(intExtra), ((Filter) next).getValue())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Filter filter = (Filter) next;
        if (filter != null) {
            B1().w(new C12713c0.a.UpdateFilters(CollectionsKt.g(filter), null));
            B1().w(C12713c0.a.b.f115689a);
        }
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1406307134, true, new d()), 1, null);
    }
}
