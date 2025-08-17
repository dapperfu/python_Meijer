package qt;

import android.content.Context;
import com.gimbal.internal.cache.h;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import jb.i;
import kt.C15320i;

/* loaded from: classes11.dex */
public final class c extends i<C15320i> {
    public c(Context context) {
        super(context, "com.qsl.faar.cache.OrganizationPlaceEvent", C15320i.class);
        jb.b<T> bVar = this.f139561a;
        bVar.f139550d = HttpResponseStatus.SUCCESS_OK;
        bVar.f139551e = 100;
    }

    @Override // jb.i
    protected final String a(Object obj) {
        C15320i c15320i = (C15320i) obj;
        if (c15320i.a() == null || c15320i.c() == null || c15320i.b() == null) {
            throw new h();
        }
        return String.format("%s%s", c15320i.g().toString(), c15320i.a().toString());
    }
}
