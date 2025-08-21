package s5;

import eb.C13786c;
import eb.C13787d;
import java.util.Iterator;
import kt.C15422h;
import kt.k;
import tt.e;

/* renamed from: s5.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17020a extends e<Object> {

    /* renamed from: b, reason: collision with root package name */
    private static C13786c f160056b = C13787d.a(C17020a.class.getName());

    public final boolean h(k kVar) {
        if (!(kVar instanceof C15422h)) {
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
