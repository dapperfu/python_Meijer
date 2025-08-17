package sc;

import android.content.Context;

/* renamed from: sc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16923c extends AbstractC16928h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f160395a;

    /* renamed from: b, reason: collision with root package name */
    private final Bc.a f160396b;

    /* renamed from: c, reason: collision with root package name */
    private final Bc.a f160397c;

    /* renamed from: d, reason: collision with root package name */
    private final String f160398d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16928h) {
            AbstractC16928h abstractC16928h = (AbstractC16928h) obj;
            if (this.f160395a.equals(abstractC16928h.b()) && this.f160396b.equals(abstractC16928h.e()) && this.f160397c.equals(abstractC16928h.d()) && this.f160398d.equals(abstractC16928h.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // sc.AbstractC16928h
    public Context b() {
        return this.f160395a;
    }

    @Override // sc.AbstractC16928h
    public String c() {
        return this.f160398d;
    }

    @Override // sc.AbstractC16928h
    public Bc.a d() {
        return this.f160397c;
    }

    @Override // sc.AbstractC16928h
    public Bc.a e() {
        return this.f160396b;
    }

    public int hashCode() {
        return ((((((this.f160395a.hashCode() ^ 1000003) * 1000003) ^ this.f160396b.hashCode()) * 1000003) ^ this.f160397c.hashCode()) * 1000003) ^ this.f160398d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f160395a + ", wallClock=" + this.f160396b + ", monotonicClock=" + this.f160397c + ", backendName=" + this.f160398d + "}";
    }

    C16923c(Context context, Bc.a aVar, Bc.a aVar2, String str) {
        if (context != null) {
            this.f160395a = context;
            if (aVar != null) {
                this.f160396b = aVar;
                if (aVar2 != null) {
                    this.f160397c = aVar2;
                    if (str != null) {
                        this.f160398d = str;
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
