package S6;

import S6.i;
import S6.j;
import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.repackaged.dslplatform.json.ConfigurationException;
import com.bugsnag.android.repackaged.dslplatform.json.SerializationException;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public class e<TContext> implements r, p {

    /* renamed from: E, reason: collision with root package name */
    private static final Charset f33255E = Charset.forName("UTF-8");

    /* renamed from: F, reason: collision with root package name */
    private static final Object f33256F = new Object();

    /* renamed from: G, reason: collision with root package name */
    private static final Iterator f33257G = new d();

    /* renamed from: H, reason: collision with root package name */
    private static final j.a f33258H = new h();

    /* renamed from: I, reason: collision with root package name */
    private static final byte[] f33259I = {110, 117, 108, 108};

    /* renamed from: A, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, Class<?>> f33260A;

    /* renamed from: B, reason: collision with root package name */
    private final j.a<S6.h> f33261B;

    /* renamed from: C, reason: collision with root package name */
    private final j.a f33262C;

    /* renamed from: D, reason: collision with root package name */
    private final j.a f33263D;

    /* renamed from: a, reason: collision with root package name */
    public final TContext f33264a;

    /* renamed from: b, reason: collision with root package name */
    protected final k<TContext> f33265b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33266c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f33267d;

    /* renamed from: e, reason: collision with root package name */
    protected final S6.n f33268e;

    /* renamed from: f, reason: collision with root package name */
    protected final S6.n f33269f;

    /* renamed from: g, reason: collision with root package name */
    protected final List<j<j.a>> f33270g;

    /* renamed from: h, reason: collision with root package name */
    private final int f33271h;

    /* renamed from: i, reason: collision with root package name */
    protected final List<j<i.f>> f33272i;

    /* renamed from: j, reason: collision with root package name */
    private final int f33273j;

    /* renamed from: k, reason: collision with root package name */
    protected final List<j<Object>> f33274k;

    /* renamed from: l, reason: collision with root package name */
    private final int f33275l;

    /* renamed from: m, reason: collision with root package name */
    private final i.d f33276m;

    /* renamed from: n, reason: collision with root package name */
    private final i.b f33277n;

    /* renamed from: o, reason: collision with root package name */
    private final i.g f33278o;

    /* renamed from: p, reason: collision with root package name */
    private final int f33279p;

    /* renamed from: q, reason: collision with root package name */
    private final int f33280q;

    /* renamed from: r, reason: collision with root package name */
    protected final ThreadLocal<S6.j> f33281r;

    /* renamed from: s, reason: collision with root package name */
    protected final ThreadLocal<S6.i> f33282s;

    /* renamed from: t, reason: collision with root package name */
    private final S6.f f33283t;

    /* renamed from: u, reason: collision with root package name */
    private final Map<Class<? extends Annotation>, Boolean> f33284u;

    /* renamed from: v, reason: collision with root package name */
    private final Map<Type, Object> f33285v;

    /* renamed from: w, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, i.e<S6.h>> f33286w;

    /* renamed from: x, reason: collision with root package name */
    private final ConcurrentMap<Type, i.f> f33287x;

    /* renamed from: y, reason: collision with root package name */
    private final ConcurrentMap<Type, Object> f33288y;

    /* renamed from: z, reason: collision with root package name */
    private final ConcurrentMap<Type, j.a> f33289z;

    class a extends ThreadLocal<S6.j> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f33290a;

        a(e eVar) {
            this.f33290a = eVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public S6.j initialValue() {
            return new S6.j(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, this.f33290a);
        }
    }

    class b extends ThreadLocal<S6.i> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f33292a;

        b(e eVar) {
            this.f33292a = eVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public S6.i initialValue() {
            byte[] bArr = new byte[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];
            e eVar = this.f33292a;
            return new S6.i(bArr, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, eVar.f33264a, new char[64], eVar.f33268e, eVar.f33269f, eVar, eVar.f33276m, this.f33292a.f33277n, this.f33292a.f33278o, this.f33292a.f33279p, this.f33292a.f33280q);
        }
    }

    class c implements j.a<Map> {
        c() {
        }

        @Override // S6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(S6.j jVar, Map map) throws IOException {
            if (map == null) {
                jVar.n();
                return;
            }
            try {
                e.this.z(map, jVar);
            } catch (IOException e10) {
                throw new SerializationException(e10);
            }
        }
    }

    /* renamed from: S6.e$e, reason: collision with other inner class name */
    class C0750e implements j.a<S6.h> {
        C0750e() {
        }

        @Override // S6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(S6.j jVar, S6.h hVar) throws IOException {
            if (hVar == null) {
                jVar.n();
            } else {
                hVar.a(jVar, e.this.f33266c);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class f<T> implements i.f<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i.e f33296a;

        f(i.e eVar) {
            this.f33296a = eVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (LS6/i;)TT; */
        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public S6.h a(S6.i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            if (iVar.n() == 123) {
                iVar.j();
                return this.f33296a.a(iVar);
            }
            throw iVar.p("Expecting '{' for object start");
        }
    }

    class g implements j.a {
        g() {
        }

        @Override // S6.j.a
        public void a(S6.j jVar, Object obj) throws IOException {
            e.this.w(jVar, (S6.h[]) obj);
        }
    }

    class h implements j.a {
        @Override // S6.j.a
        public void a(S6.j jVar, Object obj) throws IOException {
            o.a(new String((char[]) obj), jVar);
        }

        h() {
        }
    }

    class i implements j.a {
        i() {
        }

        @Override // S6.j.a
        public void a(S6.j jVar, Object obj) throws IOException {
            jVar.n();
        }
    }

    public interface j<T> {
        T a(Type type, e eVar);
    }

    public interface k<TContext> {
        void a(Object obj, OutputStream outputStream) throws IOException;

        Object b(TContext tcontext, Type type, InputStream inputStream) throws IOException;
    }

    public static class m<TContext> {

        /* renamed from: a, reason: collision with root package name */
        private TContext f33304a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f33305b;

        /* renamed from: c, reason: collision with root package name */
        private k<TContext> f33306c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f33307d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f33308e;

        /* renamed from: g, reason: collision with root package name */
        private S6.n f33310g;

        /* renamed from: h, reason: collision with root package name */
        private int f33311h;

        /* renamed from: f, reason: collision with root package name */
        private S6.n f33309f = new n();

        /* renamed from: i, reason: collision with root package name */
        private i.d f33312i = i.d.WITH_STACK_TRACE;

        /* renamed from: j, reason: collision with root package name */
        private i.b f33313j = i.b.DEFAULT;

        /* renamed from: k, reason: collision with root package name */
        private i.g f33314k = i.g.LONG_AND_BIGDECIMAL;

        /* renamed from: l, reason: collision with root package name */
        private int f33315l = 512;

        /* renamed from: m, reason: collision with root package name */
        private int f33316m = 134217728;

        /* renamed from: n, reason: collision with root package name */
        private final List<S6.d> f33317n = new ArrayList();

        /* renamed from: o, reason: collision with root package name */
        private final List<j<j.a>> f33318o = new ArrayList();

        /* renamed from: p, reason: collision with root package name */
        private final List<j<i.f>> f33319p = new ArrayList();

        /* renamed from: q, reason: collision with root package name */
        private final List<j<Object>> f33320q = new ArrayList();

        /* renamed from: r, reason: collision with root package name */
        private final Set<ClassLoader> f33321r = new HashSet();

        /* renamed from: s, reason: collision with root package name */
        private final Map<Class<? extends Annotation>, Boolean> f33322s = new HashMap();

        @Deprecated
        public m<TContext> t(k<TContext> kVar) {
            this.f33306c = kVar;
            return this;
        }
    }

    public static class n implements S6.n {

        /* renamed from: a, reason: collision with root package name */
        private final int f33323a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f33324b;

        public n() {
            this(10);
        }

        public n(int i10) {
            int i11 = 2;
            for (int i12 = 1; i12 < i10; i12++) {
                i11 *= 2;
            }
            this.f33323a = i11 - 1;
            this.f33324b = new String[i11];
        }

        private String b(int i10, char[] cArr, int i11) {
            String str = new String(cArr, 0, i11);
            this.f33324b[i10] = str;
            return str;
        }

        @Override // S6.n
        public String a(char[] cArr, int i10) {
            long j10 = -2128831035;
            for (int i11 = 0; i11 < i10; i11++) {
                j10 = (j10 ^ ((byte) cArr[i11])) * 16777619;
            }
            int i12 = ((int) j10) & this.f33323a;
            String str = this.f33324b[i12];
            if (str == null) {
                return b(i12, cArr, i10);
            }
            if (str.length() != i10) {
                return b(i12, cArr, i10);
            }
            for (int i13 = 0; i13 < str.length(); i13++) {
                if (str.charAt(i13) != cArr[i13]) {
                    return b(i12, cArr, i10);
                }
            }
            return str;
        }
    }

    protected final i.e<S6.h> n(Class<?> cls) throws IllegalAccessException, IllegalArgumentException {
        try {
            i.e<S6.h> eVarQ = this.f33286w.get(cls);
            if (eVarQ == null) {
                eVarQ = q(cls, null);
                if (eVarQ == null) {
                    try {
                        Object obj = cls.getField("Companion").get(null);
                        eVarQ = q(obj.getClass(), obj);
                    } catch (Exception unused) {
                        return null;
                    }
                }
                if (eVarQ != null) {
                    this.f33286w.putIfAbsent(cls, eVarQ);
                }
            }
            return eVarQ;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean y(S6.j r12, java.lang.reflect.Type r13, java.lang.Object r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S6.e.y(S6.j, java.lang.reflect.Type, java.lang.Object):boolean");
    }

    class d implements Iterator {
        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        d() {
        }
    }

    static class l extends InputStream implements InputStreamRetargetInterface {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f33300a;

        /* renamed from: b, reason: collision with root package name */
        private final InputStream f33301b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f33302c = true;

        /* renamed from: d, reason: collision with root package name */
        private int f33303d;

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f33302c) {
                int i10 = this.f33303d;
                byte[] bArr = this.f33300a;
                if (i10 < bArr.length) {
                    this.f33303d = i10 + 1;
                    return bArr[i10];
                }
                this.f33302c = false;
            }
            return this.f33301b.read();
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        l(byte[] bArr, InputStream inputStream) {
            this.f33300a = bArr;
            this.f33301b = inputStream;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            if (this.f33302c) {
                return super.read(bArr);
            }
            return this.f33301b.read(bArr);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            if (this.f33302c) {
                return super.read(bArr, i10, i11);
            }
            return this.f33301b.read(bArr, i10, i11);
        }
    }

    private <T> void f(Type type, ConcurrentMap<Type, T> concurrentMap) {
        Type typeL;
        if (type instanceof Class) {
            this.f33283t.b((Class) type, this);
            return;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            this.f33283t.b((Class) parameterizedType.getRawType(), this);
            for (Type type2 : parameterizedType.getActualTypeArguments()) {
                if (!concurrentMap.containsKey(type2) && (typeL = l(type2)) != type2 && !concurrentMap.containsKey(typeL)) {
                    f(typeL, concurrentMap);
                }
            }
        }
    }

    private <T extends S6.h> i.f<T> h(i.e<T> eVar) {
        return new f(eVar);
    }

    private static Type l(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return (wildcardType.getUpperBounds().length == 1 && wildcardType.getLowerBounds().length == 0) ? wildcardType.getUpperBounds()[0] : type;
    }

    private <T> T p(Type type, Type type2, List<j<T>> list, ConcurrentMap<Type, T> concurrentMap) {
        if (type2 instanceof Class) {
            this.f33283t.b((Class) type2, this);
            T t10 = concurrentMap.get(type2);
            if (t10 != null) {
                return t10;
            }
        } else if (type2 instanceof ParameterizedType) {
            f(type2, concurrentMap);
        }
        Iterator<j<T>> it = list.iterator();
        while (it.hasNext()) {
            T tA = it.next().a(type2, this);
            if (tA != null) {
                concurrentMap.putIfAbsent(type, tA);
                return tA;
            }
        }
        return null;
    }

    private i.e<S6.h> q(Class<?> cls, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        try {
            try {
                try {
                    objInvoke = cls.getField("JSON_READER").get(obj);
                } catch (Exception unused) {
                    objInvoke = cls.getMethod("JSON_READER", null).invoke(obj, null);
                }
            } catch (Exception unused2) {
                return null;
            }
        } catch (Exception unused3) {
            objInvoke = cls.getMethod("getJSON_READER", null).invoke(obj, null);
        }
        if (objInvoke instanceof i.e) {
            return (i.e) objInvoke;
        }
        return null;
    }

    static void s(e eVar) {
        eVar.t(Element.class, s.f33466a);
        eVar.u(Element.class, s.f33467b);
    }

    public i.f<?> B(Type type) {
        i.e<S6.h> eVarN;
        i.f<?> fVar;
        i.f<?> fVar2 = this.f33287x.get(type);
        if (fVar2 != null) {
            return fVar2;
        }
        Type typeL = l(type);
        if (typeL != type && (fVar = this.f33287x.get(typeL)) != null) {
            this.f33287x.putIfAbsent(type, fVar);
            return fVar;
        }
        if (typeL instanceof Class) {
            Class<?> cls = (Class) typeL;
            if (S6.h.class.isAssignableFrom(cls) && (eVarN = n(cls)) != null) {
                i.f fVarH = h(eVarN);
                this.f33287x.putIfAbsent(type, fVarH);
                return fVarH;
            }
        }
        return (i.f) p(type, typeL, this.f33272i, this.f33287x);
    }

    public j.a<?> D(Type type) {
        j.a<?> aVar;
        j.a<?> aVar2 = this.f33289z.get(type);
        if (aVar2 != null) {
            return aVar2;
        }
        Type typeL = l(type);
        if (typeL != type && (aVar = this.f33289z.get(typeL)) != null) {
            this.f33289z.putIfAbsent(type, aVar);
            return aVar;
        }
        boolean z10 = typeL instanceof Class;
        if (z10 && S6.h.class.isAssignableFrom((Class) typeL)) {
            this.f33289z.putIfAbsent(type, this.f33261B);
            return this.f33261B;
        }
        j.a<?> aVar3 = (j.a) p(type, typeL, this.f33270g, this.f33289z);
        if (aVar3 != null) {
            return aVar3;
        }
        if (!z10) {
            return null;
        }
        Class<?> cls = this.f33260A.get(typeL);
        if (cls != null) {
            return this.f33289z.get(cls);
        }
        Class<?> cls2 = (Class) typeL;
        ArrayList arrayList = new ArrayList();
        m(cls2, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Class<?> cls3 = (Class) it.next();
            j.a<?> aVar4 = this.f33289z.get(cls3);
            if (aVar4 == null) {
                aVar4 = (j.a) p(type, cls3, this.f33270g, this.f33289z);
            }
            if (aVar4 != null) {
                this.f33260A.putIfAbsent(cls2, cls3);
                return aVar4;
            }
        }
        return null;
    }

    protected IOException i(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        m(cls, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Class cls2 = (Class) it.next();
            if (this.f33287x.containsKey(cls2)) {
                if (cls2.equals(cls)) {
                    return new IOException("Reader for provided type: " + cls + " is disabled and fallback serialization is not registered (converter is registered as null).\nTry initializing system with custom fallback or don't register null for " + cls);
                }
                return new IOException("Unable to find reader for provided type: " + cls + " and fallback serialization is not registered.\nFound reader for: " + cls2 + " so try deserializing into that instead?\nAlternatively, try initializing system with custom fallback or register specified type using registerReader into " + getClass());
            }
        }
        return new IOException("Unable to find reader for provided type: " + cls + " and fallback serialization is not registered.\nTry initializing DslJson with custom fallback in case of unsupported objects or register specified type using registerReader into " + getClass());
    }

    public <TResult> TResult k(Class<TResult> cls, InputStream inputStream) throws IOException {
        if (cls == null) {
            throw new IllegalArgumentException("manifest can't be null");
        }
        if (inputStream == null) {
            throw new IllegalArgumentException("stream can't be null");
        }
        S6.i<TContext> iVarB = this.f33282s.get().B(inputStream);
        try {
            return (TResult) j(cls, iVarB, inputStream);
        } finally {
            iVarB.J();
        }
    }

    public <T> void r(Class<T> cls, T t10) {
        this.f33285v.put(cls, t10);
    }

    public <T, S extends T> void t(Class<T> cls, i.f<S> fVar) {
        if (fVar == null) {
            this.f33287x.remove(cls);
        } else {
            this.f33287x.put(cls, fVar);
        }
    }

    public <T> void u(Class<T> cls, j.a<T> aVar) {
        if (aVar == null) {
            this.f33260A.remove(cls);
            this.f33289z.remove(cls);
        } else {
            this.f33260A.put(cls, cls);
            this.f33289z.put(cls, aVar);
        }
    }

    public final void v(S6.j jVar, Object obj) throws IOException {
        if (jVar == null) {
            throw new IllegalArgumentException("writer can't be null");
        }
        if (obj == null) {
            jVar.n();
            return;
        }
        Class<?> cls = obj.getClass();
        if (y(jVar, cls, obj)) {
            return;
        }
        if (this.f33265b != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f33265b.a(obj, byteArrayOutputStream);
            jVar.j(byteArrayOutputStream.toByteArray());
        } else {
            throw new ConfigurationException("Unable to serialize provided object. Failed to find serializer for: " + cls);
        }
    }

    @Deprecated
    public <T extends S6.h> void w(S6.j jVar, T[] tArr) throws IOException {
        if (tArr == null) {
            jVar.n();
            return;
        }
        jVar.l((byte) 91);
        if (tArr.length != 0) {
            T t10 = tArr[0];
            if (t10 != null) {
                t10.a(jVar, this.f33266c);
            } else {
                jVar.n();
            }
            for (int i10 = 1; i10 < tArr.length; i10++) {
                jVar.l((byte) 44);
                T t11 = tArr[i10];
                if (t11 != null) {
                    t11.a(jVar, this.f33266c);
                } else {
                    jVar.n();
                }
            }
        }
        jVar.l((byte) 93);
    }

    public final void x(Object obj, OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("stream can't be null");
        }
        if (obj == null) {
            outputStream.write(f33259I);
            return;
        }
        S6.j jVar = this.f33281r.get();
        jVar.e(outputStream);
        Class<?> cls = obj.getClass();
        if (y(jVar, cls, obj)) {
            jVar.d();
            jVar.e(null);
            return;
        }
        k<TContext> kVar = this.f33265b;
        if (kVar != null) {
            kVar.a(obj, outputStream);
            return;
        }
        throw new ConfigurationException("Unable to serialize provided object. Failed to find serializer for: " + cls);
    }

    public void z(Map<String, Object> map, S6.j jVar) throws IOException {
        jVar.l((byte) 123);
        int size = map.size();
        if (size > 0) {
            Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
            Map.Entry<String, Object> next = it.next();
            jVar.q(next.getKey());
            jVar.l((byte) 58);
            v(jVar, next.getValue());
            for (int i10 = 1; i10 < size; i10++) {
                jVar.l((byte) 44);
                Map.Entry<String, Object> next2 = it.next();
                jVar.q(next2.getKey());
                jVar.l((byte) 58);
                v(jVar, next2.getValue());
            }
        }
        jVar.l((byte) 125);
    }

    public e(m<TContext> mVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f33270g = copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.f33272i = copyOnWriteArrayList2;
        CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
        this.f33274k = copyOnWriteArrayList3;
        this.f33285v = new ConcurrentHashMap();
        this.f33286w = new ConcurrentHashMap();
        this.f33287x = new ConcurrentHashMap();
        this.f33288y = new ConcurrentHashMap();
        this.f33289z = new ConcurrentHashMap();
        this.f33260A = new ConcurrentHashMap();
        this.f33261B = new C0750e();
        this.f33262C = new g();
        this.f33263D = new i();
        if (mVar != null) {
            this.f33281r = new a(this);
            this.f33282s = new b(this);
            this.f33264a = (TContext) ((m) mVar).f33304a;
            this.f33265b = ((m) mVar).f33306c;
            this.f33266c = ((m) mVar).f33307d;
            this.f33267d = ((m) mVar).f33308e;
            this.f33268e = ((m) mVar).f33309f;
            this.f33269f = ((m) mVar).f33310g;
            this.f33278o = ((m) mVar).f33314k;
            this.f33276m = ((m) mVar).f33312i;
            this.f33277n = ((m) mVar).f33313j;
            this.f33279p = ((m) mVar).f33315l;
            this.f33280q = ((m) mVar).f33316m;
            copyOnWriteArrayList.addAll(((m) mVar).f33318o);
            this.f33271h = ((m) mVar).f33318o.size();
            copyOnWriteArrayList2.addAll(((m) mVar).f33319p);
            this.f33273j = ((m) mVar).f33319p.size();
            copyOnWriteArrayList3.addAll(((m) mVar).f33320q);
            this.f33275l = ((m) mVar).f33320q.size();
            this.f33283t = new S6.f(((m) mVar).f33321r);
            this.f33284u = new HashMap(((m) mVar).f33322s);
            t(byte[].class, S6.b.f33247a);
            u(byte[].class, S6.b.f33248b);
            i.f fVar = S6.c.f33250b;
            Class<T> cls = Boolean.TYPE;
            t(cls, fVar);
            j.a aVar = S6.c.f33252d;
            u(cls, aVar);
            r(cls, Boolean.FALSE);
            t(boolean[].class, S6.c.f33253e);
            u(boolean[].class, S6.c.f33254f);
            t(Boolean.class, S6.c.f33251c);
            u(Boolean.class, aVar);
            if (((m) mVar).f33305b) {
                s(this);
            }
            i.f fVar2 = S6.m.f33455b;
            t(LinkedHashMap.class, fVar2);
            t(HashMap.class, fVar2);
            t(Map.class, fVar2);
            u(Map.class, new c());
            t(URI.class, S6.k.f33401a);
            u(URI.class, S6.k.f33402b);
            t(InetAddress.class, S6.k.f33403c);
            u(InetAddress.class, S6.k.f33404d);
            i.f fVar3 = S6.l.f33441p;
            Class<T> cls2 = Double.TYPE;
            t(cls2, fVar3);
            j.a aVar2 = S6.l.f33443r;
            u(cls2, aVar2);
            r(cls2, Double.valueOf(0.0d));
            t(double[].class, S6.l.f33444s);
            u(double[].class, S6.l.f33445t);
            t(Double.class, S6.l.f33442q);
            u(Double.class, aVar2);
            i.f fVar4 = S6.l.f33446u;
            Class<T> cls3 = Float.TYPE;
            t(cls3, fVar4);
            j.a aVar3 = S6.l.f33448w;
            u(cls3, aVar3);
            r(cls3, Float.valueOf(0.0f));
            t(float[].class, S6.l.f33449x);
            u(float[].class, S6.l.f33450y);
            t(Float.class, S6.l.f33447v);
            u(Float.class, aVar3);
            i.f fVar5 = S6.l.f33451z;
            Class<T> cls4 = Integer.TYPE;
            t(cls4, fVar5);
            j.a aVar4 = S6.l.f33406B;
            u(cls4, aVar4);
            r(cls4, 0);
            t(int[].class, S6.l.f33407C);
            u(int[].class, S6.l.f33408D);
            t(Integer.class, S6.l.f33405A);
            u(Integer.class, aVar4);
            i.f fVar6 = S6.l.f33409E;
            Class<T> cls5 = Short.TYPE;
            t(cls5, fVar6);
            j.a aVar5 = S6.l.f33411G;
            u(cls5, aVar5);
            r(cls5, (short) 0);
            t(short[].class, S6.l.f33412H);
            u(short[].class, S6.l.f33413I);
            t(Short.class, S6.l.f33410F);
            u(Short.class, aVar5);
            i.f fVar7 = S6.l.f33414J;
            Class<T> cls6 = Long.TYPE;
            t(cls6, fVar7);
            j.a aVar6 = S6.l.f33416L;
            u(cls6, aVar6);
            r(cls6, 0L);
            t(long[].class, S6.l.f33417M);
            u(long[].class, S6.l.f33418N);
            t(Long.class, S6.l.f33415K);
            u(Long.class, aVar6);
            t(BigDecimal.class, S6.l.f33419O);
            u(BigDecimal.class, S6.l.f33420P);
            t(String.class, o.f33456a);
            u(String.class, o.f33457b);
            t(UUID.class, q.f33462b);
            u(UUID.class, q.f33463c);
            t(Number.class, S6.l.f33421Q);
            u(CharSequence.class, o.f33458c);
            t(StringBuilder.class, o.f33459d);
            t(StringBuffer.class, o.f33460e);
            Iterator it = ((m) mVar).f33317n.iterator();
            while (it.hasNext()) {
                ((S6.d) it.next()).a(this);
            }
            if (!((m) mVar).f33321r.isEmpty() && ((m) mVar).f33311h == 0) {
                o(this, ((m) mVar).f33321r, "dsl_json_Annotation_Processor_External_Serialization");
                o(this, ((m) mVar).f33321r, "dsl_json.json.ExternalSerialization");
                o(this, ((m) mVar).f33321r, "dsl_json_ExternalSerialization");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("settings can't be null");
    }

    private static Object g(Class<?> cls, List<?> list) {
        int i10 = 0;
        if (cls.isPrimitive()) {
            if (Boolean.TYPE.equals(cls)) {
                boolean[] zArr = new boolean[list.size()];
                while (i10 < list.size()) {
                    zArr[i10] = ((Boolean) list.get(i10)).booleanValue();
                    i10++;
                }
                return zArr;
            }
            if (Integer.TYPE.equals(cls)) {
                int[] iArr = new int[list.size()];
                while (i10 < list.size()) {
                    iArr[i10] = ((Integer) list.get(i10)).intValue();
                    i10++;
                }
                return iArr;
            }
            if (Long.TYPE.equals(cls)) {
                long[] jArr = new long[list.size()];
                while (i10 < list.size()) {
                    jArr[i10] = ((Long) list.get(i10)).longValue();
                    i10++;
                }
                return jArr;
            }
            if (Short.TYPE.equals(cls)) {
                short[] sArr = new short[list.size()];
                while (i10 < list.size()) {
                    sArr[i10] = ((Short) list.get(i10)).shortValue();
                    i10++;
                }
                return sArr;
            }
            if (Byte.TYPE.equals(cls)) {
                byte[] bArr = new byte[list.size()];
                while (i10 < list.size()) {
                    bArr[i10] = ((Byte) list.get(i10)).byteValue();
                    i10++;
                }
                return bArr;
            }
            if (Float.TYPE.equals(cls)) {
                float[] fArr = new float[list.size()];
                while (i10 < list.size()) {
                    fArr[i10] = ((Float) list.get(i10)).floatValue();
                    i10++;
                }
                return fArr;
            }
            if (Double.TYPE.equals(cls)) {
                double[] dArr = new double[list.size()];
                while (i10 < list.size()) {
                    dArr[i10] = ((Double) list.get(i10)).doubleValue();
                    i10++;
                }
                return dArr;
            }
            if (Character.TYPE.equals(cls)) {
                char[] cArr = new char[list.size()];
                while (i10 < list.size()) {
                    cArr[i10] = ((Character) list.get(i10)).charValue();
                    i10++;
                }
                return cArr;
            }
        }
        return list.toArray((Object[]) Array.newInstance(cls, 0));
    }

    private static void m(Class<?> cls, ArrayList<Class<?>> arrayList) {
        if (!arrayList.contains(cls)) {
            arrayList.add(cls);
            Class<? super Object> superclass = cls.getSuperclass();
            if (superclass != null && superclass != Object.class) {
                m(superclass, arrayList);
            }
            for (Class<?> cls2 : cls.getInterfaces()) {
                m(cls2, arrayList);
            }
        }
    }

    private static void o(e eVar, Set<ClassLoader> set, String str) {
        Iterator<ClassLoader> it = set.iterator();
        while (it.hasNext()) {
            try {
                ((S6.d) it.next().loadClass(str).getDeclaredConstructor(null).newInstance(null)).a(eVar);
            } catch (Exception | NoClassDefFoundError unused) {
            }
        }
    }

    public <T> i.f<T> A(Class<T> cls) {
        return (i.f<T>) B(cls);
    }

    public <T> j.a<T> C(Class<T> cls) {
        return (j.a<T>) D(cls);
    }

    protected <TResult> TResult j(Class<TResult> cls, S6.i iVar, InputStream inputStream) throws IOException {
        i.e<S6.h> eVarN;
        iVar.j();
        i.f<T> fVarA = A(cls);
        if (fVarA != 0) {
            return (TResult) fVarA.a(iVar);
        }
        if (cls.isArray()) {
            if (iVar.M()) {
                return null;
            }
            if (iVar.n() == 91) {
                Class componentType = cls.getComponentType();
                if (iVar.j() == 93) {
                    return (TResult) Array.newInstance((Class<?>) componentType, 0);
                }
                if (S6.h.class.isAssignableFrom(componentType) && (eVarN = n(componentType)) != null) {
                    return (TResult) g(componentType, iVar.e(eVarN));
                }
                Object objA = A(componentType);
                if (objA != null) {
                    return (TResult) g(componentType, iVar.f(objA));
                }
            } else {
                throw iVar.p("Expecting '[' for array start");
            }
        }
        k<TContext> kVar = this.f33265b;
        if (kVar != null) {
            return (TResult) kVar.b(this.f33264a, cls, new l(iVar.f33360h, inputStream));
        }
        throw i(cls);
    }
}
