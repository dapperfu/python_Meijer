package Gd;

import com.google.firebase.encoders.EncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Gd.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3707n implements Ef.b {

    /* renamed from: d, reason: collision with root package name */
    private static final Df.c f12148d = new Df.c() { // from class: Gd.m
        @Override // Df.c
        public final void a(Object obj, Object obj2) {
            int i10 = C3707n.f12149e;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f12149e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Map f12150a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f12151b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Df.c f12152c = f12148d;

    @Override // Ef.b
    public final /* bridge */ /* synthetic */ Ef.b a(Class cls, Df.c cVar) {
        this.f12150a.put(cls, cVar);
        this.f12151b.remove(cls);
        return this;
    }

    public final C3714o b() {
        return new C3714o(new HashMap(this.f12150a), new HashMap(this.f12151b), this.f12152c);
    }
}
