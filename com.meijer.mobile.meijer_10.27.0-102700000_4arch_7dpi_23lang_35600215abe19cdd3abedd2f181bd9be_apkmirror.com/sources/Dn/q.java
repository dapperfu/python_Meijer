package Dn;

import Bn.SplitAddress;
import Dh.AccountAddress;
import Dh.EnumC3372e;
import Dh.UpdateConfirmationResponse;
import Hk.Validation;
import ci.Country;
import ci.CustomerAddress;
import ci.Region;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.meijer.activity.settings.addresses.AccountAddressState;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import hv.C14573a;
import j$.time.ZonedDateTime;
import java.util.Set;
import jv.C15081d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import qv.C0;
import qv.C16639f0;
import qv.C16644i;
import qv.F0;
import qv.InterfaceC16608A;
import qv.InterfaceC16619L;
import qv.InterfaceC16622O;
import responses.PostalAddress;
import rk.EnumC16795a;
import sk.C16981a;
import uh.EnumC17262d;
import uw.a;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0002NLB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\"\u0010#J\u0018\u0010&\u001a\u00020\u00162\u0006\u0010%\u001a\u00020$H\u0082@¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00162\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b.\u0010+J\u0017\u0010/\u001a\u00020\u00162\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b/\u0010-J\u0017\u00101\u001a\u00020\u001e2\b\u00100\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\u00162\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J \u00109\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020\u00162\u0006\u0010;\u001a\u00020\u0010¢\u0006\u0004\b<\u0010=J?\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00100B2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00160@¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\u0016¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u0016H\u0086@¢\u0006\u0004\bG\u0010\u0018J\u0010\u0010H\u001a\u00020\u0016H\u0086@¢\u0006\u0004\bH\u0010\u0018J\r\u0010J\u001a\u00020I¢\u0006\u0004\bJ\u0010KR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020U0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u001d\u0010^\u001a\b\u0012\u0004\u0012\u00020U0Y8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0016\u0010g\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010v¨\u0006x"}, d2 = {"LDn/q;", "", "Lgi/a;", "analyticsEngine", "Lyo/k;", "userManager", "LTi/d;", "addressRepository", "LBh/a;", "accountAddressesRepository", "<init>", "(Lgi/a;Lyo/k;LTi/d;LBh/a;)V", "LDn/q$a;", "field", "", "currentHideValidations", "", "shouldHide", "l0", "(LDn/q$a;Ljava/util/Set;Z)Ljava/util/Set;", "A", "()Z", "", "m0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lresponses/PostalAddress;", "postalAddress", "LBn/e;", "C", "(Lresponses/PostalAddress;)LBn/e;", "LDh/a;", "accountAddress", "B", "(LDh/a;)LBn/e;", "U", "(Lresponses/PostalAddress;)V", "", "throwable", "T", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LDh/C;", "updateConfirmationResponse", "S", "(LDh/C;)V", "R", "(Ljava/lang/Throwable;)V", "Q", "P", PlaceTypes.ADDRESS, "L", "(LDh/a;)LDh/a;", "LDn/q$b;", "listener", "Y", "(LDn/q$b;)V", "splitAddress", "isSuggested", "M", "(LBn/e;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isPrimary", "X", "(Z)V", "", "currentFieldValue", "Lkotlin/Function0;", "handleHasChanged", "Lio/reactivex/u;", "Z", "(LDn/q$a;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)Lio/reactivex/u;", "E", "()V", "V", "D", "Lci/c;", "z", "()Lci/c;", "a", "Lgi/a;", "b", "Lyo/k;", "c", "LTi/d;", "d", "LBh/a;", "LDk/n;", "Lcom/meijer/mobile/meijer/activity/settings/addresses/a;", "e", "LDk/n;", "addressModelStore", "Lio/reactivex/l;", "f", "Lio/reactivex/l;", "K", "()Lio/reactivex/l;", "addressState", "g", "LDh/a;", "J", "()LDh/a;", "W", "(LDh/a;)V", "h", "LDn/q$b;", "networkCallbackListener", "LNu/a;", "i", "LNu/a;", "disposables", "Lqv/C0;", "j", "Lqv/C0;", "job", "Lqv/L;", "k", "Lqv/L;", "handler", "Lkotlin/coroutines/CoroutineContext;", "l", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Ti.d addressRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Bh.a accountAddressesRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Dk.n<AccountAddressState> addressModelStore;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final io.reactivex.l<AccountAddressState> addressState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public AccountAddress accountAddress;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private b networkCallbackListener;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final C0 job;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16619L handler;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext coroutineContext;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"LDn/q$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f6907a = new a("ADDRESS_NICK_NAME", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f6908b = new a("FIRST_NAME", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f6909c = new a("LAST_NAME", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f6910d = new a("PHONE_NUMBER", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final a f6911e = new a("ADDRESS_LINE_ONE", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final a f6912f = new a("ADDRESS_LINE_TWO", 5);

        /* renamed from: g, reason: collision with root package name */
        public static final a f6913g = new a("CITY", 6);

        /* renamed from: h, reason: collision with root package name */
        public static final a f6914h = new a("STATE", 7);

        /* renamed from: i, reason: collision with root package name */
        public static final a f6915i = new a("ZIP_CODE", 8);

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ a[] f6916j;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f6917k;

        public static EnumEntries<a> b() {
            return f6917k;
        }

        static {
            a[] aVarArrA = a();
            f6916j = aVarArrA;
            f6917k = EnumEntriesKt.a(aVarArrA);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f6907a, f6908b, f6909c, f6910d, f6911e, f6912f, f6913g, f6914h, f6915i};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f6916j.clone();
        }

        private a(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"LDn/q$b;", "", "", "isInProgress", "", "c", "(Z)V", "LBn/e;", "suggestedAddress", "originalAddress", "b", "(LBn/e;LBn/e;)V", "d", "()V", "j", "h", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "retrofitException", "i", "(Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;)V", "e", "()Z", "f", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        void b(SplitAddress suggestedAddress, SplitAddress originalAddress);

        void c(boolean isInProgress);

        void d();

        boolean e();

        boolean f();

        void h();

        void i(RetrofitException retrofitException);

        void j();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "Lkotlin/Result;", "LDh/C;", "<anonymous>", "(Lqv/O;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AccountAddressDelegate$deleteAddress$2", f = "AccountAddressDelegate.kt", l = {556}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Result<? extends UpdateConfirmationResponse>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f6918a;

        /* renamed from: b, reason: collision with root package name */
        int f6919b;

        /* renamed from: c, reason: collision with root package name */
        int f6920c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f6921d;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Result<? extends UpdateConfirmationResponse>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super Result<UpdateConfirmationResponse>>) continuation);
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = q.this.new d(continuation);
            dVar.f6921d = obj;
            return dVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super Result<UpdateConfirmationResponse>> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r7.f6920c
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r7.f6918a
                qv.O r0 = (qv.InterfaceC16622O) r0
                java.lang.Object r0 = r7.f6921d
                qv.O r0 = (qv.InterfaceC16622O) r0
                kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L17
                goto L4a
            L17:
                r8 = move-exception
                goto L55
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                kotlin.ResultKt.b(r8)
                java.lang.Object r8 = r7.f6921d
                qv.O r8 = (qv.InterfaceC16622O) r8
                Dn.q r1 = Dn.q.this
                kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L51
                Bh.a r3 = Dn.q.q(r1)     // Catch: java.lang.Throwable -> L51
                Dh.a r1 = r1.J()     // Catch: java.lang.Throwable -> L51
                long r4 = r1.getId()     // Catch: java.lang.Throwable -> L51
                r7.f6921d = r8     // Catch: java.lang.Throwable -> L51
                r7.f6918a = r8     // Catch: java.lang.Throwable -> L51
                r1 = 0
                r7.f6919b = r1     // Catch: java.lang.Throwable -> L51
                r7.f6920c = r2     // Catch: java.lang.Throwable -> L51
                java.lang.Object r1 = r3.b(r4, r7)     // Catch: java.lang.Throwable -> L51
                if (r1 != r0) goto L48
                return r0
            L48:
                r0 = r8
                r8 = r1
            L4a:
                Dh.C r8 = (Dh.UpdateConfirmationResponse) r8     // Catch: java.lang.Throwable -> L17
                java.lang.Object r8 = kotlin.Result.b(r8)     // Catch: java.lang.Throwable -> L17
                goto L5f
            L51:
                r0 = move-exception
                r6 = r0
                r0 = r8
                r8 = r6
            L55:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r8 = kotlin.ResultKt.a(r8)
                java.lang.Object r8 = kotlin.Result.b(r8)
            L5f:
                Dn.q r1 = Dn.q.this
                boolean r2 = kotlin.Result.h(r8)
                if (r2 == 0) goto L6d
                r2 = r8
                Dh.C r2 = (Dh.UpdateConfirmationResponse) r2
                Dn.q.t(r1, r2)
            L6d:
                Dn.q r1 = Dn.q.this
                java.lang.Throwable r2 = kotlin.Result.e(r8)
                if (r2 == 0) goto L85
                kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
                qv.E0.i(r0)
                boolean r0 = r2 instanceof java.lang.Error
                if (r0 != 0) goto L84
                Dn.q.s(r1, r2)
                goto L85
            L84:
                throw r2
            L85:
                kotlin.Result r8 = kotlin.Result.a(r8)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Dn.q.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AccountAddressDelegate$finalFieldChecksBeforeNetworkCalls$1$1", f = "AccountAddressDelegate.kt", l = {425}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f6923a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return q.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f6923a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                q qVar = q.this;
                this.f6923a = 1;
                if (qVar.m0(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "Lkotlin/Result;", "LDh/C;", "<anonymous>", "(Lqv/O;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AccountAddressDelegate$saveAddress$2", f = "AccountAddressDelegate.kt", l = {460}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Result<? extends UpdateConfirmationResponse>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f6925a;

        /* renamed from: b, reason: collision with root package name */
        int f6926b;

        /* renamed from: c, reason: collision with root package name */
        int f6927c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f6928d;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Result<? extends UpdateConfirmationResponse>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super Result<UpdateConfirmationResponse>>) continuation);
        }

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = q.this.new f(continuation);
            fVar.f6928d = obj;
            return fVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super Result<UpdateConfirmationResponse>> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r6.f6927c
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r6.f6925a
                qv.O r0 = (qv.InterfaceC16622O) r0
                java.lang.Object r0 = r6.f6928d
                qv.O r0 = (qv.InterfaceC16622O) r0
                kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L17
                goto L46
            L17:
                r7 = move-exception
                goto L51
            L19:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L21:
                kotlin.ResultKt.b(r7)
                java.lang.Object r7 = r6.f6928d
                qv.O r7 = (qv.InterfaceC16622O) r7
                Dn.q r1 = Dn.q.this
                kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L4d
                Bh.a r3 = Dn.q.q(r1)     // Catch: java.lang.Throwable -> L4d
                Dh.a r1 = r1.J()     // Catch: java.lang.Throwable -> L4d
                r6.f6928d = r7     // Catch: java.lang.Throwable -> L4d
                r6.f6925a = r7     // Catch: java.lang.Throwable -> L4d
                r4 = 0
                r6.f6926b = r4     // Catch: java.lang.Throwable -> L4d
                r6.f6927c = r2     // Catch: java.lang.Throwable -> L4d
                java.lang.Object r1 = r3.e(r1, r6)     // Catch: java.lang.Throwable -> L4d
                if (r1 != r0) goto L44
                return r0
            L44:
                r0 = r7
                r7 = r1
            L46:
                Dh.C r7 = (Dh.UpdateConfirmationResponse) r7     // Catch: java.lang.Throwable -> L17
                java.lang.Object r7 = kotlin.Result.b(r7)     // Catch: java.lang.Throwable -> L17
                goto L5b
            L4d:
                r0 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
            L51:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r7 = kotlin.ResultKt.a(r7)
                java.lang.Object r7 = kotlin.Result.b(r7)
            L5b:
                Dn.q r1 = Dn.q.this
                boolean r2 = kotlin.Result.h(r7)
                if (r2 == 0) goto L69
                r2 = r7
                Dh.C r2 = (Dh.UpdateConfirmationResponse) r2
                Dn.q.v(r1, r2)
            L69:
                Dn.q r1 = Dn.q.this
                java.lang.Throwable r2 = kotlin.Result.e(r7)
                if (r2 == 0) goto L81
                kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
                qv.E0.i(r0)
                boolean r0 = r2 instanceof java.lang.Error
                if (r0 != 0) goto L80
                Dn.q.u(r1, r2)
                goto L81
            L80:
                throw r2
            L81:
                kotlin.Result r7 = kotlin.Result.a(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: Dn.q.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Dn/q$g", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lqv/L;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "l0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class g extends AbstractCoroutineContextElement implements InterfaceC16619L {
        @Override // qv.InterfaceC16619L
        public void l0(CoroutineContext context, Throwable exception) {
            uw.a.INSTANCE.f(exception, "Unhandled exception", new Object[0]);
        }

        public g(InterfaceC16619L.Companion companion) {
            super(companion);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "Lkotlin/Result;", "Lresponses/PostalAddress;", "<anonymous>", "(Lqv/O;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AccountAddressDelegate$verifyAddressWithVertex$2", f = "AccountAddressDelegate.kt", l = {439, 444, 447}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Result<? extends PostalAddress>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f6930a;

        /* renamed from: b, reason: collision with root package name */
        Object f6931b;

        /* renamed from: c, reason: collision with root package name */
        int f6932c;

        /* renamed from: d, reason: collision with root package name */
        int f6933d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f6934e;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Result<? extends PostalAddress>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super Result<PostalAddress>>) continuation);
        }

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = q.this.new h(continuation);
            hVar.f6934e = obj;
            return hVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super Result<PostalAddress>> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
        /* JADX WARN: Type inference failed for: r1v14, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, qv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r10.f6933d
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L46
                if (r1 == r4) goto L38
                if (r1 == r3) goto L29
                if (r1 != r2) goto L21
                java.lang.Object r0 = r10.f6931b
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                java.lang.Object r0 = r10.f6930a
                java.lang.Object r1 = r10.f6934e
                qv.O r1 = (qv.InterfaceC16622O) r1
                kotlin.ResultKt.b(r11)
                goto Lc3
            L21:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L29:
                java.lang.Object r1 = r10.f6931b
                responses.PostalAddress r1 = (responses.PostalAddress) r1
                java.lang.Object r1 = r10.f6930a
                java.lang.Object r3 = r10.f6934e
                qv.O r3 = (qv.InterfaceC16622O) r3
                kotlin.ResultKt.b(r11)
                goto La8
            L38:
                java.lang.Object r1 = r10.f6930a
                qv.O r1 = (qv.InterfaceC16622O) r1
                java.lang.Object r1 = r10.f6934e
                qv.O r1 = (qv.InterfaceC16622O) r1
                kotlin.ResultKt.b(r11)     // Catch: java.lang.Throwable -> L44
                goto L69
            L44:
                r11 = move-exception
                goto L73
            L46:
                kotlin.ResultKt.b(r11)
                java.lang.Object r11 = r10.f6934e
                r1 = r11
                qv.O r1 = (qv.InterfaceC16622O) r1
                Dn.q r11 = Dn.q.this
                kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L44
                Ti.d r6 = Dn.q.r(r11)     // Catch: java.lang.Throwable -> L44
                Dh.a r11 = r11.J()     // Catch: java.lang.Throwable -> L44
                r10.f6934e = r1     // Catch: java.lang.Throwable -> L44
                r10.f6930a = r1     // Catch: java.lang.Throwable -> L44
                r10.f6932c = r5     // Catch: java.lang.Throwable -> L44
                r10.f6933d = r4     // Catch: java.lang.Throwable -> L44
                java.lang.Object r11 = r6.i(r11, r10)     // Catch: java.lang.Throwable -> L44
                if (r11 != r0) goto L69
                goto Lc1
            L69:
                responses.PostalAddress r11 = (responses.PostalAddress) r11     // Catch: java.lang.Throwable -> L44
                java.lang.Object r11 = kotlin.Result.b(r11)     // Catch: java.lang.Throwable -> L44
            L6f:
                r9 = r1
                r1 = r11
                r11 = r9
                goto L7e
            L73:
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE
                java.lang.Object r11 = kotlin.ResultKt.a(r11)
                java.lang.Object r11 = kotlin.Result.b(r11)
                goto L6f
            L7e:
                Dn.q r4 = Dn.q.this
                boolean r6 = kotlin.Result.h(r1)
                if (r6 == 0) goto La9
                r6 = r1
                responses.PostalAddress r6 = (responses.PostalAddress) r6
                if (r6 == 0) goto L8f
                Dn.q.x(r4, r6)
                goto La9
            L8f:
                java.lang.NullPointerException r7 = new java.lang.NullPointerException
                java.lang.String r8 = "No address match found"
                r7.<init>(r8)
                r10.f6934e = r11
                r10.f6930a = r1
                r10.f6931b = r6
                r10.f6932c = r5
                r10.f6933d = r3
                java.lang.Object r3 = Dn.q.w(r4, r7, r10)
                if (r3 != r0) goto La7
                goto Lc1
            La7:
                r3 = r11
            La8:
                r11 = r3
            La9:
                Dn.q r3 = Dn.q.this
                java.lang.Throwable r4 = kotlin.Result.e(r1)
                if (r4 == 0) goto Lc4
                r10.f6934e = r11
                r10.f6930a = r1
                r10.f6931b = r4
                r10.f6932c = r5
                r10.f6933d = r2
                java.lang.Object r11 = Dn.q.w(r3, r4, r10)
                if (r11 != r0) goto Lc2
            Lc1:
                return r0
            Lc2:
                r0 = r1
            Lc3:
                r1 = r0
            Lc4:
                kotlin.Result r11 = kotlin.Result.a(r1)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: Dn.q.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f6907a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f6908b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f6909c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f6910d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.f6911e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.f6912f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.f6913g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.f6914h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[a.f6915i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public q(InterfaceC14261a analyticsEngine, yo.k userManager, Ti.d addressRepository, Bh.a accountAddressesRepository) {
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(addressRepository, "addressRepository");
        Intrinsics.j(accountAddressesRepository, "accountAddressesRepository");
        this.analyticsEngine = analyticsEngine;
        this.userManager = userManager;
        this.addressRepository = addressRepository;
        this.accountAddressesRepository = accountAddressesRepository;
        Dk.n<AccountAddressState> nVar = new Dk.n<>(new AccountAddressState(null, null, null, null, null, null, null, null, null, null, false, 2047, null));
        this.addressModelStore = nVar;
        this.addressState = nVar.t();
        this.disposables = new Nu.a();
        InterfaceC16608A interfaceC16608AB = F0.b(null, 1, null);
        this.job = interfaceC16608AB;
        g gVar = new g(InterfaceC16619L.INSTANCE);
        this.handler = gVar;
        this.coroutineContext = interfaceC16608AB.m0(gVar).m0(C16639f0.b());
    }

    private final SplitAddress B(AccountAddress accountAddress) {
        return new SplitAddress(accountAddress.getAddressLine1(), accountAddress.getAddressLine2(), accountAddress.getCity(), accountAddress.getState(), accountAddress.getZipCode());
    }

    private final SplitAddress C(PostalAddress postalAddress) {
        return new SplitAddress(postalAddress.getStreetAddress1(), J().getAddressLine2(), postalAddress.getCity(), postalAddress.getMainDivision(), postalAddress.getPostalCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        return z10 || z11 || z12 || z13 || z14 || z15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean G(Function6 function6, Object p02, Object p12, Object p22, Object p32, Object p42, Object p52) {
        Intrinsics.j(p02, "p0");
        Intrinsics.j(p12, "p1");
        Intrinsics.j(p22, "p2");
        Intrinsics.j(p32, "p3");
        Intrinsics.j(p42, "p4");
        Intrinsics.j(p52, "p5");
        return (Boolean) function6.h(p02, p12, p22, p32, p42, p52);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("Account Address Verification");
        track.v("account");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("Account Address Verification");
        track.v("account");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(Throwable throwable) {
        uw.a.INSTANCE.f(throwable, "delete address failed!!", new Object[0]);
        b bVar = this.networkCallbackListener;
        if (bVar == null) {
            Intrinsics.y("networkCallbackListener");
            bVar = null;
        }
        bVar.c(false);
        bVar.i(com.meijer.mobile.core.networking.exceptions.a.a(throwable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(UpdateConfirmationResponse updateConfirmationResponse) {
        a.Companion companion = uw.a.INSTANCE;
        companion.a("delete address complete", new Object[0]);
        b bVar = this.networkCallbackListener;
        b bVar2 = null;
        if (bVar == null) {
            Intrinsics.y("networkCallbackListener");
            bVar = null;
        }
        bVar.c(false);
        if (updateConfirmationResponse.getIsSuccess()) {
            b bVar3 = this.networkCallbackListener;
            if (bVar3 == null) {
                Intrinsics.y("networkCallbackListener");
            } else {
                bVar2 = bVar3;
            }
            bVar2.h();
            return;
        }
        companion.d("delete address failed: " + updateConfirmationResponse, new Object[0]);
        b bVar4 = this.networkCallbackListener;
        if (bVar4 == null) {
            Intrinsics.y("networkCallbackListener");
            bVar4 = null;
        }
        bVar4.i(RetrofitException.Companion.f(RetrofitException.INSTANCE, EnumC16795a.f159036n, null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(Throwable throwable) {
        uw.a.INSTANCE.f(throwable, "save address failed!!", new Object[0]);
        b bVar = this.networkCallbackListener;
        if (bVar == null) {
            Intrinsics.y("networkCallbackListener");
            bVar = null;
        }
        bVar.c(false);
        bVar.i(com.meijer.mobile.core.networking.exceptions.a.a(throwable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(UpdateConfirmationResponse updateConfirmationResponse) {
        uw.a.INSTANCE.a("save address complete", new Object[0]);
        b bVar = this.networkCallbackListener;
        b bVar2 = null;
        if (bVar == null) {
            Intrinsics.y("networkCallbackListener");
            bVar = null;
        }
        bVar.c(false);
        if (!updateConfirmationResponse.getIsSuccess()) {
            b bVar3 = this.networkCallbackListener;
            if (bVar3 == null) {
                Intrinsics.y("networkCallbackListener");
                bVar3 = null;
            }
            bVar3.i(RetrofitException.Companion.f(RetrofitException.INSTANCE, EnumC16795a.f159036n, null, 2, null));
            return;
        }
        J().E(updateConfirmationResponse.getId());
        b bVar4 = this.networkCallbackListener;
        if (bVar4 == null) {
            Intrinsics.y("networkCallbackListener");
        } else {
            bVar2 = bVar4;
        }
        bVar2.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object T(Throwable th2, Continuation<? super Unit> continuation) {
        b bVar = this.networkCallbackListener;
        b bVar2 = null;
        if (bVar == null) {
            Intrinsics.y("networkCallbackListener");
            bVar = null;
        }
        bVar.c(false);
        uw.a.INSTANCE.d("Vertex API - error with call: " + th2, new Object[0]);
        b bVar3 = this.networkCallbackListener;
        if (bVar3 == null) {
            Intrinsics.y("networkCallbackListener");
            bVar3 = null;
        }
        if (!bVar3.e()) {
            Object objV = V(continuation);
            return objV == IntrinsicsKt.f() ? objV : Unit.f142422a;
        }
        b bVar4 = this.networkCallbackListener;
        if (bVar4 == null) {
            Intrinsics.y("networkCallbackListener");
        } else {
            bVar2 = bVar4;
        }
        bVar2.d();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(PostalAddress postalAddress) {
        b bVar = this.networkCallbackListener;
        b bVar2 = null;
        if (bVar == null) {
            Intrinsics.y("networkCallbackListener");
            bVar = null;
        }
        bVar.c(false);
        J().w(EnumC17262d.f162975f);
        b bVar3 = this.networkCallbackListener;
        if (bVar3 == null) {
            Intrinsics.y("networkCallbackListener");
        } else {
            bVar2 = bVar3;
        }
        bVar2.b(C(postalAddress), B(J()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.reactivex.u a0(q qVar, a aVar, String str, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function0 = new Function0() { // from class: Dn.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return q.j0();
                }
            };
        }
        return qVar.Z(aVar, str, z10, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountAddressState b0(q qVar, String str, a aVar, boolean z10, C15081d c15081d, AccountAddressState oldState) {
        Intrinsics.j(oldState, "oldState");
        AccountAddressState accountAddressStateR = AccountAddressState.f(oldState, null, new Validation(str, null, 2, null), null, null, null, null, null, null, null, qVar.l0(aVar, oldState.l(), z10), qVar.A(), 509, null).r();
        c15081d.onSuccess(Boolean.valueOf(!accountAddressStateR.k().getIsValid()));
        return accountAddressStateR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountAddressState c0(q qVar, String str, a aVar, boolean z10, C15081d c15081d, AccountAddressState oldState) {
        Intrinsics.j(oldState, "oldState");
        AccountAddressState accountAddressStateR = AccountAddressState.f(oldState, null, null, new Validation(str, null, 2, null), null, null, null, null, null, null, qVar.l0(aVar, oldState.l(), z10), qVar.A(), 507, null).r();
        c15081d.onSuccess(Boolean.valueOf(!accountAddressStateR.m().getIsValid()));
        return accountAddressStateR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountAddressState d0(q qVar, String str, a aVar, boolean z10, C15081d c15081d, AccountAddressState oldState) {
        Intrinsics.j(oldState, "oldState");
        AccountAddressState accountAddressStateR = AccountAddressState.f(oldState, null, null, null, new Validation(str, null, 2, null), null, null, null, null, null, qVar.l0(aVar, oldState.l(), z10), qVar.A(), HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE, null).r();
        c15081d.onSuccess(Boolean.valueOf(!accountAddressStateR.o().getIsValid()));
        return accountAddressStateR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountAddressState e0(q qVar, String str, a aVar, boolean z10, C15081d c15081d, AccountAddressState oldState) {
        Intrinsics.j(oldState, "oldState");
        AccountAddressState accountAddressStateR = AccountAddressState.f(oldState, null, null, null, null, new Validation(str, null, 2, null), null, null, null, null, qVar.l0(aVar, oldState.l(), z10), qVar.A(), 495, null).r();
        c15081d.onSuccess(Boolean.valueOf(!accountAddressStateR.g().getIsValid()));
        return accountAddressStateR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountAddressState f0(q qVar, String str, a aVar, boolean z10, C15081d c15081d, AccountAddressState oldState) {
        Intrinsics.j(oldState, "oldState");
        AccountAddressState accountAddressStateR = AccountAddressState.f(oldState, null, null, null, null, null, new Validation(str, null, 2, null), null, null, null, qVar.l0(aVar, oldState.l(), z10), qVar.A(), 479, null).r();
        c15081d.onSuccess(Boolean.valueOf(!accountAddressStateR.h().getIsValid()));
        return accountAddressStateR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountAddressState g0(q qVar, String str, a aVar, boolean z10, C15081d c15081d, AccountAddressState oldState) {
        Intrinsics.j(oldState, "oldState");
        AccountAddressState accountAddressStateR = AccountAddressState.f(oldState, null, null, null, null, null, null, new Validation(str, null, 2, null), null, null, qVar.l0(aVar, oldState.l(), z10), qVar.A(), 447, null).r();
        c15081d.onSuccess(Boolean.valueOf(!accountAddressStateR.j().getIsValid()));
        return accountAddressStateR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountAddressState h0(q qVar, String str, a aVar, boolean z10, C15081d c15081d, AccountAddressState oldState) {
        Intrinsics.j(oldState, "oldState");
        AccountAddressState accountAddressStateR = AccountAddressState.f(oldState, null, null, null, null, null, null, null, new Validation(str, null, 2, null), null, qVar.l0(aVar, oldState.l(), z10), qVar.A(), 383, null).r();
        c15081d.onSuccess(Boolean.valueOf(!accountAddressStateR.p().getIsValid()));
        return accountAddressStateR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountAddressState i0(q qVar, String str, a aVar, boolean z10, C15081d c15081d, AccountAddressState oldState) {
        Intrinsics.j(oldState, "oldState");
        AccountAddressState accountAddressStateR = AccountAddressState.f(oldState, null, null, null, null, null, null, null, null, new Validation(str, null, 2, null), qVar.l0(aVar, oldState.l(), z10), qVar.A(), l3.f92484c, null).r();
        c15081d.onSuccess(Boolean.valueOf(!accountAddressStateR.q().getIsValid()));
        return accountAddressStateR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountAddressState k0(q qVar, String str, a aVar, boolean z10, C15081d c15081d, AccountAddressState oldState) {
        Intrinsics.j(oldState, "oldState");
        AccountAddressState accountAddressStateR = AccountAddressState.f(oldState, new Validation(str, null, 2, null), null, null, null, null, null, null, null, null, qVar.l0(aVar, oldState.l(), z10), qVar.A(), 510, null).r();
        c15081d.onSuccess(Boolean.valueOf(!accountAddressStateR.n().getIsValid()));
        return accountAddressStateR;
    }

    private final Set<a> l0(a field, Set<a> currentHideValidations, boolean shouldHide) {
        if (shouldHide) {
            currentHideValidations.add(field);
            return currentHideValidations;
        }
        currentHideValidations.remove(field);
        return currentHideValidations;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m0(Continuation<? super Unit> continuation) {
        b bVar = this.networkCallbackListener;
        if (bVar == null) {
            Intrinsics.y("networkCallbackListener");
            bVar = null;
        }
        bVar.c(true);
        Object objG = C16644i.g(this.coroutineContext, new h(null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
    }

    public final Object D(Continuation<? super Unit> continuation) {
        b bVar = this.networkCallbackListener;
        if (bVar == null) {
            Intrinsics.y("networkCallbackListener");
            bVar = null;
        }
        bVar.c(true);
        Object objG = C16644i.g(this.coroutineContext, new d(null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
    }

    public final void E() {
        final Function6 function6 = new Function6() { // from class: Dn.i
            @Override // kotlin.jvm.functions.Function6
            public final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return Boolean.valueOf(q.F(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue(), ((Boolean) obj6).booleanValue()));
            }
        };
        Nu.a aVar = this.disposables;
        io.reactivex.u uVarT = io.reactivex.u.t(a0(this, a.f6908b, J().getFirstName(), false, null, 8, null), a0(this, a.f6909c, J().getLastName(), false, null, 8, null), a0(this, a.f6911e, J().getAddressLine1(), false, null, 8, null), a0(this, a.f6913g, J().getCity(), false, null, 8, null), a0(this, a.f6914h, J().getState(), false, null, 8, null), a0(this, a.f6915i, J().getZipCode(), false, null, 8, null), new Pu.k() { // from class: Dn.j
            @Override // Pu.k
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return q.G(function6, obj, obj2, obj3, obj4, obj5, obj6);
            }
        });
        final Function1 function1 = new Function1() { // from class: Dn.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.H(this.f6873a, (Boolean) obj);
            }
        };
        Nu.b bVarN = uVarT.n(new Pu.g() { // from class: Dn.l
            @Override // Pu.g
            public final void accept(Object obj) {
                q.I(function1, obj);
            }
        });
        Intrinsics.i(bVarN, "subscribe(...)");
        C14573a.a(aVar, bVarN);
    }

    public final AccountAddress J() {
        AccountAddress accountAddress = this.accountAddress;
        if (accountAddress != null) {
            return accountAddress;
        }
        Intrinsics.y("accountAddress");
        return null;
    }

    public final io.reactivex.l<AccountAddressState> K() {
        return this.addressState;
    }

    public final AccountAddress L(AccountAddress address) {
        AccountAddress accountAddress;
        if (address == null) {
            long jC = this.userManager.c();
            String strValueOf = String.valueOf(this.userManager.c());
            String strValueOf2 = String.valueOf(this.userManager.c());
            accountAddress = new AccountAddress(0L, jC, null, null, null, null, null, null, EnumC3372e.f6514d, null, 0L, null, null, null, null, true, ZonedDateTime.now(), strValueOf, ZonedDateTime.now(), strValueOf2, 32509, null);
        } else {
            accountAddress = address;
        }
        W(accountAddress);
        return accountAddress;
    }

    public final Object M(SplitAddress splitAddress, boolean z10, Continuation<? super Unit> continuation) {
        String strQ;
        if (z10) {
            this.analyticsEngine.h(C14476c.a("event: address verification: User chose Vertex address suggestion"), new Function1() { // from class: Dn.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q.N((TrackingData) obj);
                }
            });
        } else {
            this.analyticsEngine.h(C14476c.a("event: address verification: User chose original address they entered"), new Function1() { // from class: Dn.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q.O((TrackingData) obj);
                }
            });
        }
        String zip = splitAddress.getZip();
        String strJ1 = (zip == null || (strQ = StringsKt.Q(zip, " ", "", false, 4, null)) == null) ? null : C16981a.CANADIAN_POSTAL_CODE_RAW_REGEX.matcher(strQ).matches() ? StringsKt.J1(strQ, 6) : StringsKt.J1(strQ, 5);
        AccountAddress accountAddressJ = J();
        accountAddressJ.t(splitAddress.getAddressLine1());
        accountAddressJ.v(splitAddress.getAddressLine2());
        accountAddressJ.x(splitAddress.getCity());
        accountAddressJ.L(splitAddress.getState());
        accountAddressJ.O(strJ1);
        Object objV = V(continuation);
        return objV == IntrinsicsKt.f() ? objV : Unit.f142422a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r0.e() != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
        /*
            r3 = this;
            Dn.q$b r0 = r3.networkCallbackListener
            java.lang.String r1 = "networkCallbackListener"
            r2 = 0
            if (r0 != 0) goto Lb
            kotlin.jvm.internal.Intrinsics.y(r1)
            r0 = r2
        Lb:
            boolean r0 = r0.e()
            if (r0 == 0) goto L3d
            Dn.q$b r0 = r3.networkCallbackListener
            if (r0 != 0) goto L19
            kotlin.jvm.internal.Intrinsics.y(r1)
            r0 = r2
        L19:
            boolean r0 = r0.f()
            if (r0 == 0) goto L2e
            Dn.q$b r0 = r3.networkCallbackListener
            if (r0 != 0) goto L27
            kotlin.jvm.internal.Intrinsics.y(r1)
            r0 = r2
        L27:
            boolean r0 = r0.e()
            if (r0 == 0) goto L2e
            goto L3d
        L2e:
            Dn.q$b r4 = r3.networkCallbackListener
            if (r4 != 0) goto L36
            kotlin.jvm.internal.Intrinsics.y(r1)
            goto L37
        L36:
            r2 = r4
        L37:
            r2.j()
            kotlin.Unit r4 = kotlin.Unit.f142422a
            return r4
        L3d:
            Dn.q$b r0 = r3.networkCallbackListener
            if (r0 != 0) goto L45
            kotlin.jvm.internal.Intrinsics.y(r1)
            r0 = r2
        L45:
            r1 = 1
            r0.c(r1)
            Dh.a r0 = r3.J()
            j$.time.ZonedDateTime r1 = j$.time.ZonedDateTime.now()
            r0.M(r1)
            kotlin.coroutines.CoroutineContext r0 = r3.coroutineContext
            Dn.q$f r1 = new Dn.q$f
            r1.<init>(r2)
            java.lang.Object r4 = qv.C16644i.g(r0, r1, r4)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r4 != r0) goto L66
            return r4
        L66:
            kotlin.Unit r4 = kotlin.Unit.f142422a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Dn.q.V(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void W(AccountAddress accountAddress) {
        Intrinsics.j(accountAddress, "<set-?>");
        this.accountAddress = accountAddress;
    }

    public final void Y(b listener) {
        Intrinsics.j(listener, "listener");
        this.networkCallbackListener = listener;
    }

    public final io.reactivex.u<Boolean> Z(final a field, final String currentFieldValue, final boolean shouldHide, Function0<Unit> handleHasChanged) {
        Intrinsics.j(handleHasChanged, "handleHasChanged");
        final C15081d c15081dX = C15081d.x();
        Intrinsics.i(c15081dX, "create(...)");
        switch (field == null ? -1 : c.$EnumSwitchMapping$0[field.ordinal()]) {
            case -1:
                Unit unit = Unit.f142422a;
                return c15081dX;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                if (!Intrinsics.e(J().getName(), currentFieldValue)) {
                    handleHasChanged.invoke();
                }
                J().G(currentFieldValue);
                this.addressModelStore.a(new Function1() { // from class: Dn.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.k0(this.f6875a, currentFieldValue, field, shouldHide, c15081dX, (AccountAddressState) obj);
                    }
                });
                return c15081dX;
            case 2:
                if (!Intrinsics.e(J().getFirstName(), currentFieldValue)) {
                    handleHasChanged.invoke();
                }
                J().C(currentFieldValue);
                this.addressModelStore.a(new Function1() { // from class: Dn.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.b0(this.f6880a, currentFieldValue, field, shouldHide, c15081dX, (AccountAddressState) obj);
                    }
                });
                return c15081dX;
            case 3:
                if (!Intrinsics.e(J().getLastName(), currentFieldValue)) {
                    handleHasChanged.invoke();
                }
                J().F(currentFieldValue);
                this.addressModelStore.a(new Function1() { // from class: Dn.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.c0(this.f6885a, currentFieldValue, field, shouldHide, c15081dX, (AccountAddressState) obj);
                    }
                });
                return c15081dX;
            case 4:
                if (!Intrinsics.e(J().getPhoneNumber(), currentFieldValue)) {
                    handleHasChanged.invoke();
                }
                J().I(currentFieldValue);
                this.addressModelStore.a(new Function1() { // from class: Dn.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.d0(this.f6890a, currentFieldValue, field, shouldHide, c15081dX, (AccountAddressState) obj);
                    }
                });
                return c15081dX;
            case 5:
                if (!Intrinsics.e(J().getAddressLine1(), currentFieldValue)) {
                    handleHasChanged.invoke();
                }
                J().t(currentFieldValue);
                this.addressModelStore.a(new Function1() { // from class: Dn.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.e0(this.f6847a, currentFieldValue, field, shouldHide, c15081dX, (AccountAddressState) obj);
                    }
                });
                return c15081dX;
            case 6:
                if (!Intrinsics.e(J().getAddressLine2(), currentFieldValue)) {
                    handleHasChanged.invoke();
                }
                J().v(currentFieldValue);
                this.addressModelStore.a(new Function1() { // from class: Dn.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.f0(this.f6852a, currentFieldValue, field, shouldHide, c15081dX, (AccountAddressState) obj);
                    }
                });
                return c15081dX;
            case 7:
                if (!Intrinsics.e(J().getCity(), currentFieldValue)) {
                    handleHasChanged.invoke();
                }
                J().x(currentFieldValue);
                this.addressModelStore.a(new Function1() { // from class: Dn.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.g0(this.f6857a, currentFieldValue, field, shouldHide, c15081dX, (AccountAddressState) obj);
                    }
                });
                return c15081dX;
            case 8:
                if (!Intrinsics.e(J().getState(), currentFieldValue)) {
                    handleHasChanged.invoke();
                }
                J().L(currentFieldValue);
                this.addressModelStore.a(new Function1() { // from class: Dn.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.h0(this.f6862a, currentFieldValue, field, shouldHide, c15081dX, (AccountAddressState) obj);
                    }
                });
                return c15081dX;
            case 9:
                if (!Intrinsics.e(J().getZipCode(), currentFieldValue)) {
                    handleHasChanged.invoke();
                }
                J().O(currentFieldValue);
                this.addressModelStore.a(new Function1() { // from class: Dn.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.i0(this.f6867a, currentFieldValue, field, shouldHide, c15081dX, (AccountAddressState) obj);
                    }
                });
                return c15081dX;
        }
    }

    public final CustomerAddress z() {
        String firstName = J().getFirstName();
        String str = firstName == null ? "" : firstName;
        String lastName = J().getLastName();
        String str2 = lastName == null ? "" : lastName;
        String addressLine1 = J().getAddressLine1();
        String str3 = addressLine1 == null ? "" : addressLine1;
        String city = J().getCity();
        String str4 = city == null ? "" : city;
        String state = J().getState();
        Region region = new Region(state == null ? "" : state, null, null, null, 14, null);
        String zipCode = J().getZipCode();
        return new CustomerAddress(null, null, null, null, str, str2, null, str3, null, str4, region, zipCode == null ? "" : zipCode, new Country("US", null, 2, null), null, null, false, false, false, false, 516431, null);
    }

    private final boolean A() {
        boolean z10;
        String lastName;
        String addressLine1;
        String city;
        String state;
        String zipCode;
        String firstName = J().getFirstName();
        if (firstName != null && !StringsKt.r0(firstName) && (lastName = J().getLastName()) != null && !StringsKt.r0(lastName) && (addressLine1 = J().getAddressLine1()) != null && !StringsKt.r0(addressLine1) && (city = J().getCity()) != null && !StringsKt.r0(city) && (state = J().getState()) != null && !StringsKt.r0(state) && (zipCode = J().getZipCode()) != null && !StringsKt.r0(zipCode)) {
            z10 = false;
        } else {
            z10 = true;
        }
        return !z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(q qVar, Boolean bool) throws InterruptedException {
        if (!bool.booleanValue()) {
            C16644i.e(qVar.handler, qVar.new e(null));
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public final void X(boolean isPrimary) {
        J().J(isPrimary);
    }
}
