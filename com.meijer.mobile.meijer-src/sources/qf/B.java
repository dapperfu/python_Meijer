package qf;

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
import tf.AbstractC17251F;
import zf.InterfaceC18481d;

/* loaded from: classes8.dex */
public class B {

    /* renamed from: g, reason: collision with root package name */
    private static final Map<String, Integer> f158270g;

    /* renamed from: h, reason: collision with root package name */
    static final String f158271h;

    /* renamed from: a, reason: collision with root package name */
    private final Context f158272a;

    /* renamed from: b, reason: collision with root package name */
    private final K f158273b;

    /* renamed from: c, reason: collision with root package name */
    private final C16641a f158274c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC18481d f158275d;

    /* renamed from: e, reason: collision with root package name */
    private final yf.j f158276e;

    /* renamed from: f, reason: collision with root package name */
    private final nf.j f158277f = nf.j.f152436a;

    private AbstractC17251F.e.d.a.b.c m(zf.e eVar, int i10, int i11) {
        return n(eVar, i10, i11, 0);
    }

    private AbstractC17251F.e.d.a.b.AbstractC2562e x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    static {
        HashMap map = new HashMap();
        f158270g = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        f158271h = String.format(Locale.US, "Crashlytics Android SDK/%s", BuildConfig.VERSION_NAME);
    }

    private AbstractC17251F.e.d.a.c A(AbstractC17251F.a aVar) {
        return this.f158277f.a(aVar.e(), aVar.d(), aVar.c());
    }

