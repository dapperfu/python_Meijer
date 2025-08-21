package q6;

import h6.C14478i;
import j6.C14952d;
import j6.InterfaceC14951c;
import java.util.Arrays;
import java.util.List;
import r6.AbstractC16860b;

/* loaded from: classes4.dex */
public class q implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f158010a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f158011b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f158012c;

    @Override // q6.c
    public InterfaceC14951c a(com.airbnb.lottie.o oVar, C14478i c14478i, AbstractC16860b abstractC16860b) {
        return new C14952d(oVar, abstractC16860b, this, c14478i);
    }

    public List<c> b() {
        return this.f158011b;
    }

    public String c() {
        return this.f158010a;
    }

    public boolean d() {
        return this.f158012c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f158010a + "' Shapes: " + Arrays.toString(this.f158011b.toArray()) + '}';
    }

    public q(String str, List<c> list, boolean z10) {
        this.f158010a = str;
        this.f158011b = list;
        this.f158012c = z10;
    }
}
