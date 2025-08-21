package qt;

import android.content.Context;
import com.gimbal.internal.cache.h;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kt.C15423i;
import lb.i;

/* loaded from: classes12.dex */
public final class c extends i<C15423i> {
    public c(Context context) {
        super(context, "com.qsl.faar.cache.OrganizationPlaceEvent", C15423i.class);
        lb.b<T> bVar = this.f149575a;
        bVar.f149564d = HttpResponseStatus.SUCCESS_OK;
        bVar.f149565e = 100;
    }

    @Override // lb.i
    protected final String a(Object obj) {
        C15423i c15423i = (C15423i) obj;
        if (c15423i.a() == null || c15423i.c() == null || c15423i.b() == null) {
            throw new h();
        }
        return String.format("%s%s", c15423i.g().toString(), c15423i.a().toString());
    }
}
