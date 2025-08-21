package n8;

import m8.EnumC15695j;

/* renamed from: n8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C15921b {

    /* renamed from: n8.b$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f152107a;

        static {
            int[] iArr = new int[EnumC15695j.values().length];
            f152107a = iArr;
            try {
                iArr[EnumC15695j.PERFORMANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f152107a[EnumC15695j.USER_BEHAVIOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f152107a[EnumC15695j.OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    String a(p8.b bVar, String str) {
        return bVar.f156193b + "_" + bVar.f156194c + "-" + bVar.f156195d + "_" + str + "_m";
    }

    String b(p8.b bVar) {
        StringBuilder sb2 = new StringBuilder("v_4_ol_");
        if (!bVar.n()) {
            sb2.append("2");
        } else if (bVar.m()) {
            sb2.append("0_mul_");
            sb2.append(bVar.f156196e);
        } else {
            sb2.append("1");
        }
        sb2.append("_prv_");
        int i10 = a.f152107a[bVar.f().c().b().ordinal()];
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

    C15921b() {
    }
}
