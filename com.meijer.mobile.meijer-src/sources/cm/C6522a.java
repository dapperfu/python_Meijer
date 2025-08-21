package cm;

import Vl.DepartmentCard;
import com.meijer.mobile.home.service.models.departmentcard.DepartmentCardInfoJson;
import com.meijer.mobile.home.service.models.departmentcard.DepartmentCardJson;
import com.meijer.mobile.home.service.models.departmentcard.DepartmentDataJson;
import com.meijer.mobile.home.service.models.departmentcard.HomeDepartmentJson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/home/service/models/departmentcard/DepartmentCardJson;", "LVl/c;", "a", "(Lcom/meijer/mobile/home/service/models/departmentcard/DepartmentCardJson;)LVl/c;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: cm.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C6522a {
    public static final DepartmentCard a(DepartmentCardJson departmentCardJson) {
        Intrinsics.j(departmentCardJson, "<this>");
        DepartmentCardInfoJson card = departmentCardJson.getCard();
        String title = card != null ? card.getTitle() : null;
        if (title == null) {
            title = "";
        }
        DepartmentCardInfoJson card2 = departmentCardJson.getCard();
        String seeAllTitle = card2 != null ? card2.getSeeAllTitle() : null;
        if (seeAllTitle == null) {
            seeAllTitle = "";
        }
        DepartmentCardInfoJson card3 = departmentCardJson.getCard();
        String seeAllDeeplink = card3 != null ? card3.getSeeAllDeeplink() : null;
        String str = seeAllDeeplink != null ? seeAllDeeplink : "";
        DepartmentDataJson data = departmentCardJson.getData();
        List<HomeDepartmentJson> listA = data != null ? data.a() : null;
        if (listA == null) {
            listA = CollectionsKt.m();
        }
        List<HomeDepartmentJson> list = listA;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C6523b.a((HomeDepartmentJson) it.next()));
        }
        return new DepartmentCard(title, seeAllTitle, str, arrayList);
    }
}
