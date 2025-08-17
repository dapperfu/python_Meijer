package androidx.work;

import N4.AbstractC4333v;
import N4.C4317e;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 \"2\u00020\u0001:\u0002\u001d\"B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0010\u0012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0003\u0010\bJ\u001d\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\n\"\u0004\b\u0000\u0010\u00102\u0006\u0010\t\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001f\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Landroidx/work/b;", "", "other", "<init>", "(Landroidx/work/b;)V", "", "", "values", "(Ljava/util/Map;)V", "key", "", "defaultValue", "c", "(Ljava/lang/String;Z)Z", "e", "(Ljava/lang/String;)Ljava/lang/String;", "T", "Ljava/lang/Class;", "klass", "f", "(Ljava/lang/String;Ljava/lang/Class;)Z", "", "g", "()I", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "a", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "keyValueMap", "b", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final b f59153c = new a().a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> values;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u00002\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0016\u0010\bJ\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/work/b$a;", "", "<init>", "()V", "", "key", "value", "f", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/b$a;", "", "e", "(Ljava/lang/String;Z)Landroidx/work/b$a;", "g", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;", "Landroidx/work/b;", "data", "c", "(Landroidx/work/b;)Landroidx/work/b$a;", "", "values", "d", "(Ljava/util/Map;)Landroidx/work/b$a;", "b", "a", "()Landroidx/work/b;", "", "Ljava/util/Map;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> values = new LinkedHashMap();

        private final a f(String key, Object value) {
            this.values.put(key, value);
            return this;
        }

        public final b a() {
            b bVar = new b((Map<String, ?>) this.values);
            b.INSTANCE.e(bVar);
            return bVar;
        }

        public final a b(String key, Object value) {
            Intrinsics.j(key, "key");
            Map<String, Object> map = this.values;
            if (value == null) {
                value = null;
            } else {
                KClass kClassB = Reflection.b(value.getClass());
                if (!(Intrinsics.e(kClassB, Reflection.b(Boolean.TYPE)) ? true : Intrinsics.e(kClassB, Reflection.b(Byte.TYPE)) ? true : Intrinsics.e(kClassB, Reflection.b(Integer.TYPE)) ? true : Intrinsics.e(kClassB, Reflection.b(Long.TYPE)) ? true : Intrinsics.e(kClassB, Reflection.b(Float.TYPE)) ? true : Intrinsics.e(kClassB, Reflection.b(Double.TYPE)) ? true : Intrinsics.e(kClassB, Reflection.b(String.class)) ? true : Intrinsics.e(kClassB, Reflection.b(Boolean[].class)) ? true : Intrinsics.e(kClassB, Reflection.b(Byte[].class)) ? true : Intrinsics.e(kClassB, Reflection.b(Integer[].class)) ? true : Intrinsics.e(kClassB, Reflection.b(Long[].class)) ? true : Intrinsics.e(kClassB, Reflection.b(Float[].class)) ? true : Intrinsics.e(kClassB, Reflection.b(Double[].class)) ? true : Intrinsics.e(kClassB, Reflection.b(String[].class)))) {
                    if (Intrinsics.e(kClassB, Reflection.b(boolean[].class))) {
                        value = C4317e.h((boolean[]) value);
                    } else if (Intrinsics.e(kClassB, Reflection.b(byte[].class))) {
                        value = C4317e.i((byte[]) value);
                    } else if (Intrinsics.e(kClassB, Reflection.b(int[].class))) {
                        value = C4317e.l((int[]) value);
                    } else if (Intrinsics.e(kClassB, Reflection.b(long[].class))) {
                        value = C4317e.m((long[]) value);
                    } else if (Intrinsics.e(kClassB, Reflection.b(float[].class))) {
                        value = C4317e.k((float[]) value);
                    } else {
                        if (!Intrinsics.e(kClassB, Reflection.b(double[].class))) {
                            throw new IllegalArgumentException("Key " + key + " has invalid type " + kClassB);
                        }
                        value = C4317e.j((double[]) value);
                    }
                }
            }
            map.put(key, value);
            return this;
        }

        public final a c(b data) {
            Intrinsics.j(data, "data");
            d(data.values);
            return this;
        }

        public final a d(Map<String, ? extends Object> values) {
            Intrinsics.j(values, "values");
            for (Map.Entry<String, ? extends Object> entry : values.entrySet()) {
                b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final a e(String key, boolean value) {
            Intrinsics.j(key, "key");
            return f(key, Boolean.valueOf(value));
        }

        public final a g(String key, String value) {
            Intrinsics.j(key, "key");
            return f(key, value);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u0014\u0010 \u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0014\u0010!\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u0014\u0010\"\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u0014\u0010#\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u0014\u0010$\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u0014\u0010%\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u0014\u0010&\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0014\u0010'\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u0014\u0010(\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u001a¨\u0006)"}, d2 = {"Landroidx/work/b$b;", "", "<init>", "()V", "Landroidx/work/b;", "data", "", "e", "(Landroidx/work/b;)[B", "bytes", "a", "([B)Landroidx/work/b;", "EMPTY", "Landroidx/work/b;", "", "MAX_DATA_BYTES", "I", "", "NULL_STRING_V1", "Ljava/lang/String;", "", "STREAM_MAGIC", "S", "STREAM_VERSION", "", "TYPE_BOOLEAN", "B", "TYPE_BOOLEAN_ARRAY", "TYPE_BYTE", "TYPE_BYTE_ARRAY", "TYPE_DOUBLE", "TYPE_DOUBLE_ARRAY", "TYPE_FLOAT", "TYPE_FLOAT_ARRAY", "TYPE_INTEGER", "TYPE_INTEGER_ARRAY", "TYPE_LONG", "TYPE_LONG_ARRAY", "TYPE_NULL", "TYPE_STRING", "TYPE_STRING_ARRAY", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.work.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static final boolean b(ByteArrayInputStream byteArrayInputStream) throws IOException {
            byte[] bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            byte b10 = (byte) (-21267);
            boolean z10 = false;
            if (bArr[0] == ((byte) 16777132) && bArr[1] == b10) {
                z10 = true;
            }
            byteArrayInputStream.reset();
            return z10;
        }

        private static final Object d(DataInputStream dataInputStream, byte b10) throws IOException {
            if (b10 == 0) {
                return null;
            }
            if (b10 == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b10 == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b10 == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b10 == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b10 == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b10 == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b10 == 7) {
                return dataInputStream.readUTF();
            }
            int i10 = 0;
            if (b10 == 8) {
                int i11 = dataInputStream.readInt();
                Boolean[] boolArr = new Boolean[i11];
                while (i10 < i11) {
                    boolArr[i10] = Boolean.valueOf(dataInputStream.readBoolean());
                    i10++;
                }
                return boolArr;
            }
            if (b10 == 9) {
                int i12 = dataInputStream.readInt();
                Byte[] bArr = new Byte[i12];
                while (i10 < i12) {
                    bArr[i10] = Byte.valueOf(dataInputStream.readByte());
                    i10++;
                }
                return bArr;
            }
            if (b10 == 10) {
                int i13 = dataInputStream.readInt();
                Integer[] numArr = new Integer[i13];
                while (i10 < i13) {
                    numArr[i10] = Integer.valueOf(dataInputStream.readInt());
                    i10++;
                }
                return numArr;
            }
            if (b10 == 11) {
                int i14 = dataInputStream.readInt();
                Long[] lArr = new Long[i14];
                while (i10 < i14) {
                    lArr[i10] = Long.valueOf(dataInputStream.readLong());
                    i10++;
                }
                return lArr;
            }
            if (b10 == 12) {
                int i15 = dataInputStream.readInt();
                Float[] fArr = new Float[i15];
                while (i10 < i15) {
                    fArr[i10] = Float.valueOf(dataInputStream.readFloat());
                    i10++;
                }
                return fArr;
            }
            if (b10 == 13) {
                int i16 = dataInputStream.readInt();
                Double[] dArr = new Double[i16];
                while (i10 < i16) {
                    dArr[i10] = Double.valueOf(dataInputStream.readDouble());
                    i10++;
                }
                return dArr;
            }
            if (b10 != 14) {
                throw new IllegalStateException("Unsupported type " + ((int) b10));
            }
            int i17 = dataInputStream.readInt();
            String[] strArr = new String[i17];
            while (i10 < i17) {
                String utf = dataInputStream.readUTF();
                if (Intrinsics.e(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    utf = null;
                }
                strArr[i10] = utf;
                i10++;
            }
            return strArr;
        }

        private Companion() {
        }

        private static final void g(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalArgumentException("Unsupported value type " + Reflection.b(obj.getClass()).u());
                }
                f(dataOutputStream, (Object[]) obj);
            }
            dataOutputStream.writeUTF(str);
        }

        private static final void h(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeShort(-21521);
            dataOutputStream.writeShort(1);
        }

        @JvmStatic
        public final b a(byte[] bytes) {
            Intrinsics.j(bytes, "bytes");
            if (bytes.length > 10240) {
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            }
            if (bytes.length == 0) {
                return b.f59153c;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                int i10 = 0;
                if (b(byteArrayInputStream)) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int i11 = objectInputStream.readInt();
                        while (i10 < i11) {
                            String utf = objectInputStream.readUTF();
                            Intrinsics.i(utf, "readUTF()");
                            linkedHashMap.put(utf, objectInputStream.readObject());
                            i10++;
                        }
                        CloseableKt.a(objectInputStream, null);
                    } finally {
                    }
                } else {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        c(dataInputStream);
                        int i12 = dataInputStream.readInt();
                        while (i10 < i12) {
                            Object objD = d(dataInputStream, dataInputStream.readByte());
                            String key = dataInputStream.readUTF();
                            Intrinsics.i(key, "key");
                            linkedHashMap.put(key, objD);
                            i10++;
                        }
                        CloseableKt.a(dataInputStream, null);
                    } finally {
                    }
                }
            } catch (IOException e10) {
                AbstractC4333v.e().d(C4317e.f21402a, "Error in Data#fromByteArray: ", e10);
            } catch (ClassNotFoundException e11) {
                AbstractC4333v.e().d(C4317e.f21402a, "Error in Data#fromByteArray: ", e11);
            }
            return new b(linkedHashMap);
        }

        @JvmStatic
        public final byte[] e(b data) {
            Intrinsics.j(data, "data");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    h(dataOutputStream);
                    dataOutputStream.writeInt(data.g());
                    for (Map.Entry entry : data.values.entrySet()) {
                        g(dataOutputStream, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream.flush();
                    if (dataOutputStream.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    CloseableKt.a(dataOutputStream, null);
                    Intrinsics.i(byteArray, "{\n                ByteAr…          }\n            }");
                    return byteArray;
                } finally {
                }
            } catch (IOException e10) {
                AbstractC4333v.e().d(C4317e.f21402a, "Error in Data#toByteArray: ", e10);
                return new byte[0];
            }
        }

        private static final void c(DataInputStream dataInputStream) throws IOException {
            short s10 = dataInputStream.readShort();
            if (s10 == -21521) {
                short s11 = dataInputStream.readShort();
                if (s11 == 1) {
                    return;
                }
                throw new IllegalStateException(("Unsupported version number: " + ((int) s11)).toString());
            }
            throw new IllegalStateException(("Magic number doesn't match: " + ((int) s10)).toString());
        }

        private static final void f(DataOutputStream dataOutputStream, Object[] objArr) throws IOException {
            int i10;
            double dDoubleValue;
            float fFloatValue;
            long jLongValue;
            int iIntValue;
            byte bByteValue;
            boolean zBooleanValue;
            KClass kClassB = Reflection.b(objArr.getClass());
            if (Intrinsics.e(kClassB, Reflection.b(Boolean[].class))) {
                i10 = 8;
            } else if (Intrinsics.e(kClassB, Reflection.b(Byte[].class))) {
                i10 = 9;
            } else if (Intrinsics.e(kClassB, Reflection.b(Integer[].class))) {
                i10 = 10;
            } else if (Intrinsics.e(kClassB, Reflection.b(Long[].class))) {
                i10 = 11;
            } else if (Intrinsics.e(kClassB, Reflection.b(Float[].class))) {
                i10 = 12;
            } else if (Intrinsics.e(kClassB, Reflection.b(Double[].class))) {
                i10 = 13;
            } else if (Intrinsics.e(kClassB, Reflection.b(String[].class))) {
                i10 = 14;
            } else {
                throw new IllegalArgumentException("Unsupported value type " + Reflection.b(objArr.getClass()).t());
            }
            dataOutputStream.writeByte(i10);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj : objArr) {
                String str = null;
                Boolean bool = null;
                Byte b10 = null;
                Integer num = null;
                Long l10 = null;
                Float f10 = null;
                Double d10 = null;
                if (i10 == 8) {
                    if (obj instanceof Boolean) {
                        bool = (Boolean) obj;
                    }
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    dataOutputStream.writeBoolean(zBooleanValue);
                } else if (i10 == 9) {
                    if (obj instanceof Byte) {
                        b10 = (Byte) obj;
                    }
                    if (b10 != null) {
                        bByteValue = b10.byteValue();
                    } else {
                        bByteValue = 0;
                    }
                    dataOutputStream.writeByte(bByteValue);
                } else if (i10 == 10) {
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    }
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    dataOutputStream.writeInt(iIntValue);
                } else if (i10 == 11) {
                    if (obj instanceof Long) {
                        l10 = (Long) obj;
                    }
                    if (l10 != null) {
                        jLongValue = l10.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    dataOutputStream.writeLong(jLongValue);
                } else if (i10 == 12) {
                    if (obj instanceof Float) {
                        f10 = (Float) obj;
                    }
                    if (f10 != null) {
                        fFloatValue = f10.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    dataOutputStream.writeFloat(fFloatValue);
                } else if (i10 == 13) {
                    if (obj instanceof Double) {
                        d10 = (Double) obj;
                    }
                    if (d10 != null) {
                        dDoubleValue = d10.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    dataOutputStream.writeDouble(dDoubleValue);
                } else if (i10 == 14) {
                    if (obj instanceof String) {
                        str = (String) obj;
                    }
                    if (str == null) {
                        str = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "<name for destructuring parameter 0>", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class c extends Lambda implements Function1<Map.Entry<? extends String, ? extends Object>, CharSequence> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f59156f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry<String, ? extends Object> entry) {
            Intrinsics.j(entry, "<name for destructuring parameter 0>");
            String key = entry.getKey();
            Object value = entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(key);
            sb2.append(" : ");
            if (value instanceof Object[]) {
                value = Arrays.toString((Object[]) value);
                Intrinsics.i(value, "toString(this)");
            }
            sb2.append(value);
            return sb2.toString();
        }
    }

    public b(b other) {
        Intrinsics.j(other, "other");
        this.values = new HashMap(other.values);
    }

    @JvmStatic
    public static final b b(byte[] bArr) {
        return INSTANCE.a(bArr);
    }

    @JvmStatic
    public static final byte[] h(b bVar) {
        return INSTANCE.e(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L6a
            java.lang.Class<androidx.work.b> r2 = androidx.work.b.class
            java.lang.Class r3 = r8.getClass()
            boolean r2 = kotlin.jvm.internal.Intrinsics.e(r2, r3)
            if (r2 != 0) goto L14
            goto L6a
        L14:
            androidx.work.b r8 = (androidx.work.b) r8
            java.util.Map<java.lang.String, java.lang.Object> r2 = r7.values
            java.util.Set r2 = r2.keySet()
            java.util.Map<java.lang.String, java.lang.Object> r3 = r8.values
            java.util.Set r3 = r3.keySet()
            boolean r3 = kotlin.jvm.internal.Intrinsics.e(r2, r3)
            if (r3 != 0) goto L29
            return r1
        L29:
            java.util.Iterator r2 = r2.iterator()
        L2d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L69
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map<java.lang.String, java.lang.Object> r4 = r7.values
            java.lang.Object r4 = r4.get(r3)
            java.util.Map<java.lang.String, java.lang.Object> r5 = r8.values
            java.lang.Object r3 = r5.get(r3)
            if (r4 == 0) goto L61
            if (r3 != 0) goto L4a
            goto L61
        L4a:
            boolean r5 = r4 instanceof java.lang.Object[]
            if (r5 == 0) goto L5c
            r5 = r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            boolean r6 = r3 instanceof java.lang.Object[]
            if (r6 == 0) goto L5c
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            boolean r3 = kotlin.collections.ArraysKt.d(r5, r3)
            goto L66
        L5c:
            boolean r3 = kotlin.jvm.internal.Intrinsics.e(r4, r3)
            goto L66
        L61:
            if (r4 != r3) goto L65
            r3 = r0
            goto L66
        L65:
            r3 = r1
        L66:
            if (r3 != 0) goto L2d
            return r1
        L69:
            return r0
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.b.equals(java.lang.Object):boolean");
    }

    public final boolean c(String key, boolean defaultValue) {
        Intrinsics.j(key, "key");
        Object objValueOf = Boolean.valueOf(defaultValue);
        Object obj = this.values.get(key);
        if (obj instanceof Boolean) {
            objValueOf = obj;
        }
        return ((Boolean) objValueOf).booleanValue();
    }

    public final Map<String, Object> d() {
        Map<String, Object> mapUnmodifiableMap = Collections.unmodifiableMap(this.values);
        Intrinsics.i(mapUnmodifiableMap, "unmodifiableMap(values)");
        return mapUnmodifiableMap;
    }

    public final String e(String key) {
        Intrinsics.j(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final <T> boolean f(String key, Class<T> klass) {
        Intrinsics.j(key, "key");
        Intrinsics.j(klass, "klass");
        Object obj = this.values.get(key);
        return obj != null && klass.isAssignableFrom(obj.getClass());
    }

    public final int g() {
        return this.values.size();
    }

    public int hashCode() {
        int iHashCode = 0;
        for (Map.Entry<String, Object> entry : this.values.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ ArraysKt.b((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public String toString() {
        String str = "Data {" + CollectionsKt.B0(this.values.entrySet(), null, null, null, 0, null, c.f59156f, 31, null) + "}";
        Intrinsics.i(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    public b(Map<String, ?> values) {
        Intrinsics.j(values, "values");
        this.values = new HashMap(values);
    }
}
