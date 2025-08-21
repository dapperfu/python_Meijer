package nq;

import Vp.AddItemRequest;
import Vp.UpdateItemRequest;
import Xp.ShopAndScanItem;
import Xp.ShopAndScanTrip;
import Xp.a;
import androidx.view.c0;
import androidx.view.d0;
import hq.ShopAndScanCartTotalsDecorator;
import hq.ShopAndScanItemDecorator;
import io.constructor.data.local.PreferencesHelper;
import j$.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C0;
import mv.C15809k;
import mv.InterfaceC15783O;
import mv.Z;
import nq.v;
import pv.InterfaceC16553F;
import pv.InterfaceC16562g;
import wj.C17896a;
import xq.C18213d;
import zq.AbstractC18543a;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0003975B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u0017J\u000f\u0010\u001d\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u0017J\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010\u001fJ\u0017\u0010%\u001a\u00020\u00132\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J#\u0010+\u001a\u00020\u00132\n\u0010)\u001a\u00060'j\u0002`(2\u0006\u0010*\u001a\u00020\u0011H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\u00132\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R#\u0010D\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020?0=8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020#0E8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lnq/v;", "Landroidx/lifecycle/c0;", "LYp/a;", "barcodeScannedUseCase", "Lxq/d;", "navManager", "LWp/a;", "repository", "Lzq/d;", "scannerController", "<init>", "(LYp/a;Lxq/d;LWp/a;Lzq/d;)V", "", "permission", "Lmv/C0;", "o", "(Z)Lmv/C0;", "", PreferencesHelper.PREF_ID, "", "r", "(Ljava/lang/String;)V", "E", "()V", "", "quantity", "F", "(Ljava/lang/String;I)Lmv/C0;", "w", "x", "C", "()Lmv/C0;", "D", "A", "B", "LXp/a;", "barcode", "y", "(LXp/a;)V", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "offerID", "itemID", "q", "(JLjava/lang/String;)V", "p", "(Ljava/lang/String;)Lmv/C0;", "Lnq/v$c;", "event", "v", "(Lnq/v$c;)V", "a", "LYp/a;", "b", "Lxq/d;", "c", "LWp/a;", "d", "Lzq/d;", "u", "()Lzq/d;", "Lwj/a;", "Lnq/v$d;", "Lnq/v$b;", "e", "Lwj/a;", "t", "()Lwj/a;", "modelStore", "", "f", "Ljava/util/List;", "s", "()Ljava/util/List;", "enabledBarcodeSymbologies", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class v extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Yp.a barcodeScannedUseCase;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C18213d navManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Wp.a repository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final zq.d scannerController;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C17896a<ViewState, b> modelStore;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<Xp.a> enabledBarcodeSymbologies;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.scanner.ShopAndScanScannerViewModel$1", f = "ShopAndScanScannerViewModel.kt", l = {86}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f152877a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: nq.v$a$a, reason: collision with other inner class name */
        static final class C2364a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ v f152879a;

            C2364a(v vVar) {
                this.f152879a = vVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ViewState g(ShopAndScanTrip shopAndScanTrip, ShopAndScanItemDecorator shopAndScanItemDecorator, ViewState oldState) {
                Intrinsics.j(oldState, "oldState");
                return ViewState.b(oldState, null, false, false, false, false, false, false, ShopAndScanCartTotalsDecorator.INSTANCE.a(shopAndScanTrip.getStoreDetails().getIsGreenville(), shopAndScanTrip.c(), shopAndScanTrip.getCartDetails()), null, shopAndScanItemDecorator, 0, 1407, null);
            }

            @Override // pv.InterfaceC16562g
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object emit(final ShopAndScanTrip shopAndScanTrip, Continuation<? super Unit> continuation) {
                List<ShopAndScanItem> listC;
                ShopAndScanItem shopAndScanItem;
                if (shopAndScanTrip != null && (listC = shopAndScanTrip.c()) != null) {
                    Iterator<T> it = listC.iterator();
                    if (it.hasNext()) {
                        T next = it.next();
                        if (it.hasNext()) {
                            LocalDateTime timeUpdated = ((ShopAndScanItem) next).getTimestamp().getTimeUpdated();
                            do {
                                T next2 = it.next();
                                LocalDateTime timeUpdated2 = ((ShopAndScanItem) next2).getTimestamp().getTimeUpdated();
                                if (timeUpdated.compareTo(timeUpdated2) < 0) {
                                    next = next2;
                                    timeUpdated = timeUpdated2;
                                }
                            } while (it.hasNext());
                        }
                        shopAndScanItem = next;
                    } else {
                        shopAndScanItem = null;
                    }
                    ShopAndScanItem shopAndScanItem2 = shopAndScanItem;
                    if (shopAndScanItem2 != null) {
                        v vVar = this.f152879a;
                        final ShopAndScanItemDecorator shopAndScanItemDecoratorA = ShopAndScanItemDecorator.INSTANCE.a(shopAndScanItem2);
                        vVar.t().d(new Function1() { // from class: nq.u
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return v.a.C2364a.g(shopAndScanTrip, shopAndScanItemDecoratorA, (v.ViewState) obj);
                            }
                        });
                    }
                }
                return Unit.f143329a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return v.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f152877a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                InterfaceC16553F<ShopAndScanTrip> interfaceC16553FA = v.this.repository.a();
                C2364a c2364a = new C2364a(v.this);
                this.f152877a = 1;
                if (interfaceC16553FA.collect(c2364a, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lnq/v$b;", "", "<init>", "()V", "a", "Lnq/v$b$a;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnq/v$b$a;", "Lnq/v$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f152880a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public String toString() {
                return "RequestCameraPermission";
            }

            public int hashCode() {
                return 1006120950;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lnq/v$c;", "", "<init>", "()V", "f", "g", "j", "k", "h", "i", "l", "e", "m", "a", "b", "d", "c", "Lnq/v$c$a;", "Lnq/v$c$b;", "Lnq/v$c$c;", "Lnq/v$c$d;", "Lnq/v$c$e;", "Lnq/v$c$f;", "Lnq/v$c$g;", "Lnq/v$c$h;", "Lnq/v$c$i;", "Lnq/v$c$j;", "Lnq/v$c$k;", "Lnq/v$c$l;", "Lnq/v$c$m;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lnq/v$c$a;", "Lnq/v$c;", "LXp/a;", "barcode", "<init>", "(LXp/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LXp/a;", "()LXp/a;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nq.v$c$a, reason: from toString */
        public static final /* data */ class BarcodeScanned extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Xp.a barcode;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BarcodeScanned) && Intrinsics.e(this.barcode, ((BarcodeScanned) other).barcode);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BarcodeScanned(Xp.a barcode) {
                super(null);
                Intrinsics.j(barcode, "barcode");
                this.barcode = barcode;
            }

            /* renamed from: a, reason: from getter */
            public final Xp.a getBarcode() {
                return this.barcode;
            }

            public int hashCode() {
                return this.barcode.hashCode();
            }

            public String toString() {
                return "BarcodeScanned(barcode=" + this.barcode + ')';
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lnq/v$c$b;", "Lnq/v$c;", "", "permission", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nq.v$c$b, reason: from toString */
        public static final /* data */ class CheckCameraPermission extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean permission;

            public CheckCameraPermission(boolean z10) {
                super(null);
                this.permission = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CheckCameraPermission) && this.permission == ((CheckCameraPermission) other).permission;
            }

            /* renamed from: a, reason: from getter */
            public final boolean getPermission() {
                return this.permission;
            }

            public int hashCode() {
                return Boolean.hashCode(this.permission);
            }

            public String toString() {
                return "CheckCameraPermission(permission=" + this.permission + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lnq/v$c$c;", "Lnq/v$c;", "", PreferencesHelper.PREF_ID, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nq.v$c$c, reason: collision with other inner class name and from toString */
        public static final /* data */ class CloseItemAlertTag extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String id;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CloseItemAlertTag) && Intrinsics.e(this.id, ((CloseItemAlertTag) other).id);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CloseItemAlertTag(String id2) {
                super(null);
                Intrinsics.j(id2, "id");
                this.id = id2;
            }

            /* renamed from: a, reason: from getter */
            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            public String toString() {
                return "CloseItemAlertTag(id=" + this.id + ')';
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\n¨\u0006\u0018"}, d2 = {"Lnq/v$c$d;", "Lnq/v$c;", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "offerID", "", "itemID", "<init>", "(JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "Ljava/lang/String;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nq.v$c$d, reason: from toString */
        public static final /* data */ class CouponAction extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final long offerID;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String itemID;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CouponAction)) {
                    return false;
                }
                CouponAction couponAction = (CouponAction) other;
                return this.offerID == couponAction.offerID && Intrinsics.e(this.itemID, couponAction.itemID);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CouponAction(long j10, String itemID) {
                super(null);
                Intrinsics.j(itemID, "itemID");
                this.offerID = j10;
                this.itemID = itemID;
            }

            /* renamed from: a, reason: from getter */
            public final String getItemID() {
                return this.itemID;
            }

            /* renamed from: b, reason: from getter */
            public final long getOfferID() {
                return this.offerID;
            }

            public int hashCode() {
                return (Long.hashCode(this.offerID) * 31) + this.itemID.hashCode();
            }

            public String toString() {
                return "CouponAction(offerID=" + this.offerID + ", itemID=" + this.itemID + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lnq/v$c$e;", "Lnq/v$c;", "", PreferencesHelper.PREF_ID, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nq.v$c$e, reason: from toString */
        public static final /* data */ class FocusedQuantityStepper extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String id;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FocusedQuantityStepper) && Intrinsics.e(this.id, ((FocusedQuantityStepper) other).id);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FocusedQuantityStepper(String id2) {
                super(null);
                Intrinsics.j(id2, "id");
                this.id = id2;
            }

            /* renamed from: a, reason: from getter */
            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            public String toString() {
                return "FocusedQuantityStepper(id=" + this.id + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnq/v$c$f;", "Lnq/v$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class f extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final f f152887a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public String toString() {
                return "NavigateToCart";
            }

            public int hashCode() {
                return -1621157648;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnq/v$c$g;", "Lnq/v$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class g extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final g f152888a = new g();

            private g() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof g);
            }

            public String toString() {
                return "NavigateToPLU";
            }

            public int hashCode() {
                return -329378263;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnq/v$c$h;", "Lnq/v$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class h extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final h f152889a = new h();

            private h() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            public String toString() {
                return "ToggleCamera";
            }

            public int hashCode() {
                return 1617378429;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnq/v$c$i;", "Lnq/v$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class i extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final i f152890a = new i();

            private i() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            public String toString() {
                return "ToggleContinuousScan";
            }

            public int hashCode() {
                return 1843171204;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnq/v$c$j;", "Lnq/v$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class j extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final j f152891a = new j();

            private j() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof j);
            }

            public String toString() {
                return "ToggleFlash";
            }

            public int hashCode() {
                return 1579281304;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnq/v$c$k;", "Lnq/v$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class k extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final k f152892a = new k();

            private k() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof k);
            }

            public String toString() {
                return "ToggleSound";
            }

            public int hashCode() {
                return 1591395511;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnq/v$c$l;", "Lnq/v$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class l extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final l f152893a = new l();

            private l() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof l);
            }

            public String toString() {
                return "UnfocusedQuantityStepper";
            }

            public int hashCode() {
                return 1923495948;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0015"}, d2 = {"Lnq/v$c$m;", "Lnq/v$c;", "", PreferencesHelper.PREF_ID, "", "quantity", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nq.v$c$m, reason: from toString */
        public static final /* data */ class UpdateItemQuantity extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String id;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int quantity;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateItemQuantity)) {
                    return false;
                }
                UpdateItemQuantity updateItemQuantity = (UpdateItemQuantity) other;
                return Intrinsics.e(this.id, updateItemQuantity.id) && this.quantity == updateItemQuantity.quantity;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateItemQuantity(String id2, int i10) {
                super(null);
                Intrinsics.j(id2, "id");
                this.id = id2;
                this.quantity = i10;
            }

            /* renamed from: a, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* renamed from: b, reason: from getter */
            public final int getQuantity() {
                return this.quantity;
            }

            public int hashCode() {
                return (this.id.hashCode() * 31) + Integer.hashCode(this.quantity);
            }

            public String toString() {
                return "UpdateItemQuantity(id=" + this.id + ", quantity=" + this.quantity + ')';
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0084\u0001\u0010\u0016\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b \u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b\u0007\u0010$R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b*\u0010$R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b\u000b\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b&\u0010,R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b)\u0010-\u001a\u0004\b%\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b'\u0010/\u001a\u0004\b(\u00100R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u001b¨\u00064"}, d2 = {"Lnq/v$d;", "", "", "Lcom/meijer/mobile/shopandscan/domain/model/ShopAndScanItemLocalID;", "quantityStepperSelected", "", "showCameraPreview", "isScanEnabled", "isScanSoundEnabled", "isFlashEnabled", "isContinuousScanEnabled", "isContinuousScanPopupDismissed", "Lhq/c;", "cartTotals", "Lzq/a;", "cameraLens", "Lhq/f;", "lastScannedItem", "", "quantity", "<init>", "(Ljava/lang/String;ZZZZZZLhq/c;Lzq/a;Lhq/f;I)V", "a", "(Ljava/lang/String;ZZZZZZLhq/c;Lzq/a;Lhq/f;I)Lnq/v$d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "Z", "g", "()Z", "c", "d", "j", "e", "i", "h", "Lhq/c;", "()Lhq/c;", "Lzq/a;", "()Lzq/a;", "Lhq/f;", "()Lhq/f;", "k", "I", "getQuantity", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nq.v$d, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String quantityStepperSelected;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showCameraPreview;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isScanEnabled;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isScanSoundEnabled;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFlashEnabled;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isContinuousScanEnabled;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isContinuousScanPopupDismissed;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final ShopAndScanCartTotalsDecorator cartTotals;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC18543a cameraLens;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final ShopAndScanItemDecorator lastScannedItem;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final int quantity;

        public ViewState() {
            this(null, false, false, false, false, false, false, null, null, null, 0, 2047, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.quantityStepperSelected, viewState.quantityStepperSelected) && this.showCameraPreview == viewState.showCameraPreview && this.isScanEnabled == viewState.isScanEnabled && this.isScanSoundEnabled == viewState.isScanSoundEnabled && this.isFlashEnabled == viewState.isFlashEnabled && this.isContinuousScanEnabled == viewState.isContinuousScanEnabled && this.isContinuousScanPopupDismissed == viewState.isContinuousScanPopupDismissed && Intrinsics.e(this.cartTotals, viewState.cartTotals) && Intrinsics.e(this.cameraLens, viewState.cameraLens) && Intrinsics.e(this.lastScannedItem, viewState.lastScannedItem) && this.quantity == viewState.quantity;
        }

        public ViewState(String quantityStepperSelected, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, ShopAndScanCartTotalsDecorator cartTotals, AbstractC18543a cameraLens, ShopAndScanItemDecorator shopAndScanItemDecorator, int i10) {
            Intrinsics.j(quantityStepperSelected, "quantityStepperSelected");
            Intrinsics.j(cartTotals, "cartTotals");
            Intrinsics.j(cameraLens, "cameraLens");
            this.quantityStepperSelected = quantityStepperSelected;
            this.showCameraPreview = z10;
            this.isScanEnabled = z11;
            this.isScanSoundEnabled = z12;
            this.isFlashEnabled = z13;
            this.isContinuousScanEnabled = z14;
            this.isContinuousScanPopupDismissed = z15;
            this.cartTotals = cartTotals;
            this.cameraLens = cameraLens;
            this.lastScannedItem = shopAndScanItemDecorator;
            this.quantity = i10;
        }

        public static /* synthetic */ ViewState b(ViewState viewState, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, ShopAndScanCartTotalsDecorator shopAndScanCartTotalsDecorator, AbstractC18543a abstractC18543a, ShopAndScanItemDecorator shopAndScanItemDecorator, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = viewState.quantityStepperSelected;
            }
            if ((i11 & 2) != 0) {
                z10 = viewState.showCameraPreview;
            }
            if ((i11 & 4) != 0) {
                z11 = viewState.isScanEnabled;
            }
            if ((i11 & 8) != 0) {
                z12 = viewState.isScanSoundEnabled;
            }
            if ((i11 & 16) != 0) {
                z13 = viewState.isFlashEnabled;
            }
            if ((i11 & 32) != 0) {
                z14 = viewState.isContinuousScanEnabled;
            }
            if ((i11 & 64) != 0) {
                z15 = viewState.isContinuousScanPopupDismissed;
            }
            if ((i11 & 128) != 0) {
                shopAndScanCartTotalsDecorator = viewState.cartTotals;
            }
            if ((i11 & 256) != 0) {
                abstractC18543a = viewState.cameraLens;
            }
            if ((i11 & 512) != 0) {
                shopAndScanItemDecorator = viewState.lastScannedItem;
            }
            if ((i11 & 1024) != 0) {
                i10 = viewState.quantity;
            }
            ShopAndScanItemDecorator shopAndScanItemDecorator2 = shopAndScanItemDecorator;
            int i12 = i10;
            ShopAndScanCartTotalsDecorator shopAndScanCartTotalsDecorator2 = shopAndScanCartTotalsDecorator;
            AbstractC18543a abstractC18543a2 = abstractC18543a;
            boolean z16 = z14;
            boolean z17 = z15;
            boolean z18 = z13;
            boolean z19 = z11;
            return viewState.a(str, z10, z19, z12, z18, z16, z17, shopAndScanCartTotalsDecorator2, abstractC18543a2, shopAndScanItemDecorator2, i12);
        }

        public final ViewState a(String quantityStepperSelected, boolean showCameraPreview, boolean isScanEnabled, boolean isScanSoundEnabled, boolean isFlashEnabled, boolean isContinuousScanEnabled, boolean isContinuousScanPopupDismissed, ShopAndScanCartTotalsDecorator cartTotals, AbstractC18543a cameraLens, ShopAndScanItemDecorator lastScannedItem, int quantity) {
            Intrinsics.j(quantityStepperSelected, "quantityStepperSelected");
            Intrinsics.j(cartTotals, "cartTotals");
            Intrinsics.j(cameraLens, "cameraLens");
            return new ViewState(quantityStepperSelected, showCameraPreview, isScanEnabled, isScanSoundEnabled, isFlashEnabled, isContinuousScanEnabled, isContinuousScanPopupDismissed, cartTotals, cameraLens, lastScannedItem, quantity);
        }

        /* renamed from: c, reason: from getter */
        public final AbstractC18543a getCameraLens() {
            return this.cameraLens;
        }

        /* renamed from: d, reason: from getter */
        public final ShopAndScanCartTotalsDecorator getCartTotals() {
            return this.cartTotals;
        }

        /* renamed from: e, reason: from getter */
        public final ShopAndScanItemDecorator getLastScannedItem() {
            return this.lastScannedItem;
        }

        /* renamed from: f, reason: from getter */
        public final String getQuantityStepperSelected() {
            return this.quantityStepperSelected;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getShowCameraPreview() {
            return this.showCameraPreview;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getIsContinuousScanEnabled() {
            return this.isContinuousScanEnabled;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((this.quantityStepperSelected.hashCode() * 31) + Boolean.hashCode(this.showCameraPreview)) * 31) + Boolean.hashCode(this.isScanEnabled)) * 31) + Boolean.hashCode(this.isScanSoundEnabled)) * 31) + Boolean.hashCode(this.isFlashEnabled)) * 31) + Boolean.hashCode(this.isContinuousScanEnabled)) * 31) + Boolean.hashCode(this.isContinuousScanPopupDismissed)) * 31) + this.cartTotals.hashCode()) * 31) + this.cameraLens.hashCode()) * 31;
            ShopAndScanItemDecorator shopAndScanItemDecorator = this.lastScannedItem;
            return ((iHashCode + (shopAndScanItemDecorator == null ? 0 : shopAndScanItemDecorator.hashCode())) * 31) + Integer.hashCode(this.quantity);
        }

        /* renamed from: i, reason: from getter */
        public final boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        /* renamed from: j, reason: from getter */
        public final boolean getIsScanSoundEnabled() {
            return this.isScanSoundEnabled;
        }

        public String toString() {
            return "ViewState(quantityStepperSelected=" + this.quantityStepperSelected + ", showCameraPreview=" + this.showCameraPreview + ", isScanEnabled=" + this.isScanEnabled + ", isScanSoundEnabled=" + this.isScanSoundEnabled + ", isFlashEnabled=" + this.isFlashEnabled + ", isContinuousScanEnabled=" + this.isContinuousScanEnabled + ", isContinuousScanPopupDismissed=" + this.isContinuousScanPopupDismissed + ", cartTotals=" + this.cartTotals + ", cameraLens=" + this.cameraLens + ", lastScannedItem=" + this.lastScannedItem + ", quantity=" + this.quantity + ')';
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ ViewState(java.lang.String r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, hq.ShopAndScanCartTotalsDecorator r10, zq.AbstractC18543a r11, hq.ShopAndScanItemDecorator r12, int r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
            /*
                r2 = this;
                r15 = r14 & 1
                if (r15 == 0) goto L6
                java.lang.String r3 = ""
            L6:
                r15 = r14 & 2
                r0 = 0
                if (r15 == 0) goto Lc
                r4 = r0
            Lc:
                r15 = r14 & 4
                r1 = 1
                if (r15 == 0) goto L12
                r5 = r1
            L12:
                r15 = r14 & 8
                if (r15 == 0) goto L17
                r6 = r1
            L17:
                r15 = r14 & 16
                if (r15 == 0) goto L1c
                r7 = r0
            L1c:
                r15 = r14 & 32
                if (r15 == 0) goto L21
                r8 = r0
            L21:
                r15 = r14 & 64
                if (r15 == 0) goto L26
                r9 = r0
            L26:
                r15 = r14 & 128(0x80, float:1.8E-43)
                r0 = 0
                if (r15 == 0) goto L31
                hq.c r10 = new hq.c
                r15 = 3
                r10.<init>(r0, r0, r15, r0)
            L31:
                r15 = r14 & 256(0x100, float:3.59E-43)
                if (r15 == 0) goto L37
                zq.a$b r11 = zq.AbstractC18543a.b.f173167a
            L37:
                r15 = r14 & 512(0x200, float:7.17E-43)
                if (r15 == 0) goto L3c
                r12 = r0
            L3c:
                r14 = r14 & 1024(0x400, float:1.435E-42)
                if (r14 == 0) goto L4d
                r15 = r1
                r13 = r11
                r14 = r12
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
                goto L59
            L4d:
                r15 = r13
                r14 = r12
                r12 = r10
                r13 = r11
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
            L59:
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nq.v.ViewState.<init>(java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, hq.c, zq.a, hq.f, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.scanner.ShopAndScanScannerViewModel$checkCameraPermission$1", f = "ShopAndScanScannerViewModel.kt", l = {137}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f152907a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f152909c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z10, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f152909c = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ViewState g(boolean z10, ViewState viewState) {
            return ViewState.b(viewState, null, z10, false, false, false, false, false, null, null, null, 0, 2045, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return v.this.new e(this.f152909c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f152907a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C17896a<ViewState, b> c17896aT = v.this.t();
                final boolean z10 = this.f152909c;
                c17896aT.d(new Function1() { // from class: nq.w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return v.e.g(z10, (v.ViewState) obj2);
                    }
                });
                if (!this.f152909c) {
                    this.f152907a = 1;
                    if (Z.b(1000L, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
            v.this.t().c(b.a.f152880a);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.scanner.ShopAndScanScannerViewModel$closeItemAlertTag$1", f = "ShopAndScanScannerViewModel.kt", l = {252}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f152910a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f152912c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f152912c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return v.this.new f(this.f152912c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f152910a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Wp.a aVar = v.this.repository;
                String str = this.f152912c;
                this.f152910a = 1;
                if (aVar.l(str, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.scanner.ShopAndScanScannerViewModel$couponAction$1", f = "ShopAndScanScannerViewModel.kt", l = {247}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f152913a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f152915c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f152916d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j10, String str, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f152915c = j10;
            this.f152916d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return v.this.new g(this.f152915c, this.f152916d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f152913a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Wp.a aVar = v.this.repository;
                long j10 = this.f152915c;
                String str = this.f152916d;
                this.f152913a = 1;
                if (aVar.g(j10, str, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.scanner.ShopAndScanScannerViewModel$focusQuantityStepper$1", f = "ShopAndScanScannerViewModel.kt", l = {}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f152917a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f152919c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f152919c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ViewState g(String str, ViewState viewState) {
            return ViewState.b(viewState, str, false, false, false, false, false, false, null, null, null, 0, 2046, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return v.this.new h(this.f152919c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f152917a == 0) {
                ResultKt.b(obj);
                C17896a<ViewState, b> c17896aT = v.this.t();
                final String str = this.f152919c;
                c17896aT.d(new Function1() { // from class: nq.x
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return v.h.g(str, (v.ViewState) obj2);
                    }
                });
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.scanner.ShopAndScanScannerViewModel$toggleCamera$1", f = "ShopAndScanScannerViewModel.kt", l = {}, m = "invokeSuspend")
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f152920a;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return v.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ViewState g(ViewState viewState) {
            AbstractC18543a cameraLens = viewState.getCameraLens();
            AbstractC18543a abstractC18543a = AbstractC18543a.b.f173167a;
            if (Intrinsics.e(cameraLens, abstractC18543a)) {
                abstractC18543a = AbstractC18543a.C2794a.f173166a;
            }
            return ViewState.b(viewState, null, false, false, false, false, false, false, null, abstractC18543a, null, 0, 1791, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f152920a == 0) {
                ResultKt.b(obj);
                v.this.t().d(new Function1() { // from class: nq.y
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return v.i.g((v.ViewState) obj2);
                    }
                });
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.scanner.ShopAndScanScannerViewModel$toggleContinuousScan$1", f = "ShopAndScanScannerViewModel.kt", l = {}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f152922a;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return v.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ViewState g(ViewState viewState) {
            return ViewState.b(viewState, null, false, false, false, false, !viewState.getIsContinuousScanEnabled(), false, null, null, null, 0, 2015, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f152922a == 0) {
                ResultKt.b(obj);
                v.this.t().d(new Function1() { // from class: nq.z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return v.j.g((v.ViewState) obj2);
                    }
                });
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.scanner.ShopAndScanScannerViewModel$toggleFlash$1", f = "ShopAndScanScannerViewModel.kt", l = {}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f152924a;

        k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return v.this.new k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ViewState g(ViewState viewState) {
            return ViewState.b(viewState, null, false, false, false, !viewState.getIsFlashEnabled(), false, false, null, null, null, 0, 2031, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f152924a == 0) {
                ResultKt.b(obj);
                v.this.t().d(new Function1() { // from class: nq.A
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return v.k.g((v.ViewState) obj2);
                    }
                });
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.scanner.ShopAndScanScannerViewModel$toggleSound$1", f = "ShopAndScanScannerViewModel.kt", l = {}, m = "invokeSuspend")
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f152926a;

        l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return v.this.new l(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ViewState g(ViewState viewState) {
            return ViewState.b(viewState, null, false, false, !viewState.getIsScanSoundEnabled(), false, false, false, null, null, null, 0, 2039, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f152926a == 0) {
                ResultKt.b(obj);
                v.this.t().d(new Function1() { // from class: nq.B
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return v.l.g((v.ViewState) obj2);
                    }
                });
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.scanner.ShopAndScanScannerViewModel$unfocusedQuantityStepper$1", f = "ShopAndScanScannerViewModel.kt", l = {}, m = "invokeSuspend")
    static final class m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f152928a;

        m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ViewState g(ViewState viewState) {
            return ViewState.b(viewState, "", false, false, false, false, false, false, null, null, null, 0, 2046, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return v.this.new m(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f152928a == 0) {
                ResultKt.b(obj);
                v.this.t().d(new Function1() { // from class: nq.C
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return v.m.g((v.ViewState) obj2);
                    }
                });
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.scanner.ShopAndScanScannerViewModel$updateItem$1", f = "ShopAndScanScannerViewModel.kt", l = {167}, m = "invokeSuspend")
    static final class n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f152930a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f152932c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f152933d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, int i10, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f152932c = str;
            this.f152933d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return v.this.new n(this.f152932c, this.f152933d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f152930a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Wp.a aVar = v.this.repository;
                UpdateItemRequest updateItemRequest = new UpdateItemRequest(this.f152932c, this.f152933d);
                this.f152930a = 1;
                if (aVar.e(updateItemRequest, this) == objF) {
                    return objF;
                }
            }
            v.this.r(this.f152932c);
            return Unit.f143329a;
        }
    }

    public v(Yp.a barcodeScannedUseCase, C18213d navManager, Wp.a repository, zq.d scannerController) {
        Intrinsics.j(barcodeScannedUseCase, "barcodeScannedUseCase");
        Intrinsics.j(navManager, "navManager");
        Intrinsics.j(repository, "repository");
        Intrinsics.j(scannerController, "scannerController");
        this.barcodeScannedUseCase = barcodeScannedUseCase;
        this.navManager = navManager;
        this.repository = repository;
        this.scannerController = scannerController;
        this.modelStore = new C17896a<>(new ViewState(null, false, false, false, false, false, false, null, null, null, 0, 2047, null));
        this.enabledBarcodeSymbologies = CollectionsKt.p(new a.UPCA(""), new a.NSC2(""), new a.UPCE(""), new a.EAN8(""), new a.EAN13(""), new a.CODE128(""), new a.QR(""));
        C15809k.d(d0.a(this), null, null, new a(null), 3, null);
    }

    private final void w() {
        this.navManager.b(C18213d.a.C2748a.f170942b);
    }

    private final void x() {
        this.navManager.b(C18213d.a.g.f170948b);
    }

    private final void y(Xp.a barcode) {
        Xp.a aVarA = this.barcodeScannedUseCase.a(barcode);
        if (aVarA != null) {
            this.repository.c(new AddItemRequest(aVarA, 1, false, 4, null));
            if (!this.modelStore.b().getValue().getIsContinuousScanEnabled()) {
                w();
            }
        }
        E();
    }

    public final List<Xp.a> s() {
        return this.enabledBarcodeSymbologies;
    }

    public final C17896a<ViewState, b> t() {
        return this.modelStore;
    }

    /* renamed from: u, reason: from getter */
    public final zq.d getScannerController() {
        return this.scannerController;
    }

    public final void v(c event) {
        Intrinsics.j(event, "event");
        if (event instanceof c.CheckCameraPermission) {
            o(((c.CheckCameraPermission) event).getPermission());
            return;
        }
        if (event instanceof c.f) {
            w();
            Unit unit = Unit.f143329a;
            return;
        }
        if (event instanceof c.g) {
            x();
            Unit unit2 = Unit.f143329a;
            return;
        }
        if (event instanceof c.j) {
            C();
            return;
        }
        if (event instanceof c.k) {
            D();
            return;
        }
        if (event instanceof c.h) {
            A();
            return;
        }
        if (event instanceof c.i) {
            B();
            return;
        }
        if (event instanceof c.CloseItemAlertTag) {
            p(((c.CloseItemAlertTag) event).getId());
            return;
        }
        if (event instanceof c.BarcodeScanned) {
            y(((c.BarcodeScanned) event).getBarcode());
            if (!this.modelStore.b().getValue().getIsContinuousScanEnabled()) {
                w();
            }
            Unit unit3 = Unit.f143329a;
            return;
        }
        if (event instanceof c.FocusedQuantityStepper) {
            r(((c.FocusedQuantityStepper) event).getId());
            Unit unit4 = Unit.f143329a;
            return;
        }
        if (event instanceof c.l) {
            E();
            Unit unit5 = Unit.f143329a;
        } else if (event instanceof c.UpdateItemQuantity) {
            c.UpdateItemQuantity updateItemQuantity = (c.UpdateItemQuantity) event;
            F(updateItemQuantity.getId(), updateItemQuantity.getQuantity());
        } else {
            if (!(event instanceof c.CouponAction)) {
                throw new NoWhenBranchMatchedException();
            }
            c.CouponAction couponAction = (c.CouponAction) event;
            q(couponAction.getOfferID(), couponAction.getItemID());
            Unit unit6 = Unit.f143329a;
        }
    }

    private final C0 A() {
        return C15809k.d(d0.a(this), null, null, new i(null), 3, null);
    }

    private final C0 B() {
        return C15809k.d(d0.a(this), null, null, new j(null), 3, null);
    }

    private final C0 C() {
        return C15809k.d(d0.a(this), null, null, new k(null), 3, null);
    }

    private final C0 D() {
        return C15809k.d(d0.a(this), null, null, new l(null), 3, null);
    }

    private final void E() {
        C15809k.d(d0.a(this), null, null, new m(null), 3, null);
    }

    private final C0 F(String id2, int quantity) {
        return C15809k.d(d0.a(this), null, null, new n(id2, quantity, null), 3, null);
    }

    private final C0 o(boolean permission) {
        return C15809k.d(d0.a(this), null, null, new e(permission, null), 3, null);
    }

    private final C0 p(String id2) {
        return C15809k.d(d0.a(this), null, null, new f(id2, null), 3, null);
    }

    private final void q(long offerID, String itemID) {
        C15809k.d(d0.a(this), null, null, new g(offerID, itemID, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(String id2) {
        C15809k.d(d0.a(this), null, null, new h(id2, null), 3, null);
    }
}
