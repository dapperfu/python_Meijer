package com.meijer.mobile.meijer.activity.find.productdetail;

import Co.ProductFullDetails;
import Gp.ProductInfoForReviewSubmit;
import Gp.ProductInformation;
import Ji.LocalThemeScope;
import P0.e;
import Pk.a;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import bn.ProductVariantDecorator;
import com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity;
import com.meijer.mobile.meijer.activity.find.productdetail.X0;
import com.meijer.mobile.meijer.activity.find.productdetail.m2;
import com.meijer.mobile.meijer.activity.find.productdetail.n2;
import com.meijer.mobile.meijer.activity.find.viewmodel.AbstractC12200a;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0;
import com.meijer.mobile.meijer.activity.find.viewmodel.ProductImageViewModel;
import com.meijer.mobile.meijer.activity.find.viewmodel.ReadReview;
import com.meijer.mobile.meijer.activity.find.viewmodel.ReviewGallery;
import com.meijer.mobile.meijer.activity.find.viewmodel.SeeAllReviews;
import com.meijer.mobile.meijer.activity.find.viewmodel.WriteReview;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import e.C13589e;
import ej.Entry;
import fi.GoogleAdAnalytics;
import g.AbstractC14147c;
import g.C14145a;
import g.InterfaceC14146b;
import gi.InterfaceC14261a;
import hi.TrackingData;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import j0.InterfaceC14812d;
import j0.InterfaceC14814f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ji.C14924a0;
import ji.q1;
import kk.AbstractC15172a;
import kk.AbstractC15173b;
import kotlin.C17891L0;
import kotlin.C17893M0;
import kotlin.C17921a1;
import kotlin.C17927c1;
import kotlin.EnumC17895N0;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
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
import kr.C15307d;
import li.C15417h;
import ni.C15860s0;
import ni.C15866v0;
import or.C16145c;
import p1.C16193g;
import pr.AbstractC16364a;
import pr.C16367d;
import pr.SubscriptionSummaryDecorator;
import qv.C16648k;
import qv.InterfaceC16622O;
import r0.C16692i;
import si.C16977b;
import sp.ProductState;
import tv.C17154h;
import vs.CartProductListDecorator;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\n\u0010\tJ/\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001c\u001a\u00020\u0007*\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001dJE\u0010#\u001a\u00020\u0007*\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u001fH\u0003¢\u0006\u0004\b#\u0010$JQ\u0010*\u001a\u00020\u0007*\u00020\u00192\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010%2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u001fH\u0003¢\u0006\u0004\b*\u0010+J\u0095\u0001\u0010:\u001a\u00020\u0007*\u00020\u00192\u0006\u0010\u0010\u001a\u00020,2\u0006\u0010-\u001a\u00020%2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010%2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00104\u001a\u0002032\u0006\u00105\u001a\u0002012\u000e\b\u0002\u00106\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f2\u000e\b\u0002\u00107\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f2\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f2\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020\u00070\u001fH\u0003¢\u0006\u0004\b:\u0010;J%\u0010<\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00070\u001fH\u0003¢\u0006\u0004\b<\u0010=J#\u0010?\u001a\u00020\u0007*\u00020\u00192\u0006\u0010\u0010\u001a\u00020>2\u0006\u00105\u001a\u000201H\u0003¢\u0006\u0004\b?\u0010@J\u001b\u0010B\u001a\u00020\u0007*\u00020\u00192\u0006\u0010\u0010\u001a\u00020AH\u0003¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020DH\u0003¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020GH\u0003¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020JH\u0003¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020MH\u0003¢\u0006\u0004\bN\u0010OJ\u0019\u0010R\u001a\u00020\u00072\b\u0010Q\u001a\u0004\u0018\u00010PH\u0014¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\u0007H\u0014¢\u0006\u0004\bT\u0010\u0004J\u000f\u0010U\u001a\u00020\u0007H\u0016¢\u0006\u0004\bU\u0010\u0004J\u000f\u0010V\u001a\u00020\u0007H\u0016¢\u0006\u0004\bV\u0010\u0004R\"\u0010^\u001a\u00020W8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010f\u001a\u00020_8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010n\u001a\u00020g8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010v\u001a\u00020o8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010~\u001a\u00020w8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u0019\u0010\u0082\u0001\u001a\u00020\u007f8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001b\u0010\u0085\u0001\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R!\u0010\u008b\u0001\u001a\u00030\u0086\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R!\u0010\u0090\u0001\u001a\u00030\u008c\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u0088\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001f\u0010\u0095\u0001\u001a\n\u0012\u0005\u0012\u00030\u0092\u00010\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001f\u0010\u0097\u0001\u001a\n\u0012\u0005\u0012\u00030\u0092\u00010\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0094\u0001R\u0017\u0010\u0014\u001a\u00030\u0098\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0017\u0010\u009d\u0001\u001a\u0002018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001¨\u0006 \u0001²\u0006\u000e\u0010\u009f\u0001\u001a\u00030\u009e\u00018\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/ProductDetailComposeActivity;", "Landroidx/activity/ComponentActivity;", "LPj/g;", "<init>", "()V", "Lg/a;", "result", "", "d3", "(Lg/a;)V", "e3", "Lcom/meijer/mobile/meijer/activity/find/productdetail/X0;", "destination", "Landroid/view/View;", "view", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "effect", "g3", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/X0;Landroid/view/View;Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;)V", "LCo/h;", "product", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "state", "j3", "(LCo/h;Lcom/meijer/mobile/core/design/widget/stepperview/a;)V", "LJi/M;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$d;", "viewState", "X1", "(LJi/M;Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$d;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$c;", "Lkotlin/Function0;", "onPositiveAction", "onNegativeAction", "disposeEffect", "u2", "(LJi/M;Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$c;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "", "titleLabel", "descriptionLabel", "positiveActionLabel", "negativeActionLabel", "V1", "(LJi/M;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "bodyLabel", "actionLabel", "LGi/e;", "duration", "", "showCloseIcon", "Lji/q1$m$a;", "toastState", "withMargin", "onLabelClicked", "onCloseClicked", "onDismiss", "execute", "o2", "(LJi/M;Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;Ljava/lang/String;Ljava/lang/String;LGi/e;ZLji/q1$m$a;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "m2", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$c;", "K2", "(LJi/M;Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$c;ZLandroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$b;", "M2", "(LJi/M;Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$b;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/l0;", "H2", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/l0;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/i0;", "y2", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/i0;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/j0;", "B2", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/j0;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/k0;", "E2", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/k0;Landroidx/compose/runtime/Composer;I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onCreateAccount", "onSignIn", "LAl/g;", "v", "LAl/g;", "X2", "()LAl/g;", "setFeatureEntryPoint$Meijer_playstoreRelease", "(LAl/g;)V", "featureEntryPoint", "LCl/e;", "w", "LCl/e;", "Z2", "()LCl/e;", "setMeijerIntent$Meijer_playstoreRelease", "(LCl/e;)V", "meijerIntent", "Lyl/k;", "x", "Lyl/k;", "Y2", "()Lyl/k;", "setFeatureManager$Meijer_playstoreRelease", "(Lyl/k;)V", "featureManager", "Lgi/a;", "y", "Lgi/a;", "W2", "()Lgi/a;", "setAnalyticsEngine$Meijer_playstoreRelease", "(Lgi/a;)V", "analyticsEngine", "Lyo/k;", "z", "Lyo/k;", "getUserManager$Meijer_playstoreRelease", "()Lyo/k;", "setUserManager$Meijer_playstoreRelease", "(Lyo/k;)V", "userManager", "Lqv/O;", "A", "Lqv/O;", "coroutineScope", "B", "Ljava/lang/String;", "campaignIdValue", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0;", "C", "Lkotlin/Lazy;", "c3", "()Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0;", "vm", "Lpr/d;", "D", "b3", "()Lpr/d;", "subscriptionVM", "Lg/c;", "Landroid/content/Intent;", "E", "Lg/c;", "productRateAndReviewLauncher", "F", "substitutionResultLauncher", "Lmk/f;", "a3", "()Lmk/f;", "f3", "()Z", "isFromCLP", "Lcom/meijer/mobile/meijer/activity/find/productdetail/W0;", "featureFlags", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ProductDetailComposeActivity extends Hilt_ProductDetailComposeActivity implements Pj.g {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private InterfaceC16622O coroutineScope;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private String campaignIdValue;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Lazy vm = new androidx.view.e0(Reflection.b(C12233e0.class), new m(this), new l(this), new n(null, this));

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Lazy subscriptionVM = new androidx.view.e0(Reflection.b(C16367d.class), new p(this), new o(this), new q(null, this));

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> productRateAndReviewLauncher = registerForActivityResult(new h.i(), new k());

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> substitutionResultLauncher = registerForActivityResult(new h.i(), new r());

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Al.g featureEntryPoint;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Cl.e meijerIntent;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public yl.k featureManager;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14261a analyticsEngine;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public yo.k userManager;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<ji.R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107293a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f107294b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f107295c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f107296d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f107297e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f107298f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f107299g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$a$a, reason: collision with other inner class name */
        static final class C1624a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f107300a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ji.R0 f107301b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f107302c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f107303d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f107304e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f107305f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f107306g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ String f107307h;

            C1624a(LocalThemeScope localThemeScope, ji.R0 r02, Function0<Unit> function0, String str, String str2, String str3, Function0<Unit> function02, String str4) {
                this.f107300a = localThemeScope;
                this.f107301b = r02;
                this.f107302c = function0;
                this.f107303d = str;
                this.f107304e = str2;
                this.f107305f = str3;
                this.f107306g = function02;
                this.f107307h = str4;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1418846120, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.AcresModal.<anonymous>.<anonymous> (ProductDetailComposeActivity.kt:831)");
                }
                LocalThemeScope localThemeScope = this.f107300a;
                ji.R0 r02 = this.f107301b;
                Function0<Unit> function0 = this.f107302c;
                String str = this.f107303d;
                String str2 = this.f107304e;
                String str3 = this.f107305f;
                Function0<Unit> function02 = this.f107306g;
                String str4 = this.f107307h;
                Modifier.Companion companion = Modifier.INSTANCE;
                C5658d c5658d = C5658d.f48555a;
                C5658d.m mVarH = c5658d.h();
                e.Companion companion2 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion3.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
                C14815g c14815g = C14815g.f139108a;
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierM);
                Function0<InterfaceC5811g> function0A2 = companion3.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A2);
                } else {
                    composer.s();
                }
                Composer composerA2 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
                C14802K.a(InterfaceC14800I.b(C14801J.f139030a, companion, 1.0f, false, 2, null), composer, 0);
                ni.P p10 = ni.P.f151555a;
                String contentDescription = r02.getButtons().getDismissIcon().getContentDescription();
                if (contentDescription == null) {
                    contentDescription = "";
                }
                Ji.C icon = r02.getButtons().getDismissIcon().getIcon();
                int i11 = LocalThemeScope.f15770g;
                String str5 = contentDescription;
                ni.P0.i(localThemeScope, p10, function0, icon, str5, null, false, false, 0L, composer, (Ji.C.f15315b << 9) | i11 | (ni.P.f151556b << 3), 240);
                C14802K.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 11, null), composer, 0);
                composer.v();
                C5658d.f fVarO = c5658d.o(localThemeScope.getAdsSpacing().getFive().getDp());
                e.b bVarG = companion2.g();
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion, localThemeScope.getAdsSpacing().getSeven().getDp(), 0.0f, localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), 2, null);
                MeasurePolicy measurePolicyA2 = C5665k.a(fVarO, bVarG, composer, 48);
                int iA3 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierM2);
                Function0<InterfaceC5811g> function0A3 = companion3.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A3);
                } else {
                    composer.s();
                }
                Composer composerA3 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA3, measurePolicyA2, companion3.e());
                androidx.compose.runtime.D1.c(composerA3, interfaceC5742sR3, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
                q1.Label heading = r02.getLabels().getHeading();
                int i12 = q1.Label.f140080j;
                ri.j.h(localThemeScope, heading, str, null, composer, i11 | (i12 << 3), 4);
                ri.j.h(localThemeScope, r02.getLabels().getBody(), str2, null, composer, i11 | (i12 << 3), 4);
                composer.v();
                C5658d.f fVarO2 = c5658d.o(localThemeScope.getAdsSpacing().getFour().getDp());
                Modifier modifierL = androidx.compose.foundation.layout.D.l(companion, localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp());
                MeasurePolicy measurePolicyA3 = C5665k.a(fVarO2, companion2.k(), composer, 0);
                int iA4 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR4 = composer.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierL);
                Function0<InterfaceC5811g> function0A4 = companion3.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A4);
                } else {
                    composer.s();
                }
                Composer composerA4 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA4, measurePolicyA3, companion3.e());
                androidx.compose.runtime.D1.c(composerA4, interfaceC5742sR4, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion3.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                androidx.compose.runtime.D1.c(composerA4, modifierE4, companion3.f());
                ni.P0.k(localThemeScope, C15860s0.f151792a, str3, function02, null, str3, true, 0L, false, composer, i11 | 1572864 | (C15860s0.f151793b << 3), HttpResponseStatus.SUCCESS_OK);
                composer.startReplaceGroup(1398345735);
                if (str4 != null) {
                    ni.P0.k(localThemeScope, C15866v0.f151806a, str4, function0, null, str4, true, 0L, false, composer, i11 | 1572864 | (C15866v0.f151807b << 3), HttpResponseStatus.SUCCESS_OK);
                    Unit unit = Unit.f142422a;
                }
                composer.P();
                composer.v();
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

        a(LocalThemeScope localThemeScope, Function0<Unit> function0, String str, String str2, String str3, Function0<Unit> function02, String str4) {
            this.f107293a = localThemeScope;
            this.f107294b = function0;
            this.f107295c = str;
            this.f107296d = str2;
            this.f107297e = str3;
            this.f107298f = function02;
            this.f107299g = str4;
        }

        public final void a(ji.R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(2101299381, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.AcresModal.<anonymous> (ProductDetailComposeActivity.kt:827)");
            }
            LocalThemeScope localThemeScope = this.f107293a;
            q1.ModalTemplate modalTemplate = Assemble.getModalTemplate();
            Function0<Unit> function0 = this.f107294b;
            C16977b.b(localThemeScope, modalTemplate, function0, null, ComposableLambdaKt.c(1418846120, true, new C1624a(this.f107293a, Assemble, function0, this.f107295c, this.f107296d, this.f107297e, this.f107298f, this.f107299g), composer, 54), composer, LocalThemeScope.f15770g | 24576 | (q1.ModalTemplate.f140108d << 3), 4);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$ConsumeEffect$1$1", f = "ProductDetailComposeActivity.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107308a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C12233e0.InterfaceC12238e f107310c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C12233e0.InterfaceC12238e interfaceC12238e, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f107310c = interfaceC12238e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProductDetailComposeActivity.this.new b(this.f107310c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f107308a == 0) {
                ResultKt.b(obj);
                new Pj.f(ProductDetailComposeActivity.this, ((C12233e0.InterfaceC12238e.RequireLogin) this.f107310c).getMessageResId(), ProductDetailComposeActivity.this).g();
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$ConsumeEffect$2$1", f = "ProductDetailComposeActivity.kt", l = {}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107311a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C12233e0.InterfaceC12238e f107313c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C12233e0.InterfaceC12238e interfaceC12238e, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f107313c = interfaceC12238e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProductDetailComposeActivity.this.new c(this.f107313c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f107311a == 0) {
                ResultKt.b(obj);
                new Pj.j(ProductDetailComposeActivity.this, ((C12233e0.InterfaceC12238e.UpdateShoppingOrFavoriteListFailed) this.f107313c).getMessageResId(), new Object[0]).r(((C12233e0.InterfaceC12238e.UpdateShoppingOrFavoriteListFailed) this.f107313c).getTitleResId(), new Object[0]).g();
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$ConsumeEffect$3$1", f = "ProductDetailComposeActivity.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107314a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C12233e0.InterfaceC12238e f107315b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProductDetailComposeActivity f107316c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C12233e0.InterfaceC12237d f107317d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C12233e0.InterfaceC12238e interfaceC12238e, ProductDetailComposeActivity productDetailComposeActivity, C12233e0.InterfaceC12237d interfaceC12237d, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f107315b = interfaceC12238e;
            this.f107316c = productDetailComposeActivity;
            this.f107317d = interfaceC12237d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f107315b, this.f107316c, this.f107317d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f107314a == 0) {
                ResultKt.b(obj);
                uw.a.INSTANCE.a("Refresh cart event received", new Object[0]);
                if (((C12233e0.InterfaceC12238e.RefreshCartOnListPageEvent) this.f107315b).getShouldRefresh()) {
                    this.f107316c.setResult(48996);
                } else {
                    this.f107316c.setResult(0);
                }
                this.f107317d.I().invoke(new C12233e0.InterfaceC12239f.DisposeEffect(this.f107315b));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$ConsumeEffect$4$1", f = "ProductDetailComposeActivity.kt", l = {}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107318a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C12233e0.InterfaceC12238e f107320c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C12233e0.InterfaceC12238e interfaceC12238e, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f107320c = interfaceC12238e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProductDetailComposeActivity.this.new e(this.f107320c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f107318a == 0) {
                ResultKt.b(obj);
                ProductDetailComposeActivity.h3(ProductDetailComposeActivity.this, new X0.ShoppingListItem(((C12233e0.InterfaceC12238e.ViewOnShoppingList) this.f107320c).getProduct()), null, this.f107320c, 2, null);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$ConsumeEffect$5$1", f = "ProductDetailComposeActivity.kt", l = {}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107321a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C12233e0.InterfaceC12238e f107323c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C12233e0.InterfaceC12238e interfaceC12238e, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f107323c = interfaceC12238e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProductDetailComposeActivity.this.new f(this.f107323c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f107321a == 0) {
                ResultKt.b(obj);
                ProductDetailComposeActivity.h3(ProductDetailComposeActivity.this, new X0.FavoriteListItem(((C12233e0.InterfaceC12238e.ViewOnFavoriteList) this.f107323c).getProduct()), null, this.f107323c, 2, null);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$LaunchActivity$1$1", f = "ProductDetailComposeActivity.kt", l = {}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107324a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f107325b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProductDetailComposeActivity f107326c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C12233e0.InterfaceC12238e f107327d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Function0<Unit> function0, ProductDetailComposeActivity productDetailComposeActivity, C12233e0.InterfaceC12238e interfaceC12238e, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f107325b = function0;
            this.f107326c = productDetailComposeActivity;
            this.f107327d = interfaceC12238e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new g(this.f107325b, this.f107326c, this.f107327d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f107324a == 0) {
                ResultKt.b(obj);
                this.f107325b.invoke();
                this.f107326c.c3().getViewState().I().invoke(new C12233e0.InterfaceC12239f.DisposeEffect(this.f107327d));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$LaunchToast$5$1", f = "ProductDetailComposeActivity.kt", l = {924, 924}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107328a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107329b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f107330c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f107331d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f107332e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Gi.e f107333f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f107334g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ q1.m.a f107335h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f107336i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f107337j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ProductDetailComposeActivity f107338k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ C12233e0.InterfaceC12238e.d f107339l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f107340m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f107341n;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new h(this.f107329b, this.f107330c, this.f107331d, this.f107332e, this.f107333f, this.f107334g, this.f107335h, this.f107336i, this.f107337j, this.f107338k, this.f107339l, this.f107340m, this.f107341n, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(LocalThemeScope localThemeScope, boolean z10, String str, String str2, Gi.e eVar, boolean z11, q1.m.a aVar, Function0<Unit> function0, Function0<Unit> function02, ProductDetailComposeActivity productDetailComposeActivity, C12233e0.InterfaceC12238e.d dVar, Function0<Unit> function03, Function0<Unit> function04, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f107329b = localThemeScope;
            this.f107330c = z10;
            this.f107331d = str;
            this.f107332e = str2;
            this.f107333f = eVar;
            this.f107334g = z11;
            this.f107335h = aVar;
            this.f107336i = function0;
            this.f107337j = function02;
            this.f107338k = productDetailComposeActivity;
            this.f107339l = dVar;
            this.f107340m = function03;
            this.f107341n = function04;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean l(Function0 function0, ProductDetailComposeActivity productDetailComposeActivity, C12233e0.InterfaceC12238e.d dVar) {
            function0.invoke();
            productDetailComposeActivity.c3().getViewState().I().invoke(new C12233e0.InterfaceC12239f.DisposeEffect(dVar));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean o(Function0 function0, ProductDetailComposeActivity productDetailComposeActivity, C12233e0.InterfaceC12238e.d dVar) {
            function0.invoke();
            productDetailComposeActivity.c3().getViewState().I().invoke(new C12233e0.InterfaceC12239f.DisposeEffect(dVar));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(Function0 function0, ProductDetailComposeActivity productDetailComposeActivity, C12233e0.InterfaceC12238e.d dVar) {
            function0.invoke();
            productDetailComposeActivity.c3().getViewState().I().invoke(new C12233e0.InterfaceC12239f.DisposeEffect(dVar));
            return Unit.f142422a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
        
            if (r3.h(r4, r5, r6, r7, r8, r9, r10, r11, r12) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r13.f107328a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.b(r14)
                r12 = r13
                goto L77
            L13:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1b:
                kotlin.ResultKt.b(r14)
                goto L3c
            L1f:
                kotlin.ResultKt.b(r14)
                Ji.M r14 = r13.f107329b
                boolean r1 = r13.f107330c
                if (r1 == 0) goto L30
                r1 = 80
            L2a:
                float r1 = (float) r1
                float r1 = H1.h.p(r1)
                goto L32
            L30:
                r1 = 0
                goto L2a
            L32:
                r13.f107328a = r3
                java.lang.Object r14 = r14.f(r1, r13)
                if (r14 != r0) goto L3c
                r12 = r13
                goto L76
            L3c:
                r3 = r14
                Gi.i r3 = (Gi.i) r3
                java.lang.String r4 = r13.f107331d
                java.lang.String r5 = r13.f107332e
                Gi.e r6 = r13.f107333f
                boolean r7 = r13.f107334g
                ji.q1$m$a r8 = r13.f107335h
                kotlin.jvm.functions.Function0<kotlin.Unit> r14 = r13.f107337j
                com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity r1 = r13.f107338k
                com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d r9 = r13.f107339l
                r10 = r9
                com.meijer.mobile.meijer.activity.find.productdetail.C0 r9 = new com.meijer.mobile.meijer.activity.find.productdetail.C0
                r9.<init>()
                kotlin.jvm.functions.Function0<kotlin.Unit> r14 = r13.f107340m
                com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity r1 = r13.f107338k
                com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d r10 = r13.f107339l
                r11 = r10
                com.meijer.mobile.meijer.activity.find.productdetail.D0 r10 = new com.meijer.mobile.meijer.activity.find.productdetail.D0
                r10.<init>()
                kotlin.jvm.functions.Function0<kotlin.Unit> r14 = r13.f107341n
                com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity r1 = r13.f107338k
                com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d r11 = r13.f107339l
                r12 = r11
                com.meijer.mobile.meijer.activity.find.productdetail.E0 r11 = new com.meijer.mobile.meijer.activity.find.productdetail.E0
                r11.<init>()
                r13.f107328a = r2
                r12 = r13
                java.lang.Object r14 = r3.h(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L77
            L76:
                return r0
            L77:
                kotlin.jvm.functions.Function0<kotlin.Unit> r14 = r12.f107336i
                r14.invoke()
                kotlin.Unit r14 = kotlin.Unit.f142422a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class i implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ProductDetailComposeActivity f107343a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17893M0 f107344b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<qv.C0> f107345c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<qv.C0> f107346d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C17893M0 f107347e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<qv.C0> f107348f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C17927c1 f107349g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ SubscriptionSummaryDecorator f107350h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function0<qv.C0> f107351i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Function0<qv.C0> f107352j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.z1<ProductDetailFeatureFlags> f107353k;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$i$a$a, reason: collision with other inner class name */
            static final class C1625a implements Function3<InterfaceC14812d, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f107354a;

                C1625a(LocalThemeScope localThemeScope) {
                    this.f107354a = localThemeScope;
                }

                public final void a(InterfaceC14812d AcresBottomSheet, Composer composer, int i10) {
                    Intrinsics.j(AcresBottomSheet, "$this$AcresBottomSheet");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-578232389, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ProductDetailComposeActivity.kt:367)");
                    }
                    C16145c.c(this.f107354a, null, composer, LocalThemeScope.f15770g, 1);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14812d interfaceC14812d, Composer composer, Integer num) {
                    a(interfaceC14812d, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C17893M0 f107355a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f107356b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function0<qv.C0> f107357c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ ProductDetailComposeActivity f107358d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ C17927c1 f107359e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ SubscriptionSummaryDecorator f107360f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function0<qv.C0> f107361g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Function0<qv.C0> f107362h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.z1<ProductDetailFeatureFlags> f107363i;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$i$a$b$a, reason: collision with other inner class name */
                static final class C1626a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f107364a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ Function0<qv.C0> f107365b;

                    /* JADX WARN: Multi-variable type inference failed */
                    C1626a(LocalThemeScope localThemeScope, Function0<? extends qv.C0> function0) {
                        this.f107364a = localThemeScope;
                        this.f107365b = function0;
                    }

                    public final void b(InterfaceC14814f ModalBottomSheetLayout, Composer composer, int i10) {
                        Intrinsics.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1506837872, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductDetailComposeActivity.kt:374)");
                        }
                        LocalThemeScope localThemeScope = this.f107364a;
                        composer.startReplaceGroup(5004770);
                        boolean zV = composer.V(this.f107365b);
                        final Function0<qv.C0> function0 = this.f107365b;
                        Object objB = composer.B();
                        if (zV || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.N0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ProductDetailComposeActivity.i.a.b.C1626a.c(function0);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        C12117e.b(localThemeScope, null, (Function0) objB, composer, LocalThemeScope.f15770g, 1);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                        b(interfaceC14814f, composer, num.intValue());
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(Function0 function0) {
                        function0.invoke();
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$i$a$b$b, reason: collision with other inner class name */
                static final class C1627b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ ProductDetailComposeActivity f107366a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f107367b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ C17927c1 f107368c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ SubscriptionSummaryDecorator f107369d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ Function0<qv.C0> f107370e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ Function0<qv.C0> f107371f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.runtime.z1<ProductDetailFeatureFlags> f107372g;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$i$a$b$b$a, reason: collision with other inner class name */
                    /* synthetic */ class C1628a extends FunctionReferenceImpl implements Function2<ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> {
                        C1628a(Object obj) {
                            super(2, obj, ProductDetailComposeActivity.class, "onEntryUpdate", "onEntryUpdate(Lcom/meijer/mobile/product/model/fulldetails/ProductFullDetails;Lcom/meijer/mobile/core/design/widget/stepperview/ControlState;)V", 0);
                        }

                        public final void a(ProductFullDetails p02, com.meijer.mobile.core.design.widget.stepperview.a p12) {
                            Intrinsics.j(p02, "p0");
                            Intrinsics.j(p12, "p1");
                            ((ProductDetailComposeActivity) this.receiver).j3(p02, p12);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(ProductFullDetails productFullDetails, com.meijer.mobile.core.design.widget.stepperview.a aVar) {
                            a(productFullDetails, aVar);
                            return Unit.f142422a;
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$i$a$b$b$b, reason: collision with other inner class name */
                    /* synthetic */ class C1629b extends FunctionReferenceImpl implements Function1<AbstractC12200a, Unit> {
                        C1629b(Object obj) {
                            super(1, obj, C12233e0.class, "onCarouselTrackingAction", "onCarouselTrackingAction(Lcom/meijer/mobile/meijer/activity/find/viewmodel/CarouselTrackingAction;)V", 0);
                        }

                        public final void a(AbstractC12200a p02) {
                            Intrinsics.j(p02, "p0");
                            ((C12233e0) this.receiver).S1(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AbstractC12200a abstractC12200a) {
                            a(abstractC12200a);
                            return Unit.f142422a;
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$i$a$b$b$c */
                    /* synthetic */ class c extends FunctionReferenceImpl implements Function3<Boolean, ProductVariantDecorator, String, Unit> {
                        c(Object obj) {
                            super(3, obj, C12233e0.class, "updateVariantInteraction", "updateVariantInteraction(ZLcom/meijer/mobile/meijer/activity/find/productvariant/ProductVariantDecorator;Ljava/lang/String;)V", 0);
                        }

                        public final void a(boolean z10, ProductVariantDecorator p12, String p22) {
                            Intrinsics.j(p12, "p1");
                            Intrinsics.j(p22, "p2");
                            ((C12233e0) this.receiver).g3(z10, p12, p22);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, ProductVariantDecorator productVariantDecorator, String str) {
                            a(bool.booleanValue(), productVariantDecorator, str);
                            return Unit.f142422a;
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    C1627b(ProductDetailComposeActivity productDetailComposeActivity, LocalThemeScope localThemeScope, C17927c1 c17927c1, SubscriptionSummaryDecorator subscriptionSummaryDecorator, Function0<? extends qv.C0> function0, Function0<? extends qv.C0> function02, androidx.compose.runtime.z1<ProductDetailFeatureFlags> z1Var) {
                        this.f107366a = productDetailComposeActivity;
                        this.f107367b = localThemeScope;
                        this.f107368c = c17927c1;
                        this.f107369d = subscriptionSummaryDecorator;
                        this.f107370e = function0;
                        this.f107371f = function02;
                        this.f107372g = z1Var;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit k(ProductDetailComposeActivity productDetailComposeActivity, GoogleAdAnalytics googleAnalytics) {
                        Intrinsics.j(googleAnalytics, "googleAnalytics");
                        productDetailComposeActivity.c3().getViewState().I().invoke(new C12233e0.InterfaceC12239f.GoogleAdClicked(googleAnalytics));
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit o(ProductDetailComposeActivity productDetailComposeActivity, AbstractC16364a it) {
                        Intrinsics.j(it, "it");
                        productDetailComposeActivity.startActivity(productDetailComposeActivity.Z2().I(it.getProduct()));
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit p(ProductDetailComposeActivity productDetailComposeActivity, X0 r10, View view) {
                        Intrinsics.j(r10, "r");
                        ProductDetailComposeActivity.h3(productDetailComposeActivity, r10, view, null, 4, null);
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit q(ProductDetailComposeActivity productDetailComposeActivity, int i10) {
                        productDetailComposeActivity.startActivity(Al.o.f689a.d(productDetailComposeActivity, new ProductInformation(productDetailComposeActivity.c3().getViewState().m().getValue().getId().getCode(), productDetailComposeActivity.c3().getViewState().m().getValue().getName().getName(), ((ProductImageViewModel) CollectionsKt.s0(productDetailComposeActivity.c3().getViewState().m().getValue().h())).c()), i10));
                        return Unit.f142422a;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:51:0x0193  */
                    /* JADX WARN: Removed duplicated region for block: B:54:0x019e  */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x01c1  */
                    /* JADX WARN: Removed duplicated region for block: B:60:0x01c9  */
                    /* JADX WARN: Removed duplicated region for block: B:63:0x0209  */
                    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void g(androidx.compose.runtime.Composer r22, int r23) {
                        /*
                            Method dump skipped, instructions count: 525
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.i.a.b.C1627b.g(androidx.compose.runtime.Composer, int):void");
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        g(composer, num.intValue());
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit l(Function0 function0) {
                        function0.invoke();
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit r(Function0 function0) {
                        function0.invoke();
                        return Unit.f142422a;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                b(C17893M0 c17893m0, LocalThemeScope localThemeScope, Function0<? extends qv.C0> function0, ProductDetailComposeActivity productDetailComposeActivity, C17927c1 c17927c1, SubscriptionSummaryDecorator subscriptionSummaryDecorator, Function0<? extends qv.C0> function02, Function0<? extends qv.C0> function03, androidx.compose.runtime.z1<ProductDetailFeatureFlags> z1Var) {
                    this.f107355a = c17893m0;
                    this.f107356b = localThemeScope;
                    this.f107357c = function0;
                    this.f107358d = productDetailComposeActivity;
                    this.f107359e = c17927c1;
                    this.f107360f = subscriptionSummaryDecorator;
                    this.f107361g = function02;
                    this.f107362h = function03;
                    this.f107363i = z1Var;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(739767646, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ProductDetailComposeActivity.kt:370)");
                    }
                    float f10 = 24;
                    C17891L0.b(ComposableLambdaKt.c(1506837872, true, new C1626a(this.f107356b, this.f107357c), composer, 54), null, this.f107355a, false, C16692i.e(H1.h.p(f10), H1.h.p(f10), 0.0f, 0.0f, 12, null), 0.0f, 0L, 0L, 0L, ComposableLambdaKt.c(-923718697, true, new C1627b(this.f107358d, this.f107356b, this.f107359e, this.f107360f, this.f107361g, this.f107362h, this.f107363i), composer, 54), composer, (C17893M0.f167209e << 6) | 805306374, 490);
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

            /* JADX WARN: Multi-variable type inference failed */
            a(ProductDetailComposeActivity productDetailComposeActivity, C17893M0 c17893m0, Function0<? extends qv.C0> function0, Function0<? extends qv.C0> function02, C17893M0 c17893m02, Function0<? extends qv.C0> function03, C17927c1 c17927c1, SubscriptionSummaryDecorator subscriptionSummaryDecorator, Function0<? extends qv.C0> function04, Function0<? extends qv.C0> function05, androidx.compose.runtime.z1<ProductDetailFeatureFlags> z1Var) {
                this.f107343a = productDetailComposeActivity;
                this.f107344b = c17893m0;
                this.f107345c = function0;
                this.f107346d = function02;
                this.f107347e = c17893m02;
                this.f107348f = function03;
                this.f107349g = c17927c1;
                this.f107350h = subscriptionSummaryDecorator;
                this.f107351i = function04;
                this.f107352j = function05;
                this.f107353k = z1Var;
            }

            public final void d(LocalThemeScope AdsTheme, Composer composer, int i10) {
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
                    ComposerKt.U(-818888866, i11, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.onCreate.<anonymous>.<anonymous> (ProductDetailComposeActivity.kt:356)");
                }
                composer.startReplaceGroup(-973183515);
                List<C12233e0.InterfaceC12238e> listJ = this.f107343a.c3().getViewState().J();
                ProductDetailComposeActivity productDetailComposeActivity = this.f107343a;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(listJ, 10));
                Iterator<T> it = listJ.iterator();
                while (it.hasNext()) {
                    productDetailComposeActivity.X1(AdsTheme, (C12233e0.InterfaceC12238e) it.next(), productDetailComposeActivity.c3().getViewState(), composer, (i11 & 14) | LocalThemeScope.f15770g);
                    arrayList.add(Unit.f142422a);
                    productDetailComposeActivity = productDetailComposeActivity;
                }
                composer.P();
                C17893M0 c17893m0 = this.f107344b;
                String strC = C16193g.c(C15307d.f147849P, composer, 0);
                String strC2 = C16193g.c(C15307d.f147852S, composer, 0);
                String strC3 = C16193g.c(C15307d.f147846M, composer, 0);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f107345c);
                final Function0<qv.C0> function0 = this.f107345c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.K0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProductDetailComposeActivity.i.a.e(function0);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function02 = (Function0) objB;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(this.f107346d);
                final Function0<qv.C0> function03 = this.f107346d;
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.L0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProductDetailComposeActivity.i.a.f(function03);
                        }
                    };
                    composer.t(objB2);
                }
                Function0 function04 = (Function0) objB2;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zV3 = composer.V(this.f107345c);
                final Function0<qv.C0> function05 = this.f107345c;
                Object objB3 = composer.B();
                if (zV3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.M0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProductDetailComposeActivity.i.a.g(function05);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                C15417h.j(AdsTheme, null, c17893m0, strC, null, strC2, strC3, function02, function04, null, (Function0) objB3, false, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.c(-578232389, true, new C1625a(AdsTheme), composer, 54), false, ComposableLambdaKt.c(739767646, true, new b(this.f107347e, AdsTheme, this.f107348f, this.f107343a, this.f107349g, this.f107350h, this.f107351i, this.f107352j, this.f107353k), composer, 54), composer, LocalThemeScope.f15770g | (i11 & 14) | (C17893M0.f167209e << 6), 12779520, 48393);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                d(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Function0 function0) {
                function0.invoke();
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(Function0 function0) {
                function0.invoke();
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(Function0 function0) {
                function0.invoke();
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$onCreate$1$closeIlcSheet$1$1$1", f = "ProductDetailComposeActivity.kt", l = {332}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f107373a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17893M0 f107374b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f107374b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C17893M0 c17893m0, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f107374b = c17893m0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f107373a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17893M0 c17893m0 = this.f107374b;
                    this.f107373a = 1;
                    if (c17893m0.i(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$onCreate$1$closeIspSheet$1$1$1", f = "ProductDetailComposeActivity.kt", l = {345}, m = "invokeSuspend")
        static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f107375a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17893M0 f107376b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.f107376b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C17893M0 c17893m0, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f107376b = c17893m0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f107375a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17893M0 c17893m0 = this.f107376b;
                    this.f107375a = 1;
                    if (c17893m0.i(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$onCreate$1$howItWorksPage$1$1$1", f = "ProductDetailComposeActivity.kt", l = {349}, m = "invokeSuspend")
        static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f107377a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17893M0 f107378b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ProductDetailComposeActivity f107379c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new d(this.f107378b, this.f107379c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C17893M0 c17893m0, ProductDetailComposeActivity productDetailComposeActivity, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f107378b = c17893m0;
                this.f107379c = productDetailComposeActivity;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f107377a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17893M0 c17893m0 = this.f107378b;
                    this.f107377a = 1;
                    if (c17893m0.i(this) == objF) {
                        return objF;
                    }
                }
                ProductDetailComposeActivity productDetailComposeActivity = this.f107379c;
                productDetailComposeActivity.startActivity(productDetailComposeActivity.Z2().u());
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$onCreate$1$openIlcSheet$1$1$1", f = "ProductDetailComposeActivity.kt", l = {335}, m = "invokeSuspend")
        static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f107380a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17893M0 f107381b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new e(this.f107381b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(C17893M0 c17893m0, Continuation<? super e> continuation) {
                super(2, continuation);
                this.f107381b = c17893m0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f107380a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17893M0 c17893m0 = this.f107381b;
                    this.f107380a = 1;
                    if (c17893m0.l(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$onCreate$1$openIspSheet$1$1$1", f = "ProductDetailComposeActivity.kt", l = {342}, m = "invokeSuspend")
        static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f107382a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17893M0 f107383b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new f(this.f107383b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(C17893M0 c17893m0, Continuation<? super f> continuation) {
                super(2, continuation);
                this.f107383b = c17893m0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f107382a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17893M0 c17893m0 = this.f107383b;
                    this.f107382a = 1;
                    if (c17893m0.l(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        i() {
        }

        public final void g(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-98783729, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.onCreate.<anonymous> (ProductDetailComposeActivity.kt:322)");
            }
            androidx.compose.runtime.z1 z1VarC = S2.a.c(ProductDetailComposeActivity.this.c3().v1(), null, null, null, composer, 0, 7);
            C17927c1 c17927c1G = C17921a1.g(null, null, composer, 0, 3);
            EnumC17895N0 enumC17895N0 = EnumC17895N0.f167226a;
            final C17893M0 c17893m0J = C17891L0.j(enumC17895N0, null, null, true, composer, 3078, 6);
            ProductDetailComposeActivity productDetailComposeActivity = ProductDetailComposeActivity.this;
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f142646a, composer);
                composer.t(objB);
            }
            productDetailComposeActivity.coroutineScope = (InterfaceC16622O) objB;
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(ProductDetailComposeActivity.this) | composer.D(c17893m0J);
            final ProductDetailComposeActivity productDetailComposeActivity2 = ProductDetailComposeActivity.this;
            Object objB2 = composer.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.F0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductDetailComposeActivity.i.o(productDetailComposeActivity2, c17893m0J);
                    }
                };
                composer.t(objB2);
            }
            Function0 function0 = (Function0) objB2;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD2 = composer.D(ProductDetailComposeActivity.this) | composer.D(c17893m0J);
            final ProductDetailComposeActivity productDetailComposeActivity3 = ProductDetailComposeActivity.this;
            Object objB3 = composer.B();
            if (zD2 || objB3 == companion.a()) {
                objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.G0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductDetailComposeActivity.i.p(productDetailComposeActivity3, c17893m0J);
                    }
                };
                composer.t(objB3);
            }
            Function0 function02 = (Function0) objB3;
            composer.P();
            final C17893M0 c17893m0J2 = C17891L0.j(enumC17895N0, null, null, true, composer, 3078, 6);
            composer.startReplaceGroup(-1633490746);
            boolean zD3 = composer.D(ProductDetailComposeActivity.this) | composer.D(c17893m0J2);
            final ProductDetailComposeActivity productDetailComposeActivity4 = ProductDetailComposeActivity.this;
            Object objB4 = composer.B();
            if (zD3 || objB4 == companion.a()) {
                objB4 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.H0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductDetailComposeActivity.i.q(productDetailComposeActivity4, c17893m0J2);
                    }
                };
                composer.t(objB4);
            }
            Function0 function03 = (Function0) objB4;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD4 = composer.D(ProductDetailComposeActivity.this) | composer.D(c17893m0J2);
            final ProductDetailComposeActivity productDetailComposeActivity5 = ProductDetailComposeActivity.this;
            Object objB5 = composer.B();
            if (zD4 || objB5 == companion.a()) {
                objB5 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.I0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductDetailComposeActivity.i.r(productDetailComposeActivity5, c17893m0J2);
                    }
                };
                composer.t(objB5);
            }
            Function0 function04 = (Function0) objB5;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD5 = composer.D(ProductDetailComposeActivity.this) | composer.D(c17893m0J2);
            final ProductDetailComposeActivity productDetailComposeActivity6 = ProductDetailComposeActivity.this;
            Object objB6 = composer.B();
            if (zD5 || objB6 == companion.a()) {
                objB6 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.J0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductDetailComposeActivity.i.l(productDetailComposeActivity6, c17893m0J2);
                    }
                };
                composer.t(objB6);
            }
            composer.P();
            Ji.K.b(null, ComposableLambdaKt.c(-818888866, true, new a(ProductDetailComposeActivity.this, c17893m0J2, function04, (Function0) objB6, c17893m0J, function0, c17927c1G, (SubscriptionSummaryDecorator) S2.a.c(ProductDetailComposeActivity.this.b3().p(), null, null, null, composer, 0, 7).getValue(), function02, function03, z1VarC), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            g(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ProductDetailFeatureFlags k(androidx.compose.runtime.z1<ProductDetailFeatureFlags> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qv.C0 l(ProductDetailComposeActivity productDetailComposeActivity, C17893M0 c17893m0) {
            InterfaceC16622O interfaceC16622O;
            InterfaceC16622O interfaceC16622O2 = productDetailComposeActivity.coroutineScope;
            if (interfaceC16622O2 == null) {
                Intrinsics.y("coroutineScope");
                interfaceC16622O = null;
            } else {
                interfaceC16622O = interfaceC16622O2;
            }
            return C16648k.d(interfaceC16622O, null, null, new d(c17893m0, productDetailComposeActivity, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qv.C0 o(ProductDetailComposeActivity productDetailComposeActivity, C17893M0 c17893m0) {
            InterfaceC16622O interfaceC16622O;
            InterfaceC16622O interfaceC16622O2 = productDetailComposeActivity.coroutineScope;
            if (interfaceC16622O2 == null) {
                Intrinsics.y("coroutineScope");
                interfaceC16622O = null;
            } else {
                interfaceC16622O = interfaceC16622O2;
            }
            return C16648k.d(interfaceC16622O, null, null, new b(c17893m0, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qv.C0 p(ProductDetailComposeActivity productDetailComposeActivity, C17893M0 c17893m0) {
            InterfaceC16622O interfaceC16622O;
            InterfaceC16622O interfaceC16622O2 = productDetailComposeActivity.coroutineScope;
            if (interfaceC16622O2 == null) {
                Intrinsics.y("coroutineScope");
                interfaceC16622O = null;
            } else {
                interfaceC16622O = interfaceC16622O2;
            }
            return C16648k.d(interfaceC16622O, null, null, new e(c17893m0, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qv.C0 q(ProductDetailComposeActivity productDetailComposeActivity, C17893M0 c17893m0) {
            InterfaceC16622O interfaceC16622O;
            InterfaceC16622O interfaceC16622O2 = productDetailComposeActivity.coroutineScope;
            if (interfaceC16622O2 == null) {
                Intrinsics.y("coroutineScope");
                interfaceC16622O = null;
            } else {
                interfaceC16622O = interfaceC16622O2;
            }
            return C16648k.d(interfaceC16622O, null, null, new f(c17893m0, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qv.C0 r(ProductDetailComposeActivity productDetailComposeActivity, C17893M0 c17893m0) {
            InterfaceC16622O interfaceC16622O;
            InterfaceC16622O interfaceC16622O2 = productDetailComposeActivity.coroutineScope;
            if (interfaceC16622O2 == null) {
                Intrinsics.y("coroutineScope");
                interfaceC16622O = null;
            } else {
                interfaceC16622O = interfaceC16622O2;
            }
            return C16648k.d(interfaceC16622O, null, null, new c(c17893m0, null), 3, null);
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
            return new FunctionReferenceImpl(1, ProductDetailComposeActivity.this, ProductDetailComposeActivity.class, "handleRateAndReviewResult", "handleRateAndReviewResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            ProductDetailComposeActivity.this.d3(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class l extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107388f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentActivity componentActivity) {
            super(0);
            this.f107388f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f107388f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class m extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107389f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentActivity componentActivity) {
            super(0);
            this.f107389f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f107389f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class n extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f107390f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107391g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f107390f = function0;
            this.f107391g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f107390f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f107391g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class o extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107392f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentActivity componentActivity) {
            super(0);
            this.f107392f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f107392f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class p extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107393f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentActivity componentActivity) {
            super(0);
            this.f107393f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f107393f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class q extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f107394f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107395g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f107394f = function0;
            this.f107395g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f107394f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f107395g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class r implements InterfaceC14146b, FunctionAdapter {
        r() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ProductDetailComposeActivity.this, ProductDetailComposeActivity.class, "handleSubstitutionResult", "handleSubstitutionResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            ProductDetailComposeActivity.this.e3(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A2(ProductDetailComposeActivity productDetailComposeActivity, ReadReview readReview, int i10, Composer composer, int i11) {
        productDetailComposeActivity.y2(readReview, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D2(ProductDetailComposeActivity productDetailComposeActivity, ReviewGallery reviewGallery, int i10, Composer composer, int i11) {
        productDetailComposeActivity.B2(reviewGallery, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G2(ProductDetailComposeActivity productDetailComposeActivity, SeeAllReviews seeAllReviews, int i10, Composer composer, int i11) {
        productDetailComposeActivity.E2(seeAllReviews, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(ProductDetailComposeActivity productDetailComposeActivity, WriteReview writeReview, int i10, Composer composer, int i11) {
        productDetailComposeActivity.H2(writeReview, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:318:0x08da  */
    @android.annotation.SuppressLint({"MissingComposePreview"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X1(final Ji.LocalThemeScope r18, final com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12238e r19, com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d r20, androidx.compose.runtime.Composer r21, final int r22) {
        /*
            Method dump skipped, instructions count: 2307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.X1(Ji.M, com.meijer.mobile.meijer.activity.find.viewmodel.e0$e, com.meijer.mobile.meijer.activity.find.viewmodel.e0$d, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n2(ProductDetailComposeActivity productDetailComposeActivity, C12233e0.InterfaceC12238e interfaceC12238e, Function0 function0, int i10, Composer composer, int i11) {
        productDetailComposeActivity.m2(interfaceC12238e, function0, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0112  */
    @android.annotation.SuppressLint({"MissingComposePreview"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void o2(final Ji.LocalThemeScope r32, com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12238e.d r33, final java.lang.String r34, java.lang.String r35, Gi.e r36, boolean r37, ji.q1.m.a r38, final boolean r39, kotlin.jvm.functions.Function0<kotlin.Unit> r40, kotlin.jvm.functions.Function0<kotlin.Unit> r41, kotlin.jvm.functions.Function0<kotlin.Unit> r42, kotlin.jvm.functions.Function0<kotlin.Unit> r43, androidx.compose.runtime.Composer r44, final int r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 1043
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.o2(Ji.M, com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d, java.lang.String, java.lang.String, Gi.e, boolean, ji.q1$m$a, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsp/b;", "LCo/h;", "it", "", "<anonymous>", "(Lsp/b;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$onCreate$2", f = "ProductDetailComposeActivity.kt", l = {}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<ProductState<ProductFullDetails>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107384a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f107385b;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            j jVar = ProductDetailComposeActivity.this.new j(continuation);
            jVar.f107385b = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ProductState<ProductFullDetails> productState, Continuation<? super Unit> continuation) {
            return ((j) create(productState, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f107384a == 0) {
                ResultKt.b(obj);
                ProductDetailComposeActivity.this.b3().r((ProductFullDetails) ((ProductState) this.f107385b).g());
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C2(ProductDetailComposeActivity productDetailComposeActivity, ReviewGallery reviewGallery) {
        Al.o oVar = Al.o.f689a;
        productDetailComposeActivity.startActivity(Al.o.b(productDetailComposeActivity, reviewGallery.getIndex(), reviewGallery.b()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F2(ProductDetailComposeActivity productDetailComposeActivity, SeeAllReviews seeAllReviews) {
        productDetailComposeActivity.startActivity(Al.o.f689a.c(productDetailComposeActivity, seeAllReviews.getProductInfo()));
        return Unit.f142422a;
    }

    @SuppressLint({"MissingComposePreview"})
    private final void K2(final LocalThemeScope localThemeScope, final C12233e0.InterfaceC12238e.d.BazaarVoiceFeedbackSubmitted cVar, final boolean z10, Composer composer, final int i10) {
        int i11;
        C12233e0.InterfaceC12238e.d.BazaarVoiceFeedbackSubmitted cVar2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1955101139);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            cVar2 = cVar;
            i11 |= composerStartRestartGroup.D(cVar2) ? 32 : 16;
        } else {
            cVar2 = cVar;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(this) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1955101139, i11, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.UIToastForBVFeedback (ProductDetailComposeActivity.kt:990)");
            }
            o2(localThemeScope, cVar, AbstractC5607a.INSTANCE.d(cVar2.getFeedbackVote() == Kp.a.f17434a ? Lp.c.f18646j0 : Lp.c.f18676y0, new Object[0]).b(this), null, null, false, q1.m.a.d.f140117a, z10, null, null, null, null, composerStartRestartGroup, LocalThemeScope.f15770g | (i11 & 14) | (i11 & 112) | (q1.m.a.d.f140118b << 18) | ((i11 << 15) & 29360128), (i11 >> 3) & 896, 1948);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.m0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductDetailComposeActivity.L2(this.f107643a, localThemeScope, cVar, z10, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L2(ProductDetailComposeActivity productDetailComposeActivity, LocalThemeScope localThemeScope, C12233e0.InterfaceC12238e.d.BazaarVoiceFeedbackSubmitted cVar, boolean z10, int i10, Composer composer, int i11) {
        productDetailComposeActivity.K2(localThemeScope, cVar, z10, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    @SuppressLint({"MissingComposePreview"})
    private final void M2(final LocalThemeScope localThemeScope, final C12233e0.InterfaceC12238e.d.BazaarVoiceFeedbackAttemptWithoutLogin bVar, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1605151847);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(bVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(this) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1605151847, i11, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.UIToastSignInBeforeVote (ProductDetailComposeActivity.kt:1009)");
            }
            o2(localThemeScope, bVar, C16193g.c(bVar.getMessage(), composerStartRestartGroup, 0), null, null, false, q1.m.a.c.f140115a, false, null, null, null, null, composerStartRestartGroup, 12582912 | LocalThemeScope.f15770g | (i11 & 14) | (i11 & 112) | (q1.m.a.c.f140116b << 18), i11 & 896, 1948);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductDetailComposeActivity.N2(this.f107575a, localThemeScope, bVar, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N2(ProductDetailComposeActivity productDetailComposeActivity, LocalThemeScope localThemeScope, C12233e0.InterfaceC12238e.d.BazaarVoiceFeedbackAttemptWithoutLogin bVar, int i10, Composer composer, int i11) {
        productDetailComposeActivity.M2(localThemeScope, bVar, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    private final void V1(final LocalThemeScope localThemeScope, final String str, final String str2, final String str3, final String str4, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i10) {
        int i11;
        String str5;
        String str6;
        String str7;
        Function0<Unit> function03;
        Function0<Unit> function04;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1463026278);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            str5 = str2;
            i11 |= composerStartRestartGroup.V(str5) ? 256 : 128;
        } else {
            str5 = str2;
        }
        if ((i10 & 3072) == 0) {
            str6 = str3;
            i11 |= composerStartRestartGroup.V(str6) ? RecyclerView.m.FLAG_MOVED : 1024;
        } else {
            str6 = str3;
        }
        if ((i10 & 24576) == 0) {
            str7 = str4;
            i11 |= composerStartRestartGroup.V(str7) ? 16384 : 8192;
        } else {
            str7 = str4;
        }
        if ((196608 & i10) == 0) {
            function03 = function0;
            i11 |= composerStartRestartGroup.D(function03) ? 131072 : 65536;
        } else {
            function03 = function0;
        }
        if ((1572864 & i10) == 0) {
            function04 = function02;
            i11 |= composerStartRestartGroup.D(function04) ? 1048576 : 524288;
        } else {
            function04 = function02;
        }
        int i12 = i11;
        if ((599187 & i12) == 599186 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1463026278, i12, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.AcresModal (ProductDetailComposeActivity.kt:825)");
            }
            Ji.Q.e(localThemeScope, C14924a0.f139754a, ComposableLambdaKt.c(2101299381, true, new a(localThemeScope, function04, str, str5, str6, function03, str7), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f15770g | 384 | (i12 & 14) | (C14924a0.f139755b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.t0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductDetailComposeActivity.W1(this.f107760a, localThemeScope, str, str2, str3, str4, function0, function02, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W1(ProductDetailComposeActivity productDetailComposeActivity, LocalThemeScope localThemeScope, String str, String str2, String str3, String str4, Function0 function0, Function0 function02, int i10, Composer composer, int i11) {
        productDetailComposeActivity.V1(localThemeScope, str, str2, str3, str4, function0, function02, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b2(ProductDetailComposeActivity productDetailComposeActivity) {
        h3(productDetailComposeActivity, X0.a.f107427a, null, null, 6, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16367d b3() {
        return (C16367d) this.subscriptionVM.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c2(C12233e0.InterfaceC12238e interfaceC12238e, ProductDetailComposeActivity productDetailComposeActivity) {
        Entry entryB = ((C12233e0.InterfaceC12238e.d.AddToCartSuccess) interfaceC12238e).getEntry();
        if (entryB != null) {
            CartProductListDecorator cartProductListDecoratorB = CartProductListDecorator.Companion.b(CartProductListDecorator.INSTANCE, entryB, false, 2, null);
            if (cartProductListDecoratorB.getStockInfo().c()) {
                productDetailComposeActivity.substitutionResultLauncher.a(Al.t.e(Al.t.f694a, productDetailComposeActivity, cartProductListDecoratorB, Pp.c.f28366d, null, "product detail page", 8, null));
            }
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C12233e0 c3() {
        return (C12233e0) this.vm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d2(ProductDetailComposeActivity productDetailComposeActivity) {
        h3(productDetailComposeActivity, X0.a.f107427a, null, null, 6, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e2(ProductDetailComposeActivity productDetailComposeActivity) {
        h3(productDetailComposeActivity, X0.a.f107427a, null, null, 6, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f2(ProductDetailComposeActivity productDetailComposeActivity, C12233e0.InterfaceC12238e interfaceC12238e) {
        Gi.i.INSTANCE.b();
        productDetailComposeActivity.startActivity(productDetailComposeActivity.Z2().f(((C12233e0.InterfaceC12238e.d.ShowCouponClipped) interfaceC12238e).getCoupon(), true, true, false, null));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g2(ProductDetailComposeActivity productDetailComposeActivity, C12233e0.InterfaceC12238e interfaceC12238e) {
        Gi.i.INSTANCE.b();
        productDetailComposeActivity.c3().V1(new a.Clip(((C12233e0.InterfaceC12238e.d.ShowClipCouponError) interfaceC12238e).getCoupon(), null, 2, null));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g3(com.meijer.mobile.meijer.activity.find.productdetail.X0 r11, android.view.View r12, com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12238e r13) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.g3(com.meijer.mobile.meijer.activity.find.productdetail.X0, android.view.View, com.meijer.mobile.meijer.activity.find.viewmodel.e0$e):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h2(ProductDetailComposeActivity productDetailComposeActivity) {
        Gi.i.INSTANCE.b();
        productDetailComposeActivity.startActivity(Cl.e.j(productDetailComposeActivity.Z2(), productDetailComposeActivity, null, productDetailComposeActivity.Y2().e(AbstractC18227f.M.f170552h), productDetailComposeActivity.Y2().e(AbstractC18227f.N.f170553h), 1, 2, null));
        return Unit.f142422a;
    }

    static /* synthetic */ void h3(ProductDetailComposeActivity productDetailComposeActivity, X0 x02, View view, C12233e0.InterfaceC12238e interfaceC12238e, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            view = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC12238e = null;
        }
        productDetailComposeActivity.g3(x02, view, interfaceC12238e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i3(ProductDetailComposeActivity productDetailComposeActivity, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("product detail page");
        track.c(Ao.W.f1200a.h(productDetailComposeActivity.a3()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l2(ProductDetailComposeActivity productDetailComposeActivity, LocalThemeScope localThemeScope, C12233e0.InterfaceC12238e interfaceC12238e, C12233e0.InterfaceC12237d interfaceC12237d, int i10, Composer composer, int i11) {
        productDetailComposeActivity.X1(localThemeScope, interfaceC12238e, interfaceC12237d, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p2() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q2() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r2() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s2() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t2(ProductDetailComposeActivity productDetailComposeActivity, LocalThemeScope localThemeScope, C12233e0.InterfaceC12238e.d dVar, String str, String str2, Gi.e eVar, boolean z10, q1.m.a aVar, boolean z11, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i10, int i11, int i12, Composer composer, int i13) {
        productDetailComposeActivity.o2(localThemeScope, dVar, str, str2, eVar, z10, aVar, z11, function0, function02, function03, function04, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f142422a;
    }

    private final void u2(final LocalThemeScope localThemeScope, final C12233e0.InterfaceC12238e.ShowError cVar, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, Composer composer, final int i10) {
        int i11;
        ProductDetailComposeActivity productDetailComposeActivity;
        Composer composerStartRestartGroup = composer.startRestartGroup(-709640136);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(function0) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(function02) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.D(function03) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            productDetailComposeActivity = this;
            i11 |= composerStartRestartGroup.D(productDetailComposeActivity) ? 131072 : 65536;
        } else {
            productDetailComposeActivity = this;
        }
        if ((74899 & i11) == 74898 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-709640136, i11, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.ShowErrorModal (ProductDetailComposeActivity.kt:781)");
            }
            String strC = C16193g.c(cVar.getTitle(), composerStartRestartGroup, 0);
            String strC2 = C16193g.c(cVar.getMessage(), composerStartRestartGroup, 0);
            String strC3 = C16193g.c(cVar.getPositiveButtonText(), composerStartRestartGroup, 0);
            Integer numB = cVar.getNegativeButtonText();
            composerStartRestartGroup.startReplaceGroup(935644882);
            String strC4 = numB == null ? null : C16193g.c(numB.intValue(), composerStartRestartGroup, 0);
            composerStartRestartGroup.P();
            composerStartRestartGroup.startMovableGroup(935646631, cVar);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i12 = 57344 & i11;
            boolean z10 = ((i11 & 896) == 256) | (i12 == 16384);
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.Y
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductDetailComposeActivity.v2(function0, function03);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            Function0<Unit> function04 = (Function0) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z11 = ((i11 & 7168) == 2048) | (i12 == 16384);
            Object objB2 = composerStartRestartGroup.B();
            if (z11 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.Z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductDetailComposeActivity.w2(function02, function03);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            productDetailComposeActivity.V1(localThemeScope, strC, strC2, strC3, strC4, function04, (Function0) objB2, composerStartRestartGroup, LocalThemeScope.f15770g | (i11 & 14) | ((i11 << 6) & 29360128));
            composerStartRestartGroup.T();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductDetailComposeActivity.x2(this.f107481a, localThemeScope, cVar, function0, function02, function03, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x2(ProductDetailComposeActivity productDetailComposeActivity, LocalThemeScope localThemeScope, C12233e0.InterfaceC12238e.ShowError cVar, Function0 function0, Function0 function02, Function0 function03, int i10, Composer composer, int i11) {
        productDetailComposeActivity.u2(localThemeScope, cVar, function0, function02, function03, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public final InterfaceC14261a W2() {
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        if (interfaceC14261a != null) {
            return interfaceC14261a;
        }
        Intrinsics.y("analyticsEngine");
        return null;
    }

    public final Al.g X2() {
        Al.g gVar = this.featureEntryPoint;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.y("featureEntryPoint");
        return null;
    }

    public final yl.k Y2() {
        yl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("featureManager");
        return null;
    }

    public final Cl.e Z2() {
        Cl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.y("meijerIntent");
        return null;
    }

    @Override // Pj.g
    public void onCreateAccount() {
        startActivity(Al.f.f666a.a(this, Y2().e(AbstractC18227f.h0.f170581h)));
    }

    @Override // Pj.g
    public void onSignIn() {
        startActivity(Al.k.b(this, false, null, null, null, null, null, 126, null));
    }

    @SuppressLint({"MissingComposePreview"})
    private final void B2(final ReviewGallery reviewGallery, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1402561872);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(reviewGallery)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1402561872, i11, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.UIGoToReviewGallery (ProductDetailComposeActivity.kt:1062)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(this) | composerStartRestartGroup.D(reviewGallery);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.i0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductDetailComposeActivity.C2(this.f107603a, reviewGallery);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            m2(reviewGallery, (Function0) objB, composerStartRestartGroup, (i11 & 14) | ((i11 << 3) & 896));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductDetailComposeActivity.D2(this.f107611a, reviewGallery, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @SuppressLint({"MissingComposePreview"})
    private final void E2(final SeeAllReviews seeAllReviews, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(1252623585);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(seeAllReviews)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1252623585, i11, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.UIGoToSeeAll (ProductDetailComposeActivity.kt:1079)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(this) | composerStartRestartGroup.D(seeAllReviews);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.b0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductDetailComposeActivity.F2(this.f107505a, seeAllReviews);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            m2(seeAllReviews, (Function0) objB, composerStartRestartGroup, (i11 & 14) | ((i11 << 3) & 896));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductDetailComposeActivity.G2(this.f107542a, seeAllReviews, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @SuppressLint({"MissingComposePreview"})
    private final void H2(final WriteReview writeReview, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(772348970);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(writeReview)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(772348970, i11, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.UIGoToWriteReview (ProductDetailComposeActivity.kt:1020)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(this) | composerStartRestartGroup.D(writeReview);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.g0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductDetailComposeActivity.I2(this.f107587a, writeReview);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            m2(writeReview, (Function0) objB, composerStartRestartGroup, (i11 & 14) | ((i11 << 3) & 896));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.h0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductDetailComposeActivity.J2(this.f107595a, writeReview, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I2(ProductDetailComposeActivity productDetailComposeActivity, WriteReview writeReview) {
        Intent intentT = Cl.e.t(productDetailComposeActivity.Z2(), productDetailComposeActivity, 268440657, null, 4, null);
        if (intentT != null) {
            intentT.setPackage(productDetailComposeActivity.getPackageName());
            intentT.putExtra("product_info", new ProductInfoForReviewSubmit(writeReview.getProductInfo().getProductId(), writeReview.getProductInfo().getProductImage(), writeReview.getProductInfo().getProductName()));
            productDetailComposeActivity.productRateAndReviewLauncher.a(intentT);
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y1(ProductDetailComposeActivity productDetailComposeActivity, C12233e0.InterfaceC12238e interfaceC12238e) {
        productDetailComposeActivity.c3().x2(((C12233e0.InterfaceC12238e.d.ProductLoadError) interfaceC12238e).getProduct());
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z1(ProductDetailComposeActivity productDetailComposeActivity, C12233e0.InterfaceC12238e interfaceC12238e) {
        productDetailComposeActivity.c3().getViewState().I().invoke(new C12233e0.InterfaceC12239f.ShoppingList(new AbstractC15173b.View(((C12233e0.InterfaceC12238e.d.ShoppingListItemAdded) interfaceC12238e).getProduct())));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a2(ProductDetailComposeActivity productDetailComposeActivity, C12233e0.InterfaceC12238e interfaceC12238e) {
        productDetailComposeActivity.c3().getViewState().I().invoke(new C12233e0.InterfaceC12239f.FavoritesList(new AbstractC15172a.View(((C12233e0.InterfaceC12238e.d.FavoriteListItemAdded) interfaceC12238e).getProduct())));
        return Unit.f142422a;
    }

    private final mk.f a3() {
        Object obj;
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            obj = (Parcelable) intent.getParcelableExtra("com.meijer.intent.extra.PRODUCT", mk.f.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.intent.extra.PRODUCT");
            if (!(parcelableExtra instanceof mk.f)) {
                parcelableExtra = null;
            }
            obj = (mk.f) parcelableExtra;
        }
        Intrinsics.g(obj);
        return (mk.f) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d3(C14145a result) {
        if (result.getResultCode() != -1) {
            return;
        }
        c3().getViewState().I().invoke(C12233e0.InterfaceC12239f.i.f108609a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ShowToast"})
    public final void e3(C14145a result) {
        switch (result.getResultCode()) {
            case 867530912:
                c3().d2(m2.a.f107651a);
                break;
            case 867530913:
                c3().d2(m2.b.f107652a);
                break;
        }
    }

    private final boolean f3() {
        return getIntent().getBooleanExtra("com.meijer.intent.extra.IS_FROM_CLP", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i2(C12233e0.InterfaceC12237d interfaceC12237d) {
        interfaceC12237d.I().invoke(new C12233e0.InterfaceC12239f.Reload(new n2.Product(interfaceC12237d.m().getValue().getId())));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j2(ProductDetailComposeActivity productDetailComposeActivity) {
        productDetailComposeActivity.finish();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j3(ProductFullDetails product, com.meijer.mobile.core.design.widget.stepperview.a state) {
        c3().getViewState().I().invoke(new C12233e0.InterfaceC12239f.UpdateCarouselProductEntry(product, state.getValueState().getQuantity()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k2(C12233e0.InterfaceC12237d interfaceC12237d, C12233e0.InterfaceC12238e interfaceC12238e) {
        interfaceC12237d.I().invoke(new C12233e0.InterfaceC12239f.DisposeEffect(interfaceC12238e));
        return Unit.f142422a;
    }

    @SuppressLint({"MissingComposePreview"})
    private final void m2(final C12233e0.InterfaceC12238e interfaceC12238e, final Function0<Unit> function0, Composer composer, final int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        boolean zD;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(1435149019);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(interfaceC12238e);
            } else {
                zD = composerStartRestartGroup.D(interfaceC12238e);
            }
            if (zD) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(function0)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(this)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1435149019, i11, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.LaunchActivity (ProductDetailComposeActivity.kt:976)");
            }
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean z11 = false;
            if ((i11 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean zD2 = z10 | composerStartRestartGroup.D(this);
            int i15 = i11 & 14;
            if (i15 == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(interfaceC12238e))) {
                z11 = true;
            }
            boolean z12 = zD2 | z11;
            Object objB = composerStartRestartGroup.B();
            if (z12 || objB == Composer.INSTANCE.a()) {
                objB = new g(function0, this, interfaceC12238e, null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(interfaceC12238e, (Function2) objB, composerStartRestartGroup, i15);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.u0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductDetailComposeActivity.n2(this.f107787a, interfaceC12238e, function0, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v2(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w2(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.f142422a;
    }

    @SuppressLint({"MissingComposePreview"})
    private final void y2(final ReadReview readReview, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-590377332);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(readReview)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-590377332, i11, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.UIGoToReadReview (ProductDetailComposeActivity.kt:1046)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(this) | composerStartRestartGroup.D(readReview);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.k0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductDetailComposeActivity.z2(this.f107623a, readReview);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            m2(readReview, (Function0) objB, composerStartRestartGroup, (i11 & 14) | ((i11 << 3) & 896));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.l0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductDetailComposeActivity.A2(this.f107636a, readReview, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z2(ProductDetailComposeActivity productDetailComposeActivity, ReadReview readReview) {
        productDetailComposeActivity.startActivity(Al.o.a(productDetailComposeActivity, readReview.getReviewItem()));
        return Unit.f142422a;
    }

    @Override // com.meijer.mobile.meijer.activity.find.productdetail.Hilt_ProductDetailComposeActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().a(c3());
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-98783729, true, new i()), 1, null);
        c3().w2(getIntent().getStringExtra("com.meijer.intent.extra.PREVIOUS_TRACK_ACTION"));
        this.campaignIdValue = getIntent().getStringExtra("campaignIdValue");
        c3().u2(this.campaignIdValue);
        c3().x2(a3());
        C17154h.J(C17154h.O(c3().w1(), new j(null)), C6031t.a(this));
        c3().getViewState().I().invoke(new C12233e0.InterfaceC12239f.IsFromCLP(f3()));
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
    }
}
