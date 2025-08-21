package Xb;

import androidx.recyclerview.widget.RecyclerView;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.nio.ByteOrder;
import java.util.UUID;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static C13784a f41796a = C13785b.a(h.class.getSimpleName());

    /* renamed from: b, reason: collision with root package name */
    private static C13786c f41797b = C13787d.a(h.class.getSimpleName());

    public static UUID b(byte[] bArr) {
        if (bArr == null || bArr.length != 16) {
            return null;
        }
        return UUID.fromString(String.format("%02x%02x%02x%02x-%02x%02x-%02x%02x-%02x%02x-%02x%02x%02x%02x%02x%02x", Byte.valueOf(bArr[15]), Byte.valueOf(bArr[14]), Byte.valueOf(bArr[13]), Byte.valueOf(bArr[12]), Byte.valueOf(bArr[11]), Byte.valueOf(bArr[10]), Byte.valueOf(bArr[9]), Byte.valueOf(bArr[8]), Byte.valueOf(bArr[7]), Byte.valueOf(bArr[6]), Byte.valueOf(bArr[5]), Byte.valueOf(bArr[4]), Byte.valueOf(bArr[3]), Byte.valueOf(bArr[2]), Byte.valueOf(bArr[1]), Byte.valueOf(bArr[0])));
    }

    public static UUID[] c() {
        UUID[] uuidArr = new UUID[5121];
        try {
            String str = e.f41787b;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i11 <= 4095) {
                uuidArr[i12] = UUID.fromString(str.concat(String.format("%03x", Integer.valueOf(i11))));
                i11++;
                i12++;
            }
            String str2 = e.f41789d;
            while (i10 <= 1023) {
                String strConcat = str2.concat(String.format("%03x", Integer.valueOf(i10 + RecyclerView.m.FLAG_MOVED))).concat(e.f41790e);
                a(strConcat);
                uuidArr[i12] = UUID.fromString(strConcat);
                i10++;
                i12++;
            }
            uuidArr[i12] = UUID.fromString(e.f41788c);
            ByteOrder.nativeOrder();
            return uuidArr;
        } catch (Exception e10) {
            f41797b.g("Got exception while creating UUIDs", e10);
            return uuidArr;
        }
    }

    public static String a(String str) {
        byte[] bytes = str.getBytes();
        int i10 = 0;
        int i11 = 0;
        for (int length = bytes.length - 1; i11 < length; length--) {
            byte b10 = bytes[i11];
            bytes[i11] = bytes[length];
            bytes[length] = b10;
            i11++;
        }
        while (i10 < bytes.length) {
            byte b11 = bytes[i10];
            if (b11 != 45) {
                int i12 = i10 + 1;
                bytes[i10] = bytes[i12];
                bytes[i12] = b11;
            } else {
                bytes[i10] = b11;
                int i13 = i10 + 1;
                byte b12 = bytes[i13];
                int i14 = i10 + 2;
                bytes[i13] = bytes[i14];
                bytes[i14] = b12;
                i10 = i13;
            }
            i10 += 2;
        }
        return new String(bytes);
    }
}
