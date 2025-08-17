package com.google.android.gms.internal.clearcut;

import android.content.Context;
import com.fullstory.FS;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.clearcut.d2;
import ed.C13642a;
import ed.C13647f;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import qd.C16519f;

/* loaded from: classes6.dex */
public final class r2 implements C13642a.b {

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f81548b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    private static final C10322p f81549c;

    /* renamed from: d, reason: collision with root package name */
    private static final C10322p f81550d;

    /* renamed from: e, reason: collision with root package name */
    private static final ConcurrentHashMap<String, AbstractC10292f<d2>> f81551e;

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap<String, AbstractC10292f<String>> f81552f;

    /* renamed from: g, reason: collision with root package name */
    @VisibleForTesting
    private static Boolean f81553g;

    /* renamed from: h, reason: collision with root package name */
    @VisibleForTesting
    private static Long f81554h;

    /* renamed from: i, reason: collision with root package name */
    @VisibleForTesting
    private static final AbstractC10292f<Boolean> f81555i;

    /* renamed from: a, reason: collision with root package name */
    private final Context f81556a;

    static {
        C10322p c10322pH = new C10322p(Pd.b.a("com.google.android.gms.clearcut.public")).f("gms:playlog:service:samplingrules_").h("LogSamplingRules__");
        f81549c = c10322pH;
        f81550d = new C10322p(Pd.b.a("com.google.android.gms.clearcut.public")).f("gms:playlog:service:sampling_").h("LogSampling__");
        f81551e = new ConcurrentHashMap<>();
        f81552f = new HashMap<>();
        f81553g = null;
        f81554h = null;
        f81555i = c10322pH.e("enable_log_sampling_rules", false);
    }

    public r2(Context context) {
        this.f81556a = context;
        if (context != null) {
            AbstractC10292f.b(context);
        }
    }

    @VisibleForTesting
    private static long b(String str, long j10) {
        if (str == null || str.isEmpty()) {
            return m2.c(ByteBuffer.allocate(8).putLong(j10).array());
        }
        byte[] bytes = str.getBytes(f81548b);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 8);
        byteBufferAllocate.put(bytes);
        byteBufferAllocate.putLong(j10);
        return m2.c(byteBufferAllocate.array());
    }

    @VisibleForTesting
    private static d2.b c(String str) throws NumberFormatException {
        String strSubstring;
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(44);
        int i10 = 0;
        if (iIndexOf >= 0) {
            i10 = iIndexOf + 1;
            strSubstring = str.substring(0, iIndexOf);
        } else {
            strSubstring = "";
        }
        int iIndexOf2 = str.indexOf(47, i10);
        if (iIndexOf2 <= 0) {
            FS.log_e("LogSamplerImpl", str.length() != 0 ? "Failed to parse the rule: ".concat(str) : new String("Failed to parse the rule: "));
            return null;
        }
        try {
            long j10 = Long.parseLong(str.substring(i10, iIndexOf2));
            long j11 = Long.parseLong(str.substring(iIndexOf2 + 1));
            if (j10 >= 0 && j11 >= 0) {
                return d2.b.y().n(strSubstring).o(j10).p(j11).m();
            }
            StringBuilder sb2 = new StringBuilder(72);
            sb2.append("negative values not supported: ");
            sb2.append(j10);
            sb2.append(com.medallia.digital.mobilesdk.q2.f92724c);
            sb2.append(j11);
            FS.log_e("LogSamplerImpl", sb2.toString());
            return null;
        } catch (NumberFormatException e10) {
            FS.log_e("LogSamplerImpl", str.length() != 0 ? "parseLong() failed while parsing: ".concat(str) : new String("parseLong() failed while parsing: "), e10);
            return null;
        }
    }

    @VisibleForTesting
    private static boolean d(long j10, long j11, long j12) {
        if (j11 < 0 || j12 <= 0) {
            return true;
        }
        return ((j10 > 0L ? 1 : (j10 == 0L ? 0 : -1)) >= 0 ? j10 % j12 : (((Long.MAX_VALUE % j12) + 1) + ((j10 & Long.MAX_VALUE) % j12)) % j12) < j11;
    }

    private static boolean e(Context context) {
        if (f81553g == null) {
            f81553g = Boolean.valueOf(C16519f.a(context).a("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return f81553g.booleanValue();
    }

    @VisibleForTesting
    private static long f(Context context) {
        if (f81554h == null) {
            if (context == null) {
                return 0L;
            }
            f81554h = Long.valueOf(e(context) ? v2.a(context.getContentResolver(), "android_id", 0L) : 0L);
        }
        return f81554h.longValue();
    }

    @Override // ed.C13642a.b
    public final boolean a(C13647f c13647f) throws NumberFormatException {
        List<d2.b> listQ;
        AbstractC10292f<d2> abstractC10292fPutIfAbsent;
        t2 t2Var = c13647f.f128698a;
        String strValueOf = t2Var.f81574g;
        int i10 = t2Var.f81570c;
        i2 i2Var = c13647f.f128706i;
        int i11 = i2Var != null ? i2Var.f81482g : 0;
        String strA = null;
        if (!f81555i.a().booleanValue()) {
            if (strValueOf == null || strValueOf.isEmpty()) {
                strValueOf = i10 >= 0 ? String.valueOf(i10) : null;
            }
            if (strValueOf == null) {
                return true;
            }
            Context context = this.f81556a;
            if (context != null && e(context)) {
                HashMap<String, AbstractC10292f<String>> map = f81552f;
                AbstractC10292f<String> abstractC10292fB = map.get(strValueOf);
                if (abstractC10292fB == null) {
                    abstractC10292fB = f81550d.b(strValueOf, null);
                    map.put(strValueOf, abstractC10292fB);
                }
                strA = abstractC10292fB.a();
            }
            d2.b bVarC = c(strA);
            if (bVarC != null) {
                return d(b(bVarC.v(), f(this.f81556a)), bVarC.w(), bVarC.x());
            }
            return true;
        }
        if (strValueOf == null || strValueOf.isEmpty()) {
            strValueOf = i10 >= 0 ? String.valueOf(i10) : null;
        }
        if (strValueOf == null) {
            return true;
        }
        if (this.f81556a == null) {
            listQ = Collections.EMPTY_LIST;
        } else {
            ConcurrentHashMap<String, AbstractC10292f<d2>> concurrentHashMap = f81551e;
            AbstractC10292f<d2> abstractC10292fA = concurrentHashMap.get(strValueOf);
            if (abstractC10292fA == null && (abstractC10292fPutIfAbsent = concurrentHashMap.putIfAbsent(strValueOf, (abstractC10292fA = f81549c.a(strValueOf, d2.r(), s2.f81564a)))) != null) {
                abstractC10292fA = abstractC10292fPutIfAbsent;
            }
            listQ = abstractC10292fA.a().q();
        }
        for (d2.b bVar : listQ) {
            if (!bVar.u() || bVar.q() == 0 || bVar.q() == i11) {
                if (!d(b(bVar.v(), f(this.f81556a)), bVar.w(), bVar.x())) {
                    return false;
                }
            }
        }
        return true;
    }
}
