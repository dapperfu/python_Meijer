package jm;

import Eh.EmailVerificationSpiffs;
import Fh.EnrollmentOfferResendEmailResponse;
import Vl.DepartmentCard;
import Vl.ProductCarouselV3;
import Vl.e;
import Vl.j;
import Wl.HomeMperks;
import Zl.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fH\u0087@¢\u0006\u0004\b \u0010\u001eJ\u0018\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0086@¢\u0006\u0004\b$\u0010%J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0086@¢\u0006\u0004\b(\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010)¨\u0006*"}, d2 = {"Ljm/a;", "", "LZl/f;", "homeDataSource", "<init>", "(LZl/f;)V", "LVl/e$f;", "productComponent", "", "i", "(LVl/e$f;)Z", "LVl/j;", "h", "(LVl/e$f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVl/e$f$d;", "LVl/k;", "g", "(LVl/e$f$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVl/e$e;", "mPerksComponent", "LWl/b;", "f", "(LVl/e$e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVl/e$b;", "couponComponent", "LVl/b;", "a", "(LVl/e$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LEh/m;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LFh/d;", "d", "LVl/e$c;", "departmentComponent", "LVl/c;", "b", "(LVl/e$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "LVl/e;", "e", "LZl/f;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jm.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C15052a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f homeDataSource;

    private final boolean i(e.f productComponent) {
        return CollectionsKt.p(e.f.a.f40004d, e.f.c.f40008d).contains(productComponent);
    }

    public C15052a(f homeDataSource) {
        Intrinsics.j(homeDataSource, "homeDataSource");
        this.homeDataSource = homeDataSource;
    }

    public final Object a(e.b bVar, Continuation<? super Vl.b> continuation) {
        return this.homeDataSource.h(bVar, continuation);
    }

    public final Object b(e.c cVar, Continuation<? super DepartmentCard> continuation) {
        return this.homeDataSource.c(cVar, continuation);
    }

    public final Object c(Continuation<? super EmailVerificationSpiffs> continuation) {
        return this.homeDataSource.f(continuation);
    }

    public final Object d(Continuation<? super EnrollmentOfferResendEmailResponse> continuation) {
        return this.homeDataSource.a(continuation);
    }

    public final Object e(Continuation<? super List<? extends e>> continuation) {
        return this.homeDataSource.g(continuation);
    }

    public final Object f(e.C0857e c0857e, Continuation<? super HomeMperks> continuation) {
        return this.homeDataSource.i(c0857e, continuation);
    }

    public final Object g(e.f.d dVar, Continuation<? super ProductCarouselV3> continuation) {
        return this.homeDataSource.e(dVar, continuation);
    }

    public final Object h(e.f fVar, Continuation<? super j> continuation) {
        if (i(fVar)) {
            return this.homeDataSource.d(fVar, continuation);
        }
        return this.homeDataSource.b(fVar, continuation);
    }
}
