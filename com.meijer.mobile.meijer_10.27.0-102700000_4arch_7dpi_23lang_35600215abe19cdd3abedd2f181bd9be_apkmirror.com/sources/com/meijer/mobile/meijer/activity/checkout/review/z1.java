package com.meijer.mobile.meijer.activity.checkout.review;

import Ao.W;
import Hp.BVOrderItem;
import Hp.BVOrderTransactionExtras;
import Qq.o;
import Qq.z;
import ak.AbstractC5607a;
import android.os.Parcel;
import android.os.Parcelable;
import com.bazaarvoice.bvandroidsdk.BasicRequestFactory;
import com.google.android.gms.common.api.a;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.meijer.activity.cart.CartOrderSummaryDecorator;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.ContactInformationDecorator;
import com.meijer.mobile.onlineshopping.errors.DigitalShoppingApiException;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import ej.DeliveryMode;
import ej.Entry;
import ej.ShoppingCart;
import ej.SubstitutePreference;
import ej.n;
import gi.InterfaceC14261a;
import gj.OrderDetail;
import gk.MultiTenderPaymentOption;
import gk.PaymentOption;
import hi.C14476c;
import hi.TrackingData;
import il.AgeRestrictedItemResult;
import iv.C14764a;
import j$.time.LocalDate;
import j$.time.temporal.WeekFields;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jl.CheckoutFlowState;
import jl.CheckoutState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import qv.C16648k;
import qv.InterfaceC16622O;
import so.InterfaceC16987a;
import tr.C17135b;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17140B;
import tv.InterfaceC17144F;
import tv.InterfaceC17153g;
import uw.a;
import vk.C17590a;
import vl.CartEntry;
import xs.EnumC18092b;
import xs.TipSuggestionButtonDecorator;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000¦\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 Õ\u00012\u00020\u0001:\f\u0098\u0001«\u0001¤\u0001\u009c\u0001\u009f\u0001\u009a\u0001Bc\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010\"J\u0017\u0010$\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010\"J\u0017\u0010%\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b%\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010&H\u0082@¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u001b\u00103\u001a\u00020\u001c2\n\b\u0002\u00102\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u001cH\u0002¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u001c2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u001cH\u0002¢\u0006\u0004\b;\u00106J\u001b\u0010>\u001a\u00020\u001c2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b@\u0010?J\u0010\u0010A\u001a\u00020\u001cH\u0082@¢\u0006\u0004\bA\u0010(J\u0010\u0010B\u001a\u00020\u001cH\u0082@¢\u0006\u0004\bB\u0010(J\u0019\u0010E\u001a\u00020-2\b\b\u0002\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u001cH\u0082@¢\u0006\u0004\bG\u0010(J\u0017\u0010H\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\bH\u0010?J\u0017\u0010I\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\bI\u0010,J\u0015\u0010L\u001a\u00020K*\u0004\u0018\u00010JH\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\u001c2\u0006\u0010N\u001a\u00020)H\u0002¢\u0006\u0004\bO\u0010,J3\u0010U\u001a\u00020\u001c2\u0006\u0010P\u001a\u00020-2\b\u0010R\u001a\u0004\u0018\u00010Q2\b\u0010S\u001a\u0004\u0018\u00010Q2\u0006\u0010T\u001a\u00020-H\u0002¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u001cH\u0002¢\u0006\u0004\bW\u00106J+\u0010]\u001a\u00020&2\u0006\u0010X\u001a\u00020&2\b\u0010Z\u001a\u0004\u0018\u00010Y2\b\u0010\\\u001a\u0004\u0018\u00010[H\u0002¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\u001c2\u0006\u0010_\u001a\u00020KH\u0002¢\u0006\u0004\b`\u0010aJ\u0019\u0010c\u001a\u00020\u001c2\b\b\u0002\u0010b\u001a\u00020-H\u0002¢\u0006\u0004\bc\u00100J\u0019\u0010e\u001a\u00020\u001c2\b\b\u0002\u0010d\u001a\u00020-H\u0002¢\u0006\u0004\be\u00100J\u0017\u0010h\u001a\u00020&2\u0006\u0010g\u001a\u00020fH\u0002¢\u0006\u0004\bh\u0010iJ\u0017\u0010j\u001a\u00020&2\u0006\u0010g\u001a\u00020fH\u0002¢\u0006\u0004\bj\u0010iJ\u0017\u0010k\u001a\u00020&2\u0006\u0010X\u001a\u00020&H\u0002¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020\u001cH\u0002¢\u0006\u0004\bm\u00106J\u000f\u0010n\u001a\u00020\u001cH\u0002¢\u0006\u0004\bn\u00106J\u0019\u0010p\u001a\u00020\u001c2\b\u0010o\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\bp\u0010qJ\u0015\u0010s\u001a\u00020\u001c2\u0006\u0010r\u001a\u00020-¢\u0006\u0004\bs\u00100J\u0015\u0010t\u001a\u00020\u001c2\u0006\u0010r\u001a\u00020-¢\u0006\u0004\bt\u00100J\u0015\u0010u\u001a\u00020\u001c2\u0006\u0010r\u001a\u00020-¢\u0006\u0004\bu\u00100J\u000f\u0010v\u001a\u00020\u001cH\u0014¢\u0006\u0004\bv\u00106J)\u0010|\u001a\u00020\u001c2\u0006\u0010x\u001a\u00020w2\u0012\u0010{\u001a\u000e\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\u001c0y¢\u0006\u0004\b|\u0010}J\u0017\u0010\u007f\u001a\u00020\u001c2\b\u0010~\u001a\u0004\u0018\u00010&¢\u0006\u0004\b\u007f\u0010qJ\u0019\u0010\u0081\u0001\u001a\u00020\u001c2\u0007\u0010x\u001a\u00030\u0080\u0001¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0016\u0010\u0085\u0001\u001a\u00030\u0084\u0001*\u00030\u0083\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0019\u0010\u0088\u0001\u001a\u00020\u001c2\u0007\u0010x\u001a\u00030\u0087\u0001¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001e\u0010¡\u0001\u001a\t\u0012\u0004\u0012\u00020f0\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R*\u0010¨\u0001\u001a\u0010\u0012\u0004\u0012\u00020f\u0012\u0005\u0012\u00030£\u00010¢\u00018\u0006¢\u0006\u0010\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R\u001f\u0010\u00ad\u0001\u001a\n\u0012\u0005\u0012\u00030ª\u00010©\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R$\u0010³\u0001\u001a\n\u0012\u0005\u0012\u00030ª\u00010®\u00018\u0006¢\u0006\u0010\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001R\u0018\u0010·\u0001\u001a\u00030´\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u0019\u0010º\u0001\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u001b\u0010½\u0001\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\u001b\u0010À\u0001\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0019\u0010Ã\u0001\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u001e\u0010Å\u0001\u001a\t\u0012\u0004\u0012\u00020-0\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010 \u0001R#\u0010Ë\u0001\u001a\t\u0012\u0004\u0012\u00020-0Æ\u00018\u0006¢\u0006\u0010\n\u0006\bÇ\u0001\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001R(\u0010Ð\u0001\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÌ\u0001\u0010Â\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0005\bÏ\u0001\u00100R(\u0010Ô\u0001\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÑ\u0001\u0010Â\u0001\u001a\u0006\bÒ\u0001\u0010Î\u0001\"\u0005\bÓ\u0001\u00100¨\u0006Ö\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1;", "Landroidx/lifecycle/c0;", "Ljl/t;", "checkoutRepository", "Lhl/m;", "cartRepository", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "ordersRepository", "Lyo/k;", "userManager", "Ljl/d;", "checkoutFlowRepository", "LBh/e;", "profileRepository", "Lgi/a;", "analyticsEngine", "LRo/a;", "productAnalytics", "Lyl/k;", "featureManager", "LHp/c;", "bvPixelEventManager", "LXi/a;", "userTokenProvider", "<init>", "(Ljl/t;Lhl/m;Lcom/meijer/mobile/digitalshopping/api/orders/a;Lyo/k;Ljl/d;LBh/e;Lgi/a;LRo/a;Lyl/k;LHp/c;LXi/a;)V", "Ljl/f;", "checkoutFlowState", "", "u0", "(Ljl/f;)V", "Ljl/v;", "checkoutState", "v0", "(Ljl/v;)V", "L0", "K0", "G0", "", "a0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgj/c;", "orderDetail", "D0", "(Lgj/c;)V", "", "isEbtPinPadProcessing", "I0", "(Z)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/d0;", "checkoutAnimations", "E0", "(Lcom/meijer/mobile/meijer/activity/checkout/review/d0;)V", "c0", "()V", "Lil/a;", "result", "t0", "(Lil/a;)V", "A0", "", "throwable", "B0", "(Ljava/lang/Throwable;)V", "s0", "e1", "d1", "j$/time/LocalDate", "now", "p0", "(Lj$/time/LocalDate;)Z", "O0", "x0", "y0", "Lso/a;", "Lcom/meijer/mobile/meijer/activity/checkout/review/e0;", "d0", "(Lso/a;)Lcom/meijer/mobile/meijer/activity/checkout/review/e0;", "order", "b0", "isLoading", "Lak/a;", "loadingMessage", "loadingBody", "spinnerVisible", "b1", "(ZLak/a;Lak/a;Z)V", "N0", "deliveryMode", "Lcom/meijer/mobile/meijer/activity/checkout/review/U1;", "pickUpPerson", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/a;", "contactInformation", "l0", "(Ljava/lang/String;Lcom/meijer/mobile/meijer/activity/checkout/review/U1;Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/a;)Ljava/lang/String;", "checkoutErrorDialogDecorator", "M0", "(Lcom/meijer/mobile/meijer/activity/checkout/review/e0;)V", "forPlaceOrder", "X0", "isContinue", "W0", "Lcom/meijer/mobile/meijer/activity/checkout/review/D1;", "checkoutViewState", "i0", "(Lcom/meijer/mobile/meijer/activity/checkout/review/D1;)Ljava/lang/String;", "m0", "f0", "(Ljava/lang/String;)Ljava/lang/String;", "C0", "U0", "errorMessage", "Z0", "(Ljava/lang/String;)V", "value", "J0", "F0", "H0", "onCleared", "LQq/o;", "action", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$l;", "orderSummaryEvent", "n0", "(LQq/o;Lkotlin/jvm/functions/Function1;)V", "timerString", "c1", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "r0", "(Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;)V", "Lej/i;", "LHp/a;", "T0", "(Lej/i;)LHp/a;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$m;", "z0", "(Lcom/meijer/mobile/meijer/activity/checkout/review/z1$m;)V", "a", "Ljl/t;", "b", "Lhl/m;", "c", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "d", "Lyo/k;", "e", "LBh/e;", "f", "Lgi/a;", "g", "LRo/a;", "h", "Lyl/k;", "i", "LHp/c;", "j", "LXi/a;", "Ltv/B;", "k", "Ltv/B;", "_viewState", "LLk/b;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j;", "l", "LLk/b;", "g0", "()LLk/b;", "flow", "Ltv/A;", "Lcom/meijer/mobile/singlepagecheckout/C0;", "m", "Ltv/A;", "_scrollEventFlow", "Ltv/F;", "n", "Ltv/F;", "j0", "()Ltv/F;", "scrollEventFlow", "LNu/a;", "o", "LNu/a;", "disposables", "p", "Ljava/lang/String;", "cartId", "q", "Ljava/lang/Boolean;", "isBopasEligibleCart", "r", "Lgj/c;", "completedOrder", "s", "Z", "sendPreTipAnalytics", "t", "_orderSubmitted", "Ltv/P;", "u", "Ltv/P;", "h0", "()Ltv/P;", "orderSubmitted", "v", "k0", "()Z", "setShowEbtEnterPinLoadingScreen", "showEbtEnterPinLoadingScreen", "w", "o0", "setCheckForAgeRestrictedItemDone", "isCheckForAgeRestrictedItemDone", "x", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class z1 extends androidx.view.c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final jl.t checkoutRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hl.m cartRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final com.meijer.mobile.digitalshopping.api.orders.a ordersRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Bh.e profileRepository;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Ro.a productAnalytics;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final yl.k featureManager;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Hp.c bvPixelEventManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Xi.a userTokenProvider;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<CheckoutViewState> _viewState;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lk.b<CheckoutViewState, j> flow;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<com.meijer.mobile.singlepagecheckout.C0> _scrollEventFlow;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17144F<com.meijer.mobile.singlepagecheckout.C0> scrollEventFlow;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private String cartId;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Boolean isBopasEligibleCart;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private OrderDetail completedOrder;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean sendPreTipAnalytics;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<Boolean> _orderSubmitted;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final tv.P<Boolean> orderSubmitted;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean showEbtEnterPinLoadingScreen;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean isCheckForAgeRestrictedItemDone;

    /* renamed from: y, reason: collision with root package name */
    public static final int f105073y = 8;

    /* renamed from: z, reason: collision with root package name */
    private static final List<Integer> f105074z = CollectionsKt.p(Integer.valueOf(com.meijer.mobile.meijer.Y.f99903Xb), Integer.valueOf(com.meijer.mobile.meijer.Y.f99922Yb), Integer.valueOf(com.meijer.mobile.meijer.Y.f99941Zb));

    /* renamed from: A, reason: collision with root package name */
    private static final List<Integer> f105071A = CollectionsKt.p(Integer.valueOf(com.meijer.mobile.meijer.Y.f99846Ub), Integer.valueOf(com.meijer.mobile.meijer.Y.f99865Vb), Integer.valueOf(com.meijer.mobile.meijer.Y.f99884Wb));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewModel", f = "CheckoutViewModel.kt", l = {909}, m = "submitOrder")
    static final class A extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f105098a;

        /* renamed from: b, reason: collision with root package name */
        Object f105099b;

        /* renamed from: c, reason: collision with root package name */
        Object f105100c;

        /* renamed from: d, reason: collision with root package name */
        boolean f105101d;

        /* renamed from: e, reason: collision with root package name */
        double f105102e;

        /* renamed from: f, reason: collision with root package name */
        int f105103f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f105104g;

        /* renamed from: i, reason: collision with root package name */
        int f105106i;

        A(Continuation<? super A> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f105104g = obj;
            this.f105106i |= Integer.MIN_VALUE;
            return z1.this.O0(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$a, reason: case insensitive filesystem */
    /* synthetic */ class C12014a extends FunctionReferenceImpl implements Function1<CheckoutState, Unit> {
        C12014a(Object obj) {
            super(1, obj, z1.class, "onNewCheckoutState", "onNewCheckoutState(Lcom/meijer/mobile/digitalshopping/api/checkout/CheckoutState;)V", 0);
        }

        public final void a(CheckoutState p02) throws IOException {
            Intrinsics.j(p02, "p0");
            ((z1) this.receiver).v0(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CheckoutState checkoutState) throws IOException {
            a(checkoutState);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        b(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends FunctionReferenceImpl implements Function1<CheckoutFlowState, Unit> {
        c(Object obj) {
            super(1, obj, z1.class, "onGetCheckoutFlowState", "onGetCheckoutFlowState(Lcom/meijer/mobile/digitalshopping/api/checkout/CheckoutFlowState;)V", 0);
        }

        public final void a(CheckoutFlowState p02) {
            Intrinsics.j(p02, "p0");
            ((z1) this.receiver).u0(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CheckoutFlowState fVar) {
            a(fVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class d extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        d(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "Lcom/meijer/mobile/meijer/activity/checkout/review/D1;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewModel$6", f = "CheckoutViewModel.kt", l = {}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function3<InterfaceC17153g<? super CheckoutViewState>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f105110a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f105111b;

        f(Continuation<? super f> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super CheckoutViewState> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            f fVar = new f(continuation);
            fVar.f105111b = th2;
            return fVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f105110a == 0) {
                ResultKt.b(obj);
                uw.a.INSTANCE.e((Throwable) this.f105111b);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class g extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        g(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001c\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u001c !\"#$%&'()*+,-./0123456789:;¨\u0006<"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "", "<init>", "()V", "w", "r", "j", "c", "t", "u", "B", "y", "q", "s", "A", "v", "i", "f", "x", "d", "b", "n", "h", "g", "o", "p", "a", "z", "e", "m", "k", "l", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$a;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$b;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$c;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$d;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$e;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$f;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$g;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$h;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$i;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$j;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$k;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$l;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$m;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$n;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$o;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$p;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$q;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$r;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$s;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$t;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$u;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$v;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$w;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$x;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$y;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$z;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$A;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$B;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class h {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$A;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "", "ebtAmountApproved", "<init>", "(D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$h$A, reason: from toString */
        public static final /* data */ class UpdateEbtApprovedAmount extends h {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final double ebtAmountApproved;

            public UpdateEbtApprovedAmount(double d10) {
                super(null);
                this.ebtAmountApproved = d10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateEbtApprovedAmount) && Double.compare(this.ebtAmountApproved, ((UpdateEbtApprovedAmount) other).ebtAmountApproved) == 0;
            }

            public int hashCode() {
                return Double.hashCode(this.ebtAmountApproved);
            }

            public String toString() {
                return "UpdateEbtApprovedAmount(ebtAmountApproved=" + this.ebtAmountApproved + ')';
            }

            /* renamed from: a, reason: from getter */
            public final double getEbtAmountApproved() {
                return this.ebtAmountApproved;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$B;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "Lgk/e;", "multiTenderPaymentOption", "<init>", "(Lgk/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgk/e;", "()Lgk/e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$h$B, reason: from toString */
        public static final /* data */ class UpdatePaymentDetails extends h {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final MultiTenderPaymentOption multiTenderPaymentOption;

            public UpdatePaymentDetails(MultiTenderPaymentOption multiTenderPaymentOption) {
                super(null);
                this.multiTenderPaymentOption = multiTenderPaymentOption;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdatePaymentDetails) && Intrinsics.e(this.multiTenderPaymentOption, ((UpdatePaymentDetails) other).multiTenderPaymentOption);
            }

            public int hashCode() {
                MultiTenderPaymentOption multiTenderPaymentOption = this.multiTenderPaymentOption;
                if (multiTenderPaymentOption == null) {
                    return 0;
                }
                return multiTenderPaymentOption.hashCode();
            }

            public String toString() {
                return "UpdatePaymentDetails(multiTenderPaymentOption=" + this.multiTenderPaymentOption + ')';
            }

            /* renamed from: a, reason: from getter */
            public final MultiTenderPaymentOption getMultiTenderPaymentOption() {
                return this.multiTenderPaymentOption;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$a;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$h$a, reason: case insensitive filesystem */
        public static final /* data */ class C12015a extends h {

            /* renamed from: a, reason: collision with root package name */
            public static final C12015a f105114a = new C12015a();

            private C12015a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C12015a);
            }

            public int hashCode() {
                return 829600439;
            }

            public String toString() {
                return "AdjustEbtPaymentClicked";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$b;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$h$b, reason: case insensitive filesystem */
        public static final /* data */ class C12016b extends h {

            /* renamed from: a, reason: collision with root package name */
            public static final C12016b f105115a = new C12016b();

            private C12016b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C12016b);
            }

            public int hashCode() {
                return -33318430;
            }

            public String toString() {
                return "CancelOrder";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$c;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends h {

            /* renamed from: a, reason: collision with root package name */
            public static final c f105116a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -577346596;
            }

            public String toString() {
                return "CheckAgeRestrictedItemInCart";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$d;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends h {

            /* renamed from: a, reason: collision with root package name */
            public static final d f105117a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -442497423;
            }

            public String toString() {
                return "CloseOrderCancellationWarning";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$e;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends h {

            /* renamed from: a, reason: collision with root package name */
            public static final e f105118a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return 1629964228;
            }

            public String toString() {
                return "ClosePinPad";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$f;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class f extends h {

            /* renamed from: a, reason: collision with root package name */
            public static final f f105119a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public int hashCode() {
                return 884099862;
            }

            public String toString() {
                return "EBTNotVerified";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$g;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class g extends h {

            /* renamed from: a, reason: collision with root package name */
            public static final g f105120a = new g();

            private g() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof g);
            }

            public int hashCode() {
                return -1117506843;
            }

            public String toString() {
                return "EBTPINPadRetry";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$h;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$h$h, reason: collision with other inner class name */
        public static final /* data */ class C1530h extends h {

            /* renamed from: a, reason: collision with root package name */
            public static final C1530h f105121a = new C1530h();

            private C1530h() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1530h);
            }

            public int hashCode() {
                return -72461105;
            }

            public String toString() {
                return "EBTPinPadClosed";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$i;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class i extends h {

            /* renamed from: a, reason: collision with root package name */
            public static final i f105122a = new i();

            private i() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            public int hashCode() {
                return 1227609165;
            }

            public String toString() {
                return "EBTVerified";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$j;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class j extends h {

            /* renamed from: a, reason: collision with root package name */
            public static final j f105123a = new j();

            private j() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof j);
            }

            public int hashCode() {
                return -834088162;
            }

            public String toString() {
                return "EndLoadingState";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$k;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class k extends h {

            /* renamed from: a, reason: collision with root package name */
            public static final k f105124a = new k();

            private k() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof k);
            }

            public int hashCode() {
                return 1400327709;
            }

            public String toString() {
                return "MoveToPaymentSection";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$l;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class l extends h {

            /* renamed from: a, reason: collision with root package name */
            public static final l f105125a = new l();

            private l() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof l);
            }

            public int hashCode() {
                return 1585326391;
            }

            public String toString() {
                return "MoveToPlaceOrderButton";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$m;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class m extends h {

            /* renamed from: a, reason: collision with root package name */
            public static final m f105126a = new m();

            private m() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof m);
            }

            public int hashCode() {
                return 802985098;
            }

            public String toString() {
                return "MoveToTimeSlots";
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$n;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;", "information", "", "isBopasEligibleCart", "<init>", "(Ljava/lang/String;Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;Ljava/lang/Boolean;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;", "()Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$h$n, reason: from toString */
        public static final /* data */ class NavigateToOrderConfirmation extends h {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String orderId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final OrderConfirmationInfo information;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Boolean isBopasEligibleCart;

            public NavigateToOrderConfirmation(String str, OrderConfirmationInfo orderConfirmationInfo, Boolean bool) {
                super(null);
                this.orderId = str;
                this.information = orderConfirmationInfo;
                this.isBopasEligibleCart = bool;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NavigateToOrderConfirmation)) {
                    return false;
                }
                NavigateToOrderConfirmation navigateToOrderConfirmation = (NavigateToOrderConfirmation) other;
                return Intrinsics.e(this.orderId, navigateToOrderConfirmation.orderId) && Intrinsics.e(this.information, navigateToOrderConfirmation.information) && Intrinsics.e(this.isBopasEligibleCart, navigateToOrderConfirmation.isBopasEligibleCart);
            }

            public int hashCode() {
                String str = this.orderId;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                OrderConfirmationInfo orderConfirmationInfo = this.information;
                int iHashCode2 = (iHashCode + (orderConfirmationInfo == null ? 0 : orderConfirmationInfo.hashCode())) * 31;
                Boolean bool = this.isBopasEligibleCart;
                return iHashCode2 + (bool != null ? bool.hashCode() : 0);
            }

            public String toString() {
                return "NavigateToOrderConfirmation(orderId=" + this.orderId + ", information=" + this.information + ", isBopasEligibleCart=" + this.isBopasEligibleCart + ')';
            }

            /* renamed from: a, reason: from getter */
            public final OrderConfirmationInfo getInformation() {
                return this.information;
            }

            /* renamed from: b, reason: from getter */
            public final String getOrderId() {
                return this.orderId;
            }

            /* renamed from: c, reason: from getter */
            public final Boolean getIsBopasEligibleCart() {
                return this.isBopasEligibleCart;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$o;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class o extends h {

            /* renamed from: a, reason: collision with root package name */
            public static final o f105130a = new o();

            private o() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof o);
            }

            public int hashCode() {
                return -762100332;
            }

            public String toString() {
                return "NavigateToPaymentScreen";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$p;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class p extends h {

            /* renamed from: a, reason: collision with root package name */
            public static final p f105131a = new p();

            private p() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof p);
            }

            public int hashCode() {
                return 537940849;
            }

            public String toString() {
                return "RemoveEBTCard";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$q;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "", "isContinue", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$h$q, reason: from toString */
        public static final /* data */ class SendAdobeActionTag extends h {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isContinue;

            public SendAdobeActionTag(boolean z10) {
                super(null);
                this.isContinue = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SendAdobeActionTag) && this.isContinue == ((SendAdobeActionTag) other).isContinue;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isContinue);
            }

            public String toString() {
                return "SendAdobeActionTag(isContinue=" + this.isContinue + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getIsContinue() {
                return this.isContinue;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$r;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class r extends h {

            /* renamed from: a, reason: collision with root package name */
            public static final r f105133a = new r();

            private r() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof r);
            }

            public int hashCode() {
                return -611769314;
            }

            public String toString() {
                return "SendAdobeStateTag";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$s;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "", "displayAnimations", "Lcom/meijer/mobile/meijer/activity/checkout/review/d0;", "checkoutAnimations", "<init>", "(ZLcom/meijer/mobile/meijer/activity/checkout/review/d0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lcom/meijer/mobile/meijer/activity/checkout/review/d0;", "()Lcom/meijer/mobile/meijer/activity/checkout/review/d0;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$h$s, reason: from toString */
        public static final /* data */ class SetCheckoutAnimations extends h {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean displayAnimations;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final CheckoutAnimations checkoutAnimations;

            public SetCheckoutAnimations(boolean z10, CheckoutAnimations c11948d0) {
                super(null);
                this.displayAnimations = z10;
                this.checkoutAnimations = c11948d0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetCheckoutAnimations)) {
                    return false;
                }
                SetCheckoutAnimations setCheckoutAnimations = (SetCheckoutAnimations) other;
                return this.displayAnimations == setCheckoutAnimations.displayAnimations && Intrinsics.e(this.checkoutAnimations, setCheckoutAnimations.checkoutAnimations);
            }

            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.displayAnimations) * 31;
                CheckoutAnimations c11948d0 = this.checkoutAnimations;
                return iHashCode + (c11948d0 == null ? 0 : c11948d0.hashCode());
            }

            public String toString() {
                return "SetCheckoutAnimations(displayAnimations=" + this.displayAnimations + ", checkoutAnimations=" + this.checkoutAnimations + ')';
            }

            /* renamed from: a, reason: from getter */
            public final CheckoutAnimations getCheckoutAnimations() {
                return this.checkoutAnimations;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getDisplayAnimations() {
                return this.displayAnimations;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$t;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "instructions", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$h$t, reason: from toString */
        public static final /* data */ class SetDeliveryInstructions extends h {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String instructions;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetDeliveryInstructions) && Intrinsics.e(this.instructions, ((SetDeliveryInstructions) other).instructions);
            }

            public int hashCode() {
                String str = this.instructions;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "SetDeliveryInstructions(instructions=" + this.instructions + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getInstructions() {
                return this.instructions;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$u;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "Lej/D;", "preference", "<init>", "(Lej/D;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lej/D;", "()Lej/D;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$h$u, reason: from toString */
        public static final /* data */ class SetSubstitutionPreference extends h {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final SubstitutePreference preference;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetSubstitutionPreference) && Intrinsics.e(this.preference, ((SetSubstitutionPreference) other).preference);
            }

            public int hashCode() {
                return this.preference.hashCode();
            }

            public String toString() {
                return "SetSubstitutionPreference(preference=" + this.preference + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetSubstitutionPreference(SubstitutePreference preference) {
                super(null);
                Intrinsics.j(preference, "preference");
                this.preference = preference;
            }

            /* renamed from: a, reason: from getter */
            public final SubstitutePreference getPreference() {
                return this.preference;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$v;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class v extends h {

            /* renamed from: a, reason: collision with root package name */
            public static final v f105138a = new v();

            private v() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof v);
            }

            public int hashCode() {
                return -1888002042;
            }

            public String toString() {
                return "ShowEBTPinPad";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$w;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class w extends h {

            /* renamed from: a, reason: collision with root package name */
            public static final w f105139a = new w();

            private w() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof w);
            }

            public int hashCode() {
                return -1939526217;
            }

            public String toString() {
                return "ShowErrorDialogAction";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$x;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class x extends h {

            /* renamed from: a, reason: collision with root package name */
            public static final x f105140a = new x();

            private x() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof x);
            }

            public int hashCode() {
                return 1132524506;
            }

            public String toString() {
                return "ShowOrderCancellationWarning";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$y;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "", "validateAlert", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$h$y, reason: from toString */
        public static final /* data */ class SubmitOrderAction extends h {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean validateAlert;

            public SubmitOrderAction(boolean z10) {
                super(null);
                this.validateAlert = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SubmitOrderAction) && this.validateAlert == ((SubmitOrderAction) other).validateAlert;
            }

            public int hashCode() {
                return Boolean.hashCode(this.validateAlert);
            }

            public String toString() {
                return "SubmitOrderAction(validateAlert=" + this.validateAlert + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getValidateAlert() {
                return this.validateAlert;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h$z;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$h$z, reason: from toString */
        public static final /* data */ class TrackEBTErrorAnalytics extends h {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String errorMessage;

            public TrackEBTErrorAnalytics(String str) {
                super(null);
                this.errorMessage = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TrackEBTErrorAnalytics) && Intrinsics.e(this.errorMessage, ((TrackEBTErrorAnalytics) other).errorMessage);
            }

            public int hashCode() {
                String str = this.errorMessage;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "TrackEBTErrorAnalytics(errorMessage=" + this.errorMessage + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getErrorMessage() {
                return this.errorMessage;
            }
        }

        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private h() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j;", "", "<init>", "()V", "i", "e", "k", "f", "j", "g", "b", "a", "c", "h", "d", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j$a;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j$b;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j$c;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j$d;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j$e;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j$f;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j$g;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j$h;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j$i;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j$j;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j$k;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class j {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j$a;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends j {

            /* renamed from: a, reason: collision with root package name */
            public static final a f105143a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 549845201;
            }

            public String toString() {
                return "NavigateToHomeScreen";
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j$b;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j;", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;", "information", "", "isBopasEligibleCart", "sendPreTipAnalytics", "<init>", "(Ljava/lang/String;Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;Ljava/lang/Boolean;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;", "()Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;", "c", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$j$b, reason: from toString */
        public static final /* data */ class NavigateToOrderConfirmationEvent extends j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String orderId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final OrderConfirmationInfo information;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Boolean isBopasEligibleCart;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean sendPreTipAnalytics;

            public NavigateToOrderConfirmationEvent(String str, OrderConfirmationInfo orderConfirmationInfo, Boolean bool, boolean z10) {
                super(null);
                this.orderId = str;
                this.information = orderConfirmationInfo;
                this.isBopasEligibleCart = bool;
                this.sendPreTipAnalytics = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NavigateToOrderConfirmationEvent)) {
                    return false;
                }
                NavigateToOrderConfirmationEvent navigateToOrderConfirmationEvent = (NavigateToOrderConfirmationEvent) other;
                return Intrinsics.e(this.orderId, navigateToOrderConfirmationEvent.orderId) && Intrinsics.e(this.information, navigateToOrderConfirmationEvent.information) && Intrinsics.e(this.isBopasEligibleCart, navigateToOrderConfirmationEvent.isBopasEligibleCart) && this.sendPreTipAnalytics == navigateToOrderConfirmationEvent.sendPreTipAnalytics;
            }

            public int hashCode() {
                String str = this.orderId;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                OrderConfirmationInfo orderConfirmationInfo = this.information;
                int iHashCode2 = (iHashCode + (orderConfirmationInfo == null ? 0 : orderConfirmationInfo.hashCode())) * 31;
                Boolean bool = this.isBopasEligibleCart;
                return ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + Boolean.hashCode(this.sendPreTipAnalytics);
            }

            public String toString() {
                return "NavigateToOrderConfirmationEvent(orderId=" + this.orderId + ", information=" + this.information + ", isBopasEligibleCart=" + this.isBopasEligibleCart + ", sendPreTipAnalytics=" + this.sendPreTipAnalytics + ')';
            }

            /* renamed from: a, reason: from getter */
            public final OrderConfirmationInfo getInformation() {
                return this.information;
            }

            /* renamed from: b, reason: from getter */
            public final String getOrderId() {
                return this.orderId;
            }

            /* renamed from: c, reason: from getter */
            public final boolean getSendPreTipAnalytics() {
                return this.sendPreTipAnalytics;
            }

            /* renamed from: d, reason: from getter */
            public final Boolean getIsBopasEligibleCart() {
                return this.isBopasEligibleCart;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j$c;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j;", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "shortCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$j$c, reason: from toString */
        public static final /* data */ class NavigateToOrderDetailEvent extends j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String orderId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String shortCode;

            public NavigateToOrderDetailEvent(String str, String str2) {
                super(null);
                this.orderId = str;
                this.shortCode = str2;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NavigateToOrderDetailEvent)) {
                    return false;
                }
                NavigateToOrderDetailEvent navigateToOrderDetailEvent = (NavigateToOrderDetailEvent) other;
                return Intrinsics.e(this.orderId, navigateToOrderDetailEvent.orderId) && Intrinsics.e(this.shortCode, navigateToOrderDetailEvent.shortCode);
            }

            public int hashCode() {
                String str = this.orderId;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.shortCode;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "NavigateToOrderDetailEvent(orderId=" + this.orderId + ", shortCode=" + this.shortCode + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getOrderId() {
                return this.orderId;
            }

            /* renamed from: b, reason: from getter */
            public final String getShortCode() {
                return this.shortCode;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j$d;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends j {

            /* renamed from: a, reason: collision with root package name */
            public static final d f105150a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -1148260274;
            }

            public String toString() {
                return "NavigateToPaymentScreenEvent";
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j$e;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j;", "Lgj/c;", "orderDetail", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;", "information", "", "displayEbtPinPad", "<init>", "(Lgj/c;Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lgj/c;", "c", "()Lgj/c;", "b", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;", "()Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$j$e, reason: from toString */
        public static final /* data */ class OrderSubmittedSuccessEvent extends j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final OrderDetail orderDetail;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final OrderConfirmationInfo information;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean displayEbtPinPad;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OrderSubmittedSuccessEvent)) {
                    return false;
                }
                OrderSubmittedSuccessEvent orderSubmittedSuccessEvent = (OrderSubmittedSuccessEvent) other;
                return Intrinsics.e(this.orderDetail, orderSubmittedSuccessEvent.orderDetail) && Intrinsics.e(this.information, orderSubmittedSuccessEvent.information) && this.displayEbtPinPad == orderSubmittedSuccessEvent.displayEbtPinPad;
            }

            public int hashCode() {
                OrderDetail orderDetail = this.orderDetail;
                return ((((orderDetail == null ? 0 : orderDetail.hashCode()) * 31) + this.information.hashCode()) * 31) + Boolean.hashCode(this.displayEbtPinPad);
            }

            public String toString() {
                return "OrderSubmittedSuccessEvent(orderDetail=" + this.orderDetail + ", information=" + this.information + ", displayEbtPinPad=" + this.displayEbtPinPad + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OrderSubmittedSuccessEvent(OrderDetail orderDetail, OrderConfirmationInfo information, boolean z10) {
                super(null);
                Intrinsics.j(information, "information");
                this.orderDetail = orderDetail;
                this.information = information;
                this.displayEbtPinPad = z10;
            }

            /* renamed from: a, reason: from getter */
            public final boolean getDisplayEbtPinPad() {
                return this.displayEbtPinPad;
            }

            /* renamed from: b, reason: from getter */
            public final OrderConfirmationInfo getInformation() {
                return this.information;
            }

            /* renamed from: c, reason: from getter */
            public final OrderDetail getOrderDetail() {
                return this.orderDetail;
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j$f;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j;", "Lak/a;", "title", "message", "buttonText", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "retrofitException", "", "cancellable", "<init>", "(Lak/a;Lak/a;Lak/a;Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "d", "()Lak/a;", "b", "c", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "()Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "e", "Z", "getCancellable", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$j$f, reason: from toString */
        public static final /* data */ class ShowAgeRestrictedDialog extends j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a message;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a buttonText;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final RetrofitException retrofitException;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean cancellable;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowAgeRestrictedDialog)) {
                    return false;
                }
                ShowAgeRestrictedDialog showAgeRestrictedDialog = (ShowAgeRestrictedDialog) other;
                return Intrinsics.e(this.title, showAgeRestrictedDialog.title) && Intrinsics.e(this.message, showAgeRestrictedDialog.message) && Intrinsics.e(this.buttonText, showAgeRestrictedDialog.buttonText) && Intrinsics.e(this.retrofitException, showAgeRestrictedDialog.retrofitException) && this.cancellable == showAgeRestrictedDialog.cancellable;
            }

            public int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                AbstractC5607a abstractC5607a = this.message;
                int iHashCode2 = (((iHashCode + (abstractC5607a == null ? 0 : abstractC5607a.hashCode())) * 31) + this.buttonText.hashCode()) * 31;
                RetrofitException retrofitException = this.retrofitException;
                return ((iHashCode2 + (retrofitException != null ? retrofitException.hashCode() : 0)) * 31) + Boolean.hashCode(this.cancellable);
            }

            public String toString() {
                return "ShowAgeRestrictedDialog(title=" + this.title + ", message=" + this.message + ", buttonText=" + this.buttonText + ", retrofitException=" + this.retrofitException + ", cancellable=" + this.cancellable + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowAgeRestrictedDialog(AbstractC5607a title, AbstractC5607a abstractC5607a, AbstractC5607a buttonText, RetrofitException retrofitException, boolean z10) {
                super(null);
                Intrinsics.j(title, "title");
                Intrinsics.j(buttonText, "buttonText");
                this.title = title;
                this.message = abstractC5607a;
                this.buttonText = buttonText;
                this.retrofitException = retrofitException;
                this.cancellable = z10;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC5607a getButtonText() {
                return this.buttonText;
            }

            /* renamed from: b, reason: from getter */
            public final AbstractC5607a getMessage() {
                return this.message;
            }

            /* renamed from: c, reason: from getter */
            public final RetrofitException getRetrofitException() {
                return this.retrofitException;
            }

            /* renamed from: d, reason: from getter */
            public final AbstractC5607a getTitle() {
                return this.title;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j$g;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j;", "", "acculynkPostBody", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAcculynkPostBody", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$j$g, reason: from toString */
        public static final /* data */ class ShowEBTPinPadEvent extends j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String acculynkPostBody;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowEBTPinPadEvent) && Intrinsics.e(this.acculynkPostBody, ((ShowEBTPinPadEvent) other).acculynkPostBody);
            }

            public int hashCode() {
                return this.acculynkPostBody.hashCode();
            }

            public String toString() {
                return "ShowEBTPinPadEvent(acculynkPostBody=" + this.acculynkPostBody + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowEBTPinPadEvent(String acculynkPostBody) {
                super(null);
                Intrinsics.j(acculynkPostBody, "acculynkPostBody");
                this.acculynkPostBody = acculynkPostBody;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j$h;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class h extends j {

            /* renamed from: a, reason: collision with root package name */
            public static final h f105160a = new h();

            private h() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            public int hashCode() {
                return 171170380;
            }

            public String toString() {
                return "ShowEBTRemoveDialog";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j$i;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j;", "Lcom/meijer/mobile/meijer/activity/checkout/review/e0;", "checkoutErrorDialogDecorator", "<init>", "(Lcom/meijer/mobile/meijer/activity/checkout/review/e0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/checkout/review/e0;", "()Lcom/meijer/mobile/meijer/activity/checkout/review/e0;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$j$i, reason: from toString */
        public static final /* data */ class ShowErrorDialogEvent extends j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final CheckoutErrorDialogDecorator checkoutErrorDialogDecorator;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowErrorDialogEvent) && Intrinsics.e(this.checkoutErrorDialogDecorator, ((ShowErrorDialogEvent) other).checkoutErrorDialogDecorator);
            }

            public int hashCode() {
                return this.checkoutErrorDialogDecorator.hashCode();
            }

            public String toString() {
                return "ShowErrorDialogEvent(checkoutErrorDialogDecorator=" + this.checkoutErrorDialogDecorator + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowErrorDialogEvent(CheckoutErrorDialogDecorator checkoutErrorDialogDecorator) {
                super(null);
                Intrinsics.j(checkoutErrorDialogDecorator, "checkoutErrorDialogDecorator");
                this.checkoutErrorDialogDecorator = checkoutErrorDialogDecorator;
            }

            /* renamed from: a, reason: from getter */
            public final CheckoutErrorDialogDecorator getCheckoutErrorDialogDecorator() {
                return this.checkoutErrorDialogDecorator;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j$j;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j;", "Lak/a;", "alertTitle", "alertMessage", "<init>", "(Lak/a;Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "b", "()Lak/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$j$j, reason: collision with other inner class name and from toString */
        public static final /* data */ class ShowFutureTimeslotAlert extends j {

            /* renamed from: c, reason: collision with root package name */
            public static final int f105162c = AbstractC5607a.f45514b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a alertTitle;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a alertMessage;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowFutureTimeslotAlert)) {
                    return false;
                }
                ShowFutureTimeslotAlert showFutureTimeslotAlert = (ShowFutureTimeslotAlert) other;
                return Intrinsics.e(this.alertTitle, showFutureTimeslotAlert.alertTitle) && Intrinsics.e(this.alertMessage, showFutureTimeslotAlert.alertMessage);
            }

            public int hashCode() {
                return (this.alertTitle.hashCode() * 31) + this.alertMessage.hashCode();
            }

            public String toString() {
                return "ShowFutureTimeslotAlert(alertTitle=" + this.alertTitle + ", alertMessage=" + this.alertMessage + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowFutureTimeslotAlert(AbstractC5607a alertTitle, AbstractC5607a alertMessage) {
                super(null);
                Intrinsics.j(alertTitle, "alertTitle");
                Intrinsics.j(alertMessage, "alertMessage");
                this.alertTitle = alertTitle;
                this.alertMessage = alertMessage;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC5607a getAlertMessage() {
                return this.alertMessage;
            }

            /* renamed from: b, reason: from getter */
            public final AbstractC5607a getAlertTitle() {
                return this.alertTitle;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j$k;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j;", "", "buttonText", "", "isTimeSlotError", "<init>", "(Ljava/lang/Integer;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$j$k, reason: from toString */
        public static final /* data */ class SubmitOrderErrorEvent extends j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Integer buttonText;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isTimeSlotError;

            public SubmitOrderErrorEvent(Integer num, boolean z10) {
                super(null);
                this.buttonText = num;
                this.isTimeSlotError = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SubmitOrderErrorEvent)) {
                    return false;
                }
                SubmitOrderErrorEvent submitOrderErrorEvent = (SubmitOrderErrorEvent) other;
                return Intrinsics.e(this.buttonText, submitOrderErrorEvent.buttonText) && this.isTimeSlotError == submitOrderErrorEvent.isTimeSlotError;
            }

            public int hashCode() {
                Integer num = this.buttonText;
                return ((num == null ? 0 : num.hashCode()) * 31) + Boolean.hashCode(this.isTimeSlotError);
            }

            public String toString() {
                return "SubmitOrderErrorEvent(buttonText=" + this.buttonText + ", isTimeSlotError=" + this.isTimeSlotError + ')';
            }

            /* renamed from: a, reason: from getter */
            public final Integer getButtonText() {
                return this.buttonText;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getIsTimeSlotError() {
                return this.isTimeSlotError;
            }
        }

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;", "Landroid/os/Parcelable;", "", "deliveryMode", BasicRequestFactory.kEMAIL_USER, "fulfillmentPartner", "pickupHelpNumber", "storeName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "e", "c", "d", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$k, reason: from toString */
    public static final /* data */ class OrderConfirmationInfo implements Parcelable {
        public static final Parcelable.Creator<OrderConfirmationInfo> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String deliveryMode;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String userEmail;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fulfillmentPartner;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String pickupHelpNumber;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String storeName;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$k$a */
        public static final class a implements Parcelable.Creator<OrderConfirmationInfo> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final OrderConfirmationInfo createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                return new OrderConfirmationInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final OrderConfirmationInfo[] newArray(int i10) {
                return new OrderConfirmationInfo[i10];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderConfirmationInfo)) {
                return false;
            }
            OrderConfirmationInfo orderConfirmationInfo = (OrderConfirmationInfo) other;
            return Intrinsics.e(this.deliveryMode, orderConfirmationInfo.deliveryMode) && Intrinsics.e(this.userEmail, orderConfirmationInfo.userEmail) && Intrinsics.e(this.fulfillmentPartner, orderConfirmationInfo.fulfillmentPartner) && Intrinsics.e(this.pickupHelpNumber, orderConfirmationInfo.pickupHelpNumber) && Intrinsics.e(this.storeName, orderConfirmationInfo.storeName);
        }

        public int hashCode() {
            return (((((((this.deliveryMode.hashCode() * 31) + this.userEmail.hashCode()) * 31) + this.fulfillmentPartner.hashCode()) * 31) + this.pickupHelpNumber.hashCode()) * 31) + this.storeName.hashCode();
        }

        public String toString() {
            return "OrderConfirmationInfo(deliveryMode=" + this.deliveryMode + ", userEmail=" + this.userEmail + ", fulfillmentPartner=" + this.fulfillmentPartner + ", pickupHelpNumber=" + this.pickupHelpNumber + ", storeName=" + this.storeName + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeString(this.deliveryMode);
            dest.writeString(this.userEmail);
            dest.writeString(this.fulfillmentPartner);
            dest.writeString(this.pickupHelpNumber);
            dest.writeString(this.storeName);
        }

        public OrderConfirmationInfo(String deliveryMode, String userEmail, String fulfillmentPartner, String pickupHelpNumber, String storeName) {
            Intrinsics.j(deliveryMode, "deliveryMode");
            Intrinsics.j(userEmail, "userEmail");
            Intrinsics.j(fulfillmentPartner, "fulfillmentPartner");
            Intrinsics.j(pickupHelpNumber, "pickupHelpNumber");
            Intrinsics.j(storeName, "storeName");
            this.deliveryMode = deliveryMode;
            this.userEmail = userEmail;
            this.fulfillmentPartner = fulfillmentPartner;
            this.pickupHelpNumber = pickupHelpNumber;
            this.storeName = storeName;
        }

        /* renamed from: a, reason: from getter */
        public final String getDeliveryMode() {
            return this.deliveryMode;
        }

        /* renamed from: b, reason: from getter */
        public final String getFulfillmentPartner() {
            return this.fulfillmentPartner;
        }

        /* renamed from: c, reason: from getter */
        public final String getPickupHelpNumber() {
            return this.pickupHelpNumber;
        }

        /* renamed from: d, reason: from getter */
        public final String getStoreName() {
            return this.storeName;
        }

        /* renamed from: e, reason: from getter */
        public final String getUserEmail() {
            return this.userEmail;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$l;", "", "<init>", "()V", "a", "c", "b", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$l$a;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$l$b;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$l$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class l {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$l$a;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f105172a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 444309766;
            }

            public String toString() {
                return "ShowAdjustEbtSheet";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$l$b;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends l {

            /* renamed from: a, reason: collision with root package name */
            public static final b f105173a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 596223210;
            }

            public String toString() {
                return "ShowExtendedRangeSheet";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$l$c;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends l {

            /* renamed from: a, reason: collision with root package name */
            public static final c f105174a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1078954676;
            }

            public String toString() {
                return "ShowTooltip";
            }
        }

        public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private l() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$m;", "", "<init>", "()V", "c", "a", "b", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$m$a;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$m$b;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$m$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class m {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$m$a;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$m;", "", "tipAmount", "<init>", "(D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$m$a, reason: from toString */
        public static final /* data */ class SetCustomTipAmount extends m {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final double tipAmount;

            public SetCustomTipAmount(double d10) {
                super(null);
                this.tipAmount = d10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetCustomTipAmount) && Double.compare(this.tipAmount, ((SetCustomTipAmount) other).tipAmount) == 0;
            }

            public int hashCode() {
                return Double.hashCode(this.tipAmount);
            }

            public String toString() {
                return "SetCustomTipAmount(tipAmount=" + this.tipAmount + ')';
            }

            /* renamed from: a, reason: from getter */
            public final double getTipAmount() {
                return this.tipAmount;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$m$b;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$m;", "Lcom/meijer/mobile/meijer/activity/checkout/review/W1;", "status", "<init>", "(Lcom/meijer/mobile/meijer/activity/checkout/review/W1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/checkout/review/W1;", "()Lcom/meijer/mobile/meijer/activity/checkout/review/W1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$m$b, reason: from toString */
        public static final /* data */ class SetPreTipStatus extends m {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final W1 status;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetPreTipStatus) && this.status == ((SetPreTipStatus) other).status;
            }

            public int hashCode() {
                return this.status.hashCode();
            }

            public String toString() {
                return "SetPreTipStatus(status=" + this.status + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetPreTipStatus(W1 status) {
                super(null);
                Intrinsics.j(status, "status");
                this.status = status;
            }

            /* renamed from: a, reason: from getter */
            public final W1 getStatus() {
                return this.status;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$m$c;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$m;", "Lxs/b;", "tipOption", "<init>", "(Lxs/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxs/b;", "()Lxs/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.z1$m$c, reason: from toString */
        public static final /* data */ class SetSelectedTipOption extends m {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final EnumC18092b tipOption;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetSelectedTipOption) && this.tipOption == ((SetSelectedTipOption) other).tipOption;
            }

            public int hashCode() {
                return this.tipOption.hashCode();
            }

            public String toString() {
                return "SetSelectedTipOption(tipOption=" + this.tipOption + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetSelectedTipOption(EnumC18092b tipOption) {
                super(null);
                Intrinsics.j(tipOption, "tipOption");
                this.tipOption = tipOption;
            }

            /* renamed from: a, reason: from getter */
            public final EnumC18092b getTipOption() {
                return this.tipOption;
            }
        }

        public /* synthetic */ m(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private m() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[W1.values().length];
            try {
                iArr[W1.f104663b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[W1.f104664c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[W1.f104662a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewModel", f = "CheckoutViewModel.kt", l = {354}, m = "buildAcculynkPostBody")
    static final class o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f105178a;

        /* renamed from: b, reason: collision with root package name */
        Object f105179b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f105180c;

        /* renamed from: e, reason: collision with root package name */
        int f105182e;

        o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f105180c = obj;
            this.f105182e |= Integer.MIN_VALUE;
            return z1.this.a0(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewModel$cancelOrder$1", f = "CheckoutViewModel.kt", l = {1033}, m = "invokeSuspend")
    static final class p extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f105183a;

        /* renamed from: b, reason: collision with root package name */
        int f105184b;

        /* renamed from: c, reason: collision with root package name */
        int f105185c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f105186d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ OrderDetail f105188f;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            p pVar = z1.this.new p(this.f105188f, continuation);
            pVar.f105186d = obj;
            return pVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(OrderDetail orderDetail, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f105188f = orderDetail;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((p) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r7.f105185c
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 != r3) goto L1a
                java.lang.Object r0 = r7.f105183a
                qv.O r0 = (qv.InterfaceC16622O) r0
                java.lang.Object r0 = r7.f105186d
                qv.O r0 = (qv.InterfaceC16622O) r0
                kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L18
                goto L44
            L18:
                r8 = move-exception
                goto L4f
            L1a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L22:
                kotlin.ResultKt.b(r8)
                java.lang.Object r8 = r7.f105186d
                qv.O r8 = (qv.InterfaceC16622O) r8
                com.meijer.mobile.meijer.activity.checkout.review.z1 r1 = com.meijer.mobile.meijer.activity.checkout.review.z1.this
                gj.c r4 = r7.f105188f
                kotlin.Result$Companion r5 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L4b
                com.meijer.mobile.digitalshopping.api.orders.a r1 = com.meijer.mobile.meijer.activity.checkout.review.z1.K(r1)     // Catch: java.lang.Throwable -> L4b
                r7.f105186d = r8     // Catch: java.lang.Throwable -> L4b
                r7.f105183a = r8     // Catch: java.lang.Throwable -> L4b
                r7.f105184b = r2     // Catch: java.lang.Throwable -> L4b
                r7.f105185c = r3     // Catch: java.lang.Throwable -> L4b
                java.lang.Object r1 = r1.n(r4, r7)     // Catch: java.lang.Throwable -> L4b
                if (r1 != r0) goto L42
                return r0
            L42:
                r0 = r8
                r8 = r1
            L44:
                java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L18
                java.lang.Object r8 = kotlin.Result.b(r8)     // Catch: java.lang.Throwable -> L18
                goto L59
            L4b:
                r0 = move-exception
                r6 = r0
                r0 = r8
                r8 = r6
            L4f:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r8 = kotlin.ResultKt.a(r8)
                java.lang.Object r8 = kotlin.Result.b(r8)
            L59:
                com.meijer.mobile.meijer.activity.checkout.review.z1 r1 = com.meijer.mobile.meijer.activity.checkout.review.z1.this
                boolean r3 = kotlin.Result.h(r8)
                if (r3 == 0) goto L70
                r3 = r8
                java.lang.String r3 = (java.lang.String) r3
                com.meijer.mobile.meijer.activity.checkout.review.z1.V(r1)
                Lk.b r1 = r1.g0()
                com.meijer.mobile.meijer.activity.checkout.review.z1$j$a r3 = com.meijer.mobile.meijer.activity.checkout.review.z1.j.a.f105143a
                r1.a(r3)
            L70:
                com.meijer.mobile.meijer.activity.checkout.review.z1 r1 = com.meijer.mobile.meijer.activity.checkout.review.z1.this
                java.lang.Throwable r8 = kotlin.Result.e(r8)
                if (r8 == 0) goto L91
                kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
                qv.E0.i(r0)
                boolean r0 = r8 instanceof java.lang.Error
                if (r0 != 0) goto L90
                uw.a$a r0 = uw.a.INSTANCE
                java.lang.String r3 = "Error cancelling order in CheckoutViewModel"
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r0.f(r8, r3, r2)
                com.meijer.mobile.meijer.activity.checkout.review.z1.V(r1)
                goto L91
            L90:
                throw r8
            L91:
                kotlin.Unit r8 = kotlin.Unit.f142422a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.z1.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewModel$checkAgeRestrictedItemInCart$1", f = "CheckoutViewModel.kt", l = {745}, m = "invokeSuspend")
    static final class q extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f105189a;

        /* renamed from: b, reason: collision with root package name */
        int f105190b;

        /* renamed from: c, reason: collision with root package name */
        int f105191c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f105192d;

        q(Continuation<? super q> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            q qVar = z1.this.new q(continuation);
            qVar.f105192d = obj;
            return qVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r5.f105191c
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r5.f105189a
                qv.O r0 = (qv.InterfaceC16622O) r0
                java.lang.Object r0 = r5.f105192d
                qv.O r0 = (qv.InterfaceC16622O) r0
                kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L17
                goto L48
            L17:
                r6 = move-exception
                goto L53
            L19:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L21:
                kotlin.ResultKt.b(r6)
                java.lang.Object r6 = r5.f105192d
                qv.O r6 = (qv.InterfaceC16622O) r6
                com.meijer.mobile.meijer.activity.checkout.review.z1 r1 = com.meijer.mobile.meijer.activity.checkout.review.z1.this
                r3 = 0
                com.meijer.mobile.meijer.activity.checkout.review.z1.X(r1, r2, r3, r3, r2)
                com.meijer.mobile.meijer.activity.checkout.review.z1 r1 = com.meijer.mobile.meijer.activity.checkout.review.z1.this
                kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L4f
                hl.m r1 = com.meijer.mobile.meijer.activity.checkout.review.z1.I(r1)     // Catch: java.lang.Throwable -> L4f
                r5.f105192d = r6     // Catch: java.lang.Throwable -> L4f
                r5.f105189a = r6     // Catch: java.lang.Throwable -> L4f
                r3 = 0
                r5.f105190b = r3     // Catch: java.lang.Throwable -> L4f
                r5.f105191c = r2     // Catch: java.lang.Throwable -> L4f
                java.lang.Object r1 = r1.S(r5)     // Catch: java.lang.Throwable -> L4f
                if (r1 != r0) goto L46
                return r0
            L46:
                r0 = r6
                r6 = r1
            L48:
                il.a r6 = (il.AgeRestrictedItemResult) r6     // Catch: java.lang.Throwable -> L17
                java.lang.Object r6 = kotlin.Result.b(r6)     // Catch: java.lang.Throwable -> L17
                goto L5d
            L4f:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
            L53:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r6 = kotlin.ResultKt.a(r6)
                java.lang.Object r6 = kotlin.Result.b(r6)
            L5d:
                com.meijer.mobile.meijer.activity.checkout.review.z1 r1 = com.meijer.mobile.meijer.activity.checkout.review.z1.this
                boolean r2 = kotlin.Result.h(r6)
                if (r2 == 0) goto L6b
                r2 = r6
                il.a r2 = (il.AgeRestrictedItemResult) r2
                com.meijer.mobile.meijer.activity.checkout.review.z1.Q(r1, r2)
            L6b:
                com.meijer.mobile.meijer.activity.checkout.review.z1 r1 = com.meijer.mobile.meijer.activity.checkout.review.z1.this
                java.lang.Throwable r6 = kotlin.Result.e(r6)
                if (r6 == 0) goto L83
                kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
                qv.E0.i(r0)
                boolean r0 = r6 instanceof java.lang.Error
                if (r0 != 0) goto L82
                com.meijer.mobile.meijer.activity.checkout.review.z1.P(r1, r6)
                goto L83
            L82:
                throw r6
            L83:
                com.meijer.mobile.meijer.activity.checkout.review.z1 r6 = com.meijer.mobile.meijer.activity.checkout.review.z1.this
                com.meijer.mobile.meijer.activity.checkout.review.z1.V(r6)
                kotlin.Unit r6 = kotlin.Unit.f142422a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.z1.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewModel$onAction$12", f = "CheckoutViewModel.kt", l = {567}, m = "invokeSuspend")
    static final class r extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f105194a;

        r(Continuation<? super r> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return z1.this.new r(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((r) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f105194a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = z1.this._scrollEventFlow;
                com.meijer.mobile.singlepagecheckout.F0 f02 = com.meijer.mobile.singlepagecheckout.F0.f117686a;
                this.f105194a = 1;
                if (interfaceC17139A.emit(f02, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewModel$onAction$13", f = "CheckoutViewModel.kt", l = {571}, m = "invokeSuspend")
    static final class s extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f105196a;

        s(Continuation<? super s> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return z1.this.new s(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((s) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f105196a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = z1.this._scrollEventFlow;
                com.meijer.mobile.singlepagecheckout.D0 d02 = com.meijer.mobile.singlepagecheckout.D0.f117668a;
                this.f105196a = 1;
                if (interfaceC17139A.emit(d02, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewModel$onAction$14", f = "CheckoutViewModel.kt", l = {575}, m = "invokeSuspend")
    static final class t extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f105198a;

        t(Continuation<? super t> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return z1.this.new t(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((t) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f105198a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = z1.this._scrollEventFlow;
                com.meijer.mobile.singlepagecheckout.E0 e02 = com.meijer.mobile.singlepagecheckout.E0.f117675a;
                this.f105198a = 1;
                if (interfaceC17139A.emit(e02, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewModel$onAction$2", f = "CheckoutViewModel.kt", l = {HttpResponseStatus.ERROR_CONFLICT}, m = "invokeSuspend")
    static final class u extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f105200a;

        u(Continuation<? super u> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return z1.this.new u(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((u) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f105200a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                z1 z1Var = z1.this;
                this.f105200a = 1;
                if (z1Var.d1(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewModel$onAction$3", f = "CheckoutViewModel.kt", l = {HttpResponseStatus.ERROR_LENGTH_REQUIRED}, m = "invokeSuspend")
    static final class v extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f105202a;

        v(Continuation<? super v> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return z1.this.new v(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((v) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f105202a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                z1 z1Var = z1.this;
                this.f105202a = 1;
                if (z1Var.e1(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewModel$onAction$5", f = "CheckoutViewModel.kt", l = {442}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class w extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f105204a;

        w(Continuation<? super w> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return z1.this.new w(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((w) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA0;
            String str;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f105204a;
            if (i10 == 0) {
                ResultKt.b(obj);
                z1.this.I0(true);
                z1 z1Var = z1.this;
                this.f105204a = 1;
                objA0 = z1Var.a0(this);
                if (objA0 == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                objA0 = obj;
            }
            String str2 = (String) objA0;
            if (str2 != null) {
                z1 z1Var2 = z1.this;
                InterfaceC17140B interfaceC17140B = z1Var2._viewState;
                while (true) {
                    Object value = interfaceC17140B.getValue();
                    str = str2;
                    if (interfaceC17140B.e(value, CheckoutViewState.b((CheckoutViewState) value, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, false, null, null, false, str2, a.e.API_PRIORITY_OTHER, null))) {
                        break;
                    }
                    str2 = str;
                }
                z1Var2.g0().a(new j.ShowEBTPinPadEvent(str));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewModel$onNewCheckoutState$2", f = "CheckoutViewModel.kt", l = {HttpResponseStatus.SUCCESS_PARTIAL_CONTENT}, m = "invokeSuspend")
    static final class x extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f105206a;

        /* renamed from: b, reason: collision with root package name */
        int f105207b;

        /* renamed from: c, reason: collision with root package name */
        int f105208c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f105209d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ CheckoutState f105211f;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            x xVar = z1.this.new x(this.f105211f, continuation);
            xVar.f105209d = obj;
            return xVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(CheckoutState checkoutState, Continuation<? super x> continuation) {
            super(2, continuation);
            this.f105211f = checkoutState;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((x) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r11.f105208c
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r11.f105206a
                qv.O r0 = (qv.InterfaceC16622O) r0
                java.lang.Object r0 = r11.f105209d
                qv.O r0 = (qv.InterfaceC16622O) r0
                kotlin.ResultKt.b(r12)     // Catch: java.lang.Throwable -> L17
                goto L42
            L17:
                r12 = move-exception
                goto L4d
            L19:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L21:
                kotlin.ResultKt.b(r12)
                java.lang.Object r12 = r11.f105209d
                qv.O r12 = (qv.InterfaceC16622O) r12
                com.meijer.mobile.meijer.activity.checkout.review.z1 r1 = com.meijer.mobile.meijer.activity.checkout.review.z1.this
                kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L49
                Bh.e r1 = com.meijer.mobile.meijer.activity.checkout.review.z1.L(r1)     // Catch: java.lang.Throwable -> L49
                r11.f105209d = r12     // Catch: java.lang.Throwable -> L49
                r11.f105206a = r12     // Catch: java.lang.Throwable -> L49
                r3 = 0
                r11.f105207b = r3     // Catch: java.lang.Throwable -> L49
                r11.f105208c = r2     // Catch: java.lang.Throwable -> L49
                java.lang.Object r1 = r1.i(r11)     // Catch: java.lang.Throwable -> L49
                if (r1 != r0) goto L40
                return r0
            L40:
                r0 = r12
                r12 = r1
            L42:
                java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Throwable -> L17
                java.lang.Object r12 = kotlin.Result.b(r12)     // Catch: java.lang.Throwable -> L17
                goto L57
            L49:
                r0 = move-exception
                r10 = r0
                r0 = r12
                r12 = r10
            L4d:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r12 = kotlin.ResultKt.a(r12)
                java.lang.Object r12 = kotlin.Result.b(r12)
            L57:
                com.meijer.mobile.meijer.activity.checkout.review.z1 r1 = com.meijer.mobile.meijer.activity.checkout.review.z1.this
                jl.v r3 = r11.f105211f
                boolean r4 = kotlin.Result.h(r12)
                if (r4 == 0) goto La0
                r4 = r12
                java.util.List r4 = (java.util.List) r4
                yo.k r5 = com.meijer.mobile.meijer.activity.checkout.review.z1.M(r1)
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.Iterator r4 = r4.iterator()
            L6e:
                boolean r6 = r4.hasNext()
                r7 = 0
                if (r6 == 0) goto L8d
                java.lang.Object r6 = r4.next()
                r8 = r6
                Dh.k r8 = (Dh.CustomerPreference) r8
                java.lang.String r8 = r8.getPreferenceTypeName()
                Dh.r r9 = Dh.r.f6569e
                java.lang.String r9 = r9.getPreferenceTypeName()
                boolean r8 = kotlin.text.StringsKt.H(r8, r9, r2)
                if (r8 == 0) goto L6e
                goto L8e
            L8d:
                r6 = r7
            L8e:
                Dh.k r6 = (Dh.CustomerPreference) r6
                if (r6 == 0) goto L96
                java.lang.String r7 = r6.getPreferenceValue()
            L96:
                if (r7 != 0) goto L9a
                java.lang.String r7 = ""
            L9a:
                r5.U(r7)
                com.meijer.mobile.meijer.activity.checkout.review.z1.U(r1, r3)
            La0:
                java.lang.Throwable r12 = kotlin.Result.e(r12)
                if (r12 == 0) goto Lb8
                kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
                qv.E0.i(r0)
                boolean r0 = r12 instanceof java.lang.Error
                if (r0 != 0) goto Lb7
                uw.a$a r0 = uw.a.INSTANCE
                r0.e(r12)
                goto Lb8
            Lb7:
                throw r12
            Lb8:
                kotlin.Unit r12 = kotlin.Unit.f142422a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.z1.x.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewModel$removeEBTCard$1$1", f = "CheckoutViewModel.kt", l = {1231, 1246}, m = "invokeSuspend")
    static final class y extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f105212a;

        /* renamed from: b, reason: collision with root package name */
        int f105213b;

        /* renamed from: c, reason: collision with root package name */
        int f105214c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f105215d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ MultiTenderPaymentOption f105217f;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            y yVar = z1.this.new y(this.f105217f, continuation);
            yVar.f105215d = obj;
            return yVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(MultiTenderPaymentOption multiTenderPaymentOption, Continuation<? super y> continuation) {
            super(2, continuation);
            this.f105217f = multiTenderPaymentOption;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((y) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:(1:(3:6|42|43)(2:7|8))(4:9|44|10|11))(8:14|48|15|16|46|17|(1:20)|41)|50|21|30|(1:32)|33|(2:35|(1:37)(1:38))|39|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00c2, code lost:
        
            if (qv.Z.b(1000, r14) == r1) goto L41;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.z1.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewModel$setFulfillmentDefaults$1", f = "CheckoutViewModel.kt", l = {335}, m = "invokeSuspend")
    static final class z extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f105218a;

        z(Continuation<? super z> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return z1.this.new z(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((z) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f105218a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                jl.t tVar = z1.this.checkoutRepository;
                n.Pickup pickup = new n.Pickup(null, 1, null);
                this.f105218a = 1;
                if (tVar.x(pickup, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    private final void b0(OrderDetail order) {
        b1(true, null, null, true);
        C16648k.d(androidx.view.d0.a(this), null, null, new p(order, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d1(Continuation<? super Unit> continuation) throws Throwable {
        if (!q0(this, null, 1, null)) {
            Object objE1 = e1(continuation);
            return objE1 == IntrinsicsKt.f() ? objE1 : Unit.f142422a;
        }
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        AbstractC5607a abstractC5607aD = companion.d(com.meijer.mobile.meijer.Y.f99835U0, new Object[0]);
        AbstractC5607a abstractC5607aD2 = companion.d(com.meijer.mobile.meijer.Y.f99816T0, new Object[0]);
        if (Intrinsics.e(this.flow.c().getValue().getFulfillmentMode().getDeliveryMode(), "delivery")) {
            abstractC5607aD = companion.d(com.meijer.mobile.meijer.Y.f99797S0, new Object[0]);
            abstractC5607aD2 = companion.d(com.meijer.mobile.meijer.Y.f99778R0, new Object[0]);
        }
        this.flow.a(new j.ShowFutureTimeslotAlert(abstractC5607aD, abstractC5607aD2));
        return Unit.f142422a;
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/D1;", "it", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/review/D1;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewModel$5", f = "CheckoutViewModel.kt", l = {}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<CheckoutViewState, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f105107a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f105108b;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = z1.this.new e(continuation);
            eVar.f105108b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CheckoutViewState checkoutViewState, Continuation<? super Unit> continuation) {
            return ((e) create(checkoutViewState, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f105107a == 0) {
                ResultKt.b(obj);
                z1.this.g0().d((CheckoutViewState) this.f105108b);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public z1(jl.t checkoutRepository, hl.m cartRepository, com.meijer.mobile.digitalshopping.api.orders.a ordersRepository, yo.k userManager, jl.d checkoutFlowRepository, Bh.e profileRepository, InterfaceC14261a analyticsEngine, Ro.a productAnalytics, yl.k featureManager, Hp.c bvPixelEventManager, Xi.a userTokenProvider) {
        Intrinsics.j(checkoutRepository, "checkoutRepository");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(ordersRepository, "ordersRepository");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(checkoutFlowRepository, "checkoutFlowRepository");
        Intrinsics.j(profileRepository, "profileRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(productAnalytics, "productAnalytics");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(bvPixelEventManager, "bvPixelEventManager");
        Intrinsics.j(userTokenProvider, "userTokenProvider");
        this.checkoutRepository = checkoutRepository;
        this.cartRepository = cartRepository;
        this.ordersRepository = ordersRepository;
        this.userManager = userManager;
        this.profileRepository = profileRepository;
        this.analyticsEngine = analyticsEngine;
        this.productAnalytics = productAnalytics;
        this.featureManager = featureManager;
        this.bvPixelEventManager = bvPixelEventManager;
        this.userTokenProvider = userTokenProvider;
        int i10 = -1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        PaymentOption paymentOption = null;
        MultiTenderPaymentOption multiTenderPaymentOption = null;
        CartOrderSummaryDecorator c11756n0 = null;
        Q1 q12 = null;
        FulfillmentSlotInfoDecorator r12 = null;
        StoreDecorator x12 = null;
        PickupPersonDecorator u12 = null;
        AddressDecorator c11938a = null;
        DeliveryInstructionsDecorator deliveryInstructionsDecorator = null;
        boolean z10 = false;
        ContactInformationDecorator contactInformationDecorator = null;
        CartItemsDecorator c11997u = null;
        SubstitutionPreferenceDecorator substitutionPreferenceDecorator = null;
        AddressDecorator c11938a2 = null;
        AddressFormDecorator addressFormDecorator = null;
        EbtCardDetailsDecorator ebtCardDetailsDecorator = null;
        CardDetailsDecorator c11986q = null;
        CreditCardChargesDecorator l12 = null;
        EbtCardChargesDecorator n12 = null;
        boolean z11 = false;
        LoadingState loadingState = null;
        CheckoutFlowState fVar = null;
        CheckoutAnimations c11948d0 = null;
        Boolean bool = null;
        PreTipDecorator preTipDecorator = null;
        AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = null;
        boolean z12 = false;
        boolean z13 = false;
        String str = null;
        CheckoutErrorDialogDecorator checkoutErrorDialogDecorator = null;
        boolean z14 = false;
        String str2 = null;
        InterfaceC17140B<CheckoutViewState> interfaceC17140BA = tv.S.a(new CheckoutViewState(paymentOption, multiTenderPaymentOption, c11756n0, q12, r12, x12, u12, c11938a, deliveryInstructionsDecorator, z10, contactInformationDecorator, c11997u, substitutionPreferenceDecorator, c11938a2, addressFormDecorator, ebtCardDetailsDecorator, c11986q, l12, n12, z11, loadingState, fVar, c11948d0, bool, preTipDecorator, adjustEbtPaymentDecorator, z12, z13, str, checkoutErrorDialogDecorator, z14, str2, i10, defaultConstructorMarker));
        this._viewState = interfaceC17140BA;
        this.flow = new Lk.b<>(new CheckoutViewState(paymentOption, multiTenderPaymentOption, c11756n0, q12, r12, x12, u12, c11938a, deliveryInstructionsDecorator, z10, contactInformationDecorator, c11997u, substitutionPreferenceDecorator, c11938a2, addressFormDecorator, ebtCardDetailsDecorator, c11986q, l12, n12, z11, loadingState, fVar, c11948d0, bool, preTipDecorator, adjustEbtPaymentDecorator, z12, z13, str, checkoutErrorDialogDecorator, z14, str2, i10, defaultConstructorMarker));
        InterfaceC17139A<com.meijer.mobile.singlepagecheckout.C0> interfaceC17139AB = C17146H.b(0, 0, null, 7, null);
        this._scrollEventFlow = interfaceC17139AB;
        this.scrollEventFlow = C17154h.b(interfaceC17139AB);
        Nu.a aVar = new Nu.a();
        this.disposables = aVar;
        this.cartId = "";
        InterfaceC17140B<Boolean> interfaceC17140BA2 = tv.S.a(Boolean.FALSE);
        this._orderSubmitted = interfaceC17140BA2;
        this.orderSubmitted = C17154h.c(interfaceC17140BA2);
        io.reactivex.l<CheckoutState> lVarDistinctUntilChanged = checkoutRepository.s().distinctUntilChanged();
        final C12014a c12014a = new C12014a(this);
        Pu.g<? super CheckoutState> gVar = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.review.w1
            @Override // Pu.g
            public final void accept(Object obj) {
                z1.B(c12014a, obj);
            }
        };
        a.Companion companion = uw.a.INSTANCE;
        final b bVar = new b(companion);
        Ck.a.a(lVarDistinctUntilChanged.subscribe(gVar, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.review.x1
            @Override // Pu.g
            public final void accept(Object obj) {
                z1.C(bVar, obj);
            }
        }), aVar);
        io.reactivex.l<CheckoutFlowState> lVarG = checkoutFlowRepository.g();
        final c cVar = new c(this);
        Pu.g<? super CheckoutFlowState> gVar2 = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.review.y1
            @Override // Pu.g
            public final void accept(Object obj) {
                z1.D(cVar, obj);
            }
        };
        final d dVar = new d(companion);
        Ck.a.a(lVarG.subscribe(gVar2, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.review.m1
            @Override // Pu.g
            public final void accept(Object obj) {
                z1.E(dVar, obj);
            }
        }), aVar);
        C17154h.J(C17154h.g(C17154h.O(interfaceC17140BA, new e(null)), new f(null)), androidx.view.d0.a(this));
        io.reactivex.l<String> lVarSubscribeOn = cartRepository.N().subscribeOn(C14764a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.review.n1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z1.F(this.f104987a, (String) obj);
            }
        };
        Pu.g<? super String> gVar3 = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.review.o1
            @Override // Pu.g
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final g gVar4 = new g(companion);
        Ck.a.a(lVarSubscribeOn.subscribe(gVar3, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.review.p1
            @Override // Pu.g
            public final void accept(Object obj) {
                z1.G(gVar4, obj);
            }
        }), aVar);
    }

    private final void A0() {
        Lk.b<CheckoutViewState, j> bVar = this.flow;
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        bVar.a(new j.ShowAgeRestrictedDialog(companion.d(C17135b.f161972F, new Object[0]), companion.d(C17135b.f161970E, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100384vg, new Object[0]), null, false));
    }

    private final void B0(Throwable throwable) {
        RetrofitException retrofitExceptionA;
        if (throwable == null || (retrofitExceptionA = com.meijer.mobile.core.networking.exceptions.a.a(throwable)) == null) {
            return;
        }
        uw.a.INSTANCE.e(retrofitExceptionA);
        Lk.b<CheckoutViewState, j> bVar = this.flow;
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        bVar.a(new j.ShowAgeRestrictedDialog(companion.d(com.meijer.mobile.meijer.Y.f99758Q, new Object[0]), null, companion.d(yr.Q.f170986b, new Object[0]), retrofitExceptionA, false));
    }

    private final void C0() {
        MultiTenderPaymentOption multiTenderPaymentOption = this._viewState.getValue().getMultiTenderPaymentOption();
        if (multiTenderPaymentOption != null) {
            C16648k.d(androidx.view.d0.a(this), null, null, new y(multiTenderPaymentOption, null), 3, null);
        }
    }

    private final void D0(OrderDetail orderDetail) {
        CheckoutViewState value;
        CheckoutViewState checkoutViewState;
        InterfaceC17140B<CheckoutViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            checkoutViewState = value;
        } while (!interfaceC17140B.e(value, checkoutViewState));
        Hp.c cVar = this.bvPixelEventManager;
        List<Entry> listU = orderDetail.u();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listU, 10));
        Iterator<T> it = listU.iterator();
        while (it.hasNext()) {
            arrayList.add(T0((Entry) it.next()));
        }
        double value2 = checkoutViewState.getPricingSummary().getTotalTax().getValue();
        String currencyIso = checkoutViewState.getPricingSummary().getSubtotal().getCurrencyIso();
        if (currencyIso == null) {
            currencyIso = "";
        }
        this.bvPixelEventManager.b(cVar.a(arrayList, new BVOrderTransactionExtras(value2, currencyIso, orderDetail.getCode(), orderDetail.getDeliveryCost().getValue(), checkoutViewState.getPricingSummary().getSubtotal().getValue(), checkoutViewState.getPricingSummary().getTotalSavings().getValue())));
    }

    private final void E0(CheckoutAnimations checkoutAnimations) {
        CheckoutViewState value;
        InterfaceC17140B<CheckoutViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, CheckoutViewState.b(value, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, checkoutAnimations, null, null, null, false, false, null, null, false, null, -4194305, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I0(boolean isEbtPinPadProcessing) {
        CheckoutViewState value;
        InterfaceC17140B<CheckoutViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, CheckoutViewState.b(value, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, isEbtPinPadProcessing, false, null, null, false, null, -67108865, null)));
    }

    private final void L0(CheckoutState checkoutState) {
        CheckoutViewState value;
        CheckoutViewState checkoutViewState;
        PreTipDecorator preTipDecorator;
        List listM;
        mk.b totalPriceWithTax;
        DeliveryMode deliveryModeE = checkoutState.m().e();
        boolean zE = Intrinsics.e(deliveryModeE != null ? deliveryModeE.getCode() : null, "delivery");
        ShoppingCart shoppingCartE = checkoutState.i().e();
        double value2 = (shoppingCartE == null || (totalPriceWithTax = shoppingCartE.getTotalPriceWithTax()) == null) ? 0.0d : totalPriceWithTax.getValue();
        InterfaceC17140B<CheckoutViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            checkoutViewState = value;
            preTipDecorator = checkoutViewState.getPreTipDecorator();
            if (zE) {
                List<EnumC18092b> listC = TipSuggestionButtonDecorator.INSTANCE.c(Double.valueOf(value2), this.featureManager.e(AbstractC18227f.i0.f170583h));
                listM = new ArrayList(CollectionsKt.x(listC, 10));
                for (EnumC18092b enumC18092b : listC) {
                    listM.add(TipSuggestionButtonDecorator.INSTANCE.b(checkoutViewState.getPreTipDecorator().getSelectedTipOption().getPosition() == enumC18092b.getPosition(), enumC18092b, value2));
                }
            } else {
                listM = CollectionsKt.m();
            }
        } while (!interfaceC17140B.e(value, CheckoutViewState.b(checkoutViewState, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, PreTipDecorator.b(preTipDecorator, null, value2, null, listM, 0.0d, checkoutViewState.getPreTipDecorator().getConfirmedTipInfo().getTipOption().getHasFormatArgs() ? new ConfirmedTipInfo(checkoutViewState.getPreTipDecorator().getConfirmedTipInfo().getTipOption().getValue() * value2, checkoutViewState.getPreTipDecorator().getConfirmedTipInfo().getTipOption()) : checkoutViewState.getPreTipDecorator().getConfirmedTipInfo(), this.featureManager.e(AbstractC18227f.i0.f170583h), 21, null), null, false, false, null, null, false, null, -16777217, null)));
    }

    private final void M0(CheckoutErrorDialogDecorator checkoutErrorDialogDecorator) {
        CheckoutViewState value;
        b1(true, AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99907Xf, new Object[0]), null, true);
        InterfaceC17140B<CheckoutViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, CheckoutViewState.b(value, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, false, null, checkoutErrorDialogDecorator, false, null, -536870913, null)));
        this.flow.a(new j.SubmitOrderErrorEvent(null, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0() {
        CheckoutViewState value;
        InterfaceC17140B<CheckoutViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, CheckoutViewState.b(value, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, new LoadingState(false, null, null, false, 8, null), null, null, null, null, null, false, false, null, null, false, null, -1048577, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O0(kotlin.coroutines.Continuation<? super kotlin.Unit> r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.z1.O0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P0(z1 z1Var, Ref.IntRef intRef, Long l10) {
        CheckoutViewState value;
        CheckoutViewState checkoutViewState;
        AbstractC5607a abstractC5607aD;
        int i10;
        InterfaceC17140B<CheckoutViewState> interfaceC17140B = z1Var._viewState;
        do {
            value = interfaceC17140B.getValue();
            checkoutViewState = value;
            int i11 = intRef.f142833a;
            abstractC5607aD = i11 < 4 ? AbstractC5607a.INSTANCE.d(f105074z.get(i11).intValue(), new Object[0]) : AbstractC5607a.INSTANCE.d(((Number) CollectionsKt.D0(f105074z)).intValue(), new Object[0]);
            i10 = intRef.f142833a;
        } while (!interfaceC17140B.e(value, CheckoutViewState.b(checkoutViewState, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, new LoadingState(true, abstractC5607aD, i10 < 4 ? AbstractC5607a.INSTANCE.d(f105071A.get(i10).intValue(), new Object[0]) : AbstractC5607a.INSTANCE.d(((Number) CollectionsKt.D0(f105071A)).intValue(), new Object[0]), false, 8, null), null, null, null, null, null, false, false, null, null, false, null, -1048577, null)));
        intRef.f142833a++;
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R0(Throwable th2) {
        uw.a.INSTANCE.e(th2);
        return Unit.f142422a;
    }

    private final void U0() {
        this.analyticsEngine.h(C14476c.a("Adjust Amount"), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.review.u1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z1.V0(this.f105040a, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V0(z1 z1Var, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.e(gl.c.f133775a.a("fulfillmentType", z1Var._viewState.getValue().getFulfillmentMode().getDeliveryMode()));
        return Unit.f142422a;
    }

    private final void W0(boolean isContinue) {
        CheckoutViewState value = this._viewState.getValue();
        String deliveryMode = value.getFulfillmentMode().getDeliveryMode();
        List<EntryDecorator> listD = value.getCartItems().d();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listD, 10));
        for (EntryDecorator entryDecorator : listD) {
            arrayList.add(new W.Details(entryDecorator.getUpc(), null, null, Double.valueOf(entryDecorator.getQuantity()), Double.valueOf(entryDecorator.getTotalPrice()), null, null, Boolean.valueOf(entryDecorator.getIsAlcohol()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65690, 16383, null));
        }
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        Ao.A a10 = Ao.A.f1157a;
        String strF0 = f0(deliveryMode);
        String strB = value.getFulfillmentSlot().getDateForAdobeTag();
        if (strB == null) {
            strB = "";
        }
        String strE = value.getFulfillmentSlot().getTimeForAdobeTag();
        if (strE == null) {
            strE = "";
        }
        interfaceC14261a.e(a10.p(strF0, strB, strE, isContinue, value.getPricingSummary().getEstimatedTotal().getFormattedValue(), this.cartId, arrayList));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void X0(boolean r65) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.z1.X0(boolean):void");
    }

    static /* synthetic */ void Y0(z1 z1Var, boolean z10, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        z1Var.X0(z10);
    }

    private final void Z0(final String errorMessage) {
        this.analyticsEngine.h(C14476c.a("ebt error"), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.review.t1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z1.a1(errorMessage, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a0(kotlin.coroutines.Continuation<? super java.lang.String> r33) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.z1.a0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a1(String str, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        gl.c cVar = gl.c.f133775a;
        if (str == null) {
            str = "";
        }
        track.e(cVar.b(str));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b1(boolean isLoading, AbstractC5607a loadingMessage, AbstractC5607a loadingBody, boolean spinnerVisible) {
        CheckoutViewState value;
        InterfaceC17140B<CheckoutViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, CheckoutViewState.b(value, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, new LoadingState(isLoading, loadingMessage, loadingBody, spinnerVisible), null, null, null, null, null, false, false, null, null, false, null, -1048577, null)));
    }

    private final CheckoutErrorDialogDecorator d0(InterfaceC16987a interfaceC16987a) {
        return Intrinsics.e(interfaceC16987a != null ? interfaceC16987a.getReason() : null, "paymentAuthorizationError") ? new CheckoutErrorDialogDecorator(com.meijer.mobile.meijer.Y.f99888Wf, com.meijer.mobile.meijer.Y.f99869Vf, com.meijer.mobile.meijer.Y.f99850Uf, new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.v1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z1.e0(this.f105048a);
            }
        }) : new CheckoutErrorDialogDecorator(0, 0, 0, null, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e0(z1 z1Var) {
        z1Var.flow.a(j.d.f105150a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e1(Continuation<? super Unit> continuation) throws Throwable {
        if (this.flow.c().getValue().getIsValid()) {
            Object objO0 = O0(continuation);
            return objO0 == IntrinsicsKt.f() ? objO0 : Unit.f142422a;
        }
        this.flow.a(new j.SubmitOrderErrorEvent(Boxing.d(yr.Q.f170986b), false));
        return Unit.f142422a;
    }

    private final String f0(String deliveryMode) {
        return Intrinsics.e(deliveryMode, "delivery") ? "deliveryDate" : "pickupDate";
    }

    private final String l0(String deliveryMode, PickupPersonDecorator pickUpPerson, ContactInformationDecorator contactInformation) {
        String emailAddress;
        if (Intrinsics.e(deliveryMode, "pickup")) {
            emailAddress = pickUpPerson != null ? pickUpPerson.getEmail() : null;
            return emailAddress == null ? "" : emailAddress;
        }
        emailAddress = contactInformation != null ? contactInformation.getEmailAddress() : null;
        return emailAddress == null ? "" : emailAddress;
    }

    private final boolean p0(LocalDate now) {
        String strB = this._viewState.getValue().getFulfillmentSlot().getDateForAdobeTag();
        LocalDate localDate = strB != null ? (LocalDate) vk.d.b(strB, C17590a.DATE_FORMAT_MM_DD_YYYY, new Ch.a()) : null;
        if (localDate == null || now.getYear() != localDate.getYear()) {
            return true;
        }
        WeekFields weekFields = WeekFields.ISO;
        return now.get(weekFields.weekOfYear()) != localDate.get(weekFields.weekOfYear());
    }

    static /* synthetic */ boolean q0(z1 z1Var, LocalDate localDate, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localDate = LocalDate.now();
        }
        return z1Var.p0(localDate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0(CheckoutFlowState checkoutFlowState) {
        CheckoutViewState value;
        InterfaceC17140B<CheckoutViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, CheckoutViewState.b(value, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, checkoutFlowState, null, null, null, null, false, false, null, null, false, null, -2097153, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(CheckoutState checkoutState) throws IOException {
        CheckoutViewState value;
        InterfaceC17140B<CheckoutViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, new C11970k1(checkoutState, this.featureManager).b(value)));
        ShoppingCart shoppingCartE = checkoutState.i().e();
        this.isBopasEligibleCart = shoppingCartE != null ? Boolean.valueOf(shoppingCartE.M()) : null;
        if (this.userManager.r().length() == 0) {
            C16648k.d(androidx.view.d0.a(this), null, null, new x(checkoutState, null), 3, null);
        } else {
            K0(checkoutState);
        }
        G0(checkoutState);
        L0(checkoutState);
    }

    private final void x0(Throwable throwable) {
        CheckoutErrorDialogDecorator checkoutErrorDialogDecorator;
        DigitalShoppingApiException digitalShoppingApiException = throwable instanceof DigitalShoppingApiException ? (DigitalShoppingApiException) throwable : null;
        if (digitalShoppingApiException == null || (checkoutErrorDialogDecorator = d0(digitalShoppingApiException.getDetails())) == null) {
            checkoutErrorDialogDecorator = new CheckoutErrorDialogDecorator(0, 0, 0, null, 15, null);
        }
        uw.a.INSTANCE.f(throwable, "Unable to submit order", new Object[0]);
        if (this._viewState.getValue().getEbtCardCharges() != null) {
            Z0(throwable.getMessage());
        }
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        b1(true, companion.d(com.meijer.mobile.meijer.Y.f99851Ug, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f99832Tg, new Object[0]), false);
        if (Intrinsics.e(throwable.getMessage(), "Time slot is no longer available")) {
            this.flow.a(new j.SubmitOrderErrorEvent(Integer.valueOf(com.meijer.mobile.meijer.Y.f99813Sg), true));
            return;
        }
        E0(null);
        N0();
        M0(checkoutErrorDialogDecorator);
    }

    public final void F0(boolean value) {
        this.showEbtEnterPinLoadingScreen = value;
    }

    public final void H0(boolean value) {
        this.isCheckForAgeRestrictedItemDone = value;
    }

    public final void J0(boolean value) {
        this._orderSubmitted.setValue(Boolean.valueOf(value));
    }

    public final BVOrderItem T0(Entry entry) {
        Intrinsics.j(entry, "<this>");
        return new BVOrderItem(entry.m().getCode(), entry.m().getName(), entry.getTotalPrice().getValue(), MathKt.c(entry.getQuantity()));
    }

    public final void c1(String timerString) {
        CheckoutViewState value;
        InterfaceC17140B<CheckoutViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, CheckoutViewState.b(value, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, false, timerString, null, false, null, -268435457, null)));
    }

    public final Lk.b<CheckoutViewState, j> g0() {
        return this.flow;
    }

    public final tv.P<Boolean> h0() {
        return this.orderSubmitted;
    }

    public final InterfaceC17144F<com.meijer.mobile.singlepagecheckout.C0> j0() {
        return this.scrollEventFlow;
    }

    /* renamed from: k0, reason: from getter */
    public final boolean getShowEbtEnterPinLoadingScreen() {
        return this.showEbtEnterPinLoadingScreen;
    }

    public final void n0(Qq.o action, Function1<? super l, Unit> orderSummaryEvent) throws IOException {
        m setPreTipStatus;
        Intrinsics.j(action, "action");
        Intrinsics.j(orderSummaryEvent, "orderSummaryEvent");
        if (action instanceof o.PreTip) {
            o.PreTip preTip = (o.PreTip) action;
            Qq.z actionPreTip = preTip.getActionPreTip();
            if (actionPreTip instanceof z.SetSelectedTipOption) {
                setPreTipStatus = new m.SetSelectedTipOption(((z.SetSelectedTipOption) preTip.getActionPreTip()).getTip());
            } else if (actionPreTip instanceof z.SetCustomTipAmount) {
                setPreTipStatus = new m.SetCustomTipAmount(((z.SetCustomTipAmount) preTip.getActionPreTip()).getAmount());
            } else {
                if (!(actionPreTip instanceof z.SetPreTipStatus)) {
                    throw new NoWhenBranchMatchedException();
                }
                setPreTipStatus = new m.SetPreTipStatus(((z.SetPreTipStatus) preTip.getActionPreTip()).getStatus());
            }
            z0(setPreTipStatus);
            return;
        }
        if (action instanceof o.SetTipOption) {
            o.SetTipOption setTipOption = (o.SetTipOption) action;
            if (setTipOption.getTip() == EnumC18092b.f169909m) {
                z0(new m.SetPreTipStatus(W1.f104663b));
                return;
            } else {
                z0(new m.SetSelectedTipOption(setTipOption.getTip()));
                return;
            }
        }
        if (action instanceof o.SetCustomTip) {
            z0(new m.SetCustomTipAmount(((o.SetCustomTip) action).getAmount()));
            return;
        }
        if (Intrinsics.e(action, o.a.f31306a)) {
            r0(h.C12015a.f105114a);
            orderSummaryEvent.invoke(l.a.f105172a);
        } else if (Intrinsics.e(action, o.b.f31307a)) {
            orderSummaryEvent.invoke(l.c.f105174a);
        } else {
            if (!Intrinsics.e(action, o.f.f31311a)) {
                throw new NoWhenBranchMatchedException();
            }
            orderSummaryEvent.invoke(l.b.f105173a);
        }
    }

    /* renamed from: o0, reason: from getter */
    public final boolean getIsCheckForAgeRestrictedItemDone() {
        return this.isCheckForAgeRestrictedItemDone;
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    public final void r0(h action) throws IOException {
        CheckoutViewState value;
        CheckoutViewState value2;
        CheckoutViewState value3;
        CheckoutViewState value4;
        CheckoutViewState value5;
        h.UpdatePaymentDetails updatePaymentDetails;
        Intrinsics.j(action, "action");
        if (action instanceof h.SetDeliveryInstructions) {
            this.checkoutRepository.t(((h.SetDeliveryInstructions) action).getInstructions());
            return;
        }
        if (action instanceof h.SetSubstitutionPreference) {
            this.checkoutRepository.C(((h.SetSubstitutionPreference) action).getPreference());
            return;
        }
        if (action instanceof h.UpdatePaymentDetails) {
            InterfaceC17140B<CheckoutViewState> interfaceC17140B = this._viewState;
            do {
                value5 = interfaceC17140B.getValue();
                updatePaymentDetails = (h.UpdatePaymentDetails) action;
            } while (!interfaceC17140B.e(value5, CheckoutViewState.b(value5, null, updatePaymentDetails.getMultiTenderPaymentOption(), null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, false, null, null, false, null, -3, null)));
            this.checkoutRepository.Q(updatePaymentDetails.getMultiTenderPaymentOption());
            return;
        }
        if (action instanceof h.r) {
            Y0(this, false, 1, null);
            return;
        }
        if (action instanceof h.SendAdobeActionTag) {
            W0(((h.SendAdobeActionTag) action).getIsContinue());
            return;
        }
        if (action instanceof h.c) {
            c0();
            return;
        }
        if (action instanceof h.j) {
            N0();
            return;
        }
        if (action instanceof h.SubmitOrderAction) {
            if (((h.SubmitOrderAction) action).getValidateAlert()) {
                C16648k.d(androidx.view.d0.a(this), null, null, new u(null), 3, null);
                return;
            } else {
                C16648k.d(androidx.view.d0.a(this), null, null, new v(null), 3, null);
                return;
            }
        }
        if (action instanceof h.w) {
            E0(null);
            N0();
            CheckoutErrorDialogDecorator checkoutErrorDialogDecorator = this._viewState.getValue().getCheckoutErrorDialogDecorator();
            if (checkoutErrorDialogDecorator != null) {
                this.flow.a(new j.ShowErrorDialogEvent(checkoutErrorDialogDecorator));
                return;
            }
            return;
        }
        if (action instanceof h.SetCheckoutAnimations) {
            h.SetCheckoutAnimations setCheckoutAnimations = (h.SetCheckoutAnimations) action;
            E0(setCheckoutAnimations.getCheckoutAnimations());
            if (setCheckoutAnimations.getDisplayAnimations()) {
                return;
            }
            N0();
            return;
        }
        if (action instanceof h.UpdateEbtApprovedAmount) {
            this.checkoutRepository.M(Co.l.f("USD", null, ((h.UpdateEbtApprovedAmount) action).getEbtAmountApproved(), null, 0.0d, null, 58, null));
            return;
        }
        if (action instanceof h.v) {
            C16648k.d(androidx.view.d0.a(this), null, null, new w(null), 3, null);
            return;
        }
        if (action instanceof h.i) {
            I0(false);
            CheckoutViewState value6 = this._viewState.getValue();
            Lk.b<CheckoutViewState, j> bVar = this.flow;
            OrderDetail orderDetail = this.completedOrder;
            String code = orderDetail != null ? orderDetail.getCode() : null;
            String deliveryMode = value6.getFulfillmentMode().getDeliveryMode();
            String strL0 = l0(value6.getFulfillmentMode().getDeliveryMode(), value6.getPickupPerson(), value6.getContactInformation());
            String strC = value6.getStoreDecorator().getCurbsidePartner();
            if (strC == null) {
                strC = "";
            }
            String strG = value6.getStoreDecorator().getPickupHelpNumber();
            if (strG == null) {
                strG = "";
            }
            String strF = value6.getStoreDecorator().getName();
            if (strF == null) {
                strF = "";
            }
            bVar.a(new j.NavigateToOrderConfirmationEvent(code, new OrderConfirmationInfo(deliveryMode, strL0, strC, strG, strF), value6.getIsBopasEligibleCart(), this.sendPreTipAnalytics));
            return;
        }
        if (action instanceof h.f) {
            Lk.b<CheckoutViewState, j> bVar2 = this.flow;
            OrderDetail orderDetail2 = this.completedOrder;
            bVar2.a(new j.NavigateToOrderDetailEvent(orderDetail2 != null ? orderDetail2.getCode() : null, "ebt_not_verified"));
            return;
        }
        if (action instanceof h.x) {
            InterfaceC17140B<CheckoutViewState> interfaceC17140B2 = this._viewState;
            do {
                value4 = interfaceC17140B2.getValue();
            } while (!interfaceC17140B2.e(value4, CheckoutViewState.b(value4, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, true, null, null, false, null, -134217729, null)));
            return;
        }
        if (action instanceof h.d) {
            InterfaceC17140B<CheckoutViewState> interfaceC17140B3 = this._viewState;
            do {
                value3 = interfaceC17140B3.getValue();
            } while (!interfaceC17140B3.e(value3, CheckoutViewState.b(value3, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, false, null, null, false, null, -134217729, null)));
            return;
        }
        if (action instanceof h.C12016b) {
            InterfaceC17140B<CheckoutViewState> interfaceC17140B4 = this._viewState;
            do {
                value2 = interfaceC17140B4.getValue();
            } while (!interfaceC17140B4.e(value2, CheckoutViewState.b(value2, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, false, null, null, false, null, -134217729, null)));
            OrderDetail orderDetail3 = this.completedOrder;
            if (orderDetail3 != null) {
                b0(orderDetail3);
                return;
            }
            return;
        }
        if (action instanceof h.NavigateToOrderConfirmation) {
            h.NavigateToOrderConfirmation navigateToOrderConfirmation = (h.NavigateToOrderConfirmation) action;
            this.flow.a(new j.NavigateToOrderConfirmationEvent(navigateToOrderConfirmation.getOrderId(), navigateToOrderConfirmation.getInformation(), navigateToOrderConfirmation.getIsBopasEligibleCart(), this.sendPreTipAnalytics));
            return;
        }
        if (action instanceof h.C1530h) {
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            b1(true, companion.d(com.meijer.mobile.meijer.Y.f100172l4, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100152k4, new Object[0]), true);
            return;
        }
        if (action instanceof h.g) {
            r0(h.v.f105138a);
            return;
        }
        if (action instanceof h.o) {
            if (this._viewState.getValue().getEbtCardDetails() == null) {
                this.flow.a(j.d.f105150a);
                return;
            } else {
                this.flow.a(j.h.f105160a);
                return;
            }
        }
        if (action instanceof h.p) {
            C0();
            return;
        }
        if (action instanceof h.C12015a) {
            U0();
            return;
        }
        if (action instanceof h.TrackEBTErrorAnalytics) {
            Z0(((h.TrackEBTErrorAnalytics) action).getErrorMessage());
            return;
        }
        if (action instanceof h.e) {
            InterfaceC17140B<CheckoutViewState> interfaceC17140B5 = this._viewState;
            do {
                value = interfaceC17140B5.getValue();
            } while (!interfaceC17140B5.e(value, CheckoutViewState.b(value, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, false, null, null, false, "", a.e.API_PRIORITY_OTHER, null)));
            r0(h.C1530h.f105121a);
            return;
        }
        if (Intrinsics.e(action, h.m.f105126a)) {
            C16648k.d(androidx.view.d0.a(this), null, null, new r(null), 3, null);
        } else if (Intrinsics.e(action, h.k.f105124a)) {
            C16648k.d(androidx.view.d0.a(this), null, null, new s(null), 3, null);
        } else {
            if (!Intrinsics.e(action, h.l.f105125a)) {
                throw new NoWhenBranchMatchedException();
            }
            C16648k.d(androidx.view.d0.a(this), null, null, new t(null), 3, null);
        }
    }

    public final void z0(m action) {
        CheckoutViewState value;
        CheckoutViewState checkoutViewState;
        PreTipDecorator preTipDecorator;
        W1 status;
        EnumC18092b enumC18092b;
        ArrayList arrayList;
        CheckoutViewState value2;
        CheckoutViewState checkoutViewState2;
        PreTipDecorator preTipDecorator2;
        W1 status2;
        double dM;
        Object next;
        EnumC18092b tipOption;
        CheckoutViewState value3;
        CheckoutViewState checkoutViewState3;
        CheckoutViewState value4;
        CheckoutViewState checkoutViewState4;
        CheckoutViewState value5;
        CheckoutViewState checkoutViewState5;
        PreTipDecorator preTipDecoratorB;
        Intrinsics.j(action, "action");
        if (action instanceof m.SetSelectedTipOption) {
            InterfaceC17140B<CheckoutViewState> interfaceC17140B = this._viewState;
            do {
                value5 = interfaceC17140B.getValue();
                checkoutViewState5 = value5;
                m.SetSelectedTipOption setSelectedTipOption = (m.SetSelectedTipOption) action;
                if (setSelectedTipOption.getTipOption() != EnumC18092b.f169908l) {
                    PreTipDecorator preTipDecorator3 = checkoutViewState5.getPreTipDecorator();
                    EnumC18092b tipOption2 = setSelectedTipOption.getTipOption();
                    W1 w12 = W1.f104664c;
                    ConfirmedTipInfo confirmedTipInfo = new ConfirmedTipInfo(setSelectedTipOption.getTipOption().getHasFormatArgs() ? checkoutViewState5.getPreTipDecorator().getOrderTotalPrice() * setSelectedTipOption.getTipOption().getValue() : setSelectedTipOption.getTipOption().getValue(), setSelectedTipOption.getTipOption());
                    List<TipSuggestionButtonDecorator> listF = checkoutViewState5.getPreTipDecorator().f();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listF, 10));
                    for (TipSuggestionButtonDecorator tipSuggestionButtonDecorator : listF) {
                        arrayList2.add(TipSuggestionButtonDecorator.b(tipSuggestionButtonDecorator, null, null, setSelectedTipOption.getTipOption().getPosition() == tipSuggestionButtonDecorator.getTipOption().getPosition(), 3, null));
                    }
                    preTipDecoratorB = PreTipDecorator.b(preTipDecorator3, w12, 0.0d, tipOption2, arrayList2, 0.0d, confirmedTipInfo, false, 82, null);
                } else {
                    PreTipDecorator preTipDecorator4 = checkoutViewState5.getPreTipDecorator();
                    EnumC18092b tipOption3 = setSelectedTipOption.getTipOption();
                    List<TipSuggestionButtonDecorator> listF2 = checkoutViewState5.getPreTipDecorator().f();
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.x(listF2, 10));
                    for (TipSuggestionButtonDecorator tipSuggestionButtonDecorator2 : listF2) {
                        arrayList3.add(TipSuggestionButtonDecorator.b(tipSuggestionButtonDecorator2, null, null, setSelectedTipOption.getTipOption().getPosition() == tipSuggestionButtonDecorator2.getTipOption().getPosition(), 3, null));
                    }
                    preTipDecoratorB = PreTipDecorator.b(preTipDecorator4, null, 0.0d, tipOption3, arrayList3, 0.0d, null, false, 115, null);
                }
            } while (!interfaceC17140B.e(value5, CheckoutViewState.b(checkoutViewState5, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, preTipDecoratorB, null, false, false, null, null, false, null, -16777217, null)));
            return;
        }
        if (action instanceof m.SetCustomTipAmount) {
            InterfaceC17140B<CheckoutViewState> interfaceC17140B2 = this._viewState;
            do {
                value4 = interfaceC17140B2.getValue();
                checkoutViewState4 = value4;
            } while (!interfaceC17140B2.e(value4, CheckoutViewState.b(checkoutViewState4, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, PreTipDecorator.b(checkoutViewState4.getPreTipDecorator(), null, 0.0d, null, null, ((m.SetCustomTipAmount) action).getTipAmount() / 100, null, false, 111, null), null, false, false, null, null, false, null, -16777217, null)));
            if (this.featureManager.e(AbstractC18227f.i0.f170583h)) {
                z0(new m.SetPreTipStatus(W1.f104664c));
                return;
            }
            return;
        }
        if (!(action instanceof m.SetPreTipStatus)) {
            throw new NoWhenBranchMatchedException();
        }
        m.SetPreTipStatus setPreTipStatus = (m.SetPreTipStatus) action;
        int i10 = n.$EnumSwitchMapping$0[setPreTipStatus.getStatus().ordinal()];
        if (i10 == 1) {
            this.sendPreTipAnalytics = true;
            InterfaceC17140B<CheckoutViewState> interfaceC17140B3 = this._viewState;
            do {
                value = interfaceC17140B3.getValue();
                checkoutViewState = value;
                preTipDecorator = checkoutViewState.getPreTipDecorator();
                status = setPreTipStatus.getStatus();
                enumC18092b = EnumC18092b.f169911o;
                List<TipSuggestionButtonDecorator> listF3 = checkoutViewState.getPreTipDecorator().f();
                arrayList = new ArrayList(CollectionsKt.x(listF3, 10));
                Iterator<T> it = listF3.iterator();
                while (it.hasNext()) {
                    arrayList.add(TipSuggestionButtonDecorator.b((TipSuggestionButtonDecorator) it.next(), null, null, false, 3, null));
                }
            } while (!interfaceC17140B3.e(value, CheckoutViewState.b(checkoutViewState, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, PreTipDecorator.b(preTipDecorator, status, 0.0d, enumC18092b, arrayList, 0.0d, new ConfirmedTipInfo(0.0d, EnumC18092b.f169911o), false, 66, null), null, false, false, null, null, false, null, -16777217, null)));
            Unit unit = Unit.f142422a;
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC17140B<CheckoutViewState> interfaceC17140B4 = this._viewState;
            do {
                value3 = interfaceC17140B4.getValue();
                checkoutViewState3 = value3;
            } while (!interfaceC17140B4.e(value3, CheckoutViewState.b(checkoutViewState3, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, PreTipDecorator.b(checkoutViewState3.getPreTipDecorator(), setPreTipStatus.getStatus(), 0.0d, null, null, 0.0d, this.featureManager.e(AbstractC18227f.i0.f170583h) ? checkoutViewState3.getPreTipDecorator().getConfirmedTipInfo() : new ConfirmedTipInfo(0.0d, EnumC18092b.f169911o), false, 94, null), null, false, false, null, null, false, null, -16777217, null)));
            Unit unit2 = Unit.f142422a;
            return;
        }
        this.sendPreTipAnalytics = true;
        InterfaceC17140B<CheckoutViewState> interfaceC17140B5 = this._viewState;
        do {
            value2 = interfaceC17140B5.getValue();
            checkoutViewState2 = value2;
            preTipDecorator2 = checkoutViewState2.getPreTipDecorator();
            status2 = setPreTipStatus.getStatus();
            dM = checkoutViewState2.getPreTipDecorator().m();
            Iterator<T> it2 = checkoutViewState2.getPreTipDecorator().f().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((TipSuggestionButtonDecorator) next).getIsSelected()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TipSuggestionButtonDecorator tipSuggestionButtonDecorator3 = (TipSuggestionButtonDecorator) next;
            if (tipSuggestionButtonDecorator3 == null || (tipOption = tipSuggestionButtonDecorator3.getTipOption()) == null) {
                tipOption = EnumC18092b.f169908l;
            }
        } while (!interfaceC17140B5.e(value2, CheckoutViewState.b(checkoutViewState2, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, PreTipDecorator.b(preTipDecorator2, status2, 0.0d, null, null, 0.0d, new ConfirmedTipInfo(dM, tipOption), false, 94, null), null, false, false, null, null, false, null, -16777217, null)));
        Unit unit3 = Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(z1 z1Var, String str) {
        Intrinsics.g(str);
        z1Var.cartId = str;
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void G0(CheckoutState checkoutState) {
        if (checkoutState.m().e() == null) {
            C16648k.d(androidx.view.d0.a(this), null, null, new z(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0(CheckoutState checkoutState) throws IOException {
        String name;
        SubstitutePreference substitutePreferenceE = checkoutState.w().e();
        if (substitutePreferenceE != null) {
            name = substitutePreferenceE.getName();
        } else {
            name = null;
        }
        if (!Intrinsics.e(name, this.userManager.r())) {
            r0(new h.SetSubstitutionPreference(SubstitutePreference.INSTANCE.f(this.userManager.r())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void c0() {
        C16648k.d(androidx.view.d0.a(this), null, null, new q(null), 3, null);
    }

    private final String i0(CheckoutViewState checkoutViewState) throws IOException {
        int i10 = 0;
        String str = "";
        String strD = null;
        if (Intrinsics.e(checkoutViewState.getFulfillmentMode().getDeliveryMode(), "delivery")) {
            ContactInformationDecorator contactInformation = checkoutViewState.getContactInformation();
            if (contactInformation != null) {
                strD = contactInformation.getPhoneNumber();
            }
            if (strD != null) {
                str = strD;
            }
            StringBuilder sb2 = new StringBuilder();
            int length = str.length();
            while (i10 < length) {
                char cCharAt = str.charAt(i10);
                if (Character.isDigit(cCharAt)) {
                    sb2.append(cCharAt);
                }
                i10++;
            }
            return sb2.toString();
        }
        PickupPersonDecorator pickupPerson = checkoutViewState.getPickupPerson();
        if (pickupPerson != null) {
            strD = pickupPerson.getPhone();
        }
        if (strD != null) {
            str = strD;
        }
        StringBuilder sb3 = new StringBuilder();
        int length2 = str.length();
        while (i10 < length2) {
            char cCharAt2 = str.charAt(i10);
            if (Character.isDigit(cCharAt2)) {
                sb3.append(cCharAt2);
            }
            i10++;
        }
        return sb3.toString();
    }

    private final String m0(CheckoutViewState checkoutViewState) {
        String strF;
        if (Intrinsics.e(checkoutViewState.getFulfillmentMode().getDeliveryMode(), "delivery")) {
            AddressDecorator deliveryAddress = checkoutViewState.getDeliveryAddress();
            if (deliveryAddress != null) {
                strF = deliveryAddress.getShippingZipCode();
            } else {
                strF = null;
            }
            if (strF == null) {
                return "";
            }
            return strF;
        }
        String strI = checkoutViewState.getStoreDecorator().getZipCode();
        if (strI == null) {
            return "";
        }
        return strI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0(Throwable throwable) {
        B0(throwable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(AgeRestrictedItemResult result) {
        if (!result.getHasAlcohol() && !result.getHasAgeRestricted()) {
            return;
        }
        A0();
    }

    private final void y0(OrderDetail orderDetail) {
        AbstractC5607a abstractC5607aD;
        String str;
        String str2;
        D0(orderDetail);
        CheckoutViewState value = this._viewState.getValue();
        this.completedOrder = orderDetail;
        boolean zD0 = orderDetail.d0();
        if (!zD0) {
            abstractC5607aD = AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100021dc, new Object[0]);
        } else {
            abstractC5607aD = AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99876W3, new Object[0]);
        }
        b1(true, abstractC5607aD, null, false);
        Lk.b<CheckoutViewState, j> bVar = this.flow;
        String deliveryMode = value.getFulfillmentMode().getDeliveryMode();
        String strL0 = l0(value.getFulfillmentMode().getDeliveryMode(), value.getPickupPerson(), value.getContactInformation());
        String strC = value.getStoreDecorator().getCurbsidePartner();
        if (strC == null) {
            strC = "";
        }
        String strG = value.getStoreDecorator().getPickupHelpNumber();
        if (strG == null) {
            strG = "";
        }
        String strF = value.getStoreDecorator().getName();
        if (strF == null) {
            String str3 = strG;
            str2 = "";
            str = str3;
        } else {
            str = strG;
            str2 = strF;
        }
        bVar.a(new j.OrderSubmittedSuccessEvent(orderDetail, new OrderConfirmationInfo(deliveryMode, strL0, strC, str, str2), zD0));
        Ro.a aVar = this.productAnalytics;
        String code = orderDetail.getCode();
        double value2 = orderDetail.getTotalPriceWithTax().getValue();
        List<Entry> listU = orderDetail.u();
        CartEntry.Companion companion = CartEntry.INSTANCE;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listU, 10));
        Iterator<T> it = listU.iterator();
        while (it.hasNext()) {
            arrayList.add(companion.a((Entry) it.next()));
        }
        aVar.g(code, value2, arrayList);
    }
}
