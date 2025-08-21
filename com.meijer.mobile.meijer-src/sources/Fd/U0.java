package Fd;

import com.google.firebase.encoders.EncodingException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class U0 implements Ef.b {

    /* renamed from: d, reason: collision with root package name */
    private static final Df.c f9560d = new Df.c() { // from class: Fd.T0
        @Override // Df.c
        public final void a(Object obj, Object obj2) {
            int i10 = U0.f9561e;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f9561e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Map f9562a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f9563b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Df.c f9564c = f9560d;

    @Override // Ef.b
    public final /* bridge */ /* synthetic */ Ef.b a(Class cls, Df.c cVar) {
        this.f9562a.put(cls, cVar);
        this.f9563b.remove(cls);
        return this;
    }

    public final V0 b() {
        return new V0(new HashMap(this.f9562a), new HashMap(this.f9563b), this.f9564c);
    }
}
