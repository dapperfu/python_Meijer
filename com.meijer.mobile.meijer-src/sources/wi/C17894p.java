package wi;

import Ki.LocalThemeScope;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0010\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0014\u0010!¨\u0006\""}, d2 = {"Lwi/p;", "", "Lwi/m;", "", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Lki/q1$s$c;", "template", "enabled", "showHelperText", "LKi/M;", "localThemeScope", "<init>", "(ZLkotlin/jvm/functions/Function1;Lki/q1$s$c;ZZLKi/M;)V", "b", "Z", "u", "()Z", "c", "Lkotlin/jvm/functions/Function1;", "S", "()Lkotlin/jvm/functions/Function1;", "d", "Lki/q1$s$c;", "()Lki/q1$s$c;", "e", "h", "f", "i0", "g", "LKi/M;", "()LKi/M;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wi.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C17894p implements Ji.h, InterfaceC17891m {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean checked;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function1<Boolean, Unit> onCheckedChange;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q1.s.Switch template;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean showHelperText;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final LocalThemeScope localThemeScope;

    /* JADX WARN: Multi-variable type inference failed */
    public C17894p(boolean z10, Function1<? super Boolean, Unit> function1, q1.s.Switch template, boolean z11, boolean z12, LocalThemeScope localThemeScope) {
        Intrinsics.j(template, "template");
        Intrinsics.j(localThemeScope, "localThemeScope");
        this.checked = z10;
        this.onCheckedChange = function1;
        this.template = template;
        this.enabled = z11;
        this.showHelperText = z12;
        this.localThemeScope = localThemeScope;
    }

    @Override // wi.InterfaceC17895q
    public Function1<Boolean, Unit> S() {
        return this.onCheckedChange;
    }

    @Override // wi.InterfaceC17891m
    /* renamed from: b, reason: from getter */
    public q1.s.Switch getTemplate() {
        return this.template;
    }

    @Override // Ji.h, Ai.InterfaceC2817g1
    /* renamed from: c, reason: from getter */
    public LocalThemeScope getLocalThemeScope() {
        return this.localThemeScope;
    }

    @Override // wi.InterfaceC17895q
    /* renamed from: h, reason: from getter */
    public boolean getEnabled() {
        return this.enabled;
    }

    @Override // wi.InterfaceC17895q
    /* renamed from: i0, reason: from getter */
    public boolean getShowHelperText() {
        return this.showHelperText;
    }

    @Override // wi.InterfaceC17895q
    /* renamed from: u, reason: from getter */
    public boolean getChecked() {
        return this.checked;
    }
}
