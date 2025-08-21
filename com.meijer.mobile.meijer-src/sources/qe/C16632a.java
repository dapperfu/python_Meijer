package qe;

import android.graphics.Typeface;

/* renamed from: qe.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16632a extends AbstractC16637f {

    /* renamed from: a, reason: collision with root package name */
    private final Typeface f158241a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2462a f158242b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f158243c;

    /* renamed from: qe.a$a, reason: collision with other inner class name */
    public interface InterfaceC2462a {
        void a(Typeface typeface);
    }

    public void c() {
        this.f158243c = true;
    }

    private void d(Typeface typeface) {
        if (this.f158243c) {
            return;
        }
        this.f158242b.a(typeface);
    }

    @Override // qe.AbstractC16637f
    public void a(int i10) {
        d(this.f158241a);
    }

    public C16632a(InterfaceC2462a interfaceC2462a, Typeface typeface) {
        this.f158241a = typeface;
        this.f158242b = interfaceC2462a;
    }

    @Override // qe.AbstractC16637f
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }
}
