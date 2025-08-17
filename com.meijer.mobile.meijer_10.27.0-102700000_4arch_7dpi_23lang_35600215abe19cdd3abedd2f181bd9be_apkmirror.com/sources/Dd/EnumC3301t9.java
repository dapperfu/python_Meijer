package Dd;

/* renamed from: Dd.t9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC3301t9 implements O0 {
    UNRECOGNIZED(0),
    CODE_128(1),
    CODE_39(2),
    CODE_93(3),
    CODABAR(4),
    DATA_MATRIX(5),
    EAN_13(6),
    EAN_8(7),
    ITF(8),
    QR_CODE(9),
    UPC_A(10),
    UPC_E(11),
    PDF417(12),
    AZTEC(13),
    DATABAR(14),
    TEZ_CODE(16);


    /* renamed from: a, reason: collision with root package name */
    private final int f6298a;

    @Override // Dd.O0
    public final int zza() {
        return this.f6298a;
    }

    EnumC3301t9(int i10) {
        this.f6298a = i10;
    }
}
