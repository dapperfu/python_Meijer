package ps;

import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJD\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u0006\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001c\u0010#R\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010'\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b\u001b\u0010#¨\u0006("}, d2 = {"Lps/F;", "", "", "isUserLoggedIn", "", "userFirstName", "isHomeStoreSet", "homeStoreName", "", "homeStoreId", "<init>", "(ZLjava/lang/String;ZLjava/lang/String;I)V", "a", "(ZLjava/lang/String;ZLjava/lang/String;I)Lps/F;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "g", "()Z", "b", "Ljava/lang/String;", "e", "c", "d", "getHomeStoreName", "I", "getHomeStoreId", "Lak/a;", "f", "Lak/a;", "()Lak/a;", "storeName", "welcomeMessage", "h", "locationDescription", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ps.F, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class HeaderDecorator {

    /* renamed from: i, reason: collision with root package name */
    public static final int f156340i = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isUserLoggedIn;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String userFirstName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isHomeStoreSet;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String homeStoreName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int homeStoreId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a storeName;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a welcomeMessage;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a locationDescription;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderDecorator)) {
            return false;
        }
        HeaderDecorator headerDecorator = (HeaderDecorator) other;
        return this.isUserLoggedIn == headerDecorator.isUserLoggedIn && Intrinsics.e(this.userFirstName, headerDecorator.userFirstName) && this.isHomeStoreSet == headerDecorator.isHomeStoreSet && Intrinsics.e(this.homeStoreName, headerDecorator.homeStoreName) && this.homeStoreId == headerDecorator.homeStoreId;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HeaderDecorator(boolean r3, java.lang.String r4, boolean r5, java.lang.String r6, int r7) {
        /*
            r2 = this;
            java.lang.String r0 = "userFirstName"
            kotlin.jvm.internal.Intrinsics.j(r4, r0)
            r2.<init>()
            r2.isUserLoggedIn = r3
            r2.userFirstName = r4
            r2.isHomeStoreSet = r5
            r2.homeStoreName = r6
            r2.homeStoreId = r7
            ak.a$a r3 = ak.AbstractC5607a.INSTANCE
            int r7 = ps.j0.f156563m
            r0 = 0
            if (r6 == 0) goto L2a
            boolean r1 = kotlin.text.StringsKt.r0(r6)
            if (r1 != 0) goto L20
            goto L21
        L20:
            r6 = 0
        L21:
            if (r6 == 0) goto L2a
            ak.a r6 = r3.c(r6)
            if (r6 == 0) goto L2a
            goto L32
        L2a:
            int r6 = ps.j0.f156557g
            java.lang.Object[] r1 = new java.lang.Object[r0]
            ak.a r6 = r3.d(r6, r1)
        L32:
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            ak.a r6 = r3.d(r7, r6)
            r2.storeName = r6
            int r6 = ps.j0.f156555e
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            ak.a r4 = r3.d(r6, r4)
            r2.welcomeMessage = r4
            if (r5 == 0) goto L53
            int r4 = ps.j0.f156562l
            java.lang.Object[] r5 = new java.lang.Object[r0]
            ak.a r3 = r3.d(r4, r5)
            goto L5b
        L53:
            int r4 = ps.j0.f156559i
            java.lang.Object[] r5 = new java.lang.Object[r0]
            ak.a r3 = r3.d(r4, r5)
        L5b:
            r2.locationDescription = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ps.HeaderDecorator.<init>(boolean, java.lang.String, boolean, java.lang.String, int):void");
    }

    public static /* synthetic */ HeaderDecorator b(HeaderDecorator headerDecorator, boolean z10, String str, boolean z11, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = headerDecorator.isUserLoggedIn;
        }
        if ((i11 & 2) != 0) {
            str = headerDecorator.userFirstName;
        }
        if ((i11 & 4) != 0) {
            z11 = headerDecorator.isHomeStoreSet;
        }
        if ((i11 & 8) != 0) {
            str2 = headerDecorator.homeStoreName;
        }
        if ((i11 & 16) != 0) {
            i10 = headerDecorator.homeStoreId;
        }
        int i12 = i10;
        boolean z12 = z11;
        return headerDecorator.a(z10, str, z12, str2, i12);
    }

    public final HeaderDecorator a(boolean isUserLoggedIn, String userFirstName, boolean isHomeStoreSet, String homeStoreName, int homeStoreId) {
        Intrinsics.j(userFirstName, "userFirstName");
        return new HeaderDecorator(isUserLoggedIn, userFirstName, isHomeStoreSet, homeStoreName, homeStoreId);
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC5607a getLocationDescription() {
        return this.locationDescription;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC5607a getStoreName() {
        return this.storeName;
    }

    /* renamed from: e, reason: from getter */
    public final String getUserFirstName() {
        return this.userFirstName;
    }

    /* renamed from: f, reason: from getter */
    public final AbstractC5607a getWelcomeMessage() {
        return this.welcomeMessage;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsUserLoggedIn() {
        return this.isUserLoggedIn;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.isUserLoggedIn) * 31) + this.userFirstName.hashCode()) * 31) + Boolean.hashCode(this.isHomeStoreSet)) * 31;
        String str = this.homeStoreName;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.homeStoreId);
    }

    public String toString() {
        return "HeaderDecorator(isUserLoggedIn=" + this.isUserLoggedIn + ", userFirstName=" + this.userFirstName + ", isHomeStoreSet=" + this.isHomeStoreSet + ", homeStoreName=" + this.homeStoreName + ", homeStoreId=" + this.homeStoreId + ')';
    }
}
