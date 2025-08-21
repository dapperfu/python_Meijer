package tf;

import tf.AbstractC17252G;

/* renamed from: tf.E, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C17250E extends AbstractC17252G.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f162655a;

    /* renamed from: b, reason: collision with root package name */
    private final String f162656b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f162657c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17252G.c) {
            AbstractC17252G.c cVar = (AbstractC17252G.c) obj;
            if (this.f162655a.equals(cVar.d()) && this.f162656b.equals(cVar.c()) && this.f162657c == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // tf.AbstractC17252G.c
    public boolean b() {
        return this.f162657c;
    }

    @Override // tf.AbstractC17252G.c
    public String c() {
        return this.f162656b;
    }

    @Override // tf.AbstractC17252G.c
    public String d() {
        return this.f162655a;
    }

    public int hashCode() {
        return ((((this.f162655a.hashCode() ^ 1000003) * 1000003) ^ this.f162656b.hashCode()) * 1000003) ^ (this.f162657c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f162655a + ", osCodeName=" + this.f162656b + ", isRooted=" + this.f162657c + "}";
    }

    C17250E(String str, String str2, boolean z10) {
        if (str != null) {
            this.f162655a = str;
            if (str2 != null) {
                this.f162656b = str2;
                this.f162657c = z10;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }
}
