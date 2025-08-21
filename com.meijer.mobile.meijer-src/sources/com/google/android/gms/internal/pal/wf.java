package com.google.android.gms.internal.pal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class wf extends AbstractMap implements Serializable {

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator f85029h = new pf();

    /* renamed from: a, reason: collision with root package name */
    final Comparator f85030a;

    /* renamed from: b, reason: collision with root package name */
    vf f85031b;

    /* renamed from: c, reason: collision with root package name */
    int f85032c;

    /* renamed from: d, reason: collision with root package name */
    int f85033d;

    /* renamed from: e, reason: collision with root package name */
    final vf f85034e;

    /* renamed from: f, reason: collision with root package name */
    private rf f85035f;

    /* renamed from: g, reason: collision with root package name */
    private tf f85036g;

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
        this.f85031b = null;
        this.f85032c = 0;
        this.f85033d++;
        vf vfVar = this.f85034e;
        vfVar.f84999e = vfVar;
        vfVar.f84998d = vfVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f85032c;
    }

    public wf() {
        Comparator comparator = f85029h;
        this.f85032c = 0;
        this.f85033d = 0;
        this.f85034e = new vf();
        this.f85030a = comparator;
    }

    private final void g(vf vfVar, boolean z10) {
        while (vfVar != null) {
            vf vfVar2 = vfVar.f84996b;
            vf vfVar3 = vfVar.f84997c;
            int i10 = vfVar2 != null ? vfVar2.f85002h : 0;
            int i11 = vfVar3 != null ? vfVar3.f85002h : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                vf vfVar4 = vfVar3.f84996b;
                vf vfVar5 = vfVar3.f84997c;
                int i13 = (vfVar4 != null ? vfVar4.f85002h : 0) - (vfVar5 != null ? vfVar5.f85002h : 0);
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
                vf vfVar6 = vfVar2.f84996b;
                vf vfVar7 = vfVar2.f84997c;
                int i14 = (vfVar6 != null ? vfVar6.f85002h : 0) - (vfVar7 != null ? vfVar7.f85002h : 0);
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
                vfVar.f85002h = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                vfVar.f85002h = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            vfVar = vfVar.f84995a;
        }
    }

    private final void h(vf vfVar, vf vfVar2) {
        vf vfVar3 = vfVar.f84995a;
        vfVar.f84995a = null;
        if (vfVar2 != null) {
            vfVar2.f84995a = vfVar3;
        }
        if (vfVar3 == null) {
            this.f85031b = vfVar2;
        } else if (vfVar3.f84996b == vfVar) {
            vfVar3.f84996b = vfVar2;
        } else {
            vfVar3.f84997c = vfVar2;
        }
    }

    private final void i(vf vfVar) {
        vf vfVar2 = vfVar.f84996b;
        vf vfVar3 = vfVar.f84997c;
        vf vfVar4 = vfVar3.f84996b;
        vf vfVar5 = vfVar3.f84997c;
        vfVar.f84997c = vfVar4;
        if (vfVar4 != null) {
            vfVar4.f84995a = vfVar;
        }
        h(vfVar, vfVar3);
        vfVar3.f84996b = vfVar;
        vfVar.f84995a = vfVar3;
        int iMax = Math.max(vfVar2 != null ? vfVar2.f85002h : 0, vfVar4 != null ? vfVar4.f85002h : 0) + 1;
        vfVar.f85002h = iMax;
        vfVar3.f85002h = Math.max(iMax, vfVar5 != null ? vfVar5.f85002h : 0) + 1;
    }

    private final void j(vf vfVar) {
        vf vfVar2 = vfVar.f84996b;
        vf vfVar3 = vfVar.f84997c;
        vf vfVar4 = vfVar2.f84996b;
        vf vfVar5 = vfVar2.f84997c;
        vfVar.f84996b = vfVar5;
        if (vfVar5 != null) {
            vfVar5.f84995a = vfVar;
        }
        h(vfVar, vfVar2);
        vfVar2.f84997c = vfVar;
        vfVar.f84995a = vfVar2;
        int iMax = Math.max(vfVar3 != null ? vfVar3.f85002h : 0, vfVar5 != null ? vfVar5.f85002h : 0) + 1;
        vfVar.f85002h = iMax;
        vfVar2.f85002h = Math.max(iMax, vfVar4 != null ? vfVar4.f85002h : 0) + 1;
    }

    final vf a(Object obj, boolean z10) {
        int iCompareTo;
        vf vfVar;
        Comparator comparator = this.f85030a;
        vf vfVar2 = this.f85031b;
        if (vfVar2 != null) {
            Comparable comparable = comparator == f85029h ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(vfVar2.f85000f) : comparator.compare(obj, vfVar2.f85000f);
                if (iCompareTo == 0) {
                    return vfVar2;
                }
                vf vfVar3 = iCompareTo < 0 ? vfVar2.f84996b : vfVar2.f84997c;
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
        vf vfVar4 = this.f85034e;
        if (vfVar2 != null) {
            vfVar = new vf(vfVar2, obj, vfVar4, vfVar4.f84999e);
            if (iCompareTo < 0) {
                vfVar2.f84996b = vfVar;
            } else {
                vfVar2.f84997c = vfVar;
            }
            g(vfVar2, true);
        } else {
            if (comparator == f85029h && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            vfVar = new vf(null, obj, vfVar4, vfVar4.f84999e);
            this.f85031b = vfVar;
        }
        this.f85032c++;
        this.f85033d++;
        return vfVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        rf rfVar = this.f85035f;
        if (rfVar != null) {
            return rfVar;
        }
        rf rfVar2 = new rf(this);
        this.f85035f = rfVar2;
        return rfVar2;
    }

    final void f(vf vfVar, boolean z10) {
        vf vfVar2;
        vf vfVar3;
        int i10;
        if (z10) {
            vf vfVar4 = vfVar.f84999e;
            vfVar4.f84998d = vfVar.f84998d;
            vfVar.f84998d.f84999e = vfVar4;
        }
        vf vfVar5 = vfVar.f84996b;
        vf vfVar6 = vfVar.f84997c;
        vf vfVar7 = vfVar.f84995a;
        int i11 = 0;
        if (vfVar5 == null || vfVar6 == null) {
            if (vfVar5 != null) {
                h(vfVar, vfVar5);
                vfVar.f84996b = null;
            } else if (vfVar6 != null) {
                h(vfVar, vfVar6);
                vfVar.f84997c = null;
            } else {
                h(vfVar, null);
            }
            g(vfVar7, false);
            this.f85032c--;
            this.f85033d++;
            return;
        }
        if (vfVar5.f85002h > vfVar6.f85002h) {
            do {
                vfVar3 = vfVar5;
                vfVar5 = vfVar5.f84997c;
            } while (vfVar5 != null);
        } else {
            do {
                vfVar2 = vfVar6;
                vfVar6 = vfVar6.f84996b;
            } while (vfVar6 != null);
            vfVar3 = vfVar2;
        }
        f(vfVar3, false);
        vf vfVar8 = vfVar.f84996b;
        if (vfVar8 != null) {
            i10 = vfVar8.f85002h;
            vfVar3.f84996b = vfVar8;
            vfVar8.f84995a = vfVar3;
            vfVar.f84996b = null;
        } else {
            i10 = 0;
        }
        vf vfVar9 = vfVar.f84997c;
        if (vfVar9 != null) {
            i11 = vfVar9.f85002h;
            vfVar3.f84997c = vfVar9;
            vfVar9.f84995a = vfVar3;
            vfVar.f84997c = null;
        }
        vfVar3.f85002h = Math.max(i10, i11) + 1;
        h(vfVar, vfVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        tf tfVar = this.f85036g;
        if (tfVar != null) {
            return tfVar;
        }
        tf tfVar2 = new tf(this);
        this.f85036g = tfVar2;
        return tfVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        vf vfVarA = a(obj, true);
        Object obj3 = vfVarA.f85001g;
        vfVarA.f85001g = obj2;
        return obj3;
    }

    final vf b(Map.Entry entry) {
        vf vfVarC = c(entry.getKey());
        if (vfVarC != null) {
            Object obj = vfVarC.f85001g;
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
            return vfVarC.f85001g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        vf vfVarD = d(obj);
        if (vfVarD != null) {
            return vfVarD.f85001g;
        }
        return null;
    }
}
