package Io;

import Co.Department;
import com.meijer.mobile.product.model.hybris.api.models.HybrisDepartment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/HybrisDepartment;", "", "Lcom/meijer/mobile/product/model/fulldetails/DepartmentCode;", "parentId", "LCo/b;", "a", "(Lcom/meijer/mobile/product/model/hybris/api/models/HybrisDepartment;Ljava/lang/String;)LCo/b;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class b {
    public static final Department a(HybrisDepartment hybrisDepartment, String str) {
        Intrinsics.j(hybrisDepartment, "<this>");
        String type = hybrisDepartment.getType();
        String id2 = hybrisDepartment.getId();
        String name = hybrisDepartment.getName();
        String url = hybrisDepartment.getUrl();
        boolean hide = hybrisDepartment.getHide();
        String collectionId = hybrisDepartment.getCollectionId();
        List<HybrisDepartment> listE = hybrisDepartment.e();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listE, 10));
        Iterator<T> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(a((HybrisDepartment) it.next(), hybrisDepartment.getId()));
        }
        return new Department(str, type, id2, name, url, hide, collectionId, arrayList);
    }

    public static /* synthetic */ Department b(HybrisDepartment hybrisDepartment, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return a(hybrisDepartment, str);
    }
}
