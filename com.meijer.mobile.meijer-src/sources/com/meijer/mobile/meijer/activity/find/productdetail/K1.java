package com.meijer.mobile.meijer.activity.find.productdetail;

import Co.ProductFullDetails;
import Ki.LocalThemeScope;
import P0.e;
import Qk.a;
import an.C5747t;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5801e;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5844c1;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5866i0;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import cn.ProductVariantDecorator;
import cn.ProductVariantGroupDecorator;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.meijer.activity.find.productdetail.AbstractC12245f;
import com.meijer.mobile.meijer.activity.find.productdetail.K1;
import com.meijer.mobile.meijer.activity.find.productdetail.X0;
import com.meijer.mobile.meijer.activity.find.productdetail.n2;
import com.meijer.mobile.meijer.activity.find.viewmodel.AbstractC12325a;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12328b;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0;
import com.meijer.mobile.meijer.activity.find.viewmodel.ProductCartEntryDecorator;
import com.meijer.mobile.meijer.activity.find.viewmodel.ProductComplexPromoDecorator;
import com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailsDecorator;
import com.meijer.mobile.meijer.activity.find.viewmodel.ProductImageViewModel;
import dk.C13698b;
import ek.C13806b;
import gi.GoogleAdAnalytics;
import gi.GoogleAdData;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14902f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.InterfaceC15154X;
import ki.InterfaceC15160b0;
import ki.InterfaceC15168f0;
import ki.Q0;
import ki.q1;
import kotlin.C17808x;
import kotlin.C17993c1;
import kotlin.C18054z0;
import kotlin.InterfaceC6305e;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import l0.C15429A;
import l0.InterfaceC15439i;
import lk.AbstractC15516a;
import lk.AbstractC15517b;
import mv.C15809k;
import mv.InterfaceC15783O;
import p1.C16335d;
import p1.C16338g;
import pr.AbstractC16490a;
import pr.SubscriptionSummaryDecorator;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import qc.C16623d;
import qc.InterfaceC16624e;
import qc.PagerState;
import r1.C16813g;
import r1.C16819m;
import tr.C17284b;
import us.C17457C;
import us.C17463f;
import vs.InterfaceC17723c;
import vs.ProductLocationDecorator;
import vs.ProductNutritionLabelDecorator;
import vs.ProductPriceDecorator;

