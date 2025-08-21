package cq;

import aq.C6285a;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rm.InterfaceC16921e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0086B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcq/b;", "", "Lrm/e;", "repository", "Laq/a;", "locationUseCase", "<init>", "(Lrm/e;Laq/a;)V", "Lkotlin/Result;", "LXp/e;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lrm/e;", "b", "Laq/a;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: cq.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13547b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16921e repository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C6285a locationUseCase;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.domain.usecase.stores.ShopAndScanNearbyStoreUseCase", f = "ShopAndScanNearbyStoresUseCase.kt", l = {29, 31}, m = "invoke-IoAF18A")
    /* renamed from: cq.b$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f127489a;

        /* renamed from: b, reason: collision with root package name */
        Object f127490b;

        /* renamed from: c, reason: collision with root package name */
        Object f127491c;

        /* renamed from: d, reason: collision with root package name */
        Object f127492d;

        /* renamed from: e, reason: collision with root package name */
        Object f127493e;

        /* renamed from: f, reason: collision with root package name */
        int f127494f;

        /* renamed from: g, reason: collision with root package name */
        int f127495g;

        /* renamed from: h, reason: collision with root package name */
        int f127496h;

        /* renamed from: i, reason: collision with root package name */
        int f127497i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f127498j;

        /* renamed from: l, reason: collision with root package name */
        int f127500l;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f127498j = obj;
            this.f127500l |= Integer.MIN_VALUE;
            Object objC = C13547b.this.c(this);
            return objC == IntrinsicsKt.f() ? objC : Result.a(objC);
        }
    }

    public C13547b(InterfaceC16921e repository, C6285a locationUseCase) {
        Intrinsics.j(repository, "repository");
        Intrinsics.j(locationUseCase, "locationUseCase");
        this.repository = repository;
        this.locationUseCase = locationUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f8, code lost:
    
        if (r0 == r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation<? super kotlin.Result<Xp.ShopAndScanStore>> r26) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cq.C13547b.c(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
