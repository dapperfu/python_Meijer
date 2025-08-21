package Yf;

import cg.EnumC6506b;
import dg.m;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
final class d extends e {

    /* renamed from: c, reason: collision with root package name */
    private static final Wf.a f43053c = Wf.a.e();

    /* renamed from: b, reason: collision with root package name */
    private final m f43054b;

    private boolean h(m mVar) {
        return i(mVar, 0);
    }

    private boolean i(m mVar, int i10) {
        if (mVar == null) {
            return false;
        }
        if (i10 > 1) {
            f43053c.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry<String, Long> entry : mVar.r0().entrySet()) {
            if (!l(entry.getKey())) {
                f43053c.j("invalid CounterId:" + entry.getKey());
                return false;
            }
            if (!m(entry.getValue())) {
                f43053c.j("invalid CounterValue:" + entry.getValue());
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
            f43053c.j("counterId is empty");
            return false;
        }
        if (strTrim.length() <= 100) {
            return true;
        }
        f43053c.j("counterId exceeded max length 100");
        return false;
    }

    private boolean o(m mVar, int i10) {
        if (mVar == null) {
            f43053c.j("TraceMetric is null");
            return false;
        }
        if (i10 > 1) {
            f43053c.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        if (!q(mVar.x0())) {
            f43053c.j("invalid TraceId:" + mVar.x0());
            return false;
        }
        if (!p(mVar)) {
            f43053c.j("invalid TraceDuration:" + mVar.u0());
            return false;
        }
        if (!mVar.A0()) {
            f43053c.j("clientStartTimeUs is null.");
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
        f43053c.j("non-positive totalFrames in screen trace " + mVar.x0());
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

    @Override // Yf.e
    public boolean c() {
        if (!o(this.f43054b, 0)) {
            f43053c.j("Invalid Trace:" + this.f43054b.x0());
            return false;
        }
        if (!j(this.f43054b) || h(this.f43054b)) {
            return true;
        }
        f43053c.j("Invalid Counters for Trace:" + this.f43054b.x0());
        return false;
    }

    d(m mVar) {
        this.f43054b = mVar;
    }

    private boolean g(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                e.d(entry.getKey(), entry.getValue());
            } catch (IllegalArgumentException e10) {
                f43053c.j(e10.getLocalizedMessage());
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
        Long l10 = mVar.r0().get(EnumC6506b.FRAMES_TOTAL.toString());
        if (l10 != null && l10.compareTo((Long) 0L) > 0) {
            return true;
        }
        return false;
    }
}
