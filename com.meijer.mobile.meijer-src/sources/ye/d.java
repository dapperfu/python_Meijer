package ye;

import android.app.PendingIntent;

/* loaded from: classes4.dex */
final class d extends AbstractC18306a {

    /* renamed from: a, reason: collision with root package name */
    private final PendingIntent f171363a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f171364b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC18306a) {
            AbstractC18306a abstractC18306a = (AbstractC18306a) obj;
            if (this.f171363a.equals(abstractC18306a.a()) && this.f171364b == abstractC18306a.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // ye.AbstractC18306a
    final PendingIntent a() {
        return this.f171363a;
    }

    @Override // ye.AbstractC18306a
    final boolean b() {
        return this.f171364b;
    }

    public final int hashCode() {
        return ((this.f171363a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f171364b ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f171363a.toString() + ", isNoOp=" + this.f171364b + "}";
    }

    d(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent != null) {
            this.f171363a = pendingIntent;
            this.f171364b = z10;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }
}
