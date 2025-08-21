package com.google.zxing;

import Rg.B;
import Rg.C5218b;
import Rg.u;
import ah.C5690b;
import java.util.Map;

/* loaded from: classes8.dex */
public final class j implements q {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f91669a;

        static {
            int[] iArr = new int[com.google.zxing.a.values().length];
            f91669a = iArr;
            try {
                iArr[com.google.zxing.a.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f91669a[com.google.zxing.a.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f91669a[com.google.zxing.a.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f91669a[com.google.zxing.a.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f91669a[com.google.zxing.a.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f91669a[com.google.zxing.a.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f91669a[com.google.zxing.a.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f91669a[com.google.zxing.a.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f91669a[com.google.zxing.a.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f91669a[com.google.zxing.a.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f91669a[com.google.zxing.a.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f91669a[com.google.zxing.a.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f91669a[com.google.zxing.a.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // com.google.zxing.q
    public Ig.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<f, ?> map) throws WriterException {
        q lVar;
        switch (a.f91669a[aVar.ordinal()]) {
            case 1:
                lVar = new Rg.l();
                break;
            case 2:
                lVar = new B();
                break;
            case 3:
                lVar = new Rg.j();
                break;
            case 4:
                lVar = new u();
                break;
            case 5:
                lVar = new C5690b();
                break;
            case 6:
                lVar = new Rg.f();
                break;
            case 7:
                lVar = new Rg.h();
                break;
            case 8:
                lVar = new Rg.d();
                break;
            case 9:
                lVar = new Rg.o();
                break;
            case 10:
                lVar = new Vg.d();
                break;
            case 11:
                lVar = new C5218b();
                break;
            case 12:
                lVar = new Lg.b();
                break;
            case 13:
                lVar = new Cg.c();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format " + aVar);
        }
        return lVar.a(str, aVar, i10, i11, map);
    }
}
