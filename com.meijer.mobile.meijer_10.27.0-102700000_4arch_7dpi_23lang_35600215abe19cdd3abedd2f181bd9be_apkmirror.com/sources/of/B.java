package of;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import rf.AbstractC16777F;
import xf.InterfaceC18044d;

/* loaded from: classes7.dex */
public class B {

    /* renamed from: g, reason: collision with root package name */
    private static final Map<String, Integer> f153418g;

    /* renamed from: h, reason: collision with root package name */
    static final String f153419h;

    /* renamed from: a, reason: collision with root package name */
    private final Context f153420a;

    /* renamed from: b, reason: collision with root package name */
    private final K f153421b;

    /* renamed from: c, reason: collision with root package name */
    private final C16033a f153422c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC18044d f153423d;

    /* renamed from: e, reason: collision with root package name */
    private final wf.j f153424e;

    /* renamed from: f, reason: collision with root package name */
    private final lf.j f153425f = lf.j.f148865a;

    private AbstractC16777F.e.d.a.b.c m(xf.e eVar, int i10, int i11) {
        return n(eVar, i10, i11, 0);
    }

    private AbstractC16777F.e.d.a.b.AbstractC2456e x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    static {
        HashMap map = new HashMap();
        f153418g = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        f153419h = String.format(Locale.US, "Crashlytics Android SDK/%s", BuildConfig.VERSION_NAME);
    }

    private AbstractC16777F.e.d.a.c A(AbstractC16777F.a aVar) {
        return this.f153425f.a(aVar.e(), aVar.d(), aVar.c());
    }

