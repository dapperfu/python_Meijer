package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes14.dex */
public class Internal {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f146781a;

    /* renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f146782b;

    public interface EnumLite {
        int g();
    }

    public interface EnumLiteMap<T extends EnumLite> {
        T a(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f146781a = bArr;
        f146782b = ByteBuffer.wrap(bArr);
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    public static boolean a(byte[] bArr) {
        return e.e(bArr);
    }
}
