package com.google.protobuf;

import com.google.protobuf.AbstractC11640a;
import com.google.protobuf.AbstractC11640a.AbstractC1305a;
import com.google.protobuf.AbstractC11646g;
import com.google.protobuf.P;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC11640a<MessageType extends AbstractC11640a<MessageType, BuilderType>, BuilderType extends AbstractC1305a<MessageType, BuilderType>> implements P {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1305a<MessageType extends AbstractC11640a<MessageType, BuilderType>, BuilderType extends AbstractC1305a<MessageType, BuilderType>> implements P.a {
        protected abstract BuilderType r(MessageType messagetype);

        private static <T> void q(Iterable<T> iterable, List<? super T> list) {
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

        protected static UninitializedMessageException t(P p10) {
            return new UninitializedMessageException(p10);
        }

        protected static <T> void p(Iterable<T> iterable, List<? super T> list) {
            C11663y.a(iterable);
            if (iterable instanceof E) {
                List<?> listG = ((E) iterable).g();
                E e10 = (E) list;
                int size = list.size();
                for (Object obj : listG) {
                    if (obj == null) {
                        String str = "Element at index " + (e10.size() - size) + " is null.";
                        for (int size2 = e10.size() - 1; size2 >= size; size2--) {
                            e10.remove(size2);
                        }
                        throw new NullPointerException(str);
                    }
                    if (obj instanceof AbstractC11646g) {
                        e10.h0((AbstractC11646g) obj);
                    } else {
                        e10.add((String) obj);
                    }
                }
                return;
            }
            if (iterable instanceof Z) {
                list.addAll((Collection) iterable);
            } else {
                q(iterable, list);
            }
        }

        @Override // com.google.protobuf.P.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public BuilderType U0(P p10) {
            if (e().getClass().isInstance(p10)) {
                return (BuilderType) r((AbstractC11640a) p10);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    private String s(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    int q() {
        throw new UnsupportedOperationException();
    }

    UninitializedMessageException t() {
        return new UninitializedMessageException(this);
    }

    void u(int i10) {
        throw new UnsupportedOperationException();
    }

    protected static <T> void p(Iterable<T> iterable, List<? super T> list) {
        AbstractC1305a.p(iterable, list);
    }

    @Override // com.google.protobuf.P
    public AbstractC11646g g() {
        try {
            AbstractC11646g.h hVarP = AbstractC11646g.p(c());
            l(hVarP.b());
            return hVarP.a();
        } catch (IOException e10) {
            throw new RuntimeException(s("ByteString"), e10);
        }
    }

    int r(f0 f0Var) {
        int iQ = q();
        if (iQ == -1) {
            int iG = f0Var.g(this);
            u(iG);
            return iG;
        }
        return iQ;
    }

    public byte[] v() {
        try {
            byte[] bArr = new byte[c()];
            CodedOutputStream codedOutputStreamC0 = CodedOutputStream.c0(bArr);
            l(codedOutputStreamC0);
            codedOutputStreamC0.c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(s("byte array"), e10);
        }
    }
}
