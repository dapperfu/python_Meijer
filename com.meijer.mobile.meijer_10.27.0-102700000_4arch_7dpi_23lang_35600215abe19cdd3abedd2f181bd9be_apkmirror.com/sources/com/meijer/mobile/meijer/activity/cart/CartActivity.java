package com.meijer.mobile.meijer.activity.cart;

import Gm.f;
import Hl.FulfillmentBarDecorator;
import Ji.LocalThemeScope;
import Mn.AbstractC4221e;
import Mn.AbstractC4294v0;
import Mn.AbstractC4302x0;
import V0.C5346q0;
import V2.CreationExtras;
import Wj.ValueState;
import ae.C5597b;
import ak.AbstractC5607a;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.DialogTitle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import ck.C6408b;
import com.fullstory.FS;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textview.MaterialTextView;
import com.google.firebase.perf.metrics.Trace;
import com.meijer.mobile.meijer.activity.cart.C11765s0;
import com.meijer.mobile.meijer.activity.cart.C11779z0;
import com.meijer.mobile.meijer.activity.cart.CartActivity;
import com.meijer.mobile.meijer.activity.cart.CartActivityBottomSheet;
import com.meijer.mobile.meijer.activity.cart.CartBottomSheetDialogFragment;
import com.meijer.mobile.meijer.activity.cart.E0;
import com.meijer.mobile.meijer.activity.cart.EditBackUpItemBottomSheet;
import com.meijer.mobile.meijer.activity.cart.dialog.CartProductSavingsDialogFragment;
import com.meijer.mobile.meijer.activity.cart.entrynote.EntryNoteActivity;
import com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationActivity;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsActivity;
import com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.C11886e;
import com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity;
import com.meijer.mobile.meijer.activity.checkout.outofstock.OutOfStockActivity;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.r;
import com.meijer.mobile.meijer.activity.checkout.review.CreditCardChargesDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.EbtCardChargesDecorator;
import com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity;
import com.scandit.datacapture.core.internal.sdk.extensions.CollectionsExtensionsKt;
import ej.ShoppingCart;
import fi.GoogleAdAnalytics;
import fi.GoogleAdData;
import g.AbstractC14147c;
import g.C14145a;
import g.InterfaceC14146b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.C14886b;
import ji.InterfaceC14928c0;
import ji.q1;
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
import nu.C15949d;
import qv.C16648k;
import qv.InterfaceC16622O;
import tr.C17134a;
import tr.C17135b;
import tv.C17154h;
import tv.InterfaceC17152f;
import vs.CartProductListDecorator;
import wk.C17829a;
import yl.AbstractC18227f;
import zm.CartProductSavingsDecorator;

