package com.meijer.mobile.meijer.activity.checkout.review;

import Ki.C;
import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import P0.e;
import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import bk.AbstractC6392a;
import c5.C6484c;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.cart.EditCartActivity;
import com.meijer.mobile.meijer.activity.cart.entrynote.EntryNoteActivity;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.ContactInformationDecorator;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsActivity;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity;
import com.meijer.mobile.meijer.activity.checkout.review.Q1;
import com.meijer.mobile.meijer.activity.checkout.review.Z0;
import com.meijer.mobile.meijer.activity.checkout.review.z1;
import com.meijer.mobile.meijer.activity.checkout.substitutionpreference.SubstitutionPreferenceFormActivity;
import com.meijer.mobile.rateandtip.ux.C12828a;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import dk.C13698b;
import h6.C14478i;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import java.util.Arrays;
import java.util.Locale;
import ji.C15042c;
import ki.C15158a0;
import ki.InterfaceC15153W;
import ki.InterfaceC15154X;
import ki.InterfaceC15160b0;
import ki.q1;
import kotlin.C17983Z;
import kotlin.C4107g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l6.InterfaceC15464h;
import l6.InterfaceC15467k;
import m5.C15669h;
import mv.InterfaceC15783O;
import p1.C16335d;
import p1.C16338g;
import pi.C16453n;
import qi.C16671b;
import r0.C16806i;
import ri.C16912d;
import ti.C17265b;
import tr.C17284b;
import xs.EnumC18220b;

