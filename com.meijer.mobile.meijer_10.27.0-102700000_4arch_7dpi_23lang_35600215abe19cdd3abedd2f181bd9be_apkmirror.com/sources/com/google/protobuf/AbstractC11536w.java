package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.AbstractC11515a;
import com.google.protobuf.AbstractC11536w;
import com.google.protobuf.AbstractC11536w.a;
import com.google.protobuf.C11532s;
import com.google.protobuf.C11538y;
import com.google.protobuf.P;
import com.google.protobuf.r0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC11536w<MessageType extends AbstractC11536w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC11515a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC11536w<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected m0 unknownFields = m0.c();

    /* renamed from: com.google.protobuf.w$a */
    public static abstract class a<MessageType extends AbstractC11536w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC11515a.AbstractC1296a<MessageType, BuilderType> {

        /* renamed from: a, reason: collision with root package name */
        private final MessageType f90735a;

        /* renamed from: b, reason: collision with root package name */
        protected MessageType f90736b;

        private MessageType F() {
            return (MessageType) this.f90735a.U();
        }

        @Override // com.google.protobuf.Q
        public final boolean a() {
            return AbstractC11536w.M(this.f90736b, false);
        }

        @Override // com.google.protobuf.P.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public MessageType h() {
            if (!this.f90736b.N()) {
                return this.f90736b;
            }
            this.f90736b.O();
            return this.f90736b;
        }

        protected final void x() {
            if (this.f90736b.N()) {
                return;
            }
            y();
        }

        @Override // com.google.protobuf.Q
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public MessageType e() {
            return this.f90735a;
        }

        protected a(MessageType messagetype) {
            this.f90735a = messagetype;
            if (!messagetype.N()) {
                this.f90736b = (MessageType) F();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private static <MessageType> void E(MessageType messagetype, MessageType messagetype2) {
            b0.a().d(messagetype).a(messagetype, messagetype2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC11515a.AbstractC1296a
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public BuilderType r(MessageType messagetype) {
            return (BuilderType) D(messagetype);
        }

        @Override // com.google.protobuf.P.a
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public BuilderType d1(AbstractC11522h abstractC11522h, C11528n c11528n) throws IOException {
            x();
            try {
                b0.a().d(this.f90736b).i(this.f90736b, C11523i.Q(abstractC11522h), c11528n);
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
            E(this.f90736b, messagetype);
            return this;
        }

        @Override // com.google.protobuf.P.a
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) h();
            if (messagetype.a()) {
                return messagetype;
            }
            throw AbstractC11515a.AbstractC1296a.t(messagetype);
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) e().d();
            buildertype.f90736b = (MessageType) h();
            return buildertype;
        }

        protected void y() {
            MessageType messagetype = (MessageType) F();
            E(messagetype, this.f90736b);
            this.f90736b = messagetype;
        }
    }

    /* renamed from: com.google.protobuf.w$b */
    protected static class b<T extends AbstractC11536w<T, ?>> extends AbstractC11516b<T> {

        /* renamed from: b, reason: collision with root package name */
        private final T f90737b;

        @Override // com.google.protobuf.Y
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public T b(AbstractC11522h abstractC11522h, C11528n c11528n) throws InvalidProtocolBufferException {
            return (T) AbstractC11536w.V(this.f90737b, abstractC11522h, c11528n);
        }

        public b(T t10) {
            this.f90737b = t10;
        }
    }

    /* renamed from: com.google.protobuf.w$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends AbstractC11536w<MessageType, BuilderType> implements Q {
        protected C11532s<d> extensions = C11532s.h();

        C11532s<d> Z() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // com.google.protobuf.AbstractC11536w, com.google.protobuf.P
        public /* bridge */ /* synthetic */ P.a b() {
            return super.b();
        }

        @Override // com.google.protobuf.AbstractC11536w, com.google.protobuf.P
        public /* bridge */ /* synthetic */ P.a d() {
            return super.d();
        }

        @Override // com.google.protobuf.AbstractC11536w, com.google.protobuf.Q
        public /* bridge */ /* synthetic */ P e() {
            return super.e();
        }
    }

    /* renamed from: com.google.protobuf.w$d */
    static final class d implements C11532s.b<d> {

        /* renamed from: a, reason: collision with root package name */
        final C11538y.d<?> f90738a;

        /* renamed from: b, reason: collision with root package name */
        final int f90739b;

        /* renamed from: c, reason: collision with root package name */
        final r0.b f90740c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f90741d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f90742e;

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f90739b - dVar.f90739b;
        }

        public C11538y.d<?> b() {
            return this.f90738a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.C11532s.b
        public P.a c(P.a aVar, P p10) {
            return ((a) aVar).D((AbstractC11536w) p10);
        }

        @Override // com.google.protobuf.C11532s.b
        public int g() {
            return this.f90739b;
        }

        @Override // com.google.protobuf.C11532s.b
        public boolean h() {
            return this.f90741d;
        }

        @Override // com.google.protobuf.C11532s.b
        public r0.b i() {
            return this.f90740c;
        }

        @Override // com.google.protobuf.C11532s.b
        public r0.c j() {
            return this.f90740c.a();
        }

        @Override // com.google.protobuf.C11532s.b
        public boolean k() {
            return this.f90742e;
        }
    }

    /* renamed from: com.google.protobuf.w$e */
    public static class e<ContainingType extends P, Type> extends AbstractC11526l<ContainingType, Type> {

        /* renamed from: a, reason: collision with root package name */
        final P f90743a;

        /* renamed from: b, reason: collision with root package name */
        final d f90744b;

        public r0.b a() {
            return this.f90744b.i();
        }

        public P b() {
            return this.f90743a;
        }

        public int c() {
            return this.f90744b.g();
        }

        public boolean d() {
            return this.f90744b.f90741d;
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

    static <T extends AbstractC11536w<?, ?>> T H(Class<T> cls) throws ClassNotFoundException {
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
        T t11 = (T) ((AbstractC11536w) p0.k(cls)).e();
        if (t11 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t11);
        return t11;
    }

    protected static final <T extends AbstractC11536w<T, ?>> boolean M(T t10, boolean z10) {
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

    protected final <MessageType extends AbstractC11536w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType B() {
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
            return b0.a().d(this).c(this, (AbstractC11536w) obj);
        }
        return false;
    }

    @Override // com.google.protobuf.P
    public final Y<MessageType> f() {
        return (Y) C(f.GET_PARSER);
    }

    @Override // com.google.protobuf.AbstractC11515a
    int q() {
        return this.memoizedSerializedSize & a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.protobuf.AbstractC11515a
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

    protected static C11538y.g F() {
        return C11537x.k();
    }

    protected static <E> C11538y.i<E> G() {
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
    protected static C11538y.g Q(C11538y.g gVar) {
        int i10;
        int size = gVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size * 2;
        }
        return gVar.b2(i10);
    }

    protected static <E> C11538y.i<E> R(C11538y.i<E> iVar) {
        int i10;
        int size = iVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size * 2;
        }
        return iVar.b2(i10);
    }

    static <T extends AbstractC11536w<T, ?>> T V(T t10, AbstractC11522h abstractC11522h, C11528n c11528n) throws InvalidProtocolBufferException {
        T t11 = (T) t10.U();
        try {
            f0 f0VarD = b0.a().d(t11);
            f0VarD.i(t11, C11523i.Q(abstractC11522h), c11528n);
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

    protected static <T extends AbstractC11536w<?, ?>> void W(Class<T> cls, T t10) {
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
        b0.a().d(this).h(this, C11524j.P(codedOutputStream));
    }

    @Override // com.google.protobuf.AbstractC11515a
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
