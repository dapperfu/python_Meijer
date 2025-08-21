package Ih;

import Eh.AccountAddress;
import Eh.AccountAddresses;
import Eh.EnumC3241e;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.P;
import pv.S;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"LIh/a;", "Landroidx/lifecycle/c0;", "LCh/a;", "accountAddressesRepository", "<init>", "(LCh/a;)V", "LEh/b;", "addresses", "", "isFailure", "", "s", "(LEh/b;Z)V", "q", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "()V", "a", "LCh/a;", "Lpv/B;", "LIh/a$a;", "b", "Lpv/B;", "_viewState", "Lpv/P;", "c", "Lpv/P;", "r", "()Lpv/P;", "viewState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Ih.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3834a extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ch.a accountAddressesRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<AddressesCardViewState> _viewState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final P<AddressesCardViewState> viewState;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJT\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b \u0010\u001d¨\u0006#"}, d2 = {"LIh/a$a;", "", "", "isLoading", "Lbk/a;", "savedAddressesMessage", "isPrimaryAddress", "", PlaceTypes.ADDRESS, "emptyStateTitle", "emptyStateDescription", "<init>", "(ZLbk/a;ZLjava/lang/String;Lbk/a;Lbk/a;)V", "a", "(ZLbk/a;ZLjava/lang/String;Lbk/a;Lbk/a;)LIh/a$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "g", "()Z", "b", "Lbk/a;", "f", "()Lbk/a;", "c", "h", "d", "Ljava/lang/String;", "e", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ih.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class AddressesCardViewState {

        /* renamed from: g, reason: collision with root package name */
        public static final int f14586g = AbstractC6392a.f60445b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a savedAddressesMessage;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPrimaryAddress;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String address;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a emptyStateTitle;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a emptyStateDescription;

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

        public AddressesCardViewState(boolean z10, AbstractC6392a abstractC6392a, boolean z11, String str, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3) {
            this.isLoading = z10;
            this.savedAddressesMessage = abstractC6392a;
            this.isPrimaryAddress = z11;
            this.address = str;
            this.emptyStateTitle = abstractC6392a2;
            this.emptyStateDescription = abstractC6392a3;
        }

        public static /* synthetic */ AddressesCardViewState b(AddressesCardViewState addressesCardViewState, boolean z10, AbstractC6392a abstractC6392a, boolean z11, String str, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = addressesCardViewState.isLoading;
            }
            if ((i10 & 2) != 0) {
                abstractC6392a = addressesCardViewState.savedAddressesMessage;
            }
            if ((i10 & 4) != 0) {
                z11 = addressesCardViewState.isPrimaryAddress;
            }
            if ((i10 & 8) != 0) {
                str = addressesCardViewState.address;
            }
            if ((i10 & 16) != 0) {
                abstractC6392a2 = addressesCardViewState.emptyStateTitle;
            }
            if ((i10 & 32) != 0) {
                abstractC6392a3 = addressesCardViewState.emptyStateDescription;
            }
            AbstractC6392a abstractC6392a4 = abstractC6392a2;
            AbstractC6392a abstractC6392a5 = abstractC6392a3;
            return addressesCardViewState.a(z10, abstractC6392a, z11, str, abstractC6392a4, abstractC6392a5);
        }

        public final AddressesCardViewState a(boolean isLoading, AbstractC6392a savedAddressesMessage, boolean isPrimaryAddress, String address, AbstractC6392a emptyStateTitle, AbstractC6392a emptyStateDescription) {
            return new AddressesCardViewState(isLoading, savedAddressesMessage, isPrimaryAddress, address, emptyStateTitle, emptyStateDescription);
        }

        /* renamed from: c, reason: from getter */
        public final String getAddress() {
            return this.address;
        }

        /* renamed from: d, reason: from getter */
        public final AbstractC6392a getEmptyStateDescription() {
            return this.emptyStateDescription;
        }

        /* renamed from: e, reason: from getter */
        public final AbstractC6392a getEmptyStateTitle() {
            return this.emptyStateTitle;
        }

        /* renamed from: f, reason: from getter */
        public final AbstractC6392a getSavedAddressesMessage() {
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
            AbstractC6392a abstractC6392a = this.savedAddressesMessage;
            int iHashCode2 = (((iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31) + Boolean.hashCode(this.isPrimaryAddress)) * 31;
            String str = this.address;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            AbstractC6392a abstractC6392a2 = this.emptyStateTitle;
            int iHashCode4 = (iHashCode3 + (abstractC6392a2 == null ? 0 : abstractC6392a2.hashCode())) * 31;
            AbstractC6392a abstractC6392a3 = this.emptyStateDescription;
            return iHashCode4 + (abstractC6392a3 != null ? abstractC6392a3.hashCode() : 0);
        }

        public String toString() {
            return "AddressesCardViewState(isLoading=" + this.isLoading + ", savedAddressesMessage=" + this.savedAddressesMessage + ", isPrimaryAddress=" + this.isPrimaryAddress + ", address=" + this.address + ", emptyStateTitle=" + this.emptyStateTitle + ", emptyStateDescription=" + this.emptyStateDescription + ')';
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ AddressesCardViewState(boolean r2, bk.AbstractC6392a r3, boolean r4, java.lang.String r5, bk.AbstractC6392a r6, bk.AbstractC6392a r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
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
            throw new UnsupportedOperationException("Method not decompiled: Ih.C3834a.AddressesCardViewState.<init>(boolean, bk.a, boolean, java.lang.String, bk.a, bk.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.basescreen.cards.AddressesCardViewModel$fetchAddressesCardInfo$2", f = "AddressesCardViewModel.kt", l = {38}, m = "invokeSuspend")
    /* renamed from: Ih.a$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f14593a;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LEh/b;", "addresses", "", "<anonymous>", "(LEh/b;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.basescreen.cards.AddressesCardViewModel$fetchAddressesCardInfo$2$1", f = "AddressesCardViewModel.kt", l = {41}, m = "invokeSuspend")
        /* renamed from: Ih.a$b$a, reason: collision with other inner class name */
        static final class C0233a extends SuspendLambda implements Function2<AccountAddresses, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f14595a;

            /* renamed from: b, reason: collision with root package name */
            Object f14596b;

            /* renamed from: c, reason: collision with root package name */
            int f14597c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f14598d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C3834a f14599e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0233a(C3834a c3834a, Continuation<? super C0233a> continuation) {
                super(2, continuation);
                this.f14599e = c3834a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C0233a c0233a = new C0233a(this.f14599e, continuation);
                c0233a.f14598d = obj;
                return c0233a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AccountAddresses accountAddresses, Continuation<? super Unit> continuation) {
                return ((C0233a) create(accountAddresses, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                C3834a c3834a;
                AccountAddresses accountAddresses;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f14597c;
                if (i10 != 0) {
                    if (i10 == 1) {
                        accountAddresses = (AccountAddresses) this.f14596b;
                        c3834a = (C3834a) this.f14595a;
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    AccountAddresses accountAddresses2 = (AccountAddresses) this.f14598d;
                    c3834a = this.f14599e;
                    this.f14598d = accountAddresses2;
                    this.f14595a = c3834a;
                    this.f14596b = accountAddresses2;
                    this.f14597c = 1;
                    Object objQ = c3834a.q(this);
                    if (objQ == objF) {
                        return objF;
                    }
                    accountAddresses = accountAddresses2;
                    obj = objQ;
                }
                c3834a.s(accountAddresses, ((Boolean) obj).booleanValue());
                return Unit.f143329a;
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C3834a.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f14593a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                P<AccountAddresses> pD = C3834a.this.accountAddressesRepository.d();
                C0233a c0233a = new C0233a(C3834a.this, null);
                this.f14593a = 1;
                if (C16563h.k(pD, c0233a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.basescreen.cards.AddressesCardViewModel", f = "AddressesCardViewModel.kt", l = {97}, m = "getAccountAddresses")
    /* renamed from: Ih.a$c */
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f14600a;

        /* renamed from: b, reason: collision with root package name */
        Object f14601b;

        /* renamed from: c, reason: collision with root package name */
        Object f14602c;

        /* renamed from: d, reason: collision with root package name */
        Object f14603d;

        /* renamed from: e, reason: collision with root package name */
        int f14604e;

        /* renamed from: f, reason: collision with root package name */
        int f14605f;

        /* renamed from: g, reason: collision with root package name */
        int f14606g;

        /* renamed from: h, reason: collision with root package name */
        int f14607h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f14608i;

        /* renamed from: k, reason: collision with root package name */
        int f14610k;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14608i = obj;
            this.f14610k |= Integer.MIN_VALUE;
            return C3834a.this.q(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ih.a$d */
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Boolean.valueOf(((AccountAddress) t11).getIsPrimary()), Boolean.valueOf(((AccountAddress) t10).getIsPrimary()));
        }
    }

    public C3834a(Ch.a accountAddressesRepository) {
        Intrinsics.j(accountAddressesRepository, "accountAddressesRepository");
        this.accountAddressesRepository = accountAddressesRepository;
        InterfaceC16549B<AddressesCardViewState> interfaceC16549BA = S.a(new AddressesCardViewState(false, null, false, null, null, null, 63, null));
        this._viewState = interfaceC16549BA;
        this.viewState = C16563h.c(interfaceC16549BA);
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
            boolean r0 = r5 instanceof Ih.C3834a.c
            if (r0 == 0) goto L13
            r0 = r5
            Ih.a$c r0 = (Ih.C3834a.c) r0
            int r1 = r0.f14610k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14610k = r1
            goto L18
        L13:
            Ih.a$c r0 = new Ih.a$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f14608i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f14610k
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r1 = r0.f14603d
            Ih.a r1 = (Ih.C3834a) r1
            java.lang.Object r1 = r0.f14602c
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f14601b
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f14600a
            Ih.a r1 = (Ih.C3834a) r1
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
            Ch.a r5 = n(r4)     // Catch: java.lang.Exception -> L39
            r0.f14600a = r4     // Catch: java.lang.Exception -> L39
            r0.f14601b = r0     // Catch: java.lang.Exception -> L39
            r0.f14602c = r0     // Catch: java.lang.Exception -> L39
            r0.f14603d = r4     // Catch: java.lang.Exception -> L39
            r2 = 0
            r0.f14604e = r2     // Catch: java.lang.Exception -> L39
            r0.f14605f = r2     // Catch: java.lang.Exception -> L39
            r0.f14606g = r2     // Catch: java.lang.Exception -> L39
            r0.f14607h = r2     // Catch: java.lang.Exception -> L39
            r0.f14610k = r3     // Catch: java.lang.Exception -> L39
            java.lang.Object r5 = r5.c(r0)     // Catch: java.lang.Exception -> L39
            if (r5 != r1) goto L66
            return r1
        L66:
            java.lang.Object r5 = kotlin.Result.b(r5)     // Catch: java.lang.Exception -> L39
            goto L7c
        L6b:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            mv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L7c:
            boolean r5 = kotlin.Result.g(r5)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Ih.C3834a.q(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void p() {
        AddressesCardViewState value;
        InterfaceC16549B<AddressesCardViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, AddressesCardViewState.b(value, true, null, false, null, null, null, 62, null)));
        C15809k.d(d0.a(this), null, null, new b(null), 3, null);
    }

    public final P<AddressesCardViewState> r() {
        return this.viewState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(AccountAddresses addresses, boolean isFailure) {
        AddressesCardViewState value;
        AddressesCardViewState addressesCardViewState;
        AbstractC6392a abstractC6392aD;
        AbstractC6392a abstractC6392aD2;
        boolean isPrimary;
        String str;
        AbstractC6392a abstractC6392aD3;
        List<AccountAddress> listB = addresses.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (((AccountAddress) obj).getAddressType() == EnumC3241e.f7540d) {
                arrayList.add(obj);
            }
        }
        List listZ0 = CollectionsKt.Z0(arrayList, new d());
        InterfaceC16549B<AddressesCardViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            addressesCardViewState = value;
            abstractC6392aD = null;
            if (!isFailure && !listZ0.isEmpty()) {
                if (listZ0.size() == 1) {
                    abstractC6392aD2 = AbstractC6392a.INSTANCE.d(Gh.h.f12803T5, String.valueOf(listZ0.size()));
                } else {
                    abstractC6392aD2 = AbstractC6392a.INSTANCE.d(Gh.h.f12810U5, String.valueOf(listZ0.size()));
                }
            } else {
                abstractC6392aD2 = null;
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
                abstractC6392aD3 = null;
            } else {
                abstractC6392aD3 = AbstractC6392a.INSTANCE.d(Gh.h.f12923l, new Object[0]);
            }
            if (isFailure || listZ0.isEmpty()) {
                abstractC6392aD = AbstractC6392a.INSTANCE.d(Gh.h.f12916k, new Object[0]);
            }
        } while (!interfaceC16549B.e(value, addressesCardViewState.a(false, abstractC6392aD2, isPrimary, str, abstractC6392aD3, abstractC6392aD)));
    }
}
