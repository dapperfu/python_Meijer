package E2;

import androidx.datastore.preferences.protobuf.AbstractC5956w;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.J;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.Y;
import androidx.datastore.preferences.protobuf.q0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends AbstractC5956w<f, a> implements Q {
    private static final f DEFAULT_INSTANCE;
    private static volatile Y<f> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private J<String, h> preferences_ = J.d();

    public static final class a extends AbstractC5956w.a<f, a> implements Q {
        /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
            super(f.DEFAULT_INSTANCE);
        }

        public a z(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            r();
            ((f) this.f54462b).W().put(str, hVar);
            return this;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final I<String, h> f7589a = I.d(q0.b.f54357k, "", q0.b.f54359m, h.f0());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC5956w.Q(f.class, fVar);
    }

    private J<String, h> Y() {
        if (!this.preferences_.j()) {
            this.preferences_ = this.preferences_.q();
        }
        return this.preferences_;
    }

    private J<String, h> Z() {
        return this.preferences_;
    }

    public static a a0() {
        return DEFAULT_INSTANCE.w();
    }

    public static f b0(InputStream inputStream) throws IOException {
        return (f) AbstractC5956w.O(DEFAULT_INSTANCE, inputStream);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5956w
    protected final Object z(AbstractC5956w.f fVar, Object obj, Object obj2) {
        Y bVar;
        e eVar = null;
        switch (e.f7588a[fVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC5956w.M(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f7589a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<f> y10 = PARSER;
                if (y10 != null) {
                    return y10;
                }
                synchronized (f.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC5956w.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, h> W() {
        return Y();
    }

    public Map<String, h> X() {
        return Collections.unmodifiableMap(Z());
    }
}
