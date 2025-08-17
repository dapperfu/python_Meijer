package oe;

import android.graphics.Typeface;

/* renamed from: oe.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16024a extends AbstractC16029f {

    /* renamed from: a, reason: collision with root package name */
    private final Typeface f153389a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2386a f153390b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f153391c;

    /* renamed from: oe.a$a, reason: collision with other inner class name */
    public interface InterfaceC2386a {
        void a(Typeface typeface);
    }

    public void c() {
        this.f153391c = true;
    }

    private void d(Typeface typeface) {
        if (this.f153391c) {
            return;
        }
        this.f153390b.a(typeface);
    }

    @Override // oe.AbstractC16029f
    public void a(int i10) {
        d(this.f153389a);
    }

    public C16024a(InterfaceC2386a interfaceC2386a, Typeface typeface) {
        this.f153389a = typeface;
        this.f153390b = interfaceC2386a;
    }

    @Override // oe.AbstractC16029f
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }
}
