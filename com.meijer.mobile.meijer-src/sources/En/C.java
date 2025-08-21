package En;

import Cn.AddressInfo;
import Eh.AccountAddress;
import Vd.AbstractC5516j;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
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
import mv.C15800f0;
import mv.C15805i;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.InterfaceC16562g;
import pv.P;
import pv.S;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 <2\u00020\u0001:\u0004<0,2B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nJ.\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\r¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020/0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010(R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020+048F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020/088F¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006="}, d2 = {"LEn/C;", "Landroidx/lifecycle/c0;", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "placesClient", "<init>", "(Lcom/google/android/libraries/places/api/net/PlacesClient;)V", "LEn/C$c$c;", "action", "", "t", "(LEn/C$c$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "searchTerm", "Lcom/google/android/gms/maps/model/LatLngBounds;", "bounds", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "sessionToken", "", "LEn/A;", "u", "(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addressPrediction", "LCn/a;", "v", "(LEn/A;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "w", "(Lcom/google/android/gms/maps/model/LatLngBounds;Ljava/lang/String;Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LEn/C$c;", "A", "(LEn/C$c;)V", "addressPredictions", "B", "(Ljava/util/List;)V", "x", "()Lcom/google/android/gms/maps/model/LatLngBounds;", "a", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "Lpv/A;", "LEn/C$c$e;", "b", "Lpv/A;", "addressLookUpFlow", "Lpv/B;", "LEn/C$f;", "c", "Lpv/B;", "_viewState", "LEn/C$d;", "d", "_events", "e", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "Lpv/P;", "y", "()Lpv/P;", "viewState", "Lpv/F;", "getEvents", "()Lpv/F;", "events", "f", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class C extends c0 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f7762g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final PlacesClient placesClient;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<c.SearchStartedAction> addressLookUpFlow;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _viewState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<d> _events;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AutocompleteSessionToken sessionToken;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LEn/C$c$e;", "it", "", "<anonymous>", "(LEn/C$c$e;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressSearchViewModel$1", f = "AddressSearchViewModel.kt", l = {62}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<c.SearchStartedAction, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f7768a;

        /* renamed from: b, reason: collision with root package name */
        int f7769b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f7770c;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = C.this.new a(continuation);
            aVar.f7770c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c.SearchStartedAction searchStartedAction, Continuation<? super Unit> continuation) {
            return ((a) create(searchStartedAction, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C c10;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f7769b;
            if (i10 != 0) {
                if (i10 == 1) {
                    c10 = (C) this.f7768a;
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                c.SearchStartedAction searchStartedAction = (c.SearchStartedAction) this.f7770c;
                C c11 = C.this;
                String searchTerm = searchStartedAction.getSearchTerm();
                LatLngBounds bounds = searchStartedAction.getBounds();
                AutocompleteSessionToken autocompleteSessionToken = C.this.sessionToken;
                this.f7770c = searchStartedAction;
                this.f7768a = c11;
                this.f7769b = 1;
                obj = c11.u(searchTerm, bounds, autocompleteSessionToken, this);
                if (obj == objF) {
                    return objF;
                }
                c10 = c11;
            }
            c10.B((List) obj);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "LEn/C$c$e;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressSearchViewModel$2", f = "AddressSearchViewModel.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function3<InterfaceC16562g<? super c.SearchStartedAction>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f7772a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f7773b;

        b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super c.SearchStartedAction> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            b bVar = new b(continuation);
            bVar.f7773b = th2;
            return bVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f7772a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.e((Throwable) this.f7773b);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LEn/C$c;", "", "<init>", "()V", "b", "d", "e", "c", "a", "LEn/C$c$a;", "LEn/C$c$b;", "LEn/C$c$c;", "LEn/C$c$d;", "LEn/C$c$e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LEn/C$c$a;", "LEn/C$c;", "Lbk/a;", "autoFillAddress", "<init>", "(Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "()Lbk/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: En.C$c$a, reason: from toString */
        public static final /* data */ class AutoFillSearchAction extends c {

            /* renamed from: b, reason: collision with root package name */
            public static final int f7774b = AbstractC6392a.f60445b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC6392a autoFillAddress;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AutoFillSearchAction) && Intrinsics.e(this.autoFillAddress, ((AutoFillSearchAction) other).autoFillAddress);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AutoFillSearchAction(AbstractC6392a autoFillAddress) {
                super(null);
                Intrinsics.j(autoFillAddress, "autoFillAddress");
                this.autoFillAddress = autoFillAddress;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC6392a getAutoFillAddress() {
                return this.autoFillAddress;
            }

            public int hashCode() {
                return this.autoFillAddress.hashCode();
            }

            public String toString() {
                return "AutoFillSearchAction(autoFillAddress=" + this.autoFillAddress + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEn/C$c$b;", "LEn/C$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final b f7776a = new b();

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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LEn/C$c$c;", "LEn/C$c;", "LEn/A;", "selectedAddressSuggestion", "<init>", "(LEn/A;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LEn/A;", "()LEn/A;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: En.C$c$c, reason: collision with other inner class name and from toString */
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEn/C$c$d;", "LEn/C$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final d f7778a = new d();

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

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"LEn/C$c$e;", "LEn/C$c;", "", "searchTerm", "Lcom/google/android/gms/maps/model/LatLngBounds;", "bounds", "<init>", "(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLngBounds;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/google/android/gms/maps/model/LatLngBounds;", "()Lcom/google/android/gms/maps/model/LatLngBounds;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: En.C$c$e, reason: from toString */
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

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LEn/C$d;", "", "<init>", "()V", "b", "a", "c", "d", "LEn/C$d$a;", "LEn/C$d$b;", "LEn/C$d$c;", "LEn/C$d$d;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class d {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LEn/C$d$a;", "LEn/C$d;", "Lbk/a;", "autoFillAddressSelection", "<init>", "(Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "()Lbk/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: En.C$d$a, reason: from toString */
        public static final /* data */ class AddressAutoFillEvent extends d {

            /* renamed from: b, reason: collision with root package name */
            public static final int f7781b = AbstractC6392a.f60445b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC6392a autoFillAddressSelection;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AddressAutoFillEvent) && Intrinsics.e(this.autoFillAddressSelection, ((AddressAutoFillEvent) other).autoFillAddressSelection);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddressAutoFillEvent(AbstractC6392a autoFillAddressSelection) {
                super(null);
                Intrinsics.j(autoFillAddressSelection, "autoFillAddressSelection");
                this.autoFillAddressSelection = autoFillAddressSelection;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC6392a getAutoFillAddressSelection() {
                return this.autoFillAddressSelection;
            }

            public int hashCode() {
                return this.autoFillAddressSelection.hashCode();
            }

            public String toString() {
                return "AddressAutoFillEvent(autoFillAddressSelection=" + this.autoFillAddressSelection + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"LEn/C$d$b;", "LEn/C$d;", "", "messageResId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getMessageResId", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: En.C$d$b, reason: from toString */
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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LEn/C$d$c;", "LEn/C$d;", "LEh/a;", "predictedAddressSelection", "<init>", "(LEh/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LEh/a;", "()LEh/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: En.C$d$c, reason: from toString */
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEn/C$d$d;", "LEn/C$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: En.C$d$d, reason: collision with other inner class name */
        public static final /* data */ class C0154d extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final C0154d f7785a = new C0154d();

            private C0154d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0154d);
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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LEn/C$f;", "", "", "LEn/A;", "addressPredictions", "", "allowManualAdd", "<init>", "(Ljava/util/List;Z)V", "a", "(Ljava/util/List;Z)LEn/C$f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Z", "d", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: En.C$f, reason: from toString */
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
        Object f7788a;

        /* renamed from: b, reason: collision with root package name */
        Object f7789b;

        /* renamed from: c, reason: collision with root package name */
        Object f7790c;

        /* renamed from: d, reason: collision with root package name */
        int f7791d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f7792e;

        /* renamed from: g, reason: collision with root package name */
        int f7794g;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7792e = obj;
            this.f7794g |= Integer.MIN_VALUE;
            return C.this.t(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LCn/a;", "<anonymous>", "(Lmv/O;)LCn/a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressSearchViewModel$getAddressInfo$2", f = "AddressSearchViewModel.kt", l = {}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super AddressInfo>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f7795a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AddressPrediction f7797c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(AddressPrediction addressPrediction, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f7797c = addressPrediction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C.this.new h(this.f7797c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super AddressInfo> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f7795a == 0) {
                ResultKt.b(obj);
                return new B().a(C.this.placesClient, this.f7797c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LEn/A;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressSearchViewModel$getAddressPredictions$2", f = "AddressSearchViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends AddressPrediction>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f7798a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LatLngBounds f7799b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AutocompleteSessionToken f7800c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f7801d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C f7802e;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends AddressPrediction>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<AddressPrediction>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(LatLngBounds latLngBounds, AutocompleteSessionToken autocompleteSessionToken, String str, C c10, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f7799b = latLngBounds;
            this.f7800c = autocompleteSessionToken;
            this.f7801d = str;
            this.f7802e = c10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new i(this.f7799b, this.f7800c, this.f7801d, this.f7802e, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<AddressPrediction>> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RectangularBounds rectangularBoundsNewInstance;
            IntrinsicsKt.f();
            if (this.f7798a == 0) {
                ResultKt.b(obj);
                FindAutocompletePredictionsRequest.Builder builder = FindAutocompletePredictionsRequest.builder();
                LatLngBounds latLngBounds = this.f7799b;
                if (latLngBounds != null) {
                    rectangularBoundsNewInstance = RectangularBounds.newInstance(latLngBounds);
                } else {
                    rectangularBoundsNewInstance = null;
                }
                FindAutocompletePredictionsRequest findAutocompletePredictionsRequestBuild = builder.setLocationBias(rectangularBoundsNewInstance).setTypesFilter(CollectionsKt.e(PlaceTypes.ADDRESS)).setSessionToken(this.f7800c).setQuery(this.f7801d).build();
                Intrinsics.i(findAutocompletePredictionsRequestBuild, "build(...)");
                AbstractC5516j<FindAutocompletePredictionsResponse> abstractC5516jFindAutocompletePredictions = this.f7802e.placesClient.findAutocompletePredictions(findAutocompletePredictionsRequestBuild);
                B b10 = new B();
                AutocompleteSessionToken autocompleteSessionToken = this.f7800c;
                Intrinsics.g(abstractC5516jFindAutocompletePredictions);
                return b10.b(autocompleteSessionToken, abstractC5516jFindAutocompletePredictions);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressSearchViewModel$onAction$2", f = "AddressSearchViewModel.kt", l = {111}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f7803a;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f7803a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C.this._events;
                d.C0154d c0154d = d.C0154d.f7785a;
                this.f7803a = 1;
                if (interfaceC16548A.emit(c0154d, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressSearchViewModel$onAction$3", f = "AddressSearchViewModel.kt", l = {115}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f7805a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f7807c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(c cVar, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f7807c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C.this.new k(this.f7807c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f7805a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C.this.addressLookUpFlow;
                c cVar = this.f7807c;
                this.f7805a = 1;
                if (interfaceC16548A.emit(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressSearchViewModel$onAction$4", f = "AddressSearchViewModel.kt", l = {BinsView.TOTE_HEIGHT_DP}, m = "invokeSuspend")
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f7808a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f7810c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(c cVar, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f7810c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C.this.new l(this.f7810c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f7808a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C c10 = C.this;
                c.CompleteSearchAction completeSearchAction = (c.CompleteSearchAction) this.f7810c;
                this.f7808a = 1;
                if (c10.t(completeSearchAction, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressSearchViewModel$onAction$5", f = "AddressSearchViewModel.kt", l = {l3.f93324d}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f7811a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f7813c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(c cVar, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f7813c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C.this.new m(this.f7813c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f7811a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16549B interfaceC16549B = C.this._viewState;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, false, 1, null)));
                InterfaceC16548A interfaceC16548A = C.this._events;
                d.AddressAutoFillEvent addressAutoFillEvent = new d.AddressAutoFillEvent(((c.AutoFillSearchAction) this.f7813c).getAutoFillAddress());
                this.f7811a = 1;
                if (interfaceC16548A.emit(addressAutoFillEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressSearchViewModel$postAddressSuggestionsToUi$1", f = "AddressSearchViewModel.kt", l = {217}, m = "invokeSuspend")
    static final class n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f7814a;

        n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C.this.new n(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f7814a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C.this._events;
                d.AddressSuggestionListSuccessEvent addressSuggestionListSuccessEvent = new d.AddressSuggestionListSuccessEvent(Y.f100544M);
                this.f7814a = 1;
                if (interfaceC16548A.emit(addressSuggestionListSuccessEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C(PlacesClient placesClient) {
        Intrinsics.j(placesClient, "placesClient");
        this.placesClient = placesClient;
        InterfaceC16548A<c.SearchStartedAction> interfaceC16548AB = C16555H.b(0, 0, null, 7, null);
        this.addressLookUpFlow = interfaceC16548AB;
        this._viewState = S.a(new ViewState(null, false, 3, 0 == true ? 1 : 0));
        this._events = C16555H.b(0, 0, null, 7, null);
        AutocompleteSessionToken autocompleteSessionTokenNewInstance = AutocompleteSessionToken.newInstance();
        Intrinsics.i(autocompleteSessionTokenNewInstance, "newInstance(...)");
        this.sessionToken = autocompleteSessionTokenNewInstance;
        C16563h.J(C16563h.g(C16563h.O(C16563h.q(interfaceC16548AB, 300L), new a(null)), new b(null)), d0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(En.C.c.CompleteSearchAction r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof En.C.g
            if (r0 == 0) goto L13
            r0 = r14
            En.C$g r0 = (En.C.g) r0
            int r1 = r0.f7794g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7794g = r1
            goto L18
        L13:
            En.C$g r0 = new En.C$g
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f7792e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f7794g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r13 = r0.f7790c
            Eh.a r13 = (Eh.AccountAddress) r13
            java.lang.Object r13 = r0.f7789b
            Eh.a r13 = (Eh.AccountAddress) r13
            java.lang.Object r0 = r0.f7788a
            En.C$c$c r0 = (En.C.c.CompleteSearchAction) r0
            kotlin.ResultKt.b(r14)
            goto L99
        L38:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L40:
            java.lang.Object r13 = r0.f7788a
            En.C$c$c r13 = (En.C.c.CompleteSearchAction) r13
            kotlin.ResultKt.b(r14)
            goto L5a
        L48:
            kotlin.ResultKt.b(r14)
            En.A r14 = r13.getSelectedAddressSuggestion()
            r0.f7788a = r13
            r0.f7794g = r4
            java.lang.Object r14 = r12.v(r14, r0)
            if (r14 != r1) goto L5a
            goto L97
        L5a:
            r4 = r14
            Cn.a r4 = (Cn.AddressInfo) r4
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
            Cn.a r14 = Cn.AddressInfo.b(r4, r5, r6, r7, r8, r9, r10, r11)
            Eh.a r14 = Cn.b.a(r14)
            if (r14 == 0) goto L9e
            pv.A<En.C$d> r2 = r12._events
            En.C$d$c r4 = new En.C$d$c
            r4.<init>(r14)
            r0.f7788a = r13
            r0.f7789b = r14
            r0.f7790c = r14
            r13 = 0
            r0.f7791d = r13
            r0.f7794g = r3
            java.lang.Object r13 = r2.emit(r4, r0)
            if (r13 != r1) goto L98
        L97:
            return r1
        L98:
            r13 = r14
        L99:
            if (r13 == 0) goto L9e
            kotlin.Unit r13 = kotlin.Unit.f143329a
            return r13
        L9e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Failed to fetch address details"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: En.C.t(En.C$c$c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void A(c action) {
        ViewState value;
        Intrinsics.j(action, "action");
        if (Intrinsics.e(action, c.b.f7776a)) {
            InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, value.a(CollectionsKt.m(), true)));
            Unit unit = Unit.f143329a;
            return;
        }
        if (Intrinsics.e(action, c.d.f7778a)) {
            C15809k.d(d0.a(this), null, null, new j(null), 3, null);
            return;
        }
        if (action instanceof c.SearchStartedAction) {
            C15809k.d(d0.a(this), null, null, new k(action, null), 3, null);
        } else if (action instanceof c.CompleteSearchAction) {
            C15809k.d(d0.a(this), null, null, new l(action, null), 3, null);
        } else {
            if (!(action instanceof c.AutoFillSearchAction)) {
                throw new NoWhenBranchMatchedException();
            }
            C15809k.d(d0.a(this), null, null, new m(action, null), 3, null);
        }
    }

    public final void B(List<AddressPrediction> addressPredictions) {
        ViewState value;
        ViewState value2;
        Intrinsics.j(addressPredictions, "addressPredictions");
        if (addressPredictions.isEmpty()) {
            InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, value.a(CollectionsKt.m(), true)));
        } else {
            C15809k.d(d0.a(this), null, null, new n(null), 3, null);
            InterfaceC16549B<ViewState> interfaceC16549B2 = this._viewState;
            do {
                value2 = interfaceC16549B2.getValue();
            } while (!interfaceC16549B2.e(value2, value2.a(addressPredictions, false)));
        }
    }

    public final InterfaceC16553F<d> getEvents() {
        return C16563h.b(this._events);
    }

    public final LatLngBounds x() {
        return new LatLngBounds(new LatLng(20.0d, -170.0d), new LatLng(75.0d, -50.0d));
    }

    public final P<ViewState> y() {
        return C16563h.c(this._viewState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u(String str, LatLngBounds latLngBounds, AutocompleteSessionToken autocompleteSessionToken, Continuation<? super List<AddressPrediction>> continuation) {
        return w(latLngBounds, str, autocompleteSessionToken, continuation);
    }

    private final Object v(AddressPrediction addressPrediction, Continuation<? super AddressInfo> continuation) {
        return C15805i.g(C15800f0.a(), new h(addressPrediction, null), continuation);
    }

    private final Object w(LatLngBounds latLngBounds, String str, AutocompleteSessionToken autocompleteSessionToken, Continuation<? super List<AddressPrediction>> continuation) {
        return C15805i.g(C15800f0.a(), new i(latLngBounds, autocompleteSessionToken, str, this, null), continuation);
    }
}
