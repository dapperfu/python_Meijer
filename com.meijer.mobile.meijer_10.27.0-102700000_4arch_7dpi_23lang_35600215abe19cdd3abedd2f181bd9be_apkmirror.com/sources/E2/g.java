package E2;

import androidx.datastore.preferences.protobuf.AbstractC5935a;
import androidx.datastore.preferences.protobuf.AbstractC5956w;
import androidx.datastore.preferences.protobuf.C5958y;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.Y;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends AbstractC5956w<g, a> implements Q {
    private static final g DEFAULT_INSTANCE;
    private static volatile Y<g> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private C5958y.i<String> strings_ = AbstractC5956w.A();

    public static final class a extends AbstractC5956w.a<g, a> implements Q {
        /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
            super(g.DEFAULT_INSTANCE);
        }

        public a z(Iterable<String> iterable) {
            r();
            ((g) this.f54462b).W(iterable);
            return this;
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC5956w.Q(g.class, gVar);
    }

    private void X() {
        C5958y.i<String> iVar = this.strings_;
        if (iVar.j()) {
            return;
        }
        this.strings_ = AbstractC5956w.K(iVar);
    }

    public static g Y() {
        return DEFAULT_INSTANCE;
    }

    public static a a0() {
        return DEFAULT_INSTANCE.w();
    }

    public List<String> Z() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5956w
    protected final Object z(AbstractC5956w.f fVar, Object obj, Object obj2) {
        Y bVar;
        e eVar = null;
        switch (e.f7588a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC5956w.M(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<g> y10 = PARSER;
                if (y10 != null) {
                    return y10;
                }
                synchronized (g.class) {
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

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(Iterable<String> iterable) {
        X();
        AbstractC5935a.j(iterable, this.strings_);
    }
}
