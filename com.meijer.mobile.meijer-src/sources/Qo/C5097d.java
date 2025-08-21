package Qo;

import io.constructor.data.model.common.FilterFacetOption;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/constructor/data/model/common/FilterFacetOption;", "LQo/c;", "a", "(Lio/constructor/data/model/common/FilterFacetOption;)LQo/c;", "search_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Qo.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5097d {
    public static final FilterFacetOption a(FilterFacetOption filterFacetOption) {
        Intrinsics.j(filterFacetOption, "<this>");
        return new FilterFacetOption(filterFacetOption.getCount(), filterFacetOption.getDisplayName(), filterFacetOption.getStatus(), filterFacetOption.getValue());
    }
}
