package aq;

import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.shopandscan.domain.usecase.location.NullLocationException;
import com.meijer.mobile.shopandscan.domain.usecase.location.PermissionsException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vq.e;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086B¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Laq/a;", "", "Lvq/e;", "locationHelper", "<init>", "(Lvq/e;)V", "Lkotlin/Result;", "Lvq/a;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lvq/e;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: aq.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C6285a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e locationHelper;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.domain.usecase.location.LocationUseCase", f = "LocationUseCase.kt", l = {28, l3.f93325e}, m = "invoke-IoAF18A")
    /* renamed from: aq.a$a, reason: collision with other inner class name */
    static final class C1177a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f59610a;

        /* renamed from: b, reason: collision with root package name */
        Object f59611b;

        /* renamed from: c, reason: collision with root package name */
        Object f59612c;

        /* renamed from: d, reason: collision with root package name */
        Object f59613d;

        /* renamed from: e, reason: collision with root package name */
        int f59614e;

        /* renamed from: f, reason: collision with root package name */
        int f59615f;

        /* renamed from: g, reason: collision with root package name */
        int f59616g;

        /* renamed from: h, reason: collision with root package name */
        int f59617h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f59618i;

        /* renamed from: k, reason: collision with root package name */
        int f59620k;

        C1177a(Continuation<? super C1177a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws NullLocationException, PermissionsException {
            this.f59618i = obj;
            this.f59620k |= Integer.MIN_VALUE;
            Object objB = C6285a.this.b(this);
            return objB == IntrinsicsKt.f() ? objB : Result.a(objB);
        }
    }

    public C6285a(e locationHelper) {
        Intrinsics.j(locationHelper, "locationHelper");
        this.locationHelper = locationHelper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        if (r13 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation<? super kotlin.Result<vq.LocationData>> r13) throws com.meijer.mobile.shopandscan.domain.usecase.location.NullLocationException, com.meijer.mobile.shopandscan.domain.usecase.location.PermissionsException {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aq.C6285a.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