@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001aç\u0001\u0010\u0019\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\n2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\n2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a/\u0010!\u001a\u00020\f*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0003¢\u0006\u0004\b!\u0010\"\u001a#\u0010'\u001a\u00020\f*\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0003¢\u0006\u0004\b'\u0010(\u001a1\u0010-\u001a\u00020\f*\u00020\u00002\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010,\u001a\u00020+2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0003¢\u0006\u0004\b-\u0010.\u001ao\u00103\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u00100\u001a\u00020/2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\nH\u0003¢\u0006\u0004\b3\u00104\u001a1\u00107\u001a\u00020\f*\u00020\u00002\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\u0006\u0010,\u001a\u00020+2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0003¢\u0006\u0004\b7\u00108\u001a/\u0010;\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010:\u001a\u0002092\b\b\u0002\u0010 \u001a\u00020\u001fH\u0003¢\u0006\u0004\b;\u0010<\u001a\u001d\u0010?\u001a\u00020\f*\u00020\u00002\b\u0010>\u001a\u0004\u0018\u00010=H\u0003¢\u0006\u0004\b?\u0010@\u001a)\u0010A\u001a\u00020\f*\u00020\u00002\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\b\b\u0002\u0010 \u001a\u00020\u001fH\u0003¢\u0006\u0004\bA\u0010B\u001a%\u0010E\u001a\u00020\f*\u00020\u00002\u0006\u0010D\u001a\u00020C2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0003¢\u0006\u0004\bE\u0010F\u001aE\u0010K\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010H\u001a\u00020G2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010I2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0003¢\u0006\u0004\bK\u0010L\u001a\u001b\u0010N\u001a\u00020\f*\u00020\u00002\u0006\u0010M\u001a\u00020=H\u0003¢\u0006\u0004\bN\u0010@\u001aS\u0010O\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\u0003¢\u0006\u0004\bO\u0010P\u001a+\u0010Q\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\u0003¢\u0006\u0004\bQ\u0010R\u001a%\u0010T\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010S\u001a\u00020+H\u0003¢\u0006\u0004\bT\u0010U\u001a\u007f\u0010]\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010V\u001a\u00020\u001d2\n\b\u0003\u0010W\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010+2\u0016\u0010Y\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010+0X\"\u0004\u0018\u00010+2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010[\u001a\u00020\u00052\u0010\b\u0002\u0010\\\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0014H\u0003¢\u0006\u0004\b]\u0010^\u001aU\u0010_\u001a\u00020\f*\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0003¢\u0006\u0004\b_\u0010`\u001ai\u0010a\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010 \u001a\u00020\u001f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0003¢\u0006\u0004\ba\u0010b\u001a1\u0010d\u001a\u00020\f*\u00020\u00002\u0006\u0010c\u001a\u00020\u00052\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0003¢\u0006\u0004\bd\u0010e\u001a)\u0010g\u001a\u00020\f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010f\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\u0003¢\u0006\u0004\bg\u0010h\"\u0016\u0010k\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010j\"\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020m0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010o¨\u0006v²\u0006\u000e\u0010q\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010s\u001a\u0004\u0018\u00010r8\nX\u008a\u0084\u0002²\u0006\f\u0010u\u001a\u00020t8\nX\u008a\u0084\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/checkout/review/D1;", "viewState", "", "cardSet", "Landroidx/compose/runtime/l0;", "isScreenVisible", "displayCheckoutAnimations", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "", "onAction", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$m;", "onPreTipAction", "Lxs/b;", "setSelectedTipOption", "", "setCustomTipAmount", "Lkotlin/Function0;", "onAdjustEbtPayment", "onPreAuthToolTipClicked", "onShowExtendedRangeInfoClicked", "onTermsOfServiceLinkClicked", "i0", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/review/D1;ZLandroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/R1;", "fulfillmentSlot", "", "fulfillmentSlotCardTitle", "Landroid/content/Context;", "context", "A0", "(LKi/M;Lcom/meijer/mobile/meijer/activity/checkout/review/R1;ILandroid/content/Context;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/Q1;", "fulfillmentModeDecorator", "Lcom/meijer/mobile/meijer/activity/checkout/review/X1;", "storeDecorator", "W0", "(LKi/M;Lcom/meijer/mobile/meijer/activity/checkout/review/Q1;Lcom/meijer/mobile/meijer/activity/checkout/review/X1;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/a;", "contactInformation", "", "deliveryMode", "s0", "(LKi/M;Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/a;Ljava/lang/String;Landroid/content/Context;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/V1;", "preTipDecorator", "Lcom/meijer/mobile/meijer/activity/checkout/review/M1;", "deliveryInstructions", "h1", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/review/V1;Lcom/meijer/mobile/meijer/activity/checkout/review/M1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/U1;", "pickupPerson", "T0", "(LKi/M;Lcom/meijer/mobile/meijer/activity/checkout/review/U1;Ljava/lang/String;Landroid/content/Context;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/u;", "cartItemsDecorator", "Y", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/review/u;Landroid/content/Context;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/a;", "deliveryAddress", "v0", "(LKi/M;Lcom/meijer/mobile/meijer/activity/checkout/review/a;Landroidx/compose/runtime/Composer;I)V", "x0", "(LKi/M;Lcom/meijer/mobile/meijer/activity/checkout/review/M1;Landroid/content/Context;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/Y1;", "substitutionPreference", "e1", "(LKi/M;Lcom/meijer/mobile/meijer/activity/checkout/review/Y1;Landroid/content/Context;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/q;", "creditCardDetails", "Lcom/meijer/mobile/meijer/activity/checkout/review/O1;", "ebtCardDetails", "R0", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/review/q;Lcom/meijer/mobile/meijer/activity/checkout/review/O1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "billingAddress", "U", "M0", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/review/D1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "D0", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "title", "Y0", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", BarcodePickDeserializer.FIELD_ICON, "actionTitle", "", "lines", "error", "displayDivider", "onEditAction", "b1", "(LKi/M;Landroidx/compose/ui/Modifier;ILjava/lang/Integer;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "G0", "(LKi/M;Lcom/meijer/mobile/meijer/activity/checkout/review/D1;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "c0", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/review/D1;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "showOrderCancelWarning", "J0", "(LKi/M;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "content", "W", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "a", "Z", "isCardSet", "Lkotlin/enums/EnumEntries;", "Lcom/meijer/mobile/meijer/activity/checkout/review/r;", "b", "Lkotlin/enums/EnumEntries;", "cartItems", "shouldShowNoTipError", "Lh6/i;", "composition", "", "progress", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class Z0 {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f105560a;

    /* renamed from: b, reason: collision with root package name */
    private static final EnumEntries<com.meijer.mobile.meijer.activity.checkout.review.r> f105561b = com.meijer.mobile.meijer.activity.checkout.review.r.b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class A implements Function3<ki.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105562a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<z1.m, Unit> f105563b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f105564c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f105565a;

            a(LocalThemeScope localThemeScope) {
                this.f105565a = localThemeScope;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(317443569, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.TipYourShopperSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:389)");
                }
                LocalThemeScope localThemeScope = this.f105565a;
                q1.Label label = new q1.Label(null, this.f105565a.getAdsColors().getAdsColorEnabled01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 381, null);
                String upperCase = C16338g.c(com.meijer.mobile.meijer.Y.f100416F4, composer, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                si.j.h(localThemeScope, label, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, InterfaceC5872l0 interfaceC5872l0) {
            Z0.k1(interfaceC5872l0, false);
            function1.invoke(new z1.m.SetPreTipStatus(W1.f105517a));
            return Unit.f143329a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        A(LocalThemeScope localThemeScope, Function1<? super z1.m, Unit> function1, InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f105562a = localThemeScope;
            this.f105563b = function1;
            this.f105564c = interfaceC5872l0;
        }

        public final void b(ki.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1827591940, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.TipYourShopperSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:381)");
            }
            LocalThemeScope localThemeScope = this.f105562a;
            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f105563b);
            final Function1<z1.m, Unit> function1 = this.f105563b;
            final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f105564c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.h1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Z0.A.c(function1, interfaceC5872l0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            oi.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(317443569, true, new a(this.f105562a), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class B implements Function3<InterfaceC15160b0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105566a;

        B(LocalThemeScope localThemeScope) {
            this.f105566a = localThemeScope;
        }

        public final void a(InterfaceC15160b0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1659167014, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.TipYourShopperSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:425)");
            }
            Di.j.i(this.f105566a, null, C16338g.c(C12828a.f116053p, composer, 0), null, Assemble.getToastVariant().getError(), null, composer, LocalThemeScope.f17314g | (q1.m.Inline.f142376h << 12), 21);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15160b0 interfaceC15160b0, Composer composer, Integer num) {
            a(interfaceC15160b0, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class C implements Function3<ki.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105567a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC14888I f105568b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f105569c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<z1.m, Unit> f105570d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f105571a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.j1 f105572b;

            a(LocalThemeScope localThemeScope, ki.j1 j1Var) {
                this.f105571a = localThemeScope;
                this.f105572b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-829629273, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.TipYourShopperSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:455)");
                }
                si.j.h(this.f105571a, this.f105572b.getLabels().getEnabledLabel(), C16338g.c(C12828a.f116032D, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C(LocalThemeScope localThemeScope, InterfaceC14888I interfaceC14888I, Modifier modifier, Function1<? super z1.m, Unit> function1) {
            this.f105567a = localThemeScope;
            this.f105568b = interfaceC14888I;
            this.f105569c = modifier;
            this.f105570d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(new z1.m.SetPreTipStatus(W1.f105518b));
            return Unit.f143329a;
        }

        public final void b(ki.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-928476614, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.TipYourShopperSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:445)");
            }
            LocalThemeScope localThemeScope = this.f105567a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, InterfaceC14888I.b(this.f105568b, this.f105569c, 1.0f, false, 2, null), false, null, 895, null);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f105570d);
            final Function1<z1.m, Unit> function1 = this.f105570d;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.i1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Z0.C.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            oi.E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-829629273, true, new a(this.f105567a, Assemble), composer, 54), composer, (q1.d.StandardButton.f142229k << 3) | LocalThemeScope.f17314g | 3072);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class D implements Function3<ki.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PreTipDecorator f105573a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105574b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<z1.m, Unit> f105575c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC14888I f105576d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f105577e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f105578a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.j1 f105579b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ PreTipDecorator f105580c;

            a(LocalThemeScope localThemeScope, ki.j1 j1Var, PreTipDecorator preTipDecorator) {
                this.f105578a = localThemeScope;
                this.f105579b = j1Var;
                this.f105580c = preTipDecorator;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                String strA;
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-708296382, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.TipYourShopperSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:496)");
                }
                LocalThemeScope localThemeScope = this.f105578a;
                q1.Label labelB = Cr.a.b(this.f105579b.getLabels(), !this.f105580c.k());
                if (this.f105580c.m() == 0.0d) {
                    composer.startReplaceGroup(317080803);
                    strA = C16338g.c(C12828a.f116059v, composer, 0);
                    composer.P();
                } else {
                    composer.startReplaceGroup(317253101);
                    strA = C13698b.a(AbstractC6392a.INSTANCE.d(C12828a.f116060w, Double.valueOf(this.f105580c.m())), composer, AbstractC6392a.f60445b);
                    composer.P();
                }
                si.j.h(localThemeScope, labelB, strA, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        D(PreTipDecorator preTipDecorator, LocalThemeScope localThemeScope, Function1<? super z1.m, Unit> function1, InterfaceC14888I interfaceC14888I, InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f105573a = preTipDecorator;
            this.f105574b = localThemeScope;
            this.f105575c = function1;
            this.f105576d = interfaceC14888I;
            this.f105577e = interfaceC5872l0;
        }

        public final void b(ki.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1540905749, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.TipYourShopperSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:467)");
            }
            q1.d.StandardButton standardButtonA = Cr.a.a(Assemble.getButtons(), !this.f105573a.k());
            LocalThemeScope localThemeScope = this.f105574b;
            Modifier modifierB = InterfaceC14888I.b(this.f105576d, standardButtonA.getModifier(), 1.0f, false, 2, null);
            float f10 = 8;
            float fP = H1.h.p(f10);
            float fP2 = H1.h.p(f10);
            InterfaceC14882C contentPadding = standardButtonA.getContentPadding();
            float top = contentPadding != null ? contentPadding.getTop() : H1.h.p(0);
            InterfaceC14882C contentPadding2 = standardButtonA.getContentPadding();
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(standardButtonA, false, null, null, C16806i.c(H1.h.p(f10)), null, null, androidx.compose.foundation.layout.D.d(fP, top, fP2, contentPadding2 != null ? contentPadding2.getBottom() : H1.h.p(0)), modifierB, false, null, 823, null);
            composer.startReplaceGroup(-1746271574);
            boolean zD = composer.D(this.f105573a) | composer.V(this.f105575c);
            final PreTipDecorator preTipDecorator = this.f105573a;
            final Function1<z1.m, Unit> function1 = this.f105575c;
            final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f105577e;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.j1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Z0.D.c(preTipDecorator, function1, interfaceC5872l0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            oi.E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-708296382, true, new a(this.f105574b, Assemble, this.f105573a), composer, 54), composer, (q1.d.StandardButton.f142229k << 3) | LocalThemeScope.f17314g | 3072);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(PreTipDecorator preTipDecorator, Function1 function1, InterfaceC5872l0 interfaceC5872l0) {
            if (preTipDecorator.m() == 0.0d) {
                Z0.k1(interfaceC5872l0, true);
            } else {
                function1.invoke(new z1.m.SetPreTipStatus(W1.f105519c));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class E implements Function3<InterfaceC15160b0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105581a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PreTipDecorator f105582b;

        E(LocalThemeScope localThemeScope, PreTipDecorator preTipDecorator) {
            this.f105581a = localThemeScope;
            this.f105582b = preTipDecorator;
        }

        public final void a(InterfaceC15160b0 Assemble, Composer composer, int i10) {
            String strC;
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1556404754, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.TipYourShopperSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:538)");
            }
            LocalThemeScope localThemeScope = this.f105581a;
            if (this.f105582b.i()) {
                composer.startReplaceGroup(-1612746820);
                strC = C16338g.c(C12828a.f116048k, composer, 0);
                composer.P();
            } else {
                composer.startReplaceGroup(-1612594083);
                strC = C16338g.c(C12828a.f116049l, composer, 0);
                composer.P();
            }
            Di.j.i(localThemeScope, null, strC, null, Assemble.getToastVariant().getWarning(), null, composer, LocalThemeScope.f17314g | (q1.m.Inline.f142376h << 12), 21);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15160b0 interfaceC15160b0, Composer composer, Integer num) {
            a(interfaceC15160b0, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Z0$a, reason: case insensitive filesystem */
    static final class C12058a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CartItemsDecorator f105583a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f105584b;

        C12058a(CartItemsDecorator cartItemsDecorator, int i10) {
            this.f105583a = cartItemsDecorator;
            this.f105584b = i10;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-68479671, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CartItemsSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:622)");
            }
            if (!this.f105583a.c().isEmpty() && this.f105584b < this.f105583a.c().size()) {
                EntryDecorator entryDecorator = this.f105583a.c().get(this.f105584b);
                C15669h.a aVar = new C15669h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
                String imageUrl = entryDecorator.getImageUrl();
                if (imageUrl == null) {
                    imageUrl = "";
                }
                C6484c.d(aVar.f(imageUrl).e(true).c(), entryDecorator.getName(), a5.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())), androidx.compose.foundation.layout.J.v(Modifier.INSTANCE, H1.h.p(64)), C16335d.c(Cj.i.f4726O1, composer, 0), C16335d.c(Cj.i.f4726O1, composer, 0), null, null, null, null, null, InterfaceC5926k.INSTANCE.e(), 0.0f, null, 0, false, null, composer, 3072, 48, 128960);
            }
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
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Z0$b, reason: case insensitive filesystem */
    static final class C12059b implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105585a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Z0$b$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f105586a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f105587b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Z0$b$a$a, reason: collision with other inner class name */
            static final class C1527a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105588a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC15153W f105589b;

                C1527a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W) {
                    this.f105588a = localThemeScope;
                    this.f105589b = interfaceC15153W;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1013930283, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CartItemsSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:657)");
                    }
                    si.j.h(this.f105588a, this.f105589b.getLabels().getInfoBlockMessage(), C16338g.c(C15042c.f140908e, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

            a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W) {
                this.f105586a = localThemeScope;
                this.f105587b = interfaceC15153W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1224908225, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CartItemsSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:656)");
                }
                C4107g.e(null, 0.0f, ComposableLambdaKt.c(-1013930283, true, new C1527a(this.f105586a, this.f105587b), composer, 54), composer, 384, 3);
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

        C12059b(LocalThemeScope localThemeScope) {
            this.f105585a = localThemeScope;
        }

        public final void a(InterfaceC15153W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(613077204, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CartItemsSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:655)");
            }
            C16912d.e(this.f105585a, Assemble.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.c(1224908225, true, new a(this.f105585a, Assemble), composer, 54), composer, LocalThemeScope.f17314g | 384 | (q1.InfoBlock.f142332c << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            a(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Z0$c, reason: case insensitive filesystem */
    static final class C12060c implements Function3<ki.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105590a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckoutAnimations f105591b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<z1.h, Unit> f105592c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f105593d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f105594e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f105595f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f105596g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Z0$c$a */
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f105597a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f105598b;

            a(LocalThemeScope localThemeScope, int i10) {
                this.f105597a = localThemeScope;
                this.f105598b = i10;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(38329453, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CheckoutLottieAnimation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:1502)");
                }
                LocalThemeScope localThemeScope = this.f105597a;
                q1.Label label = new q1.Label(null, this.f105597a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 381, null);
                String upperCase = C16338g.c(this.f105598b, composer, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                si.j.h(localThemeScope, label, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C12060c(LocalThemeScope localThemeScope, CheckoutAnimations c12073d0, Function1<? super z1.h, Unit> function1, Context context, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02, int i10) {
            this.f105590a = localThemeScope;
            this.f105591b = c12073d0;
            this.f105592c = function1;
            this.f105593d = context;
            this.f105594e = interfaceC5872l0;
            this.f105595f = interfaceC5872l02;
            this.f105596g = i10;
        }

        public final void b(ki.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-178344390, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CheckoutLottieAnimation.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:1471)");
            }
            LocalThemeScope localThemeScope = this.f105590a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.j(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), H1.h.p(16), H1.h.p(8)), false, null, 895, null);
            composer.startReplaceGroup(-1224400529);
            boolean zV = composer.V(this.f105591b) | composer.V(this.f105592c) | composer.D(this.f105593d) | composer.V(this.f105594e) | composer.V(this.f105595f);
            final CheckoutAnimations c12073d0 = this.f105591b;
            final Function1<z1.h, Unit> function1 = this.f105592c;
            final Context context = this.f105593d;
            final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f105594e;
            final InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f105595f;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.a1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Z0.C12060c.c(c12073d0, function1, context, interfaceC5872l0, interfaceC5872l02);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            oi.E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(38329453, true, new a(this.f105590a, this.f105596g), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(CheckoutAnimations c12073d0, Function1 function1, Context context, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02) {
            if (c12073d0.getIsTimeSlotError()) {
                function1.invoke(z1.h.j.f105978a);
                context.startActivity(FulfillmentSlotsActivity.INSTANCE.a(context, new FulfillmentSlotsActivity.FulfillmentSlotsActivityExtras(true, true)));
            } else {
                function1.invoke(new z1.h.SubmitOrderAction(false));
            }
            function1.invoke(new z1.h.SetCheckoutAnimations(false, null));
            interfaceC5872l0.setValue(Boolean.FALSE);
            interfaceC5872l02.setValue(Boolean.TRUE);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutScreenKt$CheckoutLottieAnimation$3$1", f = "CheckoutScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Z0$d, reason: case insensitive filesystem */
    static final class C12061d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f105599a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckoutAnimations f105600b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f105601c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f105602d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<z1.h, Unit> f105603e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ CheckoutViewState f105604f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C12061d(CheckoutAnimations c12073d0, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02, Function1<? super z1.h, Unit> function1, CheckoutViewState checkoutViewState, Continuation<? super C12061d> continuation) {
            super(2, continuation);
            this.f105600b = c12073d0;
            this.f105601c = interfaceC5872l0;
            this.f105602d = interfaceC5872l02;
            this.f105603e = function1;
            this.f105604f = checkoutViewState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C12061d(this.f105600b, this.f105601c, this.f105602d, this.f105603e, this.f105604f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12061d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Boolean boolA;
            String strE;
            z1.OrderConfirmationInfo orderConfirmationInfoD;
            IntrinsicsKt.f();
            if (this.f105599a == 0) {
                ResultKt.b(obj);
                CheckoutAnimations c12073d0 = this.f105600b;
                Boolean isBopasEligibleCart = null;
                if (c12073d0 != null) {
                    boolA = Boxing.a(c12073d0.getIsErrorEvent());
                } else {
                    boolA = null;
                }
                if (Intrinsics.e(boolA, Boxing.a(true))) {
                    if (!this.f105600b.getIsTimeSlotError()) {
                        this.f105601c.setValue(Boxing.a(true));
                        this.f105602d.setValue(Boxing.a(false));
                        this.f105603e.invoke(z1.h.w.f105994a);
                    }
                } else {
                    CheckoutAnimations c12073d02 = this.f105600b;
                    if (c12073d02 != null && c12073d02.getDisplayEbtPinPad()) {
                        this.f105601c.setValue(Boxing.a(false));
                        this.f105602d.setValue(Boxing.a(false));
                        this.f105603e.invoke(z1.h.v.f105993a);
                    } else {
                        Function1<z1.h, Unit> function1 = this.f105603e;
                        CheckoutAnimations c12073d03 = this.f105600b;
                        if (c12073d03 != null) {
                            strE = c12073d03.getOrderId();
                        } else {
                            strE = null;
                        }
                        CheckoutAnimations c12073d04 = this.f105600b;
                        if (c12073d04 != null) {
                            orderConfirmationInfoD = c12073d04.getInformation();
                        } else {
                            orderConfirmationInfoD = null;
                        }
                        CheckoutViewState checkoutViewState = this.f105604f;
                        if (checkoutViewState != null) {
                            isBopasEligibleCart = checkoutViewState.getIsBopasEligibleCart();
                        }
                        function1.invoke(new z1.h.NavigateToOrderConfirmation(strE, orderConfirmationInfoD, isBopasEligibleCart));
                    }
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Z0$e, reason: case insensitive filesystem */
    static final class C12062e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105605a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckoutViewState f105606b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<z1.m, Unit> f105607c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<EnumC18220b, Unit> f105608d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Double, Unit> f105609e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<z1.h, Unit> f105610f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f105611g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f105612h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f105613i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f105614j;

        /* JADX WARN: Multi-variable type inference failed */
        C12062e(LocalThemeScope localThemeScope, CheckoutViewState checkoutViewState, Function1<? super z1.m, Unit> function1, Function1<? super EnumC18220b, Unit> function12, Function1<? super Double, Unit> function13, Function1<? super z1.h, Unit> function14, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04) {
            this.f105605a = localThemeScope;
            this.f105606b = checkoutViewState;
            this.f105607c = function1;
            this.f105608d = function12;
            this.f105609e = function13;
            this.f105610f = function14;
            this.f105611g = function0;
            this.f105612h = function02;
            this.f105613i = function03;
            this.f105614j = function04;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1437605960, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CheckoutScreen.<anonymous> (CheckoutScreen.kt:154)");
            }
            LocalThemeScope localThemeScope = this.f105605a;
            Q1 fulfillmentMode = this.f105606b.getFulfillmentMode();
            StoreDecorator storeDecorator = this.f105606b.getStoreDecorator();
            int i11 = LocalThemeScope.f17314g;
            int i12 = AbstractC6392a.f60445b;
            Z0.W0(localThemeScope, fulfillmentMode, storeDecorator, composer, (i12 << 3) | i11);
            Z0.v0(this.f105605a, this.f105606b.getDeliveryAddress(), composer, i11);
            Z0.A0(this.f105605a, this.f105606b.getFulfillmentSlot(), this.f105606b.getFulfillmentMode().getFulfillmentSlotCardTitle(), null, composer, i11, 4);
            Z0.s0(this.f105605a, this.f105606b.getContactInformation(), this.f105606b.getFulfillmentMode().getDeliveryMode(), null, composer, i11, 4);
            Z0.h1(this.f105605a, null, this.f105606b.getPreTipDecorator(), this.f105606b.getDeliveryInstructions(), this.f105607c, this.f105608d, this.f105609e, composer, i11, 1);
            Z0.T0(this.f105605a, this.f105606b.getPickupPerson(), this.f105606b.getFulfillmentMode().getDeliveryMode(), null, composer, i11, 4);
            Z0.Y(this.f105605a, null, this.f105606b.getCartItems(), null, composer, i11, 5);
            Z0.e1(this.f105605a, this.f105606b.getSubstitutionPreference(), null, composer, i11, 2);
            Z0.x0(this.f105605a, this.f105606b.getDeliveryInstructions(), null, composer, i11, 2);
            Z0.R0(this.f105605a, null, this.f105606b.getCardDetails(), this.f105606b.getEbtCardDetails(), this.f105610f, composer, (i12 << 6) | i11 | (i12 << 9), 1);
            Z0.U(this.f105605a, this.f105606b.getBillingAddress(), composer, i11);
            Z0.M0(this.f105605a, null, this.f105606b, this.f105611g, this.f105612h, this.f105613i, composer, i11, 1);
            if (this.f105606b.getDisplayInstacartTermsOfServiceAgreement()) {
                Z0.D0(this.f105605a, null, this.f105614j, composer, i11, 1);
            }
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
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CheckoutViewState f105615a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105616b;

        f(CheckoutViewState checkoutViewState, LocalThemeScope localThemeScope) {
            this.f105615a = checkoutViewState;
            this.f105616b = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1416737253, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CheckoutScreen.<anonymous> (CheckoutScreen.kt:213)");
            }
            Bm.A.c(false, this.f105615a.getCheckoutFlowState(), true, composer, 384, 1);
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 8;
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            Im.j.b(this.f105616b, null, C16338g.c(com.meijer.mobile.meijer.Y.f101154r4, composer, 0), C16338g.c(com.meijer.mobile.meijer.Y.f101134q4, composer, 0), this.f105615a.getEbtTimerText(), composer, LocalThemeScope.f17314g, 1);
            C17983Z.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null), this.f105616b.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 6, 12);
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
    static final class g implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CheckoutViewState f105617a;

        g(CheckoutViewState checkoutViewState) {
            this.f105617a = checkoutViewState;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(913389431, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CheckoutScreen.<anonymous> (CheckoutScreen.kt:151)");
            }
            Bm.A.c(false, this.f105617a.getCheckoutFlowState(), false, composer, 0, 5);
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
    static final class h implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105618a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AnnotatedString f105619b;

        h(LocalThemeScope localThemeScope, AnnotatedString annotatedString) {
            this.f105618a = localThemeScope;
            this.f105619b = annotatedString;
        }

        public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-707607982, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.InstacartTermsOfServiceAgreementSection.<anonymous> (CheckoutScreen.kt:1261)");
            }
            LocalThemeScope localThemeScope = this.f105618a;
            si.j.g(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, this.f105618a.getAdsSpacing().getFive().getDp()), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 382, null), this.f105619b, null, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
            a(interfaceC14888I, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class i implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105620a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckoutViewState f105621b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f105622c;

        i(LocalThemeScope localThemeScope, CheckoutViewState checkoutViewState, InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f105620a = localThemeScope;
            this.f105621b = checkoutViewState;
            this.f105622c = interfaceC5872l0;
        }

        public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-122164038, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.LoadingState.<anonymous>.<anonymous> (CheckoutScreen.kt:1391)");
            }
            LocalThemeScope localThemeScope = this.f105620a;
            Ci.o oVar = null;
            Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null));
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Ci.o oVar2 = Ci.o.f4629a;
            CheckoutViewState checkoutViewState = this.f105621b;
            InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f105622c;
            if (checkoutViewState.getLoadingState().getIsLoading() && !interfaceC5872l0.getValue().booleanValue()) {
                oVar = oVar2;
            }
            if (oVar == null) {
                oVar = Ci.o.f4633e;
            }
            Ci.o oVar3 = oVar;
            AbstractC6392a loadingMessage = this.f105621b.getLoadingState().getLoadingMessage();
            int i11 = AbstractC6392a.f60445b;
            Ci.m.d(localThemeScope, modifierFsUnmask, largeLoading, oVar3, C13698b.a(loadingMessage, composer, i11), C13698b.a(this.f105621b.getLoadingState().getLoadingMessageBody(), composer, i11), null, composer, (q1.k.Large.f142345f << 6) | LocalThemeScope.f17314g, 32);
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
    @SourceDebugExtension
    static final class j implements Function3<ki.R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105623a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<z1.h, Unit> f105624b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f105625a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.R0 f105626b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<z1.h, Unit> f105627c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Z0$j$a$a, reason: collision with other inner class name */
            static final class C1528a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105628a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.R0 f105629b;

                C1528a(LocalThemeScope localThemeScope, ki.R0 r02) {
                    this.f105628a = localThemeScope;
                    this.f105629b = r02;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-948646581, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.OrderCancellationWarningModal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:1573)");
                    }
                    C16671b.b(this.f105628a, this.f105629b.getButtons().getDismissIcon(), null, null, composer, LocalThemeScope.f17314g | (q1.h.DrawableIcon.f142322h << 3), 6);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class b implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105630a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.R0 f105631b;

                b(LocalThemeScope localThemeScope, ki.R0 r02) {
                    this.f105630a = localThemeScope;
                    this.f105631b = r02;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1638230439, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.OrderCancellationWarningModal.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:1603)");
                    }
                    si.j.h(this.f105630a, this.f105631b.getButtons().getMainCTAText(), C16338g.c(C17284b.f163331l, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class c implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105632a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.R0 f105633b;

                c(LocalThemeScope localThemeScope, ki.R0 r02) {
                    this.f105632a = localThemeScope;
                    this.f105633b = r02;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1870828190, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.OrderCancellationWarningModal.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:1617)");
                    }
                    si.j.h(this.f105632a, this.f105633b.getButtons().getCancelText(), C16338g.c(C17284b.f163329k, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, ki.R0 r02, Function1<? super z1.h, Unit> function1) {
                this.f105625a = localThemeScope;
                this.f105626b = r02;
                this.f105627c = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Function1 function1) {
                function1.invoke(z1.h.d.f105972a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(Function1 function1) {
                function1.invoke(z1.h.d.f105972a);
                function1.invoke(z1.h.v.f105993a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(Function1 function1) {
                function1.invoke(z1.h.d.f105972a);
                function1.invoke(z1.h.C12141b.f105970a);
                return Unit.f143329a;
            }

            public final void d(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(55798532, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.OrderCancellationWarningModal.<anonymous>.<anonymous> (CheckoutScreen.kt:1561)");
                }
                e.Companion companion = P0.e.INSTANCE;
                e.b bVarG = companion.g();
                LocalThemeScope localThemeScope = this.f105625a;
                ki.R0 r02 = this.f105626b;
                final Function1<z1.h, Unit> function1 = this.f105627c;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                C5800d c5800d = C5800d.f48779a;
                MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), bVarG, composer, 48);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion2);
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
                float f10 = 8;
                C14890K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null), composer, 6);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion.l(), composer, 0);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion2);
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
                C14890K.a(InterfaceC14888I.b(C14889J.f139620a, companion2, 1.0f, false, 2, null), composer, 0);
                q1.d.ModalButton dismiss = r02.getButtons().getDismiss();
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(function1);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.c1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Z0.j.a.e(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ComposableLambda composableLambdaC = ComposableLambdaKt.c(-948646581, true, new C1528a(localThemeScope, r02), composer, 54);
                int i11 = LocalThemeScope.f17314g;
                int i12 = q1.d.ModalButton.f142218k;
                oi.E0.b(localThemeScope, dismiss, (Function0) objB, composableLambdaC, composer, i11 | 3072 | (i12 << 3));
                C14890K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, H1.h.p(f10), 0.0f, 11, null), composer, 6);
                composer.v();
                C16671b.b(localThemeScope, r02.getIcons().getWarningIcon(), null, null, composer, (q1.h.DrawableIcon.f142322h << 3) | i11, 6);
                float f11 = 16;
                C14890K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, 0.0f, H1.h.p(f11), 7, null), composer, 6);
                float f12 = 24;
                q1.Label labelY = q1.Label.y(r02.getLabels().getHeading(), r02.getLabels().getHeading().getModifier().then(androidx.compose.foundation.layout.D.k(companion2, H1.h.p(f12), 0.0f, 2, null)), null, null, null, 0, false, 0, null, null, 510, null);
                String strC = C16338g.c(C17284b.f163333m, composer, 0);
                int i13 = q1.Label.f142335j;
                si.j.h(localThemeScope, labelY, strC, null, composer, (i13 << 3) | i11, 4);
                C14890K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, 0.0f, H1.h.p(f11), 7, null), composer, 6);
                si.j.h(localThemeScope, q1.Label.y(r02.getLabels().getBody(), r02.getLabels().getBody().getModifier().then(androidx.compose.foundation.layout.D.k(companion2, H1.h.p(f12), 0.0f, 2, null)), null, null, null, 0, false, 0, null, null, 510, null), C16338g.c(C17284b.f163327j, composer, 0), null, composer, (i13 << 3) | i11, 4);
                C14890K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, 0.0f, H1.h.p(32), 7, null), composer, 6);
                q1.d.ModalButton mainCTA = r02.getButtons().getMainCTA();
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(function1);
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.d1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Z0.j.a.f(function1);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                oi.E0.b(localThemeScope, mainCTA, (Function0) objB2, ComposableLambdaKt.c(1638230439, true, new b(localThemeScope, r02), composer, 54), composer, i11 | 3072 | (i12 << 3));
                C14890K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, 0.0f, H1.h.p(12), 7, null), composer, 6);
                q1.d.ModalButton cancel = r02.getButtons().getCancel();
                composer.startReplaceGroup(5004770);
                boolean zV3 = composer.V(function1);
                Object objB3 = composer.B();
                if (zV3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.e1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Z0.j.a.g(function1);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                oi.E0.b(localThemeScope, cancel, (Function0) objB3, ComposableLambdaKt.c(1870828190, true, new c(localThemeScope, r02), composer, 54), composer, i11 | 3072 | (i12 << 3));
                C14890K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, 0.0f, H1.h.p(f12), 7, null), composer, 6);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                d(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        j(LocalThemeScope localThemeScope, Function1<? super z1.h, Unit> function1) {
            this.f105623a = localThemeScope;
            this.f105624b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(z1.h.d.f105972a);
            return Unit.f143329a;
        }

        public final void b(ki.R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-433070121, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.OrderCancellationWarningModal.<anonymous> (CheckoutScreen.kt:1554)");
            }
            LocalThemeScope localThemeScope = this.f105623a;
            q1.ModalTemplate modalTemplateP = Assemble.getModalTemplate();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f105624b);
            final Function1<z1.h, Unit> function1 = this.f105624b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.b1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Z0.j.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17265b.b(localThemeScope, modalTemplateP, (Function0) objB, null, ComposableLambdaKt.c(55798532, true, new a(this.f105623a, Assemble, this.f105624b), composer, 54), composer, LocalThemeScope.f17314g | 24576 | (q1.ModalTemplate.f142363d << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ki.R0 r02, Composer composer, Integer num) {
            b(r02, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final k f105634a = new k();

        k() {
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class l implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f105635a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105636b;

        l(L1.h hVar, LocalThemeScope localThemeScope) {
            this.f105635a = hVar;
            this.f105636b = localThemeScope;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), this.f105635a.getEnd(), this.f105636b.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class m implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105637a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EbtCardChargesDecorator f105638b;

        m(LocalThemeScope localThemeScope, EbtCardChargesDecorator ebtCardChargesDecorator) {
            this.f105637a = localThemeScope;
            this.f105638b = ebtCardChargesDecorator;
        }

        public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(660100778, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.OrderSummarySection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:1092)");
            }
            LocalThemeScope localThemeScope = this.f105637a;
            q1.Label label = new q1.Label(null, this.f105637a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree(), null, 381, null);
            AbstractC6392a amountToChargeCard = this.f105638b.getAmountToChargeCard();
            int i11 = AbstractC6392a.f60445b;
            String strA = C13698b.a(amountToChargeCard, composer, i11);
            int i12 = LocalThemeScope.f17314g;
            int i13 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strA, null, composer, i12 | (i13 << 3), 4);
            LocalThemeScope localThemeScope2 = this.f105637a;
            si.j.h(localThemeScope2, new q1.Label(null, this.f105637a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBodyCompact().getOne(), null, 381, null), C13698b.a(this.f105638b.getCardType(), composer, i11), null, composer, i12 | (i13 << 3), 4);
            LocalThemeScope localThemeScope3 = this.f105637a;
            si.j.h(localThemeScope3, new q1.Label(null, this.f105637a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope3.getAdsTypography().getBody().getTwo(), null, 381, null), C13698b.a(this.f105638b.getAvailableBalance(), composer, i11), null, composer, i12 | (i13 << 3), 4);
            float f10 = 8;
            C17983Z.a(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, H1.h.p(f10), 0.0f, H1.h.p(f10), 5, null), this.f105637a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 6, 12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
            a(interfaceC14902f, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class n implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final n f105639a = new n();

        n() {
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class o implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f105640a;

        o(Function0<Unit> function0) {
            this.f105640a = function0;
        }

        public final void a() {
            this.f105640a.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class p implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final p f105641a = new p();

        p() {
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class q implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f105642a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105643b;

        q(L1.h hVar, LocalThemeScope localThemeScope) {
            this.f105642a = hVar;
            this.f105643b = localThemeScope;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), this.f105642a.getEnd(), this.f105643b.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class r implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105644a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckoutViewState f105645b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CreditCardChargesDecorator f105646c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f105647d;

        r(LocalThemeScope localThemeScope, CheckoutViewState checkoutViewState, CreditCardChargesDecorator creditCardChargesDecorator, Function0<Unit> function0) {
            this.f105644a = localThemeScope;
            this.f105645b = checkoutViewState;
            this.f105646c = creditCardChargesDecorator;
            this.f105647d = function0;
        }

        public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1988214295, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.OrderSummarySection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:1174)");
            }
            LocalThemeScope localThemeScope = this.f105644a;
            q1.Label label = new q1.Label(null, this.f105644a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree(), null, 381, null);
            AbstractC6392a abstractC6392aM = this.f105645b.m();
            int i11 = AbstractC6392a.f60445b;
            String strA = C13698b.a(abstractC6392aM, composer, i11);
            int i12 = LocalThemeScope.f17314g;
            int i13 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strA, null, composer, i12 | (i13 << 3), 4);
            LocalThemeScope localThemeScope2 = this.f105644a;
            si.j.h(localThemeScope2, new q1.Label(null, this.f105644a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBodyCompact().getOne(), null, 381, null), C13698b.a(this.f105646c.getCardType(), composer, i11), null, composer, i12 | (i13 << 3), 4);
            AbstractC6392a ebtNote = this.f105646c.getEbtNote();
            composer.startReplaceGroup(586534953);
            if (ebtNote != null) {
                LocalThemeScope localThemeScope3 = this.f105644a;
                si.j.h(localThemeScope3, new q1.Label(null, localThemeScope3.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope3.getAdsTypography().getDetail().getOne(), null, 381, null), C13698b.a(ebtNote, composer, i11), null, composer, i12 | (i13 << 3), 4);
                Unit unit = Unit.f143329a;
            }
            composer.P();
            AbstractC6392a preAuthAmount = this.f105646c.getPreAuthAmount();
            if (preAuthAmount != null) {
                Bm.X.b(this.f105644a, androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, H1.h.p(4), 0.0f, 0.0f, 13, null), null, preAuthAmount, this.f105647d, null, composer, i12 | 48 | (i11 << 9), 18);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
            a(interfaceC14902f, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class s extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f105648f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(L1.A a10) {
            super(1);
            this.f105648f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f105648f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class t extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f105649f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f105650g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f105651h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ EbtCardChargesDecorator f105652i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105653j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0 f105654k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(L1.n nVar, int i10, Function0 function0, EbtCardChargesDecorator ebtCardChargesDecorator, LocalThemeScope localThemeScope, Function0 function02) {
            super(2);
            this.f105650g = nVar;
            this.f105651h = function0;
            this.f105652i = ebtCardChargesDecorator;
            this.f105653j = localThemeScope;
            this.f105654k = function02;
            this.f105649f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f105650g.getHelpersHashCode();
            this.f105650g.i();
            L1.n nVar = this.f105650g;
            composer.startReplaceGroup(1401929191);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            composer.startReplaceGroup(1984889117);
            C.g cardIcon = this.f105652i.getCardIcon();
            LocalThemeScope localThemeScope = this.f105653j;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = k.f105634a;
                composer.t(objB);
            }
            composer.P();
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(cardIcon, null, null, null, 0.0f, null, nVar.k(companion, hVarA, (Function1) objB), 60, null);
            int i11 = LocalThemeScope.f17314g;
            C16671b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
            LocalThemeScope localThemeScope2 = this.f105653j;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(hVarA) | composer.D(this.f105653j);
            Object objB2 = composer.B();
            if (zV || objB2 == companion2.a()) {
                objB2 = new l(hVarA, this.f105653j);
                composer.t(objB2);
            }
            composer.P();
            C16453n.e(localThemeScope2, new q1.Column(nVar.k(companion, hVarC, (Function1) objB2), null, null, 6, null), ComposableLambdaKt.c(660100778, true, new m(this.f105653j, this.f105652i), composer, 54), composer, i11 | 384 | (q1.Column.f142240d << 3));
            LocalThemeScope localThemeScope3 = this.f105653j;
            Ki.I seven = localThemeScope3.getAdsTypography().getHeadings().getSeven();
            Ki.T adsColorLink = this.f105653j.getAdsColors().getAdsColorLink();
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion2.a()) {
                objB3 = n.f105639a;
                composer.t(objB3);
            }
            composer.P();
            Modifier modifierK = nVar.k(companion, hVarD, (Function1) objB3);
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f105654k);
            Object objB4 = composer.B();
            if (zV2 || objB4 == companion2.a()) {
                objB4 = new o(this.f105654k);
                composer.t(objB4);
            }
            composer.P();
            si.j.h(localThemeScope3, new q1.Label(ClickableKt.d(modifierK, false, null, null, (Function0) objB4, 7, null), adsColorLink, null, null, 0, false, 0, seven, null, 380, null), C13698b.a(this.f105652i.getAdjustAmount(), composer, AbstractC6392a.f60445b), null, composer, i11 | (q1.Label.f142335j << 3), 4);
            composer.P();
            composer.P();
            if (this.f105650g.getHelpersHashCode() != helpersHashCode) {
                this.f105651h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class u extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f105655f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(L1.A a10) {
            super(1);
            this.f105655f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f105655f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class v extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f105656f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f105657g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f105658h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ CreditCardChargesDecorator f105659i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105660j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ CheckoutViewState f105661k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0 f105662l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(L1.n nVar, int i10, Function0 function0, CreditCardChargesDecorator creditCardChargesDecorator, LocalThemeScope localThemeScope, CheckoutViewState checkoutViewState, Function0 function02) {
            super(2);
            this.f105657g = nVar;
            this.f105658h = function0;
            this.f105659i = creditCardChargesDecorator;
            this.f105660j = localThemeScope;
            this.f105661k = checkoutViewState;
            this.f105662l = function02;
            this.f105656f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f105657g.getHelpersHashCode();
            this.f105657g.i();
            L1.n nVar = this.f105657g;
            composer.startReplaceGroup(-1712902984);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            String str = T1.a(this.f105659i.getCardIcon()) + ' ' + C16338g.c(com.meijer.mobile.meijer.Y.f100495J7, composer, 0);
            C.g cardIcon = this.f105659i.getCardIcon();
            composer.startReplaceGroup(-2133460275);
            if (cardIcon != null) {
                LocalThemeScope localThemeScope = this.f105660j;
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = p.f105641a;
                    composer.t(objB);
                }
                composer.P();
                C16671b.b(localThemeScope, new q1.h.DrawableIcon(cardIcon, str, null, null, 0.0f, null, nVar.k(companion, hVarA, (Function1) objB), 60, null), null, null, composer, LocalThemeScope.f17314g | (q1.h.DrawableIcon.f142322h << 3), 6);
            }
            composer.P();
            LocalThemeScope localThemeScope2 = this.f105660j;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(hVarA) | composer.D(this.f105660j);
            Object objB2 = composer.B();
            if (zV || objB2 == Composer.INSTANCE.a()) {
                objB2 = new q(hVarA, this.f105660j);
                composer.t(objB2);
            }
            composer.P();
            C16453n.e(localThemeScope2, new q1.Column(nVar.k(companion2, hVarC, (Function1) objB2), null, null, 6, null), ComposableLambdaKt.c(-1988214295, true, new r(this.f105660j, this.f105661k, this.f105659i, this.f105662l), composer, 54), composer, LocalThemeScope.f17314g | 384 | (q1.Column.f142240d << 3));
            composer.P();
            if (this.f105657g.getHelpersHashCode() != helpersHashCode) {
                this.f105658h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class w implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105663a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f105664b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f105665a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f105666b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f105667c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Z0$w$a$a, reason: collision with other inner class name */
            static final class C1529a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105668a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC15153W f105669b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AbstractC6392a f105670c;

                C1529a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W, AbstractC6392a abstractC6392a) {
                    this.f105668a = localThemeScope;
                    this.f105669b = interfaceC15153W;
                    this.f105670c = abstractC6392a;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(391004469, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.PaymentInformationSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:811)");
                    }
                    si.j.h(this.f105668a, this.f105669b.getLabels().getInfoBlockMessage(), C13698b.a(this.f105670c, composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

            a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W, AbstractC6392a abstractC6392a) {
                this.f105665a = localThemeScope;
                this.f105666b = interfaceC15153W;
                this.f105667c = abstractC6392a;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1901471009, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.PaymentInformationSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:810)");
                }
                C4107g.e(null, 0.0f, ComposableLambdaKt.c(391004469, true, new C1529a(this.f105665a, this.f105666b, this.f105667c), composer, 54), composer, 384, 3);
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

        w(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a) {
            this.f105663a = localThemeScope;
            this.f105664b = abstractC6392a;
        }

        public final void a(InterfaceC15153W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(354340212, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.PaymentInformationSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:809)");
            }
            C16912d.e(this.f105663a, Assemble.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.c(1901471009, true, new a(this.f105663a, Assemble, this.f105664b), composer, 54), composer, LocalThemeScope.f17314g | 384 | (q1.InfoBlock.f142332c << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            a(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class x implements Function3<ki.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105671a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<z1.h, Unit> f105672b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f105673a;

            a(LocalThemeScope localThemeScope) {
                this.f105673a = localThemeScope;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-998930765, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.PaymentInformationSection.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:830)");
                }
                LocalThemeScope localThemeScope = this.f105673a;
                q1.Label label = new q1.Label(null, this.f105673a.getAdsColors().getAdsColorEnabled01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 381, null);
                String upperCase = C16338g.c(com.meijer.mobile.meijer.Y.f100372D0, composer, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                si.j.h(localThemeScope, label, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            Z0.f105560a = false;
            function1.invoke(z1.h.o.f105985a);
            return Unit.f143329a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        x(LocalThemeScope localThemeScope, Function1<? super z1.h, Unit> function1) {
            this.f105671a = localThemeScope;
            this.f105672b = function1;
        }

        public final void b(ki.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(564223430, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.PaymentInformationSection.<anonymous>.<anonymous> (CheckoutScreen.kt:823)");
            }
            LocalThemeScope localThemeScope = this.f105671a;
            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f105672b);
            final Function1<z1.h, Unit> function1 = this.f105672b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.f1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Z0.x.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            oi.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-998930765, true, new a(this.f105671a), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class y implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105674a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f105675b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f105676a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f105677b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f105678c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Z0$y$a$a, reason: collision with other inner class name */
            static final class C1530a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105679a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC15153W f105680b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f105681c;

                C1530a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W, String str) {
                    this.f105679a = localThemeScope;
                    this.f105680b = interfaceC15153W;
                    this.f105681c = str;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(632410300, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.SectionItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:1348)");
                    }
                    si.j.h(this.f105679a, this.f105680b.getLabels().getInfoBlockMessage(), this.f105681c, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

            a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W, String str) {
                this.f105676a = localThemeScope;
                this.f105677b = interfaceC15153W;
                this.f105678c = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-690716760, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.SectionItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:1347)");
                }
                C4107g.e(null, 0.0f, ComposableLambdaKt.c(632410300, true, new C1530a(this.f105676a, this.f105677b, this.f105678c), composer, 54), composer, 384, 3);
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

        y(LocalThemeScope localThemeScope, String str) {
            this.f105674a = localThemeScope;
            this.f105675b = str;
        }

        public final void a(InterfaceC15153W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(438653115, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.SectionItem.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:1346)");
            }
            C16912d.e(this.f105674a, Assemble.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.c(-690716760, true, new a(this.f105674a, Assemble, this.f105675b), composer, 54), composer, LocalThemeScope.f17314g | 384 | (q1.InfoBlock.f142332c << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            a(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class z implements Function3<ki.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105682a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f105683b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Integer f105684c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Integer f105685a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f105686b;

            a(Integer num, LocalThemeScope localThemeScope) {
                this.f105685a = num;
                this.f105686b = localThemeScope;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-229378860, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.SectionItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:1363)");
                }
                Integer num = this.f105685a;
                if (num != null) {
                    LocalThemeScope localThemeScope = this.f105686b;
                    q1.Label label = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorEnabled01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 381, null);
                    String upperCase = C16338g.c(num.intValue(), composer, 0).toUpperCase(Locale.ROOT);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    si.j.h(localThemeScope, label, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        z(LocalThemeScope localThemeScope, Function0<Unit> function0, Integer num) {
            this.f105682a = localThemeScope;
            this.f105683b = function0;
            this.f105684c = num;
        }

        public final void b(ki.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1570409505, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.SectionItem.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:1359)");
            }
            LocalThemeScope localThemeScope = this.f105682a;
            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f105683b);
            final Function0<Unit> function0 = this.f105683b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.g1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Z0.z.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            oi.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-229378860, true, new a(this.f105684c, this.f105682a), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0a2e  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0a34  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0a3d  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0a41  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0b6b  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0b76  */
    /* JADX WARN: Removed duplicated region for block: B:316:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01bf  */
    /* JADX WARN: Type inference failed for: r10v32, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [androidx.compose.runtime.n1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void M0(final Ki.LocalThemeScope r63, androidx.compose.ui.Modifier r64, com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewState r65, final kotlin.jvm.functions.Function0<kotlin.Unit> r66, final kotlin.jvm.functions.Function0<kotlin.Unit> r67, final kotlin.jvm.functions.Function0<kotlin.Unit> r68, androidx.compose.runtime.Composer r69, final int r70, final int r71) {
        /*
            Method dump skipped, instructions count: 2955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.M0(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.review.D1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(Modifier modifier, Function2 function2, int i10, int i11, Composer composer, int i12) {
        W(modifier, function2, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00df A[PHI: r20
      0x00df: PHI (r20v10 int) = (r20v0 int), (r20v3 int), (r20v4 int) binds: [B:80:0x00dd, B:87:0x00f1, B:86:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0111  */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void b1(final Ki.LocalThemeScope r42, androidx.compose.ui.Modifier r43, final int r44, java.lang.Integer r45, java.lang.String r46, final java.lang.String[] r47, java.lang.String r48, boolean r49, kotlin.jvm.functions.Function0<kotlin.Unit> r50, androidx.compose.runtime.Composer r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 1199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.b1(Ki.M, androidx.compose.ui.Modifier, int, java.lang.Integer, java.lang.String, java.lang.String[], java.lang.String, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h1(final Ki.LocalThemeScope r68, androidx.compose.ui.Modifier r69, com.meijer.mobile.meijer.activity.checkout.review.PreTipDecorator r70, com.meijer.mobile.meijer.activity.checkout.review.DeliveryInstructionsDecorator r71, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.review.z1.m, kotlin.Unit> r72, final kotlin.jvm.functions.Function1<? super xs.EnumC18220b, kotlin.Unit> r73, final kotlin.jvm.functions.Function1<? super java.lang.Double, kotlin.Unit> r74, androidx.compose.runtime.Composer r75, final int r76, final int r77) {
        /*
            Method dump skipped, instructions count: 2185
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.h1(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.review.V1, com.meijer.mobile.meijer.activity.checkout.review.M1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i0(final Ki.LocalThemeScope r32, androidx.compose.ui.Modifier r33, final com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewState r34, boolean r35, androidx.compose.runtime.InterfaceC5872l0<java.lang.Boolean> r36, androidx.compose.runtime.InterfaceC5872l0<java.lang.Boolean> r37, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.review.z1.h, kotlin.Unit> r38, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.review.z1.m, kotlin.Unit> r39, kotlin.jvm.functions.Function1<? super xs.EnumC18220b, kotlin.Unit> r40, kotlin.jvm.functions.Function1<? super java.lang.Double, kotlin.Unit> r41, kotlin.jvm.functions.Function0<kotlin.Unit> r42, kotlin.jvm.functions.Function0<kotlin.Unit> r43, kotlin.jvm.functions.Function0<kotlin.Unit> r44, kotlin.jvm.functions.Function0<kotlin.Unit> r45, androidx.compose.runtime.Composer r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 1255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.i0(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.review.D1, boolean, androidx.compose.runtime.l0, androidx.compose.runtime.l0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0(final Ki.LocalThemeScope r16, com.meijer.mobile.meijer.activity.checkout.review.FulfillmentSlotInfoDecorator r17, final int r18, android.content.Context r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.A0(Ki.M, com.meijer.mobile.meijer.activity.checkout.review.R1, int, android.content.Context, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B0(Context context) {
        context.startActivity(FulfillmentSlotsActivity.INSTANCE.a(context, new FulfillmentSlotsActivity.FulfillmentSlotsActivityExtras(true, true)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C0(LocalThemeScope localThemeScope, FulfillmentSlotInfoDecorator r12, int i10, Context context, int i11, int i12, Composer composer, int i13) {
        A0(localThemeScope, r12, i10, context, composer, androidx.compose.runtime.J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void D0(final Ki.LocalThemeScope r37, androidx.compose.ui.Modifier r38, final kotlin.jvm.functions.Function0<kotlin.Unit> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.D0(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(Function0 function0, androidx.compose.ui.text.f it) {
        Intrinsics.j(it, "it");
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F0(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        D0(localThemeScope, modifier, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void G0(final Ki.LocalThemeScope r14, com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewState r15, androidx.compose.runtime.InterfaceC5872l0<java.lang.Boolean> r16, androidx.compose.runtime.InterfaceC5872l0<java.lang.Boolean> r17, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.review.z1.h, kotlin.Unit> r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.G0(Ki.M, com.meijer.mobile.meijer.activity.checkout.review.D1, androidx.compose.runtime.l0, androidx.compose.runtime.l0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H0(z1.h it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I0(LocalThemeScope localThemeScope, CheckoutViewState checkoutViewState, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, Function1 function1, int i10, int i11, Composer composer, int i12) {
        G0(localThemeScope, checkoutViewState, interfaceC5872l0, interfaceC5872l02, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K0(z1.h it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L0(LocalThemeScope localThemeScope, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        J0(localThemeScope, z10, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N0(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P0(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.v(semantics);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q0(LocalThemeScope localThemeScope, Modifier modifier, CheckoutViewState checkoutViewState, Function0 function0, Function0 function02, Function0 function03, int i10, int i11, Composer composer, int i12) {
        M0(localThemeScope, modifier, checkoutViewState, function0, function02, function03, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void R0(final Ki.LocalThemeScope r43, androidx.compose.ui.Modifier r44, final com.meijer.mobile.meijer.activity.checkout.review.CardDetailsDecorator r45, com.meijer.mobile.meijer.activity.checkout.review.EbtCardDetailsDecorator r46, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.review.z1.h, kotlin.Unit> r47, androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.R0(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.review.q, com.meijer.mobile.meijer.activity.checkout.review.O1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S0(LocalThemeScope localThemeScope, Modifier modifier, CardDetailsDecorator cardDetailsDecorator, EbtCardDetailsDecorator ebtCardDetailsDecorator, Function1 function1, int i10, int i11, Composer composer, int i12) {
        R0(localThemeScope, modifier, cardDetailsDecorator, ebtCardDetailsDecorator, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void T0(final Ki.LocalThemeScope r16, com.meijer.mobile.meijer.activity.checkout.review.PickupPersonDecorator r17, final java.lang.String r18, android.content.Context r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.T0(Ki.M, com.meijer.mobile.meijer.activity.checkout.review.U1, java.lang.String, android.content.Context, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(final LocalThemeScope localThemeScope, final AddressDecorator addressDecorator, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1697388329);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(addressDecorator) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1697388329, i11, -1, "com.meijer.mobile.meijer.activity.checkout.review.BillingAddressSection (CheckoutScreen.kt:843)");
            }
            int i12 = i11;
            int i13 = Cj.i.f4840x0;
            String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100862cb, composerStartRestartGroup, 0);
            String[] strArr = (String[]) Arrays.copyOf(new String[]{addressDecorator.getName(), addressDecorator.getAddressLine1(), addressDecorator.getAddressLine2(), addressDecorator.getAddressCityStateZip()}, 4);
            Integer error = addressDecorator.getError();
            composerStartRestartGroup.startReplaceGroup(897403921);
            String strC2 = error == null ? null : C16338g.c(error.intValue(), composerStartRestartGroup, 0);
            composerStartRestartGroup.P();
            b1(localThemeScope, null, i13, null, strC, strArr, strC2, false, null, composerStartRestartGroup, LocalThemeScope.f17314g | (i12 & 14), 197);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.checkout.review.D0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Z0.V(localThemeScope, addressDecorator, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U0(Context context) {
        context.startActivity(PickupPersonFormActivity.Companion.b(PickupPersonFormActivity.INSTANCE, context, true, false, 4, null));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(LocalThemeScope localThemeScope, AddressDecorator addressDecorator, int i10, Composer composer, int i11) {
        U(localThemeScope, addressDecorator, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V0(LocalThemeScope localThemeScope, PickupPersonDecorator pickupPersonDecorator, String str, Context context, int i10, int i11, Composer composer, int i12) {
        T0(localThemeScope, pickupPersonDecorator, str, context, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W0(final LocalThemeScope localThemeScope, final Q1 q12, final StoreDecorator storeDecorator, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-658629448);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(q12) : composerStartRestartGroup.D(q12) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(storeDecorator) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-658629448, i11, -1, "com.meijer.mobile.meijer.activity.checkout.review.PickupStoreSection (CheckoutScreen.kt:274)");
            }
            String strA = C13698b.a(q12.getDescription(), composerStartRestartGroup, AbstractC6392a.f60445b);
            int i12 = LocalThemeScope.f17314g;
            int i13 = i11 & 14;
            Y0(localThemeScope, null, strA, composerStartRestartGroup, i12 | i13, 1);
            if (Intrinsics.e(q12, Q1.d.f105472f)) {
                int i14 = Cj.i.f4717L1;
                Integer numValueOf = Integer.valueOf(com.meijer.mobile.meijer.Y.f100492J4);
                String strC = C16338g.c(com.meijer.mobile.meijer.Y.f101001jb, composerStartRestartGroup, 0);
                String[] strArr = {storeDecorator.getName(), storeDecorator.getAddressLine1(), storeDecorator.getAddressCityStateZip()};
                Integer error = storeDecorator.getError();
                composerStartRestartGroup.startReplaceGroup(-1582683022);
                String strC2 = error == null ? null : C16338g.c(error.intValue(), composerStartRestartGroup, 0);
                composerStartRestartGroup.P();
                b1(localThemeScope, null, i14, numValueOf, strC, strArr, strC2, false, null, composerStartRestartGroup, i12 | i13, 193);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.checkout.review.F0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Z0.X0(localThemeScope, q12, storeDecorator, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X0(LocalThemeScope localThemeScope, Q1 q12, StoreDecorator storeDecorator, int i10, Composer composer, int i11) {
        W0(localThemeScope, q12, storeDecorator, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0248  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Y(final Ki.LocalThemeScope r39, androidx.compose.ui.Modifier r40, final com.meijer.mobile.meijer.activity.checkout.review.CartItemsDecorator r41, android.content.Context r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 1374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.Y(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.review.u, android.content.Context, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void Y0(final Ki.LocalThemeScope r26, androidx.compose.ui.Modifier r27, final java.lang.String r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.Y0(Ki.M, androidx.compose.ui.Modifier, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z0(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.v(semantics);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(Context context) {
        context.startActivity(EditCartActivity.INSTANCE.a(context));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a1(LocalThemeScope localThemeScope, Modifier modifier, String str, int i10, int i11, Composer composer, int i12) {
        Y0(localThemeScope, modifier, str, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(LocalThemeScope localThemeScope, Modifier modifier, CartItemsDecorator cartItemsDecorator, Context context, int i10, int i11, Composer composer, int i12) {
        Y(localThemeScope, modifier, cartItemsDecorator, context, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void c0(final Ki.LocalThemeScope r47, androidx.compose.ui.Modifier r48, com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewState r49, androidx.compose.runtime.InterfaceC5872l0<java.lang.Boolean> r50, androidx.compose.runtime.InterfaceC5872l0<java.lang.Boolean> r51, android.content.Context r52, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.review.z1.h, kotlin.Unit> r53, androidx.compose.runtime.Composer r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.c0(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.review.D1, androidx.compose.runtime.l0, androidx.compose.runtime.l0, android.content.Context, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c1(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d0(z1.h it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d1(LocalThemeScope localThemeScope, Modifier modifier, int i10, Integer num, String str, String[] strArr, String str2, boolean z10, Function0 function0, int i11, int i12, Composer composer, int i13) {
        b1(localThemeScope, modifier, i10, num, str, strArr, str2, z10, function0, composer, androidx.compose.runtime.J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e1(final Ki.LocalThemeScope r15, final com.meijer.mobile.meijer.activity.checkout.review.SubstitutionPreferenceDecorator r16, android.content.Context r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.e1(Ki.M, com.meijer.mobile.meijer.activity.checkout.review.Y1, android.content.Context, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f1(Context context, SubstitutionPreferenceDecorator substitutionPreferenceDecorator) {
        context.startActivity(SubstitutionPreferenceFormActivity.INSTANCE.a(context, substitutionPreferenceDecorator.getName()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g1(LocalThemeScope localThemeScope, SubstitutionPreferenceDecorator substitutionPreferenceDecorator, Context context, int i10, int i11, Composer composer, int i12) {
        e1(localThemeScope, substitutionPreferenceDecorator, context, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(LocalThemeScope localThemeScope, Modifier modifier, CheckoutViewState checkoutViewState, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, Context context, Function1 function1, int i10, int i11, Composer composer, int i12) {
        c0(localThemeScope, modifier, checkoutViewState, interfaceC5872l0, interfaceC5872l02, context, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i1(z1.m it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(z1.h it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k0() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l1(LocalThemeScope localThemeScope, Modifier modifier, PreTipDecorator preTipDecorator, DeliveryInstructionsDecorator deliveryInstructionsDecorator, Function1 function1, Function1 function12, Function1 function13, int i10, int i11, Composer composer, int i12) {
        h1(localThemeScope, modifier, preTipDecorator, deliveryInstructionsDecorator, function1, function12, function13, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m0() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n0(LocalThemeScope localThemeScope, Modifier modifier, CheckoutViewState checkoutViewState, boolean z10, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i10, int i11, int i12, Composer composer, int i13) {
        i0(localThemeScope, modifier, checkoutViewState, z10, interfaceC5872l0, interfaceC5872l02, function1, function12, function13, function14, function0, function02, function03, function04, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o0(z1.m it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(EnumC18220b it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q0(double d10) {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s0(final Ki.LocalThemeScope r16, com.meijer.mobile.meijer.activity.checkout.contactinformation.ContactInformationDecorator r17, final java.lang.String r18, android.content.Context r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.s0(Ki.M, com.meijer.mobile.meijer.activity.checkout.contactinformation.a, java.lang.String, android.content.Context, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t0(Context context) {
        context.startActivity(DeliveryContactInformationFormActivity.INSTANCE.a(context, true));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u0(LocalThemeScope localThemeScope, ContactInformationDecorator contactInformationDecorator, String str, Context context, int i10, int i11, Composer composer, int i12) {
        s0(localThemeScope, contactInformationDecorator, str, context, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(final LocalThemeScope localThemeScope, final AddressDecorator addressDecorator, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1185577330);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(addressDecorator) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1185577330, i11, -1, "com.meijer.mobile.meijer.activity.checkout.review.DeliveryAddressSection (CheckoutScreen.kt:684)");
            }
            if (addressDecorator != null) {
                int i12 = Cj.i.f4840x0;
                Integer numValueOf = Integer.valueOf(com.meijer.mobile.meijer.Y.f100492J4);
                String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100922fb, composerStartRestartGroup, 0);
                String[] strArr = {addressDecorator.getName(), addressDecorator.getAddressLine1(), addressDecorator.getAddressLine2(), addressDecorator.getAddressCityStateZip()};
                Integer error = addressDecorator.getError();
                composerStartRestartGroup.startReplaceGroup(1173500812);
                String strC2 = error == null ? null : C16338g.c(error.intValue(), composerStartRestartGroup, 0);
                composerStartRestartGroup.P();
                b1(localThemeScope, null, i12, numValueOf, strC, strArr, strC2, false, null, composerStartRestartGroup, LocalThemeScope.f17314g | (i11 & 14), 193);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.checkout.review.Y0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Z0.w0(localThemeScope, addressDecorator, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w0(LocalThemeScope localThemeScope, AddressDecorator addressDecorator, int i10, Composer composer, int i11) {
        v0(localThemeScope, addressDecorator, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x0(final Ki.LocalThemeScope r15, com.meijer.mobile.meijer.activity.checkout.review.DeliveryInstructionsDecorator r16, android.content.Context r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.x0(Ki.M, com.meijer.mobile.meijer.activity.checkout.review.M1, android.content.Context, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y0(Context context, DeliveryInstructionsDecorator deliveryInstructionsDecorator) {
        EntryNoteActivity.Companion companion = EntryNoteActivity.INSTANCE;
        String instructions = deliveryInstructionsDecorator.getInstructions();
        if (instructions == null) {
            instructions = "";
        }
        context.startActivity(EntryNoteActivity.Companion.b(companion, context, 0, instructions, "com.meijer.intent.extra.EXTRA_DELIVERY_NOTE_TYPE", 2, null));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z0(LocalThemeScope localThemeScope, DeliveryInstructionsDecorator deliveryInstructionsDecorator, Context context, int i10, int i11, Composer composer, int i12) {
        x0(localThemeScope, deliveryInstructionsDecorator, context, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(final LocalThemeScope localThemeScope, final boolean z10, Function1<? super z1.h, Unit> function1, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(-277578377);
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
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.a(z10)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(function1)) {
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
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.review.s0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Z0.K0((z1.h) obj);
                        }
                    };
                    composerStartRestartGroup.t(objB);
                }
                function1 = (Function1) objB;
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-277578377, i12, -1, "com.meijer.mobile.meijer.activity.checkout.review.OrderCancellationWarningModal (CheckoutScreen.kt:1551)");
            }
            if (z10) {
                Ki.Q.e(localThemeScope, C15158a0.f142009a, ComposableLambdaKt.c(-433070121, true, new j(localThemeScope, function1), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 384 | (C15158a0.f142010b << 3));
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Function1<? super z1.h, Unit> function12 = function1;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.checkout.review.t0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Z0.L0(localThemeScope, z10, function12, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O0(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    private static final void W(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(301856652);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
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
            if (composerStartRestartGroup.D(function2)) {
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
                modifier = Modifier.INSTANCE;
            }
            if (i16 != 0) {
                function2 = F1.f105372a.b();
            }
            if (ComposerKt.M()) {
                ComposerKt.U(301856652, i12, -1, "com.meijer.mobile.meijer.activity.checkout.review.CartItemContainer (CheckoutScreen.kt:1641)");
            }
            Modifier modifierV = androidx.compose.foundation.layout.J.v(modifier, H1.h.p(64));
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierV);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            C5806j c5806j = C5806j.f48836a;
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 3) & 14));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.checkout.review.Q0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Z0.X(modifier, function2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final C14478i e0(InterfaceC15467k interfaceC15467k) {
        return interfaceC15467k.getValue();
    }

    private static final float f0(InterfaceC15464h interfaceC15464h) {
        return interfaceC15464h.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g0(InterfaceC15464h interfaceC15464h) {
        return f0(interfaceC15464h);
    }

    private static final boolean j1(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k1(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }
}
