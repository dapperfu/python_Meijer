package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.medallia.digital.mobilesdk.l3;

/* loaded from: classes14.dex */
public class BitEncoding {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f146551a;

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 1 || i10 == 3 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 12 || i10 == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 3 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 12 || i10 == 14) ? 2 : 3];
        if (i10 == 1 || i10 == 3 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 12 || i10 == 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[0] = "data";
        }
        if (i10 == 1) {
            objArr[1] = "encodeBytes";
        } else if (i10 == 3) {
            objArr[1] = "encode8to7";
        } else if (i10 == 6) {
            objArr[1] = "splitBytesToStringArray";
        } else if (i10 == 8) {
            objArr[1] = "decodeBytes";
        } else if (i10 == 10) {
            objArr[1] = "dropMarker";
        } else if (i10 == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i10 != 14) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i10) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case 7:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 3 && i10 != 6 && i10 != 8 && i10 != 10 && i10 != 12 && i10 != 14) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    static {
        String property;
        try {
            property = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            property = null;
        }
        f146551a = "true".equals(property);
    }

    private static void b(byte[] bArr, int i10) {
        if (bArr == null) {
            a(4);
        }
        int length = bArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = (byte) ((bArr[i11] + i10) & l3.f93324d);
        }
    }

    private static byte[] c(String[] strArr) {
        if (strArr == null) {
            a(11);
        }
        int length = 0;
        for (String str : strArr) {
            length += str.length();
        }
        byte[] bArr = new byte[length];
        int i10 = 0;
        for (String str2 : strArr) {
            int length2 = str2.length();
            int i11 = 0;
            while (i11 < length2) {
                bArr[i10] = (byte) str2.charAt(i11);
                i11++;
                i10++;
            }
        }
        return bArr;
    }

    private static byte[] d(byte[] bArr) {
        if (bArr == null) {
            a(13);
        }
        int length = (bArr.length * 7) / 8;
        byte[] bArr2 = new byte[length];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = i10 + 1;
            int i14 = i11 + 1;
            bArr2[i12] = (byte) (((bArr[i10] & 255) >>> i11) + ((bArr[i13] & ((1 << i14) - 1)) << (7 - i11)));
            if (i11 == 6) {
                i10 += 2;
                i11 = 0;
            } else {
                i10 = i13;
                i11 = i14;
            }
        }
        return bArr2;
    }

    public static byte[] e(String[] strArr) {
        if (strArr == null) {
            a(7);
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char cCharAt = strArr[0].charAt(0);
            if (cCharAt == 0) {
                byte[] bArrA = UtfEncodingKt.a(f(strArr));
                if (bArrA == null) {
                    a(8);
                }
                return bArrA;
            }
            if (cCharAt == 65535) {
                strArr = f(strArr);
            }
        }
        byte[] bArrC = c(strArr);
        b(bArrC, l3.f93324d);
        return d(bArrC);
    }

    private static String[] f(String[] strArr) {
        if (strArr == null) {
            a(9);
        }
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[0] = strArr2[0].substring(1);
        return strArr2;
    }

    private BitEncoding() {
    }
}
