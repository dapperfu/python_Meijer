package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0012\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\"\u001a\u00020\t2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\b%\u0010&R\"\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130'8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0012\u0010(\u0012\u0004\b)\u0010\u0003R\u0016\u0010,\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0016\u0010/\u001a\u00020-8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010.R\u0016\u00100\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\"\u0010+R\u001e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010+R\u0016\u00106\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u0011\u00108\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b2\u00107¨\u00069"}, d2 = {"Landroidx/compose/runtime/changelist/c;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "", "currentSize", "requiredSize", "b", "(II)I", "", "m", "k", "(II)V", "l", "", "f", "()Z", "g", "a", "Landroidx/compose/runtime/changelist/Operation;", "operation", "j", "(Landroidx/compose/runtime/changelist/Operation;)V", "i", "c", "other", "h", "(Landroidx/compose/runtime/changelist/c;)V", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "d", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "", "toString", "()Ljava/lang/String;", "", "[Landroidx/compose/runtime/changelist/Operation;", "getOpCodes$runtime_release$annotations", "opCodes", "I", "opCodesSize", "", "[I", "intArgs", "intArgsSize", "", "e", "[Ljava/lang/Object;", "objectArgs", "objectArgsSize", "pushedIntMask", "()I", "size", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public int opCodesSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public int intArgsSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public int objectArgsSize;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int pushedIntMask;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public Operation[] opCodes = new Operation[16];

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public int[] intArgs = new int[16];

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public Object[] objectArgs = new Object[16];

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00072\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0019\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/changelist/c$a;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "<init>", "(Landroidx/compose/runtime/changelist/c;)V", "", "b", "()Z", "", "Landroidx/compose/runtime/changelist/IntParameter;", "parameter", "getInt", "(I)I", "T", "Landroidx/compose/runtime/changelist/Operation$r;", "getObject-31yXWZQ", "(I)Ljava/lang/Object;", "getObject", "a", "I", "opIdx", "intIdx", "c", "objIdx", "Landroidx/compose/runtime/changelist/Operation;", "()Landroidx/compose/runtime/changelist/Operation;", "operation", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a implements OperationArgContainer {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int opIdx;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int intIdx;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int objIdx;

        public a() {
        }

        public final Operation a() {
            return c.this.opCodes[this.opIdx];
        }

        public final boolean b() {
            if (this.opIdx >= c.this.opCodesSize) {
                return false;
            }
            Operation operationA = a();
            this.intIdx += operationA.getInts();
            this.objIdx += operationA.getObjects();
            int i10 = this.opIdx + 1;
            this.opIdx = i10;
            return i10 < c.this.opCodesSize;
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        public int getInt(int parameter) {
            return c.this.intArgs[this.intIdx + parameter];
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        /* renamed from: getObject-31yXWZQ */
        public <T> T mo12getObject31yXWZQ(int parameter) {
            return (T) c.this.objectArgs[this.objIdx + parameter];
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\t\u001a\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJH\u0010\u0012\u001a\u00020\n\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u0011\u001a\u00028\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013Jd\u0010\u0017\u001a\u00020\n\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u0011\u001a\u00028\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u00072\u0006\u0010\u0016\u001a\u00028\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0080\u0001\u0010\u001c\u001a\u00020\n\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u0014\"\u0004\b\u0003\u0010\u00192\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u0011\u001a\u00028\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u00072\u0006\u0010\u0016\u001a\u00028\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00030\u00072\u0006\u0010\u001b\u001a\u00028\u0003ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/changelist/c$b;", "", "Landroidx/compose/runtime/changelist/c;", "stack", "a", "(Landroidx/compose/runtime/changelist/c;)Landroidx/compose/runtime/changelist/c;", "T", "Landroidx/compose/runtime/changelist/Operation$r;", "parameter", "value", "", "b", "(Landroidx/compose/runtime/changelist/c;ILjava/lang/Object;)V", "U", "parameter1", "value1", "parameter2", "value2", "c", "(Landroidx/compose/runtime/changelist/c;ILjava/lang/Object;ILjava/lang/Object;)V", "V", "parameter3", "value3", "e", "(Landroidx/compose/runtime/changelist/c;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", "W", "parameter4", "value4", "d", "(Landroidx/compose/runtime/changelist/c;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    @SourceDebugExtension
    public static final class b {
        public static c a(c cVar) {
            return cVar;
        }

        public static final <T> void b(c cVar, int i10, T t10) {
            cVar.objectArgs[(cVar.objectArgsSize - cVar.opCodes[cVar.opCodesSize - 1].getObjects()) + i10] = t10;
        }

        public static final <T, U> void c(c cVar, int i10, T t10, int i11, U u10) {
            int objects = cVar.objectArgsSize - cVar.opCodes[cVar.opCodesSize - 1].getObjects();
            Object[] objArr = cVar.objectArgs;
            objArr[i10 + objects] = t10;
            objArr[objects + i11] = u10;
        }

        public static final <T, U, V, W> void d(c cVar, int i10, T t10, int i11, U u10, int i12, V v10, int i13, W w10) {
            int objects = cVar.objectArgsSize - cVar.opCodes[cVar.opCodesSize - 1].getObjects();
            Object[] objArr = cVar.objectArgs;
            objArr[i10 + objects] = t10;
            objArr[i11 + objects] = u10;
            objArr[i12 + objects] = v10;
            objArr[objects + i13] = w10;
        }

        public static final <T, U, V> void e(c cVar, int i10, T t10, int i11, U u10, int i12, V v10) {
            int objects = cVar.objectArgsSize - cVar.opCodes[cVar.opCodesSize - 1].getObjects();
            Object[] objArr = cVar.objectArgs;
            objArr[i10 + objects] = t10;
            objArr[i11 + objects] = u10;
            objArr[objects + i12] = v10;
        }
    }

    public final void a() {
        this.opCodesSize = 0;
        this.intArgsSize = 0;
        ArraysKt.B(this.objectArgs, null, 0, this.objectArgsSize);
        this.objectArgsSize = 0;
    }

    private final int b(int currentSize, int requiredSize) {
        return RangesKt.f(currentSize + RangesKt.k(currentSize, 1024), requiredSize);
    }

    private final void m() {
        int iK = RangesKt.k(this.opCodesSize, 1024);
        int i10 = this.opCodesSize;
        Operation[] operationArr = new Operation[iK + i10];
        System.arraycopy(this.opCodes, 0, operationArr, 0, i10);
        this.opCodes = operationArr;
    }

    public final void c(Operation operation) {
        int i10 = this.pushedIntMask;
        int ints = operation.getInts();
        if (i10 == ((ints == 0 ? 0 : -1) >>> (32 - ints))) {
            operation.getObjects();
        }
    }

    /* renamed from: e, reason: from getter */
    public final int getOpCodesSize() {
        return this.opCodesSize;
    }

    public final void h(c other) {
        Operation[] operationArr = this.opCodes;
        int i10 = this.opCodesSize - 1;
        this.opCodesSize = i10;
        Operation operation = operationArr[i10];
        operationArr[i10] = null;
        other.j(operation);
        Object[] objArr = this.objectArgs;
        Object[] objArr2 = other.objectArgs;
        int objects = other.objectArgsSize - operation.getObjects();
        int objects2 = this.objectArgsSize - operation.getObjects();
        System.arraycopy(objArr, objects2, objArr2, objects, this.objectArgsSize - objects2);
        ArraysKt.B(this.objectArgs, null, this.objectArgsSize - operation.getObjects(), this.objectArgsSize);
        ArraysKt.m(this.intArgs, other.intArgs, other.intArgsSize - operation.getInts(), this.intArgsSize - operation.getInts(), this.intArgsSize);
        this.objectArgsSize -= operation.getObjects();
        this.intArgsSize -= operation.getInts();
    }

    public final void j(Operation operation) {
        if (this.opCodesSize == this.opCodes.length) {
            m();
        }
        int ints = this.intArgsSize + operation.getInts();
        int length = this.intArgs.length;
        if (ints > length) {
            k(length, ints);
        }
        int objects = this.objectArgsSize + operation.getObjects();
        int length2 = this.objectArgs.length;
        if (objects > length2) {
            l(length2, objects);
        }
        Operation[] operationArr = this.opCodes;
        int i10 = this.opCodesSize;
        this.opCodesSize = i10 + 1;
        operationArr[i10] = operation;
        this.intArgsSize += operation.getInts();
        this.objectArgsSize += operation.getObjects();
    }

    private final void k(int currentSize, int requiredSize) {
        int[] iArr = new int[b(currentSize, requiredSize)];
        ArraysKt.m(this.intArgs, iArr, 0, 0, currentSize);
        this.intArgs = iArr;
    }

    private final void l(int currentSize, int requiredSize) {
        Object[] objArr = new Object[b(currentSize, requiredSize)];
        System.arraycopy(this.objectArgs, 0, objArr, 0, currentSize);
        this.objectArgs = objArr;
    }

    public final void d(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
        if (g()) {
            a aVar = new a();
            do {
                aVar.a().execute(aVar, applier, slots, rememberManager);
            } while (aVar.b());
        }
        a();
    }

    public final boolean f() {
        if (getOpCodesSize() == 0) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (getOpCodesSize() != 0) {
            return true;
        }
        return false;
    }

    public final void i(Operation operation) {
        j(operation);
    }

    @Deprecated
    public String toString() {
        return super.toString();
    }
}
