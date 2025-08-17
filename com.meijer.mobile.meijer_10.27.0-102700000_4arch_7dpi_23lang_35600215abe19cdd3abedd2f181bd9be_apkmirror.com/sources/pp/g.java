package pp;

import Co.ProductFullDetails;
import Tq.j;
import java.util.List;
import jp.C15068a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yo.k;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0086@¢\u0006\u0004\b\u0015\u0010\u0014J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J6\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00112\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010%¨\u0006&"}, d2 = {"Lpp/g;", "", "Lyo/k;", "userManager", "LTq/j;", "storeProvider", "Ljp/a;", "productRecommendationsDataSource", "Lpp/c;", "criteoSponsorshipsDataSource", "<init>", "(Lyo/k;LTq/j;Ljp/a;Lpp/c;)V", "", "upc", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "LCo/h;", "d", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmk/f;", "product", "department", "", "price", "", "isAvailable", "Lpp/f;", "b", "(Lmk/f;Ljava/lang/String;DZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyo/k;", "LTq/j;", "Ljp/a;", "Lpp/c;", "sponsored_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k userManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j storeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C15068a productRecommendationsDataSource;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C16348c criteoSponsorshipsDataSource;

    public g(k userManager, j storeProvider, C15068a productRecommendationsDataSource, C16348c criteoSponsorshipsDataSource) {
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(productRecommendationsDataSource, "productRecommendationsDataSource");
        Intrinsics.j(criteoSponsorshipsDataSource, "criteoSponsorshipsDataSource");
        this.userManager = userManager;
        this.storeProvider = storeProvider;
        this.productRecommendationsDataSource = productRecommendationsDataSource;
        this.criteoSponsorshipsDataSource = criteoSponsorshipsDataSource;
    }

    public final Object a(String str, Continuation<? super List<ProductFullDetails>> continuation) {
        return this.productRecommendationsDataSource.h(str, (this.userManager.b() || this.storeProvider.d()) ? this.storeProvider.g() : 20, continuation);
    }

    public final Object b(mk.f fVar, String str, double d10, boolean z10, Continuation<? super List<SponsoredProduct>> continuation) {
        return this.criteoSponsorshipsDataSource.g(fVar, str, d10, z10, continuation);
    }

    public final Object c(String str, int i10, Continuation<? super List<ProductFullDetails>> continuation) {
        return this.productRecommendationsDataSource.u(str, i10, continuation);
    }

    public final Object d(String str, int i10, Continuation<? super List<ProductFullDetails>> continuation) {
        return this.productRecommendationsDataSource.r(str, i10, continuation);
    }
}
