package oq;

import Xp.ShopAndScanStore;
import Xp.ShopAndScanTrip;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import cq.C13546a;
import dq.C13708a;
import dq.C13710c;
import dq.C13711d;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import pv.P;
import pv.S;
import xq.C18213d;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u000253B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b$\u0010\u001fJ\u001b\u0010&\u001a\u00020\u00102\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0010H\u0002¢\u0006\u0004\b(\u0010\u0012J\u001d\u0010+\u001a\u00020\u00102\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0)H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0010H\u0002¢\u0006\u0004\b-\u0010\u0012J\u000f\u0010.\u001a\u00020\u0010H\u0002¢\u0006\u0004\b.\u0010\u0012J\u0015\u00101\u001a\u00020\u00102\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020@0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001c\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001c0)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010IR\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020@0K8F¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006O"}, d2 = {"Loq/p;", "Landroidx/lifecycle/c0;", "Lxq/d;", "navigationManager", "Lcq/a;", "getStoresUseCase", "LZp/a;", "userAuthorizationUseCase", "Ldq/a;", "activeTripUseCase", "Ldq/d;", "startTripUseCase", "Ldq/c;", "resumeTripUseCase", "<init>", "(Lxq/d;Lcq/a;LZp/a;Ldq/a;Ldq/d;Ldq/c;)V", "", "I", "()V", "L", "Lkotlin/Function0;", "callback", "K", "(Lkotlin/jvm/functions/Function0;)V", "", "storeId", "Q", "(I)V", "LXp/e;", PlaceTypes.STORE, "H", "(LXp/e;)V", "LXp/f;", "activeTrip", "R", "(LXp/f;)V", "V", "messageRes", "S", "(Ljava/lang/Integer;)V", "O", "", "domain", "U", "(Ljava/util/List;)V", "T", "P", "Loq/p$a;", "action", "N", "(Loq/p$a;)V", "a", "Lxq/d;", "b", "Lcq/a;", "c", "LZp/a;", "d", "Ldq/a;", "e", "Ldq/d;", "f", "Ldq/c;", "Lpv/B;", "Loq/p$b;", "g", "Lpv/B;", "_uiState", "h", "Ljava/util/List;", "stores", "", "i", "Ljava/lang/String;", "mPerksBarcode", "Lpv/P;", "M", "()Lpv/P;", "uiState", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class p extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C18213d navigationManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C13546a getStoresUseCase;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Zp.a userAuthorizationUseCase;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C13708a activeTripUseCase;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C13711d startTripUseCase;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C13710c resumeTripUseCase;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _uiState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private List<ShopAndScanStore> stores;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String mPerksBarcode;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Loq/p$a;", "", "<init>", "()V", "a", "b", "c", "Loq/p$a$a;", "Loq/p$a$b;", "Loq/p$a$c;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Loq/p$a$a;", "Loq/p$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: oq.p$a$a, reason: collision with other inner class name */
        public static final /* data */ class C2407a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C2407a f155404a = new C2407a();

            private C2407a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2407a);
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
            public static final b f155405a = new b();

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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0005\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Loq/p$b;", "", "Lbk/a;", "loadingSpinner", "", "isError", "", "Lhq/j;", "decoratedStores", "<init>", "(Lbk/a;ZLjava/util/List;)V", "a", "(Lbk/a;ZLjava/util/List;)Loq/p$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lbk/a;", "d", "()Lbk/a;", "b", "Z", "()Z", "c", "Ljava/util/List;", "()Ljava/util/List;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: oq.p$b, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a loadingSpinner;

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

        public ViewState(AbstractC6392a abstractC6392a, boolean z10, List<ShopAndScanStoreDecorator> decoratedStores) {
            Intrinsics.j(decoratedStores, "decoratedStores");
            this.loadingSpinner = abstractC6392a;
            this.isError = z10;
            this.decoratedStores = decoratedStores;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ViewState b(ViewState viewState, AbstractC6392a abstractC6392a, boolean z10, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                abstractC6392a = viewState.loadingSpinner;
            }
            if ((i10 & 2) != 0) {
                z10 = viewState.isError;
            }
            if ((i10 & 4) != 0) {
                list = viewState.decoratedStores;
            }
            return viewState.a(abstractC6392a, z10, list);
        }

        public final ViewState a(AbstractC6392a loadingSpinner, boolean isError, List<ShopAndScanStoreDecorator> decoratedStores) {
            Intrinsics.j(decoratedStores, "decoratedStores");
            return new ViewState(loadingSpinner, isError, decoratedStores);
        }

        public final List<ShopAndScanStoreDecorator> c() {
            return this.decoratedStores;
        }

        /* renamed from: d, reason: from getter */
        public final AbstractC6392a getLoadingSpinner() {
            return this.loadingSpinner;
        }

        public int hashCode() {
            AbstractC6392a abstractC6392a = this.loadingSpinner;
            return ((((abstractC6392a == null ? 0 : abstractC6392a.hashCode()) * 31) + Boolean.hashCode(this.isError)) * 31) + this.decoratedStores.hashCode();
        }

        public String toString() {
            return "ViewState(loadingSpinner=" + this.loadingSpinner + ", isError=" + this.isError + ", decoratedStores=" + this.decoratedStores + ')';
        }

        public /* synthetic */ ViewState(AbstractC6392a abstractC6392a, boolean z10, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? AbstractC6392a.INSTANCE.a() : abstractC6392a, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? CollectionsKt.m() : list);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$checkActiveTrip$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {133}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f155410a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShopAndScanStore f155412c;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpv/g;", "Lkotlin/Result;", "LXp/f;", "", "<anonymous>", "(Lpv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$checkActiveTrip$1$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {131, 131}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16562g<? super Result<? extends ShopAndScanTrip>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f155413a;

            /* renamed from: b, reason: collision with root package name */
            int f155414b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f155415c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ p f155416d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ShopAndScanStore f155417e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, ShopAndScanStore shopAndScanStore, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f155416d = pVar;
                this.f155417e = shopAndScanStore;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f155416d, this.f155417e, continuation);
                aVar.f155415c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC16562g<? super Result<ShopAndScanTrip>> interfaceC16562g, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16562g, continuation)).invokeSuspend(Unit.f143329a);
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
                    int r1 = r7.f155414b
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L31
                    if (r1 == r4) goto L1f
                    if (r1 != r3) goto L17
                    java.lang.Object r0 = r7.f155415c
                    pv.g r0 = (pv.InterfaceC16562g) r0
                    kotlin.ResultKt.b(r8)
                    goto L6e
                L17:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1f:
                    java.lang.Object r1 = r7.f155413a
                    pv.g r1 = (pv.InterfaceC16562g) r1
                    java.lang.Object r4 = r7.f155415c
                    pv.g r4 = (pv.InterfaceC16562g) r4
                    kotlin.ResultKt.b(r8)
                    kotlin.Result r8 = (kotlin.Result) r8
                    java.lang.Object r8 = r8.getValue()
                    goto L5d
                L31:
                    kotlin.ResultKt.b(r8)
                    java.lang.Object r8 = r7.f155415c
                    r1 = r8
                    pv.g r1 = (pv.InterfaceC16562g) r1
                    oq.p r8 = r7.f155416d
                    dq.a r8 = oq.p.p(r8)
                    oq.p r5 = r7.f155416d
                    java.lang.String r5 = oq.p.r(r5)
                    if (r5 != 0) goto L4d
                    java.lang.String r5 = "mPerksBarcode"
                    kotlin.jvm.internal.Intrinsics.x(r5)
                    r5 = r2
                L4d:
                    Xp.e r6 = r7.f155417e
                    r7.f155415c = r1
                    r7.f155413a = r1
                    r7.f155414b = r4
                    java.lang.Object r8 = r8.b(r5, r6, r7)
                    if (r8 != r0) goto L5c
                    goto L6d
                L5c:
                    r4 = r1
                L5d:
                    kotlin.Result r8 = kotlin.Result.a(r8)
                    r7.f155415c = r4
                    r7.f155413a = r2
                    r7.f155414b = r3
                    java.lang.Object r8 = r1.emit(r8, r7)
                    if (r8 != r0) goto L6e
                L6d:
                    return r0
                L6e:
                    kotlin.Unit r8 = kotlin.Unit.f143329a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: oq.p.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpv/g;", "Lkotlin/Result;", "LXp/f;", "", "<anonymous>", "(Lpv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$checkActiveTrip$1$2", f = "ShopAndScanStoreSelectionViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC16562g<? super Result<? extends ShopAndScanTrip>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f155418a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f155419b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(p pVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f155419b = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f155419b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC16562g<? super Result<ShopAndScanTrip>> interfaceC16562g, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16562g, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f155418a == 0) {
                    ResultKt.b(obj);
                    this.f155419b.S(Boxing.d(com.meijer.mobile.shopandscan.e.f117844C0));
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: oq.p$c$c, reason: collision with other inner class name */
        static final class C2408c<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f155420a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ShopAndScanStore f155421b;

            C2408c(p pVar, ShopAndScanStore shopAndScanStore) {
                this.f155420a = pVar;
                this.f155421b = shopAndScanStore;
            }

            @Override // pv.InterfaceC16562g
            public final Object emit(Object obj, Continuation<? super Unit> continuation) {
                Object value = ((Result) obj).getValue();
                p pVar = this.f155420a;
                ShopAndScanStore shopAndScanStore = this.f155421b;
                if (Result.h(value)) {
                    ShopAndScanTrip shopAndScanTrip = (ShopAndScanTrip) value;
                    if (shopAndScanTrip != null) {
                        pVar.R(shopAndScanTrip);
                    } else {
                        pVar.V(shopAndScanStore);
                    }
                }
                p pVar2 = this.f155420a;
                if (Result.e(value) != null) {
                    pVar2.T();
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ShopAndScanStore shopAndScanStore, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f155412c = shopAndScanStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return p.this.new c(this.f155412c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f155410a;
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
                    InterfaceC16561f interfaceC16561fP = C16563h.P(C16563h.E(new a(p.this, this.f155412c, null)), new b(p.this, null));
                    C2408c c2408c = new C2408c(p.this, this.f155412c);
                    this.f155410a = 1;
                    if (interfaceC16561fP.collect(c2408c, this) == objF) {
                        return objF;
                    }
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$getMPerksBarcode$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {109}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f155422a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f155424c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "Lkotlin/Result;", "", "Lcom/meijer/mobile/shopandscan/domain/model/MPerksBarcode;", "", "<anonymous>", "(Lpv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$getMPerksBarcode$1$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {107, 107}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16562g<? super Result<? extends String>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f155425a;

            /* renamed from: b, reason: collision with root package name */
            int f155426b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f155427c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ p f155428d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f155428d = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f155428d, continuation);
                aVar.f155427c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC16562g<? super Result<String>> interfaceC16562g, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16562g, continuation)).invokeSuspend(Unit.f143329a);
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
                    int r1 = r4.f155426b
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L30
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r0 = r4.f155427c
                    pv.g r0 = (pv.InterfaceC16562g) r0
                    kotlin.ResultKt.b(r5)
                    goto L5e
                L16:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1e:
                    java.lang.Object r1 = r4.f155425a
                    pv.g r1 = (pv.InterfaceC16562g) r1
                    java.lang.Object r3 = r4.f155427c
                    pv.g r3 = (pv.InterfaceC16562g) r3
                    kotlin.ResultKt.b(r5)
                    kotlin.Result r5 = (kotlin.Result) r5
                    java.lang.Object r5 = r5.getValue()
                    goto L4c
                L30:
                    kotlin.ResultKt.b(r5)
                    java.lang.Object r5 = r4.f155427c
                    r1 = r5
                    pv.g r1 = (pv.InterfaceC16562g) r1
                    oq.p r5 = r4.f155428d
                    Zp.a r5 = oq.p.w(r5)
                    r4.f155427c = r1
                    r4.f155425a = r1
                    r4.f155426b = r3
                    java.lang.Object r5 = r5.c(r4)
                    if (r5 != r0) goto L4b
                    goto L5d
                L4b:
                    r3 = r1
                L4c:
                    kotlin.Result r5 = kotlin.Result.a(r5)
                    r4.f155427c = r3
                    r3 = 0
                    r4.f155425a = r3
                    r4.f155426b = r2
                    java.lang.Object r5 = r1.emit(r5, r4)
                    if (r5 != r0) goto L5e
                L5d:
                    return r0
                L5e:
                    kotlin.Unit r5 = kotlin.Unit.f143329a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: oq.p.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "Lkotlin/Result;", "", "Lcom/meijer/mobile/shopandscan/domain/model/MPerksBarcode;", "", "<anonymous>", "(Lpv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$getMPerksBarcode$1$2", f = "ShopAndScanStoreSelectionViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC16562g<? super Result<? extends String>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f155429a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f155430b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(p pVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f155430b = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f155430b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC16562g<? super Result<String>> interfaceC16562g, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16562g, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f155429a == 0) {
                    ResultKt.b(obj);
                    this.f155430b.S(Boxing.d(com.meijer.mobile.shopandscan.e.f117847D0));
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f155431a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f155432b;

            c(p pVar, Function0<Unit> function0) {
                this.f155431a = pVar;
                this.f155432b = function0;
            }

            @Override // pv.InterfaceC16562g
            public final Object emit(Object obj, Continuation<? super Unit> continuation) {
                Object value = ((Result) obj).getValue();
                p pVar = this.f155431a;
                Function0<Unit> function0 = this.f155432b;
                if (Result.h(value)) {
                    pVar.mPerksBarcode = (String) value;
                    function0.invoke();
                }
                p pVar2 = this.f155431a;
                if (Result.e(value) != null) {
                    pVar2.T();
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function0<Unit> function0, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f155424c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return p.this.new d(this.f155424c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f155422a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f interfaceC16561fP = C16563h.P(C16563h.E(new a(p.this, null)), new b(p.this, null));
                c cVar = new c(p.this, this.f155424c);
                this.f155422a = 1;
                if (interfaceC16561fP.collect(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$getStores$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {90}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f155433a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "Lkotlin/Result;", "", "LXp/e;", "", "<anonymous>", "(Lpv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$getStores$1$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {88, 88}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16562g<? super Result<? extends List<? extends ShopAndScanStore>>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f155435a;

            /* renamed from: b, reason: collision with root package name */
            int f155436b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f155437c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ p f155438d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f155438d = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f155438d, continuation);
                aVar.f155437c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC16562g<? super Result<? extends List<ShopAndScanStore>>> interfaceC16562g, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16562g, continuation)).invokeSuspend(Unit.f143329a);
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
                    int r1 = r4.f155436b
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L30
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r0 = r4.f155437c
                    pv.g r0 = (pv.InterfaceC16562g) r0
                    kotlin.ResultKt.b(r5)
                    goto L5e
                L16:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1e:
                    java.lang.Object r1 = r4.f155435a
                    pv.g r1 = (pv.InterfaceC16562g) r1
                    java.lang.Object r3 = r4.f155437c
                    pv.g r3 = (pv.InterfaceC16562g) r3
                    kotlin.ResultKt.b(r5)
                    kotlin.Result r5 = (kotlin.Result) r5
                    java.lang.Object r5 = r5.getValue()
                    goto L4c
                L30:
                    kotlin.ResultKt.b(r5)
                    java.lang.Object r5 = r4.f155437c
                    r1 = r5
                    pv.g r1 = (pv.InterfaceC16562g) r1
                    oq.p r5 = r4.f155438d
                    cq.a r5 = oq.p.q(r5)
                    r4.f155437c = r1
                    r4.f155435a = r1
                    r4.f155436b = r3
                    java.lang.Object r5 = r5.b(r4)
                    if (r5 != r0) goto L4b
                    goto L5d
                L4b:
                    r3 = r1
                L4c:
                    kotlin.Result r5 = kotlin.Result.a(r5)
                    r4.f155437c = r3
                    r3 = 0
                    r4.f155435a = r3
                    r4.f155436b = r2
                    java.lang.Object r5 = r1.emit(r5, r4)
                    if (r5 != r0) goto L5e
                L5d:
                    return r0
                L5e:
                    kotlin.Unit r5 = kotlin.Unit.f143329a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: oq.p.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "Lkotlin/Result;", "", "LXp/e;", "", "<anonymous>", "(Lpv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$getStores$1$2", f = "ShopAndScanStoreSelectionViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC16562g<? super Result<? extends List<? extends ShopAndScanStore>>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f155439a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f155440b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(p pVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f155440b = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f155440b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC16562g<? super Result<? extends List<ShopAndScanStore>>> interfaceC16562g, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16562g, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f155439a == 0) {
                    ResultKt.b(obj);
                    this.f155440b.S(Boxing.d(com.meijer.mobile.shopandscan.e.f117899a));
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f155441a;

            c(p pVar) {
                this.f155441a = pVar;
            }

            @Override // pv.InterfaceC16562g
            public final Object emit(Object obj, Continuation<? super Unit> continuation) {
                Object value = ((Result) obj).getValue();
                p pVar = this.f155441a;
                if (Result.h(value)) {
                    List list = (List) value;
                    pVar.stores = list;
                    pVar.U(list);
                    pVar.O();
                }
                p pVar2 = this.f155441a;
                if (Result.e(value) != null) {
                    pVar2.T();
                    pVar2.O();
                }
                return Unit.f143329a;
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
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f155433a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f interfaceC16561fP = C16563h.P(C16563h.E(new a(p.this, null)), new b(p.this, null));
                c cVar = new c(p.this);
                this.f155433a = 1;
                if (interfaceC16561fP.collect(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$hideLoadingSpinner$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f155442a;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return p.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f155442a == 0) {
                ResultKt.b(obj);
                InterfaceC16549B interfaceC16549B = p.this._uiState;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, false, null, 6, null)));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$onStoreSelected$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f155444a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f155446c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f155446c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return p.this.new g(this.f155446c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object next;
            IntrinsicsKt.f();
            if (this.f155444a == 0) {
                ResultKt.b(obj);
                List list = p.this.stores;
                int i10 = this.f155446c;
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
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$resumeTrip$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {BinsView.TOTE_WIDTH_DP}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f155447a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShopAndScanTrip f155449c;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpv/g;", "Lkotlin/Result;", "LXp/f;", "", "<anonymous>", "(Lpv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$resumeTrip$1$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {148, 148}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16562g<? super Result<? extends ShopAndScanTrip>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f155450a;

            /* renamed from: b, reason: collision with root package name */
            int f155451b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f155452c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ p f155453d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ShopAndScanTrip f155454e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, ShopAndScanTrip shopAndScanTrip, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f155453d = pVar;
                this.f155454e = shopAndScanTrip;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f155453d, this.f155454e, continuation);
                aVar.f155452c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC16562g<? super Result<ShopAndScanTrip>> interfaceC16562g, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16562g, continuation)).invokeSuspend(Unit.f143329a);
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
                    int r1 = r5.f155451b
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L30
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r0 = r5.f155452c
                    pv.g r0 = (pv.InterfaceC16562g) r0
                    kotlin.ResultKt.b(r6)
                    goto L60
                L16:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1e:
                    java.lang.Object r1 = r5.f155450a
                    pv.g r1 = (pv.InterfaceC16562g) r1
                    java.lang.Object r3 = r5.f155452c
                    pv.g r3 = (pv.InterfaceC16562g) r3
                    kotlin.ResultKt.b(r6)
                    kotlin.Result r6 = (kotlin.Result) r6
                    java.lang.Object r6 = r6.getValue()
                    goto L4e
                L30:
                    kotlin.ResultKt.b(r6)
                    java.lang.Object r6 = r5.f155452c
                    r1 = r6
                    pv.g r1 = (pv.InterfaceC16562g) r1
                    oq.p r6 = r5.f155453d
                    dq.c r6 = oq.p.t(r6)
                    Xp.f r4 = r5.f155454e
                    r5.f155452c = r1
                    r5.f155450a = r1
                    r5.f155451b = r3
                    java.lang.Object r6 = r6.b(r4, r5)
                    if (r6 != r0) goto L4d
                    goto L5f
                L4d:
                    r3 = r1
                L4e:
                    kotlin.Result r6 = kotlin.Result.a(r6)
                    r5.f155452c = r3
                    r3 = 0
                    r5.f155450a = r3
                    r5.f155451b = r2
                    java.lang.Object r6 = r1.emit(r6, r5)
                    if (r6 != r0) goto L60
                L5f:
                    return r0
                L60:
                    kotlin.Unit r6 = kotlin.Unit.f143329a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: oq.p.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpv/g;", "Lkotlin/Result;", "LXp/f;", "", "<anonymous>", "(Lpv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$resumeTrip$1$2", f = "ShopAndScanStoreSelectionViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC16562g<? super Result<? extends ShopAndScanTrip>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f155455a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f155456b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(p pVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f155456b = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f155456b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC16562g<? super Result<ShopAndScanTrip>> interfaceC16562g, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16562g, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f155455a == 0) {
                    ResultKt.b(obj);
                    this.f155456b.S(Boxing.d(com.meijer.mobile.shopandscan.e.f117964v1));
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f155457a;

            c(p pVar) {
                this.f155457a = pVar;
            }

            @Override // pv.InterfaceC16562g
            public final Object emit(Object obj, Continuation<? super Unit> continuation) {
                Object value = ((Result) obj).getValue();
                p pVar = this.f155457a;
                if (Result.h(value)) {
                    pVar.navigationManager.b(C18213d.a.C2748a.f170942b);
                }
                p pVar2 = this.f155457a;
                if (Result.e(value) != null) {
                    pVar2.T();
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ShopAndScanTrip shopAndScanTrip, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f155449c = shopAndScanTrip;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return p.this.new h(this.f155449c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f155447a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f interfaceC16561fP = C16563h.P(C16563h.E(new a(p.this, this.f155449c, null)), new b(p.this, null));
                c cVar = new c(p.this);
                this.f155447a = 1;
                if (interfaceC16561fP.collect(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$showLoadingSpinner$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f155458a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Integer f155460c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Integer num, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f155460c = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return p.this.new i(this.f155460c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            ViewState viewState;
            AbstractC6392a abstractC6392aD;
            IntrinsicsKt.f();
            if (this.f155458a == 0) {
                ResultKt.b(obj);
                InterfaceC16549B interfaceC16549B = p.this._uiState;
                Integer num = this.f155460c;
                do {
                    value = interfaceC16549B.getValue();
                    viewState = (ViewState) value;
                    if (num != null) {
                        abstractC6392aD = AbstractC6392a.INSTANCE.d(num.intValue(), new Object[0]);
                    } else {
                        abstractC6392aD = null;
                    }
                } while (!interfaceC16549B.e(value, ViewState.b(viewState, abstractC6392aD, false, null, 6, null)));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$startTrip$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {162}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f155461a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShopAndScanStore f155463c;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpv/g;", "Lkotlin/Result;", "LXp/f;", "", "<anonymous>", "(Lpv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$startTrip$1$1", f = "ShopAndScanStoreSelectionViewModel.kt", l = {160, 160}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16562g<? super Result<? extends ShopAndScanTrip>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f155464a;

            /* renamed from: b, reason: collision with root package name */
            int f155465b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f155466c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ p f155467d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ShopAndScanStore f155468e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, ShopAndScanStore shopAndScanStore, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f155467d = pVar;
                this.f155468e = shopAndScanStore;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f155467d, this.f155468e, continuation);
                aVar.f155466c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC16562g<? super Result<ShopAndScanTrip>> interfaceC16562g, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16562g, continuation)).invokeSuspend(Unit.f143329a);
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
                    int r1 = r7.f155465b
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L31
                    if (r1 == r4) goto L1f
                    if (r1 != r3) goto L17
                    java.lang.Object r0 = r7.f155466c
                    pv.g r0 = (pv.InterfaceC16562g) r0
                    kotlin.ResultKt.b(r8)
                    goto L6e
                L17:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1f:
                    java.lang.Object r1 = r7.f155464a
                    pv.g r1 = (pv.InterfaceC16562g) r1
                    java.lang.Object r4 = r7.f155466c
                    pv.g r4 = (pv.InterfaceC16562g) r4
                    kotlin.ResultKt.b(r8)
                    kotlin.Result r8 = (kotlin.Result) r8
                    java.lang.Object r8 = r8.getValue()
                    goto L5d
                L31:
                    kotlin.ResultKt.b(r8)
                    java.lang.Object r8 = r7.f155466c
                    r1 = r8
                    pv.g r1 = (pv.InterfaceC16562g) r1
                    oq.p r8 = r7.f155467d
                    dq.d r8 = oq.p.u(r8)
                    oq.p r5 = r7.f155467d
                    java.lang.String r5 = oq.p.r(r5)
                    if (r5 != 0) goto L4d
                    java.lang.String r5 = "mPerksBarcode"
                    kotlin.jvm.internal.Intrinsics.x(r5)
                    r5 = r2
                L4d:
                    Xp.e r6 = r7.f155468e
                    r7.f155466c = r1
                    r7.f155464a = r1
                    r7.f155465b = r4
                    java.lang.Object r8 = r8.e(r5, r6, r7)
                    if (r8 != r0) goto L5c
                    goto L6d
                L5c:
                    r4 = r1
                L5d:
                    kotlin.Result r8 = kotlin.Result.a(r8)
                    r7.f155466c = r4
                    r7.f155464a = r2
                    r7.f155465b = r3
                    java.lang.Object r8 = r1.emit(r8, r7)
                    if (r8 != r0) goto L6e
                L6d:
                    return r0
                L6e:
                    kotlin.Unit r8 = kotlin.Unit.f143329a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: oq.p.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpv/g;", "Lkotlin/Result;", "LXp/f;", "", "<anonymous>", "(Lpv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.storeselection.ShopAndScanStoreSelectionViewModel$startTrip$1$2", f = "ShopAndScanStoreSelectionViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC16562g<? super Result<? extends ShopAndScanTrip>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f155469a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f155470b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(p pVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f155470b = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f155470b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC16562g<? super Result<ShopAndScanTrip>> interfaceC16562g, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16562g, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f155469a == 0) {
                    ResultKt.b(obj);
                    this.f155470b.S(Boxing.d(com.meijer.mobile.shopandscan.e.f117850E0));
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f155471a;

            c(p pVar) {
                this.f155471a = pVar;
            }

            @Override // pv.InterfaceC16562g
            public final Object emit(Object obj, Continuation<? super Unit> continuation) {
                Object value = ((Result) obj).getValue();
                p pVar = this.f155471a;
                if (Result.h(value)) {
                    pVar.navigationManager.b(C18213d.a.C2748a.f170942b);
                }
                p pVar2 = this.f155471a;
                if (Result.e(value) != null) {
                    pVar2.T();
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ShopAndScanStore shopAndScanStore, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f155463c = shopAndScanStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return p.this.new j(this.f155463c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f155461a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f interfaceC16561fP = C16563h.P(C16563h.E(new a(p.this, this.f155463c, null)), new b(p.this, null));
                c cVar = new c(p.this);
                this.f155461a = 1;
                if (interfaceC16561fP.collect(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public p(C18213d navigationManager, C13546a getStoresUseCase, Zp.a userAuthorizationUseCase, C13708a activeTripUseCase, C13711d startTripUseCase, C13710c resumeTripUseCase) {
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
                    return p.J(this.f155394a);
                }
            });
        } else if (this.stores.isEmpty()) {
            L();
        }
    }

    private final void P() {
        this.navigationManager.b(C18213d.a.i.f170950b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._uiState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, true, null, 5, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(List<ShopAndScanStore> domain) {
        ViewState value;
        ViewState viewState;
        ArrayList arrayList;
        InterfaceC16549B<ViewState> interfaceC16549B = this._uiState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
            List<ShopAndScanStore> list = domain;
            arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ShopAndScanStoreDecorator.INSTANCE.a((ShopAndScanStore) it.next()));
            }
        } while (!interfaceC16549B.e(value, ViewState.b(viewState, null, false, arrayList, 3, null)));
    }

    public final P<ViewState> M() {
        return C16563h.c(this._uiState);
    }

    public final void N(a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.C2407a) {
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
        C15809k.d(d0.a(this), null, null, new c(store, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(p pVar) {
        pVar.I();
        return Unit.f143329a;
    }

    private final void K(Function0<Unit> callback) {
        C15809k.d(d0.a(this), null, null, new d(callback, null), 3, null);
    }

    private final void L() {
        C15809k.d(d0.a(this), null, null, new e(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        C15809k.d(d0.a(this), null, null, new f(null), 3, null);
    }

    private final void Q(int storeId) {
        C15809k.d(d0.a(this), null, null, new g(storeId, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(ShopAndScanTrip activeTrip) {
        C15809k.d(d0.a(this), null, null, new h(activeTrip, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(Integer messageRes) {
        C15809k.d(d0.a(this), null, null, new i(messageRes, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(ShopAndScanStore store) {
        C15809k.d(d0.a(this), null, null, new j(store, null), 3, null);
    }
}
