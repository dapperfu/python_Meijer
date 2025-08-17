package Io;

import Co.Image;
import com.meijer.mobile.product.model.hybris.api.models.HybrisImage;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mk.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/HybrisImage;", "LCo/e;", "a", "(Lcom/meijer/mobile/product/model/hybris/api/models/HybrisImage;)LCo/e;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class c {
    public static final Image a(HybrisImage hybrisImage) {
        g.c cVar;
        g.b next;
        Intrinsics.j(hybrisImage, "<this>");
        String url = hybrisImage.getUrl();
        String altText = hybrisImage.getAltText();
        Iterator<g.b> it = g.b.b().iterator();
        while (true) {
            cVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (StringsKt.H(next.getFormat(), hybrisImage.getFormatString(), true)) {
                break;
            }
        }
        g.b bVar = next;
        if (bVar == null) {
            bVar = g.b.f150127c;
        }
        Iterator<g.c> it2 = g.c.b().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            g.c next2 = it2.next();
            if (StringsKt.H(next2.getType(), hybrisImage.getImageTypeString(), true)) {
                cVar = next2;
                break;
            }
        }
        g.c cVar2 = cVar;
        if (cVar2 == null) {
            cVar2 = g.c.f150132b;
        }
        return new Image(url, altText, bVar, cVar2, hybrisImage.getGalleryIndex());
    }
}
