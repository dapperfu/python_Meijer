package com.meijer.mobile.reviews.ux.rateandreview;

import Gp.ProductInfoForReviewSubmit;
import Ji.C;
import Ji.LocalThemeScope;
import P0.e;
import V2.CreationExtras;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.AbstractC6023l;
import androidx.view.C5994J;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity;
import com.meijer.mobile.reviews.ux.rateandreview.W;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import e.C13589e;
import g.AbstractC14147c;
import g.C14145a;
import g.C14152h;
import g.C14153i;
import g.InterfaceC14146b;
import h.C14319f;
import h.C14320g;
import j$.time.LocalDate;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ji.C14924a0;
import ji.InterfaceC14920X;
import ji.InterfaceC14971y;
import ji.q1;
import kotlin.C17893M0;
import kotlin.C17921a1;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;
import pi.C16307b;
import qv.C16648k;
import qv.InterfaceC16622O;
import r1.C16705m;
import si.C16977b;
import tv.InterfaceC17144F;
import tv.InterfaceC17153g;
import xk.C18064b;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u0006*\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0014\u001a\u00020\u0006*\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015JO\u0010\u001b\u001a\u00020\u0006*\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010 \u001a\u00020\u0006*\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0003¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010\u0003J#\u0010*\u001a\u00020\u00062\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020(0'H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010\u0003J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020(H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00062\u0006\u0010-\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u0019\u00105\u001a\u00020\u00062\b\u00104\u001a\u0004\u0018\u000103H\u0014¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0006H\u0014¢\u0006\u0004\b7\u0010\u0003R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001b\u0010M\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR \u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00040R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010UR\u0016\u0010[\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bY\u0010ZR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\\0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010UR\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020_0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010U¨\u0006b"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/ProductRateAndReviewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/net/Uri;", "uri", "", "r2", "(Landroid/net/Uri;)V", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$d;", "event", "v2", "(Lcom/meijer/mobile/reviews/ux/rateandreview/W$d;)V", "LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "T1", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onClick", "G1", "(LJi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$f;", "viewState", "onAddPhotoClicked", "onReviewGuidelinesClicked", "onPhotoGuidelinesClicked", "I1", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/reviews/ux/rateandreview/W$f;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "errorMessage", "onDismiss", "Y1", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "w2", "u2", "m2", "()Landroid/net/Uri;", "x2", "", "", "permissions", "s2", "(Ljava/util/Map;)V", "p2", "result", "q2", "(Z)V", "Lg/a;", "t2", "(Lg/a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "LAl/g;", "v", "LAl/g;", "getFeatureEntryPoint", "()LAl/g;", "setFeatureEntryPoint", "(LAl/g;)V", "featureEntryPoint", "LCl/e;", "w", "LCl/e;", "n2", "()LCl/e;", "setMeijerDeepLinkParser", "(LCl/e;)V", "meijerDeepLinkParser", "Lcom/meijer/mobile/reviews/ux/rateandreview/W;", "x", "Lkotlin/Lazy;", "o2", "()Lcom/meijer/mobile/reviews/ux/rateandreview/W;", "viewModel", "LGp/a;", "y", "LGp/a;", "productInfo", "Lg/c;", "", "z", "Lg/c;", "requestCameraPermissionResultLauncher", "A", "cameraResultLauncher", "B", "Landroid/net/Uri;", "imageUri", "Lg/h;", "C", "photoPickerLauncher", "Landroid/content/Intent;", "D", "termsAndConditionsResultLauncher", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ProductRateAndReviewActivity extends Hilt_ProductRateAndReviewActivity {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private Uri imageUri;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Al.g featureEntryPoint;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Cl.e meijerDeepLinkParser;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private ProductInfoForReviewSubmit productInfo;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new androidx.view.e0(Reflection.b(W.class), new n(this), new m(this), new o(null, this));

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<String[]> requestCameraPermissionResultLauncher = registerForActivityResult(new C14320g(), new l());

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Uri> cameraResultLauncher = registerForActivityResult(new h.j(), new h());

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<C14152h> photoPickerLauncher = registerForActivityResult(new C14319f(), new k());

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> termsAndConditionsResultLauncher = registerForActivityResult(new h.i(), new p());

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<ji.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f116044a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f116045b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f116046c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity$a$a, reason: collision with other inner class name */
        static final class C1862a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f116047a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ji.j1 f116048b;

            C1862a(LocalThemeScope localThemeScope, ji.j1 j1Var) {
                this.f116047a = localThemeScope;
                this.f116048b = j1Var;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1669976925, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity.BottomButton.<anonymous>.<anonymous>.<anonymous> (ProductRateAndReviewActivity.kt:326)");
                }
                LocalThemeScope localThemeScope = this.f116047a;
                q1.Label enabledLabel = this.f116048b.getLabels().getEnabledLabel();
                String upperCase = C16193g.c(Lp.c.f18596J0, composer, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                ri.j.h(localThemeScope, enabledLabel, upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        a(LocalThemeScope localThemeScope, Modifier modifier, Function0<Unit> function0) {
            this.f116044a = localThemeScope;
            this.f116045b = modifier;
            this.f116046c = function0;
        }

        public final void a(ji.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1803735178, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity.BottomButton.<anonymous>.<anonymous> (ProductRateAndReviewActivity.kt:318)");
            }
            ni.E0.b(this.f116044a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.i(this.f116045b, H1.h.p(16)), 0.0f, 1, null), false, null, 895, null), this.f116046c, ComposableLambdaKt.c(-1669976925, true, new C1862a(this.f116044a, Assemble), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f116049a;

        b(LocalThemeScope localThemeScope) {
            this.f116049a = localThemeScope;
        }

        public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(72503981, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity.MainContent.<anonymous>.<anonymous> (ProductRateAndReviewActivity.kt:351)");
            }
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Bi.o oVar = Bi.o.f2584a;
            Bi.m.d(this.f116049a, androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), largeLoading, oVar, null, C16193g.c(Lp.c.f18598K0, composer, 0), null, composer, LocalThemeScope.f15770g | 3120 | (q1.k.Large.f140090f << 6), 40);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ W.ViewState f116050a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f116051b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProductRateAndReviewActivity f116052c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<qv.C0> f116053d;

        /* JADX WARN: Multi-variable type inference failed */
        c(W.ViewState viewState, LocalThemeScope localThemeScope, ProductRateAndReviewActivity productRateAndReviewActivity, Function0<? extends qv.C0> function0) {
            this.f116050a = viewState;
            this.f116051b = localThemeScope;
            this.f116052c = productRateAndReviewActivity;
            this.f116053d = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(ProductRateAndReviewActivity productRateAndReviewActivity) throws IOException {
            if (C18064b.a(productRateAndReviewActivity, "android.permission.CAMERA")) {
                productRateAndReviewActivity.p2();
            } else {
                productRateAndReviewActivity.x2();
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(ProductRateAndReviewActivity productRateAndReviewActivity, Function0 function0, List selectedPhotos) {
            Intrinsics.j(selectedPhotos, "selectedPhotos");
            productRateAndReviewActivity.o2().r(new W.a.PickSelectedPhotosAction(selectedPhotos));
            function0.invoke();
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) throws Resources.NotFoundException {
            k(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
        }

        public final void k(InterfaceC14814f ModalBottomSheetLayout, Composer composer, int i10) throws Resources.NotFoundException {
            Intrinsics.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1229345775, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity.ProductRateAndReviewScreen.<anonymous> (ProductRateAndReviewActivity.kt:213)");
            }
            C14802K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, H1.h.p(1)), composer, 6);
            W.b activeBottomSheet = this.f116050a.getActiveBottomSheet();
            if (activeBottomSheet != null) {
                LocalThemeScope localThemeScope = this.f116051b;
                W.ViewState viewState = this.f116050a;
                final ProductRateAndReviewActivity productRateAndReviewActivity = this.f116052c;
                final Function0<qv.C0> function0 = this.f116053d;
                if (Intrinsics.e(activeBottomSheet, W.b.c.f116159a)) {
                    composer.startReplaceGroup(482472120);
                    W.CameraPermissionToast cameraPermissionNeededToast = viewState.getCameraPermissionNeededToast();
                    List<Uri> listR = viewState.getRateAndReviewDecorator().r();
                    List<Uri> listC = viewState.getRateAndReviewDecorator().c();
                    composer.startReplaceGroup(-1633490746);
                    boolean zD = composer.D(productRateAndReviewActivity) | composer.V(function0);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.G
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ProductRateAndReviewActivity.c.l(productRateAndReviewActivity, function0);
                            }
                        };
                        composer.t(objB);
                    }
                    Function0 function02 = (Function0) objB;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD2 = composer.D(productRateAndReviewActivity);
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.H
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ProductRateAndReviewActivity.c.q(productRateAndReviewActivity);
                            }
                        };
                        composer.t(objB2);
                    }
                    Function0 function03 = (Function0) objB2;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD3 = composer.D(productRateAndReviewActivity);
                    Object objB3 = composer.B();
                    if (zD3 || objB3 == Composer.INSTANCE.a()) {
                        objB3 = new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.I
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ProductRateAndReviewActivity.c.r(productRateAndReviewActivity);
                            }
                        };
                        composer.t(objB3);
                    }
                    Function0 function04 = (Function0) objB3;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD4 = composer.D(productRateAndReviewActivity);
                    Object objB4 = composer.B();
                    if (zD4 || objB4 == Composer.INSTANCE.a()) {
                        objB4 = new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.J
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ProductRateAndReviewActivity.c.s(productRateAndReviewActivity);
                            }
                        };
                        composer.t(objB4);
                    }
                    Function0 function05 = (Function0) objB4;
                    composer.P();
                    composer.startReplaceGroup(-1633490746);
                    boolean zD5 = composer.D(productRateAndReviewActivity) | composer.V(function0);
                    Object objB5 = composer.B();
                    if (zD5 || objB5 == Composer.INSTANCE.a()) {
                        objB5 = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.K
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ProductRateAndReviewActivity.c.t(productRateAndReviewActivity, function0, (List) obj);
                            }
                        };
                        composer.t(objB5);
                    }
                    composer.P();
                    C12781l.q(localThemeScope, null, cameraPermissionNeededToast, listR, listC, function02, function03, function04, function05, (Function1) objB5, composer, LocalThemeScope.f15770g, 1);
                    composer.P();
                } else if (Intrinsics.e(activeBottomSheet, W.b.C1869b.f116158a)) {
                    composer.startReplaceGroup(482524300);
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(function0);
                    Object objB6 = composer.B();
                    if (zV || objB6 == Composer.INSTANCE.a()) {
                        objB6 = new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.L
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ProductRateAndReviewActivity.c.o(function0);
                            }
                        };
                        composer.t(objB6);
                    }
                    composer.P();
                    C12781l.n(localThemeScope, null, (Function0) objB6, composer, LocalThemeScope.f15770g, 1);
                    composer.P();
                } else {
                    if (!Intrinsics.e(activeBottomSheet, W.b.a.f116157a)) {
                        composer.startReplaceGroup(482470914);
                        composer.P();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(482529451);
                    composer.startReplaceGroup(5004770);
                    boolean zV2 = composer.V(function0);
                    Object objB7 = composer.B();
                    if (zV2 || objB7 == Composer.INSTANCE.a()) {
                        objB7 = new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.M
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ProductRateAndReviewActivity.c.p(function0);
                            }
                        };
                        composer.t(objB7);
                    }
                    composer.P();
                    C12781l.k(localThemeScope, null, (Function0) objB7, composer, LocalThemeScope.f15770g, 1);
                    composer.P();
                }
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(ProductRateAndReviewActivity productRateAndReviewActivity, Function0 function0) {
            productRateAndReviewActivity.o2().r(W.a.e.f116144a);
            function0.invoke();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(ProductRateAndReviewActivity productRateAndReviewActivity) {
            productRateAndReviewActivity.u2();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(ProductRateAndReviewActivity productRateAndReviewActivity) {
            productRateAndReviewActivity.startActivity(productRateAndReviewActivity.n2().b(productRateAndReviewActivity));
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f116054a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f116055b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProductRateAndReviewActivity f116056c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ W.ViewState f116057d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f116058e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<qv.C0> f116059f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f116060a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ProductRateAndReviewActivity f116061b;

            a(LocalThemeScope localThemeScope, ProductRateAndReviewActivity productRateAndReviewActivity) {
                this.f116060a = localThemeScope;
                this.f116061b = productRateAndReviewActivity;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(2113355501, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity.ProductRateAndReviewScreen.<anonymous>.<anonymous> (ProductRateAndReviewActivity.kt:266)");
                }
                String strC = C16193g.c(Lp.c.f18583D, composer, 0);
                String strC2 = C16193g.c(Lp.c.f18614S0, composer, 0);
                LocalThemeScope localThemeScope = this.f116060a;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f116061b);
                final ProductRateAndReviewActivity productRateAndReviewActivity = this.f116061b;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.N
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProductRateAndReviewActivity.d.a.c(productRateAndReviewActivity);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C12784m0.d(localThemeScope, null, strC, (Function0) objB, strC2, true, composer, LocalThemeScope.f15770g | 196608, 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(ProductRateAndReviewActivity productRateAndReviewActivity) {
                productRateAndReviewActivity.finish();
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ W.ViewState f116062a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ProductRateAndReviewActivity f116063b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f116064c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f116065d;

            b(W.ViewState viewState, ProductRateAndReviewActivity productRateAndReviewActivity, LocalThemeScope localThemeScope, boolean z10) {
                this.f116062a = viewState;
                this.f116063b = productRateAndReviewActivity;
                this.f116064c = localThemeScope;
                this.f116065d = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                r1.s.o(semantics, "Form has errors");
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(boolean z10, ProductRateAndReviewActivity productRateAndReviewActivity) {
                if (z10) {
                    productRateAndReviewActivity.o2().r(W.a.p.f116155a);
                } else {
                    productRateAndReviewActivity.o2().r(W.a.h.f116147a);
                }
                return Unit.f142422a;
            }

            public final void c(Composer composer, int i10) {
                Modifier modifierD;
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(307852206, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity.ProductRateAndReviewScreen.<anonymous>.<anonymous> (ProductRateAndReviewActivity.kt:274)");
                }
                if (!this.f116062a.getIsLoading()) {
                    ProductRateAndReviewActivity productRateAndReviewActivity = this.f116063b;
                    LocalThemeScope localThemeScope = this.f116064c;
                    composer.startReplaceGroup(-506769208);
                    if (this.f116065d) {
                        Modifier.Companion companion = Modifier.INSTANCE;
                        composer.startReplaceGroup(1849434622);
                        Object objB = composer.B();
                        if (objB == Composer.INSTANCE.a()) {
                            objB = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.O
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ProductRateAndReviewActivity.d.b.d((r1.u) obj);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        modifierD = C16705m.d(companion, false, (Function1) objB, 1, null);
                    } else {
                        modifierD = Modifier.INSTANCE;
                    }
                    Modifier modifier = modifierD;
                    composer.P();
                    composer.startReplaceGroup(-1633490746);
                    boolean zA = composer.a(this.f116065d) | composer.D(this.f116063b);
                    final boolean z10 = this.f116065d;
                    final ProductRateAndReviewActivity productRateAndReviewActivity2 = this.f116063b;
                    Object objB2 = composer.B();
                    if (zA || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.P
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ProductRateAndReviewActivity.d.b.e(z10, productRateAndReviewActivity2);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    productRateAndReviewActivity.G1(localThemeScope, modifier, (Function0) objB2, composer, LocalThemeScope.f15770g, 0);
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                c(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ProductRateAndReviewActivity f116066a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f116067b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ W.ViewState f116068c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<qv.C0> f116069d;

            /* JADX WARN: Multi-variable type inference failed */
            c(ProductRateAndReviewActivity productRateAndReviewActivity, LocalThemeScope localThemeScope, W.ViewState viewState, Function0<? extends qv.C0> function0) {
                this.f116066a = productRateAndReviewActivity;
                this.f116067b = localThemeScope;
                this.f116068c = viewState;
                this.f116069d = function0;
            }

            public final void d(InterfaceC14794C paddingValues, Composer composer, int i10) {
                Intrinsics.j(paddingValues, "paddingValues");
                if ((i10 & 6) == 0) {
                    i10 |= composer.V(paddingValues) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-970399322, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity.ProductRateAndReviewScreen.<anonymous>.<anonymous> (ProductRateAndReviewActivity.kt:290)");
                }
                Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues);
                final ProductRateAndReviewActivity productRateAndReviewActivity = this.f116066a;
                LocalThemeScope localThemeScope = this.f116067b;
                W.ViewState viewState = this.f116068c;
                final Function0<qv.C0> function0 = this.f116069d;
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
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(productRateAndReviewActivity) | composer.V(function0);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.Q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProductRateAndReviewActivity.d.c.e(productRateAndReviewActivity, function0);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function02 = (Function0) objB;
                composer.P();
                composer.startReplaceGroup(-1633490746);
                boolean zD2 = composer.D(productRateAndReviewActivity) | composer.V(function0);
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.S
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProductRateAndReviewActivity.d.c.f(productRateAndReviewActivity, function0);
                        }
                    };
                    composer.t(objB2);
                }
                Function0 function03 = (Function0) objB2;
                composer.P();
                composer.startReplaceGroup(-1633490746);
                boolean zD3 = composer.D(productRateAndReviewActivity) | composer.V(function0);
                Object objB3 = composer.B();
                if (zD3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.T
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProductRateAndReviewActivity.d.c.g(productRateAndReviewActivity, function0);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                productRateAndReviewActivity.I1(localThemeScope, null, viewState, function02, function03, (Function0) objB3, composer, LocalThemeScope.f15770g, 1);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
                d(interfaceC14794C, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(ProductRateAndReviewActivity productRateAndReviewActivity, Function0 function0) {
                productRateAndReviewActivity.o2().r(new W.a.SetActiveBottomSheetAction(W.b.c.f116159a));
                function0.invoke();
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(ProductRateAndReviewActivity productRateAndReviewActivity, Function0 function0) {
                productRateAndReviewActivity.o2().r(new W.a.SetActiveBottomSheetAction(W.b.C1869b.f116158a));
                function0.invoke();
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(ProductRateAndReviewActivity productRateAndReviewActivity, Function0 function0) {
                productRateAndReviewActivity.o2().r(new W.a.SetActiveBottomSheetAction(W.b.a.f116157a));
                function0.invoke();
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(Modifier modifier, LocalThemeScope localThemeScope, ProductRateAndReviewActivity productRateAndReviewActivity, W.ViewState viewState, boolean z10, Function0<? extends qv.C0> function0) {
            this.f116054a = modifier;
            this.f116055b = localThemeScope;
            this.f116056c = productRateAndReviewActivity;
            this.f116057d = viewState;
            this.f116058e = z10;
            this.f116059f = function0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1705309592, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity.ProductRateAndReviewScreen.<anonymous> (ProductRateAndReviewActivity.kt:263)");
            }
            C17921a1.a(this.f116054a, null, ComposableLambdaKt.c(2113355501, true, new a(this.f116055b, this.f116056c), composer, 54), ComposableLambdaKt.c(307852206, true, new b(this.f116057d, this.f116056c, this.f116055b, this.f116058e), composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-970399322, true, new c(this.f116056c, this.f116055b, this.f116057d, this.f116059f), composer, 54), composer, 3456, 12582912, 131058);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity$ProductRateAndReviewScreen$closeSheet$1$1$1", f = "ProductRateAndReviewActivity.kt", l = {HttpResponseStatus.SUCCESS_NO_CONTENT}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f116070a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17893M0 f116071b;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.f116071b, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C17893M0 c17893m0, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f116071b = c17893m0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f116070a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C17893M0 c17893m0 = this.f116071b;
                this.f116070a = 1;
                if (c17893m0.i(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity$ProductRateAndReviewScreen$openSheet$1$1$1", f = "ProductRateAndReviewActivity.kt", l = {207}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f116072a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17893M0 f116073b;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f116073b, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C17893M0 c17893m0, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f116073b = c17893m0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f116072a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C17893M0 c17893m0 = this.f116073b;
                this.f116072a = 1;
                if (c17893m0.l(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function3<ji.R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f116074a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f116075b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f116076c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f116077d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Modifier f116078a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f116079b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ji.R0 f116080c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f116081d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f116082e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity$g$a$a, reason: collision with other inner class name */
            static final class C1863a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f116083a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.R0 f116084b;

                C1863a(LocalThemeScope localThemeScope, ji.R0 r02) {
                    this.f116083a = localThemeScope;
                    this.f116084b = r02;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-422095383, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity.ShowSubmitErrorModal.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductRateAndReviewActivity.kt:447)");
                    }
                    ri.j.h(this.f116083a, this.f116084b.getButtons().getMainCTAText(), C16193g.c(Lp.c.f18671w, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(Modifier modifier, LocalThemeScope localThemeScope, ji.R0 r02, String str, Function0<Unit> function0) {
                this.f116078a = modifier;
                this.f116079b = localThemeScope;
                this.f116080c = r02;
                this.f116081d = str;
                this.f116082e = function0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(959473900, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity.ShowSubmitErrorModal.<anonymous>.<anonymous> (ProductRateAndReviewActivity.kt:419)");
                }
                e.b bVarG = P0.e.INSTANCE.g();
                Modifier modifier = this.f116078a;
                LocalThemeScope localThemeScope = this.f116079b;
                ji.R0 r02 = this.f116080c;
                String str = this.f116081d;
                Function0<Unit> function0 = this.f116082e;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), bVarG, composer, 48);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
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
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14815g c14815g = C14815g.f139108a;
                float f10 = 32;
                C14802K.a(androidx.compose.foundation.layout.J.i(modifier, H1.h.p(f10)), composer, 0);
                q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.i.e.f15552d, null, null, null, 0.0f, null, androidx.compose.foundation.layout.J.o(modifier, H1.h.p(48)), 62, null);
                int i11 = LocalThemeScope.f15770g;
                C16307b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
                float f11 = 16;
                C14802K.a(androidx.compose.foundation.layout.J.i(modifier, H1.h.p(f11)), composer, 0);
                float f12 = 24;
                q1.Label labelY = q1.Label.y(r02.getLabels().getHeading(), r02.getLabels().getHeading().getModifier().then(androidx.compose.foundation.layout.D.k(companion, H1.h.p(f12), 0.0f, 2, null)), null, null, null, 0, false, 0, null, null, 510, null);
                String strC = C16193g.c(Lp.c.f18594I0, composer, 0);
                int i12 = q1.Label.f140080j;
                ri.j.h(localThemeScope, labelY, strC, null, composer, i11 | (i12 << 3), 4);
                C14802K.a(androidx.compose.foundation.layout.J.i(modifier, H1.h.p(f11)), composer, 0);
                ri.j.h(localThemeScope, q1.Label.y(r02.getLabels().getBody(), r02.getLabels().getBody().getModifier().then(androidx.compose.foundation.layout.D.k(companion, H1.h.p(f12), 0.0f, 2, null)), null, null, null, 0, false, 0, null, null, 510, null), str, null, composer, i11 | (i12 << 3), 4);
                C14802K.a(androidx.compose.foundation.layout.J.i(modifier, H1.h.p(f10)), composer, 0);
                ni.E0.b(localThemeScope, r02.getButtons().getMainCTA(), function0, ComposableLambdaKt.c(-422095383, true, new C1863a(localThemeScope, r02), composer, 54), composer, (q1.d.ModalButton.f139963k << 3) | i11 | 3072);
                C14802K.a(androidx.compose.foundation.layout.J.i(modifier, H1.h.p(f12)), composer, 0);
                composer.v();
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

        g(LocalThemeScope localThemeScope, Function0<Unit> function0, Modifier modifier, String str) {
            this.f116074a = localThemeScope;
            this.f116075b = function0;
            this.f116076c = modifier;
            this.f116077d = str;
        }

        public final void a(ji.R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(394926521, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity.ShowSubmitErrorModal.<anonymous> (ProductRateAndReviewActivity.kt:418)");
            }
            LocalThemeScope localThemeScope = this.f116074a;
            q1.ModalTemplate modalTemplate = Assemble.getModalTemplate();
            Function0<Unit> function0 = this.f116075b;
            C16977b.b(localThemeScope, modalTemplate, function0, null, ComposableLambdaKt.c(959473900, true, new a(this.f116076c, this.f116074a, Assemble, this.f116077d, function0), composer, 54), composer, LocalThemeScope.f15770g | 24576 | (q1.ModalTemplate.f140108d << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ji.R0 r02, Composer composer, Integer num) {
            a(r02, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class h implements InterfaceC14146b, FunctionAdapter {
        h() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ProductRateAndReviewActivity.this, ProductRateAndReviewActivity.class, "handleCameraResult", "handleCameraResult(Z)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        public /* bridge */ /* synthetic */ void a(Object obj) {
            b(((Boolean) obj).booleanValue());
        }

        public final void b(boolean z10) {
            ProductRateAndReviewActivity.this.q2(z10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ProductRateAndReviewActivity f116087a;

            a(ProductRateAndReviewActivity productRateAndReviewActivity) {
                this.f116087a = productRateAndReviewActivity;
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
                    ComposerKt.U(-709502391, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity.onCreate.<anonymous>.<anonymous> (ProductRateAndReviewActivity.kt:143)");
                }
                this.f116087a.T1(AdsTheme, FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), composer, LocalThemeScope.f15770g | (i10 & 14), 0);
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

        i() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(577389114, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity.onCreate.<anonymous> (ProductRateAndReviewActivity.kt:142)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(-709502391, true, new a(ProductRateAndReviewActivity.this), composer, 54), composer, 48, 1);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity$onCreate$2", f = "ProductRateAndReviewActivity.kt", l = {149}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f116088a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity$onCreate$2$1", f = "ProductRateAndReviewActivity.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f116090a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f116091b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ProductRateAndReviewActivity f116092c;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity$onCreate$2$1$1", f = "ProductRateAndReviewActivity.kt", l = {BinsView.TOTE_WIDTH_DP}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity$j$a$a, reason: collision with other inner class name */
            static final class C1864a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f116093a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ProductRateAndReviewActivity f116094b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity$j$a$a$a, reason: collision with other inner class name */
                /* synthetic */ class C1865a implements InterfaceC17153g, FunctionAdapter {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ ProductRateAndReviewActivity f116095a;

                    C1865a(ProductRateAndReviewActivity productRateAndReviewActivity) {
                        this.f116095a = productRateAndReviewActivity;
                    }

                    public final boolean equals(Object obj) {
                        if ((obj instanceof InterfaceC17153g) && (obj instanceof FunctionAdapter)) {
                            return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.FunctionAdapter
                    public final Function<?> getFunctionDelegate() {
                        return new AdaptedFunctionReference(2, this.f116095a, ProductRateAndReviewActivity.class, "onEvent", "onEvent(Lcom/meijer/mobile/reviews/ux/rateandreview/ProductRateAndReviewViewModel$Event;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }

                    @Override // tv.InterfaceC17153g
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object emit(W.d dVar, Continuation<? super Unit> continuation) {
                        Object objG = C1864a.g(this.f116095a, dVar, continuation);
                        return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1864a(ProductRateAndReviewActivity productRateAndReviewActivity, Continuation<? super C1864a> continuation) {
                    super(2, continuation);
                    this.f116094b = productRateAndReviewActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1864a(this.f116094b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C1864a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final /* synthetic */ Object g(ProductRateAndReviewActivity productRateAndReviewActivity, W.d dVar, Continuation continuation) {
                    productRateAndReviewActivity.v2(dVar);
                    return Unit.f142422a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f116093a;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj);
                    } else {
                        ResultKt.b(obj);
                        InterfaceC17144F<W.d> interfaceC17144FP = this.f116094b.o2().p();
                        C1865a c1865a = new C1865a(this.f116094b);
                        this.f116093a = 1;
                        if (interfaceC17144FP.collect(c1865a, this) == objF) {
                            return objF;
                        }
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ProductRateAndReviewActivity productRateAndReviewActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f116092c = productRateAndReviewActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f116092c, continuation);
                aVar.f116091b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f116090a == 0) {
                    ResultKt.b(obj);
                    C16648k.d((InterfaceC16622O) this.f116091b, null, null, new C1864a(this.f116092c, null), 3, null);
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProductRateAndReviewActivity.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f116088a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                ProductRateAndReviewActivity productRateAndReviewActivity = ProductRateAndReviewActivity.this;
                AbstractC6023l.b bVar = AbstractC6023l.b.f55278d;
                a aVar = new a(productRateAndReviewActivity, null);
                this.f116088a = 1;
                if (C5994J.b(productRateAndReviewActivity, bVar, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class k implements InterfaceC14146b, FunctionAdapter {
        k() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ProductRateAndReviewActivity.this, ProductRateAndReviewActivity.class, "handlePickedPhoto", "handlePickedPhoto(Landroid/net/Uri;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(Uri uri) {
            ProductRateAndReviewActivity.this.r2(uri);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class l implements InterfaceC14146b, FunctionAdapter {
        l() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ProductRateAndReviewActivity.this, ProductRateAndReviewActivity.class, "handleRequestCameraPermissionResult", "handleRequestCameraPermissionResult(Ljava/util/Map;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(Map<String, Boolean> p02) throws IOException {
            Intrinsics.j(p02, "p0");
            ProductRateAndReviewActivity.this.s2(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class m extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f116098f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentActivity componentActivity) {
            super(0);
            this.f116098f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f116098f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class n extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f116099f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentActivity componentActivity) {
            super(0);
            this.f116099f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f116099f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class o extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f116100f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f116101g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f116100f = function0;
            this.f116101g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f116100f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f116101g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class p implements InterfaceC14146b, FunctionAdapter {
        p() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ProductRateAndReviewActivity.this, ProductRateAndReviewActivity.class, "handleTermsAndConditionsResult", "handleTermsAndConditionsResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            ProductRateAndReviewActivity.this.t2(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T1(final Ji.LocalThemeScope r26, androidx.compose.ui.Modifier r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity.T1(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H1(ProductRateAndReviewActivity productRateAndReviewActivity, LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        productRateAndReviewActivity.G1(localThemeScope, modifier, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I1(final Ji.LocalThemeScope r24, androidx.compose.ui.Modifier r25, com.meijer.mobile.reviews.ux.rateandreview.W.ViewState r26, final kotlin.jvm.functions.Function0<kotlin.Unit> r27, final kotlin.jvm.functions.Function0<kotlin.Unit> r28, final kotlin.jvm.functions.Function0<kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity.I1(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.reviews.ux.rateandreview.W$f, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K1(ProductRateAndReviewActivity productRateAndReviewActivity, String it) {
        Intrinsics.j(it, "it");
        productRateAndReviewActivity.o2().r(new W.a.UpdateReviewInputString(it));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L1(ProductRateAndReviewActivity productRateAndReviewActivity, String it) {
        Intrinsics.j(it, "it");
        productRateAndReviewActivity.o2().r(new W.a.UpdateReviewTitleInputString(it));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M1(ProductRateAndReviewActivity productRateAndReviewActivity, String it) {
        Intrinsics.j(it, "it");
        productRateAndReviewActivity.o2().r(new W.a.UpdateNameInputString(it));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N1(ProductRateAndReviewActivity productRateAndReviewActivity, String it) {
        Intrinsics.j(it, "it");
        productRateAndReviewActivity.o2().r(new W.a.UpdateEmailInputString(it));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O1(ProductRateAndReviewActivity productRateAndReviewActivity, String it) {
        Intrinsics.j(it, "it");
        productRateAndReviewActivity.o2().r(new W.a.UpdateLocationInputString(it));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S1(ProductRateAndReviewActivity productRateAndReviewActivity, LocalThemeScope localThemeScope, Modifier modifier, W.ViewState viewState, Function0 function0, Function0 function02, Function0 function03, int i10, int i11, Composer composer, int i12) {
        productRateAndReviewActivity.I1(localThemeScope, modifier, viewState, function0, function02, function03, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qv.C0 V1(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0) {
        return C16648k.d(interfaceC16622O, null, null, new e(c17893m0, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qv.C0 W1(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0) {
        return C16648k.d(interfaceC16622O, null, null, new f(c17893m0, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X1(ProductRateAndReviewActivity productRateAndReviewActivity, LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        productRateAndReviewActivity.T1(localThemeScope, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z1(ProductRateAndReviewActivity productRateAndReviewActivity, LocalThemeScope localThemeScope, Modifier modifier, String str, Function0 function0, int i10, int i11, Composer composer, int i12) {
        productRateAndReviewActivity.Y1(localThemeScope, modifier, str, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final W o2() {
        return (W) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q2(boolean result) {
        if (result) {
            W wO2 = o2();
            Uri uri = this.imageUri;
            if (uri == null) {
                Intrinsics.y("imageUri");
                uri = null;
            }
            wO2.r(new W.a.UpdatePhotoListAction(uri));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r2(Uri uri) {
        if (uri != null) {
            o2().r(new W.a.UpdatePhotoListAction(uri));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s2(Map<String, Boolean> permissions) throws IOException {
        if (Intrinsics.e(permissions.get("android.permission.CAMERA"), Boolean.TRUE)) {
            p2();
        } else {
            o2().r(new W.a.CameraPermissionDeniedAction(true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u2() {
        this.photoPickerLauncher.a(C14153i.b(C14319f.d.f134142a, 0, false, null, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v2(W.d event) {
        if (!(event instanceof W.d.a)) {
            throw new NoWhenBranchMatchedException();
        }
        setResult(-1);
        finish();
    }

    private final void w2() {
        this.termsAndConditionsResultLauncher.a(RateTermsAndConditionsActivity.INSTANCE.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x2() {
        this.requestCameraPermissionResultLauncher.a(new String[]{"android.permission.CAMERA"});
    }

    public final Cl.e n2() {
        Cl.e eVar = this.meijerDeepLinkParser;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.y("meijerDeepLinkParser");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G1(final LocalThemeScope localThemeScope, Modifier modifier, final Function0<Unit> function0, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(1664233244);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(function0)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i16 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1664233244, i12, -1, "com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity.BottomButton (ProductRateAndReviewActivity.kt:315)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            Ji.Q.e(localThemeScope, InterfaceC14971y.a.d.f140292a, ComposableLambdaKt.c(-1803735178, true, new a(localThemeScope, modifier, function0), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f15770g | 384 | (InterfaceC14971y.a.d.f140293b << 3));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.reviews.ux.rateandreview.w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductRateAndReviewActivity.H1(this.f116482a, localThemeScope, modifier2, function0, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J1(ProductRateAndReviewActivity productRateAndReviewActivity, int i10) {
        productRateAndReviewActivity.o2().r(new W.a.UpdateRateNumber(i10));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P1(ProductRateAndReviewActivity productRateAndReviewActivity, boolean z10) {
        productRateAndReviewActivity.o2().r(new W.a.UpdateTermsCheckedStatus(z10));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q1(ProductRateAndReviewActivity productRateAndReviewActivity) {
        productRateAndReviewActivity.w2();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R1(ProductRateAndReviewActivity productRateAndReviewActivity, int i10) {
        productRateAndReviewActivity.o2().r(new W.a.OnUpdateRecommendationsStatus(i10));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U1(ProductRateAndReviewActivity productRateAndReviewActivity) {
        productRateAndReviewActivity.o2().r(W.a.b.f116141a);
        return Unit.f142422a;
    }

    private final void Y1(final LocalThemeScope localThemeScope, Modifier modifier, final String str, final Function0<Unit> function0, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        int i15;
        int i16;
        Composer composerStartRestartGroup = composer.startRestartGroup(528844894);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 1;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.V(str)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (composerStartRestartGroup.D(function0)) {
                i16 = RecyclerView.m.FLAG_MOVED;
            } else {
                i16 = 1024;
            }
            i12 |= i16;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i17 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(528844894, i12, -1, "com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity.ShowSubmitErrorModal (ProductRateAndReviewActivity.kt:416)");
            }
            Ji.Q.e(localThemeScope, C14924a0.f139754a, ComposableLambdaKt.c(394926521, true, new g(localThemeScope, function0, modifier, str), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f15770g | 384 | (C14924a0.f139755b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.reviews.ux.rateandreview.A
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductRateAndReviewActivity.Z1(this.f115940a, localThemeScope, modifier2, str, function0, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final Uri m2() throws IOException {
        String string = LocalDate.now().toString();
        Intrinsics.i(string, "toString(...)");
        Uri uriH = FileProvider.h(getApplicationContext(), "com.meijer.mobile.meijer.activity.find.rateandreview.fileprovider", File.createTempFile("camera_" + string, ".jpg", getApplicationContext().getFilesDir()));
        Intrinsics.i(uriH, "getUriForFile(...)");
        return uriH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p2() throws IOException {
        Uri uriM2 = m2();
        this.imageUri = uriM2;
        AbstractC14147c<Uri> abstractC14147c = this.cameraResultLauncher;
        if (uriM2 == null) {
            Intrinsics.y("imageUri");
            uriM2 = null;
        }
        abstractC14147c.a(uriM2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t2(C14145a result) {
        if (result.getResultCode() == -1) {
            o2().r(new W.a.UpdateTermsCheckedStatus(true));
        }
    }

    @Override // com.meijer.mobile.reviews.ux.rateandreview.Hilt_ProductRateAndReviewActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Parcelable parcelable;
        super.onCreate(savedInstanceState);
        getLifecycle().a(o2());
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("product_info", ProductInfoForReviewSubmit.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("product_info");
            if (!(parcelableExtra instanceof ProductInfoForReviewSubmit)) {
                parcelableExtra = null;
            }
            parcelable = (ProductInfoForReviewSubmit) parcelableExtra;
        }
        this.productInfo = (ProductInfoForReviewSubmit) parcelable;
        o2().r(new W.a.SetProductInfo(this.productInfo));
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(577389114, true, new i()), 1, null);
        C16648k.d(C6031t.a(this), null, null, new j(null), 3, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        W.CameraPermissionToast cameraPermissionNeededToast;
        super.onResume();
        if (o2().q().getValue().getCameraPermissionNeededToast() == null && ((cameraPermissionNeededToast = o2().q().getValue().getCameraPermissionNeededToast()) == null || cameraPermissionNeededToast.getShouldPromptUser())) {
            return;
        }
        o2().r(new W.a.CameraPermissionDeniedAction(!C18064b.a(this, "android.permission.CAMERA")));
    }
}
