package com.meijer.mobile.singlepagecheckout;

import Fm.EbtBalance;
import Gm.f;
import Hk.Validation;
import Ji.C;
import Ji.LocalThemeScope;
import Rq.C5190f;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.DialogTitle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5892t0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.accounts.ux.payments.d;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationActivity;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.H;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.BottomSheetContentDecorator;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.C11851k;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.ContentRowData;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1;
import com.meijer.mobile.meijer.activity.checkout.payment.EbtPanData;
import com.meijer.mobile.meijer.activity.checkout.payment.PaymentOptionDecorator;
import com.meijer.mobile.meijer.activity.checkout.payment.Z;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.r;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.response.EbtPanResponse;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.C11932p;
import com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutAnimations;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutErrorDialogDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewState;
import com.meijer.mobile.meijer.activity.checkout.review.SubstitutionPreferenceDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.z1;
import com.meijer.mobile.meijer.activity.checkout.substitutionpreference.SubstitutionPreferenceFormActivity;
import com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity;
import e.C13588d;
import e.C13589e;
import gj.OrderDetail;
import gk.EnumC14271a;
import gk.MultiTenderPaymentOption;
import gk.PaymentOption;
import j0.InterfaceC14794C;
import j0.InterfaceC14812d;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import je.C14886b;
import ji.q1;
import kotlin.C17891L0;
import kotlin.C17893M0;
import kotlin.C17921a1;
import kotlin.C17927c1;
import kotlin.C17960n1;
import kotlin.C17963o1;
import kotlin.EnumC17895N0;
import kotlin.EnumC17957m1;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import okhttp3.HttpUrl;
import p0.InterfaceC16183a;
import p1.C16193g;
import qv.C16648k;
import qv.InterfaceC16622O;
import tr.C17135b;
import ts.ProductCardDecorator;
import tv.C17154h;
import tv.InterfaceC17144F;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u009f\u0001\u0010$\u001a\u00020 *\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\"H\u0003¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020 H\u0002¢\u0006\u0004\b&\u0010\u0004J\u0017\u0010)\u001a\u00020 2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u000eH\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020 H\u0002¢\u0006\u0004\b.\u0010\u0004J-\u0010/\u001a\u00020 2\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 0\u001fH\u0003¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020 H\u0003¢\u0006\u0004\b1\u00102J%\u00103\u001a\u00020 2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 0\u001fH\u0003¢\u0006\u0004\b3\u00104J'\u00109\u001a\u00020 2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002052\u0006\u00108\u001a\u000205H\u0003¢\u0006\u0004\b9\u0010:J?\u0010@\u001a\u00020 2\b\b\u0001\u0010<\u001a\u00020;2\b\b\u0001\u0010=\u001a\u00020;2\b\b\u0001\u0010>\u001a\u00020;2\u0010\b\u0002\u0010?\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\"H\u0002¢\u0006\u0004\b@\u0010AJ;\u0010F\u001a\u00020 2\u0014\b\u0002\u0010C\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020 0\u001f2\u0014\b\u0002\u0010E\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\bF\u0010GJ%\u0010H\u001a\u00020 2\u0014\b\u0002\u0010C\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020 H\u0002¢\u0006\u0004\bJ\u0010\u0004J\u0017\u0010M\u001a\u00020 2\u0006\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020 H\u0002¢\u0006\u0004\bO\u0010\u0004J\u000f\u0010P\u001a\u00020 H\u0002¢\u0006\u0004\bP\u0010\u0004J\u001f\u0010R\u001a\u00020 2\u0006\u0010<\u001a\u00020Q2\u0006\u0010=\u001a\u00020QH\u0002¢\u0006\u0004\bR\u0010SJ\u0019\u0010V\u001a\u00020 2\b\u0010U\u001a\u0004\u0018\u00010TH\u0014¢\u0006\u0004\bV\u0010WJ'\u0010Z\u001a\u00020 2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010Y\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020 H\u0016¢\u0006\u0004\b\\\u0010\u0004J\u0017\u0010^\u001a\u00020 2\u0006\u0010]\u001a\u00020QH\u0016¢\u0006\u0004\b^\u0010_R\u001b\u0010e\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001b\u0010j\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010b\u001a\u0004\bh\u0010iR\u001b\u0010o\u001a\u00020k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010b\u001a\u0004\bm\u0010nR\u001b\u0010t\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010b\u001a\u0004\br\u0010sR\u001b\u0010y\u001a\u00020u8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010b\u001a\u0004\bw\u0010xR\u001b\u0010\u0012\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010b\u001a\u0004\b{\u0010|R\u001b\u0010\u0016\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b}\u0010b\u001a\u0004\b~\u0010\u007fR\u001e\u0010\u0014\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0080\u0001\u0010b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R \u0010\u0087\u0001\u001a\u00030\u0083\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0084\u0001\u0010b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R#\u0010\u008c\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u0089\u00010\u0088\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R \u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u00020\u001b0\u0088\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008b\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001c\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001b\u0010\u0098\u0001\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R*\u0010 \u0001\u001a\u00030\u0099\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0017\u0010£\u0001\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001¨\u0006´\u0001²\u0006\u000f\u0010¤\u0001\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010¥\u0001\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010§\u0001\u001a\u00030¦\u00018\nX\u008a\u0084\u0002²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\r\u0010¨\u0001\u001a\u00020\u00198\nX\u008a\u0084\u0002²\u0006\u000e\u0010ª\u0001\u001a\u00030©\u00018\nX\u008a\u0084\u0002²\u0006\u0011\u0010«\u0001\u001a\u0004\u0018\u00010Q8\n@\nX\u008a\u008e\u0002²\u0006\u0011\u0010¬\u0001\u001a\u0004\u0018\u00010Q8\n@\nX\u008a\u008e\u0002²\u0006\u0011\u0010\u00ad\u0001\u001a\u0004\u0018\u00010Q8\n@\nX\u008a\u008e\u0002²\u0006\u0011\u0010®\u0001\u001a\u0004\u0018\u00010Q8\n@\nX\u008a\u008e\u0002²\u0006$\u0010±\u0001\u001a\u0017\u0012\u0005\u0012\u00030¯\u0001\u0012\u0004\u0012\u00020 \u0018\u00010\u001f¢\u0006\u0003\b°\u00018\n@\nX\u008a\u008e\u0002²\u0006\u0017\u0010²\u0001\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\"8\n@\nX\u008a\u008e\u0002²\u0006\u0017\u0010³\u0001\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\"8\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010¥\u0001\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/meijer/mobile/singlepagecheckout/SinglePageCheckoutActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LGm/f$a;", "<init>", "()V", "LJi/M;", "LH1/h;", "screenHeight", "Lcom/meijer/mobile/singlepagecheckout/a;", "sheetType", "Lx0/M0;", "sheetState", "Lqv/O;", "coroutineScope", "", "Lts/a;", "outOfStockProductList", "Lcom/meijer/mobile/accounts/ux/payments/d;", "addCardAurusViewModel", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r;", "ebtPinPadViewModel", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z;", "checkoutPaymentOptionsViewModel", "Lcom/meijer/mobile/accounts/ux/payments/d$d;", "addCardViewState", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$k;", "paymentOptionsViewState", "", "isPickUpMode", "Lcom/meijer/mobile/meijer/activity/checkout/review/p;", "adjustEbtPaymentDecorator", "Lkotlin/Function1;", "", "onOpenSheet", "Lkotlin/Function0;", "content", "a2", "(LJi/M;FLcom/meijer/mobile/singlepagecheckout/a;Lx0/M0;Lqv/O;Ljava/util/List;Lcom/meijer/mobile/accounts/ux/payments/d;Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r;Lcom/meijer/mobile/meijer/activity/checkout/payment/Z;Lcom/meijer/mobile/accounts/ux/payments/d$d;Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$k;ZLcom/meijer/mobile/meijer/activity/checkout/review/p;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "L3", "Lcom/meijer/mobile/meijer/activity/checkout/review/Y1;", "substitutionPreference", "M3", "(Lcom/meijer/mobile/meijer/activity/checkout/review/Y1;)V", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/f;", "B3", "()Ljava/util/List;", "V3", "G2", "(Lqv/O;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "E2", "(Landroidx/compose/runtime/Composer;I)V", "B2", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lp0/a;", "paymentOptionsRequester", "timeSlotsRequester", "placeOrderButtonViewRequester", "L2", "(Lp0/a;Lp0/a;Lp0/a;Landroidx/compose/runtime/Composer;I)V", "", "title", "message", "positiveButtonText", "onPositiveButtonClick", "T3", "(IIILkotlin/jvm/functions/Function0;)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "onAction", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g;", "onFulfillmentSlotsAction", "I3", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "H3", "(Lkotlin/jvm/functions/Function1;)V", "N3", "LFm/a;", "ebtAcculynkResponse", "J3", "(LFm/a;)V", "X3", "O3", "", "Q3", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lx0/o1;", "snackbarHostState", "J2", "(Lqv/O;Lx0/o1;Lx0/M0;Landroidx/compose/runtime/Composer;I)V", "P", "timerString", "z0", "(Ljava/lang/String;)V", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i;", "s", "Lkotlin/Lazy;", "E3", "()Lcom/meijer/mobile/meijer/activity/cart/entrynote/i;", "entryNoteViewModel", "Lcom/meijer/mobile/singlepagecheckout/c;", "t", "z3", "()Lcom/meijer/mobile/singlepagecheckout/c;", "coordinatorViewModel", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1;", "u", "F3", "()Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1;", "fulfillmentSlotsViewModel", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H;", "v", "A3", "()Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H;", "deliveryContactViewModel", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p;", "w", "G3", "()Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p;", "pickupContactViewModel", "x", "w3", "()Lcom/meijer/mobile/accounts/ux/payments/d;", "y", "x3", "()Lcom/meijer/mobile/meijer/activity/checkout/payment/Z;", "z", "C3", "()Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1;", "A", "y3", "()Lcom/meijer/mobile/meijer/activity/checkout/review/z1;", "checkoutViewModel", "Landroidx/compose/runtime/l0;", "LHj/d;", "B", "Landroidx/compose/runtime/l0;", "modalToShow", "C", "displayCheckoutAnimations", "D", "Z", "fromOrderReviewFlow", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtPanResponse;", "E", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtPanResponse;", "ebtPanResponse", "F", "LFm/a;", "ebtBalance", "LGm/f;", "G", "LGm/f;", "D3", "()LGm/f;", "setEbtTimer", "(LGm/f;)V", "ebtTimer", "K3", "()Z", "isEditMode", "bottomSheetType", "displayError", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;", "fulfillmentSlotsViewState", "checkoutPaymentOptionsViewState", "Lcom/meijer/mobile/meijer/activity/checkout/review/D1;", "orderSummaryViewState", "headingText", "descriptionText", "primaryButtonText", "secondaryButtonText", "Lj0/d;", "Lkotlin/ExtensionFunctionType;", "bottomSheetContent", "onPrimaryAction", "onSecondaryAction", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class SinglePageCheckoutActivity extends Hilt_SinglePageCheckoutActivity implements f.a {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5730l0<Hj.d> modalToShow;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5730l0<Boolean> displayCheckoutAnimations;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private boolean fromOrderReviewFlow;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private EbtPanResponse ebtPanResponse;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private EbtBalance ebtBalance;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    public Gm.f ebtTimer;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy entryNoteViewModel = new androidx.view.e0(Reflection.b(com.meijer.mobile.meijer.activity.cart.entrynote.i.class), new O(this), new F(this), new P(null, this));

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy coordinatorViewModel = new androidx.view.e0(Reflection.b(C12906c.class), new R(this), new Q(this), new S(null, this));

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Lazy fulfillmentSlotsViewModel = new androidx.view.e0(Reflection.b(com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.class), new U(this), new T(this), new V(null, this));

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy deliveryContactViewModel = new androidx.view.e0(Reflection.b(com.meijer.mobile.meijer.activity.checkout.contactinformation.H.class), new w(this), new C12897v(this), new x(null, this));

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy pickupContactViewModel = new androidx.view.e0(Reflection.b(C11932p.class), new z(this), new y(this), new A(null, this));

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Lazy addCardAurusViewModel = new androidx.view.e0(Reflection.b(com.meijer.mobile.accounts.ux.payments.d.class), new C(this), new B(this), new D(null, this));

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Lazy checkoutPaymentOptionsViewModel = new androidx.view.e0(Reflection.b(com.meijer.mobile.meijer.activity.checkout.payment.Z.class), new G(this), new E(this), new H(null, this));

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Lazy ebtPinPadViewModel = new androidx.view.e0(Reflection.b(com.meijer.mobile.meijer.activity.checkout.payment.ebt.r.class), new J(this), new I(this), new K(null, this));

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final Lazy checkoutViewModel = new androidx.view.e0(Reflection.b(com.meijer.mobile.meijer.activity.checkout.review.z1.class), new M(this), new L(this), new N(null, this));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class A extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f117848f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117849g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f117848f = function0;
            this.f117849g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f117848f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f117849g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class B extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117850f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(ComponentActivity componentActivity) {
            super(0);
            this.f117850f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f117850f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class C extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117851f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(ComponentActivity componentActivity) {
            super(0);
            this.f117851f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f117851f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class D extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f117852f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117853g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public D(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f117852f = function0;
            this.f117853g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f117852f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f117853g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class E extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117854f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public E(ComponentActivity componentActivity) {
            super(0);
            this.f117854f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f117854f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class F extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117855f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F(ComponentActivity componentActivity) {
            super(0);
            this.f117855f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f117855f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class G extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117856f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public G(ComponentActivity componentActivity) {
            super(0);
            this.f117856f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f117856f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class H extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f117857f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117858g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public H(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f117857f = function0;
            this.f117858g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f117857f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f117858g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class I extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117859f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I(ComponentActivity componentActivity) {
            super(0);
            this.f117859f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f117859f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class J extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117860f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public J(ComponentActivity componentActivity) {
            super(0);
            this.f117860f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f117860f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class K extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f117861f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117862g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public K(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f117861f = function0;
            this.f117862g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f117861f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f117862g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class L extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117863f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public L(ComponentActivity componentActivity) {
            super(0);
            this.f117863f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f117863f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class M extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117864f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public M(ComponentActivity componentActivity) {
            super(0);
            this.f117864f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f117864f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class N extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f117865f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117866g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public N(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f117865f = function0;
            this.f117866g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f117865f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f117866g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class O extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117867f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public O(ComponentActivity componentActivity) {
            super(0);
            this.f117867f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f117867f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class P extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f117868f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117869g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public P(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f117868f = function0;
            this.f117869g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f117868f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f117869g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class Q extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117870f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Q(ComponentActivity componentActivity) {
            super(0);
            this.f117870f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f117870f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class R extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117871f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public R(ComponentActivity componentActivity) {
            super(0);
            this.f117871f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f117871f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class S extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f117872f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117873g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public S(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f117872f = function0;
            this.f117873g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f117872f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f117873g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class T extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117874f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public T(ComponentActivity componentActivity) {
            super(0);
            this.f117874f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f117874f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class U extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117875f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public U(ComponentActivity componentActivity) {
            super(0);
            this.f117875f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f117875f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class V extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f117876f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117877g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public V(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f117876f = function0;
            this.f117877g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f117876f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f117877g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$a, reason: case insensitive filesystem */
    static final class C12876a implements Function3<InterfaceC14812d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117878a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SinglePageCheckoutActivity f117879b;

        C12876a(LocalThemeScope localThemeScope, SinglePageCheckoutActivity singlePageCheckoutActivity) {
            this.f117878a = localThemeScope;
            this.f117879b = singlePageCheckoutActivity;
        }

        public final void a(InterfaceC14812d interfaceC14812d, Composer composer, int i10) {
            Intrinsics.j(interfaceC14812d, "<this>");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1955752807, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ConditionalBottomSheet.<anonymous> (SinglePageCheckoutActivity.kt:569)");
            }
            LocalThemeScope localThemeScope = this.f117878a;
            Modifier modifierF = androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null);
            String string = this.f117879b.getString(com.meijer.mobile.meijer.Y.f100373v5);
            Intrinsics.i(string, "getString(...)");
            Qq.n.b(localThemeScope, modifierF, string, null, composer, LocalThemeScope.f15770g | 48, 4);
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
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$b, reason: case insensitive filesystem */
    static final class C12877b implements Function3<InterfaceC14812d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117880a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d.ViewState f117881b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f117882c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.meijer.mobile.accounts.ux.payments.d f117883d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Z.PaymentOptionsViewState f117884e;

        C12877b(LocalThemeScope localThemeScope, d.ViewState viewState, Function0<Unit> function0, com.meijer.mobile.accounts.ux.payments.d dVar, Z.PaymentOptionsViewState paymentOptionsViewState) {
            this.f117880a = localThemeScope;
            this.f117881b = viewState;
            this.f117882c = function0;
            this.f117883d = dVar;
            this.f117884e = paymentOptionsViewState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(com.meijer.mobile.accounts.ux.payments.d dVar, Z.PaymentOptionsViewState paymentOptionsViewState, String str) {
            dVar.A(new d.a.ProcessAurusIFrameReturn(str, paymentOptionsViewState.getEbtPaymentOption()));
            return Unit.f142422a;
        }

        public final void c(InterfaceC14812d interfaceC14812d, Composer composer, int i10) {
            Intrinsics.j(interfaceC14812d, "<this>");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1691031386, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ConditionalBottomSheet.<anonymous> (SinglePageCheckoutActivity.kt:581)");
            }
            LocalThemeScope localThemeScope = this.f117880a;
            HttpUrl aurusUrl = this.f117881b.getAurusUrl();
            String accessToken = this.f117881b.getAccessToken();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f117882c);
            final Function0<Unit> function0 = this.f117882c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.e1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SinglePageCheckoutActivity.C12877b.d(function0);
                    }
                };
                composer.t(objB);
            }
            Function0 function02 = (Function0) objB;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(this.f117883d) | composer.D(this.f117884e);
            final com.meijer.mobile.accounts.ux.payments.d dVar = this.f117883d;
            final Z.PaymentOptionsViewState paymentOptionsViewState = this.f117884e;
            Object objB2 = composer.B();
            if (zD || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.f1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SinglePageCheckoutActivity.C12877b.e(dVar, paymentOptionsViewState, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C5190f.b(localThemeScope, null, true, aurusUrl, accessToken, function02, (Function1) objB2, composer, LocalThemeScope.f15770g | 384, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14812d interfaceC14812d, Composer composer, Integer num) {
            c(interfaceC14812d, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$c, reason: case insensitive filesystem */
    static final class C12878c implements Function3<InterfaceC14812d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117885a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Z.PaymentOptionsViewState f117886b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SinglePageCheckoutActivity f117887c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.meijer.mobile.meijer.activity.checkout.payment.Z f117888d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f117889e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.meijer.mobile.meijer.activity.checkout.payment.ebt.r f117890f;

        C12878c(LocalThemeScope localThemeScope, Z.PaymentOptionsViewState paymentOptionsViewState, SinglePageCheckoutActivity singlePageCheckoutActivity, com.meijer.mobile.meijer.activity.checkout.payment.Z z10, Function0<Unit> function0, com.meijer.mobile.meijer.activity.checkout.payment.ebt.r rVar) {
            this.f117885a = localThemeScope;
            this.f117886b = paymentOptionsViewState;
            this.f117887c = singlePageCheckoutActivity;
            this.f117888d = z10;
            this.f117889e = function0;
            this.f117890f = rVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(SinglePageCheckoutActivity singlePageCheckoutActivity, com.meijer.mobile.meijer.activity.checkout.payment.Z z10, EbtPanResponse ebtResponse) {
            Intrinsics.j(ebtResponse, "ebtResponse");
            singlePageCheckoutActivity.ebtPanResponse = ebtResponse;
            z10.d0(new Z.i.ShowEbtPinPad(ebtResponse.getToken(), ebtResponse.getCardExpiration(), false));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(com.meijer.mobile.meijer.activity.checkout.payment.Z z10) {
            z10.d0(new Z.i.UpdateWebPageLoading(false));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(com.meijer.mobile.meijer.activity.checkout.payment.Z z10) {
            z10.d0(Z.i.f.f103739a);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(com.meijer.mobile.meijer.activity.checkout.payment.Z z10, String str) {
            z10.d0(new Z.i.SetEBTCardInputError(str));
            z10.d0(Z.i.d.f103737a);
            return Unit.f142422a;
        }

        public final void g(InterfaceC14812d interfaceC14812d, Composer composer, int i10) {
            Intrinsics.j(interfaceC14812d, "<this>");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1042848283, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ConditionalBottomSheet.<anonymous> (SinglePageCheckoutActivity.kt:613)");
            }
            LocalThemeScope localThemeScope = this.f117885a;
            boolean isEBTFlowLoading = this.f117886b.getIsEBTFlowLoading();
            EbtPanData mjrEbtPanData = this.f117886b.getMjrEbtPanData();
            String ebtCardInputError = this.f117886b.getEbtCardInputError();
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(this.f117887c) | composer.D(this.f117888d);
            final SinglePageCheckoutActivity singlePageCheckoutActivity = this.f117887c;
            final com.meijer.mobile.meijer.activity.checkout.payment.Z z10 = this.f117888d;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.g1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SinglePageCheckoutActivity.C12878c.k(singlePageCheckoutActivity, z10, (EbtPanResponse) obj);
                    }
                };
                composer.t(objB);
            }
            Function1 function1 = (Function1) objB;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zD2 = composer.D(this.f117888d);
            final com.meijer.mobile.meijer.activity.checkout.payment.Z z11 = this.f117888d;
            Object objB2 = composer.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.h1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SinglePageCheckoutActivity.C12878c.o(z11);
                    }
                };
                composer.t(objB2);
            }
            Function0 function0 = (Function0) objB2;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zD3 = composer.D(this.f117888d);
            final com.meijer.mobile.meijer.activity.checkout.payment.Z z12 = this.f117888d;
            Object objB3 = composer.B();
            if (zD3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.i1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SinglePageCheckoutActivity.C12878c.p(z12, (String) obj);
                    }
                };
                composer.t(objB3);
            }
            Function1 function12 = (Function1) objB3;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f117889e) | composer.D(this.f117888d);
            final Function0<Unit> function02 = this.f117889e;
            final com.meijer.mobile.meijer.activity.checkout.payment.Z z13 = this.f117888d;
            Object objB4 = composer.B();
            if (zV || objB4 == Composer.INSTANCE.a()) {
                objB4 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.j1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SinglePageCheckoutActivity.C12878c.q(function02, z13);
                    }
                };
                composer.t(objB4);
            }
            Function0 function03 = (Function0) objB4;
            composer.P();
            boolean isShowPinPad = this.f117886b.getIsShowPinPad();
            String acculynkPostBody = this.f117886b.getAcculynkPostBody();
            composer.startReplaceGroup(5004770);
            boolean zD4 = composer.D(this.f117890f);
            final com.meijer.mobile.meijer.activity.checkout.payment.ebt.r rVar = this.f117890f;
            Object objB5 = composer.B();
            if (zD4 || objB5 == Composer.INSTANCE.a()) {
                objB5 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.k1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SinglePageCheckoutActivity.C12878c.r(rVar, (String) obj);
                    }
                };
                composer.t(objB5);
            }
            Function1 function13 = (Function1) objB5;
            composer.P();
            boolean isWebPageLoading = this.f117886b.getIsWebPageLoading();
            composer.startReplaceGroup(5004770);
            boolean zD5 = composer.D(this.f117888d);
            final com.meijer.mobile.meijer.activity.checkout.payment.Z z14 = this.f117888d;
            Object objB6 = composer.B();
            if (zD5 || objB6 == Composer.INSTANCE.a()) {
                objB6 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.l1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SinglePageCheckoutActivity.C12878c.l(z14);
                    }
                };
                composer.t(objB6);
            }
            composer.P();
            Rq.H.p(localThemeScope, null, isEBTFlowLoading, mjrEbtPanData, ebtCardInputError, function1, function0, function12, function03, isShowPinPad, acculynkPostBody, function13, isWebPageLoading, (Function0) objB6, composer, LocalThemeScope.f15770g, 0, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14812d interfaceC14812d, Composer composer, Integer num) {
            g(interfaceC14812d, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(Function0 function0, com.meijer.mobile.meijer.activity.checkout.payment.Z z10) {
            function0.invoke();
            z10.d0(Z.i.j.f103747a);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(com.meijer.mobile.meijer.activity.checkout.payment.ebt.r rVar, String str) {
            rVar.I(str);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$d, reason: case insensitive filesystem */
    static final class C12879d implements Function3<InterfaceC14812d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117891a;

        C12879d(LocalThemeScope localThemeScope) {
            this.f117891a = localThemeScope;
        }

        public final void a(InterfaceC14812d interfaceC14812d, Composer composer, int i10) {
            Intrinsics.j(interfaceC14812d, "<this>");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-901701026, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ConditionalBottomSheet.<anonymous> (SinglePageCheckoutActivity.kt:700)");
            }
            LocalThemeScope localThemeScope = this.f117891a;
            ri.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, this.f117891a.getAdsSpacing().getFive().getDp()), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 382, null), C16193g.c(com.meijer.mobile.meijer.Y.f99566Fg, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$e, reason: case insensitive filesystem */
    static final class C12880e implements Function3<InterfaceC14812d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Z.PaymentOptionsViewState f117892a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SinglePageCheckoutActivity f117893b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.meijer.mobile.meijer.activity.checkout.payment.Z f117894c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117895d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.meijer.mobile.accounts.ux.payments.d f117896e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f117897f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<EnumC12898a, Unit> f117898g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f117899h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$e$a */
        /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Z.i, Unit> {
            a(Object obj) {
                super(1, obj, com.meijer.mobile.meijer.activity.checkout.payment.Z.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/payment/CheckoutPaymentOptionsViewModel$PaymentOptionsAction;)V", 0);
            }

            public final void a(Z.i p02) {
                Intrinsics.j(p02, "p0");
                ((com.meijer.mobile.meijer.activity.checkout.payment.Z) this.receiver).d0(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Z.i iVar) {
                a(iVar);
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C12880e(Z.PaymentOptionsViewState paymentOptionsViewState, SinglePageCheckoutActivity singlePageCheckoutActivity, com.meijer.mobile.meijer.activity.checkout.payment.Z z10, LocalThemeScope localThemeScope, com.meijer.mobile.accounts.ux.payments.d dVar, Function0<Unit> function0, Function1<? super EnumC12898a, Unit> function1, InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f117892a = paymentOptionsViewState;
            this.f117893b = singlePageCheckoutActivity;
            this.f117894c = z10;
            this.f117895d = localThemeScope;
            this.f117896e = dVar;
            this.f117897f = function0;
            this.f117898g = function1;
            this.f117899h = interfaceC5730l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(com.meijer.mobile.accounts.ux.payments.d dVar, Function0 function0, Function1 function1, boolean z10) {
            com.meijer.mobile.accounts.ux.payments.d.t(dVar, z10 ? EnumC14271a.f133708b : EnumC14271a.f133710d, false, 2, null);
            function0.invoke();
            function1.invoke(EnumC12898a.f118139e);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Z.PaymentOptionsViewState paymentOptionsViewState, com.meijer.mobile.meijer.activity.checkout.payment.Z z10, Function0 function0, String id2) {
            Object next;
            PaymentOption paymentOption;
            Intrinsics.j(id2, "id");
            Iterator<T> it = paymentOptionsViewState.getPaymentOptions().h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.e(((PaymentOption) ((Validation) next).e()).getId(), id2)) {
                    break;
                }
            }
            Validation validation = (Validation) next;
            if (validation != null && (paymentOption = (PaymentOption) validation.e()) != null) {
                z10.d0(new Z.i.SetPaymentMethodAction(paymentOption));
            }
            z10.d0(new Z.i.UpdateSelectCardID(id2));
            function0.invoke();
            return Unit.f142422a;
        }

        public final void e(InterfaceC14812d interfaceC14812d, Composer composer, int i10) {
            Intrinsics.j(interfaceC14812d, "<this>");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1339776208, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ConditionalBottomSheet.<anonymous> (SinglePageCheckoutActivity.kt:716)");
            }
            List<PaymentOptionDecorator> listS = this.f117892a.s();
            boolean zK3 = this.f117893b.K3();
            boolean zM2 = SinglePageCheckoutActivity.m2(this.f117899h);
            com.meijer.mobile.meijer.activity.checkout.payment.Z z10 = this.f117894c;
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(z10);
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new a(z10);
                composer.t(objB);
            }
            KFunction kFunction = (KFunction) objB;
            composer.P();
            String currentSelectCardID = this.f117892a.getCurrentSelectCardID();
            if (currentSelectCardID == null) {
                currentSelectCardID = "-1";
            }
            String str = currentSelectCardID;
            LocalThemeScope localThemeScope = this.f117895d;
            composer.startReplaceGroup(5004770);
            final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f117899h;
            Object objB2 = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB2 == companion.a()) {
                objB2 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.m1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SinglePageCheckoutActivity.C12880e.g(interfaceC5730l0, ((Boolean) obj).booleanValue());
                    }
                };
                composer.t(objB2);
            }
            Function1 function1 = (Function1) objB2;
            composer.P();
            Z.PaymentOptionsViewState paymentOptionsViewState = this.f117892a;
            Function1 function12 = (Function1) kFunction;
            composer.startReplaceGroup(-1746271574);
            boolean zD2 = composer.D(this.f117896e) | composer.V(this.f117897f) | composer.V(this.f117898g);
            final com.meijer.mobile.accounts.ux.payments.d dVar = this.f117896e;
            final Function0<Unit> function0 = this.f117897f;
            final Function1<EnumC12898a, Unit> function13 = this.f117898g;
            Object objB3 = composer.B();
            if (zD2 || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.n1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SinglePageCheckoutActivity.C12880e.k(dVar, function0, function13, ((Boolean) obj).booleanValue());
                    }
                };
                composer.t(objB3);
            }
            Function1 function14 = (Function1) objB3;
            composer.P();
            composer.startReplaceGroup(-1746271574);
            boolean zD3 = composer.D(this.f117892a) | composer.D(this.f117894c) | composer.V(this.f117897f);
            final Z.PaymentOptionsViewState paymentOptionsViewState2 = this.f117892a;
            final com.meijer.mobile.meijer.activity.checkout.payment.Z z11 = this.f117894c;
            final Function0<Unit> function02 = this.f117897f;
            Object objB4 = composer.B();
            if (zD3 || objB4 == companion.a()) {
                objB4 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.o1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SinglePageCheckoutActivity.C12880e.l(paymentOptionsViewState2, z11, function02, (String) obj);
                    }
                };
                composer.t(objB4);
            }
            Function1 function15 = (Function1) objB4;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f117897f);
            final Function0<Unit> function03 = this.f117897f;
            Object objB5 = composer.B();
            if (zV || objB5 == companion.a()) {
                objB5 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.p1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SinglePageCheckoutActivity.C12880e.f(function03);
                    }
                };
                composer.t(objB5);
            }
            composer.P();
            Rq.q0.c(localThemeScope, null, listS, zK3, zM2, function1, paymentOptionsViewState, function12, function14, function15, (Function0) objB5, str, composer, LocalThemeScope.f15770g | 196608, 0, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14812d interfaceC14812d, Composer composer, Integer num) {
            e(interfaceC14812d, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5730l0 interfaceC5730l0, boolean z10) {
            SinglePageCheckoutActivity.n2(interfaceC5730l0, z10);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$f, reason: case insensitive filesystem */
    static final class C12881f implements Function3<InterfaceC14812d, Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117901b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.meijer.mobile.meijer.activity.checkout.payment.ebt.r f117902c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f117903d;

        C12881f(LocalThemeScope localThemeScope, com.meijer.mobile.meijer.activity.checkout.payment.ebt.r rVar, Function0<Unit> function0) {
            this.f117901b = localThemeScope;
            this.f117902c = rVar;
            this.f117903d = function0;
        }

        public final void c(InterfaceC14812d interfaceC14812d, Composer composer, int i10) {
            Intrinsics.j(interfaceC14812d, "<this>");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1987959311, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ConditionalBottomSheet.<anonymous> (SinglePageCheckoutActivity.kt:758)");
            }
            String acculynkPostBody = SinglePageCheckoutActivity.this.y3().g0().c().getValue().getAcculynkPostBody();
            if (acculynkPostBody == null || acculynkPostBody.length() == 0) {
                this.f117903d.invoke();
            } else {
                LocalThemeScope localThemeScope = this.f117901b;
                String ebtTimerText = SinglePageCheckoutActivity.this.y3().g0().c().getValue().getEbtTimerText();
                boolean isLoading = SinglePageCheckoutActivity.this.y3().g0().c().getValue().getLoadingState().getIsLoading();
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(SinglePageCheckoutActivity.this);
                final SinglePageCheckoutActivity singlePageCheckoutActivity = SinglePageCheckoutActivity.this;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.q1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SinglePageCheckoutActivity.C12881f.d(singlePageCheckoutActivity);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(this.f117902c);
                final com.meijer.mobile.meijer.activity.checkout.payment.ebt.r rVar = this.f117902c;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.r1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SinglePageCheckoutActivity.C12881f.e(rVar, (String) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                String acculynkPostBody2 = SinglePageCheckoutActivity.this.y3().g0().c().getValue().getAcculynkPostBody();
                Intrinsics.g(acculynkPostBody2);
                com.meijer.mobile.singlepagecheckout.K.d(localThemeScope, null, true, ebtTimerText, isLoading, function0, (Function1) objB2, acculynkPostBody2, composer, LocalThemeScope.f15770g | 384, 1);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14812d interfaceC14812d, Composer composer, Integer num) {
            c(interfaceC14812d, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(SinglePageCheckoutActivity singlePageCheckoutActivity) throws IOException {
            singlePageCheckoutActivity.y3().r0(z1.h.j.f105123a);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(com.meijer.mobile.meijer.activity.checkout.payment.ebt.r rVar, String str) {
            rVar.I(str);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$g, reason: case insensitive filesystem */
    static final class C12882g implements Function3<InterfaceC14812d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117904a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<ProductCardDecorator> f117905b;

        C12882g(LocalThemeScope localThemeScope, List<ProductCardDecorator> list) {
            this.f117904a = localThemeScope;
            this.f117905b = list;
        }

        public final void a(InterfaceC14812d interfaceC14812d, Composer composer, int i10) {
            Intrinsics.j(interfaceC14812d, "<this>");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(881907423, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ConditionalBottomSheet.<anonymous> (SinglePageCheckoutActivity.kt:504)");
            }
            Am.p0.b(this.f117904a, null, this.f117905b, composer, LocalThemeScope.f15770g, 1);
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
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$h, reason: case insensitive filesystem */
    static final class C12883h implements Function3<InterfaceC14812d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117906a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SinglePageCheckoutActivity f117907b;

        C12883h(LocalThemeScope localThemeScope, SinglePageCheckoutActivity singlePageCheckoutActivity) {
            this.f117906a = localThemeScope;
            this.f117907b = singlePageCheckoutActivity;
        }

        public final void a(InterfaceC14812d interfaceC14812d, Composer composer, int i10) {
            Intrinsics.j(interfaceC14812d, "<this>");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-11203498, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ConditionalBottomSheet.<anonymous> (SinglePageCheckoutActivity.kt:516)");
            }
            C11851k.h(this.f117906a, null, this.f117907b.B3(), composer, LocalThemeScope.f15770g, 1);
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
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$i, reason: case insensitive filesystem */
    static final class C12884i implements Function3<InterfaceC14812d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117908a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdjustEbtPaymentDecorator f117909b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f117910c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ SinglePageCheckoutActivity f117911d;

        C12884i(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, Function0<Unit> function0, SinglePageCheckoutActivity singlePageCheckoutActivity) {
            this.f117908a = localThemeScope;
            this.f117909b = adjustEbtPaymentDecorator;
            this.f117910c = function0;
            this.f117911d = singlePageCheckoutActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f() {
            return Unit.f142422a;
        }

        public final void d(InterfaceC14812d interfaceC14812d, Composer composer, int i10) {
            Intrinsics.j(interfaceC14812d, "<this>");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-659386601, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ConditionalBottomSheet.<anonymous> (SinglePageCheckoutActivity.kt:528)");
            }
            LocalThemeScope localThemeScope = this.f117908a;
            AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.f117909b;
            composer.startReplaceGroup(1984639905);
            if (adjustEbtPaymentDecorator == null) {
                adjustEbtPaymentDecorator = new AdjustEbtPaymentDecorator(null, null, null, null, null, null, AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99896X4, new Object[0]), C16193g.c(com.meijer.mobile.meijer.Y.f99896X4, composer, 0), 63, null);
            }
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f117910c);
            final Function0<Unit> function0 = this.f117910c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.s1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SinglePageCheckoutActivity.C12884i.e(function0);
                    }
                };
                composer.t(objB);
            }
            Function0 function02 = (Function0) objB;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB2 == companion.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.t1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SinglePageCheckoutActivity.C12884i.f();
                    }
                };
                composer.t(objB2);
            }
            Function0 function03 = (Function0) objB2;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f117911d);
            final SinglePageCheckoutActivity singlePageCheckoutActivity = this.f117911d;
            Object objB3 = composer.B();
            if (zD || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.u1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SinglePageCheckoutActivity.C12884i.g(singlePageCheckoutActivity, ((Double) obj).doubleValue());
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            Qq.e.c(localThemeScope, adjustEbtPaymentDecorator, function02, function03, (Function1) objB3, composer, LocalThemeScope.f15770g | 3072 | (AbstractC5607a.f45514b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14812d interfaceC14812d, Composer composer, Integer num) {
            d(interfaceC14812d, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(SinglePageCheckoutActivity singlePageCheckoutActivity, double d10) throws IOException {
            singlePageCheckoutActivity.y3().r0(new z1.h.UpdateEbtApprovedAmount(d10));
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$j, reason: case insensitive filesystem */
    static final class C12885j implements Function3<InterfaceC14812d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117912a;

        C12885j(LocalThemeScope localThemeScope) {
            this.f117912a = localThemeScope;
        }

        public final void a(InterfaceC14812d interfaceC14812d, Composer composer, int i10) {
            Intrinsics.j(interfaceC14812d, "<this>");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1307569704, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ConditionalBottomSheet.<anonymous> (SinglePageCheckoutActivity.kt:556)");
            }
            Qq.n.b(this.f117912a, androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), C16193g.c(com.meijer.mobile.meijer.Y.f100344tg, composer, 0), C16193g.c(com.meijer.mobile.meijer.Y.f100364ug, composer, 0), composer, LocalThemeScope.f15770g | 48, 0);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ConditionalBottomSheet$closeSheet$1$1$1", f = "SinglePageCheckoutActivity.kt", l = {470}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$k, reason: case insensitive filesystem */
    static final class C12886k extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f117913a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17893M0 f117914b;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C12886k(this.f117914b, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12886k(C17893M0 c17893m0, Continuation<? super C12886k> continuation) {
            super(2, continuation);
            this.f117914b = c17893m0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12886k) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f117913a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C17893M0 c17893m0 = this.f117914b;
                this.f117913a = 1;
                if (c17893m0.i(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObserveCheckoutEvents$2$1", f = "SinglePageCheckoutActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$l, reason: case insensitive filesystem */
    static final class C12887l extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f117915a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<EnumC12898a, Unit> f117917c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObserveCheckoutEvents$2$1$1", f = "SinglePageCheckoutActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$l$a */
        static final class a extends SuspendLambda implements Function2<z1.j, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f117918a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f117919b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ SinglePageCheckoutActivity f117920c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<EnumC12898a, Unit> f117921d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$l$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1906a extends FunctionReferenceImpl implements Function1<z1.h, Unit> {
                C1906a(Object obj) {
                    super(1, obj, com.meijer.mobile.meijer.activity.checkout.review.z1.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/review/CheckoutViewModel$Action;)V", 0);
                }

                public final void a(z1.h p02) throws IOException {
                    Intrinsics.j(p02, "p0");
                    ((com.meijer.mobile.meijer.activity.checkout.review.z1) this.receiver).r0(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(z1.h hVar) throws IOException {
                    a(hVar);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$l$a$b */
            /* synthetic */ class b extends FunctionReferenceImpl implements Function1<q1.g, Unit> {
                b(Object obj) {
                    super(1, obj, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/FulfillmentSlotsViewModel$Action;)V", 0);
                }

                public final void a(q1.g p02) {
                    Intrinsics.j(p02, "p0");
                    ((com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1) this.receiver).e0(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(q1.g gVar) {
                    a(gVar);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$l$a$c */
            /* synthetic */ class c extends FunctionReferenceImpl implements Function1<z1.h, Unit> {
                c(Object obj) {
                    super(1, obj, com.meijer.mobile.meijer.activity.checkout.review.z1.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/review/CheckoutViewModel$Action;)V", 0);
                }

                public final void a(z1.h p02) throws IOException {
                    Intrinsics.j(p02, "p0");
                    ((com.meijer.mobile.meijer.activity.checkout.review.z1) this.receiver).r0(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(z1.h hVar) throws IOException {
                    a(hVar);
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(SinglePageCheckoutActivity singlePageCheckoutActivity, Function1<? super EnumC12898a, Unit> function1, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f117920c = singlePageCheckoutActivity;
                this.f117921d = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f117920c, this.f117921d, continuation);
                aVar.f117919b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public final Object invoke(z1.j jVar, Continuation<? super Unit> continuation) {
                return ((a) create(jVar, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws IOException {
                String strA;
                IntrinsicsKt.f();
                if (this.f117918a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                z1.j jVar = (z1.j) this.f117919b;
                if (jVar instanceof z1.j.NavigateToOrderConfirmationEvent) {
                    SinglePageCheckoutActivity singlePageCheckoutActivity = this.f117920c;
                    OrderConfirmationActivity.Companion companion = OrderConfirmationActivity.INSTANCE;
                    z1.j.NavigateToOrderConfirmationEvent navigateToOrderConfirmationEvent = (z1.j.NavigateToOrderConfirmationEvent) jVar;
                    String orderId = navigateToOrderConfirmationEvent.getOrderId();
                    singlePageCheckoutActivity.startActivity(companion.a(singlePageCheckoutActivity, orderId == null ? "" : orderId, navigateToOrderConfirmationEvent.getInformation(), navigateToOrderConfirmationEvent.getIsBopasEligibleCart(), navigateToOrderConfirmationEvent.getSendPreTipAnalytics()));
                    this.f117920c.finish();
                } else {
                    InterfaceC5730l0 interfaceC5730l0 = null;
                    InterfaceC5730l0 interfaceC5730l02 = null;
                    if (jVar instanceof z1.j.OrderSubmittedSuccessEvent) {
                        InterfaceC5730l0 interfaceC5730l03 = this.f117920c.displayCheckoutAnimations;
                        if (interfaceC5730l03 == null) {
                            Intrinsics.y("displayCheckoutAnimations");
                            interfaceC5730l03 = null;
                        }
                        interfaceC5730l03.setValue(Boxing.a(true));
                        com.meijer.mobile.meijer.activity.checkout.review.z1 z1VarY3 = this.f117920c.y3();
                        z1.j.OrderSubmittedSuccessEvent orderSubmittedSuccessEvent = (z1.j.OrderSubmittedSuccessEvent) jVar;
                        int i10 = !orderSubmittedSuccessEvent.getDisplayEbtPinPad() ? Bj.n.f2959c : Bj.n.f2957a;
                        OrderDetail orderDetail = orderSubmittedSuccessEvent.getOrderDetail();
                        z1VarY3.r0(new z1.h.SetCheckoutAnimations(true, new CheckoutAnimations(i10, null, false, false, orderDetail != null ? orderDetail.getCode() : null, orderSubmittedSuccessEvent.getInformation(), orderSubmittedSuccessEvent.getDisplayEbtPinPad(), 14, null)));
                        this.f117920c.getFirebasePerformanceEngine().b("cart_checkout_trace");
                    } else if (jVar instanceof z1.j.SubmitOrderErrorEvent) {
                        z1.j.SubmitOrderErrorEvent submitOrderErrorEvent = (z1.j.SubmitOrderErrorEvent) jVar;
                        if (submitOrderErrorEvent.getIsTimeSlotError()) {
                            this.f117920c.y3().r0(z1.h.j.f105123a);
                            this.f117920c.F3().e0(q1.g.c.f103076a);
                            this.f117920c.y3().r0(z1.h.m.f105126a);
                        } else {
                            InterfaceC5730l0 interfaceC5730l04 = this.f117920c.displayCheckoutAnimations;
                            if (interfaceC5730l04 == null) {
                                Intrinsics.y("displayCheckoutAnimations");
                            } else {
                                interfaceC5730l02 = interfaceC5730l04;
                            }
                            interfaceC5730l02.setValue(Boxing.a(true));
                            this.f117920c.y3().r0(new z1.h.SetCheckoutAnimations(true, new CheckoutAnimations(Bj.n.f2958b, submitOrderErrorEvent.getButtonText(), submitOrderErrorEvent.getIsTimeSlotError(), true, null, null, false, 112, null)));
                        }
                        this.f117920c.y3().J0(false);
                        this.f117920c.getFirebasePerformanceEngine().b("cart_checkout_trace");
                    } else if (jVar instanceof z1.j.a) {
                        this.f117920c.N3();
                    } else if (jVar instanceof z1.j.ShowErrorDialogEvent) {
                        this.f117920c.y3().J0(false);
                        CheckoutErrorDialogDecorator checkoutErrorDialogDecorator = ((z1.j.ShowErrorDialogEvent) jVar).getCheckoutErrorDialogDecorator();
                        this.f117920c.T3(checkoutErrorDialogDecorator.getTitle(), checkoutErrorDialogDecorator.getMessage(), checkoutErrorDialogDecorator.getButtonText(), checkoutErrorDialogDecorator.c());
                    } else if (jVar instanceof z1.j.ShowAgeRestrictedDialog) {
                        z1.j.ShowAgeRestrictedDialog showAgeRestrictedDialog = (z1.j.ShowAgeRestrictedDialog) jVar;
                        RetrofitException retrofitException = showAgeRestrictedDialog.getRetrofitException();
                        if (retrofitException == null || (strA = retrofitException.c(this.f117920c)) == null) {
                            strA = bk.d.a(this.f117920c, showAgeRestrictedDialog.getMessage());
                        }
                        String str = strA;
                        InterfaceC5730l0 interfaceC5730l05 = this.f117920c.modalToShow;
                        if (interfaceC5730l05 == null) {
                            Intrinsics.y("modalToShow");
                        } else {
                            interfaceC5730l0 = interfaceC5730l05;
                        }
                        String strA2 = bk.d.a(this.f117920c, showAgeRestrictedDialog.getTitle());
                        String strA3 = bk.d.a(this.f117920c, showAgeRestrictedDialog.getButtonText());
                        final SinglePageCheckoutActivity singlePageCheckoutActivity2 = this.f117920c;
                        interfaceC5730l0.setValue(new Hj.d(strA2, str, strA3, new Function0() { // from class: com.meijer.mobile.singlepagecheckout.v1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SinglePageCheckoutActivity.C12887l.a.o(singlePageCheckoutActivity2);
                            }
                        }, null, null, null, null, 240, null));
                        this.f117920c.y3().r0(z1.h.j.f105123a);
                    } else if (jVar instanceof z1.j.ShowFutureTimeslotAlert) {
                        z1.j.ShowFutureTimeslotAlert showFutureTimeslotAlert = (z1.j.ShowFutureTimeslotAlert) jVar;
                        C14886b message = new C14886b(this.f117920c).setTitle(bk.d.a(this.f117920c, showFutureTimeslotAlert.getAlertTitle())).setCancelable(false).setMessage(bk.d.a(this.f117920c, showFutureTimeslotAlert.getAlertMessage()));
                        int i11 = com.meijer.mobile.meijer.Y.f99760Q1;
                        final SinglePageCheckoutActivity singlePageCheckoutActivity3 = this.f117920c;
                        C14886b positiveButton = message.setPositiveButton(i11, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.w1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i12) throws IOException {
                                SinglePageCheckoutActivity.C12887l.a.p(singlePageCheckoutActivity3, dialogInterface, i12);
                            }
                        });
                        int i12 = com.meijer.mobile.meijer.Y.f99854V0;
                        final SinglePageCheckoutActivity singlePageCheckoutActivity4 = this.f117920c;
                        positiveButton.setNegativeButton(i12, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.x1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i13) throws IOException {
                                SinglePageCheckoutActivity.C12887l.a.q(singlePageCheckoutActivity4, dialogInterface, i13);
                            }
                        }).show();
                    } else if (jVar instanceof z1.j.ShowEBTPinPadEvent) {
                        this.f117921d.invoke(EnumC12898a.f118145k);
                        if (!this.f117920c.D3().getTimerRunningStatus()) {
                            this.f117920c.D3().l(115L);
                        }
                        this.f117920c.D3().k(this.f117920c);
                    } else if (jVar instanceof z1.j.NavigateToOrderDetailEvent) {
                        SinglePageCheckoutActivity singlePageCheckoutActivity5 = this.f117920c;
                        Al.l lVar = Al.l.f673a;
                        z1.j.NavigateToOrderDetailEvent navigateToOrderDetailEvent = (z1.j.NavigateToOrderDetailEvent) jVar;
                        String orderId2 = navigateToOrderDetailEvent.getOrderId();
                        singlePageCheckoutActivity5.startActivity(Al.l.b(lVar, singlePageCheckoutActivity5, orderId2 == null ? "" : orderId2, null, navigateToOrderDetailEvent.getShortCode(), 4, null));
                        this.f117920c.finish();
                    } else if (jVar instanceof z1.j.d) {
                        this.f117920c.H3(new c(this.f117920c.y3()));
                    } else if (!(jVar instanceof z1.j.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(SinglePageCheckoutActivity singlePageCheckoutActivity) {
                InterfaceC5730l0 interfaceC5730l0 = singlePageCheckoutActivity.modalToShow;
                if (interfaceC5730l0 == null) {
                    Intrinsics.y("modalToShow");
                    interfaceC5730l0 = null;
                }
                interfaceC5730l0.setValue(null);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void p(SinglePageCheckoutActivity singlePageCheckoutActivity, DialogInterface dialogInterface, int i10) throws IOException {
                dialogInterface.dismiss();
                singlePageCheckoutActivity.y3().r0(new z1.h.SendAdobeActionTag(true));
                singlePageCheckoutActivity.y3().r0(new z1.h.SubmitOrderAction(false));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void q(SinglePageCheckoutActivity singlePageCheckoutActivity, DialogInterface dialogInterface, int i10) throws IOException {
                singlePageCheckoutActivity.y3().r0(new z1.h.SendAdobeActionTag(false));
                singlePageCheckoutActivity.y3().J0(false);
                singlePageCheckoutActivity.I3(new C1906a(singlePageCheckoutActivity.y3()), new b(singlePageCheckoutActivity.F3()));
                dialogInterface.dismiss();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C12887l(Function1<? super EnumC12898a, Unit> function1, Continuation<? super C12887l> continuation) {
            super(2, continuation);
            this.f117917c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SinglePageCheckoutActivity.this.new C12887l(this.f117917c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12887l) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f117915a == 0) {
                ResultKt.b(obj);
                C17154h.J(C17154h.O(SinglePageCheckoutActivity.this.y3().g0().b(), new a(SinglePageCheckoutActivity.this, this.f117917c, null)), C6031t.a(SinglePageCheckoutActivity.this));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObserveContactInfoEvents$1$1", f = "SinglePageCheckoutActivity.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$m, reason: case insensitive filesystem */
    static final class C12888m extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f117922a;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$m$b */
        public static final class b implements InterfaceC17152f<C11932p.h> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17152f f117926a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$m$b$a */
            public static final class a<T> implements InterfaceC17153g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC17153g f117927a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObserveContactInfoEvents$1$1$invokeSuspend$$inlined$filter$1$2", f = "SinglePageCheckoutActivity.kt", l = {50}, m = "emit")
                /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$m$b$a$a, reason: collision with other inner class name */
                public static final class C1907a extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f117928a;

                    /* renamed from: b, reason: collision with root package name */
                    int f117929b;

                    /* renamed from: c, reason: collision with root package name */
                    Object f117930c;

                    /* renamed from: d, reason: collision with root package name */
                    Object f117931d;

                    /* renamed from: f, reason: collision with root package name */
                    Object f117933f;

                    /* renamed from: g, reason: collision with root package name */
                    Object f117934g;

                    /* renamed from: h, reason: collision with root package name */
                    int f117935h;

                    public C1907a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f117928a = obj;
                        this.f117929b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC17153g interfaceC17153g) {
                    this.f117927a = interfaceC17153g;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // tv.InterfaceC17153g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.C12888m.b.a.C1907a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$m$b$a$a r0 = (com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.C12888m.b.a.C1907a) r0
                        int r1 = r0.f117929b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f117929b = r1
                        goto L18
                    L13:
                        com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$m$b$a$a r0 = new com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$m$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f117928a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                        int r2 = r0.f117929b
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r5 = r0.f117934g
                        tv.g r5 = (tv.InterfaceC17153g) r5
                        java.lang.Object r5 = r0.f117931d
                        com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$m$b$a$a r5 = (com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.C12888m.b.a.C1907a) r5
                        kotlin.ResultKt.b(r6)
                        goto L59
                    L31:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L39:
                        kotlin.ResultKt.b(r6)
                        tv.g r6 = r4.f117927a
                        r2 = r5
                        com.meijer.mobile.meijer.activity.checkout.pickupperson.p$h r2 = (com.meijer.mobile.meijer.activity.checkout.pickupperson.C11932p.h) r2
                        boolean r2 = r2 instanceof com.meijer.mobile.meijer.activity.checkout.pickupperson.C11932p.h.b
                        if (r2 == 0) goto L59
                        r0.f117930c = r5
                        r0.f117931d = r0
                        r0.f117933f = r5
                        r0.f117934g = r6
                        r2 = 0
                        r0.f117935h = r2
                        r0.f117929b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L59
                        return r1
                    L59:
                        kotlin.Unit r5 = kotlin.Unit.f142422a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.C12888m.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public b(InterfaceC17152f interfaceC17152f) {
                this.f117926a = interfaceC17152f;
            }

            @Override // tv.InterfaceC17152f
            public Object collect(InterfaceC17153g<? super C11932p.h> interfaceC17153g, Continuation continuation) {
                Object objCollect = this.f117926a.collect(new a(interfaceC17153g), continuation);
                return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
            }
        }

        C12888m(Continuation<? super C12888m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SinglePageCheckoutActivity.this.new C12888m(continuation);
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$h;", "it", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$h;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObserveContactInfoEvents$1$1$2", f = "SinglePageCheckoutActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$m$a */
        static final class a extends SuspendLambda implements Function2<C11932p.h, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f117924a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SinglePageCheckoutActivity f117925b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SinglePageCheckoutActivity singlePageCheckoutActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f117925b = singlePageCheckoutActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f117925b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C11932p.h hVar, Continuation<? super Unit> continuation) {
                return ((a) create(hVar, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f117924a == 0) {
                    ResultKt.b(obj);
                    this.f117925b.V3();
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12888m) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f117922a == 0) {
                ResultKt.b(obj);
                C17154h.J(C17154h.O(new b(SinglePageCheckoutActivity.this.G3().F().b()), new a(SinglePageCheckoutActivity.this, null)), C6031t.a(SinglePageCheckoutActivity.this));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObserveContactInfoEvents$2$1", f = "SinglePageCheckoutActivity.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$n, reason: case insensitive filesystem */
    static final class C12889n extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f117936a;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$n$b */
        public static final class b implements InterfaceC17152f<H.j> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17152f f117940a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$n$b$a */
            public static final class a<T> implements InterfaceC17153g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC17153g f117941a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObserveContactInfoEvents$2$1$invokeSuspend$$inlined$filter$1$2", f = "SinglePageCheckoutActivity.kt", l = {50}, m = "emit")
                /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$n$b$a$a, reason: collision with other inner class name */
                public static final class C1908a extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f117942a;

                    /* renamed from: b, reason: collision with root package name */
                    int f117943b;

                    /* renamed from: c, reason: collision with root package name */
                    Object f117944c;

                    /* renamed from: d, reason: collision with root package name */
                    Object f117945d;

                    /* renamed from: f, reason: collision with root package name */
                    Object f117947f;

                    /* renamed from: g, reason: collision with root package name */
                    Object f117948g;

                    /* renamed from: h, reason: collision with root package name */
                    int f117949h;

                    public C1908a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f117942a = obj;
                        this.f117943b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC17153g interfaceC17153g) {
                    this.f117941a = interfaceC17153g;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // tv.InterfaceC17153g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.C12889n.b.a.C1908a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$n$b$a$a r0 = (com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.C12889n.b.a.C1908a) r0
                        int r1 = r0.f117943b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f117943b = r1
                        goto L18
                    L13:
                        com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$n$b$a$a r0 = new com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$n$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f117942a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                        int r2 = r0.f117943b
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r5 = r0.f117948g
                        tv.g r5 = (tv.InterfaceC17153g) r5
                        java.lang.Object r5 = r0.f117945d
                        com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$n$b$a$a r5 = (com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.C12889n.b.a.C1908a) r5
                        kotlin.ResultKt.b(r6)
                        goto L59
                    L31:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L39:
                        kotlin.ResultKt.b(r6)
                        tv.g r6 = r4.f117941a
                        r2 = r5
                        com.meijer.mobile.meijer.activity.checkout.contactinformation.H$j r2 = (com.meijer.mobile.meijer.activity.checkout.contactinformation.H.j) r2
                        boolean r2 = r2 instanceof com.meijer.mobile.meijer.activity.checkout.contactinformation.H.j.b
                        if (r2 == 0) goto L59
                        r0.f117944c = r5
                        r0.f117945d = r0
                        r0.f117947f = r5
                        r0.f117948g = r6
                        r2 = 0
                        r0.f117949h = r2
                        r0.f117943b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L59
                        return r1
                    L59:
                        kotlin.Unit r5 = kotlin.Unit.f142422a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.C12889n.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public b(InterfaceC17152f interfaceC17152f) {
                this.f117940a = interfaceC17152f;
            }

            @Override // tv.InterfaceC17152f
            public Object collect(InterfaceC17153g<? super H.j> interfaceC17153g, Continuation continuation) {
                Object objCollect = this.f117940a.collect(new a(interfaceC17153g), continuation);
                return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
            }
        }

        C12889n(Continuation<? super C12889n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SinglePageCheckoutActivity.this.new C12889n(continuation);
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j;", "it", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObserveContactInfoEvents$2$1$2", f = "SinglePageCheckoutActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$n$a */
        static final class a extends SuspendLambda implements Function2<H.j, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f117938a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SinglePageCheckoutActivity f117939b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SinglePageCheckoutActivity singlePageCheckoutActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f117939b = singlePageCheckoutActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f117939b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(H.j jVar, Continuation<? super Unit> continuation) {
                return ((a) create(jVar, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f117938a == 0) {
                    ResultKt.b(obj);
                    this.f117939b.V3();
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12889n) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f117936a == 0) {
                ResultKt.b(obj);
                C17154h.J(C17154h.O(new b(SinglePageCheckoutActivity.this.A3().H().b()), new a(SinglePageCheckoutActivity.this, null)), C6031t.a(SinglePageCheckoutActivity.this));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObserveFulfillmentSlotEvents$2$1", f = "SinglePageCheckoutActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$o, reason: case insensitive filesystem */
    static final class C12890o extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f117950a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f117952c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<EnumC12898a, Unit> f117953d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$h;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$h;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObserveFulfillmentSlotEvents$2$1$1", f = "SinglePageCheckoutActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$o$a */
        static final class a extends SuspendLambda implements Function2<q1.h, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f117954a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f117955b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f117956c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<EnumC12898a, Unit> f117957d;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObserveFulfillmentSlotEvents$2$1$1$1", f = "SinglePageCheckoutActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$o$a$a, reason: collision with other inner class name */
            static final class C1909a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f117958a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function1<EnumC12898a, Unit> f117959b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1909a(Function1<? super EnumC12898a, Unit> function1, Continuation<? super C1909a> continuation) {
                    super(2, continuation);
                    this.f117959b = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1909a(this.f117959b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C1909a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f117958a == 0) {
                        ResultKt.b(obj);
                        this.f117959b.invoke(EnumC12898a.f118136b);
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f117956c, this.f117957d, continuation);
                aVar.f117955b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(q1.h hVar, Continuation<? super Unit> continuation) {
                return ((a) create(hVar, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(InterfaceC16622O interfaceC16622O, Function1<? super EnumC12898a, Unit> function1, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f117956c = interfaceC16622O;
                this.f117957d = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f117954a == 0) {
                    ResultKt.b(obj);
                    q1.h hVar = (q1.h) this.f117955b;
                    if (!(hVar instanceof q1.h.TimeSlotSetCanProceedToNextStepInCheckout)) {
                        if (hVar instanceof q1.h.a) {
                            C16648k.d(this.f117956c, null, null, new C1909a(this.f117957d, null), 3, null);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SinglePageCheckoutActivity.this.new C12890o(this.f117952c, this.f117953d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C12890o(InterfaceC16622O interfaceC16622O, Function1<? super EnumC12898a, Unit> function1, Continuation<? super C12890o> continuation) {
            super(2, continuation);
            this.f117952c = interfaceC16622O;
            this.f117953d = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12890o) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f117950a == 0) {
                ResultKt.b(obj);
                C17154h.J(C17154h.O(SinglePageCheckoutActivity.this.F3().a0().b(), new a(this.f117952c, this.f117953d, null)), C6031t.a(SinglePageCheckoutActivity.this));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObservePaymentEvents$1$1", f = "SinglePageCheckoutActivity.kt", l = {1133}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$p, reason: case insensitive filesystem */
    static final class C12891p extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f117960a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C17893M0 f117962c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f117963d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/accounts/ux/payments/d$c;", "effect", "", "<anonymous>", "(Lcom/meijer/mobile/accounts/ux/payments/d$c;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObservePaymentEvents$1$1$1", f = "SinglePageCheckoutActivity.kt", l = {1141}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$p$a */
        static final class a extends SuspendLambda implements Function2<d.c, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f117964a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f117965b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ SinglePageCheckoutActivity f117966c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C17893M0 f117967d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Context f117968e;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f117966c, this.f117967d, this.f117968e, continuation);
                aVar.f117965b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(d.c cVar, Continuation<? super Unit> continuation) {
                return ((a) create(cVar, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SinglePageCheckoutActivity singlePageCheckoutActivity, C17893M0 c17893m0, Context context, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f117966c = singlePageCheckoutActivity;
                this.f117967d = c17893m0;
                this.f117968e = context;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void k(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f117964a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    d.c cVar = (d.c) this.f117965b;
                    if (cVar instanceof d.c.CardAddSuccessful) {
                        this.f117966c.x3().d0(new Z.i.SetPaymentMethodAction(((d.c.CardAddSuccessful) cVar).getMultiTenderPaymentOption().getCreditDebitPaymentOption()));
                        C17893M0 c17893m0 = this.f117967d;
                        this.f117965b = cVar;
                        this.f117964a = 1;
                        if (c17893m0.i(this) == objF) {
                            return objF;
                        }
                    } else if (Intrinsics.e(cVar, d.c.a.f94412a)) {
                        new C14886b(this.f117968e).setTitle(com.meijer.mobile.meijer.Y.f99910Y).setMessage(com.meijer.mobile.meijer.Y.f99891X).setPositiveButton(yr.Q.f170986b, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.y1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i11) {
                                SinglePageCheckoutActivity.C12891p.a.k(dialogInterface, i11);
                            }
                        }).show();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f142422a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SinglePageCheckoutActivity.this.new C12891p(this.f117962c, this.f117963d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12891p(C17893M0 c17893m0, Context context, Continuation<? super C12891p> continuation) {
            super(2, continuation);
            this.f117962c = c17893m0;
            this.f117963d = context;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12891p) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f117960a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17144F<d.c> interfaceC17144FW = SinglePageCheckoutActivity.this.w3().w();
                a aVar = new a(SinglePageCheckoutActivity.this, this.f117962c, this.f117963d, null);
                this.f117960a = 1;
                if (C17154h.k(interfaceC17144FW, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObservePaymentEvents$2$1", f = "SinglePageCheckoutActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$q, reason: case insensitive filesystem */
    static final class C12892q extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f117969a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f117971c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C17963o1 f117972d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f117973e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17893M0 f117974f;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObservePaymentEvents$2$1$1", f = "SinglePageCheckoutActivity.kt", l = {1174}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$q$a */
        static final class a extends SuspendLambda implements Function2<Z.j, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f117975a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f117976b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f117977c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ SinglePageCheckoutActivity f117978d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C17963o1 f117979e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Context f117980f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C17893M0 f117981g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObservePaymentEvents$2$1$1$1", f = "SinglePageCheckoutActivity.kt", l = {1162}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$q$a$a, reason: collision with other inner class name */
            static final class C1910a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f117982a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17893M0 f117983b;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1910a(this.f117983b, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1910a(C17893M0 c17893m0, Continuation<? super C1910a> continuation) {
                    super(2, continuation);
                    this.f117983b = c17893m0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C1910a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f117982a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17893M0 c17893m0 = this.f117983b;
                        this.f117982a = 1;
                        if (c17893m0.l(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObservePaymentEvents$2$1$1$2", f = "SinglePageCheckoutActivity.kt", l = {1168}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$q$a$b */
            static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f117984a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17893M0 f117985b;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f117985b, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C17893M0 c17893m0, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f117985b = c17893m0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f117984a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17893M0 c17893m0 = this.f117985b;
                        this.f117984a = 1;
                        if (c17893m0.i(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f117977c, this.f117978d, this.f117979e, this.f117980f, this.f117981g, continuation);
                aVar.f117976b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Z.j jVar, Continuation<? super Unit> continuation) {
                return ((a) create(jVar, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC16622O interfaceC16622O, SinglePageCheckoutActivity singlePageCheckoutActivity, C17963o1 c17963o1, Context context, C17893M0 c17893m0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f117977c = interfaceC16622O;
                this.f117978d = singlePageCheckoutActivity;
                this.f117979e = c17963o1;
                this.f117980f = context;
                this.f117981g = c17893m0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws IOException {
                String strB;
                Function1 function1;
                String strB2;
                String strB3;
                Function1 function12;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f117975a;
                if (i10 == 0) {
                    ResultKt.b(obj);
                    Z.j jVar = (Z.j) this.f117976b;
                    if (jVar instanceof Z.j.e) {
                        C16648k.d(this.f117977c, null, null, new C1910a(this.f117981g, null), 3, null);
                    } else if (jVar instanceof Z.j.c) {
                        C16648k.d(this.f117977c, null, null, new b(this.f117981g, null), 3, null);
                    } else if (jVar instanceof Z.j.PaymentCardRelatedFailedEvent) {
                        this.f117978d.x3().d0(Z.i.n.f103751a);
                        C17963o1 c17963o1 = this.f117979e;
                        String strB4 = AbstractC5607a.INSTANCE.d(((Z.j.PaymentCardRelatedFailedEvent) jVar).getMessageId(), new Object[0]).b(this.f117980f);
                        EnumC17957m1 enumC17957m1 = EnumC17957m1.f168343b;
                        this.f117976b = jVar;
                        this.f117975a = 1;
                        if (C17963o1.e(c17963o1, strB4, null, enumC17957m1, this, 2, null) == objF) {
                            return objF;
                        }
                    } else if (jVar instanceof Z.j.CardFailEvent) {
                        C12909c2.g(((Z.j.CardFailEvent) jVar).getFormattedString(), this.f117980f);
                        Unit unit = Unit.f142422a;
                    } else if (jVar instanceof Z.j.CardErrorEvent) {
                        C12909c2.g(AbstractC5607a.INSTANCE.c(((Z.j.CardErrorEvent) jVar).getRetrofitException().c(this.f117980f)), this.f117980f);
                        Unit unit2 = Unit.f142422a;
                    } else if (jVar instanceof Z.j.d) {
                        com.meijer.mobile.meijer.activity.checkout.review.z1 z1VarY3 = this.f117978d.y3();
                        PaymentOption paymentOptionE = this.f117978d.x3().Z().getValue().getPaymentOptions().k().e();
                        if (paymentOptionE == null) {
                            paymentOptionE = new PaymentOption(null, null, null, null, null, false, null, null, null, null, false, null, null, 8191, null);
                        }
                        z1VarY3.r0(new z1.h.UpdatePaymentDetails(new MultiTenderPaymentOption(paymentOptionE, this.f117978d.x3().Z().getValue().getEbtPaymentOption())));
                        Unit unit3 = Unit.f142422a;
                    } else if (jVar instanceof Z.j.ShowPaymentErrorDialog) {
                        Z.j.ShowPaymentErrorDialog showPaymentErrorDialog = (Z.j.ShowPaymentErrorDialog) jVar;
                        C14886b message = new C14886b(this.f117980f).setTitle(showPaymentErrorDialog.getTitle()).setMessage(showPaymentErrorDialog.getMessage());
                        int buttonText = showPaymentErrorDialog.getButtonText();
                        final SinglePageCheckoutActivity singlePageCheckoutActivity = this.f117978d;
                        message.setPositiveButton(buttonText, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.z1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i11) {
                                SinglePageCheckoutActivity.C12892q.a.q(singlePageCheckoutActivity, dialogInterface, i11);
                            }
                        }).show();
                    } else if (jVar instanceof Z.j.ShowEbtPinPadEvent) {
                        this.f117978d.x3().d0(new Z.i.UpdatePinPadBody(((Z.j.ShowEbtPinPadEvent) jVar).getAcculynkPostBody()));
                        Unit unit4 = Unit.f142422a;
                    } else if (jVar instanceof Z.j.ShowEBTCheckBalanceLimitReached) {
                        Z.j.ShowEBTCheckBalanceLimitReached showEBTCheckBalanceLimitReached = (Z.j.ShowEBTCheckBalanceLimitReached) jVar;
                        AbstractC5607a errorTitle = showEBTCheckBalanceLimitReached.getErrorTitle();
                        String strB5 = showEBTCheckBalanceLimitReached.getErrorMessage().b(this.f117980f);
                        Context context = this.f117980f;
                        final SinglePageCheckoutActivity singlePageCheckoutActivity2 = this.f117978d;
                        C12909c2.j(errorTitle, strB5, context, new Function1() { // from class: com.meijer.mobile.singlepagecheckout.A1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return SinglePageCheckoutActivity.C12892q.a.r(singlePageCheckoutActivity2, (DialogInterface) obj2);
                            }
                        }, null, null, null, AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100352u4, new Object[0]).b(this.f117980f), true, 112, null);
                        Unit unit5 = Unit.f142422a;
                    } else {
                        if (!(jVar instanceof Z.j.h)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        boolean zE = Intrinsics.e(this.f117978d.x3().Z().getValue().getEbtErrorDialogDecorator().getErrorCode().getValue(), Gm.a.f11640k.getValue());
                        AbstractC5607a title = this.f117978d.x3().Z().getValue().getEbtErrorDialogDecorator().getTitle();
                        if (this.f117978d.x3().Z().getValue().getEbtErrorDialogDecorator().getInSufficientBalanceStatus()) {
                            strB = this.f117978d.x3().Z().getValue().getEbtErrorDialogDecorator().getMessage().b(this.f117980f) + this.f117978d.x3().Z().getValue().getEbtErrorDialogDecorator().getInSufficientMessage().b(this.f117980f);
                        } else {
                            strB = this.f117978d.x3().Z().getValue().getEbtErrorDialogDecorator().getMessage().b(this.f117980f);
                        }
                        String str = strB;
                        if (zE) {
                            final SinglePageCheckoutActivity singlePageCheckoutActivity3 = this.f117978d;
                            function1 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.B1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return SinglePageCheckoutActivity.C12892q.a.s(singlePageCheckoutActivity3, (DialogInterface) obj2);
                                }
                            };
                            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
                            strB2 = companion.d(com.meijer.mobile.meijer.Y.f99529Dh, new Object[0]).b(this.f117980f);
                            strB3 = companion.d(com.meijer.mobile.meijer.Y.f100169l1, new Object[0]).b(this.f117980f);
                            final SinglePageCheckoutActivity singlePageCheckoutActivity4 = this.f117978d;
                            function12 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.C1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return SinglePageCheckoutActivity.C12892q.a.t(singlePageCheckoutActivity4, (DialogInterface) obj2);
                                }
                            };
                        } else {
                            final SinglePageCheckoutActivity singlePageCheckoutActivity5 = this.f117978d;
                            function1 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.D1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return SinglePageCheckoutActivity.C12892q.a.u(singlePageCheckoutActivity5, (DialogInterface) obj2);
                                }
                            };
                            strB2 = AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100169l1, new Object[0]).b(this.f117980f);
                            strB3 = "";
                            function12 = null;
                        }
                        C12909c2.j(title, str, this.f117980f, function1, function12, null, strB3, strB2, true, 32, null);
                        Unit unit6 = Unit.f142422a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void q(SinglePageCheckoutActivity singlePageCheckoutActivity, DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
                singlePageCheckoutActivity.x3().d0(Z.i.l.f103749a);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(SinglePageCheckoutActivity singlePageCheckoutActivity, DialogInterface dialogInterface) {
                singlePageCheckoutActivity.x3().d0(new Z.i.SetIsProcessingEbtPanResponse(false));
                dialogInterface.dismiss();
                singlePageCheckoutActivity.x3().d0(Z.i.c.f103736a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit s(SinglePageCheckoutActivity singlePageCheckoutActivity, DialogInterface dialogInterface) {
                String token;
                dialogInterface.dismiss();
                com.meijer.mobile.meijer.activity.checkout.payment.Z zX3 = singlePageCheckoutActivity.x3();
                EbtPanResponse ebtPanResponse = singlePageCheckoutActivity.ebtPanResponse;
                String cardExpiration = null;
                if (ebtPanResponse != null) {
                    token = ebtPanResponse.getToken();
                } else {
                    token = null;
                }
                EbtPanResponse ebtPanResponse2 = singlePageCheckoutActivity.ebtPanResponse;
                if (ebtPanResponse2 != null) {
                    cardExpiration = ebtPanResponse2.getCardExpiration();
                }
                zX3.d0(new Z.i.ShowEbtPinPad(token, cardExpiration, true));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit t(SinglePageCheckoutActivity singlePageCheckoutActivity, DialogInterface dialogInterface) {
                dialogInterface.dismiss();
                singlePageCheckoutActivity.x3().d0(Z.i.c.f103736a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit u(SinglePageCheckoutActivity singlePageCheckoutActivity, DialogInterface dialogInterface) {
                dialogInterface.dismiss();
                singlePageCheckoutActivity.x3().d0(Z.i.c.f103736a);
                return Unit.f142422a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SinglePageCheckoutActivity.this.new C12892q(this.f117971c, this.f117972d, this.f117973e, this.f117974f, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12892q(InterfaceC16622O interfaceC16622O, C17963o1 c17963o1, Context context, C17893M0 c17893m0, Continuation<? super C12892q> continuation) {
            super(2, continuation);
            this.f117971c = interfaceC16622O;
            this.f117972d = c17963o1;
            this.f117973e = context;
            this.f117974f = c17893m0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12892q) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f117969a == 0) {
                ResultKt.b(obj);
                C17154h.J(C17154h.O(SinglePageCheckoutActivity.this.x3().W().b(), new a(this.f117971c, SinglePageCheckoutActivity.this, this.f117972d, this.f117973e, this.f117974f, null)), C6031t.a(SinglePageCheckoutActivity.this));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObservePaymentEvents$3$1", f = "SinglePageCheckoutActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$r, reason: case insensitive filesystem */
    static final class C12893r extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f117986a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f117988c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C17893M0 f117989d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h;", "effect", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObservePaymentEvents$3$1$1", f = "SinglePageCheckoutActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$r$a */
        static final class a extends SuspendLambda implements Function2<r.h, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f117990a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f117991b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ SinglePageCheckoutActivity f117992c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f117993d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C17893M0 f117994e;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObservePaymentEvents$3$1$1$1", f = "SinglePageCheckoutActivity.kt", l = {1318}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$r$a$a, reason: collision with other inner class name */
            static final class C1911a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f117995a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17893M0 f117996b;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1911a(this.f117996b, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1911a(C17893M0 c17893m0, Continuation<? super C1911a> continuation) {
                    super(2, continuation);
                    this.f117996b = c17893m0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C1911a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f117995a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17893M0 c17893m0 = this.f117996b;
                        this.f117995a = 1;
                        if (c17893m0.i(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f117992c, this.f117993d, this.f117994e, continuation);
                aVar.f117991b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(r.h hVar, Continuation<? super Unit> continuation) {
                return ((a) create(hVar, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SinglePageCheckoutActivity singlePageCheckoutActivity, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f117992c = singlePageCheckoutActivity;
                this.f117993d = interfaceC16622O;
                this.f117994e = c17893m0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Resources.NotFoundException, IOException {
                IntrinsicsKt.f();
                if (this.f117990a == 0) {
                    ResultKt.b(obj);
                    r.h hVar = (r.h) this.f117991b;
                    if (hVar instanceof r.h.a) {
                        if (this.f117992c.y3().h0().getValue().booleanValue()) {
                            C16648k.d(this.f117993d, null, null, new C1911a(this.f117994e, null), 3, null);
                            this.f117992c.y3().r0(z1.h.e.f105118a);
                            this.f117992c.y3().r0(z1.h.l.f105125a);
                            this.f117992c.y3().F0(true);
                        } else {
                            this.f117992c.x3().d0(Z.i.j.f103747a);
                        }
                    } else if (hVar instanceof r.h.ShowErrorState) {
                        if (this.f117992c.y3().h0().getValue().booleanValue()) {
                            this.f117992c.y3().r0(z1.h.C1530h.f105121a);
                            r.h.ShowErrorState showErrorState = (r.h.ShowErrorState) hVar;
                            String errorCode = showErrorState.getErrorCode();
                            if (errorCode != null && errorCode.length() != 0) {
                                String errorMessage = showErrorState.getErrorMessage();
                                if (errorMessage != null) {
                                    this.f117992c.y3().r0(new z1.h.TrackEBTErrorAnalytics(errorMessage));
                                }
                                Gm.a aVarA = Gm.a.INSTANCE.a(showErrorState.getErrorCode());
                                SinglePageCheckoutActivity singlePageCheckoutActivity = this.f117992c;
                                String string = singlePageCheckoutActivity.getResources().getString(aVarA.getHeaderResourceId());
                                Intrinsics.i(string, "getString(...)");
                                String string2 = this.f117992c.getResources().getString(aVarA.getMessageResourceId());
                                Intrinsics.i(string2, "getString(...)");
                                singlePageCheckoutActivity.Q3(string, string2);
                            } else if (!this.f117992c.D3().getTimerRunningStatus()) {
                                this.f117992c.X3();
                            }
                        } else {
                            r.h.ShowErrorState showErrorState2 = (r.h.ShowErrorState) hVar;
                            this.f117992c.x3().d0(new Z.i.EBTErrorResponseHandler(showErrorState2.getErrorCode(), showErrorState2.getErrorMessage(), showErrorState2.getEbtBalance()));
                            this.f117992c.x3().d0(Z.i.j.f103747a);
                        }
                    } else if (hVar instanceof r.h.HandlePinPadSuccess) {
                        if (!this.f117992c.y3().h0().getValue().booleanValue()) {
                            this.f117992c.J3(((r.h.HandlePinPadSuccess) hVar).getEbtBalance());
                        } else {
                            this.f117992c.D3().g();
                            this.f117992c.y3().r0(z1.h.i.f105122a);
                        }
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
            return SinglePageCheckoutActivity.this.new C12893r(this.f117988c, this.f117989d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12893r(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, Continuation<? super C12893r> continuation) {
            super(2, continuation);
            this.f117988c = interfaceC16622O;
            this.f117989d = c17893m0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12893r) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f117986a == 0) {
                ResultKt.b(obj);
                C17154h.J(C17154h.O(SinglePageCheckoutActivity.this.C3().G().a(), new a(SinglePageCheckoutActivity.this, this.f117988c, this.f117989d, null)), C6031t.a(SinglePageCheckoutActivity.this));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObserveScrollEvents$1$1", f = "SinglePageCheckoutActivity.kt", l = {1071}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$s, reason: case insensitive filesystem */
    static final class C12894s extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f117997a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC16183a f117999c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC16183a f118000d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC16183a f118001e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$s$a */
        static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16183a f118002a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC16183a f118003b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC16183a f118004c;

            a(InterfaceC16183a interfaceC16183a, InterfaceC16183a interfaceC16183a2, InterfaceC16183a interfaceC16183a3) {
                this.f118002a = interfaceC16183a;
                this.f118003b = interfaceC16183a2;
                this.f118004c = interfaceC16183a3;
            }

            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(C0 c02, Continuation<? super Unit> continuation) {
                if (Intrinsics.e(c02, D0.f117668a)) {
                    Object objA = InterfaceC16183a.a(this.f118002a, null, continuation, 1, null);
                    return objA == IntrinsicsKt.f() ? objA : Unit.f142422a;
                }
                if (Intrinsics.e(c02, F0.f117686a)) {
                    Object objA2 = InterfaceC16183a.a(this.f118003b, null, continuation, 1, null);
                    return objA2 == IntrinsicsKt.f() ? objA2 : Unit.f142422a;
                }
                if (!Intrinsics.e(c02, E0.f117675a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objA3 = InterfaceC16183a.a(this.f118004c, null, continuation, 1, null);
                return objA3 == IntrinsicsKt.f() ? objA3 : Unit.f142422a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SinglePageCheckoutActivity.this.new C12894s(this.f117999c, this.f118000d, this.f118001e, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12894s(InterfaceC16183a interfaceC16183a, InterfaceC16183a interfaceC16183a2, InterfaceC16183a interfaceC16183a3, Continuation<? super C12894s> continuation) {
            super(2, continuation);
            this.f117999c = interfaceC16183a;
            this.f118000d = interfaceC16183a2;
            this.f118001e = interfaceC16183a3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12894s) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f117997a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                InterfaceC17144F<C0> interfaceC17144FJ0 = SinglePageCheckoutActivity.this.y3().j0();
                a aVar = new a(this.f117999c, this.f118000d, this.f118001e);
                this.f117997a = 1;
                if (interfaceC17144FJ0.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$t, reason: case insensitive filesystem */
    public /* synthetic */ class C12895t {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC12898a.values().length];
            try {
                iArr[EnumC12898a.f118136b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC12898a.f118137c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC12898a.f118141g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC12898a.f118142h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC12898a.f118143i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC12898a.f118139e.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC12898a.f118138d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC12898a.f118140f.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC12898a.f118135a.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC12898a.f118144j.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC12898a.f118146l.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC12898a.f118145k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$u, reason: case insensitive filesystem */
    static final class C12896u implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$u$a */
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SinglePageCheckoutActivity f118006a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f118007b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C17893M0 f118008c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C17963o1 f118009d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC16183a f118010e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC16183a f118011f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC16183a f118012g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<EnumC12898a> f118013h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ C17927c1 f118014i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f118015j;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$u$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1912a extends FunctionReferenceImpl implements Function1<EnumC12898a, Unit> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC16622O f118016b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C17893M0 f118017c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<EnumC12898a> f118018d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1912a(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, InterfaceC5730l0<EnumC12898a> interfaceC5730l0) {
                    super(1, Intrinsics.Kotlin.class, "openSheet", "invoke$openSheet(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material/ModalBottomSheetState;Landroidx/compose/runtime/MutableState;Lcom/meijer/mobile/singlepagecheckout/BottomSheetType;)V", 0);
                    this.f118016b = interfaceC16622O;
                    this.f118017c = c17893m0;
                    this.f118018d = interfaceC5730l0;
                }

                public final void a(EnumC12898a p02) {
                    Intrinsics.j(p02, "p0");
                    C12896u.l(this.f118016b, this.f118017c, this.f118018d, p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(EnumC12898a enumC12898a) {
                    a(enumC12898a);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$u$a$b */
            /* synthetic */ class b extends FunctionReferenceImpl implements Function1<EnumC12898a, Unit> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC16622O f118019b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C17893M0 f118020c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<EnumC12898a> f118021d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, InterfaceC5730l0<EnumC12898a> interfaceC5730l0) {
                    super(1, Intrinsics.Kotlin.class, "openSheet", "invoke$openSheet(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material/ModalBottomSheetState;Landroidx/compose/runtime/MutableState;Lcom/meijer/mobile/singlepagecheckout/BottomSheetType;)V", 0);
                    this.f118019b = interfaceC16622O;
                    this.f118020c = c17893m0;
                    this.f118021d = interfaceC5730l0;
                }

                public final void a(EnumC12898a p02) {
                    Intrinsics.j(p02, "p0");
                    C12896u.l(this.f118019b, this.f118020c, this.f118021d, p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(EnumC12898a enumC12898a) {
                    a(enumC12898a);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$u$a$c */
            /* synthetic */ class c extends FunctionReferenceImpl implements Function1<EnumC12898a, Unit> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC16622O f118022b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C17893M0 f118023c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<EnumC12898a> f118024d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, InterfaceC5730l0<EnumC12898a> interfaceC5730l0) {
                    super(1, Intrinsics.Kotlin.class, "openSheet", "invoke$openSheet(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material/ModalBottomSheetState;Landroidx/compose/runtime/MutableState;Lcom/meijer/mobile/singlepagecheckout/BottomSheetType;)V", 0);
                    this.f118022b = interfaceC16622O;
                    this.f118023c = c17893m0;
                    this.f118024d = interfaceC5730l0;
                }

                public final void a(EnumC12898a p02) {
                    Intrinsics.j(p02, "p0");
                    C12896u.l(this.f118022b, this.f118023c, this.f118024d, p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(EnumC12898a enumC12898a) {
                    a(enumC12898a);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$u$a$d */
            static final class d implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C17927c1 f118025a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f118026b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ SinglePageCheckoutActivity f118027c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C17963o1 f118028d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC16622O f118029e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ C17893M0 f118030f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.z1<Z.PaymentOptionsViewState> f118031g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Function1<Qq.o, Unit> f118032h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ InterfaceC16183a f118033i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ InterfaceC16183a f118034j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ InterfaceC16183a f118035k;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<EnumC12898a> f118036l;

                /* renamed from: m, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.z1<FulfillmentSlotsViewState> f118037m;

                /* renamed from: n, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f118038n;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$u$a$d$a, reason: collision with other inner class name */
                static final class C1913a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f118039a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ SinglePageCheckoutActivity f118040b;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$u$a$d$a$a, reason: collision with other inner class name */
                    static final class C1914a implements Function2<Composer, Integer, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f118041a;

                        C1914a(LocalThemeScope localThemeScope) {
                            this.f118041a = localThemeScope;
                        }

                        public final void a(Composer composer, int i10) {
                            if ((i10 & 3) == 2 && composer.j()) {
                                composer.K();
                                return;
                            }
                            if (ComposerKt.M()) {
                                ComposerKt.U(1622422611, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SinglePageCheckoutActivity.kt:324)");
                            }
                            Dr.g.g(this.f118041a, C16193g.c(C17135b.f162048t0, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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
                            ComposerKt.U(-952073965, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SinglePageCheckoutActivity.kt:322)");
                        }
                        AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(Bj.o.f3035p, new Object[0]);
                        C.f.d dVar = C.f.d.f15507e;
                        LocalThemeScope localThemeScope = this.f118039a;
                        ComposableLambda composableLambdaC = ComposableLambdaKt.c(1622422611, true, new C1914a(localThemeScope), composer, 54);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f118040b);
                        final SinglePageCheckoutActivity singlePageCheckoutActivity = this.f118040b;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.I1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SinglePageCheckoutActivity.C12896u.a.d.C1913a.c(singlePageCheckoutActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, dVar, 0.0f, false, abstractC5607aD, composer, LocalThemeScope.f15770g | 24576 | (C.f.d.f15508f << 18) | (AbstractC5607a.f45514b << 27), 199);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    C1913a(LocalThemeScope localThemeScope, SinglePageCheckoutActivity singlePageCheckoutActivity) {
                        this.f118039a = localThemeScope;
                        this.f118040b = singlePageCheckoutActivity;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        b(composer, num.intValue());
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(SinglePageCheckoutActivity singlePageCheckoutActivity) throws IOException {
                        if (singlePageCheckoutActivity.y3().getShowEbtEnterPinLoadingScreen()) {
                            singlePageCheckoutActivity.y3().r0(z1.h.x.f105140a);
                        } else if (singlePageCheckoutActivity.y3().h0().getValue().booleanValue()) {
                            singlePageCheckoutActivity.O3();
                        } else {
                            singlePageCheckoutActivity.finish();
                        }
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$u$a$d$b */
                static final class b implements Function3<C17963o1, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ C17963o1 f118042a;

                    b(C17963o1 c17963o1) {
                        this.f118042a = c17963o1;
                    }

                    public final void a(C17963o1 it, Composer composer, int i10) {
                        Intrinsics.j(it, "it");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1535851935, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SinglePageCheckoutActivity.kt:319)");
                        }
                        C17960n1.b(this.f118042a, null, null, composer, 6, 6);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(C17963o1 c17963o1, Composer composer, Integer num) {
                        a(c17963o1, composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$u$a$d$c */
                static final class c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ SinglePageCheckoutActivity f118043a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ InterfaceC16622O f118044b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ C17893M0 f118045c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.runtime.z1<Z.PaymentOptionsViewState> f118046d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f118047e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ Function1<Qq.o, Unit> f118048f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ InterfaceC16183a f118049g;

                    /* renamed from: h, reason: collision with root package name */
                    final /* synthetic */ InterfaceC16183a f118050h;

                    /* renamed from: i, reason: collision with root package name */
                    final /* synthetic */ InterfaceC16183a f118051i;

                    /* renamed from: j, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5730l0<EnumC12898a> f118052j;

                    /* renamed from: k, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.runtime.z1<FulfillmentSlotsViewState> f118053k;

                    /* renamed from: l, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5730l0<Boolean> f118054l;

                    /* JADX WARN: Multi-variable type inference failed */
                    c(SinglePageCheckoutActivity singlePageCheckoutActivity, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, androidx.compose.runtime.z1<Z.PaymentOptionsViewState> z1Var, LocalThemeScope localThemeScope, Function1<? super Qq.o, Unit> function1, InterfaceC16183a interfaceC16183a, InterfaceC16183a interfaceC16183a2, InterfaceC16183a interfaceC16183a3, InterfaceC5730l0<EnumC12898a> interfaceC5730l0, androidx.compose.runtime.z1<FulfillmentSlotsViewState> z1Var2, InterfaceC5730l0<Boolean> interfaceC5730l02) {
                        this.f118043a = singlePageCheckoutActivity;
                        this.f118044b = interfaceC16622O;
                        this.f118045c = c17893m0;
                        this.f118046d = z1Var;
                        this.f118047e = localThemeScope;
                        this.f118048f = function1;
                        this.f118049g = interfaceC16183a;
                        this.f118050h = interfaceC16183a2;
                        this.f118051i = interfaceC16183a3;
                        this.f118052j = interfaceC5730l0;
                        this.f118053k = z1Var2;
                        this.f118054l = interfaceC5730l02;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit A(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, InterfaceC5730l0 interfaceC5730l0) {
                        C12896u.l(interfaceC16622O, c17893m0, interfaceC5730l0, EnumC12898a.f118137c);
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit B(SinglePageCheckoutActivity singlePageCheckoutActivity, androidx.compose.runtime.z1 z1Var, InterfaceC5730l0 interfaceC5730l0, String it) {
                        Intrinsics.j(it, "it");
                        if (a.l(z1Var).s().isEmpty()) {
                            AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100049f0, new Object[0]);
                            String string = singlePageCheckoutActivity.getString(com.meijer.mobile.meijer.Y.f100029e0);
                            Function1 function1 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.N1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SinglePageCheckoutActivity.C12896u.a.d.c.C((DialogInterface) obj);
                                }
                            };
                            String string2 = singlePageCheckoutActivity.getString(yr.Q.f170986b);
                            Intrinsics.i(string2, "getString(...)");
                            C12909c2.j(abstractC5607aD, string, singlePageCheckoutActivity, function1, null, null, null, string2, true, 112, null);
                        } else if (a.l(z1Var).getPaymentOptions().k().getIsValid()) {
                            singlePageCheckoutActivity.x3().d0(Z.i.k.f103748a);
                        } else {
                            C12896u.k(interfaceC5730l0, true);
                        }
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit C(DialogInterface dialog) {
                        Intrinsics.j(dialog, "dialog");
                        dialog.dismiss();
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit F(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, InterfaceC5730l0 interfaceC5730l0) {
                        C12896u.l(interfaceC16622O, c17893m0, interfaceC5730l0, EnumC12898a.f118144j);
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit G(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, InterfaceC5730l0 interfaceC5730l0) {
                        C12896u.l(interfaceC16622O, c17893m0, interfaceC5730l0, EnumC12898a.f118138d);
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit H(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, InterfaceC5730l0 interfaceC5730l0) {
                        C12896u.l(interfaceC16622O, c17893m0, interfaceC5730l0, EnumC12898a.f118139e);
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit u(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, InterfaceC5730l0 interfaceC5730l0) {
                        C12896u.l(interfaceC16622O, c17893m0, interfaceC5730l0, EnumC12898a.f118138d);
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit v(SinglePageCheckoutActivity singlePageCheckoutActivity) {
                        singlePageCheckoutActivity.startActivity(Al.b.f662a.a(singlePageCheckoutActivity));
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit w(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, InterfaceC5730l0 interfaceC5730l0) {
                        C12896u.l(interfaceC16622O, c17893m0, interfaceC5730l0, EnumC12898a.f118146l);
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit x(final SinglePageCheckoutActivity singlePageCheckoutActivity) {
                        AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100421xd, new Object[0]);
                        String string = singlePageCheckoutActivity.getString(com.meijer.mobile.meijer.Y.f100401wd);
                        String string2 = singlePageCheckoutActivity.getString(com.meijer.mobile.meijer.Y.f100341td);
                        Intrinsics.i(string2, "getString(...)");
                        String string3 = singlePageCheckoutActivity.getString(com.meijer.mobile.meijer.Y.f100321sd);
                        Intrinsics.i(string3, "getString(...)");
                        C12909c2.j(abstractC5607aD, string, singlePageCheckoutActivity, new Function1() { // from class: com.meijer.mobile.singlepagecheckout.L1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SinglePageCheckoutActivity.C12896u.a.d.c.y(singlePageCheckoutActivity, (DialogInterface) obj);
                            }
                        }, new Function1() { // from class: com.meijer.mobile.singlepagecheckout.M1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SinglePageCheckoutActivity.C12896u.a.d.c.z((DialogInterface) obj);
                            }
                        }, null, string3, string2, true, 32, null);
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit y(SinglePageCheckoutActivity singlePageCheckoutActivity, DialogInterface dialog) {
                        Intrinsics.j(dialog, "dialog");
                        dialog.dismiss();
                        singlePageCheckoutActivity.x3().d0(Z.i.m.f103750a);
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit z(DialogInterface dialog) {
                        Intrinsics.j(dialog, "dialog");
                        dialog.dismiss();
                        return Unit.f142422a;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) throws IOException {
                        t(interfaceC14794C, composer, num.intValue());
                        return Unit.f142422a;
                    }

                    public final void t(InterfaceC14794C contentPadding, Composer composer, int i10) throws IOException {
                        int i11;
                        Intrinsics.j(contentPadding, "contentPadding");
                        if ((i10 & 6) == 0) {
                            i11 = i10 | (composer.V(contentPadding) ? 4 : 2);
                        } else {
                            i11 = i10;
                        }
                        if ((i11 & 19) == 18 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-869870470, i11, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SinglePageCheckoutActivity.kt:338)");
                        }
                        InterfaceC5730l0 interfaceC5730l0 = this.f118043a.modalToShow;
                        InterfaceC5730l0 interfaceC5730l02 = null;
                        if (interfaceC5730l0 == null) {
                            Intrinsics.y("modalToShow");
                            interfaceC5730l0 = null;
                        }
                        Hj.d dVar = (Hj.d) interfaceC5730l0.getValue();
                        composer.startReplaceGroup(1573103161);
                        if (dVar != null) {
                            Hj.g.b(this.f118047e, dVar, composer, LocalThemeScope.f15770g | (Hj.d.f12658i << 3));
                            Unit unit = Unit.f142422a;
                        }
                        composer.P();
                        Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, contentPadding);
                        boolean zE = this.f118043a.getFeatureManager().e(AbstractC18227f.C18235i.f170582h);
                        boolean zE2 = this.f118043a.getFeatureManager().e(AbstractC18227f.i0.f170583h);
                        boolean zE3 = this.f118043a.getFeatureManager().e(AbstractC18227f.C18237k.f170586h);
                        com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1 q1VarF3 = this.f118043a.F3();
                        boolean zK3 = this.f118043a.K3();
                        composer.startReplaceGroup(-1746271574);
                        boolean zD = composer.D(this.f118044b) | composer.D(this.f118045c);
                        final InterfaceC16622O interfaceC16622O = this.f118044b;
                        final C17893M0 c17893m0 = this.f118045c;
                        final InterfaceC5730l0<EnumC12898a> interfaceC5730l03 = this.f118052j;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.J1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SinglePageCheckoutActivity.C12896u.a.d.c.A(interfaceC16622O, c17893m0, interfaceC5730l03);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        FulfillmentSlotsCardDecorator fulfillmentSlotsCardDecorator = new FulfillmentSlotsCardDecorator(zE, zE3, zE2, q1VarF3, zK3, null, (Function0) objB, 32, null);
                        com.meijer.mobile.meijer.activity.checkout.contactinformation.H hA3 = this.f118043a.A3();
                        C11932p c11932pG3 = this.f118043a.G3();
                        boolean zK32 = this.f118043a.K3();
                        boolean zE4 = Intrinsics.e(a.s(this.f118053k).getFulfillmentMode(), "pickup");
                        composer.startReplaceGroup(-1746271574);
                        boolean zD2 = composer.D(this.f118044b) | composer.D(this.f118045c);
                        final InterfaceC16622O interfaceC16622O2 = this.f118044b;
                        final C17893M0 c17893m02 = this.f118045c;
                        final InterfaceC5730l0<EnumC12898a> interfaceC5730l04 = this.f118052j;
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.P1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SinglePageCheckoutActivity.C12896u.a.d.c.F(interfaceC16622O2, c17893m02, interfaceC5730l04);
                                }
                            };
                            composer.t(objB2);
                        }
                        composer.P();
                        C12937l c12937l = new C12937l(c11932pG3, hA3, zK32, zE4, (Function0) objB2);
                        C12906c c12906cZ3 = this.f118043a.z3();
                        com.meijer.mobile.meijer.activity.checkout.payment.Z zX3 = this.f118043a.x3();
                        composer.startReplaceGroup(-1746271574);
                        boolean zD3 = composer.D(this.f118044b) | composer.D(this.f118045c);
                        final InterfaceC16622O interfaceC16622O3 = this.f118044b;
                        final C17893M0 c17893m03 = this.f118045c;
                        final InterfaceC5730l0<EnumC12898a> interfaceC5730l05 = this.f118052j;
                        Object objB3 = composer.B();
                        if (zD3 || objB3 == Composer.INSTANCE.a()) {
                            objB3 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.Q1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SinglePageCheckoutActivity.C12896u.a.d.c.G(interfaceC16622O3, c17893m03, interfaceC5730l05);
                                }
                            };
                            composer.t(objB3);
                        }
                        Function0 function0 = (Function0) objB3;
                        composer.P();
                        composer.startReplaceGroup(-1746271574);
                        boolean zD4 = composer.D(this.f118044b) | composer.D(this.f118045c);
                        final InterfaceC16622O interfaceC16622O4 = this.f118044b;
                        final C17893M0 c17893m04 = this.f118045c;
                        final InterfaceC5730l0<EnumC12898a> interfaceC5730l06 = this.f118052j;
                        Object objB4 = composer.B();
                        if (zD4 || objB4 == Composer.INSTANCE.a()) {
                            objB4 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.R1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SinglePageCheckoutActivity.C12896u.a.d.c.H(interfaceC16622O4, c17893m04, interfaceC5730l06);
                                }
                            };
                            composer.t(objB4);
                        }
                        Function0 function02 = (Function0) objB4;
                        composer.P();
                        composer.startReplaceGroup(-1746271574);
                        boolean zD5 = composer.D(this.f118044b) | composer.D(this.f118045c);
                        final InterfaceC16622O interfaceC16622O5 = this.f118044b;
                        final C17893M0 c17893m05 = this.f118045c;
                        final InterfaceC5730l0<EnumC12898a> interfaceC5730l07 = this.f118052j;
                        Object objB5 = composer.B();
                        if (zD5 || objB5 == Composer.INSTANCE.a()) {
                            objB5 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.S1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SinglePageCheckoutActivity.C12896u.a.d.c.u(interfaceC16622O5, c17893m05, interfaceC5730l07);
                                }
                            };
                            composer.t(objB5);
                        }
                        Function0 function03 = (Function0) objB5;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD6 = composer.D(this.f118043a);
                        final SinglePageCheckoutActivity singlePageCheckoutActivity = this.f118043a;
                        Object objB6 = composer.B();
                        if (zD6 || objB6 == Composer.INSTANCE.a()) {
                            objB6 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.T1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SinglePageCheckoutActivity.C12896u.a.d.c.v(singlePageCheckoutActivity);
                                }
                            };
                            composer.t(objB6);
                        }
                        Function0 function04 = (Function0) objB6;
                        composer.P();
                        composer.startReplaceGroup(-1746271574);
                        boolean zD7 = composer.D(this.f118044b) | composer.D(this.f118045c);
                        final InterfaceC16622O interfaceC16622O6 = this.f118044b;
                        final C17893M0 c17893m06 = this.f118045c;
                        final InterfaceC5730l0<EnumC12898a> interfaceC5730l08 = this.f118052j;
                        Object objB7 = composer.B();
                        if (zD7 || objB7 == Composer.INSTANCE.a()) {
                            objB7 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.U1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SinglePageCheckoutActivity.C12896u.a.d.c.w(interfaceC16622O6, c17893m06, interfaceC5730l08);
                                }
                            };
                            composer.t(objB7);
                        }
                        Function0 function05 = (Function0) objB7;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD8 = composer.D(this.f118043a);
                        final SinglePageCheckoutActivity singlePageCheckoutActivity2 = this.f118043a;
                        Object objB8 = composer.B();
                        if (zD8 || objB8 == Composer.INSTANCE.a()) {
                            objB8 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.V1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SinglePageCheckoutActivity.C12896u.a.d.c.x(singlePageCheckoutActivity2);
                                }
                            };
                            composer.t(objB8);
                        }
                        Function0 function06 = (Function0) objB8;
                        composer.P();
                        composer.startReplaceGroup(-1746271574);
                        boolean zV = composer.V(this.f118046d) | composer.D(this.f118043a);
                        final SinglePageCheckoutActivity singlePageCheckoutActivity3 = this.f118043a;
                        final androidx.compose.runtime.z1<Z.PaymentOptionsViewState> z1Var = this.f118046d;
                        final InterfaceC5730l0<Boolean> interfaceC5730l09 = this.f118054l;
                        Object objB9 = composer.B();
                        if (zV || objB9 == Composer.INSTANCE.a()) {
                            objB9 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.W1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SinglePageCheckoutActivity.C12896u.a.d.c.B(singlePageCheckoutActivity3, z1Var, interfaceC5730l09, (String) obj);
                                }
                            };
                            composer.t(objB9);
                        }
                        composer.P();
                        Rq.N n10 = new Rq.N(zX3, function0, function02, function03, function04, function05, function06, (Function1) objB9);
                        boolean zK33 = this.f118043a.K3();
                        com.meijer.mobile.meijer.activity.checkout.review.z1 z1VarY3 = this.f118043a.y3();
                        boolean zE5 = this.f118043a.getFeatureManager().e(AbstractC18227f.y0.f170615h);
                        InterfaceC5730l0 interfaceC5730l010 = this.f118043a.displayCheckoutAnimations;
                        if (interfaceC5730l010 == null) {
                            Intrinsics.y("displayCheckoutAnimations");
                        } else {
                            interfaceC5730l02 = interfaceC5730l010;
                        }
                        com.meijer.mobile.meijer.activity.cart.entrynote.i iVarE3 = this.f118043a.E3();
                        LocalThemeScope localThemeScope = this.f118047e;
                        InterfaceC5730l0 interfaceC5730l011 = interfaceC5730l02;
                        Function1<Qq.o, Unit> function1 = this.f118048f;
                        composer.startReplaceGroup(5004770);
                        boolean zD9 = composer.D(this.f118043a);
                        final SinglePageCheckoutActivity singlePageCheckoutActivity4 = this.f118043a;
                        Object objB10 = composer.B();
                        if (zD9 || objB10 == Composer.INSTANCE.a()) {
                            objB10 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.K1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SinglePageCheckoutActivity.C12896u.a.d.c.D(singlePageCheckoutActivity4);
                                }
                            };
                            composer.t(objB10);
                        }
                        Function0 function07 = (Function0) objB10;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD10 = composer.D(this.f118043a);
                        final SinglePageCheckoutActivity singlePageCheckoutActivity5 = this.f118043a;
                        Object objB11 = composer.B();
                        if (zD10 || objB11 == Composer.INSTANCE.a()) {
                            objB11 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.O1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SinglePageCheckoutActivity.C12896u.a.d.c.E(singlePageCheckoutActivity5);
                                }
                            };
                            composer.t(objB11);
                        }
                        composer.P();
                        y2.I(localThemeScope, fulfillmentSlotsCardDecorator, n10, c12937l, c12906cZ3, z1VarY3, zK33, zE5, iVarE3, modifierH, interfaceC5730l011, function1, function07, (Function0) objB11, this.f118049g, this.f118050h, this.f118051i, composer, LocalThemeScope.f15770g, 0, 0);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit D(SinglePageCheckoutActivity singlePageCheckoutActivity) {
                        singlePageCheckoutActivity.L3();
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit E(SinglePageCheckoutActivity singlePageCheckoutActivity) {
                        singlePageCheckoutActivity.M3(singlePageCheckoutActivity.y3().g0().c().getValue().getSubstitutionPreference());
                        return Unit.f142422a;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                d(C17927c1 c17927c1, LocalThemeScope localThemeScope, SinglePageCheckoutActivity singlePageCheckoutActivity, C17963o1 c17963o1, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, androidx.compose.runtime.z1<Z.PaymentOptionsViewState> z1Var, Function1<? super Qq.o, Unit> function1, InterfaceC16183a interfaceC16183a, InterfaceC16183a interfaceC16183a2, InterfaceC16183a interfaceC16183a3, InterfaceC5730l0<EnumC12898a> interfaceC5730l0, androidx.compose.runtime.z1<FulfillmentSlotsViewState> z1Var2, InterfaceC5730l0<Boolean> interfaceC5730l02) {
                    this.f118025a = c17927c1;
                    this.f118026b = localThemeScope;
                    this.f118027c = singlePageCheckoutActivity;
                    this.f118028d = c17963o1;
                    this.f118029e = interfaceC16622O;
                    this.f118030f = c17893m0;
                    this.f118031g = z1Var;
                    this.f118032h = function1;
                    this.f118033i = interfaceC16183a;
                    this.f118034j = interfaceC16183a2;
                    this.f118035k = interfaceC16183a3;
                    this.f118036l = interfaceC5730l0;
                    this.f118037m = z1Var2;
                    this.f118038n = interfaceC5730l02;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-746769928, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SinglePageCheckoutActivity.kt:317)");
                    }
                    C17921a1.a(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), this.f118025a, ComposableLambdaKt.c(-952073965, true, new C1913a(this.f118026b, this.f118027c), composer, 54), null, ComposableLambdaKt.c(1535851935, true, new b(this.f118028d), composer, 54), null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-869870470, true, new c(this.f118027c, this.f118029e, this.f118030f, this.f118031g, this.f118026b, this.f118032h, this.f118033i, this.f118034j, this.f118035k, this.f118036l, this.f118037m, this.f118038n), composer, 54), composer, 24960, 12582912, 131048);
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
            @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$onCreate$1$1$closeSheet$1$1$1", f = "SinglePageCheckoutActivity.kt", l = {223}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$u$a$e */
            static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f118055a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17893M0 f118056b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<EnumC12898a> f118057c;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new e(this.f118056b, this.f118057c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(C17893M0 c17893m0, InterfaceC5730l0<EnumC12898a> interfaceC5730l0, Continuation<? super e> continuation) {
                    super(2, continuation);
                    this.f118056b = c17893m0;
                    this.f118057c = interfaceC5730l0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f118055a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17893M0 c17893m0 = this.f118056b;
                        this.f118055a = 1;
                        if (c17893m0.i(this) == objF) {
                            return objF;
                        }
                    }
                    C12896u.g(this.f118057c, EnumC12898a.f118135a);
                    return Unit.f142422a;
                }
            }

            a(SinglePageCheckoutActivity singlePageCheckoutActivity, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, C17963o1 c17963o1, InterfaceC16183a interfaceC16183a, InterfaceC16183a interfaceC16183a2, InterfaceC16183a interfaceC16183a3, InterfaceC5730l0<EnumC12898a> interfaceC5730l0, C17927c1 c17927c1, InterfaceC5730l0<Boolean> interfaceC5730l02) {
                this.f118006a = singlePageCheckoutActivity;
                this.f118007b = interfaceC16622O;
                this.f118008c = c17893m0;
                this.f118009d = c17963o1;
                this.f118010e = interfaceC16183a;
                this.f118011f = interfaceC16183a2;
                this.f118012g = interfaceC16183a3;
                this.f118013h = interfaceC5730l0;
                this.f118014i = c17927c1;
                this.f118015j = interfaceC5730l02;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(SinglePageCheckoutActivity singlePageCheckoutActivity, final InterfaceC16622O interfaceC16622O, final C17893M0 c17893m0, final InterfaceC5730l0 interfaceC5730l0, Qq.o action) throws IOException {
                Intrinsics.j(action, "action");
                singlePageCheckoutActivity.y3().n0(action, new Function1() { // from class: com.meijer.mobile.singlepagecheckout.H1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SinglePageCheckoutActivity.C12896u.a.q(interfaceC16622O, c17893m0, interfaceC5730l0, (z1.l) obj);
                    }
                });
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit q(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, InterfaceC5730l0 interfaceC5730l0, z1.l event) {
                Intrinsics.j(event, "event");
                if (Intrinsics.e(event, z1.l.a.f105172a)) {
                    C12896u.l(interfaceC16622O, c17893m0, interfaceC5730l0, EnumC12898a.f118141g);
                } else if (Intrinsics.e(event, z1.l.c.f105174a)) {
                    C12896u.l(interfaceC16622O, c17893m0, interfaceC5730l0, EnumC12898a.f118142h);
                } else {
                    if (!Intrinsics.e(event, z1.l.b.f105173a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C12896u.l(interfaceC16622O, c17893m0, interfaceC5730l0, EnumC12898a.f118143i);
                }
                return Unit.f142422a;
            }

            public final void g(LocalThemeScope AdsTheme, Composer composer, int i10) {
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
                    ComposerKt.U(1698932227, i11, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.onCreate.<anonymous>.<anonymous> (SinglePageCheckoutActivity.kt:219)");
                }
                composer.startReplaceGroup(-1224400529);
                boolean zD = composer.D(this.f118006a) | composer.D(this.f118007b) | composer.D(this.f118008c);
                final SinglePageCheckoutActivity singlePageCheckoutActivity = this.f118006a;
                final InterfaceC16622O interfaceC16622O = this.f118007b;
                final C17893M0 c17893m0 = this.f118008c;
                final InterfaceC5730l0<EnumC12898a> interfaceC5730l0 = this.f118013h;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.E1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SinglePageCheckoutActivity.C12896u.a.k(singlePageCheckoutActivity, interfaceC16622O, c17893m0, interfaceC5730l0);
                        }
                    };
                    composer.t(objB);
                }
                final Function0 function0 = (Function0) objB;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean zD2 = composer.D(this.f118006a) | composer.D(this.f118008c) | composer.V(function0);
                final SinglePageCheckoutActivity singlePageCheckoutActivity2 = this.f118006a;
                final C17893M0 c17893m02 = this.f118008c;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.F1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SinglePageCheckoutActivity.C12896u.a.r(singlePageCheckoutActivity2, c17893m02, function0);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                C13588d.a(false, (Function0) objB2, composer, 0, 1);
                SinglePageCheckoutActivity singlePageCheckoutActivity3 = this.f118006a;
                composer.startReplaceGroup(1849434622);
                Object objB3 = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB3 == companion.a()) {
                    objB3 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                    composer.t(objB3);
                }
                composer.P();
                singlePageCheckoutActivity3.displayCheckoutAnimations = (InterfaceC5730l0) objB3;
                SinglePageCheckoutActivity singlePageCheckoutActivity4 = this.f118006a;
                composer.startReplaceGroup(1849434622);
                Object objB4 = composer.B();
                if (objB4 == companion.a()) {
                    objB4 = androidx.compose.runtime.t1.e(null, null, 2, null);
                    composer.t(objB4);
                }
                composer.P();
                singlePageCheckoutActivity4.modalToShow = (InterfaceC5730l0) objB4;
                composer.startReplaceGroup(1849434622);
                SinglePageCheckoutActivity singlePageCheckoutActivity5 = this.f118006a;
                Object objB5 = composer.B();
                if (objB5 == companion.a()) {
                    objB5 = singlePageCheckoutActivity5.F3().a0().c();
                    composer.t(objB5);
                }
                composer.P();
                androidx.compose.runtime.z1 z1VarB = androidx.compose.runtime.o1.b((tv.P) objB5, null, composer, 0, 1);
                androidx.compose.runtime.z1 z1VarB2 = androidx.compose.runtime.o1.b(this.f118006a.w3().x(), null, composer, 0, 1);
                composer.startReplaceGroup(1849434622);
                SinglePageCheckoutActivity singlePageCheckoutActivity6 = this.f118006a;
                Object objB6 = composer.B();
                if (objB6 == companion.a()) {
                    objB6 = singlePageCheckoutActivity6.x3().W().c();
                    composer.t(objB6);
                }
                composer.P();
                androidx.compose.runtime.z1 z1VarC = S2.a.c((tv.P) objB6, null, null, null, composer, 0, 7);
                composer.startReplaceGroup(1849434622);
                SinglePageCheckoutActivity singlePageCheckoutActivity7 = this.f118006a;
                Object objB7 = composer.B();
                if (objB7 == companion.a()) {
                    objB7 = singlePageCheckoutActivity7.y3().g0().c();
                    composer.t(objB7);
                }
                composer.P();
                androidx.compose.runtime.z1 z1VarC2 = S2.a.c((tv.P) objB7, null, null, null, composer, 0, 7);
                composer.startReplaceGroup(-1224400529);
                boolean zD3 = composer.D(this.f118006a) | composer.D(this.f118007b) | composer.D(this.f118008c);
                final SinglePageCheckoutActivity singlePageCheckoutActivity8 = this.f118006a;
                final InterfaceC16622O interfaceC16622O2 = this.f118007b;
                final C17893M0 c17893m03 = this.f118008c;
                final InterfaceC5730l0<EnumC12898a> interfaceC5730l02 = this.f118013h;
                Object objB8 = composer.B();
                if (zD3 || objB8 == companion.a()) {
                    objB8 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.G1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SinglePageCheckoutActivity.C12896u.a.p(singlePageCheckoutActivity8, interfaceC16622O2, c17893m03, interfaceC5730l02, (Qq.o) obj);
                        }
                    };
                    composer.t(objB8);
                }
                Function1 function1 = (Function1) objB8;
                composer.P();
                com.meijer.mobile.accounts.ux.payments.d.t(this.f118006a.w3(), l(z1VarC).s().size() < 5 ? EnumC14271a.f133708b : EnumC14271a.f133710d, false, 2, null);
                SinglePageCheckoutActivity singlePageCheckoutActivity9 = this.f118006a;
                InterfaceC16622O interfaceC16622O3 = this.f118007b;
                composer.startReplaceGroup(-1746271574);
                boolean zD4 = composer.D(this.f118007b) | composer.D(this.f118008c);
                InterfaceC16622O interfaceC16622O4 = this.f118007b;
                C17893M0 c17893m04 = this.f118008c;
                InterfaceC5730l0<EnumC12898a> interfaceC5730l03 = this.f118013h;
                Object objB9 = composer.B();
                if (zD4 || objB9 == companion.a()) {
                    objB9 = new C1912a(interfaceC16622O4, c17893m04, interfaceC5730l03);
                    composer.t(objB9);
                }
                composer.P();
                singlePageCheckoutActivity9.G2(interfaceC16622O3, (Function1) ((KFunction) objB9), composer, 0, 0);
                SinglePageCheckoutActivity singlePageCheckoutActivity10 = this.f118006a;
                InterfaceC16622O interfaceC16622O5 = this.f118007b;
                C17963o1 c17963o1 = this.f118009d;
                C17893M0 c17893m05 = this.f118008c;
                int i12 = C17893M0.f167209e;
                singlePageCheckoutActivity10.J2(interfaceC16622O5, c17963o1, c17893m05, composer, (i12 << 6) | 48);
                this.f118006a.E2(composer, 0);
                SinglePageCheckoutActivity singlePageCheckoutActivity11 = this.f118006a;
                composer.startReplaceGroup(-1746271574);
                boolean zD5 = composer.D(this.f118007b) | composer.D(this.f118008c);
                InterfaceC16622O interfaceC16622O6 = this.f118007b;
                C17893M0 c17893m06 = this.f118008c;
                InterfaceC5730l0<EnumC12898a> interfaceC5730l04 = this.f118013h;
                Object objB10 = composer.B();
                if (zD5 || objB10 == companion.a()) {
                    objB10 = new b(interfaceC16622O6, c17893m06, interfaceC5730l04);
                    composer.t(objB10);
                }
                composer.P();
                singlePageCheckoutActivity11.B2((Function1) ((KFunction) objB10), composer, 0, 0);
                this.f118006a.L2(this.f118010e, this.f118011f, this.f118012g, composer, 0);
                EnumC12898a enumC12898aF = C12896u.f(this.f118013h);
                List<ProductCardDecorator> listB = s(z1VarB).B();
                com.meijer.mobile.accounts.ux.payments.d dVarW3 = this.f118006a.w3();
                com.meijer.mobile.meijer.activity.checkout.payment.ebt.r rVarC3 = this.f118006a.C3();
                com.meijer.mobile.meijer.activity.checkout.payment.Z zX3 = this.f118006a.x3();
                d.ViewState viewStateT = t(z1VarB2);
                Z.PaymentOptionsViewState paymentOptionsViewStateL = l(z1VarC);
                float fP = H1.h.p((int) (((androidx.compose.ui.platform.W1) composer.o(C5892t0.u())).a() & 4294967295L));
                boolean zE = Intrinsics.e(s(z1VarB).getFulfillmentMode(), "pickup");
                AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = o(z1VarC2).getAdjustEbtPaymentDecorator();
                SinglePageCheckoutActivity singlePageCheckoutActivity12 = this.f118006a;
                C17893M0 c17893m07 = this.f118008c;
                InterfaceC16622O interfaceC16622O7 = this.f118007b;
                composer.startReplaceGroup(-1746271574);
                boolean zD6 = composer.D(this.f118007b) | composer.D(this.f118008c);
                InterfaceC16622O interfaceC16622O8 = this.f118007b;
                C17893M0 c17893m08 = this.f118008c;
                InterfaceC5730l0<EnumC12898a> interfaceC5730l05 = this.f118013h;
                Object objB11 = composer.B();
                if (zD6 || objB11 == companion.a()) {
                    objB11 = new c(interfaceC16622O8, c17893m08, interfaceC5730l05);
                    composer.t(objB11);
                }
                composer.P();
                singlePageCheckoutActivity12.a2(AdsTheme, fP, enumC12898aF, c17893m07, interfaceC16622O7, listB, dVarW3, rVarC3, zX3, viewStateT, paymentOptionsViewStateL, zE, adjustEbtPaymentDecorator, (Function1) ((KFunction) objB11), ComposableLambdaKt.c(-746769928, true, new d(this.f118014i, AdsTheme, this.f118006a, this.f118009d, this.f118007b, this.f118008c, z1VarC, function1, this.f118011f, this.f118010e, this.f118012g, this.f118013h, z1VarB, this.f118015j), composer, 54), composer, LocalThemeScope.f15770g | (i11 & 14) | (i12 << 9) | (com.meijer.mobile.accounts.ux.payments.d.f94404g << 18) | (d.ViewState.f94414d << 27), (AbstractC5607a.f45514b << 6) | 24576, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                g(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final qv.C0 k(SinglePageCheckoutActivity singlePageCheckoutActivity, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, InterfaceC5730l0 interfaceC5730l0) {
                Ds.p.d(singlePageCheckoutActivity.getWindow());
                return C16648k.d(interfaceC16622O, null, null, new e(c17893m0, interfaceC5730l0, null), 3, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Z.PaymentOptionsViewState l(androidx.compose.runtime.z1<Z.PaymentOptionsViewState> z1Var) {
                return z1Var.getValue();
            }

            private static final CheckoutViewState o(androidx.compose.runtime.z1<CheckoutViewState> z1Var) {
                return z1Var.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(SinglePageCheckoutActivity singlePageCheckoutActivity, C17893M0 c17893m0, Function0 function0) throws IOException {
                if (singlePageCheckoutActivity.y3().getShowEbtEnterPinLoadingScreen()) {
                    singlePageCheckoutActivity.y3().r0(z1.h.x.f105140a);
                } else if (singlePageCheckoutActivity.y3().h0().getValue().booleanValue()) {
                    singlePageCheckoutActivity.O3();
                } else if (c17893m0.k()) {
                    function0.invoke();
                } else {
                    singlePageCheckoutActivity.finish();
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final FulfillmentSlotsViewState s(androidx.compose.runtime.z1<FulfillmentSlotsViewState> z1Var) {
                return z1Var.getValue();
            }

            private static final d.ViewState t(androidx.compose.runtime.z1<d.ViewState> z1Var) {
                return z1Var.getValue();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$onCreate$1$openSheet$1", f = "SinglePageCheckoutActivity.kt", l = {214}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$u$b */
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f118058a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ EnumC12898a f118059b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C17893M0 f118060c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<EnumC12898a> f118061d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f118059b, this.f118060c, this.f118061d, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(EnumC12898a enumC12898a, C17893M0 c17893m0, InterfaceC5730l0<EnumC12898a> interfaceC5730l0, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f118059b = enumC12898a;
                this.f118060c = c17893m0;
                this.f118061d = interfaceC5730l0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f118058a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C12896u.g(this.f118061d, this.f118059b);
                    C17893M0 c17893m0 = this.f118060c;
                    this.f118058a = 1;
                    if (c17893m0.l(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        C12896u() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, InterfaceC5730l0<EnumC12898a> interfaceC5730l0, EnumC12898a enumC12898a) {
            C16648k.d(interfaceC16622O, null, null, new b(enumC12898a, c17893m0, interfaceC5730l0, null), 3, null);
        }

        public final void e(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-871688396, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.onCreate.<anonymous> (SinglePageCheckoutActivity.kt:195)");
            }
            C17927c1 c17927c1G = C17921a1.g(null, null, composer, 0, 3);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new C17963o1();
                composer.t(objB);
            }
            C17963o1 c17963o1 = (C17963o1) objB;
            composer.P();
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = androidx.compose.runtime.J.k(EmptyCoroutineContext.f142646a, composer);
                composer.t(objB2);
            }
            InterfaceC16622O interfaceC16622O = (InterfaceC16622O) objB2;
            C17893M0 c17893m0J = C17891L0.j(EnumC17895N0.f167226a, null, null, true, composer, 3078, 6);
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = androidx.compose.foundation.relocation.b.a();
                composer.t(objB3);
            }
            InterfaceC16183a interfaceC16183a = (InterfaceC16183a) objB3;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB4 = composer.B();
            if (objB4 == companion.a()) {
                objB4 = androidx.compose.foundation.relocation.b.a();
                composer.t(objB4);
            }
            InterfaceC16183a interfaceC16183a2 = (InterfaceC16183a) objB4;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB5 = composer.B();
            if (objB5 == companion.a()) {
                objB5 = androidx.compose.foundation.relocation.b.a();
                composer.t(objB5);
            }
            InterfaceC16183a interfaceC16183a3 = (InterfaceC16183a) objB5;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB6 = composer.B();
            if (objB6 == companion.a()) {
                objB6 = androidx.compose.runtime.t1.e(EnumC12898a.f118135a, null, 2, null);
                composer.t(objB6);
            }
            InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB6;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB7 = composer.B();
            if (objB7 == companion.a()) {
                objB7 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB7);
            }
            composer.P();
            SinglePageCheckoutActivity.this.D3().k(SinglePageCheckoutActivity.this);
            Ji.K.b(null, ComposableLambdaKt.c(1698932227, true, new a(SinglePageCheckoutActivity.this, interfaceC16622O, c17893m0J, c17963o1, interfaceC16183a, interfaceC16183a2, interfaceC16183a3, interfaceC5730l0, c17927c1G, (InterfaceC5730l0) objB7), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            e(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EnumC12898a f(InterfaceC5730l0<EnumC12898a> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(InterfaceC5730l0<EnumC12898a> interfaceC5730l0, EnumC12898a enumC12898a) {
            interfaceC5730l0.setValue(enumC12898a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
            interfaceC5730l0.setValue(Boolean.valueOf(z10));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$v, reason: case insensitive filesystem */
    public static final class C12897v extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118062f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12897v(ComponentActivity componentActivity) {
            super(0);
            this.f118062f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f118062f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class w extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118063f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ComponentActivity componentActivity) {
            super(0);
            this.f118063f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f118063f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class x extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f118064f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118065g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f118064f = function0;
            this.f118065g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f118064f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f118065g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class y extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118066f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ComponentActivity componentActivity) {
            super(0);
            this.f118066f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f118066f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class z extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118067f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(ComponentActivity componentActivity) {
            super(0);
            this.f118067f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f118067f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D2(SinglePageCheckoutActivity singlePageCheckoutActivity, Function1 function1, int i10, int i11, Composer composer, int i12) {
        singlePageCheckoutActivity.B2(function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F2(SinglePageCheckoutActivity singlePageCheckoutActivity, int i10, Composer composer, int i11) {
        singlePageCheckoutActivity.E2(composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:322:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a2(final Ji.LocalThemeScope r41, final float r42, final com.meijer.mobile.singlepagecheckout.EnumC12898a r43, final kotlin.C17893M0 r44, final qv.InterfaceC16622O r45, final java.util.List<ts.ProductCardDecorator> r46, final com.meijer.mobile.accounts.ux.payments.d r47, final com.meijer.mobile.meijer.activity.checkout.payment.ebt.r r48, final com.meijer.mobile.meijer.activity.checkout.payment.Z r49, final com.meijer.mobile.accounts.ux.payments.d.ViewState r50, final com.meijer.mobile.meijer.activity.checkout.payment.Z.PaymentOptionsViewState r51, final boolean r52, final com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentDecorator r53, kotlin.jvm.functions.Function1<? super com.meijer.mobile.singlepagecheckout.EnumC12898a, kotlin.Unit> r54, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, androidx.compose.runtime.Composer r56, final int r57, final int r58, final int r59) {
        /*
            Method dump skipped, instructions count: 2310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.a2(Ji.M, float, com.meijer.mobile.singlepagecheckout.a, x0.M0, qv.O, java.util.List, com.meijer.mobile.accounts.ux.payments.d, com.meijer.mobile.meijer.activity.checkout.payment.ebt.r, com.meijer.mobile.meijer.activity.checkout.payment.Z, com.meijer.mobile.accounts.ux.payments.d$d, com.meijer.mobile.meijer.activity.checkout.payment.Z$k, boolean, com.meijer.mobile.meijer.activity.checkout.review.p, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u2(boolean z10, SinglePageCheckoutActivity singlePageCheckoutActivity, Function0 function0) {
        if (z10) {
            singlePageCheckoutActivity.G3().K(new C11932p.g.SetOptIn(true));
            if (!singlePageCheckoutActivity.G3().H().getValue().getIsShowFormInputScreen()) {
                singlePageCheckoutActivity.G3().K(C11932p.g.m.f104309a);
            }
        } else {
            singlePageCheckoutActivity.A3().K(new H.g.SetOptIn(true));
            if (!singlePageCheckoutActivity.A3().I().getValue().getIsShowFormInputScreen()) {
                singlePageCheckoutActivity.A3().K(H.g.j.f102394a);
            }
        }
        function0.invoke();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.meijer.activity.checkout.contactinformation.H A3() {
        return (com.meijer.mobile.meijer.activity.checkout.contactinformation.H) this.deliveryContactViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<BottomSheetContentDecorator> B3() {
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        return CollectionsKt.p(new BottomSheetContentDecorator(companion.d(com.meijer.mobile.meijer.Y.f99461A6, new Object[0]), CollectionsKt.p(new ContentRowData(com.meijer.mobile.meijer.Y.f99764Q5, Integer.valueOf(com.meijer.mobile.meijer.S.f98733l)), new ContentRowData(com.meijer.mobile.meijer.Y.f99783R5, Integer.valueOf(com.meijer.mobile.meijer.S.f98732k0)))), new BottomSheetContentDecorator(companion.d(com.meijer.mobile.meijer.Y.f100434y6, new Object[0]), CollectionsKt.p(new ContentRowData(com.meijer.mobile.meijer.Y.f100003ce, Integer.valueOf(com.meijer.mobile.meijer.S.f98733l)), new ContentRowData(com.meijer.mobile.meijer.Y.f100023de, Integer.valueOf(com.meijer.mobile.meijer.S.f98735m)), new ContentRowData(com.meijer.mobile.meijer.Y.f100043ee, Integer.valueOf(com.meijer.mobile.meijer.S.f98737n)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C2(EnumC12898a it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.meijer.activity.checkout.payment.ebt.r C3() {
        return (com.meijer.mobile.meijer.activity.checkout.payment.ebt.r) this.ebtPinPadViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.meijer.activity.cart.entrynote.i E3() {
        return (com.meijer.mobile.meijer.activity.cart.entrynote.i) this.entryNoteViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1 F3() {
        return (com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1) this.fulfillmentSlotsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C11932p G3() {
        return (C11932p) this.pickupContactViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H2(EnumC12898a it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H3(Function1<? super z1.h, Unit> onAction) {
        onAction.invoke(z1.h.k.f105124a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I2(SinglePageCheckoutActivity singlePageCheckoutActivity, InterfaceC16622O interfaceC16622O, Function1 function1, int i10, int i11, Composer composer, int i12) {
        singlePageCheckoutActivity.G2(interfaceC16622O, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I3(Function1<? super z1.h, Unit> onAction, Function1<? super q1.g, Unit> onFulfillmentSlotsAction) {
        onFulfillmentSlotsAction.invoke(q1.g.b.f103075a);
        onAction.invoke(z1.h.m.f105126a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J3(EbtBalance ebtAcculynkResponse) {
        String mask;
        this.ebtBalance = ebtAcculynkResponse;
        x3().d0(new Z.i.SetEbtPaymentOption(this.ebtBalance, this.ebtPanResponse));
        EbtPanResponse ebtPanResponse = this.ebtPanResponse;
        if (ebtPanResponse != null && (mask = ebtPanResponse.getMask()) != null) {
            x3().d0(new Z.i.DisplayEbtBalanceAction(mask, ebtAcculynkResponse, getFeatureManager().e(AbstractC18227f.i0.f170583h)));
        }
        x3().d0(Z.i.c.f103736a);
        x3().d0(Z.i.j.f103747a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K2(SinglePageCheckoutActivity singlePageCheckoutActivity, InterfaceC16622O interfaceC16622O, C17963o1 c17963o1, C17893M0 c17893m0, int i10, Composer composer, int i11) {
        singlePageCheckoutActivity.J2(interfaceC16622O, c17963o1, c17893m0, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L3() {
        startActivity(Al.e.f665a.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M2(SinglePageCheckoutActivity singlePageCheckoutActivity, InterfaceC16183a interfaceC16183a, InterfaceC16183a interfaceC16183a2, InterfaceC16183a interfaceC16183a3, int i10, Composer composer, int i11) {
        singlePageCheckoutActivity.L2(interfaceC16183a, interfaceC16183a2, interfaceC16183a3, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M3(SubstitutionPreferenceDecorator substitutionPreference) {
        startActivity(SubstitutionPreferenceFormActivity.INSTANCE.a(this, substitutionPreference.getName()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O3() {
        new C14886b(this).setTitle(com.meijer.mobile.meijer.Y.f100001cc).setCancelable(false).setMessage(com.meijer.mobile.meijer.Y.f99981bc).setNegativeButton(yr.Q.f170986b, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.L0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SinglePageCheckoutActivity.P3(dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q3(String title, String message) {
        FrameLayout frameLayout;
        DialogTitle dialogTitle;
        TextView textView;
        androidx.appcompat.app.c cVarShow = new C14886b(this).setTitle(title).setMessage(message).setNegativeButton(com.meijer.mobile.meijer.Y.f100169l1, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.P0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SinglePageCheckoutActivity.R3(dialogInterface, i10);
            }
        }).setPositiveButton(com.meijer.mobile.meijer.Y.f99529Dh, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.Q0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) throws IOException {
                SinglePageCheckoutActivity.S3(this.f117818a, dialogInterface, i10);
            }
        }).show();
        if (cVarShow != null && (textView = (TextView) cVarShow.findViewById(android.R.id.message)) != null) {
        }
        if (cVarShow != null && (dialogTitle = (DialogTitle) cVarShow.findViewById(ae.f.f44681a)) != null) {
        }
        if (cVarShow == null || (frameLayout = (FrameLayout) cVarShow.findViewById(ae.f.f44683b)) == null) {
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T3(int title, int message, int positiveButtonText, final Function0<Unit> onPositiveButtonClick) {
        new C14886b(this).setTitle(title).setMessage(message).setPositiveButton(positiveButtonText, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.V0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SinglePageCheckoutActivity.U3(onPositiveButtonClick, dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U3(Function0 function0, DialogInterface dialogInterface, int i10) {
        if (function0 != null) {
            function0.invoke();
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V3() {
        new C14886b(this).setCancelable(false).setTitle(com.meijer.mobile.meijer.Y.f99680Lg).setMessage(com.meijer.mobile.meijer.Y.f99661Kg).setPositiveButton(yr.Q.f170986b, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.S0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SinglePageCheckoutActivity.W3(dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X3() {
        new C14886b(this).setTitle(com.meijer.mobile.meijer.Y.f100332t4).setMessage(com.meijer.mobile.meijer.Y.f100312s4).setPositiveButton(com.meijer.mobile.meijer.Y.f100169l1, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.T0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) throws IOException {
                SinglePageCheckoutActivity.Y3(this.f118068a, dialogInterface, i10);
            }
        }).setCancelable(true).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.meijer.mobile.singlepagecheckout.U0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) throws IOException {
                SinglePageCheckoutActivity.Z3(this.f118074a, dialogInterface);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b2(EnumC12898a it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w2(SinglePageCheckoutActivity singlePageCheckoutActivity, LocalThemeScope localThemeScope, float f10, EnumC12898a enumC12898a, C17893M0 c17893m0, InterfaceC16622O interfaceC16622O, List list, com.meijer.mobile.accounts.ux.payments.d dVar, com.meijer.mobile.meijer.activity.checkout.payment.ebt.r rVar, com.meijer.mobile.meijer.activity.checkout.payment.Z z10, d.ViewState viewState, Z.PaymentOptionsViewState paymentOptionsViewState, boolean z11, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, Function1 function1, Function2 function2, int i10, int i11, int i12, Composer composer, int i13) {
        singlePageCheckoutActivity.a2(localThemeScope, f10, enumC12898a, c17893m0, interfaceC16622O, list, dVar, rVar, z10, viewState, paymentOptionsViewState, z11, adjustEbtPaymentDecorator, function1, function2, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.accounts.ux.payments.d w3() {
        return (com.meijer.mobile.accounts.ux.payments.d) this.addCardAurusViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.meijer.activity.checkout.payment.Z x3() {
        return (com.meijer.mobile.meijer.activity.checkout.payment.Z) this.checkoutPaymentOptionsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.meijer.activity.checkout.review.z1 y3() {
        return (com.meijer.mobile.meijer.activity.checkout.review.z1) this.checkoutViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C12906c z3() {
        return (C12906c) this.coordinatorViewModel.getValue();
    }

    public final Gm.f D3() {
        Gm.f fVar = this.ebtTimer;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.y("ebtTimer");
        return null;
    }

    public final void J2(final InterfaceC16622O coroutineScope, final C17963o1 snackbarHostState, C17893M0 c17893m0, Composer composer, final int i10) {
        int i11;
        int i12;
        final C17893M0 sheetState = c17893m0;
        Intrinsics.j(coroutineScope, "coroutineScope");
        Intrinsics.j(snackbarHostState, "snackbarHostState");
        Intrinsics.j(sheetState, "sheetState");
        Composer composerStartRestartGroup = composer.startRestartGroup(2116644791);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.D(coroutineScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(snackbarHostState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? composerStartRestartGroup.V(sheetState) : composerStartRestartGroup.D(sheetState) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(this) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        int i13 = i11;
        if ((i13 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(2116644791, i13, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ObservePaymentEvents (SinglePageCheckoutActivity.kt:1128)");
            }
            Context context = (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g());
            Unit unit = Unit.f142422a;
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            int i14 = i13 & 896;
            boolean zD = composerStartRestartGroup.D(this) | (i14 == 256 || ((i13 & 512) != 0 && composerStartRestartGroup.D(sheetState))) | composerStartRestartGroup.D(context);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new C12891p(sheetState, context, null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(unit, (Function2) objB, composerStartRestartGroup, 6);
            Boolean bool = Boolean.TRUE;
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zD2 = composerStartRestartGroup.D(this) | composerStartRestartGroup.D(coroutineScope) | (i14 == 256 || ((i13 & 512) != 0 && composerStartRestartGroup.D(sheetState))) | ((i13 & 112) == 32) | composerStartRestartGroup.D(context);
            Object objB2 = composerStartRestartGroup.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                i12 = 6;
                C12892q c12892q = new C12892q(coroutineScope, snackbarHostState, context, c17893m0, null);
                sheetState = c17893m0;
                composerStartRestartGroup.t(c12892q);
                objB2 = c12892q;
            } else {
                i12 = 6;
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(bool, (Function2) objB2, composerStartRestartGroup, i12);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zD3 = composerStartRestartGroup.D(this) | composerStartRestartGroup.D(coroutineScope) | (i14 == 256 || ((i13 & 512) != 0 && composerStartRestartGroup.D(sheetState)));
            Object objB3 = composerStartRestartGroup.B();
            if (zD3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new C12893r(coroutineScope, sheetState, null);
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(bool, (Function2) objB3, composerStartRestartGroup, i12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.singlepagecheckout.M0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SinglePageCheckoutActivity.K2(this.f117790a, coroutineScope, snackbarHostState, sheetState, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Gm.f.a
    public void z0(String timerString) {
        Intrinsics.j(timerString, "timerString");
        y3().c1(timerString);
    }

    private static final void A2(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B2(final Function1<? super EnumC12898a, Unit> function1, Composer composer, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        boolean z10;
        Composer composerStartRestartGroup = composer.startRestartGroup(1724610380);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(function1)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(this)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i15 != 0) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objB = composerStartRestartGroup.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.G0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SinglePageCheckoutActivity.C2((EnumC12898a) obj);
                        }
                    };
                    composerStartRestartGroup.t(objB);
                }
                function1 = (Function1) objB;
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1724610380, i12, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ObserveCheckoutEvents (SinglePageCheckoutActivity.kt:901)");
            }
            Unit unit = Unit.f142422a;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(this);
            if ((i12 & 14) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = zD | z10;
            Object objB2 = composerStartRestartGroup.B();
            if (z11 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new C12887l(function1, null);
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(unit, (Function2) objB2, composerStartRestartGroup, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.singlepagecheckout.R0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SinglePageCheckoutActivity.D2(this.f117822a, function1, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E2(Composer composer, final int i10) {
        int i11;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1773768291);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(this)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1773768291, i11, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ObserveContactInfoEvents (SinglePageCheckoutActivity.kt:879)");
            }
            Unit unit = Unit.f142422a;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD = composerStartRestartGroup.D(this);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new C12888m(null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(unit, (Function2) objB, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD2 = composerStartRestartGroup.D(this);
            Object objB2 = composerStartRestartGroup.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new C12889n(null);
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(unit, (Function2) objB2, composerStartRestartGroup, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.singlepagecheckout.O0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SinglePageCheckoutActivity.F2(this.f117804a, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G2(final InterfaceC16622O interfaceC16622O, Function1<? super EnumC12898a, Unit> function1, Composer composer, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        Composer composerStartRestartGroup = composer.startRestartGroup(1925130008);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(interfaceC16622O)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(function1)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(this)) {
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
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objB = composerStartRestartGroup.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.W0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SinglePageCheckoutActivity.H2((EnumC12898a) obj);
                        }
                    };
                    composerStartRestartGroup.t(objB);
                }
                function1 = (Function1) objB;
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1925130008, i12, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ObserveFulfillmentSlotEvents (SinglePageCheckoutActivity.kt:861)");
            }
            Unit unit = Unit.f142422a;
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zD = composerStartRestartGroup.D(this) | composerStartRestartGroup.D(interfaceC16622O);
            if ((i12 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10 | zD;
            Object objB2 = composerStartRestartGroup.B();
            if (z11 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new C12890o(interfaceC16622O, function1, null);
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(unit, (Function2) objB2, composerStartRestartGroup, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Function1<? super EnumC12898a, Unit> function12 = function1;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.singlepagecheckout.X0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SinglePageCheckoutActivity.I2(this.f118109a, interfaceC16622O, function12, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean K3() {
        return getIntent().getBooleanExtra("com.meijer.mobile.meijer.mobile.singlepagecheckout.EXTRA_IS_EDIT_MODE", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L2(InterfaceC16183a interfaceC16183a, InterfaceC16183a interfaceC16183a2, InterfaceC16183a interfaceC16183a3, Composer composer, final int i10) {
        int i11;
        InterfaceC16183a interfaceC16183a4;
        InterfaceC16183a interfaceC16183a5;
        InterfaceC16183a interfaceC16183a6;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1396587609);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(interfaceC16183a)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(interfaceC16183a2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(interfaceC16183a3)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (composerStartRestartGroup.D(this)) {
                i12 = RecyclerView.m.FLAG_MOVED;
            } else {
                i12 = 1024;
            }
            i11 |= i12;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            interfaceC16183a4 = interfaceC16183a;
            interfaceC16183a5 = interfaceC16183a2;
            interfaceC16183a6 = interfaceC16183a3;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1396587609, i11, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ObserveScrollEvents (SinglePageCheckoutActivity.kt:1068)");
            }
            Unit unit = Unit.f142422a;
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zD = composerStartRestartGroup.D(this) | composerStartRestartGroup.D(interfaceC16183a) | composerStartRestartGroup.D(interfaceC16183a2) | composerStartRestartGroup.D(interfaceC16183a3);
            Object objB = composerStartRestartGroup.B();
            if (!zD && objB != Composer.INSTANCE.a()) {
                interfaceC16183a4 = interfaceC16183a;
                interfaceC16183a5 = interfaceC16183a2;
                interfaceC16183a6 = interfaceC16183a3;
            } else {
                interfaceC16183a4 = interfaceC16183a;
                interfaceC16183a5 = interfaceC16183a2;
                interfaceC16183a6 = interfaceC16183a3;
                C12894s c12894s = new C12894s(interfaceC16183a4, interfaceC16183a5, interfaceC16183a6, null);
                composerStartRestartGroup.t(c12894s);
                objB = c12894s;
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(unit, (Function2) objB, composerStartRestartGroup, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            final InterfaceC16183a interfaceC16183a7 = interfaceC16183a6;
            final InterfaceC16183a interfaceC16183a8 = interfaceC16183a5;
            final InterfaceC16183a interfaceC16183a9 = interfaceC16183a4;
            t0L.a(new Function2() { // from class: com.meijer.mobile.singlepagecheckout.N0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SinglePageCheckoutActivity.M2(this.f117799a, interfaceC16183a9, interfaceC16183a8, interfaceC16183a7, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N3() {
        startActivity(getMeijerIntent().p(this, false));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P3(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R3(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S3(SinglePageCheckoutActivity singlePageCheckoutActivity, DialogInterface dialogInterface, int i10) throws IOException {
        dialogInterface.dismiss();
        singlePageCheckoutActivity.y3().r0(z1.h.g.f105120a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W3(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y3(SinglePageCheckoutActivity singlePageCheckoutActivity, DialogInterface dialogInterface, int i10) throws IOException {
        dialogInterface.dismiss();
        singlePageCheckoutActivity.y3().r0(z1.h.f.f105119a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z3(SinglePageCheckoutActivity singlePageCheckoutActivity, DialogInterface dialogInterface) throws IOException {
        dialogInterface.dismiss();
        singlePageCheckoutActivity.y3().r0(z1.h.f.f105119a);
    }

    private static final String c2(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void d2(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    private static final String e2(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void f2(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    private static final Function3<InterfaceC14812d, Composer, Integer, Unit> g2(InterfaceC5730l0<Function3<InterfaceC14812d, Composer, Integer, Unit>> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void h2(InterfaceC5730l0<Function3<InterfaceC14812d, Composer, Integer, Unit>> interfaceC5730l0, Function3<? super InterfaceC14812d, ? super Composer, ? super Integer, Unit> function3) {
        interfaceC5730l0.setValue(function3);
    }

    private static final Function0<Unit> i2(InterfaceC5730l0<Function0<Unit>> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void j2(InterfaceC5730l0<Function0<Unit>> interfaceC5730l0, Function0<Unit> function0) {
        interfaceC5730l0.setValue(function0);
    }

    private static final Function0<Unit> k2(InterfaceC5730l0<Function0<Unit>> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void l2(InterfaceC5730l0<Function0<Unit>> interfaceC5730l0, Function0<Unit> function0) {
        interfaceC5730l0.setValue(function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m2(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n2(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o2(Function0 function0, SinglePageCheckoutActivity singlePageCheckoutActivity) {
        function0.invoke();
        singlePageCheckoutActivity.F3().e0(q1.g.e.f103078a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p2(SinglePageCheckoutActivity singlePageCheckoutActivity, InterfaceC16622O interfaceC16622O, EnumC12898a enumC12898a, C17893M0 c17893m0) throws IOException {
        Ds.p.d(singlePageCheckoutActivity.getWindow());
        C16648k.d(interfaceC16622O, null, null, new C12886k(c17893m0, null), 3, null);
        if (enumC12898a == EnumC12898a.f118145k) {
            singlePageCheckoutActivity.y3().r0(z1.h.e.f105118a);
            singlePageCheckoutActivity.y3().F0(true);
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q2(Function0 function0, SinglePageCheckoutActivity singlePageCheckoutActivity) {
        function0.invoke();
        singlePageCheckoutActivity.F3().e0(q1.g.C1457g.f103080a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r2(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s2(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t2(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v2(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }

    private static final String x2(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void y2(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    private static final String z2(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    @Override // Gm.f.a
    public void P() {
        X3();
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        tv.P<Boolean> pJ;
        super.onCreate(savedInstanceState);
        this.fromOrderReviewFlow = K3();
        getLifecycle().a(z3());
        getLifecycle().a(F3());
        getLifecycle().a(A3());
        getLifecycle().a(G3());
        getLifecycle().a(x3());
        C12906c c12906cZ3 = z3();
        tv.P<Boolean> pD0 = F3().d0();
        tv.P<Boolean> pC0 = x3().c0();
        if (Intrinsics.e(y3().g0().c().getValue().getFulfillmentMode().getDeliveryMode(), "delivery")) {
            pJ = A3().J();
        } else {
            pJ = G3().J();
        }
        c12906cZ3.n(pD0, pC0, pJ);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-871688396, true, new C12896u()), 1, null);
    }
}
