package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC6098w;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6090n {

    /* renamed from: b, reason: collision with root package name */
    private static volatile C6090n f54536b;

    /* renamed from: c, reason: collision with root package name */
    static final C6090n f54537c = new C6090n(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, AbstractC6098w.e<?, ?>> f54538a;

    /* renamed from: androidx.datastore.preferences.protobuf.n$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f54539a;

        /* renamed from: b, reason: collision with root package name */
        private final int f54540b;

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f54539a == aVar.f54539a && this.f54540b == aVar.f54540b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f54539a) * 65535) + this.f54540b;
        }

        a(Object obj, int i10) {
            this.f54539a = obj;
            this.f54540b = i10;
        }
    }

    C6090n() {
        this.f54538a = new HashMap();
    }

    public static C6090n b() {
        C6090n c6090nA;
        if (b0.f54439d) {
            return f54537c;
        }
        C6090n c6090n = f54536b;
        if (c6090n != null) {
            return c6090n;
        }
        synchronized (C6090n.class) {
            try {
                c6090nA = f54536b;
                if (c6090nA == null) {
                    c6090nA = C6089m.a();
                    f54536b = c6090nA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6090nA;
    }

    public <ContainingType extends P> AbstractC6098w.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (AbstractC6098w.e) this.f54538a.get(new a(containingtype, i10));
    }

    C6090n(boolean z10) {
        this.f54538a = Collections.EMPTY_MAP;
    }
}
