package Qo;

import io.constructor.data.model.common.FilterSortOption;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/constructor/data/model/common/FilterSortOption;", "LQo/g;", "a", "(Lio/constructor/data/model/common/FilterSortOption;)LQo/g;", "search_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Qo.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5101h {
    public static final FilterSortOption a(FilterSortOption filterSortOption) {
        Intrinsics.j(filterSortOption, "<this>");
        return new FilterSortOption(filterSortOption.getDisplayName(), filterSortOption.getSortBy(), filterSortOption.getSortOrder(), filterSortOption.getStatus());
    }
}
