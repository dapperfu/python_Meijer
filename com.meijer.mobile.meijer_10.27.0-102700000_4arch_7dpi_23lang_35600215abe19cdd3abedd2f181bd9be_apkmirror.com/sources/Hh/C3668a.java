package Hh;

import Dh.AccountAddress;
import Dh.AccountAddresses;
import Dh.EnumC3372e;
import ak.AbstractC5607a;
import androidx.view.c0;
import androidx.view.d0;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.P;
import tv.S;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"LHh/a;", "Landroidx/lifecycle/c0;", "LBh/a;", "accountAddressesRepository", "<init>", "(LBh/a;)V", "LDh/b;", "addresses", "", "isFailure", "", "s", "(LDh/b;Z)V", "q", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "()V", "a", "LBh/a;", "Ltv/B;", "LHh/a$a;", "b", "Ltv/B;", "_viewState", "Ltv/P;", "c", "Ltv/P;", "r", "()Ltv/P;", "viewState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Hh.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3668a extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Bh.a accountAddressesRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<AddressesCardViewState> _viewState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final P<AddressesCardViewState> viewState;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJT\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b \u0010\u001d¨\u0006#"}, d2 = {"LHh/a$a;", "", "", "isLoading", "Lak/a;", "savedAddressesMessage", "isPrimaryAddress", "", PlaceTypes.ADDRESS, "emptyStateTitle", "emptyStateDescription", "<init>", "(ZLak/a;ZLjava/lang/String;Lak/a;Lak/a;)V", "a", "(ZLak/a;ZLjava/lang/String;Lak/a;Lak/a;)LHh/a$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "g", "()Z", "b", "Lak/a;", "f", "()Lak/a;", "c", "h", "d", "Ljava/lang/String;", "e", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Hh.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class AddressesCardViewState {

        /* renamed from: g, reason: collision with root package name */
        public static final int f12435g = AbstractC5607a.f45514b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a savedAddressesMessage;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPrimaryAddress;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String address;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a emptyStateTitle;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a emptyStateDescription;

        public AddressesCardViewState() {
            this(false, null, false, null, null, null, 63, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddressesCardViewState)) {
                return false;
            }
            AddressesCardViewState addressesCardViewState = (AddressesCardViewState) other;
            return this.isLoading == addressesCardViewState.isLoading && Intrinsics.e(this.savedAddressesMessage, addressesCardViewState.savedAddressesMessage) && this.isPrimaryAddress == addressesCardViewState.isPrimaryAddress && Intrinsics.e(this.address, addressesCardViewState.address) && Intrinsics.e(this.emptyStateTitle, addressesCardViewState.emptyStateTitle) && Intrinsics.e(this.emptyStateDescription, addressesCardViewState.emptyStateDescription);
        }

        public AddressesCardViewState(boolean z10, AbstractC5607a abstractC5607a, boolean z11, String str, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3) {
            this.isLoading = z10;
            this.savedAddressesMessage = abstractC5607a;
            this.isPrimaryAddress = z11;
            this.address = str;
            this.emptyStateTitle = abstractC5607a2;
            this.emptyStateDescription = abstractC5607a3;
        }

        public static /* synthetic */ AddressesCardViewState b(AddressesCardViewState addressesCardViewState, boolean z10, AbstractC5607a abstractC5607a, boolean z11, String str, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = addressesCardViewState.isLoading;
            }
            if ((i10 & 2) != 0) {
                abstractC5607a = addressesCardViewState.savedAddressesMessage;
            }
            if ((i10 & 4) != 0) {
                z11 = addressesCardViewState.isPrimaryAddress;
            }
            if ((i10 & 8) != 0) {
                str = addressesCardViewState.address;
            }
            if ((i10 & 16) != 0) {
                abstractC5607a2 = addressesCardViewState.emptyStateTitle;
            }
            if ((i10 & 32) != 0) {
                abstractC5607a3 = addressesCardViewState.emptyStateDescription;
            }
            AbstractC5607a abstractC5607a4 = abstractC5607a2;
            AbstractC5607a abstractC5607a5 = abstractC5607a3;
            return addressesCardViewState.a(z10, abstractC5607a, z11, str, abstractC5607a4, abstractC5607a5);
        }

        public final AddressesCardViewState a(boolean isLoading, AbstractC5607a savedAddressesMessage, boolean isPrimaryAddress, String address, AbstractC5607a emptyStateTitle, AbstractC5607a emptyStateDescription) {
            return new AddressesCardViewState(isLoading, savedAddressesMessage, isPrimaryAddress, address, emptyStateTitle, emptyStateDescription);
        }

        /* renamed from: c, reason: from getter */
        public final String getAddress() {
            return this.address;
        }

        /* renamed from: d, reason: from getter */
        public final AbstractC5607a getEmptyStateDescription() {
            return this.emptyStateDescription;
        }

        /* renamed from: e, reason: from getter */
        public final AbstractC5607a getEmptyStateTitle() {
            return this.emptyStateTitle;
        }

        /* renamed from: f, reason: from getter */
        public final AbstractC5607a getSavedAddressesMessage() {
            return this.savedAddressesMessage;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getIsPrimaryAddress() {
            return this.isPrimaryAddress;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isLoading) * 31;
            AbstractC5607a abstractC5607a = this.savedAddressesMessage;
            int iHashCode2 = (((iHashCode + (abstractC5607a == null ? 0 : abstractC5607a.hashCode())) * 31) + Boolean.hashCode(this.isPrimaryAddress)) * 31;
            String str = this.address;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            AbstractC5607a abstractC5607a2 = this.emptyStateTitle;
            int iHashCode4 = (iHashCode3 + (abstractC5607a2 == null ? 0 : abstractC5607a2.hashCode())) * 31;
            AbstractC5607a abstractC5607a3 = this.emptyStateDescription;
            return iHashCode4 + (abstractC5607a3 != null ? abstractC5607a3.hashCode() : 0);
        }

        public String toString() {
            return "AddressesCardViewState(isLoading=" + this.isLoading + ", savedAddressesMessage=" + this.savedAddressesMessage + ", isPrimaryAddress=" + this.isPrimaryAddress + ", address=" + this.address + ", emptyStateTitle=" + this.emptyStateTitle + ", emptyStateDescription=" + this.emptyStateDescription + ')';
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ AddressesCardViewState(boolean r2, ak.AbstractC5607a r3, boolean r4, java.lang.String r5, ak.AbstractC5607a r6, ak.AbstractC5607a r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L5
                r2 = 1
            L5:
                r9 = r8 & 2
                r0 = 0
                if (r9 == 0) goto Lb
                r3 = r0
            Lb:
                r9 = r8 & 4
                if (r9 == 0) goto L10
                r4 = 0
            L10:
                r9 = r8 & 8
                if (r9 == 0) goto L15
                r5 = r0
            L15:
                r9 = r8 & 16
                if (r9 == 0) goto L1a
                r6 = r0
            L1a:
                r8 = r8 & 32
                if (r8 == 0) goto L26
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L2d
            L26:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L2d:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Hh.C3668a.AddressesCardViewState.<init>(boolean, ak.a, boolean, java.lang.String, ak.a, ak.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.basescreen.cards.AddressesCardViewModel$fetchAddressesCardInfo$2", f = "AddressesCardViewModel.kt", l = {38}, m = "invokeSuspend")
    /* renamed from: Hh.a$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f12442a;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LDh/b;", "addresses", "", "<anonymous>", "(LDh/b;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.basescreen.cards.AddressesCardViewModel$fetchAddressesCardInfo$2$1", f = "AddressesCardViewModel.kt", l = {41}, m = "invokeSuspend")
        /* renamed from: Hh.a$b$a, reason: collision with other inner class name */
        static final class C0193a extends SuspendLambda implements Function2<AccountAddresses, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f12444a;

            /* renamed from: b, reason: collision with root package name */
            Object f12445b;

            /* renamed from: c, reason: collision with root package name */
            int f12446c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f12447d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C3668a f12448e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0193a(C3668a c3668a, Continuation<? super C0193a> continuation) {
                super(2, continuation);
                this.f12448e = c3668a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C0193a c0193a = new C0193a(this.f12448e, continuation);
                c0193a.f12447d = obj;
                return c0193a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AccountAddresses accountAddresses, Continuation<? super Unit> continuation) {
                return ((C0193a) create(accountAddresses, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                C3668a c3668a;
                AccountAddresses accountAddresses;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f12446c;
                if (i10 != 0) {
                    if (i10 == 1) {
                        accountAddresses = (AccountAddresses) this.f12445b;
                        c3668a = (C3668a) this.f12444a;
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    AccountAddresses accountAddresses2 = (AccountAddresses) this.f12447d;
                    c3668a = this.f12448e;
                    this.f12447d = accountAddresses2;
                    this.f12444a = c3668a;
                    this.f12445b = accountAddresses2;
                    this.f12446c = 1;
                    Object objQ = c3668a.q(this);
                    if (objQ == objF) {
                        return objF;
                    }
                    accountAddresses = accountAddresses2;
                    obj = objQ;
                }
                c3668a.s(accountAddresses, ((Boolean) obj).booleanValue());
                return Unit.f142422a;
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C3668a.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f12442a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                P<AccountAddresses> pD = C3668a.this.accountAddressesRepository.d();
                C0193a c0193a = new C0193a(C3668a.this, null);
                this.f12442a = 1;
                if (C17154h.k(pD, c0193a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.basescreen.cards.AddressesCardViewModel", f = "AddressesCardViewModel.kt", l = {97}, m = "getAccountAddresses")
    /* renamed from: Hh.a$c */
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f12449a;

        /* renamed from: b, reason: collision with root package name */
        Object f12450b;

        /* renamed from: c, reason: collision with root package name */
        Object f12451c;

        /* renamed from: d, reason: collision with root package name */
        Object f12452d;

        /* renamed from: e, reason: collision with root package name */
        int f12453e;

        /* renamed from: f, reason: collision with root package name */
        int f12454f;

        /* renamed from: g, reason: collision with root package name */
        int f12455g;

        /* renamed from: h, reason: collision with root package name */
        int f12456h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f12457i;

        /* renamed from: k, reason: collision with root package name */
        int f12459k;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12457i = obj;
            this.f12459k |= Integer.MIN_VALUE;
            return C3668a.this.q(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Hh.a$d */
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Boolean.valueOf(((AccountAddress) t11).getIsPrimary()), Boolean.valueOf(((AccountAddress) t10).getIsPrimary()));
        }
    }

    public C3668a(Bh.a accountAddressesRepository) {
        Intrinsics.j(accountAddressesRepository, "accountAddressesRepository");
        this.accountAddressesRepository = accountAddressesRepository;
        InterfaceC17140B<AddressesCardViewState> interfaceC17140BA = S.a(new AddressesCardViewState(false, null, false, null, null, null, 63, null));
        this._viewState = interfaceC17140BA;
        this.viewState = C17154h.c(interfaceC17140BA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(kotlin.coroutines.Continuation<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof Hh.C3668a.c
            if (r0 == 0) goto L13
            r0 = r5
            Hh.a$c r0 = (Hh.C3668a.c) r0
            int r1 = r0.f12459k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12459k = r1
            goto L18
        L13:
            Hh.a$c r0 = new Hh.a$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12457i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f12459k
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r1 = r0.f12452d
            Hh.a r1 = (Hh.C3668a) r1
            java.lang.Object r1 = r0.f12451c
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f12450b
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f12449a
            Hh.a r1 = (Hh.C3668a) r1
            kotlin.ResultKt.b(r5)     // Catch: java.lang.Exception -> L39
            goto L66
        L39:
            r5 = move-exception
            goto L6b
        L3b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L43:
            kotlin.ResultKt.b(r5)
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L39
            Bh.a r5 = n(r4)     // Catch: java.lang.Exception -> L39
            r0.f12449a = r4     // Catch: java.lang.Exception -> L39
            r0.f12450b = r0     // Catch: java.lang.Exception -> L39
            r0.f12451c = r0     // Catch: java.lang.Exception -> L39
            r0.f12452d = r4     // Catch: java.lang.Exception -> L39
            r2 = 0
            r0.f12453e = r2     // Catch: java.lang.Exception -> L39
            r0.f12454f = r2     // Catch: java.lang.Exception -> L39
            r0.f12455g = r2     // Catch: java.lang.Exception -> L39
            r0.f12456h = r2     // Catch: java.lang.Exception -> L39
            r0.f12459k = r3     // Catch: java.lang.Exception -> L39
            java.lang.Object r5 = r5.c(r0)     // Catch: java.lang.Exception -> L39
            if (r5 != r1) goto L66
            return r1
        L66:
            java.lang.Object r5 = kotlin.Result.b(r5)     // Catch: java.lang.Exception -> L39
            goto L7c
        L6b:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            qv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L7c:
            boolean r5 = kotlin.Result.g(r5)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Hh.C3668a.q(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void p() {
        AddressesCardViewState value;
        InterfaceC17140B<AddressesCardViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, AddressesCardViewState.b(value, true, null, false, null, null, null, 62, null)));
        C16648k.d(d0.a(this), null, null, new b(null), 3, null);
    }

    public final P<AddressesCardViewState> r() {
        return this.viewState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(AccountAddresses addresses, boolean isFailure) {
        AddressesCardViewState value;
        AddressesCardViewState addressesCardViewState;
        AbstractC5607a abstractC5607aD;
        AbstractC5607a abstractC5607aD2;
        boolean isPrimary;
        String str;
        AbstractC5607a abstractC5607aD3;
        List<AccountAddress> listB = addresses.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (((AccountAddress) obj).getAddressType() == EnumC3372e.f6514d) {
                arrayList.add(obj);
            }
        }
        List listZ0 = CollectionsKt.Z0(arrayList, new d());
        InterfaceC17140B<AddressesCardViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            addressesCardViewState = value;
            abstractC5607aD = null;
            if (!isFailure && !listZ0.isEmpty()) {
                if (listZ0.size() == 1) {
                    abstractC5607aD2 = AbstractC5607a.INSTANCE.d(Fh.h.f10612T5, String.valueOf(listZ0.size()));
                } else {
                    abstractC5607aD2 = AbstractC5607a.INSTANCE.d(Fh.h.f10619U5, String.valueOf(listZ0.size()));
                }
            } else {
                abstractC5607aD2 = null;
            }
            if (!isFailure && !listZ0.isEmpty()) {
                isPrimary = ((AccountAddress) CollectionsKt.s0(listZ0)).getIsPrimary();
            } else {
                isPrimary = false;
            }
            if (!isFailure && !listZ0.isEmpty()) {
                AccountAddress accountAddress = (AccountAddress) CollectionsKt.s0(listZ0);
                str = CollectionsKt.B0(CollectionsKt.r(accountAddress.getAddressLine1(), accountAddress.getAddressLine2(), accountAddress.getCity(), accountAddress.getState()), ", ", null, null, 0, null, null, 62, null) + ' ' + accountAddress.getZipCode();
            } else {
                str = null;
            }
            if (!isFailure && !listZ0.isEmpty()) {
                abstractC5607aD3 = null;
            } else {
                abstractC5607aD3 = AbstractC5607a.INSTANCE.d(Fh.h.f10732l, new Object[0]);
            }
            if (isFailure || listZ0.isEmpty()) {
                abstractC5607aD = AbstractC5607a.INSTANCE.d(Fh.h.f10725k, new Object[0]);
            }
        } while (!interfaceC17140B.e(value, addressesCardViewState.a(false, abstractC5607aD2, isPrimary, str, abstractC5607aD3, abstractC5607aD)));
    }
}
