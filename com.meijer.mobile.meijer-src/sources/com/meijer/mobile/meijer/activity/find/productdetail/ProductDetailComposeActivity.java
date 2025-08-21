package com.meijer.mobile.meijer.activity.find.productdetail;

import Co.ProductFullDetails;
import Gp.ProductInfoForReviewSubmit;
import Gp.ProductInformation;
import Ki.LocalThemeScope;
import P0.e;
import Qk.a;
import V2.CreationExtras;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import bk.AbstractC6392a;
import cn.ProductVariantDecorator;
import com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity;
import com.meijer.mobile.meijer.activity.find.productdetail.X0;
import com.meijer.mobile.meijer.activity.find.productdetail.m2;
import com.meijer.mobile.meijer.activity.find.productdetail.n2;
import com.meijer.mobile.meijer.activity.find.viewmodel.AbstractC12325a;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0;
import com.meijer.mobile.meijer.activity.find.viewmodel.ProductImageViewModel;
import com.meijer.mobile.meijer.activity.find.viewmodel.ReadReview;
import com.meijer.mobile.meijer.activity.find.viewmodel.ReviewGallery;
import com.meijer.mobile.meijer.activity.find.viewmodel.SeeAllReviews;
import com.meijer.mobile.meijer.activity.find.viewmodel.WriteReview;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import e.C13737e;
import fj.Entry;
import g.AbstractC14276c;
import g.C14274a;
import g.InterfaceC14275b;
import gi.GoogleAdAnalytics;
import hi.InterfaceC14523a;
import ii.TrackingData;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import j0.InterfaceC14900d;
import j0.InterfaceC14902f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.C15158a0;
import ki.q1;
import kotlin.C17957L0;
import kotlin.C17959M0;
import kotlin.C17987a1;
import kotlin.C17993c1;
import kotlin.EnumC17961N0;
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
import kr.C15410d;
import lk.AbstractC15516a;
import lk.AbstractC15517b;
import mi.C15726h;
import mv.C15809k;
import mv.InterfaceC15783O;
import oi.C16194s0;
import oi.C16200v0;
import or.C16287c;
import p1.C16338g;
import pr.AbstractC16490a;
import pr.C16493d;
import pr.SubscriptionSummaryDecorator;
import pv.C16563h;
import r0.C16806i;
import sp.ProductState;
import ti.C17265b;
import vs.CartProductListDecorator;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u000b\u0010\tJ/\u0010\u0012\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001d\u001a\u00020\u0007*\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0003¢\u0006\u0004\b\u001d\u0010\u001eJE\u0010$\u001a\u00020\u0007*\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070 H\u0003¢\u0006\u0004\b$\u0010%JQ\u0010+\u001a\u00020\u0007*\u00020\u001a2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010&2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070 H\u0003¢\u0006\u0004\b+\u0010,J\u0095\u0001\u0010;\u001a\u00020\u0007*\u00020\u001a2\u0006\u0010\u0011\u001a\u00020-2\u0006\u0010.\u001a\u00020&2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010&2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\b\b\u0002\u00105\u001a\u0002042\u0006\u00106\u001a\u0002022\u000e\b\u0002\u00107\u001a\b\u0012\u0004\u0012\u00020\u00070 2\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u00020\u00070 2\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020\u00070 2\u000e\b\u0002\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00070 H\u0003¢\u0006\u0004\b;\u0010<J%\u0010=\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00070 H\u0003¢\u0006\u0004\b=\u0010>J#\u0010@\u001a\u00020\u0007*\u00020\u001a2\u0006\u0010\u0011\u001a\u00020?2\u0006\u00106\u001a\u000202H\u0003¢\u0006\u0004\b@\u0010AJ\u001b\u0010C\u001a\u00020\u0007*\u00020\u001a2\u0006\u0010\u0011\u001a\u00020BH\u0003¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020EH\u0003¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020HH\u0003¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020KH\u0003¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020NH\u0003¢\u0006\u0004\bO\u0010PJ\u001f\u0010S\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020&2\u0006\u0010R\u001a\u00020&H\u0002¢\u0006\u0004\bS\u0010TJ\u0019\u0010W\u001a\u00020\u00072\b\u0010V\u001a\u0004\u0018\u00010UH\u0014¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0007H\u0014¢\u0006\u0004\bY\u0010\u0004J\u000f\u0010Z\u001a\u00020\u0007H\u0016¢\u0006\u0004\bZ\u0010\u0004J\u000f\u0010[\u001a\u00020\u0007H\u0016¢\u0006\u0004\b[\u0010\u0004R\"\u0010c\u001a\u00020\\8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010k\u001a\u00020d8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010s\u001a\u00020l8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010{\u001a\u00020t8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR&\u0010\u0083\u0001\u001a\u00020|8\u0000@\u0000X\u0081.¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010\u0087\u0001\u001a\u00030\u0084\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001b\u0010\u008a\u0001\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R!\u0010\u0090\u0001\u001a\u00030\u008b\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R!\u0010\u0095\u0001\u001a\u00030\u0091\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u008d\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001f\u0010\u009a\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001f\u0010\u009c\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0099\u0001R\u001f\u0010\u009e\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0099\u0001R\u0017\u0010\u0015\u001a\u00030\u009f\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u0017\u0010¤\u0001\u001a\u0002028BX\u0082\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001¨\u0006§\u0001²\u0006\u000e\u0010¦\u0001\u001a\u00030¥\u00018\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/ProductDetailComposeActivity;", "Landroidx/activity/ComponentActivity;", "LQj/g;", "<init>", "()V", "Lg/a;", "result", "", "g3", "(Lg/a;)V", "f3", "h3", "Lcom/meijer/mobile/meijer/activity/find/productdetail/X0;", "destination", "Landroid/view/View;", "view", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "effect", "k3", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/X0;Landroid/view/View;Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;)V", "LCo/h;", "product", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "state", "n3", "(LCo/h;Lcom/meijer/mobile/core/design/widget/stepperview/a;)V", "LKi/M;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$d;", "viewState", "X1", "(LKi/M;Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$d;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$c;", "Lkotlin/Function0;", "onPositiveAction", "onNegativeAction", "disposeEffect", "u2", "(LKi/M;Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$c;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "", "titleLabel", "descriptionLabel", "positiveActionLabel", "negativeActionLabel", "V1", "(LKi/M;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "bodyLabel", "actionLabel", "LHi/e;", "duration", "", "showCloseIcon", "Lki/q1$m$a;", "toastState", "withMargin", "onLabelClicked", "onCloseClicked", "onDismiss", "execute", "o2", "(LKi/M;Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;Ljava/lang/String;Ljava/lang/String;LHi/e;ZLki/q1$m$a;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "m2", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$c;", "K2", "(LKi/M;Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$c;ZLandroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$b;", "M2", "(LKi/M;Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$b;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/l0;", "H2", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/l0;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/i0;", "y2", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/i0;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/j0;", "B2", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/j0;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/k0;", "E2", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/k0;Landroidx/compose/runtime/Composer;I)V", "function", "message", "j3", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onCreateAccount", "onSignIn", "LBl/g;", "v", "LBl/g;", "Z2", "()LBl/g;", "setFeatureEntryPoint$Meijer_playstoreRelease", "(LBl/g;)V", "featureEntryPoint", "LDl/e;", "w", "LDl/e;", "b3", "()LDl/e;", "setMeijerIntent$Meijer_playstoreRelease", "(LDl/e;)V", "meijerIntent", "Lzl/k;", "x", "Lzl/k;", "a3", "()Lzl/k;", "setFeatureManager$Meijer_playstoreRelease", "(Lzl/k;)V", "featureManager", "Lhi/a;", "y", "Lhi/a;", "Y2", "()Lhi/a;", "setAnalyticsEngine$Meijer_playstoreRelease", "(Lhi/a;)V", "analyticsEngine", "Lyo/k;", "z", "Lyo/k;", "getUserManager$Meijer_playstoreRelease", "()Lyo/k;", "setUserManager$Meijer_playstoreRelease", "(Lyo/k;)V", "userManager", "Lmv/O;", "A", "Lmv/O;", "coroutineScope", "B", "Ljava/lang/String;", "campaignIdValue", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0;", "C", "Lkotlin/Lazy;", "e3", "()Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0;", "vm", "Lpr/d;", "D", "d3", "()Lpr/d;", "subscriptionVM", "Lg/c;", "Landroid/content/Intent;", "E", "Lg/c;", "productRateAndReviewLauncher", "F", "subscriptionResultLauncher", "G", "substitutionResultLauncher", "Lnk/f;", "c3", "()Lnk/f;", "i3", "()Z", "isFromCLP", "Lcom/meijer/mobile/meijer/activity/find/productdetail/W0;", "featureFlags", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class ProductDetailComposeActivity extends Hilt_ProductDetailComposeActivity implements Qj.g {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private InterfaceC15783O coroutineScope;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private String campaignIdValue;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Lazy vm = new androidx.view.e0(Reflection.b(C12358e0.class), new m(this), new l(this), new n(null, this));

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Lazy subscriptionVM = new androidx.view.e0(Reflection.b(C16493d.class), new p(this), new o(this), new q(null, this));

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> productRateAndReviewLauncher = registerForActivityResult(new h.i(), new k());

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> subscriptionResultLauncher = registerForActivityResult(new h.i(), new r());

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> substitutionResultLauncher = registerForActivityResult(new h.i(), new s());

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Bl.g featureEntryPoint;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerIntent;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public zl.k featureManager;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14523a analyticsEngine;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public yo.k userManager;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<ki.R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f108150a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f108151b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f108152c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f108153d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f108154e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f108155f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f108156g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$a$a, reason: collision with other inner class name */
        static final class C1633a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f108157a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.R0 f108158b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f108159c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f108160d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f108161e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f108162f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f108163g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ String f108164h;

            C1633a(LocalThemeScope localThemeScope, ki.R0 r02, Function0<Unit> function0, String str, String str2, String str3, Function0<Unit> function02, String str4) {
                this.f108157a = localThemeScope;
                this.f108158b = r02;
                this.f108159c = function0;
                this.f108160d = str;
                this.f108161e = str2;
                this.f108162f = str3;
                this.f108163g = function02;
                this.f108164h = str4;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1418846120, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.AcresModal.<anonymous>.<anonymous> (ProductDetailComposeActivity.kt:886)");
                }
                LocalThemeScope localThemeScope = this.f108157a;
                ki.R0 r02 = this.f108158b;
                Function0<Unit> function0 = this.f108159c;
                String str = this.f108160d;
                String str2 = this.f108161e;
                String str3 = this.f108162f;
                Function0<Unit> function02 = this.f108163g;
                String str4 = this.f108164h;
                Modifier.Companion companion = Modifier.INSTANCE;
                C5800d c5800d = C5800d.f48779a;
                C5800d.m mVarH = c5800d.h();
                e.Companion companion2 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierM);
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
                androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
                C14890K.a(InterfaceC14888I.b(C14889J.f139620a, companion, 1.0f, false, 2, null), composer, 0);
                oi.P p10 = oi.P.f154014a;
                String contentDescription = r02.getButtons().getDismissIcon().getContentDescription();
                if (contentDescription == null) {
                    contentDescription = "";
                }
                Ki.C icon = r02.getButtons().getDismissIcon().getIcon();
                int i11 = LocalThemeScope.f17314g;
                String str5 = contentDescription;
                oi.P0.i(localThemeScope, p10, function0, icon, str5, null, false, false, 0L, composer, (Ki.C.f16859b << 9) | i11 | (oi.P.f154015b << 3), 240);
                C14890K.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 11, null), composer, 0);
                composer.v();
                C5800d.f fVarO = c5800d.o(localThemeScope.getAdsSpacing().getFive().getDp());
                e.b bVarG = companion2.g();
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion, localThemeScope.getAdsSpacing().getSeven().getDp(), 0.0f, localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), 2, null);
                MeasurePolicy measurePolicyA2 = C5807k.a(fVarO, bVarG, composer, 48);
                int iA3 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierM2);
                Function0<InterfaceC5953g> function0A3 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A3);
                } else {
                    composer.s();
                }
                Composer composerA3 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA3, measurePolicyA2, companion3.e());
                androidx.compose.runtime.D1.c(composerA3, interfaceC5884sR3, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
                q1.Label heading = r02.getLabels().getHeading();
                int i12 = q1.Label.f142335j;
                si.j.h(localThemeScope, heading, str, null, composer, i11 | (i12 << 3), 4);
                si.j.h(localThemeScope, r02.getLabels().getBody(), str2, null, composer, i11 | (i12 << 3), 4);
                composer.v();
                C5800d.f fVarO2 = c5800d.o(localThemeScope.getAdsSpacing().getFour().getDp());
                Modifier modifierL = androidx.compose.foundation.layout.D.l(companion, localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp());
                MeasurePolicy measurePolicyA3 = C5807k.a(fVarO2, companion2.k(), composer, 0);
                int iA4 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR4 = composer.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierL);
                Function0<InterfaceC5953g> function0A4 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A4);
                } else {
                    composer.s();
                }
                Composer composerA4 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA4, measurePolicyA3, companion3.e());
                androidx.compose.runtime.D1.c(composerA4, interfaceC5884sR4, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion3.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                androidx.compose.runtime.D1.c(composerA4, modifierE4, companion3.f());
                oi.P0.k(localThemeScope, C16194s0.f154251a, str3, function02, null, str3, true, 0L, false, composer, i11 | 1572864 | (C16194s0.f154252b << 3), HttpResponseStatus.SUCCESS_OK);
                composer.startReplaceGroup(1398345735);
                if (str4 != null) {
                    oi.P0.k(localThemeScope, C16200v0.f154265a, str4, function0, null, str4, true, 0L, false, composer, i11 | 1572864 | (C16200v0.f154266b << 3), HttpResponseStatus.SUCCESS_OK);
                    Unit unit = Unit.f143329a;
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
                return Unit.f143329a;
            }
        }

        a(LocalThemeScope localThemeScope, Function0<Unit> function0, String str, String str2, String str3, Function0<Unit> function02, String str4) {
            this.f108150a = localThemeScope;
            this.f108151b = function0;
            this.f108152c = str;
            this.f108153d = str2;
            this.f108154e = str3;
            this.f108155f = function02;
            this.f108156g = str4;
        }

        public final void a(ki.R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(2101299381, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.AcresModal.<anonymous> (ProductDetailComposeActivity.kt:882)");
            }
            LocalThemeScope localThemeScope = this.f108150a;
            q1.ModalTemplate modalTemplate = Assemble.getModalTemplate();
            Function0<Unit> function0 = this.f108151b;
            C17265b.b(localThemeScope, modalTemplate, function0, null, ComposableLambdaKt.c(1418846120, true, new C1633a(this.f108150a, Assemble, function0, this.f108152c, this.f108153d, this.f108154e, this.f108155f, this.f108156g), composer, 54), composer, LocalThemeScope.f17314g | 24576 | (q1.ModalTemplate.f142363d << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ki.R0 r02, Composer composer, Integer num) {
            a(r02, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$ConsumeEffect$1$1", f = "ProductDetailComposeActivity.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108165a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C12358e0.InterfaceC12363e f108167c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C12358e0.InterfaceC12363e interfaceC12363e, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f108167c = interfaceC12363e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProductDetailComposeActivity.this.new b(this.f108167c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f108165a == 0) {
                ResultKt.b(obj);
                new Qj.f(ProductDetailComposeActivity.this, ((C12358e0.InterfaceC12363e.RequireLogin) this.f108167c).getMessageResId(), ProductDetailComposeActivity.this).g();
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$ConsumeEffect$2$1", f = "ProductDetailComposeActivity.kt", l = {}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108168a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C12358e0.InterfaceC12363e f108170c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C12358e0.InterfaceC12363e interfaceC12363e, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f108170c = interfaceC12363e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProductDetailComposeActivity.this.new c(this.f108170c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f108168a == 0) {
                ResultKt.b(obj);
                new Qj.j(ProductDetailComposeActivity.this, ((C12358e0.InterfaceC12363e.UpdateShoppingOrFavoriteListFailed) this.f108170c).getMessageResId(), new Object[0]).r(((C12358e0.InterfaceC12363e.UpdateShoppingOrFavoriteListFailed) this.f108170c).getTitleResId(), new Object[0]).g();
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$ConsumeEffect$3$1", f = "ProductDetailComposeActivity.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108171a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C12358e0.InterfaceC12363e f108172b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProductDetailComposeActivity f108173c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C12358e0.InterfaceC12362d f108174d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C12358e0.InterfaceC12363e interfaceC12363e, ProductDetailComposeActivity productDetailComposeActivity, C12358e0.InterfaceC12362d interfaceC12362d, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f108172b = interfaceC12363e;
            this.f108173c = productDetailComposeActivity;
            this.f108174d = interfaceC12362d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f108172b, this.f108173c, this.f108174d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f108171a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.a("Refresh cart event received", new Object[0]);
                if (((C12358e0.InterfaceC12363e.RefreshCartOnListPageEvent) this.f108172b).getShouldRefresh()) {
                    this.f108173c.setResult(48996);
                } else {
                    this.f108173c.setResult(0);
                }
                this.f108174d.I().invoke(new C12358e0.InterfaceC12364f.DisposeEffect(this.f108172b));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$ConsumeEffect$4$1", f = "ProductDetailComposeActivity.kt", l = {}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108175a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C12358e0.InterfaceC12363e f108177c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C12358e0.InterfaceC12363e interfaceC12363e, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f108177c = interfaceC12363e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProductDetailComposeActivity.this.new e(this.f108177c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f108175a == 0) {
                ResultKt.b(obj);
                ProductDetailComposeActivity.l3(ProductDetailComposeActivity.this, new X0.ShoppingListItem(((C12358e0.InterfaceC12363e.ViewOnShoppingList) this.f108177c).getProduct()), null, this.f108177c, 2, null);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$ConsumeEffect$5$1", f = "ProductDetailComposeActivity.kt", l = {}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108178a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C12358e0.InterfaceC12363e f108180c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C12358e0.InterfaceC12363e interfaceC12363e, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f108180c = interfaceC12363e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProductDetailComposeActivity.this.new f(this.f108180c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f108178a == 0) {
                ResultKt.b(obj);
                ProductDetailComposeActivity.l3(ProductDetailComposeActivity.this, new X0.FavoriteListItem(((C12358e0.InterfaceC12363e.ViewOnFavoriteList) this.f108180c).getProduct()), null, this.f108180c, 2, null);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$LaunchActivity$1$1", f = "ProductDetailComposeActivity.kt", l = {}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108181a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f108182b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProductDetailComposeActivity f108183c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C12358e0.InterfaceC12363e f108184d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Function0<Unit> function0, ProductDetailComposeActivity productDetailComposeActivity, C12358e0.InterfaceC12363e interfaceC12363e, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f108182b = function0;
            this.f108183c = productDetailComposeActivity;
            this.f108184d = interfaceC12363e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new g(this.f108182b, this.f108183c, this.f108184d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f108181a == 0) {
                ResultKt.b(obj);
                this.f108182b.invoke();
                this.f108183c.e3().getViewState().I().invoke(new C12358e0.InterfaceC12364f.DisposeEffect(this.f108184d));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$LaunchToast$5$1", f = "ProductDetailComposeActivity.kt", l = {979, 979}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108185a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f108186b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f108187c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f108188d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f108189e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Hi.e f108190f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f108191g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ q1.m.a f108192h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f108193i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f108194j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ProductDetailComposeActivity f108195k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ C12358e0.InterfaceC12363e.d f108196l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f108197m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f108198n;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new h(this.f108186b, this.f108187c, this.f108188d, this.f108189e, this.f108190f, this.f108191g, this.f108192h, this.f108193i, this.f108194j, this.f108195k, this.f108196l, this.f108197m, this.f108198n, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(LocalThemeScope localThemeScope, boolean z10, String str, String str2, Hi.e eVar, boolean z11, q1.m.a aVar, Function0<Unit> function0, Function0<Unit> function02, ProductDetailComposeActivity productDetailComposeActivity, C12358e0.InterfaceC12363e.d dVar, Function0<Unit> function03, Function0<Unit> function04, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f108186b = localThemeScope;
            this.f108187c = z10;
            this.f108188d = str;
            this.f108189e = str2;
            this.f108190f = eVar;
            this.f108191g = z11;
            this.f108192h = aVar;
            this.f108193i = function0;
            this.f108194j = function02;
            this.f108195k = productDetailComposeActivity;
            this.f108196l = dVar;
            this.f108197m = function03;
            this.f108198n = function04;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean l(Function0 function0, ProductDetailComposeActivity productDetailComposeActivity, C12358e0.InterfaceC12363e.d dVar) {
            function0.invoke();
            productDetailComposeActivity.e3().getViewState().I().invoke(new C12358e0.InterfaceC12364f.DisposeEffect(dVar));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean o(Function0 function0, ProductDetailComposeActivity productDetailComposeActivity, C12358e0.InterfaceC12363e.d dVar) {
            function0.invoke();
            productDetailComposeActivity.e3().getViewState().I().invoke(new C12358e0.InterfaceC12364f.DisposeEffect(dVar));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(Function0 function0, ProductDetailComposeActivity productDetailComposeActivity, C12358e0.InterfaceC12363e.d dVar) {
            function0.invoke();
            productDetailComposeActivity.e3().getViewState().I().invoke(new C12358e0.InterfaceC12364f.DisposeEffect(dVar));
            return Unit.f143329a;
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
                int r1 = r13.f108185a
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
                Ki.M r14 = r13.f108186b
                boolean r1 = r13.f108187c
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
                r13.f108185a = r3
                java.lang.Object r14 = r14.f(r1, r13)
                if (r14 != r0) goto L3c
                r12 = r13
                goto L76
            L3c:
                r3 = r14
                Hi.i r3 = (Hi.i) r3
                java.lang.String r4 = r13.f108188d
                java.lang.String r5 = r13.f108189e
                Hi.e r6 = r13.f108190f
                boolean r7 = r13.f108191g
                ki.q1$m$a r8 = r13.f108192h
                kotlin.jvm.functions.Function0<kotlin.Unit> r14 = r13.f108194j
                com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity r1 = r13.f108195k
                com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d r9 = r13.f108196l
                r10 = r9
                com.meijer.mobile.meijer.activity.find.productdetail.C0 r9 = new com.meijer.mobile.meijer.activity.find.productdetail.C0
                r9.<init>()
                kotlin.jvm.functions.Function0<kotlin.Unit> r14 = r13.f108197m
                com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity r1 = r13.f108195k
                com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d r10 = r13.f108196l
                r11 = r10
                com.meijer.mobile.meijer.activity.find.productdetail.D0 r10 = new com.meijer.mobile.meijer.activity.find.productdetail.D0
                r10.<init>()
                kotlin.jvm.functions.Function0<kotlin.Unit> r14 = r13.f108198n
                com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity r1 = r13.f108195k
                com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d r11 = r13.f108196l
                r12 = r11
                com.meijer.mobile.meijer.activity.find.productdetail.E0 r11 = new com.meijer.mobile.meijer.activity.find.productdetail.E0
                r11.<init>()
                r13.f108185a = r2
                r12 = r13
                java.lang.Object r14 = r3.h(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L77
            L76:
                return r0
            L77:
                kotlin.jvm.functions.Function0<kotlin.Unit> r14 = r12.f108193i
                r14.invoke()
                kotlin.Unit r14 = kotlin.Unit.f143329a
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
            final /* synthetic */ ProductDetailComposeActivity f108200a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17959M0 f108201b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<mv.C0> f108202c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<mv.C0> f108203d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C17959M0 f108204e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<mv.C0> f108205f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C17993c1 f108206g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ SubscriptionSummaryDecorator f108207h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function0<mv.C0> f108208i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Function0<mv.C0> f108209j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.z1<ProductDetailFeatureFlags> f108210k;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$i$a$a, reason: collision with other inner class name */
            static final class C1634a implements Function3<InterfaceC14900d, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f108211a;

                C1634a(LocalThemeScope localThemeScope) {
                    this.f108211a = localThemeScope;
                }

                public final void a(InterfaceC14900d AcresBottomSheet, Composer composer, int i10) {
                    Intrinsics.j(AcresBottomSheet, "$this$AcresBottomSheet");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-578232389, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ProductDetailComposeActivity.kt:400)");
                    }
                    C16287c.c(this.f108211a, null, composer, LocalThemeScope.f17314g, 1);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14900d interfaceC14900d, Composer composer, Integer num) {
                    a(interfaceC14900d, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C17959M0 f108212a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f108213b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function0<mv.C0> f108214c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ ProductDetailComposeActivity f108215d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ C17993c1 f108216e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ SubscriptionSummaryDecorator f108217f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function0<mv.C0> f108218g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Function0<mv.C0> f108219h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.z1<ProductDetailFeatureFlags> f108220i;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$i$a$b$a, reason: collision with other inner class name */
                static final class C1635a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f108221a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ Function0<mv.C0> f108222b;

                    /* JADX WARN: Multi-variable type inference failed */
                    C1635a(LocalThemeScope localThemeScope, Function0<? extends mv.C0> function0) {
                        this.f108221a = localThemeScope;
                        this.f108222b = function0;
                    }

                    public final void b(InterfaceC14902f ModalBottomSheetLayout, Composer composer, int i10) {
                        Intrinsics.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1506837872, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductDetailComposeActivity.kt:407)");
                        }
                        LocalThemeScope localThemeScope = this.f108221a;
                        composer.startReplaceGroup(5004770);
                        boolean zV = composer.V(this.f108222b);
                        final Function0<mv.C0> function0 = this.f108222b;
                        Object objB = composer.B();
                        if (zV || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.N0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ProductDetailComposeActivity.i.a.b.C1635a.c(function0);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        C12242e.b(localThemeScope, null, (Function0) objB, composer, LocalThemeScope.f17314g, 1);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                        b(interfaceC14902f, composer, num.intValue());
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(Function0 function0) {
                        function0.invoke();
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$i$a$b$b, reason: collision with other inner class name */
                static final class C1636b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ ProductDetailComposeActivity f108223a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f108224b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ C17993c1 f108225c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ SubscriptionSummaryDecorator f108226d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ Function0<mv.C0> f108227e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ Function0<mv.C0> f108228f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.runtime.z1<ProductDetailFeatureFlags> f108229g;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$i$a$b$b$a, reason: collision with other inner class name */
                    /* synthetic */ class C1637a extends FunctionReferenceImpl implements Function2<ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> {
                        C1637a(Object obj) {
                            super(2, obj, ProductDetailComposeActivity.class, "onEntryUpdate", "onEntryUpdate(Lcom/meijer/mobile/product/model/fulldetails/ProductFullDetails;Lcom/meijer/mobile/core/design/widget/stepperview/ControlState;)V", 0);
                        }

                        public final void a(ProductFullDetails p02, com.meijer.mobile.core.design.widget.stepperview.a p12) {
                            Intrinsics.j(p02, "p0");
                            Intrinsics.j(p12, "p1");
                            ((ProductDetailComposeActivity) this.receiver).n3(p02, p12);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(ProductFullDetails productFullDetails, com.meijer.mobile.core.design.widget.stepperview.a aVar) {
                            a(productFullDetails, aVar);
                            return Unit.f143329a;
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$i$a$b$b$b, reason: collision with other inner class name */
                    /* synthetic */ class C1638b extends FunctionReferenceImpl implements Function1<AbstractC12325a, Unit> {
                        C1638b(Object obj) {
                            super(1, obj, C12358e0.class, "onCarouselTrackingAction", "onCarouselTrackingAction(Lcom/meijer/mobile/meijer/activity/find/viewmodel/CarouselTrackingAction;)V", 0);
                        }

                        public final void a(AbstractC12325a p02) {
                            Intrinsics.j(p02, "p0");
                            ((C12358e0) this.receiver).T1(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AbstractC12325a abstractC12325a) {
                            a(abstractC12325a);
                            return Unit.f143329a;
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$i$a$b$b$c */
                    /* synthetic */ class c extends FunctionReferenceImpl implements Function3<Boolean, ProductVariantDecorator, String, Unit> {
                        c(Object obj) {
                            super(3, obj, C12358e0.class, "updateVariantInteraction", "updateVariantInteraction(ZLcom/meijer/mobile/meijer/activity/find/productvariant/ProductVariantDecorator;Ljava/lang/String;)V", 0);
                        }

                        public final void a(boolean z10, ProductVariantDecorator p12, String p22) {
                            Intrinsics.j(p12, "p1");
                            Intrinsics.j(p22, "p2");
                            ((C12358e0) this.receiver).h3(z10, p12, p22);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, ProductVariantDecorator productVariantDecorator, String str) {
                            a(bool.booleanValue(), productVariantDecorator, str);
                            return Unit.f143329a;
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    C1636b(ProductDetailComposeActivity productDetailComposeActivity, LocalThemeScope localThemeScope, C17993c1 c17993c1, SubscriptionSummaryDecorator subscriptionSummaryDecorator, Function0<? extends mv.C0> function0, Function0<? extends mv.C0> function02, androidx.compose.runtime.z1<ProductDetailFeatureFlags> z1Var) {
                        this.f108223a = productDetailComposeActivity;
                        this.f108224b = localThemeScope;
                        this.f108225c = c17993c1;
                        this.f108226d = subscriptionSummaryDecorator;
                        this.f108227e = function0;
                        this.f108228f = function02;
                        this.f108229g = z1Var;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit k(ProductDetailComposeActivity productDetailComposeActivity, GoogleAdAnalytics googleAnalytics) {
                        Intrinsics.j(googleAnalytics, "googleAnalytics");
                        productDetailComposeActivity.e3().getViewState().I().invoke(new C12358e0.InterfaceC12364f.GoogleAdClicked(googleAnalytics));
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit o(ProductDetailComposeActivity productDetailComposeActivity, AbstractC16490a it) {
                        Intrinsics.j(it, "it");
                        Intent intentI = productDetailComposeActivity.b3().I(it.getProduct());
                        intentI.setPackage(productDetailComposeActivity.getPackageName());
                        productDetailComposeActivity.subscriptionResultLauncher.a(intentI);
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit p(ProductDetailComposeActivity productDetailComposeActivity, X0 r10, View view) {
                        Intrinsics.j(r10, "r");
                        ProductDetailComposeActivity.l3(productDetailComposeActivity, r10, view, null, 4, null);
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit q(ProductDetailComposeActivity productDetailComposeActivity, int i10) {
                        productDetailComposeActivity.startActivity(Bl.o.f3147a.d(productDetailComposeActivity, new ProductInformation(productDetailComposeActivity.e3().getViewState().m().getValue().getId().getCode(), productDetailComposeActivity.e3().getViewState().m().getValue().getName().getName(), ((ProductImageViewModel) CollectionsKt.s0(productDetailComposeActivity.e3().getViewState().m().getValue().h())).c()), i10));
                        return Unit.f143329a;
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
                        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.i.a.b.C1636b.g(androidx.compose.runtime.Composer, int):void");
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        g(composer, num.intValue());
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit l(Function0 function0) {
                        function0.invoke();
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit r(Function0 function0) {
                        function0.invoke();
                        return Unit.f143329a;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                b(C17959M0 c17959m0, LocalThemeScope localThemeScope, Function0<? extends mv.C0> function0, ProductDetailComposeActivity productDetailComposeActivity, C17993c1 c17993c1, SubscriptionSummaryDecorator subscriptionSummaryDecorator, Function0<? extends mv.C0> function02, Function0<? extends mv.C0> function03, androidx.compose.runtime.z1<ProductDetailFeatureFlags> z1Var) {
                    this.f108212a = c17959m0;
                    this.f108213b = localThemeScope;
                    this.f108214c = function0;
                    this.f108215d = productDetailComposeActivity;
                    this.f108216e = c17993c1;
                    this.f108217f = subscriptionSummaryDecorator;
                    this.f108218g = function02;
                    this.f108219h = function03;
                    this.f108220i = z1Var;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(739767646, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ProductDetailComposeActivity.kt:403)");
                    }
                    float f10 = 24;
                    C17957L0.b(ComposableLambdaKt.c(1506837872, true, new C1635a(this.f108213b, this.f108214c), composer, 54), null, this.f108212a, false, C16806i.e(H1.h.p(f10), H1.h.p(f10), 0.0f, 0.0f, 12, null), 0.0f, 0L, 0L, 0L, ComposableLambdaKt.c(-923718697, true, new C1636b(this.f108215d, this.f108213b, this.f108216e, this.f108217f, this.f108218g, this.f108219h, this.f108220i), composer, 54), composer, (C17959M0.f168297e << 6) | 805306374, 490);
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

            /* JADX WARN: Multi-variable type inference failed */
            a(ProductDetailComposeActivity productDetailComposeActivity, C17959M0 c17959m0, Function0<? extends mv.C0> function0, Function0<? extends mv.C0> function02, C17959M0 c17959m02, Function0<? extends mv.C0> function03, C17993c1 c17993c1, SubscriptionSummaryDecorator subscriptionSummaryDecorator, Function0<? extends mv.C0> function04, Function0<? extends mv.C0> function05, androidx.compose.runtime.z1<ProductDetailFeatureFlags> z1Var) {
                this.f108200a = productDetailComposeActivity;
                this.f108201b = c17959m0;
                this.f108202c = function0;
                this.f108203d = function02;
                this.f108204e = c17959m02;
                this.f108205f = function03;
                this.f108206g = c17993c1;
                this.f108207h = subscriptionSummaryDecorator;
                this.f108208i = function04;
                this.f108209j = function05;
                this.f108210k = z1Var;
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
                    ComposerKt.U(-818888866, i11, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.onCreate.<anonymous>.<anonymous> (ProductDetailComposeActivity.kt:389)");
                }
                composer.startReplaceGroup(-973183515);
                List<C12358e0.InterfaceC12363e> listJ = this.f108200a.e3().getViewState().J();
                ProductDetailComposeActivity productDetailComposeActivity = this.f108200a;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(listJ, 10));
                Iterator<T> it = listJ.iterator();
                while (it.hasNext()) {
                    productDetailComposeActivity.X1(AdsTheme, (C12358e0.InterfaceC12363e) it.next(), productDetailComposeActivity.e3().getViewState(), composer, (i11 & 14) | LocalThemeScope.f17314g);
                    arrayList.add(Unit.f143329a);
                    productDetailComposeActivity = productDetailComposeActivity;
                }
                composer.P();
                C17959M0 c17959m0 = this.f108201b;
                String strC = C16338g.c(C15410d.f148759P, composer, 0);
                String strC2 = C16338g.c(C15410d.f148762S, composer, 0);
                String strC3 = C16338g.c(C15410d.f148756M, composer, 0);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f108202c);
                final Function0<mv.C0> function0 = this.f108202c;
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
                boolean zV2 = composer.V(this.f108203d);
                final Function0<mv.C0> function03 = this.f108203d;
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
                boolean zV3 = composer.V(this.f108202c);
                final Function0<mv.C0> function05 = this.f108202c;
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
                C15726h.j(AdsTheme, null, c17959m0, strC, null, strC2, strC3, function02, function04, null, (Function0) objB3, false, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.c(-578232389, true, new C1634a(AdsTheme), composer, 54), false, ComposableLambdaKt.c(739767646, true, new b(this.f108204e, AdsTheme, this.f108205f, this.f108200a, this.f108206g, this.f108207h, this.f108208i, this.f108209j, this.f108210k), composer, 54), composer, LocalThemeScope.f17314g | (i11 & 14) | (C17959M0.f168297e << 6), 12779520, 48393);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                d(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Function0 function0) {
                function0.invoke();
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(Function0 function0) {
                function0.invoke();
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(Function0 function0) {
                function0.invoke();
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$onCreate$1$closeIlcSheet$1$1$1", f = "ProductDetailComposeActivity.kt", l = {365}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f108230a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17959M0 f108231b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f108231b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C17959M0 c17959m0, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f108231b = c17959m0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f108230a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17959M0 c17959m0 = this.f108231b;
                    this.f108230a = 1;
                    if (c17959m0.i(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$onCreate$1$closeIspSheet$1$1$1", f = "ProductDetailComposeActivity.kt", l = {378}, m = "invokeSuspend")
        static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f108232a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17959M0 f108233b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.f108233b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C17959M0 c17959m0, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f108233b = c17959m0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f108232a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17959M0 c17959m0 = this.f108233b;
                    this.f108232a = 1;
                    if (c17959m0.i(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$onCreate$1$howItWorksPage$1$1$1", f = "ProductDetailComposeActivity.kt", l = {382}, m = "invokeSuspend")
        static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f108234a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17959M0 f108235b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ProductDetailComposeActivity f108236c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new d(this.f108235b, this.f108236c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C17959M0 c17959m0, ProductDetailComposeActivity productDetailComposeActivity, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f108235b = c17959m0;
                this.f108236c = productDetailComposeActivity;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f108234a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17959M0 c17959m0 = this.f108235b;
                    this.f108234a = 1;
                    if (c17959m0.i(this) == objF) {
                        return objF;
                    }
                }
                ProductDetailComposeActivity productDetailComposeActivity = this.f108236c;
                productDetailComposeActivity.startActivity(productDetailComposeActivity.b3().u());
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$onCreate$1$openIlcSheet$1$1$1", f = "ProductDetailComposeActivity.kt", l = {368}, m = "invokeSuspend")
        static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f108237a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17959M0 f108238b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new e(this.f108238b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(C17959M0 c17959m0, Continuation<? super e> continuation) {
                super(2, continuation);
                this.f108238b = c17959m0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f108237a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17959M0 c17959m0 = this.f108238b;
                    this.f108237a = 1;
                    if (c17959m0.l(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$onCreate$1$openIspSheet$1$1$1", f = "ProductDetailComposeActivity.kt", l = {375}, m = "invokeSuspend")
        static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f108239a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17959M0 f108240b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new f(this.f108240b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(C17959M0 c17959m0, Continuation<? super f> continuation) {
                super(2, continuation);
                this.f108240b = c17959m0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f108239a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17959M0 c17959m0 = this.f108240b;
                    this.f108239a = 1;
                    if (c17959m0.l(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
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
                ComposerKt.U(-98783729, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.onCreate.<anonymous> (ProductDetailComposeActivity.kt:355)");
            }
            androidx.compose.runtime.z1 z1VarC = S2.a.c(ProductDetailComposeActivity.this.e3().w1(), null, null, null, composer, 0, 7);
            C17993c1 c17993c1G = C17987a1.g(null, null, composer, 0, 3);
            EnumC17961N0 enumC17961N0 = EnumC17961N0.f168314a;
            final C17959M0 c17959m0J = C17957L0.j(enumC17961N0, null, null, true, composer, 3078, 6);
            ProductDetailComposeActivity productDetailComposeActivity = ProductDetailComposeActivity.this;
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composer);
                composer.t(objB);
            }
            productDetailComposeActivity.coroutineScope = (InterfaceC15783O) objB;
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(ProductDetailComposeActivity.this) | composer.D(c17959m0J);
            final ProductDetailComposeActivity productDetailComposeActivity2 = ProductDetailComposeActivity.this;
            Object objB2 = composer.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.F0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductDetailComposeActivity.i.o(productDetailComposeActivity2, c17959m0J);
                    }
                };
                composer.t(objB2);
            }
            Function0 function0 = (Function0) objB2;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD2 = composer.D(ProductDetailComposeActivity.this) | composer.D(c17959m0J);
            final ProductDetailComposeActivity productDetailComposeActivity3 = ProductDetailComposeActivity.this;
            Object objB3 = composer.B();
            if (zD2 || objB3 == companion.a()) {
                objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.G0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductDetailComposeActivity.i.p(productDetailComposeActivity3, c17959m0J);
                    }
                };
                composer.t(objB3);
            }
            Function0 function02 = (Function0) objB3;
            composer.P();
            final C17959M0 c17959m0J2 = C17957L0.j(enumC17961N0, null, null, true, composer, 3078, 6);
            composer.startReplaceGroup(-1633490746);
            boolean zD3 = composer.D(ProductDetailComposeActivity.this) | composer.D(c17959m0J2);
            final ProductDetailComposeActivity productDetailComposeActivity4 = ProductDetailComposeActivity.this;
            Object objB4 = composer.B();
            if (zD3 || objB4 == companion.a()) {
                objB4 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.H0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductDetailComposeActivity.i.q(productDetailComposeActivity4, c17959m0J2);
                    }
                };
                composer.t(objB4);
            }
            Function0 function03 = (Function0) objB4;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD4 = composer.D(ProductDetailComposeActivity.this) | composer.D(c17959m0J2);
            final ProductDetailComposeActivity productDetailComposeActivity5 = ProductDetailComposeActivity.this;
            Object objB5 = composer.B();
            if (zD4 || objB5 == companion.a()) {
                objB5 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.I0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductDetailComposeActivity.i.r(productDetailComposeActivity5, c17959m0J2);
                    }
                };
                composer.t(objB5);
            }
            Function0 function04 = (Function0) objB5;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD5 = composer.D(ProductDetailComposeActivity.this) | composer.D(c17959m0J2);
            final ProductDetailComposeActivity productDetailComposeActivity6 = ProductDetailComposeActivity.this;
            Object objB6 = composer.B();
            if (zD5 || objB6 == companion.a()) {
                objB6 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.J0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductDetailComposeActivity.i.l(productDetailComposeActivity6, c17959m0J2);
                    }
                };
                composer.t(objB6);
            }
            composer.P();
            Ki.K.b(null, ComposableLambdaKt.c(-818888866, true, new a(ProductDetailComposeActivity.this, c17959m0J2, function04, (Function0) objB6, c17959m0J, function0, c17993c1G, (SubscriptionSummaryDecorator) S2.a.c(ProductDetailComposeActivity.this.d3().p(), null, null, null, composer, 0, 7).getValue(), function02, function03, z1VarC), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            g(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ProductDetailFeatureFlags k(androidx.compose.runtime.z1<ProductDetailFeatureFlags> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mv.C0 l(ProductDetailComposeActivity productDetailComposeActivity, C17959M0 c17959m0) {
            InterfaceC15783O interfaceC15783O;
            InterfaceC15783O interfaceC15783O2 = productDetailComposeActivity.coroutineScope;
            if (interfaceC15783O2 == null) {
                Intrinsics.x("coroutineScope");
                interfaceC15783O = null;
            } else {
                interfaceC15783O = interfaceC15783O2;
            }
            return C15809k.d(interfaceC15783O, null, null, new d(c17959m0, productDetailComposeActivity, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mv.C0 o(ProductDetailComposeActivity productDetailComposeActivity, C17959M0 c17959m0) {
            InterfaceC15783O interfaceC15783O;
            InterfaceC15783O interfaceC15783O2 = productDetailComposeActivity.coroutineScope;
            if (interfaceC15783O2 == null) {
                Intrinsics.x("coroutineScope");
                interfaceC15783O = null;
            } else {
                interfaceC15783O = interfaceC15783O2;
            }
            return C15809k.d(interfaceC15783O, null, null, new b(c17959m0, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mv.C0 p(ProductDetailComposeActivity productDetailComposeActivity, C17959M0 c17959m0) {
            InterfaceC15783O interfaceC15783O;
            InterfaceC15783O interfaceC15783O2 = productDetailComposeActivity.coroutineScope;
            if (interfaceC15783O2 == null) {
                Intrinsics.x("coroutineScope");
                interfaceC15783O = null;
            } else {
                interfaceC15783O = interfaceC15783O2;
            }
            return C15809k.d(interfaceC15783O, null, null, new e(c17959m0, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mv.C0 q(ProductDetailComposeActivity productDetailComposeActivity, C17959M0 c17959m0) {
            InterfaceC15783O interfaceC15783O;
            InterfaceC15783O interfaceC15783O2 = productDetailComposeActivity.coroutineScope;
            if (interfaceC15783O2 == null) {
                Intrinsics.x("coroutineScope");
                interfaceC15783O = null;
            } else {
                interfaceC15783O = interfaceC15783O2;
            }
            return C15809k.d(interfaceC15783O, null, null, new f(c17959m0, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mv.C0 r(ProductDetailComposeActivity productDetailComposeActivity, C17959M0 c17959m0) {
            InterfaceC15783O interfaceC15783O;
            InterfaceC15783O interfaceC15783O2 = productDetailComposeActivity.coroutineScope;
            if (interfaceC15783O2 == null) {
                Intrinsics.x("coroutineScope");
                interfaceC15783O = null;
            } else {
                interfaceC15783O = interfaceC15783O2;
            }
            return C15809k.d(interfaceC15783O, null, null, new c(c17959m0, null), 3, null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class k implements InterfaceC14275b, FunctionAdapter {
        k() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
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

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            ProductDetailComposeActivity.this.f3(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class l extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f108245f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentActivity componentActivity) {
            super(0);
            this.f108245f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f108245f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class m extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f108246f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentActivity componentActivity) {
            super(0);
            this.f108246f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f108246f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class n extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f108247f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f108248g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f108247f = function0;
            this.f108248g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f108247f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f108248g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class o extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f108249f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentActivity componentActivity) {
            super(0);
            this.f108249f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f108249f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class p extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f108250f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentActivity componentActivity) {
            super(0);
            this.f108250f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f108250f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class q extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f108251f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f108252g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f108251f = function0;
            this.f108252g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f108251f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f108252g.getDefaultViewModelCreationExtras() : creationExtras;
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
            return new FunctionReferenceImpl(1, ProductDetailComposeActivity.this, ProductDetailComposeActivity.class, "handleSubscriptionResult", "handleSubscriptionResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            ProductDetailComposeActivity.this.g3(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class s implements InterfaceC14275b, FunctionAdapter {
        s() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
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

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            ProductDetailComposeActivity.this.h3(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A2(ProductDetailComposeActivity productDetailComposeActivity, ReadReview readReview, int i10, Composer composer, int i11) {
        productDetailComposeActivity.y2(readReview, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D2(ProductDetailComposeActivity productDetailComposeActivity, ReviewGallery reviewGallery, int i10, Composer composer, int i11) {
        productDetailComposeActivity.B2(reviewGallery, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G2(ProductDetailComposeActivity productDetailComposeActivity, SeeAllReviews seeAllReviews, int i10, Composer composer, int i11) {
        productDetailComposeActivity.E2(seeAllReviews, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(ProductDetailComposeActivity productDetailComposeActivity, WriteReview writeReview, int i10, Composer composer, int i11) {
        productDetailComposeActivity.H2(writeReview, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0982  */
    @android.annotation.SuppressLint({"MissingComposePreview"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X1(final Ki.LocalThemeScope r18, final com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12363e r19, com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d r20, androidx.compose.runtime.Composer r21, final int r22) {
        /*
            Method dump skipped, instructions count: 2475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.X1(Ki.M, com.meijer.mobile.meijer.activity.find.viewmodel.e0$e, com.meijer.mobile.meijer.activity.find.viewmodel.e0$d, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n2(ProductDetailComposeActivity productDetailComposeActivity, C12358e0.InterfaceC12363e interfaceC12363e, Function0 function0, int i10, Composer composer, int i11) {
        productDetailComposeActivity.m2(interfaceC12363e, function0, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
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
    private final void o2(final Ki.LocalThemeScope r32, com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12363e.d r33, final java.lang.String r34, java.lang.String r35, Hi.e r36, boolean r37, ki.q1.m.a r38, final boolean r39, kotlin.jvm.functions.Function0<kotlin.Unit> r40, kotlin.jvm.functions.Function0<kotlin.Unit> r41, kotlin.jvm.functions.Function0<kotlin.Unit> r42, kotlin.jvm.functions.Function0<kotlin.Unit> r43, androidx.compose.runtime.Composer r44, final int r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 1043
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.o2(Ki.M, com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d, java.lang.String, java.lang.String, Hi.e, boolean, ki.q1$m$a, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsp/b;", "LCo/h;", "it", "", "<anonymous>", "(Lsp/b;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity$onCreate$2", f = "ProductDetailComposeActivity.kt", l = {}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<ProductState<ProductFullDetails>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108241a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f108242b;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            j jVar = ProductDetailComposeActivity.this.new j(continuation);
            jVar.f108242b = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ProductState<ProductFullDetails> productState, Continuation<? super Unit> continuation) {
            return ((j) create(productState, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f108241a == 0) {
                ResultKt.b(obj);
                ProductDetailComposeActivity.this.d3().r((ProductFullDetails) ((ProductState) this.f108242b).g());
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C2(ProductDetailComposeActivity productDetailComposeActivity, ReviewGallery reviewGallery) {
        Bl.o oVar = Bl.o.f3147a;
        productDetailComposeActivity.startActivity(Bl.o.b(productDetailComposeActivity, reviewGallery.getIndex(), reviewGallery.b()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F2(ProductDetailComposeActivity productDetailComposeActivity, SeeAllReviews seeAllReviews) {
        productDetailComposeActivity.startActivity(Bl.o.f3147a.c(productDetailComposeActivity, seeAllReviews.getProductInfo()));
        return Unit.f143329a;
    }

    @SuppressLint({"MissingComposePreview"})
    private final void K2(final LocalThemeScope localThemeScope, final C12358e0.InterfaceC12363e.d.BazaarVoiceFeedbackSubmitted cVar, final boolean z10, Composer composer, final int i10) {
        int i11;
        C12358e0.InterfaceC12363e.d.BazaarVoiceFeedbackSubmitted cVar2;
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
                ComposerKt.U(1955101139, i11, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.UIToastForBVFeedback (ProductDetailComposeActivity.kt:1045)");
            }
            o2(localThemeScope, cVar, AbstractC6392a.INSTANCE.d(cVar2.getFeedbackVote() == Kp.a.f17595a ? Lp.c.f19390j0 : Lp.c.f19420y0, new Object[0]).b(this), null, null, false, q1.m.a.d.f142372a, z10, null, null, null, null, composerStartRestartGroup, LocalThemeScope.f17314g | (i11 & 14) | (i11 & 112) | (q1.m.a.d.f142373b << 18) | ((i11 << 15) & 29360128), (i11 >> 3) & 896, 1948);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.m0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductDetailComposeActivity.L2(this.f108501a, localThemeScope, cVar, z10, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L2(ProductDetailComposeActivity productDetailComposeActivity, LocalThemeScope localThemeScope, C12358e0.InterfaceC12363e.d.BazaarVoiceFeedbackSubmitted cVar, boolean z10, int i10, Composer composer, int i11) {
        productDetailComposeActivity.K2(localThemeScope, cVar, z10, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    @SuppressLint({"MissingComposePreview"})
    private final void M2(final LocalThemeScope localThemeScope, final C12358e0.InterfaceC12363e.d.BazaarVoiceFeedbackAttemptWithoutLogin bVar, Composer composer, final int i10) {
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
                ComposerKt.U(1605151847, i11, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.UIToastSignInBeforeVote (ProductDetailComposeActivity.kt:1064)");
            }
            o2(localThemeScope, bVar, C16338g.c(bVar.getMessage(), composerStartRestartGroup, 0), null, null, false, q1.m.a.c.f142370a, false, null, null, null, null, composerStartRestartGroup, 12582912 | LocalThemeScope.f17314g | (i11 & 14) | (i11 & 112) | (q1.m.a.c.f142371b << 18), i11 & 896, 1948);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductDetailComposeActivity.N2(this.f108433a, localThemeScope, bVar, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N2(ProductDetailComposeActivity productDetailComposeActivity, LocalThemeScope localThemeScope, C12358e0.InterfaceC12363e.d.BazaarVoiceFeedbackAttemptWithoutLogin bVar, int i10, Composer composer, int i11) {
        productDetailComposeActivity.M2(localThemeScope, bVar, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
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
                ComposerKt.U(-1463026278, i12, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.AcresModal (ProductDetailComposeActivity.kt:880)");
            }
            Ki.Q.e(localThemeScope, C15158a0.f142009a, ComposableLambdaKt.c(2101299381, true, new a(localThemeScope, function04, str, str5, str6, function03, str7), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f17314g | 384 | (i12 & 14) | (C15158a0.f142010b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.t0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductDetailComposeActivity.W1(this.f108618a, localThemeScope, str, str2, str3, str4, function0, function02, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W1(ProductDetailComposeActivity productDetailComposeActivity, LocalThemeScope localThemeScope, String str, String str2, String str3, String str4, Function0 function0, Function0 function02, int i10, Composer composer, int i11) {
        productDetailComposeActivity.V1(localThemeScope, str, str2, str3, str4, function0, function02, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b2(ProductDetailComposeActivity productDetailComposeActivity) {
        l3(productDetailComposeActivity, X0.a.f108285a, null, null, 6, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c2(C12358e0.InterfaceC12363e interfaceC12363e, ProductDetailComposeActivity productDetailComposeActivity) {
        Entry entryB = ((C12358e0.InterfaceC12363e.d.AddToCartSuccess) interfaceC12363e).getEntry();
        if (entryB != null) {
            CartProductListDecorator cartProductListDecoratorB = CartProductListDecorator.Companion.b(CartProductListDecorator.INSTANCE, entryB, false, 2, null);
            if (cartProductListDecoratorB.getStockInfo().c()) {
                productDetailComposeActivity.substitutionResultLauncher.a(Bl.t.e(Bl.t.f3152a, productDetailComposeActivity, cartProductListDecoratorB, Pp.c.f26248d, null, "product detail page", 8, null));
            }
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d2(ProductDetailComposeActivity productDetailComposeActivity) {
        l3(productDetailComposeActivity, X0.a.f108285a, null, null, 6, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16493d d3() {
        return (C16493d) this.subscriptionVM.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e2(ProductDetailComposeActivity productDetailComposeActivity) {
        l3(productDetailComposeActivity, X0.a.f108285a, null, null, 6, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C12358e0 e3() {
        return (C12358e0) this.vm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f2(ProductDetailComposeActivity productDetailComposeActivity, C12358e0.InterfaceC12363e interfaceC12363e) {
        Hi.i.INSTANCE.b();
        productDetailComposeActivity.startActivity(productDetailComposeActivity.b3().f(((C12358e0.InterfaceC12363e.d.ShowCouponClipped) interfaceC12363e).getCoupon(), true, true, false, null));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g2(ProductDetailComposeActivity productDetailComposeActivity, C12358e0.InterfaceC12363e interfaceC12363e) {
        Hi.i.INSTANCE.b();
        productDetailComposeActivity.e3().W1(new a.Clip(((C12358e0.InterfaceC12363e.d.ShowClipCouponError) interfaceC12363e).getCoupon(), null, 2, null));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h2(ProductDetailComposeActivity productDetailComposeActivity) {
        Hi.i.INSTANCE.b();
        productDetailComposeActivity.startActivity(Dl.e.j(productDetailComposeActivity.b3(), productDetailComposeActivity, null, productDetailComposeActivity.a3().e(AbstractC18503f.M.f172852h), productDetailComposeActivity.a3().e(AbstractC18503f.N.f172853h), 1, 2, null));
        return Unit.f143329a;
    }

    private final void j3(String function, String message) {
        qw.a.INSTANCE.a(Reflection.b(ProductDetailComposeActivity.class).u() + "::" + function + " - " + message, new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void k3(com.meijer.mobile.meijer.activity.find.productdetail.X0 r11, android.view.View r12, com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12363e r13) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.k3(com.meijer.mobile.meijer.activity.find.productdetail.X0, android.view.View, com.meijer.mobile.meijer.activity.find.viewmodel.e0$e):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l2(ProductDetailComposeActivity productDetailComposeActivity, LocalThemeScope localThemeScope, C12358e0.InterfaceC12363e interfaceC12363e, C12358e0.InterfaceC12362d interfaceC12362d, int i10, Composer composer, int i11) {
        productDetailComposeActivity.X1(localThemeScope, interfaceC12363e, interfaceC12362d, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    static /* synthetic */ void l3(ProductDetailComposeActivity productDetailComposeActivity, X0 x02, View view, C12358e0.InterfaceC12363e interfaceC12363e, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            view = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC12363e = null;
        }
        productDetailComposeActivity.k3(x02, view, interfaceC12363e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m3(ProductDetailComposeActivity productDetailComposeActivity, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("product detail page");
        track.c(Ao.W.f1694a.h(productDetailComposeActivity.c3()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p2() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q2() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r2() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s2() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t2(ProductDetailComposeActivity productDetailComposeActivity, LocalThemeScope localThemeScope, C12358e0.InterfaceC12363e.d dVar, String str, String str2, Hi.e eVar, boolean z10, q1.m.a aVar, boolean z11, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i10, int i11, int i12, Composer composer, int i13) {
        productDetailComposeActivity.o2(localThemeScope, dVar, str, str2, eVar, z10, aVar, z11, function0, function02, function03, function04, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f143329a;
    }

    private final void u2(final LocalThemeScope localThemeScope, final C12358e0.InterfaceC12363e.ShowError cVar, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, Composer composer, final int i10) {
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
                ComposerKt.U(-709640136, i11, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.ShowErrorModal (ProductDetailComposeActivity.kt:836)");
            }
            String strC = C16338g.c(cVar.getTitle(), composerStartRestartGroup, 0);
            String strC2 = C16338g.c(cVar.getMessage(), composerStartRestartGroup, 0);
            String strC3 = C16338g.c(cVar.getPositiveButtonText(), composerStartRestartGroup, 0);
            Integer numB = cVar.getNegativeButtonText();
            composerStartRestartGroup.startReplaceGroup(935644882);
            String strC4 = numB == null ? null : C16338g.c(numB.intValue(), composerStartRestartGroup, 0);
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
            productDetailComposeActivity.V1(localThemeScope, strC, strC2, strC3, strC4, function04, (Function0) objB2, composerStartRestartGroup, LocalThemeScope.f17314g | (i11 & 14) | ((i11 << 6) & 29360128));
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
                    return ProductDetailComposeActivity.x2(this.f108339a, localThemeScope, cVar, function0, function02, function03, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x2(ProductDetailComposeActivity productDetailComposeActivity, LocalThemeScope localThemeScope, C12358e0.InterfaceC12363e.ShowError cVar, Function0 function0, Function0 function02, Function0 function03, int i10, Composer composer, int i11) {
        productDetailComposeActivity.u2(localThemeScope, cVar, function0, function02, function03, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public final InterfaceC14523a Y2() {
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        if (interfaceC14523a != null) {
            return interfaceC14523a;
        }
        Intrinsics.x("analyticsEngine");
        return null;
    }

    public final Bl.g Z2() {
        Bl.g gVar = this.featureEntryPoint;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.x("featureEntryPoint");
        return null;
    }

    public final zl.k a3() {
        zl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("featureManager");
        return null;
    }

    public final Dl.e b3() {
        Dl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("meijerIntent");
        return null;
    }

    @Override // Qj.g
    public void onCreateAccount() {
        startActivity(Bl.f.f3124a.a(this, a3().e(AbstractC18503f.h0.f172881h)));
    }

    @Override // Qj.g
    public void onSignIn() {
        startActivity(Bl.k.b(this, false, null, null, null, null, null, 126, null));
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
                ComposerKt.U(-1402561872, i11, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.UIGoToReviewGallery (ProductDetailComposeActivity.kt:1117)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(this) | composerStartRestartGroup.D(reviewGallery);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.i0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductDetailComposeActivity.C2(this.f108461a, reviewGallery);
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
                    return ProductDetailComposeActivity.D2(this.f108469a, reviewGallery, i10, (Composer) obj, ((Integer) obj2).intValue());
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
                ComposerKt.U(1252623585, i11, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.UIGoToSeeAll (ProductDetailComposeActivity.kt:1134)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(this) | composerStartRestartGroup.D(seeAllReviews);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.b0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductDetailComposeActivity.F2(this.f108363a, seeAllReviews);
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
                    return ProductDetailComposeActivity.G2(this.f108400a, seeAllReviews, i10, (Composer) obj, ((Integer) obj2).intValue());
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
                ComposerKt.U(772348970, i11, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.UIGoToWriteReview (ProductDetailComposeActivity.kt:1075)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(this) | composerStartRestartGroup.D(writeReview);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.g0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductDetailComposeActivity.I2(this.f108445a, writeReview);
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
                    return ProductDetailComposeActivity.J2(this.f108453a, writeReview, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I2(ProductDetailComposeActivity productDetailComposeActivity, WriteReview writeReview) {
        Intent intentT = Dl.e.t(productDetailComposeActivity.b3(), productDetailComposeActivity, 268440657, null, 4, null);
        if (intentT != null) {
            intentT.setPackage(productDetailComposeActivity.getPackageName());
            intentT.putExtra("product_info", new ProductInfoForReviewSubmit(writeReview.getProductInfo().getProductId(), writeReview.getProductInfo().getProductImage(), writeReview.getProductInfo().getProductName()));
            productDetailComposeActivity.productRateAndReviewLauncher.a(intentT);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y1(ProductDetailComposeActivity productDetailComposeActivity, C12358e0.InterfaceC12363e interfaceC12363e) {
        productDetailComposeActivity.e3().y2(((C12358e0.InterfaceC12363e.d.ProductLoadError) interfaceC12363e).getProduct());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z1(ProductDetailComposeActivity productDetailComposeActivity, C12358e0.InterfaceC12363e interfaceC12363e) {
        productDetailComposeActivity.e3().getViewState().I().invoke(new C12358e0.InterfaceC12364f.ShoppingList(new AbstractC15517b.View(((C12358e0.InterfaceC12363e.d.ShoppingListItemAdded) interfaceC12363e).getProduct())));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a2(ProductDetailComposeActivity productDetailComposeActivity, C12358e0.InterfaceC12363e interfaceC12363e) {
        productDetailComposeActivity.e3().getViewState().I().invoke(new C12358e0.InterfaceC12364f.FavoritesList(new AbstractC15516a.View(((C12358e0.InterfaceC12363e.d.FavoriteListItemAdded) interfaceC12363e).getProduct())));
        return Unit.f143329a;
    }

    private final nk.f c3() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void f3(C14274a result) {
        if (result.getResultCode() != -1) {
            return;
        }
        e3().getViewState().I().invoke(C12358e0.InterfaceC12364f.j.f109470a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g3(C14274a result) {
        switch (result.getResultCode()) {
            case 867530916:
                j3("handleSubscriptionResult", "Subscription cancel successful");
                e3().getViewState().I().invoke(new C12358e0.InterfaceC12364f.CancelSubscriptionAction(true));
                break;
            case 867530917:
                j3("handleSubscriptionResult", "Subscription cancel failed");
                e3().getViewState().I().invoke(new C12358e0.InterfaceC12364f.CancelSubscriptionAction(false));
                break;
            default:
                j3("handleSubscriptionResult", "Unhandled subscription result code: " + result.getResultCode());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ShowToast"})
    public final void h3(C14274a result) {
        switch (result.getResultCode()) {
            case 867530912:
                e3().e2(m2.a.f108509a);
                break;
            case 867530913:
                e3().e2(m2.b.f108510a);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i2(C12358e0.InterfaceC12362d interfaceC12362d) {
        interfaceC12362d.I().invoke(new C12358e0.InterfaceC12364f.Reload(new n2.Product(interfaceC12362d.m().getValue().getId())));
        return Unit.f143329a;
    }

    private final boolean i3() {
        return getIntent().getBooleanExtra("com.meijer.intent.extra.IS_FROM_CLP", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j2(ProductDetailComposeActivity productDetailComposeActivity) {
        productDetailComposeActivity.finish();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k2(C12358e0.InterfaceC12362d interfaceC12362d, C12358e0.InterfaceC12363e interfaceC12363e) {
        interfaceC12362d.I().invoke(new C12358e0.InterfaceC12364f.DisposeEffect(interfaceC12363e));
        return Unit.f143329a;
    }

    @SuppressLint({"MissingComposePreview"})
    private final void m2(final C12358e0.InterfaceC12363e interfaceC12363e, final Function0<Unit> function0, Composer composer, final int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        boolean zD;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(1435149019);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(interfaceC12363e);
            } else {
                zD = composerStartRestartGroup.D(interfaceC12363e);
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
                ComposerKt.U(1435149019, i11, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.LaunchActivity (ProductDetailComposeActivity.kt:1031)");
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
            if (i15 == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(interfaceC12363e))) {
                z11 = true;
            }
            boolean z12 = zD2 | z11;
            Object objB = composerStartRestartGroup.B();
            if (z12 || objB == Composer.INSTANCE.a()) {
                objB = new g(function0, this, interfaceC12363e, null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(interfaceC12363e, (Function2) objB, composerStartRestartGroup, i15);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.u0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductDetailComposeActivity.n2(this.f108645a, interfaceC12363e, function0, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n3(ProductFullDetails product, com.meijer.mobile.core.design.widget.stepperview.a state) {
        e3().getViewState().I().invoke(new C12358e0.InterfaceC12364f.UpdateCarouselProductEntry(product, state.getValueState().getQuantity()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v2(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w2(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.f143329a;
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
                ComposerKt.U(-590377332, i11, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity.UIGoToReadReview (ProductDetailComposeActivity.kt:1101)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(this) | composerStartRestartGroup.D(readReview);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.k0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductDetailComposeActivity.z2(this.f108481a, readReview);
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
                    return ProductDetailComposeActivity.A2(this.f108494a, readReview, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z2(ProductDetailComposeActivity productDetailComposeActivity, ReadReview readReview) {
        productDetailComposeActivity.startActivity(Bl.o.a(productDetailComposeActivity, readReview.getReviewItem()));
        return Unit.f143329a;
    }

    @Override // com.meijer.mobile.meijer.activity.find.productdetail.Hilt_ProductDetailComposeActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().a(e3());
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-98783729, true, new i()), 1, null);
        e3().x2(getIntent().getStringExtra("com.meijer.intent.extra.PREVIOUS_TRACK_ACTION"));
        this.campaignIdValue = getIntent().getStringExtra("campaignIdValue");
        e3().v2(this.campaignIdValue);
        e3().y2(c3());
        C16563h.J(C16563h.O(e3().x1(), new j(null)), C6173t.a(this));
        e3().getViewState().I().invoke(new C12358e0.InterfaceC12364f.IsFromCLP(i3()));
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
    }
}
