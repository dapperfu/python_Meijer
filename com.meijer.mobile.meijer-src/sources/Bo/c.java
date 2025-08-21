package Bo;

import Co.ProductFullDetails;
import Ho.ProductSponsorship;
import Ho.SponsoredData;
import com.meijer.mobile.product.model.constructor.SponsoredProductsResponseInner;
import io.constructor.data.model.common.Result;
import io.constructor.data.model.common.ResultData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\n\u001a\u00020\u0006*\u00020\t2\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/constructor/data/model/common/Result;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "LHo/c;", "sponsoredData", "LCo/h;", "a", "(Lio/constructor/data/model/common/Result;ILHo/c;)LCo/h;", "Lio/constructor/data/model/common/ResultData;", "b", "(Lio/constructor/data/model/common/ResultData;ILHo/c;)LCo/h;", "Lcom/meijer/mobile/product/model/constructor/SponsoredProductsResponseInner;", "inner", "LHo/a;", "e", "(Lio/constructor/data/model/common/Result;Lcom/meijer/mobile/product/model/constructor/SponsoredProductsResponseInner;)LHo/a;", "f", "(Lio/constructor/data/model/common/Result;Lcom/meijer/mobile/product/model/constructor/SponsoredProductsResponseInner;)LHo/c;", "constructor_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {
    public static final ProductFullDetails a(Result result, int i10, SponsoredData sponsoredData) {
        Intrinsics.j(result, "<this>");
        return new ConstructorProductMetadata(result, null, null, null, 14, null).e0(i10, sponsoredData);
    }

    public static final ProductFullDetails b(ResultData resultData, int i10, SponsoredData sponsoredData) {
        Intrinsics.j(resultData, "<this>");
        return new ConstructorProductMetadata(null, resultData, null, null, 13, null).e0(i10, sponsoredData);
    }

    public static /* synthetic */ ProductFullDetails c(Result result, int i10, SponsoredData sponsoredData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            sponsoredData = null;
        }
        return a(result, i10, sponsoredData);
    }

    public static /* synthetic */ ProductFullDetails d(ResultData resultData, int i10, SponsoredData sponsoredData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            sponsoredData = null;
        }
        return b(resultData, i10, sponsoredData);
    }

    public static final ProductSponsorship e(Result result, SponsoredProductsResponseInner inner) {
        Intrinsics.j(result, "<this>");
        Intrinsics.j(inner, "inner");
        return new ConstructorProductMetadata(result, null, null, null, 14, null).f0(inner);
    }

    public static final SponsoredData f(Result result, SponsoredProductsResponseInner inner) {
        Intrinsics.j(result, "<this>");
        Intrinsics.j(inner, "inner");
        return new ConstructorProductMetadata(result, null, null, null, 14, null).d0(inner);
    }
}
