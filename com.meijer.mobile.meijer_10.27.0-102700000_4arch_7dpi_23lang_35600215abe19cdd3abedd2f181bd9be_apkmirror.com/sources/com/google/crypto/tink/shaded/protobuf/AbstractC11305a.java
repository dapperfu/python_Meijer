package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC11305a;
import com.google.crypto.tink.shaded.protobuf.AbstractC11305a.AbstractC1279a;
import com.google.crypto.tink.shaded.protobuf.AbstractC11312h;
import com.google.crypto.tink.shaded.protobuf.Q;
import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC11305a<MessageType extends AbstractC11305a<MessageType, BuilderType>, BuilderType extends AbstractC1279a<MessageType, BuilderType>> implements Q {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1279a<MessageType extends AbstractC11305a<MessageType, BuilderType>, BuilderType extends AbstractC1279a<MessageType, BuilderType>> implements Q.a {
        protected abstract BuilderType j(MessageType messagetype);

        protected static UninitializedMessageException l(Q q10) {
            return new UninitializedMessageException(q10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Q.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public BuilderType M2(Q q10) {
            if (e().getClass().isInstance(q10)) {
                return (BuilderType) j((AbstractC11305a) q10);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    private String l(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    int j() {
        throw new UnsupportedOperationException();
    }

    UninitializedMessageException m() {
        return new UninitializedMessageException(this);
    }

    void n(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    public AbstractC11312h g() {
        try {
            AbstractC11312h.C1280h c1280hQ = AbstractC11312h.q(c());
            i(c1280hQ.b());
            return c1280hQ.a();
        } catch (IOException e10) {
            throw new RuntimeException(l("ByteString"), e10);
        }
    }

    int k(f0 f0Var) {
        int iJ = j();
        if (iJ == -1) {
            int iG = f0Var.g(this);
            n(iG);
            return iG;
        }
        return iJ;
    }

    public byte[] o() {
        try {
            byte[] bArr = new byte[c()];
            CodedOutputStream codedOutputStreamC0 = CodedOutputStream.c0(bArr);
            i(codedOutputStreamC0);
            codedOutputStreamC0.c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(l("byte array"), e10);
        }
    }
}
