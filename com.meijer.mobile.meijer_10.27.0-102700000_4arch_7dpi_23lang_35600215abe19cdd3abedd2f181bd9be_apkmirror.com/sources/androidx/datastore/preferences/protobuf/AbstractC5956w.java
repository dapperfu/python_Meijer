package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC5935a;
import androidx.datastore.preferences.protobuf.AbstractC5956w;
import androidx.datastore.preferences.protobuf.AbstractC5956w.a;
import androidx.datastore.preferences.protobuf.C5952s;
import androidx.datastore.preferences.protobuf.C5958y;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.q0;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5956w<MessageType extends AbstractC5956w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC5935a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC5956w<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected m0 unknownFields = m0.c();

    /* renamed from: androidx.datastore.preferences.protobuf.w$a */
    public static abstract class a<MessageType extends AbstractC5956w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC5935a.AbstractC1102a<MessageType, BuilderType> {

        /* renamed from: a, reason: collision with root package name */
        private final MessageType f54461a;

        /* renamed from: b, reason: collision with root package name */
        protected MessageType f54462b;

        private MessageType y() {
            return (MessageType) this.f54461a.N();
        }

        @Override // androidx.datastore.preferences.protobuf.Q
        public final boolean a() {
            return AbstractC5956w.G(this.f54462b, false);
        }

        @Override // androidx.datastore.preferences.protobuf.P.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public MessageType h() {
            if (!this.f54462b.H()) {
                return this.f54462b;
            }
            this.f54462b.I();
            return this.f54462b;
        }

        protected final void r() {
            if (this.f54462b.H()) {
                return;
            }
            s();
        }

        @Override // androidx.datastore.preferences.protobuf.Q
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public MessageType e() {
            return this.f54461a;
        }

        protected a(MessageType messagetype) {
            this.f54461a = messagetype;
            if (!messagetype.H()) {
                this.f54462b = (MessageType) y();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private static <MessageType> void x(MessageType messagetype, MessageType messagetype2) {
            b0.a().d(messagetype).a(messagetype, messagetype2);
        }

        @Override // androidx.datastore.preferences.protobuf.P.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) h();
            if (messagetype.a()) {
                return messagetype;
            }
            throw AbstractC5935a.AbstractC1102a.n(messagetype);
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) e().d();
            buildertype.f54462b = (MessageType) h();
            return buildertype;
        }

        protected void s() {
            MessageType messagetype = (MessageType) y();
            x(messagetype, this.f54462b);
            this.f54462b = messagetype;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.datastore.preferences.protobuf.AbstractC5935a.AbstractC1102a
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public BuilderType l(MessageType messagetype) {
            return (BuilderType) w(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.P.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public BuilderType i1(AbstractC5942h abstractC5942h, C5948n c5948n) throws IOException {
            r();
            try {
                b0.a().d(this.f54462b).h(this.f54462b, C5943i.Q(abstractC5942h), c5948n);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        public BuilderType w(MessageType messagetype) {
            if (e().equals(messagetype)) {
                return this;
            }
            r();
            x(this.f54462b, messagetype);
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$b */
    protected static class b<T extends AbstractC5956w<T, ?>> extends AbstractC5936b<T> {

        /* renamed from: b, reason: collision with root package name */
        private final T f54463b;

        @Override // androidx.datastore.preferences.protobuf.Y
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public T b(AbstractC5942h abstractC5942h, C5948n c5948n) throws InvalidProtocolBufferException {
            return (T) AbstractC5956w.P(this.f54463b, abstractC5942h, c5948n);
        }

        public b(T t10) {
            this.f54463b = t10;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends AbstractC5956w<MessageType, BuilderType> implements Q {
        protected C5952s<d> extensions = C5952s.h();

        C5952s<d> U() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5956w, androidx.datastore.preferences.protobuf.P
        public /* bridge */ /* synthetic */ P.a b() {
            return super.b();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5956w, androidx.datastore.preferences.protobuf.P
        public /* bridge */ /* synthetic */ P.a d() {
            return super.d();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5956w, androidx.datastore.preferences.protobuf.Q
        public /* bridge */ /* synthetic */ P e() {
            return super.e();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$d */
    static final class d implements C5952s.b<d> {

        /* renamed from: a, reason: collision with root package name */
        final int f54464a;

        /* renamed from: b, reason: collision with root package name */
        final q0.b f54465b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f54466c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f54467d;

        public C5958y.d<?> b() {
            return null;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f54464a - dVar.f54464a;
        }

        @Override // androidx.datastore.preferences.protobuf.C5952s.b
        public int g() {
            return this.f54464a;
        }

        @Override // androidx.datastore.preferences.protobuf.C5952s.b
        public boolean h() {
            return this.f54466c;
        }

        @Override // androidx.datastore.preferences.protobuf.C5952s.b
        public q0.b i() {
            return this.f54465b;
        }

        @Override // androidx.datastore.preferences.protobuf.C5952s.b
        public q0.c j() {
            return this.f54465b.a();
        }

        @Override // androidx.datastore.preferences.protobuf.C5952s.b
        public boolean k() {
            return this.f54467d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.C5952s.b
        public P.a r(P.a aVar, P p10) {
            return ((a) aVar).w((AbstractC5956w) p10);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$e */
    public static class e<ContainingType extends P, Type> extends AbstractC5946l<ContainingType, Type> {

        /* renamed from: a, reason: collision with root package name */
        final P f54468a;

        /* renamed from: b, reason: collision with root package name */
        final d f54469b;

        public q0.b a() {
            return this.f54469b.i();
        }

        public P b() {
            return this.f54468a;
        }

        public int c() {
            return this.f54469b.g();
        }

        public boolean d() {
            return this.f54469b.f54466c;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$f */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    @Override // androidx.datastore.preferences.protobuf.Q
    public final boolean a() {
        return G(this, true);
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public int c() {
        return l(null);
    }

    void s() {
        this.memoizedHashCode = 0;
    }

    protected Object x(f fVar) {
        return z(fVar, null, null);
    }

    protected Object y(f fVar, Object obj) {
        return z(fVar, obj, null);
    }

    protected abstract Object z(f fVar, Object obj, Object obj2);

    static <T extends AbstractC5956w<?, ?>> T B(Class<T> cls) throws ClassNotFoundException {
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
        T t11 = (T) ((AbstractC5956w) o0.i(cls)).e();
        if (t11 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t11);
        return t11;
    }

    protected static final <T extends AbstractC5956w<T, ?>> boolean G(T t10, boolean z10) {
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

    protected static Object M(P p10, String str, Object[] objArr) {
        return new d0(p10, str, objArr);
    }

    private static <T extends AbstractC5956w<T, ?>> T r(T t10) throws InvalidProtocolBufferException {
        if (t10 == null || t10.a()) {
            return t10;
        }
        throw t10.n().a().k(t10);
    }

    private int v(f0<?> f0Var) {
        return f0Var == null ? b0.a().d(this).g(this) : f0Var.g(this);
    }

    @Override // androidx.datastore.preferences.protobuf.Q
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

    @Override // androidx.datastore.preferences.protobuf.P
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final BuilderType d() {
        return (BuilderType) x(f.NEW_BUILDER);
    }

    MessageType N() {
        return (MessageType) x(f.NEW_MUTABLE_INSTANCE);
    }

    void R(int i10) {
        this.memoizedHashCode = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.P
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final BuilderType b() {
        return (BuilderType) ((a) x(f.NEW_BUILDER)).w(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return b0.a().d(this).c(this, (AbstractC5956w) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public final Y<MessageType> f() {
        return (Y) x(f.GET_PARSER);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5935a
    int k() {
        return this.memoizedSerializedSize & a.e.API_PRIORITY_OTHER;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5935a
    void o(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & a.e.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    Object q() throws Exception {
        return x(f.BUILD_MESSAGE_INFO);
    }

    protected final <MessageType extends AbstractC5956w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType w() {
        return (BuilderType) x(f.NEW_BUILDER);
    }

    protected static <E> C5958y.i<E> A() {
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

    protected static <E> C5958y.i<E> K(C5958y.i<E> iVar) {
        int i10;
        int size = iVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size * 2;
        }
        return iVar.b(i10);
    }

    protected static <T extends AbstractC5956w<T, ?>> T O(T t10, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) r(P(t10, AbstractC5942h.g(inputStream), C5948n.b()));
    }

    static <T extends AbstractC5956w<T, ?>> T P(T t10, AbstractC5942h abstractC5942h, C5948n c5948n) throws InvalidProtocolBufferException {
        T t11 = (T) t10.N();
        try {
            f0 f0VarD = b0.a().d(t11);
            f0VarD.h(t11, C5943i.Q(abstractC5942h), c5948n);
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

    protected static <T extends AbstractC5956w<?, ?>> void Q(Class<T> cls, T t10) {
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
            return u();
        }
        if (E()) {
            R(u());
        }
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public void i(CodedOutputStream codedOutputStream) throws IOException {
        b0.a().d(this).i(this, C5944j.P(codedOutputStream));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5935a
    int l(f0 f0Var) {
        if (H()) {
            int iV = v(f0Var);
            if (iV >= 0) {
                return iV;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iV);
        }
        if (k() != Integer.MAX_VALUE) {
            return k();
        }
        int iV2 = v(f0Var);
        o(iV2);
        return iV2;
    }

    void t() {
        o(a.e.API_PRIORITY_OTHER);
    }

    public String toString() {
        return S.f(this, super.toString());
    }

    int u() {
        return b0.a().d(this).b(this);
    }
}
