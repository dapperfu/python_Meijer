package we;

import android.app.PendingIntent;

/* loaded from: classes4.dex */
final class d extends AbstractC17813a {

    /* renamed from: a, reason: collision with root package name */
    private final PendingIntent f166041a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f166042b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17813a) {
            AbstractC17813a abstractC17813a = (AbstractC17813a) obj;
            if (this.f166041a.equals(abstractC17813a.a()) && this.f166042b == abstractC17813a.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // we.AbstractC17813a
    final PendingIntent a() {
        return this.f166041a;
    }

    @Override // we.AbstractC17813a
    final boolean b() {
        return this.f166042b;
    }

    public final int hashCode() {
        return ((this.f166041a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f166042b ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f166041a.toString() + ", isNoOp=" + this.f166042b + "}";
    }

    d(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent != null) {
            this.f166041a = pendingIntent;
            this.f166042b = z10;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }
}
