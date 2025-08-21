package em;

import Wl.HomeMperks;
import com.meijer.mobile.home.service.models.mperks.HomeMperksDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/home/service/models/mperks/HomeMperksDto;", "LWl/b;", "a", "(Lcom/meijer/mobile/home/service/models/mperks/HomeMperksDto;)LWl/b;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c {
    public static final HomeMperks a(HomeMperksDto homeMperksDto) {
        Intrinsics.j(homeMperksDto, "<this>");
        return new HomeMperks(homeMperksDto.getId(), homeMperksDto.getType(), d.a(homeMperksDto.getMperksCard()), e.a(homeMperksDto.getMperksDataDto()));
    }
}
