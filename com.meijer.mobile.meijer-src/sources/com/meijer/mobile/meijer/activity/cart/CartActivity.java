package com.meijer.mobile.meijer.activity.cart;

import Am.CartProductSavingsDecorator;
import Hm.f;
import Il.FulfillmentBarDecorator;
import Ki.LocalThemeScope;
import Nn.AbstractC4226e;
import Nn.AbstractC4299v0;
import Nn.AbstractC4307x0;
import V0.C5489q0;
import V2.CreationExtras;
import Xj.ValueState;
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
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import bk.AbstractC6392a;
import ce.C6503b;
import com.fullstory.FS;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textview.MaterialTextView;
import com.google.firebase.perf.metrics.Trace;
import com.meijer.mobile.meijer.activity.cart.C11890s0;
import com.meijer.mobile.meijer.activity.cart.C11904z0;
import com.meijer.mobile.meijer.activity.cart.CartActivity;
import com.meijer.mobile.meijer.activity.cart.CartActivityBottomSheet;
import com.meijer.mobile.meijer.activity.cart.CartBottomSheetDialogFragment;
import com.meijer.mobile.meijer.activity.cart.E0;
import com.meijer.mobile.meijer.activity.cart.EditBackUpItemBottomSheet;
import com.meijer.mobile.meijer.activity.cart.dialog.CartProductSavingsDialogFragment;
import com.meijer.mobile.meijer.activity.cart.entrynote.EntryNoteActivity;
import com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationActivity;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsActivity;
import com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.C12011e;
import com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity;
import com.meijer.mobile.meijer.activity.checkout.outofstock.OutOfStockActivity;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.r;
import com.meijer.mobile.meijer.activity.checkout.review.CreditCardChargesDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.EbtCardChargesDecorator;
import com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity;
import com.scandit.datacapture.core.internal.sdk.extensions.CollectionsExtensionsKt;
import dk.C13698b;
import fj.ShoppingCart;
import g.AbstractC14276c;
import g.C14274a;
import g.InterfaceC14275b;
import gi.GoogleAdAnalytics;
import gi.GoogleAdData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.C15069d;
import ki.InterfaceC15162c0;
import ki.q1;
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
import le.C15485b;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16561f;
import tr.C17283a;
import tr.C17284b;
import vs.CartProductListDecorator;
import xk.C18188a;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000¼\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u007f2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001}B\u0007¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\u001cJ\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\"\u0010\u001cJ\u000f\u0010#\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010\bJ\u0019\u0010&\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b*\u0010+J5\u00103\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00101\u001a\u0004\u0018\u0001002\b\b\u0002\u00102\u001a\u00020\rH\u0002¢\u0006\u0004\b3\u00104J\u001d\u00108\u001a\u00020\u000f2\f\u00107\u001a\b\u0012\u0004\u0012\u00020605H\u0002¢\u0006\u0004\b8\u00109J\u001d\u0010;\u001a\u00020\u000f2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020605H\u0002¢\u0006\u0004\b;\u00109J\u0017\u0010>\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u001f\u0010F\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020\r2\u0006\u0010E\u001a\u00020\rH\u0002¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020H2\u0006\u0010\u000b\u001a\u00020HH\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\u00020\u000f2\u0006\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u000fH\u0002¢\u0006\u0004\bO\u0010\bJ\u0019\u0010R\u001a\u00020\r2\b\u0010Q\u001a\u0004\u0018\u00010PH\u0016¢\u0006\u0004\bR\u0010SJ\u0019\u0010V\u001a\u00020\u000f2\b\u0010U\u001a\u0004\u0018\u00010TH\u0014¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u000fH\u0014¢\u0006\u0004\bX\u0010\bJ\u000f\u0010Y\u001a\u00020\u000fH\u0016¢\u0006\u0004\bY\u0010\bJ\u0017\u0010\\\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020ZH\u0016¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\u000fH\u0016¢\u0006\u0004\b^\u0010\bJ\u000f\u0010_\u001a\u00020\u000fH\u0016¢\u0006\u0004\b_\u0010\bJ\u000f\u0010`\u001a\u00020\u000fH\u0016¢\u0006\u0004\b`\u0010\bJ\u0019\u0010b\u001a\u00020\u000f2\b\u0010a\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020\u000fH\u0016¢\u0006\u0004\bd\u0010\bJ\u0017\u0010f\u001a\u00020\u000f2\u0006\u0010e\u001a\u000206H\u0016¢\u0006\u0004\bf\u0010gJ\u0017\u0010h\u001a\u00020\u000f2\u0006\u0010e\u001a\u000206H\u0016¢\u0006\u0004\bh\u0010gJ\u0017\u0010i\u001a\u00020\u000f2\u0006\u0010e\u001a\u000206H\u0016¢\u0006\u0004\bi\u0010gJ\u0017\u0010j\u001a\u00020\u000f2\u0006\u0010e\u001a\u000206H\u0016¢\u0006\u0004\bj\u0010gJ'\u0010p\u001a\u00020\u000f2\u0006\u0010k\u001a\u0002062\u0006\u0010m\u001a\u00020l2\u0006\u0010o\u001a\u00020nH\u0016¢\u0006\u0004\bp\u0010qJ'\u0010r\u001a\u00020\u000f2\u0006\u0010k\u001a\u0002062\u0006\u0010m\u001a\u00020l2\u0006\u0010o\u001a\u00020nH\u0016¢\u0006\u0004\br\u0010qJ\u0017\u0010u\u001a\u00020\u000f2\u0006\u0010t\u001a\u00020sH\u0016¢\u0006\u0004\bu\u0010vJ!\u0010y\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u00122\b\u0010x\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\by\u0010zJ\u001b\u0010}\u001a\u00020\r2\n\u0010|\u001a\u00060Hj\u0002`{H\u0016¢\u0006\u0004\b}\u0010~J\u0017\u0010\u007f\u001a\u00020\u000f2\u0006\u0010e\u001a\u000206H\u0016¢\u0006\u0004\b\u007f\u0010gJ\u0019\u0010\u0080\u0001\u001a\u00020\u000f2\u0006\u0010e\u001a\u000206H\u0016¢\u0006\u0005\b\u0080\u0001\u0010gJ\u001c\u0010\u0083\u0001\u001a\u00020\u000f2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0011\u0010\u0085\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0085\u0001\u0010\bJ\u001a\u0010\u0087\u0001\u001a\u00020\u000f2\u0007\u0010\u0086\u0001\u001a\u00020HH\u0016¢\u0006\u0005\b\u0087\u0001\u0010cR*\u0010\u008f\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R*\u0010\u0097\u0001\u001a\u00030\u0090\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R*\u0010\u009f\u0001\u001a\u00030\u0098\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R!\u0010¥\u0001\u001a\u00030 \u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001R \u0010©\u0001\u001a\u00030¦\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b_\u0010¢\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R!\u0010®\u0001\u001a\u00030ª\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b«\u0001\u0010¢\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u001a\u0010²\u0001\u001a\u00030¯\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001a\u0010¶\u0001\u001a\u00030³\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u001a\u0010¸\u0001\u001a\u00030³\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010µ\u0001R\u0018\u0010º\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bd\u0010¹\u0001R\u0019\u0010¼\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¹\u0001R\u001f\u0010Á\u0001\u001a\n\u0012\u0005\u0012\u00030¾\u00010½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u001f\u0010Ã\u0001\u001a\n\u0012\u0005\u0012\u00030¾\u00010½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010À\u0001R\u001f\u0010Å\u0001\u001a\n\u0012\u0005\u0012\u00030¾\u00010½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010À\u0001R\u001f\u0010Ç\u0001\u001a\n\u0012\u0005\u0012\u00030¾\u00010½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010À\u0001R!\u0010Ì\u0001\u001a\n\u0012\u0005\u0012\u00030É\u00010È\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R!\u0010Î\u0001\u001a\n\u0012\u0005\u0012\u00030É\u00010È\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010Ë\u0001R\u0018\u0010Ò\u0001\u001a\u00030Ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001¨\u0006Õ\u0001²\u0006\u000f\u0010Ó\u0001\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010Ô\u0001\u001a\u00020H8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/CartActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "Lcom/meijer/mobile/meijer/activity/cart/z0$a;", "Lcom/meijer/mobile/meijer/activity/cart/CartBottomSheetDialogFragment$a;", "Lcom/meijer/mobile/meijer/activity/cart/EditBackUpItemBottomSheet$b;", "Lcom/meijer/mobile/meijer/activity/cart/CartActivityBottomSheet$b;", "LHm/f$a;", "<init>", "()V", "Lbk/a;", "title", "message", "positiveButtonText", "", "isOpenBottomSheet", "", "g3", "(Lbk/a;Lbk/a;Lbk/a;Z)V", "", "mPerksPoints", "appliedOffers", "m3", "(II)V", "f3", "s3", "Lg/a;", "result", "W2", "(Lg/a;)V", "Y2", "LPp/c;", "t3", "(Lg/a;)LPp/c;", "X2", "Z2", "L2", "Lcom/meijer/mobile/meijer/activity/cart/l0;", "cartMetaDataDecorator", "C2", "(Lcom/meijer/mobile/meijer/activity/cart/l0;)V", "Lcom/meijer/mobile/meijer/activity/cart/m0;", "cartMperksOfferDecorator", "I2", "(Lcom/meijer/mobile/meijer/activity/cart/m0;)V", "Lcom/meijer/mobile/meijer/activity/cart/n0;", "cartOrderSummaryDecorator", "Lcom/meijer/mobile/meijer/activity/checkout/review/L1;", "creditCardChargesDecorator", "Lcom/meijer/mobile/meijer/activity/checkout/review/N1;", "ebtCardChargesDecorator", "shouldUpdateVisibilityForTipText", "E2", "(Lcom/meijer/mobile/meijer/activity/cart/n0;Lcom/meijer/mobile/meijer/activity/checkout/review/L1;Lcom/meijer/mobile/meijer/activity/checkout/review/N1;Z)V", "", "Lvs/b;", "cartProductList", "H2", "(Ljava/util/List;)V", "productList", "J2", "Lcom/meijer/mobile/meijer/activity/cart/i1;", "promoCodeSectionDecorator", "K2", "(Lcom/meijer/mobile/meijer/activity/cart/i1;)V", "Lcom/meijer/mobile/meijer/activity/cart/E0$i;", "viewState", "B2", "(Lcom/meijer/mobile/meijer/activity/cart/E0$i;)V", "isAdjustEbt", "isDisplayEBTPinPad", "e3", "(ZZ)V", "", "j3", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/meijer/mobile/meijer/activity/cart/s0$a;", "action", "a3", "(Lcom/meijer/mobile/meijer/activity/cart/s0$a;)V", "p3", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "M0", "", "amount", "x0", "(D)V", "r0", "w", "M", "results", "g0", "(Ljava/lang/String;)V", "B", "item", "R", "(Lvs/b;)V", "k", "l", "i", "entryToUpdate", "LXj/t;", "valueState", "Landroid/graphics/Rect;", "stepperHitRect", "a1", "(Lvs/b;LXj/t;Landroid/graphics/Rect;)V", "n", "Lcom/meijer/mobile/meijer/activity/cart/k0;", "cartEntryActionDecorator", "Y0", "(Lcom/meijer/mobile/meijer/activity/cart/k0;)V", "entryNumber", "note", "b", "(ILjava/lang/String;)V", "Lcom/meijer/mobile/core/model/common/ResourceId;", "forProduct", "a", "(Ljava/lang/String;)Z", "K", "w0", "Lnk/f;", "product", "N0", "(Lnk/f;)V", "Q", "timerString", "D0", "Lwr/f;", "s", "Lwr/f;", "S2", "()Lwr/f;", "setCartInteractor", "(Lwr/f;)V", "cartInteractor", "LTq/j;", "t", "LTq/j;", "getStoreProvider", "()LTq/j;", "setStoreProvider", "(LTq/j;)V", "storeProvider", "LHm/f;", "u", "LHm/f;", "V2", "()LHm/f;", "setEbtTimer", "(LHm/f;)V", "ebtTimer", "Lcom/meijer/mobile/meijer/activity/cart/E0;", "v", "Lkotlin/Lazy;", "T2", "()Lcom/meijer/mobile/meijer/activity/cart/E0;", "cartViewModel", "LIl/b;", "getFulfillmentBarViewModel", "()LIl/b;", "fulfillmentBarViewModel", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r;", "x", "U2", "()Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r;", "ebtPinPadViewModel", "LNn/e;", "y", "LNn/e;", "binding", "Lju/l;", "z", "Lju/l;", "productsListSection", "A", "outOfStockProductsListSection", "Z", "showHVPOffersAppliedToast", "C", "isFinalPinPad", "Lg/c;", "Landroid/content/Intent;", "D", "Lg/c;", "clpResultLauncher", "E", "substitutionResultLauncher", "F", "hvpResultLauncher", "G", "unavailableForDeliveryResultLauncher", "Lju/d;", "Lju/g;", "H", "Lju/d;", "productsAdapter", "I", "outOfStockProductsAdapter", "Lcom/meijer/mobile/meijer/activity/cart/CartActivityBottomSheet;", "J", "Lcom/meijer/mobile/meijer/activity/cart/CartActivityBottomSheet;", "cartActivityBottomSheet", "toastIsOpen", "errorMessage", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class CartActivity extends Hilt_CartActivity implements C11904z0.a, CartBottomSheetDialogFragment.a, EditBackUpItemBottomSheet.b, CartActivityBottomSheet.b, f.a {

    /* renamed from: L, reason: collision with root package name */
    public static final int f101865L = 8;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private boolean showHVPOffersAppliedToast;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private boolean isFinalPinPad;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private C15069d<ju.g> productsAdapter;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private C15069d<ju.g> outOfStockProductsAdapter;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final CartActivityBottomSheet cartActivityBottomSheet;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public wr.f cartInteractor;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public Tq.j storeProvider;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public Hm.f ebtTimer;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private AbstractC4226e binding;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy cartViewModel = new androidx.view.e0(Reflection.b(E0.class), new m(this), new l(this), new n(null, this));

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy fulfillmentBarViewModel = new androidx.view.e0(Reflection.b(Il.b.class), new p(this), new o(this), new q(null, this));

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Lazy ebtPinPadViewModel = new androidx.view.e0(Reflection.b(com.meijer.mobile.meijer.activity.checkout.payment.ebt.r.class), new s(this), new r(this), new t(null, this));

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private ju.l productsListSection = new ju.l();

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private ju.l outOfStockProductsListSection = new ju.l();

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> clpResultLauncher = registerForActivityResult(new h.i(), new f());

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> substitutionResultLauncher = registerForActivityResult(new h.i(), new u());

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> hvpResultLauncher = registerForActivityResult(new h.i(), new g());

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> unavailableForDeliveryResultLauncher = registerForActivityResult(new h.i(), new v());

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CartMperksOfferDecorator f101884a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CartActivity f101885b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CartMperksOfferDecorator f101886a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CartActivity f101887b;

            a(CartMperksOfferDecorator cartMperksOfferDecorator, CartActivity cartActivity) {
                this.f101886a = cartMperksOfferDecorator;
                this.f101887b = cartActivity;
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
                CartMperksOfferDecorator cartMperksOfferDecorator = this.f101886a;
                final int appliedOffers = cartMperksOfferDecorator != null ? cartMperksOfferDecorator.getAppliedOffers() : 0;
                final z1 z1VarB = androidx.compose.runtime.o1.b(this.f101887b.T2().i0(), null, composer, 0, 1);
                int iIntValue = ((Number) z1VarB.getValue()).intValue();
                CartMperksOfferDecorator cartMperksOfferDecorator2 = this.f101886a;
                int availableOffers = cartMperksOfferDecorator2 != null ? cartMperksOfferDecorator2.getAvailableOffers() : 0;
                composer.startReplaceGroup(-1746271574);
                boolean zD = composer.D(this.f101887b) | composer.V(z1VarB) | composer.d(appliedOffers);
                final CartActivity cartActivity = this.f101887b;
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
                boolean zD2 = composer.D(this.f101887b) | composer.V(z1VarB) | composer.d(appliedOffers);
                final CartActivity cartActivity2 = this.f101887b;
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
                C12011e.f(AdsTheme, iIntValue, null, availableOffers, appliedOffers, function0, (Function0) objB2, composer, LocalThemeScope.f17314g | (i10 & 14), 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                c(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(CartActivity cartActivity, z1 z1Var, int i10) {
                cartActivity.hvpResultLauncher.a(MperksInCartActivity.INSTANCE.a(cartActivity, false, ((Number) z1Var.getValue()).intValue(), true, i10));
                cartActivity.T2().I0("mPerks:Cart Page:Apply Rewards button", String.valueOf(((Number) z1Var.getValue()).intValue()));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(CartActivity cartActivity, z1 z1Var, int i10) {
                cartActivity.hvpResultLauncher.a(MperksInCartActivity.INSTANCE.a(cartActivity, false, ((Number) z1Var.getValue()).intValue(), false, i10));
                return Unit.f143329a;
            }
        }

        b(CartMperksOfferDecorator cartMperksOfferDecorator, CartActivity cartActivity) {
            this.f101884a = cartMperksOfferDecorator;
            this.f101885b = cartActivity;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(133080815, i10, -1, "com.meijer.mobile.meijer.activity.cart.CartActivity.bindMperksInCart.<anonymous> (CartActivity.kt:844)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(-1591265858, true, new a(this.f101884a, this.f101885b), composer, 54), composer, 48, 1);
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
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CartMperksOfferDecorator f101888a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CartActivity f101889b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CartMperksOfferDecorator f101890a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CartActivity f101891b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.cart.CartActivity$c$a$a, reason: collision with other inner class name */
            static final class C1421a implements Function3<InterfaceC15162c0, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f101892a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AbstractC6392a f101893b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Context f101894c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ CartActivity f101895d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f101896e;

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(CartActivity cartActivity, InterfaceC5872l0 interfaceC5872l0) {
                    cartActivity.showHVPOffersAppliedToast = false;
                    a.d(interfaceC5872l0, false);
                    return Unit.f143329a;
                }

                C1421a(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, Context context, CartActivity cartActivity, InterfaceC5872l0<Boolean> interfaceC5872l0) {
                    this.f101892a = localThemeScope;
                    this.f101893b = abstractC6392a;
                    this.f101894c = context;
                    this.f101895d = cartActivity;
                    this.f101896e = interfaceC5872l0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit d(final CartActivity cartActivity, final InterfaceC5872l0 interfaceC5872l0, Di.o AdsToast) {
                    Intrinsics.j(AdsToast, "$this$AdsToast");
                    AdsToast.T(new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.w
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CartActivity.c.a.C1421a.e(cartActivity, interfaceC5872l0);
                        }
                    });
                    return Unit.f143329a;
                }

                public final void c(InterfaceC15162c0 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(1829523855, i10, -1, "com.meijer.mobile.meijer.activity.cart.CartActivity.bindMperksInCart.<anonymous>.<anonymous>.<anonymous> (CartActivity.kt:897)");
                    }
                    LocalThemeScope localThemeScope = this.f101892a;
                    String strB = this.f101893b.b(this.f101894c);
                    q1.m.Toast success = Assemble.getToastVariant().getSuccess();
                    composer.startReplaceGroup(-1633490746);
                    boolean zD = composer.D(this.f101895d) | composer.V(this.f101896e);
                    final CartActivity cartActivity = this.f101895d;
                    final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f101896e;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.cart.v
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CartActivity.c.a.C1421a.d(cartActivity, interfaceC5872l0, (Di.o) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Di.j.l(localThemeScope, null, strB, success, (Function1) objB, composer, LocalThemeScope.f17314g | (q1.m.Toast.f142384h << 9), 1);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15162c0 interfaceC15162c0, Composer composer, Integer num) {
                    c(interfaceC15162c0, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(CartMperksOfferDecorator cartMperksOfferDecorator, CartActivity cartActivity) {
                this.f101890a = cartMperksOfferDecorator;
                this.f101891b = cartActivity;
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
                CartMperksOfferDecorator cartMperksOfferDecorator = this.f101890a;
                AbstractC6392a appliedOffersNotification = cartMperksOfferDecorator != null ? cartMperksOfferDecorator.getAppliedOffersNotification() : null;
                boolean z10 = this.f101891b.showHVPOffersAppliedToast;
                composer.startReplaceGroup(5004770);
                boolean zA = composer.a(z10);
                Object objB = composer.B();
                if (zA || objB == Composer.INSTANCE.a()) {
                    objB = androidx.compose.runtime.t1.e(Boolean.TRUE, null, 2, null);
                    composer.t(objB);
                }
                InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
                composer.P();
                if (this.f101891b.showHVPOffersAppliedToast && c(interfaceC5872l0) && appliedOffersNotification != null) {
                    Ki.Q.e(AdsTheme, ki.b1.f142020a, ComposableLambdaKt.c(1829523855, true, new C1421a(AdsTheme, appliedOffersNotification, context, this.f101891b, interfaceC5872l0), composer, 54), composer, (i10 & 14) | LocalThemeScope.f17314g | 384 | (ki.b1.f142021b << 3));
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                b(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            private static final boolean c(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                return interfaceC5872l0.getValue().booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void d(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
                interfaceC5872l0.setValue(Boolean.valueOf(z10));
            }
        }

        c(CartMperksOfferDecorator cartMperksOfferDecorator, CartActivity cartActivity) {
            this.f101888a = cartMperksOfferDecorator;
            this.f101889b = cartActivity;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1469319206, i10, -1, "com.meijer.mobile.meijer.activity.cart.CartActivity.bindMperksInCart.<anonymous> (CartActivity.kt:883)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(-2065424587, true, new a(this.f101888a, this.f101889b), composer, 54), composer, 48, 1);
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
    /* synthetic */ class d extends FunctionReferenceImpl implements Function1<C11890s0.a, Unit> {
        d(Object obj) {
            super(1, obj, CartActivity.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/cart/CartOutOfStockProductListItem$OutOfStockItemAction;)V", 0);
        }

        public final void a(C11890s0.a p02) {
            Intrinsics.j(p02, "p0");
            ((CartActivity) this.receiver).a3(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C11890s0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PromoCodeSectionDecorator f101897a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CartActivity f101898b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CartActivity f101899a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f101900b;

            a(CartActivity cartActivity, InterfaceC5872l0<String> interfaceC5872l0) {
                this.f101899a = cartActivity;
                this.f101900b = interfaceC5872l0;
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
                String strC = e.c(this.f101900b);
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f101899a);
                final CartActivity cartActivity = this.f101899a;
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
                boolean zD2 = composer.D(this.f101899a);
                final CartActivity cartActivity2 = this.f101899a;
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
                X.e(AdsTheme, modifierM, strC, function1, (Function1) objB2, composer, LocalThemeScope.f17314g | (i11 & 14), 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(CartActivity cartActivity, String it) {
                Intrinsics.j(it, "it");
                cartActivity.T2().n0(new E0.AbstractC11813f.ResetPromoCodeSectionDecorator(it));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(CartActivity cartActivity, String text) {
                Intrinsics.j(text, "text");
                cartActivity.T2().n0(new E0.AbstractC11813f.PromoCodeFieldEndIconAction(text));
                return Unit.f143329a;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                c(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        e(PromoCodeSectionDecorator promoCodeSectionDecorator, CartActivity cartActivity) {
            this.f101897a = promoCodeSectionDecorator;
            this.f101898b = cartActivity;
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
            InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composer.P();
            composer.startReplaceGroup(-835059231);
            PromoCodeSectionDecorator promoCodeSectionDecorator = this.f101897a;
            CartActivity cartActivity = this.f101898b;
            int promoCodeState = promoCodeSectionDecorator.getPromoCodeState();
            composer.startReplaceGroup(-835058563);
            if (promoCodeState == 0) {
                d(interfaceC5872l0, "");
            } else if (promoCodeState == 1) {
                d(interfaceC5872l0, "");
                cartActivity.T2().n0(E0.AbstractC11813f.B.f102162a);
            } else if (promoCodeState == 2) {
                d(interfaceC5872l0, C13698b.a(promoCodeSectionDecorator.getMessage(), composer, AbstractC6392a.f60445b));
                AbstractC4226e abstractC4226e = cartActivity.binding;
                if (abstractC4226e == null) {
                    Intrinsics.x("binding");
                    abstractC4226e = null;
                }
                NestedScrollView nestedScrollView = abstractC4226e.f21872I;
                AbstractC4226e abstractC4226e2 = cartActivity.binding;
                if (abstractC4226e2 == null) {
                    Intrinsics.x("binding");
                    abstractC4226e2 = null;
                }
                nestedScrollView.scrollTo(0, (int) abstractC4226e2.f21890a0.f22413A.getY());
            }
            composer.P();
            composer.P();
            Ki.K.b(null, ComposableLambdaKt.c(676398325, true, new a(this.f101898b, interfaceC5872l0), composer, 54), composer, 48, 1);
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
        public static final String c(InterfaceC5872l0<String> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        private static final void d(InterfaceC5872l0<String> interfaceC5872l0, String str) {
            interfaceC5872l0.setValue(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class f implements InterfaceC14275b, FunctionAdapter {
        f() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
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

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            CartActivity.this.W2(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class g implements InterfaceC14275b, FunctionAdapter {
        g() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
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

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
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
            final /* synthetic */ z1<FulfillmentBarDecorator> f101904a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CartActivity f101905b;

            a(z1<FulfillmentBarDecorator> z1Var, CartActivity cartActivity) {
                this.f101904a = z1Var;
                this.f101905b = cartActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(CartActivity cartActivity) {
                cartActivity.startActivity(OrderOptionsActivity.INSTANCE.b(cartActivity, "Meijer:CartPage"));
                return Unit.f143329a;
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
                FulfillmentBarDecorator value = this.f101904a.getValue();
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f101905b);
                final CartActivity cartActivity = this.f101905b;
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
                Il.g.b(AdsTheme, value, null, (Function0) objB, composer, (i10 & 14) | LocalThemeScope.f17314g | (FulfillmentBarDecorator.f14849m << 3), 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                b(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
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
            Ki.K.b(null, ComposableLambdaKt.c(108584808, true, new a(androidx.compose.runtime.o1.b(CartActivity.this.getFulfillmentBarViewModel().n(), null, composer, 0, 1), CartActivity.this), composer, 54), composer, 48, 1);
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
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.cart.CartActivity$onCreate$9", f = "CartActivity.kt", l = {651}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f101920a;

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
            int f101922a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f101923b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ CartActivity f101924c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CartActivity cartActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f101924c = cartActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f101924c, continuation);
                aVar.f101923b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(r.h hVar, Continuation<? super Unit> continuation) {
                return ((a) create(hVar, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
                IntrinsicsKt.f();
                if (this.f101922a == 0) {
                    ResultKt.b(obj);
                    r.h hVar = (r.h) this.f101923b;
                    if (hVar instanceof r.h.a) {
                        if (this.f101924c.isFinalPinPad) {
                            this.f101924c.T2().n0(E0.AbstractC11813f.C11817d.f102188a);
                            this.f101924c.cartActivityBottomSheet.dismiss();
                        } else {
                            this.f101924c.T2().n0(E0.AbstractC11813f.C11827o.f102200a);
                            this.f101924c.T2().n0(new E0.AbstractC11813f.UpdateLoader(false));
                        }
                    } else if (hVar instanceof r.h.ShowErrorState) {
                        if (this.f101924c.isFinalPinPad) {
                            this.f101924c.cartActivityBottomSheet.dismiss();
                        } else {
                            this.f101924c.T2().n0(E0.AbstractC11813f.C11827o.f102200a);
                            this.f101924c.T2().n0(new E0.AbstractC11813f.UpdateLoader(false));
                        }
                        r.h.ShowErrorState showErrorState = (r.h.ShowErrorState) hVar;
                        String errorCode = showErrorState.getErrorCode();
                        if (errorCode != null && errorCode.length() != 0) {
                            Hm.a aVarA = Hm.a.INSTANCE.a(showErrorState.getErrorCode());
                            CartActivity cartActivity = this.f101924c;
                            String string = cartActivity.getResources().getString(aVarA.getHeaderResourceId());
                            Intrinsics.i(string, "getString(...)");
                            String string2 = this.f101924c.getResources().getString(aVarA.getMessageResourceId());
                            Intrinsics.i(string2, "getString(...)");
                            cartActivity.j3(string, string2);
                        } else if (!this.f101924c.V2().getTimerRunningStatus()) {
                            this.f101924c.p3();
                        }
                    } else if (hVar instanceof r.h.HandlePinPadSuccess) {
                        if (this.f101924c.isFinalPinPad) {
                            this.f101924c.cartActivityBottomSheet.dismiss();
                            this.f101924c.V2().g();
                            this.f101924c.T2().n0(E0.AbstractC11813f.C11823k.f102196a);
                        } else {
                            this.f101924c.T2().n0(new E0.AbstractC11813f.SetEBTCurrentCardBalance(((r.h.HandlePinPadSuccess) hVar).getEbtBalance()));
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f101920a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f interfaceC16561fO = C16563h.O(CartActivity.this.U2().G().a(), new a(CartActivity.this, null));
                this.f101920a = 1;
                if (C16563h.j(interfaceC16561fO, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class l extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f101925f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentActivity componentActivity) {
            super(0);
            this.f101925f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f101925f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class m extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f101926f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentActivity componentActivity) {
            super(0);
            this.f101926f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f101926f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class n extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f101927f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f101928g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f101927f = function0;
            this.f101928g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f101927f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f101928g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class o extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f101929f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentActivity componentActivity) {
            super(0);
            this.f101929f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f101929f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class p extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f101930f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentActivity componentActivity) {
            super(0);
            this.f101930f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f101930f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class q extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f101931f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f101932g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f101931f = function0;
            this.f101932g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f101931f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f101932g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class r extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f101933f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentActivity componentActivity) {
            super(0);
            this.f101933f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f101933f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class s extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f101934f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ComponentActivity componentActivity) {
            super(0);
            this.f101934f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f101934f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class t extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f101935f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f101936g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f101935f = function0;
            this.f101936g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f101935f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f101936g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class u implements InterfaceC14275b, FunctionAdapter {
        u() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
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

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            CartActivity.this.Y2(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class v implements InterfaceC14275b, FunctionAdapter {
        v() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
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

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            CartActivity.this.Z2(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F2(CartActivity cartActivity) {
        cartActivity.e3(true, false);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G2(CartActivity cartActivity) {
        cartActivity.e3(false, false);
        return Unit.f143329a;
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
        int f101906a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f101907b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ E0.CartViewState f101909a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CartActivity f101910b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.cart.CartActivity$i$a$a, reason: collision with other inner class name */
            static final class C1422a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ E0.CartViewState f101911a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ CartActivity f101912b;

                C1422a(E0.CartViewState c11836i, CartActivity cartActivity) {
                    this.f101911a = c11836i;
                    this.f101912b = cartActivity;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(CartActivity cartActivity, GoogleAdAnalytics googleAdAnalytics) {
                    Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
                    cartActivity.T2().n0(new E0.AbstractC11813f.GoogleAdClicked(googleAdAnalytics));
                    return Unit.f143329a;
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
                    GoogleAdData googleAdDataR = this.f101911a.getGoogleAdData();
                    if (googleAdDataR != null) {
                        final CartActivity cartActivity = this.f101912b;
                        Modifier modifierD = androidx.compose.foundation.b.d(Modifier.INSTANCE, C5489q0.INSTANCE.k(), null, 2, null);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(cartActivity);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.cart.A
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CartActivity.i.a.C1422a.c(cartActivity, (GoogleAdAnalytics) obj);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        sr.p.C(AdsTheme, modifierD, googleAdDataR, (Function1) objB, composer, (i10 & 14) | LocalThemeScope.f17314g | 48 | (GoogleAdData.f134248f << 6), 0);
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                    b(localThemeScope, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(E0.CartViewState c11836i, CartActivity cartActivity) {
                this.f101909a = c11836i;
                this.f101910b = cartActivity;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1788739767, i10, -1, "com.meijer.mobile.meijer.activity.cart.CartActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CartActivity.kt:302)");
                }
                Ki.K.b(null, ComposableLambdaKt.c(870123078, true, new C1422a(this.f101909a, this.f101910b), composer, 54), composer, 48, 1);
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
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ E0.CartViewState f101913a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CartActivity f101914b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ E0.CartViewState f101915a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ CartActivity f101916b;

                a(E0.CartViewState c11836i, CartActivity cartActivity) {
                    this.f101915a = c11836i;
                    this.f101916b = cartActivity;
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
                    E0.CartViewState c11836i = this.f101915a;
                    composer.startReplaceGroup(-1633490746);
                    boolean zD = composer.D(this.f101916b) | composer.D(this.f101915a);
                    final CartActivity cartActivity = this.f101916b;
                    final E0.CartViewState c11836i2 = this.f101915a;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.B
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CartActivity.i.b.a.c(cartActivity, c11836i2);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    X.c(AdsTheme, null, c11836i, (Function0) objB, composer, LocalThemeScope.f17314g | (i10 & 14), 1);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                    b(localThemeScope, composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(CartActivity cartActivity, E0.CartViewState c11836i) {
                    cartActivity.B2(c11836i);
                    cartActivity.e3(false, true);
                    return Unit.f143329a;
                }
            }

            b(E0.CartViewState c11836i, CartActivity cartActivity) {
                this.f101913a = c11836i;
                this.f101914b = cartActivity;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-558497096, i10, -1, "com.meijer.mobile.meijer.activity.cart.CartActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CartActivity.kt:318)");
                }
                Ki.K.b(null, ComposableLambdaKt.c(-1477113785, true, new a(this.f101913a, this.f101914b), composer, 54), composer, 48, 1);
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

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            i iVar = CartActivity.this.new i(continuation);
            iVar.f101907b = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(E0.CartViewState c11836i, Continuation<? super Unit> continuation) {
            return ((i) create(c11836i, continuation)).invokeSuspend(Unit.f143329a);
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
            if (this.f101906a == 0) {
                ResultKt.b(obj);
                E0.CartViewState c11836i = (E0.CartViewState) this.f101907b;
                AbstractC4226e abstractC4226e = CartActivity.this.binding;
                AbstractC4226e abstractC4226e2 = null;
                if (abstractC4226e == null) {
                    Intrinsics.x("binding");
                    abstractC4226e = null;
                }
                CartActivity cartActivity = CartActivity.this;
                if (!cartActivity.V2().getTimerRunningStatus()) {
                    abstractC4226e.f21894e0.X(c11836i.getLoadingState().getIsLoading(), false);
                }
                Group oosGroup = abstractC4226e.f21887X;
                Intrinsics.i(oosGroup, "oosGroup");
                int i19 = 8;
                if (!c11836i.j().isEmpty()) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                oosGroup.setVisibility(i10);
                MaterialButton removeAllOosButton = abstractC4226e.f21895f0;
                Intrinsics.i(removeAllOosButton, "removeAllOosButton");
                if (!c11836i.j().isEmpty()) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                removeAllOosButton.setVisibility(i11);
                View bottomCalloutDivider = abstractC4226e.f21866C;
                Intrinsics.i(bottomCalloutDivider, "bottomCalloutDivider");
                if (!c11836i.j().isEmpty()) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                bottomCalloutDivider.setVisibility(i12);
                MaterialTextView materialTextView = abstractC4226e.f21869F;
                Intrinsics.g(materialTextView);
                ck.d.g(materialTextView, c11836i.getCartIdText());
                if (c11836i.getCartIdText() != null) {
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
                MaterialButton materialButton = abstractC4226e.f21873J;
                Intrinsics.g(materialButton);
                ck.d.g(materialButton, c11836i.getCheckoutButtonText());
                if (c11836i.getIsOrderUnderModification()) {
                    i14 = 8;
                } else {
                    i14 = 0;
                }
                materialButton.setVisibility(i14);
                Group updateButtonGroup = abstractC4226e.f21896g0;
                Intrinsics.i(updateButtonGroup, "updateButtonGroup");
                if (c11836i.getIsOrderUnderModification()) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                updateButtonGroup.setVisibility(i15);
                MaterialButton updateOrderButton = abstractC4226e.f21897h0;
                Intrinsics.i(updateOrderButton, "updateOrderButton");
                ck.d.g(updateOrderButton, c11836i.getUpdateOrderButtonText());
                ComposeView fulfillmentBarInclude = abstractC4226e.f21880Q;
                Intrinsics.i(fulfillmentBarInclude, "fulfillmentBarInclude");
                if (c11836i.getIsOrderUnderModification()) {
                    i16 = 8;
                } else {
                    i16 = 0;
                }
                fulfillmentBarInclude.setVisibility(i16);
                MaterialButton addItemsButton = abstractC4226e.f21898z;
                Intrinsics.i(addItemsButton, "addItemsButton");
                if (c11836i.getIsOrderUnderModification()) {
                    i17 = 0;
                } else {
                    i17 = 8;
                }
                addItemsButton.setVisibility(i17);
                MaterialButton emptyCartButton = abstractC4226e.f21878O;
                Intrinsics.i(emptyCartButton, "emptyCartButton");
                if (c11836i.getIsOrderUnderModification()) {
                    i18 = 8;
                } else {
                    i18 = 0;
                }
                emptyCartButton.setVisibility(i18);
                ConstraintLayout alcoholRestrictionCard = abstractC4226e.f21864A.f22240z;
                Intrinsics.i(alcoholRestrictionCard, "alcoholRestrictionCard");
                if (c11836i.getEditOrderHasAlcohol()) {
                    i19 = 0;
                }
                alcoholRestrictionCard.setVisibility(i19);
                if (cartActivity.getFeatureManager().e(AbstractC18503f.C.f172844h)) {
                    abstractC4226e.f21882S.setContent(ComposableLambdaKt.composableLambdaInstance(1788739767, true, new a(c11836i, cartActivity)));
                }
                if (cartActivity.V2().getTimerRunningStatus()) {
                    ComposeView ebtTimerCard = abstractC4226e.f21876M;
                    Intrinsics.i(ebtTimerCard, "ebtTimerCard");
                    ebtTimerCard.setVisibility(0);
                    abstractC4226e.f21876M.setContent(ComposableLambdaKt.composableLambdaInstance(-558497096, true, new b(c11836i, cartActivity)));
                }
                if (c11836i.getDisplayEligibleForDelivery()) {
                    AbstractC4226e abstractC4226e3 = cartActivity.binding;
                    if (abstractC4226e3 == null) {
                        Intrinsics.x("binding");
                        abstractC4226e3 = null;
                    }
                    LinearLayout eligibleForDeliverySection = abstractC4226e3.f21877N;
                    Intrinsics.i(eligibleForDeliverySection, "eligibleForDeliverySection");
                    eligibleForDeliverySection.setVisibility(0);
                    AbstractC4226e abstractC4226e4 = cartActivity.binding;
                    if (abstractC4226e4 == null) {
                        Intrinsics.x("binding");
                    } else {
                        abstractC4226e2 = abstractC4226e4;
                    }
                    abstractC4226e2.f21883T.setBackgroundColor(Cj.r.b(cartActivity, C6503b.f61556s, null, false, 6, null));
                }
                cartActivity.I2(c11836i.getCartMperksOfferDecorator());
                CartActivity.this.C2(c11836i.getCartMetaDataDecorator());
                CartActivity.this.E2(c11836i.getCartOrderSummaryDecorator(), c11836i.getCreditCardCharges(), c11836i.getEbtCardCharges(), false);
                CartActivity.this.H2(c11836i.i());
                CartActivity.this.J2(c11836i.j());
                CartActivity.this.K2(c11836i.getPromoCodeSectionDecorator());
                CartActivity.this.B2(c11836i);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/E0$g;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/cart/E0$g;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.cart.CartActivity$onCreate$8", f = "CartActivity.kt", l = {}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<E0.AbstractC11832g, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f101917a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f101918b;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            j jVar = CartActivity.this.new j(continuation);
            jVar.f101918b = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public final Object invoke(E0.AbstractC11832g abstractC11832g, Continuation<? super Unit> continuation) {
            return ((j) create(abstractC11832g, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void C(CartActivity cartActivity, DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            cartActivity.f3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void D(CartActivity cartActivity, DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            cartActivity.T2().n0(E0.AbstractC11813f.M.f102175a);
            cartActivity.T2().E0(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void E(CartActivity cartActivity, DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            cartActivity.T2().E0(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void G(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void u(CartActivity cartActivity, DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            cartActivity.T2().n0(E0.AbstractC11813f.C11820h.f102193a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void v(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void x(CartActivity cartActivity, DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            cartActivity.T2().n0(E0.AbstractC11813f.C11816c.f102187a);
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
            if (this.f101917a == 0) {
                ResultKt.b(obj);
                E0.AbstractC11832g abstractC11832g = (E0.AbstractC11832g) this.f101918b;
                AbstractC4226e abstractC4226e = null;
                if (abstractC11832g instanceof E0.AbstractC11832g.FailEvent) {
                    AbstractC4226e abstractC4226e2 = CartActivity.this.binding;
                    if (abstractC4226e2 == null) {
                        Intrinsics.x("binding");
                    } else {
                        abstractC4226e = abstractC4226e2;
                    }
                    Snackbar.q0(abstractC4226e.getRoot(), ((E0.AbstractC11832g.FailEvent) abstractC11832g).getMessageResId(), 0).c0();
                } else if (abstractC11832g instanceof E0.AbstractC11832g.z) {
                    CartActivity cartActivity = CartActivity.this;
                    cartActivity.startActivity(cartActivity.getMeijerIntent().p(CartActivity.this, true));
                } else if (abstractC11832g instanceof E0.AbstractC11832g.ShowEmptyCartDialogEvent) {
                    E0.AbstractC11832g.ShowEmptyCartDialogEvent rVar = (E0.AbstractC11832g.ShowEmptyCartDialogEvent) abstractC11832g;
                    C15485b message = new C15485b(CartActivity.this).setTitle(rVar.getTitle()).setCancelable(true).setMessage(rVar.getMessage());
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
                } else if (abstractC11832g instanceof E0.AbstractC11832g.GoProductDetailEvent) {
                    CartActivity.this.clpResultLauncher.a(Bl.g.t(CartActivity.this.getFeatureEntryPoint(), ((E0.AbstractC11832g.GoProductDetailEvent) abstractC11832g).getProduct(), false, true, null, 8, null));
                } else if (abstractC11832g instanceof E0.AbstractC11832g.StartCheckoutEvent) {
                    CartActivity.this.s3();
                } else if (abstractC11832g instanceof E0.AbstractC11832g.ShowEntryOptionsEvent) {
                    CartBottomSheetDialogFragment.INSTANCE.a(((E0.AbstractC11832g.ShowEntryOptionsEvent) abstractC11832g).getCartEntryActionDecorator()).show(CartActivity.this.getSupportFragmentManager(), "cart_bottom_sheet_tag");
                } else if (abstractC11832g instanceof E0.AbstractC11832g.ShowCancelUpdateDialog) {
                    E0.AbstractC11832g.ShowCancelUpdateDialog mVar = (E0.AbstractC11832g.ShowCancelUpdateDialog) abstractC11832g;
                    C15485b message2 = new C15485b(CartActivity.this).setTitle(ck.d.a(CartActivity.this, mVar.getTitle())).setMessage(ck.d.a(CartActivity.this, mVar.getMessage()));
                    String strA = ck.d.a(CartActivity.this, mVar.getPositiveButtonText());
                    final CartActivity cartActivity3 = CartActivity.this;
                    message2.setPositiveButton(strA, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.E
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            CartActivity.j.x(cartActivity3, dialogInterface, i10);
                        }
                    }).setNegativeButton(ck.d.a(CartActivity.this, mVar.getNegativeButtonText()), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.F
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            CartActivity.j.y(dialogInterface, i10);
                        }
                    }).show();
                } else if (abstractC11832g instanceof E0.AbstractC11832g.d) {
                    CartActivity.this.f3();
                } else if (abstractC11832g instanceof E0.AbstractC11832g.CancelUpdateOrderErrorDialog) {
                    E0.AbstractC11832g.CancelUpdateOrderErrorDialog c11833a = (E0.AbstractC11832g.CancelUpdateOrderErrorDialog) abstractC11832g;
                    CartActivity.h3(CartActivity.this, c11833a.getTitle(), c11833a.getMessage(), c11833a.getPositiveButtonText(), false, 8, null);
                } else if (abstractC11832g instanceof E0.AbstractC11832g.UpdateOrderSuccess) {
                    CartActivity.this.V2().g();
                    CartActivity cartActivity4 = CartActivity.this;
                    cartActivity4.startActivity(OrderConfirmationActivity.Companion.b(OrderConfirmationActivity.INSTANCE, cartActivity4, ((E0.AbstractC11832g.UpdateOrderSuccess) abstractC11832g).getOrderId(), null, null, false, 28, null));
                } else if (abstractC11832g instanceof E0.AbstractC11832g.ShowUpdateOrderFailureMessage) {
                    E0.AbstractC11832g.ShowUpdateOrderFailureMessage xVar = (E0.AbstractC11832g.ShowUpdateOrderFailureMessage) abstractC11832g;
                    CartActivity.h3(CartActivity.this, xVar.getTitle(), xVar.getMessage(), xVar.getPositiveButtonText(), false, 8, null);
                } else if (abstractC11832g instanceof E0.AbstractC11832g.f) {
                    if (CartActivity.this.getFeatureManager().e(AbstractC18503f.t0.f172905h)) {
                        CartActivity cartActivity5 = CartActivity.this;
                        cartActivity5.startActivity(Bl.h.c(cartActivity5, Pp.b.f26238a, null, null, false, null, 60, null));
                    } else {
                        CartActivity cartActivity6 = CartActivity.this;
                        cartActivity6.startActivity(Bl.h.g(cartActivity6, Pp.b.f26238a, null, null, false, null, 60, null));
                    }
                } else if (abstractC11832g instanceof E0.AbstractC11832g.ShowHighValuePromoEvent) {
                    E0.AbstractC11832g.ShowHighValuePromoEvent tVar = (E0.AbstractC11832g.ShowHighValuePromoEvent) abstractC11832g;
                    CartActivity.this.m3(tVar.getMPerksPoints(), tVar.getAppliedOffers());
                } else if (abstractC11832g instanceof E0.AbstractC11832g.C11834b) {
                    AbstractC4226e abstractC4226e3 = CartActivity.this.binding;
                    if (abstractC4226e3 == null) {
                        Intrinsics.x("binding");
                        abstractC4226e3 = null;
                    }
                    Snackbar snackbarR0 = Snackbar.r0(abstractC4226e3.getRoot(), CartActivity.this.getResources().getString(Cj.o.f5079o0), -1);
                    AbstractC4226e abstractC4226e4 = CartActivity.this.binding;
                    if (abstractC4226e4 == null) {
                        Intrinsics.x("binding");
                    } else {
                        abstractC4226e = abstractC4226e4;
                    }
                    snackbarR0.X(abstractC4226e.f21867D).c0();
                } else if (abstractC11832g instanceof E0.AbstractC11832g.ShowSelectFulfillmentDialogEvent) {
                    E0.AbstractC11832g.ShowSelectFulfillmentDialogEvent wVar = (E0.AbstractC11832g.ShowSelectFulfillmentDialogEvent) abstractC11832g;
                    C15485b message3 = new C15485b(CartActivity.this).setCancelable(false).setTitle(ck.d.a(CartActivity.this, wVar.getTitle())).setMessage(ck.d.a(CartActivity.this, wVar.getMessage()));
                    String strA2 = ck.d.a(CartActivity.this, wVar.getPositiveButtonText());
                    final CartActivity cartActivity7 = CartActivity.this;
                    message3.setPositiveButton(strA2, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.G
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            CartActivity.j.z(cartActivity7, dialogInterface, i10);
                        }
                    }).show();
                } else if (abstractC11832g instanceof E0.AbstractC11832g.ShowOutOfStockDialogEvent) {
                    CartActivity.this.substitutionResultLauncher.a(OutOfStockActivity.INSTANCE.a(CartActivity.this, CollectionsExtensionsKt.toArrayList(((E0.AbstractC11832g.ShowOutOfStockDialogEvent) abstractC11832g).a())));
                } else if (abstractC11832g instanceof E0.AbstractC11832g.Show503Error) {
                    E0.AbstractC11832g.Show503Error lVar = (E0.AbstractC11832g.Show503Error) abstractC11832g;
                    C15485b message4 = new C15485b(CartActivity.this).setCancelable(false).setTitle(ck.d.a(CartActivity.this, lVar.getTitle())).setMessage(ck.d.a(CartActivity.this, lVar.getMessage()));
                    String strA3 = ck.d.a(CartActivity.this, lVar.getPositiveButtonText());
                    final CartActivity cartActivity8 = CartActivity.this;
                    message4.setPositiveButton(strA3, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.H
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            CartActivity.j.C(cartActivity8, dialogInterface, i10);
                        }
                    }).show();
                } else if (abstractC11832g instanceof E0.AbstractC11832g.ShowLowStockDialogEvent) {
                    E0.AbstractC11832g.ShowLowStockDialogEvent uVar = (E0.AbstractC11832g.ShowLowStockDialogEvent) abstractC11832g;
                    C15485b message5 = new C15485b(CartActivity.this).setTitle(uVar.getTitle()).setCancelable(false).setMessage(uVar.getMessage());
                    int iC2 = uVar.getPositiveButtonText();
                    final CartActivity cartActivity9 = CartActivity.this;
                    C15485b positiveButton = message5.setPositiveButton(iC2, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.I
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            CartActivity.j.D(cartActivity9, dialogInterface, i10);
                        }
                    });
                    int iB = uVar.getNegativeButtonText();
                    final CartActivity cartActivity10 = CartActivity.this;
                    positiveButton.setNegativeButton(iB, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.J
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            CartActivity.j.E(cartActivity10, dialogInterface, i10);
                        }
                    }).show();
                } else if (abstractC11832g instanceof E0.AbstractC11832g.TriggerScrollingEvent) {
                    AbstractC4226e abstractC4226e5 = CartActivity.this.binding;
                    if (abstractC4226e5 == null) {
                        Intrinsics.x("binding");
                        abstractC4226e5 = null;
                    }
                    NestedScrollView nestedScrollView = abstractC4226e5.f21872I;
                    CartActivity cartActivity11 = CartActivity.this;
                    AbstractC4226e abstractC4226e6 = cartActivity11.binding;
                    if (abstractC4226e6 == null) {
                        Intrinsics.x("binding");
                        abstractC4226e6 = null;
                    }
                    int y10 = (int) abstractC4226e6.f21893d0.getY();
                    AbstractC4226e abstractC4226e7 = cartActivity11.binding;
                    if (abstractC4226e7 == null) {
                        Intrinsics.x("binding");
                    } else {
                        abstractC4226e = abstractC4226e7;
                    }
                    nestedScrollView.scrollTo(0, y10 + ((int) abstractC4226e.f21893d0.getChildAt(((E0.AbstractC11832g.TriggerScrollingEvent) abstractC11832g).getScrollPosition()).getY()));
                } else if (abstractC11832g instanceof E0.AbstractC11832g.o) {
                    new C15485b(CartActivity.this).setTitle(C17284b.f163266C).setCancelable(true).setMessage(C17284b.f163264B).setPositiveButton(C17284b.f163305W, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.K
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            CartActivity.j.G(dialogInterface, i10);
                        }
                    }).show();
                } else if (!(abstractC11832g instanceof E0.AbstractC11832g.p)) {
                    if (abstractC11832g instanceof E0.AbstractC11832g.OpenCartActivityBottomSheet) {
                        E0.AbstractC11832g.OpenCartActivityBottomSheet iVar = (E0.AbstractC11832g.OpenCartActivityBottomSheet) abstractC11832g;
                        CartActivity.this.e3(iVar.getIsAdjustEbtClicked(), iVar.getIsDisplayEBTPinPad());
                    } else if (abstractC11832g instanceof E0.AbstractC11832g.OpenEBTGetBalancePinPadEvent) {
                        E0.AbstractC11832g.OpenEBTGetBalancePinPadEvent kVar = (E0.AbstractC11832g.OpenEBTGetBalancePinPadEvent) abstractC11832g;
                        CartActivity.this.e3(kVar.getIsAdjustEbtClicked(), kVar.getIsDisplayEBTPinPad());
                    } else if (abstractC11832g instanceof E0.AbstractC11832g.OpenEBTCheckoutPinPadEvent) {
                        AbstractC4226e abstractC4226e8 = CartActivity.this.binding;
                        if (abstractC4226e8 == null) {
                            Intrinsics.x("binding");
                        } else {
                            abstractC4226e = abstractC4226e8;
                        }
                        abstractC4226e.f21894e0.X(false, false);
                        CartActivity.this.isFinalPinPad = true;
                        CartActivity.this.T2().n0(new E0.AbstractC11813f.UpdateAcculynkPostBody(((E0.AbstractC11832g.OpenEBTCheckoutPinPadEvent) abstractC11832g).getAcculynkPostBody(), CartActivity.this.isFinalPinPad));
                        if (!CartActivity.this.V2().getTimerRunningStatus()) {
                            CartActivity.this.V2().l(115L);
                        }
                        CartActivity.this.V2().k(CartActivity.this);
                    } else if (abstractC11832g instanceof E0.AbstractC11832g.ShowEBTErrorDialog) {
                        CartActivity cartActivity12 = CartActivity.this;
                        E0.AbstractC11832g.ShowEBTErrorDialog qVar = (E0.AbstractC11832g.ShowEBTErrorDialog) abstractC11832g;
                        String string = cartActivity12.getResources().getString(qVar.getTitle());
                        Intrinsics.i(string, "getString(...)");
                        String string2 = CartActivity.this.getResources().getString(qVar.getMessage());
                        Intrinsics.i(string2, "getString(...)");
                        cartActivity12.j3(string, string2);
                    } else if (abstractC11832g instanceof E0.AbstractC11832g.NavigateToOrderDetailEvent) {
                        CartActivity cartActivity13 = CartActivity.this;
                        Bl.l lVar2 = Bl.l.f3131a;
                        String strA4 = ((E0.AbstractC11832g.NavigateToOrderDetailEvent) abstractC11832g).getOrderId();
                        if (strA4 == null) {
                            strA4 = "";
                        }
                        cartActivity13.startActivity(Bl.l.b(lVar2, cartActivity13, strA4, null, null, 12, null));
                        CartActivity.this.finish();
                    } else if (abstractC11832g instanceof E0.AbstractC11832g.NavigateToNotAvailableForDeliveryEvent) {
                        CartActivity.this.unavailableForDeliveryResultLauncher.a(UnavailableForDeliveryActivity.INSTANCE.a(CartActivity.this, CollectionsExtensionsKt.toArrayList(((E0.AbstractC11832g.NavigateToNotAvailableForDeliveryEvent) abstractC11832g).a())));
                    } else if (abstractC11832g instanceof E0.AbstractC11832g.ShowCheckBalanceMessage) {
                        E0.AbstractC11832g.ShowCheckBalanceMessage nVar = (E0.AbstractC11832g.ShowCheckBalanceMessage) abstractC11832g;
                        CartActivity.this.g3(nVar.getTitle(), nVar.getMessage(), nVar.getPositiveButtonText(), true);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B2(E0.CartViewState viewState) {
        this.cartActivityBottomSheet.j1(viewState.getAdjustEbtPaymentDecorator());
        this.cartActivityBottomSheet.i1(viewState.getIsAdjustEbtClicked());
        this.cartActivityBottomSheet.l1(getFeatureManager().e(AbstractC18503f.C18528z.f172916h));
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
                navigationHelper.Y((totalItems == 0 ? AbstractC6392a.INSTANCE.d(C17284b.f163345s, new Object[0]) : AbstractC6392a.INSTANCE.b(C17283a.f163258a, totalItems, new Object[0])).b(this));
            }
            AbstractC4226e abstractC4226e = this.binding;
            AbstractC4226e abstractC4226e2 = null;
            if (abstractC4226e == null) {
                Intrinsics.x("binding");
                abstractC4226e = null;
            }
            ConstraintLayout cartScreen = abstractC4226e.f21871H;
            Intrinsics.i(cartScreen, "cartScreen");
            cartScreen.setVisibility(V2().getTimerRunningStatus() ? false : cartMetaDataDecorator.g() ? 0 : 8);
            AbstractC4226e abstractC4226e3 = this.binding;
            if (abstractC4226e3 == null) {
                Intrinsics.x("binding");
                abstractC4226e3 = null;
            }
            MaterialTextView cartItemCount = abstractC4226e3.f21870G;
            Intrinsics.i(cartItemCount, "cartItemCount");
            ck.d.g(cartItemCount, cartMetaDataDecorator.d());
            AbstractC4226e abstractC4226e4 = this.binding;
            if (abstractC4226e4 == null) {
                Intrinsics.x("binding");
            } else {
                abstractC4226e2 = abstractC4226e4;
            }
            AbstractC4299v0 abstractC4299v0 = abstractC4226e2.f21879P;
            ConstraintLayout errorEmptyScreen = abstractC4299v0.f22373D;
            Intrinsics.i(errorEmptyScreen, "errorEmptyScreen");
            errorEmptyScreen.setVisibility(!V2().getTimerRunningStatus() && (cartMetaDataDecorator.f() || cartMetaDataDecorator.e()) ? 0 : 8);
            if (cartMetaDataDecorator.f()) {
                abstractC4299v0.f22372C.setText(com.meijer.mobile.meijer.Y.f100502Je);
                abstractC4299v0.f22370A.setText(C17284b.f163292P);
                abstractC4299v0.f22374z.setText(com.meijer.mobile.meijer.Y.f100486Ih);
                MaterialButton cartErrorEmptyNeedHelpButton = abstractC4299v0.f22371B;
                Intrinsics.i(cartErrorEmptyNeedHelpButton, "cartErrorEmptyNeedHelpButton");
                cartErrorEmptyNeedHelpButton.setVisibility(0);
                abstractC4299v0.f22371B.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CartActivity.D2(this.f102721a, view);
                    }
                });
                return;
            }
            if (cartMetaDataDecorator.e()) {
                abstractC4299v0.f22372C.setText(getString(C17284b.f163303U0));
                abstractC4299v0.f22370A.setText(getString(C17284b.f163352v0));
                abstractC4299v0.f22374z.setText(getString(C17284b.f163350u0));
                MaterialButton cartErrorEmptyNeedHelpButton2 = abstractC4299v0.f22371B;
                Intrinsics.i(cartErrorEmptyNeedHelpButton2, "cartErrorEmptyNeedHelpButton");
                cartErrorEmptyNeedHelpButton2.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D2(CartActivity cartActivity, View view) {
        cartActivity.startActivity(Bl.a.f3119a.c(cartActivity, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E2(CartOrderSummaryDecorator cartOrderSummaryDecorator, CreditCardChargesDecorator creditCardChargesDecorator, EbtCardChargesDecorator ebtCardChargesDecorator, boolean shouldUpdateVisibilityForTipText) {
        AbstractC4226e abstractC4226e = this.binding;
        if (abstractC4226e == null) {
            Intrinsics.x("binding");
            abstractC4226e = null;
        }
        AbstractC4307x0 orderSummaryInclude = abstractC4226e.f21890a0;
        Intrinsics.i(orderSummaryInclude, "orderSummaryInclude");
        com.meijer.mobile.meijer.activity.a.a(orderSummaryInclude, cartOrderSummaryDecorator, creditCardChargesDecorator, ebtCardChargesDecorator, shouldUpdateVisibilityForTipText, new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CartActivity.F2(this.f102689a);
            }
        }, new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CartActivity.G2(this.f102690a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H2(List<CartProductListDecorator> cartProductList) {
        List<CartProductListDecorator> list = cartProductList;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C11904z0((CartProductListDecorator) it.next(), this, "CART_SCREEN"));
        }
        this.productsListSection.R(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I2(CartMperksOfferDecorator cartMperksOfferDecorator) {
        AbstractC4226e abstractC4226e = this.binding;
        AbstractC4226e abstractC4226e2 = null;
        if (abstractC4226e == null) {
            Intrinsics.x("binding");
            abstractC4226e = null;
        }
        abstractC4226e.f21884U.setContent(ComposableLambdaKt.composableLambdaInstance(133080815, true, new b(cartMperksOfferDecorator, this)));
        AbstractC4226e abstractC4226e3 = this.binding;
        if (abstractC4226e3 == null) {
            Intrinsics.x("binding");
        } else {
            abstractC4226e2 = abstractC4226e3;
        }
        abstractC4226e2.f21875L.setContent(ComposableLambdaKt.composableLambdaInstance(1469319206, true, new c(cartMperksOfferDecorator, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J2(List<CartProductListDecorator> productList) {
        List<CartProductListDecorator> list = productList;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C11890s0((CartProductListDecorator) it.next(), new d(this)));
        }
        this.outOfStockProductsListSection.R(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K2(PromoCodeSectionDecorator promoCodeSectionDecorator) {
        AbstractC4226e abstractC4226e = this.binding;
        if (abstractC4226e == null) {
            Intrinsics.x("binding");
            abstractC4226e = null;
        }
        abstractC4226e.f21890a0.f22413A.setContent(ComposableLambdaKt.composableLambdaInstance(714214052, true, new e(promoCodeSectionDecorator, this)));
    }

    private final void L2() {
        AbstractC4226e abstractC4226e = this.binding;
        AbstractC4226e abstractC4226e2 = null;
        if (abstractC4226e == null) {
            Intrinsics.x("binding");
            abstractC4226e = null;
        }
        abstractC4226e.f21879P.f22374z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CartActivity.M2(this.f102731a, view);
            }
        });
        AbstractC4226e abstractC4226e3 = this.binding;
        if (abstractC4226e3 == null) {
            Intrinsics.x("binding");
            abstractC4226e3 = null;
        }
        abstractC4226e3.f21878O.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CartActivity.N2(this.f102785a, view);
            }
        });
        AbstractC4226e abstractC4226e4 = this.binding;
        if (abstractC4226e4 == null) {
            Intrinsics.x("binding");
            abstractC4226e4 = null;
        }
        abstractC4226e4.f21873J.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CartActivity.O2(this.f102794a, view);
            }
        });
        AbstractC4226e abstractC4226e5 = this.binding;
        if (abstractC4226e5 == null) {
            Intrinsics.x("binding");
            abstractC4226e5 = null;
        }
        abstractC4226e5.f21868E.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CartActivity.P2(this.f102796a, view);
            }
        });
        AbstractC4226e abstractC4226e6 = this.binding;
        if (abstractC4226e6 == null) {
            Intrinsics.x("binding");
            abstractC4226e6 = null;
        }
        abstractC4226e6.f21897h0.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CartActivity.Q2(this.f102799a, view);
            }
        });
        AbstractC4226e abstractC4226e7 = this.binding;
        if (abstractC4226e7 == null) {
            Intrinsics.x("binding");
        } else {
            abstractC4226e2 = abstractC4226e7;
        }
        abstractC4226e2.f21898z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CartActivity.R2(this.f102803a, view);
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
    public final void a3(C11890s0.a action) {
        if (action instanceof C11890s0.a.Remove) {
            T2().n0(new E0.AbstractC11813f.RemoveEntryAction(((C11890s0.a.Remove) action).getItem()));
            return;
        }
        if (action instanceof C11890s0.a.Substitute) {
            this.substitutionResultLauncher.a(Bl.t.e(Bl.t.f3152a, this, ((C11890s0.a.Substitute) action).getItem(), Pp.c.f26246b, null, "Meijer:CartPage", 8, null));
        } else {
            if (!(action instanceof C11890s0.a.View)) {
                throw new NoWhenBranchMatchedException();
            }
            Bl.g.t(getFeatureEntryPoint(), ((C11890s0.a.View) action).getItem().getProduct(), true, false, "PDP accessed from Out of Stock in Cart", 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b3(CartActivity cartActivity, Trace startTrace) {
        Intrinsics.j(startTrace, "$this$startTrace");
        startTrace.putAttribute("external_shopper_id", cartActivity.getUserManager().a());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c3(CartActivity cartActivity, View view) {
        cartActivity.startActivity(Bl.a.f3119a.c(cartActivity, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e3(boolean isAdjustEbt, boolean isDisplayEBTPinPad) {
        if (isDisplayEBTPinPad) {
            if (this.cartActivityBottomSheet.isAdded()) {
                return;
            }
            this.cartActivityBottomSheet.show(getSupportFragmentManager(), "CartActivityBottomSheet");
        } else {
            T2().n0(new E0.AbstractC11813f.UpdateIsAdjustEbtClick(isAdjustEbt));
            if (this.cartActivityBottomSheet.isAdded()) {
                return;
            }
            this.cartActivityBottomSheet.show(getSupportFragmentManager(), "CartActivityBottomSheet");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g3(AbstractC6392a title, AbstractC6392a message, AbstractC6392a positiveButtonText, final boolean isOpenBottomSheet) {
        new C15485b(this).setTitle(ck.d.a(this, title)).setMessage(ck.d.a(this, message)).setPositiveButton(ck.d.a(this, positiveButtonText), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CartActivity.i3(isOpenBottomSheet, this, dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Il.b getFulfillmentBarViewModel() {
        return (Il.b) this.fulfillmentBarViewModel.getValue();
    }

    static /* synthetic */ void h3(CartActivity cartActivity, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        cartActivity.g3(abstractC6392a, abstractC6392a2, abstractC6392a3, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i3(boolean z10, CartActivity cartActivity, DialogInterface dialogInterface, int i10) {
        if (z10) {
            cartActivity.T2().n0(E0.AbstractC11813f.t.f102206a);
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j3(String title, String message) {
        FrameLayout frameLayout;
        DialogTitle dialogTitle;
        TextView textView;
        androidx.appcompat.app.c cVarShow = new C15485b(this).setTitle(title).setMessage(message).setNegativeButton(com.meijer.mobile.meijer.Y.f101031l1, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CartActivity.k3(dialogInterface, i10);
            }
        }).setPositiveButton(com.meijer.mobile.meijer.Y.f100486Ih, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CartActivity.l3(this.f102604a, dialogInterface, i10);
            }
        }).show();
        if (cVarShow != null && (textView = (TextView) cVarShow.findViewById(R.id.message)) != null) {
        }
        if (cVarShow != null && (dialogTitle = (DialogTitle) cVarShow.findViewById(ce.f.f61696a)) != null) {
        }
        if (cVarShow == null || (frameLayout = (FrameLayout) cVarShow.findViewById(ce.f.f61698b)) == null) {
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m3(final int mPerksPoints, final int appliedOffers) {
        new C15485b(this).setCancelable(false).setTitle(C17284b.f163277H0).setMessage(C17284b.f163271E0).setPositiveButton(C17284b.f163275G0, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CartActivity.n3(this.f102692a, mPerksPoints, appliedOffers, dialogInterface, i10);
            }
        }).setNegativeButton(C17284b.f163273F0, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CartActivity.o3(this.f102696a, dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p3() {
        new C15485b(this).setTitle(com.meijer.mobile.meijer.Y.f101194t4).setMessage(com.meijer.mobile.meijer.Y.f101174s4).setPositiveButton(com.meijer.mobile.meijer.Y.f101031l1, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CartActivity.q3(this.f102607a, dialogInterface, i10);
            }
        }).setCancelable(true).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.meijer.mobile.meijer.activity.cart.e
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                CartActivity.r3(this.f102617a, dialogInterface);
            }
        }).show();
    }

    @Override // Hm.f.a
    public void D0(String timerString) {
        Intrinsics.j(timerString, "timerString");
        T2().n0(new E0.AbstractC11813f.UpdateTimer(timerString));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11904z0.a
    public void K(CartProductListDecorator item) {
        Intrinsics.j(item, "item");
        C18188a.f170828a.a(CartProductSavingsDialogFragment.INSTANCE.a(CartProductSavingsDecorator.INSTANCE.b(item)), this, "cart_product_savings_dialog_fragment");
    }

    @Override // com.meijer.mobile.meijer.activity.cart.CartActivityBottomSheet.b
    public void M() {
        this.cartActivityBottomSheet.dismiss();
        T2().n0(E0.AbstractC11813f.C11826n.f102199a);
    }

    @Override // com.meijer.mobile.meijer.activity.cart.CartBottomSheetDialogFragment.a
    public void N0(nk.f product) {
        Intrinsics.j(product, "product");
        T2().n0(new E0.AbstractC11813f.RemoveEntryFromEllipsis(product));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11904z0.a
    public void R(CartProductListDecorator item) {
        Intrinsics.j(item, "item");
        new EditBackUpItemBottomSheet(item, this).show(getSupportFragmentManager(), "EditBackUpItemBottomSheet");
    }

    public final wr.f S2() {
        wr.f fVar = this.cartInteractor;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.x("cartInteractor");
        return null;
    }

    public final Hm.f V2() {
        Hm.f fVar = this.ebtTimer;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.x("ebtTimer");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11904z0.a
    public void Y0(CartEntryActionDecorator cartEntryActionDecorator) {
        Intrinsics.j(cartEntryActionDecorator, "cartEntryActionDecorator");
        T2().n0(new E0.AbstractC11813f.GetOptionsForEntryAction(cartEntryActionDecorator));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11904z0.a
    public boolean a(String forProduct) {
        Intrinsics.j(forProduct, "forProduct");
        return !S2().x(forProduct);
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11904z0.a
    public void a1(CartProductListDecorator entryToUpdate, ValueState valueState, Rect stepperHitRect) {
        Intrinsics.j(entryToUpdate, "entryToUpdate");
        Intrinsics.j(valueState, "valueState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        T2().n0(new E0.AbstractC11813f.UpdateEntryQuantityAction(entryToUpdate, valueState.getQuantity(), stepperHitRect));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11904z0.a, com.meijer.mobile.meijer.activity.cart.CartBottomSheetDialogFragment.a
    public void b(int entryNumber, String note) {
        EntryNoteActivity.Companion companion = EntryNoteActivity.INSTANCE;
        if (note == null) {
            note = "";
        }
        startActivity(companion.a(this, entryNumber, note, "com.meijer.intent.extra.EXTRA_ENTRY_NOTE_TYPE"));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11904z0.a
    public void i(CartProductListDecorator item) {
        Intrinsics.j(item, "item");
        T2().n0(new E0.AbstractC11813f.GoProductDetailAction(item.getProduct()));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.EditBackUpItemBottomSheet.b
    public void k(CartProductListDecorator item) {
        Intrinsics.j(item, "item");
        T2().n0(new E0.AbstractC11813f.DeleteProactiveSubstituteAction(item.getProduct().getCode()));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.EditBackUpItemBottomSheet.b
    public void l(CartProductListDecorator item) {
        Intrinsics.j(item, "item");
        this.substitutionResultLauncher.a(Bl.t.e(Bl.t.f3152a, this, item, Pp.c.f26245a, null, "Meijer:CartPage", 8, null));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11904z0.a
    public void n(CartProductListDecorator entryToUpdate, ValueState valueState, Rect stepperHitRect) {
        Intrinsics.j(entryToUpdate, "entryToUpdate");
        Intrinsics.j(valueState, "valueState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        T2().n0(new E0.AbstractC11813f.StepperStateChangedAction(entryToUpdate, valueState.getQuantity(), stepperHitRect));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.CartActivityBottomSheet.b
    public void r0() {
        this.cartActivityBottomSheet.dismiss();
        T2().n0(E0.AbstractC11813f.C11817d.f102188a);
    }

    @Override // com.meijer.mobile.meijer.activity.cart.CartActivityBottomSheet.b
    public void w() {
        this.cartActivityBottomSheet.dismiss();
        T2().n0(E0.AbstractC11813f.C11827o.f102200a);
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11904z0.a
    public void w0(CartProductListDecorator item) {
        Intrinsics.j(item, "item");
        this.substitutionResultLauncher.a(Bl.t.e(Bl.t.f3152a, this, item, Pp.c.f26245a, null, "Meijer:CartPage", 8, null));
        T2().C0(item);
    }

    public CartActivity() {
        C15069d<ju.g> c15069d = new C15069d<>();
        c15069d.c(this.productsListSection);
        this.productsAdapter = c15069d;
        C15069d<ju.g> c15069d2 = new C15069d<>();
        c15069d2.c(this.outOfStockProductsListSection);
        this.outOfStockProductsAdapter = c15069d2;
        this.cartActivityBottomSheet = new CartActivityBottomSheet(null, this, false, false, false, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M2(CartActivity cartActivity, View view) {
        cartActivity.T2().n0(E0.AbstractC11813f.C11824l.f102197a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N2(CartActivity cartActivity, View view) {
        cartActivity.T2().n0(E0.AbstractC11813f.H.f102168a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O2(CartActivity cartActivity, View view) {
        cartActivity.T2().n0(E0.AbstractC11813f.J.f102170a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P2(CartActivity cartActivity, View view) {
        cartActivity.T2().n0(E0.AbstractC11813f.C11815b.f102186a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q2(CartActivity cartActivity, View view) {
        cartActivity.T2().n0(E0.AbstractC11813f.J.f102170a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R2(CartActivity cartActivity, View view) {
        cartActivity.T2().n0(E0.AbstractC11813f.C11814a.f102185a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W2(C14274a result) {
        switch (result.getResultCode()) {
            case 48996:
                T2().n0(E0.AbstractC11813f.w.f102209a);
                break;
            case 48997:
                T2().n0(E0.AbstractC11813f.C11825m.f102198a);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X2(C14274a result) {
        Intent data;
        if (result.getResultCode() == 48385 && (data = result.getData()) != null) {
            data.getIntExtra("com.meijer.mobile.meijer.activity.cart.intent.extra.APPLIED_MPERKS_OFFERS_FROM_HVP", 0);
            this.showHVPOffersAppliedToast = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y2(C14274a result) {
        if (result.getResultCode() == 8675309) {
            T2().n0(new E0.AbstractC11813f.SuccessfullySubstitutedItemAction(t3(result)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z2(C14274a result) {
        Intent data;
        if (result.getResultCode() == 3443 && (data = result.getData()) != null) {
            boolean booleanExtra = data.getBooleanExtra("com.meijer.mobile.meijer.activity.cart.UnavailableForDeliveryActivity.UNAVAILABLE_FOR_DELIVERY_PRODUCT_REMOVED", false);
            Boolean boolValueOf = Boolean.valueOf(booleanExtra);
            if (!booleanExtra) {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                T2().n0(E0.AbstractC11813f.C.f102163a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d3(CartActivity cartActivity, View view) {
        cartActivity.T2().n0(E0.AbstractC11813f.x.f102210a);
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
        cartActivity.T2().n0(new E0.AbstractC11813f.HvpPromptAnalyticsTrackAction(true));
        dialogInterface.dismiss();
        cartActivity.hvpResultLauncher.a(MperksInCartActivity.INSTANCE.a(cartActivity, true, i10, true, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o3(CartActivity cartActivity, DialogInterface dialogInterface, int i10) {
        cartActivity.T2().n0(new E0.AbstractC11813f.HvpPromptAnalyticsTrackAction(false));
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q3(CartActivity cartActivity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        cartActivity.T2().n0(E0.AbstractC11813f.C11822j.f102195a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r3(CartActivity cartActivity, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        cartActivity.T2().n0(E0.AbstractC11813f.C11822j.f102195a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s3() {
        if (getFeatureManager().e(AbstractC18503f.i0.f172883h)) {
            startActivity(Bl.r.b(Bl.r.f3150a, this, false, 2, null));
        } else {
            startActivity(FulfillmentSlotsActivity.Companion.b(FulfillmentSlotsActivity.INSTANCE, this, null, 2, null));
        }
    }

    private final Pp.c t3(C14274a result) {
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
    public void B() {
        T2().n0(new E0.AbstractC11813f.UpdateLoader(false));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.CartActivityBottomSheet.b
    public void M0() {
        T2().n0(E0.AbstractC11813f.u.f102207a);
    }

    @Override // Hm.f.a
    public void Q() {
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
        e0T2.n0(new E0.AbstractC11813f.CollapseQtyStepperAction(x10, y10));
        return super.dispatchTouchEvent(ev2);
    }

    @Override // com.meijer.mobile.meijer.activity.cart.CartActivityBottomSheet.b
    public void g0(String results) {
        U2().I(results);
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        V2().k(this);
        AbstractC4226e abstractC4226eM0 = AbstractC4226e.M0(getLayoutInflater());
        this.binding = abstractC4226eM0;
        if (abstractC4226eM0 == null) {
            Intrinsics.x("binding");
            abstractC4226eM0 = null;
        }
        setContentView(Zr.a.j(abstractC4226eM0.getRoot(), false, 1, null));
        ps.d0 navigationHelper = getNavigationHelper();
        if (navigationHelper != null) {
            navigationHelper.i0(268437856);
        }
        getLifecycle().a(T2());
        T2().n0(new E0.AbstractC11813f.SetCartModeAction(false));
        getFirebasePerformanceEngine().a("cart_checkout_trace", new Function1() { // from class: com.meijer.mobile.meijer.activity.cart.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CartActivity.b3(this.f102594a, (Trace) obj);
            }
        });
        AbstractC4226e abstractC4226e = this.binding;
        if (abstractC4226e == null) {
            Intrinsics.x("binding");
            abstractC4226e = null;
        }
        RecyclerView recyclerView = abstractC4226e.f21893d0;
        recyclerView.setAdapter(this.productsAdapter);
        recyclerView.addItemDecoration(new androidx.recyclerview.widget.i(recyclerView.getContext(), 1));
        AbstractC4226e abstractC4226e2 = this.binding;
        if (abstractC4226e2 == null) {
            Intrinsics.x("binding");
            abstractC4226e2 = null;
        }
        RecyclerView recyclerView2 = abstractC4226e2.f21888Y;
        recyclerView2.setAdapter(this.outOfStockProductsAdapter);
        recyclerView2.addItemDecoration(new androidx.recyclerview.widget.i(recyclerView2.getContext(), 1));
        AbstractC4226e abstractC4226e3 = this.binding;
        if (abstractC4226e3 == null) {
            Intrinsics.x("binding");
            abstractC4226e3 = null;
        }
        abstractC4226e3.f21886W.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CartActivity.c3(this.f102711a, view);
            }
        });
        AbstractC4226e abstractC4226e4 = this.binding;
        if (abstractC4226e4 == null) {
            Intrinsics.x("binding");
            abstractC4226e4 = null;
        }
        abstractC4226e4.f21895f0.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CartActivity.d3(this.f102716a, view);
            }
        });
        AbstractC4226e abstractC4226e5 = this.binding;
        if (abstractC4226e5 == null) {
            Intrinsics.x("binding");
            abstractC4226e5 = null;
        }
        abstractC4226e5.f21880Q.setContent(ComposableLambdaKt.composableLambdaInstance(1798237145, true, new h()));
        C16563h.J(C16563h.O(T2().k0(), new i(null)), C6173t.a(this));
        L2();
        C16563h.J(C16563h.O(T2().getEvents(), new j(null)), C6173t.a(this));
        C15809k.d(C6173t.a(this), null, null, new k(null), 3, null);
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        FS.page("Cart Page").start();
    }

    @Override // com.meijer.mobile.meijer.activity.cart.CartActivityBottomSheet.b
    public void x0(double amount) {
        T2().n0(new E0.AbstractC11813f.UpdateEBTApprovedAmount(amount));
    }
}
