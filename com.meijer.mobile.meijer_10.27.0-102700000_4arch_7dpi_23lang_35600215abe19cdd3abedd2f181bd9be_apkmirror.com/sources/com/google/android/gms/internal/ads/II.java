package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class II {

    /* renamed from: h, reason: collision with root package name */
    public static final II f67591h = new II(new GI());

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9946xh f67592a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9625uh f67593b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6932Lh f67594c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6830Ih f67595d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC7922ek f67596e;

    /* renamed from: f, reason: collision with root package name */
    private final Z.n0 f67597f;

    /* renamed from: g, reason: collision with root package name */
    private final Z.n0 f67598g;

    public final InterfaceC9625uh a() {
        return this.f67593b;
    }

    public final InterfaceC9946xh b() {
        return this.f67592a;
    }

    public final InterfaceC6830Ih e() {
        return this.f67595d;
    }

    public final InterfaceC6932Lh f() {
        return this.f67594c;
    }

    public final InterfaceC7922ek g() {
        return this.f67596e;
    }

    private II(GI gi2) {
        this.f67592a = gi2.f67162a;
        this.f67593b = gi2.f67163b;
        this.f67594c = gi2.f67164c;
        this.f67597f = new Z.n0(gi2.f67167f);
        this.f67598g = new Z.n0(gi2.f67168g);
        this.f67595d = gi2.f67165d;
        this.f67596e = gi2.f67166e;
    }

    public final InterfaceC6592Bh c(String str) {
        return (InterfaceC6592Bh) this.f67598g.get(str);
    }

    public final InterfaceC6694Eh d(String str) {
        if (str == null) {
            return null;
        }
        return (InterfaceC6694Eh) this.f67597f.get(str);
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList(this.f67597f.getSize());
        for (int i10 = 0; i10 < this.f67597f.getSize(); i10++) {
            arrayList.add((String) this.f67597f.g(i10));
        }
        return arrayList;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        if (this.f67594c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f67592a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f67593b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.f67597f.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f67596e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
