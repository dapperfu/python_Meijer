package Xb;

import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final UUID[] f41770a;

    /* renamed from: Xb.a$a, reason: collision with other inner class name */
    public enum EnumC0897a implements Pb.a {
        GIMBAL,
        UNKNOWN,
        IBEACON
    }

    public final d a(byte[] bArr) {
        byte[] bArr2;
        try {
            l lVar = new l(bArr);
            UUID[] uuidArr = this.f41770a;
            boolean zContains = false;
            if (uuidArr != null && (bArr2 = lVar.f41817a) != null) {
                UUID uuidB = h.b(bArr2);
                if (uuidB == null) {
                    byte[][] bArr3 = e.f41794i;
                    int length = bArr3.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            break;
                        }
                        byte[] bArr4 = bArr3[i10];
                        if (bArr2[0] == bArr4[0] && bArr2[1] == bArr4[1]) {
                            zContains = true;
                            break;
                        }
                        i10++;
                    }
                } else {
                    zContains = Arrays.asList(uuidArr).contains(uuidB);
                }
            }
            if (zContains) {
                return new d(EnumC0897a.GIMBAL, lVar, null);
            }
            return null;
        } catch (com.gimbal.proximity.core.b.b unused) {
            if (bArr.length > 7) {
                byte b10 = bArr[5];
                byte b11 = bArr[6];
                if ((b10 & 255) == 76 && (b11 & 255) == 0) {
                    return new d(EnumC0897a.IBEACON, null, new vb.d(bArr));
                }
            }
            return new d(EnumC0897a.UNKNOWN, null, null);
        }
    }

    public a(UUID[] uuidArr) {
        this.f41770a = uuidArr;
    }
}
