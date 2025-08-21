package R6;

import U6.e;
import U6.j;
import com.bugsnag.android.C6624v0;
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

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\u0012\u0012\u0006\b\u0000\u0012\u00020\u0011\u0012\u0006\b\u0001\u0012\u00020\u00010\u00102\u0006\u0010\u000b\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u0012\u0012\u0006\b\u0000\u0012\u00020\u0011\u0012\u0006\b\u0001\u0012\u00020\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00112\b\u0010\t\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00182\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001b\u0010\u001cRn\u0010\"\u001aV\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001 \u001e*\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00100\u0010 \u001e**\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001 \u001e*\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00100\u0010\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u0012\u0004\b!\u0010\u0003R:\u0010%\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001 \u001e*\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00100\u00100#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010$¨\u0006&"}, d2 = {"LR6/q;", "", "<init>", "()V", "Lcom/bugsnag/android/v0$a;", "streamable", "", "g", "(Lcom/bugsnag/android/v0$a;)[B", "value", "Ljava/io/OutputStream;", "stream", "", "f", "(Ljava/lang/Object;Ljava/io/OutputStream;)V", "Ljava/io/InputStream;", "", "", "d", "(Ljava/io/InputStream;)Ljava/util/Map;", "Ljava/io/File;", "file", "c", "(Ljava/io/File;)Ljava/util/Map;", "", "h", "(Ljava/lang/Long;)Ljava/lang/String;", "e", "(Ljava/lang/Object;)Ljava/lang/Long;", "LU6/e$m;", "kotlin.jvm.PlatformType", "b", "LU6/e$m;", "getSettings$annotations", "settings", "LU6/e;", "LU6/e;", "dslJson", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f32021a = new q();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final e.m<Map<String, Object>> settings;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final U6.e<Map<String, Object>> dslJson;

    public final Long e(Object value) {
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
                Intrinsics.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                long jLongValue2 = Long.decode(strSubstring).longValue() << 8;
                String strSubstring2 = str.substring(length, str.length());
                Intrinsics.i(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                jLongValue = Long.parseLong(strSubstring2, CharsKt.a(16)) | jLongValue2;
            } else {
                if (str.length() < 19) {
                    throw e10;
                }
                int length2 = str.length() - 3;
                String strSubstring3 = str.substring(0, length2);
                Intrinsics.i(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                long jLongValue3 = Long.decode(strSubstring3).longValue() * 1000;
                String strSubstring4 = str.substring(length2, str.length());
                Intrinsics.i(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                jLongValue = Long.decode(strSubstring4).longValue() + jLongValue3;
            }
            return Long.valueOf(jLongValue);
        }
    }

    static {
        e.m<Map<String, Object>> mVarT = new e.m().t(new i());
        settings = mVarT;
        U6.e<Map<String, Object>> eVar = new U6.e<>(mVarT);
        dslJson = eVar;
        eVar.u(Date.class, new j.a() { // from class: R6.p
            @Override // U6.j.a
            public final void a(U6.j jVar, Object obj) throws IOException {
                q.b(jVar, (Date) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(U6.j jVar, Date date) throws IOException {
        if (date == null) {
            return;
        }
        jVar.q(g.c(date));
    }

    public final Map<? super String, ? extends Object> c(File file) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                Map<? super String, ? extends Object> mapD = f32021a.d(fileInputStream);
                CloseableKt.a(fileInputStream, null);
                return mapD;
            } finally {
            }
        } catch (FileNotFoundException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new IOException(Intrinsics.q("Could not deserialize from ", file), e11);
        }
    }

    public final Map<? super String, ? extends Object> d(InputStream stream) {
        Map map = (Map) dslJson.k(Map.class, stream);
        if (map != null) {
            return TypeIntrinsics.d(map);
        }
        throw new IllegalArgumentException("JSON document is invalid");
    }

    public final void f(Object value, OutputStream stream) throws IOException {
        dslJson.x(value, stream);
    }

    public final byte[] g(C6624v0.a streamable) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C6624v0 c6624v0 = new C6624v0(new PrintWriter(byteArrayOutputStream));
            try {
                streamable.toStream(c6624v0);
                Unit unit = Unit.f143329a;
                CloseableKt.a(c6624v0, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                CloseableKt.a(byteArrayOutputStream, null);
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public final String h(Long value) {
        if (value == null) {
            return null;
        }
        if (value.longValue() >= 0) {
            String str = String.format("0x%x", Arrays.copyOf(new Object[]{value}, 1));
            Intrinsics.i(str, "format(this, *args)");
            return str;
        }
        String str2 = String.format("0x%x%02x", Arrays.copyOf(new Object[]{Long.valueOf(value.longValue() >>> 8), Long.valueOf(value.longValue() & 255)}, 2));
        Intrinsics.i(str2, "format(this, *args)");
        return str2;
    }

    private q() {
    }
}
