package Ah;

import Eh.AccountChip;
import Eh.x;
import Ki.C;
import bk.AbstractC6392a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import yh.C18316c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"LAh/b;", "", "<init>", "()V", "", "LEh/c;", "b", "()Ljava/util/List;", "a", "Ljava/util/List;", "chipItems", "accountOverviewChips", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<AccountChip> chipItems;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<AccountChip> accountOverviewChips;

    public b() {
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        AbstractC6392a abstractC6392aD = companion.d(C18316c.f171437m, new Object[0]);
        C.b.a.C0288a c0288a = C.b.a.C0288a.f16915e;
        x.f fVar = x.f.f7630b;
        AccountChip accountChip = new AccountChip(abstractC6392aD, c0288a, companion.d(C18316c.f171429e, new Object[0]), fVar);
        AbstractC6392a abstractC6392aD2 = companion.d(C18316c.f171435k, new Object[0]);
        C.a.D d10 = C.a.D.f16867e;
        x.e eVar = x.e.f7629b;
        AccountChip accountChip2 = new AccountChip(abstractC6392aD2, d10, companion.d(C18316c.f171436l, new Object[0]), eVar);
        AbstractC6392a abstractC6392aD3 = companion.d(C18316c.f171430f, new Object[0]);
        C.b.h.g gVar = C.b.h.g.f17013e;
        x.b bVar = x.b.f7626b;
        AccountChip accountChip3 = new AccountChip(abstractC6392aD3, gVar, companion.d(C18316c.f171431g, new Object[0]), bVar);
        AccountChip accountChip4 = new AccountChip(companion.d(C18316c.f171440p, new Object[0]), C.b.g.e.f17001e, companion.d(C18316c.f171441q, new Object[0]), x.g.f7631b);
        AbstractC6392a abstractC6392aD4 = companion.d(C18316c.f171432h, new Object[0]);
        C.b.e.c cVar = C.b.e.c.f16973e;
        x.d dVar = x.d.f7628b;
        AccountChip accountChip5 = new AccountChip(abstractC6392aD4, cVar, companion.d(C18316c.f171433i, new Object[0]), dVar);
        AbstractC6392a abstractC6392aD5 = companion.d(C18316c.f171426b, new Object[0]);
        C.b.c.k kVar = C.b.c.k.f16951e;
        x.a aVar = x.a.f7625b;
        this.chipItems = CollectionsKt.p(accountChip, accountChip2, accountChip3, accountChip4, accountChip5, new AccountChip(abstractC6392aD5, kVar, companion.d(C18316c.f171427c, new Object[0]), aVar));
        this.accountOverviewChips = CollectionsKt.p(new AccountChip(companion.d(C18316c.f171425a, new Object[0]), C.b.d.a.f16956e, null, x.c.f7627b, 4, null), new AccountChip(companion.d(C18316c.f171437m, new Object[0]), c0288a, companion.d(C18316c.f171429e, new Object[0]), fVar), new AccountChip(companion.d(C18316c.f171430f, new Object[0]), gVar, companion.d(C18316c.f171431g, new Object[0]), bVar), new AccountChip(companion.d(C18316c.f171432h, new Object[0]), cVar, companion.d(C18316c.f171433i, new Object[0]), dVar), new AccountChip(companion.d(C18316c.f171426b, new Object[0]), kVar, companion.d(C18316c.f171427c, new Object[0]), aVar), new AccountChip(companion.d(C18316c.f171428d, new Object[0]), d10, companion.d(C18316c.f171436l, new Object[0]), eVar));
    }

    public final List<AccountChip> a() {
        return this.accountOverviewChips;
    }

    public final List<AccountChip> b() {
        return this.chipItems;
    }
}
