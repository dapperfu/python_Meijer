package If;

import F2.f;
import Qd.L;
import android.content.Context;
import android.os.Build;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes8.dex */
class p {

    /* renamed from: b, reason: collision with root package name */
    private static final f.a<Long> f14472b = F2.i.f("fire-global");

    /* renamed from: c, reason: collision with root package name */
    private static final f.a<Long> f14473c = F2.i.f("fire-count");

    /* renamed from: d, reason: collision with root package name */
    private static final f.a<String> f14474d = F2.i.g("last-used-date");

    /* renamed from: a, reason: collision with root package name */
    private final Af.b f14475a;

    private synchronized long e(F2.c cVar) {
        long j10;
        try {
            long jLongValue = ((Long) Af.c.a(cVar, f14473c, 0L)).longValue();
            String name = "";
            Set hashSet = new HashSet();
            String str = null;
            for (Map.Entry<f.a<?>, Object> entry : cVar.a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str2 : set) {
                        if (str == null || str.compareTo(str2) > 0) {
                            name = entry.getKey().getName();
                            hashSet = set;
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str);
            cVar.i(F2.i.h(name), hashSet2);
            j10 = jLongValue - 1;
            cVar.i(f14473c, Long.valueOf(j10));
        } catch (Throwable th2) {
            throw th2;
        }
        return j10;
    }

    private synchronized String h(long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j10)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    private synchronized f.a<Set<String>> i(F2.c cVar, String str) {
        for (Map.Entry<f.a<?>, Object> entry : cVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return F2.i.h(entry.getKey().getName());
                    }
                }
            }
        }
        return null;
    }

    private synchronized void l(F2.c cVar, String str) {
        try {
            f.a<Set<String>> aVarI = i(cVar, str);
            if (aVarI == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) Af.c.a(cVar, aVarI, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                cVar.h(aVarI);
            } else {
                cVar.i(aVarI, hashSet);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void q(F2.c cVar, f.a<Set<String>> aVar, String str) {
        l(cVar, str);
        HashSet hashSet = new HashSet((Collection) Af.c.a(cVar, aVar, new HashSet()));
        hashSet.add(str);
        cVar.i(aVar, hashSet);
    }

    synchronized void f() {
        this.f14475a.e(new Function1() { // from class: If.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.c(this.f14470a, (F2.c) obj);
            }
        });
    }

    synchronized List<q> g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String strH = h(System.currentTimeMillis());
            for (Map.Entry<f.a<?>, Object> entry : this.f14475a.f().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strH);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(q.a(entry.getKey().getName(), new ArrayList(hashSet)));
                    }
                }
            }
            p(System.currentTimeMillis());
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    synchronized boolean j(long j10, long j11) {
        return h(j10).equals(h(j11));
    }

    synchronized void k() {
        final String strH = h(System.currentTimeMillis());
        this.f14475a.e(new Function1() { // from class: If.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.d(this.f14468a, strH, (F2.c) obj);
            }
        });
    }

    synchronized boolean m(long j10) {
        return n(f14472b, j10);
    }

    synchronized boolean n(f.a<Long> aVar, long j10) {
        if (j(((Long) this.f14475a.h(aVar, -1L)).longValue(), j10)) {
            return false;
        }
        this.f14475a.i(aVar, Long.valueOf(j10));
        return true;
    }

    synchronized void o(long j10, final String str) {
        final String strH = h(j10);
        final f.a<Set<String>> aVarH = F2.i.h(str);
        this.f14475a.e(new Function1() { // from class: If.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.b(this.f14464a, strH, str, aVarH, (F2.c) obj);
            }
        });
    }

    synchronized void p(final long j10) {
        this.f14475a.e(new Function1() { // from class: If.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.a(j10, (F2.c) obj);
            }
        });
    }

    public static /* synthetic */ Unit a(long j10, F2.c cVar) {
        cVar.i(f14472b, Long.valueOf(j10));
        return null;
    }

    public p(Context context, String str) {
        this.f14475a = new Af.b(context, "FirebaseHeartBeat" + str);
    }

    public static /* synthetic */ Unit b(p pVar, String str, String str2, f.a aVar, F2.c cVar) {
        pVar.getClass();
        f.a<String> aVar2 = f14474d;
        if (((String) Af.c.a(cVar, aVar2, "")).equals(str)) {
            f.a<Set<String>> aVarI = pVar.i(cVar, str);
            if (aVarI == null || aVarI.getName().equals(str2)) {
                return null;
            }
            pVar.q(cVar, aVar, str);
            return null;
        }
        f.a<Long> aVar3 = f14473c;
        long jLongValue = ((Long) Af.c.a(cVar, aVar3, 0L)).longValue();
        if (jLongValue + 1 == 30) {
            jLongValue = pVar.e(cVar);
        }
        HashSet hashSet = new HashSet((Collection) Af.c.a(cVar, aVar, new HashSet()));
        hashSet.add(str);
        cVar.i(aVar, hashSet);
        cVar.i(aVar3, Long.valueOf(jLongValue + 1));
        cVar.i(aVar2, str);
        return null;
    }

    public static /* synthetic */ Unit c(p pVar, F2.c cVar) {
        pVar.getClass();
        long j10 = 0;
        for (Map.Entry<f.a<?>, Object> entry : cVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                f.a<?> key = entry.getKey();
                Set set = (Set) entry.getValue();
                String strH = pVar.h(System.currentTimeMillis());
                if (set.contains(strH)) {
                    cVar.i(key, L.a(new Object[]{strH}));
                    j10++;
                } else {
                    cVar.h(key);
                }
            }
        }
        if (j10 == 0) {
            cVar.h(f14473c);
            return null;
        }
        cVar.i(f14473c, Long.valueOf(j10));
        return null;
    }

    public static /* synthetic */ Unit d(p pVar, String str, F2.c cVar) {
        pVar.getClass();
        cVar.i(f14474d, str);
        pVar.l(cVar, str);
        return null;
    }
}
