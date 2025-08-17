package oq;

import Xp.ShopAndScanStore;
import Xp.ShopAndScanTrip;
import ak.AbstractC5607a;
import androidx.view.c0;
import androidx.view.d0;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import cq.C13413a;
import dq.C13553a;
import dq.C13555c;
import dq.C13556d;
import hq.ShopAndScanStoreDecorator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import tv.P;
import tv.S;
import xq.C18085d;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u000253B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b$\u0010\u001fJ\u001b\u0010&\u001a\u00020\u00102\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0010H\u0002¢\u0006\u0004\b(\u0010\u0012J\u001d\u0010+\u001a\u00020\u00102\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0)H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0010H\u0002¢\u0006\u0004\b-\u0010\u0012J\u000f\u0010.\u001a\u00020\u0010H\u0002¢\u0006\u0004\b.\u0010\u0012J\u0015\u00101\u001a\u00020\u00102\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020@0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001c\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001c0)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010IR\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020@0K8F¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006O"}, d2 = {"Loq/p;", "Landroidx/lifecycle/c0;", "Lxq/d;", "navigationManager", "Lcq/a;", "getStoresUseCase", "LZp/a;", "userAuthorizationUseCase", "Ldq/a;", "activeTripUseCase", "Ldq/d;", "startTripUseCase", "Ldq/c;", "resumeTripUseCase", "<init>", "(Lxq/d;Lcq/a;LZp/a;Ldq/a;Ldq/d;Ldq/c;)V", "", "I", "()V", "L", "Lkotlin/Function0;", "callback", "K", "(Lkotlin/jvm/functions/Function0;)V", "", "storeId", "Q", "(I)V", "LXp/e;", PlaceTypes.STORE, "H", "(LXp/e;)V", "LXp/f;", "activeTrip", "R", "(LXp/f;)V", "V", "messageRes", "S", "(Ljava/lang/Integer;)V", "O", "", "domain", "U", "(Ljava/util/List;)V", "T", "P", "Loq/p$a;", "action", "N", "(Loq/p$a;)V", "a", "Lxq/d;", "b", "Lcq/a;", "c", "LZp/a;", "d", "Ldq/a;", "e", "Ldq/d;", "f", "Ldq/c;", "Ltv/B;", "Loq/p$b;", "g", "Ltv/B;", "_uiState", "h", "Ljava/util/List;", "stores", "", "i", "Ljava/lang/String;", "mPerksBarcode", "Ltv/P;", "M", "()Ltv/P;", "uiState", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class p extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C18085d navigationManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C13413a getStoresUseCase;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Zp.a userAuthorizationUseCase;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C13553a activeTripUseCase;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C13556d startTripUseCase;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C13555c resumeTripUseCase;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ViewState> _uiState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private List<ShopAndScanStore> stores;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String mPerksBarcode;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Loq/p$a;", "", "<init>", "()V", "a", "b", "c", "Loq/p$a$a;", "Loq/p$a$b;", "Loq/p$a$c;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Loq/p$a$a;", "Loq/p$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: oq.p$a$a, reason: collision with other inner class name */
        public static final /* data */ class C2404a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C2404a f154831a = new C2404a();

            private C2404a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2404a);
            }

            public String toString() {
                return "NavigateBack";
            }

            public int hashCode() {
                return -582080950;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Loq/p$a$b;", "Loq/p$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f154832a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public String toString() {
                return "Retry";
            }

            public int hashCode() {
                return 1137685142;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Loq/p$a$c;", "Loq/p$a;", "", "storeId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: oq.p$a$c, reason: from toString */
        public static final /* data */ class StoreSelected extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int storeId;

            public StoreSelected(int i10) {
                super(null);
                this.storeId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StoreSelected) && this.storeId == ((StoreSelected) other).storeId;
            }

            /* renamed from: a, reason: from getter */
            public final int getStoreId() {
                return this.storeId;
            }

            public int hashCode() {
                return Integer.hashCode(this.storeId);
            }

            public String toString() {
                return "StoreSelected(storeId=" + this.storeId + ')';
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0005\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Loq/p$b;", "", "Lak/a;", "loadingSpinner", "", "isError", "", "Lhq/j;", "decoratedStores", "<init>", "(Lak/a;ZLjava/util/List;)V", "a", "(Lak/a;ZLjava/util/List;)Loq/p$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lak/a;", "d", "()Lak/a;", "b", "Z", "()Z", "c", "Ljava/util/List;", "()Ljava/util/List;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: oq.p$b, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a loadingSpinner;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isError;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ShopAndScanStoreDecorator> decoratedStores;

        public ViewState() {
            this(null, false, null, 7, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.loadingSpinner, viewState.loadingSpinner) && this.isError == viewState.isError && Intrinsics.e(this.decoratedStores, viewState.decoratedStores);
        }

        public ViewState(AbstractC5607a abstractC5607a, boolean z10, List<ShopAndScanStoreDecorator> decoratedStores) {
            Intrinsics.j(decoratedStores, "decoratedStores");
            this.loadingSpinner = abstractC5607a;
            this.isError = z10;
            this.decoratedStores = decoratedStores;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ViewState b(ViewState viewState, AbstractC5607a abstractC5607a, boolean z10, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                abstractC5607a = viewState.loadingSpinner;
            }
            if ((i10 & 2) != 0) {
                z10 = viewState.isError;
            }
            if ((i10 & 4) != 0) {
                list = viewState.decoratedStores;
            }
            return viewState.a(abstractC5607a, z10, list);
        }

        public final ViewState a(AbstractC5607a loadingSpinner, boolean isError, List<ShopAndScanStoreDecorator> decoratedStores) {
            Intrinsics.j(decoratedStores, "decoratedStores");
            return new ViewState(loadingSpinner, isError, decoratedStores);
        }

        public final List<ShopAndScanStoreDecorator> c() {
            return this.decoratedStores;
        }

        /* renamed from: d, reason: from getter */
        public final AbstractC5607a getLoadingSpinner() {
            return this.loadingSpinner;
        }

        public int hashCode() {
            AbstractC5607a abstractC5607a = this.loadingSpinner;
            return ((((abstractC5607a == null ? 0 : abstractC5607a.hashCode()) * 31) + Boolean.hashCode(this.isError)) * 31) + this.decoratedStores.hashCode();
        }

        public String toString() {
            return "ViewState(loadingSpinner=" + this.loadingSpinner + ", isError=" + this.isError + ", decoratedStores=" + this.decoratedStores + ')';
        }

        public /* synthetic */ ViewState(AbstractC5607a abstractC5607a, boolean z10, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? AbstractC5607a.INSTANCE.a() : abstractC5607a, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? CollectionsKt.m() : list);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$checkActiveTrip$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {133}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f154837a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShopAndScanStore f154839c;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltv/g;", "Lkotlin/Result;", "LXp/f;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$checkActiveTrip$1$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {131, 131}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC17153g<? super Result<? extends ShopAndScanTrip>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f154840a;

            /* renamed from: b, reason: collision with root package name */
            int f154841b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f154842c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ p f154843d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ShopAndScanStore f154844e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, ShopAndScanStore shopAndScanStore, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f154843d = pVar;
                this.f154844e = shopAndScanStore;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f154843d, this.f154844e, continuation);
                aVar.f154842c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super Result<ShopAndScanTrip>> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
            
                if (r1.emit(r8, r7) == r0) goto L19;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r7.f154841b
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L31
                    if (r1 == r4) goto L1f
                    if (r1 != r3) goto L17
                    java.lang.Object r0 = r7.f154842c
                    tv.g r0 = (tv.InterfaceC17153g) r0
                    kotlin.ResultKt.b(r8)
                    goto L6e
                L17:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1f:
                    java.lang.Object r1 = r7.f154840a
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    java.lang.Object r4 = r7.f154842c
                    tv.g r4 = (tv.InterfaceC17153g) r4
                    kotlin.ResultKt.b(r8)
                    kotlin.Result r8 = (kotlin.Result) r8
                    java.lang.Object r8 = r8.getValue()
                    goto L5d
                L31:
                    kotlin.ResultKt.b(r8)
                    java.lang.Object r8 = r7.f154842c
                    r1 = r8
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    oq.p r8 = r7.f154843d
                    dq.a r8 = oq.p.p(r8)
                    oq.p r5 = r7.f154843d
                    java.lang.String r5 = oq.p.r(r5)
                    if (r5 != 0) goto L4d
                    java.lang.String r5 = "mPerksBarcode"
                    kotlin.jvm.internal.Intrinsics.y(r5)
                    r5 = r2
                L4d:
                    Xp.e r6 = r7.f154844e
                    r7.f154842c = r1
                    r7.f154840a = r1
                    r7.f154841b = r4
                    java.lang.Object r8 = r8.b(r5, r6, r7)
                    if (r8 != r0) goto L5c
                    goto L6d
                L5c:
                    r4 = r1
                L5d:
                    kotlin.Result r8 = kotlin.Result.a(r8)
                    r7.f154842c = r4
                    r7.f154840a = r2
                    r7.f154841b = r3
                    java.lang.Object r8 = r1.emit(r8, r7)
                    if (r8 != r0) goto L6e
                L6d:
                    return r0
                L6e:
                    kotlin.Unit r8 = kotlin.Unit.f142422a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: oq.p.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltv/g;", "Lkotlin/Result;", "LXp/f;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$checkActiveTrip$1$2", f = "ShopAndScanStoreSelectionViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC17153g<? super Result<? extends ShopAndScanTrip>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f154845a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f154846b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(p pVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f154846b = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f154846b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super Result<ShopAndScanTrip>> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f154845a == 0) {
                    ResultKt.b(obj);
                    this.f154846b.S(Boxing.d(com.meijer.mobile.shopandscan.e.f116899C0));
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: oq.p$c$c, reason: collision with other inner class name */
        static final class C2405c<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f154847a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ShopAndScanStore f154848b;

            C2405c(p pVar, ShopAndScanStore shopAndScanStore) {
                this.f154847a = pVar;
                this.f154848b = shopAndScanStore;
            }

            @Override // tv.InterfaceC17153g
            public final Object emit(Object obj, Continuation<? super Unit> continuation) {
                Object value = ((Result) obj).getValue();
                p pVar = this.f154847a;
                ShopAndScanStore shopAndScanStore = this.f154848b;
                if (Result.h(value)) {
                    ShopAndScanTrip shopAndScanTrip = (ShopAndScanTrip) value;
                    if (shopAndScanTrip != null) {
                        pVar.R(shopAndScanTrip);
                    } else {
                        pVar.V(shopAndScanStore);
                    }
                }
                p pVar2 = this.f154847a;
                if (Result.e(value) != null) {
                    pVar2.T();
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ShopAndScanStore shopAndScanStore, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f154839c = shopAndScanStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return p.this.new c(this.f154839c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f154837a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                if (p.this.mPerksBarcode == null) {
                    p.this.I();
                } else {
                    InterfaceC17152f interfaceC17152fP = C17154h.P(C17154h.E(new a(p.this, this.f154839c, null)), new b(p.this, null));
                    C2405c c2405c = new C2405c(p.this, this.f154839c);
                    this.f154837a = 1;
                    if (interfaceC17152fP.collect(c2405c, this) == objF) {
                        return objF;
                    }
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$getMPerksBarcode$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {109}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f154849a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f154851c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "Lkotlin/Result;", "", "Lcom/meijer/mobile/shopandscan/domain/model/MPerksBarcode;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$getMPerksBarcode$1$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {107, 107}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC17153g<? super Result<? extends String>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f154852a;

            /* renamed from: b, reason: collision with root package name */
            int f154853b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f154854c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ p f154855d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f154855d = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f154855d, continuation);
                aVar.f154854c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super Result<String>> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
            
                if (r1.emit(r5, r4) == r0) goto L16;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) throws com.meijer.mobile.shopandscan.domain.model.exception.ShopAndScanUserBlockedException {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r4.f154853b
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L30
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r0 = r4.f154854c
                    tv.g r0 = (tv.InterfaceC17153g) r0
                    kotlin.ResultKt.b(r5)
                    goto L5e
                L16:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1e:
                    java.lang.Object r1 = r4.f154852a
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    java.lang.Object r3 = r4.f154854c
                    tv.g r3 = (tv.InterfaceC17153g) r3
                    kotlin.ResultKt.b(r5)
                    kotlin.Result r5 = (kotlin.Result) r5
                    java.lang.Object r5 = r5.getValue()
                    goto L4c
                L30:
                    kotlin.ResultKt.b(r5)
                    java.lang.Object r5 = r4.f154854c
                    r1 = r5
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    oq.p r5 = r4.f154855d
                    Zp.a r5 = oq.p.w(r5)
                    r4.f154854c = r1
                    r4.f154852a = r1
                    r4.f154853b = r3
                    java.lang.Object r5 = r5.c(r4)
                    if (r5 != r0) goto L4b
                    goto L5d
                L4b:
                    r3 = r1
                L4c:
                    kotlin.Result r5 = kotlin.Result.a(r5)
                    r4.f154854c = r3
                    r3 = 0
                    r4.f154852a = r3
                    r4.f154853b = r2
                    java.lang.Object r5 = r1.emit(r5, r4)
                    if (r5 != r0) goto L5e
                L5d:
                    return r0
                L5e:
                    kotlin.Unit r5 = kotlin.Unit.f142422a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: oq.p.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "Lkotlin/Result;", "", "Lcom/meijer/mobile/shopandscan/domain/model/MPerksBarcode;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$getMPerksBarcode$1$2", f = "ShopAndScanStoreSelectionViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC17153g<? super Result<? extends String>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f154856a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f154857b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(p pVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f154857b = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f154857b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super Result<String>> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f154856a == 0) {
                    ResultKt.b(obj);
                    this.f154857b.S(Boxing.d(com.meijer.mobile.shopandscan.e.f116902D0));
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f154858a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f154859b;

            c(p pVar, Function0<Unit> function0) {
                this.f154858a = pVar;
                this.f154859b = function0;
            }

            @Override // tv.InterfaceC17153g
            public final Object emit(Object obj, Continuation<? super Unit> continuation) {
                Object value = ((Result) obj).getValue();
                p pVar = this.f154858a;
                Function0<Unit> function0 = this.f154859b;
                if (Result.h(value)) {
                    pVar.mPerksBarcode = (String) value;
                    function0.invoke();
                }
                p pVar2 = this.f154858a;
                if (Result.e(value) != null) {
                    pVar2.T();
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function0<Unit> function0, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f154851c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return p.this.new d(this.f154851c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f154849a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f interfaceC17152fP = C17154h.P(C17154h.E(new a(p.this, null)), new b(p.this, null));
                c cVar = new c(p.this, this.f154851c);
                this.f154849a = 1;
                if (interfaceC17152fP.collect(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$getStores$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {90}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f154860a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "Lkotlin/Result;", "", "LXp/e;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$getStores$1$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {88, 88}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC17153g<? super Result<? extends List<? extends ShopAndScanStore>>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f154862a;

            /* renamed from: b, reason: collision with root package name */
            int f154863b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f154864c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ p f154865d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f154865d = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f154865d, continuation);
                aVar.f154864c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super Result<? extends List<ShopAndScanStore>>> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
            
                if (r1.emit(r5, r4) == r0) goto L16;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r4.f154863b
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L30
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r0 = r4.f154864c
                    tv.g r0 = (tv.InterfaceC17153g) r0
                    kotlin.ResultKt.b(r5)
                    goto L5e
                L16:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1e:
                    java.lang.Object r1 = r4.f154862a
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    java.lang.Object r3 = r4.f154864c
                    tv.g r3 = (tv.InterfaceC17153g) r3
                    kotlin.ResultKt.b(r5)
                    kotlin.Result r5 = (kotlin.Result) r5
                    java.lang.Object r5 = r5.getValue()
                    goto L4c
                L30:
                    kotlin.ResultKt.b(r5)
                    java.lang.Object r5 = r4.f154864c
                    r1 = r5
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    oq.p r5 = r4.f154865d
                    cq.a r5 = oq.p.q(r5)
                    r4.f154864c = r1
                    r4.f154862a = r1
                    r4.f154863b = r3
                    java.lang.Object r5 = r5.b(r4)
                    if (r5 != r0) goto L4b
                    goto L5d
                L4b:
                    r3 = r1
                L4c:
                    kotlin.Result r5 = kotlin.Result.a(r5)
                    r4.f154864c = r3
                    r3 = 0
                    r4.f154862a = r3
                    r4.f154863b = r2
                    java.lang.Object r5 = r1.emit(r5, r4)
                    if (r5 != r0) goto L5e
                L5d:
                    return r0
                L5e:
                    kotlin.Unit r5 = kotlin.Unit.f142422a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: oq.p.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "Lkotlin/Result;", "", "LXp/e;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$getStores$1$2", f = "ShopAndScanStoreSelectionViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC17153g<? super Result<? extends List<? extends ShopAndScanStore>>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f154866a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f154867b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(p pVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f154867b = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f154867b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super Result<? extends List<ShopAndScanStore>>> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f154866a == 0) {
                    ResultKt.b(obj);
                    this.f154867b.S(Boxing.d(com.meijer.mobile.shopandscan.e.f116954a));
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f154868a;

            c(p pVar) {
                this.f154868a = pVar;
            }

            @Override // tv.InterfaceC17153g
            public final Object emit(Object obj, Continuation<? super Unit> continuation) {
                Object value = ((Result) obj).getValue();
                p pVar = this.f154868a;
                if (Result.h(value)) {
                    List list = (List) value;
                    pVar.stores = list;
                    pVar.U(list);
                    pVar.O();
                }
                p pVar2 = this.f154868a;
                if (Result.e(value) != null) {
                    pVar2.T();
                    pVar2.O();
                }
                return Unit.f142422a;
            }
        }

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return p.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f154860a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f interfaceC17152fP = C17154h.P(C17154h.E(new a(p.this, null)), new b(p.this, null));
                c cVar = new c(p.this);
                this.f154860a = 1;
                if (interfaceC17152fP.collect(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$hideLoadingSpinner$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f154869a;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return p.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f154869a == 0) {
                ResultKt.b(obj);
                InterfaceC17140B interfaceC17140B = p.this._uiState;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, null, false, null, 6, null)));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$onStoreSelected$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f154871a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f154873c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f154873c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return p.this.new g(this.f154873c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object next;
            IntrinsicsKt.f();
            if (this.f154871a == 0) {
                ResultKt.b(obj);
                List list = p.this.stores;
                int i10 = this.f154873c;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((ShopAndScanStore) next).getId() == i10) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                ShopAndScanStore shopAndScanStore = (ShopAndScanStore) next;
                if (shopAndScanStore != null) {
                    p.this.H(shopAndScanStore);
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$resumeTrip$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {BinsView.TOTE_WIDTH_DP}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f154874a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShopAndScanTrip f154876c;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltv/g;", "Lkotlin/Result;", "LXp/f;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$resumeTrip$1$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {148, 148}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC17153g<? super Result<? extends ShopAndScanTrip>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f154877a;

            /* renamed from: b, reason: collision with root package name */
            int f154878b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f154879c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ p f154880d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ShopAndScanTrip f154881e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, ShopAndScanTrip shopAndScanTrip, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f154880d = pVar;
                this.f154881e = shopAndScanTrip;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f154880d, this.f154881e, continuation);
                aVar.f154879c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super Result<ShopAndScanTrip>> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
            
                if (r1.emit(r6, r5) == r0) goto L16;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r5.f154878b
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L30
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r0 = r5.f154879c
                    tv.g r0 = (tv.InterfaceC17153g) r0
                    kotlin.ResultKt.b(r6)
                    goto L60
                L16:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1e:
                    java.lang.Object r1 = r5.f154877a
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    java.lang.Object r3 = r5.f154879c
                    tv.g r3 = (tv.InterfaceC17153g) r3
                    kotlin.ResultKt.b(r6)
                    kotlin.Result r6 = (kotlin.Result) r6
                    java.lang.Object r6 = r6.getValue()
                    goto L4e
                L30:
                    kotlin.ResultKt.b(r6)
                    java.lang.Object r6 = r5.f154879c
                    r1 = r6
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    oq.p r6 = r5.f154880d
                    dq.c r6 = oq.p.t(r6)
                    Xp.f r4 = r5.f154881e
                    r5.f154879c = r1
                    r5.f154877a = r1
                    r5.f154878b = r3
                    java.lang.Object r6 = r6.b(r4, r5)
                    if (r6 != r0) goto L4d
                    goto L5f
                L4d:
                    r3 = r1
                L4e:
                    kotlin.Result r6 = kotlin.Result.a(r6)
                    r5.f154879c = r3
                    r3 = 0
                    r5.f154877a = r3
                    r5.f154878b = r2
                    java.lang.Object r6 = r1.emit(r6, r5)
                    if (r6 != r0) goto L60
                L5f:
                    return r0
                L60:
                    kotlin.Unit r6 = kotlin.Unit.f142422a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: oq.p.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltv/g;", "Lkotlin/Result;", "LXp/f;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$resumeTrip$1$2", f = "ShopAndScanStoreSelectionViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC17153g<? super Result<? extends ShopAndScanTrip>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f154882a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f154883b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(p pVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f154883b = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f154883b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super Result<ShopAndScanTrip>> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f154882a == 0) {
                    ResultKt.b(obj);
                    this.f154883b.S(Boxing.d(com.meijer.mobile.shopandscan.e.f117019v1));
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f154884a;

            c(p pVar) {
                this.f154884a = pVar;
            }

            @Override // tv.InterfaceC17153g
            public final Object emit(Object obj, Continuation<? super Unit> continuation) {
                Object value = ((Result) obj).getValue();
                p pVar = this.f154884a;
                if (Result.h(value)) {
                    pVar.navigationManager.b(C18085d.a.C2730a.f169850b);
                }
                p pVar2 = this.f154884a;
                if (Result.e(value) != null) {
                    pVar2.T();
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ShopAndScanTrip shopAndScanTrip, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f154876c = shopAndScanTrip;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return p.this.new h(this.f154876c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f154874a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f interfaceC17152fP = C17154h.P(C17154h.E(new a(p.this, this.f154876c, null)), new b(p.this, null));
                c cVar = new c(p.this);
                this.f154874a = 1;
                if (interfaceC17152fP.collect(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$showLoadingSpinner$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f154885a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Integer f154887c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Integer num, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f154887c = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return p.this.new i(this.f154887c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            ViewState viewState;
            AbstractC5607a abstractC5607aD;
            IntrinsicsKt.f();
            if (this.f154885a == 0) {
                ResultKt.b(obj);
                InterfaceC17140B interfaceC17140B = p.this._uiState;
                Integer num = this.f154887c;
                do {
                    value = interfaceC17140B.getValue();
                    viewState = (ViewState) value;
                    if (num != null) {
                        abstractC5607aD = AbstractC5607a.INSTANCE.d(num.intValue(), new Object[0]);
                    } else {
                        abstractC5607aD = null;
                    }
                } while (!interfaceC17140B.e(value, ViewState.b(viewState, abstractC5607aD, false, null, 6, null)));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$startTrip$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {162}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f154888a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShopAndScanStore f154890c;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltv/g;", "Lkotlin/Result;", "LXp/f;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$startTrip$1$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {160, 160}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC17153g<? super Result<? extends ShopAndScanTrip>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f154891a;

            /* renamed from: b, reason: collision with root package name */
            int f154892b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f154893c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ p f154894d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ShopAndScanStore f154895e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, ShopAndScanStore shopAndScanStore, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f154894d = pVar;
                this.f154895e = shopAndScanStore;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f154894d, this.f154895e, continuation);
                aVar.f154893c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super Result<ShopAndScanTrip>> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
            
                if (r1.emit(r8, r7) == r0) goto L19;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r7.f154892b
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L31
                    if (r1 == r4) goto L1f
                    if (r1 != r3) goto L17
                    java.lang.Object r0 = r7.f154893c
                    tv.g r0 = (tv.InterfaceC17153g) r0
                    kotlin.ResultKt.b(r8)
                    goto L6e
                L17:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1f:
                    java.lang.Object r1 = r7.f154891a
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    java.lang.Object r4 = r7.f154893c
                    tv.g r4 = (tv.InterfaceC17153g) r4
                    kotlin.ResultKt.b(r8)
                    kotlin.Result r8 = (kotlin.Result) r8
                    java.lang.Object r8 = r8.getValue()
                    goto L5d
                L31:
                    kotlin.ResultKt.b(r8)
                    java.lang.Object r8 = r7.f154893c
                    r1 = r8
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    oq.p r8 = r7.f154894d
                    dq.d r8 = oq.p.u(r8)
                    oq.p r5 = r7.f154894d
                    java.lang.String r5 = oq.p.r(r5)
                    if (r5 != 0) goto L4d
                    java.lang.String r5 = "mPerksBarcode"
                    kotlin.jvm.internal.Intrinsics.y(r5)
                    r5 = r2
                L4d:
                    Xp.e r6 = r7.f154895e
                    r7.f154893c = r1
                    r7.f154891a = r1
                    r7.f154892b = r4
                    java.lang.Object r8 = r8.e(r5, r6, r7)
                    if (r8 != r0) goto L5c
                    goto L6d
                L5c:
                    r4 = r1
                L5d:
                    kotlin.Result r8 = kotlin.Result.a(r8)
                    r7.f154893c = r4
                    r7.f154891a = r2
                    r7.f154892b = r3
                    java.lang.Object r8 = r1.emit(r8, r7)
                    if (r8 != r0) goto L6e
                L6d:
                    return r0
                L6e:
                    kotlin.Unit r8 = kotlin.Unit.f142422a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: oq.p.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltv/g;", "Lkotlin/Result;", "LXp/f;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$startTrip$1$2", f = "ShopAndScanStoreSelectionViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC17153g<? super Result<? extends ShopAndScanTrip>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f154896a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f154897b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(p pVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f154897b = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f154897b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super Result<ShopAndScanTrip>> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f154896a == 0) {
                    ResultKt.b(obj);
                    this.f154897b.S(Boxing.d(com.meijer.mobile.shopandscan.e.f116905E0));
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f154898a;

            c(p pVar) {
                this.f154898a = pVar;
            }

            @Override // tv.InterfaceC17153g
            public final Object emit(Object obj, Continuation<? super Unit> continuation) {
                Object value = ((Result) obj).getValue();
                p pVar = this.f154898a;
                if (Result.h(value)) {
                    pVar.navigationManager.b(C18085d.a.C2730a.f169850b);
                }
                p pVar2 = this.f154898a;
                if (Result.e(value) != null) {
                    pVar2.T();
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ShopAndScanStore shopAndScanStore, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f154890c = shopAndScanStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return p.this.new j(this.f154890c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f154888a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f interfaceC17152fP = C17154h.P(C17154h.E(new a(p.this, this.f154890c, null)), new b(p.this, null));
                c cVar = new c(p.this);
                this.f154888a = 1;
                if (interfaceC17152fP.collect(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    public p(C18085d navigationManager, C13413a getStoresUseCase, Zp.a userAuthorizationUseCase, C13553a activeTripUseCase, C13556d startTripUseCase, C13555c resumeTripUseCase) {
        Intrinsics.j(navigationManager, "navigationManager");
        Intrinsics.j(getStoresUseCase, "getStoresUseCase");
        Intrinsics.j(userAuthorizationUseCase, "userAuthorizationUseCase");
        Intrinsics.j(activeTripUseCase, "activeTripUseCase");
        Intrinsics.j(startTripUseCase, "startTripUseCase");
        Intrinsics.j(resumeTripUseCase, "resumeTripUseCase");
        this.navigationManager = navigationManager;
        this.getStoresUseCase = getStoresUseCase;
        this.userAuthorizationUseCase = userAuthorizationUseCase;
        this.activeTripUseCase = activeTripUseCase;
        this.startTripUseCase = startTripUseCase;
        this.resumeTripUseCase = resumeTripUseCase;
        this._uiState = S.a(new ViewState(null, false, null, 7, null));
        this.stores = CollectionsKt.m();
        I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        if (this.mPerksBarcode == null) {
            K(new Function0() { // from class: oq.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.J(this.f154821a);
                }
            });
        } else if (this.stores.isEmpty()) {
            L();
        }
    }

    private final void P() {
        this.navigationManager.b(C18085d.a.i.f169858b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        ViewState value;
        InterfaceC17140B<ViewState> interfaceC17140B = this._uiState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, null, true, null, 5, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(List<ShopAndScanStore> domain) {
        ViewState value;
        ViewState viewState;
        ArrayList arrayList;
        InterfaceC17140B<ViewState> interfaceC17140B = this._uiState;
        do {
            value = interfaceC17140B.getValue();
            viewState = value;
            List<ShopAndScanStore> list = domain;
            arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ShopAndScanStoreDecorator.INSTANCE.a((ShopAndScanStore) it.next()));
            }
        } while (!interfaceC17140B.e(value, ViewState.b(viewState, null, false, arrayList, 3, null)));
    }

    public final P<ViewState> M() {
        return C17154h.c(this._uiState);
    }

    public final void N(a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.C2404a) {
            P();
        } else if (action instanceof a.StoreSelected) {
            Q(((a.StoreSelected) action).getStoreId());
        } else {
            if (!(action instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            L();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(ShopAndScanStore store) {
        C16648k.d(d0.a(this), null, null, new c(store, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(p pVar) {
        pVar.I();
        return Unit.f142422a;
    }

    private final void K(Function0<Unit> callback) {
        C16648k.d(d0.a(this), null, null, new d(callback, null), 3, null);
    }

    private final void L() {
        C16648k.d(d0.a(this), null, null, new e(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        C16648k.d(d0.a(this), null, null, new f(null), 3, null);
    }

    private final void Q(int storeId) {
        C16648k.d(d0.a(this), null, null, new g(storeId, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(ShopAndScanTrip activeTrip) {
        C16648k.d(d0.a(this), null, null, new h(activeTrip, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(Integer messageRes) {
        C16648k.d(d0.a(this), null, null, new i(messageRes, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(ShopAndScanStore store) {
        C16648k.d(d0.a(this), null, null, new j(store, null), 3, null);
    }
}
