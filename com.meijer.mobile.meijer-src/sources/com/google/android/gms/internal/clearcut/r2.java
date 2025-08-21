package com.google.android.gms.internal.clearcut;

import android.content.Context;
import com.fullstory.FS;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.clearcut.d2;
import gd.C14346a;
import gd.C14351f;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import sd.C17067f;

/* loaded from: classes6.dex */
public final class r2 implements C14346a.b {

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f82388b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    private static final C10447p f82389c;

    /* renamed from: d, reason: collision with root package name */
    private static final C10447p f82390d;

    /* renamed from: e, reason: collision with root package name */
    private static final ConcurrentHashMap<String, AbstractC10417f<d2>> f82391e;

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap<String, AbstractC10417f<String>> f82392f;

    /* renamed from: g, reason: collision with root package name */
    @VisibleForTesting
    private static Boolean f82393g;

    /* renamed from: h, reason: collision with root package name */
    @VisibleForTesting
    private static Long f82394h;

    /* renamed from: i, reason: collision with root package name */
    @VisibleForTesting
    private static final AbstractC10417f<Boolean> f82395i;

    /* renamed from: a, reason: collision with root package name */
    private final Context f82396a;

    static {
        C10447p c10447pH = new C10447p(Rd.b.a("com.google.android.gms.clearcut.public")).f("gms:playlog:service:samplingrules_").h("LogSamplingRules__");
        f82389c = c10447pH;
        f82390d = new C10447p(Rd.b.a("com.google.android.gms.clearcut.public")).f("gms:playlog:service:sampling_").h("LogSampling__");
        f82391e = new ConcurrentHashMap<>();
        f82392f = new HashMap<>();
        f82393g = null;
        f82394h = null;
        f82395i = c10447pH.e("enable_log_sampling_rules", false);
    }

    public r2(Context context) {
        this.f82396a = context;
        if (context != null) {
            AbstractC10417f.b(context);
        }
    }

    @VisibleForTesting
    private static long b(String str, long j10) {
        if (str == null || str.isEmpty()) {
            return m2.c(ByteBuffer.allocate(8).putLong(j10).array());
        }
        byte[] bytes = str.getBytes(f82388b);
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
            sb2.append(com.medallia.digital.mobilesdk.q2.f93563c);
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
        if (f82393g == null) {
            f82393g = Boolean.valueOf(C17067f.a(context).a("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return f82393g.booleanValue();
    }

    @VisibleForTesting
    private static long f(Context context) {
        if (f82394h == null) {
            if (context == null) {
                return 0L;
            }
            f82394h = Long.valueOf(e(context) ? v2.a(context.getContentResolver(), "android_id", 0L) : 0L);
        }
        return f82394h.longValue();
    }

    @Override // gd.C14346a.b
    public final boolean a(C14351f c14351f) throws NumberFormatException {
        List<d2.b> listQ;
        AbstractC10417f<d2> abstractC10417fPutIfAbsent;
        t2 t2Var = c14351f.f134166a;
        String strValueOf = t2Var.f82414g;
        int i10 = t2Var.f82410c;
        i2 i2Var = c14351f.f134174i;
        int i11 = i2Var != null ? i2Var.f82322g : 0;
        String strA = null;
        if (!f82395i.a().booleanValue()) {
            if (strValueOf == null || strValueOf.isEmpty()) {
                strValueOf = i10 >= 0 ? String.valueOf(i10) : null;
            }
            if (strValueOf == null) {
                return true;
            }
            Context context = this.f82396a;
            if (context != null && e(context)) {
                HashMap<String, AbstractC10417f<String>> map = f82392f;
                AbstractC10417f<String> abstractC10417fB = map.get(strValueOf);
                if (abstractC10417fB == null) {
                    abstractC10417fB = f82390d.b(strValueOf, null);
                    map.put(strValueOf, abstractC10417fB);
                }
                strA = abstractC10417fB.a();
            }
            d2.b bVarC = c(strA);
            if (bVarC != null) {
                return d(b(bVarC.v(), f(this.f82396a)), bVarC.w(), bVarC.x());
            }
            return true;
        }
        if (strValueOf == null || strValueOf.isEmpty()) {
            strValueOf = i10 >= 0 ? String.valueOf(i10) : null;
        }
        if (strValueOf == null) {
            return true;
        }
        if (this.f82396a == null) {
            listQ = Collections.EMPTY_LIST;
        } else {
            ConcurrentHashMap<String, AbstractC10417f<d2>> concurrentHashMap = f82391e;
            AbstractC10417f<d2> abstractC10417fA = concurrentHashMap.get(strValueOf);
            if (abstractC10417fA == null && (abstractC10417fPutIfAbsent = concurrentHashMap.putIfAbsent(strValueOf, (abstractC10417fA = f82389c.a(strValueOf, d2.r(), s2.f82404a)))) != null) {
                abstractC10417fA = abstractC10417fPutIfAbsent;
            }
            listQ = abstractC10417fA.a().q();
        }
        for (d2.b bVar : listQ) {
            if (!bVar.u() || bVar.q() == 0 || bVar.q() == i11) {
                if (!d(b(bVar.v(), f(this.f82396a)), bVar.w(), bVar.x())) {
                    return false;
                }
            }
        }
        return true;
    }
}
