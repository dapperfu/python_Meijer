package com.google.zxing;

import Pg.B;
import Pg.C4597b;
import Pg.u;
import java.util.Map;

/* loaded from: classes7.dex */
public final class j implements q {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f90830a;

        static {
            int[] iArr = new int[com.google.zxing.a.values().length];
            f90830a = iArr;
            try {
                iArr[com.google.zxing.a.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90830a[com.google.zxing.a.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90830a[com.google.zxing.a.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f90830a[com.google.zxing.a.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f90830a[com.google.zxing.a.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f90830a[com.google.zxing.a.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f90830a[com.google.zxing.a.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f90830a[com.google.zxing.a.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f90830a[com.google.zxing.a.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f90830a[com.google.zxing.a.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f90830a[com.google.zxing.a.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f90830a[com.google.zxing.a.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f90830a[com.google.zxing.a.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // com.google.zxing.q
    public Gg.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<f, ?> map) throws WriterException {
        q lVar;
        switch (a.f90830a[aVar.ordinal()]) {
            case 1:
                lVar = new Pg.l();
                break;
            case 2:
                lVar = new B();
                break;
            case 3:
                lVar = new Pg.j();
                break;
            case 4:
                lVar = new u();
                break;
            case 5:
                lVar = new Yg.b();
                break;
            case 6:
                lVar = new Pg.f();
                break;
            case 7:
                lVar = new Pg.h();
                break;
            case 8:
                lVar = new Pg.d();
                break;
            case 9:
                lVar = new Pg.o();
                break;
            case 10:
                lVar = new Tg.d();
                break;
            case 11:
                lVar = new C4597b();
                break;
            case 12:
                lVar = new Jg.b();
                break;
            case 13:
                lVar = new Ag.c();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format " + aVar);
        }
        return lVar.a(str, aVar, i10, i11, map);
    }
}
