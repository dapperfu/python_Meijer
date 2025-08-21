package Ci;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"LCi/n;", "LCi/a;", "", "LKi/M;", "localThemeScope", "Lki/q1$k;", "template", "", "title", "description", "LCi/o;", "loadingStatus", "", "isVertical", "Lkotlin/Function0;", "", "content", "<init>", "(LKi/M;Lki/q1$k;Ljava/lang/String;Ljava/lang/String;LCi/o;ZLkotlin/jvm/functions/Function2;)V", "b", "LKi/M;", "c", "()LKi/M;", "Lki/q1$k;", "()Lki/q1$k;", "d", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "e", "getDescription", "f", "LCi/o;", "y", "()LCi/o;", "g", "Z", "k", "()Z", "h", "Lkotlin/jvm/functions/Function2;", "getContent", "()Lkotlin/jvm/functions/Function2;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class n implements a, Ji.h {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LocalThemeScope localThemeScope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q1.k template;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String title;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String description;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o loadingStatus;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Function2<Composer, Integer, Unit> content;

    /* JADX WARN: Multi-variable type inference failed */
    public n(LocalThemeScope localThemeScope, q1.k template, String title, String description, o loadingStatus, boolean z10, Function2<? super Composer, ? super Integer, Unit> function2) {
        Intrinsics.j(localThemeScope, "localThemeScope");
        Intrinsics.j(template, "template");
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        Intrinsics.j(loadingStatus, "loadingStatus");
        this.localThemeScope = localThemeScope;
        this.template = template;
        this.title = title;
        this.description = description;
        this.loadingStatus = loadingStatus;
        this.isVertical = z10;
        this.content = function2;
    }

    @Override // Ci.a
    /* renamed from: b, reason: from getter */
    public q1.k getTemplate() {
        return this.template;
    }

    @Override // Ci.a, Ji.h, Ai.InterfaceC2817g1
    /* renamed from: c, reason: from getter */
    public LocalThemeScope getLocalThemeScope() {
        return this.localThemeScope;
    }

    @Override // Ci.a
    public Function2<Composer, Integer, Unit> getContent() {
        return this.content;
    }

    @Override // Ci.a
    public String getDescription() {
        return this.description;
    }

    @Override // Ci.a
    public String getTitle() {
        return this.title;
    }

    @Override // Ci.a
    /* renamed from: k, reason: from getter */
    public boolean getIsVertical() {
        return this.isVertical;
    }

    @Override // Ci.a
    /* renamed from: y, reason: from getter */
    public o getLoadingStatus() {
        return this.loadingStatus;
    }
}
