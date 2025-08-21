package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC6077a;
import androidx.datastore.preferences.protobuf.AbstractC6077a.AbstractC1115a;
import androidx.datastore.preferences.protobuf.AbstractC6083g;
import androidx.datastore.preferences.protobuf.P;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6077a<MessageType extends AbstractC6077a<MessageType, BuilderType>, BuilderType extends AbstractC1115a<MessageType, BuilderType>> implements P {
    protected int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1115a<MessageType extends AbstractC6077a<MessageType, BuilderType>, BuilderType extends AbstractC1115a<MessageType, BuilderType>> implements P.a {
        protected abstract BuilderType l(MessageType messagetype);

        private static <T> void k(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t10 : iterable) {
                if (t10 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t10);
            }
        }

        protected static UninitializedMessageException n(P p10) {
            return new UninitializedMessageException(p10);
        }

        protected static <T> void j(Iterable<T> iterable, List<? super T> list) {
            C6100y.a(iterable);
            if (iterable instanceof C) {
                List<?> listG = ((C) iterable).g();
                C c10 = (C) list;
                int size = list.size();
                for (Object obj : listG) {
                    if (obj == null) {
                        String str = "Element at index " + (c10.size() - size) + " is null.";
                        for (int size2 = c10.size() - 1; size2 >= size; size2--) {
                            c10.remove(size2);
                        }
                        throw new NullPointerException(str);
                    }
                    if (obj instanceof AbstractC6083g) {
                        c10.n2((AbstractC6083g) obj);
                    } else if (obj instanceof byte[]) {
                        c10.n2(AbstractC6083g.k((byte[]) obj));
                    } else {
                        c10.add((String) obj);
                    }
                }
                return;
            }
            if (iterable instanceof Z) {
                list.addAll((Collection) iterable);
            } else {
                k(iterable, list);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.P.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public BuilderType T(P p10) {
            if (e().getClass().isInstance(p10)) {
                return (BuilderType) l((AbstractC6077a) p10);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    private String m(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    int k() {
        throw new UnsupportedOperationException();
    }

    UninitializedMessageException n() {
        return new UninitializedMessageException(this);
    }

    void o(int i10) {
        throw new UnsupportedOperationException();
    }

    protected static <T> void j(Iterable<T> iterable, List<? super T> list) {
        AbstractC1115a.j(iterable, list);
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public AbstractC6083g g() {
        try {
            AbstractC6083g.h hVarQ = AbstractC6083g.q(c());
            i(hVarQ.b());
            return hVarQ.a();
        } catch (IOException e10) {
            throw new RuntimeException(m("ByteString"), e10);
        }
    }

    int l(f0 f0Var) {
        int iK = k();
        if (iK == -1) {
            int iG = f0Var.g(this);
            o(iG);
            return iG;
        }
        return iK;
    }

    public void p(OutputStream outputStream) throws IOException {
        CodedOutputStream codedOutputStreamE0 = CodedOutputStream.e0(outputStream, CodedOutputStream.I(c()));
        i(codedOutputStreamE0);
        codedOutputStreamE0.b0();
    }
}