    private AbstractC17251F.a a(AbstractC17251F.a aVar) {
        List<AbstractC17251F.a.AbstractC2552a> listUnmodifiableList;
        if (!this.f158276e.b().f171386b.f171395c || this.f158274c.f158328c.size() <= 0) {
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (C16646f c16646f : this.f158274c.f158328c) {
                arrayList.add(AbstractC17251F.a.AbstractC2552a.a().d(c16646f.c()).b(c16646f.a()).c(c16646f.b()).a());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return AbstractC17251F.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(listUnmodifiableList).a();
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
        if (TextUtils.isEmpty(str) || (num = f158270g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private AbstractC17251F.e.d.a k(int i10, zf.e eVar, Thread thread, int i11, int i12, boolean z10) {
        Boolean boolValueOf;
        AbstractC17251F.e.d.a.c cVarE = this.f158277f.e(this.f158272a);
        if (cVarE.b() > 0) {
            boolValueOf = Boolean.valueOf(cVarE.b() != 100);
        } else {
            boolValueOf = null;
        }
        return AbstractC17251F.e.d.a.a().c(boolValueOf).d(cVarE).b(this.f158277f.d(this.f158272a)).h(i10).f(p(eVar, thread, i11, i12, z10)).a();
    }

    private AbstractC17251F.e.d.c l(int i10) {
        C16645e c16645eA = C16645e.a(this.f158272a);
        Float fB = c16645eA.b();
        Double dValueOf = fB != null ? Double.valueOf(fB.doubleValue()) : null;
        int iC = c16645eA.c();
        boolean zN = C16649i.n(this.f158272a);
        return AbstractC17251F.e.d.c.a().b(dValueOf).c(iC).f(zN).e(i10).g(f(C16649i.b(this.f158272a) - C16649i.a(this.f158272a))).d(C16649i.c(Environment.getDataDirectory().getPath())).a();
    }

    private AbstractC17251F.e.d.a.b.c n(zf.e eVar, int i10, int i11, int i12) {
        String str = eVar.f172745b;
        String str2 = eVar.f172744a;
        StackTraceElement[] stackTraceElementArr = eVar.f172746c;
        int i13 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        zf.e eVar2 = eVar.f172747d;
        if (i12 >= i11) {
            zf.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f172747d;
                i13++;
            }
        }
        AbstractC17251F.e.d.a.b.c.AbstractC2559a abstractC2559aD = AbstractC17251F.e.d.a.b.c.a().f(str).e(str2).c(r(stackTraceElementArr, i10)).d(i13);
        if (eVar2 != null && i13 == 0) {
            abstractC2559aD.b(n(eVar2, i10, i11, i12 + 1));
        }
        return abstractC2559aD.a();
    }

    private List<AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b> r(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(q(stackTraceElement, AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b.a().c(i10)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private AbstractC17251F.e.c u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iG = g();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jB = C16649i.b(this.f158272a);
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean zX = C16649i.x();
        int iL = C16649i.l();
        return AbstractC17251F.e.c.a().b(iG).f(Build.MODEL).c(iAvailableProcessors).h(jB).d(blockCount).i(zX).j(iL).e(Build.MANUFACTURER).g(Build.PRODUCT).a();
    }

    private List<AbstractC17251F.e.d.a.b.AbstractC2562e> z(zf.e eVar, Thread thread, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y(thread, eVar.f172746c, i10));
        if (z10) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(x(key, this.f158275d.a(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public AbstractC17251F.e.d c(AbstractC17251F.a aVar) {
        int i10 = this.f158272a.getResources().getConfiguration().orientation;
        return AbstractC17251F.e.d.a().g("anr").f(aVar.i()).b(j(i10, a(aVar))).c(l(i10)).a();
    }

    public AbstractC17251F.e.d d(Throwable th2, Thread thread, String str, long j10, int i10, int i11, boolean z10) {
        int i12 = this.f158272a.getResources().getConfiguration().orientation;
        return AbstractC17251F.e.d.a().g(str).f(j10).b(k(i12, zf.e.a(th2, this.f158275d), thread, i10, i11, z10)).c(l(i12)).a();
    }

    public B(Context context, K k10, C16641a c16641a, InterfaceC18481d interfaceC18481d, yf.j jVar) {
        this.f158272a = context;
        this.f158273b = k10;
        this.f158274c = c16641a;
        this.f158275d = interfaceC18481d;
        this.f158276e = jVar;
    }

    private AbstractC17251F.b b() {
        return AbstractC17251F.b().l(BuildConfig.VERSION_NAME).h(this.f158274c.f158326a).i(this.f158273b.a().c()).g(this.f158273b.a().e()).f(this.f158273b.a().d()).d(this.f158274c.f158331f).e(this.f158274c.f158332g).k(4);
    }

    private AbstractC17251F.e.d.a.b.AbstractC2556a h() {
        return AbstractC17251F.e.d.a.b.AbstractC2556a.a().b(0L).d(0L).c(this.f158274c.f158330e).e(this.f158274c.f158327b).a();
    }

    private List<AbstractC17251F.e.d.a.b.AbstractC2556a> i() {
        return Collections.singletonList(h());
    }

    private AbstractC17251F.e.d.a j(int i10, AbstractC17251F.a aVar) {
        boolean z10;
        if (aVar.c() != 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        return AbstractC17251F.e.d.a.a().c(Boolean.valueOf(z10)).d(A(aVar)).h(i10).f(o(aVar)).a();
    }

    private AbstractC17251F.e.d.a.b o(AbstractC17251F.a aVar) {
        return AbstractC17251F.e.d.a.b.a().b(aVar).e(w()).c(i()).a();
    }

    private AbstractC17251F.e.d.a.b p(zf.e eVar, Thread thread, int i10, int i11, boolean z10) {
        return AbstractC17251F.e.d.a.b.a().f(z(eVar, thread, i10, z10)).d(m(eVar, i10, i11)).e(w()).c(i()).a();
    }

    private AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b q(StackTraceElement stackTraceElement, AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b.AbstractC2565a abstractC2565a) {
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
        return abstractC2565a.e(jMax).f(str).b(fileName).d(lineNumber).a();
    }

    private AbstractC17251F.e.a s() {
        return AbstractC17251F.e.a.a().e(this.f158273b.f()).g(this.f158274c.f158331f).d(this.f158274c.f158332g).f(this.f158273b.a().c()).b(this.f158274c.f158333h.d()).c(this.f158274c.f158333h.e()).a();
    }

    private AbstractC17251F.e t(String str, long j10) {
        return AbstractC17251F.e.a().m(j10).j(str).h(f158271h).b(s()).l(v()).e(u()).i(3).a();
    }

    private AbstractC17251F.e.AbstractC2569e v() {
        return AbstractC17251F.e.AbstractC2569e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(C16649i.y()).a();
    }

    private AbstractC17251F.e.d.a.b.AbstractC2560d w() {
        return AbstractC17251F.e.d.a.b.AbstractC2560d.a().d("0").c("0").b(0L).a();
    }

    private AbstractC17251F.e.d.a.b.AbstractC2562e y(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        return AbstractC17251F.e.d.a.b.AbstractC2562e.a().d(thread.getName()).c(i10).b(r(stackTraceElementArr, i10)).a();
    }

    public AbstractC17251F e(String str, long j10) {
        return b().m(t(str, j10)).a();
    }
}
