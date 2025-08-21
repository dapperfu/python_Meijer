package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class a<T extends i<T>> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Integer, T> f87950a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Set<Integer> f87951b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private b f87952c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f87953d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f87954e;

    /* renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    class C1279a implements i.a<T> {
        C1279a() {
        }

        @Override // com.google.android.material.internal.i.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(T t10, boolean z10) {
            if (!z10) {
                a aVar = a.this;
                if (!aVar.r(t10, aVar.f87954e)) {
                    return;
                }
            } else if (!a.this.g(t10)) {
                return;
            }
            a.this.m();
        }
    }

    public interface b {
        void a(Set<Integer> set);
    }

    public void n(T t10) {
        t10.setInternalOnCheckedChangeListener(null);
        this.f87950a.remove(Integer.valueOf(t10.getId()));
        this.f87951b.remove(Integer.valueOf(t10.getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        b bVar = this.f87952c;
        if (bVar != null) {
            bVar.a(i());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(T t10) {
        this.f87950a.put(Integer.valueOf(t10.getId()), t10);
        if (t10.isChecked()) {
            g(t10);
        }
        t10.setInternalOnCheckedChangeListener(new C1279a());
    }

    public void f(int i10) {
        T t10 = this.f87950a.get(Integer.valueOf(i10));
        if (t10 != null && g(t10)) {
            m();
        }
    }

    public void h() {
        boolean zIsEmpty = this.f87951b.isEmpty();
        Iterator<T> it = this.f87950a.values().iterator();
        while (it.hasNext()) {
            r(it.next(), false);
        }
        if (zIsEmpty) {
            return;
        }
        m();
    }

    public Set<Integer> i() {
        return new HashSet(this.f87951b);
    }

    public int k() {
        if (!this.f87953d || this.f87951b.isEmpty()) {
            return -1;
        }
        return this.f87951b.iterator().next().intValue();
    }

    public boolean l() {
        return this.f87953d;
    }

    public void o(b bVar) {
        this.f87952c = bVar;
    }

    public void p(boolean z10) {
        this.f87954e = z10;
    }

    public void q(boolean z10) {
        if (this.f87953d != z10) {
            this.f87953d = z10;
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(i<T> iVar) {
        int id2 = iVar.getId();
        if (this.f87951b.contains(Integer.valueOf(id2))) {
            return false;
        }
        T t10 = this.f87950a.get(Integer.valueOf(k()));
        if (t10 != null) {
            r(t10, false);
        }
        boolean zAdd = this.f87951b.add(Integer.valueOf(id2));
        if (!iVar.isChecked()) {
            iVar.setChecked(true);
        }
        return zAdd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(i<T> iVar, boolean z10) {
        int id2 = iVar.getId();
        if (!this.f87951b.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (z10 && this.f87951b.size() == 1 && this.f87951b.contains(Integer.valueOf(id2))) {
            iVar.setChecked(true);
            return false;
        }
        boolean zRemove = this.f87951b.remove(Integer.valueOf(id2));
        if (iVar.isChecked()) {
            iVar.setChecked(false);
        }
        return zRemove;
    }

    public List<Integer> j(ViewGroup viewGroup) {
        Set<Integer> setI = i();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof i) && setI.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }
}
