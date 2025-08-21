package Fd;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: Fd.k7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC3419k7 implements O0 {
    FORMAT_UNKNOWN(0),
    FORMAT_CODE_128(1),
    FORMAT_CODE_39(2),
    FORMAT_CODE_93(4),
    FORMAT_CODABAR(8),
    FORMAT_DATA_MATRIX(16),
    FORMAT_EAN_13(32),
    FORMAT_EAN_8(64),
    FORMAT_ITF(128),
    FORMAT_QR_CODE(256),
    FORMAT_UPC_A(512),
    FORMAT_UPC_E(1024),
    FORMAT_PDF417(RecyclerView.m.FLAG_MOVED),
    FORMAT_AZTEC(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);


    /* renamed from: a, reason: collision with root package name */
    private final int f10173a;

    @Override // Fd.O0
    public final int zza() {
        return this.f10173a;
    }

    EnumC3419k7(int i10) {
        this.f10173a = i10;
    }
}
