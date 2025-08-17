package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;
import com.google.android.gms.internal.vision.O0.b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public abstract class O0<MessageType extends O0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends X<MessageType, BuilderType> {
    private static Map<Object, O0<?, ?>> zzd = new ConcurrentHashMap();
    protected C11038h2 zzb = C11038h2.a();
    private int zzc = -1;

    public static abstract class b<MessageType extends O0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends W<MessageType, BuilderType> {

        /* renamed from: a, reason: collision with root package name */
        private final MessageType f84405a;

        /* renamed from: b, reason: collision with root package name */
        protected MessageType f84406b;

        /* renamed from: c, reason: collision with root package name */
        protected boolean f84407c = false;

        @Override // com.google.android.gms.internal.vision.W
        public final /* synthetic */ W c(byte[] bArr, int i10, int i11, A0 a02) throws zzjk {
            return f(bArr, 0, i11, a02);
        }

        private final BuilderType f(byte[] bArr, int i10, int i11, A0 a02) throws zzjk {
            if (this.f84407c) {
                g();
                this.f84407c = false;
            }
            try {
                J1.a().c(this.f84406b).d(this.f84406b, bArr, 0, i11, new C11020d0(a02));
                return this;
            } catch (zzjk e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            } catch (IndexOutOfBoundsException unused) {
                throw zzjk.a();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            b bVar = (b) this.f84405a.h(f.f84417e, null, null);
            bVar.b((O0) zze());
            return bVar;
        }

        @Override // com.google.android.gms.internal.vision.W
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final BuilderType b(MessageType messagetype) {
            if (this.f84407c) {
                g();
                this.f84407c = false;
            }
            e(this.f84406b, messagetype);
            return this;
        }

        protected void g() {
            MessageType messagetype = (MessageType) this.f84406b.h(f.f84416d, null, null);
            e(messagetype, this.f84406b);
            this.f84406b = messagetype;
        }

        @Override // com.google.android.gms.internal.vision.InterfaceC11092z1
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public MessageType zze() {
            if (this.f84407c) {
                return this.f84406b;
            }
            MessageType messagetype = this.f84406b;
            J1.a().c(messagetype).zzc(messagetype);
            this.f84407c = true;
            return this.f84406b;
        }

        @Override // com.google.android.gms.internal.vision.InterfaceC11089y1
        public final /* synthetic */ InterfaceC11083w1 zzr() {
            return this.f84405a;
        }

        protected b(MessageType messagetype) {
            this.f84405a = messagetype;
            this.f84406b = (MessageType) messagetype.h(f.f84416d, null, null);
        }

        private static void e(MessageType messagetype, MessageType messagetype2) {
            J1.a().c(messagetype).zzb(messagetype, messagetype2);
        }

        @Override // com.google.android.gms.internal.vision.InterfaceC11092z1
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public final MessageType zzf() {
            MessageType messagetype = (MessageType) zze();
            if (messagetype.zzk()) {
                return messagetype;
            }
            throw new zzlv(messagetype);
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends O0<MessageType, BuilderType> implements InterfaceC11089y1 {
        protected G0<e> zzc = G0.c();

        final G0<e> p() {
            if (this.zzc.n()) {
                this.zzc = (G0) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public static class d<ContainingType extends InterfaceC11083w1, Type> extends C11088y0<ContainingType, Type> {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC11083w1 f84408a;

        /* renamed from: b, reason: collision with root package name */
        final e f84409b;
    }

    static final class e implements I0<e> {

        /* renamed from: a, reason: collision with root package name */
        final int f84410a;

        /* renamed from: b, reason: collision with root package name */
        final w2 f84411b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f84412c;

        @Override // com.google.android.gms.internal.vision.I0
        public final boolean zze() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.vision.I0
        public final InterfaceC11092z1 A(InterfaceC11092z1 interfaceC11092z1, InterfaceC11083w1 interfaceC11083w1) {
            return ((b) interfaceC11092z1).b((O0) interfaceC11083w1);
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            return this.f84410a - ((e) obj).f84410a;
        }

        @Override // com.google.android.gms.internal.vision.I0
        public final E1 n(E1 e12, E1 e13) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.gms.internal.vision.I0
        public final int zza() {
            return this.f84410a;
        }

        @Override // com.google.android.gms.internal.vision.I0
        public final w2 zzb() {
            return this.f84411b;
        }

        @Override // com.google.android.gms.internal.vision.I0
        public final z2 zzc() {
            return this.f84411b.a();
        }

        @Override // com.google.android.gms.internal.vision.I0
        public final boolean zzd() {
            return this.f84412c;
        }
    }

    public enum f {

        /* renamed from: a, reason: collision with root package name */
        public static final int f84413a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f84414b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f84415c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f84416d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f84417e = 5;

        /* renamed from: f, reason: collision with root package name */
        public static final int f84418f = 6;

        /* renamed from: g, reason: collision with root package name */
        public static final int f84419g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ int[] f84420h = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) f84420h.clone();
        }
    }

    protected abstract Object h(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.vision.InterfaceC11089y1
    public final boolean zzk() {
        return l(this, true);
    }

    protected static class a<T extends O0<T, ?>> extends Y<T> {

        /* renamed from: b, reason: collision with root package name */
        private final T f84404b;

        public a(T t10) {
            this.f84404b = t10;
        }
    }

    static <T extends O0<?, ?>> T f(Class<T> cls) throws ClassNotFoundException {
        T t10 = (T) zzd.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (T) zzd.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 != null) {
            return t10;
        }
        T t11 = (T) ((O0) l2.c(cls)).h(f.f84418f, null, null);
        if (t11 == null) {
            throw new IllegalStateException();
        }
        zzd.put(cls, t11);
        return t11;
    }

    protected static Object i(InterfaceC11083w1 interfaceC11083w1, String str, Object[] objArr) {
        return new M1(interfaceC11083w1, str, objArr);
    }

    protected static <T extends O0<?, ?>> void k(Class<T> cls, T t10) {
        zzd.put(cls, t10);
    }

    protected static final <T extends O0<T, ?>> boolean l(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.h(f.f84413a, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zA = J1.a().c(t10).a(t10);
        if (z10) {
            t10.h(f.f84414b, zA ? t10 : null, null);
        }
        return zA;
    }

    @Override // com.google.android.gms.internal.vision.X
    final void c(int i10) {
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.vision.X
    final int e() {
        return this.zzc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return J1.a().c(this).b(this, (O0) obj);
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iZza = J1.a().c(this).zza(this);
        this.zza = iZza;
        return iZza;
    }

    protected final <MessageType extends O0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType m() {
        return (BuilderType) h(f.f84417e, null, null);
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11083w1
    public final int zzm() {
        if (this.zzc == -1) {
            this.zzc = J1.a().c(this).zzb(this);
        }
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11083w1
    public final /* synthetic */ InterfaceC11092z1 zzp() {
        b bVar = (b) h(f.f84417e, null, null);
        bVar.b(this);
        return bVar;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11083w1
    public final /* synthetic */ InterfaceC11092z1 zzq() {
        return (b) h(f.f84417e, null, null);
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11089y1
    public final /* synthetic */ InterfaceC11083w1 zzr() {
        return (O0) h(f.f84418f, null, null);
    }

    protected static <E> X0<E> g(X0<E> x02) {
        int i10;
        int size = x02.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size << 1;
        }
        return x02.zza(i10);
    }

    static Object j(Method method, Object obj, Object... objArr) {
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

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.vision.Q0, com.google.android.gms.internal.vision.W0] */
    protected static W0 n() {
        return Q0.h();
    }

    protected static <E> X0<E> o() {
        return N1.h();
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11083w1
    public final void a(zzii zziiVar) throws IOException {
        J1.a().c(this).c(this, C11085x0.D(zziiVar));
    }

    public String toString() {
        return B1.a(this, super.toString());
    }
}