@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u0091\u0002\u0010&\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\t2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u000e2\u001e\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u00182\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\f0\u000e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u001f2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\f0\u000eH\u0001¢\u0006\u0004\b&\u0010'\u001a\u0095\u0002\u0010-\u001a\u00020\f*\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010+\u001a\u00020*2\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\t2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u000e2\u001e\u0010,\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u00182\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\f0\u000e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u001f2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\f0\u000eH\u0001¢\u0006\u0004\b-\u0010.\u001aC\u00105\u001a\u00020\f2\u0006\u00100\u001a\u00020/2\f\u00103\u001a\b\u0012\u0004\u0012\u000202012\b\b\u0002\u00104\u001a\u00020\u00192\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u000eH\u0001¢\u0006\u0004\b5\u00106\u001a[\u0010=\u001a\u00020\f*\u00020\u00002\u0006\u00108\u001a\u0002072\f\u0010:\u001a\b\u0012\u0004\u0012\u000209012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u000e2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b=\u0010>\u001aC\u0010C\u001a\u00020\f*\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u00192\u0006\u0010B\u001a\u00020\u00192\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001fH\u0001¢\u0006\u0004\bC\u0010D\u001a/\u0010H\u001a\u00020\f*\u00020\u00002\u0006\u00108\u001a\u00020E2\b\u0010G\u001a\u0004\u0018\u00010F2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\bH\u0010I\u001aQ\u0010R\u001a\u00020\f*\u00020\u00002\u0006\u0010J\u001a\u00020\u00192\u0006\u0010K\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\u00192\u0006\u0010M\u001a\u00020\u00192\b\u0010O\u001a\u0004\u0018\u00010N2\b\u0010Q\u001a\u0004\u0018\u00010P2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\bR\u0010S\u001a\u001b\u0010V\u001a\u00020\f*\u00020\u00002\u0006\u0010U\u001a\u00020TH\u0003¢\u0006\u0004\bV\u0010W\u001a=\u0010\\\u001a\u00020\f*\u00020\u00002\u0006\u0010X\u001a\u00020\u00192\u0006\u0010Y\u001a\u00020\u00192\u0006\u0010Z\u001a\u00020\u00192\u0006\u0010[\u001a\u00020\u00192\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\\\u0010]\u001a^\u0010e\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010_\u001a\b\u0012\u0004\u0012\u00020^012'\u0010c\u001a#\u0012\u0013\u0012\u00110^¢\u0006\f\b`\u0012\b\ba\u0012\u0004\b\b(b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t2\b\b\u0002\u0010d\u001a\u00020\u0019H\u0003¢\u0006\u0004\be\u0010f\u001aH\u0010i\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032!\u0010h\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b`\u0012\b\ba\u0012\u0004\b\b(g\u0012\u0004\u0012\u00020\f0\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\bi\u0010j\u001a1\u0010m\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010k\u001a\u00020\u00192\n\b\u0002\u0010l\u001a\u0004\u0018\u00010NH\u0001¢\u0006\u0004\bm\u0010n\"\u0014\u0010r\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010q¨\u0006y²\u0006\u000e\u0010s\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010u\u001a\u00020t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00104\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010v\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b018\nX\u008a\u0084\u0002²\u0006\u000e\u0010w\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\b\u001a\u0004\u0018\u00010\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010A\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010B\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010x\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$d;", "viewState", "Lx0/c1;", "scaffoldState", "Lpr/c;", "subscriptionSummary", "Lkotlin/Function2;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/X0;", "Landroid/view/View;", "", "onNavigationRequest", "Lkotlin/Function1;", "", "onRatingRowClicked", "Lcom/meijer/mobile/meijer/activity/find/productdetail/W0;", "featureFlags", "LCo/h;", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "onCarouselEntryUpdate", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/a;", "onCarouselAction", "Lkotlin/Function3;", "", "Lcn/i;", "", "variantSelectedAction", "Lgi/d;", "googleAdData", "Lkotlin/Function0;", "onShowItemLocationBottomSheet", "Lgi/a;", "onGoogleAdClicked", "onShowSubscriptionInfoBottomSheet", "Lpr/a;", "onSubscriptionAction", "S", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$d;Lx0/c1;Lpr/c;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lcom/meijer/mobile/meijer/activity/find/productdetail/W0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lgi/d;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Lj0/C;", "paddingValues", "Ld0/V;", "scrollState", "variantSelectAction", "c0", "(LKi/M;Lj0/C;Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$d;Lpr/c;Ld0/V;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lcom/meijer/mobile/meijer/activity/find/productdetail/W0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lgi/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Ll0/A;", "lazyListState", "", "Lvs/c;", "products", "isCarouselVisible", "L0", "(Ll0/A;Ljava/util/List;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lnk/f;", "product", "LXr/c;", "coupons", "LQk/a;", "onCouponAction", "I0", "(LKi/M;Lnk/f;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lvs/i;", "location", "preventGMOnlyDeliveryEnabled", "shouldShowExpressPickupDescription", "C0", "(LKi/M;Lvs/i;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/h1;", "Lvs/l;", "nutritionLabel", "x0", "(LKi/M;Lcom/meijer/mobile/meijer/activity/find/viewmodel/h1;Lvs/l;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "isOnSale", "isMap", "hasDeposit", "showWeightInfo", "Lbk/a;", "priceGoodThroughDate", "Lvs/m;", "price", "G0", "(LKi/M;ZZZZLbk/a;Lvs/m;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/w;", "decorator", "M", "(LKi/M;Lcom/meijer/mobile/meijer/activity/find/viewmodel/w;Landroidx/compose/runtime/Composer;I)V", "hasChokingWarning", "hasAlcoholWarning", "hasAgeRestriction", "hasFinalPriceNotification", "E0", "(LKi/M;ZZZZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/l1;", "images", "Lkotlin/ParameterName;", "name", "image", "onImageClick", "isGrayscale", "z0", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/runtime/Composer;II)V", "isExpanded", "onStepperExpanded", "V", "(LKi/M;Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$d;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "isVisible", "text", "P", "(LKi/M;Landroidx/compose/ui/Modifier;ZLbk/a;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/find/productdetail/c;", "a", "Lcom/meijer/mobile/meijer/activity/find/productdetail/c;", "MockDataForPreviews", "isStepperExpanded", "", "productReviewsPosition", "imageUrls", "lastAction", "isFromSisterStore", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class K1 {

    /* renamed from: a, reason: collision with root package name */
    private static final C12236c f107934a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC6305e, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f107935a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107936b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f107937c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.K1$a$a, reason: collision with other inner class name */
        static final class C1625a implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f107938a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f107939b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Modifier f107940c;

            C1625a(AbstractC6392a abstractC6392a, LocalThemeScope localThemeScope, Modifier modifier) {
                this.f107938a = abstractC6392a;
                this.f107939b = localThemeScope;
                this.f107940c = modifier;
            }

            public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(176531017, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.LoadingSpinner.<anonymous>.<anonymous>.<anonymous> (ProductDetailScreen.kt:1429)");
                }
                Ci.m.d(this.f107939b, this.f107940c, Assemble.getLoading().getLargeLoading(), Ci.o.f4629a, C13698b.a(this.f107938a, composer, AbstractC6392a.f60445b), null, null, composer, LocalThemeScope.f17314g | 3072 | (q1.k.Large.f142345f << 6), 48);
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

        a(Modifier modifier, LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a) {
            this.f107935a = modifier;
            this.f107936b = localThemeScope;
            this.f107937c = abstractC6392a;
        }

        public final void a(InterfaceC6305e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(1850221716, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.LoadingSpinner.<anonymous> (ProductDetailScreen.kt:1421)");
            }
            Modifier modifierB = androidx.compose.foundation.g.b(androidx.compose.foundation.b.d(T0.a.a(this.f107935a, 1.0f), this.f107936b.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), true, null, 2, null);
            P0.e eVarE = P0.e.INSTANCE.e();
            LocalThemeScope localThemeScope = this.f107936b;
            AbstractC6392a abstractC6392a = this.f107937c;
            Modifier modifier = this.f107935a;
            MeasurePolicy measurePolicyG = C5804h.g(eVarE, false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierB);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            C5806j c5806j = C5806j.f48836a;
            Ki.Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(176531017, true, new C1625a(abstractC6392a, localThemeScope, modifier), composer, 54), composer, LocalThemeScope.f17314g | 384 | (Q0.b.f141967b << 3));
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6305e interfaceC6305e, Composer composer, Integer num) {
            a(interfaceC6305e, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107941a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C12358e0.InterfaceC12362d f107942b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<X0, View, Unit> f107943c;

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, C12358e0.InterfaceC12362d interfaceC12362d, Function2<? super X0, ? super View, Unit> function2) {
            this.f107941a = localThemeScope;
            this.f107942b = interfaceC12362d;
            this.f107943c = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function2 function2, X0 request) {
            Intrinsics.j(request, "request");
            function2.invoke(request, null);
            return Unit.f143329a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(359573513, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailScreen.<anonymous> (ProductDetailScreen.kt:198)");
            }
            LocalThemeScope localThemeScope = this.f107941a;
            int iA = this.f107942b.getCartItemCount().a();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f107943c);
            final Function2<X0, View, Unit> function2 = this.f107943c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.L1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K1.b.c(function2, (X0) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            X1.c(localThemeScope, iA, (Function1) objB, composer, LocalThemeScope.f17314g);
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
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C12358e0.InterfaceC12362d f107944a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107945b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f107946c;

        c(C12358e0.InterfaceC12362d interfaceC12362d, LocalThemeScope localThemeScope, InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f107944a = interfaceC12362d;
            this.f107945b = localThemeScope;
            this.f107946c = interfaceC5872l0;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(128310794, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailScreen.<anonymous> (ProductDetailScreen.kt:204)");
            }
            if (!Intrinsics.e(this.f107944a.G().getValue(), C12358e0.InterfaceC12359a.b.f109395a)) {
                LocalThemeScope localThemeScope = this.f107945b;
                C12358e0.InterfaceC12362d interfaceC12362d = this.f107944a;
                composer.startReplaceGroup(5004770);
                final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f107946c;
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.M1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return K1.c.c(interfaceC5872l0, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                K1.V(localThemeScope, interfaceC12362d, (Function1) objB, androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.J.D(Modifier.INSTANCE, null, false, 3, null), 0.0f, 1, null), composer, LocalThemeScope.f17314g | 3456, 0);
            }
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
        public static final Unit c(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
            K1.T(interfaceC5872l0, z10);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f107947a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0.V f107948b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107949c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C12358e0.InterfaceC12362d f107950d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ SubscriptionSummaryDecorator f107951e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<X0, View, Unit> f107952f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f107953g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ProductDetailFeatureFlags f107954h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> f107955i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC12325a, Unit> f107956j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function3<Boolean, ProductVariantDecorator, String, Unit> f107957k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f107958l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ GoogleAdData f107959m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1<GoogleAdAnalytics, Unit> f107960n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f107961o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC16490a, Unit> f107962p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements PointerInputEventHandler {

            /* renamed from: a, reason: collision with root package name */
            public static final a f107963a = new a();

            a() {
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(g1.J j10, Continuation<? super Unit> continuation) {
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(Modifier modifier, d0.V v10, LocalThemeScope localThemeScope, C12358e0.InterfaceC12362d interfaceC12362d, SubscriptionSummaryDecorator subscriptionSummaryDecorator, Function2<? super X0, ? super View, Unit> function2, Function1<? super Integer, Unit> function1, ProductDetailFeatureFlags productDetailFeatureFlags, Function2<? super ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, Unit> function22, Function1<? super AbstractC12325a, Unit> function12, Function3<? super Boolean, ? super ProductVariantDecorator, ? super String, Unit> function3, Function0<Unit> function0, GoogleAdData googleAdData, Function1<? super GoogleAdAnalytics, Unit> function13, Function0<Unit> function02, Function1<? super AbstractC16490a, Unit> function14) {
            this.f107947a = modifier;
            this.f107948b = v10;
            this.f107949c = localThemeScope;
            this.f107950d = interfaceC12362d;
            this.f107951e = subscriptionSummaryDecorator;
            this.f107952f = function2;
            this.f107953g = function1;
            this.f107954h = productDetailFeatureFlags;
            this.f107955i = function22;
            this.f107956j = function12;
            this.f107957k = function3;
            this.f107958l = function0;
            this.f107959m = googleAdData;
            this.f107960n = function13;
            this.f107961o = function02;
            this.f107962p = function14;
        }

        public final void a(InterfaceC14882C paddingValues, Composer composer, int i10) {
            int i11;
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(paddingValues) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(57033218, i11, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailScreen.<anonymous> (ProductDetailScreen.kt:215)");
            }
            Modifier modifierF = androidx.compose.foundation.layout.J.f(d0.T.g(this.f107947a, this.f107948b, false, null, false, 14, null), 0.0f, 1, null);
            int i12 = i11;
            LocalThemeScope localThemeScope = this.f107949c;
            C12358e0.InterfaceC12362d interfaceC12362d = this.f107950d;
            SubscriptionSummaryDecorator subscriptionSummaryDecorator = this.f107951e;
            d0.V v10 = this.f107948b;
            Function2<X0, View, Unit> function2 = this.f107952f;
            Function1<Integer, Unit> function1 = this.f107953g;
            ProductDetailFeatureFlags productDetailFeatureFlags = this.f107954h;
            Function2<ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> function22 = this.f107955i;
            Function1<AbstractC12325a, Unit> function12 = this.f107956j;
            Function3<Boolean, ProductVariantDecorator, String, Unit> function3 = this.f107957k;
            Function0<Unit> function0 = this.f107958l;
            GoogleAdData googleAdData = this.f107959m;
            Function1<GoogleAdAnalytics, Unit> function13 = this.f107960n;
            Function0<Unit> function02 = this.f107961o;
            Function1<AbstractC16490a, Unit> function14 = this.f107962p;
            int i13 = LocalThemeScope.f17314g;
            K1.c0(localThemeScope, paddingValues, interfaceC12362d, subscriptionSummaryDecorator, v10, function2, function1, productDetailFeatureFlags, function22, function12, function3, function0, modifierF, googleAdData, function13, function02, function14, composer, i13 | ((i12 << 3) & 112) | (SubscriptionSummaryDecorator.f157072e << 9), GoogleAdData.f134248f << 9, 0);
            LocalThemeScope localThemeScope2 = this.f107949c;
            Modifier modifierF2 = androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null);
            Unit unit = Unit.f143329a;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = a.f107963a;
                composer.t(objB);
            }
            composer.P();
            K1.P(localThemeScope2, g1.U.c(modifierF2, unit, (PointerInputEventHandler) objB), this.f107950d.y().getValue().booleanValue(), AbstractC6392a.INSTANCE.a(), composer, i13 | (AbstractC6392a.f60445b << 9), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
            a(interfaceC14882C, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC14902f f107964a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f107965b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107966c;

        e(InterfaceC14902f interfaceC14902f, Modifier modifier, LocalThemeScope localThemeScope) {
            this.f107964a = interfaceC14902f;
            this.f107965b = modifier;
            this.f107966c = localThemeScope;
        }

        public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(2078475354, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailsBottomActionBar.<anonymous>.<anonymous>.<anonymous> (ProductDetailScreen.kt:1128)");
            }
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Ci.o oVar = Ci.o.f4629a;
            Ci.m.d(this.f107966c, this.f107964a.c(this.f107965b, P0.e.INSTANCE.g()), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f17314g | 3072 | (q1.k.Large.f142345f << 6), 56);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107967a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C12358e0.InterfaceC12362d f107968b;

        f(LocalThemeScope localThemeScope, C12358e0.InterfaceC12362d interfaceC12362d) {
            this.f107967a = localThemeScope;
            this.f107968b = interfaceC12362d;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1727392293, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductDetailScreen.kt:350)");
            }
            si.j.h(this.f107967a, new q1.Label(null, null, null, null, 0, false, 0, this.f107967a.getAdsTypography().getHeadings().getSeven(), null, 383, null), C13698b.a(this.f107968b.m().getValue().getTitle(), composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailScreenKt$ProductDetailsContent$1$1$3$2$1$1", f = "ProductDetailScreen.kt", l = {372}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107969a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0.V f107970b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5866i0 f107971c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new g(this.f107970b, this.f107971c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(d0.V v10, InterfaceC5866i0 interfaceC5866i0, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f107970b = v10;
            this.f107971c = interfaceC5866i0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f107969a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                d0.V v10 = this.f107970b;
                int iD = MathKt.d(K1.w0(this.f107971c));
                this.f107969a = 1;
                if (d0.V.l(v10, iD, null, this, 2, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class h implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProductDetailsDecorator f107972a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107973b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f107974a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ProductDetailsDecorator f107975b;

            a(LocalThemeScope localThemeScope, ProductDetailsDecorator c12382h1) {
                this.f107974a = localThemeScope;
                this.f107975b = c12382h1;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(136065657, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductExpandableDetails.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductDetailScreen.kt:793)");
                }
                LocalThemeScope localThemeScope = this.f107974a;
                si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne(), null, 382, null), C13698b.a(AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100614Pc, this.f107975b.getId().getCode()), composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        h(ProductDetailsDecorator c12382h1, LocalThemeScope localThemeScope) {
            this.f107972a = c12382h1;
            this.f107973b = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2039741408, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductExpandableDetails.<anonymous>.<anonymous> (ProductDetailScreen.kt:779)");
            }
            ProductDetailsDecorator c12382h1 = this.f107972a;
            LocalThemeScope localThemeScope = this.f107973b;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            AbstractC6392a abstractC6392aA = c12382h1.getDescription();
            composer.startReplaceGroup(-1399811821);
            if (abstractC6392aA != null) {
                si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne(), null, 382, null), C13698b.a(abstractC6392aA, composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
            }
            composer.P();
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(8)), composer, 6);
            C17808x.a(null, ComposableLambdaKt.c(136065657, true, new a(localThemeScope, c12382h1), composer, 54), composer, 48, 1);
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
    static final class i implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107976a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f107977b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f107978a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f107979b;

            a(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a) {
                this.f107978a = localThemeScope;
                this.f107979b = abstractC6392a;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(978380475, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductExpandableDetails.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductDetailScreen.kt:813)");
                }
                LocalThemeScope localThemeScope = this.f107978a;
                si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne(), null, 382, null), C13698b.a(this.f107979b, composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        i(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a) {
            this.f107976a = localThemeScope;
            this.f107977b = abstractC6392a;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1949430696, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductExpandableDetails.<anonymous>.<anonymous>.<anonymous> (ProductDetailScreen.kt:812)");
            }
            C17808x.a(null, ComposableLambdaKt.c(978380475, true, new a(this.f107976a, this.f107977b), composer, 54), composer, 48, 1);
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
    static final class j implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107980a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProductNutritionLabelDecorator f107981b;

        j(LocalThemeScope localThemeScope, ProductNutritionLabelDecorator productNutritionLabelDecorator) {
            this.f107980a = localThemeScope;
            this.f107981b = productNutritionLabelDecorator;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1862718874, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductExpandableDetails.<anonymous>.<anonymous>.<anonymous> (ProductDetailScreen.kt:827)");
            }
            C17463f.j(this.f107980a, this.f107981b, androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), composer, LocalThemeScope.f17314g | 384 | (ProductNutritionLabelDecorator.f166297b << 3), 0);
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
    static final class k implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107982a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f107983b;

        k(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a) {
            this.f107982a = localThemeScope;
            this.f107983b = abstractC6392a;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1435643424, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductExpandableDetails.<anonymous>.<anonymous>.<anonymous> (ProductDetailScreen.kt:837)");
            }
            LocalThemeScope localThemeScope = this.f107982a;
            si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne(), null, 382, null), C13698b.a(this.f107983b, composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
    static final class l implements Function3<InterfaceC15168f0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107984a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f107985b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<ProductImageViewModel> f107986c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ PagerState f107987d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<ProductImageViewModel, View, Unit> f107988e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f107989f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f107990g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function4<InterfaceC16624e, Integer, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<ProductImageViewModel> f107991a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14902f f107992b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2<ProductImageViewModel, View, Unit> f107993c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ View f107994d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f107995e;

            /* JADX WARN: Multi-variable type inference failed */
            a(List<ProductImageViewModel> list, InterfaceC14902f interfaceC14902f, Function2<? super ProductImageViewModel, ? super View, Unit> function2, View view, boolean z10) {
                this.f107991a = list;
                this.f107992b = interfaceC14902f;
                this.f107993c = function2;
                this.f107994d = view;
                this.f107995e = z10;
            }

            public final void b(InterfaceC16624e AdsHorizontalPager, int i10, Composer composer, int i11) throws Resources.NotFoundException {
                int i12;
                Intrinsics.j(AdsHorizontalPager, "$this$AdsHorizontalPager");
                if ((i11 & 48) == 0) {
                    i12 = i11 | (composer.d(i10) ? 32 : 16);
                } else {
                    i12 = i11;
                }
                if ((i12 & 145) == 144 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1211861319, i12, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductImagesView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductDetailScreen.kt:1071)");
                }
                final ProductImageViewModel productImageViewModel = this.f107991a.get(i10);
                String strD = C16338g.d(com.meijer.mobile.meijer.Y.f100771Xh, new Object[]{Integer.valueOf(i10 + 1), Integer.valueOf(this.f107991a.size())}, composer, 0);
                String strC = productImageViewModel.c();
                String strF = productImageViewModel.f();
                InterfaceC5926k interfaceC5926kE = InterfaceC5926k.INSTANCE.e();
                InterfaceC14902f interfaceC14902f = this.f107992b;
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1746271574);
                boolean zV = composer.V(this.f107993c) | composer.D(productImageViewModel) | composer.D(this.f107994d);
                final Function2<ProductImageViewModel, View, Unit> function2 = this.f107993c;
                final View view = this.f107994d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.N1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K1.l.a.c(function2, productImageViewModel, view);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C13806b.b(interfaceC14902f.c(C5801e.b(androidx.compose.foundation.layout.J.F(androidx.compose.foundation.layout.D.k(ClickableKt.d(companion, false, null, null, (Function0) objB, 7, null), H1.h.p(64), 0.0f, 2, null), null, false, 1, null), 1.0f, false, 2, null), P0.e.INSTANCE.g()), strC, strD, strF, interfaceC5926kE, this.f107995e, null, null, 0.0f, composer, 24576, 448);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC16624e interfaceC16624e, Integer num, Composer composer, Integer num2) throws Resources.NotFoundException {
                b(interfaceC16624e, num.intValue(), composer, num2.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function2 function2, ProductImageViewModel productImageViewModel, View view) {
                function2.invoke(productImageViewModel, view);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        l(LocalThemeScope localThemeScope, Modifier modifier, List<ProductImageViewModel> list, PagerState pagerState, Function2<? super ProductImageViewModel, ? super View, Unit> function2, View view, boolean z10) {
            this.f107984a = localThemeScope;
            this.f107985b = modifier;
            this.f107986c = list;
            this.f107987d = pagerState;
            this.f107988e = function2;
            this.f107989f = view;
            this.f107990g = z10;
        }

        public final void a(InterfaceC15168f0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(768276635, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductImagesView.<anonymous>.<anonymous> (ProductDetailScreen.kt:1064)");
            }
            e.b bVarG = P0.e.INSTANCE.g();
            LocalThemeScope localThemeScope = this.f107984a;
            Modifier modifier = this.f107985b;
            List<ProductImageViewModel> list = this.f107986c;
            PagerState pagerState = this.f107987d;
            Function2<ProductImageViewModel, View, Unit> function2 = this.f107988e;
            View view = this.f107989f;
            boolean z10 = this.f107990g;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), bVarG, composer, 48);
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            vi.g.e(localThemeScope, modifier, new q1.HorizontalPagerTemplate(null, false, 0.0f, null, null, null, null, l3.f93324d, null), list.size(), pagerState, ComposableLambdaKt.c(-1211861319, true, new a(list, C14903g.f139698a, function2, view, z10), composer, 54), composer, 196608 | LocalThemeScope.f17314g | (q1.HorizontalPagerTemplate.f142306h << 6));
            C16623d.a(pagerState, null, list.size(), null, localThemeScope.getAdsColors().getAdsColorActive01().getColor(), localThemeScope.getAdsColors().getAdsColorUIBorder02().getColor(), 0.0f, 0.0f, H1.h.p(12), null, composer, 100663296, 714);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15168f0 interfaceC15168f0, Composer composer, Integer num) {
            a(interfaceC15168f0, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class m implements Function3<InterfaceC15160b0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107996a;

        m(LocalThemeScope localThemeScope) {
            this.f107996a = localThemeScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            return Unit.f143329a;
        }

        public final void b(InterfaceC15160b0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-802759055, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductNotifications.<anonymous>.<anonymous> (ProductDetailScreen.kt:997)");
            }
            q1.m.Inline warning = Assemble.getToastVariant().getWarning();
            Modifier modifier = Assemble.getToastVariant().getWarning().getModifier();
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.O1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K1.m.c((r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.m.Inline inlineY = q1.m.Inline.y(warning, C16819m.c(modifier, true, (Function1) objB), null, null, null, null, null, null, 126, null);
            String strC = C16338g.c(C17284b.f163276H, composer, 0);
            Di.j.i(this.f107996a, null, C16338g.c(C17284b.f163274G, composer, 0), strC, inlineY, null, composer, LocalThemeScope.f17314g | (q1.m.Inline.f142376h << 12), 17);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15160b0 interfaceC15160b0, Composer composer, Integer num) {
            b(interfaceC15160b0, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class n implements Function3<InterfaceC15160b0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f107997a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107998b;

        n(boolean z10, LocalThemeScope localThemeScope) {
            this.f107997a = z10;
            this.f107998b = localThemeScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            return Unit.f143329a;
        }

        public final void b(InterfaceC15160b0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-312287256, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductNotifications.<anonymous>.<anonymous> (ProductDetailScreen.kt:1011)");
            }
            q1.m.Inline informational = Assemble.getToastVariant().getInformational();
            Modifier modifier = Assemble.getToastVariant().getInformational().getModifier();
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.P1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K1.n.c((r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.m.Inline inlineY = q1.m.Inline.y(informational, C16819m.c(modifier, true, (Function1) objB), null, null, null, null, null, null, 126, null);
            Di.j.i(this.f107998b, null, C16338g.c(this.f107997a ? C17457C.f164407d : C17457C.f164406c, composer, 0), C16338g.c(C17457C.f164408e, composer, 0), inlineY, null, composer, LocalThemeScope.f17314g | (q1.m.Inline.f142376h << 12), 17);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15160b0 interfaceC15160b0, Composer composer, Integer num) {
            b(interfaceC15160b0, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class o implements Function3<InterfaceC15160b0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107999a;

        o(LocalThemeScope localThemeScope) {
            this.f107999a = localThemeScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            return Unit.f143329a;
        }

        public final void b(InterfaceC15160b0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1503200233, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductNotifications.<anonymous>.<anonymous> (ProductDetailScreen.kt:1031)");
            }
            q1.m.Inline informational = Assemble.getToastVariant().getInformational();
            Modifier modifier = Assemble.getToastVariant().getInformational().getModifier();
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.Q1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return K1.o.c((r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.m.Inline inlineY = q1.m.Inline.y(informational, C16819m.c(modifier, true, (Function1) objB), null, null, null, null, null, null, 126, null);
            Di.j.i(this.f107999a, null, C16338g.c(com.meijer.mobile.meijer.Y.f100809Zh, composer, 0), null, inlineY, null, composer, LocalThemeScope.f17314g | (q1.m.Inline.f142376h << 12), 21);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15160b0 interfaceC15160b0, Composer composer, Integer num) {
            b(interfaceC15160b0, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailScreenKt$SendCarouselItemOnViewBeacon$4$1", f = "ProductDetailScreen.kt", l = {611}, m = "invokeSuspend")
    static final class p extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108000a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z1<List<Integer>> f108001b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f108002c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<InterfaceC17723c> f108003d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC12325a, Unit> f108004e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f108005a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<InterfaceC17723c> f108006b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.z1<List<Integer>> f108007c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC12325a, Unit> f108008d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailScreenKt$SendCarouselItemOnViewBeacon$4$1$2", f = "ProductDetailScreen.kt", l = {622}, m = "emit")
            /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.K1$p$a$a, reason: collision with other inner class name */
            static final class C1626a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                Object f108009a;

                /* renamed from: b, reason: collision with root package name */
                Object f108010b;

                /* renamed from: c, reason: collision with root package name */
                Object f108011c;

                /* renamed from: d, reason: collision with root package name */
                Object f108012d;

                /* renamed from: e, reason: collision with root package name */
                Object f108013e;

                /* renamed from: f, reason: collision with root package name */
                Object f108014f;

                /* renamed from: g, reason: collision with root package name */
                Object f108015g;

                /* renamed from: h, reason: collision with root package name */
                Object f108016h;

                /* renamed from: i, reason: collision with root package name */
                Object f108017i;

                /* renamed from: j, reason: collision with root package name */
                Object f108018j;

                /* renamed from: k, reason: collision with root package name */
                int f108019k;

                /* renamed from: l, reason: collision with root package name */
                int f108020l;

                /* renamed from: m, reason: collision with root package name */
                int f108021m;

                /* renamed from: n, reason: collision with root package name */
                int f108022n;

                /* renamed from: o, reason: collision with root package name */
                /* synthetic */ Object f108023o;

                /* renamed from: p, reason: collision with root package name */
                final /* synthetic */ a<T> f108024p;

                /* renamed from: q, reason: collision with root package name */
                int f108025q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1626a(a<? super T> aVar, Continuation<? super C1626a> continuation) {
                    super(continuation);
                    this.f108024p = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f108023o = obj;
                    this.f108025q |= Integer.MIN_VALUE;
                    return this.f108024p.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(boolean z10, List<? extends InterfaceC17723c> list, androidx.compose.runtime.z1<? extends List<Integer>> z1Var, Function1<? super AbstractC12325a, Unit> function1) {
                this.f108005a = z10;
                this.f108006b = list;
                this.f108007c = z1Var;
                this.f108008d = function1;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0100  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ef -> B:30:0x00f0). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x010e -> B:36:0x0113). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0111 -> B:36:0x0113). Please report as a decompilation issue!!! */
            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.util.List<java.lang.Integer> r19, kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
                /*
                    Method dump skipped, instructions count: 283
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.K1.p.a.emit(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(androidx.compose.runtime.z1<? extends List<Integer>> z1Var, boolean z10, List<? extends InterfaceC17723c> list, Function1<? super AbstractC12325a, Unit> function1, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f108001b = z1Var;
            this.f108002c = z10;
            this.f108003d = list;
            this.f108004e = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new p(this.f108001b, this.f108002c, this.f108003d, this.f108004e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((p) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List g(androidx.compose.runtime.z1 z1Var) {
            return (List) z1Var.getValue();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108000a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final androidx.compose.runtime.z1<List<Integer>> z1Var = this.f108001b;
                InterfaceC16561f interfaceC16561fQ = androidx.compose.runtime.o1.q(new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.R1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return K1.p.g(z1Var);
                    }
                });
                a aVar = new a(this.f108002c, this.f108003d, this.f108001b, this.f108004e);
                this.f108000a = 1;
                if (interfaceC16561fQ.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailScreenKt$SendCarouselItemOnViewBeacon$5$1", f = "ProductDetailScreen.kt", l = {637}, m = "invokeSuspend")
    static final class q extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108026a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z1<Boolean> f108027b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z1<List<Integer>> f108028c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f108029d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC12325a, Unit> f108030e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<InterfaceC17723c> f108031f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f108032a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC12325a, Unit> f108033b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<InterfaceC17723c> f108034c;

            /* JADX WARN: Multi-variable type inference failed */
            a(boolean z10, Function1<? super AbstractC12325a, Unit> function1, List<? extends InterfaceC17723c> list) {
                this.f108032a = z10;
                this.f108033b = function1;
                this.f108034c = list;
            }

            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<Integer> list, Continuation<? super Unit> continuation) {
                if (this.f108032a) {
                    ArrayList arrayList = new ArrayList();
                    List<InterfaceC17723c> list2 = this.f108034c;
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        if (iIntValue < list2.size()) {
                            InterfaceC17723c interfaceC17723c = list2.get(iIntValue);
                            if (interfaceC17723c.getProduct().F()) {
                                arrayList.add(interfaceC17723c.getProduct());
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        this.f108033b.invoke(new AbstractC12325a.NewItemScrolling(arrayList));
                    }
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(androidx.compose.runtime.z1<Boolean> z1Var, androidx.compose.runtime.z1<? extends List<Integer>> z1Var2, boolean z10, Function1<? super AbstractC12325a, Unit> function1, List<? extends InterfaceC17723c> list, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f108027b = z1Var;
            this.f108028c = z1Var2;
            this.f108029d = z10;
            this.f108030e = function1;
            this.f108031f = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new q(this.f108027b, this.f108028c, this.f108029d, this.f108030e, this.f108031f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List g(androidx.compose.runtime.z1 z1Var) {
            return (List) z1Var.getValue();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108026a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                if (this.f108027b.getValue().booleanValue()) {
                    final androidx.compose.runtime.z1<List<Integer>> z1Var = this.f108028c;
                    InterfaceC16561f interfaceC16561fQ = androidx.compose.runtime.o1.q(new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.S1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K1.q.g(z1Var);
                        }
                    });
                    a aVar = new a(this.f108029d, this.f108030e, this.f108031f);
                    this.f108026a = 1;
                    if (interfaceC16561fQ.collect(aVar, this) == objF) {
                        return objF;
                    }
                }
            }
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void C0(final Ki.LocalThemeScope r35, final vs.ProductLocationDecorator r36, final boolean r37, final boolean r38, androidx.compose.ui.Modifier r39, final kotlin.jvm.functions.Function0<kotlin.Unit> r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 1589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.K1.C0(Ki.M, vs.i, boolean, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void S(final Ki.LocalThemeScope r33, androidx.compose.ui.Modifier r34, final com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d r35, kotlin.C17993c1 r36, pr.SubscriptionSummaryDecorator r37, final kotlin.jvm.functions.Function2<? super com.meijer.mobile.meijer.activity.find.productdetail.X0, ? super android.view.View, kotlin.Unit> r38, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r39, final com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailFeatureFlags r40, final kotlin.jvm.functions.Function2<? super Co.ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, kotlin.Unit> r41, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.find.viewmodel.AbstractC12325a, kotlin.Unit> r42, final kotlin.jvm.functions.Function3<? super java.lang.Boolean, ? super cn.ProductVariantDecorator, ? super java.lang.String, kotlin.Unit> r43, gi.GoogleAdData r44, final kotlin.jvm.functions.Function0<kotlin.Unit> r45, final kotlin.jvm.functions.Function1<? super gi.GoogleAdAnalytics, kotlin.Unit> r46, final kotlin.jvm.functions.Function0<kotlin.Unit> r47, final kotlin.jvm.functions.Function1<? super pr.AbstractC16490a, kotlin.Unit> r48, androidx.compose.runtime.Composer r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.K1.S(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.find.viewmodel.e0$d, x0.c1, pr.c, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, com.meijer.mobile.meijer.activity.find.productdetail.W0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3, gi.d, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0b44  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0bfc  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0c0e  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0c63  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0c6f  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0cac  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0cee  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0cf0  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0cfd  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0d11  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0d14  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0d22  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0d76  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0da6  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0da8  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0db5  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0ec9  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0edc  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0ee8  */
    /* JADX WARN: Removed duplicated region for block: B:507:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c0(final Ki.LocalThemeScope r73, final j0.InterfaceC14882C r74, final com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d r75, final pr.SubscriptionSummaryDecorator r76, final d0.V r77, final kotlin.jvm.functions.Function2<? super com.meijer.mobile.meijer.activity.find.productdetail.X0, ? super android.view.View, kotlin.Unit> r78, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r79, final com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailFeatureFlags r80, final kotlin.jvm.functions.Function2<? super Co.ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, kotlin.Unit> r81, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.find.viewmodel.AbstractC12325a, kotlin.Unit> r82, final kotlin.jvm.functions.Function3<? super java.lang.Boolean, ? super cn.ProductVariantDecorator, ? super java.lang.String, kotlin.Unit> r83, final kotlin.jvm.functions.Function0<kotlin.Unit> r84, androidx.compose.ui.Modifier r85, gi.GoogleAdData r86, kotlin.jvm.functions.Function1<? super gi.GoogleAdAnalytics, kotlin.Unit> r87, final kotlin.jvm.functions.Function0<kotlin.Unit> r88, final kotlin.jvm.functions.Function1<? super pr.AbstractC16490a, kotlin.Unit> r89, androidx.compose.runtime.Composer r90, final int r91, final int r92, final int r93) {
        /*
            Method dump skipped, instructions count: 3863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.K1.c0(Ki.M, j0.C, com.meijer.mobile.meijer.activity.find.viewmodel.e0$d, pr.c, d0.V, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, com.meijer.mobile.meijer.activity.find.productdetail.W0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, gi.d, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B0(LocalThemeScope localThemeScope, Modifier modifier, List list, Function2 function2, boolean z10, int i10, int i11, Composer composer, int i12) {
        z0(localThemeScope, modifier, list, function2, z10, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D0(LocalThemeScope localThemeScope, ProductLocationDecorator productLocationDecorator, boolean z10, boolean z11, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        C0(localThemeScope, productLocationDecorator, z10, z11, modifier, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void E0(final Ki.LocalThemeScope r17, final boolean r18, final boolean r19, final boolean r20, final boolean r21, androidx.compose.ui.Modifier r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.K1.E0(Ki.M, boolean, boolean, boolean, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F0(LocalThemeScope localThemeScope, boolean z10, boolean z11, boolean z12, boolean z13, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        E0(localThemeScope, z10, z11, z12, z13, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void G0(final Ki.LocalThemeScope r37, final boolean r38, final boolean r39, final boolean r40, final boolean r41, final bk.AbstractC6392a r42, final vs.ProductPriceDecorator r43, androidx.compose.ui.Modifier r44, androidx.compose.runtime.Composer r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.K1.G0(Ki.M, boolean, boolean, boolean, boolean, bk.a, vs.m, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H0(LocalThemeScope localThemeScope, boolean z10, boolean z11, boolean z12, boolean z13, AbstractC6392a abstractC6392a, ProductPriceDecorator productPriceDecorator, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        G0(localThemeScope, z10, z11, z12, z13, abstractC6392a, productPriceDecorator, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void I0(final Ki.LocalThemeScope r18, final nk.f r19, final java.util.List<Xr.CouponListItemDecorator> r20, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.find.productdetail.X0, kotlin.Unit> r21, final kotlin.jvm.functions.Function1<? super Qk.a, kotlin.Unit> r22, androidx.compose.ui.Modifier r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.K1.I0(Ki.M, nk.f, java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J0(Function1 function1, nk.f fVar, Function1 function12, Qk.a it) {
        Intrinsics.j(it, "it");
        if (it instanceof a.ViewCouponDetails) {
            function1.invoke(new X0.ShowCoupon(fVar, ((a.ViewCouponDetails) it).getCoupon()));
        } else {
            function12.invoke(it);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K0(LocalThemeScope localThemeScope, nk.f fVar, List list, Function1 function1, Function1 function12, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        I0(localThemeScope, fVar, list, function1, function12, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void L0(final l0.C15429A r18, final java.util.List<? extends vs.InterfaceC17723c> r19, boolean r20, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.find.viewmodel.AbstractC12325a, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.K1.L0(l0.A, java.util.List, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final void M(final LocalThemeScope localThemeScope, final ProductComplexPromoDecorator productComplexPromoDecorator, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(2096764774);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(productComplexPromoDecorator) : composerStartRestartGroup.D(productComplexPromoDecorator) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(2096764774, i11, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ComplexPromoComposable (ProductDetailScreen.kt:952)");
            }
            AbstractC6392a formattedText = productComplexPromoDecorator.getFormattedText();
            if (formattedText != null) {
                final String strA = C13698b.a(formattedText, composerStartRestartGroup, AbstractC6392a.f60445b);
                final String strC = C16338g.c(com.meijer.mobile.meijer.Y.f101091o1, composerStartRestartGroup, 0);
                e.c cVarI = P0.e.INSTANCE.i();
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), cVarI, composerStartRestartGroup, 48);
                int iA = C5859f.a(composerStartRestartGroup, 0);
                InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
                Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
                if (composerStartRestartGroup.k() == null) {
                    C5859f.c();
                }
                composerStartRestartGroup.F();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.I(function0A);
                } else {
                    composerStartRestartGroup.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                C14889J c14889j = C14889J.f139620a;
                C18054z0.a(C16335d.c(Cj.i.f4766b1, composerStartRestartGroup, 0), null, androidx.compose.foundation.layout.D.i(companion, H1.h.p(4)), localThemeScope.getAdsColors().getAdsColorSavings().getColor(), composerStartRestartGroup, 432, 0);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zV = composerStartRestartGroup.V(strA) | composerStartRestartGroup.V(strC);
                Object objB = composerStartRestartGroup.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.k1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return K1.N(strA, strC, (r1.u) obj);
                        }
                    };
                    composerStartRestartGroup.t(objB);
                }
                composerStartRestartGroup.P();
                si.j.h(localThemeScope, new q1.Label(C16819m.d(companion, false, (Function1) objB, 1, null), localThemeScope.getAdsColors().getAdsColorSavings(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne(), null, 380, null), strA, null, composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                composerStartRestartGroup.v();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.l1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K1.O(localThemeScope, productComplexPromoDecorator, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M0(C15429A c15429a, List list, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        L0(c15429a, list, z10, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(String str, String str2, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        if (StringsKt.d0(str, "/$", false, 2, null)) {
            r1.s.g0(semantics, StringsKt.O(str, com.medallia.digital.mobilesdk.q2.f93563c, str2, true));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List N0(C15429A c15429a) {
        List<InterfaceC15439i> listV = C5747t.V(c15429a, 50.0f);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listV, 10));
        Iterator<T> it = listV.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((InterfaceC15439i) it.next()).getIndex()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(LocalThemeScope localThemeScope, ProductComplexPromoDecorator productComplexPromoDecorator, int i10, Composer composer, int i11) {
        M(localThemeScope, productComplexPromoDecorator, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void P(final Ki.LocalThemeScope r15, androidx.compose.ui.Modifier r16, final boolean r17, bk.AbstractC6392a r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.K1.P(Ki.M, androidx.compose.ui.Modifier, boolean, bk.a, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P0(C15429A c15429a, List list, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        L0(c15429a, list, z10, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, AbstractC6392a abstractC6392a, int i10, int i11, Composer composer, int i12) {
        P(localThemeScope, modifier, z10, abstractC6392a, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(C12358e0.InterfaceC12364f it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(LocalThemeScope localThemeScope, Modifier modifier, C12358e0.InterfaceC12362d interfaceC12362d, C17993c1 c17993c1, SubscriptionSummaryDecorator subscriptionSummaryDecorator, Function2 function2, Function1 function1, ProductDetailFeatureFlags productDetailFeatureFlags, Function2 function22, Function1 function12, Function3 function3, GoogleAdData googleAdData, Function0 function0, Function1 function13, Function0 function02, Function1 function14, int i10, int i11, int i12, Composer composer, int i13) {
        S(localThemeScope, modifier, interfaceC12362d, c17993c1, subscriptionSummaryDecorator, function2, function1, productDetailFeatureFlags, function22, function12, function3, googleAdData, function0, function13, function02, function14, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:146:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void V(final Ki.LocalThemeScope r25, final com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d r26, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r27, androidx.compose.ui.Modifier r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 1095
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.K1.V(Ki.M, com.meijer.mobile.meijer.activity.find.viewmodel.e0$d, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(Function1 function1) {
        function1.invoke(Boolean.TRUE);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(LocalThemeScope localThemeScope, C12358e0.InterfaceC12362d interfaceC12362d, Function1 function1, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        V(localThemeScope, interfaceC12362d, function1, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e0(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.n0(semantics, C16813g.INSTANCE.b());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(C12358e0.InterfaceC12362d interfaceC12362d, boolean z10) {
        if (z10) {
            interfaceC12362d.I().invoke(new C12358e0.InterfaceC12364f.ShoppingList(new AbstractC15517b.Add(interfaceC12362d.m().getValue().getName())));
        } else {
            interfaceC12362d.I().invoke(new C12358e0.InterfaceC12364f.ShoppingList(new AbstractC15517b.Remove(interfaceC12362d.m().getValue().getName())));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g0(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.n0(semantics, C16813g.INSTANCE.b());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(C12358e0.InterfaceC12362d interfaceC12362d, boolean z10) {
        if (z10) {
            interfaceC12362d.I().invoke(new C12358e0.InterfaceC12364f.FavoritesList(new AbstractC15516a.Add(interfaceC12362d.m().getValue().getName())));
        } else {
            interfaceC12362d.I().invoke(new C12358e0.InterfaceC12364f.FavoritesList(new AbstractC15516a.Remove(interfaceC12362d.m().getValue().getName())));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i0(Function2 function2, C12358e0.InterfaceC12362d interfaceC12362d, ProductImageViewModel image, View view) {
        Intrinsics.j(image, "image");
        Intrinsics.j(view, "view");
        function2.invoke(new X0.ShowImages(image, interfaceC12362d.m().getValue().h(), !interfaceC12362d.o().getValue().booleanValue()), view);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(InterfaceC15783O interfaceC15783O, d0.V v10, InterfaceC5866i0 interfaceC5866i0) {
        C15809k.d(interfaceC15783O, null, null, new g(v10, interfaceC5866i0, null), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k0(C12358e0.InterfaceC12362d interfaceC12362d, Function3 function3, ProductVariantGroupDecorator productVariantGroupDecorator, Context context, int i10, ProductVariantDecorator variant) {
        Intrinsics.j(variant, "variant");
        interfaceC12362d.I().invoke(new C12358e0.InterfaceC12364f.Reload(new n2.Product(variant.getId())));
        function3.invoke(Boolean.TRUE, variant, variant.getTitle());
        Pair pairA = TuplesKt.a("variantType", productVariantGroupDecorator.getName());
        Pair pairA2 = TuplesKt.a("variantName", variant.getTitle());
        AbstractC6392a priceText = variant.getPriceText();
        FS.event("Interacted with variant", MapsKt.o(pairA, pairA2, TuplesKt.a("price", priceText != null ? priceText.b(context) : null)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(Function2 function2, X0 request) {
        Intrinsics.j(request, "request");
        function2.invoke(request, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m0(C12358e0.InterfaceC12362d interfaceC12362d, Qk.a it) {
        Intrinsics.j(it, "it");
        interfaceC12362d.I().invoke(new C12358e0.InterfaceC12364f.Coupon(it));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(InterfaceC5872l0 interfaceC5872l0, LayoutCoordinates it) {
        Intrinsics.j(it, "it");
        o0(interfaceC5872l0, Float.intBitsToFloat((int) (LayoutCoordinatesKt.d(it) & 4294967295L)) >= Float.intBitsToFloat((int) (LayoutCoordinatesKt.f(it) & 4294967295L)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q0(Function2 function2, ProductFullDetails product, String str) {
        Intrinsics.j(product, "product");
        function2.invoke(new X0.ShowProduct(product, str), null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s0(InterfaceC5866i0 interfaceC5866i0, LayoutCoordinates coordinates) {
        Intrinsics.j(coordinates, "coordinates");
        d0(interfaceC5866i0, Float.intBitsToFloat((int) (LayoutCoordinatesKt.e(coordinates) & 4294967295L)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t0(C12358e0.InterfaceC12362d interfaceC12362d, a2 it) {
        Intrinsics.j(it, "it");
        interfaceC12362d.I().invoke(new C12358e0.InterfaceC12364f.ProductReview(it));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u0(Function1 function1, GoogleAdAnalytics googleAdAnalytics) {
        Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
        function1.invoke(googleAdAnalytics);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v0(LocalThemeScope localThemeScope, InterfaceC14882C interfaceC14882C, C12358e0.InterfaceC12362d interfaceC12362d, SubscriptionSummaryDecorator subscriptionSummaryDecorator, d0.V v10, Function2 function2, Function1 function1, ProductDetailFeatureFlags productDetailFeatureFlags, Function2 function22, Function1 function12, Function3 function3, Function0 function0, Modifier modifier, GoogleAdData googleAdData, Function1 function13, Function0 function02, Function1 function14, int i10, int i11, int i12, Composer composer, int i13) {
        c0(localThemeScope, interfaceC14882C, interfaceC12362d, subscriptionSummaryDecorator, v10, function2, function1, productDetailFeatureFlags, function22, function12, function3, function0, modifier, googleAdData, function13, function02, function14, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x0(final Ki.LocalThemeScope r20, final com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailsDecorator r21, final vs.ProductNutritionLabelDecorator r22, androidx.compose.ui.Modifier r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.K1.x0(Ki.M, com.meijer.mobile.meijer.activity.find.viewmodel.h1, vs.l, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y0(LocalThemeScope localThemeScope, ProductDetailsDecorator c12382h1, ProductNutritionLabelDecorator productNutritionLabelDecorator, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        x0(localThemeScope, c12382h1, productNutritionLabelDecorator, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void z0(final Ki.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final java.util.List<com.meijer.mobile.meijer.activity.find.viewmodel.ProductImageViewModel> r19, final kotlin.jvm.functions.Function2<? super com.meijer.mobile.meijer.activity.find.viewmodel.ProductImageViewModel, ? super android.view.View, kotlin.Unit> r20, boolean r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.K1.z0(Ki.M, androidx.compose.ui.Modifier, java.util.List, kotlin.jvm.functions.Function2, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    static {
        List listM = CollectionsKt.m();
        InterfaceC5872l0 interfaceC5872l0E = androidx.compose.runtime.t1.e(Boolean.TRUE, null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E2 = androidx.compose.runtime.t1.e(C12358e0.InterfaceC12359a.b.f109395a, null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E3 = androidx.compose.runtime.t1.e(new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null), null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E4 = androidx.compose.runtime.t1.e(new ProductDetailsDecorator(null, null, null, null, null, null, null, null, null, 0.0d, false, false, false, false, false, false, false, 0.0d, false, 524287, null), null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E5 = androidx.compose.runtime.t1.e(null, null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E6 = androidx.compose.runtime.t1.e(null, null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E7 = androidx.compose.runtime.t1.e(null, null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E8 = androidx.compose.runtime.t1.e(CollectionsKt.m(), null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E9 = androidx.compose.runtime.t1.e(CollectionsKt.m(), null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E10 = androidx.compose.runtime.t1.e(CollectionsKt.m(), null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E11 = androidx.compose.runtime.t1.e(null, null, 2, null);
        Boolean bool = Boolean.FALSE;
        InterfaceC5872l0 interfaceC5872l0E12 = androidx.compose.runtime.t1.e(bool, null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E13 = androidx.compose.runtime.t1.e(bool, null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E14 = androidx.compose.runtime.t1.e(bool, null, 2, null);
        InterfaceC5868j0 interfaceC5868j0A = C5844c1.a(1);
        InterfaceC5872l0 interfaceC5872l0E15 = androidx.compose.runtime.t1.e(bool, null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E16 = androidx.compose.runtime.t1.e(bool, null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E17 = androidx.compose.runtime.t1.e(bool, null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E18 = androidx.compose.runtime.t1.e(bool, null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E19 = androidx.compose.runtime.t1.e(bool, null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E20 = androidx.compose.runtime.t1.e(bool, null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E21 = androidx.compose.runtime.t1.e(bool, null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E22 = androidx.compose.runtime.t1.e(bool, null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E23 = androidx.compose.runtime.t1.e(null, null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E24 = androidx.compose.runtime.t1.e(new ProductCartEntryDecorator(0, 0.0d, 0.0d, 7, null), null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E25 = androidx.compose.runtime.t1.e(null, null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E26 = androidx.compose.runtime.t1.e(new C12328b(null, null, null, null, null, 31, null), null, 2, null);
        com.meijer.mobile.meijer.activity.find.viewmodel.r rVar = com.meijer.mobile.meijer.activity.find.viewmodel.r.f109823c;
        InterfaceC5872l0 interfaceC5872l0E27 = androidx.compose.runtime.t1.e(rVar, null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E28 = androidx.compose.runtime.t1.e(rVar, null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E29 = androidx.compose.runtime.t1.e(MapsKt.k(), null, 2, null);
        f107934a = new C12236c(new Function1() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.Y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return K1.R((C12358e0.InterfaceC12364f) obj);
            }
        }, listM, interfaceC5872l0E, interfaceC5872l0E2, interfaceC5872l0E3, interfaceC5872l0E4, interfaceC5872l0E5, interfaceC5872l0E6, interfaceC5872l0E7, interfaceC5872l0E8, interfaceC5872l0E10, interfaceC5872l0E11, interfaceC5872l0E9, interfaceC5872l0E12, interfaceC5872l0E13, interfaceC5872l0E14, androidx.compose.runtime.t1.e(bool, null, 2, null), interfaceC5868j0A, interfaceC5872l0E15, interfaceC5872l0E16, interfaceC5872l0E17, interfaceC5872l0E18, interfaceC5872l0E19, interfaceC5872l0E20, interfaceC5872l0E21, interfaceC5872l0E22, interfaceC5872l0E23, interfaceC5872l0E24, interfaceC5872l0E25, interfaceC5872l0E26, interfaceC5872l0E27, interfaceC5872l0E28, interfaceC5872l0E29, MapsKt.k(), androidx.compose.runtime.t1.e(MapsKt.k(), null, 2, null));
    }

    private static final List<String> A0(InterfaceC5872l0<List<String>> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean O0(C15429A c15429a) {
        return c15429a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(C12358e0.InterfaceC12362d interfaceC12362d) {
        interfaceC12362d.I().invoke(new C12358e0.InterfaceC12364f.UpdateItem(new AbstractC12245f.Update(nk.k.d(interfaceC12362d.w().getValue(), 1), nk.k.d(interfaceC12362d.w().getValue(), 0))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(C12358e0.InterfaceC12362d interfaceC12362d) {
        interfaceC12362d.I().invoke(new C12358e0.InterfaceC12364f.UpdateItem(new AbstractC12245f.Update(nk.k.d(interfaceC12362d.w().getValue(), 1), nk.k.d(interfaceC12362d.w().getValue(), 0))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(C12358e0.InterfaceC12362d interfaceC12362d, double d10, double d11) {
        interfaceC12362d.I().invoke(new C12358e0.InterfaceC12364f.UpdateItem(new AbstractC12245f.Update(nk.k.c(interfaceC12362d.w().getValue(), d10), nk.k.c(interfaceC12362d.w().getValue(), d11))));
        return Unit.f143329a;
    }

    private static final void d0(InterfaceC5866i0 interfaceC5866i0, float f10) {
        interfaceC5866i0.A(f10);
    }

    private static final boolean n0(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    private static final void o0(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(C12358e0.InterfaceC12362d interfaceC12362d) {
        interfaceC12362d.I().invoke(new C12358e0.InterfaceC12364f.Reload(new n2.FrequentlyBoughtTogether(interfaceC12362d.m().getValue().getId())));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float w0(InterfaceC5866i0 interfaceC5866i0) {
        return interfaceC5866i0.b();
    }
}
