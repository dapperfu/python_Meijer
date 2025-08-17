package zh;

import Dh.AccountChip;
import Dh.x;
import Ji.C;
import ak.AbstractC5607a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import xh.C18054c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lzh/b;", "", "<init>", "()V", "", "LDh/c;", "b", "()Ljava/util/List;", "a", "Ljava/util/List;", "chipItems", "accountOverviewChips", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zh.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C18464b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<AccountChip> chipItems;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<AccountChip> accountOverviewChips;

    public C18464b() {
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        AbstractC5607a abstractC5607aD = companion.d(C18054c.f169660m, new Object[0]);
        C.b.a.C0246a c0246a = C.b.a.C0246a.f15371e;
        x.f fVar = x.f.f6604b;
        AccountChip accountChip = new AccountChip(abstractC5607aD, c0246a, companion.d(C18054c.f169652e, new Object[0]), fVar);
        AbstractC5607a abstractC5607aD2 = companion.d(C18054c.f169658k, new Object[0]);
        C.a.D d10 = C.a.D.f15323e;
        x.e eVar = x.e.f6603b;
        AccountChip accountChip2 = new AccountChip(abstractC5607aD2, d10, companion.d(C18054c.f169659l, new Object[0]), eVar);
        AbstractC5607a abstractC5607aD3 = companion.d(C18054c.f169653f, new Object[0]);
        C.b.h.g gVar = C.b.h.g.f15469e;
        x.b bVar = x.b.f6600b;
        AccountChip accountChip3 = new AccountChip(abstractC5607aD3, gVar, companion.d(C18054c.f169654g, new Object[0]), bVar);
        AccountChip accountChip4 = new AccountChip(companion.d(C18054c.f169663p, new Object[0]), C.b.g.e.f15457e, companion.d(C18054c.f169664q, new Object[0]), x.g.f6605b);
        AbstractC5607a abstractC5607aD4 = companion.d(C18054c.f169655h, new Object[0]);
        C.b.e.c cVar = C.b.e.c.f15429e;
        x.d dVar = x.d.f6602b;
        AccountChip accountChip5 = new AccountChip(abstractC5607aD4, cVar, companion.d(C18054c.f169656i, new Object[0]), dVar);
        AbstractC5607a abstractC5607aD5 = companion.d(C18054c.f169649b, new Object[0]);
        C.b.c.k kVar = C.b.c.k.f15407e;
        x.a aVar = x.a.f6599b;
        this.chipItems = CollectionsKt.p(accountChip, accountChip2, accountChip3, accountChip4, accountChip5, new AccountChip(abstractC5607aD5, kVar, companion.d(C18054c.f169650c, new Object[0]), aVar));
        this.accountOverviewChips = CollectionsKt.p(new AccountChip(companion.d(C18054c.f169648a, new Object[0]), C.b.d.a.f15412e, null, x.c.f6601b, 4, null), new AccountChip(companion.d(C18054c.f169660m, new Object[0]), c0246a, companion.d(C18054c.f169652e, new Object[0]), fVar), new AccountChip(companion.d(C18054c.f169653f, new Object[0]), gVar, companion.d(C18054c.f169654g, new Object[0]), bVar), new AccountChip(companion.d(C18054c.f169655h, new Object[0]), cVar, companion.d(C18054c.f169656i, new Object[0]), dVar), new AccountChip(companion.d(C18054c.f169649b, new Object[0]), kVar, companion.d(C18054c.f169650c, new Object[0]), aVar), new AccountChip(companion.d(C18054c.f169651d, new Object[0]), d10, companion.d(C18054c.f169659l, new Object[0]), eVar));
    }

    public final List<AccountChip> a() {
        return this.accountOverviewChips;
    }

    public final List<AccountChip> b() {
        return this.chipItems;
    }
}
