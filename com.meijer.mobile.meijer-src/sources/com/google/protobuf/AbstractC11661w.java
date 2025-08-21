package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.AbstractC11640a;
import com.google.protobuf.AbstractC11661w;
import com.google.protobuf.AbstractC11661w.a;
import com.google.protobuf.C11657s;
import com.google.protobuf.C11663y;
import com.google.protobuf.P;
import com.google.protobuf.r0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC11661w<MessageType extends AbstractC11661w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC11640a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC11661w<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected m0 unknownFields = m0.c();

    /* renamed from: com.google.protobuf.w$a */
    public static abstract class a<MessageType extends AbstractC11661w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC11640a.AbstractC1305a<MessageType, BuilderType> {

        /* renamed from: a, reason: collision with root package name */
        private final MessageType f91574a;

        /* renamed from: b, reason: collision with root package name */
        protected MessageType f91575b;

        private MessageType F() {
            return (MessageType) this.f91574a.U();
        }

        @Override // com.google.protobuf.Q
        public final boolean a() {
            return AbstractC11661w.M(this.f91575b, false);
        }

        @Override // com.google.protobuf.P.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public MessageType h() {
            if (!this.f91575b.N()) {
                return this.f91575b;
            }
            this.f91575b.O();
            return this.f91575b;
        }

        protected final void x() {
            if (this.f91575b.N()) {
                return;
            }
            y();
        }

        @Override // com.google.protobuf.Q
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public MessageType e() {
            return this.f91574a;
        }

        protected a(MessageType messagetype) {
            this.f91574a = messagetype;
            if (!messagetype.N()) {
                this.f91575b = (MessageType) F();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private static <MessageType> void E(MessageType messagetype, MessageType messagetype2) {
            b0.a().d(messagetype).a(messagetype, messagetype2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC11640a.AbstractC1305a
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public BuilderType r(MessageType messagetype) {
            return (BuilderType) D(messagetype);
        }

        @Override // com.google.protobuf.P.a
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public BuilderType d1(AbstractC11647h abstractC11647h, C11653n c11653n) throws IOException {
            x();
            try {
                b0.a().d(this.f91575b).i(this.f91575b, C11648i.Q(abstractC11647h), c11653n);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        public BuilderType D(MessageType messagetype) {
            if (e().equals(messagetype)) {
                return this;
            }
            x();
            E(this.f91575b, messagetype);
            return this;
        }

        @Override // com.google.protobuf.P.a
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) h();
            if (messagetype.a()) {
                return messagetype;
            }
            throw AbstractC11640a.AbstractC1305a.t(messagetype);
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) e().d();
            buildertype.f91575b = (MessageType) h();
            return buildertype;
        }

        protected void y() {
            MessageType messagetype = (MessageType) F();
            E(messagetype, this.f91575b);
            this.f91575b = messagetype;
        }
    }

    /* renamed from: com.google.protobuf.w$b */
    protected static class b<T extends AbstractC11661w<T, ?>> extends AbstractC11641b<T> {

        /* renamed from: b, reason: collision with root package name */
        private final T f91576b;

        @Override // com.google.protobuf.Y
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public T b(AbstractC11647h abstractC11647h, C11653n c11653n) throws InvalidProtocolBufferException {
            return (T) AbstractC11661w.V(this.f91576b, abstractC11647h, c11653n);
        }

        public b(T t10) {
            this.f91576b = t10;
        }
    }

    /* renamed from: com.google.protobuf.w$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends AbstractC11661w<MessageType, BuilderType> implements Q {
        protected C11657s<d> extensions = C11657s.h();

        C11657s<d> Z() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // com.google.protobuf.AbstractC11661w, com.google.protobuf.P
        public /* bridge */ /* synthetic */ P.a b() {
            return super.b();
        }

        @Override // com.google.protobuf.AbstractC11661w, com.google.protobuf.P
        public /* bridge */ /* synthetic */ P.a d() {
            return super.d();
        }

        @Override // com.google.protobuf.AbstractC11661w, com.google.protobuf.Q
        public /* bridge */ /* synthetic */ P e() {
            return super.e();
        }
    }

    /* renamed from: com.google.protobuf.w$d */
    static final class d implements C11657s.b<d> {

        /* renamed from: a, reason: collision with root package name */
        final C11663y.d<?> f91577a;

        /* renamed from: b, reason: collision with root package name */
        final int f91578b;

        /* renamed from: c, reason: collision with root package name */
        final r0.b f91579c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f91580d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f91581e;

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f91578b - dVar.f91578b;
        }

        public C11663y.d<?> b() {
            return this.f91577a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.C11657s.b
        public P.a c(P.a aVar, P p10) {
            return ((a) aVar).D((AbstractC11661w) p10);
        }

        @Override // com.google.protobuf.C11657s.b
        public int g() {
            return this.f91578b;
        }

        @Override // com.google.protobuf.C11657s.b
        public boolean h() {
            return this.f91580d;
        }

        @Override // com.google.protobuf.C11657s.b
        public r0.b i() {
            return this.f91579c;
        }

        @Override // com.google.protobuf.C11657s.b
        public r0.c j() {
            return this.f91579c.a();
        }

        @Override // com.google.protobuf.C11657s.b
        public boolean k() {
            return this.f91581e;
        }
    }

    /* renamed from: com.google.protobuf.w$e */
    public static class e<ContainingType extends P, Type> extends AbstractC11651l<ContainingType, Type> {

        /* renamed from: a, reason: collision with root package name */
        final P f91582a;

        /* renamed from: b, reason: collision with root package name */
        final d f91583b;

        public r0.b a() {
            return this.f91583b.i();
        }

        public P b() {
            return this.f91582a;
        }

        public int c() {
            return this.f91583b.g();
        }

        public boolean d() {
            return this.f91583b.f91580d;
        }
    }

    /* renamed from: com.google.protobuf.w$f */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected Object C(f fVar) {
        return E(fVar, null, null);
    }

    protected Object D(f fVar, Object obj) {
        return E(fVar, obj, null);
    }

    protected abstract Object E(f fVar, Object obj, Object obj2);

    @Override // com.google.protobuf.Q
    public final boolean a() {
        return M(this, true);
    }

    @Override // com.google.protobuf.P
    public int c() {
        return r(null);
    }

    void x() {
        this.memoizedHashCode = 0;
    }

    private int A(f0<?> f0Var) {
        return f0Var == null ? b0.a().d(this).g(this) : f0Var.g(this);
    }

    static <T extends AbstractC11661w<?, ?>> T H(Class<T> cls) throws ClassNotFoundException {
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
        T t11 = (T) ((AbstractC11661w) p0.k(cls)).e();
        if (t11 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t11);
        return t11;
    }

    protected static final <T extends AbstractC11661w<T, ?>> boolean M(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.C(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zF = b0.a().d(t10).f(t10);
        if (z10) {
            t10.D(f.SET_MEMOIZED_IS_INITIALIZED, zF ? t10 : null);
        }
        return zF;
    }

    protected static Object T(P p10, String str, Object[] objArr) {
        return new d0(p10, str, objArr);
    }

    protected final <MessageType extends AbstractC11661w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType B() {
        return (BuilderType) C(f.NEW_BUILDER);
    }

    @Override // com.google.protobuf.Q
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final MessageType e() {
        return (MessageType) C(f.GET_DEFAULT_INSTANCE);
    }

    int J() {
        return this.memoizedHashCode;
    }

    boolean N() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    void P() {
        this.memoizedSerializedSize &= a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.protobuf.P
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final BuilderType d() {
        return (BuilderType) C(f.NEW_BUILDER);
    }

    MessageType U() {
        return (MessageType) C(f.NEW_MUTABLE_INSTANCE);
    }

    void X(int i10) {
        this.memoizedHashCode = i10;
    }

    @Override // com.google.protobuf.P
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final BuilderType b() {
        return (BuilderType) ((a) C(f.NEW_BUILDER)).D(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return b0.a().d(this).c(this, (AbstractC11661w) obj);
        }
        return false;
    }

    @Override // com.google.protobuf.P
    public final Y<MessageType> f() {
        return (Y) C(f.GET_PARSER);
    }

    @Override // com.google.protobuf.AbstractC11640a
    int q() {
        return this.memoizedSerializedSize & a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.protobuf.AbstractC11640a
    void u(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & a.e.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    Object w() throws Exception {
        return C(f.BUILD_MESSAGE_INFO);
    }

    protected static C11663y.g F() {
        return C11662x.k();
    }

    protected static <E> C11663y.i<E> G() {
        return c0.f();
    }

    static Object L(Method method, Object obj, Object... objArr) {
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

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.y$g] */
    protected static C11663y.g Q(C11663y.g gVar) {
        int i10;
        int size = gVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size * 2;
        }
        return gVar.b3(i10);
    }

    protected static <E> C11663y.i<E> R(C11663y.i<E> iVar) {
        int i10;
        int size = iVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size * 2;
        }
        return iVar.b3(i10);
    }

    static <T extends AbstractC11661w<T, ?>> T V(T t10, AbstractC11647h abstractC11647h, C11653n c11653n) throws InvalidProtocolBufferException {
        T t11 = (T) t10.U();
        try {
            f0 f0VarD = b0.a().d(t11);
            f0VarD.i(t11, C11648i.Q(abstractC11647h), c11653n);
            f0VarD.e(t11);
            return t11;
        } catch (InvalidProtocolBufferException e10) {
            e = e10;
            if (e.a()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.j(t11);
        } catch (UninitializedMessageException e11) {
            throw e11.a().j(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12).j(t11);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e13.getCause());
            }
            throw e13;
        }
    }

    protected static <T extends AbstractC11661w<?, ?>> void W(Class<T> cls, T t10) {
        t10.P();
        defaultInstanceMap.put(cls, t10);
    }

    boolean K() {
        if (J() == 0) {
            return true;
        }
        return false;
    }

    protected void O() {
        b0.a().d(this).e(this);
        P();
    }

    public int hashCode() {
        if (N()) {
            return z();
        }
        if (K()) {
            X(z());
        }
        return J();
    }

    @Override // com.google.protobuf.P
    public void l(CodedOutputStream codedOutputStream) throws IOException {
        b0.a().d(this).h(this, C11649j.P(codedOutputStream));
    }

    @Override // com.google.protobuf.AbstractC11640a
    int r(f0 f0Var) {
        if (N()) {
            int iA = A(f0Var);
            if (iA >= 0) {
                return iA;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iA);
        }
        if (q() != Integer.MAX_VALUE) {
            return q();
        }
        int iA2 = A(f0Var);
        u(iA2);
        return iA2;
    }

    public String toString() {
        return S.f(this, super.toString());
    }

    void y() {
        u(a.e.API_PRIORITY_OTHER);
    }

    int z() {
        return b0.a().d(this).b(this);
    }
}
