package fsimpl;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes14.dex */
public class aL {

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap f131494a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    private C14060ee f131495b;

    /* renamed from: c, reason: collision with root package name */
    private Map f131496c;

    public aL(Map map) {
        this.f131496c = map;
    }

    private void a(View view, boolean z10) {
        if (z10) {
            d(view);
        }
    }

    private List b(View view) {
        String str = (String) this.f131496c.get(Integer.valueOf(view.getId()));
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            arrayList.add(str2.trim());
        }
        return arrayList;
    }

    private aN c(View view) {
        aN aNVar = (aN) this.f131494a.get(view);
        if (aNVar != null) {
            return aNVar;
        }
        aN aNVar2 = new aN();
        this.f131494a.put(view, aNVar2);
        return aNVar2;
    }

    private synchronized void d(View view) {
        C14060ee c14060ee = this.f131495b;
        if (c14060ee != null) {
            c14060ee.a(view);
        }
    }

    private boolean e(View view, String str) {
        aN aNVarC = c(view);
        if (aNVarC.f131497a == null) {
            aNVarC.f131497a = new ArrayList();
        }
        if (aNVarC.f131497a.contains(str)) {
            return false;
        }
        aNVarC.f131497a.add(str);
        return true;
    }

    private boolean f(View view, String str) {
        aN aNVar = (aN) this.f131494a.get(view);
        if (aNVar == null || aNVar.f131497a == null) {
            return false;
        }
        return aNVar.f131497a.remove(str);
    }

    public synchronized C14060ee a() {
        return this.f131495b;
    }

    public void a(View view) {
        aN aNVar = (aN) this.f131494a.get(view);
        if (aNVar == null || aNVar.f131497a == null || aNVar.f131497a.isEmpty()) {
            return;
        }
        aNVar.f131497a.clear();
        d(view);
    }

    public synchronized void a(View view, aK aKVar) {
        aN aNVar = (aN) this.f131494a.get(view);
        List listB = b(view);
        if (listB != null && listB.size() > 0) {
            aKVar.b();
            aKVar.f131487c.addAll(listB);
        }
        if (aNVar != null) {
            if (!fY.a(aNVar.f131499c)) {
                aKVar.f131485a = aNVar.f131499c.toLowerCase();
            }
            if (aNVar.f131497a != null) {
                aKVar.b();
                aKVar.f131487c.addAll(aNVar.f131497a);
            }
            if (aNVar.f131498b != null) {
                aKVar.a();
                aKVar.f131488d.putAll(aNVar.f131498b);
            }
        }
    }

    public synchronized void a(View view, String str) {
        boolean zEquals;
        aN aNVarC = c(view);
        String str2 = aNVarC.f131499c;
        if (fY.a(str)) {
            str = null;
        }
        aNVarC.f131499c = str;
        if (str2 == null && aNVarC.f131499c == null) {
            zEquals = false;
        } else {
            zEquals = true;
            if (str2 != null && aNVarC.f131499c != null) {
                zEquals = true ^ str2.equals(aNVarC.f131499c);
            }
        }
        a(view, zEquals);
    }

    public synchronized void a(View view, String str, String str2) {
        aN aNVarC = c(view);
        if (aNVarC.f131498b == null) {
            aNVarC.f131498b = new HashMap();
        }
        a(view, !fY.a(str2, (String) aNVarC.f131498b.put(str.toLowerCase(), str2)));
    }

    public synchronized void a(View view, Collection collection) {
        boolean z10;
        Iterator it = collection.iterator();
        while (true) {
            while (it.hasNext()) {
                z10 = e(view, (String) it.next()) || z10;
            }
            a(view, z10);
        }
    }

    public synchronized void a(C14060ee c14060ee) {
        this.f131495b = c14060ee;
    }

    public synchronized void b(View view, String str) {
        boolean zContainsKey;
        String lowerCase = str.toLowerCase();
        aN aNVar = (aN) this.f131494a.get(view);
        if (aNVar == null || aNVar.f131498b == null) {
            zContainsKey = false;
        } else {
            zContainsKey = aNVar.f131498b.containsKey(lowerCase);
            aNVar.f131498b.remove(lowerCase);
        }
        a(view, zContainsKey);
    }

    public synchronized void b(View view, Collection collection) {
        boolean z10;
        Iterator it = collection.iterator();
        while (true) {
            while (it.hasNext()) {
                z10 = f(view, (String) it.next()) || z10;
            }
            a(view, z10);
        }
    }

    public synchronized void c(View view, String str) {
        a(view, e(view, str));
    }

    public synchronized void d(View view, String str) {
        a(view, f(view, str));
    }
}
