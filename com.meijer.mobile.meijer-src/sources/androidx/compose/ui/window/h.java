package androidx.compose.ui.window;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB'\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u000bB'\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/window/h;", "", "", "dismissOnBackPress", "dismissOnClickOutside", "Landroidx/compose/ui/window/r;", "securePolicy", "usePlatformDefaultWidth", "decorFitsSystemWindows", "<init>", "(ZZLandroidx/compose/ui/window/r;ZZ)V", "(ZZZ)V", "(ZZLandroidx/compose/ui/window/r;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", "b", "()Z", "c", "Landroidx/compose/ui/window/r;", "d", "()Landroidx/compose/ui/window/r;", "e", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean dismissOnBackPress;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean dismissOnClickOutside;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r securePolicy;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean usePlatformDefaultWidth;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean decorFitsSystemWindows;

    public h() {
        this(false, false, null, false, false, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof h)) {
            return false;
        }
        h hVar = (h) other;
        return this.dismissOnBackPress == hVar.dismissOnBackPress && this.dismissOnClickOutside == hVar.dismissOnClickOutside && this.securePolicy == hVar.securePolicy && this.usePlatformDefaultWidth == hVar.usePlatformDefaultWidth && this.decorFitsSystemWindows == hVar.decorFitsSystemWindows;
    }

    public h(boolean z10, boolean z11, r rVar, boolean z12, boolean z13) {
        this.dismissOnBackPress = z10;
        this.dismissOnClickOutside = z11;
        this.securePolicy = rVar;
        this.usePlatformDefaultWidth = z12;
        this.decorFitsSystemWindows = z13;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getDecorFitsSystemWindows() {
        return this.decorFitsSystemWindows;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    /* renamed from: d, reason: from getter */
    public final r getSecurePolicy() {
        return this.securePolicy;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.dismissOnBackPress) * 31) + Boolean.hashCode(this.dismissOnClickOutside)) * 31) + this.securePolicy.hashCode()) * 31) + Boolean.hashCode(this.usePlatformDefaultWidth)) * 31) + Boolean.hashCode(this.decorFitsSystemWindows);
    }

    public /* synthetic */ h(boolean z10, boolean z11, r rVar, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? r.f53173a : rVar, (i10 & 8) != 0 ? true : z12, (i10 & 16) != 0 ? true : z13);
    }

    public /* synthetic */ h(boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12);
    }

    public h(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, r.f53173a, z12, true);
    }

    public /* synthetic */ h(boolean z10, boolean z11, r rVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? r.f53173a : rVar);
    }

    @Deprecated
    public /* synthetic */ h(boolean z10, boolean z11, r rVar) {
        this(z10, z11, rVar, true, true);
    }
}
