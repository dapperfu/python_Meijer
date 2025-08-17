package Wf;

import ag.EnumC5600b;
import bg.m;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
final class d extends e {

    /* renamed from: c, reason: collision with root package name */
    private static final Uf.a f38654c = Uf.a.e();

    /* renamed from: b, reason: collision with root package name */
    private final m f38655b;

    private boolean h(m mVar) {
        return i(mVar, 0);
    }

    private boolean i(m mVar, int i10) {
        if (mVar == null) {
            return false;
        }
        if (i10 > 1) {
            f38654c.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry<String, Long> entry : mVar.r0().entrySet()) {
            if (!l(entry.getKey())) {
                f38654c.j("invalid CounterId:" + entry.getKey());
                return false;
            }
            if (!m(entry.getValue())) {
                f38654c.j("invalid CounterValue:" + entry.getValue());
                return false;
            }
        }
        Iterator<m> it = mVar.z0().iterator();
        while (it.hasNext()) {
            if (!i(it.next(), i10 + 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean l(String str) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            f38654c.j("counterId is empty");
            return false;
        }
        if (strTrim.length() <= 100) {
            return true;
        }
        f38654c.j("counterId exceeded max length 100");
        return false;
    }

    private boolean o(m mVar, int i10) {
        if (mVar == null) {
            f38654c.j("TraceMetric is null");
            return false;
        }
        if (i10 > 1) {
            f38654c.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        if (!q(mVar.x0())) {
            f38654c.j("invalid TraceId:" + mVar.x0());
            return false;
        }
        if (!p(mVar)) {
            f38654c.j("invalid TraceDuration:" + mVar.u0());
            return false;
        }
        if (!mVar.A0()) {
            f38654c.j("clientStartTimeUs is null.");
            return false;
        }
        if (!k(mVar) || n(mVar)) {
            Iterator<m> it = mVar.z0().iterator();
            while (it.hasNext()) {
                if (!o(it.next(), i10 + 1)) {
                    return false;
                }
            }
            return g(mVar.s0());
        }
        f38654c.j("non-positive totalFrames in screen trace " + mVar.x0());
        return false;
    }

    private boolean q(String str) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        return !strTrim.isEmpty() && strTrim.length() <= 100;
    }

    private boolean m(Long l10) {
        return l10 != null;
    }

    private boolean p(m mVar) {
        return mVar != null && mVar.u0() > 0;
    }

    @Override // Wf.e
    public boolean c() {
        if (!o(this.f38655b, 0)) {
            f38654c.j("Invalid Trace:" + this.f38655b.x0());
            return false;
        }
        if (!j(this.f38655b) || h(this.f38655b)) {
            return true;
        }
        f38654c.j("Invalid Counters for Trace:" + this.f38655b.x0());
        return false;
    }

    d(m mVar) {
        this.f38655b = mVar;
    }

    private boolean g(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                e.d(entry.getKey(), entry.getValue());
            } catch (IllegalArgumentException e10) {
                f38654c.j(e10.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    private boolean j(m mVar) {
        if (mVar.q0() > 0) {
            return true;
        }
        Iterator<m> it = mVar.z0().iterator();
        while (it.hasNext()) {
            if (it.next().q0() > 0) {
                return true;
            }
        }
        return false;
    }

    private boolean k(m mVar) {
        return mVar.x0().startsWith("_st_");
    }

    private boolean n(m mVar) {
        Long l10 = mVar.r0().get(EnumC5600b.FRAMES_TOTAL.toString());
        if (l10 != null && l10.compareTo((Long) 0L) > 0) {
            return true;
        }
        return false;
    }
}
