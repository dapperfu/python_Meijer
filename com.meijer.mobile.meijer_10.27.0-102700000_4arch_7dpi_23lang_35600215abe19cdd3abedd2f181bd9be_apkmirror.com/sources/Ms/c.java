package Ms;

import Js.WeeklyAdPrintPage;
import com.meijer.mobile.weeklyad.services.api.models.FlippWeeklyAdPrintPageJson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/weeklyad/services/api/models/FlippWeeklyAdPrintPageJson;", "LJs/c;", "a", "(Lcom/meijer/mobile/weeklyad/services/api/models/FlippWeeklyAdPrintPageJson;)LJs/c;", "flipp_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c {
    public static final WeeklyAdPrintPage a(FlippWeeklyAdPrintPageJson flippWeeklyAdPrintPageJson) {
        Intrinsics.j(flippWeeklyAdPrintPageJson, "<this>");
        return new WeeklyAdPrintPage(flippWeeklyAdPrintPageJson.getPage(), flippWeeklyAdPrintPageJson.getLeft(), flippWeeklyAdPrintPageJson.getWidth(), flippWeeklyAdPrintPageJson.getTop(), flippWeeklyAdPrintPageJson.getHeight(), flippWeeklyAdPrintPageJson.getImage());
    }
}
