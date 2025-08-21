package Mg;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.zxing.FormatException;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: h, reason: collision with root package name */
    private static final e[] f19899h = a();

    /* renamed from: a, reason: collision with root package name */
    private final int f19900a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19901b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19902c;

    /* renamed from: d, reason: collision with root package name */
    private final int f19903d;

    /* renamed from: e, reason: collision with root package name */
    private final int f19904e;

    /* renamed from: f, reason: collision with root package name */
    private final c f19905f;

    /* renamed from: g, reason: collision with root package name */
    private final int f19906g;

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f19907a;

        /* renamed from: b, reason: collision with root package name */
        private final int f19908b;

        private b(int i10, int i11) {
            this.f19907a = i10;
            this.f19908b = i11;
        }

        int a() {
            return this.f19907a;
        }

        int b() {
            return this.f19908b;
        }
    }

    static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final int f19909a;

        /* renamed from: b, reason: collision with root package name */
        private final b[] f19910b;

        b[] a() {
            return this.f19910b;
        }

        int b() {
            return this.f19909a;
        }

        private c(int i10, b bVar) {
            this.f19909a = i10;
            this.f19910b = new b[]{bVar};
        }

        private c(int i10, b bVar, b bVar2) {
            this.f19909a = i10;
            this.f19910b = new b[]{bVar, bVar2};
        }
    }

    private static e[] a() {
        int i10 = 1;
        int i11 = 5;
        e eVar = new e(1, 10, 10, 8, 8, new c(i11, new b(i10, 3)));
        e eVar2 = new e(2, 12, 12, 10, 10, new c(7, new b(i10, i11)));
        int i12 = 8;
        e eVar3 = new e(3, 14, 14, 12, 12, new c(10, new b(i10, i12)));
        int i13 = 12;
        e eVar4 = new e(4, 16, 16, 14, 14, new c(i13, new b(i10, i13)));
        int i14 = 18;
        e eVar5 = new e(5, 18, 18, 16, 16, new c(14, new b(i10, i14)));
        e eVar6 = new e(6, 20, 20, 18, 18, new c(i14, new b(i10, 22)));
        e eVar7 = new e(7, 22, 22, 20, 20, new c(20, new b(i10, 30)));
        int i15 = 36;
        e eVar8 = new e(8, 24, 24, 22, 22, new c(24, new b(i10, i15)));
        e eVar9 = new e(9, 26, 26, 24, 24, new c(28, new b(i10, 44)));
        int i16 = 62;
        e eVar10 = new e(10, 32, 32, 14, 14, new c(i15, new b(i10, i16)));
        int i17 = 42;
        e eVar11 = new e(11, 36, 36, 16, 16, new c(i17, new b(i10, 86)));
        e eVar12 = new e(12, 40, 40, 18, 18, new c(48, new b(i10, 114)));
        int i18 = 56;
        e eVar13 = new e(13, 44, 44, 20, 20, new c(i18, new b(i10, 144)));
        int i19 = 68;
        e eVar14 = new e(14, 48, 48, 22, 22, new c(i19, new b(i10, 174)));
        int i20 = 2;
        e eVar15 = new e(15, 52, 52, 24, 24, new c(i17, new b(i20, 102)));
        e eVar16 = new e(16, 64, 64, 14, 14, new c(i18, new b(i20, 140)));
        int i21 = 4;
        e eVar17 = new e(17, 72, 72, 16, 16, new c(i15, new b(i21, 92)));
        e eVar18 = new e(18, 80, 80, 18, 18, new c(48, new b(i21, 114)));
        e eVar19 = new e(19, 88, 88, 20, 20, new c(i18, new b(i21, 144)));
        e eVar20 = new e(20, 96, 96, 22, 22, new c(i19, new b(i21, 174)));
        int i22 = 6;
        e eVar21 = new e(21, 104, 104, 24, 24, new c(i18, new b(i22, 136)));
        e eVar22 = new e(22, BinsView.TOTE_HEIGHT_DP, BinsView.TOTE_HEIGHT_DP, 18, 18, new c(i19, new b(i22, 175)));
        e eVar23 = new e(23, 132, 132, 20, 20, new c(i16, new b(i12, 163)));
        e eVar24 = new e(24, 144, 144, 22, 22, new c(i16, new b(i12, 156), new b(i20, ModuleDescriptor.MODULE_VERSION)));
        int i23 = 1;
        e eVar25 = new e(25, 8, 18, 6, 16, new c(7, new b(i23, 5)));
        e eVar26 = new e(26, 8, 32, 6, 14, new c(11, new b(i23, 10)));
        int i24 = 1;
        e eVar27 = new e(27, 12, 26, 10, 24, new c(14, new b(i24, 16)));
        e eVar28 = new e(28, 12, 36, 10, 16, new c(18, new b(i24, 22)));
        int i25 = 32;
        e eVar29 = new e(29, 16, 36, 14, 16, new c(24, new b(1, i25)));
        int i26 = 1;
        e eVar30 = new e(30, 16, 48, 14, 22, new c(28, new b(i26, 49)));
        e eVar31 = new e(31, 8, 48, 6, 22, new c(15, new b(i26, 18)));
        int i27 = 1;
        e eVar32 = new e(32, 8, 64, 6, 14, new c(18, new b(i27, 24)));
        e eVar33 = new e(33, 8, 80, 6, 18, new c(22, new b(i27, i25)));
        int i28 = 38;
        int i29 = 1;
        return new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16, eVar17, eVar18, eVar19, eVar20, eVar21, eVar22, eVar23, eVar24, eVar25, eVar26, eVar27, eVar28, eVar29, eVar30, eVar31, eVar32, eVar33, new e(34, 8, 96, 6, 22, new c(28, new b(1, i28))), new e(35, 8, BinsView.TOTE_HEIGHT_DP, 6, 18, new c(i25, new b(1, 49))), new e(36, 8, 144, 6, 22, new c(i15, new b(1, 63))), new e(37, 12, 64, 10, 14, new c(27, new b(1, 43))), new e(38, 12, 88, 10, 20, new c(i15, new b(i29, 64))), new e(39, 16, 64, 14, 14, new c(i15, new b(i29, i16))), new e(40, 20, 36, 18, 16, new c(28, new b(i29, 44))), new e(41, 20, 44, 18, 20, new c(34, new b(i29, i18))), new e(42, 20, 64, 18, 14, new c(42, new b(1, 84))), new e(43, 22, 48, 20, 22, new c(i28, new b(1, 72))), new e(44, 24, 48, 22, 22, new c(41, new b(1, 80))), new e(45, 24, 64, 22, 14, new c(46, new b(1, 108))), new e(46, 26, 40, 24, 18, new c(i28, new b(1, 70))), new e(47, 26, 48, 24, 22, new c(42, new b(1, 90))), new e(48, 26, 64, 24, 14, new c(50, new b(1, 118)))};
    }

    public static e h(int i10, int i11) throws FormatException {
        if ((i10 & 1) != 0 || (i11 & 1) != 0) {
            throw FormatException.a();
        }
        for (e eVar : f19899h) {
            if (eVar.f19901b == i10 && eVar.f19902c == i11) {
                return eVar;
            }
        }
        throw FormatException.a();
    }

    public int b() {
        return this.f19904e;
    }

    public int c() {
        return this.f19903d;
    }

    c d() {
        return this.f19905f;
    }

    public int e() {
        return this.f19902c;
    }

    public int f() {
        return this.f19901b;
    }

    public int g() {
        return this.f19906g;
    }

    public int i() {
        return this.f19900a;
    }

    public String toString() {
        return String.valueOf(this.f19900a);
    }

    private e(int i10, int i11, int i12, int i13, int i14, c cVar) {
        this.f19900a = i10;
        this.f19901b = i11;
        this.f19902c = i12;
        this.f19903d = i13;
        this.f19904e = i14;
        this.f19905f = cVar;
        int iB = cVar.b();
        int iA = 0;
        for (b bVar : cVar.a()) {
            iA += bVar.a() * (bVar.b() + iB);
        }
        this.f19906g = iA;
    }
}
