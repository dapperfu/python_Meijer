package tg;

import Ed.C3209y;
import Ed.C3210z;
import com.google.android.gms.common.internal.C6660q;
import java.util.EnumMap;
import java.util.Map;
import ug.EnumC17414l;
import vg.EnumC17671a;

/* renamed from: tg.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC17261b {

    /* renamed from: d, reason: collision with root package name */
    private static final Map f163058d = new EnumMap(EnumC17671a.class);

    /* renamed from: e, reason: collision with root package name */
    public static final Map f163059e = new EnumMap(EnumC17671a.class);

    /* renamed from: a, reason: collision with root package name */
    private final String f163060a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC17671a f163061b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC17414l f163062c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC17261b)) {
            return false;
        }
        AbstractC17261b abstractC17261b = (AbstractC17261b) obj;
        return C6660q.a(this.f163060a, abstractC17261b.f163060a) && C6660q.a(this.f163061b, abstractC17261b.f163061b) && C6660q.a(this.f163062c, abstractC17261b.f163062c);
    }

    public int hashCode() {
        return C6660q.b(this.f163060a, this.f163061b, this.f163062c);
    }

    public String toString() {
        C3209y c3209yA = C3210z.a("RemoteModel");
        c3209yA.a("modelName", this.f163060a);
        c3209yA.a("baseModel", this.f163061b);
        c3209yA.a("modelType", this.f163062c);
        return c3209yA.toString();
    }
}
