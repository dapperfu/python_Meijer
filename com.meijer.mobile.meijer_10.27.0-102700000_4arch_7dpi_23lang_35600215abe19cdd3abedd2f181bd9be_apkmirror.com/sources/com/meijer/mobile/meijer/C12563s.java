package com.meijer.mobile.meijer;

import Qo.l;
import fi.EnumC13905f;
import fi.GoogleAdData;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/s;", "Lcom/meijer/mobile/meijer/r;", "Lyl/k;", "featureManager", "Lyo/k;", "userManager", "<init>", "(Lyl/k;Lyo/k;)V", "LQo/l$i;", "query", "", "position", "", "Lfi/f;", "adTypes", "Lfi/d;", "a", "(LQo/l$i;I[Lfi/f;)Lfi/d;", "LQo/l$f;", "b", "(LQo/l$f;I[Lfi/f;)Lfi/d;", "Lyl/k;", "Lyo/k;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C12563s implements InterfaceC12562r {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yl.k featureManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    public C12563s(yl.k featureManager, yo.k userManager) {
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(userManager, "userManager");
        this.featureManager = featureManager;
        this.userManager = userManager;
    }

    @Override // com.meijer.mobile.meijer.InterfaceC12562r
    public GoogleAdData a(l.Search query, int position, EnumC13905f... adTypes) {
        Intrinsics.j(query, "query");
        Intrinsics.j(adTypes, "adTypes");
        return C12561q.f112905a.f(ArraysKt.i1(adTypes), query, this.featureManager.e(AbstractC18227f.C.f170544h), this.userManager.y(), Integer.valueOf(position));
    }

    @Override // com.meijer.mobile.meijer.InterfaceC12562r
    public GoogleAdData b(l.Personalized query, int position, EnumC13905f... adTypes) {
        Intrinsics.j(query, "query");
        Intrinsics.j(adTypes, "adTypes");
        return C12561q.f112905a.e(ArraysKt.i1(adTypes), query, this.featureManager.e(AbstractC18227f.C.f170544h), this.userManager.y(), Integer.valueOf(position));
    }
}
