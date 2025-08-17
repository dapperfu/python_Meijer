package com.meijer.mobile.meijer.activity.checkout.review;

import Ji.C;
import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import P0.e;
import ak.AbstractC5607a;
import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import b5.C6197c;
import ck.C6408b;
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
import com.meijer.mobile.rateandtip.ux.C12702a;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import g6.C14209i;
import ii.C14732c;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import java.util.Arrays;
import java.util.Locale;
import ji.C14924a0;
import ji.InterfaceC14919W;
import ji.InterfaceC14920X;
import ji.InterfaceC14926b0;
import ji.q1;
import k6.InterfaceC15105h;
import k6.InterfaceC15108k;
import kotlin.C17917Z;
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
import l5.C15372h;
import oi.C16088n;
import p1.C16190d;
import p1.C16193g;
import pi.C16307b;
import qi.C16531d;
import qv.InterfaceC16622O;
import r0.C16692i;
import si.C16977b;
import tr.C17135b;
import xs.EnumC18092b;

@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001aç\u0001\u0010\u0019\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\n2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\n2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a/\u0010!\u001a\u00020\f*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0003¢\u0006\u0004\b!\u0010\"\u001a#\u0010'\u001a\u00020\f*\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0003¢\u0006\u0004\b'\u0010(\u001a1\u0010-\u001a\u00020\f*\u00020\u00002\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010,\u001a\u00020+2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0003¢\u0006\u0004\b-\u0010.\u001ao\u00103\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u00100\u001a\u00020/2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\nH\u0003¢\u0006\u0004\b3\u00104\u001a1\u00107\u001a\u00020\f*\u00020\u00002\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\u0006\u0010,\u001a\u00020+2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0003¢\u0006\u0004\b7\u00108\u001a/\u0010;\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010:\u001a\u0002092\b\b\u0002\u0010 \u001a\u00020\u001fH\u0003¢\u0006\u0004\b;\u0010<\u001a\u001d\u0010?\u001a\u00020\f*\u00020\u00002\b\u0010>\u001a\u0004\u0018\u00010=H\u0003¢\u0006\u0004\b?\u0010@\u001a)\u0010A\u001a\u00020\f*\u00020\u00002\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\b\b\u0002\u0010 \u001a\u00020\u001fH\u0003¢\u0006\u0004\bA\u0010B\u001a%\u0010E\u001a\u00020\f*\u00020\u00002\u0006\u0010D\u001a\u00020C2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0003¢\u0006\u0004\bE\u0010F\u001aE\u0010K\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010H\u001a\u00020G2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010I2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0003¢\u0006\u0004\bK\u0010L\u001a\u001b\u0010N\u001a\u00020\f*\u00020\u00002\u0006\u0010M\u001a\u00020=H\u0003¢\u0006\u0004\bN\u0010@\u001aS\u0010O\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\u0003¢\u0006\u0004\bO\u0010P\u001a+\u0010Q\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\u0003¢\u0006\u0004\bQ\u0010R\u001a%\u0010T\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010S\u001a\u00020+H\u0003¢\u0006\u0004\bT\u0010U\u001a\u007f\u0010]\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010V\u001a\u00020\u001d2\n\b\u0003\u0010W\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010+2\u0016\u0010Y\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010+0X\"\u0004\u0018\u00010+2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010[\u001a\u00020\u00052\u0010\b\u0002\u0010\\\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0014H\u0003¢\u0006\u0004\b]\u0010^\u001aU\u0010_\u001a\u00020\f*\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0003¢\u0006\u0004\b_\u0010`\u001ai\u0010a\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010 \u001a\u00020\u001f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0003¢\u0006\u0004\ba\u0010b\u001a1\u0010d\u001a\u00020\f*\u00020\u00002\u0006\u0010c\u001a\u00020\u00052\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0003¢\u0006\u0004\bd\u0010e\u001a)\u0010g\u001a\u00020\f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010f\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\u0003¢\u0006\u0004\bg\u0010h\"\u0016\u0010k\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010j\"\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020m0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010o¨\u0006v²\u0006\u000e\u0010q\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010s\u001a\u0004\u0018\u00010r8\nX\u008a\u0084\u0002²\u0006\f\u0010u\u001a\u00020t8\nX\u008a\u0084\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/checkout/review/D1;", "viewState", "", "cardSet", "Landroidx/compose/runtime/l0;", "isScreenVisible", "displayCheckoutAnimations", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "", "onAction", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$m;", "onPreTipAction", "Lxs/b;", "setSelectedTipOption", "", "setCustomTipAmount", "Lkotlin/Function0;", "onAdjustEbtPayment", "onPreAuthToolTipClicked", "onShowExtendedRangeInfoClicked", "onTermsOfServiceLinkClicked", "i0", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/review/D1;ZLandroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/R1;", "fulfillmentSlot", "", "fulfillmentSlotCardTitle", "Landroid/content/Context;", "context", "A0", "(LJi/M;Lcom/meijer/mobile/meijer/activity/checkout/review/R1;ILandroid/content/Context;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/Q1;", "fulfillmentModeDecorator", "Lcom/meijer/mobile/meijer/activity/checkout/review/X1;", "storeDecorator", "W0", "(LJi/M;Lcom/meijer/mobile/meijer/activity/checkout/review/Q1;Lcom/meijer/mobile/meijer/activity/checkout/review/X1;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/a;", "contactInformation", "", "deliveryMode", "s0", "(LJi/M;Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/a;Ljava/lang/String;Landroid/content/Context;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/V1;", "preTipDecorator", "Lcom/meijer/mobile/meijer/activity/checkout/review/M1;", "deliveryInstructions", "h1", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/review/V1;Lcom/meijer/mobile/meijer/activity/checkout/review/M1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/U1;", "pickupPerson", "T0", "(LJi/M;Lcom/meijer/mobile/meijer/activity/checkout/review/U1;Ljava/lang/String;Landroid/content/Context;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/u;", "cartItemsDecorator", "Y", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/review/u;Landroid/content/Context;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/a;", "deliveryAddress", "v0", "(LJi/M;Lcom/meijer/mobile/meijer/activity/checkout/review/a;Landroidx/compose/runtime/Composer;I)V", "x0", "(LJi/M;Lcom/meijer/mobile/meijer/activity/checkout/review/M1;Landroid/content/Context;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/Y1;", "substitutionPreference", "e1", "(LJi/M;Lcom/meijer/mobile/meijer/activity/checkout/review/Y1;Landroid/content/Context;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/q;", "creditCardDetails", "Lcom/meijer/mobile/meijer/activity/checkout/review/O1;", "ebtCardDetails", "R0", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/review/q;Lcom/meijer/mobile/meijer/activity/checkout/review/O1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "billingAddress", "U", "M0", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/review/D1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "D0", "(LJi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "title", "Y0", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", BarcodePickDeserializer.FIELD_ICON, "actionTitle", "", "lines", "error", "displayDivider", "onEditAction", "b1", "(LJi/M;Landroidx/compose/ui/Modifier;ILjava/lang/Integer;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "G0", "(LJi/M;Lcom/meijer/mobile/meijer/activity/checkout/review/D1;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "c0", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/review/D1;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "showOrderCancelWarning", "J0", "(LJi/M;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "content", "W", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "a", "Z", "isCardSet", "Lkotlin/enums/EnumEntries;", "Lcom/meijer/mobile/meijer/activity/checkout/review/r;", "b", "Lkotlin/enums/EnumEntries;", "cartItems", "shouldShowNoTipError", "Lg6/i;", "composition", "", "progress", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class Z0 {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f104705a;

    /* renamed from: b, reason: collision with root package name */
    private static final EnumEntries<com.meijer.mobile.meijer.activity.checkout.review.r> f104706b = com.meijer.mobile.meijer.activity.checkout.review.r.b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class A implements Function3<ji.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104707a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<z1.m, Unit> f104708b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f104709c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f104710a;

            a(LocalThemeScope localThemeScope) {
                this.f104710a = localThemeScope;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(317443569, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.TipYourShopperSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:389)");
                }
                LocalThemeScope localThemeScope = this.f104710a;
                q1.Label label = new q1.Label(null, this.f104710a.getAdsColors().getAdsColorEnabled01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 381, null);
                String upperCase = C16193g.c(com.meijer.mobile.meijer.Y.f99554F4, composer, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                ri.j.h(localThemeScope, label, upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, InterfaceC5730l0 interfaceC5730l0) {
            Z0.k1(interfaceC5730l0, false);
            function1.invoke(new z1.m.SetPreTipStatus(W1.f104662a));
            return Unit.f142422a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        A(LocalThemeScope localThemeScope, Function1<? super z1.m, Unit> function1, InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f104707a = localThemeScope;
            this.f104708b = function1;
            this.f104709c = interfaceC5730l0;
        }

        public final void b(ji.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1827591940, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.TipYourShopperSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:381)");
            }
            LocalThemeScope localThemeScope = this.f104707a;
            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f104708b);
            final Function1<z1.m, Unit> function1 = this.f104708b;
            final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f104709c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.h1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Z0.A.c(function1, interfaceC5730l0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(317443569, true, new a(this.f104707a), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class B implements Function3<InterfaceC14926b0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104711a;

        B(LocalThemeScope localThemeScope) {
            this.f104711a = localThemeScope;
        }

        public final void a(InterfaceC14926b0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1659167014, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.TipYourShopperSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:425)");
            }
            Ci.j.i(this.f104711a, null, C16193g.c(C12702a.f115108p, composer, 0), null, Assemble.getToastVariant().getError(), null, composer, LocalThemeScope.f15770g | (q1.m.Inline.f140121h << 12), 21);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14926b0 interfaceC14926b0, Composer composer, Integer num) {
            a(interfaceC14926b0, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class C implements Function3<ji.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104712a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC14800I f104713b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f104714c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<z1.m, Unit> f104715d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f104716a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ji.j1 f104717b;

            a(LocalThemeScope localThemeScope, ji.j1 j1Var) {
                this.f104716a = localThemeScope;
                this.f104717b = j1Var;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-829629273, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.TipYourShopperSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:455)");
                }
                ri.j.h(this.f104716a, this.f104717b.getLabels().getEnabledLabel(), C16193g.c(C12702a.f115087D, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C(LocalThemeScope localThemeScope, InterfaceC14800I interfaceC14800I, Modifier modifier, Function1<? super z1.m, Unit> function1) {
            this.f104712a = localThemeScope;
            this.f104713b = interfaceC14800I;
            this.f104714c = modifier;
            this.f104715d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(new z1.m.SetPreTipStatus(W1.f104663b));
            return Unit.f142422a;
        }

        public final void b(ji.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-928476614, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.TipYourShopperSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:445)");
            }
            LocalThemeScope localThemeScope = this.f104712a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, InterfaceC14800I.b(this.f104713b, this.f104714c, 1.0f, false, 2, null), false, null, 895, null);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f104715d);
            final Function1<z1.m, Unit> function1 = this.f104715d;
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
            ni.E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-829629273, true, new a(this.f104712a, Assemble), composer, 54), composer, (q1.d.StandardButton.f139974k << 3) | LocalThemeScope.f15770g | 3072);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class D implements Function3<ji.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PreTipDecorator f104718a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104719b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<z1.m, Unit> f104720c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC14800I f104721d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f104722e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f104723a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ji.j1 f104724b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ PreTipDecorator f104725c;

            a(LocalThemeScope localThemeScope, ji.j1 j1Var, PreTipDecorator preTipDecorator) {
                this.f104723a = localThemeScope;
                this.f104724b = j1Var;
                this.f104725c = preTipDecorator;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                String strA;
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-708296382, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.TipYourShopperSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:496)");
                }
                LocalThemeScope localThemeScope = this.f104723a;
                q1.Label labelB = Cr.a.b(this.f104724b.getLabels(), !this.f104725c.k());
                if (this.f104725c.m() == 0.0d) {
                    composer.startReplaceGroup(317080803);
                    strA = C16193g.c(C12702a.f115114v, composer, 0);
                    composer.P();
                } else {
                    composer.startReplaceGroup(317253101);
                    strA = C6408b.a(AbstractC5607a.INSTANCE.d(C12702a.f115115w, Double.valueOf(this.f104725c.m())), composer, AbstractC5607a.f45514b);
                    composer.P();
                }
                ri.j.h(localThemeScope, labelB, strA, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        D(PreTipDecorator preTipDecorator, LocalThemeScope localThemeScope, Function1<? super z1.m, Unit> function1, InterfaceC14800I interfaceC14800I, InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f104718a = preTipDecorator;
            this.f104719b = localThemeScope;
            this.f104720c = function1;
            this.f104721d = interfaceC14800I;
            this.f104722e = interfaceC5730l0;
        }

        public final void b(ji.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1540905749, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.TipYourShopperSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:467)");
            }
            q1.d.StandardButton standardButtonA = Cr.a.a(Assemble.getButtons(), !this.f104718a.k());
            LocalThemeScope localThemeScope = this.f104719b;
            Modifier modifierB = InterfaceC14800I.b(this.f104721d, standardButtonA.getModifier(), 1.0f, false, 2, null);
            float f10 = 8;
            float fP = H1.h.p(f10);
            float fP2 = H1.h.p(f10);
            InterfaceC14794C contentPadding = standardButtonA.getContentPadding();
            float top = contentPadding != null ? contentPadding.getTop() : H1.h.p(0);
            InterfaceC14794C contentPadding2 = standardButtonA.getContentPadding();
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(standardButtonA, false, null, null, C16692i.c(H1.h.p(f10)), null, null, androidx.compose.foundation.layout.D.d(fP, top, fP2, contentPadding2 != null ? contentPadding2.getBottom() : H1.h.p(0)), modifierB, false, null, 823, null);
            composer.startReplaceGroup(-1746271574);
            boolean zD = composer.D(this.f104718a) | composer.V(this.f104720c);
            final PreTipDecorator preTipDecorator = this.f104718a;
            final Function1<z1.m, Unit> function1 = this.f104720c;
            final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f104722e;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.j1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Z0.D.c(preTipDecorator, function1, interfaceC5730l0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            ni.E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-708296382, true, new a(this.f104719b, Assemble, this.f104718a), composer, 54), composer, (q1.d.StandardButton.f139974k << 3) | LocalThemeScope.f15770g | 3072);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(PreTipDecorator preTipDecorator, Function1 function1, InterfaceC5730l0 interfaceC5730l0) {
            if (preTipDecorator.m() == 0.0d) {
                Z0.k1(interfaceC5730l0, true);
            } else {
                function1.invoke(new z1.m.SetPreTipStatus(W1.f104664c));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class E implements Function3<InterfaceC14926b0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104726a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PreTipDecorator f104727b;

        E(LocalThemeScope localThemeScope, PreTipDecorator preTipDecorator) {
            this.f104726a = localThemeScope;
            this.f104727b = preTipDecorator;
        }

        public final void a(InterfaceC14926b0 Assemble, Composer composer, int i10) {
            String strC;
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1556404754, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.TipYourShopperSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:538)");
            }
            LocalThemeScope localThemeScope = this.f104726a;
            if (this.f104727b.i()) {
                composer.startReplaceGroup(-1612746820);
                strC = C16193g.c(C12702a.f115103k, composer, 0);
                composer.P();
            } else {
                composer.startReplaceGroup(-1612594083);
                strC = C16193g.c(C12702a.f115104l, composer, 0);
                composer.P();
            }
            Ci.j.i(localThemeScope, null, strC, null, Assemble.getToastVariant().getWarning(), null, composer, LocalThemeScope.f15770g | (q1.m.Inline.f140121h << 12), 21);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14926b0 interfaceC14926b0, Composer composer, Integer num) {
            a(interfaceC14926b0, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Z0$a, reason: case insensitive filesystem */
    static final class C11933a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CartItemsDecorator f104728a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f104729b;

        C11933a(CartItemsDecorator cartItemsDecorator, int i10) {
            this.f104728a = cartItemsDecorator;
            this.f104729b = i10;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-68479671, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CartItemsSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:622)");
            }
            if (!this.f104728a.c().isEmpty() && this.f104729b < this.f104728a.c().size()) {
                EntryDecorator entryDecorator = this.f104728a.c().get(this.f104729b);
                C15372h.a aVar = new C15372h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
                String imageUrl = entryDecorator.getImageUrl();
                if (imageUrl == null) {
                    imageUrl = "";
                }
                C6197c.d(aVar.f(imageUrl).e(true).c(), entryDecorator.getName(), Z4.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())), androidx.compose.foundation.layout.J.v(Modifier.INSTANCE, H1.h.p(64)), C16190d.c(Bj.i.f2681O1, composer, 0), C16190d.c(Bj.i.f2681O1, composer, 0), null, null, null, null, null, InterfaceC5784k.INSTANCE.e(), 0.0f, null, 0, false, null, composer, 3072, 48, 128960);
            }
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
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Z0$b, reason: case insensitive filesystem */
    static final class C11934b implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104730a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Z0$b$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f104731a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f104732b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Z0$b$a$a, reason: collision with other inner class name */
            static final class C1518a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f104733a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC14919W f104734b;

                C1518a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W) {
                    this.f104733a = localThemeScope;
                    this.f104734b = interfaceC14919W;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1013930283, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CartItemsSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:657)");
                    }
                    ri.j.h(this.f104733a, this.f104734b.getLabels().getInfoBlockMessage(), C16193g.c(C14732c.f138022e, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

            a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W) {
                this.f104731a = localThemeScope;
                this.f104732b = interfaceC14919W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1224908225, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CartItemsSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:656)");
                }
                kotlin.g.e(null, 0.0f, ComposableLambdaKt.c(-1013930283, true, new C1518a(this.f104731a, this.f104732b), composer, 54), composer, 384, 3);
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

        C11934b(LocalThemeScope localThemeScope) {
            this.f104730a = localThemeScope;
        }

        public final void a(InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(613077204, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CartItemsSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:655)");
            }
            C16531d.e(this.f104730a, Assemble.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.c(1224908225, true, new a(this.f104730a, Assemble), composer, 54), composer, LocalThemeScope.f15770g | 384 | (q1.InfoBlock.f140077c << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            a(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Z0$c, reason: case insensitive filesystem */
    static final class C11935c implements Function3<ji.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104735a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckoutAnimations f104736b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<z1.h, Unit> f104737c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f104738d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f104739e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f104740f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f104741g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Z0$c$a */
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f104742a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f104743b;

            a(LocalThemeScope localThemeScope, int i10) {
                this.f104742a = localThemeScope;
                this.f104743b = i10;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(38329453, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CheckoutLottieAnimation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:1502)");
                }
                LocalThemeScope localThemeScope = this.f104742a;
                q1.Label label = new q1.Label(null, this.f104742a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 381, null);
                String upperCase = C16193g.c(this.f104743b, composer, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                ri.j.h(localThemeScope, label, upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C11935c(LocalThemeScope localThemeScope, CheckoutAnimations c11948d0, Function1<? super z1.h, Unit> function1, Context context, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5730l0<Boolean> interfaceC5730l02, int i10) {
            this.f104735a = localThemeScope;
            this.f104736b = c11948d0;
            this.f104737c = function1;
            this.f104738d = context;
            this.f104739e = interfaceC5730l0;
            this.f104740f = interfaceC5730l02;
            this.f104741g = i10;
        }

        public final void b(ji.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-178344390, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CheckoutLottieAnimation.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:1471)");
            }
            LocalThemeScope localThemeScope = this.f104735a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.j(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), H1.h.p(16), H1.h.p(8)), false, null, 895, null);
            composer.startReplaceGroup(-1224400529);
            boolean zV = composer.V(this.f104736b) | composer.V(this.f104737c) | composer.D(this.f104738d) | composer.V(this.f104739e) | composer.V(this.f104740f);
            final CheckoutAnimations c11948d0 = this.f104736b;
            final Function1<z1.h, Unit> function1 = this.f104737c;
            final Context context = this.f104738d;
            final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f104739e;
            final InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f104740f;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.a1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Z0.C11935c.c(c11948d0, function1, context, interfaceC5730l0, interfaceC5730l02);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            ni.E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(38329453, true, new a(this.f104735a, this.f104741g), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(CheckoutAnimations c11948d0, Function1 function1, Context context, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02) {
            if (c11948d0.getIsTimeSlotError()) {
                function1.invoke(z1.h.j.f105123a);
                context.startActivity(FulfillmentSlotsActivity.INSTANCE.a(context, new FulfillmentSlotsActivity.FulfillmentSlotsActivityExtras(true, true)));
            } else {
                function1.invoke(new z1.h.SubmitOrderAction(false));
            }
            function1.invoke(new z1.h.SetCheckoutAnimations(false, null));
            interfaceC5730l0.setValue(Boolean.FALSE);
            interfaceC5730l02.setValue(Boolean.TRUE);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutScreenKt$CheckoutLottieAnimation$3$1", f = "CheckoutScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Z0$d, reason: case insensitive filesystem */
    static final class C11936d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f104744a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckoutAnimations f104745b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f104746c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f104747d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<z1.h, Unit> f104748e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ CheckoutViewState f104749f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C11936d(CheckoutAnimations c11948d0, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5730l0<Boolean> interfaceC5730l02, Function1<? super z1.h, Unit> function1, CheckoutViewState checkoutViewState, Continuation<? super C11936d> continuation) {
            super(2, continuation);
            this.f104745b = c11948d0;
            this.f104746c = interfaceC5730l0;
            this.f104747d = interfaceC5730l02;
            this.f104748e = function1;
            this.f104749f = checkoutViewState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C11936d(this.f104745b, this.f104746c, this.f104747d, this.f104748e, this.f104749f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C11936d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Boolean boolA;
            String strE;
            z1.OrderConfirmationInfo orderConfirmationInfoD;
            IntrinsicsKt.f();
            if (this.f104744a == 0) {
                ResultKt.b(obj);
                CheckoutAnimations c11948d0 = this.f104745b;
                Boolean isBopasEligibleCart = null;
                if (c11948d0 != null) {
                    boolA = Boxing.a(c11948d0.getIsErrorEvent());
                } else {
                    boolA = null;
                }
                if (Intrinsics.e(boolA, Boxing.a(true))) {
                    if (!this.f104745b.getIsTimeSlotError()) {
                        this.f104746c.setValue(Boxing.a(true));
                        this.f104747d.setValue(Boxing.a(false));
                        this.f104748e.invoke(z1.h.w.f105139a);
                    }
                } else {
                    CheckoutAnimations c11948d02 = this.f104745b;
                    if (c11948d02 != null && c11948d02.getDisplayEbtPinPad()) {
                        this.f104746c.setValue(Boxing.a(false));
                        this.f104747d.setValue(Boxing.a(false));
                        this.f104748e.invoke(z1.h.v.f105138a);
                    } else {
                        Function1<z1.h, Unit> function1 = this.f104748e;
                        CheckoutAnimations c11948d03 = this.f104745b;
                        if (c11948d03 != null) {
                            strE = c11948d03.getOrderId();
                        } else {
                            strE = null;
                        }
                        CheckoutAnimations c11948d04 = this.f104745b;
                        if (c11948d04 != null) {
                            orderConfirmationInfoD = c11948d04.getInformation();
                        } else {
                            orderConfirmationInfoD = null;
                        }
                        CheckoutViewState checkoutViewState = this.f104749f;
                        if (checkoutViewState != null) {
                            isBopasEligibleCart = checkoutViewState.getIsBopasEligibleCart();
                        }
                        function1.invoke(new z1.h.NavigateToOrderConfirmation(strE, orderConfirmationInfoD, isBopasEligibleCart));
                    }
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Z0$e, reason: case insensitive filesystem */
    static final class C11937e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104750a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckoutViewState f104751b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<z1.m, Unit> f104752c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<EnumC18092b, Unit> f104753d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Double, Unit> f104754e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<z1.h, Unit> f104755f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f104756g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f104757h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f104758i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f104759j;

        /* JADX WARN: Multi-variable type inference failed */
        C11937e(LocalThemeScope localThemeScope, CheckoutViewState checkoutViewState, Function1<? super z1.m, Unit> function1, Function1<? super EnumC18092b, Unit> function12, Function1<? super Double, Unit> function13, Function1<? super z1.h, Unit> function14, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04) {
            this.f104750a = localThemeScope;
            this.f104751b = checkoutViewState;
            this.f104752c = function1;
            this.f104753d = function12;
            this.f104754e = function13;
            this.f104755f = function14;
            this.f104756g = function0;
            this.f104757h = function02;
            this.f104758i = function03;
            this.f104759j = function04;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1437605960, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CheckoutScreen.<anonymous> (CheckoutScreen.kt:154)");
            }
            LocalThemeScope localThemeScope = this.f104750a;
            Q1 fulfillmentMode = this.f104751b.getFulfillmentMode();
            StoreDecorator storeDecorator = this.f104751b.getStoreDecorator();
            int i11 = LocalThemeScope.f15770g;
            int i12 = AbstractC5607a.f45514b;
            Z0.W0(localThemeScope, fulfillmentMode, storeDecorator, composer, (i12 << 3) | i11);
            Z0.v0(this.f104750a, this.f104751b.getDeliveryAddress(), composer, i11);
            Z0.A0(this.f104750a, this.f104751b.getFulfillmentSlot(), this.f104751b.getFulfillmentMode().getFulfillmentSlotCardTitle(), null, composer, i11, 4);
            Z0.s0(this.f104750a, this.f104751b.getContactInformation(), this.f104751b.getFulfillmentMode().getDeliveryMode(), null, composer, i11, 4);
            Z0.h1(this.f104750a, null, this.f104751b.getPreTipDecorator(), this.f104751b.getDeliveryInstructions(), this.f104752c, this.f104753d, this.f104754e, composer, i11, 1);
            Z0.T0(this.f104750a, this.f104751b.getPickupPerson(), this.f104751b.getFulfillmentMode().getDeliveryMode(), null, composer, i11, 4);
            Z0.Y(this.f104750a, null, this.f104751b.getCartItems(), null, composer, i11, 5);
            Z0.e1(this.f104750a, this.f104751b.getSubstitutionPreference(), null, composer, i11, 2);
            Z0.x0(this.f104750a, this.f104751b.getDeliveryInstructions(), null, composer, i11, 2);
            Z0.R0(this.f104750a, null, this.f104751b.getCardDetails(), this.f104751b.getEbtCardDetails(), this.f104755f, composer, (i12 << 6) | i11 | (i12 << 9), 1);
            Z0.U(this.f104750a, this.f104751b.getBillingAddress(), composer, i11);
            Z0.M0(this.f104750a, null, this.f104751b, this.f104756g, this.f104757h, this.f104758i, composer, i11, 1);
            if (this.f104751b.getDisplayInstacartTermsOfServiceAgreement()) {
                Z0.D0(this.f104750a, null, this.f104759j, composer, i11, 1);
            }
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
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CheckoutViewState f104760a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104761b;

        f(CheckoutViewState checkoutViewState, LocalThemeScope localThemeScope) {
            this.f104760a = checkoutViewState;
            this.f104761b = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1416737253, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CheckoutScreen.<anonymous> (CheckoutScreen.kt:213)");
            }
            Am.A.c(false, this.f104760a.getCheckoutFlowState(), true, composer, 384, 1);
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 8;
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            Hm.j.b(this.f104761b, null, C16193g.c(com.meijer.mobile.meijer.Y.f100292r4, composer, 0), C16193g.c(com.meijer.mobile.meijer.Y.f100272q4, composer, 0), this.f104760a.getEbtTimerText(), composer, LocalThemeScope.f15770g, 1);
            C17917Z.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null), this.f104761b.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 6, 12);
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
    static final class g implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CheckoutViewState f104762a;

        g(CheckoutViewState checkoutViewState) {
            this.f104762a = checkoutViewState;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(913389431, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CheckoutScreen.<anonymous> (CheckoutScreen.kt:151)");
            }
            Am.A.c(false, this.f104762a.getCheckoutFlowState(), false, composer, 0, 5);
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
    static final class h implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104763a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AnnotatedString f104764b;

        h(LocalThemeScope localThemeScope, AnnotatedString annotatedString) {
            this.f104763a = localThemeScope;
            this.f104764b = annotatedString;
        }

        public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-707607982, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.InstacartTermsOfServiceAgreementSection.<anonymous> (CheckoutScreen.kt:1261)");
            }
            LocalThemeScope localThemeScope = this.f104763a;
            ri.j.g(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, this.f104763a.getAdsSpacing().getFive().getDp()), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 382, null), this.f104764b, null, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
            a(interfaceC14800I, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class i implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104765a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckoutViewState f104766b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f104767c;

        i(LocalThemeScope localThemeScope, CheckoutViewState checkoutViewState, InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f104765a = localThemeScope;
            this.f104766b = checkoutViewState;
            this.f104767c = interfaceC5730l0;
        }

        public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-122164038, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.LoadingState.<anonymous>.<anonymous> (CheckoutScreen.kt:1391)");
            }
            LocalThemeScope localThemeScope = this.f104765a;
            Bi.o oVar = null;
            Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null));
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Bi.o oVar2 = Bi.o.f2584a;
            CheckoutViewState checkoutViewState = this.f104766b;
            InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f104767c;
            if (checkoutViewState.getLoadingState().getIsLoading() && !interfaceC5730l0.getValue().booleanValue()) {
                oVar = oVar2;
            }
            if (oVar == null) {
                oVar = Bi.o.f2588e;
            }
            Bi.o oVar3 = oVar;
            AbstractC5607a loadingMessage = this.f104766b.getLoadingState().getLoadingMessage();
            int i11 = AbstractC5607a.f45514b;
            Bi.m.d(localThemeScope, modifierFsUnmask, largeLoading, oVar3, C6408b.a(loadingMessage, composer, i11), C6408b.a(this.f104766b.getLoadingState().getLoadingMessageBody(), composer, i11), null, composer, (q1.k.Large.f140090f << 6) | LocalThemeScope.f15770g, 32);
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
    @SourceDebugExtension
    static final class j implements Function3<ji.R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104768a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<z1.h, Unit> f104769b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f104770a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ji.R0 f104771b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<z1.h, Unit> f104772c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Z0$j$a$a, reason: collision with other inner class name */
            static final class C1519a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f104773a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.R0 f104774b;

                C1519a(LocalThemeScope localThemeScope, ji.R0 r02) {
                    this.f104773a = localThemeScope;
                    this.f104774b = r02;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-948646581, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.OrderCancellationWarningModal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:1573)");
                    }
                    C16307b.b(this.f104773a, this.f104774b.getButtons().getDismissIcon(), null, null, composer, LocalThemeScope.f15770g | (q1.h.DrawableIcon.f140067h << 3), 6);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class b implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f104775a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.R0 f104776b;

                b(LocalThemeScope localThemeScope, ji.R0 r02) {
                    this.f104775a = localThemeScope;
                    this.f104776b = r02;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1638230439, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.OrderCancellationWarningModal.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:1603)");
                    }
                    ri.j.h(this.f104775a, this.f104776b.getButtons().getMainCTAText(), C16193g.c(C17135b.f162031l, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class c implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f104777a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.R0 f104778b;

                c(LocalThemeScope localThemeScope, ji.R0 r02) {
                    this.f104777a = localThemeScope;
                    this.f104778b = r02;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1870828190, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.OrderCancellationWarningModal.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:1617)");
                    }
                    ri.j.h(this.f104777a, this.f104778b.getButtons().getCancelText(), C16193g.c(C17135b.f162029k, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, ji.R0 r02, Function1<? super z1.h, Unit> function1) {
                this.f104770a = localThemeScope;
                this.f104771b = r02;
                this.f104772c = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Function1 function1) {
                function1.invoke(z1.h.d.f105117a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(Function1 function1) {
                function1.invoke(z1.h.d.f105117a);
                function1.invoke(z1.h.v.f105138a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(Function1 function1) {
                function1.invoke(z1.h.d.f105117a);
                function1.invoke(z1.h.C12016b.f105115a);
                return Unit.f142422a;
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
                LocalThemeScope localThemeScope = this.f104770a;
                ji.R0 r02 = this.f104771b;
                final Function1<z1.h, Unit> function1 = this.f104772c;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                C5658d c5658d = C5658d.f48555a;
                MeasurePolicy measurePolicyA = C5665k.a(c5658d.h(), bVarG, composer, 48);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion2);
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
                float f10 = 8;
                C14802K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null), composer, 6);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion.l(), composer, 0);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion2);
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
                C14802K.a(InterfaceC14800I.b(C14801J.f139030a, companion2, 1.0f, false, 2, null), composer, 0);
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
                ComposableLambda composableLambdaC = ComposableLambdaKt.c(-948646581, true, new C1519a(localThemeScope, r02), composer, 54);
                int i11 = LocalThemeScope.f15770g;
                int i12 = q1.d.ModalButton.f139963k;
                ni.E0.b(localThemeScope, dismiss, (Function0) objB, composableLambdaC, composer, i11 | 3072 | (i12 << 3));
                C14802K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, H1.h.p(f10), 0.0f, 11, null), composer, 6);
                composer.v();
                C16307b.b(localThemeScope, r02.getIcons().getWarningIcon(), null, null, composer, (q1.h.DrawableIcon.f140067h << 3) | i11, 6);
                float f11 = 16;
                C14802K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, 0.0f, H1.h.p(f11), 7, null), composer, 6);
                float f12 = 24;
                q1.Label labelY = q1.Label.y(r02.getLabels().getHeading(), r02.getLabels().getHeading().getModifier().then(androidx.compose.foundation.layout.D.k(companion2, H1.h.p(f12), 0.0f, 2, null)), null, null, null, 0, false, 0, null, null, 510, null);
                String strC = C16193g.c(C17135b.f162033m, composer, 0);
                int i13 = q1.Label.f140080j;
                ri.j.h(localThemeScope, labelY, strC, null, composer, (i13 << 3) | i11, 4);
                C14802K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, 0.0f, H1.h.p(f11), 7, null), composer, 6);
                ri.j.h(localThemeScope, q1.Label.y(r02.getLabels().getBody(), r02.getLabels().getBody().getModifier().then(androidx.compose.foundation.layout.D.k(companion2, H1.h.p(f12), 0.0f, 2, null)), null, null, null, 0, false, 0, null, null, 510, null), C16193g.c(C17135b.f162027j, composer, 0), null, composer, (i13 << 3) | i11, 4);
                C14802K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, 0.0f, H1.h.p(32), 7, null), composer, 6);
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
                ni.E0.b(localThemeScope, mainCTA, (Function0) objB2, ComposableLambdaKt.c(1638230439, true, new b(localThemeScope, r02), composer, 54), composer, i11 | 3072 | (i12 << 3));
                C14802K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, 0.0f, H1.h.p(12), 7, null), composer, 6);
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
                ni.E0.b(localThemeScope, cancel, (Function0) objB3, ComposableLambdaKt.c(1870828190, true, new c(localThemeScope, r02), composer, 54), composer, i11 | 3072 | (i12 << 3));
                C14802K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, 0.0f, H1.h.p(f12), 7, null), composer, 6);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                d(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        j(LocalThemeScope localThemeScope, Function1<? super z1.h, Unit> function1) {
            this.f104768a = localThemeScope;
            this.f104769b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(z1.h.d.f105117a);
            return Unit.f142422a;
        }

        public final void b(ji.R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-433070121, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.OrderCancellationWarningModal.<anonymous> (CheckoutScreen.kt:1554)");
            }
            LocalThemeScope localThemeScope = this.f104768a;
            q1.ModalTemplate modalTemplateP = Assemble.getModalTemplate();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f104769b);
            final Function1<z1.h, Unit> function1 = this.f104769b;
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
            C16977b.b(localThemeScope, modalTemplateP, (Function0) objB, null, ComposableLambdaKt.c(55798532, true, new a(this.f104768a, Assemble, this.f104769b), composer, 54), composer, LocalThemeScope.f15770g | 24576 | (q1.ModalTemplate.f140108d << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ji.R0 r02, Composer composer, Integer num) {
            b(r02, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final k f104779a = new k();

        k() {
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class l implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f104780a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104781b;

        l(L1.h hVar, LocalThemeScope localThemeScope) {
            this.f104780a = hVar;
            this.f104781b = localThemeScope;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), this.f104780a.getEnd(), this.f104781b.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class m implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104782a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EbtCardChargesDecorator f104783b;

        m(LocalThemeScope localThemeScope, EbtCardChargesDecorator ebtCardChargesDecorator) {
            this.f104782a = localThemeScope;
            this.f104783b = ebtCardChargesDecorator;
        }

        public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(660100778, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.OrderSummarySection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:1092)");
            }
            LocalThemeScope localThemeScope = this.f104782a;
            q1.Label label = new q1.Label(null, this.f104782a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree(), null, 381, null);
            AbstractC5607a amountToChargeCard = this.f104783b.getAmountToChargeCard();
            int i11 = AbstractC5607a.f45514b;
            String strA = C6408b.a(amountToChargeCard, composer, i11);
            int i12 = LocalThemeScope.f15770g;
            int i13 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, strA, null, composer, i12 | (i13 << 3), 4);
            LocalThemeScope localThemeScope2 = this.f104782a;
            ri.j.h(localThemeScope2, new q1.Label(null, this.f104782a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBodyCompact().getOne(), null, 381, null), C6408b.a(this.f104783b.getCardType(), composer, i11), null, composer, i12 | (i13 << 3), 4);
            LocalThemeScope localThemeScope3 = this.f104782a;
            ri.j.h(localThemeScope3, new q1.Label(null, this.f104782a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope3.getAdsTypography().getBody().getTwo(), null, 381, null), C6408b.a(this.f104783b.getAvailableBalance(), composer, i11), null, composer, i12 | (i13 << 3), 4);
            float f10 = 8;
            C17917Z.a(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, H1.h.p(f10), 0.0f, H1.h.p(f10), 5, null), this.f104782a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 6, 12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
            a(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class n implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final n f104784a = new n();

        n() {
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class o implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f104785a;

        o(Function0<Unit> function0) {
            this.f104785a = function0;
        }

        public final void a() {
            this.f104785a.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class p implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final p f104786a = new p();

        p() {
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class q implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f104787a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104788b;

        q(L1.h hVar, LocalThemeScope localThemeScope) {
            this.f104787a = hVar;
            this.f104788b = localThemeScope;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), this.f104787a.getEnd(), this.f104788b.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class r implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104789a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckoutViewState f104790b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CreditCardChargesDecorator f104791c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f104792d;

        r(LocalThemeScope localThemeScope, CheckoutViewState checkoutViewState, CreditCardChargesDecorator creditCardChargesDecorator, Function0<Unit> function0) {
            this.f104789a = localThemeScope;
            this.f104790b = checkoutViewState;
            this.f104791c = creditCardChargesDecorator;
            this.f104792d = function0;
        }

        public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1988214295, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.OrderSummarySection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:1174)");
            }
            LocalThemeScope localThemeScope = this.f104789a;
            q1.Label label = new q1.Label(null, this.f104789a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree(), null, 381, null);
            AbstractC5607a abstractC5607aM = this.f104790b.m();
            int i11 = AbstractC5607a.f45514b;
            String strA = C6408b.a(abstractC5607aM, composer, i11);
            int i12 = LocalThemeScope.f15770g;
            int i13 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, strA, null, composer, i12 | (i13 << 3), 4);
            LocalThemeScope localThemeScope2 = this.f104789a;
            ri.j.h(localThemeScope2, new q1.Label(null, this.f104789a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBodyCompact().getOne(), null, 381, null), C6408b.a(this.f104791c.getCardType(), composer, i11), null, composer, i12 | (i13 << 3), 4);
            AbstractC5607a ebtNote = this.f104791c.getEbtNote();
            composer.startReplaceGroup(586534953);
            if (ebtNote != null) {
                LocalThemeScope localThemeScope3 = this.f104789a;
                ri.j.h(localThemeScope3, new q1.Label(null, localThemeScope3.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope3.getAdsTypography().getDetail().getOne(), null, 381, null), C6408b.a(ebtNote, composer, i11), null, composer, i12 | (i13 << 3), 4);
                Unit unit = Unit.f142422a;
            }
            composer.P();
            AbstractC5607a preAuthAmount = this.f104791c.getPreAuthAmount();
            if (preAuthAmount != null) {
                Am.X.b(this.f104789a, androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, H1.h.p(4), 0.0f, 0.0f, 13, null), null, preAuthAmount, this.f104792d, null, composer, i12 | 48 | (i11 << 9), 18);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
            a(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class s extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f104793f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(L1.A a10) {
            super(1);
            this.f104793f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f104793f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class t extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f104794f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f104795g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f104796h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ EbtCardChargesDecorator f104797i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104798j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0 f104799k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(L1.n nVar, int i10, Function0 function0, EbtCardChargesDecorator ebtCardChargesDecorator, LocalThemeScope localThemeScope, Function0 function02) {
            super(2);
            this.f104795g = nVar;
            this.f104796h = function0;
            this.f104797i = ebtCardChargesDecorator;
            this.f104798j = localThemeScope;
            this.f104799k = function02;
            this.f104794f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f104795g.getHelpersHashCode();
            this.f104795g.i();
            L1.n nVar = this.f104795g;
            composer.startReplaceGroup(1401929191);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            composer.startReplaceGroup(1984889117);
            C.g cardIcon = this.f104797i.getCardIcon();
            LocalThemeScope localThemeScope = this.f104798j;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = k.f104779a;
                composer.t(objB);
            }
            composer.P();
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(cardIcon, null, null, null, 0.0f, null, nVar.k(companion, hVarA, (Function1) objB), 60, null);
            int i11 = LocalThemeScope.f15770g;
            C16307b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
            LocalThemeScope localThemeScope2 = this.f104798j;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(hVarA) | composer.D(this.f104798j);
            Object objB2 = composer.B();
            if (zV || objB2 == companion2.a()) {
                objB2 = new l(hVarA, this.f104798j);
                composer.t(objB2);
            }
            composer.P();
            C16088n.e(localThemeScope2, new q1.Column(nVar.k(companion, hVarC, (Function1) objB2), null, null, 6, null), ComposableLambdaKt.c(660100778, true, new m(this.f104798j, this.f104797i), composer, 54), composer, i11 | 384 | (q1.Column.f139985d << 3));
            LocalThemeScope localThemeScope3 = this.f104798j;
            Ji.I seven = localThemeScope3.getAdsTypography().getHeadings().getSeven();
            Ji.T adsColorLink = this.f104798j.getAdsColors().getAdsColorLink();
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion2.a()) {
                objB3 = n.f104784a;
                composer.t(objB3);
            }
            composer.P();
            Modifier modifierK = nVar.k(companion, hVarD, (Function1) objB3);
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f104799k);
            Object objB4 = composer.B();
            if (zV2 || objB4 == companion2.a()) {
                objB4 = new o(this.f104799k);
                composer.t(objB4);
            }
            composer.P();
            ri.j.h(localThemeScope3, new q1.Label(ClickableKt.d(modifierK, false, null, null, (Function0) objB4, 7, null), adsColorLink, null, null, 0, false, 0, seven, null, 380, null), C6408b.a(this.f104797i.getAdjustAmount(), composer, AbstractC5607a.f45514b), null, composer, i11 | (q1.Label.f140080j << 3), 4);
            composer.P();
            composer.P();
            if (this.f104795g.getHelpersHashCode() != helpersHashCode) {
                this.f104796h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class u extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f104800f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(L1.A a10) {
            super(1);
            this.f104800f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f104800f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class v extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f104801f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f104802g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f104803h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ CreditCardChargesDecorator f104804i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104805j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ CheckoutViewState f104806k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0 f104807l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(L1.n nVar, int i10, Function0 function0, CreditCardChargesDecorator creditCardChargesDecorator, LocalThemeScope localThemeScope, CheckoutViewState checkoutViewState, Function0 function02) {
            super(2);
            this.f104802g = nVar;
            this.f104803h = function0;
            this.f104804i = creditCardChargesDecorator;
            this.f104805j = localThemeScope;
            this.f104806k = checkoutViewState;
            this.f104807l = function02;
            this.f104801f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f104802g.getHelpersHashCode();
            this.f104802g.i();
            L1.n nVar = this.f104802g;
            composer.startReplaceGroup(-1712902984);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            String str = T1.a(this.f104804i.getCardIcon()) + ' ' + C16193g.c(com.meijer.mobile.meijer.Y.f99576G7, composer, 0);
            C.g cardIcon = this.f104804i.getCardIcon();
            composer.startReplaceGroup(-2133460275);
            if (cardIcon != null) {
                LocalThemeScope localThemeScope = this.f104805j;
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = p.f104786a;
                    composer.t(objB);
                }
                composer.P();
                C16307b.b(localThemeScope, new q1.h.DrawableIcon(cardIcon, str, null, null, 0.0f, null, nVar.k(companion, hVarA, (Function1) objB), 60, null), null, null, composer, LocalThemeScope.f15770g | (q1.h.DrawableIcon.f140067h << 3), 6);
            }
            composer.P();
            LocalThemeScope localThemeScope2 = this.f104805j;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(hVarA) | composer.D(this.f104805j);
            Object objB2 = composer.B();
            if (zV || objB2 == Composer.INSTANCE.a()) {
                objB2 = new q(hVarA, this.f104805j);
                composer.t(objB2);
            }
            composer.P();
            C16088n.e(localThemeScope2, new q1.Column(nVar.k(companion2, hVarC, (Function1) objB2), null, null, 6, null), ComposableLambdaKt.c(-1988214295, true, new r(this.f104805j, this.f104806k, this.f104804i, this.f104807l), composer, 54), composer, LocalThemeScope.f15770g | 384 | (q1.Column.f139985d << 3));
            composer.P();
            if (this.f104802g.getHelpersHashCode() != helpersHashCode) {
                this.f104803h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class w implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104808a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f104809b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f104810a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f104811b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f104812c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Z0$w$a$a, reason: collision with other inner class name */
            static final class C1520a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f104813a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC14919W f104814b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AbstractC5607a f104815c;

                C1520a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W, AbstractC5607a abstractC5607a) {
                    this.f104813a = localThemeScope;
                    this.f104814b = interfaceC14919W;
                    this.f104815c = abstractC5607a;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(391004469, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.PaymentInformationSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:811)");
                    }
                    ri.j.h(this.f104813a, this.f104814b.getLabels().getInfoBlockMessage(), C6408b.a(this.f104815c, composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

            a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W, AbstractC5607a abstractC5607a) {
                this.f104810a = localThemeScope;
                this.f104811b = interfaceC14919W;
                this.f104812c = abstractC5607a;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1901471009, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.PaymentInformationSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:810)");
                }
                kotlin.g.e(null, 0.0f, ComposableLambdaKt.c(391004469, true, new C1520a(this.f104810a, this.f104811b, this.f104812c), composer, 54), composer, 384, 3);
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

        w(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a) {
            this.f104808a = localThemeScope;
            this.f104809b = abstractC5607a;
        }

        public final void a(InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(354340212, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.PaymentInformationSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:809)");
            }
            C16531d.e(this.f104808a, Assemble.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.c(1901471009, true, new a(this.f104808a, Assemble, this.f104809b), composer, 54), composer, LocalThemeScope.f15770g | 384 | (q1.InfoBlock.f140077c << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            a(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class x implements Function3<ji.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104816a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<z1.h, Unit> f104817b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f104818a;

            a(LocalThemeScope localThemeScope) {
                this.f104818a = localThemeScope;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-998930765, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.PaymentInformationSection.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:830)");
                }
                LocalThemeScope localThemeScope = this.f104818a;
                q1.Label label = new q1.Label(null, this.f104818a.getAdsColors().getAdsColorEnabled01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 381, null);
                String upperCase = C16193g.c(com.meijer.mobile.meijer.Y.f99512D0, composer, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                ri.j.h(localThemeScope, label, upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            Z0.f104705a = false;
            function1.invoke(z1.h.o.f105130a);
            return Unit.f142422a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        x(LocalThemeScope localThemeScope, Function1<? super z1.h, Unit> function1) {
            this.f104816a = localThemeScope;
            this.f104817b = function1;
        }

        public final void b(ji.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(564223430, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.PaymentInformationSection.<anonymous>.<anonymous> (CheckoutScreen.kt:823)");
            }
            LocalThemeScope localThemeScope = this.f104816a;
            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f104817b);
            final Function1<z1.h, Unit> function1 = this.f104817b;
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
            ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-998930765, true, new a(this.f104816a), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class y implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104819a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f104820b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f104821a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f104822b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f104823c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Z0$y$a$a, reason: collision with other inner class name */
            static final class C1521a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f104824a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC14919W f104825b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f104826c;

                C1521a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W, String str) {
                    this.f104824a = localThemeScope;
                    this.f104825b = interfaceC14919W;
                    this.f104826c = str;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(632410300, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.SectionItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:1348)");
                    }
                    ri.j.h(this.f104824a, this.f104825b.getLabels().getInfoBlockMessage(), this.f104826c, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

            a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W, String str) {
                this.f104821a = localThemeScope;
                this.f104822b = interfaceC14919W;
                this.f104823c = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-690716760, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.SectionItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:1347)");
                }
                kotlin.g.e(null, 0.0f, ComposableLambdaKt.c(632410300, true, new C1521a(this.f104821a, this.f104822b, this.f104823c), composer, 54), composer, 384, 3);
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

        y(LocalThemeScope localThemeScope, String str) {
            this.f104819a = localThemeScope;
            this.f104820b = str;
        }

        public final void a(InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(438653115, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.SectionItem.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:1346)");
            }
            C16531d.e(this.f104819a, Assemble.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.c(-690716760, true, new a(this.f104819a, Assemble, this.f104820b), composer, 54), composer, LocalThemeScope.f15770g | 384 | (q1.InfoBlock.f140077c << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            a(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class z implements Function3<ji.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104827a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f104828b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Integer f104829c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Integer f104830a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f104831b;

            a(Integer num, LocalThemeScope localThemeScope) {
                this.f104830a = num;
                this.f104831b = localThemeScope;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-229378860, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.SectionItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:1363)");
                }
                Integer num = this.f104830a;
                if (num != null) {
                    LocalThemeScope localThemeScope = this.f104831b;
                    q1.Label label = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorEnabled01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 381, null);
                    String upperCase = C16193g.c(num.intValue(), composer, 0).toUpperCase(Locale.ROOT);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    ri.j.h(localThemeScope, label, upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        z(LocalThemeScope localThemeScope, Function0<Unit> function0, Integer num) {
            this.f104827a = localThemeScope;
            this.f104828b = function0;
            this.f104829c = num;
        }

        public final void b(ji.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1570409505, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.SectionItem.<anonymous>.<anonymous>.<anonymous> (CheckoutScreen.kt:1359)");
            }
            LocalThemeScope localThemeScope = this.f104827a;
            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f104828b);
            final Function0<Unit> function0 = this.f104828b;
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
            ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-229378860, true, new a(this.f104829c, this.f104827a), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
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
    public static final void M0(final Ji.LocalThemeScope r63, androidx.compose.ui.Modifier r64, com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewState r65, final kotlin.jvm.functions.Function0<kotlin.Unit> r66, final kotlin.jvm.functions.Function0<kotlin.Unit> r67, final kotlin.jvm.functions.Function0<kotlin.Unit> r68, androidx.compose.runtime.Composer r69, final int r70, final int r71) {
        /*
            Method dump skipped, instructions count: 2955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.M0(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.review.D1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(Modifier modifier, Function2 function2, int i10, int i11, Composer composer, int i12) {
        W(modifier, function2, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    private static final void b1(final Ji.LocalThemeScope r42, androidx.compose.ui.Modifier r43, final int r44, java.lang.Integer r45, java.lang.String r46, final java.lang.String[] r47, java.lang.String r48, boolean r49, kotlin.jvm.functions.Function0<kotlin.Unit> r50, androidx.compose.runtime.Composer r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 1199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.b1(Ji.M, androidx.compose.ui.Modifier, int, java.lang.Integer, java.lang.String, java.lang.String[], java.lang.String, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
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
    public static final void h1(final Ji.LocalThemeScope r68, androidx.compose.ui.Modifier r69, com.meijer.mobile.meijer.activity.checkout.review.PreTipDecorator r70, com.meijer.mobile.meijer.activity.checkout.review.DeliveryInstructionsDecorator r71, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.review.z1.m, kotlin.Unit> r72, final kotlin.jvm.functions.Function1<? super xs.EnumC18092b, kotlin.Unit> r73, final kotlin.jvm.functions.Function1<? super java.lang.Double, kotlin.Unit> r74, androidx.compose.runtime.Composer r75, final int r76, final int r77) {
        /*
            Method dump skipped, instructions count: 2185
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.h1(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.review.V1, com.meijer.mobile.meijer.activity.checkout.review.M1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
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
    public static final void i0(final Ji.LocalThemeScope r32, androidx.compose.ui.Modifier r33, final com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewState r34, boolean r35, androidx.compose.runtime.InterfaceC5730l0<java.lang.Boolean> r36, androidx.compose.runtime.InterfaceC5730l0<java.lang.Boolean> r37, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.review.z1.h, kotlin.Unit> r38, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.review.z1.m, kotlin.Unit> r39, kotlin.jvm.functions.Function1<? super xs.EnumC18092b, kotlin.Unit> r40, kotlin.jvm.functions.Function1<? super java.lang.Double, kotlin.Unit> r41, kotlin.jvm.functions.Function0<kotlin.Unit> r42, kotlin.jvm.functions.Function0<kotlin.Unit> r43, kotlin.jvm.functions.Function0<kotlin.Unit> r44, kotlin.jvm.functions.Function0<kotlin.Unit> r45, androidx.compose.runtime.Composer r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 1255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.i0(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.review.D1, boolean, androidx.compose.runtime.l0, androidx.compose.runtime.l0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
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
    public static final void A0(final Ji.LocalThemeScope r16, com.meijer.mobile.meijer.activity.checkout.review.FulfillmentSlotInfoDecorator r17, final int r18, android.content.Context r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.A0(Ji.M, com.meijer.mobile.meijer.activity.checkout.review.R1, int, android.content.Context, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B0(Context context) {
        context.startActivity(FulfillmentSlotsActivity.INSTANCE.a(context, new FulfillmentSlotsActivity.FulfillmentSlotsActivityExtras(true, true)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C0(LocalThemeScope localThemeScope, FulfillmentSlotInfoDecorator r12, int i10, Context context, int i11, int i12, Composer composer, int i13) {
        A0(localThemeScope, r12, i10, context, composer, androidx.compose.runtime.J0.a(i11 | 1), i12);
        return Unit.f142422a;
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
    public static final void D0(final Ji.LocalThemeScope r37, androidx.compose.ui.Modifier r38, final kotlin.jvm.functions.Function0<kotlin.Unit> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.D0(Ji.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(Function0 function0, androidx.compose.ui.text.f it) {
        Intrinsics.j(it, "it");
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F0(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        D0(localThemeScope, modifier, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    private static final void G0(final Ji.LocalThemeScope r14, com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewState r15, androidx.compose.runtime.InterfaceC5730l0<java.lang.Boolean> r16, androidx.compose.runtime.InterfaceC5730l0<java.lang.Boolean> r17, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.review.z1.h, kotlin.Unit> r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.G0(Ji.M, com.meijer.mobile.meijer.activity.checkout.review.D1, androidx.compose.runtime.l0, androidx.compose.runtime.l0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H0(z1.h it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I0(LocalThemeScope localThemeScope, CheckoutViewState checkoutViewState, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, Function1 function1, int i10, int i11, Composer composer, int i12) {
        G0(localThemeScope, checkoutViewState, interfaceC5730l0, interfaceC5730l02, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K0(z1.h it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L0(LocalThemeScope localThemeScope, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        J0(localThemeScope, z10, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N0(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P0(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.v(semantics);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q0(LocalThemeScope localThemeScope, Modifier modifier, CheckoutViewState checkoutViewState, Function0 function0, Function0 function02, Function0 function03, int i10, int i11, Composer composer, int i12) {
        M0(localThemeScope, modifier, checkoutViewState, function0, function02, function03, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    public static final void R0(final Ji.LocalThemeScope r43, androidx.compose.ui.Modifier r44, final com.meijer.mobile.meijer.activity.checkout.review.CardDetailsDecorator r45, com.meijer.mobile.meijer.activity.checkout.review.EbtCardDetailsDecorator r46, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.review.z1.h, kotlin.Unit> r47, androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.R0(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.review.q, com.meijer.mobile.meijer.activity.checkout.review.O1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S0(LocalThemeScope localThemeScope, Modifier modifier, CardDetailsDecorator cardDetailsDecorator, EbtCardDetailsDecorator ebtCardDetailsDecorator, Function1 function1, int i10, int i11, Composer composer, int i12) {
        R0(localThemeScope, modifier, cardDetailsDecorator, ebtCardDetailsDecorator, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    public static final void T0(final Ji.LocalThemeScope r16, com.meijer.mobile.meijer.activity.checkout.review.PickupPersonDecorator r17, final java.lang.String r18, android.content.Context r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.T0(Ji.M, com.meijer.mobile.meijer.activity.checkout.review.U1, java.lang.String, android.content.Context, androidx.compose.runtime.Composer, int, int):void");
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
            int i13 = Bj.i.f2795x0;
            String strC = C16193g.c(com.meijer.mobile.meijer.Y.f99940Za, composerStartRestartGroup, 0);
            String[] strArr = (String[]) Arrays.copyOf(new String[]{addressDecorator.getName(), addressDecorator.getAddressLine1(), addressDecorator.getAddressLine2(), addressDecorator.getAddressCityStateZip()}, 4);
            Integer error = addressDecorator.getError();
            composerStartRestartGroup.startReplaceGroup(897403921);
            String strC2 = error == null ? null : C16193g.c(error.intValue(), composerStartRestartGroup, 0);
            composerStartRestartGroup.P();
            b1(localThemeScope, null, i13, null, strC, strArr, strC2, false, null, composerStartRestartGroup, LocalThemeScope.f15770g | (i12 & 14), 197);
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
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(LocalThemeScope localThemeScope, AddressDecorator addressDecorator, int i10, Composer composer, int i11) {
        U(localThemeScope, addressDecorator, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V0(LocalThemeScope localThemeScope, PickupPersonDecorator pickupPersonDecorator, String str, Context context, int i10, int i11, Composer composer, int i12) {
        T0(localThemeScope, pickupPersonDecorator, str, context, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
            String strA = C6408b.a(q12.getDescription(), composerStartRestartGroup, AbstractC5607a.f45514b);
            int i12 = LocalThemeScope.f15770g;
            int i13 = i11 & 14;
            Y0(localThemeScope, null, strA, composerStartRestartGroup, i12 | i13, 1);
            if (Intrinsics.e(q12, Q1.d.f104617f)) {
                int i14 = Bj.i.f2672L1;
                Integer numValueOf = Integer.valueOf(com.meijer.mobile.meijer.Y.f99630J4);
                String strC = C16193g.c(com.meijer.mobile.meijer.Y.f100080gb, composerStartRestartGroup, 0);
                String[] strArr = {storeDecorator.getName(), storeDecorator.getAddressLine1(), storeDecorator.getAddressCityStateZip()};
                Integer error = storeDecorator.getError();
                composerStartRestartGroup.startReplaceGroup(-1582683022);
                String strC2 = error == null ? null : C16193g.c(error.intValue(), composerStartRestartGroup, 0);
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
        return Unit.f142422a;
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
    public static final void Y(final Ji.LocalThemeScope r39, androidx.compose.ui.Modifier r40, final com.meijer.mobile.meijer.activity.checkout.review.CartItemsDecorator r41, android.content.Context r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 1374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.Y(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.review.u, android.content.Context, androidx.compose.runtime.Composer, int, int):void");
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
    private static final void Y0(final Ji.LocalThemeScope r26, androidx.compose.ui.Modifier r27, final java.lang.String r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.Y0(Ji.M, androidx.compose.ui.Modifier, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z0(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.v(semantics);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(Context context) {
        context.startActivity(EditCartActivity.INSTANCE.a(context));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a1(LocalThemeScope localThemeScope, Modifier modifier, String str, int i10, int i11, Composer composer, int i12) {
        Y0(localThemeScope, modifier, str, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(LocalThemeScope localThemeScope, Modifier modifier, CartItemsDecorator cartItemsDecorator, Context context, int i10, int i11, Composer composer, int i12) {
        Y(localThemeScope, modifier, cartItemsDecorator, context, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    private static final void c0(final Ji.LocalThemeScope r47, androidx.compose.ui.Modifier r48, com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewState r49, androidx.compose.runtime.InterfaceC5730l0<java.lang.Boolean> r50, androidx.compose.runtime.InterfaceC5730l0<java.lang.Boolean> r51, android.content.Context r52, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.review.z1.h, kotlin.Unit> r53, androidx.compose.runtime.Composer r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.c0(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.review.D1, androidx.compose.runtime.l0, androidx.compose.runtime.l0, android.content.Context, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c1(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d0(z1.h it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d1(LocalThemeScope localThemeScope, Modifier modifier, int i10, Integer num, String str, String[] strArr, String str2, boolean z10, Function0 function0, int i11, int i12, Composer composer, int i13) {
        b1(localThemeScope, modifier, i10, num, str, strArr, str2, z10, function0, composer, androidx.compose.runtime.J0.a(i11 | 1), i12);
        return Unit.f142422a;
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
    public static final void e1(final Ji.LocalThemeScope r15, final com.meijer.mobile.meijer.activity.checkout.review.SubstitutionPreferenceDecorator r16, android.content.Context r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.e1(Ji.M, com.meijer.mobile.meijer.activity.checkout.review.Y1, android.content.Context, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f1(Context context, SubstitutionPreferenceDecorator substitutionPreferenceDecorator) {
        context.startActivity(SubstitutionPreferenceFormActivity.INSTANCE.a(context, substitutionPreferenceDecorator.getName()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g1(LocalThemeScope localThemeScope, SubstitutionPreferenceDecorator substitutionPreferenceDecorator, Context context, int i10, int i11, Composer composer, int i12) {
        e1(localThemeScope, substitutionPreferenceDecorator, context, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(LocalThemeScope localThemeScope, Modifier modifier, CheckoutViewState checkoutViewState, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, Context context, Function1 function1, int i10, int i11, Composer composer, int i12) {
        c0(localThemeScope, modifier, checkoutViewState, interfaceC5730l0, interfaceC5730l02, context, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i1(z1.m it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(z1.h it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k0() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l1(LocalThemeScope localThemeScope, Modifier modifier, PreTipDecorator preTipDecorator, DeliveryInstructionsDecorator deliveryInstructionsDecorator, Function1 function1, Function1 function12, Function1 function13, int i10, int i11, Composer composer, int i12) {
        h1(localThemeScope, modifier, preTipDecorator, deliveryInstructionsDecorator, function1, function12, function13, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m0() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n0(LocalThemeScope localThemeScope, Modifier modifier, CheckoutViewState checkoutViewState, boolean z10, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i10, int i11, int i12, Composer composer, int i13) {
        i0(localThemeScope, modifier, checkoutViewState, z10, interfaceC5730l0, interfaceC5730l02, function1, function12, function13, function14, function0, function02, function03, function04, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o0(z1.m it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(EnumC18092b it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q0(double d10) {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0() {
        return Unit.f142422a;
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
    public static final void s0(final Ji.LocalThemeScope r16, com.meijer.mobile.meijer.activity.checkout.contactinformation.ContactInformationDecorator r17, final java.lang.String r18, android.content.Context r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.s0(Ji.M, com.meijer.mobile.meijer.activity.checkout.contactinformation.a, java.lang.String, android.content.Context, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t0(Context context) {
        context.startActivity(DeliveryContactInformationFormActivity.INSTANCE.a(context, true));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u0(LocalThemeScope localThemeScope, ContactInformationDecorator contactInformationDecorator, String str, Context context, int i10, int i11, Composer composer, int i12) {
        s0(localThemeScope, contactInformationDecorator, str, context, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
                int i12 = Bj.i.f2795x0;
                Integer numValueOf = Integer.valueOf(com.meijer.mobile.meijer.Y.f99630J4);
                String strC = C16193g.c(com.meijer.mobile.meijer.Y.f100000cb, composerStartRestartGroup, 0);
                String[] strArr = {addressDecorator.getName(), addressDecorator.getAddressLine1(), addressDecorator.getAddressLine2(), addressDecorator.getAddressCityStateZip()};
                Integer error = addressDecorator.getError();
                composerStartRestartGroup.startReplaceGroup(1173500812);
                String strC2 = error == null ? null : C16193g.c(error.intValue(), composerStartRestartGroup, 0);
                composerStartRestartGroup.P();
                b1(localThemeScope, null, i12, numValueOf, strC, strArr, strC2, false, null, composerStartRestartGroup, LocalThemeScope.f15770g | (i11 & 14), 193);
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
        return Unit.f142422a;
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
    public static final void x0(final Ji.LocalThemeScope r15, com.meijer.mobile.meijer.activity.checkout.review.DeliveryInstructionsDecorator r16, android.content.Context r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.Z0.x0(Ji.M, com.meijer.mobile.meijer.activity.checkout.review.M1, android.content.Context, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y0(Context context, DeliveryInstructionsDecorator deliveryInstructionsDecorator) {
        EntryNoteActivity.Companion companion = EntryNoteActivity.INSTANCE;
        String instructions = deliveryInstructionsDecorator.getInstructions();
        if (instructions == null) {
            instructions = "";
        }
        context.startActivity(EntryNoteActivity.Companion.b(companion, context, 0, instructions, "com.meijer.intent.extra.EXTRA_DELIVERY_NOTE_TYPE", 2, null));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z0(LocalThemeScope localThemeScope, DeliveryInstructionsDecorator deliveryInstructionsDecorator, Context context, int i10, int i11, Composer composer, int i12) {
        x0(localThemeScope, deliveryInstructionsDecorator, context, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
                Ji.Q.e(localThemeScope, C14924a0.f139754a, ComposableLambdaKt.c(-433070121, true, new j(localThemeScope, function1), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f15770g | 384 | (C14924a0.f139755b << 3));
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
        return Unit.f142422a;
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
                function2 = F1.f104517a.b();
            }
            if (ComposerKt.M()) {
                ComposerKt.U(301856652, i12, -1, "com.meijer.mobile.meijer.activity.checkout.review.CartItemContainer (CheckoutScreen.kt:1641)");
            }
            Modifier modifierV = androidx.compose.foundation.layout.J.v(modifier, H1.h.p(64));
            MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierV);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            C5664j c5664j = C5664j.f48612a;
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

    private static final C14209i e0(InterfaceC15108k interfaceC15108k) {
        return interfaceC15108k.getValue();
    }

    private static final float f0(InterfaceC15105h interfaceC15105h) {
        return interfaceC15105h.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g0(InterfaceC15105h interfaceC15105h) {
        return f0(interfaceC15105h);
    }

    private static final boolean j1(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k1(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }
}
