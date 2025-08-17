package rg;

import Cd.C3006y;
import Cd.C3007z;
import com.google.android.gms.common.internal.C6535q;
import java.util.EnumMap;
import java.util.Map;
import sg.EnumC16967l;
import tg.EnumC17096a;

/* renamed from: rg.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC16787b {

    /* renamed from: d, reason: collision with root package name */
    private static final Map f158612d = new EnumMap(EnumC17096a.class);

    /* renamed from: e, reason: collision with root package name */
    public static final Map f158613e = new EnumMap(EnumC17096a.class);

    /* renamed from: a, reason: collision with root package name */
    private final String f158614a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC17096a f158615b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC16967l f158616c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC16787b)) {
            return false;
        }
        AbstractC16787b abstractC16787b = (AbstractC16787b) obj;
        return C6535q.a(this.f158614a, abstractC16787b.f158614a) && C6535q.a(this.f158615b, abstractC16787b.f158615b) && C6535q.a(this.f158616c, abstractC16787b.f158616c);
    }

    public int hashCode() {
        return C6535q.b(this.f158614a, this.f158615b, this.f158616c);
    }

    public String toString() {
        C3006y c3006yA = C3007z.a("RemoteModel");
        c3006yA.a("modelName", this.f158614a);
        c3006yA.a("baseModel", this.f158615b);
        c3006yA.a("modelType", this.f158616c);
        return c3006yA.toString();
    }
}
