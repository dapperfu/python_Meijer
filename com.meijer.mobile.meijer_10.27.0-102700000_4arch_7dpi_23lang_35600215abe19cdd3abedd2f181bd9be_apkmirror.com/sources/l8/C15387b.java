package l8;

import k8.EnumC15124j;

/* renamed from: l8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C15387b {

    /* renamed from: l8.b$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f148710a;

        static {
            int[] iArr = new int[EnumC15124j.values().length];
            f148710a = iArr;
            try {
                iArr[EnumC15124j.PERFORMANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f148710a[EnumC15124j.USER_BEHAVIOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f148710a[EnumC15124j.OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    String a(n8.b bVar, String str) {
        return bVar.f151062b + "_" + bVar.f151063c + "-" + bVar.f151064d + "_" + str + "_m";
    }

    String b(n8.b bVar) {
        StringBuilder sb2 = new StringBuilder("v_4_ol_");
        if (!bVar.n()) {
            sb2.append("2");
        } else if (bVar.m()) {
            sb2.append("0_mul_");
            sb2.append(bVar.f151065e);
        } else {
            sb2.append("1");
        }
        sb2.append("_prv_");
        int i10 = a.f148710a[bVar.f().c().b().ordinal()];
        if (i10 == 1) {
            sb2.append("3");
        } else if (i10 != 2) {
            sb2.append("2");
        } else {
            sb2.append("4");
        }
        return sb2.toString();
    }

    String c(long j10, int i10) {
        return j10 + "_" + i10;
    }

    C15387b() {
    }
}
