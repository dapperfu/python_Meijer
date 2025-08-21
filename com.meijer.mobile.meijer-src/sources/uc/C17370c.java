package uc;

import android.content.Context;

/* renamed from: uc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C17370c extends AbstractC17375h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f163881a;

    /* renamed from: b, reason: collision with root package name */
    private final Dc.a f163882b;

    /* renamed from: c, reason: collision with root package name */
    private final Dc.a f163883c;

    /* renamed from: d, reason: collision with root package name */
    private final String f163884d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17375h) {
            AbstractC17375h abstractC17375h = (AbstractC17375h) obj;
            if (this.f163881a.equals(abstractC17375h.b()) && this.f163882b.equals(abstractC17375h.e()) && this.f163883c.equals(abstractC17375h.d()) && this.f163884d.equals(abstractC17375h.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // uc.AbstractC17375h
    public Context b() {
        return this.f163881a;
    }

    @Override // uc.AbstractC17375h
    public String c() {
        return this.f163884d;
    }

    @Override // uc.AbstractC17375h
    public Dc.a d() {
        return this.f163883c;
    }

    @Override // uc.AbstractC17375h
    public Dc.a e() {
        return this.f163882b;
    }

    public int hashCode() {
        return ((((((this.f163881a.hashCode() ^ 1000003) * 1000003) ^ this.f163882b.hashCode()) * 1000003) ^ this.f163883c.hashCode()) * 1000003) ^ this.f163884d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f163881a + ", wallClock=" + this.f163882b + ", monotonicClock=" + this.f163883c + ", backendName=" + this.f163884d + "}";
    }

    C17370c(Context context, Dc.a aVar, Dc.a aVar2, String str) {
        if (context != null) {
            this.f163881a = context;
            if (aVar != null) {
                this.f163882b = aVar;
                if (aVar2 != null) {
                    this.f163883c = aVar2;
                    if (str != null) {
                        this.f163884d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }
}
