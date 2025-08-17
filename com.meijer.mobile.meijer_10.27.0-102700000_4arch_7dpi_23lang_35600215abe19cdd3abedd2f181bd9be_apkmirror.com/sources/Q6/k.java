package Q6;

import S6.e;
import S6.j;
import com.bugsnag.android.C6482m0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\u0012\u0012\u0006\b\u0000\u0012\u00020\u0011\u0012\u0006\b\u0001\u0012\u00020\u00010\u00102\u0006\u0010\u000b\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u0012\u0012\u0006\b\u0000\u0012\u00020\u0011\u0012\u0006\b\u0001\u0012\u00020\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00112\b\u0010\t\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00182\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001b\u0010\u001cRn\u0010!\u001aV\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001 \u001e*\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00100\u0010 \u001e**\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001 \u001e*\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00100\u0010\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u0012\u0004\b \u0010\u0003R:\u0010$\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001 \u001e*\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00100\u00100\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010#¨\u0006%"}, d2 = {"LQ6/k;", "", "<init>", "()V", "Lcom/bugsnag/android/m0$a;", "streamable", "", "e", "(Lcom/bugsnag/android/m0$a;)[B", "value", "Ljava/io/OutputStream;", "stream", "", "d", "(Ljava/lang/Object;Ljava/io/OutputStream;)V", "Ljava/io/InputStream;", "", "", "b", "(Ljava/io/InputStream;)Ljava/util/Map;", "Ljava/io/File;", "file", "a", "(Ljava/io/File;)Ljava/util/Map;", "", "f", "(Ljava/lang/Long;)Ljava/lang/String;", "c", "(Ljava/lang/Object;)Ljava/lang/Long;", "LS6/e$m;", "kotlin.jvm.PlatformType", "LS6/e$m;", "getSettings$annotations", "settings", "LS6/e;", "LS6/e;", "dslJson", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final e.m<Map<String, Object>> settings;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final S6.e<Map<String, Object>> dslJson;

    /* renamed from: c, reason: collision with root package name */
    public static final k f29894c = new k();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LS6/j;", "writer", "Ljava/util/Date;", "value", "", "b", "(LS6/j;Ljava/util/Date;)V"}, k = 3, mv = {1, 4, 2})
    static final class a<T> implements j.a<Date> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29895a = new a();

        @Override // S6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(S6.j jVar, Date date) throws IOException {
            if (date != null) {
                jVar.q(d.c(date));
            }
        }

        a() {
        }
    }

    public final Long c(Object value) throws NumberFormatException {
        long jLongValue;
        if (value == null) {
            return null;
        }
        if (value instanceof Number) {
            return Long.valueOf(((Number) value).longValue());
        }
        if (!(value instanceof String)) {
            throw new IllegalArgumentException("Cannot convert " + value + " to long");
        }
        String str = (String) value;
        if (str.length() == 0) {
            return null;
        }
        try {
            return Long.decode((String) value);
        } catch (NumberFormatException e10) {
            if (StringsKt.W(str, "0x", false, 2, null)) {
                if (str.length() != 18) {
                    throw e10;
                }
                int length = str.length() - 2;
                String strSubstring = str.substring(0, length);
                Intrinsics.i(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                long jLongValue2 = Long.decode(strSubstring).longValue() << 8;
                String strSubstring2 = str.substring(length, str.length());
                Intrinsics.i(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                jLongValue = Long.parseLong(strSubstring2, CharsKt.a(16)) | jLongValue2;
            } else {
                if (str.length() < 19) {
                    throw e10;
                }
                int length2 = str.length() - 3;
                String strSubstring3 = str.substring(0, length2);
                Intrinsics.i(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                long jLongValue3 = Long.decode(strSubstring3).longValue() * 1000;
                String strSubstring4 = str.substring(length2, str.length());
                Intrinsics.i(strSubstring4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                Long lDecode = Long.decode(strSubstring4);
                Intrinsics.f(lDecode, "java.lang.Long.decode(va…eadLength, value.length))");
                jLongValue = lDecode.longValue() + jLongValue3;
            }
            return Long.valueOf(jLongValue);
        }
    }

    static {
        e.m<Map<String, Object>> mVarT = new e.m().t(new e());
        settings = mVarT;
        S6.e<Map<String, Object>> eVar = new S6.e<>(mVarT);
        dslJson = eVar;
        eVar.u(Date.class, a.f29895a);
    }

    public final Map<? super String, ? extends Object> a(File file) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                Map<? super String, ? extends Object> mapB = f29894c.b(fileInputStream);
                CloseableKt.a(fileInputStream, null);
                return mapB;
            } finally {
            }
        } catch (FileNotFoundException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new IOException("Could not deserialize from " + file, e11);
        }
    }

    public final Map<? super String, ? extends Object> b(InputStream stream) {
        Map map = (Map) dslJson.k(Map.class, stream);
        if (map != null) {
            return TypeIntrinsics.d(map);
        }
        throw new IllegalArgumentException("JSON document is invalid");
    }

    public final void d(Object value, OutputStream stream) throws IOException {
        dslJson.x(value, stream);
    }

    public final byte[] e(C6482m0.a streamable) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C6482m0 c6482m0 = new C6482m0(new PrintWriter(byteArrayOutputStream));
            try {
                streamable.toStream(c6482m0);
                Unit unit = Unit.f142422a;
                CloseableKt.a(c6482m0, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                CloseableKt.a(byteArrayOutputStream, null);
                Intrinsics.f(byteArray, "ByteArrayOutputStream().…s.toByteArray()\n        }");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public final String f(Long value) {
        if (value == null) {
            return null;
        }
        if (value.longValue() >= 0) {
            String str = String.format("0x%x", Arrays.copyOf(new Object[]{value}, 1));
            Intrinsics.i(str, "java.lang.String.format(this, *args)");
            return str;
        }
        String str2 = String.format("0x%x%02x", Arrays.copyOf(new Object[]{Long.valueOf(value.longValue() >>> 8), Long.valueOf(value.longValue() & 255)}, 2));
        Intrinsics.i(str2, "java.lang.String.format(this, *args)");
        return str2;
    }

    private k() {
    }
}
