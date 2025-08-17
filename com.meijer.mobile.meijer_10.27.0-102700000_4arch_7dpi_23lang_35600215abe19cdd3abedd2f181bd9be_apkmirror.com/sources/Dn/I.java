package Dn;

import Bn.AddressInfo;
import Dh.AccountAddress;
import Td.AbstractC5232j;
import androidx.view.c0;
import androidx.view.d0;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.libraries.places.api.model.RectangularBounds;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.medallia.digital.mobilesdk.l3;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16639f0;
import qv.C16644i;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17140B;
import tv.InterfaceC17144F;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import tv.P;
import tv.S;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0003.*%B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00162\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020)0-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002030#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010&R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u000203068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, d2 = {"LDn/I;", "Landroidx/lifecycle/c0;", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "placesClient", "<init>", "(Lcom/google/android/libraries/places/api/net/PlacesClient;)V", "LDn/I$b$a;", "action", "", "s", "(LDn/I$b$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LDn/A;", "addressPrediction", "LBn/a;", "u", "(LDn/A;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "searchTerm", "Lcom/google/android/gms/maps/model/LatLngBounds;", "bounds", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "sessionToken", "", "t", "(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "v", "(Lcom/google/android/gms/maps/model/LatLngBounds;Ljava/lang/String;Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LDn/I$b;", "y", "(LDn/I$b;)V", "addressPredictions", "A", "(Ljava/util/List;)V", "a", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "Ltv/A;", "LDn/I$b$b;", "b", "Ltv/A;", "addressLookUpFlow", "Ltv/B;", "LDn/I$d;", "c", "Ltv/B;", "_searchAddressViewState", "Ltv/P;", "d", "Ltv/P;", "x", "()Ltv/P;", "searchAddressViewState", "LDn/I$c;", "e", "_eventFlow", "Ltv/F;", "f", "Ltv/F;", "w", "()Ltv/F;", "eventFlow", "g", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class I extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final PlacesClient placesClient;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<b.C0104b> addressLookUpFlow;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<SearchAddressViewState> _searchAddressViewState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final P<SearchAddressViewState> searchAddressViewState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<c> _eventFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17144F<c> eventFlow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AutocompleteSessionToken sessionToken;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.SearchDeliveryAddressViewModel$1", f = "SearchDeliveryAddressViewModel.kt", l = {60}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f6807a;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "LDn/I$b$b;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.SearchDeliveryAddressViewModel$1$1", f = "SearchDeliveryAddressViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: Dn.I$a$a, reason: collision with other inner class name */
        static final class C0102a extends SuspendLambda implements Function3<InterfaceC17153g<? super b.C0104b>, Throwable, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f6809a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f6810b;

            C0102a(Continuation<? super C0102a> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super b.C0104b> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
                C0102a c0102a = new C0102a(continuation);
                c0102a.f6810b = th2;
                return c0102a.invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f6809a == 0) {
                    ResultKt.b(obj);
                    uw.a.INSTANCE.e((Throwable) this.f6810b);
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ I f6811a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.SearchDeliveryAddressViewModel$1$2", f = "SearchDeliveryAddressViewModel.kt", l = {62}, m = "emit")
            /* renamed from: Dn.I$a$b$a, reason: collision with other inner class name */
            static final class C0103a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                Object f6812a;

                /* renamed from: b, reason: collision with root package name */
                Object f6813b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f6814c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ b<T> f6815d;

                /* renamed from: e, reason: collision with root package name */
                int f6816e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0103a(b<? super T> bVar, Continuation<? super C0103a> continuation) {
                    super(continuation);
                    this.f6815d = bVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f6814c = obj;
                    this.f6816e |= Integer.MIN_VALUE;
                    return this.f6815d.emit(null, this);
                }
            }

            b(I i10) {
                this.f6811a = i10;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(Dn.I.b.C0104b r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof Dn.I.a.b.C0103a
                    if (r0 == 0) goto L13
                    r0 = r8
                    Dn.I$a$b$a r0 = (Dn.I.a.b.C0103a) r0
                    int r1 = r0.f6816e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f6816e = r1
                    goto L18
                L13:
                    Dn.I$a$b$a r0 = new Dn.I$a$b$a
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.f6814c
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f6816e
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r7 = r0.f6813b
                    Dn.I r7 = (Dn.I) r7
                    java.lang.Object r0 = r0.f6812a
                    Dn.I$b$b r0 = (Dn.I.b.C0104b) r0
                    kotlin.ResultKt.b(r8)
                    goto L63
                L31:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L39:
                    kotlin.ResultKt.b(r8)
                    Dn.I r8 = r6.f6811a
                    tv.B r2 = Dn.I.r(r8)
                    java.lang.Object r2 = r2.getValue()
                    Dn.I$d r2 = (Dn.I.SearchAddressViewState) r2
                    java.lang.String r2 = r2.getSearchQuery()
                    Dn.I r4 = r6.f6811a
                    com.google.android.libraries.places.api.model.AutocompleteSessionToken r4 = Dn.I.q(r4)
                    r0.f6812a = r7
                    r0.f6813b = r8
                    r0.f6816e = r3
                    r7 = 0
                    java.lang.Object r7 = Dn.I.n(r8, r2, r7, r4, r0)
                    if (r7 != r1) goto L60
                    return r1
                L60:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L63:
                    java.util.List r8 = (java.util.List) r8
                    r7.A(r8)
                    kotlin.Unit r7 = kotlin.Unit.f142422a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: Dn.I.a.b.emit(Dn.I$b$b, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return I.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f6807a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f interfaceC17152fG = C17154h.g(C17154h.q(I.this.addressLookUpFlow, 300L), new C0102a(null));
                b bVar = new b(I.this);
                this.f6807a = 1;
                if (interfaceC17152fG.collect(bVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LDn/I$b;", "", "<init>", "()V", "b", "c", "a", "LDn/I$b$a;", "LDn/I$b$b;", "LDn/I$b$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LDn/I$b$a;", "LDn/I$b;", "LDn/A;", "selectedAddressSuggestion", "<init>", "(LDn/A;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LDn/A;", "()LDn/A;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Dn.I$b$a, reason: from toString */
        public static final /* data */ class CompleteAddressItemClickAction extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AddressPrediction selectedAddressSuggestion;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CompleteAddressItemClickAction) && Intrinsics.e(this.selectedAddressSuggestion, ((CompleteAddressItemClickAction) other).selectedAddressSuggestion);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CompleteAddressItemClickAction(AddressPrediction selectedAddressSuggestion) {
                super(null);
                Intrinsics.j(selectedAddressSuggestion, "selectedAddressSuggestion");
                this.selectedAddressSuggestion = selectedAddressSuggestion;
            }

            /* renamed from: a, reason: from getter */
            public final AddressPrediction getSelectedAddressSuggestion() {
                return this.selectedAddressSuggestion;
            }

            public int hashCode() {
                return this.selectedAddressSuggestion.hashCode();
            }

            public String toString() {
                return "CompleteAddressItemClickAction(selectedAddressSuggestion=" + this.selectedAddressSuggestion + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LDn/I$b$b;", "LDn/I$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Dn.I$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0104b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C0104b f6818a = new C0104b();

            private C0104b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0104b);
            }

            public String toString() {
                return "SearchButtonClickAction";
            }

            public int hashCode() {
                return -286984511;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LDn/I$b$c;", "LDn/I$b;", "", "searchQuery", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Dn.I$b$c, reason: from toString */
        public static final /* data */ class SetSearchQuery extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String searchQuery;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetSearchQuery) && Intrinsics.e(this.searchQuery, ((SetSearchQuery) other).searchQuery);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetSearchQuery(String searchQuery) {
                super(null);
                Intrinsics.j(searchQuery, "searchQuery");
                this.searchQuery = searchQuery;
            }

            /* renamed from: a, reason: from getter */
            public final String getSearchQuery() {
                return this.searchQuery;
            }

            public int hashCode() {
                return this.searchQuery.hashCode();
            }

            public String toString() {
                return "SetSearchQuery(searchQuery=" + this.searchQuery + ')';
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"LDn/I$c;", "", "<init>", "()V", "a", "LDn/I$c$a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LDn/I$c$a;", "LDn/I$c;", "LDh/a;", "predictedAddressSelection", "<init>", "(LDh/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LDh/a;", "()LDh/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Dn.I$c$a, reason: from toString */
        public static final /* data */ class CompleteSearchEvent extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AccountAddress predictedAddressSelection;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CompleteSearchEvent) && Intrinsics.e(this.predictedAddressSelection, ((CompleteSearchEvent) other).predictedAddressSelection);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CompleteSearchEvent(AccountAddress predictedAddressSelection) {
                super(null);
                Intrinsics.j(predictedAddressSelection, "predictedAddressSelection");
                this.predictedAddressSelection = predictedAddressSelection;
            }

            /* renamed from: a, reason: from getter */
            public final AccountAddress getPredictedAddressSelection() {
                return this.predictedAddressSelection;
            }

            public int hashCode() {
                return this.predictedAddressSelection.hashCode();
            }

            public String toString() {
                return "CompleteSearchEvent(predictedAddressSelection=" + this.predictedAddressSelection + ')';
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e¨\u0006\u001e"}, d2 = {"LDn/I$d;", "", "", "LDn/A;", "addressPredictions", "", "allowManualAdd", "", "searchQuery", "<init>", "(Ljava/util/List;ZLjava/lang/String;)V", "a", "(Ljava/util/List;ZLjava/lang/String;)LDn/I$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Z", "d", "()Z", "Ljava/lang/String;", "e", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Dn.I$d, reason: from toString */
    public static final /* data */ class SearchAddressViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<AddressPrediction> addressPredictions;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean allowManualAdd;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String searchQuery;

        public SearchAddressViewState() {
            this(null, false, null, 7, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchAddressViewState)) {
                return false;
            }
            SearchAddressViewState searchAddressViewState = (SearchAddressViewState) other;
            return Intrinsics.e(this.addressPredictions, searchAddressViewState.addressPredictions) && this.allowManualAdd == searchAddressViewState.allowManualAdd && Intrinsics.e(this.searchQuery, searchAddressViewState.searchQuery);
        }

        public SearchAddressViewState(List<AddressPrediction> addressPredictions, boolean z10, String searchQuery) {
            Intrinsics.j(addressPredictions, "addressPredictions");
            Intrinsics.j(searchQuery, "searchQuery");
            this.addressPredictions = addressPredictions;
            this.allowManualAdd = z10;
            this.searchQuery = searchQuery;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SearchAddressViewState b(SearchAddressViewState searchAddressViewState, List list, boolean z10, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = searchAddressViewState.addressPredictions;
            }
            if ((i10 & 2) != 0) {
                z10 = searchAddressViewState.allowManualAdd;
            }
            if ((i10 & 4) != 0) {
                str = searchAddressViewState.searchQuery;
            }
            return searchAddressViewState.a(list, z10, str);
        }

        public final SearchAddressViewState a(List<AddressPrediction> addressPredictions, boolean allowManualAdd, String searchQuery) {
            Intrinsics.j(addressPredictions, "addressPredictions");
            Intrinsics.j(searchQuery, "searchQuery");
            return new SearchAddressViewState(addressPredictions, allowManualAdd, searchQuery);
        }

        public final List<AddressPrediction> c() {
            return this.addressPredictions;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getAllowManualAdd() {
            return this.allowManualAdd;
        }

        /* renamed from: e, reason: from getter */
        public final String getSearchQuery() {
            return this.searchQuery;
        }

        public int hashCode() {
            return (((this.addressPredictions.hashCode() * 31) + Boolean.hashCode(this.allowManualAdd)) * 31) + this.searchQuery.hashCode();
        }

        public String toString() {
            return "SearchAddressViewState(addressPredictions=" + this.addressPredictions + ", allowManualAdd=" + this.allowManualAdd + ", searchQuery=" + this.searchQuery + ')';
        }

        public /* synthetic */ SearchAddressViewState(List list, boolean z10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? CollectionsKt.m() : list, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? "" : str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.SearchDeliveryAddressViewModel", f = "SearchDeliveryAddressViewModel.kt", l = {124, l3.f92485d}, m = "completeAddressSelection")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f6824a;

        /* renamed from: b, reason: collision with root package name */
        Object f6825b;

        /* renamed from: c, reason: collision with root package name */
        Object f6826c;

        /* renamed from: d, reason: collision with root package name */
        int f6827d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f6828e;

        /* renamed from: g, reason: collision with root package name */
        int f6830g;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6828e = obj;
            this.f6830g |= Integer.MIN_VALUE;
            return I.this.s(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LBn/a;", "<anonymous>", "(Lqv/O;)LBn/a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.SearchDeliveryAddressViewModel$getAddressInfo$2", f = "SearchDeliveryAddressViewModel.kt", l = {}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super AddressInfo>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f6831a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AddressPrediction f6833c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(AddressPrediction addressPrediction, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f6833c = addressPrediction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return I.this.new f(this.f6833c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super AddressInfo> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f6831a == 0) {
                ResultKt.b(obj);
                return new B().a(I.this.placesClient, this.f6833c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "LDn/A;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.SearchDeliveryAddressViewModel$getAddressPredictions$2", f = "SearchDeliveryAddressViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends AddressPrediction>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f6834a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LatLngBounds f6835b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AutocompleteSessionToken f6836c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f6837d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ I f6838e;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends AddressPrediction>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<AddressPrediction>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(LatLngBounds latLngBounds, AutocompleteSessionToken autocompleteSessionToken, String str, I i10, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f6835b = latLngBounds;
            this.f6836c = autocompleteSessionToken;
            this.f6837d = str;
            this.f6838e = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new g(this.f6835b, this.f6836c, this.f6837d, this.f6838e, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<AddressPrediction>> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RectangularBounds rectangularBoundsNewInstance;
            IntrinsicsKt.f();
            if (this.f6834a == 0) {
                ResultKt.b(obj);
                FindAutocompletePredictionsRequest.Builder builder = FindAutocompletePredictionsRequest.builder();
                LatLngBounds latLngBounds = this.f6835b;
                if (latLngBounds != null) {
                    rectangularBoundsNewInstance = RectangularBounds.newInstance(latLngBounds);
                } else {
                    rectangularBoundsNewInstance = null;
                }
                FindAutocompletePredictionsRequest findAutocompletePredictionsRequestBuild = builder.setLocationBias(rectangularBoundsNewInstance).setTypesFilter(CollectionsKt.e(PlaceTypes.ADDRESS)).setSessionToken(this.f6836c).setQuery(this.f6837d).build();
                Intrinsics.i(findAutocompletePredictionsRequestBuild, "build(...)");
                AbstractC5232j<FindAutocompletePredictionsResponse> abstractC5232jFindAutocompletePredictions = this.f6838e.placesClient.findAutocompletePredictions(findAutocompletePredictionsRequestBuild);
                B b10 = new B();
                AutocompleteSessionToken autocompleteSessionToken = this.f6836c;
                Intrinsics.g(abstractC5232jFindAutocompletePredictions);
                return b10.b(autocompleteSessionToken, abstractC5232jFindAutocompletePredictions);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.SearchDeliveryAddressViewModel$onAction$1", f = "SearchDeliveryAddressViewModel.kt", l = {109}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f6839a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f6841c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(b bVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f6841c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return I.this.new h(this.f6841c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f6839a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                I i11 = I.this;
                b.CompleteAddressItemClickAction completeAddressItemClickAction = (b.CompleteAddressItemClickAction) this.f6841c;
                this.f6839a = 1;
                if (i11.s(completeAddressItemClickAction, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.SearchDeliveryAddressViewModel$onAction$2", f = "SearchDeliveryAddressViewModel.kt", l = {114}, m = "invokeSuspend")
    static final class i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f6842a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f6844c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(b bVar, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f6844c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return I.this.new i(this.f6844c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f6842a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = I.this.addressLookUpFlow;
                b bVar = this.f6844c;
                this.f6842a = 1;
                if (interfaceC17139A.emit(bVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    public I(PlacesClient placesClient) {
        Intrinsics.j(placesClient, "placesClient");
        this.placesClient = placesClient;
        this.addressLookUpFlow = C17146H.b(0, 0, null, 7, null);
        InterfaceC17140B<SearchAddressViewState> interfaceC17140BA = S.a(new SearchAddressViewState(null, false, null, 7, null));
        this._searchAddressViewState = interfaceC17140BA;
        this.searchAddressViewState = C17154h.c(interfaceC17140BA);
        InterfaceC17139A<c> interfaceC17139AB = C17146H.b(0, 0, null, 7, null);
        this._eventFlow = interfaceC17139AB;
        this.eventFlow = C17154h.b(interfaceC17139AB);
        AutocompleteSessionToken autocompleteSessionTokenNewInstance = AutocompleteSessionToken.newInstance();
        Intrinsics.i(autocompleteSessionTokenNewInstance, "newInstance(...)");
        this.sessionToken = autocompleteSessionTokenNewInstance;
        C16648k.d(d0.a(this), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(Dn.I.b.CompleteAddressItemClickAction r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof Dn.I.e
            if (r0 == 0) goto L13
            r0 = r14
            Dn.I$e r0 = (Dn.I.e) r0
            int r1 = r0.f6830g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6830g = r1
            goto L18
        L13:
            Dn.I$e r0 = new Dn.I$e
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f6828e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f6830g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r13 = r0.f6826c
            Dh.a r13 = (Dh.AccountAddress) r13
            java.lang.Object r13 = r0.f6825b
            Dh.a r13 = (Dh.AccountAddress) r13
            java.lang.Object r0 = r0.f6824a
            Dn.I$b$a r0 = (Dn.I.b.CompleteAddressItemClickAction) r0
            kotlin.ResultKt.b(r14)
            goto L99
        L38:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L40:
            java.lang.Object r13 = r0.f6824a
            Dn.I$b$a r13 = (Dn.I.b.CompleteAddressItemClickAction) r13
            kotlin.ResultKt.b(r14)
            goto L5a
        L48:
            kotlin.ResultKt.b(r14)
            Dn.A r14 = r13.getSelectedAddressSuggestion()
            r0.f6824a = r13
            r0.f6830g = r4
            java.lang.Object r14 = r12.u(r14, r0)
            if (r14 != r1) goto L5a
            goto L97
        L5a:
            r4 = r14
            Bn.a r4 = (Bn.AddressInfo) r4
            if (r4 == 0) goto L9e
            java.lang.String r5 = r4.getZipCode()
            r9 = 4
            r10 = 0
            java.lang.String r6 = " "
            java.lang.String r7 = ""
            r8 = 0
            java.lang.String r9 = kotlin.text.StringsKt.Q(r5, r6, r7, r8, r9, r10)
            r10 = 15
            r11 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            Bn.a r14 = Bn.AddressInfo.b(r4, r5, r6, r7, r8, r9, r10, r11)
            Dh.a r14 = Bn.b.a(r14)
            if (r14 == 0) goto L9e
            tv.A<Dn.I$c> r2 = r12._eventFlow
            Dn.I$c$a r4 = new Dn.I$c$a
            r4.<init>(r14)
            r0.f6824a = r13
            r0.f6825b = r14
            r0.f6826c = r14
            r13 = 0
            r0.f6827d = r13
            r0.f6830g = r3
            java.lang.Object r13 = r2.emit(r4, r0)
            if (r13 != r1) goto L98
        L97:
            return r1
        L98:
            r13 = r14
        L99:
            if (r13 == 0) goto L9e
            kotlin.Unit r13 = kotlin.Unit.f142422a
            return r13
        L9e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Failed to fetch address details"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Dn.I.s(Dn.I$b$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void A(List<AddressPrediction> addressPredictions) {
        SearchAddressViewState value;
        Intrinsics.j(addressPredictions, "addressPredictions");
        if (addressPredictions.isEmpty()) {
            InterfaceC17140B<SearchAddressViewState> interfaceC17140B = this._searchAddressViewState;
            do {
                value = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value, SearchAddressViewState.b(value, CollectionsKt.m(), true, null, 4, null)));
        } else {
            InterfaceC17140B<SearchAddressViewState> interfaceC17140B2 = this._searchAddressViewState;
            while (true) {
                SearchAddressViewState value2 = interfaceC17140B2.getValue();
                List<AddressPrediction> list = addressPredictions;
                if (interfaceC17140B2.e(value2, SearchAddressViewState.b(value2, list, false, null, 4, null))) {
                    return;
                } else {
                    addressPredictions = list;
                }
            }
        }
    }

    public final InterfaceC17144F<c> w() {
        return this.eventFlow;
    }

    public final P<SearchAddressViewState> x() {
        return this.searchAddressViewState;
    }

    public final void y(b action) {
        SearchAddressViewState value;
        Intrinsics.j(action, "action");
        if (action instanceof b.CompleteAddressItemClickAction) {
            C16648k.d(d0.a(this), null, null, new h(action, null), 3, null);
            return;
        }
        if (action instanceof b.C0104b) {
            C16648k.d(d0.a(this), null, null, new i(action, null), 3, null);
        } else {
            if (!(action instanceof b.SetSearchQuery)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC17140B<SearchAddressViewState> interfaceC17140B = this._searchAddressViewState;
            do {
                value = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value, SearchAddressViewState.b(value, null, false, ((b.SetSearchQuery) action).getSearchQuery(), 3, null)));
            Unit unit = Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(String str, LatLngBounds latLngBounds, AutocompleteSessionToken autocompleteSessionToken, Continuation<? super List<AddressPrediction>> continuation) {
        return v(latLngBounds, str, autocompleteSessionToken, continuation);
    }

    private final Object u(AddressPrediction addressPrediction, Continuation<? super AddressInfo> continuation) {
        return C16644i.g(C16639f0.a(), new f(addressPrediction, null), continuation);
    }

    private final Object v(LatLngBounds latLngBounds, String str, AutocompleteSessionToken autocompleteSessionToken, Continuation<? super List<AddressPrediction>> continuation) {
        return C16644i.g(C16639f0.a(), new g(latLngBounds, autocompleteSessionToken, str, this, null), continuation);
    }
}