@Metadata(d1 = {"\u0000¼\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 `2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001}B\u0007¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\u001cJ\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\"\u0010\u001cJ\u000f\u0010#\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010\bJ\u0019\u0010&\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b*\u0010+J5\u00103\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00101\u001a\u0004\u0018\u0001002\b\b\u0002\u00102\u001a\u00020\rH\u0002¢\u0006\u0004\b3\u00104J\u001d\u00108\u001a\u00020\u000f2\f\u00107\u001a\b\u0012\u0004\u0012\u00020605H\u0002¢\u0006\u0004\b8\u00109J\u001d\u0010;\u001a\u00020\u000f2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020605H\u0002¢\u0006\u0004\b;\u00109J\u0017\u0010>\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u001f\u0010F\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020\r2\u0006\u0010E\u001a\u00020\rH\u0002¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020H2\u0006\u0010\u000b\u001a\u00020HH\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\u00020\u000f2\u0006\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u000fH\u0002¢\u0006\u0004\bO\u0010\bJ\u0019\u0010R\u001a\u00020\r2\b\u0010Q\u001a\u0004\u0018\u00010PH\u0016¢\u0006\u0004\bR\u0010SJ\u0019\u0010V\u001a\u00020\u000f2\b\u0010U\u001a\u0004\u0018\u00010TH\u0014¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u000fH\u0014¢\u0006\u0004\bX\u0010\bJ\u000f\u0010Y\u001a\u00020\u000fH\u0016¢\u0006\u0004\bY\u0010\bJ\u0017\u0010\\\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020ZH\u0016¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\u000fH\u0016¢\u0006\u0004\b^\u0010\bJ\u000f\u0010_\u001a\u00020\u000fH\u0016¢\u0006\u0004\b_\u0010\bJ\u000f\u0010`\u001a\u00020\u000fH\u0016¢\u0006\u0004\b`\u0010\bJ\u0019\u0010b\u001a\u00020\u000f2\b\u0010a\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020\u000fH\u0016¢\u0006\u0004\bd\u0010\bJ\u0017\u0010f\u001a\u00020\u000f2\u0006\u0010e\u001a\u000206H\u0016¢\u0006\u0004\bf\u0010gJ\u0017\u0010h\u001a\u00020\u000f2\u0006\u0010e\u001a\u000206H\u0016¢\u0006\u0004\bh\u0010gJ\u0017\u0010i\u001a\u00020\u000f2\u0006\u0010e\u001a\u000206H\u0016¢\u0006\u0004\bi\u0010gJ\u0017\u0010j\u001a\u00020\u000f2\u0006\u0010e\u001a\u000206H\u0016¢\u0006\u0004\bj\u0010gJ'\u0010p\u001a\u00020\u000f2\u0006\u0010k\u001a\u0002062\u0006\u0010m\u001a\u00020l2\u0006\u0010o\u001a\u00020nH\u0016¢\u0006\u0004\bp\u0010qJ'\u0010r\u001a\u00020\u000f2\u0006\u0010k\u001a\u0002062\u0006\u0010m\u001a\u00020l2\u0006\u0010o\u001a\u00020nH\u0016¢\u0006\u0004\br\u0010qJ\u0017\u0010u\u001a\u00020\u000f2\u0006\u0010t\u001a\u00020sH\u0016¢\u0006\u0004\bu\u0010vJ!\u0010y\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u00122\b\u0010x\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\by\u0010zJ\u001b\u0010}\u001a\u00020\r2\n\u0010|\u001a\u00060Hj\u0002`{H\u0016¢\u0006\u0004\b}\u0010~J\u0017\u0010\u007f\u001a\u00020\u000f2\u0006\u0010e\u001a\u000206H\u0016¢\u0006\u0004\b\u007f\u0010gJ\u0019\u0010\u0080\u0001\u001a\u00020\u000f2\u0006\u0010e\u001a\u000206H\u0016¢\u0006\u0005\b\u0080\u0001\u0010gJ\u001c\u0010\u0083\u0001\u001a\u00020\u000f2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0011\u0010\u0085\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0085\u0001\u0010\bJ\u001a\u0010\u0087\u0001\u001a\u00020\u000f2\u0007\u0010\u0086\u0001\u001a\u00020HH\u0016¢\u0006\u0005\b\u0087\u0001\u0010cR*\u0010\u008f\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R*\u0010\u0097\u0001\u001a\u00030\u0090\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R)\u0010\u009e\u0001\u001a\u00030\u0098\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\b_\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R!\u0010¤\u0001\u001a\u00030\u009f\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R!\u0010©\u0001\u001a\u00030¥\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¦\u0001\u0010¡\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R!\u0010®\u0001\u001a\u00030ª\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b«\u0001\u0010¡\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0019\u0010±\u0001\u001a\u00030¯\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\br\u0010°\u0001R\u0019\u0010´\u0001\u001a\u00030²\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bd\u0010³\u0001R\u001a\u0010¶\u0001\u001a\u00030²\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010³\u0001R\u0019\u0010¹\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u0019\u0010»\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010¸\u0001R\u001f\u0010À\u0001\u001a\n\u0012\u0005\u0012\u00030½\u00010¼\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u001f\u0010Â\u0001\u001a\n\u0012\u0005\u0012\u00030½\u00010¼\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010¿\u0001R\u001f\u0010Ä\u0001\u001a\n\u0012\u0005\u0012\u00030½\u00010¼\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010¿\u0001R\u001f\u0010Æ\u0001\u001a\n\u0012\u0005\u0012\u00030½\u00010¼\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010¿\u0001R!\u0010Ë\u0001\u001a\n\u0012\u0005\u0012\u00030È\u00010Ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R \u0010Ì\u0001\u001a\n\u0012\u0005\u0012\u00030È\u00010Ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010Ê\u0001R\u0018\u0010Ð\u0001\u001a\u00030Í\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001¨\u0006Ó\u0001²\u0006\u000f\u0010Ñ\u0001\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010Ò\u0001\u001a\u00020H8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/CartActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "Lcom/meijer/mobile/meijer/activity/cart/z0$a;", "Lcom/meijer/mobile/meijer/activity/cart/CartBottomSheetDialogFragment$a;", "Lcom/meijer/mobile/meijer/activity/cart/EditBackUpItemBottomSheet$b;", "Lcom/meijer/mobile/meijer/activity/cart/CartActivityBottomSheet$b;", "LGm/f$a;", "<init>", "()V", "Lak/a;", "title", "message", "positiveButtonText", "", "isOpenBottomSheet", "", "g3", "(Lak/a;Lak/a;Lak/a;Z)V", "", "mPerksPoints", "appliedOffers", "m3", "(II)V", "f3", "s3", "Lg/a;", "result", "W2", "(Lg/a;)V", "Y2", "LPp/c;", "t3", "(Lg/a;)LPp/c;", "X2", "Z2", "L2", "Lcom/meijer/mobile/meijer/activity/cart/l0;", "cartMetaDataDecorator", "C2", "(Lcom/meijer/mobile/meijer/activity/cart/l0;)V", "Lcom/meijer/mobile/meijer/activity/cart/m0;", "cartMperksOfferDecorator", "I2", "(Lcom/meijer/mobile/meijer/activity/cart/m0;)V", "Lcom/meijer/mobile/meijer/activity/cart/n0;", "cartOrderSummaryDecorator", "Lcom/meijer/mobile/meijer/activity/checkout/review/L1;", "creditCardChargesDecorator", "Lcom/meijer/mobile/meijer/activity/checkout/review/N1;", "ebtCardChargesDecorator", "shouldUpdateVisibilityForTipText", "E2", "(Lcom/meijer/mobile/meijer/activity/cart/n0;Lcom/meijer/mobile/meijer/activity/checkout/review/L1;Lcom/meijer/mobile/meijer/activity/checkout/review/N1;Z)V", "", "Lvs/b;", "cartProductList", "H2", "(Ljava/util/List;)V", "productList", "J2", "Lcom/meijer/mobile/meijer/activity/cart/i1;", "promoCodeSectionDecorator", "K2", "(Lcom/meijer/mobile/meijer/activity/cart/i1;)V", "Lcom/meijer/mobile/meijer/activity/cart/E0$i;", "viewState", "B2", "(Lcom/meijer/mobile/meijer/activity/cart/E0$i;)V", "isAdjustEbt", "isDisplayEBTPinPad", "e3", "(ZZ)V", "", "j3", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/meijer/mobile/meijer/activity/cart/s0$a;", "action", "a3", "(Lcom/meijer/mobile/meijer/activity/cart/s0$a;)V", "p3", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "L0", "", "amount", "t0", "(D)V", "o0", "u", "K", "results", "e0", "(Ljava/lang/String;)V", "z", "item", "Q", "(Lvs/b;)V", "k", "m", "i", "entryToUpdate", "LWj/t;", "valueState", "Landroid/graphics/Rect;", "stepperHitRect", "Z0", "(Lvs/b;LWj/t;Landroid/graphics/Rect;)V", "y", "Lcom/meijer/mobile/meijer/activity/cart/k0;", "cartEntryActionDecorator", "X0", "(Lcom/meijer/mobile/meijer/activity/cart/k0;)V", "entryNumber", "note", "b", "(ILjava/lang/String;)V", "Lcom/meijer/mobile/core/model/common/ResourceId;", "forProduct", "a", "(Ljava/lang/String;)Z", "I", "s0", "Lmk/f;", "product", "i0", "(Lmk/f;)V", "P", "timerString", "z0", "Lwr/f;", "s", "Lwr/f;", "S2", "()Lwr/f;", "setCartInteractor", "(Lwr/f;)V", "cartInteractor", "LTq/j;", "t", "LTq/j;", "getStoreProvider", "()LTq/j;", "setStoreProvider", "(LTq/j;)V", "storeProvider", "LGm/f;", "LGm/f;", "V2", "()LGm/f;", "setEbtTimer", "(LGm/f;)V", "ebtTimer", "Lcom/meijer/mobile/meijer/activity/cart/E0;", "v", "Lkotlin/Lazy;", "T2", "()Lcom/meijer/mobile/meijer/activity/cart/E0;", "cartViewModel", "LHl/b;", "w", "getFulfillmentBarViewModel", "()LHl/b;", "fulfillmentBarViewModel", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r;", "x", "U2", "()Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r;", "ebtPinPadViewModel", "LMn/e;", "LMn/e;", "binding", "Lnu/l;", "Lnu/l;", "productsListSection", "A", "outOfStockProductsListSection", "B", "Z", "showHVPOffersAppliedToast", "C", "isFinalPinPad", "Lg/c;", "Landroid/content/Intent;", "D", "Lg/c;", "clpResultLauncher", "E", "substitutionResultLauncher", "F", "hvpResultLauncher", "G", "unavailableForDeliveryResultLauncher", "Lnu/d;", "Lnu/g;", "H", "Lnu/d;", "productsAdapter", "outOfStockProductsAdapter", "Lcom/meijer/mobile/meijer/activity/cart/CartActivityBottomSheet;", "J", "Lcom/meijer/mobile/meijer/activity/cart/CartActivityBottomSheet;", "cartActivityBottomSheet", "toastIsOpen", "errorMessage", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CartActivity extends Hilt_CartActivity implements C11779z0.a, CartBottomSheetDialogFragment.a, EditBackUpItemBottomSheet.b, CartActivityBottomSheet.b, f.a {

    /* renamed from: L, reason: collision with root package name */
    public static final int f101010L = 8;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private boolean showHVPOffersAppliedToast;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private boolean isFinalPinPad;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private C15949d<nu.g> productsAdapter;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private C15949d<nu.g> outOfStockProductsAdapter;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final CartActivityBottomSheet cartActivityBottomSheet;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public wr.f cartInteractor;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public Tq.j storeProvider;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public Gm.f ebtTimer;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private AbstractC4221e binding;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy cartViewModel = new androidx.view.e0(Reflection.b(E0.class), new m(this), new l(this), new n(null, this));

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy fulfillmentBarViewModel = new androidx.view.e0(Reflection.b(Hl.b.class), new p(this), new o(this), new q(null, this));

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Lazy ebtPinPadViewModel = new androidx.view.e0(Reflection.b(com.meijer.mobile.meijer.activity.checkout.payment.ebt.r.class), new s(this), new r(this), new t(null, this));

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private nu.l productsListSection = new nu.l();

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private nu.l outOfStockProductsListSection = new nu.l();

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> clpResultLauncher = registerForActivityResult(new h.i(), new f());

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> substitutionResultLauncher = registerForActivityResult(new h.i(), new u());

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> hvpResultLauncher = registerForActivityResult(new h.i(), new g());

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> unavailableForDeliveryResultLauncher = registerForActivityResult(new h.i(), new v());

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CartMperksOfferDecorator f101029a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CartActivity f101030b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CartMperksOfferDecorator f101031a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CartActivity f101032b;

            a(CartMperksOfferDecorator cartMperksOfferDecorator, CartActivity cartActivity) {
                this.f101031a = cartMperksOfferDecorator;
                this.f101032b = cartActivity;
            }

            public final void c(LocalThemeScope AdsTheme, Composer composer, int i10) {
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1591265858, i10, -1, "com.meijer.mobile.meijer.activity.cart.CartActivity.bindMperksInCart.<anonymous>.<anonymous> (CartActivity.kt:845)");
                }
                CartMperksOfferDecorator cartMperksOfferDecorator = this.f101031a;
                final int appliedOffers = cartMperksOfferDecorator != null ? cartMperksOfferDecorator.getAppliedOffers() : 0;
                final z1 z1VarB = androidx.compose.runtime.o1.b(this.f101032b.T2().i0(), null, composer, 0, 1);
                int iIntValue = ((Number) z1VarB.getValue()).intValue();
                CartMperksOfferDecorator cartMperksOfferDecorator2 = this.f101031a;
                int availableOffers = cartMperksOfferDecorator2 != null ? cartMperksOfferDecorator2.getAvailableOffers() : 0;
                composer.startReplaceGroup(-1746271574);
                boolean zD = composer.D(this.f101032b) | composer.V(z1VarB) | composer.d(appliedOffers);
                final CartActivity cartActivity = this.f101032b;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.t
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CartActivity.b.a.d(cartActivity, z1VarB, appliedOffers);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean zD2 = composer.D(this.f101032b) | composer.V(z1VarB) | composer.d(appliedOffers);
                final CartActivity cartActivity2 = this.f101032b;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.u
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CartActivity.b.a.e(cartActivity2, z1VarB, appliedOffers);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                C11886e.f(AdsTheme, iIntValue, null, availableOffers, appliedOffers, function0, (Function0) objB2, composer, LocalThemeScope.f15770g | (i10 & 14), 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                c(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(CartActivity cartActivity, z1 z1Var, int i10) {
                cartActivity.hvpResultLauncher.a(MperksInCartActivity.INSTANCE.a(cartActivity, false, ((Number) z1Var.getValue()).intValue(), true, i10));
                cartActivity.T2().I0("mPerks:Cart Page:Apply Rewards button", String.valueOf(((Number) z1Var.getValue()).intValue()));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(CartActivity cartActivity, z1 z1Var, int i10) {
                cartActivity.hvpResultLauncher.a(MperksInCartActivity.INSTANCE.a(cartActivity, false, ((Number) z1Var.getValue()).intValue(), false, i10));
                return Unit.f142422a;
            }
        }

        b(CartMperksOfferDecorator cartMperksOfferDecorator, CartActivity cartActivity) {
            this.f101029a = cartMperksOfferDecorator;
            this.f101030b = cartActivity;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(133080815, i10, -1, "com.meijer.mobile.meijer.activity.cart.CartActivity.bindMperksInCart.<anonymous> (CartActivity.kt:844)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(-1591265858, true, new a(this.f101029a, this.f101030b), composer, 54), composer, 48, 1);
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
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CartMperksOfferDecorator f101033a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CartActivity f101034b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CartMperksOfferDecorator f101035a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CartActivity f101036b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.cart.CartActivity$c$a$a, reason: collision with other inner class name */
            static final class C1412a implements Function3<InterfaceC14928c0, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f101037a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AbstractC5607a f101038b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Context f101039c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ CartActivity f101040d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f101041e;

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(CartActivity cartActivity, InterfaceC5730l0 interfaceC5730l0) {
                    cartActivity.showHVPOffersAppliedToast = false;
                    a.d(interfaceC5730l0, false);
                    return Unit.f142422a;
                }

                C1412a(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, Context context, CartActivity cartActivity, InterfaceC5730l0<Boolean> interfaceC5730l0) {
                    this.f101037a = localThemeScope;
                    this.f101038b = abstractC5607a;
                    this.f101039c = context;
                    this.f101040d = cartActivity;
                    this.f101041e = interfaceC5730l0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit d(final CartActivity cartActivity, final InterfaceC5730l0 interfaceC5730l0, Ci.o AdsToast) {
                    Intrinsics.j(AdsToast, "$this$AdsToast");
                    AdsToast.Q(new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.w
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CartActivity.c.a.C1412a.e(cartActivity, interfaceC5730l0);
                        }
                    });
                    return Unit.f142422a;
                }

                public final void c(InterfaceC14928c0 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(1829523855, i10, -1, "com.meijer.mobile.meijer.activity.cart.CartActivity.bindMperksInCart.<anonymous>.<anonymous>.<anonymous> (CartActivity.kt:897)");
                    }
                    LocalThemeScope localThemeScope = this.f101037a;
                    String strB = this.f101038b.b(this.f101039c);
                    q1.m.Toast success = Assemble.getToastVariant().getSuccess();
                    composer.startReplaceGroup(-1633490746);
                    boolean zD = composer.D(this.f101040d) | composer.V(this.f101041e);
                    final CartActivity cartActivity = this.f101040d;
                    final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f101041e;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.cart.v
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CartActivity.c.a.C1412a.d(cartActivity, interfaceC5730l0, (Ci.o) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Ci.j.l(localThemeScope, null, strB, success, (Function1) objB, composer, LocalThemeScope.f15770g | (q1.m.Toast.f140129h << 9), 1);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14928c0 interfaceC14928c0, Composer composer, Integer num) {
                    c(interfaceC14928c0, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(CartMperksOfferDecorator cartMperksOfferDecorator, CartActivity cartActivity) {
                this.f101035a = cartMperksOfferDecorator;
                this.f101036b = cartActivity;
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
                    ComposerKt.U(-2065424587, i10, -1, "com.meijer.mobile.meijer.activity.cart.CartActivity.bindMperksInCart.<anonymous>.<anonymous> (CartActivity.kt:884)");
                }
                Context context = (Context) composer.o(AndroidCompositionLocals_androidKt.g());
                CartMperksOfferDecorator cartMperksOfferDecorator = this.f101035a;
                AbstractC5607a appliedOffersNotification = cartMperksOfferDecorator != null ? cartMperksOfferDecorator.getAppliedOffersNotification() : null;
                boolean z10 = this.f101036b.showHVPOffersAppliedToast;
                composer.startReplaceGroup(5004770);
                boolean zA = composer.a(z10);
                Object objB = composer.B();
                if (zA || objB == Composer.INSTANCE.a()) {
                    objB = androidx.compose.runtime.t1.e(Boolean.TRUE, null, 2, null);
                    composer.t(objB);
                }
                InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
                composer.P();
                if (this.f101036b.showHVPOffersAppliedToast && c(interfaceC5730l0) && appliedOffersNotification != null) {
                    Ji.Q.e(AdsTheme, ji.b1.f139765a, ComposableLambdaKt.c(1829523855, true, new C1412a(AdsTheme, appliedOffersNotification, context, this.f101036b, interfaceC5730l0), composer, 54), composer, (i10 & 14) | LocalThemeScope.f15770g | 384 | (ji.b1.f139766b << 3));
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                b(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            private static final boolean c(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                return interfaceC5730l0.getValue().booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void d(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
                interfaceC5730l0.setValue(Boolean.valueOf(z10));
            }
        }

        c(CartMperksOfferDecorator cartMperksOfferDecorator, CartActivity cartActivity) {
            this.f101033a = cartMperksOfferDecorator;
            this.f101034b = cartActivity;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1469319206, i10, -1, "com.meijer.mobile.meijer.activity.cart.CartActivity.bindMperksInCart.<anonymous> (CartActivity.kt:883)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(-2065424587, true, new a(this.f101033a, this.f101034b), composer, 54), composer, 48, 1);
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
    /* synthetic */ class d extends FunctionReferenceImpl implements Function1<C11765s0.a, Unit> {
        d(Object obj) {
            super(1, obj, CartActivity.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/cart/CartOutOfStockProductListItem$OutOfStockItemAction;)V", 0);
        }

        public final void a(C11765s0.a p02) {
            Intrinsics.j(p02, "p0");
            ((CartActivity) this.receiver).a3(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C11765s0.a aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PromoCodeSectionDecorator f101042a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CartActivity f101043b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CartActivity f101044a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<String> f101045b;

            a(CartActivity cartActivity, InterfaceC5730l0<String> interfaceC5730l0) {
                this.f101044a = cartActivity;
                this.f101045b = interfaceC5730l0;
            }

            public final void c(LocalThemeScope AdsTheme, Composer composer, int i10) {
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
                    ComposerKt.U(676398325, i11, -1, "com.meijer.mobile.meijer.activity.cart.CartActivity.bindPromoCodeDecorator.<anonymous>.<anonymous> (CartActivity.kt:975)");
                }
                Modifier modifierM = androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, AdsTheme.getAdsSpacing().getFive().getDp(), 7, null);
                String strC = e.c(this.f101045b);
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f101044a);
                final CartActivity cartActivity = this.f101044a;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.cart.x
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CartActivity.e.a.d(cartActivity, (String) obj);
                        }
                    };
                    composer.t(objB);
                }
                Function1 function1 = (Function1) objB;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(this.f101044a);
                final CartActivity cartActivity2 = this.f101044a;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.cart.y
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CartActivity.e.a.e(cartActivity2, (String) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                X.e(AdsTheme, modifierM, strC, function1, (Function1) objB2, composer, LocalThemeScope.f15770g | (i11 & 14), 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(CartActivity cartActivity, String it) {
                Intrinsics.j(it, "it");
                cartActivity.T2().n0(new E0.AbstractC11688f.ResetPromoCodeSectionDecorator(it));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(CartActivity cartActivity, String text) {
                Intrinsics.j(text, "text");
                cartActivity.T2().n0(new E0.AbstractC11688f.PromoCodeFieldEndIconAction(text));
                return Unit.f142422a;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                c(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        e(PromoCodeSectionDecorator promoCodeSectionDecorator, CartActivity cartActivity) {
            this.f101042a = promoCodeSectionDecorator;
            this.f101043b = cartActivity;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(714214052, i10, -1, "com.meijer.mobile.meijer.activity.cart.CartActivity.bindPromoCodeDecorator.<anonymous> (CartActivity.kt:950)");
            }
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = androidx.compose.runtime.t1.e("", null, 2, null);
                composer.t(objB);
            }
            InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composer.P();
            composer.startReplaceGroup(-835059231);
            PromoCodeSectionDecorator promoCodeSectionDecorator = this.f101042a;
            CartActivity cartActivity = this.f101043b;
            int promoCodeState = promoCodeSectionDecorator.getPromoCodeState();
            composer.startReplaceGroup(-835058563);
            if (promoCodeState == 0) {
                d(interfaceC5730l0, "");
            } else if (promoCodeState == 1) {
                d(interfaceC5730l0, "");
                cartActivity.T2().n0(E0.AbstractC11688f.B.f101307a);
            } else if (promoCodeState == 2) {
                d(interfaceC5730l0, C6408b.a(promoCodeSectionDecorator.getMessage(), composer, AbstractC5607a.f45514b));
                AbstractC4221e abstractC4221e = cartActivity.binding;
                if (abstractC4221e == null) {
                    Intrinsics.y("binding");
                    abstractC4221e = null;
                }
                NestedScrollView nestedScrollView = abstractC4221e.f20540I;
                AbstractC4221e abstractC4221e2 = cartActivity.binding;
                if (abstractC4221e2 == null) {
                    Intrinsics.y("binding");
                    abstractC4221e2 = null;
                }
                nestedScrollView.scrollTo(0, (int) abstractC4221e2.f20558a0.f21081A.getY());
            }
            composer.P();
            composer.P();
            Ji.K.b(null, ComposableLambdaKt.c(676398325, true, new a(this.f101043b, interfaceC5730l0), composer, 54), composer, 48, 1);
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
        public static final String c(InterfaceC5730l0<String> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        private static final void d(InterfaceC5730l0<String> interfaceC5730l0, String str) {
            interfaceC5730l0.setValue(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class f implements InterfaceC14146b, FunctionAdapter {
        f() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, CartActivity.this, CartActivity.class, "handleClpResult", "handleClpResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            CartActivity.this.W2(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class g implements InterfaceC14146b, FunctionAdapter {
        g() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, CartActivity.this, CartActivity.class, "handleHvpResult", "handleHvpResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            CartActivity.this.X2(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z1<FulfillmentBarDecorator> f101049a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CartActivity f101050b;

            a(z1<FulfillmentBarDecorator> z1Var, CartActivity cartActivity) {
                this.f101049a = z1Var;
                this.f101050b = cartActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(CartActivity cartActivity) {
                cartActivity.startActivity(OrderOptionsActivity.INSTANCE.b(cartActivity, "Meijer:CartPage"));
                return Unit.f142422a;
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
                    ComposerKt.U(108584808, i10, -1, "com.meijer.mobile.meijer.activity.cart.CartActivity.onCreate.<anonymous>.<anonymous> (CartActivity.kt:262)");
                }
                FulfillmentBarDecorator value = this.f101049a.getValue();
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f101050b);
                final CartActivity cartActivity = this.f101050b;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.z
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CartActivity.h.a.c(cartActivity);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Hl.g.b(AdsTheme, value, null, (Function0) objB, composer, (i10 & 14) | LocalThemeScope.f15770g | (FulfillmentBarDecorator.f12698m << 3), 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                b(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        h() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1798237145, i10, -1, "com.meijer.mobile.meijer.activity.cart.CartActivity.onCreate.<anonymous> (CartActivity.kt:260)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(108584808, true, new a(androidx.compose.runtime.o1.b(CartActivity.this.getFulfillmentBarViewModel().n(), null, composer, 0, 1), CartActivity.this), composer, 54), composer, 48, 1);
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
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.cart.CartActivity$onCreate$9", f = "CartActivity.kt", l = {651}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f101065a;

        k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CartActivity.this.new k(continuation);
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.cart.CartActivity$onCreate$9$1", f = "CartActivity.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<r.h, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f101067a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f101068b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ CartActivity f101069c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CartActivity cartActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f101069c = cartActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f101069c, continuation);
                aVar.f101068b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(r.h hVar, Continuation<? super Unit> continuation) {
                return ((a) create(hVar, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
                IntrinsicsKt.f();
                if (this.f101067a == 0) {
                    ResultKt.b(obj);
                    r.h hVar = (r.h) this.f101068b;
                    if (hVar instanceof r.h.a) {
                        if (this.f101069c.isFinalPinPad) {
                            this.f101069c.T2().n0(E0.AbstractC11688f.C11692d.f101333a);
                            this.f101069c.cartActivityBottomSheet.dismiss();
                        } else {
                            this.f101069c.T2().n0(E0.AbstractC11688f.C11702o.f101345a);
                            this.f101069c.T2().n0(new E0.AbstractC11688f.UpdateLoader(false));
                        }
                    } else if (hVar instanceof r.h.ShowErrorState) {
                        if (this.f101069c.isFinalPinPad) {
                            this.f101069c.cartActivityBottomSheet.dismiss();
                        } else {
                            this.f101069c.T2().n0(E0.AbstractC11688f.C11702o.f101345a);
                            this.f101069c.T2().n0(new E0.AbstractC11688f.UpdateLoader(false));
                        }
                        r.h.ShowErrorState showErrorState = (r.h.ShowErrorState) hVar;
                        String errorCode = showErrorState.getErrorCode();
                        if (errorCode != null && errorCode.length() != 0) {
                            Gm.a aVarA = Gm.a.INSTANCE.a(showErrorState.getErrorCode());
                            CartActivity cartActivity = this.f101069c;
                            String string = cartActivity.getResources().getString(aVarA.getHeaderResourceId());
                            Intrinsics.i(string, "getString(...)");
                            String string2 = this.f101069c.getResources().getString(aVarA.getMessageResourceId());
                            Intrinsics.i(string2, "getString(...)");
                            cartActivity.j3(string, string2);
                        } else if (!this.f101069c.V2().getTimerRunningStatus()) {
                            this.f101069c.p3();
                        }
                    } else if (hVar instanceof r.h.HandlePinPadSuccess) {
                        if (this.f101069c.isFinalPinPad) {
                            this.f101069c.cartActivityBottomSheet.dismiss();
                            this.f101069c.V2().g();
                            this.f101069c.T2().n0(E0.AbstractC11688f.C11698k.f101341a);
                        } else {
                            this.f101069c.T2().n0(new E0.AbstractC11688f.SetEBTCurrentCardBalance(((r.h.HandlePinPadSuccess) hVar).getEbtBalance()));
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f101065a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f interfaceC17152fO = C17154h.O(CartActivity.this.U2().G().a(), new a(CartActivity.this, null));
                this.f101065a = 1;
                if (C17154h.j(interfaceC17152fO, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class l extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f101070f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentActivity componentActivity) {
            super(0);
            this.f101070f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f101070f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class m extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f101071f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentActivity componentActivity) {
            super(0);
            this.f101071f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f101071f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class n extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f101072f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f101073g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f101072f = function0;
            this.f101073g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f101072f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f101073g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class o extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f101074f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentActivity componentActivity) {
            super(0);
            this.f101074f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f101074f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class p extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f101075f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentActivity componentActivity) {
            super(0);
            this.f101075f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f101075f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class q extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f101076f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f101077g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f101076f = function0;
            this.f101077g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f101076f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f101077g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class r extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f101078f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentActivity componentActivity) {
            super(0);
            this.f101078f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f101078f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class s extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f101079f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ComponentActivity componentActivity) {
            super(0);
            this.f101079f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f101079f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class t extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f101080f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f101081g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f101080f = function0;
            this.f101081g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f101080f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f101081g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class u implements InterfaceC14146b, FunctionAdapter {
        u() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, CartActivity.this, CartActivity.class, "handleSubstitutionResult", "handleSubstitutionResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            CartActivity.this.Y2(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class v implements InterfaceC14146b, FunctionAdapter {
        v() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, CartActivity.this, CartActivity.class, "handleUnavailableForDeliveryResult", "handleUnavailableForDeliveryResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            CartActivity.this.Z2(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F2(CartActivity cartActivity) {
        cartActivity.e3(true, false);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G2(CartActivity cartActivity) {
        cartActivity.e3(false, false);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f3() {
        setResult(-1);
        finishAfterTransition();
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/E0$i;", "viewState", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/cart/E0$i;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.cart.CartActivity$onCreate$7", f = "CartActivity.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class i extends SuspendLambda implements Function2<E0.CartViewState, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f101051a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f101052b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ E0.CartViewState f101054a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CartActivity f101055b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.cart.CartActivity$i$a$a, reason: collision with other inner class name */
            static final class C1413a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ E0.CartViewState f101056a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ CartActivity f101057b;

                C1413a(E0.CartViewState c11711i, CartActivity cartActivity) {
                    this.f101056a = c11711i;
                    this.f101057b = cartActivity;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(CartActivity cartActivity, GoogleAdAnalytics googleAdAnalytics) {
                    Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
                    cartActivity.T2().n0(new E0.AbstractC11688f.GoogleAdClicked(googleAdAnalytics));
                    return Unit.f142422a;
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
                        ComposerKt.U(870123078, i10, -1, "com.meijer.mobile.meijer.activity.cart.CartActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CartActivity.kt:303)");
                    }
                    GoogleAdData googleAdDataR = this.f101056a.getGoogleAdData();
                    if (googleAdDataR != null) {
                        final CartActivity cartActivity = this.f101057b;
                        Modifier modifierD = androidx.compose.foundation.b.d(Modifier.INSTANCE, C5346q0.INSTANCE.k(), null, 2, null);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(cartActivity);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.cart.A
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CartActivity.i.a.C1413a.c(cartActivity, (GoogleAdAnalytics) obj);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        sr.p.C(AdsTheme, modifierD, googleAdDataR, (Function1) objB, composer, (i10 & 14) | LocalThemeScope.f15770g | 48 | (GoogleAdData.f131149f << 6), 0);
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                    b(localThemeScope, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(E0.CartViewState c11711i, CartActivity cartActivity) {
                this.f101054a = c11711i;
                this.f101055b = cartActivity;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1788739767, i10, -1, "com.meijer.mobile.meijer.activity.cart.CartActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CartActivity.kt:302)");
                }
                Ji.K.b(null, ComposableLambdaKt.c(870123078, true, new C1413a(this.f101054a, this.f101055b), composer, 54), composer, 48, 1);
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
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ E0.CartViewState f101058a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CartActivity f101059b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ E0.CartViewState f101060a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ CartActivity f101061b;

                a(E0.CartViewState c11711i, CartActivity cartActivity) {
                    this.f101060a = c11711i;
                    this.f101061b = cartActivity;
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
                        ComposerKt.U(-1477113785, i10, -1, "com.meijer.mobile.meijer.activity.cart.CartActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CartActivity.kt:319)");
                    }
                    E0.CartViewState c11711i = this.f101060a;
                    composer.startReplaceGroup(-1633490746);
                    boolean zD = composer.D(this.f101061b) | composer.D(this.f101060a);
                    final CartActivity cartActivity = this.f101061b;
                    final E0.CartViewState c11711i2 = this.f101060a;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.B
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CartActivity.i.b.a.c(cartActivity, c11711i2);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    X.c(AdsTheme, null, c11711i, (Function0) objB, composer, LocalThemeScope.f15770g | (i10 & 14), 1);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                    b(localThemeScope, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(CartActivity cartActivity, E0.CartViewState c11711i) {
                    cartActivity.B2(c11711i);
                    cartActivity.e3(false, true);
                    return Unit.f142422a;
                }
            }

            b(E0.CartViewState c11711i, CartActivity cartActivity) {
                this.f101058a = c11711i;
                this.f101059b = cartActivity;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-558497096, i10, -1, "com.meijer.mobile.meijer.activity.cart.CartActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CartActivity.kt:318)");
                }
                Ji.K.b(null, ComposableLambdaKt.c(-1477113785, true, new a(this.f101058a, this.f101059b), composer, 54), composer, 48, 1);
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

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            i iVar = CartActivity.this.new i(continuation);
            iVar.f101052b = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(E0.CartViewState c11711i, Continuation<? super Unit> continuation) {
            return ((i) create(c11711i, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i10;
            int i11;
            int i12;
            boolean z10;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            IntrinsicsKt.f();
            if (this.f101051a == 0) {
                ResultKt.b(obj);
                E0.CartViewState c11711i = (E0.CartViewState) this.f101052b;
                AbstractC4221e abstractC4221e = CartActivity.this.binding;
                AbstractC4221e abstractC4221e2 = null;
                if (abstractC4221e == null) {
                    Intrinsics.y("binding");
                    abstractC4221e = null;
                }
                CartActivity cartActivity = CartActivity.this;
                if (!cartActivity.V2().getTimerRunningStatus()) {
                    abstractC4221e.f20562e0.X(c11711i.getLoadingState().getIsLoading(), false);
                }
                Group oosGroup = abstractC4221e.f20555X;
                Intrinsics.i(oosGroup, "oosGroup");
                int i19 = 8;
                if (!c11711i.j().isEmpty()) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                oosGroup.setVisibility(i10);
                MaterialButton removeAllOosButton = abstractC4221e.f20563f0;
                Intrinsics.i(removeAllOosButton, "removeAllOosButton");
                if (!c11711i.j().isEmpty()) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                removeAllOosButton.setVisibility(i11);
                View bottomCalloutDivider = abstractC4221e.f20534C;
                Intrinsics.i(bottomCalloutDivider, "bottomCalloutDivider");
                if (!c11711i.j().isEmpty()) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                bottomCalloutDivider.setVisibility(i12);
                MaterialTextView materialTextView = abstractC4221e.f20537F;
                Intrinsics.g(materialTextView);
                bk.d.g(materialTextView, c11711i.getCartIdText());
                if (c11711i.getCartIdText() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                materialTextView.setVisibility(i13);
                MaterialButton materialButton = abstractC4221e.f20541J;
                Intrinsics.g(materialButton);
                bk.d.g(materialButton, c11711i.getCheckoutButtonText());
                if (c11711i.getIsOrderUnderModification()) {
                    i14 = 8;
                } else {
                    i14 = 0;
                }
                materialButton.setVisibility(i14);
                Group updateButtonGroup = abstractC4221e.f20564g0;
                Intrinsics.i(updateButtonGroup, "updateButtonGroup");
                if (c11711i.getIsOrderUnderModification()) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                updateButtonGroup.setVisibility(i15);
                MaterialButton updateOrderButton = abstractC4221e.f20565h0;
                Intrinsics.i(updateOrderButton, "updateOrderButton");
                bk.d.g(updateOrderButton, c11711i.getUpdateOrderButtonText());
                ComposeView fulfillmentBarInclude = abstractC4221e.f20548Q;
                Intrinsics.i(fulfillmentBarInclude, "fulfillmentBarInclude");
                if (c11711i.getIsOrderUnderModification()) {
                    i16 = 8;
                } else {
                    i16 = 0;
                }
                fulfillmentBarInclude.setVisibility(i16);
                MaterialButton addItemsButton = abstractC4221e.f20566z;
                Intrinsics.i(addItemsButton, "addItemsButton");
                if (c11711i.getIsOrderUnderModification()) {
                    i17 = 0;
                } else {
                    i17 = 8;
                }
                addItemsButton.setVisibility(i17);
                MaterialButton emptyCartButton = abstractC4221e.f20546O;
                Intrinsics.i(emptyCartButton, "emptyCartButton");
                if (c11711i.getIsOrderUnderModification()) {
                    i18 = 8;
                } else {
                    i18 = 0;
                }
                emptyCartButton.setVisibility(i18);
                ConstraintLayout alcoholRestrictionCard = abstractC4221e.f20532A.f20908z;
                Intrinsics.i(alcoholRestrictionCard, "alcoholRestrictionCard");
                if (c11711i.getEditOrderHasAlcohol()) {
                    i19 = 0;
                }
                alcoholRestrictionCard.setVisibility(i19);
                if (cartActivity.getFeatureManager().e(AbstractC18227f.C.f170544h)) {
                    abstractC4221e.f20550S.setContent(ComposableLambdaKt.composableLambdaInstance(1788739767, true, new a(c11711i, cartActivity)));
                }
                if (cartActivity.V2().getTimerRunningStatus()) {
                    ComposeView ebtTimerCard = abstractC4221e.f20544M;
                    Intrinsics.i(ebtTimerCard, "ebtTimerCard");
                    ebtTimerCard.setVisibility(0);
                    abstractC4221e.f20544M.setContent(ComposableLambdaKt.composableLambdaInstance(-558497096, true, new b(c11711i, cartActivity)));
                }
                if (c11711i.getDisplayEligibleForDelivery()) {
                    AbstractC4221e abstractC4221e3 = cartActivity.binding;
                    if (abstractC4221e3 == null) {
                        Intrinsics.y("binding");
                        abstractC4221e3 = null;
                    }
                    LinearLayout eligibleForDeliverySection = abstractC4221e3.f20545N;
                    Intrinsics.i(eligibleForDeliverySection, "eligibleForDeliverySection");
                    eligibleForDeliverySection.setVisibility(0);
                    AbstractC4221e abstractC4221e4 = cartActivity.binding;
                    if (abstractC4221e4 == null) {
                        Intrinsics.y("binding");
                    } else {
                        abstractC4221e2 = abstractC4221e4;
                    }
                    abstractC4221e2.f20551T.setBackgroundColor(Bj.r.b(cartActivity, C5597b.f44541s, null, false, 6, null));
                }
                cartActivity.I2(c11711i.getCartMperksOfferDecorator());
                CartActivity.this.C2(c11711i.getCartMetaDataDecorator());
                CartActivity.this.E2(c11711i.getCartOrderSummaryDecorator(), c11711i.getCreditCardCharges(), c11711i.getEbtCardCharges(), false);
                CartActivity.this.H2(c11711i.i());
                CartActivity.this.J2(c11711i.j());
                CartActivity.this.K2(c11711i.getPromoCodeSectionDecorator());
                CartActivity.this.B2(c11711i);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/E0$g;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/cart/E0$g;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.cart.CartActivity$onCreate$8", f = "CartActivity.kt", l = {}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<E0.AbstractC11707g, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f101062a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f101063b;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            j jVar = CartActivity.this.new j(continuation);
            jVar.f101063b = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public final Object invoke(E0.AbstractC11707g abstractC11707g, Continuation<? super Unit> continuation) {
            return ((j) create(abstractC11707g, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void B(CartActivity cartActivity, DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            cartActivity.f3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void C(CartActivity cartActivity, DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            cartActivity.T2().n0(E0.AbstractC11688f.M.f101320a);
            cartActivity.T2().E0(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void D(CartActivity cartActivity, DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            cartActivity.T2().E0(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void E(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void u(CartActivity cartActivity, DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            cartActivity.T2().n0(E0.AbstractC11688f.C11695h.f101338a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void v(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void x(CartActivity cartActivity, DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            cartActivity.T2().n0(E0.AbstractC11688f.C11691c.f101332a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void y(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void z(CartActivity cartActivity, DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            cartActivity.startActivity(OrderOptionsActivity.INSTANCE.b(cartActivity, "Meijer:CartPage"));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
            IntrinsicsKt.f();
            if (this.f101062a == 0) {
                ResultKt.b(obj);
                E0.AbstractC11707g abstractC11707g = (E0.AbstractC11707g) this.f101063b;
                AbstractC4221e abstractC4221e = null;
                if (abstractC11707g instanceof E0.AbstractC11707g.FailEvent) {
                    AbstractC4221e abstractC4221e2 = CartActivity.this.binding;
                    if (abstractC4221e2 == null) {
                        Intrinsics.y("binding");
                    } else {
                        abstractC4221e = abstractC4221e2;
                    }
                    Snackbar.q0(abstractC4221e.getRoot(), ((E0.AbstractC11707g.FailEvent) abstractC11707g).getMessageResId(), 0).c0();
                } else if (abstractC11707g instanceof E0.AbstractC11707g.z) {
                    CartActivity cartActivity = CartActivity.this;
                    cartActivity.startActivity(cartActivity.getMeijerIntent().p(CartActivity.this, true));
                } else if (abstractC11707g instanceof E0.AbstractC11707g.ShowEmptyCartDialogEvent) {
                    E0.AbstractC11707g.ShowEmptyCartDialogEvent rVar = (E0.AbstractC11707g.ShowEmptyCartDialogEvent) abstractC11707g;
                    C14886b message = new C14886b(CartActivity.this).setTitle(rVar.getTitle()).setCancelable(true).setMessage(rVar.getMessage());
                    int iC = rVar.getPositiveButtonText();
                    final CartActivity cartActivity2 = CartActivity.this;
                    message.setPositiveButton(iC, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.C
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            CartActivity.j.u(cartActivity2, dialogInterface, i10);
                        }
                    }).setNegativeButton(rVar.getNegativeButtonText(), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.D
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            CartActivity.j.v(dialogInterface, i10);
                        }
                    }).show();
                } else if (abstractC11707g instanceof E0.AbstractC11707g.GoProductDetailEvent) {
                    CartActivity.this.clpResultLauncher.a(Al.g.t(CartActivity.this.getFeatureEntryPoint(), ((E0.AbstractC11707g.GoProductDetailEvent) abstractC11707g).getProduct(), false, true, null, 8, null));
                } else if (abstractC11707g instanceof E0.AbstractC11707g.StartCheckoutEvent) {
                    CartActivity.this.s3();
                } else if (abstractC11707g instanceof E0.AbstractC11707g.ShowEntryOptionsEvent) {
                    CartBottomSheetDialogFragment.INSTANCE.a(((E0.AbstractC11707g.ShowEntryOptionsEvent) abstractC11707g).getCartEntryActionDecorator()).show(CartActivity.this.getSupportFragmentManager(), "cart_bottom_sheet_tag");
                } else if (abstractC11707g instanceof E0.AbstractC11707g.ShowCancelUpdateDialog) {
                    E0.AbstractC11707g.ShowCancelUpdateDialog mVar = (E0.AbstractC11707g.ShowCancelUpdateDialog) abstractC11707g;
                    C14886b message2 = new C14886b(CartActivity.this).setTitle(bk.d.a(CartActivity.this, mVar.getTitle())).setMessage(bk.d.a(CartActivity.this, mVar.getMessage()));
                    String strA = bk.d.a(CartActivity.this, mVar.getPositiveButtonText());
                    final CartActivity cartActivity3 = CartActivity.this;
                    message2.setPositiveButton(strA, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.E
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            CartActivity.j.x(cartActivity3, dialogInterface, i10);
                        }
                    }).setNegativeButton(bk.d.a(CartActivity.this, mVar.getNegativeButtonText()), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.F
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            CartActivity.j.y(dialogInterface, i10);
                        }
                    }).show();
                } else if (abstractC11707g instanceof E0.AbstractC11707g.d) {
                    CartActivity.this.f3();
                } else if (abstractC11707g instanceof E0.AbstractC11707g.CancelUpdateOrderErrorDialog) {
                    E0.AbstractC11707g.CancelUpdateOrderErrorDialog c11708a = (E0.AbstractC11707g.CancelUpdateOrderErrorDialog) abstractC11707g;
                    CartActivity.h3(CartActivity.this, c11708a.getTitle(), c11708a.getMessage(), c11708a.getPositiveButtonText(), false, 8, null);
                } else if (abstractC11707g instanceof E0.AbstractC11707g.UpdateOrderSuccess) {
                    CartActivity.this.V2().g();
                    CartActivity cartActivity4 = CartActivity.this;
                    cartActivity4.startActivity(OrderConfirmationActivity.Companion.b(OrderConfirmationActivity.INSTANCE, cartActivity4, ((E0.AbstractC11707g.UpdateOrderSuccess) abstractC11707g).getOrderId(), null, null, false, 28, null));
                } else if (abstractC11707g instanceof E0.AbstractC11707g.ShowUpdateOrderFailureMessage) {
                    E0.AbstractC11707g.ShowUpdateOrderFailureMessage xVar = (E0.AbstractC11707g.ShowUpdateOrderFailureMessage) abstractC11707g;
                    CartActivity.h3(CartActivity.this, xVar.getTitle(), xVar.getMessage(), xVar.getPositiveButtonText(), false, 8, null);
                } else if (abstractC11707g instanceof E0.AbstractC11707g.f) {
                    if (CartActivity.this.getFeatureManager().e(AbstractC18227f.t0.f170605h)) {
                        CartActivity cartActivity5 = CartActivity.this;
                        cartActivity5.startActivity(Al.h.c(cartActivity5, Pp.b.f28356a, null, null, false, null, 60, null));
                    } else {
                        CartActivity cartActivity6 = CartActivity.this;
                        cartActivity6.startActivity(Al.h.g(cartActivity6, Pp.b.f28356a, null, null, false, null, 60, null));
                    }
                } else if (abstractC11707g instanceof E0.AbstractC11707g.ShowHighValuePromoEvent) {
                    E0.AbstractC11707g.ShowHighValuePromoEvent tVar = (E0.AbstractC11707g.ShowHighValuePromoEvent) abstractC11707g;
                    CartActivity.this.m3(tVar.getMPerksPoints(), tVar.getAppliedOffers());
                } else if (abstractC11707g instanceof E0.AbstractC11707g.C11709b) {
                    AbstractC4221e abstractC4221e3 = CartActivity.this.binding;
                    if (abstractC4221e3 == null) {
                        Intrinsics.y("binding");
                        abstractC4221e3 = null;
                    }
                    Snackbar snackbarR0 = Snackbar.r0(abstractC4221e3.getRoot(), CartActivity.this.getResources().getString(Bj.o.f3034o0), -1);
                    AbstractC4221e abstractC4221e4 = CartActivity.this.binding;
                    if (abstractC4221e4 == null) {
                        Intrinsics.y("binding");
                    } else {
                        abstractC4221e = abstractC4221e4;
                    }
                    snackbarR0.X(abstractC4221e.f20535D).c0();
                } else if (abstractC11707g instanceof E0.AbstractC11707g.ShowSelectFulfillmentDialogEvent) {
                    E0.AbstractC11707g.ShowSelectFulfillmentDialogEvent wVar = (E0.AbstractC11707g.ShowSelectFulfillmentDialogEvent) abstractC11707g;
                    C14886b message3 = new C14886b(CartActivity.this).setCancelable(false).setTitle(bk.d.a(CartActivity.this, wVar.getTitle())).setMessage(bk.d.a(CartActivity.this, wVar.getMessage()));
                    String strA2 = bk.d.a(CartActivity.this, wVar.getPositiveButtonText());
                    final CartActivity cartActivity7 = CartActivity.this;
                    message3.setPositiveButton(strA2, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.G
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            CartActivity.j.z(cartActivity7, dialogInterface, i10);
                        }
                    }).show();
                } else if (abstractC11707g instanceof E0.AbstractC11707g.ShowOutOfStockDialogEvent) {
                    CartActivity.this.substitutionResultLauncher.a(OutOfStockActivity.INSTANCE.a(CartActivity.this, CollectionsExtensionsKt.toArrayList(((E0.AbstractC11707g.ShowOutOfStockDialogEvent) abstractC11707g).a())));
                } else if (abstractC11707g instanceof E0.AbstractC11707g.Show503Error) {
                    E0.AbstractC11707g.Show503Error lVar = (E0.AbstractC11707g.Show503Error) abstractC11707g;
                    C14886b message4 = new C14886b(CartActivity.this).setCancelable(false).setTitle(bk.d.a(CartActivity.this, lVar.getTitle())).setMessage(bk.d.a(CartActivity.this, lVar.getMessage()));
                    String strA3 = bk.d.a(CartActivity.this, lVar.getPositiveButtonText());
                    final CartActivity cartActivity8 = CartActivity.this;
                    message4.setPositiveButton(strA3, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.H
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            CartActivity.j.B(cartActivity8, dialogInterface, i10);
                        }
                    }).show();
                } else if (abstractC11707g instanceof E0.AbstractC11707g.ShowLowStockDialogEvent) {
                    E0.AbstractC11707g.ShowLowStockDialogEvent uVar = (E0.AbstractC11707g.ShowLowStockDialogEvent) abstractC11707g;
                    C14886b message5 = new C14886b(CartActivity.this).setTitle(uVar.getTitle()).setCancelable(false).setMessage(uVar.getMessage());
                    int iC2 = uVar.getPositiveButtonText();
                    final CartActivity cartActivity9 = CartActivity.this;
                    C14886b positiveButton = message5.setPositiveButton(iC2, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.I
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            CartActivity.j.C(cartActivity9, dialogInterface, i10);
                        }
                    });
                    int iB = uVar.getNegativeButtonText();
                    final CartActivity cartActivity10 = CartActivity.this;
                    positiveButton.setNegativeButton(iB, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.J
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            CartActivity.j.D(cartActivity10, dialogInterface, i10);
                        }
                    }).show();
                } else if (abstractC11707g instanceof E0.AbstractC11707g.TriggerScrollingEvent) {
                    AbstractC4221e abstractC4221e5 = CartActivity.this.binding;
                    if (abstractC4221e5 == null) {
                        Intrinsics.y("binding");
                        abstractC4221e5 = null;
                    }
                    NestedScrollView nestedScrollView = abstractC4221e5.f20540I;
                    CartActivity cartActivity11 = CartActivity.this;
                    AbstractC4221e abstractC4221e6 = cartActivity11.binding;
                    if (abstractC4221e6 == null) {
                        Intrinsics.y("binding");
                        abstractC4221e6 = null;
                    }
                    int y10 = (int) abstractC4221e6.f20561d0.getY();
                    AbstractC4221e abstractC4221e7 = cartActivity11.binding;
                    if (abstractC4221e7 == null) {
                        Intrinsics.y("binding");
                    } else {
                        abstractC4221e = abstractC4221e7;
                    }
                    nestedScrollView.scrollTo(0, y10 + ((int) abstractC4221e.f20561d0.getChildAt(((E0.AbstractC11707g.TriggerScrollingEvent) abstractC11707g).getScrollPosition()).getY()));
                } else if (abstractC11707g instanceof E0.AbstractC11707g.o) {
                    new C14886b(CartActivity.this).setTitle(C17135b.f161966C).setCancelable(true).setMessage(C17135b.f161964B).setPositiveButton(C17135b.f162005W, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.K
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            CartActivity.j.E(dialogInterface, i10);
                        }
                    }).show();
                } else if (!(abstractC11707g instanceof E0.AbstractC11707g.p)) {
                    if (abstractC11707g instanceof E0.AbstractC11707g.OpenCartActivityBottomSheet) {
                        E0.AbstractC11707g.OpenCartActivityBottomSheet iVar = (E0.AbstractC11707g.OpenCartActivityBottomSheet) abstractC11707g;
                        CartActivity.this.e3(iVar.getIsAdjustEbtClicked(), iVar.getIsDisplayEBTPinPad());
                    } else if (abstractC11707g instanceof E0.AbstractC11707g.OpenEBTGetBalancePinPadEvent) {
                        E0.AbstractC11707g.OpenEBTGetBalancePinPadEvent kVar = (E0.AbstractC11707g.OpenEBTGetBalancePinPadEvent) abstractC11707g;
                        CartActivity.this.e3(kVar.getIsAdjustEbtClicked(), kVar.getIsDisplayEBTPinPad());
                    } else if (abstractC11707g instanceof E0.AbstractC11707g.OpenEBTCheckoutPinPadEvent) {
                        AbstractC4221e abstractC4221e8 = CartActivity.this.binding;
                        if (abstractC4221e8 == null) {
                            Intrinsics.y("binding");
                        } else {
                            abstractC4221e = abstractC4221e8;
                        }
                        abstractC4221e.f20562e0.X(false, false);
                        CartActivity.this.isFinalPinPad = true;
                        CartActivity.this.T2().n0(new E0.AbstractC11688f.UpdateAcculynkPostBody(((E0.AbstractC11707g.OpenEBTCheckoutPinPadEvent) abstractC11707g).getAcculynkPostBody(), CartActivity.this.isFinalPinPad));
                        if (!CartActivity.this.V2().getTimerRunningStatus()) {
                            CartActivity.this.V2().l(115L);
                        }
                        CartActivity.this.V2().k(CartActivity.this);
                    } else if (abstractC11707g instanceof E0.AbstractC11707g.ShowEBTErrorDialog) {
                        CartActivity cartActivity12 = CartActivity.this;
                        E0.AbstractC11707g.ShowEBTErrorDialog qVar = (E0.AbstractC11707g.ShowEBTErrorDialog) abstractC11707g;
                        String string = cartActivity12.getResources().getString(qVar.getTitle());
                        Intrinsics.i(string, "getString(...)");
                        String string2 = CartActivity.this.getResources().getString(qVar.getMessage());
                        Intrinsics.i(string2, "getString(...)");
                        cartActivity12.j3(string, string2);
                    } else if (abstractC11707g instanceof E0.AbstractC11707g.NavigateToOrderDetailEvent) {
                        CartActivity cartActivity13 = CartActivity.this;
                        Al.l lVar2 = Al.l.f673a;
                        String strA4 = ((E0.AbstractC11707g.NavigateToOrderDetailEvent) abstractC11707g).getOrderId();
                        if (strA4 == null) {
                            strA4 = "";
                        }
                        cartActivity13.startActivity(Al.l.b(lVar2, cartActivity13, strA4, null, null, 12, null));
                        CartActivity.this.finish();
                    } else if (abstractC11707g instanceof E0.AbstractC11707g.NavigateToNotAvailableForDeliveryEvent) {
                        CartActivity.this.unavailableForDeliveryResultLauncher.a(UnavailableForDeliveryActivity.INSTANCE.a(CartActivity.this, CollectionsExtensionsKt.toArrayList(((E0.AbstractC11707g.NavigateToNotAvailableForDeliveryEvent) abstractC11707g).a())));
                    } else if (abstractC11707g instanceof E0.AbstractC11707g.ShowCheckBalanceMessage) {
                        E0.AbstractC11707g.ShowCheckBalanceMessage nVar = (E0.AbstractC11707g.ShowCheckBalanceMessage) abstractC11707g;
                        CartActivity.this.g3(nVar.getTitle(), nVar.getMessage(), nVar.getPositiveButtonText(), true);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B2(E0.CartViewState viewState) {
        this.cartActivityBottomSheet.j1(viewState.getAdjustEbtPaymentDecorator());
        this.cartActivityBottomSheet.i1(viewState.getIsAdjustEbtClicked());
        this.cartActivityBottomSheet.l1(getFeatureManager().e(AbstractC18227f.C18252z.f170616h));
        this.cartActivityBottomSheet.h1(viewState.getAcculynkPostBody());
        this.cartActivityBottomSheet.k1(viewState.getIsDisplayPinPad());
        this.cartActivityBottomSheet.m1(viewState.getEbtTimerText());
        this.cartActivityBottomSheet.n1(viewState.getIsShowTimer());
        this.cartActivityBottomSheet.g1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C2(CartMetaDataDecorator cartMetaDataDecorator) {
        if (cartMetaDataDecorator != null) {
            ps.d0 navigationHelper = getNavigationHelper();
            if (navigationHelper != null) {
                ShoppingCart cart = cartMetaDataDecorator.getCart();
                int totalItems = cart != null ? cart.getTotalItems() : 0;
                navigationHelper.Y((totalItems == 0 ? AbstractC5607a.INSTANCE.d(C17135b.f162045s, new Object[0]) : AbstractC5607a.INSTANCE.b(C17134a.f161958a, totalItems, new Object[0])).b(this));
            }
            AbstractC4221e abstractC4221e = this.binding;
            AbstractC4221e abstractC4221e2 = null;
            if (abstractC4221e == null) {
                Intrinsics.y("binding");
                abstractC4221e = null;
            }
            ConstraintLayout cartScreen = abstractC4221e.f20539H;
            Intrinsics.i(cartScreen, "cartScreen");
            cartScreen.setVisibility(V2().getTimerRunningStatus() ? false : cartMetaDataDecorator.g() ? 0 : 8);
            AbstractC4221e abstractC4221e3 = this.binding;
            if (abstractC4221e3 == null) {
                Intrinsics.y("binding");
                abstractC4221e3 = null;
            }
            MaterialTextView cartItemCount = abstractC4221e3.f20538G;
            Intrinsics.i(cartItemCount, "cartItemCount");
            bk.d.g(cartItemCount, cartMetaDataDecorator.d());
            AbstractC4221e abstractC4221e4 = this.binding;
            if (abstractC4221e4 == null) {
                Intrinsics.y("binding");
            } else {
                abstractC4221e2 = abstractC4221e4;
            }
            AbstractC4294v0 abstractC4294v0 = abstractC4221e2.f20547P;
            ConstraintLayout errorEmptyScreen = abstractC4294v0.f21041D;
            Intrinsics.i(errorEmptyScreen, "errorEmptyScreen");
            errorEmptyScreen.setVisibility(!V2().getTimerRunningStatus() && (cartMetaDataDecorator.f() || cartMetaDataDecorator.e()) ? 0 : 8);
            if (cartMetaDataDecorator.f()) {
                abstractC4294v0.f21040C.setText(com.meijer.mobile.meijer.Y.f99583Ge);
                abstractC4294v0.f21038A.setText(C17135b.f161992P);
                abstractC4294v0.f21042z.setText(com.meijer.mobile.meijer.Y.f99529Dh);
                MaterialButton cartErrorEmptyNeedHelpButton = abstractC4294v0.f21039B;
                Intrinsics.i(cartErrorEmptyNeedHelpButton, "cartErrorEmptyNeedHelpButton");
                cartErrorEmptyNeedHelpButton.setVisibility(0);
                abstractC4294v0.f21039B.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CartActivity.D2(this.f101866a, view);
                    }
                });
                return;
            }
            if (cartMetaDataDecorator.e()) {
                abstractC4294v0.f21040C.setText(getString(C17135b.f162003U0));
                abstractC4294v0.f21038A.setText(getString(C17135b.f162052v0));
                abstractC4294v0.f21042z.setText(getString(C17135b.f162050u0));
                MaterialButton cartErrorEmptyNeedHelpButton2 = abstractC4294v0.f21039B;
                Intrinsics.i(cartErrorEmptyNeedHelpButton2, "cartErrorEmptyNeedHelpButton");
                cartErrorEmptyNeedHelpButton2.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D2(CartActivity cartActivity, View view) {
        cartActivity.startActivity(Al.a.f661a.c(cartActivity, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E2(CartOrderSummaryDecorator cartOrderSummaryDecorator, CreditCardChargesDecorator creditCardChargesDecorator, EbtCardChargesDecorator ebtCardChargesDecorator, boolean shouldUpdateVisibilityForTipText) {
        AbstractC4221e abstractC4221e = this.binding;
        if (abstractC4221e == null) {
            Intrinsics.y("binding");
            abstractC4221e = null;
        }
        AbstractC4302x0 orderSummaryInclude = abstractC4221e.f20558a0;
        Intrinsics.i(orderSummaryInclude, "orderSummaryInclude");
        com.meijer.mobile.meijer.activity.a.a(orderSummaryInclude, cartOrderSummaryDecorator, creditCardChargesDecorator, ebtCardChargesDecorator, shouldUpdateVisibilityForTipText, new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CartActivity.F2(this.f101834a);
            }
        }, new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CartActivity.G2(this.f101835a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H2(List<CartProductListDecorator> cartProductList) {
        List<CartProductListDecorator> list = cartProductList;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C11779z0((CartProductListDecorator) it.next(), this, "CART_SCREEN"));
        }
        this.productsListSection.R(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I2(CartMperksOfferDecorator cartMperksOfferDecorator) {
        AbstractC4221e abstractC4221e = this.binding;
        AbstractC4221e abstractC4221e2 = null;
        if (abstractC4221e == null) {
            Intrinsics.y("binding");
            abstractC4221e = null;
        }
        abstractC4221e.f20552U.setContent(ComposableLambdaKt.composableLambdaInstance(133080815, true, new b(cartMperksOfferDecorator, this)));
        AbstractC4221e abstractC4221e3 = this.binding;
        if (abstractC4221e3 == null) {
            Intrinsics.y("binding");
        } else {
            abstractC4221e2 = abstractC4221e3;
        }
        abstractC4221e2.f20543L.setContent(ComposableLambdaKt.composableLambdaInstance(1469319206, true, new c(cartMperksOfferDecorator, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J2(List<CartProductListDecorator> productList) {
        List<CartProductListDecorator> list = productList;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C11765s0((CartProductListDecorator) it.next(), new d(this)));
        }
        this.outOfStockProductsListSection.R(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K2(PromoCodeSectionDecorator promoCodeSectionDecorator) {
        AbstractC4221e abstractC4221e = this.binding;
        if (abstractC4221e == null) {
            Intrinsics.y("binding");
            abstractC4221e = null;
        }
        abstractC4221e.f20558a0.f21081A.setContent(ComposableLambdaKt.composableLambdaInstance(714214052, true, new e(promoCodeSectionDecorator, this)));
    }

    private final void L2() {
        AbstractC4221e abstractC4221e = this.binding;
        AbstractC4221e abstractC4221e2 = null;
        if (abstractC4221e == null) {
            Intrinsics.y("binding");
            abstractC4221e = null;
        }
        abstractC4221e.f20547P.f21042z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CartActivity.M2(this.f101876a, view);
            }
        });
        AbstractC4221e abstractC4221e3 = this.binding;
        if (abstractC4221e3 == null) {
            Intrinsics.y("binding");
            abstractC4221e3 = null;
        }
        abstractC4221e3.f20546O.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CartActivity.N2(this.f101930a, view);
            }
        });
        AbstractC4221e abstractC4221e4 = this.binding;
        if (abstractC4221e4 == null) {
            Intrinsics.y("binding");
            abstractC4221e4 = null;
        }
        abstractC4221e4.f20541J.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CartActivity.O2(this.f101939a, view);
            }
        });
        AbstractC4221e abstractC4221e5 = this.binding;
        if (abstractC4221e5 == null) {
            Intrinsics.y("binding");
            abstractC4221e5 = null;
        }
        abstractC4221e5.f20536E.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CartActivity.P2(this.f101941a, view);
            }
        });
        AbstractC4221e abstractC4221e6 = this.binding;
        if (abstractC4221e6 == null) {
            Intrinsics.y("binding");
            abstractC4221e6 = null;
        }
        abstractC4221e6.f20565h0.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CartActivity.Q2(this.f101944a, view);
            }
        });
        AbstractC4221e abstractC4221e7 = this.binding;
        if (abstractC4221e7 == null) {
            Intrinsics.y("binding");
        } else {
            abstractC4221e2 = abstractC4221e7;
        }
        abstractC4221e2.f20566z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CartActivity.R2(this.f101948a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E0 T2() {
        return (E0) this.cartViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.meijer.activity.checkout.payment.ebt.r U2() {
        return (com.meijer.mobile.meijer.activity.checkout.payment.ebt.r) this.ebtPinPadViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a3(C11765s0.a action) {
        if (action instanceof C11765s0.a.Remove) {
            T2().n0(new E0.AbstractC11688f.RemoveEntryAction(((C11765s0.a.Remove) action).getItem()));
            return;
        }
        if (action instanceof C11765s0.a.Substitute) {
            this.substitutionResultLauncher.a(Al.t.e(Al.t.f694a, this, ((C11765s0.a.Substitute) action).getItem(), Pp.c.f28364b, null, "Meijer:CartPage", 8, null));
        } else {
            if (!(action instanceof C11765s0.a.View)) {
                throw new NoWhenBranchMatchedException();
            }
            Al.g.t(getFeatureEntryPoint(), ((C11765s0.a.View) action).getItem().getProduct(), true, false, "PDP accessed from Out of Stock in Cart", 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b3(CartActivity cartActivity, Trace startTrace) {
        Intrinsics.j(startTrace, "$this$startTrace");
        startTrace.putAttribute("external_shopper_id", cartActivity.getUserManager().a());
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c3(CartActivity cartActivity, View view) {
        cartActivity.startActivity(Al.a.f661a.c(cartActivity, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e3(boolean isAdjustEbt, boolean isDisplayEBTPinPad) {
        if (isDisplayEBTPinPad) {
            if (this.cartActivityBottomSheet.isAdded()) {
                return;
            }
            this.cartActivityBottomSheet.show(getSupportFragmentManager(), "CartActivityBottomSheet");
        } else {
            T2().n0(new E0.AbstractC11688f.UpdateIsAdjustEbtClick(isAdjustEbt));
            if (this.cartActivityBottomSheet.isAdded()) {
                return;
            }
            this.cartActivityBottomSheet.show(getSupportFragmentManager(), "CartActivityBottomSheet");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g3(AbstractC5607a title, AbstractC5607a message, AbstractC5607a positiveButtonText, final boolean isOpenBottomSheet) {
        new C14886b(this).setTitle(bk.d.a(this, title)).setMessage(bk.d.a(this, message)).setPositiveButton(bk.d.a(this, positiveButtonText), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CartActivity.i3(isOpenBottomSheet, this, dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Hl.b getFulfillmentBarViewModel() {
        return (Hl.b) this.fulfillmentBarViewModel.getValue();
    }

    static /* synthetic */ void h3(CartActivity cartActivity, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        cartActivity.g3(abstractC5607a, abstractC5607a2, abstractC5607a3, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i3(boolean z10, CartActivity cartActivity, DialogInterface dialogInterface, int i10) {
        if (z10) {
            cartActivity.T2().n0(E0.AbstractC11688f.t.f101351a);
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j3(String title, String message) {
        FrameLayout frameLayout;
        DialogTitle dialogTitle;
        TextView textView;
        androidx.appcompat.app.c cVarShow = new C14886b(this).setTitle(title).setMessage(message).setNegativeButton(com.meijer.mobile.meijer.Y.f100169l1, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CartActivity.k3(dialogInterface, i10);
            }
        }).setPositiveButton(com.meijer.mobile.meijer.Y.f99529Dh, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CartActivity.l3(this.f101749a, dialogInterface, i10);
            }
        }).show();
        if (cVarShow != null && (textView = (TextView) cVarShow.findViewById(R.id.message)) != null) {
        }
        if (cVarShow != null && (dialogTitle = (DialogTitle) cVarShow.findViewById(ae.f.f44681a)) != null) {
        }
        if (cVarShow == null || (frameLayout = (FrameLayout) cVarShow.findViewById(ae.f.f44683b)) == null) {
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m3(final int mPerksPoints, final int appliedOffers) {
        new C14886b(this).setCancelable(false).setTitle(C17135b.f161977H0).setMessage(C17135b.f161971E0).setPositiveButton(C17135b.f161975G0, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CartActivity.n3(this.f101837a, mPerksPoints, appliedOffers, dialogInterface, i10);
            }
        }).setNegativeButton(C17135b.f161973F0, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CartActivity.o3(this.f101841a, dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p3() {
        new C14886b(this).setTitle(com.meijer.mobile.meijer.Y.f100332t4).setMessage(com.meijer.mobile.meijer.Y.f100312s4).setPositiveButton(com.meijer.mobile.meijer.Y.f100169l1, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CartActivity.q3(this.f101752a, dialogInterface, i10);
            }
        }).setCancelable(true).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.meijer.mobile.meijer.activity.cart.e
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                CartActivity.r3(this.f101762a, dialogInterface);
            }
        }).show();
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11779z0.a
    public void I(CartProductListDecorator item) {
        Intrinsics.j(item, "item");
        C17829a.f166179a.a(CartProductSavingsDialogFragment.INSTANCE.a(CartProductSavingsDecorator.INSTANCE.b(item)), this, "cart_product_savings_dialog_fragment");
    }

    @Override // com.meijer.mobile.meijer.activity.cart.CartActivityBottomSheet.b
    public void K() {
        this.cartActivityBottomSheet.dismiss();
        T2().n0(E0.AbstractC11688f.C11701n.f101344a);
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11779z0.a
    public void Q(CartProductListDecorator item) {
        Intrinsics.j(item, "item");
        new EditBackUpItemBottomSheet(item, this).show(getSupportFragmentManager(), "EditBackUpItemBottomSheet");
    }

    public final wr.f S2() {
        wr.f fVar = this.cartInteractor;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.y("cartInteractor");
        return null;
    }

    public final Gm.f V2() {
        Gm.f fVar = this.ebtTimer;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.y("ebtTimer");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11779z0.a
    public void X0(CartEntryActionDecorator cartEntryActionDecorator) {
        Intrinsics.j(cartEntryActionDecorator, "cartEntryActionDecorator");
        T2().n0(new E0.AbstractC11688f.GetOptionsForEntryAction(cartEntryActionDecorator));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11779z0.a
    public void Z0(CartProductListDecorator entryToUpdate, ValueState valueState, Rect stepperHitRect) {
        Intrinsics.j(entryToUpdate, "entryToUpdate");
        Intrinsics.j(valueState, "valueState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        T2().n0(new E0.AbstractC11688f.UpdateEntryQuantityAction(entryToUpdate, valueState.getQuantity(), stepperHitRect));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11779z0.a
    public boolean a(String forProduct) {
        Intrinsics.j(forProduct, "forProduct");
        return !S2().x(forProduct);
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11779z0.a, com.meijer.mobile.meijer.activity.cart.CartBottomSheetDialogFragment.a
    public void b(int entryNumber, String note) {
        EntryNoteActivity.Companion companion = EntryNoteActivity.INSTANCE;
        if (note == null) {
            note = "";
        }
        startActivity(companion.a(this, entryNumber, note, "com.meijer.intent.extra.EXTRA_ENTRY_NOTE_TYPE"));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11779z0.a
    public void i(CartProductListDecorator item) {
        Intrinsics.j(item, "item");
        T2().n0(new E0.AbstractC11688f.GoProductDetailAction(item.getProduct()));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.CartBottomSheetDialogFragment.a
    public void i0(mk.f product) {
        Intrinsics.j(product, "product");
        T2().n0(new E0.AbstractC11688f.RemoveEntryFromEllipsis(product));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.EditBackUpItemBottomSheet.b
    public void k(CartProductListDecorator item) {
        Intrinsics.j(item, "item");
        T2().n0(new E0.AbstractC11688f.DeleteProactiveSubstituteAction(item.getProduct().getCode()));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.EditBackUpItemBottomSheet.b
    public void m(CartProductListDecorator item) {
        Intrinsics.j(item, "item");
        this.substitutionResultLauncher.a(Al.t.e(Al.t.f694a, this, item, Pp.c.f28363a, null, "Meijer:CartPage", 8, null));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.CartActivityBottomSheet.b
    public void o0() {
        this.cartActivityBottomSheet.dismiss();
        T2().n0(E0.AbstractC11688f.C11692d.f101333a);
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11779z0.a
    public void s0(CartProductListDecorator item) {
        Intrinsics.j(item, "item");
        this.substitutionResultLauncher.a(Al.t.e(Al.t.f694a, this, item, Pp.c.f28363a, null, "Meijer:CartPage", 8, null));
        T2().D0(item);
    }

    @Override // com.meijer.mobile.meijer.activity.cart.CartActivityBottomSheet.b
    public void u() {
        this.cartActivityBottomSheet.dismiss();
        T2().n0(E0.AbstractC11688f.C11702o.f101345a);
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11779z0.a
    public void y(CartProductListDecorator entryToUpdate, ValueState valueState, Rect stepperHitRect) {
        Intrinsics.j(entryToUpdate, "entryToUpdate");
        Intrinsics.j(valueState, "valueState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        T2().n0(new E0.AbstractC11688f.StepperStateChangedAction(entryToUpdate, valueState.getQuantity(), stepperHitRect));
    }

    @Override // Gm.f.a
    public void z0(String timerString) {
        Intrinsics.j(timerString, "timerString");
        T2().n0(new E0.AbstractC11688f.UpdateTimer(timerString));
    }

    public CartActivity() {
        C15949d<nu.g> c15949d = new C15949d<>();
        c15949d.c(this.productsListSection);
        this.productsAdapter = c15949d;
        C15949d<nu.g> c15949d2 = new C15949d<>();
        c15949d2.c(this.outOfStockProductsListSection);
        this.outOfStockProductsAdapter = c15949d2;
        this.cartActivityBottomSheet = new CartActivityBottomSheet(null, this, false, false, false, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M2(CartActivity cartActivity, View view) {
        cartActivity.T2().n0(E0.AbstractC11688f.C11699l.f101342a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N2(CartActivity cartActivity, View view) {
        cartActivity.T2().n0(E0.AbstractC11688f.H.f101313a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O2(CartActivity cartActivity, View view) {
        cartActivity.T2().n0(E0.AbstractC11688f.J.f101315a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P2(CartActivity cartActivity, View view) {
        cartActivity.T2().n0(E0.AbstractC11688f.C11690b.f101331a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q2(CartActivity cartActivity, View view) {
        cartActivity.T2().n0(E0.AbstractC11688f.J.f101315a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R2(CartActivity cartActivity, View view) {
        cartActivity.T2().n0(E0.AbstractC11688f.C11689a.f101330a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W2(C14145a result) {
        switch (result.getResultCode()) {
            case 48996:
                T2().n0(E0.AbstractC11688f.w.f101354a);
                break;
            case 48997:
                T2().n0(E0.AbstractC11688f.C11700m.f101343a);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X2(C14145a result) {
        Intent data;
        if (result.getResultCode() == 48385 && (data = result.getData()) != null) {
            data.getIntExtra("com.meijer.mobile.meijer.activity.cart.intent.extra.APPLIED_MPERKS_OFFERS_FROM_HVP", 0);
            this.showHVPOffersAppliedToast = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y2(C14145a result) {
        if (result.getResultCode() == 8675309) {
            T2().n0(new E0.AbstractC11688f.SuccessfullySubstitutedItemAction(t3(result)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z2(C14145a result) {
        Intent data;
        if (result.getResultCode() == 3443 && (data = result.getData()) != null) {
            boolean booleanExtra = data.getBooleanExtra("com.meijer.mobile.meijer.activity.cart.UnavailableForDeliveryActivity.UNAVAILABLE_FOR_DELIVERY_PRODUCT_REMOVED", false);
            Boolean boolValueOf = Boolean.valueOf(booleanExtra);
            if (!booleanExtra) {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                T2().n0(E0.AbstractC11688f.C.f101308a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d3(CartActivity cartActivity, View view) {
        cartActivity.T2().n0(E0.AbstractC11688f.x.f101355a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k3(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l3(CartActivity cartActivity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        cartActivity.e3(false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n3(CartActivity cartActivity, int i10, int i11, DialogInterface dialogInterface, int i12) {
        cartActivity.T2().n0(new E0.AbstractC11688f.HvpPromptAnalyticsTrackAction(true));
        dialogInterface.dismiss();
        cartActivity.hvpResultLauncher.a(MperksInCartActivity.INSTANCE.a(cartActivity, true, i10, true, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o3(CartActivity cartActivity, DialogInterface dialogInterface, int i10) {
        cartActivity.T2().n0(new E0.AbstractC11688f.HvpPromptAnalyticsTrackAction(false));
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q3(CartActivity cartActivity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        cartActivity.T2().n0(E0.AbstractC11688f.C11697j.f101340a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r3(CartActivity cartActivity, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        cartActivity.T2().n0(E0.AbstractC11688f.C11697j.f101340a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s3() {
        if (getFeatureManager().e(AbstractC18227f.i0.f170583h)) {
            startActivity(Al.r.b(Al.r.f692a, this, false, 2, null));
        } else {
            startActivity(FulfillmentSlotsActivity.Companion.b(FulfillmentSlotsActivity.INSTANCE, this, null, 2, null));
        }
    }

    private final Pp.c t3(C14145a result) {
        Object serializableExtra;
        Intent data = result.getData();
        Object obj = null;
        if (data == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = data.getSerializableExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.substitutionmode", Pp.c.class);
        } else {
            Object serializableExtra2 = data.getSerializableExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.substitutionmode");
            if (serializableExtra2 instanceof Pp.c) {
                obj = serializableExtra2;
            }
            serializableExtra = (Pp.c) obj;
        }
        return (Pp.c) serializableExtra;
    }

    @Override // com.meijer.mobile.meijer.activity.cart.CartActivityBottomSheet.b
    public void L0() {
        T2().n0(E0.AbstractC11688f.u.f101352a);
    }

    @Override // Gm.f.a
    public void P() {
        p3();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent ev2) {
        int x10;
        E0 e0T2 = T2();
        int y10 = 0;
        if (ev2 != null) {
            x10 = (int) ev2.getX();
        } else {
            x10 = 0;
        }
        if (ev2 != null) {
            y10 = (int) ev2.getY();
        }
        e0T2.n0(new E0.AbstractC11688f.CollapseQtyStepperAction(x10, y10));
        return super.dispatchTouchEvent(ev2);
    }

    @Override // com.meijer.mobile.meijer.activity.cart.CartActivityBottomSheet.b
    public void e0(String results) {
        U2().I(results);
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        V2().k(this);
        AbstractC4221e abstractC4221eK0 = AbstractC4221e.K0(getLayoutInflater());
        this.binding = abstractC4221eK0;
        if (abstractC4221eK0 == null) {
            Intrinsics.y("binding");
            abstractC4221eK0 = null;
        }
        setContentView(Zr.a.j(abstractC4221eK0.getRoot(), false, 1, null));
        ps.d0 navigationHelper = getNavigationHelper();
        if (navigationHelper != null) {
            navigationHelper.i0(268437856);
        }
        getLifecycle().a(T2());
        T2().n0(new E0.AbstractC11688f.SetCartModeAction(false));
        getFirebasePerformanceEngine().a("cart_checkout_trace", new Function1() { // from class: com.meijer.mobile.meijer.activity.cart.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CartActivity.b3(this.f101739a, (Trace) obj);
            }
        });
        AbstractC4221e abstractC4221e = this.binding;
        if (abstractC4221e == null) {
            Intrinsics.y("binding");
            abstractC4221e = null;
        }
        RecyclerView recyclerView = abstractC4221e.f20561d0;
        recyclerView.setAdapter(this.productsAdapter);
        recyclerView.addItemDecoration(new androidx.recyclerview.widget.i(recyclerView.getContext(), 1));
        AbstractC4221e abstractC4221e2 = this.binding;
        if (abstractC4221e2 == null) {
            Intrinsics.y("binding");
            abstractC4221e2 = null;
        }
        RecyclerView recyclerView2 = abstractC4221e2.f20556Y;
        recyclerView2.setAdapter(this.outOfStockProductsAdapter);
        recyclerView2.addItemDecoration(new androidx.recyclerview.widget.i(recyclerView2.getContext(), 1));
        AbstractC4221e abstractC4221e3 = this.binding;
        if (abstractC4221e3 == null) {
            Intrinsics.y("binding");
            abstractC4221e3 = null;
        }
        abstractC4221e3.f20554W.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CartActivity.c3(this.f101856a, view);
            }
        });
        AbstractC4221e abstractC4221e4 = this.binding;
        if (abstractC4221e4 == null) {
            Intrinsics.y("binding");
            abstractC4221e4 = null;
        }
        abstractC4221e4.f20563f0.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CartActivity.d3(this.f101861a, view);
            }
        });
        AbstractC4221e abstractC4221e5 = this.binding;
        if (abstractC4221e5 == null) {
            Intrinsics.y("binding");
            abstractC4221e5 = null;
        }
        abstractC4221e5.f20548Q.setContent(ComposableLambdaKt.composableLambdaInstance(1798237145, true, new h()));
        C17154h.J(C17154h.O(T2().k0(), new i(null)), C6031t.a(this));
        L2();
        C17154h.J(C17154h.O(T2().getEvents(), new j(null)), C6031t.a(this));
        C16648k.d(C6031t.a(this), null, null, new k(null), 3, null);
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        FS.page("Cart Page").start();
    }

    @Override // com.meijer.mobile.meijer.activity.cart.CartActivityBottomSheet.b
    public void t0(double amount) {
        T2().n0(new E0.AbstractC11688f.UpdateEBTApprovedAmount(amount));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.CartActivityBottomSheet.b
    public void z() {
        T2().n0(new E0.AbstractC11688f.UpdateLoader(false));
    }
}
