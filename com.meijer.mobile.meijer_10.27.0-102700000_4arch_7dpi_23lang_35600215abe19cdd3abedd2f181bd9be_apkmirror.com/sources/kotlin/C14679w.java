package kotlin;

import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u00002\u00020\u0001:\u0001\u001eB[\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\r\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b \u0010\u001bR\u0017\u0010\u000b\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b!\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b$\u0010\u001bR(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010&\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b%\u0010\u001d¨\u0006("}, d2 = {"Li4/w;", "", "", "singleTop", "restoreState", "", "popUpToId", "popUpToInclusive", "popUpToSaveState", "enterAnim", "exitAnim", "popEnterAnim", "popExitAnim", "<init>", "(ZZIZZIIII)V", "", "popUpToRoute", "(ZZLjava/lang/String;ZZIIII)V", "h", "()Z", "j", "g", "i", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Z", "b", "c", "I", "e", "d", "f", "<set-?>", "Ljava/lang/String;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: i4.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14679w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean singleTop;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean restoreState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int popUpToId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean popUpToInclusive;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean popUpToSaveState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int enterAnim;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int exitAnim;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int popEnterAnim;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int popExitAnim;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private String popUpToRoute;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J+\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00002\b\b\u0001\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\b\b\u0001\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00002\b\b\u0001\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u00002\b\b\u0001\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u0016J\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0016\u0010\u0014\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0016\u0010\u0019\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010!R\u0016\u0010\u001b\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010!¨\u0006("}, d2 = {"Li4/w$a;", "", "<init>", "()V", "", "singleTop", "d", "(Z)Li4/w$a;", "restoreState", "j", "", "destinationId", "inclusive", "saveState", "g", "(IZZ)Li4/w$a;", "", PlaceTypes.ROUTE, "h", "(Ljava/lang/String;ZZ)Li4/w$a;", "enterAnim", "b", "(I)Li4/w$a;", "exitAnim", "c", "popEnterAnim", "e", "popExitAnim", "f", "Li4/w;", "a", "()Li4/w;", "Z", "I", "popUpToId", "Ljava/lang/String;", "popUpToRoute", "popUpToInclusive", "popUpToSaveState", "i", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i4.w$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean singleTop;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean restoreState;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private String popUpToRoute;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean popUpToInclusive;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean popUpToSaveState;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int popUpToId = -1;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private int enterAnim = -1;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private int exitAnim = -1;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private int popEnterAnim = -1;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private int popExitAnim = -1;

        public static /* synthetic */ a i(a aVar, int i10, boolean z10, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return aVar.g(i10, z10, z11);
        }

        public final C14679w a() {
            String str = this.popUpToRoute;
            return str != null ? new C14679w(this.singleTop, this.restoreState, str, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim) : new C14679w(this.singleTop, this.restoreState, this.popUpToId, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
        }

        public final a b(int enterAnim) {
            this.enterAnim = enterAnim;
            return this;
        }

        public final a c(int exitAnim) {
            this.exitAnim = exitAnim;
            return this;
        }

        public final a d(boolean singleTop) {
            this.singleTop = singleTop;
            return this;
        }

        public final a e(int popEnterAnim) {
            this.popEnterAnim = popEnterAnim;
            return this;
        }

        public final a f(int popExitAnim) {
            this.popExitAnim = popExitAnim;
            return this;
        }

        @JvmOverloads
        public final a g(int destinationId, boolean inclusive, boolean saveState) {
            this.popUpToId = destinationId;
            this.popUpToRoute = null;
            this.popUpToInclusive = inclusive;
            this.popUpToSaveState = saveState;
            return this;
        }

        @JvmOverloads
        public final a h(String route, boolean inclusive, boolean saveState) {
            this.popUpToRoute = route;
            this.popUpToId = -1;
            this.popUpToInclusive = inclusive;
            this.popUpToSaveState = saveState;
            return this;
        }

        public final a j(boolean restoreState) {
            this.restoreState = restoreState;
            return this;
        }
    }

    public C14679w(boolean z10, boolean z11, int i10, boolean z12, boolean z13, int i11, int i12, int i13, int i14) {
        this.singleTop = z10;
        this.restoreState = z11;
        this.popUpToId = i10;
        this.popUpToInclusive = z12;
        this.popUpToSaveState = z13;
        this.enterAnim = i11;
        this.exitAnim = i12;
        this.popEnterAnim = i13;
        this.popExitAnim = i14;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof C14679w)) {
            C14679w c14679w = (C14679w) other;
            if (this.singleTop == c14679w.singleTop && this.restoreState == c14679w.restoreState && this.popUpToId == c14679w.popUpToId && Intrinsics.e(this.popUpToRoute, c14679w.popUpToRoute) && this.popUpToInclusive == c14679w.popUpToInclusive && this.popUpToSaveState == c14679w.popUpToSaveState && this.enterAnim == c14679w.enterAnim && this.exitAnim == c14679w.exitAnim && this.popEnterAnim == c14679w.popEnterAnim && this.popExitAnim == c14679w.popExitAnim) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a, reason: from getter */
    public final int getEnterAnim() {
        return this.enterAnim;
    }

    /* renamed from: b, reason: from getter */
    public final int getExitAnim() {
        return this.exitAnim;
    }

    /* renamed from: c, reason: from getter */
    public final int getPopEnterAnim() {
        return this.popEnterAnim;
    }

    /* renamed from: d, reason: from getter */
    public final int getPopExitAnim() {
        return this.popExitAnim;
    }

    /* renamed from: e, reason: from getter */
    public final int getPopUpToId() {
        return this.popUpToId;
    }

    /* renamed from: f, reason: from getter */
    public final String getPopUpToRoute() {
        return this.popUpToRoute;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getPopUpToInclusive() {
        return this.popUpToInclusive;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getSingleTop() {
        return this.singleTop;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getPopUpToSaveState() {
        return this.popUpToSaveState;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getRestoreState() {
        return this.restoreState;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C14679w.class.getSimpleName());
        sb2.append("(");
        if (this.singleTop) {
            sb2.append("launchSingleTop ");
        }
        if (this.restoreState) {
            sb2.append("restoreState ");
        }
        String str = this.popUpToRoute;
        if ((str != null || this.popUpToId != -1) && str != null) {
            sb2.append("popUpTo(");
            String str2 = this.popUpToRoute;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                sb2.append("0x");
                sb2.append(Integer.toHexString(this.popUpToId));
            }
            if (this.popUpToInclusive) {
                sb2.append(" inclusive");
            }
            if (this.popUpToSaveState) {
                sb2.append(" saveState");
            }
            sb2.append(")");
        }
        if (this.enterAnim != -1 || this.exitAnim != -1 || this.popEnterAnim != -1 || this.popExitAnim != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(this.enterAnim));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(this.exitAnim));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(this.popEnterAnim));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(this.popExitAnim));
            sb2.append(")");
        }
        String string = sb2.toString();
        Intrinsics.i(string, "sb.toString()");
        return string;
    }

    public int hashCode() {
        int iHashCode;
        int i10 = (((((getSingleTop() ? 1 : 0) * 31) + (getRestoreState() ? 1 : 0)) * 31) + this.popUpToId) * 31;
        String str = this.popUpToRoute;
        if (str != null) {
            iHashCode = str.hashCode();
        } else {
            iHashCode = 0;
        }
        return ((((((((((((i10 + iHashCode) * 31) + (getPopUpToInclusive() ? 1 : 0)) * 31) + (getPopUpToSaveState() ? 1 : 0)) * 31) + this.enterAnim) * 31) + this.exitAnim) * 31) + this.popEnterAnim) * 31) + this.popExitAnim;
    }

    public C14679w(boolean z10, boolean z11, String str, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, C14672p.INSTANCE.a(str).hashCode(), z12, z13, i10, i11, i12, i13);
        this.popUpToRoute = str;
    }
}
