package com.meijer.mobile.meijer.activity.personalized.modals;

import Qo.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import np.C15995d;
import np.InterfaceC15996e;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B{\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0001\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001a¨\u0006%"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/B0;", "Lnp/e;", "LQo/l;", "LQo/l$e;", "favoritesDataSource", "LQo/l$j;", "shoppingListDataSource", "LQo/l$i;", "searchDataSource", "LQo/l$d;", "departmentDataSource", "LQo/l$c;", "couponDataSource", "LQo/l$h;", "rewardDataSource", "Lnp/d;", "personalizedProductQueryDataSource", "Lcom/meijer/mobile/meijer/activity/personalized/modals/i1;", "recommendationProductQueryDataSource", "LQo/l$a;", "collectionDataSource", "<init>", "(Lnp/e;Lnp/e;Lnp/e;Lnp/e;Lnp/e;Lnp/e;Lnp/d;Lcom/meijer/mobile/meijer/activity/personalized/modals/i1;Lnp/e;)V", "query", "a", "(LQo/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnp/e;", "b", "c", "d", "e", "f", "g", "Lnp/d;", "h", "Lcom/meijer/mobile/meijer/activity/personalized/modals/i1;", "i", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class B0 implements InterfaceC15996e<Qo.l> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15996e<l.Favorites> favoritesDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15996e<l.ShoppingList> shoppingListDataSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15996e<l.Search> searchDataSource;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15996e<l.Department> departmentDataSource;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15996e<l.Coupon> couponDataSource;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15996e<l.Reward> rewardDataSource;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C15995d personalizedProductQueryDataSource;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final i1 recommendationProductQueryDataSource;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15996e<l.BrowseCollection> collectionDataSource;

    public B0(InterfaceC15996e<l.Favorites> favoritesDataSource, InterfaceC15996e<l.ShoppingList> shoppingListDataSource, InterfaceC15996e<l.Search> searchDataSource, InterfaceC15996e<l.Department> departmentDataSource, InterfaceC15996e<l.Coupon> couponDataSource, InterfaceC15996e<l.Reward> rewardDataSource, C15995d personalizedProductQueryDataSource, i1 recommendationProductQueryDataSource, InterfaceC15996e<l.BrowseCollection> collectionDataSource) {
        Intrinsics.j(favoritesDataSource, "favoritesDataSource");
        Intrinsics.j(shoppingListDataSource, "shoppingListDataSource");
        Intrinsics.j(searchDataSource, "searchDataSource");
        Intrinsics.j(departmentDataSource, "departmentDataSource");
        Intrinsics.j(couponDataSource, "couponDataSource");
        Intrinsics.j(rewardDataSource, "rewardDataSource");
        Intrinsics.j(personalizedProductQueryDataSource, "personalizedProductQueryDataSource");
        Intrinsics.j(recommendationProductQueryDataSource, "recommendationProductQueryDataSource");
        Intrinsics.j(collectionDataSource, "collectionDataSource");
        this.favoritesDataSource = favoritesDataSource;
        this.shoppingListDataSource = shoppingListDataSource;
        this.searchDataSource = searchDataSource;
        this.departmentDataSource = departmentDataSource;
        this.couponDataSource = couponDataSource;
        this.rewardDataSource = rewardDataSource;
        this.personalizedProductQueryDataSource = personalizedProductQueryDataSource;
        this.recommendationProductQueryDataSource = recommendationProductQueryDataSource;
        this.collectionDataSource = collectionDataSource;
    }

    @Override // np.InterfaceC15996e
    public Object a(Qo.l lVar, Continuation<? super Qo.l> continuation) {
        if (lVar instanceof l.Favorites) {
            Object objA = this.favoritesDataSource.a(lVar, continuation);
            return objA == IntrinsicsKt.f() ? objA : (Qo.l) objA;
        }
        if (lVar instanceof l.ShoppingList) {
            Object objA2 = this.shoppingListDataSource.a(lVar, continuation);
            return objA2 == IntrinsicsKt.f() ? objA2 : (Qo.l) objA2;
        }
        if (lVar instanceof l.Search) {
            Object objA3 = this.searchDataSource.a(lVar, continuation);
            return objA3 == IntrinsicsKt.f() ? objA3 : (Qo.l) objA3;
        }
        if (lVar instanceof l.Department) {
            Object objA4 = this.departmentDataSource.a(lVar, continuation);
            return objA4 == IntrinsicsKt.f() ? objA4 : (Qo.l) objA4;
        }
        if (lVar instanceof l.Coupon) {
            Object objA5 = this.couponDataSource.a(lVar, continuation);
            return objA5 == IntrinsicsKt.f() ? objA5 : (Qo.l) objA5;
        }
        if (lVar instanceof l.Reward) {
            Object objA6 = this.rewardDataSource.a(lVar, continuation);
            return objA6 == IntrinsicsKt.f() ? objA6 : (Qo.l) objA6;
        }
        if (lVar instanceof l.Personalized) {
            Object objA7 = this.personalizedProductQueryDataSource.a((l.Personalized) lVar, continuation);
            return objA7 == IntrinsicsKt.f() ? objA7 : (Qo.l) objA7;
        }
        if (lVar instanceof l.BrowseCollection) {
            Object objA8 = this.collectionDataSource.a(lVar, continuation);
            return objA8 == IntrinsicsKt.f() ? objA8 : (Qo.l) objA8;
        }
        if (!(lVar instanceof l.Recommendations)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objA9 = this.recommendationProductQueryDataSource.a((l.Recommendations) lVar, continuation);
        return objA9 == IntrinsicsKt.f() ? objA9 : (Qo.l) objA9;
    }
}
