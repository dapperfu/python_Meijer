package Zp;

import com.meijer.mobile.shopandscan.domain.model.exception.ShopAndScanUserBlockedException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mm.InterfaceC15644e;
import qq.InterfaceC16597a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\f\u0012\b\u0012\u00060\tj\u0002`\n0\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LZp/a;", "", "Lqq/a;", "applicationManager", "Lmm/e;", "repository", "<init>", "(Lqq/a;Lmm/e;)V", "Lkotlin/Result;", "", "Lcom/meijer/mobile/shopandscan/domain/model/MPerksBarcode;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lqq/a;", "b", "Lmm/e;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16597a applicationManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15644e repository;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.domain.usecase.auth.ShopAndScanUserAuthorizationUseCase", f = "ShopAndScanUserAuthorizationUseCase.kt", l = {37, 38, 40}, m = "invoke-IoAF18A")
    /* renamed from: Zp.a$a, reason: collision with other inner class name */
    static final class C0930a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f43208a;

        /* renamed from: b, reason: collision with root package name */
        Object f43209b;

        /* renamed from: c, reason: collision with root package name */
        Object f43210c;

        /* renamed from: d, reason: collision with root package name */
        Object f43211d;

        /* renamed from: e, reason: collision with root package name */
        Object f43212e;

        /* renamed from: f, reason: collision with root package name */
        int f43213f;

        /* renamed from: g, reason: collision with root package name */
        int f43214g;

        /* renamed from: h, reason: collision with root package name */
        int f43215h;

        /* renamed from: i, reason: collision with root package name */
        int f43216i;

        /* renamed from: j, reason: collision with root package name */
        boolean f43217j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f43218k;

        /* renamed from: m, reason: collision with root package name */
        int f43220m;

        C0930a(Continuation<? super C0930a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws ShopAndScanUserBlockedException {
            this.f43218k = obj;
            this.f43220m |= Integer.MIN_VALUE;
            Object objC = a.this.c(this);
            return objC == IntrinsicsKt.f() ? objC : Result.a(objC);
        }
    }

    public a(InterfaceC16597a applicationManager, InterfaceC15644e repository) {
        Intrinsics.j(applicationManager, "applicationManager");
        Intrinsics.j(repository, "repository");
        this.applicationManager = applicationManager;
        this.repository = repository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0135, code lost:
    
        if (r0 == r3) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0116 A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:14:0x0046, B:40:0x0138, B:21:0x0072, B:35:0x010e, B:37:0x0116, B:41:0x013d, B:42:0x0142, B:24:0x008f, B:31:0x00e3, B:27:0x0096), top: B:51:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013d A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:14:0x0046, B:40:0x0138, B:21:0x0072, B:35:0x010e, B:37:0x0116, B:41:0x013d, B:42:0x0142, B:24:0x008f, B:31:0x00e3, B:27:0x0096), top: B:51:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.String>> r17) throws com.meijer.mobile.shopandscan.domain.model.exception.ShopAndScanUserBlockedException {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Zp.a.c(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
