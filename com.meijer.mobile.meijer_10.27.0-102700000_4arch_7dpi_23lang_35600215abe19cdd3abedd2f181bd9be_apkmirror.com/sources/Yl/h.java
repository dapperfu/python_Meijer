package Yl;

import Ul.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import yo.k;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LYl/h;", "", "LYl/g;", "legacyHomeCardsDataSource", "Lyo/k;", "userManager", "<init>", "(LYl/g;Lyo/k;)V", "LUl/e$b;", "couponComponent", "LUl/b;", "a", "(LUl/e$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LYl/g;", "b", "Lyo/k;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g legacyHomeCardsDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k userManager;

    public h(g legacyHomeCardsDataSource, k userManager) {
        Intrinsics.j(legacyHomeCardsDataSource, "legacyHomeCardsDataSource");
        Intrinsics.j(userManager, "userManager");
        this.legacyHomeCardsDataSource = legacyHomeCardsDataSource;
        this.userManager = userManager;
    }

    public final Object a(e.b bVar, Continuation<? super Ul.b> continuation) {
        if (!(bVar instanceof e.b.SpecialOffers)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!this.userManager.b()) {
            return null;
        }
        Object objD = this.legacyHomeCardsDataSource.d(((e.b.SpecialOffers) bVar).getItemCount(), continuation);
        return objD == IntrinsicsKt.f() ? objD : (Ul.b) objD;
    }
}
