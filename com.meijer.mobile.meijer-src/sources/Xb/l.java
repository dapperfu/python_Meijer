package Xb;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f41815c = {3, 7};

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f41816d = {-1};

    /* renamed from: a, reason: collision with root package name */
    public byte[] f41817a;

    /* renamed from: b, reason: collision with root package name */
    public o f41818b;

    private static byte a(byte[] bArr, byte b10) {
        if (bArr == null || b10 >= bArr.length || b10 < 0) {
            throw new com.gimbal.proximity.core.b.b(com.gimbal.proximity.core.b.a.PROXIMITY_INTERNAL_BLE_ADV_INVALID);
        }
        byte b11 = (byte) (bArr[b10] & 255);
        if (bArr.length > b10 + b11) {
            return (byte) (b11 - 1);
        }
        throw new com.gimbal.proximity.core.b.b(com.gimbal.proximity.core.b.a.PROXIMITY_INTERNAL_BLE_ADV_INVALID);
    }

    private static byte b(byte[] bArr, byte b10, byte[] bArr2) {
        if (bArr == null || b10 >= bArr.length || b10 < 0) {
            throw new com.gimbal.proximity.core.b.b(com.gimbal.proximity.core.b.a.PROXIMITY_INTERNAL_BLE_ADV_INVALID);
        }
        byte b11 = (byte) (bArr[b10] & 255);
        for (byte b12 : bArr2) {
            if (b11 == b12) {
                return b11;
            }
        }
        throw new com.gimbal.proximity.core.b.b(com.gimbal.proximity.core.b.a.PROXIMITY_INTERNAL_BLE_ADV_NON_QC);
    }

    public final String toString() {
        return String.format("AdvertisementData:[serviceId:%s], [manufacturerSpecificData: %s", Ub.a.a(this.f41817a), this.f41818b.toString());
    }

    public l(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            byte bA = a(bArr, (byte) 0);
            b(bArr, (byte) 1, f41815c);
            if (bA != 2 && bA != 16) {
                throw new com.gimbal.proximity.core.b.b(com.gimbal.proximity.core.b.a.PROXIMITY_INTERNAL_BLE_ADV_NON_QC);
            }
            int i10 = bA + 2;
            this.f41817a = Arrays.copyOfRange(bArr, 2, i10);
            byte b10 = (byte) i10;
            byte b11 = (byte) (b10 + 1);
            byte bA2 = a(bArr, b10);
            byte b12 = (byte) (b11 + 1);
            b(bArr, b11, f41816d);
            if (bA2 >= 2) {
                o oVar = new o();
                this.f41818b = oVar;
                int i11 = bA2 + b12;
                oVar.f41838c = Arrays.copyOfRange(bArr, (int) b12, i11);
                int i12 = b12 + 2;
                this.f41818b.f41836a = Arrays.copyOfRange(bArr, (int) b12, i12);
                this.f41818b.f41837b = Arrays.copyOfRange(bArr, i12, i11);
                return;
            }
            throw new com.gimbal.proximity.core.b.b(com.gimbal.proximity.core.b.a.PROXIMITY_INTERNAL_BLE_ADV_INVALID);
        }
        throw new com.gimbal.proximity.core.b.b(com.gimbal.proximity.core.b.a.PROXIMITY_INTERNAL_BLE_ADV_INVALID);
    }
}
