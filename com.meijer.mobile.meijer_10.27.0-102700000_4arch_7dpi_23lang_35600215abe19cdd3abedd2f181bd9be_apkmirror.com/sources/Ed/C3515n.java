package Ed;

import com.google.firebase.encoders.EncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Ed.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3515n implements Cf.b {

    /* renamed from: d, reason: collision with root package name */
    private static final Bf.c f8596d = new Bf.c() { // from class: Ed.m
        @Override // Bf.c
        public final void a(Object obj, Object obj2) {
            int i10 = C3515n.f8597e;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f8597e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Map f8598a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f8599b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Bf.c f8600c = f8596d;

    @Override // Cf.b
    public final /* bridge */ /* synthetic */ Cf.b a(Class cls, Bf.c cVar) {
        this.f8598a.put(cls, cVar);
        this.f8599b.remove(cls);
        return this;
    }

    public final C3522o b() {
        return new C3522o(new HashMap(this.f8598a), new HashMap(this.f8599b), this.f8600c);
    }
}
