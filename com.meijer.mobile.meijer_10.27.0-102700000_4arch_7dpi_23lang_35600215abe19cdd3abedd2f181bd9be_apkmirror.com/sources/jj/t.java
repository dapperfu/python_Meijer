package jj;

import com.meijer.mobile.cart.model.hybris.HybrisProactiveSubstituteRequest;
import ej.ProactiveSubstituteRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lej/y;", "Lcom/meijer/mobile/cart/model/hybris/HybrisProactiveSubstituteRequest;", "a", "(Lej/y;)Lcom/meijer/mobile/cart/model/hybris/HybrisProactiveSubstituteRequest;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class t {
    public static final HybrisProactiveSubstituteRequest a(ProactiveSubstituteRequest proactiveSubstituteRequest) {
        Intrinsics.j(proactiveSubstituteRequest, "<this>");
        String code = proactiveSubstituteRequest.getProduct().getCode();
        String substitutionNotes = proactiveSubstituteRequest.getSubstitutionNotes();
        List<mk.f> listB = proactiveSubstituteRequest.b();
        ArrayList arrayList = new ArrayList();
        for (mk.f fVar : listB) {
            String code2 = fVar != null ? fVar.getCode() : null;
            if (code2 != null) {
                arrayList.add(code2);
            }
        }
        return new HybrisProactiveSubstituteRequest(code, substitutionNotes, arrayList, proactiveSubstituteRequest.getDoNotSubstitute());
    }
}
