package com.meijer.mobile.singlepagecheckout;

import Gm.EbtBalance;
import Hm.f;
import Ik.Validation;
import Ki.C;
import Ki.LocalThemeScope;
import Rq.C5303f;
import V2.CreationExtras;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.DialogTitle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C6034t0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.accounts.ux.payments.d;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationActivity;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.H;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.BottomSheetContentDecorator;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.C11976k;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.ContentRowData;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1;
import com.meijer.mobile.meijer.activity.checkout.payment.EbtPanData;
import com.meijer.mobile.meijer.activity.checkout.payment.PaymentOptionDecorator;
import com.meijer.mobile.meijer.activity.checkout.payment.Z;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.r;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.response.EbtPanResponse;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.C12057p;
import com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutAnimations;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutErrorDialogDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewState;
import com.meijer.mobile.meijer.activity.checkout.review.SubstitutionPreferenceDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.z1;
import com.meijer.mobile.meijer.activity.checkout.substitutionpreference.SubstitutionPreferenceFormActivity;
import com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity;
import e.C13736d;
import e.C13737e;
import hj.OrderDetail;
import hk.EnumC14533a;
import hk.MultiTenderPaymentOption;
import hk.PaymentOption;
import j0.InterfaceC14882C;
import j0.InterfaceC14900d;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import ki.q1;
import kotlin.C17957L0;
import kotlin.C17959M0;
import kotlin.C17987a1;
import kotlin.C17993c1;
import kotlin.C18026n1;
import kotlin.C18029o1;
import kotlin.EnumC17961N0;
import kotlin.EnumC18023m1;
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
import le.C15485b;
import mv.C15809k;
import mv.InterfaceC15783O;
import okhttp3.HttpUrl;
import p0.InterfaceC16328a;
import p1.C16338g;
import pv.C16563h;
import pv.InterfaceC16553F;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import tr.C17284b;
import ts.ProductCardDecorator;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u009f\u0001\u0010$\u001a\u00020 *\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\"H\u0003¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020 H\u0002¢\u0006\u0004\b&\u0010\u0004J\u0017\u0010)\u001a\u00020 2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u000eH\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020 H\u0002¢\u0006\u0004\b.\u0010\u0004J-\u0010/\u001a\u00020 2\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 0\u001fH\u0003¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020 H\u0003¢\u0006\u0004\b1\u00102J%\u00103\u001a\u00020 2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 0\u001fH\u0003¢\u0006\u0004\b3\u00104J'\u00109\u001a\u00020 2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002052\u0006\u00108\u001a\u000205H\u0003¢\u0006\u0004\b9\u0010:J?\u0010@\u001a\u00020 2\b\b\u0001\u0010<\u001a\u00020;2\b\b\u0001\u0010=\u001a\u00020;2\b\b\u0001\u0010>\u001a\u00020;2\u0010\b\u0002\u0010?\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\"H\u0002¢\u0006\u0004\b@\u0010AJ;\u0010F\u001a\u00020 2\u0014\b\u0002\u0010C\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020 0\u001f2\u0014\b\u0002\u0010E\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\bF\u0010GJ%\u0010H\u001a\u00020 2\u0014\b\u0002\u0010C\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020 H\u0002¢\u0006\u0004\bJ\u0010\u0004J\u0017\u0010M\u001a\u00020 2\u0006\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020 H\u0002¢\u0006\u0004\bO\u0010\u0004J\u000f\u0010P\u001a\u00020 H\u0002¢\u0006\u0004\bP\u0010\u0004J\u001f\u0010R\u001a\u00020 2\u0006\u0010<\u001a\u00020Q2\u0006\u0010=\u001a\u00020QH\u0002¢\u0006\u0004\bR\u0010SJ\u0019\u0010V\u001a\u00020 2\b\u0010U\u001a\u0004\u0018\u00010TH\u0014¢\u0006\u0004\bV\u0010WJ'\u0010Z\u001a\u00020 2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010Y\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020 H\u0016¢\u0006\u0004\b\\\u0010\u0004J\u0017\u0010^\u001a\u00020 2\u0006\u0010]\u001a\u00020QH\u0016¢\u0006\u0004\b^\u0010_R\u001b\u0010e\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001b\u0010j\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010b\u001a\u0004\bh\u0010iR\u001b\u0010o\u001a\u00020k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010b\u001a\u0004\bm\u0010nR\u001b\u0010t\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010b\u001a\u0004\br\u0010sR\u001b\u0010y\u001a\u00020u8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010b\u001a\u0004\bw\u0010xR\u001b\u0010\u0012\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010b\u001a\u0004\b{\u0010|R\u001b\u0010\u0016\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b}\u0010b\u001a\u0004\b~\u0010\u007fR\u001e\u0010\u0014\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0080\u0001\u0010b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R \u0010\u0087\u0001\u001a\u00030\u0083\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0084\u0001\u0010b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R#\u0010\u008c\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u0089\u00010\u0088\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R \u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u00020\u001b0\u0088\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008b\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001c\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001b\u0010\u0098\u0001\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R*\u0010 \u0001\u001a\u00030\u0099\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0017\u0010£\u0001\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001¨\u0006´\u0001²\u0006\u000f\u0010¤\u0001\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010¥\u0001\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010§\u0001\u001a\u00030¦\u00018\nX\u008a\u0084\u0002²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\r\u0010¨\u0001\u001a\u00020\u00198\nX\u008a\u0084\u0002²\u0006\u000e\u0010ª\u0001\u001a\u00030©\u00018\nX\u008a\u0084\u0002²\u0006\u0011\u0010«\u0001\u001a\u0004\u0018\u00010Q8\n@\nX\u008a\u008e\u0002²\u0006\u0011\u0010¬\u0001\u001a\u0004\u0018\u00010Q8\n@\nX\u008a\u008e\u0002²\u0006\u0011\u0010\u00ad\u0001\u001a\u0004\u0018\u00010Q8\n@\nX\u008a\u008e\u0002²\u0006\u0011\u0010®\u0001\u001a\u0004\u0018\u00010Q8\n@\nX\u008a\u008e\u0002²\u0006$\u0010±\u0001\u001a\u0017\u0012\u0005\u0012\u00030¯\u0001\u0012\u0004\u0012\u00020 \u0018\u00010\u001f¢\u0006\u0003\b°\u00018\n@\nX\u008a\u008e\u0002²\u0006\u0017\u0010²\u0001\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\"8\n@\nX\u008a\u008e\u0002²\u0006\u0017\u0010³\u0001\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\"8\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010¥\u0001\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/meijer/mobile/singlepagecheckout/SinglePageCheckoutActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LHm/f$a;", "<init>", "()V", "LKi/M;", "LH1/h;", "screenHeight", "Lcom/meijer/mobile/singlepagecheckout/a;", "sheetType", "Lx0/M0;", "sheetState", "Lmv/O;", "coroutineScope", "", "Lts/a;", "outOfStockProductList", "Lcom/meijer/mobile/accounts/ux/payments/d;", "addCardAurusViewModel", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r;", "ebtPinPadViewModel", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z;", "checkoutPaymentOptionsViewModel", "Lcom/meijer/mobile/accounts/ux/payments/d$d;", "addCardViewState", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$k;", "paymentOptionsViewState", "", "isPickUpMode", "Lcom/meijer/mobile/meijer/activity/checkout/review/p;", "adjustEbtPaymentDecorator", "Lkotlin/Function1;", "", "onOpenSheet", "Lkotlin/Function0;", "content", "b2", "(LKi/M;FLcom/meijer/mobile/singlepagecheckout/a;Lx0/M0;Lmv/O;Ljava/util/List;Lcom/meijer/mobile/accounts/ux/payments/d;Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r;Lcom/meijer/mobile/meijer/activity/checkout/payment/Z;Lcom/meijer/mobile/accounts/ux/payments/d$d;Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$k;ZLcom/meijer/mobile/meijer/activity/checkout/review/p;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "M3", "Lcom/meijer/mobile/meijer/activity/checkout/review/Y1;", "substitutionPreference", "N3", "(Lcom/meijer/mobile/meijer/activity/checkout/review/Y1;)V", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/f;", "C3", "()Ljava/util/List;", "W3", "H2", "(Lmv/O;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "F2", "(Landroidx/compose/runtime/Composer;I)V", "C2", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lp0/a;", "paymentOptionsRequester", "timeSlotsRequester", "placeOrderButtonViewRequester", "M2", "(Lp0/a;Lp0/a;Lp0/a;Landroidx/compose/runtime/Composer;I)V", "", "title", "message", "positiveButtonText", "onPositiveButtonClick", "U3", "(IIILkotlin/jvm/functions/Function0;)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "onAction", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g;", "onFulfillmentSlotsAction", "J3", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "I3", "(Lkotlin/jvm/functions/Function1;)V", "O3", "LGm/a;", "ebtAcculynkResponse", "K3", "(LGm/a;)V", "Z3", "P3", "", "R3", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lx0/o1;", "snackbarHostState", "K2", "(Lmv/O;Lx0/o1;Lx0/M0;Landroidx/compose/runtime/Composer;I)V", "Q", "timerString", "D0", "(Ljava/lang/String;)V", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i;", "s", "Lkotlin/Lazy;", "F3", "()Lcom/meijer/mobile/meijer/activity/cart/entrynote/i;", "entryNoteViewModel", "Lcom/meijer/mobile/singlepagecheckout/c;", "t", "A3", "()Lcom/meijer/mobile/singlepagecheckout/c;", "coordinatorViewModel", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1;", "u", "G3", "()Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1;", "fulfillmentSlotsViewModel", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H;", "v", "B3", "()Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H;", "deliveryContactViewModel", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p;", "w", "H3", "()Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p;", "pickupContactViewModel", "x", "x3", "()Lcom/meijer/mobile/accounts/ux/payments/d;", "y", "y3", "()Lcom/meijer/mobile/meijer/activity/checkout/payment/Z;", "z", "D3", "()Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1;", "A", "z3", "()Lcom/meijer/mobile/meijer/activity/checkout/review/z1;", "checkoutViewModel", "Landroidx/compose/runtime/l0;", "LIj/d;", "B", "Landroidx/compose/runtime/l0;", "modalToShow", "C", "displayCheckoutAnimations", "D", "Z", "fromOrderReviewFlow", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtPanResponse;", "E", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtPanResponse;", "ebtPanResponse", "F", "LGm/a;", "ebtBalance", "LHm/f;", "G", "LHm/f;", "E3", "()LHm/f;", "setEbtTimer", "(LHm/f;)V", "ebtTimer", "L3", "()Z", "isEditMode", "bottomSheetType", "displayError", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;", "fulfillmentSlotsViewState", "checkoutPaymentOptionsViewState", "Lcom/meijer/mobile/meijer/activity/checkout/review/D1;", "orderSummaryViewState", "headingText", "descriptionText", "primaryButtonText", "secondaryButtonText", "Lj0/d;", "Lkotlin/ExtensionFunctionType;", "bottomSheetContent", "onPrimaryAction", "onSecondaryAction", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class SinglePageCheckoutActivity extends Hilt_SinglePageCheckoutActivity implements f.a {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5872l0<Ij.d> modalToShow;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5872l0<Boolean> displayCheckoutAnimations;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private boolean fromOrderReviewFlow;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private EbtPanResponse ebtPanResponse;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private EbtBalance ebtBalance;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    public Hm.f ebtTimer;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy entryNoteViewModel = new androidx.view.e0(Reflection.b(com.meijer.mobile.meijer.activity.cart.entrynote.i.class), new O(this), new F(this), new P(null, this));

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy coordinatorViewModel = new androidx.view.e0(Reflection.b(C13032c.class), new R(this), new Q(this), new S(null, this));

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Lazy fulfillmentSlotsViewModel = new androidx.view.e0(Reflection.b(com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.class), new U(this), new T(this), new V(null, this));

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy deliveryContactViewModel = new androidx.view.e0(Reflection.b(com.meijer.mobile.meijer.activity.checkout.contactinformation.H.class), new w(this), new C13023v(this), new x(null, this));

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy pickupContactViewModel = new androidx.view.e0(Reflection.b(C12057p.class), new z(this), new y(this), new A(null, this));

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
        final /* synthetic */ Function0 f118841f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118842g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f118841f = function0;
            this.f118842g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f118841f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f118842g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class B extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118843f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(ComponentActivity componentActivity) {
            super(0);
            this.f118843f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f118843f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class C extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118844f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(ComponentActivity componentActivity) {
            super(0);
            this.f118844f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f118844f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class D extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f118845f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118846g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public D(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f118845f = function0;
            this.f118846g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f118845f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f118846g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class E extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118847f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public E(ComponentActivity componentActivity) {
            super(0);
            this.f118847f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f118847f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class F extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118848f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F(ComponentActivity componentActivity) {
            super(0);
            this.f118848f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f118848f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class G extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118849f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public G(ComponentActivity componentActivity) {
            super(0);
            this.f118849f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f118849f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class H extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f118850f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118851g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public H(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f118850f = function0;
            this.f118851g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f118850f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f118851g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class I extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118852f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I(ComponentActivity componentActivity) {
            super(0);
            this.f118852f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f118852f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class J extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118853f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public J(ComponentActivity componentActivity) {
            super(0);
            this.f118853f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f118853f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class K extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f118854f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118855g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public K(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f118854f = function0;
            this.f118855g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f118854f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f118855g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class L extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118856f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public L(ComponentActivity componentActivity) {
            super(0);
            this.f118856f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f118856f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class M extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118857f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public M(ComponentActivity componentActivity) {
            super(0);
            this.f118857f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f118857f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class N extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f118858f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118859g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public N(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f118858f = function0;
            this.f118859g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f118858f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f118859g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class O extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118860f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public O(ComponentActivity componentActivity) {
            super(0);
            this.f118860f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f118860f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class P extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f118861f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118862g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public P(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f118861f = function0;
            this.f118862g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f118861f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f118862g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class Q extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118863f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Q(ComponentActivity componentActivity) {
            super(0);
            this.f118863f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f118863f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class R extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118864f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public R(ComponentActivity componentActivity) {
            super(0);
            this.f118864f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f118864f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class S extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f118865f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118866g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public S(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f118865f = function0;
            this.f118866g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f118865f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f118866g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class T extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118867f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public T(ComponentActivity componentActivity) {
            super(0);
            this.f118867f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f118867f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class U extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118868f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public U(ComponentActivity componentActivity) {
            super(0);
            this.f118868f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f118868f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class V extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f118869f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118870g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public V(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f118869f = function0;
            this.f118870g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f118869f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f118870g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$a, reason: case insensitive filesystem */
    static final class C13002a implements Function3<InterfaceC14900d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118871a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SinglePageCheckoutActivity f118872b;

        C13002a(LocalThemeScope localThemeScope, SinglePageCheckoutActivity singlePageCheckoutActivity) {
            this.f118871a = localThemeScope;
            this.f118872b = singlePageCheckoutActivity;
        }

        public final void a(InterfaceC14900d interfaceC14900d, Composer composer, int i10) {
            Intrinsics.j(interfaceC14900d, "<this>");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1955752807, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ConditionalBottomSheet.<anonymous> (SinglePageCheckoutActivity.kt:569)");
            }
            LocalThemeScope localThemeScope = this.f118871a;
            Modifier modifierF = androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null);
            String string = this.f118872b.getString(com.meijer.mobile.meijer.Y.f101235v5);
            Intrinsics.i(string, "getString(...)");
            Qq.n.b(localThemeScope, modifierF, string, null, composer, LocalThemeScope.f17314g | 48, 4);
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
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$b, reason: case insensitive filesystem */
    static final class C13003b implements Function3<InterfaceC14900d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118873a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d.ViewState f118874b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f118875c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.meijer.mobile.accounts.ux.payments.d f118876d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Z.PaymentOptionsViewState f118877e;

        C13003b(LocalThemeScope localThemeScope, d.ViewState viewState, Function0<Unit> function0, com.meijer.mobile.accounts.ux.payments.d dVar, Z.PaymentOptionsViewState paymentOptionsViewState) {
            this.f118873a = localThemeScope;
            this.f118874b = viewState;
            this.f118875c = function0;
            this.f118876d = dVar;
            this.f118877e = paymentOptionsViewState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(com.meijer.mobile.accounts.ux.payments.d dVar, Z.PaymentOptionsViewState paymentOptionsViewState, String str) {
            dVar.A(new d.a.ProcessAurusIFrameReturn(str, paymentOptionsViewState.getEbtPaymentOption()));
            return Unit.f143329a;
        }

        public final void c(InterfaceC14900d interfaceC14900d, Composer composer, int i10) {
            Intrinsics.j(interfaceC14900d, "<this>");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1691031386, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ConditionalBottomSheet.<anonymous> (SinglePageCheckoutActivity.kt:581)");
            }
            LocalThemeScope localThemeScope = this.f118873a;
            HttpUrl aurusUrl = this.f118874b.getAurusUrl();
            String accessToken = this.f118874b.getAccessToken();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f118875c);
            final Function0<Unit> function0 = this.f118875c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.g1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SinglePageCheckoutActivity.C13003b.d(function0);
                    }
                };
                composer.t(objB);
            }
            Function0 function02 = (Function0) objB;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(this.f118876d) | composer.D(this.f118877e);
            final com.meijer.mobile.accounts.ux.payments.d dVar = this.f118876d;
            final Z.PaymentOptionsViewState paymentOptionsViewState = this.f118877e;
            Object objB2 = composer.B();
            if (zD || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.h1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SinglePageCheckoutActivity.C13003b.e(dVar, paymentOptionsViewState, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C5303f.b(localThemeScope, null, true, aurusUrl, accessToken, function02, (Function1) objB2, composer, LocalThemeScope.f17314g | 384, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14900d interfaceC14900d, Composer composer, Integer num) {
            c(interfaceC14900d, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$c, reason: case insensitive filesystem */
    static final class C13004c implements Function3<InterfaceC14900d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118878a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Z.PaymentOptionsViewState f118879b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SinglePageCheckoutActivity f118880c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.meijer.mobile.meijer.activity.checkout.payment.Z f118881d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f118882e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.meijer.mobile.meijer.activity.checkout.payment.ebt.r f118883f;

        C13004c(LocalThemeScope localThemeScope, Z.PaymentOptionsViewState paymentOptionsViewState, SinglePageCheckoutActivity singlePageCheckoutActivity, com.meijer.mobile.meijer.activity.checkout.payment.Z z10, Function0<Unit> function0, com.meijer.mobile.meijer.activity.checkout.payment.ebt.r rVar) {
            this.f118878a = localThemeScope;
            this.f118879b = paymentOptionsViewState;
            this.f118880c = singlePageCheckoutActivity;
            this.f118881d = z10;
            this.f118882e = function0;
            this.f118883f = rVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(SinglePageCheckoutActivity singlePageCheckoutActivity, com.meijer.mobile.meijer.activity.checkout.payment.Z z10, EbtPanResponse ebtResponse) {
            Intrinsics.j(ebtResponse, "ebtResponse");
            singlePageCheckoutActivity.ebtPanResponse = ebtResponse;
            z10.d0(new Z.i.ShowEbtPinPad(ebtResponse.getToken(), ebtResponse.getCardExpiration(), false));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(com.meijer.mobile.meijer.activity.checkout.payment.Z z10) {
            z10.d0(new Z.i.UpdateWebPageLoading(false));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(com.meijer.mobile.meijer.activity.checkout.payment.Z z10) {
            z10.d0(Z.i.f.f104594a);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(com.meijer.mobile.meijer.activity.checkout.payment.Z z10, String str) {
            z10.d0(new Z.i.SetEBTCardInputError(str));
            z10.d0(Z.i.d.f104592a);
            return Unit.f143329a;
        }

        public final void g(InterfaceC14900d interfaceC14900d, Composer composer, int i10) {
            Intrinsics.j(interfaceC14900d, "<this>");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1042848283, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ConditionalBottomSheet.<anonymous> (SinglePageCheckoutActivity.kt:613)");
            }
            LocalThemeScope localThemeScope = this.f118878a;
            boolean isEBTFlowLoading = this.f118879b.getIsEBTFlowLoading();
            EbtPanData mjrEbtPanData = this.f118879b.getMjrEbtPanData();
            String ebtCardInputError = this.f118879b.getEbtCardInputError();
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(this.f118880c) | composer.D(this.f118881d);
            final SinglePageCheckoutActivity singlePageCheckoutActivity = this.f118880c;
            final com.meijer.mobile.meijer.activity.checkout.payment.Z z10 = this.f118881d;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.i1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SinglePageCheckoutActivity.C13004c.k(singlePageCheckoutActivity, z10, (EbtPanResponse) obj);
                    }
                };
                composer.t(objB);
            }
            Function1 function1 = (Function1) objB;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zD2 = composer.D(this.f118881d);
            final com.meijer.mobile.meijer.activity.checkout.payment.Z z11 = this.f118881d;
            Object objB2 = composer.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.j1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SinglePageCheckoutActivity.C13004c.o(z11);
                    }
                };
                composer.t(objB2);
            }
            Function0 function0 = (Function0) objB2;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zD3 = composer.D(this.f118881d);
            final com.meijer.mobile.meijer.activity.checkout.payment.Z z12 = this.f118881d;
            Object objB3 = composer.B();
            if (zD3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.k1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SinglePageCheckoutActivity.C13004c.p(z12, (String) obj);
                    }
                };
                composer.t(objB3);
            }
            Function1 function12 = (Function1) objB3;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f118882e) | composer.D(this.f118881d);
            final Function0<Unit> function02 = this.f118882e;
            final com.meijer.mobile.meijer.activity.checkout.payment.Z z13 = this.f118881d;
            Object objB4 = composer.B();
            if (zV || objB4 == Composer.INSTANCE.a()) {
                objB4 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.l1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SinglePageCheckoutActivity.C13004c.q(function02, z13);
                    }
                };
                composer.t(objB4);
            }
            Function0 function03 = (Function0) objB4;
            composer.P();
            boolean isShowPinPad = this.f118879b.getIsShowPinPad();
            String acculynkPostBody = this.f118879b.getAcculynkPostBody();
            composer.startReplaceGroup(5004770);
            boolean zD4 = composer.D(this.f118883f);
            final com.meijer.mobile.meijer.activity.checkout.payment.ebt.r rVar = this.f118883f;
            Object objB5 = composer.B();
            if (zD4 || objB5 == Composer.INSTANCE.a()) {
                objB5 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.m1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SinglePageCheckoutActivity.C13004c.r(rVar, (String) obj);
                    }
                };
                composer.t(objB5);
            }
            Function1 function13 = (Function1) objB5;
            composer.P();
            boolean isWebPageLoading = this.f118879b.getIsWebPageLoading();
            composer.startReplaceGroup(5004770);
            boolean zD5 = composer.D(this.f118881d);
            final com.meijer.mobile.meijer.activity.checkout.payment.Z z14 = this.f118881d;
            Object objB6 = composer.B();
            if (zD5 || objB6 == Composer.INSTANCE.a()) {
                objB6 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.n1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SinglePageCheckoutActivity.C13004c.l(z14);
                    }
                };
                composer.t(objB6);
            }
            composer.P();
            Rq.H.p(localThemeScope, null, isEBTFlowLoading, mjrEbtPanData, ebtCardInputError, function1, function0, function12, function03, isShowPinPad, acculynkPostBody, function13, isWebPageLoading, (Function0) objB6, composer, LocalThemeScope.f17314g, 0, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14900d interfaceC14900d, Composer composer, Integer num) {
            g(interfaceC14900d, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(Function0 function0, com.meijer.mobile.meijer.activity.checkout.payment.Z z10) {
            function0.invoke();
            z10.d0(Z.i.j.f104602a);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(com.meijer.mobile.meijer.activity.checkout.payment.ebt.r rVar, String str) {
            rVar.I(str);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$d, reason: case insensitive filesystem */
    static final class C13005d implements Function3<InterfaceC14900d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118884a;

        C13005d(LocalThemeScope localThemeScope) {
            this.f118884a = localThemeScope;
        }

        public final void a(InterfaceC14900d interfaceC14900d, Composer composer, int i10) {
            Intrinsics.j(interfaceC14900d, "<this>");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-901701026, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ConditionalBottomSheet.<anonymous> (SinglePageCheckoutActivity.kt:700)");
            }
            LocalThemeScope localThemeScope = this.f118884a;
            si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, this.f118884a.getAdsSpacing().getFive().getDp()), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 382, null), C16338g.c(com.meijer.mobile.meijer.Y.f100485Ig, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$e, reason: case insensitive filesystem */
    static final class C13006e implements Function3<InterfaceC14900d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Z.PaymentOptionsViewState f118885a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SinglePageCheckoutActivity f118886b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.meijer.mobile.meijer.activity.checkout.payment.Z f118887c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118888d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.meijer.mobile.accounts.ux.payments.d f118889e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f118890f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<EnumC13024a, Unit> f118891g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f118892h;

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
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C13006e(Z.PaymentOptionsViewState paymentOptionsViewState, SinglePageCheckoutActivity singlePageCheckoutActivity, com.meijer.mobile.meijer.activity.checkout.payment.Z z10, LocalThemeScope localThemeScope, com.meijer.mobile.accounts.ux.payments.d dVar, Function0<Unit> function0, Function1<? super EnumC13024a, Unit> function1, InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f118885a = paymentOptionsViewState;
            this.f118886b = singlePageCheckoutActivity;
            this.f118887c = z10;
            this.f118888d = localThemeScope;
            this.f118889e = dVar;
            this.f118890f = function0;
            this.f118891g = function1;
            this.f118892h = interfaceC5872l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(com.meijer.mobile.accounts.ux.payments.d dVar, Function0 function0, Function1 function1, boolean z10) {
            com.meijer.mobile.accounts.ux.payments.d.t(dVar, z10 ? EnumC14533a.f135774b : EnumC14533a.f135776d, false, 2, null);
            function0.invoke();
            function1.invoke(EnumC13024a.f119134e);
            return Unit.f143329a;
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
            return Unit.f143329a;
        }

        public final void e(InterfaceC14900d interfaceC14900d, Composer composer, int i10) {
            Intrinsics.j(interfaceC14900d, "<this>");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1339776208, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ConditionalBottomSheet.<anonymous> (SinglePageCheckoutActivity.kt:716)");
            }
            List<PaymentOptionDecorator> listS = this.f118885a.s();
            boolean zL3 = this.f118886b.L3();
            boolean zN2 = SinglePageCheckoutActivity.n2(this.f118892h);
            com.meijer.mobile.meijer.activity.checkout.payment.Z z10 = this.f118887c;
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(z10);
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new a(z10);
                composer.t(objB);
            }
            KFunction kFunction = (KFunction) objB;
            composer.P();
            String currentSelectCardID = this.f118885a.getCurrentSelectCardID();
            if (currentSelectCardID == null) {
                currentSelectCardID = "-1";
            }
            String str = currentSelectCardID;
            LocalThemeScope localThemeScope = this.f118888d;
            composer.startReplaceGroup(5004770);
            final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f118892h;
            Object objB2 = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB2 == companion.a()) {
                objB2 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.o1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SinglePageCheckoutActivity.C13006e.g(interfaceC5872l0, ((Boolean) obj).booleanValue());
                    }
                };
                composer.t(objB2);
            }
            Function1 function1 = (Function1) objB2;
            composer.P();
            Z.PaymentOptionsViewState paymentOptionsViewState = this.f118885a;
            Function1 function12 = (Function1) kFunction;
            composer.startReplaceGroup(-1746271574);
            boolean zD2 = composer.D(this.f118889e) | composer.V(this.f118890f) | composer.V(this.f118891g);
            final com.meijer.mobile.accounts.ux.payments.d dVar = this.f118889e;
            final Function0<Unit> function0 = this.f118890f;
            final Function1<EnumC13024a, Unit> function13 = this.f118891g;
            Object objB3 = composer.B();
            if (zD2 || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.p1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SinglePageCheckoutActivity.C13006e.k(dVar, function0, function13, ((Boolean) obj).booleanValue());
                    }
                };
                composer.t(objB3);
            }
            Function1 function14 = (Function1) objB3;
            composer.P();
            composer.startReplaceGroup(-1746271574);
            boolean zD3 = composer.D(this.f118885a) | composer.D(this.f118887c) | composer.V(this.f118890f);
            final Z.PaymentOptionsViewState paymentOptionsViewState2 = this.f118885a;
            final com.meijer.mobile.meijer.activity.checkout.payment.Z z11 = this.f118887c;
            final Function0<Unit> function02 = this.f118890f;
            Object objB4 = composer.B();
            if (zD3 || objB4 == companion.a()) {
                objB4 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.q1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SinglePageCheckoutActivity.C13006e.l(paymentOptionsViewState2, z11, function02, (String) obj);
                    }
                };
                composer.t(objB4);
            }
            Function1 function15 = (Function1) objB4;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f118890f);
            final Function0<Unit> function03 = this.f118890f;
            Object objB5 = composer.B();
            if (zV || objB5 == companion.a()) {
                objB5 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.r1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SinglePageCheckoutActivity.C13006e.f(function03);
                    }
                };
                composer.t(objB5);
            }
            composer.P();
            Rq.q0.c(localThemeScope, null, listS, zL3, zN2, function1, paymentOptionsViewState, function12, function14, function15, (Function0) objB5, str, composer, LocalThemeScope.f17314g | 196608, 0, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14900d interfaceC14900d, Composer composer, Integer num) {
            e(interfaceC14900d, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
            SinglePageCheckoutActivity.o2(interfaceC5872l0, z10);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$f, reason: case insensitive filesystem */
    static final class C13007f implements Function3<InterfaceC14900d, Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118894b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.meijer.mobile.meijer.activity.checkout.payment.ebt.r f118895c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f118896d;

        C13007f(LocalThemeScope localThemeScope, com.meijer.mobile.meijer.activity.checkout.payment.ebt.r rVar, Function0<Unit> function0) {
            this.f118894b = localThemeScope;
            this.f118895c = rVar;
            this.f118896d = function0;
        }

        public final void c(InterfaceC14900d interfaceC14900d, Composer composer, int i10) {
            Intrinsics.j(interfaceC14900d, "<this>");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1987959311, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ConditionalBottomSheet.<anonymous> (SinglePageCheckoutActivity.kt:758)");
            }
            String acculynkPostBody = SinglePageCheckoutActivity.this.z3().g0().c().getValue().getAcculynkPostBody();
            if (acculynkPostBody == null || acculynkPostBody.length() == 0) {
                this.f118896d.invoke();
            } else {
                LocalThemeScope localThemeScope = this.f118894b;
                String ebtTimerText = SinglePageCheckoutActivity.this.z3().g0().c().getValue().getEbtTimerText();
                boolean isLoading = SinglePageCheckoutActivity.this.z3().g0().c().getValue().getLoadingState().getIsLoading();
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(SinglePageCheckoutActivity.this);
                final SinglePageCheckoutActivity singlePageCheckoutActivity = SinglePageCheckoutActivity.this;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.s1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SinglePageCheckoutActivity.C13007f.d(singlePageCheckoutActivity);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(this.f118895c);
                final com.meijer.mobile.meijer.activity.checkout.payment.ebt.r rVar = this.f118895c;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.t1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SinglePageCheckoutActivity.C13007f.e(rVar, (String) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                String acculynkPostBody2 = SinglePageCheckoutActivity.this.z3().g0().c().getValue().getAcculynkPostBody();
                Intrinsics.g(acculynkPostBody2);
                com.meijer.mobile.singlepagecheckout.K.d(localThemeScope, null, true, ebtTimerText, isLoading, function0, (Function1) objB2, acculynkPostBody2, composer, LocalThemeScope.f17314g | 384, 1);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14900d interfaceC14900d, Composer composer, Integer num) {
            c(interfaceC14900d, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(SinglePageCheckoutActivity singlePageCheckoutActivity) throws IOException {
            singlePageCheckoutActivity.z3().r0(z1.h.j.f105978a);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(com.meijer.mobile.meijer.activity.checkout.payment.ebt.r rVar, String str) {
            rVar.I(str);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$g, reason: case insensitive filesystem */
    static final class C13008g implements Function3<InterfaceC14900d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118897a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<ProductCardDecorator> f118898b;

        C13008g(LocalThemeScope localThemeScope, List<ProductCardDecorator> list) {
            this.f118897a = localThemeScope;
            this.f118898b = list;
        }

        public final void a(InterfaceC14900d interfaceC14900d, Composer composer, int i10) {
            Intrinsics.j(interfaceC14900d, "<this>");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(881907423, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ConditionalBottomSheet.<anonymous> (SinglePageCheckoutActivity.kt:504)");
            }
            Bm.p0.b(this.f118897a, null, this.f118898b, composer, LocalThemeScope.f17314g, 1);
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
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$h, reason: case insensitive filesystem */
    static final class C13009h implements Function3<InterfaceC14900d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118899a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SinglePageCheckoutActivity f118900b;

        C13009h(LocalThemeScope localThemeScope, SinglePageCheckoutActivity singlePageCheckoutActivity) {
            this.f118899a = localThemeScope;
            this.f118900b = singlePageCheckoutActivity;
        }

        public final void a(InterfaceC14900d interfaceC14900d, Composer composer, int i10) {
            Intrinsics.j(interfaceC14900d, "<this>");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-11203498, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ConditionalBottomSheet.<anonymous> (SinglePageCheckoutActivity.kt:516)");
            }
            C11976k.h(this.f118899a, null, this.f118900b.C3(), composer, LocalThemeScope.f17314g, 1);
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
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$i, reason: case insensitive filesystem */
    static final class C13010i implements Function3<InterfaceC14900d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118901a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdjustEbtPaymentDecorator f118902b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f118903c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ SinglePageCheckoutActivity f118904d;

        C13010i(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, Function0<Unit> function0, SinglePageCheckoutActivity singlePageCheckoutActivity) {
            this.f118901a = localThemeScope;
            this.f118902b = adjustEbtPaymentDecorator;
            this.f118903c = function0;
            this.f118904d = singlePageCheckoutActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f() {
            return Unit.f143329a;
        }

        public final void d(InterfaceC14900d interfaceC14900d, Composer composer, int i10) {
            Intrinsics.j(interfaceC14900d, "<this>");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-659386601, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ConditionalBottomSheet.<anonymous> (SinglePageCheckoutActivity.kt:528)");
            }
            LocalThemeScope localThemeScope = this.f118901a;
            AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.f118902b;
            composer.startReplaceGroup(1984639905);
            if (adjustEbtPaymentDecorator == null) {
                adjustEbtPaymentDecorator = new AdjustEbtPaymentDecorator(null, null, null, null, null, null, AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100758X4, new Object[0]), C16338g.c(com.meijer.mobile.meijer.Y.f100758X4, composer, 0), 63, null);
            }
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f118903c);
            final Function0<Unit> function0 = this.f118903c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.u1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SinglePageCheckoutActivity.C13010i.e(function0);
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
                objB2 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.v1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SinglePageCheckoutActivity.C13010i.f();
                    }
                };
                composer.t(objB2);
            }
            Function0 function03 = (Function0) objB2;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f118904d);
            final SinglePageCheckoutActivity singlePageCheckoutActivity = this.f118904d;
            Object objB3 = composer.B();
            if (zD || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.w1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SinglePageCheckoutActivity.C13010i.g(singlePageCheckoutActivity, ((Double) obj).doubleValue());
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            Qq.e.c(localThemeScope, adjustEbtPaymentDecorator, function02, function03, (Function1) objB3, composer, LocalThemeScope.f17314g | 3072 | (AbstractC6392a.f60445b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14900d interfaceC14900d, Composer composer, Integer num) {
            d(interfaceC14900d, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(SinglePageCheckoutActivity singlePageCheckoutActivity, double d10) throws IOException {
            singlePageCheckoutActivity.z3().r0(new z1.h.UpdateEbtApprovedAmount(d10));
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$j, reason: case insensitive filesystem */
    static final class C13011j implements Function3<InterfaceC14900d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118905a;

        C13011j(LocalThemeScope localThemeScope) {
            this.f118905a = localThemeScope;
        }

        public final void a(InterfaceC14900d interfaceC14900d, Composer composer, int i10) {
            Intrinsics.j(interfaceC14900d, "<this>");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1307569704, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ConditionalBottomSheet.<anonymous> (SinglePageCheckoutActivity.kt:556)");
            }
            Qq.n.b(this.f118905a, androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), C16338g.c(com.meijer.mobile.meijer.Y.f101266wg, composer, 0), C16338g.c(com.meijer.mobile.meijer.Y.f101286xg, composer, 0), composer, LocalThemeScope.f17314g | 48, 0);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ConditionalBottomSheet$closeSheet$1$1$1", f = "SinglePageCheckoutActivity.kt", l = {470}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$k, reason: case insensitive filesystem */
    static final class C13012k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f118906a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17959M0 f118907b;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C13012k(this.f118907b, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13012k(C17959M0 c17959m0, Continuation<? super C13012k> continuation) {
            super(2, continuation);
            this.f118907b = c17959m0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C13012k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f118906a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C17959M0 c17959m0 = this.f118907b;
                this.f118906a = 1;
                if (c17959m0.i(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObserveCheckoutEvents$2$1", f = "SinglePageCheckoutActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$l, reason: case insensitive filesystem */
    static final class C13013l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f118908a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<EnumC13024a, Unit> f118910c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObserveCheckoutEvents$2$1$1", f = "SinglePageCheckoutActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$l$a */
        static final class a extends SuspendLambda implements Function2<z1.j, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f118911a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f118912b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ SinglePageCheckoutActivity f118913c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<EnumC13024a, Unit> f118914d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$l$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1915a extends FunctionReferenceImpl implements Function1<z1.h, Unit> {
                C1915a(Object obj) {
                    super(1, obj, com.meijer.mobile.meijer.activity.checkout.review.z1.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/review/CheckoutViewModel$Action;)V", 0);
                }

                public final void a(z1.h p02) throws IOException {
                    Intrinsics.j(p02, "p0");
                    ((com.meijer.mobile.meijer.activity.checkout.review.z1) this.receiver).r0(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(z1.h hVar) throws IOException {
                    a(hVar);
                    return Unit.f143329a;
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
                    return Unit.f143329a;
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
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(SinglePageCheckoutActivity singlePageCheckoutActivity, Function1<? super EnumC13024a, Unit> function1, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f118913c = singlePageCheckoutActivity;
                this.f118914d = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f118913c, this.f118914d, continuation);
                aVar.f118912b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public final Object invoke(z1.j jVar, Continuation<? super Unit> continuation) {
                return ((a) create(jVar, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws IOException {
                String strA;
                IntrinsicsKt.f();
                if (this.f118911a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                z1.j jVar = (z1.j) this.f118912b;
                if (jVar instanceof z1.j.NavigateToOrderConfirmationEvent) {
                    SinglePageCheckoutActivity singlePageCheckoutActivity = this.f118913c;
                    OrderConfirmationActivity.Companion companion = OrderConfirmationActivity.INSTANCE;
                    z1.j.NavigateToOrderConfirmationEvent navigateToOrderConfirmationEvent = (z1.j.NavigateToOrderConfirmationEvent) jVar;
                    String orderId = navigateToOrderConfirmationEvent.getOrderId();
                    singlePageCheckoutActivity.startActivity(companion.a(singlePageCheckoutActivity, orderId == null ? "" : orderId, navigateToOrderConfirmationEvent.getInformation(), navigateToOrderConfirmationEvent.getIsBopasEligibleCart(), navigateToOrderConfirmationEvent.getSendPreTipAnalytics()));
                    this.f118913c.finish();
                } else {
                    InterfaceC5872l0 interfaceC5872l0 = null;
                    InterfaceC5872l0 interfaceC5872l02 = null;
                    if (jVar instanceof z1.j.OrderSubmittedSuccessEvent) {
                        InterfaceC5872l0 interfaceC5872l03 = this.f118913c.displayCheckoutAnimations;
                        if (interfaceC5872l03 == null) {
                            Intrinsics.x("displayCheckoutAnimations");
                            interfaceC5872l03 = null;
                        }
                        interfaceC5872l03.setValue(Boxing.a(true));
                        com.meijer.mobile.meijer.activity.checkout.review.z1 z1VarZ3 = this.f118913c.z3();
                        z1.j.OrderSubmittedSuccessEvent orderSubmittedSuccessEvent = (z1.j.OrderSubmittedSuccessEvent) jVar;
                        int i10 = !orderSubmittedSuccessEvent.getDisplayEbtPinPad() ? Cj.n.f5004c : Cj.n.f5002a;
                        OrderDetail orderDetail = orderSubmittedSuccessEvent.getOrderDetail();
                        z1VarZ3.r0(new z1.h.SetCheckoutAnimations(true, new CheckoutAnimations(i10, null, false, false, orderDetail != null ? orderDetail.getCode() : null, orderSubmittedSuccessEvent.getInformation(), orderSubmittedSuccessEvent.getDisplayEbtPinPad(), 14, null)));
                        this.f118913c.getFirebasePerformanceEngine().b("cart_checkout_trace");
                    } else if (jVar instanceof z1.j.SubmitOrderErrorEvent) {
                        z1.j.SubmitOrderErrorEvent submitOrderErrorEvent = (z1.j.SubmitOrderErrorEvent) jVar;
                        if (submitOrderErrorEvent.getIsTimeSlotError()) {
                            this.f118913c.z3().r0(z1.h.j.f105978a);
                            this.f118913c.G3().e0(q1.g.c.f103931a);
                            this.f118913c.z3().r0(z1.h.m.f105981a);
                        } else {
                            InterfaceC5872l0 interfaceC5872l04 = this.f118913c.displayCheckoutAnimations;
                            if (interfaceC5872l04 == null) {
                                Intrinsics.x("displayCheckoutAnimations");
                            } else {
                                interfaceC5872l02 = interfaceC5872l04;
                            }
                            interfaceC5872l02.setValue(Boxing.a(true));
                            this.f118913c.z3().r0(new z1.h.SetCheckoutAnimations(true, new CheckoutAnimations(Cj.n.f5003b, submitOrderErrorEvent.getButtonText(), submitOrderErrorEvent.getIsTimeSlotError(), true, null, null, false, 112, null)));
                        }
                        this.f118913c.z3().J0(false);
                        this.f118913c.getFirebasePerformanceEngine().b("cart_checkout_trace");
                    } else if (jVar instanceof z1.j.a) {
                        this.f118913c.O3();
                    } else if (jVar instanceof z1.j.ShowErrorDialogEvent) {
                        this.f118913c.z3().J0(false);
                        CheckoutErrorDialogDecorator checkoutErrorDialogDecorator = ((z1.j.ShowErrorDialogEvent) jVar).getCheckoutErrorDialogDecorator();
                        this.f118913c.U3(checkoutErrorDialogDecorator.getTitle(), checkoutErrorDialogDecorator.getMessage(), checkoutErrorDialogDecorator.getButtonText(), checkoutErrorDialogDecorator.c());
                    } else if (jVar instanceof z1.j.ShowAgeRestrictedDialog) {
                        z1.j.ShowAgeRestrictedDialog showAgeRestrictedDialog = (z1.j.ShowAgeRestrictedDialog) jVar;
                        RetrofitException retrofitException = showAgeRestrictedDialog.getRetrofitException();
                        if (retrofitException == null || (strA = retrofitException.c(this.f118913c)) == null) {
                            strA = ck.d.a(this.f118913c, showAgeRestrictedDialog.getMessage());
                        }
                        String str = strA;
                        InterfaceC5872l0 interfaceC5872l05 = this.f118913c.modalToShow;
                        if (interfaceC5872l05 == null) {
                            Intrinsics.x("modalToShow");
                        } else {
                            interfaceC5872l0 = interfaceC5872l05;
                        }
                        String strA2 = ck.d.a(this.f118913c, showAgeRestrictedDialog.getTitle());
                        String strA3 = ck.d.a(this.f118913c, showAgeRestrictedDialog.getButtonText());
                        final SinglePageCheckoutActivity singlePageCheckoutActivity2 = this.f118913c;
                        interfaceC5872l0.setValue(new Ij.d(strA2, str, strA3, new Function0() { // from class: com.meijer.mobile.singlepagecheckout.x1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SinglePageCheckoutActivity.C13013l.a.o(singlePageCheckoutActivity2);
                            }
                        }, null, null, null, null, 240, null));
                        this.f118913c.z3().r0(z1.h.j.f105978a);
                    } else if (jVar instanceof z1.j.ShowFutureTimeslotAlert) {
                        z1.j.ShowFutureTimeslotAlert showFutureTimeslotAlert = (z1.j.ShowFutureTimeslotAlert) jVar;
                        C15485b message = new C15485b(this.f118913c).setTitle(ck.d.a(this.f118913c, showFutureTimeslotAlert.getAlertTitle())).setCancelable(false).setMessage(ck.d.a(this.f118913c, showFutureTimeslotAlert.getAlertMessage()));
                        int i11 = com.meijer.mobile.meijer.Y.f100622Q1;
                        final SinglePageCheckoutActivity singlePageCheckoutActivity3 = this.f118913c;
                        C15485b positiveButton = message.setPositiveButton(i11, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.y1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i12) throws IOException {
                                SinglePageCheckoutActivity.C13013l.a.p(singlePageCheckoutActivity3, dialogInterface, i12);
                            }
                        });
                        int i12 = com.meijer.mobile.meijer.Y.f100716V0;
                        final SinglePageCheckoutActivity singlePageCheckoutActivity4 = this.f118913c;
                        positiveButton.setNegativeButton(i12, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.z1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i13) throws IOException {
                                SinglePageCheckoutActivity.C13013l.a.q(singlePageCheckoutActivity4, dialogInterface, i13);
                            }
                        }).show();
                    } else if (jVar instanceof z1.j.ShowEBTPinPadEvent) {
                        this.f118914d.invoke(EnumC13024a.f119140k);
                        if (!this.f118913c.E3().getTimerRunningStatus()) {
                            this.f118913c.E3().l(115L);
                        }
                        this.f118913c.E3().k(this.f118913c);
                    } else if (jVar instanceof z1.j.NavigateToOrderDetailEvent) {
                        SinglePageCheckoutActivity singlePageCheckoutActivity5 = this.f118913c;
                        Bl.l lVar = Bl.l.f3131a;
                        z1.j.NavigateToOrderDetailEvent navigateToOrderDetailEvent = (z1.j.NavigateToOrderDetailEvent) jVar;
                        String orderId2 = navigateToOrderDetailEvent.getOrderId();
                        singlePageCheckoutActivity5.startActivity(Bl.l.b(lVar, singlePageCheckoutActivity5, orderId2 == null ? "" : orderId2, null, navigateToOrderDetailEvent.getShortCode(), 4, null));
                        this.f118913c.finish();
                    } else if (jVar instanceof z1.j.d) {
                        this.f118913c.I3(new c(this.f118913c.z3()));
                    } else if (!(jVar instanceof z1.j.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(SinglePageCheckoutActivity singlePageCheckoutActivity) {
                InterfaceC5872l0 interfaceC5872l0 = singlePageCheckoutActivity.modalToShow;
                if (interfaceC5872l0 == null) {
                    Intrinsics.x("modalToShow");
                    interfaceC5872l0 = null;
                }
                interfaceC5872l0.setValue(null);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void p(SinglePageCheckoutActivity singlePageCheckoutActivity, DialogInterface dialogInterface, int i10) throws IOException {
                dialogInterface.dismiss();
                singlePageCheckoutActivity.z3().r0(new z1.h.SendAdobeActionTag(true));
                singlePageCheckoutActivity.z3().r0(new z1.h.SubmitOrderAction(false));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void q(SinglePageCheckoutActivity singlePageCheckoutActivity, DialogInterface dialogInterface, int i10) throws IOException {
                singlePageCheckoutActivity.z3().r0(new z1.h.SendAdobeActionTag(false));
                singlePageCheckoutActivity.z3().J0(false);
                singlePageCheckoutActivity.J3(new C1915a(singlePageCheckoutActivity.z3()), new b(singlePageCheckoutActivity.G3()));
                dialogInterface.dismiss();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13013l(Function1<? super EnumC13024a, Unit> function1, Continuation<? super C13013l> continuation) {
            super(2, continuation);
            this.f118910c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SinglePageCheckoutActivity.this.new C13013l(this.f118910c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C13013l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f118908a == 0) {
                ResultKt.b(obj);
                C16563h.J(C16563h.O(SinglePageCheckoutActivity.this.z3().g0().b(), new a(SinglePageCheckoutActivity.this, this.f118910c, null)), C6173t.a(SinglePageCheckoutActivity.this));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObserveContactInfoEvents$1$1", f = "SinglePageCheckoutActivity.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$m, reason: case insensitive filesystem */
    static final class C13014m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f118915a;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$m$b */
        public static final class b implements InterfaceC16561f<C12057p.h> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16561f f118919a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$m$b$a */
            public static final class a<T> implements InterfaceC16562g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC16562g f118920a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObserveContactInfoEvents$1$1$invokeSuspend$$inlined$filter$1$2", f = "SinglePageCheckoutActivity.kt", l = {50}, m = "emit")
                /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$m$b$a$a, reason: collision with other inner class name */
                public static final class C1916a extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f118921a;

                    /* renamed from: b, reason: collision with root package name */
                    int f118922b;

                    /* renamed from: c, reason: collision with root package name */
                    Object f118923c;

                    /* renamed from: d, reason: collision with root package name */
                    Object f118924d;

                    /* renamed from: f, reason: collision with root package name */
                    Object f118926f;

                    /* renamed from: g, reason: collision with root package name */
                    Object f118927g;

                    /* renamed from: h, reason: collision with root package name */
                    int f118928h;

                    public C1916a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f118921a = obj;
                        this.f118922b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC16562g interfaceC16562g) {
                    this.f118920a = interfaceC16562g;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // pv.InterfaceC16562g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.C13014m.b.a.C1916a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$m$b$a$a r0 = (com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.C13014m.b.a.C1916a) r0
                        int r1 = r0.f118922b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f118922b = r1
                        goto L18
                    L13:
                        com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$m$b$a$a r0 = new com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$m$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f118921a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                        int r2 = r0.f118922b
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r5 = r0.f118927g
                        pv.g r5 = (pv.InterfaceC16562g) r5
                        java.lang.Object r5 = r0.f118924d
                        com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$m$b$a$a r5 = (com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.C13014m.b.a.C1916a) r5
                        kotlin.ResultKt.b(r6)
                        goto L59
                    L31:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L39:
                        kotlin.ResultKt.b(r6)
                        pv.g r6 = r4.f118920a
                        r2 = r5
                        com.meijer.mobile.meijer.activity.checkout.pickupperson.p$h r2 = (com.meijer.mobile.meijer.activity.checkout.pickupperson.C12057p.h) r2
                        boolean r2 = r2 instanceof com.meijer.mobile.meijer.activity.checkout.pickupperson.C12057p.h.b
                        if (r2 == 0) goto L59
                        r0.f118923c = r5
                        r0.f118924d = r0
                        r0.f118926f = r5
                        r0.f118927g = r6
                        r2 = 0
                        r0.f118928h = r2
                        r0.f118922b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L59
                        return r1
                    L59:
                        kotlin.Unit r5 = kotlin.Unit.f143329a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.C13014m.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public b(InterfaceC16561f interfaceC16561f) {
                this.f118919a = interfaceC16561f;
            }

            @Override // pv.InterfaceC16561f
            public Object collect(InterfaceC16562g<? super C12057p.h> interfaceC16562g, Continuation continuation) {
                Object objCollect = this.f118919a.collect(new a(interfaceC16562g), continuation);
                return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
            }
        }

        C13014m(Continuation<? super C13014m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SinglePageCheckoutActivity.this.new C13014m(continuation);
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$h;", "it", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$h;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObserveContactInfoEvents$1$1$2", f = "SinglePageCheckoutActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$m$a */
        static final class a extends SuspendLambda implements Function2<C12057p.h, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f118917a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SinglePageCheckoutActivity f118918b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SinglePageCheckoutActivity singlePageCheckoutActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f118918b = singlePageCheckoutActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f118918b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C12057p.h hVar, Continuation<? super Unit> continuation) {
                return ((a) create(hVar, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f118917a == 0) {
                    ResultKt.b(obj);
                    this.f118918b.W3();
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C13014m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f118915a == 0) {
                ResultKt.b(obj);
                C16563h.J(C16563h.O(new b(SinglePageCheckoutActivity.this.H3().H().b()), new a(SinglePageCheckoutActivity.this, null)), C6173t.a(SinglePageCheckoutActivity.this));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObserveContactInfoEvents$2$1", f = "SinglePageCheckoutActivity.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$n, reason: case insensitive filesystem */
    static final class C13015n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f118929a;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$n$b */
        public static final class b implements InterfaceC16561f<H.j> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16561f f118933a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$n$b$a */
            public static final class a<T> implements InterfaceC16562g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC16562g f118934a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObserveContactInfoEvents$2$1$invokeSuspend$$inlined$filter$1$2", f = "SinglePageCheckoutActivity.kt", l = {50}, m = "emit")
                /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$n$b$a$a, reason: collision with other inner class name */
                public static final class C1917a extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f118935a;

                    /* renamed from: b, reason: collision with root package name */
                    int f118936b;

                    /* renamed from: c, reason: collision with root package name */
                    Object f118937c;

                    /* renamed from: d, reason: collision with root package name */
                    Object f118938d;

                    /* renamed from: f, reason: collision with root package name */
                    Object f118940f;

                    /* renamed from: g, reason: collision with root package name */
                    Object f118941g;

                    /* renamed from: h, reason: collision with root package name */
                    int f118942h;

                    public C1917a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f118935a = obj;
                        this.f118936b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC16562g interfaceC16562g) {
                    this.f118934a = interfaceC16562g;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // pv.InterfaceC16562g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.C13015n.b.a.C1917a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$n$b$a$a r0 = (com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.C13015n.b.a.C1917a) r0
                        int r1 = r0.f118936b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f118936b = r1
                        goto L18
                    L13:
                        com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$n$b$a$a r0 = new com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$n$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f118935a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                        int r2 = r0.f118936b
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r5 = r0.f118941g
                        pv.g r5 = (pv.InterfaceC16562g) r5
                        java.lang.Object r5 = r0.f118938d
                        com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$n$b$a$a r5 = (com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.C13015n.b.a.C1917a) r5
                        kotlin.ResultKt.b(r6)
                        goto L59
                    L31:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L39:
                        kotlin.ResultKt.b(r6)
                        pv.g r6 = r4.f118934a
                        r2 = r5
                        com.meijer.mobile.meijer.activity.checkout.contactinformation.H$j r2 = (com.meijer.mobile.meijer.activity.checkout.contactinformation.H.j) r2
                        boolean r2 = r2 instanceof com.meijer.mobile.meijer.activity.checkout.contactinformation.H.j.b
                        if (r2 == 0) goto L59
                        r0.f118937c = r5
                        r0.f118938d = r0
                        r0.f118940f = r5
                        r0.f118941g = r6
                        r2 = 0
                        r0.f118942h = r2
                        r0.f118936b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L59
                        return r1
                    L59:
                        kotlin.Unit r5 = kotlin.Unit.f143329a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.C13015n.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public b(InterfaceC16561f interfaceC16561f) {
                this.f118933a = interfaceC16561f;
            }

            @Override // pv.InterfaceC16561f
            public Object collect(InterfaceC16562g<? super H.j> interfaceC16562g, Continuation continuation) {
                Object objCollect = this.f118933a.collect(new a(interfaceC16562g), continuation);
                return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
            }
        }

        C13015n(Continuation<? super C13015n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SinglePageCheckoutActivity.this.new C13015n(continuation);
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j;", "it", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObserveContactInfoEvents$2$1$2", f = "SinglePageCheckoutActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$n$a */
        static final class a extends SuspendLambda implements Function2<H.j, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f118931a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SinglePageCheckoutActivity f118932b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SinglePageCheckoutActivity singlePageCheckoutActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f118932b = singlePageCheckoutActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f118932b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(H.j jVar, Continuation<? super Unit> continuation) {
                return ((a) create(jVar, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f118931a == 0) {
                    ResultKt.b(obj);
                    this.f118932b.W3();
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C13015n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f118929a == 0) {
                ResultKt.b(obj);
                C16563h.J(C16563h.O(new b(SinglePageCheckoutActivity.this.B3().J().b()), new a(SinglePageCheckoutActivity.this, null)), C6173t.a(SinglePageCheckoutActivity.this));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObserveFulfillmentSlotEvents$2$1", f = "SinglePageCheckoutActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$o, reason: case insensitive filesystem */
    static final class C13016o extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f118943a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f118945c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<EnumC13024a, Unit> f118946d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$h;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$h;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObserveFulfillmentSlotEvents$2$1$1", f = "SinglePageCheckoutActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$o$a */
        static final class a extends SuspendLambda implements Function2<q1.h, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f118947a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f118948b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f118949c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<EnumC13024a, Unit> f118950d;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObserveFulfillmentSlotEvents$2$1$1$1", f = "SinglePageCheckoutActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$o$a$a, reason: collision with other inner class name */
            static final class C1918a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f118951a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function1<EnumC13024a, Unit> f118952b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1918a(Function1<? super EnumC13024a, Unit> function1, Continuation<? super C1918a> continuation) {
                    super(2, continuation);
                    this.f118952b = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1918a(this.f118952b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C1918a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f118951a == 0) {
                        ResultKt.b(obj);
                        this.f118952b.invoke(EnumC13024a.f119131b);
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f118949c, this.f118950d, continuation);
                aVar.f118948b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(q1.h hVar, Continuation<? super Unit> continuation) {
                return ((a) create(hVar, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(InterfaceC15783O interfaceC15783O, Function1<? super EnumC13024a, Unit> function1, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f118949c = interfaceC15783O;
                this.f118950d = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f118947a == 0) {
                    ResultKt.b(obj);
                    q1.h hVar = (q1.h) this.f118948b;
                    if (!(hVar instanceof q1.h.TimeSlotSetCanProceedToNextStepInCheckout)) {
                        if (hVar instanceof q1.h.a) {
                            C15809k.d(this.f118949c, null, null, new C1918a(this.f118950d, null), 3, null);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SinglePageCheckoutActivity.this.new C13016o(this.f118945c, this.f118946d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13016o(InterfaceC15783O interfaceC15783O, Function1<? super EnumC13024a, Unit> function1, Continuation<? super C13016o> continuation) {
            super(2, continuation);
            this.f118945c = interfaceC15783O;
            this.f118946d = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C13016o) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f118943a == 0) {
                ResultKt.b(obj);
                C16563h.J(C16563h.O(SinglePageCheckoutActivity.this.G3().a0().b(), new a(this.f118945c, this.f118946d, null)), C6173t.a(SinglePageCheckoutActivity.this));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObservePaymentEvents$1$1", f = "SinglePageCheckoutActivity.kt", l = {1141}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$p, reason: case insensitive filesystem */
    static final class C13017p extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f118953a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C17959M0 f118955c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f118956d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/accounts/ux/payments/d$c;", "effect", "", "<anonymous>", "(Lcom/meijer/mobile/accounts/ux/payments/d$c;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObservePaymentEvents$1$1$1", f = "SinglePageCheckoutActivity.kt", l = {1149}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$p$a */
        static final class a extends SuspendLambda implements Function2<d.c, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f118957a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f118958b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ SinglePageCheckoutActivity f118959c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C17959M0 f118960d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Context f118961e;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f118959c, this.f118960d, this.f118961e, continuation);
                aVar.f118958b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(d.c cVar, Continuation<? super Unit> continuation) {
                return ((a) create(cVar, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SinglePageCheckoutActivity singlePageCheckoutActivity, C17959M0 c17959m0, Context context, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f118959c = singlePageCheckoutActivity;
                this.f118960d = c17959m0;
                this.f118961e = context;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void k(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f118957a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    d.c cVar = (d.c) this.f118958b;
                    if (cVar instanceof d.c.CardAddSuccessful) {
                        this.f118959c.y3().d0(new Z.i.SetPaymentMethodAction(((d.c.CardAddSuccessful) cVar).getMultiTenderPaymentOption().getCreditDebitPaymentOption()));
                        C17959M0 c17959m0 = this.f118960d;
                        this.f118958b = cVar;
                        this.f118957a = 1;
                        if (c17959m0.i(this) == objF) {
                            return objF;
                        }
                    } else if (Intrinsics.e(cVar, d.c.a.f95257a)) {
                        new C15485b(this.f118961e).setTitle(com.meijer.mobile.meijer.Y.f100772Y).setMessage(com.meijer.mobile.meijer.Y.f100753X).setPositiveButton(yr.Q.f171761b, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.A1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i11) {
                                SinglePageCheckoutActivity.C13017p.a.k(dialogInterface, i11);
                            }
                        }).show();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f143329a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SinglePageCheckoutActivity.this.new C13017p(this.f118955c, this.f118956d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13017p(C17959M0 c17959m0, Context context, Continuation<? super C13017p> continuation) {
            super(2, continuation);
            this.f118955c = c17959m0;
            this.f118956d = context;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C13017p) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f118953a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16553F<d.c> interfaceC16553FW = SinglePageCheckoutActivity.this.x3().w();
                a aVar = new a(SinglePageCheckoutActivity.this, this.f118955c, this.f118956d, null);
                this.f118953a = 1;
                if (C16563h.k(interfaceC16553FW, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObservePaymentEvents$2$1", f = "SinglePageCheckoutActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$q, reason: case insensitive filesystem */
    static final class C13018q extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f118962a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f118964c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C18029o1 f118965d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f118966e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17959M0 f118967f;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObservePaymentEvents$2$1$1", f = "SinglePageCheckoutActivity.kt", l = {1182}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$q$a */
        static final class a extends SuspendLambda implements Function2<Z.j, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f118968a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f118969b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f118970c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ SinglePageCheckoutActivity f118971d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C18029o1 f118972e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Context f118973f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C17959M0 f118974g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObservePaymentEvents$2$1$1$1", f = "SinglePageCheckoutActivity.kt", l = {1170}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$q$a$a, reason: collision with other inner class name */
            static final class C1919a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f118975a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17959M0 f118976b;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1919a(this.f118976b, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1919a(C17959M0 c17959m0, Continuation<? super C1919a> continuation) {
                    super(2, continuation);
                    this.f118976b = c17959m0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C1919a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f118975a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17959M0 c17959m0 = this.f118976b;
                        this.f118975a = 1;
                        if (c17959m0.l(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObservePaymentEvents$2$1$1$2", f = "SinglePageCheckoutActivity.kt", l = {1176}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$q$a$b */
            static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f118977a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17959M0 f118978b;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f118978b, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C17959M0 c17959m0, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f118978b = c17959m0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f118977a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17959M0 c17959m0 = this.f118978b;
                        this.f118977a = 1;
                        if (c17959m0.i(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f118970c, this.f118971d, this.f118972e, this.f118973f, this.f118974g, continuation);
                aVar.f118969b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Z.j jVar, Continuation<? super Unit> continuation) {
                return ((a) create(jVar, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC15783O interfaceC15783O, SinglePageCheckoutActivity singlePageCheckoutActivity, C18029o1 c18029o1, Context context, C17959M0 c17959m0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f118970c = interfaceC15783O;
                this.f118971d = singlePageCheckoutActivity;
                this.f118972e = c18029o1;
                this.f118973f = context;
                this.f118974g = c17959m0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws IOException {
                String strB;
                Function1 function1;
                String strB2;
                String strB3;
                Function1 function12;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f118968a;
                if (i10 == 0) {
                    ResultKt.b(obj);
                    Z.j jVar = (Z.j) this.f118969b;
                    if (jVar instanceof Z.j.e) {
                        C15809k.d(this.f118970c, null, null, new C1919a(this.f118974g, null), 3, null);
                    } else if (jVar instanceof Z.j.c) {
                        C15809k.d(this.f118970c, null, null, new b(this.f118974g, null), 3, null);
                    } else if (jVar instanceof Z.j.PaymentCardRelatedFailedEvent) {
                        this.f118971d.y3().d0(Z.i.n.f104606a);
                        C18029o1 c18029o1 = this.f118972e;
                        String strB4 = AbstractC6392a.INSTANCE.d(((Z.j.PaymentCardRelatedFailedEvent) jVar).getMessageId(), new Object[0]).b(this.f118973f);
                        EnumC18023m1 enumC18023m1 = EnumC18023m1.f169431b;
                        this.f118969b = jVar;
                        this.f118968a = 1;
                        if (C18029o1.e(c18029o1, strB4, null, enumC18023m1, this, 2, null) == objF) {
                            return objF;
                        }
                    } else if (jVar instanceof Z.j.CardFailEvent) {
                        C13043e2.g(((Z.j.CardFailEvent) jVar).getFormattedString(), this.f118973f);
                        Unit unit = Unit.f143329a;
                    } else if (jVar instanceof Z.j.CardErrorEvent) {
                        C13043e2.g(AbstractC6392a.INSTANCE.c(((Z.j.CardErrorEvent) jVar).getRetrofitException().c(this.f118973f)), this.f118973f);
                        Unit unit2 = Unit.f143329a;
                    } else if (jVar instanceof Z.j.d) {
                        com.meijer.mobile.meijer.activity.checkout.review.z1 z1VarZ3 = this.f118971d.z3();
                        PaymentOption paymentOptionE = this.f118971d.y3().Z().getValue().getPaymentOptions().k().e();
                        if (paymentOptionE == null) {
                            paymentOptionE = new PaymentOption(null, null, null, null, null, false, null, null, null, null, false, null, null, 8191, null);
                        }
                        z1VarZ3.r0(new z1.h.UpdatePaymentDetails(new MultiTenderPaymentOption(paymentOptionE, this.f118971d.y3().Z().getValue().getEbtPaymentOption())));
                        Unit unit3 = Unit.f143329a;
                    } else if (jVar instanceof Z.j.ShowPaymentErrorDialog) {
                        Z.j.ShowPaymentErrorDialog showPaymentErrorDialog = (Z.j.ShowPaymentErrorDialog) jVar;
                        C15485b message = new C15485b(this.f118973f).setTitle(showPaymentErrorDialog.getTitle()).setMessage(showPaymentErrorDialog.getMessage());
                        int buttonText = showPaymentErrorDialog.getButtonText();
                        final SinglePageCheckoutActivity singlePageCheckoutActivity = this.f118971d;
                        message.setPositiveButton(buttonText, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.B1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i11) {
                                SinglePageCheckoutActivity.C13018q.a.q(singlePageCheckoutActivity, dialogInterface, i11);
                            }
                        }).show();
                    } else if (jVar instanceof Z.j.ShowEbtPinPadEvent) {
                        this.f118971d.y3().d0(new Z.i.UpdatePinPadBody(((Z.j.ShowEbtPinPadEvent) jVar).getAcculynkPostBody()));
                        Unit unit4 = Unit.f143329a;
                    } else if (jVar instanceof Z.j.ShowEBTCheckBalanceLimitReached) {
                        Z.j.ShowEBTCheckBalanceLimitReached showEBTCheckBalanceLimitReached = (Z.j.ShowEBTCheckBalanceLimitReached) jVar;
                        AbstractC6392a errorTitle = showEBTCheckBalanceLimitReached.getErrorTitle();
                        String strB5 = showEBTCheckBalanceLimitReached.getErrorMessage().b(this.f118973f);
                        Context context = this.f118973f;
                        final SinglePageCheckoutActivity singlePageCheckoutActivity2 = this.f118971d;
                        C13043e2.j(errorTitle, strB5, context, new Function1() { // from class: com.meijer.mobile.singlepagecheckout.C1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return SinglePageCheckoutActivity.C13018q.a.r(singlePageCheckoutActivity2, (DialogInterface) obj2);
                            }
                        }, null, null, null, AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f101214u4, new Object[0]).b(this.f118973f), true, 112, null);
                        Unit unit5 = Unit.f143329a;
                    } else {
                        if (!(jVar instanceof Z.j.h)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        boolean zE = Intrinsics.e(this.f118971d.y3().Z().getValue().getEbtErrorDialogDecorator().getErrorCode().getValue(), Hm.a.f13715k.getValue());
                        AbstractC6392a title = this.f118971d.y3().Z().getValue().getEbtErrorDialogDecorator().getTitle();
                        if (this.f118971d.y3().Z().getValue().getEbtErrorDialogDecorator().getInSufficientBalanceStatus()) {
                            strB = this.f118971d.y3().Z().getValue().getEbtErrorDialogDecorator().getMessage().b(this.f118973f) + this.f118971d.y3().Z().getValue().getEbtErrorDialogDecorator().getInSufficientMessage().b(this.f118973f);
                        } else {
                            strB = this.f118971d.y3().Z().getValue().getEbtErrorDialogDecorator().getMessage().b(this.f118973f);
                        }
                        String str = strB;
                        if (zE) {
                            final SinglePageCheckoutActivity singlePageCheckoutActivity3 = this.f118971d;
                            function1 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.D1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return SinglePageCheckoutActivity.C13018q.a.s(singlePageCheckoutActivity3, (DialogInterface) obj2);
                                }
                            };
                            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
                            strB2 = companion.d(com.meijer.mobile.meijer.Y.f100486Ih, new Object[0]).b(this.f118973f);
                            strB3 = companion.d(com.meijer.mobile.meijer.Y.f101031l1, new Object[0]).b(this.f118973f);
                            final SinglePageCheckoutActivity singlePageCheckoutActivity4 = this.f118971d;
                            function12 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.E1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return SinglePageCheckoutActivity.C13018q.a.t(singlePageCheckoutActivity4, (DialogInterface) obj2);
                                }
                            };
                        } else {
                            final SinglePageCheckoutActivity singlePageCheckoutActivity5 = this.f118971d;
                            function1 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.F1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return SinglePageCheckoutActivity.C13018q.a.u(singlePageCheckoutActivity5, (DialogInterface) obj2);
                                }
                            };
                            strB2 = AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f101031l1, new Object[0]).b(this.f118973f);
                            strB3 = "";
                            function12 = null;
                        }
                        C13043e2.j(title, str, this.f118973f, function1, function12, null, strB3, strB2, true, 32, null);
                        Unit unit6 = Unit.f143329a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void q(SinglePageCheckoutActivity singlePageCheckoutActivity, DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
                singlePageCheckoutActivity.y3().d0(Z.i.l.f104604a);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(SinglePageCheckoutActivity singlePageCheckoutActivity, DialogInterface dialogInterface) {
                singlePageCheckoutActivity.y3().d0(new Z.i.SetIsProcessingEbtPanResponse(false));
                dialogInterface.dismiss();
                singlePageCheckoutActivity.y3().d0(Z.i.c.f104591a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit s(SinglePageCheckoutActivity singlePageCheckoutActivity, DialogInterface dialogInterface) {
                String token;
                dialogInterface.dismiss();
                com.meijer.mobile.meijer.activity.checkout.payment.Z zY3 = singlePageCheckoutActivity.y3();
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
                zY3.d0(new Z.i.ShowEbtPinPad(token, cardExpiration, true));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit t(SinglePageCheckoutActivity singlePageCheckoutActivity, DialogInterface dialogInterface) {
                dialogInterface.dismiss();
                singlePageCheckoutActivity.y3().d0(Z.i.c.f104591a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit u(SinglePageCheckoutActivity singlePageCheckoutActivity, DialogInterface dialogInterface) {
                dialogInterface.dismiss();
                singlePageCheckoutActivity.y3().d0(Z.i.c.f104591a);
                return Unit.f143329a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SinglePageCheckoutActivity.this.new C13018q(this.f118964c, this.f118965d, this.f118966e, this.f118967f, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13018q(InterfaceC15783O interfaceC15783O, C18029o1 c18029o1, Context context, C17959M0 c17959m0, Continuation<? super C13018q> continuation) {
            super(2, continuation);
            this.f118964c = interfaceC15783O;
            this.f118965d = c18029o1;
            this.f118966e = context;
            this.f118967f = c17959m0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C13018q) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f118962a == 0) {
                ResultKt.b(obj);
                C16563h.J(C16563h.O(SinglePageCheckoutActivity.this.y3().W().b(), new a(this.f118964c, SinglePageCheckoutActivity.this, this.f118965d, this.f118966e, this.f118967f, null)), C6173t.a(SinglePageCheckoutActivity.this));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObservePaymentEvents$3$1", f = "SinglePageCheckoutActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$r, reason: case insensitive filesystem */
    static final class C13019r extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f118979a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f118981c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C17959M0 f118982d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h;", "effect", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObservePaymentEvents$3$1$1", f = "SinglePageCheckoutActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$r$a */
        static final class a extends SuspendLambda implements Function2<r.h, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f118983a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f118984b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ SinglePageCheckoutActivity f118985c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f118986d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C17959M0 f118987e;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObservePaymentEvents$3$1$1$1", f = "SinglePageCheckoutActivity.kt", l = {1326}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$r$a$a, reason: collision with other inner class name */
            static final class C1920a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f118988a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17959M0 f118989b;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1920a(this.f118989b, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1920a(C17959M0 c17959m0, Continuation<? super C1920a> continuation) {
                    super(2, continuation);
                    this.f118989b = c17959m0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C1920a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f118988a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17959M0 c17959m0 = this.f118989b;
                        this.f118988a = 1;
                        if (c17959m0.i(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f118985c, this.f118986d, this.f118987e, continuation);
                aVar.f118984b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(r.h hVar, Continuation<? super Unit> continuation) {
                return ((a) create(hVar, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SinglePageCheckoutActivity singlePageCheckoutActivity, InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f118985c = singlePageCheckoutActivity;
                this.f118986d = interfaceC15783O;
                this.f118987e = c17959m0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Resources.NotFoundException, IOException {
                IntrinsicsKt.f();
                if (this.f118983a == 0) {
                    ResultKt.b(obj);
                    r.h hVar = (r.h) this.f118984b;
                    if (hVar instanceof r.h.a) {
                        if (this.f118985c.z3().h0().getValue().booleanValue()) {
                            C15809k.d(this.f118986d, null, null, new C1920a(this.f118987e, null), 3, null);
                            this.f118985c.z3().r0(z1.h.e.f105973a);
                            this.f118985c.z3().r0(z1.h.l.f105980a);
                            this.f118985c.z3().F0(true);
                        } else {
                            this.f118985c.y3().d0(Z.i.j.f104602a);
                        }
                    } else if (hVar instanceof r.h.ShowErrorState) {
                        if (this.f118985c.z3().h0().getValue().booleanValue()) {
                            this.f118985c.z3().r0(z1.h.C1539h.f105976a);
                            r.h.ShowErrorState showErrorState = (r.h.ShowErrorState) hVar;
                            String errorCode = showErrorState.getErrorCode();
                            if (errorCode != null && errorCode.length() != 0) {
                                String errorMessage = showErrorState.getErrorMessage();
                                if (errorMessage != null) {
                                    this.f118985c.z3().r0(new z1.h.TrackEBTErrorAnalytics(errorMessage));
                                }
                                Hm.a aVarA = Hm.a.INSTANCE.a(showErrorState.getErrorCode());
                                SinglePageCheckoutActivity singlePageCheckoutActivity = this.f118985c;
                                String string = singlePageCheckoutActivity.getResources().getString(aVarA.getHeaderResourceId());
                                Intrinsics.i(string, "getString(...)");
                                String string2 = this.f118985c.getResources().getString(aVarA.getMessageResourceId());
                                Intrinsics.i(string2, "getString(...)");
                                singlePageCheckoutActivity.R3(string, string2);
                            } else if (!this.f118985c.E3().getTimerRunningStatus()) {
                                this.f118985c.Z3();
                            }
                        } else {
                            r.h.ShowErrorState showErrorState2 = (r.h.ShowErrorState) hVar;
                            this.f118985c.y3().d0(new Z.i.EBTErrorResponseHandler(showErrorState2.getErrorCode(), showErrorState2.getErrorMessage(), showErrorState2.getEbtBalance()));
                            this.f118985c.y3().d0(Z.i.j.f104602a);
                        }
                    } else if (hVar instanceof r.h.HandlePinPadSuccess) {
                        if (!this.f118985c.z3().h0().getValue().booleanValue()) {
                            this.f118985c.K3(((r.h.HandlePinPadSuccess) hVar).getEbtBalance());
                        } else {
                            this.f118985c.E3().g();
                            this.f118985c.z3().r0(z1.h.i.f105977a);
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SinglePageCheckoutActivity.this.new C13019r(this.f118981c, this.f118982d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13019r(InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, Continuation<? super C13019r> continuation) {
            super(2, continuation);
            this.f118981c = interfaceC15783O;
            this.f118982d = c17959m0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C13019r) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f118979a == 0) {
                ResultKt.b(obj);
                C16563h.J(C16563h.O(SinglePageCheckoutActivity.this.D3().G().a(), new a(SinglePageCheckoutActivity.this, this.f118981c, this.f118982d, null)), C6173t.a(SinglePageCheckoutActivity.this));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$ObserveScrollEvents$1$1", f = "SinglePageCheckoutActivity.kt", l = {1079}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$s, reason: case insensitive filesystem */
    static final class C13020s extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f118990a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC16328a f118992c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC16328a f118993d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC16328a f118994e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$s$a */
        static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16328a f118995a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC16328a f118996b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC16328a f118997c;

            a(InterfaceC16328a interfaceC16328a, InterfaceC16328a interfaceC16328a2, InterfaceC16328a interfaceC16328a3) {
                this.f118995a = interfaceC16328a;
                this.f118996b = interfaceC16328a2;
                this.f118997c = interfaceC16328a3;
            }

            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(D0 d02, Continuation<? super Unit> continuation) {
                if (Intrinsics.e(d02, E0.f118668a)) {
                    Object objA = InterfaceC16328a.a(this.f118995a, null, continuation, 1, null);
                    return objA == IntrinsicsKt.f() ? objA : Unit.f143329a;
                }
                if (Intrinsics.e(d02, G0.f118716a)) {
                    Object objA2 = InterfaceC16328a.a(this.f118996b, null, continuation, 1, null);
                    return objA2 == IntrinsicsKt.f() ? objA2 : Unit.f143329a;
                }
                if (!Intrinsics.e(d02, F0.f118673a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objA3 = InterfaceC16328a.a(this.f118997c, null, continuation, 1, null);
                return objA3 == IntrinsicsKt.f() ? objA3 : Unit.f143329a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SinglePageCheckoutActivity.this.new C13020s(this.f118992c, this.f118993d, this.f118994e, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13020s(InterfaceC16328a interfaceC16328a, InterfaceC16328a interfaceC16328a2, InterfaceC16328a interfaceC16328a3, Continuation<? super C13020s> continuation) {
            super(2, continuation);
            this.f118992c = interfaceC16328a;
            this.f118993d = interfaceC16328a2;
            this.f118994e = interfaceC16328a3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C13020s) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f118990a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                InterfaceC16553F<D0> interfaceC16553FJ0 = SinglePageCheckoutActivity.this.z3().j0();
                a aVar = new a(this.f118992c, this.f118993d, this.f118994e);
                this.f118990a = 1;
                if (interfaceC16553FJ0.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$t, reason: case insensitive filesystem */
    public /* synthetic */ class C13021t {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC13024a.values().length];
            try {
                iArr[EnumC13024a.f119131b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13024a.f119132c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC13024a.f119136g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC13024a.f119137h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC13024a.f119138i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC13024a.f119134e.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC13024a.f119133d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC13024a.f119135f.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC13024a.f119130a.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC13024a.f119139j.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC13024a.f119141l.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC13024a.f119140k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$u, reason: case insensitive filesystem */
    static final class C13022u implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$u$a */
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SinglePageCheckoutActivity f118999a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f119000b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C17959M0 f119001c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C18029o1 f119002d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC16328a f119003e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC16328a f119004f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC16328a f119005g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<EnumC13024a> f119006h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ C17993c1 f119007i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f119008j;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$u$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1921a extends FunctionReferenceImpl implements Function1<EnumC13024a, Unit> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC15783O f119009b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C17959M0 f119010c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<EnumC13024a> f119011d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1921a(InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, InterfaceC5872l0<EnumC13024a> interfaceC5872l0) {
                    super(1, Intrinsics.Kotlin.class, "openSheet", "invoke$openSheet(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material/ModalBottomSheetState;Landroidx/compose/runtime/MutableState;Lcom/meijer/mobile/singlepagecheckout/BottomSheetType;)V", 0);
                    this.f119009b = interfaceC15783O;
                    this.f119010c = c17959m0;
                    this.f119011d = interfaceC5872l0;
                }

                public final void a(EnumC13024a p02) {
                    Intrinsics.j(p02, "p0");
                    C13022u.l(this.f119009b, this.f119010c, this.f119011d, p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(EnumC13024a enumC13024a) {
                    a(enumC13024a);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$u$a$b */
            /* synthetic */ class b extends FunctionReferenceImpl implements Function1<EnumC13024a, Unit> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC15783O f119012b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C17959M0 f119013c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<EnumC13024a> f119014d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, InterfaceC5872l0<EnumC13024a> interfaceC5872l0) {
                    super(1, Intrinsics.Kotlin.class, "openSheet", "invoke$openSheet(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material/ModalBottomSheetState;Landroidx/compose/runtime/MutableState;Lcom/meijer/mobile/singlepagecheckout/BottomSheetType;)V", 0);
                    this.f119012b = interfaceC15783O;
                    this.f119013c = c17959m0;
                    this.f119014d = interfaceC5872l0;
                }

                public final void a(EnumC13024a p02) {
                    Intrinsics.j(p02, "p0");
                    C13022u.l(this.f119012b, this.f119013c, this.f119014d, p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(EnumC13024a enumC13024a) {
                    a(enumC13024a);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$u$a$c */
            /* synthetic */ class c extends FunctionReferenceImpl implements Function1<EnumC13024a, Unit> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC15783O f119015b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C17959M0 f119016c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<EnumC13024a> f119017d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, InterfaceC5872l0<EnumC13024a> interfaceC5872l0) {
                    super(1, Intrinsics.Kotlin.class, "openSheet", "invoke$openSheet(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material/ModalBottomSheetState;Landroidx/compose/runtime/MutableState;Lcom/meijer/mobile/singlepagecheckout/BottomSheetType;)V", 0);
                    this.f119015b = interfaceC15783O;
                    this.f119016c = c17959m0;
                    this.f119017d = interfaceC5872l0;
                }

                public final void a(EnumC13024a p02) {
                    Intrinsics.j(p02, "p0");
                    C13022u.l(this.f119015b, this.f119016c, this.f119017d, p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(EnumC13024a enumC13024a) {
                    a(enumC13024a);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$u$a$d */
            static final class d implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C17993c1 f119018a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f119019b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ SinglePageCheckoutActivity f119020c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C18029o1 f119021d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC15783O f119022e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ C17959M0 f119023f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.z1<Z.PaymentOptionsViewState> f119024g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Function1<Qq.o, Unit> f119025h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ InterfaceC16328a f119026i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ InterfaceC16328a f119027j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ InterfaceC16328a f119028k;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<EnumC13024a> f119029l;

                /* renamed from: m, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.z1<FulfillmentSlotsViewState> f119030m;

                /* renamed from: n, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f119031n;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$u$a$d$a, reason: collision with other inner class name */
                static final class C1922a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f119032a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ SinglePageCheckoutActivity f119033b;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$u$a$d$a$a, reason: collision with other inner class name */
                    static final class C1923a implements Function2<Composer, Integer, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f119034a;

                        C1923a(LocalThemeScope localThemeScope) {
                            this.f119034a = localThemeScope;
                        }

                        public final void a(Composer composer, int i10) {
                            if ((i10 & 3) == 2 && composer.j()) {
                                composer.K();
                                return;
                            }
                            if (ComposerKt.M()) {
                                ComposerKt.U(1622422611, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SinglePageCheckoutActivity.kt:324)");
                            }
                            Dr.g.g(this.f119034a, C16338g.c(C17284b.f163348t0, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

                    public final void b(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-952073965, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SinglePageCheckoutActivity.kt:322)");
                        }
                        AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(Cj.o.f5080p, new Object[0]);
                        C.f.d dVar = C.f.d.f17051e;
                        LocalThemeScope localThemeScope = this.f119032a;
                        ComposableLambda composableLambdaC = ComposableLambdaKt.c(1622422611, true, new C1923a(localThemeScope), composer, 54);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f119033b);
                        final SinglePageCheckoutActivity singlePageCheckoutActivity = this.f119033b;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.K1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SinglePageCheckoutActivity.C13022u.a.d.C1922a.c(singlePageCheckoutActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, dVar, 0.0f, false, abstractC6392aD, composer, LocalThemeScope.f17314g | 24576 | (C.f.d.f17052f << 18) | (AbstractC6392a.f60445b << 27), 199);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    C1922a(LocalThemeScope localThemeScope, SinglePageCheckoutActivity singlePageCheckoutActivity) {
                        this.f119032a = localThemeScope;
                        this.f119033b = singlePageCheckoutActivity;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        b(composer, num.intValue());
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(SinglePageCheckoutActivity singlePageCheckoutActivity) throws IOException {
                        if (singlePageCheckoutActivity.z3().getShowEbtEnterPinLoadingScreen()) {
                            singlePageCheckoutActivity.z3().r0(z1.h.x.f105995a);
                        } else if (singlePageCheckoutActivity.z3().h0().getValue().booleanValue()) {
                            singlePageCheckoutActivity.P3();
                        } else {
                            singlePageCheckoutActivity.finish();
                        }
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$u$a$d$b */
                static final class b implements Function3<C18029o1, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ C18029o1 f119035a;

                    b(C18029o1 c18029o1) {
                        this.f119035a = c18029o1;
                    }

                    public final void a(C18029o1 it, Composer composer, int i10) {
                        Intrinsics.j(it, "it");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1535851935, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SinglePageCheckoutActivity.kt:319)");
                        }
                        C18026n1.b(this.f119035a, null, null, composer, 6, 6);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(C18029o1 c18029o1, Composer composer, Integer num) {
                        a(c18029o1, composer, num.intValue());
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$u$a$d$c */
                static final class c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ SinglePageCheckoutActivity f119036a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ InterfaceC15783O f119037b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ C17959M0 f119038c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.runtime.z1<Z.PaymentOptionsViewState> f119039d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f119040e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ Function1<Qq.o, Unit> f119041f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ InterfaceC16328a f119042g;

                    /* renamed from: h, reason: collision with root package name */
                    final /* synthetic */ InterfaceC16328a f119043h;

                    /* renamed from: i, reason: collision with root package name */
                    final /* synthetic */ InterfaceC16328a f119044i;

                    /* renamed from: j, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5872l0<EnumC13024a> f119045j;

                    /* renamed from: k, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.runtime.z1<FulfillmentSlotsViewState> f119046k;

                    /* renamed from: l, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5872l0<Boolean> f119047l;

                    /* JADX WARN: Multi-variable type inference failed */
                    c(SinglePageCheckoutActivity singlePageCheckoutActivity, InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, androidx.compose.runtime.z1<Z.PaymentOptionsViewState> z1Var, LocalThemeScope localThemeScope, Function1<? super Qq.o, Unit> function1, InterfaceC16328a interfaceC16328a, InterfaceC16328a interfaceC16328a2, InterfaceC16328a interfaceC16328a3, InterfaceC5872l0<EnumC13024a> interfaceC5872l0, androidx.compose.runtime.z1<FulfillmentSlotsViewState> z1Var2, InterfaceC5872l0<Boolean> interfaceC5872l02) {
                        this.f119036a = singlePageCheckoutActivity;
                        this.f119037b = interfaceC15783O;
                        this.f119038c = c17959m0;
                        this.f119039d = z1Var;
                        this.f119040e = localThemeScope;
                        this.f119041f = function1;
                        this.f119042g = interfaceC16328a;
                        this.f119043h = interfaceC16328a2;
                        this.f119044i = interfaceC16328a3;
                        this.f119045j = interfaceC5872l0;
                        this.f119046k = z1Var2;
                        this.f119047l = interfaceC5872l02;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit A(InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, InterfaceC5872l0 interfaceC5872l0) {
                        C13022u.l(interfaceC15783O, c17959m0, interfaceC5872l0, EnumC13024a.f119132c);
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit B(SinglePageCheckoutActivity singlePageCheckoutActivity, androidx.compose.runtime.z1 z1Var, InterfaceC5872l0 interfaceC5872l0, String it) {
                        Intrinsics.j(it, "it");
                        if (a.l(z1Var).s().isEmpty()) {
                            AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100911f0, new Object[0]);
                            String string = singlePageCheckoutActivity.getString(com.meijer.mobile.meijer.Y.f100891e0);
                            Function1 function1 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.P1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SinglePageCheckoutActivity.C13022u.a.d.c.C((DialogInterface) obj);
                                }
                            };
                            String string2 = singlePageCheckoutActivity.getString(yr.Q.f171761b);
                            Intrinsics.i(string2, "getString(...)");
                            C13043e2.j(abstractC6392aD, string, singlePageCheckoutActivity, function1, null, null, null, string2, true, 112, null);
                        } else if (a.l(z1Var).getPaymentOptions().k().getIsValid()) {
                            singlePageCheckoutActivity.y3().d0(Z.i.k.f104603a);
                        } else {
                            C13022u.k(interfaceC5872l0, true);
                        }
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit C(DialogInterface dialog) {
                        Intrinsics.j(dialog, "dialog");
                        dialog.dismiss();
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit F(InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, InterfaceC5872l0 interfaceC5872l0) {
                        C13022u.l(interfaceC15783O, c17959m0, interfaceC5872l0, EnumC13024a.f119139j);
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit G(InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, InterfaceC5872l0 interfaceC5872l0) {
                        C13022u.l(interfaceC15783O, c17959m0, interfaceC5872l0, EnumC13024a.f119133d);
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit H(InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, InterfaceC5872l0 interfaceC5872l0) {
                        C13022u.l(interfaceC15783O, c17959m0, interfaceC5872l0, EnumC13024a.f119134e);
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit u(InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, InterfaceC5872l0 interfaceC5872l0) {
                        C13022u.l(interfaceC15783O, c17959m0, interfaceC5872l0, EnumC13024a.f119133d);
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit v(SinglePageCheckoutActivity singlePageCheckoutActivity) {
                        singlePageCheckoutActivity.startActivity(Bl.b.f3120a.a(singlePageCheckoutActivity));
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit w(InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, InterfaceC5872l0 interfaceC5872l0) {
                        C13022u.l(interfaceC15783O, c17959m0, interfaceC5872l0, EnumC13024a.f119141l);
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit x(final SinglePageCheckoutActivity singlePageCheckoutActivity) {
                        AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100325Ad, new Object[0]);
                        String string = singlePageCheckoutActivity.getString(com.meijer.mobile.meijer.Y.f101323zd);
                        String string2 = singlePageCheckoutActivity.getString(com.meijer.mobile.meijer.Y.f101263wd);
                        Intrinsics.i(string2, "getString(...)");
                        String string3 = singlePageCheckoutActivity.getString(com.meijer.mobile.meijer.Y.f101243vd);
                        Intrinsics.i(string3, "getString(...)");
                        C13043e2.j(abstractC6392aD, string, singlePageCheckoutActivity, new Function1() { // from class: com.meijer.mobile.singlepagecheckout.N1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SinglePageCheckoutActivity.C13022u.a.d.c.y(singlePageCheckoutActivity, (DialogInterface) obj);
                            }
                        }, new Function1() { // from class: com.meijer.mobile.singlepagecheckout.O1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SinglePageCheckoutActivity.C13022u.a.d.c.z((DialogInterface) obj);
                            }
                        }, null, string3, string2, true, 32, null);
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit y(SinglePageCheckoutActivity singlePageCheckoutActivity, DialogInterface dialog) {
                        Intrinsics.j(dialog, "dialog");
                        dialog.dismiss();
                        singlePageCheckoutActivity.y3().d0(Z.i.m.f104605a);
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit z(DialogInterface dialog) {
                        Intrinsics.j(dialog, "dialog");
                        dialog.dismiss();
                        return Unit.f143329a;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) throws IOException {
                        t(interfaceC14882C, composer, num.intValue());
                        return Unit.f143329a;
                    }

                    public final void t(InterfaceC14882C contentPadding, Composer composer, int i10) throws IOException {
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
                        InterfaceC5872l0 interfaceC5872l0 = this.f119036a.modalToShow;
                        InterfaceC5872l0 interfaceC5872l02 = null;
                        if (interfaceC5872l0 == null) {
                            Intrinsics.x("modalToShow");
                            interfaceC5872l0 = null;
                        }
                        Ij.d dVar = (Ij.d) interfaceC5872l0.getValue();
                        composer.startReplaceGroup(1573103161);
                        if (dVar != null) {
                            Ij.g.b(this.f119040e, dVar, composer, LocalThemeScope.f17314g | (Ij.d.f14809i << 3));
                            Unit unit = Unit.f143329a;
                        }
                        composer.P();
                        Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, contentPadding);
                        boolean zE = this.f119036a.getFeatureManager().e(AbstractC18503f.C18511i.f172882h);
                        boolean zE2 = this.f119036a.getFeatureManager().e(AbstractC18503f.i0.f172883h);
                        boolean zE3 = this.f119036a.getFeatureManager().e(AbstractC18503f.C18513k.f172886h);
                        com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1 q1VarG3 = this.f119036a.G3();
                        boolean zL3 = this.f119036a.L3();
                        composer.startReplaceGroup(-1746271574);
                        boolean zD = composer.D(this.f119037b) | composer.D(this.f119038c);
                        final InterfaceC15783O interfaceC15783O = this.f119037b;
                        final C17959M0 c17959m0 = this.f119038c;
                        final InterfaceC5872l0<EnumC13024a> interfaceC5872l03 = this.f119045j;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.L1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SinglePageCheckoutActivity.C13022u.a.d.c.A(interfaceC15783O, c17959m0, interfaceC5872l03);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        FulfillmentSlotsCardDecorator fulfillmentSlotsCardDecorator = new FulfillmentSlotsCardDecorator(zE, zE3, zE2, q1VarG3, zL3, null, (Function0) objB, 32, null);
                        com.meijer.mobile.meijer.activity.checkout.contactinformation.H hB3 = this.f119036a.B3();
                        C12057p c12057pH3 = this.f119036a.H3();
                        boolean zL32 = this.f119036a.L3();
                        boolean zE4 = Intrinsics.e(a.s(this.f119046k).getFulfillmentMode(), "pickup");
                        composer.startReplaceGroup(-1746271574);
                        boolean zD2 = composer.D(this.f119037b) | composer.D(this.f119038c);
                        final InterfaceC15783O interfaceC15783O2 = this.f119037b;
                        final C17959M0 c17959m02 = this.f119038c;
                        final InterfaceC5872l0<EnumC13024a> interfaceC5872l04 = this.f119045j;
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.R1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SinglePageCheckoutActivity.C13022u.a.d.c.F(interfaceC15783O2, c17959m02, interfaceC5872l04);
                                }
                            };
                            composer.t(objB2);
                        }
                        composer.P();
                        C13065l c13065l = new C13065l(c12057pH3, hB3, zL32, zE4, (Function0) objB2);
                        C13032c c13032cA3 = this.f119036a.A3();
                        com.meijer.mobile.meijer.activity.checkout.payment.Z zY3 = this.f119036a.y3();
                        composer.startReplaceGroup(-1746271574);
                        boolean zD3 = composer.D(this.f119037b) | composer.D(this.f119038c);
                        final InterfaceC15783O interfaceC15783O3 = this.f119037b;
                        final C17959M0 c17959m03 = this.f119038c;
                        final InterfaceC5872l0<EnumC13024a> interfaceC5872l05 = this.f119045j;
                        Object objB3 = composer.B();
                        if (zD3 || objB3 == Composer.INSTANCE.a()) {
                            objB3 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.S1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SinglePageCheckoutActivity.C13022u.a.d.c.G(interfaceC15783O3, c17959m03, interfaceC5872l05);
                                }
                            };
                            composer.t(objB3);
                        }
                        Function0 function0 = (Function0) objB3;
                        composer.P();
                        composer.startReplaceGroup(-1746271574);
                        boolean zD4 = composer.D(this.f119037b) | composer.D(this.f119038c);
                        final InterfaceC15783O interfaceC15783O4 = this.f119037b;
                        final C17959M0 c17959m04 = this.f119038c;
                        final InterfaceC5872l0<EnumC13024a> interfaceC5872l06 = this.f119045j;
                        Object objB4 = composer.B();
                        if (zD4 || objB4 == Composer.INSTANCE.a()) {
                            objB4 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.T1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SinglePageCheckoutActivity.C13022u.a.d.c.H(interfaceC15783O4, c17959m04, interfaceC5872l06);
                                }
                            };
                            composer.t(objB4);
                        }
                        Function0 function02 = (Function0) objB4;
                        composer.P();
                        composer.startReplaceGroup(-1746271574);
                        boolean zD5 = composer.D(this.f119037b) | composer.D(this.f119038c);
                        final InterfaceC15783O interfaceC15783O5 = this.f119037b;
                        final C17959M0 c17959m05 = this.f119038c;
                        final InterfaceC5872l0<EnumC13024a> interfaceC5872l07 = this.f119045j;
                        Object objB5 = composer.B();
                        if (zD5 || objB5 == Composer.INSTANCE.a()) {
                            objB5 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.U1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SinglePageCheckoutActivity.C13022u.a.d.c.u(interfaceC15783O5, c17959m05, interfaceC5872l07);
                                }
                            };
                            composer.t(objB5);
                        }
                        Function0 function03 = (Function0) objB5;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD6 = composer.D(this.f119036a);
                        final SinglePageCheckoutActivity singlePageCheckoutActivity = this.f119036a;
                        Object objB6 = composer.B();
                        if (zD6 || objB6 == Composer.INSTANCE.a()) {
                            objB6 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.V1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SinglePageCheckoutActivity.C13022u.a.d.c.v(singlePageCheckoutActivity);
                                }
                            };
                            composer.t(objB6);
                        }
                        Function0 function04 = (Function0) objB6;
                        composer.P();
                        composer.startReplaceGroup(-1746271574);
                        boolean zD7 = composer.D(this.f119037b) | composer.D(this.f119038c);
                        final InterfaceC15783O interfaceC15783O6 = this.f119037b;
                        final C17959M0 c17959m06 = this.f119038c;
                        final InterfaceC5872l0<EnumC13024a> interfaceC5872l08 = this.f119045j;
                        Object objB7 = composer.B();
                        if (zD7 || objB7 == Composer.INSTANCE.a()) {
                            objB7 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.W1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SinglePageCheckoutActivity.C13022u.a.d.c.w(interfaceC15783O6, c17959m06, interfaceC5872l08);
                                }
                            };
                            composer.t(objB7);
                        }
                        Function0 function05 = (Function0) objB7;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD8 = composer.D(this.f119036a);
                        final SinglePageCheckoutActivity singlePageCheckoutActivity2 = this.f119036a;
                        Object objB8 = composer.B();
                        if (zD8 || objB8 == Composer.INSTANCE.a()) {
                            objB8 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.X1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SinglePageCheckoutActivity.C13022u.a.d.c.x(singlePageCheckoutActivity2);
                                }
                            };
                            composer.t(objB8);
                        }
                        Function0 function06 = (Function0) objB8;
                        composer.P();
                        composer.startReplaceGroup(-1746271574);
                        boolean zV = composer.V(this.f119039d) | composer.D(this.f119036a);
                        final SinglePageCheckoutActivity singlePageCheckoutActivity3 = this.f119036a;
                        final androidx.compose.runtime.z1<Z.PaymentOptionsViewState> z1Var = this.f119039d;
                        final InterfaceC5872l0<Boolean> interfaceC5872l09 = this.f119047l;
                        Object objB9 = composer.B();
                        if (zV || objB9 == Composer.INSTANCE.a()) {
                            objB9 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.Y1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SinglePageCheckoutActivity.C13022u.a.d.c.B(singlePageCheckoutActivity3, z1Var, interfaceC5872l09, (String) obj);
                                }
                            };
                            composer.t(objB9);
                        }
                        composer.P();
                        Rq.N n10 = new Rq.N(zY3, function0, function02, function03, function04, function05, function06, (Function1) objB9);
                        boolean zL33 = this.f119036a.L3();
                        com.meijer.mobile.meijer.activity.checkout.review.z1 z1VarZ3 = this.f119036a.z3();
                        boolean zE5 = this.f119036a.getFeatureManager().e(AbstractC18503f.y0.f172915h);
                        InterfaceC5872l0 interfaceC5872l010 = this.f119036a.displayCheckoutAnimations;
                        if (interfaceC5872l010 == null) {
                            Intrinsics.x("displayCheckoutAnimations");
                        } else {
                            interfaceC5872l02 = interfaceC5872l010;
                        }
                        com.meijer.mobile.meijer.activity.cart.entrynote.i iVarF3 = this.f119036a.F3();
                        LocalThemeScope localThemeScope = this.f119040e;
                        InterfaceC5872l0 interfaceC5872l011 = interfaceC5872l02;
                        Function1<Qq.o, Unit> function1 = this.f119041f;
                        composer.startReplaceGroup(5004770);
                        boolean zD9 = composer.D(this.f119036a);
                        final SinglePageCheckoutActivity singlePageCheckoutActivity4 = this.f119036a;
                        Object objB10 = composer.B();
                        if (zD9 || objB10 == Composer.INSTANCE.a()) {
                            objB10 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.M1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SinglePageCheckoutActivity.C13022u.a.d.c.D(singlePageCheckoutActivity4);
                                }
                            };
                            composer.t(objB10);
                        }
                        Function0 function07 = (Function0) objB10;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD10 = composer.D(this.f119036a);
                        final SinglePageCheckoutActivity singlePageCheckoutActivity5 = this.f119036a;
                        Object objB11 = composer.B();
                        if (zD10 || objB11 == Composer.INSTANCE.a()) {
                            objB11 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.Q1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SinglePageCheckoutActivity.C13022u.a.d.c.E(singlePageCheckoutActivity5);
                                }
                            };
                            composer.t(objB11);
                        }
                        composer.P();
                        A2.I(localThemeScope, fulfillmentSlotsCardDecorator, n10, c13065l, c13032cA3, z1VarZ3, zL33, zE5, iVarF3, modifierH, interfaceC5872l011, function1, function07, (Function0) objB11, this.f119042g, this.f119043h, this.f119044i, composer, LocalThemeScope.f17314g, 0, 0);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit D(SinglePageCheckoutActivity singlePageCheckoutActivity) {
                        singlePageCheckoutActivity.M3();
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit E(SinglePageCheckoutActivity singlePageCheckoutActivity) {
                        singlePageCheckoutActivity.N3(singlePageCheckoutActivity.z3().g0().c().getValue().getSubstitutionPreference());
                        return Unit.f143329a;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                d(C17993c1 c17993c1, LocalThemeScope localThemeScope, SinglePageCheckoutActivity singlePageCheckoutActivity, C18029o1 c18029o1, InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, androidx.compose.runtime.z1<Z.PaymentOptionsViewState> z1Var, Function1<? super Qq.o, Unit> function1, InterfaceC16328a interfaceC16328a, InterfaceC16328a interfaceC16328a2, InterfaceC16328a interfaceC16328a3, InterfaceC5872l0<EnumC13024a> interfaceC5872l0, androidx.compose.runtime.z1<FulfillmentSlotsViewState> z1Var2, InterfaceC5872l0<Boolean> interfaceC5872l02) {
                    this.f119018a = c17993c1;
                    this.f119019b = localThemeScope;
                    this.f119020c = singlePageCheckoutActivity;
                    this.f119021d = c18029o1;
                    this.f119022e = interfaceC15783O;
                    this.f119023f = c17959m0;
                    this.f119024g = z1Var;
                    this.f119025h = function1;
                    this.f119026i = interfaceC16328a;
                    this.f119027j = interfaceC16328a2;
                    this.f119028k = interfaceC16328a3;
                    this.f119029l = interfaceC5872l0;
                    this.f119030m = z1Var2;
                    this.f119031n = interfaceC5872l02;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-746769928, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SinglePageCheckoutActivity.kt:317)");
                    }
                    C17987a1.a(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), this.f119018a, ComposableLambdaKt.c(-952073965, true, new C1922a(this.f119019b, this.f119020c), composer, 54), null, ComposableLambdaKt.c(1535851935, true, new b(this.f119021d), composer, 54), null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-869870470, true, new c(this.f119020c, this.f119022e, this.f119023f, this.f119024g, this.f119019b, this.f119025h, this.f119026i, this.f119027j, this.f119028k, this.f119029l, this.f119030m, this.f119031n), composer, 54), composer, 24960, 12582912, 131048);
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
            @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$onCreate$1$1$closeSheet$1$1$1", f = "SinglePageCheckoutActivity.kt", l = {223}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$u$a$e */
            static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f119048a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17959M0 f119049b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<EnumC13024a> f119050c;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new e(this.f119049b, this.f119050c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(C17959M0 c17959m0, InterfaceC5872l0<EnumC13024a> interfaceC5872l0, Continuation<? super e> continuation) {
                    super(2, continuation);
                    this.f119049b = c17959m0;
                    this.f119050c = interfaceC5872l0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f119048a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17959M0 c17959m0 = this.f119049b;
                        this.f119048a = 1;
                        if (c17959m0.i(this) == objF) {
                            return objF;
                        }
                    }
                    C13022u.g(this.f119050c, EnumC13024a.f119130a);
                    return Unit.f143329a;
                }
            }

            a(SinglePageCheckoutActivity singlePageCheckoutActivity, InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, C18029o1 c18029o1, InterfaceC16328a interfaceC16328a, InterfaceC16328a interfaceC16328a2, InterfaceC16328a interfaceC16328a3, InterfaceC5872l0<EnumC13024a> interfaceC5872l0, C17993c1 c17993c1, InterfaceC5872l0<Boolean> interfaceC5872l02) {
                this.f118999a = singlePageCheckoutActivity;
                this.f119000b = interfaceC15783O;
                this.f119001c = c17959m0;
                this.f119002d = c18029o1;
                this.f119003e = interfaceC16328a;
                this.f119004f = interfaceC16328a2;
                this.f119005g = interfaceC16328a3;
                this.f119006h = interfaceC5872l0;
                this.f119007i = c17993c1;
                this.f119008j = interfaceC5872l02;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(SinglePageCheckoutActivity singlePageCheckoutActivity, final InterfaceC15783O interfaceC15783O, final C17959M0 c17959m0, final InterfaceC5872l0 interfaceC5872l0, Qq.o action) throws IOException {
                Intrinsics.j(action, "action");
                singlePageCheckoutActivity.z3().n0(action, new Function1() { // from class: com.meijer.mobile.singlepagecheckout.J1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SinglePageCheckoutActivity.C13022u.a.q(interfaceC15783O, c17959m0, interfaceC5872l0, (z1.l) obj);
                    }
                });
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit q(InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, InterfaceC5872l0 interfaceC5872l0, z1.l event) {
                Intrinsics.j(event, "event");
                if (Intrinsics.e(event, z1.l.a.f106027a)) {
                    C13022u.l(interfaceC15783O, c17959m0, interfaceC5872l0, EnumC13024a.f119136g);
                } else if (Intrinsics.e(event, z1.l.c.f106029a)) {
                    C13022u.l(interfaceC15783O, c17959m0, interfaceC5872l0, EnumC13024a.f119137h);
                } else {
                    if (!Intrinsics.e(event, z1.l.b.f106028a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C13022u.l(interfaceC15783O, c17959m0, interfaceC5872l0, EnumC13024a.f119138i);
                }
                return Unit.f143329a;
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
                boolean zD = composer.D(this.f118999a) | composer.D(this.f119000b) | composer.D(this.f119001c);
                final SinglePageCheckoutActivity singlePageCheckoutActivity = this.f118999a;
                final InterfaceC15783O interfaceC15783O = this.f119000b;
                final C17959M0 c17959m0 = this.f119001c;
                final InterfaceC5872l0<EnumC13024a> interfaceC5872l0 = this.f119006h;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.G1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SinglePageCheckoutActivity.C13022u.a.k(singlePageCheckoutActivity, interfaceC15783O, c17959m0, interfaceC5872l0);
                        }
                    };
                    composer.t(objB);
                }
                final Function0 function0 = (Function0) objB;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean zD2 = composer.D(this.f118999a) | composer.D(this.f119001c) | composer.V(function0);
                final SinglePageCheckoutActivity singlePageCheckoutActivity2 = this.f118999a;
                final C17959M0 c17959m02 = this.f119001c;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.H1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SinglePageCheckoutActivity.C13022u.a.r(singlePageCheckoutActivity2, c17959m02, function0);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                C13736d.a(false, (Function0) objB2, composer, 0, 1);
                SinglePageCheckoutActivity singlePageCheckoutActivity3 = this.f118999a;
                composer.startReplaceGroup(1849434622);
                Object objB3 = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB3 == companion.a()) {
                    objB3 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                    composer.t(objB3);
                }
                composer.P();
                singlePageCheckoutActivity3.displayCheckoutAnimations = (InterfaceC5872l0) objB3;
                SinglePageCheckoutActivity singlePageCheckoutActivity4 = this.f118999a;
                composer.startReplaceGroup(1849434622);
                Object objB4 = composer.B();
                if (objB4 == companion.a()) {
                    objB4 = androidx.compose.runtime.t1.e(null, null, 2, null);
                    composer.t(objB4);
                }
                composer.P();
                singlePageCheckoutActivity4.modalToShow = (InterfaceC5872l0) objB4;
                composer.startReplaceGroup(1849434622);
                SinglePageCheckoutActivity singlePageCheckoutActivity5 = this.f118999a;
                Object objB5 = composer.B();
                if (objB5 == companion.a()) {
                    objB5 = singlePageCheckoutActivity5.G3().a0().c();
                    composer.t(objB5);
                }
                composer.P();
                androidx.compose.runtime.z1 z1VarB = androidx.compose.runtime.o1.b((pv.P) objB5, null, composer, 0, 1);
                androidx.compose.runtime.z1 z1VarB2 = androidx.compose.runtime.o1.b(this.f118999a.x3().x(), null, composer, 0, 1);
                composer.startReplaceGroup(1849434622);
                SinglePageCheckoutActivity singlePageCheckoutActivity6 = this.f118999a;
                Object objB6 = composer.B();
                if (objB6 == companion.a()) {
                    objB6 = singlePageCheckoutActivity6.y3().W().c();
                    composer.t(objB6);
                }
                composer.P();
                androidx.compose.runtime.z1 z1VarC = S2.a.c((pv.P) objB6, null, null, null, composer, 0, 7);
                composer.startReplaceGroup(1849434622);
                SinglePageCheckoutActivity singlePageCheckoutActivity7 = this.f118999a;
                Object objB7 = composer.B();
                if (objB7 == companion.a()) {
                    objB7 = singlePageCheckoutActivity7.z3().g0().c();
                    composer.t(objB7);
                }
                composer.P();
                androidx.compose.runtime.z1 z1VarC2 = S2.a.c((pv.P) objB7, null, null, null, composer, 0, 7);
                composer.startReplaceGroup(-1224400529);
                boolean zD3 = composer.D(this.f118999a) | composer.D(this.f119000b) | composer.D(this.f119001c);
                final SinglePageCheckoutActivity singlePageCheckoutActivity8 = this.f118999a;
                final InterfaceC15783O interfaceC15783O2 = this.f119000b;
                final C17959M0 c17959m03 = this.f119001c;
                final InterfaceC5872l0<EnumC13024a> interfaceC5872l02 = this.f119006h;
                Object objB8 = composer.B();
                if (zD3 || objB8 == companion.a()) {
                    objB8 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.I1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SinglePageCheckoutActivity.C13022u.a.p(singlePageCheckoutActivity8, interfaceC15783O2, c17959m03, interfaceC5872l02, (Qq.o) obj);
                        }
                    };
                    composer.t(objB8);
                }
                Function1 function1 = (Function1) objB8;
                composer.P();
                com.meijer.mobile.accounts.ux.payments.d.t(this.f118999a.x3(), l(z1VarC).s().size() < 5 ? EnumC14533a.f135774b : EnumC14533a.f135776d, false, 2, null);
                SinglePageCheckoutActivity singlePageCheckoutActivity9 = this.f118999a;
                InterfaceC15783O interfaceC15783O3 = this.f119000b;
                composer.startReplaceGroup(-1746271574);
                boolean zD4 = composer.D(this.f119000b) | composer.D(this.f119001c);
                InterfaceC15783O interfaceC15783O4 = this.f119000b;
                C17959M0 c17959m04 = this.f119001c;
                InterfaceC5872l0<EnumC13024a> interfaceC5872l03 = this.f119006h;
                Object objB9 = composer.B();
                if (zD4 || objB9 == companion.a()) {
                    objB9 = new C1921a(interfaceC15783O4, c17959m04, interfaceC5872l03);
                    composer.t(objB9);
                }
                composer.P();
                singlePageCheckoutActivity9.H2(interfaceC15783O3, (Function1) ((KFunction) objB9), composer, 0, 0);
                SinglePageCheckoutActivity singlePageCheckoutActivity10 = this.f118999a;
                InterfaceC15783O interfaceC15783O5 = this.f119000b;
                C18029o1 c18029o1 = this.f119002d;
                C17959M0 c17959m05 = this.f119001c;
                int i12 = C17959M0.f168297e;
                singlePageCheckoutActivity10.K2(interfaceC15783O5, c18029o1, c17959m05, composer, (i12 << 6) | 48);
                this.f118999a.F2(composer, 0);
                SinglePageCheckoutActivity singlePageCheckoutActivity11 = this.f118999a;
                composer.startReplaceGroup(-1746271574);
                boolean zD5 = composer.D(this.f119000b) | composer.D(this.f119001c);
                InterfaceC15783O interfaceC15783O6 = this.f119000b;
                C17959M0 c17959m06 = this.f119001c;
                InterfaceC5872l0<EnumC13024a> interfaceC5872l04 = this.f119006h;
                Object objB10 = composer.B();
                if (zD5 || objB10 == companion.a()) {
                    objB10 = new b(interfaceC15783O6, c17959m06, interfaceC5872l04);
                    composer.t(objB10);
                }
                composer.P();
                singlePageCheckoutActivity11.C2((Function1) ((KFunction) objB10), composer, 0, 0);
                this.f118999a.M2(this.f119003e, this.f119004f, this.f119005g, composer, 0);
                EnumC13024a enumC13024aF = C13022u.f(this.f119006h);
                List<ProductCardDecorator> listB = s(z1VarB).B();
                com.meijer.mobile.accounts.ux.payments.d dVarX3 = this.f118999a.x3();
                com.meijer.mobile.meijer.activity.checkout.payment.ebt.r rVarD3 = this.f118999a.D3();
                com.meijer.mobile.meijer.activity.checkout.payment.Z zY3 = this.f118999a.y3();
                d.ViewState viewStateT = t(z1VarB2);
                Z.PaymentOptionsViewState paymentOptionsViewStateL = l(z1VarC);
                float fP = H1.h.p((int) (((androidx.compose.ui.platform.W1) composer.o(C6034t0.u())).a() & 4294967295L));
                boolean zE = Intrinsics.e(s(z1VarB).getFulfillmentMode(), "pickup");
                AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = o(z1VarC2).getAdjustEbtPaymentDecorator();
                SinglePageCheckoutActivity singlePageCheckoutActivity12 = this.f118999a;
                C17959M0 c17959m07 = this.f119001c;
                InterfaceC15783O interfaceC15783O7 = this.f119000b;
                composer.startReplaceGroup(-1746271574);
                boolean zD6 = composer.D(this.f119000b) | composer.D(this.f119001c);
                InterfaceC15783O interfaceC15783O8 = this.f119000b;
                C17959M0 c17959m08 = this.f119001c;
                InterfaceC5872l0<EnumC13024a> interfaceC5872l05 = this.f119006h;
                Object objB11 = composer.B();
                if (zD6 || objB11 == companion.a()) {
                    objB11 = new c(interfaceC15783O8, c17959m08, interfaceC5872l05);
                    composer.t(objB11);
                }
                composer.P();
                singlePageCheckoutActivity12.b2(AdsTheme, fP, enumC13024aF, c17959m07, interfaceC15783O7, listB, dVarX3, rVarD3, zY3, viewStateT, paymentOptionsViewStateL, zE, adjustEbtPaymentDecorator, (Function1) ((KFunction) objB11), ComposableLambdaKt.c(-746769928, true, new d(this.f119007i, AdsTheme, this.f118999a, this.f119002d, this.f119000b, this.f119001c, z1VarC, function1, this.f119004f, this.f119003e, this.f119005g, this.f119006h, z1VarB, this.f119008j), composer, 54), composer, LocalThemeScope.f17314g | (i11 & 14) | (i12 << 9) | (com.meijer.mobile.accounts.ux.payments.d.f95249g << 18) | (d.ViewState.f95259d << 27), (AbstractC6392a.f60445b << 6) | 24576, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                g(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final mv.C0 k(SinglePageCheckoutActivity singlePageCheckoutActivity, InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, InterfaceC5872l0 interfaceC5872l0) {
                Ds.p.d(singlePageCheckoutActivity.getWindow());
                return C15809k.d(interfaceC15783O, null, null, new e(c17959m0, interfaceC5872l0, null), 3, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Z.PaymentOptionsViewState l(androidx.compose.runtime.z1<Z.PaymentOptionsViewState> z1Var) {
                return z1Var.getValue();
            }

            private static final CheckoutViewState o(androidx.compose.runtime.z1<CheckoutViewState> z1Var) {
                return z1Var.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(SinglePageCheckoutActivity singlePageCheckoutActivity, C17959M0 c17959m0, Function0 function0) throws IOException {
                if (singlePageCheckoutActivity.z3().getShowEbtEnterPinLoadingScreen()) {
                    singlePageCheckoutActivity.z3().r0(z1.h.x.f105995a);
                } else if (singlePageCheckoutActivity.z3().h0().getValue().booleanValue()) {
                    singlePageCheckoutActivity.P3();
                } else if (c17959m0.k()) {
                    function0.invoke();
                } else {
                    singlePageCheckoutActivity.finish();
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final FulfillmentSlotsViewState s(androidx.compose.runtime.z1<FulfillmentSlotsViewState> z1Var) {
                return z1Var.getValue();
            }

            private static final d.ViewState t(androidx.compose.runtime.z1<d.ViewState> z1Var) {
                return z1Var.getValue();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$onCreate$1$openSheet$1", f = "SinglePageCheckoutActivity.kt", l = {214}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$u$b */
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f119051a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ EnumC13024a f119052b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C17959M0 f119053c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<EnumC13024a> f119054d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f119052b, this.f119053c, this.f119054d, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(EnumC13024a enumC13024a, C17959M0 c17959m0, InterfaceC5872l0<EnumC13024a> interfaceC5872l0, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f119052b = enumC13024a;
                this.f119053c = c17959m0;
                this.f119054d = interfaceC5872l0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f119051a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C13022u.g(this.f119054d, this.f119052b);
                    C17959M0 c17959m0 = this.f119053c;
                    this.f119051a = 1;
                    if (c17959m0.l(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        C13022u() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, InterfaceC5872l0<EnumC13024a> interfaceC5872l0, EnumC13024a enumC13024a) {
            C15809k.d(interfaceC15783O, null, null, new b(enumC13024a, c17959m0, interfaceC5872l0, null), 3, null);
        }

        public final void e(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-871688396, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.onCreate.<anonymous> (SinglePageCheckoutActivity.kt:195)");
            }
            C17993c1 c17993c1G = C17987a1.g(null, null, composer, 0, 3);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new C18029o1();
                composer.t(objB);
            }
            C18029o1 c18029o1 = (C18029o1) objB;
            composer.P();
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composer);
                composer.t(objB2);
            }
            InterfaceC15783O interfaceC15783O = (InterfaceC15783O) objB2;
            C17959M0 c17959m0J = C17957L0.j(EnumC17961N0.f168314a, null, null, true, composer, 3078, 6);
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = androidx.compose.foundation.relocation.b.a();
                composer.t(objB3);
            }
            InterfaceC16328a interfaceC16328a = (InterfaceC16328a) objB3;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB4 = composer.B();
            if (objB4 == companion.a()) {
                objB4 = androidx.compose.foundation.relocation.b.a();
                composer.t(objB4);
            }
            InterfaceC16328a interfaceC16328a2 = (InterfaceC16328a) objB4;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB5 = composer.B();
            if (objB5 == companion.a()) {
                objB5 = androidx.compose.foundation.relocation.b.a();
                composer.t(objB5);
            }
            InterfaceC16328a interfaceC16328a3 = (InterfaceC16328a) objB5;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB6 = composer.B();
            if (objB6 == companion.a()) {
                objB6 = androidx.compose.runtime.t1.e(EnumC13024a.f119130a, null, 2, null);
                composer.t(objB6);
            }
            InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB6;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB7 = composer.B();
            if (objB7 == companion.a()) {
                objB7 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB7);
            }
            composer.P();
            SinglePageCheckoutActivity.this.E3().k(SinglePageCheckoutActivity.this);
            Ki.K.b(null, ComposableLambdaKt.c(1698932227, true, new a(SinglePageCheckoutActivity.this, interfaceC15783O, c17959m0J, c18029o1, interfaceC16328a, interfaceC16328a2, interfaceC16328a3, interfaceC5872l0, c17993c1G, (InterfaceC5872l0) objB7), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            e(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EnumC13024a f(InterfaceC5872l0<EnumC13024a> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(InterfaceC5872l0<EnumC13024a> interfaceC5872l0, EnumC13024a enumC13024a) {
            interfaceC5872l0.setValue(enumC13024a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
            interfaceC5872l0.setValue(Boolean.valueOf(z10));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    /* renamed from: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity$v, reason: case insensitive filesystem */
    public static final class C13023v extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119055f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13023v(ComponentActivity componentActivity) {
            super(0);
            this.f119055f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f119055f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class w extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119056f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ComponentActivity componentActivity) {
            super(0);
            this.f119056f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f119056f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class x extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f119057f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119058g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f119057f = function0;
            this.f119058g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f119057f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f119058g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class y extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119059f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ComponentActivity componentActivity) {
            super(0);
            this.f119059f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f119059f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class z extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119060f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(ComponentActivity componentActivity) {
            super(0);
            this.f119060f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f119060f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E2(SinglePageCheckoutActivity singlePageCheckoutActivity, Function1 function1, int i10, int i11, Composer composer, int i12) {
        singlePageCheckoutActivity.C2(function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G2(SinglePageCheckoutActivity singlePageCheckoutActivity, int i10, Composer composer, int i11) {
        singlePageCheckoutActivity.F2(composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
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
    public final void b2(final Ki.LocalThemeScope r41, final float r42, final com.meijer.mobile.singlepagecheckout.EnumC13024a r43, final kotlin.C17959M0 r44, final mv.InterfaceC15783O r45, final java.util.List<ts.ProductCardDecorator> r46, final com.meijer.mobile.accounts.ux.payments.d r47, final com.meijer.mobile.meijer.activity.checkout.payment.ebt.r r48, final com.meijer.mobile.meijer.activity.checkout.payment.Z r49, final com.meijer.mobile.accounts.ux.payments.d.ViewState r50, final com.meijer.mobile.meijer.activity.checkout.payment.Z.PaymentOptionsViewState r51, final boolean r52, final com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentDecorator r53, kotlin.jvm.functions.Function1<? super com.meijer.mobile.singlepagecheckout.EnumC13024a, kotlin.Unit> r54, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, androidx.compose.runtime.Composer r56, final int r57, final int r58, final int r59) {
        /*
            Method dump skipped, instructions count: 2310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.b2(Ki.M, float, com.meijer.mobile.singlepagecheckout.a, x0.M0, mv.O, java.util.List, com.meijer.mobile.accounts.ux.payments.d, com.meijer.mobile.meijer.activity.checkout.payment.ebt.r, com.meijer.mobile.meijer.activity.checkout.payment.Z, com.meijer.mobile.accounts.ux.payments.d$d, com.meijer.mobile.meijer.activity.checkout.payment.Z$k, boolean, com.meijer.mobile.meijer.activity.checkout.review.p, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v2(boolean z10, SinglePageCheckoutActivity singlePageCheckoutActivity, Function0 function0) {
        if (z10) {
            singlePageCheckoutActivity.H3().M(new C12057p.g.SetOptIn(true));
            if (!singlePageCheckoutActivity.H3().J().getValue().getIsShowFormInputScreen()) {
                singlePageCheckoutActivity.H3().M(C12057p.g.n.f105164a);
            }
        } else {
            singlePageCheckoutActivity.B3().M(new H.g.SetOptIn(true));
            if (!singlePageCheckoutActivity.B3().K().getValue().getIsShowFormInputScreen()) {
                singlePageCheckoutActivity.B3().M(H.g.j.f103247a);
            }
        }
        function0.invoke();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C13032c A3() {
        return (C13032c) this.coordinatorViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.meijer.activity.checkout.contactinformation.H B3() {
        return (com.meijer.mobile.meijer.activity.checkout.contactinformation.H) this.deliveryContactViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<BottomSheetContentDecorator> C3() {
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        return CollectionsKt.p(new BottomSheetContentDecorator(companion.d(com.meijer.mobile.meijer.Y.f100358C6, new Object[0]), CollectionsKt.p(new ContentRowData(com.meijer.mobile.meijer.Y.f100626Q5, Integer.valueOf(com.meijer.mobile.meijer.S.f99590l)), new ContentRowData(com.meijer.mobile.meijer.Y.f100645R5, Integer.valueOf(com.meijer.mobile.meijer.S.f99589k0)))), new BottomSheetContentDecorator(companion.d(com.meijer.mobile.meijer.Y.f101296y6, new Object[0]), CollectionsKt.p(new ContentRowData(com.meijer.mobile.meijer.Y.f100925fe, Integer.valueOf(com.meijer.mobile.meijer.S.f99590l)), new ContentRowData(com.meijer.mobile.meijer.Y.f100945ge, Integer.valueOf(com.meijer.mobile.meijer.S.f99592m)), new ContentRowData(com.meijer.mobile.meijer.Y.f100965he, Integer.valueOf(com.meijer.mobile.meijer.S.f99594n)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D2(EnumC13024a it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.meijer.activity.checkout.payment.ebt.r D3() {
        return (com.meijer.mobile.meijer.activity.checkout.payment.ebt.r) this.ebtPinPadViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.meijer.activity.cart.entrynote.i F3() {
        return (com.meijer.mobile.meijer.activity.cart.entrynote.i) this.entryNoteViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1 G3() {
        return (com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1) this.fulfillmentSlotsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C12057p H3() {
        return (C12057p) this.pickupContactViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I2(EnumC13024a it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I3(Function1<? super z1.h, Unit> onAction) {
        onAction.invoke(z1.h.k.f105979a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(SinglePageCheckoutActivity singlePageCheckoutActivity, InterfaceC15783O interfaceC15783O, Function1 function1, int i10, int i11, Composer composer, int i12) {
        singlePageCheckoutActivity.H2(interfaceC15783O, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J3(Function1<? super z1.h, Unit> onAction, Function1<? super q1.g, Unit> onFulfillmentSlotsAction) {
        onFulfillmentSlotsAction.invoke(q1.g.b.f103930a);
        onAction.invoke(z1.h.m.f105981a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K3(EbtBalance ebtAcculynkResponse) {
        String mask;
        this.ebtBalance = ebtAcculynkResponse;
        y3().d0(new Z.i.SetEbtPaymentOption(this.ebtBalance, this.ebtPanResponse));
        EbtPanResponse ebtPanResponse = this.ebtPanResponse;
        if (ebtPanResponse != null && (mask = ebtPanResponse.getMask()) != null) {
            y3().d0(new Z.i.DisplayEbtBalanceAction(mask, ebtAcculynkResponse, getFeatureManager().e(AbstractC18503f.i0.f172883h)));
        }
        y3().d0(Z.i.c.f104591a);
        y3().d0(Z.i.j.f104602a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L2(SinglePageCheckoutActivity singlePageCheckoutActivity, InterfaceC15783O interfaceC15783O, C18029o1 c18029o1, C17959M0 c17959m0, int i10, Composer composer, int i11) {
        singlePageCheckoutActivity.K2(interfaceC15783O, c18029o1, c17959m0, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M3() {
        startActivity(Bl.e.f3123a.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N2(SinglePageCheckoutActivity singlePageCheckoutActivity, InterfaceC16328a interfaceC16328a, InterfaceC16328a interfaceC16328a2, InterfaceC16328a interfaceC16328a3, int i10, Composer composer, int i11) {
        singlePageCheckoutActivity.M2(interfaceC16328a, interfaceC16328a2, interfaceC16328a3, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N3(SubstitutionPreferenceDecorator substitutionPreference) {
        startActivity(SubstitutionPreferenceFormActivity.INSTANCE.a(this, substitutionPreference.getName()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P3() {
        new C15485b(this).setTitle(com.meijer.mobile.meijer.Y.f100923fc).setCancelable(false).setMessage(com.meijer.mobile.meijer.Y.f100903ec).setNegativeButton(yr.Q.f171761b, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.M0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SinglePageCheckoutActivity.Q3(dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R3(String title, String message) {
        FrameLayout frameLayout;
        DialogTitle dialogTitle;
        TextView textView;
        androidx.appcompat.app.c cVarShow = new C15485b(this).setTitle(title).setMessage(message).setNegativeButton(com.meijer.mobile.meijer.Y.f101031l1, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.Q0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SinglePageCheckoutActivity.S3(dialogInterface, i10);
            }
        }).setPositiveButton(com.meijer.mobile.meijer.Y.f100486Ih, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.R0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) throws IOException {
                SinglePageCheckoutActivity.T3(this.f118814a, dialogInterface, i10);
            }
        }).show();
        if (cVarShow != null && (textView = (TextView) cVarShow.findViewById(android.R.id.message)) != null) {
        }
        if (cVarShow != null && (dialogTitle = (DialogTitle) cVarShow.findViewById(ce.f.f61696a)) != null) {
        }
        if (cVarShow == null || (frameLayout = (FrameLayout) cVarShow.findViewById(ce.f.f61698b)) == null) {
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U3(int title, int message, int positiveButtonText, final Function0<Unit> onPositiveButtonClick) {
        new C15485b(this).setTitle(title).setMessage(message).setPositiveButton(positiveButtonText, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.X0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SinglePageCheckoutActivity.V3(onPositiveButtonClick, dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V3(Function0 function0, DialogInterface dialogInterface, int i10) {
        if (function0 != null) {
            function0.invoke();
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W3() {
        new C15485b(this).setTitle(com.meijer.mobile.meijer.Y.f100637Qg).setMessage(com.meijer.mobile.meijer.Y.f100580Ng).setPositiveButton(com.meijer.mobile.meijer.Y.f100618Pg, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.T0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SinglePageCheckoutActivity.X3(this.f119061a, dialogInterface, i10);
            }
        }).setNegativeButton(com.meijer.mobile.meijer.Y.f100599Og, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.U0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SinglePageCheckoutActivity.Y3(dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z3() {
        new C15485b(this).setTitle(com.meijer.mobile.meijer.Y.f101194t4).setMessage(com.meijer.mobile.meijer.Y.f101174s4).setPositiveButton(com.meijer.mobile.meijer.Y.f101031l1, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.V0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) throws IOException {
                SinglePageCheckoutActivity.a4(this.f119077a, dialogInterface, i10);
            }
        }).setCancelable(true).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.meijer.mobile.singlepagecheckout.W0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) throws IOException {
                SinglePageCheckoutActivity.b4(this.f119100a, dialogInterface);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c2(EnumC13024a it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x2(SinglePageCheckoutActivity singlePageCheckoutActivity, LocalThemeScope localThemeScope, float f10, EnumC13024a enumC13024a, C17959M0 c17959m0, InterfaceC15783O interfaceC15783O, List list, com.meijer.mobile.accounts.ux.payments.d dVar, com.meijer.mobile.meijer.activity.checkout.payment.ebt.r rVar, com.meijer.mobile.meijer.activity.checkout.payment.Z z10, d.ViewState viewState, Z.PaymentOptionsViewState paymentOptionsViewState, boolean z11, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, Function1 function1, Function2 function2, int i10, int i11, int i12, Composer composer, int i13) {
        singlePageCheckoutActivity.b2(localThemeScope, f10, enumC13024a, c17959m0, interfaceC15783O, list, dVar, rVar, z10, viewState, paymentOptionsViewState, z11, adjustEbtPaymentDecorator, function1, function2, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.accounts.ux.payments.d x3() {
        return (com.meijer.mobile.accounts.ux.payments.d) this.addCardAurusViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.meijer.activity.checkout.payment.Z y3() {
        return (com.meijer.mobile.meijer.activity.checkout.payment.Z) this.checkoutPaymentOptionsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.meijer.activity.checkout.review.z1 z3() {
        return (com.meijer.mobile.meijer.activity.checkout.review.z1) this.checkoutViewModel.getValue();
    }

    @Override // Hm.f.a
    public void D0(String timerString) {
        Intrinsics.j(timerString, "timerString");
        z3().c1(timerString);
    }

    public final Hm.f E3() {
        Hm.f fVar = this.ebtTimer;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.x("ebtTimer");
        return null;
    }

    public final void K2(final InterfaceC15783O coroutineScope, final C18029o1 snackbarHostState, C17959M0 c17959m0, Composer composer, final int i10) {
        int i11;
        int i12;
        final C17959M0 sheetState = c17959m0;
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
                ComposerKt.U(2116644791, i13, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ObservePaymentEvents (SinglePageCheckoutActivity.kt:1136)");
            }
            Context context = (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g());
            Unit unit = Unit.f143329a;
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            int i14 = i13 & 896;
            boolean zD = composerStartRestartGroup.D(this) | (i14 == 256 || ((i13 & 512) != 0 && composerStartRestartGroup.D(sheetState))) | composerStartRestartGroup.D(context);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new C13017p(sheetState, context, null);
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
                C13018q c13018q = new C13018q(coroutineScope, snackbarHostState, context, c17959m0, null);
                sheetState = c17959m0;
                composerStartRestartGroup.t(c13018q);
                objB2 = c13018q;
            } else {
                i12 = 6;
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(bool, (Function2) objB2, composerStartRestartGroup, i12);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zD3 = composerStartRestartGroup.D(this) | composerStartRestartGroup.D(coroutineScope) | (i14 == 256 || ((i13 & 512) != 0 && composerStartRestartGroup.D(sheetState)));
            Object objB3 = composerStartRestartGroup.B();
            if (zD3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new C13019r(coroutineScope, sheetState, null);
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
            t0L.a(new Function2() { // from class: com.meijer.mobile.singlepagecheckout.N0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SinglePageCheckoutActivity.L2(this.f118792a, coroutineScope, snackbarHostState, sheetState, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String A2(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void B2(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C2(final Function1<? super EnumC13024a, Unit> function1, Composer composer, final int i10, final int i11) {
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
                    objB = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.H0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SinglePageCheckoutActivity.D2((EnumC13024a) obj);
                        }
                    };
                    composerStartRestartGroup.t(objB);
                }
                function1 = (Function1) objB;
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1724610380, i12, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ObserveCheckoutEvents (SinglePageCheckoutActivity.kt:909)");
            }
            Unit unit = Unit.f143329a;
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
                objB2 = new C13013l(function1, null);
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
            t0L.a(new Function2() { // from class: com.meijer.mobile.singlepagecheckout.S0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SinglePageCheckoutActivity.E2(this.f118819a, function1, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F2(Composer composer, final int i10) {
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
                ComposerKt.U(-1773768291, i11, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ObserveContactInfoEvents (SinglePageCheckoutActivity.kt:887)");
            }
            Unit unit = Unit.f143329a;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD = composerStartRestartGroup.D(this);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new C13014m(null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(unit, (Function2) objB, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD2 = composerStartRestartGroup.D(this);
            Object objB2 = composerStartRestartGroup.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new C13015n(null);
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
            t0L.a(new Function2() { // from class: com.meijer.mobile.singlepagecheckout.P0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SinglePageCheckoutActivity.G2(this.f118804a, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H2(final InterfaceC15783O interfaceC15783O, Function1<? super EnumC13024a, Unit> function1, Composer composer, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        Composer composerStartRestartGroup = composer.startRestartGroup(1925130008);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(interfaceC15783O)) {
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
                    objB = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.Y0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SinglePageCheckoutActivity.I2((EnumC13024a) obj);
                        }
                    };
                    composerStartRestartGroup.t(objB);
                }
                function1 = (Function1) objB;
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1925130008, i12, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ObserveFulfillmentSlotEvents (SinglePageCheckoutActivity.kt:869)");
            }
            Unit unit = Unit.f143329a;
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zD = composerStartRestartGroup.D(this) | composerStartRestartGroup.D(interfaceC15783O);
            if ((i12 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10 | zD;
            Object objB2 = composerStartRestartGroup.B();
            if (z11 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new C13016o(interfaceC15783O, function1, null);
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(unit, (Function2) objB2, composerStartRestartGroup, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Function1<? super EnumC13024a, Unit> function12 = function1;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.singlepagecheckout.Z0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SinglePageCheckoutActivity.J2(this.f119125a, interfaceC15783O, function12, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean L3() {
        return getIntent().getBooleanExtra("com.meijer.mobile.meijer.mobile.singlepagecheckout.EXTRA_IS_EDIT_MODE", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M2(InterfaceC16328a interfaceC16328a, InterfaceC16328a interfaceC16328a2, InterfaceC16328a interfaceC16328a3, Composer composer, final int i10) {
        int i11;
        InterfaceC16328a interfaceC16328a4;
        InterfaceC16328a interfaceC16328a5;
        InterfaceC16328a interfaceC16328a6;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1396587609);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(interfaceC16328a)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(interfaceC16328a2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(interfaceC16328a3)) {
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
            interfaceC16328a4 = interfaceC16328a;
            interfaceC16328a5 = interfaceC16328a2;
            interfaceC16328a6 = interfaceC16328a3;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1396587609, i11, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity.ObserveScrollEvents (SinglePageCheckoutActivity.kt:1076)");
            }
            Unit unit = Unit.f143329a;
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zD = composerStartRestartGroup.D(this) | composerStartRestartGroup.D(interfaceC16328a) | composerStartRestartGroup.D(interfaceC16328a2) | composerStartRestartGroup.D(interfaceC16328a3);
            Object objB = composerStartRestartGroup.B();
            if (!zD && objB != Composer.INSTANCE.a()) {
                interfaceC16328a4 = interfaceC16328a;
                interfaceC16328a5 = interfaceC16328a2;
                interfaceC16328a6 = interfaceC16328a3;
            } else {
                interfaceC16328a4 = interfaceC16328a;
                interfaceC16328a5 = interfaceC16328a2;
                interfaceC16328a6 = interfaceC16328a3;
                C13020s c13020s = new C13020s(interfaceC16328a4, interfaceC16328a5, interfaceC16328a6, null);
                composerStartRestartGroup.t(c13020s);
                objB = c13020s;
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(unit, (Function2) objB, composerStartRestartGroup, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            final InterfaceC16328a interfaceC16328a7 = interfaceC16328a6;
            final InterfaceC16328a interfaceC16328a8 = interfaceC16328a5;
            final InterfaceC16328a interfaceC16328a9 = interfaceC16328a4;
            t0L.a(new Function2() { // from class: com.meijer.mobile.singlepagecheckout.O0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SinglePageCheckoutActivity.N2(this.f118798a, interfaceC16328a9, interfaceC16328a8, interfaceC16328a7, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O3() {
        startActivity(getMeijerIntent().p(this, false));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q3(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S3(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3(SinglePageCheckoutActivity singlePageCheckoutActivity, DialogInterface dialogInterface, int i10) throws IOException {
        dialogInterface.dismiss();
        singlePageCheckoutActivity.z3().r0(z1.h.g.f105975a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X3(SinglePageCheckoutActivity singlePageCheckoutActivity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        if (Intrinsics.e(singlePageCheckoutActivity.z3().g0().c().getValue().getFulfillmentMode().getDeliveryMode(), "delivery")) {
            singlePageCheckoutActivity.B3().M(H.g.n.f103251a);
        } else {
            singlePageCheckoutActivity.H3().M(C12057p.g.k.f105157a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y3(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a4(SinglePageCheckoutActivity singlePageCheckoutActivity, DialogInterface dialogInterface, int i10) throws IOException {
        dialogInterface.dismiss();
        singlePageCheckoutActivity.z3().r0(z1.h.f.f105974a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b4(SinglePageCheckoutActivity singlePageCheckoutActivity, DialogInterface dialogInterface) throws IOException {
        dialogInterface.dismiss();
        singlePageCheckoutActivity.z3().r0(z1.h.f.f105974a);
    }

    private static final String d2(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void e2(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    private static final String f2(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void g2(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    private static final Function3<InterfaceC14900d, Composer, Integer, Unit> h2(InterfaceC5872l0<Function3<InterfaceC14900d, Composer, Integer, Unit>> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void i2(InterfaceC5872l0<Function3<InterfaceC14900d, Composer, Integer, Unit>> interfaceC5872l0, Function3<? super InterfaceC14900d, ? super Composer, ? super Integer, Unit> function3) {
        interfaceC5872l0.setValue(function3);
    }

    private static final Function0<Unit> j2(InterfaceC5872l0<Function0<Unit>> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void k2(InterfaceC5872l0<Function0<Unit>> interfaceC5872l0, Function0<Unit> function0) {
        interfaceC5872l0.setValue(function0);
    }

    private static final Function0<Unit> l2(InterfaceC5872l0<Function0<Unit>> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void m2(InterfaceC5872l0<Function0<Unit>> interfaceC5872l0, Function0<Unit> function0) {
        interfaceC5872l0.setValue(function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n2(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o2(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p2(Function0 function0, SinglePageCheckoutActivity singlePageCheckoutActivity) {
        function0.invoke();
        singlePageCheckoutActivity.G3().e0(q1.g.e.f103933a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q2(SinglePageCheckoutActivity singlePageCheckoutActivity, InterfaceC15783O interfaceC15783O, EnumC13024a enumC13024a, C17959M0 c17959m0) throws IOException {
        Ds.p.d(singlePageCheckoutActivity.getWindow());
        C15809k.d(interfaceC15783O, null, null, new C13012k(c17959m0, null), 3, null);
        if (enumC13024a == EnumC13024a.f119140k) {
            singlePageCheckoutActivity.z3().r0(z1.h.e.f105973a);
            singlePageCheckoutActivity.z3().F0(true);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r2(Function0 function0, SinglePageCheckoutActivity singlePageCheckoutActivity) {
        function0.invoke();
        singlePageCheckoutActivity.G3().e0(q1.g.C1466g.f103935a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s2(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t2(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u2(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w2(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    private static final String y2(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void z2(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    @Override // Hm.f.a
    public void Q() {
        Z3();
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        pv.P<Boolean> pL;
        super.onCreate(savedInstanceState);
        this.fromOrderReviewFlow = L3();
        getLifecycle().a(A3());
        getLifecycle().a(G3());
        getLifecycle().a(B3());
        getLifecycle().a(H3());
        getLifecycle().a(y3());
        C13032c c13032cA3 = A3();
        pv.P<Boolean> pD0 = G3().d0();
        pv.P<Boolean> pC0 = y3().c0();
        if (Intrinsics.e(z3().g0().c().getValue().getFulfillmentMode().getDeliveryMode(), "delivery")) {
            pL = B3().L();
        } else {
            pL = H3().L();
        }
        c13032cA3.n(pD0, pC0, pL);
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-871688396, true, new C13022u()), 1, null);
    }
}
