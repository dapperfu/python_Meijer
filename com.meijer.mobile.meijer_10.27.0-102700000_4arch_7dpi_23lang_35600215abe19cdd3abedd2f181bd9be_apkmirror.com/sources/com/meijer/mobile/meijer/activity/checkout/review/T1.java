package com.meijer.mobile.meijer.activity.checkout.review;

import Ji.C;
import ej.CardType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lgk/h;", "LJi/C$g;", "c", "(Lgk/h;)LJi/C$g;", "Lej/d;", "b", "(Lej/d;)LJi/C$g;", "cardIcon", "", "a", "(LJi/C$g;)Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class T1 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[gk.h.values().length];
            try {
                iArr[gk.h.f133750e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gk.h.f133751f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gk.h.f133752g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[gk.h.f133753h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[gk.h.f133754i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[gk.h.f133755j.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[gk.h.f133756k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[gk.h.f133757l.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String a(C.g gVar) {
        return Intrinsics.e(gVar, C.g.a.f15527e) ? gk.h.f133752g.getBrand() : Intrinsics.e(gVar, C.g.k.f15538e) ? gk.h.f133750e.getBrand() : Intrinsics.e(gVar, C.g.i.f15536e) ? gk.h.f133755j.getBrand() : Intrinsics.e(gVar, C.g.j.f15537e) ? gk.h.f133756k.getBrand() : Intrinsics.e(gVar, C.g.d.f15530e) ? gk.h.f133754i.getBrand() : Intrinsics.e(gVar, C.g.e.f15531e) ? gk.h.f133753h.getBrand() : Intrinsics.e(gVar, C.g.h.f15535e) ? gk.h.f133751f.getBrand() : Intrinsics.e(gVar, C.g.f.f15532e) ? gk.h.f133758m.getBrand() : gk.h.f133759n.getBrand();
    }

    public static final C.g b(CardType cardType) {
        String code = cardType != null ? cardType.getCode() : null;
        CardType.Companion companion = CardType.INSTANCE;
        return Intrinsics.e(code, companion.a().getCode()) ? C.g.a.f15527e : Intrinsics.e(code, companion.h().getCode()) ? C.g.k.f15538e : Intrinsics.e(code, companion.f().getCode()) ? C.g.i.f15536e : Intrinsics.e(code, companion.g().getCode()) ? C.g.j.f15537e : Intrinsics.e(code, companion.b().getCode()) ? C.g.d.f15530e : Intrinsics.e(code, companion.c().getCode()) ? C.g.e.f15531e : Intrinsics.e(code, companion.e().getCode()) ? C.g.h.f15535e : Intrinsics.e(code, companion.d().getCode()) ? C.g.f.f15532e : C.g.c.f15529e;
    }

    public static final C.g c(gk.h hVar) {
        switch (hVar == null ? -1 : a.$EnumSwitchMapping$0[hVar.ordinal()]) {
            case 1:
                return C.g.k.f15538e;
            case 2:
                return C.g.h.f15535e;
            case 3:
                return C.g.a.f15527e;
            case 4:
                return C.g.e.f15531e;
            case 5:
                return C.g.d.f15530e;
            case 6:
                return C.g.i.f15536e;
            case 7:
                return C.g.j.f15537e;
            case 8:
                return C.g.i.f15536e;
            default:
                return C.g.c.f15529e;
        }
    }
}
