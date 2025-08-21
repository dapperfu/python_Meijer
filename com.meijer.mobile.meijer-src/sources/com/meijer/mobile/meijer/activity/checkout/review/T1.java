package com.meijer.mobile.meijer.activity.checkout.review;

import Ki.C;
import fj.CardType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lhk/h;", "LKi/C$g;", "c", "(Lhk/h;)LKi/C$g;", "Lfj/d;", "b", "(Lfj/d;)LKi/C$g;", "cardIcon", "", "a", "(LKi/C$g;)Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class T1 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[hk.h.values().length];
            try {
                iArr[hk.h.f135816e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hk.h.f135817f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[hk.h.f135818g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[hk.h.f135819h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[hk.h.f135820i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[hk.h.f135821j.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[hk.h.f135822k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[hk.h.f135823l.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String a(C.g gVar) {
        return Intrinsics.e(gVar, C.g.a.f17071e) ? hk.h.f135818g.getBrand() : Intrinsics.e(gVar, C.g.k.f17082e) ? hk.h.f135816e.getBrand() : Intrinsics.e(gVar, C.g.i.f17080e) ? hk.h.f135821j.getBrand() : Intrinsics.e(gVar, C.g.j.f17081e) ? hk.h.f135822k.getBrand() : Intrinsics.e(gVar, C.g.d.f17074e) ? hk.h.f135820i.getBrand() : Intrinsics.e(gVar, C.g.e.f17075e) ? hk.h.f135819h.getBrand() : Intrinsics.e(gVar, C.g.h.f17079e) ? hk.h.f135817f.getBrand() : Intrinsics.e(gVar, C.g.f.f17076e) ? hk.h.f135824m.getBrand() : hk.h.f135825n.getBrand();
    }

    public static final C.g b(CardType cardType) {
        String code = cardType != null ? cardType.getCode() : null;
        CardType.Companion companion = CardType.INSTANCE;
        return Intrinsics.e(code, companion.a().getCode()) ? C.g.a.f17071e : Intrinsics.e(code, companion.h().getCode()) ? C.g.k.f17082e : Intrinsics.e(code, companion.f().getCode()) ? C.g.i.f17080e : Intrinsics.e(code, companion.g().getCode()) ? C.g.j.f17081e : Intrinsics.e(code, companion.b().getCode()) ? C.g.d.f17074e : Intrinsics.e(code, companion.c().getCode()) ? C.g.e.f17075e : Intrinsics.e(code, companion.e().getCode()) ? C.g.h.f17079e : Intrinsics.e(code, companion.d().getCode()) ? C.g.f.f17076e : C.g.c.f17073e;
    }

    public static final C.g c(hk.h hVar) {
        switch (hVar == null ? -1 : a.$EnumSwitchMapping$0[hVar.ordinal()]) {
            case 1:
                return C.g.k.f17082e;
            case 2:
                return C.g.h.f17079e;
            case 3:
                return C.g.a.f17071e;
            case 4:
                return C.g.e.f17075e;
            case 5:
                return C.g.d.f17074e;
            case 6:
                return C.g.i.f17080e;
            case 7:
                return C.g.j.f17081e;
            case 8:
                return C.g.i.f17080e;
            default:
                return C.g.c.f17073e;
        }
    }
}
