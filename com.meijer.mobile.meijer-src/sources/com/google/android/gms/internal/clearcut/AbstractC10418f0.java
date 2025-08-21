package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC10418f0;
import com.google.android.gms.internal.clearcut.AbstractC10418f0.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.clearcut.f0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10418f0<MessageType extends AbstractC10418f0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC10450q<MessageType, BuilderType> {
    private static Map<Object, AbstractC10418f0<?, ?>> zzjr = new ConcurrentHashMap();
    protected C10457s1 zzjp = C10457s1.h();
    private int zzjq = -1;

    /* renamed from: com.google.android.gms.internal.clearcut.f0$a */
    public static abstract class a<MessageType extends AbstractC10418f0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends r<MessageType, BuilderType> {

        /* renamed from: a, reason: collision with root package name */
        private final MessageType f82268a;

        /* renamed from: b, reason: collision with root package name */
        protected MessageType f82269b;

        /* renamed from: c, reason: collision with root package name */
        protected boolean f82270c = false;

        protected a(MessageType messagetype) {
            this.f82268a = messagetype;
            this.f82269b = (MessageType) messagetype.f(e.f82277d, null, null);
        }

        private static void e(MessageType messagetype, MessageType messagetype2) {
            V0.a().d(messagetype).f(messagetype, messagetype2);
        }

        @Override // com.google.android.gms.internal.clearcut.L0
        public final /* synthetic */ J0 b() {
            return this.f82268a;
        }

        @Override // com.google.android.gms.internal.clearcut.K0
        public final /* synthetic */ J0 b0() {
            AbstractC10418f0 abstractC10418f0 = (AbstractC10418f0) I0();
            byte bByteValue = ((Byte) abstractC10418f0.f(e.f82274a, null, null)).byteValue();
            boolean zE = true;
            if (bByteValue != 1) {
                if (bByteValue == 0) {
                    zE = false;
                } else {
                    zE = V0.a().d(abstractC10418f0).e(abstractC10418f0);
                    abstractC10418f0.f(e.f82275b, zE ? abstractC10418f0 : null, null);
                }
            }
            if (zE) {
                return abstractC10418f0;
            }
            throw new zzew(abstractC10418f0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            a aVar = (a) this.f82268a.f(e.f82278e, null, null);
            aVar.c((AbstractC10418f0) I0());
            return aVar;
        }

        @Override // com.google.android.gms.internal.clearcut.r
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final BuilderType c(MessageType messagetype) {
            f();
            e(this.f82269b, messagetype);
            return this;
        }

        protected void f() {
            if (this.f82270c) {
                MessageType messagetype = (MessageType) this.f82269b.f(e.f82277d, null, null);
                e(messagetype, this.f82269b);
                this.f82269b = messagetype;
                this.f82270c = false;
            }
        }

        @Override // com.google.android.gms.internal.clearcut.K0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public MessageType I0() {
            if (this.f82270c) {
                return this.f82269b;
            }
            MessageType messagetype = this.f82269b;
            V0.a().d(messagetype).zzc(messagetype);
            this.f82270c = true;
            return this.f82269b;
        }

        public final MessageType m() {
            MessageType messagetype = (MessageType) I0();
            byte bByteValue = ((Byte) messagetype.f(e.f82274a, null, null)).byteValue();
            boolean zE = true;
            if (bByteValue != 1) {
                if (bByteValue == 0) {
                    zE = false;
                } else {
                    zE = V0.a().d(messagetype).e(messagetype);
                    messagetype.f(e.f82275b, zE ? messagetype : null, null);
                }
            }
            if (zE) {
                return messagetype;
            }
            throw new zzew(messagetype);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.f0$b */
    public static class b<T extends AbstractC10418f0<T, ?>> extends C10455s<T> {

        /* renamed from: b, reason: collision with root package name */
        private T f82271b;

        public b(T t10) {
            this.f82271b = t10;
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.f0$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends AbstractC10418f0<MessageType, BuilderType> implements L0 {
        protected W<d> zzjv = W.k();
    }

    /* renamed from: com.google.android.gms.internal.clearcut.f0$d */
    static final class d implements Z<d> {

        /* renamed from: a, reason: collision with root package name */
        final int f82272a;

        /* renamed from: b, reason: collision with root package name */
        final G1 f82273b;

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            return this.f82272a - ((d) obj).f82272a;
        }

        @Override // com.google.android.gms.internal.clearcut.Z
        public final L1 q() {
            return this.f82273b.a();
        }

        @Override // com.google.android.gms.internal.clearcut.Z
        public final boolean s() {
            return false;
        }

        @Override // com.google.android.gms.internal.clearcut.Z
        public final P0 v(P0 p02, P0 p03) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.clearcut.Z
        public final K0 y(K0 k02, J0 j02) {
            return ((a) k02).c((AbstractC10418f0) j02);
        }

        @Override // com.google.android.gms.internal.clearcut.Z
        public final G1 zzau() {
            return this.f82273b;
        }

        @Override // com.google.android.gms.internal.clearcut.Z
        public final boolean zzax() {
            return false;
        }

        @Override // com.google.android.gms.internal.clearcut.Z
        public final int zzc() {
            return this.f82272a;
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.f0$e */
    public enum e {

        /* renamed from: a, reason: collision with root package name */
        public static final int f82274a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f82275b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f82276c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f82277d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f82278e = 5;

        /* renamed from: f, reason: collision with root package name */
        public static final int f82279f = 6;

        /* renamed from: g, reason: collision with root package name */
        public static final int f82280g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ int[] f82281h = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: i, reason: collision with root package name */
        public static final int f82282i = 1;

        /* renamed from: j, reason: collision with root package name */
        public static final int f82283j = 2;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ int[] f82284k = {1, 2};

        /* renamed from: l, reason: collision with root package name */
        public static final int f82285l = 1;

        /* renamed from: m, reason: collision with root package name */
        public static final int f82286m = 2;

        /* renamed from: n, reason: collision with root package name */
        private static final /* synthetic */ int[] f82287n = {1, 2};

        public static int[] a() {
            return (int[]) f82281h.clone();
        }
    }

    private static <T extends AbstractC10418f0<T, ?>> T e(T t10, byte[] bArr) throws zzco {
        T t11 = (T) t10.f(e.f82277d, null, null);
        try {
            V0.a().d(t11).h(t11, bArr, 0, bArr.length, new C10467w());
            V0.a().d(t11).zzc(t11);
            if (t11.zzex == 0) {
                return t11;
            }
            throw new RuntimeException();
        } catch (IOException e10) {
            if (e10.getCause() instanceof zzco) {
                throw ((zzco) e10.getCause());
            }
            throw new zzco(e10.getMessage()).f(t11);
        } catch (IndexOutOfBoundsException unused) {
            throw zzco.a().f(t11);
        }
    }

    protected static Object g(J0 j02, String str, Object[] objArr) {
        return new X0(j02, str, objArr);
    }

    static Object h(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static <T extends AbstractC10418f0<?, ?>> void m(Class<T> cls, T t10) {
        zzjr.put(cls, t10);
    }

    protected static <T extends AbstractC10418f0<T, ?>> T n(T t10, byte[] bArr) throws zzco {
        T t11 = (T) e(t10, bArr);
        if (t11 != null) {
            byte bByteValue = ((Byte) t11.f(e.f82274a, null, null)).byteValue();
            boolean zE = true;
            if (bByteValue != 1) {
                if (bByteValue == 0) {
                    zE = false;
                } else {
                    zE = V0.a().d(t11).e(t11);
                    t11.f(e.f82275b, zE ? t11 : null, null);
                }
            }
            if (!zE) {
                throw new zzco(new zzew(t11).getMessage()).f(t11);
            }
        }
        return t11;
    }

    protected static <E> InterfaceC10433k0<E> o() {
        return W0.e();
    }

    static <T extends AbstractC10418f0<?, ?>> T p(Class<T> cls) throws ClassNotFoundException {
        T t10 = (T) zzjr.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (T) zzjr.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 != null) {
            return t10;
        }
        String name = cls.getName();
        throw new IllegalStateException(name.length() != 0 ? "Unable to get default instance for: ".concat(name) : new String("Unable to get default instance for: "));
    }

    @Override // com.google.android.gms.internal.clearcut.L0
    public final boolean a() {
        byte bByteValue = ((Byte) f(e.f82274a, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zE = V0.a().d(this).e(this);
        f(e.f82275b, zE ? this : null, null);
        return zE;
    }

    @Override // com.google.android.gms.internal.clearcut.L0
    public final /* synthetic */ J0 b() {
        return (AbstractC10418f0) f(e.f82279f, null, null);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10450q
    final void c(int i10) {
        this.zzjq = i10;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10450q
    final int d() {
        return this.zzjq;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((AbstractC10418f0) f(e.f82279f, null, null)).getClass().isInstance(obj)) {
            return V0.a().d(this).c(this, (AbstractC10418f0) obj);
        }
        return false;
    }

    protected abstract Object f(int i10, Object obj, Object obj2);

    public int hashCode() {
        int i10 = this.zzex;
        if (i10 != 0) {
            return i10;
        }
        int iB = V0.a().d(this).b(this);
        this.zzex = iB;
        return iB;
    }

    @Override // com.google.android.gms.internal.clearcut.J0
    public final int i() {
        if (this.zzjq == -1) {
            this.zzjq = V0.a().d(this).g(this);
        }
        return this.zzjq;
    }

    @Override // com.google.android.gms.internal.clearcut.J0
    public final /* synthetic */ K0 j() {
        a aVar = (a) f(e.f82278e, null, null);
        aVar.c(this);
        return aVar;
    }

    @Override // com.google.android.gms.internal.clearcut.J0
    public final void k(zzbn zzbnVar) throws IOException {
        V0.a().b(getClass()).a(this, N.j(zzbnVar));
    }

    @Override // com.google.android.gms.internal.clearcut.J0
    public final /* synthetic */ K0 l() {
        return (a) f(e.f82278e, null, null);
    }

    public String toString() {
        return M0.a(this, super.toString());
    }
}
