package com.meijer.mobile.meijer.activity.find.productdetail;

import Co.ProductFullDetails;
import Ji.LocalThemeScope;
import P0.e;
import Pk.a;
import Zm.C5546t;
import ak.AbstractC5607a;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5659e;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5702c1;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5724i0;
import androidx.compose.runtime.InterfaceC5726j0;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import bn.ProductVariantDecorator;
import bn.ProductVariantGroupDecorator;
import ck.C6408b;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.meijer.activity.find.productdetail.AbstractC12120f;
import com.meijer.mobile.meijer.activity.find.productdetail.K1;
import com.meijer.mobile.meijer.activity.find.productdetail.X0;
import com.meijer.mobile.meijer.activity.find.productdetail.n2;
import com.meijer.mobile.meijer.activity.find.viewmodel.AbstractC12200a;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12203b;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0;
import com.meijer.mobile.meijer.activity.find.viewmodel.ProductCartEntryDecorator;
import com.meijer.mobile.meijer.activity.find.viewmodel.ProductComplexPromoDecorator;
import com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailsDecorator;
import com.meijer.mobile.meijer.activity.find.viewmodel.ProductImageViewModel;
import dk.C13530b;
import fi.GoogleAdAnalytics;
import fi.GoogleAdData;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14814f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ji.InterfaceC14920X;
import ji.InterfaceC14926b0;
import ji.InterfaceC14934f0;
import ji.Q0;
import ji.q1;
import kk.AbstractC15172a;
import kk.AbstractC15173b;
import kotlin.C17738x;
import kotlin.C17927c1;
import kotlin.C17988z0;
import kotlin.InterfaceC6166e;
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
import l0.C15339A;
import l0.InterfaceC15349i;
import oc.C16015d;
import oc.InterfaceC16016e;
import oc.PagerState;
import p1.C16190d;
import p1.C16193g;
import pr.AbstractC16364a;
import pr.SubscriptionSummaryDecorator;
import qv.C16648k;
import qv.InterfaceC16622O;
import r1.C16699g;
import r1.C16705m;
import tr.C17135b;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import us.C17305C;
import us.C17311f;
import vs.InterfaceC17607c;
import vs.ProductLocationDecorator;
import vs.ProductNutritionLabelDecorator;
import vs.ProductPriceDecorator;

