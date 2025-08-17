package cq;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qm.InterfaceC16540e;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcq/a;", "", "Lqm/e;", "repository", "<init>", "(Lqm/e;)V", "Lkotlin/Result;", "", "LXp/e;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lqm/e;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: cq.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13413a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16540e repository;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.domain.usecase.stores.ShopAndScanAllStoresUseCase", f = "ShopAndScanAllStoresUseCase.kt", l = {44}, m = "invoke-IoAF18A")
    /* renamed from: cq.a$a, reason: collision with other inner class name */
    static final class C1987a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f126664a;

        /* renamed from: b, reason: collision with root package name */
        Object f126665b;

        /* renamed from: c, reason: collision with root package name */
        Object f126666c;

        /* renamed from: d, reason: collision with root package name */
        Object f126667d;

        /* renamed from: e, reason: collision with root package name */
        int f126668e;

        /* renamed from: f, reason: collision with root package name */
        int f126669f;

        /* renamed from: g, reason: collision with root package name */
        int f126670g;

        /* renamed from: h, reason: collision with root package name */
        int f126671h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f126672i;

        /* renamed from: k, reason: collision with root package name */
        int f126674k;

        C1987a(Continuation<? super C1987a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f126672i = obj;
            this.f126674k |= Integer.MIN_VALUE;
            Object objB = C13413a.this.b(this);
            return objB == IntrinsicsKt.f() ? objB : Result.a(objB);
        }
    }

    public C13413a(InterfaceC16540e repository) {
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
        throw new UnsupportedOperationException("Method not decompiled: cq.C13413a.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
