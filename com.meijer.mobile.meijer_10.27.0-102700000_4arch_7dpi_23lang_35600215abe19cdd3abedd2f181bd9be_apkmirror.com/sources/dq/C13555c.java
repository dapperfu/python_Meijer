package dq;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ldq/c;", "", "LWp/a;", "repository", "<init>", "(LWp/a;)V", "LXp/f;", "activeTrip", "Lkotlin/Result;", "b", "(LXp/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LWp/a;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: dq.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13555c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Wp.a repository;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.domain.usecase.trip.ShopAndScanResumeTripUseCase", f = "ShopAndScanResumeTripUseCase.kt", l = {36}, m = "invoke-gIAlu-s")
    /* renamed from: dq.c$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f127514a;

        /* renamed from: b, reason: collision with root package name */
        Object f127515b;

        /* renamed from: c, reason: collision with root package name */
        Object f127516c;

        /* renamed from: d, reason: collision with root package name */
        Object f127517d;

        /* renamed from: e, reason: collision with root package name */
        Object f127518e;

        /* renamed from: f, reason: collision with root package name */
        int f127519f;

        /* renamed from: g, reason: collision with root package name */
        int f127520g;

        /* renamed from: h, reason: collision with root package name */
        int f127521h;

        /* renamed from: i, reason: collision with root package name */
        int f127522i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f127523j;

        /* renamed from: l, reason: collision with root package name */
        int f127525l;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f127523j = obj;
            this.f127525l |= Integer.MIN_VALUE;
            Object objB = C13555c.this.b(null, this);
            return objB == IntrinsicsKt.f() ? objB : Result.a(objB);
        }
    }

    public C13555c(Wp.a repository) {
        Intrinsics.j(repository, "repository");
        this.repository = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(Xp.ShopAndScanTrip r8, kotlin.coroutines.Continuation<? super kotlin.Result<Xp.ShopAndScanTrip>> r9) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dq.C13555c.b(Xp.f, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
