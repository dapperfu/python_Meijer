package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
class l extends BaseAdapter {

    /* renamed from: g, reason: collision with root package name */
    static final int f86914g = q.i().getMaximum(4);

    /* renamed from: h, reason: collision with root package name */
    private static final int f86915h = (q.i().getMaximum(5) + q.i().getMaximum(7)) - 1;

    /* renamed from: a, reason: collision with root package name */
    final k f86916a;

    /* renamed from: b, reason: collision with root package name */
    final d<?> f86917b;

    /* renamed from: c, reason: collision with root package name */
    private Collection<Long> f86918c;

    /* renamed from: d, reason: collision with root package name */
    c f86919d;

    /* renamed from: e, reason: collision with root package name */
    final a f86920e;

    /* renamed from: f, reason: collision with root package name */
    final g f86921f;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    boolean i(int i10) {
        return (i10 + 1) % this.f86916a.f86910d == 0;
    }

    private void f(Context context) {
        if (this.f86919d == null) {
            this.f86919d = new c(context);
        }
    }

    private boolean j(long j10) {
        Iterator<Long> it = this.f86917b.o3().iterator();
        while (it.hasNext()) {
            if (q.a(j10) == q.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private void o(TextView textView, long j10, int i10) {
        boolean zJ;
        b bVar;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String strC = c(context, j10);
        textView.setContentDescription(strC);
        boolean zB1 = this.f86920e.g().b1(j10);
        if (zB1) {
            textView.setEnabled(true);
            zJ = j(j10);
            textView.setSelected(zJ);
            bVar = zJ ? this.f86919d.f86894b : l(j10) ? this.f86919d.f86895c : this.f86919d.f86893a;
        } else {
            zJ = false;
            textView.setEnabled(false);
            bVar = this.f86919d.f86899g;
        }
        boolean z10 = zJ;
        g gVar = this.f86921f;
        if (gVar == null || i10 == -1) {
            bVar.d(textView);
            return;
        }
        k kVar = this.f86916a;
        int i11 = kVar.f86909c;
        int i12 = kVar.f86908b;
        bVar.e(textView, gVar.a(context, i11, i12, i10, zB1, z10), this.f86921f.g(context, i11, i12, i10, zB1, z10));
        textView.setCompoundDrawables(this.f86921f.c(context, i11, i12, i10, zB1, z10), this.f86921f.e(context, i11, i12, i10, zB1, z10), this.f86921f.d(context, i11, i12, i10, zB1, z10), this.f86921f.b(context, i11, i12, i10, zB1, z10));
        textView.setContentDescription(this.f86921f.f(context, i11, i12, i10, zB1, z10, strC));
    }

    int a(int i10) {
        return b() + (i10 - 1);
    }

    int b() {
        return this.f86916a.t(this.f86920e.i());
    }

    boolean g(long j10) {
        Iterator<o2.d<Long, Long>> it = this.f86917b.W1().iterator();
        while (it.hasNext()) {
            Long l10 = it.next().f153139b;
            if (l10 != null && l10.longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f86915h;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f86916a.f86910d;
    }

    boolean h(int i10) {
        return i10 % this.f86916a.f86910d == 0;
    }

    boolean k(long j10) {
        Iterator<o2.d<Long, Long>> it = this.f86917b.W1().iterator();
        while (it.hasNext()) {
            Long l10 = it.next().f153138a;
            if (l10 != null && l10.longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    public void q(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f86918c.iterator();
        while (it.hasNext()) {
            p(materialCalendarGridView, it.next().longValue());
        }
        d<?> dVar = this.f86917b;
        if (dVar != null) {
            Iterator<Long> it2 = dVar.o3().iterator();
            while (it2.hasNext()) {
                p(materialCalendarGridView, it2.next().longValue());
            }
            this.f86918c = this.f86917b.o3();
        }
    }

    l(k kVar, d<?> dVar, a aVar, g gVar) {
        this.f86916a = kVar;
        this.f86917b = dVar;
        this.f86920e = aVar;
        this.f86921f = gVar;
        this.f86918c = dVar.o3();
    }

    private String c(Context context, long j10) {
        return e.a(context, j10, l(j10), k(j10), g(j10));
    }

    private boolean l(long j10) {
        if (q.g().getTimeInMillis() == j10) {
            return true;
        }
        return false;
    }

    private void p(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (k.e(j10).equals(this.f86916a)) {
            int iB = this.f86916a.B(j10);
            o((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(iB) - materialCalendarGridView.getFirstVisiblePosition()), j10, iB);
        }
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i10) {
        if (i10 >= b() && i10 <= m()) {
            return Long.valueOf(this.f86916a.w(n(i10)));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    @Override // android.widget.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.f(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = ae.h.f44735u
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L54
            com.google.android.material.datepicker.k r8 = r5.f86916a
            int r2 = r8.f86911e
            if (r7 < r2) goto L2d
            goto L54
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L5d
        L54:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L5d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L64
            return r0
        L64:
            long r1 = r6.longValue()
            r5.o(r0, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.l.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    int m() {
        return (b() + this.f86916a.f86911e) - 1;
    }

    int n(int i10) {
        return (i10 - b()) + 1;
    }

    boolean r(int i10) {
        if (i10 >= b() && i10 <= m()) {
            return true;
        }
        return false;
    }
}
