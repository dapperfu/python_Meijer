package ri;

import Ji.h;
import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lri/e;", "", "Lri/a;", "Lki/q1$i;", "template", "LKi/M;", "localThemeScope", "Lkotlin/Function0;", "", "content", "<init>", "(Lki/q1$i;LKi/M;Lkotlin/jvm/functions/Function2;)V", "b", "Lki/q1$i;", "()Lki/q1$i;", "c", "LKi/M;", "()LKi/M;", "d", "Lkotlin/jvm/functions/Function2;", "getContent", "()Lkotlin/jvm/functions/Function2;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ri.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C16913e implements h, InterfaceC16909a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q1.InfoBlock template;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final LocalThemeScope localThemeScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function2<Composer, Integer, Unit> content;

    /* JADX WARN: Multi-variable type inference failed */
    public C16913e(q1.InfoBlock template, LocalThemeScope localThemeScope, Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.j(template, "template");
        Intrinsics.j(localThemeScope, "localThemeScope");
        Intrinsics.j(content, "content");
        this.template = template;
        this.localThemeScope = localThemeScope;
        this.content = content;
    }

    @Override // ri.InterfaceC16909a
    /* renamed from: b, reason: from getter */
    public q1.InfoBlock getTemplate() {
        return this.template;
    }

    @Override // Ji.h, Ai.InterfaceC2817g1
    /* renamed from: c, reason: from getter */
    public LocalThemeScope getLocalThemeScope() {
        return this.localThemeScope;
    }

    @Override // ri.InterfaceC16909a
    public Function2<Composer, Integer, Unit> getContent() {
        return this.content;
    }
}
