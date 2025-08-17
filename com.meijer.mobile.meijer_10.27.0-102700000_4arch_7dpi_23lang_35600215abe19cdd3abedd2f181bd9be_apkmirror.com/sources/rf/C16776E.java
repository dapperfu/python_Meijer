package rf;

import rf.AbstractC16778G;

/* renamed from: rf.E, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C16776E extends AbstractC16778G.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f158209a;

    /* renamed from: b, reason: collision with root package name */
    private final String f158210b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f158211c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16778G.c) {
            AbstractC16778G.c cVar = (AbstractC16778G.c) obj;
            if (this.f158209a.equals(cVar.d()) && this.f158210b.equals(cVar.c()) && this.f158211c == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // rf.AbstractC16778G.c
    public boolean b() {
        return this.f158211c;
    }

    @Override // rf.AbstractC16778G.c
    public String c() {
        return this.f158210b;
    }

    @Override // rf.AbstractC16778G.c
    public String d() {
        return this.f158209a;
    }

    public int hashCode() {
        return ((((this.f158209a.hashCode() ^ 1000003) * 1000003) ^ this.f158210b.hashCode()) * 1000003) ^ (this.f158211c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f158209a + ", osCodeName=" + this.f158210b + ", isRooted=" + this.f158211c + "}";
    }

    C16776E(String str, String str2, boolean z10) {
        if (str != null) {
            this.f158209a = str;
            if (str2 != null) {
                this.f158210b = str2;
                this.f158211c = z10;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }
}
