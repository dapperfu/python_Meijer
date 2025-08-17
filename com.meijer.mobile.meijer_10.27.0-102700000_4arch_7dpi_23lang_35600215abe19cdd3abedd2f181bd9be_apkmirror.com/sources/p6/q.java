package p6;

import g6.C14209i;
import i6.C14693d;
import i6.InterfaceC14692c;
import java.util.Arrays;
import java.util.List;
import q6.AbstractC16472b;

/* loaded from: classes4.dex */
public class q implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f155606a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f155607b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f155608c;

    @Override // p6.c
    public InterfaceC14692c a(com.airbnb.lottie.o oVar, C14209i c14209i, AbstractC16472b abstractC16472b) {
        return new C14693d(oVar, abstractC16472b, this, c14209i);
    }

    public List<c> b() {
        return this.f155607b;
    }

    public String c() {
        return this.f155606a;
    }

    public boolean d() {
        return this.f155608c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f155606a + "' Shapes: " + Arrays.toString(this.f155607b.toArray()) + '}';
    }

    public q(String str, List<c> list, boolean z10) {
        this.f155606a = str;
        this.f155607b = list;
        this.f155608c = z10;
    }
}
