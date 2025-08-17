package Vb;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f37103c = {3, 7};

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f37104d = {-1};

    /* renamed from: a, reason: collision with root package name */
    public byte[] f37105a;

    /* renamed from: b, reason: collision with root package name */
    public o f37106b;

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
        return String.format("AdvertisementData:[serviceId:%s], [manufacturerSpecificData: %s", Sb.a.a(this.f37105a), this.f37106b.toString());
    }

    public l(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            byte bA = a(bArr, (byte) 0);
            b(bArr, (byte) 1, f37103c);
            if (bA != 2 && bA != 16) {
                throw new com.gimbal.proximity.core.b.b(com.gimbal.proximity.core.b.a.PROXIMITY_INTERNAL_BLE_ADV_NON_QC);
            }
            int i10 = bA + 2;
            this.f37105a = Arrays.copyOfRange(bArr, 2, i10);
            byte b10 = (byte) i10;
            byte b11 = (byte) (b10 + 1);
            byte bA2 = a(bArr, b10);
            byte b12 = (byte) (b11 + 1);
            b(bArr, b11, f37104d);
            if (bA2 >= 2) {
                o oVar = new o();
                this.f37106b = oVar;
                int i11 = bA2 + b12;
                oVar.f37126c = Arrays.copyOfRange(bArr, (int) b12, i11);
                int i12 = b12 + 2;
                this.f37106b.f37124a = Arrays.copyOfRange(bArr, (int) b12, i12);
                this.f37106b.f37125b = Arrays.copyOfRange(bArr, i12, i11);
                return;
            }
            throw new com.gimbal.proximity.core.b.b(com.gimbal.proximity.core.b.a.PROXIMITY_INTERNAL_BLE_ADV_INVALID);
        }
        throw new com.gimbal.proximity.core.b.b(com.gimbal.proximity.core.b.a.PROXIMITY_INTERNAL_BLE_ADV_INVALID);
    }
}
