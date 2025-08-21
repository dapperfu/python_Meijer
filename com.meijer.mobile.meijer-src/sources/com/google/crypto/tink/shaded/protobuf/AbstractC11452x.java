package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.common.api.a;
import com.google.crypto.tink.shaded.protobuf.AbstractC11430a;
import com.google.crypto.tink.shaded.protobuf.AbstractC11452x;
import com.google.crypto.tink.shaded.protobuf.AbstractC11452x.a;
import com.google.crypto.tink.shaded.protobuf.C11434e;
import com.google.crypto.tink.shaded.protobuf.C11448t;
import com.google.crypto.tink.shaded.protobuf.C11454z;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.q0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.crypto.tink.shaded.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC11452x<MessageType extends AbstractC11452x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC11430a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC11452x<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected m0 unknownFields = m0.c();

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$a */
    public static abstract class a<MessageType extends AbstractC11452x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC11430a.AbstractC1288a<MessageType, BuilderType> {

        /* renamed from: a, reason: collision with root package name */
        private final MessageType f89410a;

        /* renamed from: b, reason: collision with root package name */
        protected MessageType f89411b;

        private MessageType w() {
            return (MessageType) this.f89410a.N();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.S
        public final boolean a() {
            return AbstractC11452x.G(this.f89411b, false);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Q.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public MessageType h() {
            if (!this.f89411b.H()) {
                return this.f89411b;
            }
            this.f89411b.I();
            return this.f89411b;
        }

        protected final void p() {
            if (this.f89411b.H()) {
                return;
            }
            q();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.S
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public MessageType e() {
            return this.f89410a;
        }

        protected a(MessageType messagetype) {
            this.f89410a = messagetype;
            if (!messagetype.H()) {
                this.f89411b = (MessageType) w();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private static <MessageType> void v(MessageType messagetype, MessageType messagetype2) {
            b0.a().d(messagetype).a(messagetype, messagetype2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Q.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) h();
            if (messagetype.a()) {
                return messagetype;
            }
            throw AbstractC11430a.AbstractC1288a.l(messagetype);
        }

        @Override // 
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) e().d();
            buildertype.f89411b = (MessageType) h();
            return buildertype;
        }

        protected void q() {
            MessageType messagetype = (MessageType) w();
            v(messagetype, this.f89411b);
            this.f89411b = messagetype;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11430a.AbstractC1288a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public BuilderType j(MessageType messagetype) {
            return (BuilderType) u(messagetype);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Q.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public BuilderType j2(AbstractC11438i abstractC11438i, C11444o c11444o) throws IOException {
            p();
            try {
                b0.a().d(this.f89411b).i(this.f89411b, C11439j.Q(abstractC11438i), c11444o);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        public BuilderType u(MessageType messagetype) {
            if (e().equals(messagetype)) {
                return this;
            }
            p();
            v(this.f89411b, messagetype);
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$b */
    protected static class b<T extends AbstractC11452x<T, ?>> extends AbstractC11431b<T> {

        /* renamed from: b, reason: collision with root package name */
        private final T f89412b;

        @Override // com.google.crypto.tink.shaded.protobuf.Z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public T a(AbstractC11438i abstractC11438i, C11444o c11444o) throws InvalidProtocolBufferException {
            return (T) AbstractC11452x.S(this.f89412b, abstractC11438i, c11444o);
        }

        public b(T t10) {
            this.f89412b = t10;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends AbstractC11452x<MessageType, BuilderType> implements S {
        protected C11448t<d> extensions = C11448t.h();

        C11448t<d> X() {
            if (this.extensions.n()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x, com.google.crypto.tink.shaded.protobuf.Q
        public /* bridge */ /* synthetic */ Q.a b() {
            return super.b();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x, com.google.crypto.tink.shaded.protobuf.Q
        public /* bridge */ /* synthetic */ Q.a d() {
            return super.d();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x, com.google.crypto.tink.shaded.protobuf.S
        public /* bridge */ /* synthetic */ Q e() {
            return super.e();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$d */
    static final class d implements C11448t.b<d> {

        /* renamed from: a, reason: collision with root package name */
        final C11454z.d<?> f89413a;

        /* renamed from: b, reason: collision with root package name */
        final int f89414b;

        /* renamed from: c, reason: collision with root package name */
        final q0.b f89415c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f89416d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f89417e;

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f89414b - dVar.f89414b;
        }

        public C11454z.d<?> b() {
            return this.f89413a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.C11448t.b
        public Q.a f(Q.a aVar, Q q10) {
            return ((a) aVar).u((AbstractC11452x) q10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C11448t.b
        public int g() {
            return this.f89414b;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C11448t.b
        public boolean h() {
            return this.f89416d;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C11448t.b
        public q0.b i() {
            return this.f89415c;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C11448t.b
        public q0.c j() {
            return this.f89415c.a();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C11448t.b
        public boolean k() {
            return this.f89417e;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$e */
    public static class e<ContainingType extends Q, Type> extends AbstractC11442m<ContainingType, Type> {

        /* renamed from: a, reason: collision with root package name */
        final Q f89418a;

        /* renamed from: b, reason: collision with root package name */
        final d f89419b;

        public q0.b a() {
            return this.f89419b.i();
        }

        public Q b() {
            return this.f89418a;
        }

        public int c() {
            return this.f89419b.g();
        }

        public boolean d() {
            return this.f89419b.f89416d;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$f */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static <T extends AbstractC11452x<T, ?>> T Q(T t10, byte[] bArr, C11444o c11444o) throws InvalidProtocolBufferException {
        return (T) q(T(t10, bArr, 0, bArr.length, c11444o));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.S
    public final boolean a() {
        return G(this, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    public int c() {
        return k(null);
    }

    void r() {
        this.memoizedHashCode = 0;
    }

    protected Object x(f fVar) {
        return z(fVar, null, null);
    }

    protected Object y(f fVar, Object obj) {
        return z(fVar, obj, null);
    }

    protected abstract Object z(f fVar, Object obj, Object obj2);

    static <T extends AbstractC11452x<?, ?>> T B(Class<T> cls) throws ClassNotFoundException {
        T t10 = (T) defaultInstanceMap.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 != null) {
            return t10;
        }
        T t11 = (T) ((AbstractC11452x) o0.k(cls)).e();
        if (t11 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t11);
        return t11;
    }

    protected static final <T extends AbstractC11452x<T, ?>> boolean G(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.x(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zF = b0.a().d(t10).f(t10);
        if (z10) {
            t10.y(f.SET_MEMOIZED_IS_INITIALIZED, zF ? t10 : null);
        }
        return zF;
    }

    protected static Object M(Q q10, String str, Object[] objArr) {
        return new d0(q10, str, objArr);
    }

    private static <T extends AbstractC11452x<T, ?>> T T(T t10, byte[] bArr, int i10, int i11, C11444o c11444o) throws InvalidProtocolBufferException {
        if (i11 == 0) {
            return t10;
        }
        T t11 = (T) t10.N();
        try {
            f0 f0VarD = b0.a().d(t11);
            f0VarD.h(t11, bArr, i10, i10 + i11, new C11434e.b(c11444o));
            f0VarD.e(t11);
            return t11;
        } catch (InvalidProtocolBufferException e10) {
            InvalidProtocolBufferException invalidProtocolBufferException = e10;
            if (invalidProtocolBufferException.a()) {
                invalidProtocolBufferException = new InvalidProtocolBufferException(invalidProtocolBufferException);
            }
            throw invalidProtocolBufferException.k(t11);
        } catch (UninitializedMessageException e11) {
            throw e11.a().k(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12).k(t11);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.m().k(t11);
        }
    }

    private static <T extends AbstractC11452x<T, ?>> T q(T t10) throws InvalidProtocolBufferException {
        if (t10 == null || t10.a()) {
            return t10;
        }
        throw t10.m().a().k(t10);
    }

    private int u(f0<?> f0Var) {
        return f0Var == null ? b0.a().d(this).g(this) : f0Var.g(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.S
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final MessageType e() {
        return (MessageType) x(f.GET_DEFAULT_INSTANCE);
    }

    int D() {
        return this.memoizedHashCode;
    }

    boolean H() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    void J() {
        this.memoizedSerializedSize &= a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final BuilderType d() {
        return (BuilderType) x(f.NEW_BUILDER);
    }

    MessageType N() {
        return (MessageType) x(f.NEW_MUTABLE_INSTANCE);
    }

    void V(int i10) {
        this.memoizedHashCode = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final BuilderType b() {
        return (BuilderType) ((a) x(f.NEW_BUILDER)).u(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return b0.a().d(this).c(this, (AbstractC11452x) obj);
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    public final Z<MessageType> f() {
        return (Z) x(f.GET_PARSER);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11430a
    int j() {
        return this.memoizedSerializedSize & a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11430a
    void n(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & a.e.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    Object p() throws Exception {
        return x(f.BUILD_MESSAGE_INFO);
    }

    protected final <MessageType extends AbstractC11452x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType v() {
        return (BuilderType) x(f.NEW_BUILDER);
    }

    protected static <E> C11454z.i<E> A() {
        return c0.f();
    }

    static Object F(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    protected static <E> C11454z.i<E> K(C11454z.i<E> iVar) {
        int i10;
        int size = iVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size * 2;
        }
        return iVar.b(i10);
    }

    protected static <T extends AbstractC11452x<T, ?>> T O(T t10, AbstractC11437h abstractC11437h, C11444o c11444o) throws InvalidProtocolBufferException {
        return (T) q(R(t10, abstractC11437h, c11444o));
    }

    protected static <T extends AbstractC11452x<T, ?>> T P(T t10, InputStream inputStream, C11444o c11444o) throws InvalidProtocolBufferException {
        return (T) q(S(t10, AbstractC11438i.g(inputStream), c11444o));
    }

    private static <T extends AbstractC11452x<T, ?>> T R(T t10, AbstractC11437h abstractC11437h, C11444o c11444o) throws InvalidProtocolBufferException {
        AbstractC11438i abstractC11438iR = abstractC11437h.r();
        T t11 = (T) S(t10, abstractC11438iR, c11444o);
        try {
            abstractC11438iR.a(0);
            return t11;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.k(t11);
        }
    }

    static <T extends AbstractC11452x<T, ?>> T S(T t10, AbstractC11438i abstractC11438i, C11444o c11444o) throws InvalidProtocolBufferException {
        T t11 = (T) t10.N();
        try {
            f0 f0VarD = b0.a().d(t11);
            f0VarD.i(t11, C11439j.Q(abstractC11438i), c11444o);
            f0VarD.e(t11);
            return t11;
        } catch (InvalidProtocolBufferException e10) {
            e = e10;
            if (e.a()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.k(t11);
        } catch (UninitializedMessageException e11) {
            throw e11.a().k(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12).k(t11);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e13.getCause());
            }
            throw e13;
        }
    }

    protected static <T extends AbstractC11452x<?, ?>> void U(Class<T> cls, T t10) {
        t10.J();
        defaultInstanceMap.put(cls, t10);
    }

    boolean E() {
        if (D() == 0) {
            return true;
        }
        return false;
    }

    protected void I() {
        b0.a().d(this).e(this);
        J();
    }

    public int hashCode() {
        if (H()) {
            return t();
        }
        if (E()) {
            V(t());
        }
        return D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    public void i(CodedOutputStream codedOutputStream) throws IOException {
        b0.a().d(this).j(this, C11440k.P(codedOutputStream));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11430a
    int k(f0 f0Var) {
        if (H()) {
            int iU = u(f0Var);
            if (iU >= 0) {
                return iU;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iU);
        }
        if (j() != Integer.MAX_VALUE) {
            return j();
        }
        int iU2 = u(f0Var);
        n(iU2);
        return iU2;
    }

    void s() {
        n(a.e.API_PRIORITY_OTHER);
    }

    int t() {
        return b0.a().d(this).b(this);
    }

    public String toString() {
        return T.f(this, super.toString());
    }

    protected final <MessageType extends AbstractC11452x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType w(MessageType messagetype) {
        return (BuilderType) v().u(messagetype);
    }
}
