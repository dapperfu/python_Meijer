package Dn;

import Bn.AddressInfo;
import Dh.AccountAddress;
import Td.AbstractC5232j;
import ak.AbstractC5607a;
import androidx.view.c0;
import androidx.view.d0;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.libraries.places.api.model.RectangularBounds;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.meijer.Y;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
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
import tv.InterfaceC17153g;
import tv.P;
import tv.S;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 <2\u00020\u0001:\u0004<0,2B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nJ.\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\r¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020/0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010(R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020+048F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020/088F¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006="}, d2 = {"LDn/C;", "Landroidx/lifecycle/c0;", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "placesClient", "<init>", "(Lcom/google/android/libraries/places/api/net/PlacesClient;)V", "LDn/C$c$c;", "action", "", "t", "(LDn/C$c$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "searchTerm", "Lcom/google/android/gms/maps/model/LatLngBounds;", "bounds", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "sessionToken", "", "LDn/A;", "u", "(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addressPrediction", "LBn/a;", "v", "(LDn/A;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "w", "(Lcom/google/android/gms/maps/model/LatLngBounds;Ljava/lang/String;Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LDn/C$c;", "A", "(LDn/C$c;)V", "addressPredictions", "B", "(Ljava/util/List;)V", "x", "()Lcom/google/android/gms/maps/model/LatLngBounds;", "a", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "Ltv/A;", "LDn/C$c$e;", "b", "Ltv/A;", "addressLookUpFlow", "Ltv/B;", "LDn/C$f;", "c", "Ltv/B;", "_viewState", "LDn/C$d;", "d", "_events", "e", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "Ltv/P;", "y", "()Ltv/P;", "viewState", "Ltv/F;", "getEvents", "()Ltv/F;", "events", "f", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class C extends c0 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f6736g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final PlacesClient placesClient;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<c.SearchStartedAction> addressLookUpFlow;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ViewState> _viewState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<d> _events;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AutocompleteSessionToken sessionToken;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LDn/C$c$e;", "it", "", "<anonymous>", "(LDn/C$c$e;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressSearchViewModel$1", f = "AddressSearchViewModel.kt", l = {62}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<c.SearchStartedAction, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f6742a;

        /* renamed from: b, reason: collision with root package name */
        int f6743b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f6744c;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = C.this.new a(continuation);
            aVar.f6744c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c.SearchStartedAction searchStartedAction, Continuation<? super Unit> continuation) {
            return ((a) create(searchStartedAction, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C c10;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f6743b;
            if (i10 != 0) {
                if (i10 == 1) {
                    c10 = (C) this.f6742a;
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                c.SearchStartedAction searchStartedAction = (c.SearchStartedAction) this.f6744c;
                C c11 = C.this;
                String searchTerm = searchStartedAction.getSearchTerm();
                LatLngBounds bounds = searchStartedAction.getBounds();
                AutocompleteSessionToken autocompleteSessionToken = C.this.sessionToken;
                this.f6744c = searchStartedAction;
                this.f6742a = c11;
                this.f6743b = 1;
                obj = c11.u(searchTerm, bounds, autocompleteSessionToken, this);
                if (obj == objF) {
                    return objF;
                }
                c10 = c11;
            }
            c10.B((List) obj);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "LDn/C$c$e;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressSearchViewModel$2", f = "AddressSearchViewModel.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function3<InterfaceC17153g<? super c.SearchStartedAction>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f6746a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f6747b;

        b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super c.SearchStartedAction> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            b bVar = new b(continuation);
            bVar.f6747b = th2;
            return bVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f6746a == 0) {
                ResultKt.b(obj);
                uw.a.INSTANCE.e((Throwable) this.f6747b);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LDn/C$c;", "", "<init>", "()V", "b", "d", "e", "c", "a", "LDn/C$c$a;", "LDn/C$c$b;", "LDn/C$c$c;", "LDn/C$c$d;", "LDn/C$c$e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LDn/C$c$a;", "LDn/C$c;", "Lak/a;", "autoFillAddress", "<init>", "(Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "()Lak/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Dn.C$c$a, reason: from toString */
        public static final /* data */ class AutoFillSearchAction extends c {

            /* renamed from: b, reason: collision with root package name */
            public static final int f6748b = AbstractC5607a.f45514b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a autoFillAddress;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AutoFillSearchAction) && Intrinsics.e(this.autoFillAddress, ((AutoFillSearchAction) other).autoFillAddress);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AutoFillSearchAction(AbstractC5607a autoFillAddress) {
                super(null);
                Intrinsics.j(autoFillAddress, "autoFillAddress");
                this.autoFillAddress = autoFillAddress;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC5607a getAutoFillAddress() {
                return this.autoFillAddress;
            }

            public int hashCode() {
                return this.autoFillAddress.hashCode();
            }

            public String toString() {
                return "AutoFillSearchAction(autoFillAddress=" + this.autoFillAddress + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LDn/C$c$b;", "LDn/C$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final b f6750a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public String toString() {
                return "ClearSearchFieldAction";
            }

            public int hashCode() {
                return 610730682;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LDn/C$c$c;", "LDn/C$c;", "LDn/A;", "selectedAddressSuggestion", "<init>", "(LDn/A;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LDn/A;", "()LDn/A;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Dn.C$c$c, reason: collision with other inner class name and from toString */
        public static final /* data */ class CompleteSearchAction extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AddressPrediction selectedAddressSuggestion;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CompleteSearchAction) && Intrinsics.e(this.selectedAddressSuggestion, ((CompleteSearchAction) other).selectedAddressSuggestion);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CompleteSearchAction(AddressPrediction selectedAddressSuggestion) {
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
                return "CompleteSearchAction(selectedAddressSuggestion=" + this.selectedAddressSuggestion + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LDn/C$c$d;", "LDn/C$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final d f6752a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public String toString() {
                return "ExitSearchAction";
            }

            public int hashCode() {
                return -1121422853;
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"LDn/C$c$e;", "LDn/C$c;", "", "searchTerm", "Lcom/google/android/gms/maps/model/LatLngBounds;", "bounds", "<init>", "(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLngBounds;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/google/android/gms/maps/model/LatLngBounds;", "()Lcom/google/android/gms/maps/model/LatLngBounds;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Dn.C$c$e, reason: from toString */
        public static final /* data */ class SearchStartedAction extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String searchTerm;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final LatLngBounds bounds;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SearchStartedAction)) {
                    return false;
                }
                SearchStartedAction searchStartedAction = (SearchStartedAction) other;
                return Intrinsics.e(this.searchTerm, searchStartedAction.searchTerm) && Intrinsics.e(this.bounds, searchStartedAction.bounds);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SearchStartedAction(String searchTerm, LatLngBounds bounds) {
                super(null);
                Intrinsics.j(searchTerm, "searchTerm");
                Intrinsics.j(bounds, "bounds");
                this.searchTerm = searchTerm;
                this.bounds = bounds;
            }

            /* renamed from: a, reason: from getter */
            public final LatLngBounds getBounds() {
                return this.bounds;
            }

            /* renamed from: b, reason: from getter */
            public final String getSearchTerm() {
                return this.searchTerm;
            }

            public int hashCode() {
                return (this.searchTerm.hashCode() * 31) + this.bounds.hashCode();
            }

            public String toString() {
                return "SearchStartedAction(searchTerm=" + this.searchTerm + ", bounds=" + this.bounds + ')';
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LDn/C$d;", "", "<init>", "()V", "b", "a", "c", "d", "LDn/C$d$a;", "LDn/C$d$b;", "LDn/C$d$c;", "LDn/C$d$d;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class d {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LDn/C$d$a;", "LDn/C$d;", "Lak/a;", "autoFillAddressSelection", "<init>", "(Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "()Lak/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Dn.C$d$a, reason: from toString */
        public static final /* data */ class AddressAutoFillEvent extends d {

            /* renamed from: b, reason: collision with root package name */
            public static final int f6755b = AbstractC5607a.f45514b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a autoFillAddressSelection;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AddressAutoFillEvent) && Intrinsics.e(this.autoFillAddressSelection, ((AddressAutoFillEvent) other).autoFillAddressSelection);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddressAutoFillEvent(AbstractC5607a autoFillAddressSelection) {
                super(null);
                Intrinsics.j(autoFillAddressSelection, "autoFillAddressSelection");
                this.autoFillAddressSelection = autoFillAddressSelection;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC5607a getAutoFillAddressSelection() {
                return this.autoFillAddressSelection;
            }

            public int hashCode() {
                return this.autoFillAddressSelection.hashCode();
            }

            public String toString() {
                return "AddressAutoFillEvent(autoFillAddressSelection=" + this.autoFillAddressSelection + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"LDn/C$d$b;", "LDn/C$d;", "", "messageResId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getMessageResId", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Dn.C$d$b, reason: from toString */
        public static final /* data */ class AddressSuggestionListSuccessEvent extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            public AddressSuggestionListSuccessEvent(int i10) {
                super(null);
                this.messageResId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AddressSuggestionListSuccessEvent) && this.messageResId == ((AddressSuggestionListSuccessEvent) other).messageResId;
            }

            public int hashCode() {
                return Integer.hashCode(this.messageResId);
            }

            public String toString() {
                return "AddressSuggestionListSuccessEvent(messageResId=" + this.messageResId + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LDn/C$d$c;", "LDn/C$d;", "LDh/a;", "predictedAddressSelection", "<init>", "(LDh/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LDh/a;", "()LDh/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Dn.C$d$c, reason: from toString */
        public static final /* data */ class CompleteSearchEvent extends d {

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LDn/C$d$d;", "LDn/C$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Dn.C$d$d, reason: collision with other inner class name */
        public static final /* data */ class C0101d extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final C0101d f6759a = new C0101d();

            private C0101d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0101d);
            }

            public String toString() {
                return "ExitSearchEvent";
            }

            public int hashCode() {
                return -612857923;
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LDn/C$f;", "", "", "LDn/A;", "addressPredictions", "", "allowManualAdd", "<init>", "(Ljava/util/List;Z)V", "a", "(Ljava/util/List;Z)LDn/C$f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Z", "d", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Dn.C$f, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<AddressPrediction> addressPredictions;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean allowManualAdd;

        /* JADX WARN: Multi-variable type inference failed */
        public ViewState() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.addressPredictions, viewState.addressPredictions) && this.allowManualAdd == viewState.allowManualAdd;
        }

        public ViewState(List<AddressPrediction> addressPredictions, boolean z10) {
            Intrinsics.j(addressPredictions, "addressPredictions");
            this.addressPredictions = addressPredictions;
            this.allowManualAdd = z10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ViewState b(ViewState viewState, List list, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = viewState.addressPredictions;
            }
            if ((i10 & 2) != 0) {
                z10 = viewState.allowManualAdd;
            }
            return viewState.a(list, z10);
        }

        public final ViewState a(List<AddressPrediction> addressPredictions, boolean allowManualAdd) {
            Intrinsics.j(addressPredictions, "addressPredictions");
            return new ViewState(addressPredictions, allowManualAdd);
        }

        public final List<AddressPrediction> c() {
            return this.addressPredictions;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getAllowManualAdd() {
            return this.allowManualAdd;
        }

        public int hashCode() {
            return (this.addressPredictions.hashCode() * 31) + Boolean.hashCode(this.allowManualAdd);
        }

        public String toString() {
            return "ViewState(addressPredictions=" + this.addressPredictions + ", allowManualAdd=" + this.allowManualAdd + ')';
        }

        public /* synthetic */ ViewState(List list, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? CollectionsKt.m() : list, (i10 & 2) != 0 ? false : z10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressSearchViewModel", f = "AddressSearchViewModel.kt", l = {134, 137}, m = "completeAddressSelection")
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f6762a;

        /* renamed from: b, reason: collision with root package name */
        Object f6763b;

        /* renamed from: c, reason: collision with root package name */
        Object f6764c;

        /* renamed from: d, reason: collision with root package name */
        int f6765d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f6766e;

        /* renamed from: g, reason: collision with root package name */
        int f6768g;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6766e = obj;
            this.f6768g |= Integer.MIN_VALUE;
            return C.this.t(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LBn/a;", "<anonymous>", "(Lqv/O;)LBn/a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressSearchViewModel$getAddressInfo$2", f = "AddressSearchViewModel.kt", l = {}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super AddressInfo>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f6769a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AddressPrediction f6771c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(AddressPrediction addressPrediction, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f6771c = addressPrediction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C.this.new h(this.f6771c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super AddressInfo> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f6769a == 0) {
                ResultKt.b(obj);
                return new B().a(C.this.placesClient, this.f6771c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "LDn/A;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressSearchViewModel$getAddressPredictions$2", f = "AddressSearchViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends AddressPrediction>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f6772a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LatLngBounds f6773b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AutocompleteSessionToken f6774c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f6775d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C f6776e;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends AddressPrediction>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<AddressPrediction>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(LatLngBounds latLngBounds, AutocompleteSessionToken autocompleteSessionToken, String str, C c10, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f6773b = latLngBounds;
            this.f6774c = autocompleteSessionToken;
            this.f6775d = str;
            this.f6776e = c10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new i(this.f6773b, this.f6774c, this.f6775d, this.f6776e, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<AddressPrediction>> continuation) {
            return ((i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RectangularBounds rectangularBoundsNewInstance;
            IntrinsicsKt.f();
            if (this.f6772a == 0) {
                ResultKt.b(obj);
                FindAutocompletePredictionsRequest.Builder builder = FindAutocompletePredictionsRequest.builder();
                LatLngBounds latLngBounds = this.f6773b;
                if (latLngBounds != null) {
                    rectangularBoundsNewInstance = RectangularBounds.newInstance(latLngBounds);
                } else {
                    rectangularBoundsNewInstance = null;
                }
                FindAutocompletePredictionsRequest findAutocompletePredictionsRequestBuild = builder.setLocationBias(rectangularBoundsNewInstance).setTypesFilter(CollectionsKt.e(PlaceTypes.ADDRESS)).setSessionToken(this.f6774c).setQuery(this.f6775d).build();
                Intrinsics.i(findAutocompletePredictionsRequestBuild, "build(...)");
                AbstractC5232j<FindAutocompletePredictionsResponse> abstractC5232jFindAutocompletePredictions = this.f6776e.placesClient.findAutocompletePredictions(findAutocompletePredictionsRequestBuild);
                B b10 = new B();
                AutocompleteSessionToken autocompleteSessionToken = this.f6774c;
                Intrinsics.g(abstractC5232jFindAutocompletePredictions);
                return b10.b(autocompleteSessionToken, abstractC5232jFindAutocompletePredictions);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressSearchViewModel$onAction$2", f = "AddressSearchViewModel.kt", l = {111}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f6777a;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f6777a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C.this._events;
                d.C0101d c0101d = d.C0101d.f6759a;
                this.f6777a = 1;
                if (interfaceC17139A.emit(c0101d, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressSearchViewModel$onAction$3", f = "AddressSearchViewModel.kt", l = {115}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f6779a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f6781c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(c cVar, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f6781c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C.this.new k(this.f6781c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f6779a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C.this.addressLookUpFlow;
                c cVar = this.f6781c;
                this.f6779a = 1;
                if (interfaceC17139A.emit(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressSearchViewModel$onAction$4", f = "AddressSearchViewModel.kt", l = {BinsView.TOTE_HEIGHT_DP}, m = "invokeSuspend")
    static final class l extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f6782a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f6784c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(c cVar, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f6784c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C.this.new l(this.f6784c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f6782a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C c10 = C.this;
                c.CompleteSearchAction completeSearchAction = (c.CompleteSearchAction) this.f6784c;
                this.f6782a = 1;
                if (c10.t(completeSearchAction, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressSearchViewModel$onAction$5", f = "AddressSearchViewModel.kt", l = {l3.f92485d}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class m extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f6785a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f6787c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(c cVar, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f6787c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C.this.new m(this.f6787c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((m) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f6785a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17140B interfaceC17140B = C.this._viewState;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, null, false, 1, null)));
                InterfaceC17139A interfaceC17139A = C.this._events;
                d.AddressAutoFillEvent addressAutoFillEvent = new d.AddressAutoFillEvent(((c.AutoFillSearchAction) this.f6787c).getAutoFillAddress());
                this.f6785a = 1;
                if (interfaceC17139A.emit(addressAutoFillEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressSearchViewModel$postAddressSuggestionsToUi$1", f = "AddressSearchViewModel.kt", l = {217}, m = "invokeSuspend")
    static final class n extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f6788a;

        n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C.this.new n(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f6788a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C.this._events;
                d.AddressSuggestionListSuccessEvent addressSuggestionListSuccessEvent = new d.AddressSuggestionListSuccessEvent(Y.f99682M);
                this.f6788a = 1;
                if (interfaceC17139A.emit(addressSuggestionListSuccessEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C(PlacesClient placesClient) {
        Intrinsics.j(placesClient, "placesClient");
        this.placesClient = placesClient;
        InterfaceC17139A<c.SearchStartedAction> interfaceC17139AB = C17146H.b(0, 0, null, 7, null);
        this.addressLookUpFlow = interfaceC17139AB;
        this._viewState = S.a(new ViewState(null, false, 3, 0 == true ? 1 : 0));
        this._events = C17146H.b(0, 0, null, 7, null);
        AutocompleteSessionToken autocompleteSessionTokenNewInstance = AutocompleteSessionToken.newInstance();
        Intrinsics.i(autocompleteSessionTokenNewInstance, "newInstance(...)");
        this.sessionToken = autocompleteSessionTokenNewInstance;
        C17154h.J(C17154h.g(C17154h.O(C17154h.q(interfaceC17139AB, 300L), new a(null)), new b(null)), d0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(Dn.C.c.CompleteSearchAction r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof Dn.C.g
            if (r0 == 0) goto L13
            r0 = r14
            Dn.C$g r0 = (Dn.C.g) r0
            int r1 = r0.f6768g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6768g = r1
            goto L18
        L13:
            Dn.C$g r0 = new Dn.C$g
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f6766e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f6768g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r13 = r0.f6764c
            Dh.a r13 = (Dh.AccountAddress) r13
            java.lang.Object r13 = r0.f6763b
            Dh.a r13 = (Dh.AccountAddress) r13
            java.lang.Object r0 = r0.f6762a
            Dn.C$c$c r0 = (Dn.C.c.CompleteSearchAction) r0
            kotlin.ResultKt.b(r14)
            goto L99
        L38:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L40:
            java.lang.Object r13 = r0.f6762a
            Dn.C$c$c r13 = (Dn.C.c.CompleteSearchAction) r13
            kotlin.ResultKt.b(r14)
            goto L5a
        L48:
            kotlin.ResultKt.b(r14)
            Dn.A r14 = r13.getSelectedAddressSuggestion()
            r0.f6762a = r13
            r0.f6768g = r4
            java.lang.Object r14 = r12.v(r14, r0)
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
            tv.A<Dn.C$d> r2 = r12._events
            Dn.C$d$c r4 = new Dn.C$d$c
            r4.<init>(r14)
            r0.f6762a = r13
            r0.f6763b = r14
            r0.f6764c = r14
            r13 = 0
            r0.f6765d = r13
            r0.f6768g = r3
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
        throw new UnsupportedOperationException("Method not decompiled: Dn.C.t(Dn.C$c$c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void A(c action) {
        ViewState value;
        Intrinsics.j(action, "action");
        if (Intrinsics.e(action, c.b.f6750a)) {
            InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
            do {
                value = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value, value.a(CollectionsKt.m(), true)));
            Unit unit = Unit.f142422a;
            return;
        }
        if (Intrinsics.e(action, c.d.f6752a)) {
            C16648k.d(d0.a(this), null, null, new j(null), 3, null);
            return;
        }
        if (action instanceof c.SearchStartedAction) {
            C16648k.d(d0.a(this), null, null, new k(action, null), 3, null);
        } else if (action instanceof c.CompleteSearchAction) {
            C16648k.d(d0.a(this), null, null, new l(action, null), 3, null);
        } else {
            if (!(action instanceof c.AutoFillSearchAction)) {
                throw new NoWhenBranchMatchedException();
            }
            C16648k.d(d0.a(this), null, null, new m(action, null), 3, null);
        }
    }

    public final void B(List<AddressPrediction> addressPredictions) {
        ViewState value;
        ViewState value2;
        Intrinsics.j(addressPredictions, "addressPredictions");
        if (addressPredictions.isEmpty()) {
            InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
            do {
                value = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value, value.a(CollectionsKt.m(), true)));
        } else {
            C16648k.d(d0.a(this), null, null, new n(null), 3, null);
            InterfaceC17140B<ViewState> interfaceC17140B2 = this._viewState;
            do {
                value2 = interfaceC17140B2.getValue();
            } while (!interfaceC17140B2.e(value2, value2.a(addressPredictions, false)));
        }
    }

    public final InterfaceC17144F<d> getEvents() {
        return C17154h.b(this._events);
    }

    public final LatLngBounds x() {
        return new LatLngBounds(new LatLng(20.0d, -170.0d), new LatLng(75.0d, -50.0d));
    }

    public final P<ViewState> y() {
        return C17154h.c(this._viewState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u(String str, LatLngBounds latLngBounds, AutocompleteSessionToken autocompleteSessionToken, Continuation<? super List<AddressPrediction>> continuation) {
        return w(latLngBounds, str, autocompleteSessionToken, continuation);
    }

    private final Object v(AddressPrediction addressPrediction, Continuation<? super AddressInfo> continuation) {
        return C16644i.g(C16639f0.a(), new h(addressPrediction, null), continuation);
    }

    private final Object w(LatLngBounds latLngBounds, String str, AutocompleteSessionToken autocompleteSessionToken, Continuation<? super List<AddressPrediction>> continuation) {
        return C16644i.g(C16639f0.a(), new i(latLngBounds, autocompleteSessionToken, str, this, null), continuation);
    }
}
