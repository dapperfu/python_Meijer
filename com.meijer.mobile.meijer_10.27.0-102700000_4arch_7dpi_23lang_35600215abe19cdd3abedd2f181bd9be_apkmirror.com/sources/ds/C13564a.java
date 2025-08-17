package ds;

import Ul.DepartmentCard;
import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LUl/c;", "LOj/a;", "loadingState", "Lds/c;", "a", "(LUl/c;LOj/a;)Lds/c;", "homescreen_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ds.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13564a {
    public static final DepartmentCarouselDecorator a(DepartmentCard departmentCard, Oj.a loadingState) {
        Intrinsics.j(departmentCard, "<this>");
        Intrinsics.j(loadingState, "loadingState");
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        return new DepartmentCarouselDecorator(companion.c(departmentCard.getCardTitle()), companion.c(departmentCard.getSeeAllTitle()), departmentCard.b(), loadingState, departmentCard.getSeeAllDeepLink());
    }
}
