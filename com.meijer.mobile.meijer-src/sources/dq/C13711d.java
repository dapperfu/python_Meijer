package dq;

import Kk.AppVersion;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qq.InterfaceC16756a;
import yo.k;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Ldq/d;", "", "LWp/a;", "repository", "Lyo/k;", "userManager", "Lqq/a;", "applicationManager", "LKk/a;", "appVersion", "<init>", "(LWp/a;Lyo/k;Lqq/a;LKk/a;)V", "", "Lcom/meijer/mobile/shopandscan/domain/model/MPerksBarcode;", "mPerksBarcode", "LXp/e;", PlaceTypes.STORE, "Lkotlin/Result;", "LXp/f;", "e", "(Ljava/lang/String;LXp/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LWp/a;", "b", "Lyo/k;", "c", "Lqq/a;", "d", "LKk/a;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: dq.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13711d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Wp.a repository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k userManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16756a applicationManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AppVersion appVersion;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.domain.usecase.trip.ShopAndScanStartTripUseCase", f = "ShopAndScanStartTripUseCase.kt", l = {55, 47}, m = "invoke-0E7RQCE")
    /* renamed from: dq.d$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f128777a;

        /* renamed from: b, reason: collision with root package name */
        Object f128778b;

        /* renamed from: c, reason: collision with root package name */
        Object f128779c;

        /* renamed from: d, reason: collision with root package name */
        Object f128780d;

        /* renamed from: e, reason: collision with root package name */
        Object f128781e;

        /* renamed from: f, reason: collision with root package name */
        Object f128782f;

        /* renamed from: g, reason: collision with root package name */
        Object f128783g;

        /* renamed from: h, reason: collision with root package name */
        Object f128784h;

        /* renamed from: i, reason: collision with root package name */
        Object f128785i;

        /* renamed from: j, reason: collision with root package name */
        Object f128786j;

        /* renamed from: k, reason: collision with root package name */
        Object f128787k;

        /* renamed from: l, reason: collision with root package name */
        Object f128788l;

        /* renamed from: m, reason: collision with root package name */
        int f128789m;

        /* renamed from: n, reason: collision with root package name */
        int f128790n;

        /* renamed from: o, reason: collision with root package name */
        int f128791o;

        /* renamed from: p, reason: collision with root package name */
        int f128792p;

        /* renamed from: q, reason: collision with root package name */
        long f128793q;

        /* renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f128794r;

        /* renamed from: t, reason: collision with root package name */
        int f128796t;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f128794r = obj;
            this.f128796t |= Integer.MIN_VALUE;
            Object objE = C13711d.this.e(null, null, this);
            return objE == IntrinsicsKt.f() ? objE : Result.a(objE);
        }
    }

    public C13711d(Wp.a repository, k userManager, InterfaceC16756a applicationManager, AppVersion appVersion) {
        Intrinsics.j(repository, "repository");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(applicationManager, "applicationManager");
        Intrinsics.j(appVersion, "appVersion");
        this.repository = repository;
        this.userManager = userManager;
        this.applicationManager = applicationManager;
        this.appVersion = appVersion;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x01a2, code lost:
    
        if (r3 == r5) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r29, Xp.ShopAndScanStore r30, kotlin.coroutines.Continuation<? super kotlin.Result<Xp.ShopAndScanTrip>> r31) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dq.C13711d.e(java.lang.String, Xp.e, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
