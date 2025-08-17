package Dd;

import com.google.firebase.encoders.EncodingException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class U0 implements Cf.b {

    /* renamed from: d, reason: collision with root package name */
    private static final Bf.c f5527d = new Bf.c() { // from class: Dd.T0
        @Override // Bf.c
        public final void a(Object obj, Object obj2) {
            int i10 = U0.f5528e;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f5528e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Map f5529a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f5530b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Bf.c f5531c = f5527d;

    @Override // Cf.b
    public final /* bridge */ /* synthetic */ Cf.b a(Class cls, Bf.c cVar) {
        this.f5529a.put(cls, cVar);
        this.f5530b.remove(cls);
        return this;
    }

    public final V0 b() {
        return new V0(new HashMap(this.f5529a), new HashMap(this.f5530b), this.f5531c);
    }
}
