package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC5956w;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5948n {

    /* renamed from: b, reason: collision with root package name */
    private static volatile C5948n f54312b;

    /* renamed from: c, reason: collision with root package name */
    static final C5948n f54313c = new C5948n(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, AbstractC5956w.e<?, ?>> f54314a;

    /* renamed from: androidx.datastore.preferences.protobuf.n$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f54315a;

        /* renamed from: b, reason: collision with root package name */
        private final int f54316b;

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f54315a == aVar.f54315a && this.f54316b == aVar.f54316b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f54315a) * 65535) + this.f54316b;
        }

        a(Object obj, int i10) {
            this.f54315a = obj;
            this.f54316b = i10;
        }
    }

    C5948n() {
        this.f54314a = new HashMap();
    }

    public static C5948n b() {
        C5948n c5948nA;
        if (b0.f54215d) {
            return f54313c;
        }
        C5948n c5948n = f54312b;
        if (c5948n != null) {
            return c5948n;
        }
        synchronized (C5948n.class) {
            try {
                c5948nA = f54312b;
                if (c5948nA == null) {
                    c5948nA = C5947m.a();
                    f54312b = c5948nA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5948nA;
    }

    public <ContainingType extends P> AbstractC5956w.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (AbstractC5956w.e) this.f54314a.get(new a(containingtype, i10));
    }

    C5948n(boolean z10) {
        this.f54314a = Collections.EMPTY_MAP;
    }
}
