package cq;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rm.InterfaceC16921e;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcq/a;", "", "Lrm/e;", "repository", "<init>", "(Lrm/e;)V", "Lkotlin/Result;", "", "LXp/e;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lrm/e;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: cq.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13546a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16921e repository;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.domain.usecase.stores.ShopAndScanAllStoresUseCase", f = "ShopAndScanAllStoresUseCase.kt", l = {44}, m = "invoke-IoAF18A")
    /* renamed from: cq.a$a, reason: collision with other inner class name */
    static final class C1993a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f127476a;

        /* renamed from: b, reason: collision with root package name */
        Object f127477b;

        /* renamed from: c, reason: collision with root package name */
        Object f127478c;

        /* renamed from: d, reason: collision with root package name */
        Object f127479d;

        /* renamed from: e, reason: collision with root package name */
        int f127480e;

        /* renamed from: f, reason: collision with root package name */
        int f127481f;

        /* renamed from: g, reason: collision with root package name */
        int f127482g;

        /* renamed from: h, reason: collision with root package name */
        int f127483h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f127484i;

        /* renamed from: k, reason: collision with root package name */
        int f127486k;

        C1993a(Continuation<? super C1993a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f127484i = obj;
            this.f127486k |= Integer.MIN_VALUE;
            Object objB = C13546a.this.b(this);
            return objB == IntrinsicsKt.f() ? objB : Result.a(objB);
        }
    }

    public C13546a(InterfaceC16921e repository) {
        Intrinsics.j(repository, "repository");
        this.repository = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<Xp.ShopAndScanStore>>> r18) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cq.C13546a.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
