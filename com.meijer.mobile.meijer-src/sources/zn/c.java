package zn;

import Co.ProductFullDetails;
import Ds.j;
import Lu.g;
import android.view.SurfaceHolder;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.X;
import com.meijer.mobile.meijer.activity.scan.a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import io.reactivex.u;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import mv.AbstractC15779K;
import mv.InterfaceC15783O;
import retrofit2.HttpException;
import tv.n;
import um.AbstractC17446a;
import um.InterfaceC17448c;
import vm.C17693b;
import vs.ProductListDecorator;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001pB;\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\"\u0010\u0016J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0010H\u0002¢\u0006\u0004\b%\u0010\u0012J\u000f\u0010&\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010\u0012J\u000f\u0010'\u001a\u00020\u0010H\u0016¢\u0006\u0004\b'\u0010\u0012J\u0011\u0010)\u001a\u0004\u0018\u00010(H\u0014¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0010¢\u0006\u0004\b+\u0010\u0012J\u0017\u0010-\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00102\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J/\u00107\u001a\u00020\u00102\u0006\u00100\u001a\u00020/2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u0002032\u0006\u00106\u001a\u000203H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00102\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b9\u00102J\r\u0010:\u001a\u00020\u0010¢\u0006\u0004\b:\u0010\u0012J\r\u0010;\u001a\u00020\u0010¢\u0006\u0004\b;\u0010\u0012J\u000f\u0010<\u001a\u00020\u0010H\u0016¢\u0006\u0004\b<\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020J0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR$\u0010S\u001a\u0002032\u0006\u0010N\u001a\u0002038G@BX\u0086\u000e¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0016\u0010U\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010@R\u0016\u0010W\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010@R\u0016\u0010Y\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010@R\u0016\u0010]\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010`\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010@R\u0016\u0010d\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010@R\u0011\u0010f\u001a\u0002038G¢\u0006\u0006\u001a\u0004\be\u0010RR\u0011\u0010j\u001a\u00020g8G¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0011\u0010m\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0011\u0010o\u001a\u0002038F¢\u0006\u0006\u001a\u0004\bn\u0010R¨\u0006q"}, d2 = {"Lzn/c;", "Lum/a;", "Landroid/view/SurfaceHolder$Callback;", "Lcom/meijer/mobile/meijer/activity/scan/a$a;", "Lvm/b;", "appBackgroundManager", "LRo/c;", "productsRepository", "", "allowCountIncrement", "isReceiptScanner", "singleScanMode", "Lmv/K;", "ioDispatcher", "<init>", "(Lvm/b;LRo/c;ZZZLmv/K;)V", "", "l0", "()V", "", "barcode", "y0", "(Ljava/lang/String;)V", "w0", "b0", "LCo/h;", "product", "z0", "(LCo/h;)V", "", "exception", "t0", "(Ljava/lang/Throwable;)V", "message", "A0", "q0", "(Ljava/lang/String;)Z", "a0", "Q", "S", "Lzn/c$a;", "i0", "()Lzn/c$a;", "r0", "LXd/a;", "C", "(LXd/a;)V", "Landroid/view/SurfaceHolder;", "holder", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "", "format", "width", "height", "surfaceChanged", "(Landroid/view/SurfaceHolder;III)V", "surfaceDestroyed", "v0", "u0", "P", "d", "LRo/c;", "e", "Z", "f", "g", "h", "Lmv/K;", "LJu/a;", "i", "LJu/a;", "disposables", "", "Lvs/f;", "j", "Ljava/util/List;", "scannedItems", "value", "k", "I", "getTotalScanned", "()I", "totalScanned", "l", "singleScanComplete", "m", "blockMultiScanUntilLoaded", "n", "receiptScanComplete", "j$/time/Instant", "o", "Lj$/time/Instant;", "lastScanTimeStamp", "p", "Ljava/lang/String;", "previousBarcode", "q", "viewReady", "r", "permissionRequested", "g0", "progressViewVisibility", "Lbk/a;", "h0", "()Lbk/a;", "totalScannedText", "p0", "()Z", "isBottomSheetHidden", "f0", "bottomSheetInitState", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class c extends AbstractC17446a implements SurfaceHolder.Callback, a.InterfaceC1746a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Ro.c productsRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean allowCountIncrement;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isReceiptScanner;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean singleScanMode;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<ProductListDecorator> scannedItems;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int totalScanned;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean singleScanComplete;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean blockMultiScanUntilLoaded;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean receiptScanComplete;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Instant lastScanTimeStamp;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private String previousBarcode;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean viewReady;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean permissionRequested;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\bH&¢\u0006\u0004\b\u0013\u0010\u000bJ\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0014\u0010\u000bJ\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0005H&¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0005H&¢\u0006\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006 À\u0006\u0001"}, d2 = {"Lzn/c$a;", "Lum/c;", "", "LCo/h;", "scannedItems", "", "x", "(Ljava/util/List;)V", "", "barcode", "t0", "(Ljava/lang/String;)V", "Lvs/f;", "productItem", "", "isNewItem", "L", "(Lvs/f;Z)V", "errorMessage", "i0", "A0", "", "acceptedBarcodeTypes", "u", "(I)V", "V", "()V", "z0", "b1", "e1", "()Z", "isCameraPermissionGranted", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public interface a extends InterfaceC17448c {
        void A0(String barcode);

        void L(ProductListDecorator productItem, boolean isNewItem);

        void V();

        void b1();

        boolean e1();

        void i0(String errorMessage);

        void t0(String barcode);

        void u(int acceptedBarcodeTypes);

        void x(List<ProductFullDetails> scannedItems);

        void z0();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LCo/h;", "<anonymous>", "(Lmv/O;)LCo/h;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.scan.viewmodel.ScanItem$fetchUpcResults$1", f = "ScanItem.kt", l = {165}, m = "invokeSuspend")
    /* loaded from: classes10.dex */
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ProductFullDetails>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f173093a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f173095c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f173095c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new b(this.f173095c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ProductFullDetails> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f173093a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Ro.c cVar = c.this.productsRepository;
            String str = this.f173095c;
            this.f173093a = 1;
            Object objL = cVar.l(str, this);
            if (objL == objF) {
                return objF;
            }
            return objL;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zn.c$c, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    /* synthetic */ class C2790c extends FunctionReferenceImpl implements Function1<ProductFullDetails, Unit> {
        C2790c(Object obj) {
            super(1, obj, c.class, "processSearchResults", "processSearchResults(Lcom/meijer/mobile/product/model/fulldetails/ProductFullDetails;)V", 0);
        }

        public final void a(ProductFullDetails p02) {
            Intrinsics.j(p02, "p0");
            ((c) this.receiver).z0(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ProductFullDetails productFullDetails) {
            a(productFullDetails);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes10.dex */
    /* synthetic */ class d extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        d(Object obj) {
            super(1, obj, c.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable p02) {
            Intrinsics.j(p02, "p0");
            ((c) this.receiver).t0(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    private final void y0(String barcode) {
        this.singleScanComplete = true;
        a aVarI0 = i0();
        if (aVarI0 != null) {
            aVarI0.b1();
        }
        a aVarI02 = i0();
        if (aVarI02 != null) {
            aVarI02.t0(barcode);
        }
    }

    @Override // um.AbstractC17446a
    public void S() {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        Intrinsics.j(holder, "holder");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C17693b c17693b, Ro.c productsRepository, boolean z10, boolean z11, boolean z12, AbstractC15779K ioDispatcher) {
        super(c17693b);
        Intrinsics.j(productsRepository, "productsRepository");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.productsRepository = productsRepository;
        this.allowCountIncrement = z10;
        this.isReceiptScanner = z11;
        this.singleScanMode = z12;
        this.ioDispatcher = ioDispatcher;
        this.disposables = new Ju.a();
        this.scannedItems = new ArrayList();
        Instant instantNow = Instant.now();
        Intrinsics.i(instantNow, "now(...)");
        this.lastScanTimeStamp = instantNow;
        this.previousBarcode = "";
    }

    private final void b0(String barcode) {
        u uVarB = n.b(this.ioDispatcher, new b(barcode, null));
        final C2790c c2790c = new C2790c(this);
        g gVar = new g() { // from class: zn.a
            @Override // Lu.g
            public final void accept(Object obj) {
                c.c0(c2790c, obj);
            }
        };
        final d dVar = new d(this);
        Dk.a.a(uVarB.o(gVar, new g() { // from class: zn.b
            @Override // Lu.g
            public final void accept(Object obj) {
                c.d0(dVar, obj);
            }
        }), this.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(Throwable exception) {
        this.f164283b = AbstractC17446a.EnumC2605a.NEEDS_REFRESH;
        this.blockMultiScanUntilLoaded = false;
        qw.a.INSTANCE.f(exception, "Unable to find UPC product", new Object[0]);
        if ((exception instanceof HttpException) && new IntRange(HttpResponseStatus.ERROR_BAD_REQUEST, 499).p(((HttpException) exception).code())) {
            A0("Unable to find product");
        } else {
            A0("An error has occurred. Please try again");
        }
        notifyPropertyChanged(12);
    }

    private final void w0(String barcode) {
        if (this.blockMultiScanUntilLoaded || q0(barcode)) {
            return;
        }
        a aVarI0 = i0();
        if (aVarI0 != null) {
            aVarI0.b1();
        }
        this.previousBarcode = barcode;
        this.blockMultiScanUntilLoaded = true;
        this.f164283b = AbstractC17446a.EnumC2605a.REFRESHING_DATA;
        notifyPropertyChanged(12);
        b0(barcode);
        Instant instantNow = Instant.now();
        Intrinsics.i(instantNow, "now(...)");
        this.lastScanTimeStamp = instantNow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0(ProductFullDetails product) {
        Object next;
        this.f164283b = AbstractC17446a.EnumC2605a.IDLE;
        boolean z10 = false;
        this.blockMultiScanUntilLoaded = false;
        notifyPropertyChanged(12);
        Iterator<T> it = this.scannedItems.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (StringsKt.H(((ProductListDecorator) next).getProduct().getCode(), product.getCode(), true)) {
                    break;
                }
            }
        }
        ProductListDecorator productListDecoratorB = (ProductListDecorator) next;
        if (productListDecoratorB == null) {
            productListDecoratorB = ProductListDecorator.Companion.b(ProductListDecorator.INSTANCE, product, null, null, null, false, null, null, false, null, null, null, false, null, null, false, 0, 65534, null);
            this.scannedItems.add(0, productListDecoratorB);
            z10 = true;
        }
        if (this.allowCountIncrement) {
            ProductFullDetails product2 = productListDecoratorB.getProduct();
            product2.L(product2.getQuantity() + 1);
        }
        if (this.allowCountIncrement || z10) {
            this.totalScanned++;
        }
        notifyPropertyChanged(14);
        notifyPropertyChanged(15);
        a aVarI0 = i0();
        if (aVarI0 != null) {
            aVarI0.L(productListDecoratorB, z10);
        }
    }

    @Override // com.meijer.mobile.meijer.activity.scan.a.InterfaceC1746a
    public void C(Xd.a barcode) {
        String str;
        Intrinsics.j(barcode, "barcode");
        if (this.singleScanComplete || (str = barcode.f42093b) == null || StringsKt.s0(str)) {
            return;
        }
        if (!this.isReceiptScanner) {
            String strA = j.a(barcode);
            Intrinsics.i(strA, "convertBarcodeToValidFormat(...)");
            if (this.singleScanMode) {
                y0(strA);
                return;
            } else {
                w0(strA);
                return;
            }
        }
        if (!this.receiptScanComplete && j.c(barcode) && N()) {
            a aVarI0 = i0();
            if (aVarI0 != null) {
                aVarI0.b1();
            }
            a aVarI02 = i0();
            if (aVarI02 != null) {
                String rawValue = barcode.f42093b;
                Intrinsics.i(rawValue, "rawValue");
                aVarI02.A0(rawValue);
            }
            this.receiptScanComplete = true;
        }
    }

    @Override // um.AbstractC17446a
    public void P() {
        this.disposables.d();
        super.P();
    }

    public final int g0() {
        return this.f164283b == AbstractC17446a.EnumC2605a.REFRESHING_DATA ? 0 : 8;
    }

    public final AbstractC6392a h0() {
        return AbstractC6392a.INSTANCE.b(X.f100305h, this.totalScanned, new Object[0]);
    }

    public final boolean p0() {
        return this.singleScanMode || this.isReceiptScanner;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder holder) {
        Intrinsics.j(holder, "holder");
        this.viewReady = true;
        l0();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder holder) {
        Intrinsics.j(holder, "holder");
        this.viewReady = false;
    }

    private final void A0(String message) {
        a aVarI0 = i0();
        if (aVarI0 != null) {
            aVarI0.i0(message);
        }
    }

    private final void a0() {
        int i10;
        a aVarI0 = i0();
        if (!this.viewReady) {
            aVarI0 = null;
        }
        if (aVarI0 != null) {
            if (this.isReceiptScanner) {
                i10 = 18;
            } else {
                i10 = 1648;
            }
            aVarI0.u(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void l0() {
        a aVarI0 = i0();
        if (aVarI0 != null) {
            if (aVarI0.e1()) {
                a0();
            } else if (!this.permissionRequested) {
                this.permissionRequested = true;
                aVarI0.z0();
            }
        }
    }

    private final boolean q0(String barcode) {
        if (Math.abs((Instant.now().toEpochMilli() - this.lastScanTimeStamp.toEpochMilli()) / 1000) < 2 && Intrinsics.e(this.previousBarcode, barcode)) {
            return true;
        }
        return false;
    }

    @Override // um.AbstractC17446a
    public void Q() {
        super.Q();
        Instant instantNow = Instant.now();
        Intrinsics.i(instantNow, "now(...)");
        this.lastScanTimeStamp = instantNow;
        if (this.viewReady) {
            l0();
        }
    }

    public final int f0() {
        if (p0()) {
            return 5;
        }
        return 4;
    }

    protected a i0() {
        return (a) super.M();
    }

    public final void r0() {
        a aVarI0 = i0();
        if (aVarI0 != null) {
            List<ProductListDecorator> list = this.scannedItems;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ProductListDecorator) it.next()).getProduct());
            }
            aVarI0.x(arrayList);
        }
    }

    public final void u0() {
        a aVarI0 = i0();
        if (aVarI0 != null) {
            aVarI0.V();
        }
    }

    public final void v0() {
        a0();
    }
}
