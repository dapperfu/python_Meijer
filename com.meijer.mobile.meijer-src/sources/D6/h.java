package D6;

import D6.f;
import com.apollographql.apollo.exception.JsonDataException;
import com.google.maps.android.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\rB#\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ%\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010\u0017J\u000f\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010\u0017J\u000f\u0010$\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010\u001fJ\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0013H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\fH\u0016¢\u0006\u0004\b3\u0010\u000eJ\u000f\u00104\u001a\u00020\fH\u0016¢\u0006\u0004\b4\u0010\u000eJ\u001d\u00106\u001a\u00020\u00132\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\fH\u0016¢\u0006\u0004\b8\u0010\u000eJ\u0015\u00109\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016¢\u0006\u0004\b9\u0010:R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010>R\u0016\u0010@\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010;R\u001e\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR,\u0010I\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010F0B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\"\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010J0B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010KR\u0016\u0010O\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010NR\u0016\u0010Q\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010P¨\u0006R"}, d2 = {"LD6/h;", "LD6/f;", "", "root", "", "pathRoot", "<init>", "(Ljava/lang/Object;Ljava/util/List;)V", "any", "LD6/f$a;", "b", "(Ljava/lang/Object;)LD6/f$a;", "", "a", "()V", "l", "", "needle", "haystack", "", "i", "(Ljava/lang/String;Ljava/util/List;)I", "j", "()Ljava/lang/String;", "c", "()LD6/h;", "g", "d", "h", "", "hasNext", "()Z", "peek", "()LD6/f$a;", "nextName", "nextString", "nextBoolean", "", "F2", "()Ljava/lang/Void;", "", "nextDouble", "()D", "nextInt", "()I", "", "nextLong", "()J", "LD6/e;", "q3", "()LD6/e;", "skipValue", "close", "names", "r3", "(Ljava/util/List;)I", "v", "getPath", "()Ljava/util/List;", "Ljava/lang/Object;", "getRoot", "()Ljava/lang/Object;", "Ljava/util/List;", "LD6/f$a;", "peekedToken", "peekedData", "", "e", "[Ljava/lang/Object;", "path", "", "f", "[Ljava/util/Map;", "containerStack", "", "[Ljava/util/Iterator;", "iteratorStack", "", "[I", "nameIndexStack", "I", "stackSize", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class h implements f {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object root;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Object> pathRoot;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private f.a peekedToken;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Object peekedData;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Object[] path;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Map<String, Object>[] containerStack;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Iterator<?>[] iteratorStack;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int[] nameIndexStack;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int stackSize;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LD6/h$a;", "", "<init>", "()V", "LD6/f;", "LD6/h;", "a", "(LD6/f;)LD6/h;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: D6.h$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final h a(f fVar) throws IOException {
            Intrinsics.j(fVar, "<this>");
            if (fVar instanceof h) {
                return (h) fVar;
            }
            f.a peekedToken = fVar.getPeekedToken();
            if (peekedToken == f.a.f5996c) {
                List<Object> path = fVar.getPath();
                Object objD = a.d(fVar);
                Intrinsics.h(objD, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                return new h((Map) objD, path);
            }
            throw new IllegalStateException(("Failed to buffer json reader, expected `BEGIN_OBJECT` but found `" + peekedToken + "` json token").toString());
        }
    }

    @JvmOverloads
    public h(Object obj, List<? extends Object> pathRoot) {
        Intrinsics.j(pathRoot, "pathRoot");
        this.root = obj;
        this.pathRoot = pathRoot;
        this.path = new Object[64];
        this.containerStack = new Map[64];
        this.iteratorStack = new Iterator[64];
        this.nameIndexStack = new int[64];
        this.peekedToken = b(obj);
        this.peekedData = obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[f.a.values().length];
            try {
                iArr[f.a.f5997d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.a.f5995b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.a.f5999f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.a.f6000g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f.a.f6001h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void a() {
        int i10 = this.stackSize;
        if (i10 == 0) {
            this.peekedToken = f.a.f6004k;
            return;
        }
        Iterator<?> it = this.iteratorStack[i10 - 1];
        Intrinsics.g(it);
        Object[] objArr = this.path;
        int i11 = this.stackSize;
        if (objArr[i11 - 1] instanceof Integer) {
            int i12 = i11 - 1;
            Object obj = objArr[i11 - 1];
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
            objArr[i12] = Integer.valueOf(((Integer) obj).intValue() + 1);
        }
        if (!it.hasNext()) {
            this.peekedToken = this.path[this.stackSize + (-1)] instanceof Integer ? f.a.f5995b : f.a.f5997d;
            return;
        }
        Object next = it.next();
        this.peekedData = next;
        this.peekedToken = next instanceof Map.Entry ? f.a.f5998e : b(next);
    }

    private final f.a b(Object any) {
        return any == null ? f.a.f6003j : any instanceof List ? f.a.f5994a : any instanceof Map ? f.a.f5996c : any instanceof Integer ? f.a.f6000g : any instanceof Long ? f.a.f6001h : any instanceof Double ? f.a.f6000g : any instanceof e ? f.a.f6000g : any instanceof String ? f.a.f5999f : any instanceof Boolean ? f.a.f6002i : f.a.f6005l;
    }

    private final int i(String needle, List<String> haystack) {
        int i10 = this.nameIndexStack[this.stackSize - 1];
        if (i10 >= haystack.size() || !Intrinsics.e(haystack.get(i10), needle)) {
            int iIndexOf = haystack.indexOf(needle);
            if (iIndexOf != -1) {
                this.nameIndexStack[this.stackSize - 1] = iIndexOf + 1;
            }
            return iIndexOf;
        }
        int[] iArr = this.nameIndexStack;
        int i11 = this.stackSize;
        iArr[i11 - 1] = iArr[i11 - 1] + 1;
        return i10;
    }

    private final void l() {
        int i10 = this.stackSize;
        Object[] objArr = this.path;
        if (i10 == objArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length * 2);
            Intrinsics.i(objArrCopyOf, "copyOf(...)");
            this.path = objArrCopyOf;
            Map<String, Object>[] mapArr = this.containerStack;
            Object[] objArrCopyOf2 = Arrays.copyOf(mapArr, mapArr.length * 2);
            Intrinsics.i(objArrCopyOf2, "copyOf(...)");
            this.containerStack = (Map[]) objArrCopyOf2;
            int[] iArr = this.nameIndexStack;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.i(iArrCopyOf, "copyOf(...)");
            this.nameIndexStack = iArrCopyOf;
            Iterator<?>[] itArr = this.iteratorStack;
            Object[] objArrCopyOf3 = Arrays.copyOf(itArr, itArr.length * 2);
            Intrinsics.i(objArrCopyOf3, "copyOf(...)");
            this.iteratorStack = (Iterator[]) objArrCopyOf3;
        }
        this.stackSize++;
    }

    @Override // D6.f
    public List<Object> getPath() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.pathRoot);
        int i10 = this.stackSize;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.path[i11];
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // D6.f
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public h F() {
        int i10 = this.stackSize - 1;
        this.stackSize = i10;
        this.iteratorStack[i10] = null;
        this.path[i10] = null;
        this.containerStack[i10] = null;
        a();
        return this;
    }

    @Override // D6.f
    public String nextString() {
        String value;
        Object obj = this.peekedData;
        if (obj instanceof Integer) {
            value = String.valueOf(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            value = String.valueOf(((Number) obj).longValue());
        } else if (obj instanceof Double) {
            value = String.valueOf(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            value = (String) obj;
        } else if (obj == null) {
            value = BuildConfig.TRAVIS;
        } else {
            if (!(obj instanceof e)) {
                throw new IllegalStateException(("Expected a String but got " + obj + " instead").toString());
            }
            value = ((e) obj).getValue();
        }
        a();
        return value;
    }

    @Override // D6.f
    /* renamed from: peek, reason: from getter */
    public f.a getPeekedToken() {
        return this.peekedToken;
    }

    @Override // D6.f
    public int r3(List<String> names) {
        Intrinsics.j(names, "names");
        while (hasNext()) {
            int i10 = i(nextName(), names);
            if (i10 != -1) {
                return i10;
            }
            skipValue();
        }
        return -1;
    }

    @Override // D6.f
    public void v() {
        Map<String, Object>[] mapArr = this.containerStack;
        int i10 = this.stackSize;
        Map<String, Object> map = mapArr[i10 - 1];
        this.path[i10 - 1] = null;
        Intrinsics.g(map);
        this.iteratorStack[i10 - 1] = map.entrySet().iterator();
        this.nameIndexStack[this.stackSize - 1] = 0;
        a();
    }

    private final String j() {
        return CollectionsKt.B0(getPath(), ".", null, null, 0, null, null, 62, null);
    }

    @Override // D6.f
    public Void F2() {
        if (getPeekedToken() == f.a.f6003j) {
            a();
            return null;
        }
        throw new JsonDataException("Expected NULL but was " + getPeekedToken() + " at path " + j());
    }

    @Override // D6.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public h y() {
        if (getPeekedToken() == f.a.f5994a) {
            Object obj = this.peekedData;
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            l();
            this.path[this.stackSize - 1] = -1;
            this.iteratorStack[this.stackSize - 1] = ((List) obj).iterator();
            a();
            return this;
        }
        throw new JsonDataException("Expected BEGIN_ARRAY but was " + getPeekedToken() + " at path " + j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // D6.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public h s() {
        if (getPeekedToken() == f.a.f5996c) {
            l();
            Map<String, Object>[] mapArr = this.containerStack;
            int i10 = this.stackSize - 1;
            Object obj = this.peekedData;
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            mapArr[i10] = obj;
            v();
            return this;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + getPeekedToken() + " at path " + j());
    }

    @Override // D6.f
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public h x() {
        if (getPeekedToken() == f.a.f5995b) {
            int i10 = this.stackSize - 1;
            this.stackSize = i10;
            this.iteratorStack[i10] = null;
            this.path[i10] = null;
            a();
            return this;
        }
        throw new JsonDataException("Expected END_ARRAY but was " + getPeekedToken() + " at path " + j());
    }

    @Override // D6.f
    public boolean hasNext() {
        int i10 = b.$EnumSwitchMapping$0[getPeekedToken().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return false;
        }
        return true;
    }

    @Override // D6.f
    public boolean nextBoolean() {
        if (getPeekedToken() == f.a.f6002i) {
            Object obj = this.peekedData;
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Boolean");
            Boolean bool = (Boolean) obj;
            bool.getClass();
            a();
            return bool.booleanValue();
        }
        throw new JsonDataException("Expected BOOLEAN but was " + getPeekedToken() + " at path " + j());
    }

    @Override // D6.f
    public double nextDouble() throws NumberFormatException {
        double dDoubleValue;
        int i10 = b.$EnumSwitchMapping$0[getPeekedToken().ordinal()];
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            throw new JsonDataException("Expected a Double but was " + getPeekedToken() + " at path " + j());
        }
        Object obj = this.peekedData;
        if (obj instanceof Integer) {
            dDoubleValue = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            dDoubleValue = E6.c.c(((Number) obj).longValue());
        } else if (obj instanceof Double) {
            dDoubleValue = ((Number) obj).doubleValue();
        } else if (obj instanceof String) {
            dDoubleValue = Double.parseDouble((String) obj);
        } else if (obj instanceof e) {
            dDoubleValue = Double.parseDouble(((e) obj).getValue());
        } else {
            throw new IllegalStateException(("Expected a Double but got " + obj + " instead").toString());
        }
        a();
        return dDoubleValue;
    }

    @Override // D6.f
    public int nextInt() throws NumberFormatException {
        int iA;
        int i10 = b.$EnumSwitchMapping$0[getPeekedToken().ordinal()];
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            throw new JsonDataException("Expected an Int but was " + getPeekedToken() + " at path " + j());
        }
        Object obj = this.peekedData;
        if (obj instanceof Integer) {
            iA = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            iA = E6.c.d(((Number) obj).longValue());
        } else if (obj instanceof Double) {
            iA = E6.c.a(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            iA = Integer.parseInt((String) obj);
        } else if (obj instanceof e) {
            iA = Integer.parseInt(((e) obj).getValue());
        } else {
            throw new IllegalStateException(("Expected an Int but got " + obj + " instead").toString());
        }
        a();
        return iA;
    }

    @Override // D6.f
    public long nextLong() throws NumberFormatException {
        long jB;
        int i10 = b.$EnumSwitchMapping$0[getPeekedToken().ordinal()];
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            throw new JsonDataException("Expected a Long but was " + getPeekedToken() + " at path " + j());
        }
        Object obj = this.peekedData;
        if (obj instanceof Integer) {
            jB = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            jB = ((Number) obj).longValue();
        } else if (obj instanceof Double) {
            jB = E6.c.b(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            jB = Long.parseLong((String) obj);
        } else if (obj instanceof e) {
            jB = Long.parseLong(((e) obj).getValue());
        } else {
            throw new IllegalStateException(("Expected Int but got " + obj + " instead").toString());
        }
        a();
        return jB;
    }

    @Override // D6.f
    public String nextName() {
        if (getPeekedToken() == f.a.f5998e) {
            Object obj = this.peekedData;
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.Map.Entry<kotlin.String, kotlin.Any?>");
            Map.Entry entry = (Map.Entry) obj;
            this.path[this.stackSize - 1] = entry.getKey();
            this.peekedData = entry.getValue();
            this.peekedToken = b(entry.getValue());
            return (String) entry.getKey();
        }
        throw new JsonDataException("Expected NAME but was " + getPeekedToken() + " at path " + j());
    }

    @Override // D6.f
    public e q3() {
        e eVar;
        int i10 = b.$EnumSwitchMapping$0[getPeekedToken().ordinal()];
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            throw new JsonDataException("Expected a Number but was " + getPeekedToken() + " at path " + j());
        }
        Object obj = this.peekedData;
        if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double)) {
            if (obj instanceof String) {
                eVar = new e((String) obj);
            } else if (obj instanceof e) {
                eVar = (e) obj;
            } else {
                throw new IllegalStateException(("Expected JsonNumber but got " + obj + " instead").toString());
            }
        } else {
            eVar = new e(obj.toString());
        }
        a();
        return eVar;
    }

    @Override // D6.f
    public void skipValue() {
        a();
    }

    public /* synthetic */ h(Object obj, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? CollectionsKt.m() : list);
    }
}