@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u0091\u0002\u0010&\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\t2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u000e2\u001e\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u00182\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\f0\u000e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u001f2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\f0\u000eH\u0001¢\u0006\u0004\b&\u0010'\u001a\u0095\u0002\u0010-\u001a\u00020\f*\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010+\u001a\u00020*2\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\t2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u000e2\u001e\u0010,\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u00182\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\f0\u000e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u001f2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\f0\u000eH\u0001¢\u0006\u0004\b-\u0010.\u001aC\u00105\u001a\u00020\f2\u0006\u00100\u001a\u00020/2\f\u00103\u001a\b\u0012\u0004\u0012\u000202012\b\b\u0002\u00104\u001a\u00020\u00192\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u000eH\u0001¢\u0006\u0004\b5\u00106\u001a[\u0010=\u001a\u00020\f*\u00020\u00002\u0006\u00108\u001a\u0002072\f\u0010:\u001a\b\u0012\u0004\u0012\u000209012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u000e2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b=\u0010>\u001aC\u0010C\u001a\u00020\f*\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u00192\u0006\u0010B\u001a\u00020\u00192\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001fH\u0001¢\u0006\u0004\bC\u0010D\u001a/\u0010H\u001a\u00020\f*\u00020\u00002\u0006\u00108\u001a\u00020E2\b\u0010G\u001a\u0004\u0018\u00010F2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\bH\u0010I\u001aQ\u0010R\u001a\u00020\f*\u00020\u00002\u0006\u0010J\u001a\u00020\u00192\u0006\u0010K\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\u00192\u0006\u0010M\u001a\u00020\u00192\b\u0010O\u001a\u0004\u0018\u00010N2\b\u0010Q\u001a\u0004\u0018\u00010P2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\bR\u0010S\u001a\u001b\u0010V\u001a\u00020\f*\u00020\u00002\u0006\u0010U\u001a\u00020TH\u0003¢\u0006\u0004\bV\u0010W\u001a=\u0010\\\u001a\u00020\f*\u00020\u00002\u0006\u0010X\u001a\u00020\u00192\u0006\u0010Y\u001a\u00020\u00192\u0006\u0010Z\u001a\u00020\u00192\u0006\u0010[\u001a\u00020\u00192\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\\\u0010]\u001a^\u0010e\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010_\u001a\b\u0012\u0004\u0012\u00020^012'\u0010c\u001a#\u0012\u0013\u0012\u00110^¢\u0006\f\b`\u0012\b\ba\u0012\u0004\b\b(b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t2\b\b\u0002\u0010d\u001a\u00020\u0019H\u0003¢\u0006\u0004\be\u0010f\u001aH\u0010i\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032!\u0010h\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b`\u0012\b\ba\u0012\u0004\b\b(g\u0012\u0004\u0012\u00020\f0\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\bi\u0010j\u001a1\u0010m\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010k\u001a\u00020\u00192\n\b\u0002\u0010l\u001a\u0004\u0018\u00010NH\u0001¢\u0006\u0004\bm\u0010n\"\u0014\u0010r\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010q¨\u0006y²\u0006\u000e\u0010s\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010u\u001a\u00020t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00104\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010v\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b018\nX\u008a\u0084\u0002²\u0006\u000e\u0010w\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\b\u001a\u0004\u0018\u00010\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010A\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010B\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010x\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$d;", "viewState", "Lx0/c1;", "scaffoldState", "Lpr/c;", "subscriptionSummary", "Lkotlin/Function2;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/X0;", "Landroid/view/View;", "", "onNavigationRequest", "Lkotlin/Function1;", "", "onRatingRowClicked", "Lcom/meijer/mobile/meijer/activity/find/productdetail/W0;", "featureFlags", "LCo/h;", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "onCarouselEntryUpdate", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/a;", "onCarouselAction", "Lkotlin/Function3;", "", "Lbn/i;", "", "variantSelectedAction", "Lfi/d;", "googleAdData", "Lkotlin/Function0;", "onShowItemLocationBottomSheet", "Lfi/a;", "onGoogleAdClicked", "onShowSubscriptionInfoBottomSheet", "Lpr/a;", "onSubscriptionAction", "S", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$d;Lx0/c1;Lpr/c;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lcom/meijer/mobile/meijer/activity/find/productdetail/W0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lfi/d;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Lj0/C;", "paddingValues", "Ld0/V;", "scrollState", "variantSelectAction", "c0", "(LJi/M;Lj0/C;Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$d;Lpr/c;Ld0/V;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lcom/meijer/mobile/meijer/activity/find/productdetail/W0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lfi/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Ll0/A;", "lazyListState", "", "Lvs/c;", "products", "isCarouselVisible", "L0", "(Ll0/A;Ljava/util/List;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lmk/f;", "product", "LXr/c;", "coupons", "LPk/a;", "onCouponAction", "I0", "(LJi/M;Lmk/f;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lvs/i;", "location", "preventGMOnlyDeliveryEnabled", "shouldShowExpressPickupDescription", "C0", "(LJi/M;Lvs/i;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/h1;", "Lvs/l;", "nutritionLabel", "x0", "(LJi/M;Lcom/meijer/mobile/meijer/activity/find/viewmodel/h1;Lvs/l;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "isOnSale", "isMap", "hasDeposit", "showWeightInfo", "Lak/a;", "priceGoodThroughDate", "Lvs/m;", "price", "G0", "(LJi/M;ZZZZLak/a;Lvs/m;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/w;", "decorator", "M", "(LJi/M;Lcom/meijer/mobile/meijer/activity/find/viewmodel/w;Landroidx/compose/runtime/Composer;I)V", "hasChokingWarning", "hasAlcoholWarning", "hasAgeRestriction", "hasFinalPriceNotification", "E0", "(LJi/M;ZZZZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/l1;", "images", "Lkotlin/ParameterName;", "name", "image", "onImageClick", "isGrayscale", "z0", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/runtime/Composer;II)V", "isExpanded", "onStepperExpanded", "V", "(LJi/M;Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$d;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "isVisible", "text", "P", "(LJi/M;Landroidx/compose/ui/Modifier;ZLak/a;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/find/productdetail/c;", "a", "Lcom/meijer/mobile/meijer/activity/find/productdetail/c;", "MockDataForPreviews", "isStepperExpanded", "", "productReviewsPosition", "imageUrls", "lastAction", "isFromSisterStore", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class K1 {

    /* renamed from: a, reason: collision with root package name */
    private static final C12111c f107078a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC6166e, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f107079a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107080b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f107081c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.K1$a$a, reason: collision with other inner class name */
        static final class C1616a implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f107082a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f107083b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Modifier f107084c;

            C1616a(AbstractC5607a abstractC5607a, LocalThemeScope localThemeScope, Modifier modifier) {
                this.f107082a = abstractC5607a;
                this.f107083b = localThemeScope;
                this.f107084c = modifier;
            }

            public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(176531017, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.LoadingSpinner.<anonymous>.<anonymous>.<anonymous> (ProductDetailScreen.kt:1429)");
                }
                Bi.m.d(this.f107083b, this.f107084c, Assemble.getLoading().getLargeLoading(), Bi.o.f2584a, C6408b.a(this.f107082a, composer, AbstractC5607a.f45514b), null, null, composer, LocalThemeScope.f15770g | 3072 | (q1.k.Large.f140090f << 6), 48);
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

        a(Modifier modifier, LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a) {
            this.f107079a = modifier;
            this.f107080b = localThemeScope;
            this.f107081c = abstractC5607a;
        }

        public final void a(InterfaceC6166e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(1850221716, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.LoadingSpinner.<anonymous> (ProductDetailScreen.kt:1421)");
            }
            Modifier modifierB = androidx.compose.foundation.g.b(androidx.compose.foundation.b.d(T0.a.a(this.f107079a, 1.0f), this.f107080b.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), true, null, 2, null);
            P0.e eVarE = P0.e.INSTANCE.e();
            LocalThemeScope localThemeScope = this.f107080b;
            AbstractC5607a abstractC5607a = this.f107081c;
            Modifier modifier = this.f107079a;
            MeasurePolicy measurePolicyG = C5662h.g(eVarE, false);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierB);
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
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            C5664j c5664j = C5664j.f48612a;
            Ji.Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(176531017, true, new C1616a(abstractC5607a, localThemeScope, modifier), composer, 54), composer, LocalThemeScope.f15770g | 384 | (Q0.b.f139712b << 3));
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6166e interfaceC6166e, Composer composer, Integer num) {
            a(interfaceC6166e, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107085a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C12233e0.InterfaceC12237d f107086b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<X0, View, Unit> f107087c;

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, C12233e0.InterfaceC12237d interfaceC12237d, Function2<? super X0, ? super View, Unit> function2) {
            this.f107085a = localThemeScope;
            this.f107086b = interfaceC12237d;
            this.f107087c = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function2 function2, X0 request) {
            Intrinsics.j(request, "request");
            function2.invoke(request, null);
            return Unit.f142422a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(359573513, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailScreen.<anonymous> (ProductDetailScreen.kt:198)");
            }
            LocalThemeScope localThemeScope = this.f107085a;
            int iA = this.f107086b.getCartItemCount().a();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f107087c);
            final Function2<X0, View, Unit> function2 = this.f107087c;
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
            X1.c(localThemeScope, iA, (Function1) objB, composer, LocalThemeScope.f15770g);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C12233e0.InterfaceC12237d f107088a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107089b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f107090c;

        c(C12233e0.InterfaceC12237d interfaceC12237d, LocalThemeScope localThemeScope, InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f107088a = interfaceC12237d;
            this.f107089b = localThemeScope;
            this.f107090c = interfaceC5730l0;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(128310794, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailScreen.<anonymous> (ProductDetailScreen.kt:204)");
            }
            if (!Intrinsics.e(this.f107088a.G().getValue(), C12233e0.InterfaceC12234a.b.f108537a)) {
                LocalThemeScope localThemeScope = this.f107089b;
                C12233e0.InterfaceC12237d interfaceC12237d = this.f107088a;
                composer.startReplaceGroup(5004770);
                final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f107090c;
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.M1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return K1.c.c(interfaceC5730l0, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                K1.V(localThemeScope, interfaceC12237d, (Function1) objB, androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.J.D(Modifier.INSTANCE, null, false, 3, null), 0.0f, 1, null), composer, LocalThemeScope.f15770g | 3456, 0);
            }
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
        public static final Unit c(InterfaceC5730l0 interfaceC5730l0, boolean z10) {
            K1.T(interfaceC5730l0, z10);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f107091a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0.V f107092b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107093c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C12233e0.InterfaceC12237d f107094d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ SubscriptionSummaryDecorator f107095e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<X0, View, Unit> f107096f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f107097g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ProductDetailFeatureFlags f107098h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> f107099i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC12200a, Unit> f107100j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function3<Boolean, ProductVariantDecorator, String, Unit> f107101k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f107102l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ GoogleAdData f107103m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1<GoogleAdAnalytics, Unit> f107104n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f107105o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC16364a, Unit> f107106p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements PointerInputEventHandler {

            /* renamed from: a, reason: collision with root package name */
            public static final a f107107a = new a();

            a() {
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(g1.J j10, Continuation<? super Unit> continuation) {
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(Modifier modifier, d0.V v10, LocalThemeScope localThemeScope, C12233e0.InterfaceC12237d interfaceC12237d, SubscriptionSummaryDecorator subscriptionSummaryDecorator, Function2<? super X0, ? super View, Unit> function2, Function1<? super Integer, Unit> function1, ProductDetailFeatureFlags productDetailFeatureFlags, Function2<? super ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, Unit> function22, Function1<? super AbstractC12200a, Unit> function12, Function3<? super Boolean, ? super ProductVariantDecorator, ? super String, Unit> function3, Function0<Unit> function0, GoogleAdData googleAdData, Function1<? super GoogleAdAnalytics, Unit> function13, Function0<Unit> function02, Function1<? super AbstractC16364a, Unit> function14) {
            this.f107091a = modifier;
            this.f107092b = v10;
            this.f107093c = localThemeScope;
            this.f107094d = interfaceC12237d;
            this.f107095e = subscriptionSummaryDecorator;
            this.f107096f = function2;
            this.f107097g = function1;
            this.f107098h = productDetailFeatureFlags;
            this.f107099i = function22;
            this.f107100j = function12;
            this.f107101k = function3;
            this.f107102l = function0;
            this.f107103m = googleAdData;
            this.f107104n = function13;
            this.f107105o = function02;
            this.f107106p = function14;
        }

        public final void a(InterfaceC14794C paddingValues, Composer composer, int i10) {
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
            Modifier modifierF = androidx.compose.foundation.layout.J.f(d0.T.g(this.f107091a, this.f107092b, false, null, false, 14, null), 0.0f, 1, null);
            int i12 = i11;
            LocalThemeScope localThemeScope = this.f107093c;
            C12233e0.InterfaceC12237d interfaceC12237d = this.f107094d;
            SubscriptionSummaryDecorator subscriptionSummaryDecorator = this.f107095e;
            d0.V v10 = this.f107092b;
            Function2<X0, View, Unit> function2 = this.f107096f;
            Function1<Integer, Unit> function1 = this.f107097g;
            ProductDetailFeatureFlags productDetailFeatureFlags = this.f107098h;
            Function2<ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> function22 = this.f107099i;
            Function1<AbstractC12200a, Unit> function12 = this.f107100j;
            Function3<Boolean, ProductVariantDecorator, String, Unit> function3 = this.f107101k;
            Function0<Unit> function0 = this.f107102l;
            GoogleAdData googleAdData = this.f107103m;
            Function1<GoogleAdAnalytics, Unit> function13 = this.f107104n;
            Function0<Unit> function02 = this.f107105o;
            Function1<AbstractC16364a, Unit> function14 = this.f107106p;
            int i13 = LocalThemeScope.f15770g;
            K1.c0(localThemeScope, paddingValues, interfaceC12237d, subscriptionSummaryDecorator, v10, function2, function1, productDetailFeatureFlags, function22, function12, function3, function0, modifierF, googleAdData, function13, function02, function14, composer, i13 | ((i12 << 3) & 112) | (SubscriptionSummaryDecorator.f156299e << 9), GoogleAdData.f131149f << 9, 0);
            LocalThemeScope localThemeScope2 = this.f107093c;
            Modifier modifierF2 = androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null);
            Unit unit = Unit.f142422a;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = a.f107107a;
                composer.t(objB);
            }
            composer.P();
            K1.P(localThemeScope2, g1.U.c(modifierF2, unit, (PointerInputEventHandler) objB), this.f107094d.y().getValue().booleanValue(), AbstractC5607a.INSTANCE.a(), composer, i13 | (AbstractC5607a.f45514b << 9), 0);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC14814f f107108a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f107109b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107110c;

        e(InterfaceC14814f interfaceC14814f, Modifier modifier, LocalThemeScope localThemeScope) {
            this.f107108a = interfaceC14814f;
            this.f107109b = modifier;
            this.f107110c = localThemeScope;
        }

        public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(2078475354, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailsBottomActionBar.<anonymous>.<anonymous>.<anonymous> (ProductDetailScreen.kt:1128)");
            }
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Bi.o oVar = Bi.o.f2584a;
            Bi.m.d(this.f107110c, this.f107108a.c(this.f107109b, P0.e.INSTANCE.g()), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f15770g | 3072 | (q1.k.Large.f140090f << 6), 56);
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
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107111a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C12233e0.InterfaceC12237d f107112b;

        f(LocalThemeScope localThemeScope, C12233e0.InterfaceC12237d interfaceC12237d) {
            this.f107111a = localThemeScope;
            this.f107112b = interfaceC12237d;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1727392293, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductDetailScreen.kt:350)");
            }
            ri.j.h(this.f107111a, new q1.Label(null, null, null, null, 0, false, 0, this.f107111a.getAdsTypography().getHeadings().getSeven(), null, 383, null), C6408b.a(this.f107112b.m().getValue().getTitle(), composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailScreenKt$ProductDetailsContent$1$1$3$2$1$1", f = "ProductDetailScreen.kt", l = {372}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107113a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0.V f107114b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5724i0 f107115c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new g(this.f107114b, this.f107115c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(d0.V v10, InterfaceC5724i0 interfaceC5724i0, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f107114b = v10;
            this.f107115c = interfaceC5724i0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f107113a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                d0.V v10 = this.f107114b;
                int iD = MathKt.d(K1.w0(this.f107115c));
                this.f107113a = 1;
                if (d0.V.l(v10, iD, null, this, 2, null) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class h implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProductDetailsDecorator f107116a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107117b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f107118a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ProductDetailsDecorator f107119b;

            a(LocalThemeScope localThemeScope, ProductDetailsDecorator c12257h1) {
                this.f107118a = localThemeScope;
                this.f107119b = c12257h1;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(136065657, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductExpandableDetails.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductDetailScreen.kt:793)");
                }
                LocalThemeScope localThemeScope = this.f107118a;
                ri.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne(), null, 382, null), C6408b.a(AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99695Mc, this.f107119b.getId().getCode()), composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        h(ProductDetailsDecorator c12257h1, LocalThemeScope localThemeScope) {
            this.f107116a = c12257h1;
            this.f107117b = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2039741408, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductExpandableDetails.<anonymous>.<anonymous> (ProductDetailScreen.kt:779)");
            }
            ProductDetailsDecorator c12257h1 = this.f107116a;
            LocalThemeScope localThemeScope = this.f107117b;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            AbstractC5607a abstractC5607aA = c12257h1.getDescription();
            composer.startReplaceGroup(-1399811821);
            if (abstractC5607aA != null) {
                ri.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne(), null, 382, null), C6408b.a(abstractC5607aA, composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
            }
            composer.P();
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(8)), composer, 6);
            C17738x.a(null, ComposableLambdaKt.c(136065657, true, new a(localThemeScope, c12257h1), composer, 54), composer, 48, 1);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107120a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f107121b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f107122a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f107123b;

            a(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a) {
                this.f107122a = localThemeScope;
                this.f107123b = abstractC5607a;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(978380475, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductExpandableDetails.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductDetailScreen.kt:813)");
                }
                LocalThemeScope localThemeScope = this.f107122a;
                ri.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne(), null, 382, null), C6408b.a(this.f107123b, composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        i(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a) {
            this.f107120a = localThemeScope;
            this.f107121b = abstractC5607a;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1949430696, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductExpandableDetails.<anonymous>.<anonymous>.<anonymous> (ProductDetailScreen.kt:812)");
            }
            C17738x.a(null, ComposableLambdaKt.c(978380475, true, new a(this.f107120a, this.f107121b), composer, 54), composer, 48, 1);
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
    static final class j implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107124a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProductNutritionLabelDecorator f107125b;

        j(LocalThemeScope localThemeScope, ProductNutritionLabelDecorator productNutritionLabelDecorator) {
            this.f107124a = localThemeScope;
            this.f107125b = productNutritionLabelDecorator;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1862718874, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductExpandableDetails.<anonymous>.<anonymous>.<anonymous> (ProductDetailScreen.kt:827)");
            }
            C17311f.j(this.f107124a, this.f107125b, androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), composer, LocalThemeScope.f15770g | 384 | (ProductNutritionLabelDecorator.f165063b << 3), 0);
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
    static final class k implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107126a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f107127b;

        k(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a) {
            this.f107126a = localThemeScope;
            this.f107127b = abstractC5607a;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1435643424, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductExpandableDetails.<anonymous>.<anonymous>.<anonymous> (ProductDetailScreen.kt:837)");
            }
            LocalThemeScope localThemeScope = this.f107126a;
            ri.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne(), null, 382, null), C6408b.a(this.f107127b, composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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
    @SourceDebugExtension
    static final class l implements Function3<InterfaceC14934f0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107128a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f107129b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<ProductImageViewModel> f107130c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ PagerState f107131d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<ProductImageViewModel, View, Unit> f107132e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f107133f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f107134g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function4<InterfaceC16016e, Integer, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<ProductImageViewModel> f107135a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14814f f107136b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2<ProductImageViewModel, View, Unit> f107137c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ View f107138d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f107139e;

            /* JADX WARN: Multi-variable type inference failed */
            a(List<ProductImageViewModel> list, InterfaceC14814f interfaceC14814f, Function2<? super ProductImageViewModel, ? super View, Unit> function2, View view, boolean z10) {
                this.f107135a = list;
                this.f107136b = interfaceC14814f;
                this.f107137c = function2;
                this.f107138d = view;
                this.f107139e = z10;
            }

            public final void b(InterfaceC16016e AdsHorizontalPager, int i10, Composer composer, int i11) throws Resources.NotFoundException {
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
                final ProductImageViewModel productImageViewModel = this.f107135a.get(i10);
                String strD = C16193g.d(com.meijer.mobile.meijer.Y.f99814Sh, new Object[]{Integer.valueOf(i10 + 1), Integer.valueOf(this.f107135a.size())}, composer, 0);
                String strC = productImageViewModel.c();
                String strF = productImageViewModel.f();
                InterfaceC5784k interfaceC5784kE = InterfaceC5784k.INSTANCE.e();
                InterfaceC14814f interfaceC14814f = this.f107136b;
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1746271574);
                boolean zV = composer.V(this.f107137c) | composer.D(productImageViewModel) | composer.D(this.f107138d);
                final Function2<ProductImageViewModel, View, Unit> function2 = this.f107137c;
                final View view = this.f107138d;
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
                C13530b.b(interfaceC14814f.c(C5659e.b(androidx.compose.foundation.layout.J.F(androidx.compose.foundation.layout.D.k(ClickableKt.d(companion, false, null, null, (Function0) objB, 7, null), H1.h.p(64), 0.0f, 2, null), null, false, 1, null), 1.0f, false, 2, null), P0.e.INSTANCE.g()), strC, strD, strF, interfaceC5784kE, this.f107139e, null, null, 0.0f, composer, 24576, 448);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC16016e interfaceC16016e, Integer num, Composer composer, Integer num2) throws Resources.NotFoundException {
                b(interfaceC16016e, num.intValue(), composer, num2.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function2 function2, ProductImageViewModel productImageViewModel, View view) {
                function2.invoke(productImageViewModel, view);
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        l(LocalThemeScope localThemeScope, Modifier modifier, List<ProductImageViewModel> list, PagerState pagerState, Function2<? super ProductImageViewModel, ? super View, Unit> function2, View view, boolean z10) {
            this.f107128a = localThemeScope;
            this.f107129b = modifier;
            this.f107130c = list;
            this.f107131d = pagerState;
            this.f107132e = function2;
            this.f107133f = view;
            this.f107134g = z10;
        }

        public final void a(InterfaceC14934f0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(768276635, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductImagesView.<anonymous>.<anonymous> (ProductDetailScreen.kt:1064)");
            }
            e.b bVarG = P0.e.INSTANCE.g();
            LocalThemeScope localThemeScope = this.f107128a;
            Modifier modifier = this.f107129b;
            List<ProductImageViewModel> list = this.f107130c;
            PagerState pagerState = this.f107131d;
            Function2<ProductImageViewModel, View, Unit> function2 = this.f107132e;
            View view = this.f107133f;
            boolean z10 = this.f107134g;
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
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            ui.g.e(localThemeScope, modifier, new q1.HorizontalPagerTemplate(null, false, 0.0f, null, null, null, null, l3.f92485d, null), list.size(), pagerState, ComposableLambdaKt.c(-1211861319, true, new a(list, C14815g.f139108a, function2, view, z10), composer, 54), composer, 196608 | LocalThemeScope.f15770g | (q1.HorizontalPagerTemplate.f140051h << 6));
            C16015d.a(pagerState, null, list.size(), null, localThemeScope.getAdsColors().getAdsColorActive01().getColor(), localThemeScope.getAdsColors().getAdsColorUIBorder02().getColor(), 0.0f, 0.0f, H1.h.p(12), null, composer, 100663296, 714);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14934f0 interfaceC14934f0, Composer composer, Integer num) {
            a(interfaceC14934f0, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class m implements Function3<InterfaceC14926b0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107140a;

        m(LocalThemeScope localThemeScope) {
            this.f107140a = localThemeScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            return Unit.f142422a;
        }

        public final void b(InterfaceC14926b0 Assemble, Composer composer, int i10) {
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
            q1.m.Inline inlineY = q1.m.Inline.y(warning, C16705m.c(modifier, true, (Function1) objB), null, null, null, null, null, null, 126, null);
            String strC = C16193g.c(C17135b.f161976H, composer, 0);
            Ci.j.i(this.f107140a, null, C16193g.c(C17135b.f161974G, composer, 0), strC, inlineY, null, composer, LocalThemeScope.f15770g | (q1.m.Inline.f140121h << 12), 17);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14926b0 interfaceC14926b0, Composer composer, Integer num) {
            b(interfaceC14926b0, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class n implements Function3<InterfaceC14926b0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f107141a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107142b;

        n(boolean z10, LocalThemeScope localThemeScope) {
            this.f107141a = z10;
            this.f107142b = localThemeScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            return Unit.f142422a;
        }

        public final void b(InterfaceC14926b0 Assemble, Composer composer, int i10) {
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
            q1.m.Inline inlineY = q1.m.Inline.y(informational, C16705m.c(modifier, true, (Function1) objB), null, null, null, null, null, null, 126, null);
            Ci.j.i(this.f107142b, null, C16193g.c(this.f107141a ? C17305C.f163329d : C17305C.f163328c, composer, 0), C16193g.c(C17305C.f163330e, composer, 0), inlineY, null, composer, LocalThemeScope.f15770g | (q1.m.Inline.f140121h << 12), 17);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14926b0 interfaceC14926b0, Composer composer, Integer num) {
            b(interfaceC14926b0, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class o implements Function3<InterfaceC14926b0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107143a;

        o(LocalThemeScope localThemeScope) {
            this.f107143a = localThemeScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            return Unit.f142422a;
        }

        public final void b(InterfaceC14926b0 Assemble, Composer composer, int i10) {
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
            q1.m.Inline inlineY = q1.m.Inline.y(informational, C16705m.c(modifier, true, (Function1) objB), null, null, null, null, null, null, 126, null);
            Ci.j.i(this.f107143a, null, C16193g.c(com.meijer.mobile.meijer.Y.f99852Uh, composer, 0), null, inlineY, null, composer, LocalThemeScope.f15770g | (q1.m.Inline.f140121h << 12), 21);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14926b0 interfaceC14926b0, Composer composer, Integer num) {
            b(interfaceC14926b0, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailScreenKt$SendCarouselItemOnViewBeacon$4$1", f = "ProductDetailScreen.kt", l = {611}, m = "invokeSuspend")
    static final class p extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107144a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z1<List<Integer>> f107145b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f107146c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<InterfaceC17607c> f107147d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC12200a, Unit> f107148e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f107149a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<InterfaceC17607c> f107150b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.z1<List<Integer>> f107151c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC12200a, Unit> f107152d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailScreenKt$SendCarouselItemOnViewBeacon$4$1$2", f = "ProductDetailScreen.kt", l = {622}, m = "emit")
            /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.K1$p$a$a, reason: collision with other inner class name */
            static final class C1617a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                Object f107153a;

                /* renamed from: b, reason: collision with root package name */
                Object f107154b;

                /* renamed from: c, reason: collision with root package name */
                Object f107155c;

                /* renamed from: d, reason: collision with root package name */
                Object f107156d;

                /* renamed from: e, reason: collision with root package name */
                Object f107157e;

                /* renamed from: f, reason: collision with root package name */
                Object f107158f;

                /* renamed from: g, reason: collision with root package name */
                Object f107159g;

                /* renamed from: h, reason: collision with root package name */
                Object f107160h;

                /* renamed from: i, reason: collision with root package name */
                Object f107161i;

                /* renamed from: j, reason: collision with root package name */
                Object f107162j;

                /* renamed from: k, reason: collision with root package name */
                int f107163k;

                /* renamed from: l, reason: collision with root package name */
                int f107164l;

                /* renamed from: m, reason: collision with root package name */
                int f107165m;

                /* renamed from: n, reason: collision with root package name */
                int f107166n;

                /* renamed from: o, reason: collision with root package name */
                /* synthetic */ Object f107167o;

                /* renamed from: p, reason: collision with root package name */
                final /* synthetic */ a<T> f107168p;

                /* renamed from: q, reason: collision with root package name */
                int f107169q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1617a(a<? super T> aVar, Continuation<? super C1617a> continuation) {
                    super(continuation);
                    this.f107168p = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f107167o = obj;
                    this.f107169q |= Integer.MIN_VALUE;
                    return this.f107168p.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(boolean z10, List<? extends InterfaceC17607c> list, androidx.compose.runtime.z1<? extends List<Integer>> z1Var, Function1<? super AbstractC12200a, Unit> function1) {
                this.f107149a = z10;
                this.f107150b = list;
                this.f107151c = z1Var;
                this.f107152d = function1;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0100  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ef -> B:30:0x00f0). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x010e -> B:36:0x0113). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0111 -> B:36:0x0113). Please report as a decompilation issue!!! */
            @Override // tv.InterfaceC17153g
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
        p(androidx.compose.runtime.z1<? extends List<Integer>> z1Var, boolean z10, List<? extends InterfaceC17607c> list, Function1<? super AbstractC12200a, Unit> function1, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f107145b = z1Var;
            this.f107146c = z10;
            this.f107147d = list;
            this.f107148e = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new p(this.f107145b, this.f107146c, this.f107147d, this.f107148e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((p) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List g(androidx.compose.runtime.z1 z1Var) {
            return (List) z1Var.getValue();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f107144a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final androidx.compose.runtime.z1<List<Integer>> z1Var = this.f107145b;
                InterfaceC17152f interfaceC17152fQ = androidx.compose.runtime.o1.q(new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.R1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return K1.p.g(z1Var);
                    }
                });
                a aVar = new a(this.f107146c, this.f107147d, this.f107145b, this.f107148e);
                this.f107144a = 1;
                if (interfaceC17152fQ.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailScreenKt$SendCarouselItemOnViewBeacon$5$1", f = "ProductDetailScreen.kt", l = {637}, m = "invokeSuspend")
    static final class q extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107170a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z1<Boolean> f107171b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z1<List<Integer>> f107172c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f107173d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC12200a, Unit> f107174e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<InterfaceC17607c> f107175f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f107176a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC12200a, Unit> f107177b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<InterfaceC17607c> f107178c;

            /* JADX WARN: Multi-variable type inference failed */
            a(boolean z10, Function1<? super AbstractC12200a, Unit> function1, List<? extends InterfaceC17607c> list) {
                this.f107176a = z10;
                this.f107177b = function1;
                this.f107178c = list;
            }

            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<Integer> list, Continuation<? super Unit> continuation) {
                if (this.f107176a) {
                    ArrayList arrayList = new ArrayList();
                    List<InterfaceC17607c> list2 = this.f107178c;
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        if (iIntValue < list2.size()) {
                            InterfaceC17607c interfaceC17607c = list2.get(iIntValue);
                            if (interfaceC17607c.getProduct().F()) {
                                arrayList.add(interfaceC17607c.getProduct());
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        this.f107177b.invoke(new AbstractC12200a.NewItemScrolling(arrayList));
                    }
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(androidx.compose.runtime.z1<Boolean> z1Var, androidx.compose.runtime.z1<? extends List<Integer>> z1Var2, boolean z10, Function1<? super AbstractC12200a, Unit> function1, List<? extends InterfaceC17607c> list, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f107171b = z1Var;
            this.f107172c = z1Var2;
            this.f107173d = z10;
            this.f107174e = function1;
            this.f107175f = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new q(this.f107171b, this.f107172c, this.f107173d, this.f107174e, this.f107175f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List g(androidx.compose.runtime.z1 z1Var) {
            return (List) z1Var.getValue();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f107170a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                if (this.f107171b.getValue().booleanValue()) {
                    final androidx.compose.runtime.z1<List<Integer>> z1Var = this.f107172c;
                    InterfaceC17152f interfaceC17152fQ = androidx.compose.runtime.o1.q(new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.S1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K1.q.g(z1Var);
                        }
                    });
                    a aVar = new a(this.f107173d, this.f107174e, this.f107175f);
                    this.f107170a = 1;
                    if (interfaceC17152fQ.collect(aVar, this) == objF) {
                        return objF;
                    }
                }
            }
            return Unit.f142422a;
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
    public static final void C0(final Ji.LocalThemeScope r35, final vs.ProductLocationDecorator r36, final boolean r37, final boolean r38, androidx.compose.ui.Modifier r39, final kotlin.jvm.functions.Function0<kotlin.Unit> r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 1589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.K1.C0(Ji.M, vs.i, boolean, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
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
    public static final void S(final Ji.LocalThemeScope r33, androidx.compose.ui.Modifier r34, final com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d r35, kotlin.C17927c1 r36, pr.SubscriptionSummaryDecorator r37, final kotlin.jvm.functions.Function2<? super com.meijer.mobile.meijer.activity.find.productdetail.X0, ? super android.view.View, kotlin.Unit> r38, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r39, final com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailFeatureFlags r40, final kotlin.jvm.functions.Function2<? super Co.ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, kotlin.Unit> r41, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.find.viewmodel.AbstractC12200a, kotlin.Unit> r42, final kotlin.jvm.functions.Function3<? super java.lang.Boolean, ? super bn.ProductVariantDecorator, ? super java.lang.String, kotlin.Unit> r43, fi.GoogleAdData r44, final kotlin.jvm.functions.Function0<kotlin.Unit> r45, final kotlin.jvm.functions.Function1<? super fi.GoogleAdAnalytics, kotlin.Unit> r46, final kotlin.jvm.functions.Function0<kotlin.Unit> r47, final kotlin.jvm.functions.Function1<? super pr.AbstractC16364a, kotlin.Unit> r48, androidx.compose.runtime.Composer r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.K1.S(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.find.viewmodel.e0$d, x0.c1, pr.c, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, com.meijer.mobile.meijer.activity.find.productdetail.W0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3, fi.d, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
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
    public static final void c0(final Ji.LocalThemeScope r73, final j0.InterfaceC14794C r74, final com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d r75, final pr.SubscriptionSummaryDecorator r76, final d0.V r77, final kotlin.jvm.functions.Function2<? super com.meijer.mobile.meijer.activity.find.productdetail.X0, ? super android.view.View, kotlin.Unit> r78, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r79, final com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailFeatureFlags r80, final kotlin.jvm.functions.Function2<? super Co.ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, kotlin.Unit> r81, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.find.viewmodel.AbstractC12200a, kotlin.Unit> r82, final kotlin.jvm.functions.Function3<? super java.lang.Boolean, ? super bn.ProductVariantDecorator, ? super java.lang.String, kotlin.Unit> r83, final kotlin.jvm.functions.Function0<kotlin.Unit> r84, androidx.compose.ui.Modifier r85, fi.GoogleAdData r86, kotlin.jvm.functions.Function1<? super fi.GoogleAdAnalytics, kotlin.Unit> r87, final kotlin.jvm.functions.Function0<kotlin.Unit> r88, final kotlin.jvm.functions.Function1<? super pr.AbstractC16364a, kotlin.Unit> r89, androidx.compose.runtime.Composer r90, final int r91, final int r92, final int r93) {
        /*
            Method dump skipped, instructions count: 3863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.K1.c0(Ji.M, j0.C, com.meijer.mobile.meijer.activity.find.viewmodel.e0$d, pr.c, d0.V, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, com.meijer.mobile.meijer.activity.find.productdetail.W0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, fi.d, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B0(LocalThemeScope localThemeScope, Modifier modifier, List list, Function2 function2, boolean z10, int i10, int i11, Composer composer, int i12) {
        z0(localThemeScope, modifier, list, function2, z10, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D0(LocalThemeScope localThemeScope, ProductLocationDecorator productLocationDecorator, boolean z10, boolean z11, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        C0(localThemeScope, productLocationDecorator, z10, z11, modifier, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    private static final void E0(final Ji.LocalThemeScope r17, final boolean r18, final boolean r19, final boolean r20, final boolean r21, androidx.compose.ui.Modifier r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.K1.E0(Ji.M, boolean, boolean, boolean, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F0(LocalThemeScope localThemeScope, boolean z10, boolean z11, boolean z12, boolean z13, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        E0(localThemeScope, z10, z11, z12, z13, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    private static final void G0(final Ji.LocalThemeScope r37, final boolean r38, final boolean r39, final boolean r40, final boolean r41, final ak.AbstractC5607a r42, final vs.ProductPriceDecorator r43, androidx.compose.ui.Modifier r44, androidx.compose.runtime.Composer r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.K1.G0(Ji.M, boolean, boolean, boolean, boolean, ak.a, vs.m, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H0(LocalThemeScope localThemeScope, boolean z10, boolean z11, boolean z12, boolean z13, AbstractC5607a abstractC5607a, ProductPriceDecorator productPriceDecorator, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        G0(localThemeScope, z10, z11, z12, z13, abstractC5607a, productPriceDecorator, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    private static final void I0(final Ji.LocalThemeScope r18, final mk.f r19, final java.util.List<Xr.CouponListItemDecorator> r20, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.find.productdetail.X0, kotlin.Unit> r21, final kotlin.jvm.functions.Function1<? super Pk.a, kotlin.Unit> r22, androidx.compose.ui.Modifier r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.K1.I0(Ji.M, mk.f, java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J0(Function1 function1, mk.f fVar, Function1 function12, Pk.a it) {
        Intrinsics.j(it, "it");
        if (it instanceof a.ViewCouponDetails) {
            function1.invoke(new X0.ShowCoupon(fVar, ((a.ViewCouponDetails) it).getCoupon()));
        } else {
            function12.invoke(it);
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K0(LocalThemeScope localThemeScope, mk.f fVar, List list, Function1 function1, Function1 function12, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        I0(localThemeScope, fVar, list, function1, function12, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    public static final void L0(final l0.C15339A r18, final java.util.List<? extends vs.InterfaceC17607c> r19, boolean r20, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.find.viewmodel.AbstractC12200a, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
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
            AbstractC5607a formattedText = productComplexPromoDecorator.getFormattedText();
            if (formattedText != null) {
                final String strA = C6408b.a(formattedText, composerStartRestartGroup, AbstractC5607a.f45514b);
                final String strC = C16193g.c(com.meijer.mobile.meijer.Y.f100229o1, composerStartRestartGroup, 0);
                e.c cVarI = P0.e.INSTANCE.i();
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), cVarI, composerStartRestartGroup, 48);
                int iA = C5717f.a(composerStartRestartGroup, 0);
                InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
                Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composerStartRestartGroup.k() == null) {
                    C5717f.c();
                }
                composerStartRestartGroup.F();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.I(function0A);
                } else {
                    composerStartRestartGroup.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                C14801J c14801j = C14801J.f139030a;
                C17988z0.a(C16190d.c(Bj.i.f2721b1, composerStartRestartGroup, 0), null, androidx.compose.foundation.layout.D.i(companion, H1.h.p(4)), localThemeScope.getAdsColors().getAdsColorSavings().getColor(), composerStartRestartGroup, 432, 0);
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
                ri.j.h(localThemeScope, new q1.Label(C16705m.d(companion, false, (Function1) objB, 1, null), localThemeScope.getAdsColors().getAdsColorSavings(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne(), null, 380, null), strA, null, composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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
    public static final Unit M0(C15339A c15339a, List list, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        L0(c15339a, list, z10, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(String str, String str2, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        if (StringsKt.c0(str, "/$", false, 2, null)) {
            r1.s.g0(semantics, StringsKt.O(str, com.medallia.digital.mobilesdk.q2.f92724c, str2, true));
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List N0(C15339A c15339a) {
        List<InterfaceC15349i> listV = C5546t.V(c15339a, 50.0f);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listV, 10));
        Iterator<T> it = listV.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((InterfaceC15349i) it.next()).getIndex()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(LocalThemeScope localThemeScope, ProductComplexPromoDecorator productComplexPromoDecorator, int i10, Composer composer, int i11) {
        M(localThemeScope, productComplexPromoDecorator, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
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
    public static final void P(final Ji.LocalThemeScope r15, androidx.compose.ui.Modifier r16, final boolean r17, ak.AbstractC5607a r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.K1.P(Ji.M, androidx.compose.ui.Modifier, boolean, ak.a, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P0(C15339A c15339a, List list, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        L0(c15339a, list, z10, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, AbstractC5607a abstractC5607a, int i10, int i11, Composer composer, int i12) {
        P(localThemeScope, modifier, z10, abstractC5607a, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(C12233e0.InterfaceC12239f it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(LocalThemeScope localThemeScope, Modifier modifier, C12233e0.InterfaceC12237d interfaceC12237d, C17927c1 c17927c1, SubscriptionSummaryDecorator subscriptionSummaryDecorator, Function2 function2, Function1 function1, ProductDetailFeatureFlags productDetailFeatureFlags, Function2 function22, Function1 function12, Function3 function3, GoogleAdData googleAdData, Function0 function0, Function1 function13, Function0 function02, Function1 function14, int i10, int i11, int i12, Composer composer, int i13) {
        S(localThemeScope, modifier, interfaceC12237d, c17927c1, subscriptionSummaryDecorator, function2, function1, productDetailFeatureFlags, function22, function12, function3, googleAdData, function0, function13, function02, function14, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f142422a;
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
    public static final void V(final Ji.LocalThemeScope r25, final com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d r26, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r27, androidx.compose.ui.Modifier r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 1095
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.K1.V(Ji.M, com.meijer.mobile.meijer.activity.find.viewmodel.e0$d, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(Function1 function1) {
        function1.invoke(Boolean.TRUE);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(LocalThemeScope localThemeScope, C12233e0.InterfaceC12237d interfaceC12237d, Function1 function1, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        V(localThemeScope, interfaceC12237d, function1, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e0(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.n0(semantics, C16699g.INSTANCE.b());
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(C12233e0.InterfaceC12237d interfaceC12237d, boolean z10) {
        if (z10) {
            interfaceC12237d.I().invoke(new C12233e0.InterfaceC12239f.ShoppingList(new AbstractC15173b.Add(interfaceC12237d.m().getValue().getName())));
        } else {
            interfaceC12237d.I().invoke(new C12233e0.InterfaceC12239f.ShoppingList(new AbstractC15173b.Remove(interfaceC12237d.m().getValue().getName())));
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g0(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.n0(semantics, C16699g.INSTANCE.b());
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(C12233e0.InterfaceC12237d interfaceC12237d, boolean z10) {
        if (z10) {
            interfaceC12237d.I().invoke(new C12233e0.InterfaceC12239f.FavoritesList(new AbstractC15172a.Add(interfaceC12237d.m().getValue().getName())));
        } else {
            interfaceC12237d.I().invoke(new C12233e0.InterfaceC12239f.FavoritesList(new AbstractC15172a.Remove(interfaceC12237d.m().getValue().getName())));
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i0(Function2 function2, C12233e0.InterfaceC12237d interfaceC12237d, ProductImageViewModel image, View view) {
        Intrinsics.j(image, "image");
        Intrinsics.j(view, "view");
        function2.invoke(new X0.ShowImages(image, interfaceC12237d.m().getValue().h(), !interfaceC12237d.o().getValue().booleanValue()), view);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(InterfaceC16622O interfaceC16622O, d0.V v10, InterfaceC5724i0 interfaceC5724i0) {
        C16648k.d(interfaceC16622O, null, null, new g(v10, interfaceC5724i0, null), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k0(C12233e0.InterfaceC12237d interfaceC12237d, Function3 function3, ProductVariantGroupDecorator productVariantGroupDecorator, Context context, int i10, ProductVariantDecorator variant) {
        Intrinsics.j(variant, "variant");
        interfaceC12237d.I().invoke(new C12233e0.InterfaceC12239f.Reload(new n2.Product(variant.getId())));
        function3.invoke(Boolean.TRUE, variant, variant.getTitle());
        Pair pairA = TuplesKt.a("variantType", productVariantGroupDecorator.getName());
        Pair pairA2 = TuplesKt.a("variantName", variant.getTitle());
        AbstractC5607a priceText = variant.getPriceText();
        FS.event("Interacted with variant", MapsKt.o(pairA, pairA2, TuplesKt.a("price", priceText != null ? priceText.b(context) : null)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(Function2 function2, X0 request) {
        Intrinsics.j(request, "request");
        function2.invoke(request, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m0(C12233e0.InterfaceC12237d interfaceC12237d, Pk.a it) {
        Intrinsics.j(it, "it");
        interfaceC12237d.I().invoke(new C12233e0.InterfaceC12239f.Coupon(it));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(InterfaceC5730l0 interfaceC5730l0, LayoutCoordinates it) {
        Intrinsics.j(it, "it");
        o0(interfaceC5730l0, Float.intBitsToFloat((int) (LayoutCoordinatesKt.d(it) & 4294967295L)) >= Float.intBitsToFloat((int) (LayoutCoordinatesKt.f(it) & 4294967295L)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q0(Function2 function2, ProductFullDetails product, String str) {
        Intrinsics.j(product, "product");
        function2.invoke(new X0.ShowProduct(product, str), null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s0(InterfaceC5724i0 interfaceC5724i0, LayoutCoordinates coordinates) {
        Intrinsics.j(coordinates, "coordinates");
        d0(interfaceC5724i0, Float.intBitsToFloat((int) (LayoutCoordinatesKt.e(coordinates) & 4294967295L)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t0(C12233e0.InterfaceC12237d interfaceC12237d, a2 it) {
        Intrinsics.j(it, "it");
        interfaceC12237d.I().invoke(new C12233e0.InterfaceC12239f.ProductReview(it));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u0(Function1 function1, GoogleAdAnalytics googleAdAnalytics) {
        Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
        function1.invoke(googleAdAnalytics);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v0(LocalThemeScope localThemeScope, InterfaceC14794C interfaceC14794C, C12233e0.InterfaceC12237d interfaceC12237d, SubscriptionSummaryDecorator subscriptionSummaryDecorator, d0.V v10, Function2 function2, Function1 function1, ProductDetailFeatureFlags productDetailFeatureFlags, Function2 function22, Function1 function12, Function3 function3, Function0 function0, Modifier modifier, GoogleAdData googleAdData, Function1 function13, Function0 function02, Function1 function14, int i10, int i11, int i12, Composer composer, int i13) {
        c0(localThemeScope, interfaceC14794C, interfaceC12237d, subscriptionSummaryDecorator, v10, function2, function1, productDetailFeatureFlags, function22, function12, function3, function0, modifier, googleAdData, function13, function02, function14, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f142422a;
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
    public static final void x0(final Ji.LocalThemeScope r20, final com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailsDecorator r21, final vs.ProductNutritionLabelDecorator r22, androidx.compose.ui.Modifier r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.K1.x0(Ji.M, com.meijer.mobile.meijer.activity.find.viewmodel.h1, vs.l, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y0(LocalThemeScope localThemeScope, ProductDetailsDecorator c12257h1, ProductNutritionLabelDecorator productNutritionLabelDecorator, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        x0(localThemeScope, c12257h1, productNutritionLabelDecorator, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    private static final void z0(final Ji.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final java.util.List<com.meijer.mobile.meijer.activity.find.viewmodel.ProductImageViewModel> r19, final kotlin.jvm.functions.Function2<? super com.meijer.mobile.meijer.activity.find.viewmodel.ProductImageViewModel, ? super android.view.View, kotlin.Unit> r20, boolean r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.K1.z0(Ji.M, androidx.compose.ui.Modifier, java.util.List, kotlin.jvm.functions.Function2, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    static {
        List listM = CollectionsKt.m();
        InterfaceC5730l0 interfaceC5730l0E = androidx.compose.runtime.t1.e(Boolean.TRUE, null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E2 = androidx.compose.runtime.t1.e(C12233e0.InterfaceC12234a.b.f108537a, null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E3 = androidx.compose.runtime.t1.e(new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null), null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E4 = androidx.compose.runtime.t1.e(new ProductDetailsDecorator(null, null, null, null, null, null, null, null, null, 0.0d, false, false, false, false, false, false, false, 0.0d, false, 524287, null), null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E5 = androidx.compose.runtime.t1.e(null, null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E6 = androidx.compose.runtime.t1.e(null, null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E7 = androidx.compose.runtime.t1.e(null, null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E8 = androidx.compose.runtime.t1.e(CollectionsKt.m(), null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E9 = androidx.compose.runtime.t1.e(CollectionsKt.m(), null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E10 = androidx.compose.runtime.t1.e(CollectionsKt.m(), null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E11 = androidx.compose.runtime.t1.e(null, null, 2, null);
        Boolean bool = Boolean.FALSE;
        InterfaceC5730l0 interfaceC5730l0E12 = androidx.compose.runtime.t1.e(bool, null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E13 = androidx.compose.runtime.t1.e(bool, null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E14 = androidx.compose.runtime.t1.e(bool, null, 2, null);
        InterfaceC5726j0 interfaceC5726j0A = C5702c1.a(1);
        InterfaceC5730l0 interfaceC5730l0E15 = androidx.compose.runtime.t1.e(bool, null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E16 = androidx.compose.runtime.t1.e(bool, null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E17 = androidx.compose.runtime.t1.e(bool, null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E18 = androidx.compose.runtime.t1.e(bool, null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E19 = androidx.compose.runtime.t1.e(bool, null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E20 = androidx.compose.runtime.t1.e(bool, null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E21 = androidx.compose.runtime.t1.e(bool, null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E22 = androidx.compose.runtime.t1.e(bool, null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E23 = androidx.compose.runtime.t1.e(null, null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E24 = androidx.compose.runtime.t1.e(new ProductCartEntryDecorator(0, 0.0d, 0.0d, 7, null), null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E25 = androidx.compose.runtime.t1.e(null, null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E26 = androidx.compose.runtime.t1.e(new C12203b(null, null, null, null, null, 31, null), null, 2, null);
        com.meijer.mobile.meijer.activity.find.viewmodel.r rVar = com.meijer.mobile.meijer.activity.find.viewmodel.r.f108962c;
        InterfaceC5730l0 interfaceC5730l0E27 = androidx.compose.runtime.t1.e(rVar, null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E28 = androidx.compose.runtime.t1.e(rVar, null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E29 = androidx.compose.runtime.t1.e(MapsKt.k(), null, 2, null);
        f107078a = new C12111c(new Function1() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.Y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return K1.R((C12233e0.InterfaceC12239f) obj);
            }
        }, listM, interfaceC5730l0E, interfaceC5730l0E2, interfaceC5730l0E3, interfaceC5730l0E4, interfaceC5730l0E5, interfaceC5730l0E6, interfaceC5730l0E7, interfaceC5730l0E8, interfaceC5730l0E10, interfaceC5730l0E11, interfaceC5730l0E9, interfaceC5730l0E12, interfaceC5730l0E13, interfaceC5730l0E14, androidx.compose.runtime.t1.e(bool, null, 2, null), interfaceC5726j0A, interfaceC5730l0E15, interfaceC5730l0E16, interfaceC5730l0E17, interfaceC5730l0E18, interfaceC5730l0E19, interfaceC5730l0E20, interfaceC5730l0E21, interfaceC5730l0E22, interfaceC5730l0E23, interfaceC5730l0E24, interfaceC5730l0E25, interfaceC5730l0E26, interfaceC5730l0E27, interfaceC5730l0E28, interfaceC5730l0E29, MapsKt.k(), androidx.compose.runtime.t1.e(MapsKt.k(), null, 2, null));
    }

    private static final List<String> A0(InterfaceC5730l0<List<String>> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean O0(C15339A c15339a) {
        return c15339a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(C12233e0.InterfaceC12237d interfaceC12237d) {
        interfaceC12237d.I().invoke(new C12233e0.InterfaceC12239f.UpdateItem(new AbstractC12120f.Update(mk.k.d(interfaceC12237d.w().getValue(), 1), mk.k.d(interfaceC12237d.w().getValue(), 0))));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(C12233e0.InterfaceC12237d interfaceC12237d) {
        interfaceC12237d.I().invoke(new C12233e0.InterfaceC12239f.UpdateItem(new AbstractC12120f.Update(mk.k.d(interfaceC12237d.w().getValue(), 1), mk.k.d(interfaceC12237d.w().getValue(), 0))));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(C12233e0.InterfaceC12237d interfaceC12237d, double d10, double d11) {
        interfaceC12237d.I().invoke(new C12233e0.InterfaceC12239f.UpdateItem(new AbstractC12120f.Update(mk.k.c(interfaceC12237d.w().getValue(), d10), mk.k.c(interfaceC12237d.w().getValue(), d11))));
        return Unit.f142422a;
    }

    private static final void d0(InterfaceC5724i0 interfaceC5724i0, float f10) {
        interfaceC5724i0.B(f10);
    }

    private static final boolean n0(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    private static final void o0(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(C12233e0.InterfaceC12237d interfaceC12237d) {
        interfaceC12237d.I().invoke(new C12233e0.InterfaceC12239f.Reload(new n2.FrequentlyBoughtTogether(interfaceC12237d.m().getValue().getId())));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float w0(InterfaceC5724i0 interfaceC5724i0) {
        return interfaceC5724i0.b();
    }
}
