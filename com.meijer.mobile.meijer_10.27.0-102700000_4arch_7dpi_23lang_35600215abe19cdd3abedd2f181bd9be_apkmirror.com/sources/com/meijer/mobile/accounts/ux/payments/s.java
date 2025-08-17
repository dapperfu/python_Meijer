package com.meijer.mobile.accounts.ux.payments;

import Dh.AccountAddress;
import Dh.AccountAddresses;
import Dh.EnumC3372e;
import Dh.Preference;
import Sh.AddressDecorator;
import Vh.MperksQuickIDFooterDecorator;
import Vh.PaymentsAddressDecorator;
import Vh.PaymentsCardDecorator;
import ak.AbstractC5607a;
import ak.C5608b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.c0;
import androidx.view.d0;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.meijer.mobile.accounts.ux.payments.i;
import com.meijer.mobile.accounts.ux.payments.k;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16648k;
import qv.E0;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.P;
import tv.S;
import uh.AccountCreditCard;
import uh.AccountCreditCardResponse;
import uh.PaymentInfoResponse;
import yl.AbstractC18227f;
import yr.Q;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u00018B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0010J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u001b\u00100\u001a\u00020\u001d2\n\u0010/\u001a\u0006\u0012\u0002\b\u00030.H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u001d2\b\b\u0002\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\u001d2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020A0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020A0E8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lcom/meijer/mobile/accounts/ux/payments/s;", "Landroidx/lifecycle/c0;", "Lth/k;", "paymentsRepository", "LBh/d;", "preferencesRepository", "LBh/a;", "accountAddressesRepository", "Lgi/a;", "analyticsEngine", "Lyl/k;", "featureManager", "<init>", "(Lth/k;LBh/d;LBh/a;Lgi/a;Lyl/k;)V", "Lak/a;", "H", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Result;", "LDh/o;", "D", "", "isFailure", "G", "(Z)Lak/a;", "isShowSuccessNotification", "Luh/b;", "accountCreditCardResponse", "isMperksCardLinkingEnabled", "errorMessage", "", "R", "(ZLuh/b;ZLak/a;)V", "C", "()V", "LDh/b;", "addresses", "Q", "(LDh/b;Z)V", "", "cardId", "B", "(J)V", "Luh/a;", "creditCard", "S", "(Luh/a;)V", "Lcom/meijer/mobile/accounts/ux/payments/j;", "formField", "T", "(Lcom/meijer/mobile/accounts/ux/payments/j;)V", "E", "(Z)V", "Lcom/meijer/mobile/accounts/ux/payments/k;", "action", "J", "(Lcom/meijer/mobile/accounts/ux/payments/k;)V", "a", "Lth/k;", "b", "LBh/d;", "c", "LBh/a;", "d", "Lgi/a;", "Ltv/B;", "Lcom/meijer/mobile/accounts/ux/payments/s$a;", "e", "Ltv/B;", "_paymentsViewState", "Ltv/P;", "f", "Ltv/P;", "I", "()Ltv/P;", "paymentsScreenViewState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class s extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final th.k paymentsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Bh.d preferencesRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Bh.a accountAddressesRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<PaymentsScreenViewState> _paymentsViewState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final P<PaymentsScreenViewState> paymentsScreenViewState;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001B§\u0002\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0010\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010\"\u001a\u00020\u0010\u0012\b\b\u0002\u0010#\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%J°\u0002\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00102\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001f\u001a\u00020\u00102\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\"\u001a\u00020\u00102\b\b\u0002\u0010#\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b&\u00101\u001a\u0004\b2\u00103R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b?\u0010=\u001a\u0004\b?\u0010>R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\b@\u0010>R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bA\u0010=\u001a\u0004\b:\u0010>R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bB\u0010=\u001a\u0004\bC\u0010>R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bD\u0010=\u001a\u0004\bB\u0010>R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b2\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b5\u0010E\u001a\u0004\bH\u0010GR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b8\u0010E\u001a\u0004\bI\u0010GR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bC\u0010E\u001a\u0004\b\u0014\u0010GR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bJ\u0010E\u001a\u0004\bK\u0010GR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010\u0018\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bP\u0010E\u001a\u0004\bJ\u0010GR\u0017\u0010\u0019\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bK\u0010E\u001a\u0004\bQ\u0010GR\u0017\u0010\u001a\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bQ\u0010E\u001a\u0004\bP\u0010GR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b;\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010\u001d\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bI\u0010E\u001a\u0004\bL\u0010GR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bU\u0010=\u001a\u0004\b6\u0010>R\u0017\u0010\u001f\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bF\u0010E\u001a\u0004\bA\u0010GR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bH\u0010V\u001a\u0004\bD\u0010WR\u0017\u0010\"\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bX\u0010E\u001a\u0004\bX\u0010GR\u0017\u0010#\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bY\u0010E\u001a\u0004\bU\u0010G¨\u0006Z"}, d2 = {"Lcom/meijer/mobile/accounts/ux/payments/s$a;", "", "", "LVh/d;", "paymentCards", "LVh/b;", "paymentsAddresses", "savedPaymentCard", "unsavedPaymentCard", "Lak/a;", "disclaimerPart1", "disclaimerPart2", "errorMessage", "deleteErrorMessage", "sheetTitle", "mperksCardLinkingBottomSheetInfoMessage", "", "isLoading", "isMperksCardLinkingEnabled", "isBottomSheetLoading", "isBillingAddressesFailure", "showModal", "Lcom/meijer/mobile/accounts/ux/payments/i;", "billingAddressSection", "shouldScrollToTop", "showSuccessNotification", "showDeleteCardConfirmationView", "LSh/a;", "unsavedNewBillingAddress", "shouldStartAurus", "addCardErrorMessage", "hasPendingChanges", "LVh/a;", "mperksQuickIDFooterDecorator", "isWicSectionEnabled", "isLegacyPreWic", "<init>", "(Ljava/util/List;Ljava/util/List;LVh/d;LVh/d;Lak/a;Lak/a;Lak/a;Lak/a;Lak/a;Lak/a;ZZZZZLcom/meijer/mobile/accounts/ux/payments/i;ZZZLSh/a;ZLak/a;ZLVh/a;ZZ)V", "a", "(Ljava/util/List;Ljava/util/List;LVh/d;LVh/d;Lak/a;Lak/a;Lak/a;Lak/a;Lak/a;Lak/a;ZZZZZLcom/meijer/mobile/accounts/ux/payments/i;ZZZLSh/a;ZLak/a;ZLVh/a;ZZ)Lcom/meijer/mobile/accounts/ux/payments/s$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "k", "()Ljava/util/List;", "b", "l", "c", "LVh/d;", "m", "()LVh/d;", "d", "t", "e", "Lak/a;", "()Lak/a;", "f", "g", "h", "i", "n", "j", "Z", "w", "()Z", "x", "u", "o", "r", "p", "Lcom/meijer/mobile/accounts/ux/payments/i;", "getBillingAddressSection", "()Lcom/meijer/mobile/accounts/ux/payments/i;", "q", "s", "LSh/a;", "getUnsavedNewBillingAddress", "()LSh/a;", "v", "LVh/a;", "()LVh/a;", "y", "z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.payments.s$a, reason: from toString */
    public static final /* data */ class PaymentsScreenViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<PaymentsCardDecorator> paymentCards;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<PaymentsAddressDecorator> paymentsAddresses;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final PaymentsCardDecorator savedPaymentCard;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final PaymentsCardDecorator unsavedPaymentCard;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a disclaimerPart1;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a disclaimerPart2;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a errorMessage;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a deleteErrorMessage;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a sheetTitle;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a mperksCardLinkingBottomSheetInfoMessage;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isMperksCardLinkingEnabled;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isBottomSheetLoading;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isBillingAddressesFailure;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showModal;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final com.meijer.mobile.accounts.ux.payments.i billingAddressSection;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldScrollToTop;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showSuccessNotification;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showDeleteCardConfirmationView;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final AddressDecorator unsavedNewBillingAddress;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldStartAurus;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a addCardErrorMessage;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasPendingChanges;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final MperksQuickIDFooterDecorator mperksQuickIDFooterDecorator;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isWicSectionEnabled;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLegacyPreWic;

        public PaymentsScreenViewState() {
            this(null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, false, false, false, null, false, null, false, null, false, false, 67108863, null);
        }

        public static /* synthetic */ PaymentsScreenViewState b(PaymentsScreenViewState paymentsScreenViewState, List list, List list2, PaymentsCardDecorator paymentsCardDecorator, PaymentsCardDecorator paymentsCardDecorator2, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, AbstractC5607a abstractC5607a4, AbstractC5607a abstractC5607a5, AbstractC5607a abstractC5607a6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, com.meijer.mobile.accounts.ux.payments.i iVar, boolean z15, boolean z16, boolean z17, AddressDecorator addressDecorator, boolean z18, AbstractC5607a abstractC5607a7, boolean z19, MperksQuickIDFooterDecorator mperksQuickIDFooterDecorator, boolean z20, boolean z21, int i10, Object obj) {
            boolean z22;
            boolean z23;
            List list3 = (i10 & 1) != 0 ? paymentsScreenViewState.paymentCards : list;
            List list4 = (i10 & 2) != 0 ? paymentsScreenViewState.paymentsAddresses : list2;
            PaymentsCardDecorator paymentsCardDecorator3 = (i10 & 4) != 0 ? paymentsScreenViewState.savedPaymentCard : paymentsCardDecorator;
            PaymentsCardDecorator paymentsCardDecorator4 = (i10 & 8) != 0 ? paymentsScreenViewState.unsavedPaymentCard : paymentsCardDecorator2;
            AbstractC5607a abstractC5607a8 = (i10 & 16) != 0 ? paymentsScreenViewState.disclaimerPart1 : abstractC5607a;
            AbstractC5607a abstractC5607a9 = (i10 & 32) != 0 ? paymentsScreenViewState.disclaimerPart2 : abstractC5607a2;
            AbstractC5607a abstractC5607a10 = (i10 & 64) != 0 ? paymentsScreenViewState.errorMessage : abstractC5607a3;
            AbstractC5607a abstractC5607a11 = (i10 & 128) != 0 ? paymentsScreenViewState.deleteErrorMessage : abstractC5607a4;
            AbstractC5607a abstractC5607a12 = (i10 & 256) != 0 ? paymentsScreenViewState.sheetTitle : abstractC5607a5;
            AbstractC5607a abstractC5607a13 = (i10 & 512) != 0 ? paymentsScreenViewState.mperksCardLinkingBottomSheetInfoMessage : abstractC5607a6;
            boolean z24 = (i10 & 1024) != 0 ? paymentsScreenViewState.isLoading : z10;
            boolean z25 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? paymentsScreenViewState.isMperksCardLinkingEnabled : z11;
            boolean z26 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? paymentsScreenViewState.isBottomSheetLoading : z12;
            boolean z27 = (i10 & 8192) != 0 ? paymentsScreenViewState.isBillingAddressesFailure : z13;
            List list5 = list3;
            boolean z28 = (i10 & 16384) != 0 ? paymentsScreenViewState.showModal : z14;
            com.meijer.mobile.accounts.ux.payments.i iVar2 = (i10 & 32768) != 0 ? paymentsScreenViewState.billingAddressSection : iVar;
            boolean z29 = (i10 & 65536) != 0 ? paymentsScreenViewState.shouldScrollToTop : z15;
            boolean z30 = (i10 & 131072) != 0 ? paymentsScreenViewState.showSuccessNotification : z16;
            boolean z31 = (i10 & 262144) != 0 ? paymentsScreenViewState.showDeleteCardConfirmationView : z17;
            AddressDecorator addressDecorator2 = (i10 & 524288) != 0 ? paymentsScreenViewState.unsavedNewBillingAddress : addressDecorator;
            boolean z32 = (i10 & 1048576) != 0 ? paymentsScreenViewState.shouldStartAurus : z18;
            AbstractC5607a abstractC5607a14 = (i10 & 2097152) != 0 ? paymentsScreenViewState.addCardErrorMessage : abstractC5607a7;
            boolean z33 = (i10 & 4194304) != 0 ? paymentsScreenViewState.hasPendingChanges : z19;
            MperksQuickIDFooterDecorator mperksQuickIDFooterDecorator2 = (i10 & 8388608) != 0 ? paymentsScreenViewState.mperksQuickIDFooterDecorator : mperksQuickIDFooterDecorator;
            boolean z34 = (i10 & 16777216) != 0 ? paymentsScreenViewState.isWicSectionEnabled : z20;
            if ((i10 & 33554432) != 0) {
                z23 = z34;
                z22 = paymentsScreenViewState.isLegacyPreWic;
            } else {
                z22 = z21;
                z23 = z34;
            }
            return paymentsScreenViewState.a(list5, list4, paymentsCardDecorator3, paymentsCardDecorator4, abstractC5607a8, abstractC5607a9, abstractC5607a10, abstractC5607a11, abstractC5607a12, abstractC5607a13, z24, z25, z26, z27, z28, iVar2, z29, z30, z31, addressDecorator2, z32, abstractC5607a14, z33, mperksQuickIDFooterDecorator2, z23, z22);
        }

        public final PaymentsScreenViewState a(List<PaymentsCardDecorator> paymentCards, List<PaymentsAddressDecorator> paymentsAddresses, PaymentsCardDecorator savedPaymentCard, PaymentsCardDecorator unsavedPaymentCard, AbstractC5607a disclaimerPart1, AbstractC5607a disclaimerPart2, AbstractC5607a errorMessage, AbstractC5607a deleteErrorMessage, AbstractC5607a sheetTitle, AbstractC5607a mperksCardLinkingBottomSheetInfoMessage, boolean isLoading, boolean isMperksCardLinkingEnabled, boolean isBottomSheetLoading, boolean isBillingAddressesFailure, boolean showModal, com.meijer.mobile.accounts.ux.payments.i billingAddressSection, boolean shouldScrollToTop, boolean showSuccessNotification, boolean showDeleteCardConfirmationView, AddressDecorator unsavedNewBillingAddress, boolean shouldStartAurus, AbstractC5607a addCardErrorMessage, boolean hasPendingChanges, MperksQuickIDFooterDecorator mperksQuickIDFooterDecorator, boolean isWicSectionEnabled, boolean isLegacyPreWic) {
            Intrinsics.j(paymentCards, "paymentCards");
            Intrinsics.j(paymentsAddresses, "paymentsAddresses");
            Intrinsics.j(savedPaymentCard, "savedPaymentCard");
            Intrinsics.j(unsavedPaymentCard, "unsavedPaymentCard");
            Intrinsics.j(billingAddressSection, "billingAddressSection");
            Intrinsics.j(unsavedNewBillingAddress, "unsavedNewBillingAddress");
            return new PaymentsScreenViewState(paymentCards, paymentsAddresses, savedPaymentCard, unsavedPaymentCard, disclaimerPart1, disclaimerPart2, errorMessage, deleteErrorMessage, sheetTitle, mperksCardLinkingBottomSheetInfoMessage, isLoading, isMperksCardLinkingEnabled, isBottomSheetLoading, isBillingAddressesFailure, showModal, billingAddressSection, shouldScrollToTop, showSuccessNotification, showDeleteCardConfirmationView, unsavedNewBillingAddress, shouldStartAurus, addCardErrorMessage, hasPendingChanges, mperksQuickIDFooterDecorator, isWicSectionEnabled, isLegacyPreWic);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentsScreenViewState)) {
                return false;
            }
            PaymentsScreenViewState paymentsScreenViewState = (PaymentsScreenViewState) other;
            return Intrinsics.e(this.paymentCards, paymentsScreenViewState.paymentCards) && Intrinsics.e(this.paymentsAddresses, paymentsScreenViewState.paymentsAddresses) && Intrinsics.e(this.savedPaymentCard, paymentsScreenViewState.savedPaymentCard) && Intrinsics.e(this.unsavedPaymentCard, paymentsScreenViewState.unsavedPaymentCard) && Intrinsics.e(this.disclaimerPart1, paymentsScreenViewState.disclaimerPart1) && Intrinsics.e(this.disclaimerPart2, paymentsScreenViewState.disclaimerPart2) && Intrinsics.e(this.errorMessage, paymentsScreenViewState.errorMessage) && Intrinsics.e(this.deleteErrorMessage, paymentsScreenViewState.deleteErrorMessage) && Intrinsics.e(this.sheetTitle, paymentsScreenViewState.sheetTitle) && Intrinsics.e(this.mperksCardLinkingBottomSheetInfoMessage, paymentsScreenViewState.mperksCardLinkingBottomSheetInfoMessage) && this.isLoading == paymentsScreenViewState.isLoading && this.isMperksCardLinkingEnabled == paymentsScreenViewState.isMperksCardLinkingEnabled && this.isBottomSheetLoading == paymentsScreenViewState.isBottomSheetLoading && this.isBillingAddressesFailure == paymentsScreenViewState.isBillingAddressesFailure && this.showModal == paymentsScreenViewState.showModal && Intrinsics.e(this.billingAddressSection, paymentsScreenViewState.billingAddressSection) && this.shouldScrollToTop == paymentsScreenViewState.shouldScrollToTop && this.showSuccessNotification == paymentsScreenViewState.showSuccessNotification && this.showDeleteCardConfirmationView == paymentsScreenViewState.showDeleteCardConfirmationView && Intrinsics.e(this.unsavedNewBillingAddress, paymentsScreenViewState.unsavedNewBillingAddress) && this.shouldStartAurus == paymentsScreenViewState.shouldStartAurus && Intrinsics.e(this.addCardErrorMessage, paymentsScreenViewState.addCardErrorMessage) && this.hasPendingChanges == paymentsScreenViewState.hasPendingChanges && Intrinsics.e(this.mperksQuickIDFooterDecorator, paymentsScreenViewState.mperksQuickIDFooterDecorator) && this.isWicSectionEnabled == paymentsScreenViewState.isWicSectionEnabled && this.isLegacyPreWic == paymentsScreenViewState.isLegacyPreWic;
        }

        public int hashCode() {
            int iHashCode = ((((((this.paymentCards.hashCode() * 31) + this.paymentsAddresses.hashCode()) * 31) + this.savedPaymentCard.hashCode()) * 31) + this.unsavedPaymentCard.hashCode()) * 31;
            AbstractC5607a abstractC5607a = this.disclaimerPart1;
            int iHashCode2 = (iHashCode + (abstractC5607a == null ? 0 : abstractC5607a.hashCode())) * 31;
            AbstractC5607a abstractC5607a2 = this.disclaimerPart2;
            int iHashCode3 = (iHashCode2 + (abstractC5607a2 == null ? 0 : abstractC5607a2.hashCode())) * 31;
            AbstractC5607a abstractC5607a3 = this.errorMessage;
            int iHashCode4 = (iHashCode3 + (abstractC5607a3 == null ? 0 : abstractC5607a3.hashCode())) * 31;
            AbstractC5607a abstractC5607a4 = this.deleteErrorMessage;
            int iHashCode5 = (iHashCode4 + (abstractC5607a4 == null ? 0 : abstractC5607a4.hashCode())) * 31;
            AbstractC5607a abstractC5607a5 = this.sheetTitle;
            int iHashCode6 = (iHashCode5 + (abstractC5607a5 == null ? 0 : abstractC5607a5.hashCode())) * 31;
            AbstractC5607a abstractC5607a6 = this.mperksCardLinkingBottomSheetInfoMessage;
            int iHashCode7 = (((((((((((((((((((((((iHashCode6 + (abstractC5607a6 == null ? 0 : abstractC5607a6.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isMperksCardLinkingEnabled)) * 31) + Boolean.hashCode(this.isBottomSheetLoading)) * 31) + Boolean.hashCode(this.isBillingAddressesFailure)) * 31) + Boolean.hashCode(this.showModal)) * 31) + this.billingAddressSection.hashCode()) * 31) + Boolean.hashCode(this.shouldScrollToTop)) * 31) + Boolean.hashCode(this.showSuccessNotification)) * 31) + Boolean.hashCode(this.showDeleteCardConfirmationView)) * 31) + this.unsavedNewBillingAddress.hashCode()) * 31) + Boolean.hashCode(this.shouldStartAurus)) * 31;
            AbstractC5607a abstractC5607a7 = this.addCardErrorMessage;
            int iHashCode8 = (((iHashCode7 + (abstractC5607a7 == null ? 0 : abstractC5607a7.hashCode())) * 31) + Boolean.hashCode(this.hasPendingChanges)) * 31;
            MperksQuickIDFooterDecorator mperksQuickIDFooterDecorator = this.mperksQuickIDFooterDecorator;
            return ((((iHashCode8 + (mperksQuickIDFooterDecorator != null ? mperksQuickIDFooterDecorator.hashCode() : 0)) * 31) + Boolean.hashCode(this.isWicSectionEnabled)) * 31) + Boolean.hashCode(this.isLegacyPreWic);
        }

        public String toString() {
            return "PaymentsScreenViewState(paymentCards=" + this.paymentCards + ", paymentsAddresses=" + this.paymentsAddresses + ", savedPaymentCard=" + this.savedPaymentCard + ", unsavedPaymentCard=" + this.unsavedPaymentCard + ", disclaimerPart1=" + this.disclaimerPart1 + ", disclaimerPart2=" + this.disclaimerPart2 + ", errorMessage=" + this.errorMessage + ", deleteErrorMessage=" + this.deleteErrorMessage + ", sheetTitle=" + this.sheetTitle + ", mperksCardLinkingBottomSheetInfoMessage=" + this.mperksCardLinkingBottomSheetInfoMessage + ", isLoading=" + this.isLoading + ", isMperksCardLinkingEnabled=" + this.isMperksCardLinkingEnabled + ", isBottomSheetLoading=" + this.isBottomSheetLoading + ", isBillingAddressesFailure=" + this.isBillingAddressesFailure + ", showModal=" + this.showModal + ", billingAddressSection=" + this.billingAddressSection + ", shouldScrollToTop=" + this.shouldScrollToTop + ", showSuccessNotification=" + this.showSuccessNotification + ", showDeleteCardConfirmationView=" + this.showDeleteCardConfirmationView + ", unsavedNewBillingAddress=" + this.unsavedNewBillingAddress + ", shouldStartAurus=" + this.shouldStartAurus + ", addCardErrorMessage=" + this.addCardErrorMessage + ", hasPendingChanges=" + this.hasPendingChanges + ", mperksQuickIDFooterDecorator=" + this.mperksQuickIDFooterDecorator + ", isWicSectionEnabled=" + this.isWicSectionEnabled + ", isLegacyPreWic=" + this.isLegacyPreWic + ')';
        }

        public PaymentsScreenViewState(List<PaymentsCardDecorator> paymentCards, List<PaymentsAddressDecorator> paymentsAddresses, PaymentsCardDecorator savedPaymentCard, PaymentsCardDecorator unsavedPaymentCard, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, AbstractC5607a abstractC5607a4, AbstractC5607a abstractC5607a5, AbstractC5607a abstractC5607a6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, com.meijer.mobile.accounts.ux.payments.i billingAddressSection, boolean z15, boolean z16, boolean z17, AddressDecorator unsavedNewBillingAddress, boolean z18, AbstractC5607a abstractC5607a7, boolean z19, MperksQuickIDFooterDecorator mperksQuickIDFooterDecorator, boolean z20, boolean z21) {
            Intrinsics.j(paymentCards, "paymentCards");
            Intrinsics.j(paymentsAddresses, "paymentsAddresses");
            Intrinsics.j(savedPaymentCard, "savedPaymentCard");
            Intrinsics.j(unsavedPaymentCard, "unsavedPaymentCard");
            Intrinsics.j(billingAddressSection, "billingAddressSection");
            Intrinsics.j(unsavedNewBillingAddress, "unsavedNewBillingAddress");
            this.paymentCards = paymentCards;
            this.paymentsAddresses = paymentsAddresses;
            this.savedPaymentCard = savedPaymentCard;
            this.unsavedPaymentCard = unsavedPaymentCard;
            this.disclaimerPart1 = abstractC5607a;
            this.disclaimerPart2 = abstractC5607a2;
            this.errorMessage = abstractC5607a3;
            this.deleteErrorMessage = abstractC5607a4;
            this.sheetTitle = abstractC5607a5;
            this.mperksCardLinkingBottomSheetInfoMessage = abstractC5607a6;
            this.isLoading = z10;
            this.isMperksCardLinkingEnabled = z11;
            this.isBottomSheetLoading = z12;
            this.isBillingAddressesFailure = z13;
            this.showModal = z14;
            this.billingAddressSection = billingAddressSection;
            this.shouldScrollToTop = z15;
            this.showSuccessNotification = z16;
            this.showDeleteCardConfirmationView = z17;
            this.unsavedNewBillingAddress = unsavedNewBillingAddress;
            this.shouldStartAurus = z18;
            this.addCardErrorMessage = abstractC5607a7;
            this.hasPendingChanges = z19;
            this.mperksQuickIDFooterDecorator = mperksQuickIDFooterDecorator;
            this.isWicSectionEnabled = z20;
            this.isLegacyPreWic = z21;
        }

        /* renamed from: c, reason: from getter */
        public final AbstractC5607a getAddCardErrorMessage() {
            return this.addCardErrorMessage;
        }

        /* renamed from: d, reason: from getter */
        public final AbstractC5607a getDeleteErrorMessage() {
            return this.deleteErrorMessage;
        }

        /* renamed from: e, reason: from getter */
        public final AbstractC5607a getDisclaimerPart1() {
            return this.disclaimerPart1;
        }

        /* renamed from: f, reason: from getter */
        public final AbstractC5607a getDisclaimerPart2() {
            return this.disclaimerPart2;
        }

        /* renamed from: g, reason: from getter */
        public final AbstractC5607a getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getHasPendingChanges() {
            return this.hasPendingChanges;
        }

        /* renamed from: i, reason: from getter */
        public final AbstractC5607a getMperksCardLinkingBottomSheetInfoMessage() {
            return this.mperksCardLinkingBottomSheetInfoMessage;
        }

        /* renamed from: j, reason: from getter */
        public final MperksQuickIDFooterDecorator getMperksQuickIDFooterDecorator() {
            return this.mperksQuickIDFooterDecorator;
        }

        public final List<PaymentsCardDecorator> k() {
            return this.paymentCards;
        }

        public final List<PaymentsAddressDecorator> l() {
            return this.paymentsAddresses;
        }

        /* renamed from: m, reason: from getter */
        public final PaymentsCardDecorator getSavedPaymentCard() {
            return this.savedPaymentCard;
        }

        /* renamed from: n, reason: from getter */
        public final AbstractC5607a getSheetTitle() {
            return this.sheetTitle;
        }

        /* renamed from: o, reason: from getter */
        public final boolean getShouldScrollToTop() {
            return this.shouldScrollToTop;
        }

        /* renamed from: p, reason: from getter */
        public final boolean getShouldStartAurus() {
            return this.shouldStartAurus;
        }

        /* renamed from: q, reason: from getter */
        public final boolean getShowDeleteCardConfirmationView() {
            return this.showDeleteCardConfirmationView;
        }

        /* renamed from: r, reason: from getter */
        public final boolean getShowModal() {
            return this.showModal;
        }

        /* renamed from: s, reason: from getter */
        public final boolean getShowSuccessNotification() {
            return this.showSuccessNotification;
        }

        /* renamed from: t, reason: from getter */
        public final PaymentsCardDecorator getUnsavedPaymentCard() {
            return this.unsavedPaymentCard;
        }

        /* renamed from: u, reason: from getter */
        public final boolean getIsBottomSheetLoading() {
            return this.isBottomSheetLoading;
        }

        /* renamed from: v, reason: from getter */
        public final boolean getIsLegacyPreWic() {
            return this.isLegacyPreWic;
        }

        /* renamed from: w, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        /* renamed from: x, reason: from getter */
        public final boolean getIsMperksCardLinkingEnabled() {
            return this.isMperksCardLinkingEnabled;
        }

        /* renamed from: y, reason: from getter */
        public final boolean getIsWicSectionEnabled() {
            return this.isWicSectionEnabled;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ PaymentsScreenViewState(List list, List list2, PaymentsCardDecorator paymentsCardDecorator, PaymentsCardDecorator paymentsCardDecorator2, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, AbstractC5607a abstractC5607a4, AbstractC5607a abstractC5607a5, AbstractC5607a abstractC5607a6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, com.meijer.mobile.accounts.ux.payments.i iVar, boolean z15, boolean z16, boolean z17, AddressDecorator addressDecorator, boolean z18, AbstractC5607a abstractC5607a7, boolean z19, MperksQuickIDFooterDecorator mperksQuickIDFooterDecorator, boolean z20, boolean z21, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            List listM = (i10 & 1) != 0 ? CollectionsKt.m() : list;
            List listM2 = (i10 & 2) != 0 ? CollectionsKt.m() : list2;
            PaymentsCardDecorator paymentsCardDecorator3 = (i10 & 4) != 0 ? new PaymentsCardDecorator(0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, 1048575, null) : paymentsCardDecorator;
            PaymentsCardDecorator paymentsCardDecorator4 = (i10 & 8) != 0 ? new PaymentsCardDecorator(0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, 1048575, null) : paymentsCardDecorator2;
            AbstractC5607a abstractC5607a8 = (i10 & 16) != 0 ? null : abstractC5607a;
            AbstractC5607a abstractC5607a9 = (i10 & 32) != 0 ? null : abstractC5607a2;
            AbstractC5607a abstractC5607a10 = (i10 & 64) != 0 ? null : abstractC5607a3;
            AbstractC5607a abstractC5607a11 = (i10 & 128) != 0 ? null : abstractC5607a4;
            AbstractC5607a abstractC5607a12 = (i10 & 256) != 0 ? null : abstractC5607a5;
            AbstractC5607a abstractC5607a13 = (i10 & 512) != 0 ? null : abstractC5607a6;
            boolean z22 = (i10 & 1024) != 0 ? false : z10;
            boolean z23 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? false : z11;
            boolean z24 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z12;
            boolean z25 = (i10 & 8192) != 0 ? false : z13;
            boolean z26 = (i10 & 16384) != 0 ? false : z14;
            com.meijer.mobile.accounts.ux.payments.i iVar2 = (i10 & 32768) != 0 ? i.a.f94446a : iVar;
            boolean z27 = (i10 & 65536) != 0 ? false : z15;
            boolean z28 = (i10 & 131072) != 0 ? false : z16;
            boolean z29 = (i10 & 262144) != 0 ? false : z17;
            AddressDecorator addressDecorator2 = (i10 & 524288) != 0 ? new AddressDecorator(0L, null, null, null, null, null, null, null, null, false, null, null, false, null, 16383, null) : addressDecorator;
            boolean z30 = (i10 & 1048576) != 0 ? false : z18;
            AbstractC5607a abstractC5607a14 = (i10 & 2097152) != 0 ? null : abstractC5607a7;
            boolean z31 = (i10 & 4194304) != 0 ? false : z19;
            MperksQuickIDFooterDecorator mperksQuickIDFooterDecorator2 = (i10 & 8388608) != 0 ? null : mperksQuickIDFooterDecorator;
            boolean z32 = (i10 & 16777216) != 0 ? false : z20;
            this(listM, listM2, paymentsCardDecorator3, paymentsCardDecorator4, abstractC5607a8, abstractC5607a9, abstractC5607a10, abstractC5607a11, abstractC5607a12, abstractC5607a13, z22, z23, z24, z25, z26, iVar2, z27, z28, z29, addressDecorator2, z30, abstractC5607a14, z31, mperksQuickIDFooterDecorator2, z32, (i10 & 33554432) != 0 ? !z32 : z21);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.payments.PaymentsScreenViewModel$deleteCard$1", f = "PaymentsScreenViewModel.kt", l = {188}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f94510a;

        /* renamed from: b, reason: collision with root package name */
        Object f94511b;

        /* renamed from: c, reason: collision with root package name */
        Object f94512c;

        /* renamed from: d, reason: collision with root package name */
        Object f94513d;

        /* renamed from: e, reason: collision with root package name */
        int f94514e;

        /* renamed from: f, reason: collision with root package name */
        int f94515f;

        /* renamed from: g, reason: collision with root package name */
        int f94516g;

        /* renamed from: h, reason: collision with root package name */
        int f94517h;

        /* renamed from: i, reason: collision with root package name */
        int f94518i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f94519j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f94521l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f94521l = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = s.this.new b(this.f94521l, continuation);
            bVar.f94519j = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            Object value2;
            Object value3;
            Object objG;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f94518i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f94519j;
                    InterfaceC17140B interfaceC17140B = s.this._paymentsViewState;
                    do {
                        value3 = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value3, PaymentsScreenViewState.b((PaymentsScreenViewState) value3, null, null, null, null, null, null, null, null, null, null, false, false, true, false, false, null, false, false, false, null, false, null, false, null, false, false, 67104767, null)));
                    s sVar = s.this;
                    long j10 = this.f94521l;
                    Result.Companion companion = Result.INSTANCE;
                    th.k kVar = sVar.paymentsRepository;
                    this.f94519j = interfaceC16622O;
                    this.f94510a = interfaceC16622O;
                    this.f94511b = this;
                    this.f94512c = this;
                    this.f94513d = interfaceC16622O;
                    this.f94514e = 0;
                    this.f94515f = 0;
                    this.f94516g = 0;
                    this.f94517h = 0;
                    this.f94518i = 1;
                    objG = kVar.g(j10, this);
                    if (objG == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objG = obj;
                }
                objB = Result.b(objG);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            s sVar2 = s.this;
            if (Result.h(objB)) {
                boolean zBooleanValue = ((Boolean) objB).booleanValue();
                InterfaceC17140B interfaceC17140B2 = sVar2._paymentsViewState;
                do {
                    value2 = interfaceC17140B2.getValue();
                } while (!interfaceC17140B2.e(value2, PaymentsScreenViewState.b((PaymentsScreenViewState) value2, null, null, null, null, null, null, null, !zBooleanValue ? AbstractC5607a.INSTANCE.d(Fh.h.f10474A0, new Object[0]) : null, null, null, false, false, false, false, !zBooleanValue, null, !zBooleanValue, zBooleanValue, false, null, false, null, false, null, false, false, 66629503, null)));
            }
            s sVar3 = s.this;
            if (Result.e(objB) != null) {
                InterfaceC17140B interfaceC17140B3 = sVar3._paymentsViewState;
                do {
                    value = interfaceC17140B3.getValue();
                } while (!interfaceC17140B3.e(value, PaymentsScreenViewState.b((PaymentsScreenViewState) value, null, null, null, null, null, null, null, AbstractC5607a.INSTANCE.d(Fh.h.f10474A0, new Object[0]), null, null, false, false, false, false, true, null, true, false, false, null, false, null, false, null, false, false, 66629503, null)));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.payments.PaymentsScreenViewModel$fetchAddresses$1", f = "PaymentsScreenViewModel.kt", l = {ModuleDescriptor.MODULE_VERSION, 156}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f94522a;

        /* renamed from: b, reason: collision with root package name */
        Object f94523b;

        /* renamed from: c, reason: collision with root package name */
        Object f94524c;

        /* renamed from: d, reason: collision with root package name */
        Object f94525d;

        /* renamed from: e, reason: collision with root package name */
        int f94526e;

        /* renamed from: f, reason: collision with root package name */
        int f94527f;

        /* renamed from: g, reason: collision with root package name */
        int f94528g;

        /* renamed from: h, reason: collision with root package name */
        int f94529h;

        /* renamed from: i, reason: collision with root package name */
        boolean f94530i;

        /* renamed from: j, reason: collision with root package name */
        int f94531j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f94532k;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = s.this.new c(continuation);
            cVar.f94532k = obj;
            return cVar;
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LDh/b;", "addresses", "", "<anonymous>", "(LDh/b;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.payments.PaymentsScreenViewModel$fetchAddresses$1$2", f = "PaymentsScreenViewModel.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<AccountAddresses, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f94534a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f94535b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ s f94536c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f94537d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, boolean z10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f94536c = sVar;
                this.f94537d = z10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f94536c, this.f94537d, continuation);
                aVar.f94535b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AccountAddresses accountAddresses, Continuation<? super Unit> continuation) {
                return ((a) create(accountAddresses, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f94534a == 0) {
                    ResultKt.b(obj);
                    this.f94536c.Q((AccountAddresses) this.f94535b, this.f94537d);
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00f5, code lost:
        
            if (tv.C17154h.k(r5, r6, r36) != r2) goto L30;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r37) {
            /*
                Method dump skipped, instructions count: 251
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.payments.s.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.payments.PaymentsScreenViewModel", f = "PaymentsScreenViewModel.kt", l = {84}, m = "fetchAutoLinkCardToMperksPreference-IoAF18A")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f94538a;

        /* renamed from: b, reason: collision with root package name */
        Object f94539b;

        /* renamed from: c, reason: collision with root package name */
        Object f94540c;

        /* renamed from: d, reason: collision with root package name */
        Object f94541d;

        /* renamed from: e, reason: collision with root package name */
        int f94542e;

        /* renamed from: f, reason: collision with root package name */
        int f94543f;

        /* renamed from: g, reason: collision with root package name */
        int f94544g;

        /* renamed from: h, reason: collision with root package name */
        int f94545h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f94546i;

        /* renamed from: k, reason: collision with root package name */
        int f94548k;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f94546i = obj;
            this.f94548k |= Integer.MIN_VALUE;
            Object objD = s.this.D(this);
            return objD == IntrinsicsKt.f() ? objD : Result.a(objD);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.payments.PaymentsScreenViewModel$fetchPaymentsAndMperksCardLinkingPreference$1", f = "PaymentsScreenViewModel.kt", l = {67, 68, 69}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f94549a;

        /* renamed from: b, reason: collision with root package name */
        Object f94550b;

        /* renamed from: c, reason: collision with root package name */
        int f94551c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f94553e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Luh/b;", "accountCreditCardResponse", "", "<anonymous>", "(Luh/b;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.payments.PaymentsScreenViewModel$fetchPaymentsAndMperksCardLinkingPreference$1$2", f = "PaymentsScreenViewModel.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<AccountCreditCardResponse, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f94554a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f94555b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ s f94556c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f94557d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object f94558e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f94559f;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f94556c, this.f94557d, this.f94558e, this.f94559f, continuation);
                aVar.f94555b = obj;
                return aVar;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, boolean z10, Object obj, AbstractC5607a abstractC5607a, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f94556c = sVar;
                this.f94557d = z10;
                this.f94558e = obj;
                this.f94559f = abstractC5607a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AccountCreditCardResponse accountCreditCardResponse, Continuation<? super Unit> continuation) {
                return ((a) create(accountCreditCardResponse, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean isEnabled;
                IntrinsicsKt.f();
                if (this.f94554a == 0) {
                    ResultKt.b(obj);
                    AccountCreditCardResponse accountCreditCardResponse = (AccountCreditCardResponse) this.f94555b;
                    s sVar = this.f94556c;
                    boolean z10 = this.f94557d;
                    Object obj2 = this.f94558e;
                    if (Result.g(obj2)) {
                        obj2 = null;
                    }
                    Preference preference = (Preference) obj2;
                    if (preference != null) {
                        isEnabled = preference.getIsEnabled();
                    } else {
                        isEnabled = false;
                    }
                    sVar.R(z10, accountCreditCardResponse, isEnabled, this.f94559f);
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z10, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f94553e = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return s.this.new e(this.f94553e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00bf, code lost:
        
            if (tv.C17154h.k(r2, r5, r36) != r1) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r37) {
            /*
                r36 = this;
                r0 = r36
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f94551c
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L3c
                if (r2 == r5) goto L36
                if (r2 == r4) goto L24
                if (r2 != r3) goto L1c
                java.lang.Object r1 = r0.f94549a
                ak.a r1 = (ak.AbstractC5607a) r1
                kotlin.ResultKt.b(r37)
                goto Lc2
            L1c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L24:
                java.lang.Object r2 = r0.f94549a
                ak.a r2 = (ak.AbstractC5607a) r2
                kotlin.ResultKt.b(r37)
                r4 = r37
                kotlin.Result r4 = (kotlin.Result) r4
                java.lang.Object r4 = r4.getValue()
            L33:
                r9 = r2
                r8 = r4
                goto La1
            L36:
                kotlin.ResultKt.b(r37)
                r2 = r37
                goto L92
            L3c:
                kotlin.ResultKt.b(r37)
                com.meijer.mobile.accounts.ux.payments.s r2 = com.meijer.mobile.accounts.ux.payments.s.this
                tv.B r2 = com.meijer.mobile.accounts.ux.payments.s.x(r2)
            L45:
                java.lang.Object r6 = r2.getValue()
                r7 = r6
                com.meijer.mobile.accounts.ux.payments.s$a r7 = (com.meijer.mobile.accounts.ux.payments.s.PaymentsScreenViewState) r7
                r34 = 67107839(0x3fffbff, float:1.5045408E-36)
                r35 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 1
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                r32 = 0
                r33 = 0
                com.meijer.mobile.accounts.ux.payments.s$a r7 = com.meijer.mobile.accounts.ux.payments.s.PaymentsScreenViewState.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
                boolean r6 = r2.e(r6, r7)
                if (r6 == 0) goto L45
                com.meijer.mobile.accounts.ux.payments.s r2 = com.meijer.mobile.accounts.ux.payments.s.this
                r0.f94551c = r5
                java.lang.Object r2 = com.meijer.mobile.accounts.ux.payments.s.u(r2, r0)
                if (r2 != r1) goto L92
                goto Lc1
            L92:
                ak.a r2 = (ak.AbstractC5607a) r2
                com.meijer.mobile.accounts.ux.payments.s r5 = com.meijer.mobile.accounts.ux.payments.s.this
                r0.f94549a = r2
                r0.f94551c = r4
                java.lang.Object r4 = com.meijer.mobile.accounts.ux.payments.s.s(r5, r0)
                if (r4 != r1) goto L33
                goto Lc1
            La1:
                com.meijer.mobile.accounts.ux.payments.s r2 = com.meijer.mobile.accounts.ux.payments.s.this
                th.k r2 = com.meijer.mobile.accounts.ux.payments.s.v(r2)
                tv.P r2 = r2.i()
                com.meijer.mobile.accounts.ux.payments.s$e$a r5 = new com.meijer.mobile.accounts.ux.payments.s$e$a
                com.meijer.mobile.accounts.ux.payments.s r6 = com.meijer.mobile.accounts.ux.payments.s.this
                boolean r7 = r0.f94553e
                r10 = 0
                r5.<init>(r6, r7, r8, r9, r10)
                r0.f94549a = r9
                r0.f94550b = r8
                r0.f94551c = r3
                java.lang.Object r2 = tv.C17154h.k(r2, r5, r0)
                if (r2 != r1) goto Lc2
            Lc1:
                return r1
            Lc2:
                kotlin.Unit r1 = kotlin.Unit.f142422a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.payments.s.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.payments.PaymentsScreenViewModel", f = "PaymentsScreenViewModel.kt", l = {81}, m = "getPaymentCards")
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f94560a;

        /* renamed from: b, reason: collision with root package name */
        Object f94561b;

        /* renamed from: c, reason: collision with root package name */
        Object f94562c;

        /* renamed from: d, reason: collision with root package name */
        Object f94563d;

        /* renamed from: e, reason: collision with root package name */
        Object f94564e;

        /* renamed from: f, reason: collision with root package name */
        int f94565f;

        /* renamed from: g, reason: collision with root package name */
        int f94566g;

        /* renamed from: h, reason: collision with root package name */
        int f94567h;

        /* renamed from: i, reason: collision with root package name */
        int f94568i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f94569j;

        /* renamed from: l, reason: collision with root package name */
        int f94571l;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f94569j = obj;
            this.f94571l |= Integer.MIN_VALUE;
            return s.this.H(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class g<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Boolean.valueOf(((AccountAddress) t11).getIsPrimary()), Boolean.valueOf(((AccountAddress) t10).getIsPrimary()));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class h<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Boolean.valueOf(((AccountCreditCard) t11).getIsPrimary()), Boolean.valueOf(((AccountCreditCard) t10).getIsPrimary()));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.payments.PaymentsScreenViewModel$submitCardDetails$2", f = "PaymentsScreenViewModel.kt", l = {HttpResponseStatus.ERROR_EXPECTATION_FAILED}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f94572a;

        /* renamed from: b, reason: collision with root package name */
        Object f94573b;

        /* renamed from: c, reason: collision with root package name */
        Object f94574c;

        /* renamed from: d, reason: collision with root package name */
        Object f94575d;

        /* renamed from: e, reason: collision with root package name */
        int f94576e;

        /* renamed from: f, reason: collision with root package name */
        int f94577f;

        /* renamed from: g, reason: collision with root package name */
        int f94578g;

        /* renamed from: h, reason: collision with root package name */
        int f94579h;

        /* renamed from: i, reason: collision with root package name */
        int f94580i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f94581j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ AccountCreditCard f94583l;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            i iVar = s.this.new i(this.f94583l, continuation);
            iVar.f94581j = obj;
            return iVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(AccountCreditCard accountCreditCard, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f94583l = accountCreditCard;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            PaymentsScreenViewState paymentsScreenViewState;
            Object value2;
            PaymentsScreenViewState paymentsScreenViewState2;
            Object objK;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f94580i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f94581j;
                    s sVar = s.this;
                    AccountCreditCard accountCreditCard = this.f94583l;
                    Result.Companion companion = Result.INSTANCE;
                    th.k kVar = sVar.paymentsRepository;
                    AccountCreditCard accountCreditCardB = AccountCreditCard.b(accountCreditCard, 0L, null, null, null, null, null, null, null, null, ((PaymentsScreenViewState) sVar._paymentsViewState.getValue()).getIsMperksCardLinkingEnabled(), false, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, 0L, null, null, null, null, false, null, null, false, -513, 1, null);
                    this.f94581j = interfaceC16622O;
                    this.f94572a = interfaceC16622O;
                    this.f94573b = this;
                    this.f94574c = this;
                    this.f94575d = interfaceC16622O;
                    this.f94576e = 0;
                    this.f94577f = 0;
                    this.f94578g = 0;
                    this.f94579h = 0;
                    this.f94580i = 1;
                    objK = th.k.k(kVar, accountCreditCardB, true, null, null, this, 12, null);
                    if (objK == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objK = obj;
                }
                objB = Result.b(objK);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            s sVar2 = s.this;
            if (Result.h(objB)) {
                PaymentInfoResponse paymentInfoResponse = (PaymentInfoResponse) objB;
                InterfaceC17140B interfaceC17140B = sVar2._paymentsViewState;
                do {
                    value2 = interfaceC17140B.getValue();
                    paymentsScreenViewState2 = (PaymentsScreenViewState) value2;
                } while (!interfaceC17140B.e(value2, PaymentsScreenViewState.b(paymentsScreenViewState2, null, null, PaymentsCardDecorator.f(paymentsScreenViewState2.getSavedPaymentCard(), 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, !paymentInfoResponse.getSuccess() ? AbstractC5607a.INSTANCE.d(Fh.h.f10485B4, new Object[0]) : null, 524287, null), null, null, null, null, null, null, null, false, false, false, false, !paymentInfoResponse.getSuccess(), null, !paymentInfoResponse.getSuccess(), paymentInfoResponse.getSuccess(), false, null, false, null, false, null, false, false, 66891771, null)));
            }
            s sVar3 = s.this;
            if (Result.e(objB) != null) {
                InterfaceC17140B interfaceC17140B2 = sVar3._paymentsViewState;
                do {
                    value = interfaceC17140B2.getValue();
                    paymentsScreenViewState = (PaymentsScreenViewState) value;
                } while (!interfaceC17140B2.e(value, PaymentsScreenViewState.b(paymentsScreenViewState, null, null, PaymentsCardDecorator.f(paymentsScreenViewState.getSavedPaymentCard(), 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, AbstractC5607a.INSTANCE.d(Fh.h.f10485B4, new Object[0]), 524287, null), null, null, null, null, null, null, null, false, false, false, false, true, null, true, false, false, null, false, null, false, null, false, false, 67022843, null)));
            }
            return Unit.f142422a;
        }
    }

    public s(th.k paymentsRepository, Bh.d preferencesRepository, Bh.a accountAddressesRepository, InterfaceC14261a analyticsEngine, yl.k featureManager) {
        Intrinsics.j(paymentsRepository, "paymentsRepository");
        Intrinsics.j(preferencesRepository, "preferencesRepository");
        Intrinsics.j(accountAddressesRepository, "accountAddressesRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(featureManager, "featureManager");
        this.paymentsRepository = paymentsRepository;
        this.preferencesRepository = preferencesRepository;
        this.accountAddressesRepository = accountAddressesRepository;
        this.analyticsEngine = analyticsEngine;
        InterfaceC17140B<PaymentsScreenViewState> interfaceC17140BA = S.a(new PaymentsScreenViewState(null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, false, false, false, null, false, null, false, null, featureManager.e(AbstractC18227f.C18231d.f170572h), false, 50331647, null));
        this._paymentsViewState = interfaceC17140BA;
        this.paymentsScreenViewState = C17154h.c(interfaceC17140BA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(kotlin.coroutines.Continuation<? super kotlin.Result<Dh.Preference>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.meijer.mobile.accounts.ux.payments.s.d
            if (r0 == 0) goto L13
            r0 = r6
            com.meijer.mobile.accounts.ux.payments.s$d r0 = (com.meijer.mobile.accounts.ux.payments.s.d) r0
            int r1 = r0.f94548k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94548k = r1
            goto L18
        L13:
            com.meijer.mobile.accounts.ux.payments.s$d r0 = new com.meijer.mobile.accounts.ux.payments.s$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f94546i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f94548k
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r1 = r0.f94541d
            com.meijer.mobile.accounts.ux.payments.s r1 = (com.meijer.mobile.accounts.ux.payments.s) r1
            java.lang.Object r1 = r0.f94540c
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f94539b
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f94538a
            com.meijer.mobile.accounts.ux.payments.s r1 = (com.meijer.mobile.accounts.ux.payments.s) r1
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Exception -> L39
            goto L68
        L39:
            r6 = move-exception
            goto L6d
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L43:
            kotlin.ResultKt.b(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L39
            Bh.d r6 = w(r5)     // Catch: java.lang.Exception -> L39
            Dh.p r2 = Dh.p.f6562f     // Catch: java.lang.Exception -> L39
            r0.f94538a = r5     // Catch: java.lang.Exception -> L39
            r0.f94539b = r0     // Catch: java.lang.Exception -> L39
            r0.f94540c = r0     // Catch: java.lang.Exception -> L39
            r0.f94541d = r5     // Catch: java.lang.Exception -> L39
            r4 = 0
            r0.f94542e = r4     // Catch: java.lang.Exception -> L39
            r0.f94543f = r4     // Catch: java.lang.Exception -> L39
            r0.f94544g = r4     // Catch: java.lang.Exception -> L39
            r0.f94545h = r4     // Catch: java.lang.Exception -> L39
            r0.f94548k = r3     // Catch: java.lang.Exception -> L39
            java.lang.Object r6 = r6.a(r2, r0)     // Catch: java.lang.Exception -> L39
            if (r6 != r1) goto L68
            return r1
        L68:
            java.lang.Object r6 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L39
            return r6
        L6d:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            qv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.payments.s.D(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ void F(s sVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        sVar.E(z10);
    }

    private final AbstractC5607a G(boolean isFailure) {
        if (isFailure) {
            return AbstractC5607a.INSTANCE.d(Q.f171009r, new Object[0]);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(kotlin.coroutines.Continuation<? super ak.AbstractC5607a> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.meijer.mobile.accounts.ux.payments.s.f
            if (r0 == 0) goto L13
            r0 = r5
            com.meijer.mobile.accounts.ux.payments.s$f r0 = (com.meijer.mobile.accounts.ux.payments.s.f) r0
            int r1 = r0.f94571l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94571l = r1
            goto L18
        L13:
            com.meijer.mobile.accounts.ux.payments.s$f r0 = new com.meijer.mobile.accounts.ux.payments.s$f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f94569j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f94571l
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r1 = r0.f94564e
            com.meijer.mobile.accounts.ux.payments.s r1 = (com.meijer.mobile.accounts.ux.payments.s) r1
            java.lang.Object r2 = r0.f94563d
            com.meijer.mobile.accounts.ux.payments.s r2 = (com.meijer.mobile.accounts.ux.payments.s) r2
            java.lang.Object r2 = r0.f94562c
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f94561b
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f94560a
            com.meijer.mobile.accounts.ux.payments.s r2 = (com.meijer.mobile.accounts.ux.payments.s) r2
            kotlin.ResultKt.b(r5)     // Catch: java.lang.Exception -> L3d
            goto L6d
        L3d:
            r5 = move-exception
            goto L74
        L3f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L47:
            kotlin.ResultKt.b(r5)
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L72
            th.k r5 = v(r4)     // Catch: java.lang.Exception -> L72
            r0.f94560a = r4     // Catch: java.lang.Exception -> L72
            r0.f94561b = r0     // Catch: java.lang.Exception -> L72
            r0.f94562c = r0     // Catch: java.lang.Exception -> L72
            r0.f94563d = r4     // Catch: java.lang.Exception -> L72
            r0.f94564e = r4     // Catch: java.lang.Exception -> L72
            r2 = 0
            r0.f94565f = r2     // Catch: java.lang.Exception -> L72
            r0.f94566g = r2     // Catch: java.lang.Exception -> L72
            r0.f94567h = r2     // Catch: java.lang.Exception -> L72
            r0.f94568i = r2     // Catch: java.lang.Exception -> L72
            r0.f94571l = r3     // Catch: java.lang.Exception -> L72
            java.lang.Object r5 = r5.h(r0)     // Catch: java.lang.Exception -> L72
            if (r5 != r1) goto L6c
            return r1
        L6c:
            r1 = r4
        L6d:
            java.lang.Object r5 = kotlin.Result.b(r5)     // Catch: java.lang.Exception -> L3d
            goto L85
        L72:
            r5 = move-exception
            r1 = r4
        L74:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            qv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L85:
            boolean r5 = kotlin.Result.g(r5)
            ak.a r5 = r1.G(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.payments.s.H(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        return Unit.f142422a;
    }

    private final void S(AccountCreditCard creditCard) {
        PaymentsScreenViewState value;
        InterfaceC17140B<PaymentsScreenViewState> interfaceC17140B = this._paymentsViewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, PaymentsScreenViewState.b(value, null, null, null, null, null, null, null, null, null, null, false, false, true, false, false, null, false, false, false, null, false, null, false, null, false, false, 67104767, null)));
        C16648k.d(d0.a(this), null, null, new i(creditCard, null), 3, null);
    }

    private final void T(j<?> formField) {
        s sVar = this;
        PaymentsCardDecorator paymentsCardDecoratorA = sVar._paymentsViewState.getValue().getUnsavedPaymentCard().A(formField);
        InterfaceC17140B<PaymentsScreenViewState> interfaceC17140B = sVar._paymentsViewState;
        while (true) {
            PaymentsScreenViewState value = interfaceC17140B.getValue();
            if (interfaceC17140B.e(value, PaymentsScreenViewState.b(value, null, null, null, paymentsCardDecoratorA, null, null, null, null, null, null, false, false, false, false, false, null, false, false, false, null, false, null, paymentsCardDecoratorA.isValid() && !Intrinsics.e(paymentsCardDecoratorA.B(), sVar._paymentsViewState.getValue().getSavedPaymentCard().B()), null, false, false, 62914551, null))) {
                return;
            } else {
                sVar = this;
            }
        }
    }

    public final P<PaymentsScreenViewState> I() {
        return this.paymentsScreenViewState;
    }

    public final void J(k action) {
        PaymentsScreenViewState value;
        PaymentsScreenViewState value2;
        PaymentsScreenViewState value3;
        PaymentsScreenViewState paymentsScreenViewState;
        PaymentsCardDecorator paymentsCardDecoratorF;
        PaymentsScreenViewState value4;
        PaymentsScreenViewState value5;
        PaymentsScreenViewState value6;
        PaymentsScreenViewState paymentsScreenViewState2;
        PaymentsScreenViewState value7;
        PaymentsScreenViewState value8;
        PaymentsScreenViewState value9;
        PaymentsScreenViewState value10;
        PaymentsScreenViewState value11;
        PaymentsScreenViewState value12;
        PaymentsScreenViewState paymentsScreenViewState3;
        ArrayList arrayList;
        PaymentsScreenViewState value13;
        PaymentsScreenViewState value14;
        k.EditCard editCard;
        PaymentsScreenViewState value15;
        Intrinsics.j(action, "action");
        if (action instanceof k.FetchAllPaymentOptions) {
            E(((k.FetchAllPaymentOptions) action).getIsShowSuccessNotification());
            return;
        }
        if (Intrinsics.e(action, k.C1335k.f94467a)) {
            C();
            return;
        }
        if (Intrinsics.e(action, k.a.f94457a)) {
            this.analyticsEngine.h(C14476c.a("account: payment: Add New Card Initiation"), new Function1() { // from class: com.meijer.mobile.accounts.ux.payments.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s.K((TrackingData) obj);
                }
            });
            InterfaceC17140B<PaymentsScreenViewState> interfaceC17140B = this._paymentsViewState;
            do {
                value15 = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value15, PaymentsScreenViewState.b(value15, null, null, null, null, null, null, null, null, AbstractC5607a.INSTANCE.d(Fh.h.f10697g, new Object[0]), null, false, false, false, false, true, null, false, false, false, null, true, null, false, null, false, false, 65912575, null)));
            return;
        }
        if (action instanceof k.EditCard) {
            this.analyticsEngine.h(C14476c.a("account: payment: Edit Payment Initiation"), new Function1() { // from class: com.meijer.mobile.accounts.ux.payments.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s.L((TrackingData) obj);
                }
            });
            InterfaceC17140B<PaymentsScreenViewState> interfaceC17140B2 = this._paymentsViewState;
            do {
                value14 = interfaceC17140B2.getValue();
                editCard = (k.EditCard) action;
            } while (!interfaceC17140B2.e(value14, PaymentsScreenViewState.b(value14, null, null, editCard.getPaymentsCardDecorator(), editCard.getPaymentsCardDecorator(), null, null, null, null, AbstractC5607a.INSTANCE.d(Fh.h.f10572O0, new Object[0]), null, false, false, false, false, true, null, false, false, false, null, false, null, false, null, false, false, 62766835, null)));
            return;
        }
        if (Intrinsics.e(action, k.p.f94472a)) {
            this.analyticsEngine.h(C14476c.a("account: payment: Delete Payment Method Initiation"), new Function1() { // from class: com.meijer.mobile.accounts.ux.payments.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s.M((TrackingData) obj);
                }
            });
            InterfaceC17140B<PaymentsScreenViewState> interfaceC17140B3 = this._paymentsViewState;
            do {
                value13 = interfaceC17140B3.getValue();
            } while (!interfaceC17140B3.e(value13, PaymentsScreenViewState.b(value13, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, false, false, true, null, false, null, false, null, false, false, 66846591, null)));
            return;
        }
        if (action instanceof k.DeleteCard) {
            this.analyticsEngine.h(C14476c.a("account: payment: Delete Payment Method Confirmation"), new Function1() { // from class: com.meijer.mobile.accounts.ux.payments.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s.N((TrackingData) obj);
                }
            });
            B(((k.DeleteCard) action).getCardId());
            return;
        }
        if (action instanceof k.SelectBillingAddress) {
            InterfaceC17140B<PaymentsScreenViewState> interfaceC17140B4 = this._paymentsViewState;
            do {
                value12 = interfaceC17140B4.getValue();
                paymentsScreenViewState3 = value12;
                List<PaymentsAddressDecorator> listL = paymentsScreenViewState3.l();
                arrayList = new ArrayList(CollectionsKt.x(listL, 10));
                for (PaymentsAddressDecorator paymentsAddressDecorator : listL) {
                    arrayList.add(PaymentsAddressDecorator.b(paymentsAddressDecorator, null, null, null, null, false, Intrinsics.e(paymentsAddressDecorator, ((k.SelectBillingAddress) action).getPaymentsAddressDecorator()), 31, null));
                }
            } while (!interfaceC17140B4.e(value12, PaymentsScreenViewState.b(paymentsScreenViewState3, null, arrayList, null, null, null, null, null, null, null, null, false, false, false, false, false, null, false, false, false, null, false, null, false, null, false, false, 67108861, null)));
            return;
        }
        if (Intrinsics.e(action, k.b.f94458a)) {
            InterfaceC17140B<PaymentsScreenViewState> interfaceC17140B5 = this._paymentsViewState;
            do {
                value11 = interfaceC17140B5.getValue();
            } while (!interfaceC17140B5.e(value11, PaymentsScreenViewState.b(value11, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, i.b.f94447a, true, false, false, null, false, null, false, null, false, false, 67010559, null)));
            return;
        }
        if (Intrinsics.e(action, k.d.f94460a)) {
            InterfaceC17140B<PaymentsScreenViewState> interfaceC17140B6 = this._paymentsViewState;
            do {
                value10 = interfaceC17140B6.getValue();
            } while (!interfaceC17140B6.e(value10, PaymentsScreenViewState.b(value10, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, i.a.f94446a, true, false, false, new AddressDecorator(0L, null, null, null, null, null, null, null, null, false, null, null, false, null, 16383, null), false, null, false, null, false, false, 66486271, null)));
            return;
        }
        if (Intrinsics.e(action, k.c.f94459a)) {
            InterfaceC17140B<PaymentsScreenViewState> interfaceC17140B7 = this._paymentsViewState;
            do {
                value9 = interfaceC17140B7.getValue();
            } while (!interfaceC17140B7.e(value9, PaymentsScreenViewState.b(value9, null, null, null, new PaymentsCardDecorator(0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, 1048575, null), null, null, null, null, null, null, false, false, false, false, false, null, true, false, false, null, false, null, false, null, false, false, 65716087, null)));
            return;
        }
        if (Intrinsics.e(action, k.f.f94462a)) {
            InterfaceC17140B<PaymentsScreenViewState> interfaceC17140B8 = this._paymentsViewState;
            do {
                value8 = interfaceC17140B8.getValue();
            } while (!interfaceC17140B8.e(value8, PaymentsScreenViewState.b(value8, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, false, false, false, null, false, null, false, null, false, false, 66846719, null)));
            return;
        }
        if (action instanceof k.OnFormFieldChange) {
            T(((k.OnFormFieldChange) action).a());
            return;
        }
        if (Intrinsics.e(action, k.i.f94465a)) {
            InterfaceC17140B<PaymentsScreenViewState> interfaceC17140B9 = this._paymentsViewState;
            do {
                value7 = interfaceC17140B9.getValue();
            } while (!interfaceC17140B9.e(value7, PaymentsScreenViewState.b(value7, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, false, false, false, null, false, null, false, null, false, false, 66977791, null)));
            return;
        }
        if (Intrinsics.e(action, k.g.f94463a)) {
            InterfaceC17140B<PaymentsScreenViewState> interfaceC17140B10 = this._paymentsViewState;
            do {
                value6 = interfaceC17140B10.getValue();
                paymentsScreenViewState2 = value6;
            } while (!interfaceC17140B10.e(value6, PaymentsScreenViewState.b(paymentsScreenViewState2, null, null, PaymentsCardDecorator.f(paymentsScreenViewState2.getSavedPaymentCard(), 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, 524287, null), null, null, null, null, null, null, null, false, false, false, false, false, null, false, false, false, null, false, null, false, null, false, false, 65011579, null)));
            return;
        }
        if (Intrinsics.e(action, k.q.f94473a)) {
            InterfaceC17140B<PaymentsScreenViewState> interfaceC17140B11 = this._paymentsViewState;
            do {
                value5 = interfaceC17140B11.getValue();
            } while (!interfaceC17140B11.e(value5, PaymentsScreenViewState.b(value5, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, false, false, false, null, false, AbstractC5607a.INSTANCE.d(Fh.h.f10485B4, new Object[0]), false, null, false, false, 65011711, null)));
            return;
        }
        if (Intrinsics.e(action, k.s.f94475a)) {
            InterfaceC17140B<PaymentsScreenViewState> interfaceC17140B12 = this._paymentsViewState;
            do {
                value4 = interfaceC17140B12.getValue();
            } while (!interfaceC17140B12.e(value4, PaymentsScreenViewState.b(value4, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, false, true, false, null, false, null, false, null, false, false, 66977791, null)));
            return;
        }
        if (action instanceof k.SetAsPrimaryPayment) {
            InterfaceC17140B<PaymentsScreenViewState> interfaceC17140B13 = this._paymentsViewState;
            do {
                value3 = interfaceC17140B13.getValue();
                paymentsScreenViewState = value3;
                paymentsCardDecoratorF = PaymentsCardDecorator.f(paymentsScreenViewState.getUnsavedPaymentCard(), 0L, null, null, null, null, null, null, null, null, null, null, null, null, ((k.SetAsPrimaryPayment) action).getIsChecked(), false, false, null, null, null, null, 1040383, null);
            } while (!interfaceC17140B13.e(value3, PaymentsScreenViewState.b(paymentsScreenViewState, null, null, null, paymentsCardDecoratorF, null, null, null, null, null, null, false, false, false, false, false, null, false, false, false, null, false, null, paymentsCardDecoratorF.isValid() && !Intrinsics.e(paymentsCardDecoratorF.B(), this._paymentsViewState.getValue().getSavedPaymentCard().B()), null, false, false, 62914551, null)));
            return;
        }
        if (action instanceof k.SubmitPayment) {
            this.analyticsEngine.h(C14476c.a("account: payment: Edit Payment Confirmation"), new Function1() { // from class: com.meijer.mobile.accounts.ux.payments.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s.O((TrackingData) obj);
                }
            });
            S(Vh.e.a(((k.SubmitPayment) action).getDecorator()));
            return;
        }
        if (action instanceof k.u) {
            this.analyticsEngine.h(C14476c.a("account: payment: Add New Card Confirmation"), new Function1() { // from class: com.meijer.mobile.accounts.ux.payments.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s.P((TrackingData) obj);
                }
            });
            return;
        }
        if (action instanceof k.ShowMperksCardLinkingInfoBottomSheet) {
            InterfaceC17140B<PaymentsScreenViewState> interfaceC17140B14 = this._paymentsViewState;
            do {
                value2 = interfaceC17140B14.getValue();
            } while (!interfaceC17140B14.e(value2, PaymentsScreenViewState.b(value2, null, null, null, null, null, null, null, null, null, AbstractC5607a.INSTANCE.d(((k.ShowMperksCardLinkingInfoBottomSheet) action).getIsLinkedToMperks() ? Fh.h.f10636X1 : Fh.h.f10643Y1, new Object[0]), false, false, false, false, true, null, false, false, false, null, false, null, false, null, false, false, 67091967, null)));
        } else {
            if (!(action instanceof k.h)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC17140B<PaymentsScreenViewState> interfaceC17140B15 = this._paymentsViewState;
            do {
                value = interfaceC17140B15.getValue();
            } while (!interfaceC17140B15.e(value, PaymentsScreenViewState.b(value, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, false, false, false, null, false, null, false, null, false, false, 67091967, null)));
        }
    }

    private final void B(long cardId) {
        C16648k.d(d0.a(this), null, null, new b(cardId, null), 3, null);
    }

    private final void C() {
        C16648k.d(d0.a(this), null, null, new c(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(AccountAddresses addresses, boolean isFailure) {
        PaymentsScreenViewState value;
        boolean z10;
        List<AccountAddress> listB = addresses.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (((AccountAddress) obj).getAddressType() == EnumC3372e.f6514d) {
                arrayList.add(obj);
            }
        }
        List listB1 = CollectionsKt.b1(CollectionsKt.Z0(arrayList, new g()), 5);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listB1, 10));
        int i10 = 0;
        for (Object obj2 : listB1) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            AccountAddress accountAddress = (AccountAddress) obj2;
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            arrayList2.add(Vh.c.a(accountAddress, z10));
            i10 = i11;
        }
        InterfaceC17140B<PaymentsScreenViewState> interfaceC17140B = this._paymentsViewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, PaymentsScreenViewState.b(value, null, arrayList2, null, null, null, null, null, null, null, null, false, false, false, isFailure, false, null, false, false, false, null, false, null, false, null, false, false, 67096573, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(boolean isShowSuccessNotification, AccountCreditCardResponse accountCreditCardResponse, boolean isMperksCardLinkingEnabled, AbstractC5607a errorMessage) {
        AbstractC5607a abstractC5607aD;
        AbstractC5607a abstractC5607a;
        int i10 = 5;
        List listB1 = CollectionsKt.b1(CollectionsKt.Z0(accountCreditCardResponse.b(), new h()), 5);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listB1, 10));
        Iterator it = listB1.iterator();
        while (it.hasNext()) {
            arrayList.add(Vh.e.b((AccountCreditCard) it.next()));
        }
        InterfaceC17140B<PaymentsScreenViewState> interfaceC17140B = this._paymentsViewState;
        while (true) {
            PaymentsScreenViewState value = interfaceC17140B.getValue();
            PaymentsScreenViewState paymentsScreenViewState = value;
            AbstractC5607a abstractC5607aD2 = null;
            if (!C5608b.a(errorMessage)) {
                abstractC5607a = null;
            } else {
                if (arrayList.size() < i10) {
                    abstractC5607aD = AbstractC5607a.INSTANCE.d(Fh.h.f10629W1, new Object[0]);
                } else {
                    abstractC5607aD = AbstractC5607a.INSTANCE.d(Fh.h.f10561M3, new Object[0]);
                }
                abstractC5607a = abstractC5607aD;
            }
            if (C5608b.a(errorMessage) && arrayList.size() < i10) {
                abstractC5607aD2 = AbstractC5607a.INSTANCE.d(Fh.h.f10488C0, Integer.valueOf(arrayList.size()));
            }
            if (interfaceC17140B.e(value, PaymentsScreenViewState.b(paymentsScreenViewState, arrayList, null, null, null, abstractC5607a, abstractC5607aD2, errorMessage, null, null, null, false, isMperksCardLinkingEnabled, false, false, false, null, false, isShowSuccessNotification, false, null, false, null, false, new MperksQuickIDFooterDecorator(isMperksCardLinkingEnabled, null, null, 6, null), false, false, 58585998, null))) {
                return;
            } else {
                i10 = 5;
            }
        }
    }

    public final void E(boolean isShowSuccessNotification) {
        C16648k.d(d0.a(this), null, null, new e(isShowSuccessNotification, null), 3, null);
    }
}
