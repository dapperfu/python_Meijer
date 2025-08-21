package En;

import Cn.SplitAddress;
import Eh.AccountAddress;
import Eh.EnumC3241e;
import Eh.UpdateConfirmationResponse;
import Ik.Validation;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.meijer.activity.settings.addresses.AccountAddressState;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import di.Country;
import di.CustomerAddress;
import di.Region;
import dv.C13731a;
import fv.C14271d;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import j$.time.ZonedDateTime;
import java.util.Set;
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
import mv.C0;
import mv.C15800f0;
import mv.C15805i;
import mv.F0;
import mv.InterfaceC15769A;
import mv.InterfaceC15780L;
import mv.InterfaceC15783O;
import qw.a;
import responses.PostalAddress;
import sk.EnumC17080a;
import tk.C17269a;
import vh.EnumC17676d;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0002NLB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\"\u0010#J\u0018\u0010&\u001a\u00020\u00162\u0006\u0010%\u001a\u00020$H\u0082@¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00162\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b.\u0010+J\u0017\u0010/\u001a\u00020\u00162\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b/\u0010-J\u0017\u00101\u001a\u00020\u001e2\b\u00100\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\u00162\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J \u00109\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020\u00162\u0006\u0010;\u001a\u00020\u0010¢\u0006\u0004\b<\u0010=J?\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00100B2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00160@¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\u0016¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u0016H\u0086@¢\u0006\u0004\bG\u0010\u0018J\u0010\u0010H\u001a\u00020\u0016H\u0086@¢\u0006\u0004\bH\u0010\u0018J\r\u0010J\u001a\u00020I¢\u0006\u0004\bJ\u0010KR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020U0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u001d\u0010^\u001a\b\u0012\u0004\u0012\u00020U0Y8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0016\u0010g\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010v¨\u0006x"}, d2 = {"LEn/q;", "", "Lhi/a;", "analyticsEngine", "Lyo/k;", "userManager", "LUi/d;", "addressRepository", "LCh/a;", "accountAddressesRepository", "<init>", "(Lhi/a;Lyo/k;LUi/d;LCh/a;)V", "LEn/q$a;", "field", "", "currentHideValidations", "", "shouldHide", "l0", "(LEn/q$a;Ljava/util/Set;Z)Ljava/util/Set;", "A", "()Z", "", "m0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lresponses/PostalAddress;", "postalAddress", "LCn/e;", "C", "(Lresponses/PostalAddress;)LCn/e;", "LEh/a;", "accountAddress", "B", "(LEh/a;)LCn/e;", "U", "(Lresponses/PostalAddress;)V", "", "throwable", "T", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LEh/D;", "updateConfirmationResponse", "S", "(LEh/D;)V", "R", "(Ljava/lang/Throwable;)V", "Q", "P", PlaceTypes.ADDRESS, "L", "(LEh/a;)LEh/a;", "LEn/q$b;", "listener", "Y", "(LEn/q$b;)V", "splitAddress", "isSuggested", "M", "(LCn/e;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isPrimary", "X", "(Z)V", "", "currentFieldValue", "Lkotlin/Function0;", "handleHasChanged", "Lio/reactivex/u;", "Z", "(LEn/q$a;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)Lio/reactivex/u;", "E", "()V", "V", "D", "Ldi/c;", "z", "()Ldi/c;", "a", "Lhi/a;", "b", "Lyo/k;", "c", "LUi/d;", "d", "LCh/a;", "LEk/n;", "Lcom/meijer/mobile/meijer/activity/settings/addresses/a;", "e", "LEk/n;", "addressModelStore", "Lio/reactivex/l;", "f", "Lio/reactivex/l;", "K", "()Lio/reactivex/l;", "addressState", "g", "LEh/a;", "J", "()LEh/a;", "W", "(LEh/a;)V", "h", "LEn/q$b;", "networkCallbackListener", "LJu/a;", "i", "LJu/a;", "disposables", "Lmv/C0;", "j", "Lmv/C0;", "job", "Lmv/L;", "k", "Lmv/L;", "handler", "Lkotlin/coroutines/CoroutineContext;", "l", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Ui.d addressRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Ch.a accountAddressesRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Ek.n<AccountAddressState> addressModelStore;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final io.reactivex.l<AccountAddressState> addressState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public AccountAddress accountAddress;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private b networkCallbackListener;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final C0 job;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15780L handler;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext coroutineContext;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"LEn/q$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7933a = new a("ADDRESS_NICK_NAME", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f7934b = new a("FIRST_NAME", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f7935c = new a("LAST_NAME", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f7936d = new a("PHONE_NUMBER", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final a f7937e = new a("ADDRESS_LINE_ONE", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final a f7938f = new a("ADDRESS_LINE_TWO", 5);

        /* renamed from: g, reason: collision with root package name */
        public static final a f7939g = new a("CITY", 6);

        /* renamed from: h, reason: collision with root package name */
        public static final a f7940h = new a("STATE", 7);

        /* renamed from: i, reason: collision with root package name */
        public static final a f7941i = new a("ZIP_CODE", 8);

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ a[] f7942j;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f7943k;

        public static EnumEntries<a> b() {
            return f7943k;
        }

        static {
            a[] aVarArrA = a();
            f7942j = aVarArrA;
            f7943k = EnumEntriesKt.a(aVarArrA);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f7933a, f7934b, f7935c, f7936d, f7937e, f7938f, f7939g, f7940h, f7941i};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f7942j.clone();
        }

        private a(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"LEn/q$b;", "", "", "isInProgress", "", "b", "(Z)V", "LCn/e;", "suggestedAddress", "originalAddress", "g", "(LCn/e;LCn/e;)V", "c", "()V", "k", "i", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "retrofitException", "j", "(Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;)V", "d", "()Z", "e", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        void b(boolean isInProgress);

        void c();

        boolean d();

        boolean e();

        void g(SplitAddress suggestedAddress, SplitAddress originalAddress);

        void i();

        void j(RetrofitException retrofitException);

        void k();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "Lkotlin/Result;", "LEh/D;", "<anonymous>", "(Lmv/O;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AccountAddressDelegate$deleteAddress$2", f = "AccountAddressDelegate.kt", l = {556}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Result<? extends UpdateConfirmationResponse>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f7944a;

        /* renamed from: b, reason: collision with root package name */
        int f7945b;

        /* renamed from: c, reason: collision with root package name */
        int f7946c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f7947d;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Result<? extends UpdateConfirmationResponse>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super Result<UpdateConfirmationResponse>>) continuation);
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = q.this.new d(continuation);
            dVar.f7947d = obj;
            return dVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super Result<UpdateConfirmationResponse>> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r7.f7946c
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r7.f7944a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r7.f7947d
                mv.O r0 = (mv.InterfaceC15783O) r0
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
                java.lang.Object r8 = r7.f7947d
                mv.O r8 = (mv.InterfaceC15783O) r8
                En.q r1 = En.q.this
                kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L51
                Ch.a r3 = En.q.q(r1)     // Catch: java.lang.Throwable -> L51
                Eh.a r1 = r1.J()     // Catch: java.lang.Throwable -> L51
                long r4 = r1.getId()     // Catch: java.lang.Throwable -> L51
                r7.f7947d = r8     // Catch: java.lang.Throwable -> L51
                r7.f7944a = r8     // Catch: java.lang.Throwable -> L51
                r1 = 0
                r7.f7945b = r1     // Catch: java.lang.Throwable -> L51
                r7.f7946c = r2     // Catch: java.lang.Throwable -> L51
                java.lang.Object r1 = r3.b(r4, r7)     // Catch: java.lang.Throwable -> L51
                if (r1 != r0) goto L48
                return r0
            L48:
                r0 = r8
                r8 = r1
            L4a:
                Eh.D r8 = (Eh.UpdateConfirmationResponse) r8     // Catch: java.lang.Throwable -> L17
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
                En.q r1 = En.q.this
                boolean r2 = kotlin.Result.h(r8)
                if (r2 == 0) goto L6d
                r2 = r8
                Eh.D r2 = (Eh.UpdateConfirmationResponse) r2
                En.q.t(r1, r2)
            L6d:
                En.q r1 = En.q.this
                java.lang.Throwable r2 = kotlin.Result.e(r8)
                if (r2 == 0) goto L85
                kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
                mv.E0.i(r0)
                boolean r0 = r2 instanceof java.lang.Error
                if (r0 != 0) goto L84
                En.q.s(r1, r2)
                goto L85
            L84:
                throw r2
            L85:
                kotlin.Result r8 = kotlin.Result.a(r8)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: En.q.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AccountAddressDelegate$finalFieldChecksBeforeNetworkCalls$1$1", f = "AccountAddressDelegate.kt", l = {425}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f7949a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return q.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f7949a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                q qVar = q.this;
                this.f7949a = 1;
                if (qVar.m0(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "Lkotlin/Result;", "LEh/D;", "<anonymous>", "(Lmv/O;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AccountAddressDelegate$saveAddress$2", f = "AccountAddressDelegate.kt", l = {460}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Result<? extends UpdateConfirmationResponse>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f7951a;

        /* renamed from: b, reason: collision with root package name */
        int f7952b;

        /* renamed from: c, reason: collision with root package name */
        int f7953c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f7954d;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Result<? extends UpdateConfirmationResponse>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super Result<UpdateConfirmationResponse>>) continuation);
        }

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = q.this.new f(continuation);
            fVar.f7954d = obj;
            return fVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super Result<UpdateConfirmationResponse>> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r6.f7953c
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r6.f7951a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r6.f7954d
                mv.O r0 = (mv.InterfaceC15783O) r0
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
                java.lang.Object r7 = r6.f7954d
                mv.O r7 = (mv.InterfaceC15783O) r7
                En.q r1 = En.q.this
                kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L4d
                Ch.a r3 = En.q.q(r1)     // Catch: java.lang.Throwable -> L4d
                Eh.a r1 = r1.J()     // Catch: java.lang.Throwable -> L4d
                r6.f7954d = r7     // Catch: java.lang.Throwable -> L4d
                r6.f7951a = r7     // Catch: java.lang.Throwable -> L4d
                r4 = 0
                r6.f7952b = r4     // Catch: java.lang.Throwable -> L4d
                r6.f7953c = r2     // Catch: java.lang.Throwable -> L4d
                java.lang.Object r1 = r3.e(r1, r6)     // Catch: java.lang.Throwable -> L4d
                if (r1 != r0) goto L44
                return r0
            L44:
                r0 = r7
                r7 = r1
            L46:
                Eh.D r7 = (Eh.UpdateConfirmationResponse) r7     // Catch: java.lang.Throwable -> L17
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
                En.q r1 = En.q.this
                boolean r2 = kotlin.Result.h(r7)
                if (r2 == 0) goto L69
                r2 = r7
                Eh.D r2 = (Eh.UpdateConfirmationResponse) r2
                En.q.v(r1, r2)
            L69:
                En.q r1 = En.q.this
                java.lang.Throwable r2 = kotlin.Result.e(r7)
                if (r2 == 0) goto L81
                kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
                mv.E0.i(r0)
                boolean r0 = r2 instanceof java.lang.Error
                if (r0 != 0) goto L80
                En.q.u(r1, r2)
                goto L81
            L80:
                throw r2
            L81:
                kotlin.Result r7 = kotlin.Result.a(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: En.q.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"En/q$g", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lmv/L;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "m0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class g extends AbstractCoroutineContextElement implements InterfaceC15780L {
        @Override // mv.InterfaceC15780L
        public void m0(CoroutineContext context, Throwable exception) {
            qw.a.INSTANCE.f(exception, "Unhandled exception", new Object[0]);
        }

        public g(InterfaceC15780L.Companion companion) {
            super(companion);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "Lkotlin/Result;", "Lresponses/PostalAddress;", "<anonymous>", "(Lmv/O;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AccountAddressDelegate$verifyAddressWithVertex$2", f = "AccountAddressDelegate.kt", l = {439, 444, 447}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Result<? extends PostalAddress>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f7956a;

        /* renamed from: b, reason: collision with root package name */
        Object f7957b;

        /* renamed from: c, reason: collision with root package name */
        int f7958c;

        /* renamed from: d, reason: collision with root package name */
        int f7959d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f7960e;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Result<? extends PostalAddress>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super Result<PostalAddress>>) continuation);
        }

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = q.this.new h(continuation);
            hVar.f7960e = obj;
            return hVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super Result<PostalAddress>> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
        /* JADX WARN: Type inference failed for: r1v14, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r10.f7959d
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L46
                if (r1 == r4) goto L38
                if (r1 == r3) goto L29
                if (r1 != r2) goto L21
                java.lang.Object r0 = r10.f7957b
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                java.lang.Object r0 = r10.f7956a
                java.lang.Object r1 = r10.f7960e
                mv.O r1 = (mv.InterfaceC15783O) r1
                kotlin.ResultKt.b(r11)
                goto Lc3
            L21:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L29:
                java.lang.Object r1 = r10.f7957b
                responses.PostalAddress r1 = (responses.PostalAddress) r1
                java.lang.Object r1 = r10.f7956a
                java.lang.Object r3 = r10.f7960e
                mv.O r3 = (mv.InterfaceC15783O) r3
                kotlin.ResultKt.b(r11)
                goto La8
            L38:
                java.lang.Object r1 = r10.f7956a
                mv.O r1 = (mv.InterfaceC15783O) r1
                java.lang.Object r1 = r10.f7960e
                mv.O r1 = (mv.InterfaceC15783O) r1
                kotlin.ResultKt.b(r11)     // Catch: java.lang.Throwable -> L44
                goto L69
            L44:
                r11 = move-exception
                goto L73
            L46:
                kotlin.ResultKt.b(r11)
                java.lang.Object r11 = r10.f7960e
                r1 = r11
                mv.O r1 = (mv.InterfaceC15783O) r1
                En.q r11 = En.q.this
                kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L44
                Ui.d r6 = En.q.r(r11)     // Catch: java.lang.Throwable -> L44
                Eh.a r11 = r11.J()     // Catch: java.lang.Throwable -> L44
                r10.f7960e = r1     // Catch: java.lang.Throwable -> L44
                r10.f7956a = r1     // Catch: java.lang.Throwable -> L44
                r10.f7958c = r5     // Catch: java.lang.Throwable -> L44
                r10.f7959d = r4     // Catch: java.lang.Throwable -> L44
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
                En.q r4 = En.q.this
                boolean r6 = kotlin.Result.h(r1)
                if (r6 == 0) goto La9
                r6 = r1
                responses.PostalAddress r6 = (responses.PostalAddress) r6
                if (r6 == 0) goto L8f
                En.q.x(r4, r6)
                goto La9
            L8f:
                java.lang.NullPointerException r7 = new java.lang.NullPointerException
                java.lang.String r8 = "No address match found"
                r7.<init>(r8)
                r10.f7960e = r11
                r10.f7956a = r1
                r10.f7957b = r6
                r10.f7958c = r5
                r10.f7959d = r3
                java.lang.Object r3 = En.q.w(r4, r7, r10)
                if (r3 != r0) goto La7
                goto Lc1
            La7:
                r3 = r11
            La8:
                r11 = r3
            La9:
                En.q r3 = En.q.this
                java.lang.Throwable r4 = kotlin.Result.e(r1)
                if (r4 == 0) goto Lc4
                r10.f7960e = r11
                r10.f7956a = r1
                r10.f7957b = r4
                r10.f7958c = r5
                r10.f7959d = r2
                java.lang.Object r11 = En.q.w(r3, r4, r10)
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
            throw new UnsupportedOperationException("Method not decompiled: En.q.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f7933a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f7934b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f7935c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f7936d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.f7937e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.f7938f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.f7939g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.f7940h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[a.f7941i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public q(InterfaceC14523a analyticsEngine, yo.k userManager, Ui.d addressRepository, Ch.a accountAddressesRepository) {
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(addressRepository, "addressRepository");
        Intrinsics.j(accountAddressesRepository, "accountAddressesRepository");
        this.analyticsEngine = analyticsEngine;
        this.userManager = userManager;
        this.addressRepository = addressRepository;
        this.accountAddressesRepository = accountAddressesRepository;
        Ek.n<AccountAddressState> nVar = new Ek.n<>(new AccountAddressState(null, null, null, null, null, null, null, null, null, null, false, 2047, null));
        this.addressModelStore = nVar;
        this.addressState = nVar.t();
        this.disposables = new Ju.a();
        InterfaceC15769A interfaceC15769AB = F0.b(null, 1, null);
        this.job = interfaceC15769AB;
        g gVar = new g(InterfaceC15780L.INSTANCE);
        this.handler = gVar;
        this.coroutineContext = interfaceC15769AB.n0(gVar).n0(C15800f0.b());
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
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("Account Address Verification");
        track.v("account");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(Throwable throwable) {
        qw.a.INSTANCE.f(throwable, "delete address failed!!", new Object[0]);
        b bVar = this.networkCallbackListener;
        if (bVar == null) {
            Intrinsics.x("networkCallbackListener");
            bVar = null;
        }
        bVar.b(false);
        bVar.j(com.meijer.mobile.core.networking.exceptions.a.a(throwable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(UpdateConfirmationResponse updateConfirmationResponse) {
        a.Companion companion = qw.a.INSTANCE;
        companion.a("delete address complete", new Object[0]);
        b bVar = this.networkCallbackListener;
        b bVar2 = null;
        if (bVar == null) {
            Intrinsics.x("networkCallbackListener");
            bVar = null;
        }
        bVar.b(false);
        if (updateConfirmationResponse.getIsSuccess()) {
            b bVar3 = this.networkCallbackListener;
            if (bVar3 == null) {
                Intrinsics.x("networkCallbackListener");
            } else {
                bVar2 = bVar3;
            }
            bVar2.i();
            return;
        }
        companion.d("delete address failed: " + updateConfirmationResponse, new Object[0]);
        b bVar4 = this.networkCallbackListener;
        if (bVar4 == null) {
            Intrinsics.x("networkCallbackListener");
            bVar4 = null;
        }
        bVar4.j(RetrofitException.Companion.f(RetrofitException.INSTANCE, EnumC17080a.f160812n, null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(Throwable throwable) {
        qw.a.INSTANCE.f(throwable, "save address failed!!", new Object[0]);
        b bVar = this.networkCallbackListener;
        if (bVar == null) {
            Intrinsics.x("networkCallbackListener");
            bVar = null;
        }
        bVar.b(false);
        bVar.j(com.meijer.mobile.core.networking.exceptions.a.a(throwable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(UpdateConfirmationResponse updateConfirmationResponse) {
        qw.a.INSTANCE.a("save address complete", new Object[0]);
        b bVar = this.networkCallbackListener;
        b bVar2 = null;
        if (bVar == null) {
            Intrinsics.x("networkCallbackListener");
            bVar = null;
        }
        bVar.b(false);
        if (!updateConfirmationResponse.getIsSuccess()) {
            b bVar3 = this.networkCallbackListener;
            if (bVar3 == null) {
                Intrinsics.x("networkCallbackListener");
                bVar3 = null;
            }
            bVar3.j(RetrofitException.Companion.f(RetrofitException.INSTANCE, EnumC17080a.f160812n, null, 2, null));
            return;
        }
        J().E(updateConfirmationResponse.getId());
        b bVar4 = this.networkCallbackListener;
        if (bVar4 == null) {
            Intrinsics.x("networkCallbackListener");
        } else {
            bVar2 = bVar4;
        }
        bVar2.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object T(Throwable th2, Continuation<? super Unit> continuation) {
        b bVar = this.networkCallbackListener;
        b bVar2 = null;
        if (bVar == null) {
            Intrinsics.x("networkCallbackListener");
            bVar = null;
        }
        bVar.b(false);
        qw.a.INSTANCE.d("Vertex API - error with call: " + th2, new Object[0]);
        b bVar3 = this.networkCallbackListener;
        if (bVar3 == null) {
            Intrinsics.x("networkCallbackListener");
            bVar3 = null;
        }
        if (!bVar3.d()) {
            Object objV = V(continuation);
            return objV == IntrinsicsKt.f() ? objV : Unit.f143329a;
        }
        b bVar4 = this.networkCallbackListener;
        if (bVar4 == null) {
            Intrinsics.x("networkCallbackListener");
        } else {
            bVar2 = bVar4;
        }
        bVar2.c();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(PostalAddress postalAddress) {
        b bVar = this.networkCallbackListener;
        b bVar2 = null;
        if (bVar == null) {
            Intrinsics.x("networkCallbackListener");
            bVar = null;
        }
        bVar.b(false);
        J().w(EnumC17676d.f165876f);
        b bVar3 = this.networkCallbackListener;
        if (bVar3 == null) {
            Intrinsics.x("networkCallbackListener");
        } else {
            bVar2 = bVar3;
        }
        bVar2.g(C(postalAddress), B(J()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.reactivex.u a0(q qVar, a aVar, String str, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function0 = new Function0() { // from class: En.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return q.j0();
                }
            };
        }
        return qVar.Z(aVar, str, z10, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountAddressState b0(q qVar, String str, a aVar, boolean z10, C14271d c14271d, AccountAddressState oldState) {
        Intrinsics.j(oldState, "oldState");
        AccountAddressState accountAddressStateR = AccountAddressState.f(oldState, null, new Validation(str, null, 2, null), null, null, null, null, null, null, null, qVar.l0(aVar, oldState.l(), z10), qVar.A(), 509, null).r();
        c14271d.onSuccess(Boolean.valueOf(!accountAddressStateR.k().getIsValid()));
        return accountAddressStateR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountAddressState c0(q qVar, String str, a aVar, boolean z10, C14271d c14271d, AccountAddressState oldState) {
        Intrinsics.j(oldState, "oldState");
        AccountAddressState accountAddressStateR = AccountAddressState.f(oldState, null, null, new Validation(str, null, 2, null), null, null, null, null, null, null, qVar.l0(aVar, oldState.l(), z10), qVar.A(), 507, null).r();
        c14271d.onSuccess(Boolean.valueOf(!accountAddressStateR.m().getIsValid()));
        return accountAddressStateR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountAddressState d0(q qVar, String str, a aVar, boolean z10, C14271d c14271d, AccountAddressState oldState) {
        Intrinsics.j(oldState, "oldState");
        AccountAddressState accountAddressStateR = AccountAddressState.f(oldState, null, null, null, new Validation(str, null, 2, null), null, null, null, null, null, qVar.l0(aVar, oldState.l(), z10), qVar.A(), HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE, null).r();
        c14271d.onSuccess(Boolean.valueOf(!accountAddressStateR.o().getIsValid()));
        return accountAddressStateR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountAddressState e0(q qVar, String str, a aVar, boolean z10, C14271d c14271d, AccountAddressState oldState) {
        Intrinsics.j(oldState, "oldState");
        AccountAddressState accountAddressStateR = AccountAddressState.f(oldState, null, null, null, null, new Validation(str, null, 2, null), null, null, null, null, qVar.l0(aVar, oldState.l(), z10), qVar.A(), 495, null).r();
        c14271d.onSuccess(Boolean.valueOf(!accountAddressStateR.g().getIsValid()));
        return accountAddressStateR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountAddressState f0(q qVar, String str, a aVar, boolean z10, C14271d c14271d, AccountAddressState oldState) {
        Intrinsics.j(oldState, "oldState");
        AccountAddressState accountAddressStateR = AccountAddressState.f(oldState, null, null, null, null, null, new Validation(str, null, 2, null), null, null, null, qVar.l0(aVar, oldState.l(), z10), qVar.A(), 479, null).r();
        c14271d.onSuccess(Boolean.valueOf(!accountAddressStateR.h().getIsValid()));
        return accountAddressStateR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountAddressState g0(q qVar, String str, a aVar, boolean z10, C14271d c14271d, AccountAddressState oldState) {
        Intrinsics.j(oldState, "oldState");
        AccountAddressState accountAddressStateR = AccountAddressState.f(oldState, null, null, null, null, null, null, new Validation(str, null, 2, null), null, null, qVar.l0(aVar, oldState.l(), z10), qVar.A(), 447, null).r();
        c14271d.onSuccess(Boolean.valueOf(!accountAddressStateR.j().getIsValid()));
        return accountAddressStateR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountAddressState h0(q qVar, String str, a aVar, boolean z10, C14271d c14271d, AccountAddressState oldState) {
        Intrinsics.j(oldState, "oldState");
        AccountAddressState accountAddressStateR = AccountAddressState.f(oldState, null, null, null, null, null, null, null, new Validation(str, null, 2, null), null, qVar.l0(aVar, oldState.l(), z10), qVar.A(), 383, null).r();
        c14271d.onSuccess(Boolean.valueOf(!accountAddressStateR.p().getIsValid()));
        return accountAddressStateR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountAddressState i0(q qVar, String str, a aVar, boolean z10, C14271d c14271d, AccountAddressState oldState) {
        Intrinsics.j(oldState, "oldState");
        AccountAddressState accountAddressStateR = AccountAddressState.f(oldState, null, null, null, null, null, null, null, null, new Validation(str, null, 2, null), qVar.l0(aVar, oldState.l(), z10), qVar.A(), l3.f93323c, null).r();
        c14271d.onSuccess(Boolean.valueOf(!accountAddressStateR.q().getIsValid()));
        return accountAddressStateR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountAddressState k0(q qVar, String str, a aVar, boolean z10, C14271d c14271d, AccountAddressState oldState) {
        Intrinsics.j(oldState, "oldState");
        AccountAddressState accountAddressStateR = AccountAddressState.f(oldState, new Validation(str, null, 2, null), null, null, null, null, null, null, null, null, qVar.l0(aVar, oldState.l(), z10), qVar.A(), 510, null).r();
        c14271d.onSuccess(Boolean.valueOf(!accountAddressStateR.n().getIsValid()));
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
            Intrinsics.x("networkCallbackListener");
            bVar = null;
        }
        bVar.b(true);
        Object objG = C15805i.g(this.coroutineContext, new h(null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
    }

    public final Object D(Continuation<? super Unit> continuation) {
        b bVar = this.networkCallbackListener;
        if (bVar == null) {
            Intrinsics.x("networkCallbackListener");
            bVar = null;
        }
        bVar.b(true);
        Object objG = C15805i.g(this.coroutineContext, new d(null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
    }

    public final void E() {
        final Function6 function6 = new Function6() { // from class: En.i
            @Override // kotlin.jvm.functions.Function6
            public final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return Boolean.valueOf(q.F(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue(), ((Boolean) obj6).booleanValue()));
            }
        };
        Ju.a aVar = this.disposables;
        io.reactivex.u uVarT = io.reactivex.u.t(a0(this, a.f7934b, J().getFirstName(), false, null, 8, null), a0(this, a.f7935c, J().getLastName(), false, null, 8, null), a0(this, a.f7937e, J().getAddressLine1(), false, null, 8, null), a0(this, a.f7939g, J().getCity(), false, null, 8, null), a0(this, a.f7940h, J().getState(), false, null, 8, null), a0(this, a.f7941i, J().getZipCode(), false, null, 8, null), new Lu.k() { // from class: En.j
            @Override // Lu.k
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return q.G(function6, obj, obj2, obj3, obj4, obj5, obj6);
            }
        });
        final Function1 function1 = new Function1() { // from class: En.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.H(this.f7899a, (Boolean) obj);
            }
        };
        Ju.b bVarN = uVarT.n(new Lu.g() { // from class: En.l
            @Override // Lu.g
            public final void accept(Object obj) {
                q.I(function1, obj);
            }
        });
        Intrinsics.i(bVarN, "subscribe(...)");
        C13731a.a(aVar, bVarN);
    }

    public final AccountAddress J() {
        AccountAddress accountAddress = this.accountAddress;
        if (accountAddress != null) {
            return accountAddress;
        }
        Intrinsics.x("accountAddress");
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
            accountAddress = new AccountAddress(0L, jC, null, null, null, null, null, null, EnumC3241e.f7540d, null, 0L, null, null, null, null, true, ZonedDateTime.now(), strValueOf, ZonedDateTime.now(), strValueOf2, 32509, null);
        } else {
            accountAddress = address;
        }
        W(accountAddress);
        return accountAddress;
    }

    public final Object M(SplitAddress splitAddress, boolean z10, Continuation<? super Unit> continuation) {
        String strQ;
        if (z10) {
            this.analyticsEngine.b(C14756c.a("event: address verification: User chose Vertex address suggestion"), new Function1() { // from class: En.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q.N((TrackingData) obj);
                }
            });
        } else {
            this.analyticsEngine.b(C14756c.a("event: address verification: User chose original address they entered"), new Function1() { // from class: En.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q.O((TrackingData) obj);
                }
            });
        }
        String zip = splitAddress.getZip();
        String strN1 = (zip == null || (strQ = StringsKt.Q(zip, " ", "", false, 4, null)) == null) ? null : C17269a.CANADIAN_POSTAL_CODE_RAW_REGEX.matcher(strQ).matches() ? StringsKt.N1(strQ, 6) : StringsKt.N1(strQ, 5);
        AccountAddress accountAddressJ = J();
        accountAddressJ.t(splitAddress.getAddressLine1());
        accountAddressJ.v(splitAddress.getAddressLine2());
        accountAddressJ.x(splitAddress.getCity());
        accountAddressJ.L(splitAddress.getState());
        accountAddressJ.O(strN1);
        Object objV = V(continuation);
        return objV == IntrinsicsKt.f() ? objV : Unit.f143329a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r0.d() != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
        /*
            r3 = this;
            En.q$b r0 = r3.networkCallbackListener
            java.lang.String r1 = "networkCallbackListener"
            r2 = 0
            if (r0 != 0) goto Lb
            kotlin.jvm.internal.Intrinsics.x(r1)
            r0 = r2
        Lb:
            boolean r0 = r0.d()
            if (r0 == 0) goto L3d
            En.q$b r0 = r3.networkCallbackListener
            if (r0 != 0) goto L19
            kotlin.jvm.internal.Intrinsics.x(r1)
            r0 = r2
        L19:
            boolean r0 = r0.e()
            if (r0 == 0) goto L2e
            En.q$b r0 = r3.networkCallbackListener
            if (r0 != 0) goto L27
            kotlin.jvm.internal.Intrinsics.x(r1)
            r0 = r2
        L27:
            boolean r0 = r0.d()
            if (r0 == 0) goto L2e
            goto L3d
        L2e:
            En.q$b r4 = r3.networkCallbackListener
            if (r4 != 0) goto L36
            kotlin.jvm.internal.Intrinsics.x(r1)
            goto L37
        L36:
            r2 = r4
        L37:
            r2.k()
            kotlin.Unit r4 = kotlin.Unit.f143329a
            return r4
        L3d:
            En.q$b r0 = r3.networkCallbackListener
            if (r0 != 0) goto L45
            kotlin.jvm.internal.Intrinsics.x(r1)
            r0 = r2
        L45:
            r1 = 1
            r0.b(r1)
            Eh.a r0 = r3.J()
            j$.time.ZonedDateTime r1 = j$.time.ZonedDateTime.now()
            r0.M(r1)
            kotlin.coroutines.CoroutineContext r0 = r3.coroutineContext
            En.q$f r1 = new En.q$f
            r1.<init>(r2)
            java.lang.Object r4 = mv.C15805i.g(r0, r1, r4)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r4 != r0) goto L66
            return r4
        L66:
            kotlin.Unit r4 = kotlin.Unit.f143329a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: En.q.V(kotlin.coroutines.Continuation):java.lang.Object");
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
        final C14271d c14271dX = C14271d.x();
        Intrinsics.i(c14271dX, "create(...)");
        switch (field == null ? -1 : c.$EnumSwitchMapping$0[field.ordinal()]) {
            case -1:
                Unit unit = Unit.f143329a;
                return c14271dX;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                if (!Intrinsics.e(J().getName(), currentFieldValue)) {
                    handleHasChanged.invoke();
                }
                J().G(currentFieldValue);
                this.addressModelStore.a(new Function1() { // from class: En.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.k0(this.f7901a, currentFieldValue, field, shouldHide, c14271dX, (AccountAddressState) obj);
                    }
                });
                return c14271dX;
            case 2:
                if (!Intrinsics.e(J().getFirstName(), currentFieldValue)) {
                    handleHasChanged.invoke();
                }
                J().C(currentFieldValue);
                this.addressModelStore.a(new Function1() { // from class: En.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.b0(this.f7906a, currentFieldValue, field, shouldHide, c14271dX, (AccountAddressState) obj);
                    }
                });
                return c14271dX;
            case 3:
                if (!Intrinsics.e(J().getLastName(), currentFieldValue)) {
                    handleHasChanged.invoke();
                }
                J().F(currentFieldValue);
                this.addressModelStore.a(new Function1() { // from class: En.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.c0(this.f7911a, currentFieldValue, field, shouldHide, c14271dX, (AccountAddressState) obj);
                    }
                });
                return c14271dX;
            case 4:
                if (!Intrinsics.e(J().getPhoneNumber(), currentFieldValue)) {
                    handleHasChanged.invoke();
                }
                J().I(currentFieldValue);
                this.addressModelStore.a(new Function1() { // from class: En.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.d0(this.f7916a, currentFieldValue, field, shouldHide, c14271dX, (AccountAddressState) obj);
                    }
                });
                return c14271dX;
            case 5:
                if (!Intrinsics.e(J().getAddressLine1(), currentFieldValue)) {
                    handleHasChanged.invoke();
                }
                J().t(currentFieldValue);
                this.addressModelStore.a(new Function1() { // from class: En.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.e0(this.f7873a, currentFieldValue, field, shouldHide, c14271dX, (AccountAddressState) obj);
                    }
                });
                return c14271dX;
            case 6:
                if (!Intrinsics.e(J().getAddressLine2(), currentFieldValue)) {
                    handleHasChanged.invoke();
                }
                J().v(currentFieldValue);
                this.addressModelStore.a(new Function1() { // from class: En.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.f0(this.f7878a, currentFieldValue, field, shouldHide, c14271dX, (AccountAddressState) obj);
                    }
                });
                return c14271dX;
            case 7:
                if (!Intrinsics.e(J().getCity(), currentFieldValue)) {
                    handleHasChanged.invoke();
                }
                J().x(currentFieldValue);
                this.addressModelStore.a(new Function1() { // from class: En.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.g0(this.f7883a, currentFieldValue, field, shouldHide, c14271dX, (AccountAddressState) obj);
                    }
                });
                return c14271dX;
            case 8:
                if (!Intrinsics.e(J().getState(), currentFieldValue)) {
                    handleHasChanged.invoke();
                }
                J().L(currentFieldValue);
                this.addressModelStore.a(new Function1() { // from class: En.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.h0(this.f7888a, currentFieldValue, field, shouldHide, c14271dX, (AccountAddressState) obj);
                    }
                });
                return c14271dX;
            case 9:
                if (!Intrinsics.e(J().getZipCode(), currentFieldValue)) {
                    handleHasChanged.invoke();
                }
                J().O(currentFieldValue);
                this.addressModelStore.a(new Function1() { // from class: En.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.i0(this.f7893a, currentFieldValue, field, shouldHide, c14271dX, (AccountAddressState) obj);
                    }
                });
                return c14271dX;
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
        return new CustomerAddress(null, null, null, null, str, str2, null, str3, null, str4, region, zipCode == null ? "" : zipCode, new Country("US", null, 2, null), null, null, false, false, false, false, null, 1040719, null);
    }

    private final boolean A() {
        boolean z10;
        String lastName;
        String addressLine1;
        String city;
        String state;
        String zipCode;
        String firstName = J().getFirstName();
        if (firstName != null && !StringsKt.s0(firstName) && (lastName = J().getLastName()) != null && !StringsKt.s0(lastName) && (addressLine1 = J().getAddressLine1()) != null && !StringsKt.s0(addressLine1) && (city = J().getCity()) != null && !StringsKt.s0(city) && (state = J().getState()) != null && !StringsKt.s0(state) && (zipCode = J().getZipCode()) != null && !StringsKt.s0(zipCode)) {
            z10 = false;
        } else {
            z10 = true;
        }
        return !z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(q qVar, Boolean bool) throws InterruptedException {
        if (!bool.booleanValue()) {
            C15805i.e(qVar.handler, qVar.new e(null));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public final void X(boolean isPrimary) {
        J().J(isPrimary);
    }
}
