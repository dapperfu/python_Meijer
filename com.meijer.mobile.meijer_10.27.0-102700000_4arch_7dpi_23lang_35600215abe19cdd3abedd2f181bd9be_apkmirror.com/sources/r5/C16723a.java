package r5;

import cb.C6382c;
import cb.C6383d;
import java.util.Iterator;
import kt.C15319h;
import kt.k;
import tt.e;

/* renamed from: r5.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16723a extends e<Object> {

    /* renamed from: b, reason: collision with root package name */
    private static C6382c f157841b = C6383d.a(C16723a.class.getName());

    public final boolean h(k kVar) {
        if (!(kVar instanceof C15319h)) {
            return true;
        }
        Iterator<Object> it = iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next();
        throw new RuntimeException("Use a mapper to map InternalPlace to Place");
    }
}
