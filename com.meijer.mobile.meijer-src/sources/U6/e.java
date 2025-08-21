package U6;

import U6.i;
import U6.j;
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
    private static final Charset f37131E = Charset.forName("UTF-8");

    /* renamed from: F, reason: collision with root package name */
    private static final Object f37132F = new Object();

    /* renamed from: G, reason: collision with root package name */
    private static final Iterator f37133G = new d();

    /* renamed from: H, reason: collision with root package name */
    private static final j.a f37134H = new h();

    /* renamed from: I, reason: collision with root package name */
    private static final byte[] f37135I = {110, 117, 108, 108};

    /* renamed from: A, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, Class<?>> f37136A;

    /* renamed from: B, reason: collision with root package name */
    private final j.a<U6.h> f37137B;

    /* renamed from: C, reason: collision with root package name */
    private final j.a f37138C;

    /* renamed from: D, reason: collision with root package name */
    private final j.a f37139D;

    /* renamed from: a, reason: collision with root package name */
    public final TContext f37140a;

    /* renamed from: b, reason: collision with root package name */
    protected final k<TContext> f37141b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f37142c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f37143d;

    /* renamed from: e, reason: collision with root package name */
    protected final U6.n f37144e;

    /* renamed from: f, reason: collision with root package name */
    protected final U6.n f37145f;

    /* renamed from: g, reason: collision with root package name */
    protected final List<j<j.a>> f37146g;

    /* renamed from: h, reason: collision with root package name */
    private final int f37147h;

    /* renamed from: i, reason: collision with root package name */
    protected final List<j<i.f>> f37148i;

    /* renamed from: j, reason: collision with root package name */
    private final int f37149j;

    /* renamed from: k, reason: collision with root package name */
    protected final List<j<Object>> f37150k;

    /* renamed from: l, reason: collision with root package name */
    private final int f37151l;

    /* renamed from: m, reason: collision with root package name */
    private final i.d f37152m;

    /* renamed from: n, reason: collision with root package name */
    private final i.b f37153n;

    /* renamed from: o, reason: collision with root package name */
    private final i.g f37154o;

    /* renamed from: p, reason: collision with root package name */
    private final int f37155p;

    /* renamed from: q, reason: collision with root package name */
    private final int f37156q;

    /* renamed from: r, reason: collision with root package name */
    protected final ThreadLocal<U6.j> f37157r;

    /* renamed from: s, reason: collision with root package name */
    protected final ThreadLocal<U6.i> f37158s;

    /* renamed from: t, reason: collision with root package name */
    private final U6.f f37159t;

    /* renamed from: u, reason: collision with root package name */
    private final Map<Class<? extends Annotation>, Boolean> f37160u;

    /* renamed from: v, reason: collision with root package name */
    private final Map<Type, Object> f37161v;

    /* renamed from: w, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, i.e<U6.h>> f37162w;

    /* renamed from: x, reason: collision with root package name */
    private final ConcurrentMap<Type, i.f> f37163x;

    /* renamed from: y, reason: collision with root package name */
    private final ConcurrentMap<Type, Object> f37164y;

    /* renamed from: z, reason: collision with root package name */
    private final ConcurrentMap<Type, j.a> f37165z;

    class a extends ThreadLocal<U6.j> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f37166a;

        a(e eVar) {
            this.f37166a = eVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public U6.j initialValue() {
            return new U6.j(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, this.f37166a);
        }
    }

    class b extends ThreadLocal<U6.i> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f37168a;

        b(e eVar) {
            this.f37168a = eVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public U6.i initialValue() {
            byte[] bArr = new byte[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];
            e eVar = this.f37168a;
            return new U6.i(bArr, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, eVar.f37140a, new char[64], eVar.f37144e, eVar.f37145f, eVar, eVar.f37152m, this.f37168a.f37153n, this.f37168a.f37154o, this.f37168a.f37155p, this.f37168a.f37156q);
        }
    }

    class c implements j.a<Map> {
        c() {
        }

        @Override // U6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(U6.j jVar, Map map) throws IOException {
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

    /* renamed from: U6.e$e, reason: collision with other inner class name */
    class C0820e implements j.a<U6.h> {
        C0820e() {
        }

        @Override // U6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(U6.j jVar, U6.h hVar) throws IOException {
            if (hVar == null) {
                jVar.n();
            } else {
                hVar.a(jVar, e.this.f37142c);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class f<T> implements i.f<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i.e f37172a;

        f(i.e eVar) {
            this.f37172a = eVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (LU6/i;)TT; */
        @Override // U6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public U6.h a(U6.i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            if (iVar.n() == 123) {
                iVar.j();
                return this.f37172a.a(iVar);
            }
            throw iVar.p("Expecting '{' for object start");
        }
    }

    class g implements j.a {
        g() {
        }

        @Override // U6.j.a
        public void a(U6.j jVar, Object obj) throws IOException {
            e.this.w(jVar, (U6.h[]) obj);
        }
    }

    class h implements j.a {
        @Override // U6.j.a
        public void a(U6.j jVar, Object obj) throws IOException {
            o.a(new String((char[]) obj), jVar);
        }

        h() {
        }
    }

    class i implements j.a {
        i() {
        }

        @Override // U6.j.a
        public void a(U6.j jVar, Object obj) throws IOException {
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
        private TContext f37180a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f37181b;

        /* renamed from: c, reason: collision with root package name */
        private k<TContext> f37182c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f37183d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f37184e;

        /* renamed from: g, reason: collision with root package name */
        private U6.n f37186g;

        /* renamed from: h, reason: collision with root package name */
        private int f37187h;

        /* renamed from: f, reason: collision with root package name */
        private U6.n f37185f = new n();

        /* renamed from: i, reason: collision with root package name */
        private i.d f37188i = i.d.WITH_STACK_TRACE;

        /* renamed from: j, reason: collision with root package name */
        private i.b f37189j = i.b.DEFAULT;

        /* renamed from: k, reason: collision with root package name */
        private i.g f37190k = i.g.LONG_AND_BIGDECIMAL;

        /* renamed from: l, reason: collision with root package name */
        private int f37191l = 512;

        /* renamed from: m, reason: collision with root package name */
        private int f37192m = 134217728;

        /* renamed from: n, reason: collision with root package name */
        private final List<U6.d> f37193n = new ArrayList();

        /* renamed from: o, reason: collision with root package name */
        private final List<j<j.a>> f37194o = new ArrayList();

        /* renamed from: p, reason: collision with root package name */
        private final List<j<i.f>> f37195p = new ArrayList();

        /* renamed from: q, reason: collision with root package name */
        private final List<j<Object>> f37196q = new ArrayList();

        /* renamed from: r, reason: collision with root package name */
        private final Set<ClassLoader> f37197r = new HashSet();

        /* renamed from: s, reason: collision with root package name */
        private final Map<Class<? extends Annotation>, Boolean> f37198s = new HashMap();

        @Deprecated
        public m<TContext> t(k<TContext> kVar) {
            this.f37182c = kVar;
            return this;
        }
    }

    public static class n implements U6.n {

        /* renamed from: a, reason: collision with root package name */
        private final int f37199a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f37200b;

        public n() {
            this(10);
        }

        public n(int i10) {
            int i11 = 2;
            for (int i12 = 1; i12 < i10; i12++) {
                i11 *= 2;
            }
            this.f37199a = i11 - 1;
            this.f37200b = new String[i11];
        }

        private String b(int i10, char[] cArr, int i11) {
            String str = new String(cArr, 0, i11);
            this.f37200b[i10] = str;
            return str;
        }

        @Override // U6.n
        public String a(char[] cArr, int i10) {
            long j10 = -2128831035;
            for (int i11 = 0; i11 < i10; i11++) {
                j10 = (j10 ^ ((byte) cArr[i11])) * 16777619;
            }
            int i12 = ((int) j10) & this.f37199a;
            String str = this.f37200b[i12];
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

    protected final i.e<U6.h> n(Class<?> cls) throws IllegalAccessException, IllegalArgumentException {
        try {
            i.e<U6.h> eVarQ = this.f37162w.get(cls);
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
                    this.f37162w.putIfAbsent(cls, eVarQ);
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
    public boolean y(U6.j r12, java.lang.reflect.Type r13, java.lang.Object r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U6.e.y(U6.j, java.lang.reflect.Type, java.lang.Object):boolean");
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
        private final byte[] f37176a;

        /* renamed from: b, reason: collision with root package name */
        private final InputStream f37177b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f37178c = true;

        /* renamed from: d, reason: collision with root package name */
        private int f37179d;

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f37178c) {
                int i10 = this.f37179d;
                byte[] bArr = this.f37176a;
                if (i10 < bArr.length) {
                    this.f37179d = i10 + 1;
                    return bArr[i10];
                }
                this.f37178c = false;
            }
            return this.f37177b.read();
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        l(byte[] bArr, InputStream inputStream) {
            this.f37176a = bArr;
            this.f37177b = inputStream;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            if (this.f37178c) {
                return super.read(bArr);
            }
            return this.f37177b.read(bArr);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            if (this.f37178c) {
                return super.read(bArr, i10, i11);
            }
            return this.f37177b.read(bArr, i10, i11);
        }
    }

    private <T> void f(Type type, ConcurrentMap<Type, T> concurrentMap) {
        Type typeL;
        if (type instanceof Class) {
            this.f37159t.b((Class) type, this);
            return;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            this.f37159t.b((Class) parameterizedType.getRawType(), this);
            for (Type type2 : parameterizedType.getActualTypeArguments()) {
                if (!concurrentMap.containsKey(type2) && (typeL = l(type2)) != type2 && !concurrentMap.containsKey(typeL)) {
                    f(typeL, concurrentMap);
                }
            }
        }
    }

    private <T extends U6.h> i.f<T> h(i.e<T> eVar) {
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
            this.f37159t.b((Class) type2, this);
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

    private i.e<U6.h> q(Class<?> cls, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
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
        eVar.t(Element.class, s.f37342a);
        eVar.u(Element.class, s.f37343b);
    }

    public i.f<?> B(Type type) {
        i.e<U6.h> eVarN;
        i.f<?> fVar;
        i.f<?> fVar2 = this.f37163x.get(type);
        if (fVar2 != null) {
            return fVar2;
        }
        Type typeL = l(type);
        if (typeL != type && (fVar = this.f37163x.get(typeL)) != null) {
            this.f37163x.putIfAbsent(type, fVar);
            return fVar;
        }
        if (typeL instanceof Class) {
            Class<?> cls = (Class) typeL;
            if (U6.h.class.isAssignableFrom(cls) && (eVarN = n(cls)) != null) {
                i.f fVarH = h(eVarN);
                this.f37163x.putIfAbsent(type, fVarH);
                return fVarH;
            }
        }
        return (i.f) p(type, typeL, this.f37148i, this.f37163x);
    }

    public j.a<?> D(Type type) {
        j.a<?> aVar;
        j.a<?> aVar2 = this.f37165z.get(type);
        if (aVar2 != null) {
            return aVar2;
        }
        Type typeL = l(type);
        if (typeL != type && (aVar = this.f37165z.get(typeL)) != null) {
            this.f37165z.putIfAbsent(type, aVar);
            return aVar;
        }
        boolean z10 = typeL instanceof Class;
        if (z10 && U6.h.class.isAssignableFrom((Class) typeL)) {
            this.f37165z.putIfAbsent(type, this.f37137B);
            return this.f37137B;
        }
        j.a<?> aVar3 = (j.a) p(type, typeL, this.f37146g, this.f37165z);
        if (aVar3 != null) {
            return aVar3;
        }
        if (!z10) {
            return null;
        }
        Class<?> cls = this.f37136A.get(typeL);
        if (cls != null) {
            return this.f37165z.get(cls);
        }
        Class<?> cls2 = (Class) typeL;
        ArrayList arrayList = new ArrayList();
        m(cls2, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Class<?> cls3 = (Class) it.next();
            j.a<?> aVar4 = this.f37165z.get(cls3);
            if (aVar4 == null) {
                aVar4 = (j.a) p(type, cls3, this.f37146g, this.f37165z);
            }
            if (aVar4 != null) {
                this.f37136A.putIfAbsent(cls2, cls3);
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
            if (this.f37163x.containsKey(cls2)) {
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
        U6.i<TContext> iVarB = this.f37158s.get().B(inputStream);
        try {
            return (TResult) j(cls, iVarB, inputStream);
        } finally {
            iVarB.J();
        }
    }

    public <T> void r(Class<T> cls, T t10) {
        this.f37161v.put(cls, t10);
    }

    public <T, S extends T> void t(Class<T> cls, i.f<S> fVar) {
        if (fVar == null) {
            this.f37163x.remove(cls);
        } else {
            this.f37163x.put(cls, fVar);
        }
    }

    public <T> void u(Class<T> cls, j.a<T> aVar) {
        if (aVar == null) {
            this.f37136A.remove(cls);
            this.f37165z.remove(cls);
        } else {
            this.f37136A.put(cls, cls);
            this.f37165z.put(cls, aVar);
        }
    }

    public final void v(U6.j jVar, Object obj) throws IOException {
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
        if (this.f37141b != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f37141b.a(obj, byteArrayOutputStream);
            jVar.j(byteArrayOutputStream.toByteArray());
        } else {
            throw new ConfigurationException("Unable to serialize provided object. Failed to find serializer for: " + cls);
        }
    }

    @Deprecated
    public <T extends U6.h> void w(U6.j jVar, T[] tArr) throws IOException {
        if (tArr == null) {
            jVar.n();
            return;
        }
        jVar.l((byte) 91);
        if (tArr.length != 0) {
            T t10 = tArr[0];
            if (t10 != null) {
                t10.a(jVar, this.f37142c);
            } else {
                jVar.n();
            }
            for (int i10 = 1; i10 < tArr.length; i10++) {
                jVar.l((byte) 44);
                T t11 = tArr[i10];
                if (t11 != null) {
                    t11.a(jVar, this.f37142c);
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
            outputStream.write(f37135I);
            return;
        }
        U6.j jVar = this.f37157r.get();
        jVar.e(outputStream);
        Class<?> cls = obj.getClass();
        if (y(jVar, cls, obj)) {
            jVar.d();
            jVar.e(null);
            return;
        }
        k<TContext> kVar = this.f37141b;
        if (kVar != null) {
            kVar.a(obj, outputStream);
            return;
        }
        throw new ConfigurationException("Unable to serialize provided object. Failed to find serializer for: " + cls);
    }

    public void z(Map<String, Object> map, U6.j jVar) throws IOException {
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
        this.f37146g = copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.f37148i = copyOnWriteArrayList2;
        CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
        this.f37150k = copyOnWriteArrayList3;
        this.f37161v = new ConcurrentHashMap();
        this.f37162w = new ConcurrentHashMap();
        this.f37163x = new ConcurrentHashMap();
        this.f37164y = new ConcurrentHashMap();
        this.f37165z = new ConcurrentHashMap();
        this.f37136A = new ConcurrentHashMap();
        this.f37137B = new C0820e();
        this.f37138C = new g();
        this.f37139D = new i();
        if (mVar != null) {
            this.f37157r = new a(this);
            this.f37158s = new b(this);
            this.f37140a = (TContext) ((m) mVar).f37180a;
            this.f37141b = ((m) mVar).f37182c;
            this.f37142c = ((m) mVar).f37183d;
            this.f37143d = ((m) mVar).f37184e;
            this.f37144e = ((m) mVar).f37185f;
            this.f37145f = ((m) mVar).f37186g;
            this.f37154o = ((m) mVar).f37190k;
            this.f37152m = ((m) mVar).f37188i;
            this.f37153n = ((m) mVar).f37189j;
            this.f37155p = ((m) mVar).f37191l;
            this.f37156q = ((m) mVar).f37192m;
            copyOnWriteArrayList.addAll(((m) mVar).f37194o);
            this.f37147h = ((m) mVar).f37194o.size();
            copyOnWriteArrayList2.addAll(((m) mVar).f37195p);
            this.f37149j = ((m) mVar).f37195p.size();
            copyOnWriteArrayList3.addAll(((m) mVar).f37196q);
            this.f37151l = ((m) mVar).f37196q.size();
            this.f37159t = new U6.f(((m) mVar).f37197r);
            this.f37160u = new HashMap(((m) mVar).f37198s);
            t(byte[].class, U6.b.f37123a);
            u(byte[].class, U6.b.f37124b);
            i.f fVar = U6.c.f37126b;
            Class<T> cls = Boolean.TYPE;
            t(cls, fVar);
            j.a aVar = U6.c.f37128d;
            u(cls, aVar);
            r(cls, Boolean.FALSE);
            t(boolean[].class, U6.c.f37129e);
            u(boolean[].class, U6.c.f37130f);
            t(Boolean.class, U6.c.f37127c);
            u(Boolean.class, aVar);
            if (((m) mVar).f37181b) {
                s(this);
            }
            i.f fVar2 = U6.m.f37331b;
            t(LinkedHashMap.class, fVar2);
            t(HashMap.class, fVar2);
            t(Map.class, fVar2);
            u(Map.class, new c());
            t(URI.class, U6.k.f37277a);
            u(URI.class, U6.k.f37278b);
            t(InetAddress.class, U6.k.f37279c);
            u(InetAddress.class, U6.k.f37280d);
            i.f fVar3 = U6.l.f37317p;
            Class<T> cls2 = Double.TYPE;
            t(cls2, fVar3);
            j.a aVar2 = U6.l.f37319r;
            u(cls2, aVar2);
            r(cls2, Double.valueOf(0.0d));
            t(double[].class, U6.l.f37320s);
            u(double[].class, U6.l.f37321t);
            t(Double.class, U6.l.f37318q);
            u(Double.class, aVar2);
            i.f fVar4 = U6.l.f37322u;
            Class<T> cls3 = Float.TYPE;
            t(cls3, fVar4);
            j.a aVar3 = U6.l.f37324w;
            u(cls3, aVar3);
            r(cls3, Float.valueOf(0.0f));
            t(float[].class, U6.l.f37325x);
            u(float[].class, U6.l.f37326y);
            t(Float.class, U6.l.f37323v);
            u(Float.class, aVar3);
            i.f fVar5 = U6.l.f37327z;
            Class<T> cls4 = Integer.TYPE;
            t(cls4, fVar5);
            j.a aVar4 = U6.l.f37282B;
            u(cls4, aVar4);
            r(cls4, 0);
            t(int[].class, U6.l.f37283C);
            u(int[].class, U6.l.f37284D);
            t(Integer.class, U6.l.f37281A);
            u(Integer.class, aVar4);
            i.f fVar6 = U6.l.f37285E;
            Class<T> cls5 = Short.TYPE;
            t(cls5, fVar6);
            j.a aVar5 = U6.l.f37287G;
            u(cls5, aVar5);
            r(cls5, (short) 0);
            t(short[].class, U6.l.f37288H);
            u(short[].class, U6.l.f37289I);
            t(Short.class, U6.l.f37286F);
            u(Short.class, aVar5);
            i.f fVar7 = U6.l.f37290J;
            Class<T> cls6 = Long.TYPE;
            t(cls6, fVar7);
            j.a aVar6 = U6.l.f37292L;
            u(cls6, aVar6);
            r(cls6, 0L);
            t(long[].class, U6.l.f37293M);
            u(long[].class, U6.l.f37294N);
            t(Long.class, U6.l.f37291K);
            u(Long.class, aVar6);
            t(BigDecimal.class, U6.l.f37295O);
            u(BigDecimal.class, U6.l.f37296P);
            t(String.class, o.f37332a);
            u(String.class, o.f37333b);
            t(UUID.class, q.f37338b);
            u(UUID.class, q.f37339c);
            t(Number.class, U6.l.f37297Q);
            u(CharSequence.class, o.f37334c);
            t(StringBuilder.class, o.f37335d);
            t(StringBuffer.class, o.f37336e);
            Iterator it = ((m) mVar).f37193n.iterator();
            while (it.hasNext()) {
                ((U6.d) it.next()).a(this);
            }
            if (!((m) mVar).f37197r.isEmpty() && ((m) mVar).f37187h == 0) {
                o(this, ((m) mVar).f37197r, "dsl_json_Annotation_Processor_External_Serialization");
                o(this, ((m) mVar).f37197r, "dsl_json.json.ExternalSerialization");
                o(this, ((m) mVar).f37197r, "dsl_json_ExternalSerialization");
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
                ((U6.d) it.next().loadClass(str).getDeclaredConstructor(null).newInstance(null)).a(eVar);
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

    protected <TResult> TResult j(Class<TResult> cls, U6.i iVar, InputStream inputStream) throws IOException {
        i.e<U6.h> eVarN;
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
                if (U6.h.class.isAssignableFrom(componentType) && (eVarN = n(componentType)) != null) {
                    return (TResult) g(componentType, iVar.e(eVarN));
                }
                Object objA = A(componentType);
                if (objA != null) {
                    return (TResult) g(componentType, iVar.h(objA));
                }
            } else {
                throw iVar.p("Expecting '[' for array start");
            }
        }
        k<TContext> kVar = this.f37141b;
        if (kVar != null) {
            return (TResult) kVar.b(this.f37140a, cls, new l(iVar.f37236h, inputStream));
        }
        throw i(cls);
    }
}