    private AbstractC16777F.a a(AbstractC16777F.a aVar) {
        List<AbstractC16777F.a.AbstractC2446a> listUnmodifiableList;
        if (!this.f153424e.b().f166064b.f166073c || this.f153422c.f153476c.size() <= 0) {
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (C16038f c16038f : this.f153422c.f153476c) {
                arrayList.add(AbstractC16777F.a.AbstractC2446a.a().d(c16038f.c()).b(c16038f.a()).c(c16038f.b()).a());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return AbstractC16777F.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(listUnmodifiableList).a();
    }

    private static long f(long j10) {
        if (j10 > 0) {
            return j10;
        }
        return 0L;
    }

    private static int g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = f153418g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private AbstractC16777F.e.d.a k(int i10, xf.e eVar, Thread thread, int i11, int i12, boolean z10) {
        Boolean boolValueOf;
        AbstractC16777F.e.d.a.c cVarE = this.f153425f.e(this.f153420a);
        if (cVarE.b() > 0) {
            boolValueOf = Boolean.valueOf(cVarE.b() != 100);
        } else {
            boolValueOf = null;
        }
        return AbstractC16777F.e.d.a.a().c(boolValueOf).d(cVarE).b(this.f153425f.d(this.f153420a)).h(i10).f(p(eVar, thread, i11, i12, z10)).a();
    }

    private AbstractC16777F.e.d.c l(int i10) {
        C16037e c16037eA = C16037e.a(this.f153420a);
        Float fB = c16037eA.b();
        Double dValueOf = fB != null ? Double.valueOf(fB.doubleValue()) : null;
        int iC = c16037eA.c();
        boolean zN = C16041i.n(this.f153420a);
        return AbstractC16777F.e.d.c.a().b(dValueOf).c(iC).f(zN).e(i10).g(f(C16041i.b(this.f153420a) - C16041i.a(this.f153420a))).d(C16041i.c(Environment.getDataDirectory().getPath())).a();
    }

    private AbstractC16777F.e.d.a.b.c n(xf.e eVar, int i10, int i11, int i12) {
        String str = eVar.f169596b;
        String str2 = eVar.f169595a;
        StackTraceElement[] stackTraceElementArr = eVar.f169597c;
        int i13 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        xf.e eVar2 = eVar.f169598d;
        if (i12 >= i11) {
            xf.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f169598d;
                i13++;
            }
        }
        AbstractC16777F.e.d.a.b.c.AbstractC2453a abstractC2453aD = AbstractC16777F.e.d.a.b.c.a().f(str).e(str2).c(r(stackTraceElementArr, i10)).d(i13);
        if (eVar2 != null && i13 == 0) {
            abstractC2453aD.b(n(eVar2, i10, i11, i12 + 1));
        }
        return abstractC2453aD.a();
    }

    private List<AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b> r(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(q(stackTraceElement, AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b.a().c(i10)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private AbstractC16777F.e.c u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iG = g();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jB = C16041i.b(this.f153420a);
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean zX = C16041i.x();
        int iL = C16041i.l();
        return AbstractC16777F.e.c.a().b(iG).f(Build.MODEL).c(iAvailableProcessors).h(jB).d(blockCount).i(zX).j(iL).e(Build.MANUFACTURER).g(Build.PRODUCT).a();
    }

    private List<AbstractC16777F.e.d.a.b.AbstractC2456e> z(xf.e eVar, Thread thread, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y(thread, eVar.f169597c, i10));
        if (z10) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(x(key, this.f153423d.a(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public AbstractC16777F.e.d c(AbstractC16777F.a aVar) {
        int i10 = this.f153420a.getResources().getConfiguration().orientation;
        return AbstractC16777F.e.d.a().g("anr").f(aVar.i()).b(j(i10, a(aVar))).c(l(i10)).a();
    }

    public AbstractC16777F.e.d d(Throwable th2, Thread thread, String str, long j10, int i10, int i11, boolean z10) {
        int i12 = this.f153420a.getResources().getConfiguration().orientation;
        return AbstractC16777F.e.d.a().g(str).f(j10).b(k(i12, xf.e.a(th2, this.f153423d), thread, i10, i11, z10)).c(l(i12)).a();
    }

    public B(Context context, K k10, C16033a c16033a, InterfaceC18044d interfaceC18044d, wf.j jVar) {
        this.f153420a = context;
        this.f153421b = k10;
        this.f153422c = c16033a;
        this.f153423d = interfaceC18044d;
        this.f153424e = jVar;
    }

    private AbstractC16777F.b b() {
        return AbstractC16777F.b().l(BuildConfig.VERSION_NAME).h(this.f153422c.f153474a).i(this.f153421b.a().c()).g(this.f153421b.a().e()).f(this.f153421b.a().d()).d(this.f153422c.f153479f).e(this.f153422c.f153480g).k(4);
    }

    private AbstractC16777F.e.d.a.b.AbstractC2450a h() {
        return AbstractC16777F.e.d.a.b.AbstractC2450a.a().b(0L).d(0L).c(this.f153422c.f153478e).e(this.f153422c.f153475b).a();
    }

    private List<AbstractC16777F.e.d.a.b.AbstractC2450a> i() {
        return Collections.singletonList(h());
    }

    private AbstractC16777F.e.d.a j(int i10, AbstractC16777F.a aVar) {
        boolean z10;
        if (aVar.c() != 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        return AbstractC16777F.e.d.a.a().c(Boolean.valueOf(z10)).d(A(aVar)).h(i10).f(o(aVar)).a();
    }

    private AbstractC16777F.e.d.a.b o(AbstractC16777F.a aVar) {
        return AbstractC16777F.e.d.a.b.a().b(aVar).e(w()).c(i()).a();
    }

    private AbstractC16777F.e.d.a.b p(xf.e eVar, Thread thread, int i10, int i11, boolean z10) {
        return AbstractC16777F.e.d.a.b.a().f(z(eVar, thread, i10, z10)).d(m(eVar, i10, i11)).e(w()).c(i()).a();
    }

    private AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b q(StackTraceElement stackTraceElement, AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b.AbstractC2459a abstractC2459a) {
        long jMax;
        long lineNumber = 0;
        if (stackTraceElement.isNativeMethod()) {
            jMax = Math.max(stackTraceElement.getLineNumber(), 0L);
        } else {
            jMax = 0;
        }
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        return abstractC2459a.e(jMax).f(str).b(fileName).d(lineNumber).a();
    }

    private AbstractC16777F.e.a s() {
        return AbstractC16777F.e.a.a().e(this.f153421b.f()).g(this.f153422c.f153479f).d(this.f153422c.f153480g).f(this.f153421b.a().c()).b(this.f153422c.f153481h.d()).c(this.f153422c.f153481h.e()).a();
    }

    private AbstractC16777F.e t(String str, long j10) {
        return AbstractC16777F.e.a().m(j10).j(str).h(f153419h).b(s()).l(v()).e(u()).i(3).a();
    }

    private AbstractC16777F.e.AbstractC2463e v() {
        return AbstractC16777F.e.AbstractC2463e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(C16041i.y()).a();
    }

    private AbstractC16777F.e.d.a.b.AbstractC2454d w() {
        return AbstractC16777F.e.d.a.b.AbstractC2454d.a().d("0").c("0").b(0L).a();
    }

    private AbstractC16777F.e.d.a.b.AbstractC2456e y(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        return AbstractC16777F.e.d.a.b.AbstractC2456e.a().d(thread.getName()).c(i10).b(r(stackTraceElementArr, i10)).a();
    }

    public AbstractC16777F e(String str, long j10) {
        return b().m(t(str, j10)).a();
    }
}
