package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyField;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* loaded from: classes13.dex */
final class FieldSet<FieldDescriptorType extends FieldDescriptorLite<FieldDescriptorType>> {

    /* renamed from: d, reason: collision with root package name */
    private static final FieldSet f145848d = new FieldSet(true);

    /* renamed from: b, reason: collision with root package name */
    private boolean f145850b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f145851c = false;

    /* renamed from: a, reason: collision with root package name */
    private final d<FieldDescriptorType, Object> f145849a = d.s(16);

    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        int g();

        boolean h();

        WireFormat.FieldType i();

        WireFormat.JavaType j();

        boolean k();

        MessageLite.Builder x(MessageLite.Builder builder, MessageLite messageLite);
    }

    private FieldSet() {
    }

    public int k() {
        int iF = 0;
        for (int i10 = 0; i10 < this.f145849a.j(); i10++) {
            Map.Entry<K, Object> entryI = this.f145849a.i(i10);
            iF += f((FieldDescriptorLite) entryI.getKey(), entryI.getValue());
        }
        Iterator it = this.f145849a.k().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    public boolean n() {
        for (int i10 = 0; i10 < this.f145849a.j(); i10++) {
            if (!o(this.f145849a.i(i10))) {
                return false;
            }
        }
        Iterator it = this.f145849a.k().iterator();
        while (it.hasNext()) {
            if (!o((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public void r(FieldSet<FieldDescriptorType> fieldSet) {
        for (int i10 = 0; i10 < fieldSet.f145849a.j(); i10++) {
            s(fieldSet.f145849a.i(i10));
        }
        Iterator it = fieldSet.f145849a.k().iterator();
        while (it.hasNext()) {
            s((Map.Entry) it.next());
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f145852a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f145853b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f145853b = iArr;
            try {
                iArr[WireFormat.FieldType.f145897c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f145853b[WireFormat.FieldType.f145898d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f145853b[WireFormat.FieldType.f145899e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f145853b[WireFormat.FieldType.f145900f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f145853b[WireFormat.FieldType.f145901g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f145853b[WireFormat.FieldType.f145902h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f145853b[WireFormat.FieldType.f145903i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f145853b[WireFormat.FieldType.f145904j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f145853b[WireFormat.FieldType.f145905k.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f145853b[WireFormat.FieldType.f145908n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f145853b[WireFormat.FieldType.f145909o.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f145853b[WireFormat.FieldType.f145911q.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f145853b[WireFormat.FieldType.f145912r.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f145853b[WireFormat.FieldType.f145913s.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f145853b[WireFormat.FieldType.f145914t.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f145853b[WireFormat.FieldType.f145906l.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f145853b[WireFormat.FieldType.f145907m.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f145853b[WireFormat.FieldType.f145910p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f145852a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f145852a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f145852a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f145852a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f145852a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f145852a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f145852a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f145852a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f145852a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    private Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int e(WireFormat.FieldType fieldType, Object obj) {
        switch (a.f145853b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.g(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.q(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.F(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.p(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.k(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.j(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.b(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.C((String) obj);
            case 10:
                return obj instanceof ByteString ? CodedOutputStream.e((ByteString) obj) : CodedOutputStream.c((byte[]) obj);
            case 11:
                return CodedOutputStream.E(((Integer) obj).intValue());
            case 12:
                return CodedOutputStream.x(((Integer) obj).intValue());
            case 13:
                return CodedOutputStream.y(((Long) obj).longValue());
            case 14:
                return CodedOutputStream.z(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.B(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.n((MessageLite) obj);
            case 17:
                return obj instanceof LazyField ? CodedOutputStream.r((LazyField) obj) : CodedOutputStream.t((MessageLite) obj);
            case 18:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.i(((Internal.EnumLite) obj).g()) : CodedOutputStream.i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> g() {
        return f145848d;
    }

    static int l(WireFormat.FieldType fieldType, boolean z10) {
        if (z10) {
            return 2;
        }
        return fieldType.b();
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> t() {
        return new FieldSet<>();
    }

    public static Object u(CodedInputStream codedInputStream, WireFormat.FieldType fieldType, boolean z10) throws IOException {
        switch (a.f145853b[fieldType.ordinal()]) {
            case 1:
                return Double.valueOf(codedInputStream.m());
            case 2:
                return Float.valueOf(codedInputStream.q());
            case 3:
                return Long.valueOf(codedInputStream.t());
            case 4:
                return Long.valueOf(codedInputStream.M());
            case 5:
                return Integer.valueOf(codedInputStream.s());
            case 6:
                return Long.valueOf(codedInputStream.p());
            case 7:
                return Integer.valueOf(codedInputStream.o());
            case 8:
                return Boolean.valueOf(codedInputStream.k());
            case 9:
                return z10 ? codedInputStream.J() : codedInputStream.I();
            case 10:
                return codedInputStream.l();
            case 11:
                return Integer.valueOf(codedInputStream.L());
            case 12:
                return Integer.valueOf(codedInputStream.E());
            case 13:
                return Long.valueOf(codedInputStream.F());
            case 14:
                return Integer.valueOf(codedInputStream.G());
            case 15:
                return Long.valueOf(codedInputStream.H());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static void x(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i10, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.f145906l) {
            codedOutputStream.Y(i10, (MessageLite) obj);
        } else {
            codedOutputStream.w0(i10, l(fieldType, false));
            y(codedOutputStream, fieldType, obj);
        }
    }

    private static void y(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (a.f145853b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.R(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.X(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.c0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.z0(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.b0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.V(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.U(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.M(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.v0((String) obj);
                break;
            case 10:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.N((byte[]) obj);
                    break;
                } else {
                    codedOutputStream.P((ByteString) obj);
                    break;
                }
            case 11:
                codedOutputStream.y0(((Integer) obj).intValue());
                break;
            case 12:
                codedOutputStream.q0(((Integer) obj).intValue());
                break;
            case 13:
                codedOutputStream.r0(((Long) obj).longValue());
                break;
            case 14:
                codedOutputStream.s0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.u0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.Z((MessageLite) obj);
                break;
            case 17:
                codedOutputStream.e0((MessageLite) obj);
                break;
            case 18:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.T(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.T(((Internal.EnumLite) obj).g());
                    break;
                }
        }
    }

    public Object h(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f145849a.get(fielddescriptortype);
        return obj instanceof LazyField ? ((LazyField) obj).e() : obj;
    }

    public Iterator<Map.Entry<FieldDescriptorType, Object>> p() {
        return this.f145851c ? new LazyField.c(this.f145849a.entrySet().iterator()) : this.f145849a.entrySet().iterator();
    }

    public void q() {
        if (this.f145850b) {
            return;
        }
        this.f145849a.r();
        this.f145850b = true;
    }

    private static int d(WireFormat.FieldType fieldType, int i10, Object obj) {
        int iD = CodedOutputStream.D(i10);
        if (fieldType == WireFormat.FieldType.f145906l) {
            iD *= 2;
        }
        return iD + e(fieldType, obj);
    }

    public static int f(FieldDescriptorLite<?> fieldDescriptorLite, Object obj) {
        WireFormat.FieldType fieldTypeI = fieldDescriptorLite.i();
        int iG = fieldDescriptorLite.g();
        if (fieldDescriptorLite.h()) {
            int iD = 0;
            if (fieldDescriptorLite.k()) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    iD += e(fieldTypeI, it.next());
                }
                return CodedOutputStream.D(iG) + iD + CodedOutputStream.v(iD);
            }
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                iD += d(fieldTypeI, iG, it2.next());
            }
            return iD;
        }
        return d(fieldTypeI, iG, obj);
    }

    private boolean o(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.j() == WireFormat.JavaType.MESSAGE) {
            if (key.h()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((MessageLite) it.next()).a()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof MessageLite) {
                    if (!((MessageLite) value).a()) {
                        return false;
                    }
                } else {
                    if (value instanceof LazyField) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private void s(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).e();
        }
        if (key.h()) {
            Object objH = h(key);
            if (objH == null) {
                objH = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objH).add(c(it.next()));
            }
            this.f145849a.v(key, objH);
            return;
        }
        if (key.j() == WireFormat.JavaType.MESSAGE) {
            Object objH2 = h(key);
            if (objH2 == null) {
                this.f145849a.v(key, c(value));
                return;
            } else {
                this.f145849a.v(key, key.x(((MessageLite) objH2).b(), (MessageLite) value).build());
                return;
            }
        }
        this.f145849a.v(key, c(value));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void w(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType r2, java.lang.Object r3) {
        /*
            r3.getClass()
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.a.f145852a
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r2 = r2.a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L42;
                case 2: goto L3f;
                case 3: goto L3c;
                case 4: goto L39;
                case 5: goto L36;
                case 6: goto L33;
                case 7: goto L2a;
                case 8: goto L21;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            if (r2 != 0) goto L1f
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField
            if (r2 == 0) goto L1e
            goto L1f
        L1e:
            r0 = r1
        L1f:
            r1 = r0
            goto L44
        L21:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L1f
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            if (r2 == 0) goto L1e
            goto L1f
        L2a:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.ByteString
            if (r2 != 0) goto L1f
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L1e
            goto L1f
        L33:
            boolean r1 = r3 instanceof java.lang.String
            goto L44
        L36:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L44
        L39:
            boolean r1 = r3 instanceof java.lang.Double
            goto L44
        L3c:
            boolean r1 = r3 instanceof java.lang.Float
            goto L44
        L3f:
            boolean r1 = r3 instanceof java.lang.Long
            goto L44
        L42:
            boolean r1 = r3 instanceof java.lang.Integer
        L44:
            if (r1 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.w(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType, java.lang.Object):void");
    }

    public static void z(FieldDescriptorLite<?> fieldDescriptorLite, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        WireFormat.FieldType fieldTypeI = fieldDescriptorLite.i();
        int iG = fieldDescriptorLite.g();
        if (fieldDescriptorLite.h()) {
            List list = (List) obj;
            if (fieldDescriptorLite.k()) {
                codedOutputStream.w0(iG, 2);
                Iterator it = list.iterator();
                int iE = 0;
                while (it.hasNext()) {
                    iE += e(fieldTypeI, it.next());
                }
                codedOutputStream.o0(iE);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    y(codedOutputStream, fieldTypeI, it2.next());
                }
                return;
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                x(codedOutputStream, fieldTypeI, iG, it3.next());
            }
            return;
        }
        if (obj instanceof LazyField) {
            x(codedOutputStream, fieldTypeI, iG, ((LazyField) obj).e());
        } else {
            x(codedOutputStream, fieldTypeI, iG, obj);
        }
    }

    public void a(FieldDescriptorType fielddescriptortype, Object obj) {
        List arrayList;
        if (fielddescriptortype.h()) {
            w(fielddescriptortype.i(), obj);
            Object objH = h(fielddescriptortype);
            if (objH == null) {
                arrayList = new ArrayList();
                this.f145849a.v(fielddescriptortype, arrayList);
            } else {
                arrayList = (List) objH;
            }
            arrayList.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FieldSet<FieldDescriptorType> clone() {
        FieldSet<FieldDescriptorType> fieldSetT = t();
        for (int i10 = 0; i10 < this.f145849a.j(); i10++) {
            Map.Entry<K, Object> entryI = this.f145849a.i(i10);
            fieldSetT.v((FieldDescriptorLite) entryI.getKey(), entryI.getValue());
        }
        Iterator it = this.f145849a.k().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            fieldSetT.v((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        fieldSetT.f145851c = this.f145851c;
        return fieldSetT;
    }

    public Object i(FieldDescriptorType fielddescriptortype, int i10) {
        if (fielddescriptortype.h()) {
            Object objH = h(fielddescriptortype);
            if (objH != null) {
                return ((List) objH).get(i10);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int j(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.h()) {
            Object objH = h(fielddescriptortype);
            if (objH == null) {
                return 0;
            }
            return ((List) objH).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public boolean m(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.h()) {
            if (this.f145849a.get(fielddescriptortype) != null) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    public void v(FieldDescriptorType fielddescriptortype, Object obj) {
        if (fielddescriptortype.h()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    w(fielddescriptortype.i(), it.next());
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            w(fielddescriptortype.i(), obj);
        }
        if (obj instanceof LazyField) {
            this.f145851c = true;
        }
        this.f145849a.v(fielddescriptortype, obj);
    }

    private FieldSet(boolean z10) {
        q();
    }
}
