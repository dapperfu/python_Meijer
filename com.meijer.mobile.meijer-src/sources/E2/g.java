package E2;

import androidx.datastore.preferences.protobuf.AbstractC6077a;
import androidx.datastore.preferences.protobuf.AbstractC6098w;
import androidx.datastore.preferences.protobuf.C6100y;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.Y;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends AbstractC6098w<g, a> implements Q {
    private static final g DEFAULT_INSTANCE;
    private static volatile Y<g> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private C6100y.i<String> strings_ = AbstractC6098w.A();

    public static final class a extends AbstractC6098w.a<g, a> implements Q {
        /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
            super(g.DEFAULT_INSTANCE);
        }

        public a z(Iterable<String> iterable) {
            r();
            ((g) this.f54686b).W(iterable);
            return this;
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC6098w.Q(g.class, gVar);
    }

    private void X() {
        C6100y.i<String> iVar = this.strings_;
        if (iVar.j()) {
            return;
        }
        this.strings_ = AbstractC6098w.K(iVar);
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

    @Override // androidx.datastore.preferences.protobuf.AbstractC6098w
    protected final Object z(AbstractC6098w.f fVar, Object obj, Object obj2) {
        Y bVar;
        e eVar = null;
        switch (e.f6995a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC6098w.M(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
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
                            bVar = new AbstractC6098w.b(DEFAULT_INSTANCE);
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
        AbstractC6077a.j(iterable, this.strings_);
    }
}
