package fsimpl;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes15.dex */
public class aL {

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap f132744a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    private C14185ee f132745b;

    /* renamed from: c, reason: collision with root package name */
    private Map f132746c;

    public aL(Map map) {
        this.f132746c = map;
    }

    private void a(View view, boolean z10) {
        if (z10) {
            d(view);
        }
    }

    private List b(View view) {
        String str = (String) this.f132746c.get(Integer.valueOf(view.getId()));
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
        aN aNVar = (aN) this.f132744a.get(view);
        if (aNVar != null) {
            return aNVar;
        }
        aN aNVar2 = new aN();
        this.f132744a.put(view, aNVar2);
        return aNVar2;
    }

    private synchronized void d(View view) {
        C14185ee c14185ee = this.f132745b;
        if (c14185ee != null) {
            c14185ee.a(view);
        }
    }

    private boolean e(View view, String str) {
        aN aNVarC = c(view);
        if (aNVarC.f132747a == null) {
            aNVarC.f132747a = new ArrayList();
        }
        if (aNVarC.f132747a.contains(str)) {
            return false;
        }
        aNVarC.f132747a.add(str);
        return true;
    }

    private boolean f(View view, String str) {
        aN aNVar = (aN) this.f132744a.get(view);
        if (aNVar == null || aNVar.f132747a == null) {
            return false;
        }
        return aNVar.f132747a.remove(str);
    }

    public synchronized C14185ee a() {
        return this.f132745b;
    }

    public void a(View view) {
        aN aNVar = (aN) this.f132744a.get(view);
        if (aNVar == null || aNVar.f132747a == null || aNVar.f132747a.isEmpty()) {
            return;
        }
        aNVar.f132747a.clear();
        d(view);
    }

    public synchronized void a(View view, aK aKVar) {
        aN aNVar = (aN) this.f132744a.get(view);
        List listB = b(view);
        if (listB != null && listB.size() > 0) {
            aKVar.b();
            aKVar.f132737c.addAll(listB);
        }
        if (aNVar != null) {
            if (!fY.a(aNVar.f132749c)) {
                aKVar.f132735a = aNVar.f132749c.toLowerCase();
            }
            if (aNVar.f132747a != null) {
                aKVar.b();
                aKVar.f132737c.addAll(aNVar.f132747a);
            }
            if (aNVar.f132748b != null) {
                aKVar.a();
                aKVar.f132738d.putAll(aNVar.f132748b);
            }
        }
    }

    public synchronized void a(View view, String str) {
        boolean zEquals;
        aN aNVarC = c(view);
        String str2 = aNVarC.f132749c;
        if (fY.a(str)) {
            str = null;
        }
        aNVarC.f132749c = str;
        if (str2 == null && aNVarC.f132749c == null) {
            zEquals = false;
        } else {
            zEquals = true;
            if (str2 != null && aNVarC.f132749c != null) {
                zEquals = true ^ str2.equals(aNVarC.f132749c);
            }
        }
        a(view, zEquals);
    }

    public synchronized void a(View view, String str, String str2) {
        aN aNVarC = c(view);
        if (aNVarC.f132748b == null) {
            aNVarC.f132748b = new HashMap();
        }
        a(view, !fY.a(str2, (String) aNVarC.f132748b.put(str.toLowerCase(), str2)));
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

    public synchronized void a(C14185ee c14185ee) {
        this.f132745b = c14185ee;
    }

    public synchronized void b(View view, String str) {
        boolean zContainsKey;
        String lowerCase = str.toLowerCase();
        aN aNVar = (aN) this.f132744a.get(view);
        if (aNVar == null || aNVar.f132748b == null) {
            zContainsKey = false;
        } else {
            zContainsKey = aNVar.f132748b.containsKey(lowerCase);
            aNVar.f132748b.remove(lowerCase);
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
