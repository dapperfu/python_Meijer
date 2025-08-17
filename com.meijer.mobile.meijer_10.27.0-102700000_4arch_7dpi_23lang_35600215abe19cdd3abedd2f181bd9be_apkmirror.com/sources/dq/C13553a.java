package dq;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\n\u001a\u00020\tH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ldq/a;", "", "LWp/a;", "repository", "<init>", "(LWp/a;)V", "", "Lcom/meijer/mobile/shopandscan/domain/model/MPerksBarcode;", "mPerksBarcode", "LXp/e;", "currentStore", "Lkotlin/Result;", "LXp/f;", "b", "(Ljava/lang/String;LXp/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LWp/a;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: dq.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13553a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Wp.a repository;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.domain.usecase.trip.ShopAndScanActiveTripUseCase", f = "ShopAndScanActiveTripUseCase.kt", l = {41}, m = "invoke-0E7RQCE")
    /* renamed from: dq.a$a, reason: collision with other inner class name */
    static final class C2008a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f127494a;

        /* renamed from: b, reason: collision with root package name */
        Object f127495b;

        /* renamed from: c, reason: collision with root package name */
        Object f127496c;

        /* renamed from: d, reason: collision with root package name */
        Object f127497d;

        /* renamed from: e, reason: collision with root package name */
        Object f127498e;

        /* renamed from: f, reason: collision with root package name */
        Object f127499f;

        /* renamed from: g, reason: collision with root package name */
        int f127500g;

        /* renamed from: h, reason: collision with root package name */
        int f127501h;

        /* renamed from: i, reason: collision with root package name */
        int f127502i;

        /* renamed from: j, reason: collision with root package name */
        int f127503j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f127504k;

        /* renamed from: m, reason: collision with root package name */
        int f127506m;

        C2008a(Continuation<? super C2008a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f127504k = obj;
            this.f127506m |= Integer.MIN_VALUE;
            Object objB = C13553a.this.b(null, null, this);
            return objB == IntrinsicsKt.f() ? objB : Result.a(objB);
        }
    }

    public C13553a(Wp.a repository) {
        Intrinsics.j(repository, "repository");
        this.repository = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r9, Xp.ShopAndScanStore r10, kotlin.coroutines.Continuation<? super kotlin.Result<Xp.ShopAndScanTrip>> r11) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dq.C13553a.b(java.lang.String, Xp.e, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
