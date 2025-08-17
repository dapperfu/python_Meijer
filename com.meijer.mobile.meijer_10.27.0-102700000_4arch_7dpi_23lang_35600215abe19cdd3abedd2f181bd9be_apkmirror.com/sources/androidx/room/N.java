package androidx.room;

import android.annotation.SuppressLint;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0013\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\b\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001!B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0006J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010#R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010$R\u001a\u0010)\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u0012\u0004\b(\u0010\u000eR\u001a\u0010.\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u0012\u0004\b-\u0010\u000eR\"\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u0012\u0004\b2\u0010\u000eR\"\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u0012\u0004\b6\u0010\u000eR\u001a\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u000b\u00109\u0012\u0004\b:\u0010\u000eR$\u0010<\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b+\u0010#R\u0014\u0010>\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010=¨\u0006@"}, d2 = {"Landroidx/room/N;", "LA4/f;", "LA4/e;", "", "capacity", "<init>", "(I)V", "", "query", "initArgCount", "", "g", "(Ljava/lang/String;I)V", "h", "()V", "statement", "b", "(LA4/e;)V", "index", "I", "", "value", "C", "(IJ)V", "", "o", "(ID)V", "S1", "(ILjava/lang/String;)V", "", "z2", "(I[B)V", "close", "a", "getCapacity", "()I", "Ljava/lang/String;", "", "c", "[J", "getLongBindings$annotations", "longBindings", "", "d", "[D", "getDoubleBindings$annotations", "doubleBindings", "", "e", "[Ljava/lang/String;", "getStringBindings$annotations", "stringBindings", "f", "[[B", "getBlobBindings$annotations", "blobBindings", "", "[I", "getBindingTypes$annotations", "bindingTypes", "argCount", "()Ljava/lang/String;", "sql", "i", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"WrongConstant"})
/* loaded from: classes4.dex */
public final class N implements A4.f, A4.e {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j, reason: collision with root package name */
    @JvmField
    public static final TreeMap<Integer, N> f58399j = new TreeMap<>();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile String query;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final long[] longBindings;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final double[] doubleBindings;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final String[] stringBindings;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final byte[][] blobBindings;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int[] bindingTypes;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int argCount;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\u0003R\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"Landroidx/room/N$a;", "", "<init>", "()V", "", "query", "", "argumentCount", "Landroidx/room/N;", "a", "(Ljava/lang/String;I)Landroidx/room/N;", "", "b", "NULL", "I", "LONG", "DOUBLE", "STRING", "BLOB", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.room.N$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final N a(String query, int argumentCount) {
            Intrinsics.j(query, "query");
            TreeMap<Integer, N> treeMap = N.f58399j;
            synchronized (treeMap) {
                Map.Entry<Integer, N> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(argumentCount));
                if (entryCeilingEntry == null) {
                    Unit unit = Unit.f142422a;
                    N n10 = new N(argumentCount, null);
                    n10.g(query, argumentCount);
                    return n10;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                N value = entryCeilingEntry.getValue();
                value.g(query, argumentCount);
                Intrinsics.g(value);
                return value;
            }
        }

        public final void b() {
            TreeMap<Integer, N> treeMap = N.f58399j;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            Intrinsics.i(it, "iterator(...)");
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i10;
            }
        }
    }

    public /* synthetic */ N(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    @JvmStatic
    public static final N c(String str, int i10) {
        return INSTANCE.a(str, i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    private N(int i10) {
        this.capacity = i10;
        int i11 = i10 + 1;
        this.bindingTypes = new int[i11];
        this.longBindings = new long[i11];
        this.doubleBindings = new double[i11];
        this.stringBindings = new String[i11];
        this.blobBindings = new byte[i11][];
    }

    @Override // A4.e
    public void C(int index, long value) {
        this.bindingTypes[index] = 2;
        this.longBindings[index] = value;
    }

    @Override // A4.e
    public void I(int index) {
        this.bindingTypes[index] = 1;
    }

    @Override // A4.e
    public void S1(int index, String value) {
        Intrinsics.j(value, "value");
        this.bindingTypes[index] = 4;
        this.stringBindings[index] = value;
    }

    @Override // A4.f
    /* renamed from: a */
    public String getQuery() {
        String str = this.query;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // A4.f
    public void b(A4.e statement) {
        Intrinsics.j(statement, "statement");
        int argCount = getArgCount();
        if (1 > argCount) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.bindingTypes[i10];
            if (i11 == 1) {
                statement.I(i10);
            } else if (i11 == 2) {
                statement.C(i10, this.longBindings[i10]);
            } else if (i11 == 3) {
                statement.o(i10, this.doubleBindings[i10]);
            } else if (i11 == 4) {
                String str = this.stringBindings[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.S1(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.blobBindings[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.z2(i10, bArr);
            }
            if (i10 == argCount) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* renamed from: d, reason: from getter */
    public int getArgCount() {
        return this.argCount;
    }

    public final void g(String query, int initArgCount) {
        Intrinsics.j(query, "query");
        this.query = query;
        this.argCount = initArgCount;
    }

    public final void h() {
        TreeMap<Integer, N> treeMap = f58399j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.capacity), this);
            INSTANCE.b();
            Unit unit = Unit.f142422a;
        }
    }

    @Override // A4.e
    public void o(int index, double value) {
        this.bindingTypes[index] = 3;
        this.doubleBindings[index] = value;
    }

    @Override // A4.e
    public void z2(int index, byte[] value) {
        Intrinsics.j(value, "value");
        this.bindingTypes[index] = 5;
        this.blobBindings[index] = value;
    }
}
