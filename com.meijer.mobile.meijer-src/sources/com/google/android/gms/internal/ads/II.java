package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class II {

    /* renamed from: h, reason: collision with root package name */
    public static final II f68431h = new II(new GI());

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10071xh f68432a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9750uh f68433b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7057Lh f68434c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6955Ih f68435d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC8047ek f68436e;

    /* renamed from: f, reason: collision with root package name */
    private final Z.n0 f68437f;

    /* renamed from: g, reason: collision with root package name */
    private final Z.n0 f68438g;

    public final InterfaceC9750uh a() {
        return this.f68433b;
    }

    public final InterfaceC10071xh b() {
        return this.f68432a;
    }

    public final InterfaceC6955Ih e() {
        return this.f68435d;
    }

    public final InterfaceC7057Lh f() {
        return this.f68434c;
    }

    public final InterfaceC8047ek g() {
        return this.f68436e;
    }

    private II(GI gi2) {
        this.f68432a = gi2.f68002a;
        this.f68433b = gi2.f68003b;
        this.f68434c = gi2.f68004c;
        this.f68437f = new Z.n0(gi2.f68007f);
        this.f68438g = new Z.n0(gi2.f68008g);
        this.f68435d = gi2.f68005d;
        this.f68436e = gi2.f68006e;
    }

    public final InterfaceC6717Bh c(String str) {
        return (InterfaceC6717Bh) this.f68438g.get(str);
    }

    public final InterfaceC6819Eh d(String str) {
        if (str == null) {
            return null;
        }
        return (InterfaceC6819Eh) this.f68437f.get(str);
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList(this.f68437f.getSize());
        for (int i10 = 0; i10 < this.f68437f.getSize(); i10++) {
            arrayList.add((String) this.f68437f.g(i10));
        }
        return arrayList;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        if (this.f68434c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f68432a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f68433b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.f68437f.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f68436e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
