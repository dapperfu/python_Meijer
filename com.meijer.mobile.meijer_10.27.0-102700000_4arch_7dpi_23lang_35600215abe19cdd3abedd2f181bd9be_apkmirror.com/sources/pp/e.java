package pp;

import Ho.ProductSponsorship;
import io.reactivex.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jv.C15078a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u00052\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0003R$\u0010\u0012\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\u00050\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R.\u0010\u0017\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0014*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R#\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00188\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"Lpp/e;", "", "<init>", "()V", "", "LHo/a;", "productSponsorships", "", "d", "(Ljava/util/List;)V", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "productCode", "a", "(Ljava/lang/String;)LHo/a;", "c", "", "Ljava/util/Map;", "map", "Ljv/a;", "kotlin.jvm.PlatformType", "b", "Ljv/a;", "_sponsorshipStream", "Lio/reactivex/l;", "Lio/reactivex/l;", "()Lio/reactivex/l;", "sponsorshipStream", "sponsored_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, ProductSponsorship> map = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15078a<List<ProductSponsorship>> _sponsorshipStream;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l<List<ProductSponsorship>> sponsorshipStream;

    public final ProductSponsorship a(String productCode) {
        Intrinsics.j(productCode, "productCode");
        return this.map.get(productCode);
    }

    public final l<List<ProductSponsorship>> b() {
        return this.sponsorshipStream;
    }

    public final void c() {
        synchronized (this.map) {
            this.map.clear();
            this._sponsorshipStream.onNext(CollectionsKt.j1(this.map.values()));
            Unit unit = Unit.f142422a;
        }
    }

    public final void d(List<ProductSponsorship> productSponsorships) {
        Intrinsics.j(productSponsorships, "productSponsorships");
        synchronized (this.map) {
            try {
                Map<String, ProductSponsorship> map = this.map;
                List<ProductSponsorship> list = productSponsorships;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list, 10)), 16));
                for (Object obj : list) {
                    linkedHashMap.put(((ProductSponsorship) obj).getProductCode(), obj);
                }
                map.putAll(linkedHashMap);
                this._sponsorshipStream.onNext(CollectionsKt.j1(this.map.values()));
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public e() {
        C15078a<List<ProductSponsorship>> c15078aF = C15078a.f(CollectionsKt.m());
        Intrinsics.i(c15078aF, "createDefault(...)");
        this._sponsorshipStream = c15078aF;
        l<List<ProductSponsorship>> lVarDistinctUntilChanged = c15078aF.distinctUntilChanged();
        Intrinsics.i(lVarDistinctUntilChanged, "distinctUntilChanged(...)");
        this.sponsorshipStream = lVarDistinctUntilChanged;
    }
}
