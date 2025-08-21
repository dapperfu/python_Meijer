package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.d7;

/* loaded from: classes8.dex */
class j8 {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f93219a;

        static {
            int[] iArr = new int[b.values().length];
            f93219a = iArr;
            try {
                iArr[b.CONFIGURATION_UUID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93219a[b.OCQ_UUID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f93219a[b.C_UUID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    protected enum b {
        CONFIGURATION_UUID,
        OCQ_UUID,
        C_UUID
    }

    j8() {
    }

    private static String a(String str) {
        try {
            if (t0.c().a().getSdkConfiguration().getMedalliaDigitalClientConfig().getOcqCUuidUrlPrefix() != null) {
                return t0.c().a().getSdkConfiguration().getMedalliaDigitalClientConfig().getOcqCUuidUrlPrefix().concat(str);
            }
            return null;
        } catch (Exception unused) {
            a4.c("Cannot get ocqCuuidUrlPrefix from Configuration");
            return null;
        }
    }

    protected static String b(b bVar) {
        d7.a aVarD = d(bVar);
        if (aVarD != null) {
            return d7.b().a(aVarD, (String) null);
        }
        return null;
    }

    protected static String c(b bVar) {
        d7.a aVarE = e(bVar);
        if (aVarE != null) {
            return d7.b().a(aVarE, (String) null);
        }
        return null;
    }

    private static d7.a d(b bVar) {
        int i10 = a.f93219a[bVar.ordinal()];
        if (i10 == 1) {
            return d7.a.UUID;
        }
        if (i10 == 2) {
            return d7.a.OCQ_UUID;
        }
        if (i10 == 3) {
            return d7.a.C_UUID;
        }
        a4.b("couldn't find UUID Key for: " + bVar);
        return null;
    }

    private static d7.a e(b bVar) {
        if (bVar != null) {
            int i10 = a.f93219a[bVar.ordinal()];
            if (i10 == 1 || i10 == 2) {
                return d7.a.UUID_URL;
            }
            if (i10 == 3) {
                return d7.a.OCQ_UUID_URL;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("couldn't find UUID Url Key for: ");
        sb2.append(bVar != null ? bVar.toString() : com.google.maps.android.BuildConfig.TRAVIS);
        a4.b(sb2.toString());
        return null;
    }

    protected static void a(b bVar) {
        d7.a aVarD = d(bVar);
        d7.a aVarE = e(bVar);
        if (aVarD != null) {
            d7.b().b(aVarD, (String) null);
        }
        if (aVarE != null) {
            d7.b().b(aVarE, (String) null);
        }
    }

    protected static void b(b bVar, String str) {
        d7.a aVarD = d(bVar);
        if (aVarD != null) {
            d7.b().b(aVarD, str);
        }
    }

    protected static void c(b bVar, String str) {
        d7.a aVarE = e(bVar);
        if (aVarE != null) {
            if (b.C_UUID.equals(bVar)) {
                str = a(str);
            }
            d7.b().b(aVarE, str);
        }
    }

    protected static boolean a(b bVar, String str) {
        if (str == null) {
            return false;
        }
        String strB = b(bVar);
        if (strB != null && strB.equals(str)) {
            a4.b("Uuid is equal -> using local " + bVar.toString());
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("New UUID is not equal to previous using remote ");
        sb2.append(bVar.toString());
        a4.e(sb2.toString());
        return false;
    }
}
