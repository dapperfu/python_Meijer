package com.google.android.gms.internal.pal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class wf extends AbstractMap implements Serializable {

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator f84189h = new pf();

    /* renamed from: a, reason: collision with root package name */
    final Comparator f84190a;

    /* renamed from: b, reason: collision with root package name */
    vf f84191b;

    /* renamed from: c, reason: collision with root package name */
    int f84192c;

    /* renamed from: d, reason: collision with root package name */
    int f84193d;

    /* renamed from: e, reason: collision with root package name */
    final vf f84194e;

    /* renamed from: f, reason: collision with root package name */
    private rf f84195f;

    /* renamed from: g, reason: collision with root package name */
    private tf f84196g;

    final vf c(Object obj) {
        if (obj != null) {
            try {
                return a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f84191b = null;
        this.f84192c = 0;
        this.f84193d++;
        vf vfVar = this.f84194e;
        vfVar.f84159e = vfVar;
        vfVar.f84158d = vfVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f84192c;
    }

    public wf() {
        Comparator comparator = f84189h;
        this.f84192c = 0;
        this.f84193d = 0;
        this.f84194e = new vf();
        this.f84190a = comparator;
    }

    private final void g(vf vfVar, boolean z10) {
        while (vfVar != null) {
            vf vfVar2 = vfVar.f84156b;
            vf vfVar3 = vfVar.f84157c;
            int i10 = vfVar2 != null ? vfVar2.f84162h : 0;
            int i11 = vfVar3 != null ? vfVar3.f84162h : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                vf vfVar4 = vfVar3.f84156b;
                vf vfVar5 = vfVar3.f84157c;
                int i13 = (vfVar4 != null ? vfVar4.f84162h : 0) - (vfVar5 != null ? vfVar5.f84162h : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    i(vfVar);
                } else {
                    j(vfVar3);
                    i(vfVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                vf vfVar6 = vfVar2.f84156b;
                vf vfVar7 = vfVar2.f84157c;
                int i14 = (vfVar6 != null ? vfVar6.f84162h : 0) - (vfVar7 != null ? vfVar7.f84162h : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    j(vfVar);
                } else {
                    i(vfVar2);
                    j(vfVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                vfVar.f84162h = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                vfVar.f84162h = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            vfVar = vfVar.f84155a;
        }
    }

    private final void h(vf vfVar, vf vfVar2) {
        vf vfVar3 = vfVar.f84155a;
        vfVar.f84155a = null;
        if (vfVar2 != null) {
            vfVar2.f84155a = vfVar3;
        }
        if (vfVar3 == null) {
            this.f84191b = vfVar2;
        } else if (vfVar3.f84156b == vfVar) {
            vfVar3.f84156b = vfVar2;
        } else {
            vfVar3.f84157c = vfVar2;
        }
    }

    private final void i(vf vfVar) {
        vf vfVar2 = vfVar.f84156b;
        vf vfVar3 = vfVar.f84157c;
        vf vfVar4 = vfVar3.f84156b;
        vf vfVar5 = vfVar3.f84157c;
        vfVar.f84157c = vfVar4;
        if (vfVar4 != null) {
            vfVar4.f84155a = vfVar;
        }
        h(vfVar, vfVar3);
        vfVar3.f84156b = vfVar;
        vfVar.f84155a = vfVar3;
        int iMax = Math.max(vfVar2 != null ? vfVar2.f84162h : 0, vfVar4 != null ? vfVar4.f84162h : 0) + 1;
        vfVar.f84162h = iMax;
        vfVar3.f84162h = Math.max(iMax, vfVar5 != null ? vfVar5.f84162h : 0) + 1;
    }

    private final void j(vf vfVar) {
        vf vfVar2 = vfVar.f84156b;
        vf vfVar3 = vfVar.f84157c;
        vf vfVar4 = vfVar2.f84156b;
        vf vfVar5 = vfVar2.f84157c;
        vfVar.f84156b = vfVar5;
        if (vfVar5 != null) {
            vfVar5.f84155a = vfVar;
        }
        h(vfVar, vfVar2);
        vfVar2.f84157c = vfVar;
        vfVar.f84155a = vfVar2;
        int iMax = Math.max(vfVar3 != null ? vfVar3.f84162h : 0, vfVar5 != null ? vfVar5.f84162h : 0) + 1;
        vfVar.f84162h = iMax;
        vfVar2.f84162h = Math.max(iMax, vfVar4 != null ? vfVar4.f84162h : 0) + 1;
    }

    final vf a(Object obj, boolean z10) {
        int iCompareTo;
        vf vfVar;
        Comparator comparator = this.f84190a;
        vf vfVar2 = this.f84191b;
        if (vfVar2 != null) {
            Comparable comparable = comparator == f84189h ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(vfVar2.f84160f) : comparator.compare(obj, vfVar2.f84160f);
                if (iCompareTo == 0) {
                    return vfVar2;
                }
                vf vfVar3 = iCompareTo < 0 ? vfVar2.f84156b : vfVar2.f84157c;
                if (vfVar3 == null) {
                    break;
                }
                vfVar2 = vfVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z10) {
            return null;
        }
        vf vfVar4 = this.f84194e;
        if (vfVar2 != null) {
            vfVar = new vf(vfVar2, obj, vfVar4, vfVar4.f84159e);
            if (iCompareTo < 0) {
                vfVar2.f84156b = vfVar;
            } else {
                vfVar2.f84157c = vfVar;
            }
            g(vfVar2, true);
        } else {
            if (comparator == f84189h && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            vfVar = new vf(null, obj, vfVar4, vfVar4.f84159e);
            this.f84191b = vfVar;
        }
        this.f84192c++;
        this.f84193d++;
        return vfVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        rf rfVar = this.f84195f;
        if (rfVar != null) {
            return rfVar;
        }
        rf rfVar2 = new rf(this);
        this.f84195f = rfVar2;
        return rfVar2;
    }

    final void f(vf vfVar, boolean z10) {
        vf vfVar2;
        vf vfVar3;
        int i10;
        if (z10) {
            vf vfVar4 = vfVar.f84159e;
            vfVar4.f84158d = vfVar.f84158d;
            vfVar.f84158d.f84159e = vfVar4;
        }
        vf vfVar5 = vfVar.f84156b;
        vf vfVar6 = vfVar.f84157c;
        vf vfVar7 = vfVar.f84155a;
        int i11 = 0;
        if (vfVar5 == null || vfVar6 == null) {
            if (vfVar5 != null) {
                h(vfVar, vfVar5);
                vfVar.f84156b = null;
            } else if (vfVar6 != null) {
                h(vfVar, vfVar6);
                vfVar.f84157c = null;
            } else {
                h(vfVar, null);
            }
            g(vfVar7, false);
            this.f84192c--;
            this.f84193d++;
            return;
        }
        if (vfVar5.f84162h > vfVar6.f84162h) {
            do {
                vfVar3 = vfVar5;
                vfVar5 = vfVar5.f84157c;
            } while (vfVar5 != null);
        } else {
            do {
                vfVar2 = vfVar6;
                vfVar6 = vfVar6.f84156b;
            } while (vfVar6 != null);
            vfVar3 = vfVar2;
        }
        f(vfVar3, false);
        vf vfVar8 = vfVar.f84156b;
        if (vfVar8 != null) {
            i10 = vfVar8.f84162h;
            vfVar3.f84156b = vfVar8;
            vfVar8.f84155a = vfVar3;
            vfVar.f84156b = null;
        } else {
            i10 = 0;
        }
        vf vfVar9 = vfVar.f84157c;
        if (vfVar9 != null) {
            i11 = vfVar9.f84162h;
            vfVar3.f84157c = vfVar9;
            vfVar9.f84155a = vfVar3;
            vfVar.f84157c = null;
        }
        vfVar3.f84162h = Math.max(i10, i11) + 1;
        h(vfVar, vfVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        tf tfVar = this.f84196g;
        if (tfVar != null) {
            return tfVar;
        }
        tf tfVar2 = new tf(this);
        this.f84196g = tfVar2;
        return tfVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        vf vfVarA = a(obj, true);
        Object obj3 = vfVarA.f84161g;
        vfVarA.f84161g = obj2;
        return obj3;
    }

    final vf b(Map.Entry entry) {
        vf vfVarC = c(entry.getKey());
        if (vfVarC != null) {
            Object obj = vfVarC.f84161g;
            Object value = entry.getValue();
            if (obj == value || (obj != null && obj.equals(value))) {
                return vfVarC;
            }
            return null;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (c(obj) != null) {
            return true;
        }
        return false;
    }

    final vf d(Object obj) {
        vf vfVarC = c(obj);
        if (vfVarC != null) {
            f(vfVarC, true);
        }
        return vfVarC;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        vf vfVarC = c(obj);
        if (vfVarC != null) {
            return vfVarC.f84161g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        vf vfVarD = d(obj);
        if (vfVarD != null) {
            return vfVarD.f84161g;
        }
        return null;
    }
}
